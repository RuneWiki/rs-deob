import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class296 {

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public int field4421 = -1;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public int field4423 = -1;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Z")
    public static boolean field4429 = false;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "[I")
    public int[] field4427;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "[Lsv;")
    public static class478[] field4431;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZ)I")
    public static final int method1900(int arg0, boolean arg1) {
        field4428++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        if (arg1) {
            field4429 = true;
        }
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "([BZII)Ljava/lang/String;")
    public static final String method1901(byte[] arg0, boolean arg1, int arg2, int arg3) {
        field4426++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg2 + arg3;
        int var7 = arg2;
        if (!arg1) {
            method1904(34);
        }
        while (var6 > var7) {
            int var8 = arg0[var7] & 0xFF;
            if (var8 >= 128) {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 >= 224) {
                    label70: {
                        if (var8 >= 240) {
                            if (var8 >= 244) {
                                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                            }
                            throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                        }
                        if (var7 + 2 >= var6) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        var7++;
                        int var9 = arg0[var7] & 0xFF;
                        if (var9 >= 128 && var9 <= 191) {
                            var7++;
                            int var10 = arg0[var7] & 0xFF;
                            if (var10 >= 128 && var10 <= 191) {
                                var4[var5++] = (char) class442.method2600(class168.method1203(var10, -129), class442.method2600(class168.method1203(var8, -225) << 12, class168.method1203(-129, var9) << 6));
                                break label70;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                } else if (var6 > (var7 + 1)) {
                    var7++;
                    int var11 = arg0[var7] & 0xFF;
                    if (var11 < 128 || var11 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class442.method2600(class168.method1203(-129, var11), class168.method1203(-12352, var8 << 6));
                } else {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
            } else {
                var4[var5++] = (char) var8;
            }
            var7++;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILwn;I)V")
    private final void method1902(int arg0, class519 arg1, int arg2) {
        if (arg0 < 43) {
            method1900(99, true);
        }
        if (arg2 == 1) {
            this.field4421 = arg1.method3018(566990904);
        } else if (arg2 == 2) {
            this.field4427 = new int[arg1.method3072((byte) -120)];
            for (int var4 = 0; var4 < this.field4427.length; var4++) {
                this.field4427[var4] = arg1.method3018(566990904);
            }
        } else if (arg2 == 3) {
            this.field4423 = arg1.method3072((byte) -121);
        }
        field4420++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
    public static final void method1903(boolean arg0) {
        field4430++;
        class275.method1776(-30196, arg0);
        if (class544.field7985 >= 0 && class544.field7985 != 0) {
            class322.method2063(class544.field7985, -122);
            class544.field7985 = -1;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public static final void method1904(int arg0) {
        class174.field2601 = 0;
        field4422++;
        int var1 = (class364.field5293.field6961 >> 7) + class82.field1315;
        int var2 = (class364.field5293.field6965 >> 7) + class501.field7240;
        if (arg0 != 3156) {
            field4429 = false;
        }
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class174.field2601 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class174.field2601 = 1;
        }
        if (class174.field2601 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class174.field2601 = 0;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)I")
    public static final int method1905(byte arg0, int arg1) {
        if (arg0 > -74) {
            return 89;
        } else {
            field4424++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BII[Ljava/lang/Object;[J)V")
    public static final void method1906(byte arg0, int arg1, int arg2, Object[] arg3, long[] arg4) {
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg2; var11++) {
                if (arg4[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    Object var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var9;
            method1906((byte) 126, arg1, var6 - 1, arg3, arg4);
            method1906((byte) 127, var6 + 1, arg2, arg3, arg4);
        }
        field4432++;
        if (arg0 <= 124) {
            method1905((byte) -63, -72);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lwn;I)V")
    public final void method1907(class519 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3072((byte) -121);
            if (var3 == 0) {
                field4425++;
                if (arg1 != -2905) {
                    this.field4427 = null;
                    return;
                }
                return;
            }
            this.method1902(91, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
    public static void method1908(byte arg0) {
        field4431 = null;
        if (arg0 <= 29) {
            field4431 = null;
        }
    }
}
