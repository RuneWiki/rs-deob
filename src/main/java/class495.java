import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class495 extends class454 {

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    private int field6793;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Lvb;")
    public static class396 field6794 = new class396(0, 8);

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "Z")
    public static boolean field6801 = false;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "[Ls;")
    public static class419[] field6799;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "[Law;")
    public class566[] field6800;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "[Lrh;")
    public static class718[] field6792;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "[[B")
    private byte[][] field6790;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 3)
    public static void method2897(int arg0) {
        field6792 = null;
        if (arg0 != 0) {
            method2897(115);
        }
        field6794 = null;
        field6799 = null;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)Z", line = 17)
    public final boolean method2898(int arg0, int arg1) {
        field6791++;
        int var3 = 98 / ((-arg1 - 30) / 55);
        return this.field6800[arg0].field7897;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(II)Z", line = 35)
    public final boolean method2899(int arg0, int arg1) {
        field6798++;
        if (arg1 <= 12) {
            this.method2900((byte) -80, 0);
        }
        return this.field6800[arg0].field7896;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(BI)Z", line = 52)
    public final boolean method2900(byte arg0, int arg1) {
        field6797++;
        if (arg0 != -111) {
            this.field6800 = null;
        }
        return this.field6800[arg1].field7882;
    }

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)Z", line = 64)
    public final boolean method2901(int arg0) {
        field6795++;
        if (this.field6800 != null) {
            return true;
        }
        if (this.field6790 == null) {
            class513 var2 = class517.field7107;
            synchronized (class517.field7107) {
                if (!class517.field7107.method2986(-23687, this.field6793)) {
                    return false;
                }
                int[] var4 = class517.field7107.method3012(-82, this.field6793);
                this.field6790 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field6790[var5] = class517.field7107.method3019(this.field6793, var4[var5], 76);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field6790.length; var7++) {
            byte[] var8 = this.field6790[var7];
            class431 var9 = new class431(var8);
            var9.field5983 = 1;
            int var10 = var9.method2565((byte) -108);
            class513 var11 = class320.field4558;
            synchronized (class320.field4558) {
                var6 &= class320.field4558.method3005(var10, (byte) -69);
            }
        }
        if (!var6) {
            return false;
        }
        class665 var12 = new class665();
        class513 var13 = class517.field7107;
        int[] var15;
        synchronized (class517.field7107) {
            int var14 = class517.field7107.method3007(-1, this.field6793);
            this.field6800 = new class566[var14];
            var15 = class517.field7107.method3012(-90, this.field6793);
        }
        if (arg0 <= 5) {
            return true;
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field6790[var16];
            class431 var18 = new class431(var17);
            var18.field5983 = 1;
            int var19 = var18.method2565((byte) -111);
            class760 var20 = null;
            for (class760 var21 = (class760) var12.method3731((byte) -114); var21 != null; var21 = (class760) var12.method3729((byte) -124)) {
                if (var21.field10526 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class513 var22 = class320.field4558;
                synchronized (class320.field4558) {
                    var20 = new class760(var19, class320.field4558.method2988(var19, 0));
                }
                var12.method3728((byte) 110, var20);
            }
            this.field6800[var15[var16]] = new class566(var17, var20);
        }
        this.field6790 = null;
        return true;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(I)V", line = 174)
    public class495(int arg0) {
        this.field6793 = arg0;
    }
}
