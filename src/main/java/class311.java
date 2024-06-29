import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class311 {

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Ljava/util/Random;")
    public static Random field4261 = new Random();

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "[[[Ljd;")
    public static class125[][][] field4255;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BC)Z")
    public static final boolean method1999(byte arg0, char arg1) {
        if (arg0 != -102) {
            method2002((class345) null, (byte) 117);
        }
        field4258++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[ILqa;[I[I)V")
    public static final void method2000(int arg0, int[] arg1, class134 arg2, int[] arg3, int[] arg4) {
        if (arg0 != 30204) {
            method2001(11);
        }
        field4256++;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg4[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg2.field5296.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field5296[var9] = null;
                    } else {
                        class411 var10 = class108.method761((byte) -82, var6);
                        int var11 = var10.field5832;
                        class66 var12 = arg2.field5296[var9];
                        if (var12 != null) {
                            if (var12.field980 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field5296[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field975 = 1;
                                    var12.field979 = 0;
                                    var12.field982 = 0;
                                    var12.field973 = 0;
                                    var12.field985 = var8;
                                    class431.method2721(arg2.field6266, arg2.field6262, var10, arg0 - 30107, class412.field5841 == arg2, 0);
                                } else if (var11 == 2) {
                                    var12.field979 = 0;
                                }
                            } else if (var10.field5825 >= class108.method761((byte) -82, var12.field980).field5825) {
                                var12 = arg2.field5296[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class66 var13 = arg2.field5296[var9] = new class66();
                            var13.field979 = 0;
                            var13.field975 = 1;
                            var13.field985 = var8;
                            var13.field982 = 0;
                            var13.field980 = var6;
                            var13.field973 = 0;
                            class431.method2721(arg2.field6266, arg2.field6262, var10, arg0 - 30110, class412.field5841 == arg2, 0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static final void method2001(int arg0) {
        field4260++;
        if (class123.field1707) {
            return;
        }
        class128.field1806 = true;
        class123.field1707 = true;
        if (class133.field1916) {
            class333.field4599 = (float) ((int) class333.field4599 - 65 & 0xFFFFFF80);
        } else {
            class305.field4209 += (-class305.field4209 - 24.0F) / 2.0F;
        }
        if (arg0 != -128) {
            method2001(6);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Luo;B)V")
    public static final void method2002(class345 arg0, byte arg1) {
        field4257++;
        int var2 = class18.field330;
        if (arg1 != -128) {
            field4255 = null;
        }
        int var3 = class211.field2952;
        int var4 = class151.field2135;
        int var5 = class432.field6101;
        int var6 = -10660793;
        arg0.method2182(var2, var3, var4, var6, arg1 ^ 0x10, var5);
        arg0.method2182(var2 + 1, var3 + 1, var4 - 2, -16777216, 74, 16);
        arg0.method2188(var4 - 2, var5 + -19, var2 + 1, var3 + 18, -16777216, (byte) -34);
        class279.field3915.method2286(-1, var3 + 14, class80.field1143.method2763(arg1 ^ 0xFFFFFFD6, class210.field2935), var2 + 3, var6, (byte) -113);
        int var7 = class239.field3410.method1071((byte) -12);
        int var8 = class239.field3410.method1068((byte) -59);
        int var9 = 0;
        for (class87 var10 = (class87) class121.field1699.method646(48); var10 != null; var10 = (class87) class121.field1699.method641(false)) {
            int var11 = (class90.field1260 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < (var2 + var4) && (var11 - 13) < var8 && var8 < var11 + 3) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class197.method1282((byte) 33, var10.field1217)) {
                var13 = class51.method433((byte) 87, (int) var10.field1216).field4950;
            } else if (class39.method370(var10.field1217, 1010)) {
                class198 var14 = class98.field1358[(int) var10.field1216];
                if (var14 != null) {
                    var13 = var14.field2737.field4505;
                }
            } else if (class228.method1577(var10.field1217, 44)) {
                if (var10.field1217 == 1003) {
                    var13 = class375.method2395((byte) 21, (int) var10.field1216).field920;
                } else {
                    var13 = class375.method2395((byte) 69, (int) (var10.field1216 >>> 32 & 0x7FFFFFFFL)).field920;
                }
            }
            String var15 = class203.method1318(0, var10);
            if (var13 != null) {
                var15 = var15 + class387.method2453(var13, true);
            }
            var9++;
            class279.field3915.method2297(var12, -109, 0, class305.field4210, var2 + 3, class157.field2217, var11, var15);
        }
        class425.method2688(class432.field6101, class211.field2952, -102, class151.field2135, class18.field330);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public static final void method2003(int arg0) {
        field4254++;
        if (class74.field1061 > 0) {
            class389.method2466((byte) 111);
            return;
        }
        if (arg0 != -1266) {
            method2002((class345) null, (byte) -123);
        }
        class439.field6181 = class156.field2207;
        class156.field2207 = null;
        class139.method958(40, false);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Component;IZ)Ltr;")
    public static final class161 method2004(Component arg0, int arg1, boolean arg2) {
        if (arg1 > -123) {
            field4261 = null;
        }
        field4259++;
        return new class258(arg0, arg2);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
    public static void method2005(int arg0) {
        field4261 = null;
        field4255 = null;
        if (arg0 != 16) {
            field4261 = null;
        }
    }
}
