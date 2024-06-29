import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class662 extends class508 {

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    private int field9364;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "Lrf;")
    public static class112 field9360 = new class112("runescape", 0);

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "Ltb;")
    public static class450 field9368 = new class450(8);

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "Lwp;")
    public static class453 field9369 = new class453(8, 2);

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "[Lgw;")
    public class144[] field9366;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "[[B")
    private byte[][] field9365;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)Z")
    public final boolean method3729(int arg0, byte arg1) {
        field9367++;
        if (arg1 > -1) {
            this.method3729(-32, (byte) -117);
        }
        return this.field9366[arg0].field1845;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Les;B)Loe;")
    public static final class127 method3730(class630 arg0, byte arg1) {
        field9363++;
        class127 var2 = new class127();
        if (arg1 >= -41) {
            return null;
        } else {
            var2.field1589 = arg0.method3470(13111);
            var2.field1592 = class428.field5360.method3781(var2.field1589, (byte) 45);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Z")
    public final boolean method3731(int arg0, int arg1) {
        field9361++;
        if (arg1 != 0) {
            field9368 = null;
        }
        return this.field9366[arg0].field1858;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
    public final boolean method3732(byte arg0, int arg1) {
        if (arg0 != -101) {
            this.field9364 = 69;
        }
        field9362++;
        return this.field9366[arg1].field1852;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Z")
    public final boolean method3733(boolean arg0) {
        field9359++;
        if (this.field9366 != null) {
            return true;
        }
        if (this.field9365 == null) {
            class612 var2 = class563.field7827;
            synchronized (class563.field7827) {
                if (!class563.field7827.method3350(!arg0, this.field9364)) {
                    return false;
                }
                int[] var4 = class563.field7827.method3353(this.field9364, -125);
                this.field9365 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field9365[var5] = class563.field7827.method3365(var4[var5], -104, this.field9364);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field9365.length; var7++) {
            byte[] var8 = this.field9365[var7];
            class630 var9 = new class630(var8);
            var9.field8812 = 1;
            int var10 = var9.method3470(13111);
            class612 var11 = class663.field9374;
            synchronized (class663.field9374) {
                var6 &= class663.field9374.method3368(1912, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class40 var12 = new class40();
        class612 var13 = class563.field7827;
        int[] var15;
        synchronized (class563.field7827) {
            int var14 = class563.field7827.method3349(this.field9364, arg0);
            this.field9366 = new class144[var14];
            var15 = class563.field7827.method3353(this.field9364, -116);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field9365[var16];
            class630 var18 = new class630(var17);
            var18.field8812 = 1;
            int var19 = var18.method3470(13111);
            class67 var20 = null;
            for (class67 var21 = (class67) var12.method237(125); var21 != null; var21 = (class67) var12.method245((byte) 21)) {
                if (var21.field911 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class612 var22 = class663.field9374;
                synchronized (class663.field9374) {
                    var20 = new class67(var19, class663.field9374.method3344(106, var19));
                }
                var12.method239(var20, (byte) 93);
            }
            this.field9366[var15[var16]] = new class144(var17, var20);
        }
        this.field9365 = null;
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
    public class662(int arg0) {
        this.field9364 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method3734(int arg0) {
        if (arg0 != 0) {
            method3734(42);
        }
        field9369 = null;
        field9368 = null;
        field9360 = null;
    }
}
