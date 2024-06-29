import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class279 {

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field4100 = 0;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Ljava/util/Random;")
    public static Random field4107 = new Random();

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "[I")
    public static int[] field4117 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "[B")
    public static byte[] field4121 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "B")
    public byte field4096;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "B")
    public byte field4104;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "B")
    public byte field4105;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "B")
    public byte field4106;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "B")
    public byte field4110;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "B")
    public byte field4116;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "B")
    public byte field4122;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4115;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "S")
    public short field4111;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Z")
    public boolean field4097;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Z")
    public boolean field4098;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Z")
    public boolean field4102;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Z")
    public boolean field4108;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Z")
    public boolean field4112;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Z")
    public boolean field4113;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Z")
    public boolean field4114;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Z")
    public boolean field4119;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Z")
    public boolean field4120;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[Lff;")
    public static class9[] field4118;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public static final void method1762(int arg0, int arg1) {
        class51.field698.method1486(438127120, arg0);
        field4103++;
        if (arg1 <= 41) {
            method1762(-15, -75);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method1763(int arg0) {
        if (arg0 != -24780) {
            method1765((class201) null, -113);
        }
        field4117 = null;
        field4118 = null;
        field4107 = null;
        field4115 = null;
        field4121 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZII)I")
    public static final int method1764(int arg0, boolean arg1, int arg2, int arg3) {
        field4109++;
        int var4 = arg3 & 0x3;
        if (!arg1) {
            return 107;
        } else if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lb;I)V")
    public static final void method1765(class201 arg0, int arg1) {
        class434.field6054 = arg0.method1234(false, "p11_full");
        field4095++;
        class338.field4914 = arg0.method1234(false, "p12_full");
        class70.field878 = arg0.method1234(false, "b12_full");
        class257.field3764 = arg0.method1234(false, "hitmarks");
        class467.field6580 = arg0.method1234(false, "hitbar_default");
        class236.field3548 = arg0.method1234(false, "timerbar_default");
        class258.field3789 = arg0.method1234(false, "headicons_pk");
        class329.field4758 = arg0.method1234(false, "headicons_prayer");
        class15.field180 = arg0.method1234(false, "hint_headicons");
        class124.field1560 = arg0.method1234(false, "hint_mapmarkers");
        int var2 = 9 / ((-arg1 - 36) / 34);
        class222.field3380 = arg0.method1234(false, "mapflag");
        class124.field1564 = arg0.method1234(false, "cross");
        class171.field2492 = arg0.method1234(false, "mapdots");
        class293.field4251 = arg0.method1234(false, "scrollbar");
        class306.field4361 = arg0.method1234(false, "name_icons");
        class153.field2263 = arg0.method1234(false, "floorshadows");
        class238.field3577 = arg0.method1234(false, "compass");
        class37.field481 = arg0.method1234(false, "otherlevel");
        class144.field1903 = arg0.method1234(false, "hint_mapedge");
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
    public static final void method1766(int arg0, int arg1) {
        class88 var2 = class330.field4786[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class88 var4 = class330.field4786[var3][arg0][arg1] = class330.field4786[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1074--;
                for (class93 var5 = var4.field1068; var5 != null; var5 = var5.field1178) {
                    class304 var6 = var5.field1177;
                    if (var6.field4330 == arg0 && var6.field4324 == arg1) {
                        var6.field4319--;
                    }
                }
            }
        }
        if (class330.field4786[0][arg0][arg1] == null) {
            class330.field4786[0][arg0][arg1] = new class88(0, arg0, arg1);
            class330.field4786[0][arg0][arg1].field1080 = 1;
        }
        class330.field4786[0][arg0][arg1].field1088 = var2;
        class330.field4786[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILck;)V")
    public static final void method1767(int arg0, class419 arg1) {
        field4094++;
        int var2 = 0;
        arg1.method2459(0);
        for (int var3 = 0; var3 < class37.field491; var3++) {
            int var15 = class348.field5033[var3];
            if ((class317.field4594[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class317.field4594[var15] = (byte) class248.method1549(class317.field4594[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method2464(1, arg0);
                    if (var16 == 0) {
                        var2 = class100.method569(arg1, (byte) 75);
                        class317.field4594[var15] = (byte) class248.method1549(class317.field4594[var15], 2);
                    } else {
                        class120.method740(arg1, 2, var15);
                    }
                }
            }
        }
        arg1.method2465(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2459(arg0);
        for (int var4 = 0; var4 < class37.field491; var4++) {
            int var13 = class348.field5033[var4];
            if ((class317.field4594[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class317.field4594[var13] = (byte) class248.method1549(class317.field4594[var13], 2);
                } else {
                    int var14 = arg1.method2464(1, 0);
                    if (var14 == 0) {
                        var2 = class100.method569(arg1, (byte) 54);
                        class317.field4594[var13] = (byte) class248.method1549(class317.field4594[var13], 2);
                    } else {
                        class120.method740(arg1, arg0 + 2, var13);
                    }
                }
            }
        }
        arg1.method2465(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2459(0);
        for (int var5 = 0; var5 < class282.field4151; var5++) {
            int var11 = class427.field5979[var5];
            if ((class317.field4594[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class317.field4594[var11] = (byte) class248.method1549(class317.field4594[var11], 2);
                } else {
                    int var12 = arg1.method2464(1, 0);
                    if (var12 == 0) {
                        var2 = class100.method569(arg1, (byte) 118);
                        class317.field4594[var11] = (byte) class248.method1549(class317.field4594[var11], 2);
                    } else if (class244.method1535((byte) -52, arg1, var11)) {
                        class317.field4594[var11] = (byte) class248.method1549(class317.field4594[var11], 2);
                    }
                }
            }
        }
        arg1.method2465(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2459(0);
        for (int var6 = 0; var6 < class282.field4151; var6++) {
            int var9 = class427.field5979[var6];
            if ((class317.field4594[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class317.field4594[var9] = (byte) class248.method1549(class317.field4594[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method2464(1, arg0);
                    if (var10 == 0) {
                        var2 = class100.method569(arg1, (byte) 61);
                        class317.field4594[var9] = (byte) class248.method1549(class317.field4594[var9], 2);
                    } else if (class244.method1535((byte) -98, arg1, var9)) {
                        class317.field4594[var9] = (byte) class248.method1549(class317.field4594[var9], 2);
                    }
                }
            }
        }
        arg1.method2465(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class37.field491 = arg0;
        class282.field4151 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class317.field4594[var7] = (byte) (class317.field4594[var7] >> 1);
            class452 var8 = class124.field1559[var7];
            if (var8 == null) {
                class427.field5979[class282.field4151++] = var7;
            } else {
                class348.field5033[class37.field491++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIZIIIIII)Z")
    public static final boolean method1768(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4099++;
        int var9 = class492.field6935.field2163[0];
        int var10 = class492.field6935.field2159[0];
        if (var9 < 0 || var9 >= class58.field758 || var10 < 0 || class287.field4181 <= var10) {
            return false;
        } else if (arg7 >= 0 && class58.field758 > arg7 && arg5 >= 0 && class287.field4181 > arg5) {
            int var11 = class239.method1518(arg0, arg7, arg3, class126.field1650, var9, arg4, arg5, class426.field5971, arg8, arg6, (byte) 114, class492.field6935.method918(arg2), arg1, class422.field5918[class492.field6935.field4319], var10);
            if (var11 < 1) {
                return false;
            }
            class118.field1493 = class126.field1650[var11 - 1];
            class359.field5161 = class426.field5971[var11 - 1];
            class326.field4710 = false;
            class401.method2394(0);
            return true;
        } else {
            return false;
        }
    }
}
