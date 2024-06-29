import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class52 extends class179 {

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public int field855 = 0;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "[B")
    public static byte[] field858;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "[Lof;")
    public static class421[] field856;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIZI)V", line = 3)
    public static final void method413(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 >= class185.field2727 && arg4 <= class278.field4184 && arg6 >= class308.field4507 && arg1 <= class383.field5497) {
            if (arg3 == 1) {
                class84.method646(arg1, (byte) -116, arg4, arg0, arg2, arg6);
            } else {
                class109.method955(!arg5, arg4, arg6, arg1, arg2, arg3, arg0);
            }
        } else if (arg3 == 1) {
            class451.method2811(true, arg6, arg0, arg4, arg2, arg1);
        } else {
            class436.method2734(arg2, arg0, -1, arg1, arg3, arg6, arg4);
        }
        if (arg5) {
            field857++;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lec;B)V", line = 45)
    public final void method414(class37 arg0, byte arg1) {
        if (arg1 < 113) {
            this.method414((class37) null, (byte) -104);
        }
        while (true) {
            int var3 = arg0.method271((byte) 119);
            if (var3 == 0) {
                field850++;
                return;
            }
            this.method415(arg0, -28805, var3);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lec;II)V", line = 68)
    private final void method415(class37 arg0, int arg1, int arg2) {
        if (arg1 == -28805) {
            if (arg2 == 2) {
                this.field855 = arg0.method320((byte) -87);
            }
            field859++;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZLdp;)I", line = 84)
    public static final int method416(boolean arg0, class174 arg1) {
        field851++;
        int var2 = 0;
        if (arg1.method1348(255, class451.field6552)) {
            var2++;
        }
        if (arg1.method1348(255, class268.field4012)) {
            var2++;
        }
        if (arg1.method1348(255, class362.field5161)) {
            var2++;
        }
        if (arg1.method1348(255, class206.field3014)) {
            var2++;
        }
        if (arg1.method1348(255, class27.field405)) {
            var2++;
        }
        if (!arg0) {
            field852 = 93;
        }
        if (arg1.method1348(255, class452.field6583)) {
            var2++;
        }
        if (arg1.method1348(255, class58.field934)) {
            var2++;
        }
        if (arg1.method1348(255, class107.field1764)) {
            var2++;
        }
        if (arg1.method1348(255, class73.field1218)) {
            var2++;
        }
        if (arg1.method1348(255, class109.field1785)) {
            var2++;
        }
        if (arg1.method1348(255, class26.field392)) {
            var2++;
        }
        if (arg1.method1348(255, class136.field2174)) {
            var2++;
        }
        if (arg1.method1348(255, class12.field205)) {
            var2++;
        }
        if (arg1.method1348(255, class157.field2382)) {
            var2++;
        }
        if (arg1.method1348(255, class252.field3633)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lvj;ILec;B)V", line = 153)
    public static final void method417(class177 arg0, int arg1, class37 arg2, byte arg3) {
        field853++;
        if (arg3 > -25) {
            method418(25, (class258) null);
        }
        class388 var4 = new class388();
        var4.field5567 = arg2.method271((byte) 104);
        var4.field5558 = arg2.method278(-120);
        var4.field5556 = new int[var4.field5567];
        var4.field5560 = new int[var4.field5567];
        var4.field5564 = new byte[var4.field5567][][];
        var4.field5562 = new class131[var4.field5567];
        var4.field5555 = new class131[var4.field5567];
        var4.field5561 = new int[var4.field5567];
        for (int var5 = 0; var5 < var4.field5567; var5++) {
            try {
                int var6 = arg2.method271((byte) 127);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg2.method322((byte) -34);
                    String var18 = arg2.method322((byte) -34);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method278(-116);
                    }
                    var4.field5561[var5] = var6;
                    var4.field5556[var5] = var19;
                    var4.field5555[var5] = arg0.method1378(var18, class339.method2194(var17, 14), -87);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg2.method322((byte) -34);
                    String var8 = arg2.method322((byte) -34);
                    int var9 = arg2.method271((byte) 102);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg2.method322((byte) -34);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method278(98);
                            var12[var13] = new byte[var14];
                            arg2.method285(0, (byte) -82, var14, var12[var13]);
                        }
                    }
                    var4.field5561[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class339.method2194(var10[var16], 14);
                    }
                    var4.field5562[var5] = arg0.method1387(var8, 9, class339.method2194(var7, 14), var15);
                    var4.field5564[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5560[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5560[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5560[var5] = -3;
            } catch (Exception var23) {
                var4.field5560[var5] = -4;
            } catch (Throwable var24) {
                var4.field5560[var5] = -5;
            }
        }
        class334.field4787.method148((byte) 127, var4);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILmb;)Z", line = 274)
    public static final boolean method418(int arg0, class258 arg1) {
        if (arg0 != 250) {
            method413(76, -53, -12, -123, 35, false, 37);
        }
        field854++;
        if (arg1.field3821 == 205) {
            class123.field1937 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)V", line = 294)
    public static void method419(int arg0) {
        field856 = null;
        field858 = null;
        if (arg0 != 19367) {
            method413(51, -42, -125, 126, 93, true, 2);
        }
    }
}
