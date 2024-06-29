import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class55 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lsb;")
    public static class98 field873 = class47.method368(":clanreq:", 0);

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field875 = 0;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Lsb;")
    public static class98 field878 = class47.method368("Lade Titelbild )2 ", 0);

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lsb;")
    public static class98 field879 = null;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "[S")
    public static short[] field874 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(JI)V")
    public static final void method403(long arg0, int arg1) {
        field880++;
        if (arg0 == 0L) {
            return;
        }
        if (class191.field3318 >= 100) {
            class176.method1228(class233.field4011, class238.field4105, (byte) -49, 0);
            return;
        }
        if (arg1 < 50) {
            method408((class148[]) null, 35, -88, 38, 40, false);
        }
        class98 var3 = class106.method814(arg0, (byte) -128).method726((byte) -100);
        for (int var4 = 0; var4 < class191.field3318; var4++) {
            if (class228.field3926[var4] == arg0) {
                class176.method1228(class233.field4011, class186.method1288(new class98[] { var3, class178.field3091 }, 31618), (byte) -49, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class99.field1751; var5++) {
            if (class74.field1270[var5] == arg0) {
                class176.method1228(class233.field4011, class186.method1288(new class98[] { class26.field494, var3, class33.field575 }, 31618), (byte) -49, 0);
                return;
            }
        }
        if (var3.method748(true, class163.field2943.field3323)) {
            class176.method1228(class233.field4011, class116.field2084, (byte) -49, 0);
            return;
        }
        class228.field3926[class191.field3318] = arg0;
        class181.field3131[class191.field3318++] = class106.method814(arg0, (byte) -128);
        class237.field4093 = class186.field3214;
        class237.field4084.method490(184, -96);
        class237.field4084.method1484(arg0, (byte) 38);
        class153.field2798++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method404(byte arg0) {
        field873 = null;
        field878 = null;
        field879 = null;
        if (arg0 != -89) {
            field878 = null;
        }
        field874 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLkh;Llj;)V")
    public static final void method405(int arg0, byte arg1, class5 arg2, class216 arg3) {
        field877++;
        class36 var4 = new class36();
        var4.field615 = arg3.method1446(arg1 ^ 0xFFFFEB46);
        var4.field602 = arg3.method1442(-1330139880);
        var4.field611 = new class22[var4.field615];
        var4.field605 = new int[var4.field615];
        var4.field607 = new int[var4.field615];
        var4.field613 = new byte[var4.field615][][];
        var4.field612 = new class22[var4.field615];
        var4.field603 = new int[var4.field615];
        for (int var5 = 0; var5 < var4.field615; var5++) {
            try {
                int var6 = arg3.method1446(5350);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg3.method1445(-3).method725(false));
                    String var8 = new String(arg3.method1445(arg1 ^ 0x5D).method725(false));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method1442(arg1 ^ 0x4F4852B8);
                    }
                    var4.field607[var5] = var6;
                    var4.field603[var5] = var9;
                    var4.field611[var5] = arg2.method30(class182.method1256(true, var7), var8, false);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg3.method1445(-3).method725(false));
                    String var11 = new String(arg3.method1445(-3).method725(false));
                    int var12 = arg3.method1446(5350);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg3.method1445(-3).method725(false));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method1442(arg1 - 1330139784);
                            var15[var16] = new byte[var17];
                            arg3.method1481(var17, var15[var16], 0, arg1 ^ 0xFFFFFF5F);
                        }
                    }
                    var4.field607[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class182.method1256(true, var13[var19]);
                    }
                    var4.field612[var5] = arg2.method35(class182.method1256(true, var10), arg1 + 143, var11, var18);
                    var4.field613[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field605[var5] = -1;
            } catch (SecurityException var21) {
                var4.field605[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field605[var5] = -3;
            } catch (Exception var23) {
                var4.field605[var5] = -4;
            } catch (Throwable var24) {
                var4.field605[var5] = -5;
            }
        }
        if (arg1 != -96) {
            method407(44, 55, 68);
        }
        class74.field1244.method376((byte) 13, var4);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V")
    public static final void method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field876++;
        class92.field1621[0].method259(arg3, arg4);
        class92.field1621[1].method259(arg3, arg4 + arg0 - 16);
        int var6 = (arg0 - 32) * arg0 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = 12 / ((arg5 + 33) / 59);
        int var8 = (arg0 - var6 - 32) * arg2 / (arg1 - arg0);
        class128.method967(arg3, arg4 + 16, 16, arg0 - 32, class219.field3770);
        class128.method967(arg3, var8 + arg4 + 16, 16, var6, class14.field265);
        class128.method958(arg3, arg4 + var8 + 16, var6, class166.field2974);
        class128.method958(arg3 + 1, arg4 + 16 - -var8, var6, class166.field2974);
        class128.method966(arg3, arg4 + var8 + 16, 16, class166.field2974);
        class128.method966(arg3, arg4 + var8 + 17, 16, class166.field2974);
        class128.method958(arg3 + 15, arg4 + 16 + var8, var6, class153.field2789);
        class128.method958(arg3 + 14, 17 - -var8 + arg4, var6 - 1, class153.field2789);
        class128.method966(arg3, arg4 + var6 + var8 + 15, 16, class153.field2789);
        class128.method966(arg3 + 1, arg4 + var8 + var6 + 14, 15, class153.field2789);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Ljk;")
    public static final class225 method407(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class225 var4 = var3.field1141;
            var3.field1141 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([Lq;IIIIZ)V")
    public static final void method408(class148[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 <= 19) {
            return;
        }
        field881++;
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class148 var7 = arg0[var6];
            if (var7 != null && var7.field2650 == arg2) {
                class233.method1598(arg1, arg5, -61, var7, arg4);
                class190.method1310(true, var7, arg4, arg1);
                if (var7.field2644 - var7.field2647 < var7.field2615) {
                    var7.field2615 = var7.field2644 - var7.field2647;
                }
                if (var7.field2615 < 0) {
                    var7.field2615 = 0;
                }
                if (var7.field2649 > (var7.field2590 - var7.field2694)) {
                    var7.field2649 = var7.field2590 - var7.field2694;
                }
                if (var7.field2649 < 0) {
                    var7.field2649 = 0;
                }
                if (var7.field2665 == 0) {
                    class120.method902(var7, arg5, (byte) 59);
                }
            }
        }
    }
}
