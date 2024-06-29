import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class85 extends class385 {

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1191;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "[I")
    public static int[] field1195 = new int[4096];

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "Lwp;")
    public static class453 field1196;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "Lpl;")
    public static class612 field1197;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1195[var0] = class551.method3044(var0, false);
        }
        field1196 = new class453(105, 14);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZZI)Ljava/lang/String;", line = 3)
    public static final String method485(int arg0, boolean arg1, boolean arg2, int arg3) {
        field1192++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg3 >= 0) {
            int var4 = 2;
            for (int var5 = arg3 / arg0; var5 != 0; var5 /= arg0) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg2) {
                method490(-68L, -123);
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg0;
                int var9 = var8 - (arg0 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V", line = 51)
    public final void method486(byte arg0) {
        this.field1191.method3415();
        field1194++;
        if (arg0 > -77) {
            field1195 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 63)
    public static void method487(int arg0) {
        field1197 = null;
        field1195 = null;
        int var1 = 53 / ((80 - arg0) / 45);
        field1196 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[B)Ljava/lang/String;", line = 74)
    public static final String method488(int arg0, byte[] arg1) {
        field1190++;
        int var2 = arg1.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -129) {
            field1196 = null;
        }
        while (var5 < var2) {
            int var6 = arg1[var5] & 0xFF;
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 < 224) {
                    if (var5 + 1 >= var2) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var7 = arg1[var5] & 0xFF;
                    if (var7 < 128 || var7 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class444.method2376(class695.method3921(-193, var6) << 6, class695.method3921(-129, var7));
                } else {
                    label71: {
                        if (var6 >= 240) {
                            if (var6 < 244) {
                                throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                            }
                            throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                        }
                        if (var5 + 2 >= var2) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        var5++;
                        int var8 = arg1[var5] & 0xFF;
                        if (var8 >= 128 && var8 <= 191) {
                            var5++;
                            int var9 = arg1[var5] & 0xFF;
                            if (var9 >= 128 && var9 <= 191) {
                                var3[var4++] = (char) class444.method2376(class695.method3921(-129, var9), class444.method2376(class695.method3921(var6, -225) << 12, class695.method3921(var8 << 6, -8256)));
                                break label71;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                }
            } else {
                var3[var4++] = (char) var6;
            }
            var5++;
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V", line = 149)
    public static final void method489(byte arg0) {
        class253.method1483(57, false);
        field1193++;
        if (arg0 == -58 && class517.field7071 >= 0 && class517.field7071 != 0) {
            class393.method2111(class517.field7071, true);
            class517.field7071 = -1;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V", line = 167)
    public class85(int arg0) {
        this.field1191 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 176)
    public static final String method490(long arg0, int arg1) {
        field1198++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else if (arg1 < 37) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class491.field6484[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}
