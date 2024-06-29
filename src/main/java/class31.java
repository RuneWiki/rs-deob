import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 {

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Z")
    public boolean field876 = true;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public int field863;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lkd;")
    public static class73 field861 = class126.method1070((byte) -66, "backleft2");

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lkd;")
    public static class73 field872 = class126.method1070((byte) -66, "hel");

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Lkd;")
    public static class73 field874 = class126.method1070((byte) -66, "sl_flags");

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field869 = 0;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Z")
    public static boolean field873 = false;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Lkd;")
    public static class73 field878 = class126.method1070((byte) -66, ")1");

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Lkd;")
    public static class73 field882 = class126.method1070((byte) -66, "gelb:");

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lkd;")
    private static class73 field858 = class126.method1070((byte) -66, "Hide");

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lkd;")
    public static class73 field866 = field858;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Lua;")
    public static class137 field879;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lud;")
    public static class140 field862;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lea;")
    public static class30 field864;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[Lpb;")
    public static class106[] field865;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method252(boolean arg0) {
        field879 = null;
        field858 = null;
        field866 = null;
        field878 = null;
        field874 = null;
        field861 = null;
        field882 = null;
        field864 = null;
        field872 = null;
        field862 = null;
        field865 = null;
        if (arg0) {
            field862 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method253(int arg0) {
        field859++;
        try {
            if (arg0 != -1002) {
                method252(false);
            }
            Graphics var1 = class18.field519.getGraphics();
            class92.field2379.method98(17, 357, -16961, var1);
        } catch (Exception var2) {
            class18.field519.repaint();
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field883 = arg4;
        this.field860 = arg3;
        this.field877 = arg0;
        this.field875 = arg5;
        this.field863 = arg1;
        this.field876 = arg6;
        this.field880 = arg2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILw;Lqc;Z)V")
    public static final void method254(int arg0, class148 arg1, class114 arg2, boolean arg3) {
        field868++;
        class57 var4 = new class57();
        var4.field1524 = arg2.method957((byte) 81);
        var4.field1523 = arg2.method973(-128);
        var4.field1515 = new class65[var4.field1524];
        var4.field1509 = new int[var4.field1524];
        if (!arg3) {
            field861 = null;
        }
        var4.field1522 = new int[var4.field1524];
        var4.field1526 = new byte[var4.field1524][][];
        var4.field1528 = new class65[var4.field1524];
        var4.field1518 = new int[var4.field1524];
        for (int var5 = 0; var5 < var4.field1524; var5++) {
            try {
                int var6 = arg2.method957((byte) 127);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg2.method927((byte) 122).method612(4));
                    String var18 = new String(arg2.method927((byte) 122).method612(4));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method973(-128);
                    }
                    var4.field1509[var5] = var6;
                    var4.field1522[var5] = var19;
                    var4.field1515[var5] = arg1.method1180(var18, 0, class22.method190(124, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method927((byte) 122).method612(4));
                    String var8 = new String(arg2.method927((byte) 122).method612(4));
                    int var9 = arg2.method957((byte) 29);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method927((byte) 122).method612(4));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method973(-120);
                            var12[var13] = new byte[var14];
                            arg2.method955(0, -101, var12[var13], var14);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field1509[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class22.method190(124, var10[var16]);
                    }
                    var4.field1528[var5] = arg1.method1177(var15, var8, true, class22.method190(119, var7));
                    var4.field1526[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1518[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1518[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1518[var5] = -3;
            } catch (Exception var23) {
                var4.field1518[var5] = -4;
            } catch (Throwable var24) {
                var4.field1518[var5] = -5;
            }
        }
        class76.field1944.method519(var4, 13017);
    }
}
