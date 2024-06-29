import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class385 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Lnj;")
    private class162 field5601 = new class162(64);

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Lmg;")
    private class101 field5606;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[S")
    public static short[] field5604 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lwj;")
    public static class270 field5607 = new class270(46, 4);

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "[[I")
    public static int[][] field5609 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Z")
    public static boolean field5610;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "[Lta;")
    public static class142[] field5608;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)I", line = 5)
    public static final int method2274(int arg0, boolean arg1) {
        field5605++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFAE) >> 8) / 256.0D;
        if (arg1) {
            field5609 = null;
        }
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 >> 2 & 0x3F) << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)Lrb;", line = 114)
    public final class235 method2275(int arg0, byte arg1) {
        field5602++;
        class162 var3 = this.field5601;
        class235 var4;
        synchronized (this.field5601) {
            var4 = (class235) this.field5601.method1073((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5606.method727(arg0, 5, -72);
        if (arg1 != -11) {
            return null;
        }
        class235 var6 = new class235();
        if (var5 != null) {
            var6.method1448((byte) -89, new class391(var5));
        }
        class162 var7 = this.field5601;
        synchronized (this.field5601) {
            this.field5601.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V", line = 146)
    public static final void method2276(byte arg0, int arg1) {
        field5603++;
        if (arg0 == -28) {
            class97 var2 = class348.method2064(arg1, 12, -36);
            var2.method710(-9237);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 163)
    public static void method2277(int arg0) {
        if (arg0 == 11922) {
            field5608 = null;
            field5604 = null;
            field5607 = null;
            field5609 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lal;ILmg;)V", line = 180)
    public class385(class66 arg0, int arg1, class101 arg2) {
        this.field5606 = arg2;
        this.field5606.method753(5, -85);
    }
}
