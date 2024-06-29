import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class55 implements Runnable {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "[Lga;")
    public volatile class145[] field702 = new class145[2];

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Z")
    public volatile boolean field709 = false;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Z")
    public volatile boolean field710 = false;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Luf;")
    private static class168 field701 = class148.method1019(-1720, "Loading fonts )2 ");

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field712 = 0;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Luf;")
    public static class168 field715 = class148.method1019(-1720, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Luf;")
    public static class168 field713 = field701;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Ldf;")
    public static class251 field704 = new class251();

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Luf;")
    private static class168 field720 = class148.method1019(-1720, "flash2:");

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Luf;")
    public static class168 field719 = field720;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Luf;")
    public static class168 field721 = field720;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lcj;")
    public class75 field711;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 10)
    public static final void method303(int arg0) {
        field707++;
        int var1 = class117.field1822;
        if (arg0 != 0) {
            field715 = (class168) null;
        }
        int var2 = class27.field346;
        int var3 = class197.field3264 - class299.field5069 - var1;
        int var4 = class196.field3240 - class14.field142 - var2;
        if (var2 <= 0 && var4 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            Container var6;
            if (class8.field98 != null) {
                var6 = class8.field98;
            } else if (class283.field4782 == null) {
                var6 = class51.field622.field1000;
            } else {
                var6 = class283.field4782;
            }
            int var7 = 0;
            if (class283.field4782 == var6) {
                Insets var8 = class283.field4782.getInsets();
                var7 = var8.top;
                var5 = var8.left;
            }
            Graphics var9 = var6.getGraphics();
            var9.setColor(Color.black);
            if (var2 > 0) {
                var9.fillRect(var5, var7, var2, class197.field3264);
            }
            if (var1 > 0) {
                var9.fillRect(var5, var7, class196.field3240, var1);
            }
            if (var4 > 0) {
                var9.fillRect(class196.field3240 + var5 - var4, var7, var4, class197.field3264);
            }
            if (var3 > 0) {
                var9.fillRect(var5, var7 + class197.field3264 - var3, class196.field3240, var3);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILg;)V", line = 85)
    public static final void method304(int arg0, class242 arg1) {
        field714++;
        int var2 = arg1.field4115;
        if (var2 == 324) {
            if (class221.field3592 == -1) {
                class95.field1523 = arg1.field3985;
                class221.field3592 = arg1.field4084;
            }
            if (class300.field5080.field3521) {
                arg1.field4084 = class221.field3592;
            } else {
                arg1.field4084 = class95.field1523;
            }
            return;
        }
        if (arg0 != 0) {
            field719 = (class168) null;
        }
        if (var2 == 325) {
            if (class221.field3592 == -1) {
                class95.field1523 = arg1.field3985;
                class221.field3592 = arg1.field4084;
            }
            if (class300.field5080.field3521) {
                arg1.field4084 = class95.field1523;
            } else {
                arg1.field4084 = class221.field3592;
            }
        } else if (var2 == 327) {
            arg1.field4098 = 150;
            arg1.field4006 = (int) (Math.sin((double) class203.field3335 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3993 = -1;
            arg1.field4022 = 5;
        } else if (var2 == 328) {
            if (class266.field4489.field658 == null) {
                arg1.field3993 = 0;
            } else {
                arg1.field4098 = 150;
                arg1.field4006 = (int) (Math.sin((double) class203.field3335 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field4022 = 5;
                arg1.field3993 = ((int) class266.field4489.field658.method1208((byte) 71) << 11) + 2047;
                arg1.field3978 = class266.field4489.field3045;
                arg1.field4091 = class266.field4489.field3053;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 158)
    public static final void method305(int arg0) {
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(arg0);
        field717++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)V", line = 184)
    public static final void method306(int arg0, int arg1, int arg2, int arg3) {
        class273.field4594 = new class127[arg0][arg1][arg2];
        class172.field2804 = new int[arg0][arg1 + 1][arg2 + 1];
        class46.field562 = new class192[4][];
        class285.method1966(false);
        class117.field1821 = arg1;
        class244.field4160 = arg2;
        class144.field2216 = new int[arg0][arg1 + 1][arg2 + 1];
        class43.method238();
        class289.field4875 = arg3;
        class83.field1252 = new boolean[class289.field4875 + class289.field4875 + 1][class289.field4875 + class289.field4875 + 1];
        class12.field134 = new boolean[class289.field4875 + class289.field4875 + 2][class289.field4875 + class289.field4875 + 2];
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 202)
    public static void method307(byte arg0) {
        field721 = null;
        field701 = null;
        field713 = null;
        field715 = null;
        field720 = null;
        field704 = null;
        if (arg0 != 19) {
            field701 = (class168) null;
        }
        field719 = null;
    }

    @OriginalMember(owner = "client!lh", name = "run", descriptor = "()V", line = 218)
    public final void run() {
        field700++;
        this.field710 = true;
        try {
            while (!this.field709) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class145 var2 = this.field702[var1];
                    if (var2 != null) {
                        var2.method992((byte) -63);
                    }
                }
                class300.method2054(10, 10L);
                class279.method1928((byte) 98, this.field711, (Object) null);
            }
        } catch (Exception var7) {
            class43.method234(var7, -15954, (String) null);
        } finally {
            this.field710 = false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([I[[FZIII[[F[ZZII[[I[[FIZIIIBLvk;[[IZ)V", line = 261)
    public static final void method308(int[] arg0, float[][] arg1, boolean arg2, int arg3, int arg4, int arg5, float[][] arg6, boolean[] arg7, boolean arg8, int arg9, int arg10, int[][] arg11, float[][] arg12, int arg13, boolean arg14, int arg15, int arg16, int arg17, byte arg18, class192 arg19, int[][] arg20, boolean arg21) {
        field703++;
        int var22 = (arg21 ? 255 : 0) + (arg13 << 8);
        int var23 = -126 % ((45 - arg17) / 44);
        int var24 = (arg4 << 8) + (arg8 ? 255 : 0);
        int var25 = (arg14 ? 255 : 0) + (arg3 << 8);
        int[] var26 = new int[arg0.length / 2];
        int var27 = (arg2 ? 255 : 0) + (arg10 << 8);
        for (int var28 = 0; var28 < var26.length; var28++) {
            int var29 = arg0[var28 + var28];
            int var30 = arg0[var28 + var28 + 1];
            int[][] var31 = arg11 == null || arg7 == null || !arg7[var28] ? arg20 : arg11;
            var26[var28] = class271.method1876(-1, var27, var30, arg9, var31, var29, arg15, (float) arg5, false, arg11, arg6, arg12, arg1, var24, arg18, arg19, var25, var22);
        }
        arg19.method1358(arg16, arg9, arg15, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZLdk;Ldk;)Lid;", line = 308)
    public static final class102 method309(int arg0, int arg1, boolean arg2, class241 arg3, class241 arg4) {
        field716++;
        boolean var5 = true;
        int[] var6 = arg3.method1635(arg1, true);
        for (int var7 = arg0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method1628((byte) -120, arg1, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg2) {
                    var10 = arg4.method1628((byte) -120, 0, var9);
                } else {
                    var10 = arg4.method1628((byte) -120, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class102(arg3, arg4, arg1, arg2);
        } catch (Exception var12) {
            return null;
        }
    }
}
