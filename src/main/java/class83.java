import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class83 extends class222 {

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lcf;")
    public class93 field1520;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Lcf;")
    public static class93 field1523 = class147.method1066("<)4col> x", -48);

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lcf;")
    public static class93 field1525 = class147.method1066("<col=ffffff>", -48);

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[[S")
    public static short[][] field1519;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBIII)V")
    public static final void method580(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class212 var5 = class123.method905(-1205364448, 10, arg3);
        var5.method1493(13);
        if (arg1 < -110) {
            var5.field3889 = arg0;
            var5.field3883 = arg4;
            field1517++;
            var5.field3892 = arg2;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static void method581(int arg0) {
        if (arg0 == 0) {
            field1525 = null;
            field1519 = null;
            field1523 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILlh;ZLee;)V")
    public static final void method582(int arg0, class286 arg1, boolean arg2, class280 arg3) {
        field1518++;
        class4 var4 = new class4();
        var4.field39 = arg3.method1907(16832);
        var4.field40 = arg3.method1872(105);
        var4.field38 = new class22[var4.field39];
        if (!arg2) {
            method581(-70);
        }
        var4.field50 = new int[var4.field39];
        var4.field58 = new byte[var4.field39][][];
        var4.field47 = new int[var4.field39];
        var4.field51 = new class22[var4.field39];
        var4.field42 = new int[var4.field39];
        for (int var5 = 0; var5 < var4.field39; var5++) {
            try {
                int var6 = arg3.method1907(16832);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method1889((byte) -67).method642(20));
                    String var18 = new String(arg3.method1889((byte) -67).method642(20));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method1872(98);
                    }
                    var4.field47[var5] = var6;
                    var4.field50[var5] = var19;
                    var4.field38[var5] = arg1.method1963(class104.method757(false, var17), 0, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method1889((byte) -67).method642(20));
                    String var8 = new String(arg3.method1889((byte) -67).method642(20));
                    int var9 = arg3.method1907(16832);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method1889((byte) -67).method642(20));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method1872(99);
                            var12[var13] = new byte[var14];
                            arg3.method1928(var14, var12[var13], -16777216, 0);
                        }
                    }
                    var4.field47[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class104.method757(false, var10[var16]);
                    }
                    var4.field51[var5] = arg1.method1953(var15, class104.method757(!arg2, var7), !arg2, var8);
                    var4.field58[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field42[var5] = -1;
            } catch (SecurityException var21) {
                var4.field42[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field42[var5] = -3;
            } catch (Exception var23) {
                var4.field42[var5] = -4;
            } catch (Throwable var24) {
                var4.field42[var5] = -5;
            }
        }
        class112.field1904.method1152((byte) -5, var4);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I")
    public static final int method583(int arg0, int arg1) {
        field1526++;
        if (arg1 > -125) {
            method584(110);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)Z")
    public static final boolean method584(int arg0) {
        if (arg0 != -4) {
            return true;
        }
        field1524++;
        if (class234.field4186) {
            try {
                class41.field630.method646(class169.field2967.field5113, 0);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class83() {
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lcf;I)V")
    public class83(class93 arg0, int arg1) {
        this.field1520 = arg0;
    }
}
