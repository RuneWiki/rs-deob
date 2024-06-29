import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class256 extends class525 {

    @OriginalMember(owner = "client!he", name = "E", descriptor = "Lqv;")
    public static class316 field3792 = new class316(58, 0);

    @OriginalMember(owner = "client!he", name = "K", descriptor = "Lqt;")
    public static class459 field3798 = new class459(80, 6);

    @OriginalMember(owner = "client!he", name = "L", descriptor = "Lqt;")
    public static class459 field3799 = new class459(69, 18);

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "J")
    public static long field3796;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Lhl;")
    private class375 field3797;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lwn;II)V")
    private final void method1653(class519 arg0, int arg1, int arg2) {
        int var4 = -2 / ((arg2 - 10) / 43);
        field3791++;
        if (arg1 != 249) {
            return;
        }
        int var5 = arg0.method3072((byte) -124);
        if (this.field3797 == null) {
            int var6 = class487.method2869(1366891568, var5);
            this.field3797 = new class375(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg0.method3072((byte) -125) == 1;
            int var9 = arg0.method3040((byte) -3);
            class42 var10;
            if (var8) {
                var10 = new class163(arg0.method3082((byte) 120));
            } else {
                var10 = new class175(arg0.method3053(-129));
            }
            this.field3797.method2292((long) var9, var10, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLwn;)V")
    public final void method1654(boolean arg0, class519 arg1) {
        field3790++;
        while (true) {
            int var3 = arg1.method3072((byte) -125);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.method1657(59, -80, null);
                    return;
                }
            }
            this.method1653(arg1, var3, 68);
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
    public static void method1655(byte arg0) {
        field3792 = null;
        field3798 = null;
        field3799 = null;
        int var1 = -88 % ((67 - arg0) / 51);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILqa;)V")
    public static final void method1656(int arg0, class167 arg1) {
        if (arg0 != 2213) {
            field3792 = null;
        }
        for (class115 var2 = (class115) class235.field3503.method904(false); var2 != null; var2 = (class115) class235.field3503.method907(-1)) {
            var2.method822(arg1);
        }
        field3794++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method1657(int arg0, int arg1, String arg2) {
        field3793++;
        if (this.field3797 == null) {
            return arg2;
        }
        class163 var4 = (class163) this.field3797.method2284(true, (long) arg0);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg1 != 0) {
                field3799 = null;
            }
            return var4.field2461;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)I")
    public final int method1658(byte arg0, int arg1, int arg2) {
        field3800++;
        if (arg0 < 99) {
            field3796 = -15L;
        }
        if (this.field3797 == null) {
            return arg2;
        } else {
            class175 var4 = (class175) this.field3797.method2284(true, (long) arg1);
            return var4 == null ? arg2 : var4.field2612;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)Z")
    public static final boolean method1659(int arg0) {
        field3795++;
        class42 var1 = class258.field3829.field1835.field859;
        if (var1 == null || class258.field3829.field1835 == var1) {
            return false;
        }
        class341 var2 = (class341) var1;
        if (arg0 >= -2) {
            method1656(112, null);
        }
        if (var2.field5039 >= 2000) {
            var2.field5039 -= 2000;
        }
        return var2.field5039 == 1008;
    }
}
