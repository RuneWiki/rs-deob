import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class159 {

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lke;")
    public static class256 field2831 = class316.method2202("leuchten1:", 27626);

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lmf;")
    public static class174 field2830 = new class174(16);

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "[J")
    public static long[] field2842 = new long[500];

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field2841 = -1;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Lee;")
    public static class293 field2838;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field2837;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "[I")
    public int[] field2833;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLke;B)V", line = 7)
    public static final void method1176(boolean arg0, class256 arg1, byte arg2) {
        field2829++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class280.field4875.method2038(arg1, 250);
        if (arg2 <= 90) {
            method1180(3);
        }
        int var7 = class280.field4875.method2058(arg1, 250) * 13;
        if (class253.field4323) {
            class60.method482(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
            class60.method474(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        } else {
            class178.method1299(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var7 + var3, 0);
            class178.method1301(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - -var3 + var3, 16777215);
        }
        class280.field4875.method2049(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class320.method2229(var4 - var3, var7 - -var3 + var3, var3 + var6 + var3, -var3 + var5, (byte) 90);
        if (!arg0) {
            class96.method692(var7, var6, var4, var5, -103);
        } else if (class253.field4323) {
            class253.method1733();
        } else {
            try {
                Graphics var8 = class186.field3271.getGraphics();
                class108.field1920.method452(0, (byte) -16, 0, var8);
            } catch (Exception var10) {
                class186.field3271.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V", line = 60)
    public static final void method1177(boolean arg0, int arg1) {
        field2844++;
        class254.method1741(class211.field3803, arg0, class112.field1969, arg1, class124.field2200);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZBJI)Lke;", line = 72)
    public static final class256 method1178(boolean arg0, byte arg1, long arg2, int arg3) {
        field2835++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var5 = 1;
        long var6 = arg2 / (long) arg3;
        while (var6 != 0L) {
            var6 /= (long) arg3;
            var5++;
        }
        int var8 = var5;
        if (arg2 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        int var10 = 0;
        if (arg1 != -106) {
            return (class256) null;
        }
        while (var10 < var5) {
            int var11 = (int) (arg2 % (long) arg3);
            arg2 /= (long) arg3;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
            var10++;
        }
        class256 var12 = new class256();
        var12.field4384 = var8;
        var12.field4380 = var9;
        return var12;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)I", line = 142)
    public static final int method1179(int arg0, int arg1, int arg2, int arg3) {
        field2843++;
        if (arg2 != 9373) {
            method1179(28, 70, 24, 75);
        }
        if ((class308.field5296[arg3][arg0][arg1] & 0x8) == 0) {
            return arg3 <= 0 || (class308.field5296[1][arg0][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 165)
    public static void method1180(int arg0) {
        field2838 = null;
        field2842 = null;
        if (arg0 >= -30) {
            method1177(true, 53);
        }
        field2831 = null;
        field2830 = null;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 185)
    public static final void method1181(int arg0) {
        field2845++;
        class102.method741(arg0);
        class281.method1970(arg0 ^ 0x31);
        class177.method1283(96);
        class157.method1168(-17910);
        class196.method1423((byte) -48);
        class307.method2136(-5254);
        class27.method204(-124);
        class311.method2157((byte) -124);
        class189.method1382(arg0 + 1);
        class194.method1401((byte) 57);
        class201.method1436(arg0 + 110);
        class231.method1568(true);
        class270.method1866((byte) 104);
        class251.method1690((byte) 81);
        class53.method420((byte) 12);
        class76.field1446.method2084(-125);
        class40.field719.method2084(-111);
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V", line = 226)
    public final void method1182(int arg0) {
        class178.method1287(this.field2833, this.field2839, this.field2834);
        field2828++;
        if (arg0 != 48) {
            method1180(-66);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V", line = 242)
    protected class159() {
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public abstract void method450(byte arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public abstract void method452(int arg0, byte arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method446(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);
}
