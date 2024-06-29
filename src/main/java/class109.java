import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class109 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "[F")
    public static float[] field1285 = new float[4];

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 3)
    public static final void method591(int arg0) {
        field1286++;
        if (arg0 != -256) {
            method591(-22);
        }
        int var1 = class426.field5750;
        int[] var2 = class586.field8104;
        for (int var3 = 0; var3 < var1; var3++) {
            class573 var4 = class513.field7145[var2[var3]];
            if (var4 != null) {
                class665.method3791(var4, var4.method1435((byte) 124), arg0 ^ 0xFFFFE700);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 33)
    public static final String method592(int arg0, int arg1, byte[] arg2, int arg3) {
        field1284++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg0 + arg3;
        if (arg1 >= -102) {
            method594(-84);
        }
        for (int var7 = arg0; var7 < var6; var7++) {
            int var8 = arg2[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 >= 224) {
                if (var8 >= 240) {
                    if (var8 >= 244) {
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                    }
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                }
                if (var6 <= var7 + 2) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg2[var7] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var7++;
                int var10 = arg2[var7] & 0xFF;
                if (var10 < 128 || var10 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class665.method3789(class665.method3789(class15.method97(var9, -129) << 6, class15.method97(var8 << 12, -921600)), class15.method97(var10, -129));
            } else if (var6 > var7 + 1) {
                var7++;
                int var11 = arg2[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class665.method3789(class15.method97(-129, var11), class15.method97(var8, -193) << 6);
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILua;IIIBLwv;Lr;)V", line = 119)
    public static final void method593(int arg0, int arg1, class596 arg2, int arg3, int arg4, int arg5, byte arg6, class423 arg7, class562 arg8) {
        if (arg6 != -127) {
            return;
        }
        field1288++;
        class83 var9 = class506.field6989.method2158(arg0, (byte) -121);
        if (var9 == null || !var9.field963 || !var9.method445(true, class564.field7696)) {
            return;
        }
        if (var9.field975 != null) {
            int[] var10 = new int[var9.field975.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class311.field4200 == 4) {
                    var13 = (int) class565.field7707 & 0x3FFF;
                } else {
                    var13 = (int) class565.field7707 + class478.field6651 & 0x3FFF;
                }
                int var14 = class240.field3176[var13];
                int var15 = class240.field3177[var13];
                if (class311.field4200 != 4) {
                    var15 = var15 * 256 / (class424.field5716 + 256);
                    var14 = var14 * 256 / (class424.field5716 + 256);
                }
                var10[var11 * 2] = ((var9.field975[var11 * 2] * 4 + arg5) * var15 + (var9.field975[var11 * 2 + 1] * 4 + arg3) * var14 >> 14) + arg7.field5561 / 2 + arg1;
                var10[var11 * 2 + 1] = arg7.field5672 / 2 + arg4 - ((arg3 + (var9.field975[var11 * 2 + 1] * 4)) * var15 - (var9.field975[var11 * 2] * 4 + arg5) * var14 >> 14);
            }
            class44.method238(arg8, var10, var9.field986, arg7.field5569, arg7.field5622);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg8.method1055(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field988, 1, arg2, arg1, arg4);
            }
            arg8.method1055(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field988, 1, arg2, arg1, arg4);
        }
        class532 var16 = null;
        if (var9.field999 != -1) {
            var16 = var9.method442(arg8, false, (byte) 106);
            if (var16 != null) {
                class27.method160(arg4, arg3, arg7, arg2, (byte) 105, arg5, arg1, var16);
            }
        }
        if (var9.field1003 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method529();
        }
        class409 var18 = class399.field5300;
        class658 var19 = class671.field9544;
        if (var9.field989 == 1) {
            var19 = class325.field4382;
            var18 = class401.field5319;
        }
        if (var9.field989 == 2) {
            var19 = class254.field3332;
            var18 = class622.field8625;
        }
        class534.method3000(arg4, arg2, arg5, var9.field1003, var18, arg7, arg3, arg1, 256, var9.field981, var17, var19);
        return;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 224)
    public static void method594(int arg0) {
        field1285 = null;
        if (arg0 != 2) {
            method593(62, 1, null, 64, 79, 86, (byte) -20, null, null);
        }
    }
}
