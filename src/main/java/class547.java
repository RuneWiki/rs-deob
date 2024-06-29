import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class547 {

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public int field8169;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8171 = new String[] { method4129(method4128("F\u001d\u0011MgF\u001dKO&")), method4129(method4128("F\u0001S\u001d")), method4129(method4128("SZ\u0011_s")), method4129(method4128("F\u001d\u00110&")), method4129(method4128("F\u001d\u00112&")), method4129(method4128("F\u001d\u0011\u0005a{\u0000M\u0018`O\\")), method4129(method4128("F\u001d\u00114&")), method4129(method4128("F\u001d\u00115&")), method4129(method4128("F\u001d\u00117&")), method4129(method4128("F\u001d\u00113&")) };

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[I")
    public static int[] field8161 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field8162 = -1;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field8168 = 0;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "[I")
    public static int[] field8160 = new int[14];

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)I", line = 3)
    public final int method4122(byte arg0) {
        try {
            field8164++;
            return arg0 < 46 ? -107 : this.field8169;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8171[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILcn;ZII)V", line = 18)
    public static final void method4123(int arg0, class541 arg1, boolean arg2, int arg3, int arg4) {
        try {
            field8166++;
            int var5 = arg1.field8029;
            int var6 = arg1.field8045;
            if (arg1.field7991 == 0) {
                arg1.field8029 = arg1.field8097;
            } else if (arg1.field7991 == 1) {
                arg1.field8029 = arg0 - arg1.field8097;
            } else if (arg1.field7991 == 2) {
                arg1.field8029 = arg1.field8097 * arg0 >> 14;
            }
            if (arg1.field8099 == 0) {
                arg1.field8045 = arg1.field8028;
            } else if (arg1.field8099 == 1) {
                arg1.field8045 = arg4 - arg1.field8028;
            } else if (arg1.field8099 == 2) {
                arg1.field8045 = arg1.field8028 * arg4 >> 14;
            }
            if (arg1.field7991 == 4) {
                arg1.field8029 = arg1.field8045 * arg1.field8030 / arg1.field8031;
            }
            if (arg1.field8099 == 4) {
                arg1.field8045 = arg1.field8031 * arg1.field8029 / arg1.field8030;
            }
            if (class90.field1028 && (client.method2670(arg1).field6808 != 0 || arg1.field8042 == 0)) {
                if (arg1.field8045 < 5 && arg1.field8029 < 5) {
                    arg1.field8045 = 5;
                    arg1.field8029 = 5;
                } else {
                    if (arg1.field8045 <= 0) {
                        arg1.field8045 = 5;
                    }
                    if (arg1.field8029 <= 0) {
                        arg1.field8029 = 5;
                    }
                }
            }
            if (arg3 != -2) {
                field8162 = -70;
            }
            if (class768.field11116 == arg1.field8002) {
                class647.field9375 = arg1;
            }
            if (arg2 && arg1.field8070 != null && arg1.field8029 != var5 || arg1.field8045 != var6) {
                class86 var7 = new class86();
                var7.field959 = arg1;
                var7.field957 = arg1.field8070;
                class749.field10905.method3868(122, var7);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8171[4] + arg0 + ',' + (arg1 == null ? field8171[1] : field8171[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Lfe;", line = 97)
    public static final class596 method4124(int arg0) {
        try {
            field8170++;
            if (arg0 < 11) {
                field8168 = 104;
            }
            return class83.method710(1, (byte) -93);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8171[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIB)Z", line = 112)
    public static final boolean method4125(int arg0, int arg1, byte arg2) {
        try {
            field8165++;
            if (!class434.method3319(arg0, arg1, 81)) {
                return false;
            } else if ((arg0 & 0xB000) != 0 | class118.method1037(arg0, (byte) 29, arg1) | class551.method4147((byte) 101, arg1, arg0)) {
                return true;
            } else {
                int var3 = -19 % ((arg2 - 54) / 48);
                return (class487.method3700(arg1, (byte) 103, arg0) | class339.method2822(arg1, arg0, 2)) & (arg1 & 0x37) == 0;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8171[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "toString", descriptor = "()Ljava/lang/String;", line = 131)
    public final String toString() {
        try {
            field8167++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8171[5] + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 143)
    public static void method4126(int arg0) {
        try {
            field8161 = null;
            field8160 = null;
            if (arg0 != -816252050) {
                method4124(-89);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8171[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lub;I)V", line = 156)
    public static final void method4127(class22 arg0, int arg1) {
        try {
            if (arg1 != 16) {
                field8160 = null;
            }
            for (int var2 = 0; var2 < class426.field6270; var2++) {
                int var3 = class732.field10622[var2];
                class726 var4 = class197.field2685[var3];
                int var5 = arg0.method1455((byte) 62);
                if ((var5 & 0x4) != 0) {
                    var5 += arg0.method1455((byte) 62) << 8;
                }
                if ((var5 & 0x2000) != 0) {
                    var5 += arg0.method1455((byte) 62) << 16;
                }
                class140.method1199(var4, -1, arg0, var5, var3);
            }
            field8163++;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field8171[8] + (arg0 == null ? field8171[1] : field8171[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 187)
    public class547(String arg0, int arg1) {
        try {
            this.field8169 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8171[0] + (arg0 == null ? field8171[1] : field8171[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4128(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xE);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4129(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
