import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 extends class44 {

    @OriginalMember(owner = "client!hd", name = "zb", descriptor = "[B")
    public byte[] field1200;

    @OriginalMember(owner = "client!hd", name = "ub", descriptor = "[Lwb;")
    public static class133[] field1195 = new class133[13];

    @OriginalMember(owner = "client!hd", name = "sb", descriptor = "La;")
    public static class1 field1193 = class113.method934(-11538, ":duelreq:");

    @OriginalMember(owner = "client!hd", name = "Fb", descriptor = "La;")
    public static class1 field1206 = class113.method934(-11538, "@yel@*V");

    @OriginalMember(owner = "client!hd", name = "yb", descriptor = "La;")
    private static class1 field1199 = class113.method934(-11538, "Enter name:");

    @OriginalMember(owner = "client!hd", name = "Eb", descriptor = "La;")
    public static class1 field1205 = field1199;

    @OriginalMember(owner = "client!hd", name = "Ab", descriptor = "La;")
    private static class1 field1201 = class113.method934(-11538, "scroll:");

    @OriginalMember(owner = "client!hd", name = "wb", descriptor = "La;")
    public static class1 field1197 = field1201;

    @OriginalMember(owner = "client!hd", name = "Kb", descriptor = "I")
    public static int field1211 = 0;

    @OriginalMember(owner = "client!hd", name = "Jb", descriptor = "I")
    public static int field1210 = 0;

    @OriginalMember(owner = "client!hd", name = "xb", descriptor = "Lcb;")
    public static class15 field1198 = new class15(64);

    @OriginalMember(owner = "client!hd", name = "Pb", descriptor = "La;")
    public static class1 field1216 = class113.method934(-11538, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!hd", name = "Rb", descriptor = "La;")
    private static class1 field1218 = class113.method934(-11538, "From");

    @OriginalMember(owner = "client!hd", name = "Qb", descriptor = "La;")
    public static class1 field1217 = field1218;

    @OriginalMember(owner = "client!hd", name = "Tb", descriptor = "La;")
    private static class1 field1220 = class113.method934(-11538, "Error connecting to server)3");

    @OriginalMember(owner = "client!hd", name = "Vb", descriptor = "La;")
    private static class1 field1222 = class113.method934(-11538, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!hd", name = "Sb", descriptor = "La;")
    public static class1 field1219 = field1222;

    @OriginalMember(owner = "client!hd", name = "Ub", descriptor = "La;")
    public static class1 field1221 = field1220;

    @OriginalMember(owner = "client!hd", name = "tb", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!hd", name = "vb", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!hd", name = "Bb", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!hd", name = "Cb", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!hd", name = "Db", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!hd", name = "Gb", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!hd", name = "Hb", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!hd", name = "Ib", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!hd", name = "Lb", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!hd", name = "Mb", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!hd", name = "Nb", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!hd", name = "Ob", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V", line = 4)
    public static void method479(boolean arg0) {
        field1220 = null;
        field1205 = null;
        field1193 = null;
        field1218 = null;
        field1222 = null;
        field1206 = null;
        field1197 = null;
        field1195 = null;
        field1217 = null;
        field1201 = null;
        field1221 = null;
        field1198 = null;
        field1216 = null;
        field1219 = null;
        field1199 = null;
        if (!arg0) {
            method479(false);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIBIII)Z", line = 33)
    public static final boolean method480(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1209++;
        if (class134.method1055(arg1, 127)) {
            return arg3 == -5 ? client.method279(arg5, arg0, arg4, 0, -1, arg2, arg6, 0, class117.field2925[arg1], true) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([B)V", line = 85)
    public class46(byte[] arg0) {
        this.field1200 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILfe;)V", line = 93)
    public static final void method481(int arg0, int arg1, class36 arg2) {
        if (arg0 != -12) {
            return;
        }
        field1203++;
        while (true) {
            class119 var3 = (class119) class107.field2697.method805((byte) -90);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2967; var5++) {
                if (var3.field2964[var5] != null) {
                    if (var3.field2964[var5].field816 == 2) {
                        var3.field2962[var5] = -5;
                    }
                    if (var3.field2964[var5].field816 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2963[var5] != null) {
                    if (var3.field2963[var5].field816 == 2) {
                        var3.field2962[var5] = -6;
                    }
                    if (var3.field2963[var5].field816 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method416(11453, arg1);
            arg2.method142(0, (byte) -128);
            int var6 = arg2.field268;
            arg2.method183(123, var3.field2973);
            for (int var7 = 0; var7 < var3.field2967; var7++) {
                if (var3.field2962[var7] == 0) {
                    try {
                        int var8 = var3.field2961[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2964[var7].field819;
                            int var10 = var9.getInt(null);
                            arg2.method142(0, (byte) -128);
                            arg2.method183(111, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2964[var7].field819;
                            var11.setInt(null, var3.field2972[var7]);
                            arg2.method142(0, (byte) -128);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2964[var7].field819;
                            int var13 = var12.getModifiers();
                            arg2.method142(0, (byte) -128);
                            arg2.method183(66, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2963[var7].field819;
                            byte[][] var17 = var3.field2966[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method142(0, (byte) -128);
                            } else if (var21 instanceof Number) {
                                arg2.method142(1, (byte) -128);
                                arg2.method158(((Number) var21).longValue(), false);
                            } else if (var21 instanceof class1) {
                                arg2.method142(2, (byte) -128);
                                arg2.method182((class1) var21, (byte) -84);
                            } else {
                                arg2.method142(4, (byte) -128);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2963[var7].field819;
                            int var15 = var14.getModifiers();
                            arg2.method142(0, (byte) -128);
                            arg2.method183(77, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method142(-10, (byte) -128);
                    } catch (InvalidClassException var23) {
                        arg2.method142(-11, (byte) -128);
                    } catch (StreamCorruptedException var24) {
                        arg2.method142(-12, (byte) -128);
                    } catch (OptionalDataException var25) {
                        arg2.method142(-13, (byte) -128);
                    } catch (IllegalAccessException var26) {
                        arg2.method142(-14, (byte) -128);
                    } catch (IllegalArgumentException var27) {
                        arg2.method142(-15, (byte) -128);
                    } catch (InvocationTargetException var28) {
                        arg2.method142(-16, (byte) -128);
                    } catch (SecurityException var29) {
                        arg2.method142(-17, (byte) -128);
                    } catch (IOException var30) {
                        arg2.method142(-18, (byte) -128);
                    } catch (NullPointerException var31) {
                        arg2.method142(-19, (byte) -128);
                    } catch (Exception var32) {
                        arg2.method142(-20, (byte) -128);
                    } catch (Throwable var33) {
                        arg2.method142(-21, (byte) -128);
                    }
                } else {
                    arg2.method142(var3.field2962[var7], (byte) -128);
                }
            }
            arg2.method150(81, var6);
            arg2.method156(arg2.field268 - var6, (byte) 16);
            var3.method742(-1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I", line = 284)
    public static final int method482(int arg0, int arg1) {
        class35 var2 = class74.method689(0, arg0);
        if (arg1 != 1369) {
            return 27;
        }
        field1215++;
        int var3 = var2.field946;
        int var4 = var2.field934;
        int var5 = var2.field944;
        int var6 = class4.field174[var3 - var5];
        return class113.field2806[var4] >> var5 & var6;
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V", line = 320)
    public static final void method483(int arg0) {
        class39.field1061.method268((byte) 64);
        field1208++;
        class133.field3281.method268((byte) -105);
        if (arg0 <= 63) {
            field1221 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V", line = 348)
    public static final void method484(int arg0) {
        field1204++;
        if (arg0 != 2) {
            return;
        }
        while (true) {
            label286: do {
                while (class74.method688((byte) -125)) {
                    if (class132.field3230 != -1 && class132.field3230 == class132.field3218) {
                        if (class115.field2888 == 85 && class132.field3220.method10(arg0 ^ 0xFFFFF3C2) > 0) {
                            class132.field3220 = class132.field3220.method19(0, 0, class132.field3220.method10(-3136) - 1);
                        }
                        continue label286;
                    }
                    if (class37.field1002) {
                        if (class115.field2888 == 85 && class132.field3235.method10(arg0 ^ 0xFFFFF3C2) > 0) {
                            class132.field3235 = class132.field3235.method19(arg0 ^ 0x2, 0, class132.field3235.method10(arg0 - 3138) - 1);
                            class105.field2640 = true;
                        }
                        if (class2.method46((byte) 120, class117.field2923) && class132.field3235.method10(-3136) < 80) {
                            class132.field3235 = class132.field3235.method21(class117.field2923, arg0 ^ 0x2);
                            class105.field2640 = true;
                        }
                        if (class115.field2888 == 84) {
                            class37.field1002 = false;
                            class105.field2640 = true;
                            if (class78.field1927 == 1) {
                                long var10 = class132.field3235.method9((byte) 104);
                                class76.method706(var10, (byte) -99);
                            }
                            if (class78.field1927 == 2 && class59.field1495 > 0) {
                                long var12 = class132.field3235.method9((byte) 121);
                                class64.method627(var12, 123);
                            }
                            if (class78.field1927 == 3 && class132.field3235.method10(-3136) > 0) {
                                class89.field2187++;
                                class70.field1729.method416(11453, 207);
                                class70.field1729.method142(0, (byte) -128);
                                int var14 = class70.field1729.field268;
                                class70.field1729.method158(class36.field959, false);
                                class4.method106(119, class132.field3235, class70.field1729);
                                class70.field1729.method156(class70.field1729.field268 - var14, (byte) 16);
                                if (class6.field237 == 2) {
                                    class6.field237 = 1;
                                    class15.field505 = true;
                                    class74.field1814++;
                                    class70.field1729.method416(11453, 32);
                                    class70.field1729.method142(class75.field1867, (byte) -128);
                                    class70.field1729.method142(class6.field237, (byte) -128);
                                    class70.field1729.method142(class115.field2831, (byte) -128);
                                }
                            }
                            if (class78.field1927 == 4 && class85.field2149 < 100) {
                                long var15 = class132.field3235.method9((byte) 107);
                                class31.method384(arg0 ^ 0x606C, var15);
                            }
                            if (class78.field1927 == 5 && class85.field2149 > 0) {
                                long var17 = class132.field3235.method9((byte) 109);
                                class57.method547(0, var17);
                            }
                        }
                    } else if (class114.field2814 == 1) {
                        if (class115.field2888 == 85 && class132.field3213.method10(-3136) > 0) {
                            class132.field3213 = class132.field3213.method19(arg0 - 2, 0, class132.field3213.method10(-3136) - 1);
                            class105.field2640 = true;
                        }
                        if (class132.method1040(class117.field2923, -58) && class132.field3213.method10(-3136) < 10) {
                            class132.field3213 = class132.field3213.method21(class117.field2923, 0);
                            class105.field2640 = true;
                        }
                        if (class115.field2888 == 84) {
                            if (class132.field3213.method10(-3136) > 0) {
                                class8.field258++;
                                int var1 = 0;
                                if (class132.field3213.method33(arg0 + 105)) {
                                    var1 = class132.field3213.method3((byte) -34);
                                }
                                class70.field1729.method416(11453, 238);
                                class70.field1729.method183(68, var1);
                            }
                            class105.field2640 = true;
                            class114.field2814 = 0;
                        }
                    } else if (class114.field2814 == 2) {
                        if (class115.field2888 == 85 && class132.field3213.method10(arg0 ^ 0xFFFFF3C2) > 0) {
                            class132.field3213 = class132.field3213.method19(0, 0, class132.field3213.method10(-3136) - 1);
                            class105.field2640 = true;
                        }
                        if ((class114.method939((byte) -37, class117.field2923) || class117.field2923 == 32) && class132.field3213.method10(-3136) < 12) {
                            class132.field3213 = class132.field3213.method21(class117.field2923, arg0 ^ 0x2);
                            class105.field2640 = true;
                        }
                        if (class115.field2888 == 84) {
                            if (class132.field3213.method10(-3136) > 0) {
                                class2.field89++;
                                class70.field1729.method416(11453, 86);
                                class70.field1729.method158(class132.field3213.method9((byte) 89), false);
                            }
                            class114.field2814 = 0;
                            class105.field2640 = true;
                        }
                    } else if (class114.field2814 == 3) {
                        if (class115.field2888 == 85 && class132.field3213.method10(-3136) > 0) {
                            class132.field3213 = class132.field3213.method19(0, 0, class132.field3213.method10(-3136) - 1);
                            class105.field2640 = true;
                        }
                        if (class2.method46((byte) 122, class117.field2923) && class132.field3213.method10(-3136) < 40) {
                            class132.field3213 = class132.field3213.method21(class117.field2923, 0);
                            class105.field2640 = true;
                        }
                    } else if (class86.field2169 == -1 && class42.field1144 == -1) {
                        if (class115.field2888 == 85 && class132.field3226.method10(-3136) > 0) {
                            class132.field3226 = class132.field3226.method19(0, 0, class132.field3226.method10(arg0 - 3138) - 1);
                            class105.field2640 = true;
                        }
                        if (class2.method46((byte) 124, class117.field2923) && class132.field3226.method10(arg0 ^ 0xFFFFF3C2) < 80) {
                            class132.field3226 = class132.field3226.method21(class117.field2923, arg0 - 2);
                            class105.field2640 = true;
                        }
                        if (class115.field2888 == 84 && class132.field3226.method10(-3136) > 0) {
                            if (class37.field1005 == 2) {
                                if (class132.field3226.method5(class113.field2786, arg0 + 120)) {
                                    class117.method963(2578);
                                }
                                if (class132.field3226.method5(class22.field677, 122)) {
                                    class37.field1008 = true;
                                }
                                if (class132.field3226.method5(class119.field2971, 122)) {
                                    class37.field1008 = false;
                                }
                                if (class132.field3226.method5(class28.field790, arg0 ^ 0x78)) {
                                    for (int var2 = 0; var2 < 4; var2++) {
                                        for (int var3 = 1; var3 < 103; var3++) {
                                            for (int var4 = 1; var4 < 103; var4++) {
                                                class102.field2572[var2].field202[var3][var4] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class132.field3226.method5(class100.field2500, 122) && class89.field2185 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class132.field3226.method5(class6.field229, 122)) {
                                    class36.field954 = true;
                                }
                            }
                            if (class132.field3226.method26((byte) 116, class72.field1768)) {
                                class70.field1729.method416(11453, 248);
                                class70.field1729.method142(class132.field3226.method10(-3136) - 1, (byte) -128);
                                class70.field1729.method182(class132.field3226.method1((byte) 95, 2), (byte) 122);
                                class5.field201++;
                            } else {
                                byte var5 = 0;
                                class35.field938++;
                                class1 var6 = class132.field3226.method30(-128);
                                byte var7 = 0;
                                if (var6.method26((byte) 116, class97.field2394)) {
                                    var7 = 0;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class97.field2394.method10(-3136));
                                } else if (var6.method26((byte) 116, class9.field327)) {
                                    class132.field3226 = class132.field3226.method1((byte) 95, class9.field327.method10(arg0 ^ 0xFFFFF3C2));
                                    var7 = 1;
                                } else if (var6.method26((byte) 116, class2.field65)) {
                                    var7 = 2;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class2.field65.method10(-3136));
                                } else if (var6.method26((byte) 116, class92.field2299)) {
                                    var7 = 3;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class92.field2299.method10(-3136));
                                } else if (var6.method26((byte) 116, class1.field63)) {
                                    var7 = 4;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class1.field63.method10(-3136));
                                } else if (var6.method26((byte) 116, class82.field2080)) {
                                    class132.field3226 = class132.field3226.method1((byte) 95, class82.field2080.method10(-3136));
                                    var7 = 5;
                                } else if (var6.method26((byte) 116, class86.field2160)) {
                                    var7 = 6;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class86.field2160.method10(arg0 ^ 0xFFFFF3C2));
                                } else if (var6.method26((byte) 116, class76.field1888)) {
                                    var7 = 7;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class76.field1888.method10(-3136));
                                } else if (var6.method26((byte) 116, class112.field2770)) {
                                    var7 = 8;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class112.field2770.method10(-3136));
                                } else if (var6.method26((byte) 116, class102.field2586)) {
                                    var7 = 9;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class102.field2586.method10(arg0 - 3138));
                                } else if (var6.method26((byte) 116, class100.field2480)) {
                                    class132.field3226 = class132.field3226.method1((byte) 95, class100.field2480.method10(-3136));
                                    var7 = 10;
                                } else if (var6.method26((byte) 116, class103.field2601)) {
                                    class132.field3226 = class132.field3226.method1((byte) 95, class103.field2601.method10(-3136));
                                    var7 = 11;
                                }
                                class1 var8 = class132.field3226.method30(-128);
                                if (var8.method26((byte) 116, class93.field2320)) {
                                    var5 = 1;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class93.field2320.method10(arg0 - 3138));
                                } else if (var8.method26((byte) 116, class122.field3057)) {
                                    var5 = 2;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class122.field3057.method10(-3136));
                                } else if (var8.method26((byte) 116, class62.field1548)) {
                                    class132.field3226 = class132.field3226.method1((byte) 95, class62.field1548.method10(-3136));
                                    var5 = 3;
                                } else if (var8.method26((byte) 116, field1197)) {
                                    var5 = 4;
                                    class132.field3226 = class132.field3226.method1((byte) 95, field1197.method10(-3136));
                                } else if (var8.method26((byte) 116, class108.field2710)) {
                                    var5 = 5;
                                    class132.field3226 = class132.field3226.method1((byte) 95, class108.field2710.method10(-3136));
                                }
                                class70.field1729.method416(11453, 75);
                                class70.field1729.method142(0, (byte) -128);
                                int var9 = class70.field1729.field268;
                                class70.field1729.method142(var7, (byte) -128);
                                class70.field1729.method142(var5, (byte) -128);
                                class4.method106(65, class132.field3226, class70.field1729);
                                class70.field1729.method156(class70.field1729.field268 - var9, (byte) 16);
                                if (class75.field1867 == 2) {
                                    class74.field1814++;
                                    class15.field505 = true;
                                    class75.field1867 = 3;
                                    class70.field1729.method416(11453, 32);
                                    class70.field1729.method142(class75.field1867, (byte) -128);
                                    class70.field1729.method142(class6.field237, (byte) -128);
                                    class70.field1729.method142(class115.field2831, (byte) -128);
                                }
                            }
                            class105.field2640 = true;
                            class132.field3226 = class132.field3237;
                        }
                    }
                }
                return;
            } while (!class114.method939((byte) -37, class117.field2923) && class117.field2923 != 32);
            if (class132.field3220.method10(-3136) < 12) {
                class132.field3220 = class132.field3220.method21(class117.field2923, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V", line = 841)
    public static final void method485(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field1213++;
        int var1 = class37.field987;
        int var2 = class5.field220;
        int var3 = client.field580;
        int var4 = class93.field2309;
        int var5 = 6116423;
        class111.method916(var1, var3, var4, var2, var5);
        class111.method916(var1 + 1, var3 + 1, var4 - 2, 16, 0);
        class111.method925(var1 + 1, var3 + 18, var4 - 2, var2 + -19, 0);
        class116.field2905.method214(class100.field2493, var1 + 3, var3 + 14, var5);
        int var6 = class24.field742;
        int var7 = class102.field2571;
        if (class19.field641 == 0) {
            var6 -= 4;
            var7 -= 4;
        }
        if (class19.field641 == 1) {
            var7 -= 205;
            var6 -= 553;
        }
        if (class19.field641 == 2) {
            var7 -= 357;
            var6 -= 17;
        }
        for (int var8 = 0; var8 < class42.field1105; var8++) {
            int var9 = (class42.field1105 - var8 - 1) * 15 + var3 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var1 + var4 > var6 && var7 > var9 - 13 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class116.field2905.method207(class102.field2589[var8], var1 + 3, var9, var10, true);
        }
    }
}
