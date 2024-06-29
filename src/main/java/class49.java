import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class49 extends class521 {

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Lwr;")
    private class388 field944;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Ldk;")
    public static class435 field958 = new class435(4);

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Lan;")
    public static class21 field960;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Ljg;")
    private class284 field947;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static final void method474(int arg0) {
        if (class3.field39 != -1) {
            class341.method2069(22355, -1, -1, class3.field39, false);
            class3.field39 = -1;
        }
        field945++;
        if (arg0 != -1) {
            field959 = -88;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public static final void method475(int arg0) {
        class312.method1948(-33);
        field948++;
        if (arg0 != 0) {
            field960 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZII)B")
    public static final byte method476(boolean arg0, int arg1, int arg2) {
        field946++;
        if (!arg0) {
            return -4;
        } else if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
    public static void method477(int arg0) {
        if (arg0 != -4) {
            field959 = -66;
        }
        field960 = null;
        field958 = null;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)Ljg;")
    public final class284 method478(byte arg0) {
        field957++;
        if (arg0 > -69) {
            method474(113);
        }
        if (this.field947 == null) {
            class259.field3608[2] = this.field954;
            class259.field3608[0] = this.field951;
            class259.field3608[1] = this.field952;
            class259.field3608[3] = this.field955;
            class259.field3608[5] = this.field950;
            class259.field3608[4] = this.field956;
            class17 var2 = this.field944.field2924;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method188(class259.field3608[var5], -119)) {
                    return null;
                }
                class211 var7 = var2.method190((byte) -89, class259.field3608[var5]);
                int var8 = var7.field2965 ? 64 : 128;
                if (var7.field2980 > 0) {
                    var3 = 1;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class557.field7714[var6] = var2.method186(false, class259.field3608[var6], 10350, var4, var4, 1.0F);
            }
            this.field947 = this.field944.method1613(class557.field7714, var4, var3 != 0, true);
        }
        return this.field947;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILdj;BLdaa;)V")
    public static final void method479(int arg0, class288 arg1, byte arg2, class11 arg3) {
        field953++;
        class634 var4 = new class634();
        var4.field9265 = arg3.method110((byte) 98);
        var4.field9260 = arg3.method119(-106);
        var4.field9264 = new int[var4.field9265];
        var4.field9262 = new int[var4.field9265];
        var4.field9268 = new class382[var4.field9265];
        var4.field9258 = new byte[var4.field9265][][];
        var4.field9259 = new int[var4.field9265];
        var4.field9266 = new class382[var4.field9265];
        if (arg2 >= -77) {
            field960 = null;
        }
        for (int var5 = 0; var5 < var4.field9265; var5++) {
            try {
                int var6 = arg3.method110((byte) 62);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg3.method100((byte) 69);
                    String var18 = arg3.method100((byte) 88);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method119(-84);
                    }
                    var4.field9262[var5] = var6;
                    var4.field9264[var5] = var19;
                    var4.field9268[var5] = arg1.method1859(true, var18, class446.method2640(-70, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg3.method100((byte) 70);
                    String var8 = arg3.method100((byte) 83);
                    int var9 = arg3.method110((byte) 89);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg3.method100((byte) 76);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method119(-60);
                            var12[var13] = new byte[var14];
                            arg3.method75(0, var14, (byte) 107, var12[var13]);
                        }
                    }
                    var4.field9262[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class446.method2640(-52, var10[var16]);
                    }
                    var4.field9266[var5] = arg1.method1854(var15, var8, -8390, class446.method2640(-42, var7));
                    var4.field9258[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field9259[var5] = -1;
            } catch (SecurityException var21) {
                var4.field9259[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field9259[var5] = -3;
            } catch (Exception var23) {
                var4.field9259[var5] = -4;
            } catch (Throwable var24) {
                var4.field9259[var5] = -5;
            }
        }
        class386.field5185.method463(var4, -112);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;ILdaa;)I")
    public static final int method480(String arg0, int arg1, class11 arg2) {
        field949++;
        int var3 = arg2.field165;
        byte[] var4 = class98.method695(arg0, -10310);
        int var5 = -2 / ((arg1 + 64) / 40);
        arg2.method113(var4.length, 4);
        arg2.field165 += class303.field4139.method847(var4, var4.length, arg2.field165, 0, arg2.field138, -103);
        return arg2.field165 - var3;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lwr;IIIIII)V")
    public class49(class388 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field954 = arg3;
        this.field956 = arg5;
        this.field952 = arg2;
        this.field955 = arg4;
        this.field950 = arg6;
        this.field944 = arg0;
        this.field951 = arg1;
    }
}
