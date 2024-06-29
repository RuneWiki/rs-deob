import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class50 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "[I")
    public static int[] field814 = new int[32];

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lhl;")
    public static class139 field818 = new class139(30);

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Z")
    public static boolean field820 = false;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[Lja;")
    public static class247[] field819;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "[[[B")
    public static byte[][][] field813;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method379(int arg0) {
        field814 = null;
        field813 = null;
        field819 = null;
        if (arg0 == -3) {
            field818 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static final void method380(int arg0) {
        if (arg0 != 0) {
            field819 = null;
        }
        class76.field1207.method944(65535);
        class177.field2591.method944(arg0 + 65535);
        class109.field1599.method944(65535);
        field815++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lca;Lgf;IB)V")
    public static final void method381(class54 arg0, class26 arg1, int arg2, byte arg3) {
        class157 var4 = new class157();
        var4.field2297 = arg0.method407(255);
        field816++;
        var4.field2290 = arg0.method420((byte) 26);
        var4.field2296 = new class40[var4.field2297];
        var4.field2295 = new int[var4.field2297];
        var4.field2294 = new class40[var4.field2297];
        var4.field2293 = new byte[var4.field2297][][];
        var4.field2291 = new int[var4.field2297];
        var4.field2301 = new int[var4.field2297];
        for (int var5 = 0; var5 < var4.field2297; var5++) {
            try {
                int var6 = arg0.method407(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg0.method439((byte) 80);
                    String var18 = arg0.method439((byte) 108);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method420((byte) 109);
                    }
                    var4.field2291[var5] = var6;
                    var4.field2301[var5] = var19;
                    var4.field2296[var5] = arg1.method188(class162.method1097(117, var17), -107, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method439((byte) -110);
                    String var8 = arg0.method439((byte) 110);
                    int var9 = arg0.method407(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method439((byte) -86);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method420((byte) -91);
                            var12[var13] = new byte[var14];
                            arg0.method410(-251030480, var12[var13], var14, 0);
                        }
                    }
                    var4.field2291[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class162.method1097(122, var10[var16]);
                    }
                    var4.field2294[var5] = arg1.method189(var15, var8, (byte) -113, class162.method1097(91, var7));
                    var4.field2293[var5] = var12;
                }
            } catch (ClassNotFoundException var21) {
                var4.field2295[var5] = -1;
            } catch (SecurityException var22) {
                var4.field2295[var5] = -2;
            } catch (NullPointerException var23) {
                var4.field2295[var5] = -3;
            } catch (Exception var24) {
                var4.field2295[var5] = -4;
            } catch (Throwable var25) {
                var4.field2295[var5] = -5;
            }
        }
        class78.field1238.method1881(var4, (byte) -56);
        int var20 = -46 % ((42 - arg3) / 54);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
    public static final void method382(int arg0, int arg1, int arg2) {
        field817++;
        if (arg2 <= 81) {
            return;
        }
        for (int var3 = 0; var3 < class235.field3617; var3++) {
            class108 var4 = class78.method622((byte) 103, var3);
            if (var4 != null) {
                int var5 = var4.field1590;
                if (var5 >= 0 && !class119.field1790.method1838((byte) -74, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field1589 >= 0) {
                    int var10 = var4.field1589;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg0 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class119.field1786[class49.method378(96, -15337, var12)];
                } else if (var5 >= 0) {
                    var6 = class119.field1786[class49.method378(96, -15337, class119.field1790.method1829(false, var5))];
                } else if (var4.field1586 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field1586;
                    int var8 = (var7 & 0x7F) + arg1;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg0 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class119.field1786[class49.method378(96, -15337, var9)];
                }
                class148.field2150[var3 + 1] = var6;
            }
        }
    }
}
