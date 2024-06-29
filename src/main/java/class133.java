import java.util.Calendar;
import java.util.TimeZone;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class133 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
    public static int[] field2241 = new int[99];

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Le;")
    public static class342 field2248;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2249;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lbm;")
    public static class307 field2246;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2241[var1] = var0 / 4;
        }
        field2248 = new class342(128);
        field2250 = 0;
        field2249 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([IIBJ)Ljava/lang/String;", line = 11)
    public static final String method869(int[] arg0, int arg1, byte arg2, long arg3) {
        field2247++;
        if (arg2 >= -98) {
            field2248 = (class342) null;
        }
        if (class130.field2207 != null) {
            String var5 = class130.field2207.method639(-3459, arg3, arg1, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)Z", line = 36)
    public static final boolean method870(boolean arg0, int arg1) {
        field2245++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class120.field2088[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1006) {
            return true;
        } else {
            if (arg0) {
                method874(-79, 64, -62, (byte[][][]) ((byte[][][]) null), 126, (byte) 32, -117, 98);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 62)
    public static final void method871(int arg0, int arg1) {
        int var2 = 88 / ((arg0 + 3) / 43);
        class280.field4308.method1883(2047773287, arg1);
        field2244++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 79)
    public static void method872(boolean arg0) {
        if (!arg0) {
            method869((int[]) null, 98, (byte) -47, 114L);
        }
        field2248 = null;
        field2246 = null;
        field2249 = null;
        field2241 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLbm;Lbm;Z)V", line = 93)
    public static final void method873(boolean arg0, class307 arg1, class307 arg2, boolean arg3) {
        if (!arg0) {
            field2241 = (int[]) null;
        }
        class103.field1782 = arg1;
        class47.field961 = arg3;
        class90.field1663 = arg2;
        field2243++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III[[[BIBII)V", line = 107)
    public static final void method874(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class186.field3020++;
        class330.field5056 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class175.field2821; var12 < class164.field2638; var12++) {
            class47[][] var13 = class326.field4975[var12];
            for (int var14 = class189.field3061; var14 < class190.field3081; var14++) {
                for (int var15 = class23.field471; var15 < class121.field2092; var15++) {
                    class47 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class56.field1110[var14 + class339.field5251 - class166.field2675][var15 + class339.field5251 - class56.field1108] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field963 = true;
                            var16.field968 = true;
                            if (var16.field969 > 0) {
                                var16.field979 = true;
                            } else {
                                var16.field979 = false;
                            }
                            class330.field5056++;
                        } else {
                            var16.field963 = false;
                            var16.field968 = false;
                            var16.field985 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field965 != null) {
                                    class41 var17 = var16.field965;
                                    var17.field796.method35(0, var12, var17.field794, var17.field789, var17.field784);
                                    if (var17.field788 != null) {
                                        var17.field788.method35(0, var12, var17.field794, var17.field789, var17.field784);
                                    }
                                }
                                if (var16.field975 != null) {
                                    class11 var18 = var16.field975;
                                    var18.field224.method35(var18.field223, var12, var18.field233, var18.field234, var18.field229);
                                    if (var18.field231 != null) {
                                        var18.field231.method35(var18.field223, var12, var18.field233, var18.field234, var18.field229);
                                    }
                                }
                                if (var16.field967 != null) {
                                    class289 var19 = var16.field967;
                                    var19.field4443.method35(0, var12, var19.field4447, var19.field4442, var19.field4441);
                                }
                                if (var16.field974 != null) {
                                    for (int var20 = 0; var20 < var16.field969; var20++) {
                                        class271 var21 = var16.field974[var20];
                                        var21.field4182.method35(var21.field4188, var12, var21.field4174, var21.field4179, var21.field4185);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class45.field923 == class136.field2290;
        if (class249.field3893) {
            GL var23 = class249.field3898;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class21.method170();
                class128.method844(-1, 3, (byte) -53);
                class255.field3984 = true;
                class316.method2180();
                class201.field3205 = -1;
                class116.field2034 = -1;
                for (int var24 = 0; var24 < class141.field2340[0].length; var24++) {
                    class16 var25 = class141.field2340[0][var24];
                    float var26 = 251.5F - (var25.field313 ? 1.0F : 0.5F);
                    if (class201.field3205 != var25.field295) {
                        class201.field3205 = var25.field295;
                        class48.method370(var25.field295, (byte) 67);
                        class65.method496(class17.method121(0));
                    }
                    var25.method115(class326.field4975, var26, false);
                }
                class316.method2179();
            } else {
                int var27 = class175.field2821;
                while (true) {
                    if (var27 >= class164.field2638) {
                        class310.method2074(class166.field2675, class56.field1108, class326.field4975);
                        break;
                    }
                    for (int var28 = 0; var28 < class141.field2340[var27].length; var28++) {
                        class16 var29 = class141.field2340[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field313 ? 1.0F : 0.5F);
                        if (var29.field290 != -1 && class85.method598(class284.field4393.method398((byte) 65, var29.field290), -1) && class45.field926) {
                            class48.method370(var29.field295, (byte) 67);
                        }
                        var29.method115(class326.field4975, var30, false);
                    }
                    if (var27 == 0 && class305.field4620 > 0) {
                        class249.method1678(101.5F);
                        class60.method459(class166.field2675, class56.field1108, class339.field5251, arg1, class56.field1110, class45.field923[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class175.field2821; var31 < class164.field2638; var31++) {
            class47[][] var32 = class326.field4975[var31];
            for (int var33 = -class339.field5251; var33 <= 0; var33++) {
                int var34 = class166.field2675 + var33;
                int var35 = class166.field2675 - var33;
                if (var34 >= class189.field3061 || var35 < class190.field3081) {
                    for (int var36 = -class339.field5251; var36 <= 0; var36++) {
                        int var37 = class56.field1108 + var36;
                        int var38 = class56.field1108 - var36;
                        if (var34 >= class189.field3061) {
                            if (var37 >= class23.field471) {
                                class47 var39 = var32[var34][var37];
                                if (var39 != null && var39.field963) {
                                    class277.method1866(var39, true);
                                }
                            }
                            if (var38 < class121.field2092) {
                                class47 var40 = var32[var34][var38];
                                if (var40 != null && var40.field963) {
                                    class277.method1866(var40, true);
                                }
                            }
                        }
                        if (var35 < class190.field3081) {
                            if (var37 >= class23.field471) {
                                class47 var41 = var32[var35][var37];
                                if (var41 != null && var41.field963) {
                                    class277.method1866(var41, true);
                                }
                            }
                            if (var38 < class121.field2092) {
                                class47 var42 = var32[var35][var38];
                                if (var42 != null && var42.field963) {
                                    class277.method1866(var42, true);
                                }
                            }
                        }
                        if (class330.field5056 == 0) {
                            if (!var22) {
                                class70.field1477 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class175.field2821; var43 < class164.field2638; var43++) {
            class47[][] var44 = class326.field4975[var43];
            for (int var45 = -class339.field5251; var45 <= 0; var45++) {
                int var46 = class166.field2675 + var45;
                int var47 = class166.field2675 - var45;
                if (var46 >= class189.field3061 || var47 < class190.field3081) {
                    for (int var48 = -class339.field5251; var48 <= 0; var48++) {
                        int var49 = class56.field1108 + var48;
                        int var50 = class56.field1108 - var48;
                        if (var46 >= class189.field3061) {
                            if (var49 >= class23.field471) {
                                class47 var51 = var44[var46][var49];
                                if (var51 != null && var51.field963) {
                                    class277.method1866(var51, false);
                                }
                            }
                            if (var50 < class121.field2092) {
                                class47 var52 = var44[var46][var50];
                                if (var52 != null && var52.field963) {
                                    class277.method1866(var52, false);
                                }
                            }
                        }
                        if (var47 < class190.field3081) {
                            if (var49 >= class23.field471) {
                                class47 var53 = var44[var47][var49];
                                if (var53 != null && var53.field963) {
                                    class277.method1866(var53, false);
                                }
                            }
                            if (var50 < class121.field2092) {
                                class47 var54 = var44[var47][var50];
                                if (var54 != null && var54.field963) {
                                    class277.method1866(var54, false);
                                }
                            }
                        }
                        if (class330.field5056 == 0) {
                            if (!var22) {
                                class70.field1477 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class70.field1477 = false;
    }
}
