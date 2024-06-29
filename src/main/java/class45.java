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

@OriginalClass("client!hc")
public class class45 extends class69 {

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "[I")
    public int[] field1072 = new int[5];

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public int field1091 = 0;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "[Lvc;")
    public class125[] field1092 = new class125[5];

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "Lmc;")
    public static class75 field1076 = class30.method234(true, "::");

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "Lkc;")
    public static class63 field1094 = new class63(500);

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lmc;")
    public static class75 field1097 = class30.method234(true, "Offline");

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "Lmc;")
    private static class75 field1099 = class30.method234(true, " from your friend list first");

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "[I")
    public static int[] field1107 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field1104 = 0;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "[I")
    public static int[] field1100 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lmc;")
    public static class75 field1106 = field1099;

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "Lmc;")
    private static class75 field1109 = class30.method234(true, "shake:");

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "Lmc;")
    private static class75 field1103 = class30.method234(true, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "Lmc;")
    public static class75 field1102 = field1103;

    @OriginalMember(owner = "client!hc", name = "nb", descriptor = "Lmc;")
    public static class75 field1112 = field1109;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lmc;")
    public static class75 field1108 = class30.method234(true, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!hc", name = "mb", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "Lwd;")
    public class131 field1075;

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "Le;")
    public class25 field1105;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Lgb;")
    public class39 field1096;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "Lab;")
    public class3 field1090;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "Lhc;")
    public class45 field1089;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "Ln;")
    public class78 field1095;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "Lp;")
    public static class90 field1101;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Lpb;")
    public static class92 field1074;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "Lqb;")
    public class98 field1070;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "Z")
    public boolean field1069;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "Z")
    public boolean field1071;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "Z")
    public boolean field1083;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lib;B)V", line = 3)
    public static final void method344(class50 arg0, byte arg1) {
        arg0.field1219 = arg0.field1223;
        field1093++;
        if (arg0.field1267 == 0) {
            arg0.field1256 = 0;
            return;
        }
        if (arg0.field1265 != -1 && arg0.field1227 == 0) {
            class107 var2 = class37.method289(arg0.field1265, (byte) -128);
            if (arg0.field1226 > 0 && var2.field2674 == 0) {
                arg0.field1256++;
                return;
            }
            if (arg0.field1226 <= 0 && var2.field2688 == 0) {
                arg0.field1256++;
                return;
            }
        }
        int var3 = arg0.field1233;
        int var4 = arg0.field1242;
        if (arg1 > -35) {
            field1111 = -114;
        }
        int var5 = arg0.field1236[arg0.field1267 - 1] * 128 + arg0.field1263 * 64;
        int var6 = arg0.field1270[arg0.field1267 - 1] * 128 + arg0.field1263 * 64;
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg0.field1233 = var6;
            arg0.field1242 = var5;
            return;
        }
        int var7 = 4;
        int var8 = arg0.field1211;
        if (var6 <= var3) {
            if (var6 < var3) {
                if (var4 < var5) {
                    arg0.field1271 = 768;
                } else if (var4 > var5) {
                    arg0.field1271 = 256;
                } else {
                    arg0.field1271 = 512;
                }
            } else if (var4 < var5) {
                arg0.field1271 = 1024;
            } else if (var5 < var4) {
                arg0.field1271 = 0;
            }
        } else if (var4 < var5) {
            arg0.field1271 = 1280;
        } else if (var4 <= var5) {
            arg0.field1271 = 1536;
        } else {
            arg0.field1271 = 1792;
        }
        int var9 = arg0.field1271 - arg0.field1220 & 0x7FF;
        if (arg0.field1271 != arg0.field1220 && arg0.field1252 == -1 && arg0.field1234 != 0) {
            var7 = 2;
        }
        if (arg0.field1267 > 2) {
            var7 = 6;
        }
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (arg0.field1267 > 3) {
            var7 = 8;
        }
        if (var9 >= -256 && var9 <= 256) {
            var8 = arg0.field1235;
        } else if (var9 >= 256 && var9 < 768) {
            var8 = arg0.field1204;
        } else if (var9 >= -768 && var9 <= -256) {
            var8 = arg0.field1217;
        }
        if (arg0.field1256 > 0 && arg0.field1267 > 1) {
            arg0.field1256--;
            var7 = 8;
        }
        if (var8 == -1) {
            var8 = arg0.field1235;
        }
        arg0.field1219 = var8;
        if (arg0.field1206[arg0.field1267 - 1]) {
            var7 <<= 0x1;
        }
        if (var7 >= 8 && arg0.field1235 == arg0.field1219 && arg0.field1254 != -1) {
            arg0.field1219 = arg0.field1254;
        }
        if (var3 < var6) {
            arg0.field1233 += var7;
            if (var6 < arg0.field1233) {
                arg0.field1233 = var6;
            }
        } else if (var6 < var3) {
            arg0.field1233 -= var7;
            if (arg0.field1233 < var6) {
                arg0.field1233 = var6;
            }
        }
        if (var4 < var5) {
            arg0.field1242 += var7;
            if (arg0.field1242 > var5) {
                arg0.field1242 = var5;
            }
        } else if (var4 > var5) {
            arg0.field1242 -= var7;
            if (var5 > arg0.field1242) {
                arg0.field1242 = var5;
            }
        }
        if (arg0.field1233 != var6 || arg0.field1242 != var5) {
            return;
        }
        arg0.field1267--;
        if (arg0.field1226 > 0) {
            arg0.field1226--;
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(III)V", line = 185)
    public class45(int arg0, int arg1, int arg2) {
        this.field1080 = arg2;
        this.field1078 = arg1;
        this.field1087 = this.field1110 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lmc;", line = 202)
    public static final class75 method345(int arg0, int arg1) {
        if (arg0 == 22978) {
            field1081++;
            return class118.method941(10, false, -126, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Loa;II)V", line = 229)
    public static final void method346(class85 arg0, int arg1, int arg2) {
        field1082++;
        if (arg1 != 3132) {
            method345(77, 4);
        }
        while (true) {
            class35 var3 = (class35) class58.field1457.method248(32);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field842; var5++) {
                if (var3.field823[var5] != null) {
                    if (var3.field823[var5].field2964 == 2) {
                        var3.field846[var5] = -5;
                    }
                    if (var3.field823[var5].field2964 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field834[var5] != null) {
                    if (var3.field834[var5].field2964 == 2) {
                        var3.field846[var5] = -6;
                    }
                    if (var3.field834[var5].field2964 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method707(51, arg2);
            arg0.method493((byte) 88, 0);
            int var6 = arg0.field1556;
            arg0.method526(var3.field852, (byte) 7);
            for (int var7 = 0; var7 < var3.field842; var7++) {
                if (var3.field846[var7] == 0) {
                    try {
                        int var8 = var3.field825[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field823[var7].field2959;
                            int var13 = var12.getInt(null);
                            arg0.method493((byte) 88, 0);
                            arg0.method526(var13, (byte) 7);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field823[var7].field2959;
                            var11.setInt(null, var3.field838[var7]);
                            arg0.method493((byte) 88, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field823[var7].field2959;
                            int var10 = var9.getModifiers();
                            arg0.method493((byte) 88, 0);
                            arg0.method526(var10, (byte) 7);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field834[var7].field2959;
                            byte[][] var15 = var3.field820[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg0.method493((byte) 88, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method493((byte) 88, 1);
                                arg0.method501((byte) 127, ((Number) var19).longValue());
                            } else if (var19 instanceof class75) {
                                arg0.method493((byte) 88, 2);
                                arg0.method512(255, (class75) var19);
                            } else {
                                arg0.method493((byte) 88, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field834[var7].field2959;
                            int var21 = var20.getModifiers();
                            arg0.method493((byte) 88, 0);
                            arg0.method526(var21, (byte) 7);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method493((byte) 88, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method493((byte) 88, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method493((byte) 88, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method493((byte) 88, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method493((byte) 88, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method493((byte) 88, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method493((byte) 88, -16);
                    } catch (SecurityException var29) {
                        arg0.method493((byte) 88, -17);
                    } catch (IOException var30) {
                        arg0.method493((byte) 88, -18);
                    } catch (NullPointerException var31) {
                        arg0.method493((byte) 88, -19);
                    } catch (Exception var32) {
                        arg0.method493((byte) 88, -20);
                    } catch (Throwable var33) {
                        arg0.method493((byte) 88, -21);
                    }
                } else {
                    arg0.method493((byte) 88, var3.field846[var7]);
                }
            }
            arg0.method492(var6, false);
            arg0.method538(arg1 - 3128, arg0.field1556 - var6);
            var3.method589(true);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V", line = 429)
    public static void method347(int arg0) {
        field1099 = null;
        field1101 = null;
        field1106 = null;
        field1076 = null;
        field1100 = null;
        field1103 = null;
        if (arg0 != -18) {
            return;
        }
        field1112 = null;
        field1094 = null;
        field1107 = null;
        field1108 = null;
        field1102 = null;
        field1109 = null;
        field1074 = null;
        field1097 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIILqc;III)V", line = 477)
    public static final void method348(int arg0, int arg1, int arg2, int arg3, int arg4, class99 arg5, int arg6, int arg7, int arg8) {
        if (class35.field821) {
            class129.field3144 = 32;
        } else {
            class129.field3144 = 0;
        }
        class35.field821 = false;
        if (arg4 != 8) {
            method348(-124, -125, -85, -38, 68, null, 122, 1, -47);
        }
        field1079++;
        if (arg1 >= arg0 && arg0 + 16 > arg1 && arg2 >= arg8 && arg8 + 16 > arg2) {
            if (arg6 == 1) {
                class108.field2743 = true;
            }
            arg5.field2493 -= class28.field600 * 4;
            if (arg6 == 2 || arg6 == 3) {
                class35.field841 = true;
            }
        } else if (arg0 <= arg1 && arg1 < arg0 + 16 && arg7 + arg8 - 16 <= arg2 && arg8 + arg7 > arg2) {
            arg5.field2493 += class28.field600 * 4;
            if (arg6 == 2 || arg6 == 3) {
                class35.field841 = true;
            }
            if (arg6 == 1) {
                class108.field2743 = true;
                return;
            }
        } else if (arg0 - class129.field3144 <= arg1 && arg0 + class129.field3144 + 16 > arg1 && arg8 + 16 <= arg2 && arg2 < arg8 + arg7 - 16 && class28.field600 > 0) {
            if (arg6 == 2 || arg6 == 3) {
                class35.field841 = true;
            }
            if (arg6 == 1) {
                class108.field2743 = true;
            }
            int var9 = (arg7 - 32) * arg7 / arg3;
            class35.field821 = true;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg2 - var9 / 2 - arg8 - 16;
            int var11 = arg7 - var9 - 32;
            arg5.field2493 = (arg3 - arg7) * var10 / var11;
        } else {
            return;
        }
    }
}
