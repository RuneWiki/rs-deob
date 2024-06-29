import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class601 {

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "Lqha;")
    private class112 field8820 = new class112(256);

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "Lqha;")
    private class112 field8824 = new class112(256);

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "Lla;")
    private class476 field8819;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "Lla;")
    private class476 field8822;

    @OriginalMember(owner = "client!fia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8826 = new String[] { method4470(method4469("\\U\u0005W$")), method4470(method4469("A\u0012JW\u001f\u000f")), method4470(method4469("I\u000eG\u0015")), method4470(method4469("A\u0012JW\u001d\u000f")), method4470(method4469("A\u0012JW\u001b\u000f")), method4470(method4469("A\u0012JW\u0018\u000f")), method4470(method4469("A\u0012JW\u001a\u000f")), method4470(method4469("A\u0012JWeN\u0015B\rg\u000f")), method4470(method4469("A\u0012JW\u001e\u000f")), method4470(method4469("A\u0012JW\u001c\u000f")) };

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "Lwq;")
    public static class178 field8821 = new class178(3000000, 200);

    @OriginalMember(owner = "client!fia", name = "k", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!fia", name = "l", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!fia", name = "j", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(II[II)Lps;", line = 22)
    private final class105 method4462(int arg0, int arg1, int[] arg2, int arg3) {
        try {
            field8814++;
            if (arg3 != 256) {
                return null;
            }
            int var5 = (arg0 << 4 & 0xFFFD | arg0 >>> 12) ^ arg1;
            int var6 = var5 | arg0 << 16;
            long var7 = (long) var6 ^ 0x100000000L;
            class105 var9 = (class105) this.field8824.method977(var7, 1);
            if (var9 != null) {
                return var9;
            } else if (arg2 == null || arg2[0] > 0) {
                class438 var10 = (class438) this.field8820.method977(var7, 1);
                if (var10 == null) {
                    var10 = class438.method3371(this.field8819, arg0, arg1);
                    if (var10 == null) {
                        return null;
                    }
                    this.field8820.method968((byte) -111, var7, var10);
                }
                class105 var11 = var10.method3366(arg2);
                if (var11 == null) {
                    return null;
                } else {
                    var10.method1824(1);
                    this.field8824.method968((byte) -111, var7, var11);
                    return var11;
                }
            } else {
                return null;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field8826[9] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8826[2] : field8826[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I[IB)Lps;", line = 66)
    public final class105 method4463(int arg0, int[] arg1, byte arg2) {
        try {
            field8816++;
            if (this.field8819.method3629((byte) 18) == 1) {
                return this.method4462(0, arg0, arg1, 256);
            }
            if (arg2 != -79) {
                method4465(51, 119, (byte) -27, 25);
            }
            if (this.field8819.method3646(arg0, (byte) -54) != 1) {
                throw new RuntimeException();
            }
            return this.method4462(arg0, 0, arg1, 256);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8826[4] + arg0 + ',' + (arg1 == null ? field8826[2] : field8826[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V", line = 86)
    public static void method4464(int arg0) {
        try {
            if (arg0 != -1782698960) {
                field8825 = 30;
            }
            field8821 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8826[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lla;Lla;)V", line = 195)
    public class601(class476 arg0, class476 arg1) {
        try {
            this.field8819 = arg1;
            this.field8822 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8826[7] + (arg0 == null ? field8826[2] : field8826[0]) + ',' + (arg1 == null ? field8826[2] : field8826[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIBI)V", line = 101)
    public static final void method4465(int arg0, int arg1, byte arg2, int arg3) {
        try {
            field8818++;
            if (arg2 != 71) {
                method4464(-127);
            }
            class184.field2545 = new byte[arg1][arg0][arg3];
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8826[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 112)
    public static final String method4466(int arg0, String[] arg1, int arg2, int arg3) {
        try {
            field8817++;
            if (arg3 == 0) {
                return "";
            } else if (arg3 == 1) {
                String var4 = arg1[arg0];
                return var4 == null ? field8826[2] : var4.toString();
            } else {
                int var5 = arg3 + arg0;
                int var6 = 0;
                for (int var7 = arg0; var7 < var5; var7++) {
                    String var8 = arg1[var7];
                    if (var8 == null) {
                        var6 += 4;
                    } else {
                        var6 += var8.length();
                    }
                }
                StringBuffer var9 = new StringBuffer(var6);
                if (arg2 != 6960) {
                    field8825 = 11;
                }
                for (int var10 = arg0; var10 < var5; var10++) {
                    String var11 = arg1[var10];
                    if (var11 == null) {
                        var9.append(field8826[2]);
                    } else {
                        var9.append(var11);
                    }
                }
                return var9.toString();
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field8826[8] + arg0 + ',' + (arg1 == null ? field8826[2] : field8826[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I[II)Lps;", line = 173)
    public final class105 method4467(int arg0, int[] arg1, int arg2) {
        try {
            if (arg2 != 8731) {
                this.method4462(63, -64, null, 63);
            }
            field8823++;
            if (this.field8822.method3629((byte) 18) == 1) {
                return this.method4468(arg0, 0, arg1, arg2 - 8731);
            } else if (this.field8822.method3646(arg0, (byte) -122) == 1) {
                return this.method4468(0, arg0, arg1, arg2 ^ 0x221B);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8826[6] + arg0 + ',' + (arg1 == null ? field8826[2] : field8826[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(II[II)Lps;", line = 204)
    private final class105 method4468(int arg0, int arg1, int[] arg2, int arg3) {
        try {
            field8815++;
            int var5 = arg0 ^ ((arg1 & 0x60000FFF) << 4 | arg1 >>> 12);
            int var6 = var5 | arg1 << 16;
            long var7 = (long) var6;
            class105 var9 = (class105) this.field8824.method977(var7, 1);
            if (var9 != null) {
                return var9;
            } else if (arg2 == null || arg2[0] > 0) {
                class395 var10 = class395.method3125(this.field8822, arg1, arg0);
                if (arg3 != 0) {
                    return null;
                } else if (var10 == null) {
                    return null;
                } else {
                    class105 var11 = var10.method3127();
                    this.field8824.method968((byte) -111, var7, var11);
                    if (arg2 != null) {
                        arg2[0] -= var11.field1217.length;
                    }
                    return var11;
                }
            } else {
                return null;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field8826[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8826[2] : field8826[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4469(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4470(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
