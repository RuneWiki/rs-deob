import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class295 extends class568 implements class394 {

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field4817 = new String[] { method2551(method2550("m\u0005\u00153E")), method2551(method2550("m\u0005\u00151E")), method2551(method2550("m\u0005\u0015=E")), method2551(method2550("m\u0005\u0015<E")), method2551(method2550("m\u0005\u0015?E")), method2551(method2550("m\u0005\u00158E")), method2551(method2550("m\u0005\u00159E")), method2551(method2550("}O\u0015T\u0010")), method2551(method2550("h\u0014W\u0016")), method2551(method2550("m\u0005\u0015>E")), method2551(method2550("m\u0005\u00152E")), method2551(method2550("m\u0005\u00150E")), method2551(method2550("m\u0005\u0015;E")) };

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "C")
    public char field4802;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public int field4812;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "J")
    public long field4803;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Lhg;")
    public static class722 field4813;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[BI)I", line = 3)
    public static final int method2539(int arg0, int arg1, byte[] arg2, int arg3) {
        try {
            if (arg0 != 1) {
                field4813 = null;
            }
            field4810++;
            int var4 = -1;
            for (int var5 = arg1; var5 < arg3; var5++) {
                var4 = class433.field6794[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4817[9] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4817[8] : field4817[7]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)V", line = 26)
    public static final void method2540(int arg0) {
        try {
            for (class59 var1 = (class59) class439.field6858.method3228(11); var1 != null; var1 = (class59) class439.field6858.method3216(true)) {
                if (class545.method4048(var1.field773, 9)) {
                    class697.method5065(var1, 41);
                }
            }
            if (arg0 <= -13) {
                field4806++;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4817[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)C", line = 47)
    public final char method2541(int arg0) {
        try {
            if (arg0 != -29008) {
                this.method2547(37);
            }
            field4801++;
            return this.field4802;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4817[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)J", line = 62)
    public final long method2542(int arg0) {
        try {
            if (arg0 != -15652) {
                this.method2542(122);
            }
            field4815++;
            return this.field4803;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4817[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I", line = 73)
    public final int method2543(int arg0) {
        try {
            if (arg0 == 6191) {
                field4809++;
                return this.field4812;
            } else {
                return 67;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4817[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 86)
    public static void method2544(boolean arg0) {
        try {
            if (arg0) {
                field4813 = null;
            }
            field4813 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4817[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I", line = 99)
    public final int method2545(int arg0) {
        try {
            if (arg0 == -24029) {
                field4808++;
                return this.field4811;
            } else {
                return -103;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4817[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)Lsg;", line = 113)
    public static final class420 method2546(int arg0) {
        try {
            field4807++;
            if (class770.field11260 == null || class358.field5764 == null) {
                return null;
            } else if (arg0 == -1) {
                for (class420 var1 = (class420) class358.field5764.method4201((byte) 112); var1 != null; var1 = (class420) class358.field5764.method4201((byte) 112)) {
                    class209 var2 = class770.field11257.method2325(-2, var1.field6636);
                    if (var2 != null && var2.field3270 && var2.method1884(class770.field11252, false)) {
                        return var1;
                    }
                }
                return null;
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4817[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I", line = 142)
    public final int method2547(int arg0) {
        try {
            if (arg0 != -14517) {
                this.method2545(59);
            }
            field4804++;
            return this.field4805;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4817[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)I", line = 157)
    public static final int method2548(boolean arg0, int arg1) {
        try {
            if (arg1 != -1) {
                method2539(-21, 21, null, 59);
            }
            field4814++;
            int var2 = class184.field2931;
            if (var2 == 0) {
                return arg0 ? 0 : class776.field11329;
            } else if (var2 == 1) {
                return class776.field11329;
            } else if (var2 == 2) {
                return 0;
            } else {
                return 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4817[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)V", line = 200)
    public static final void method2549(boolean arg0, int arg1) {
        try {
            field4816++;
            int var2 = -23 % ((-arg1 - 6) / 53);
            if (arg0) {
                if (class317.field5175 != -1) {
                    class309.method2650((byte) -120, class317.field5175);
                }
                for (class23 var3 = (class23) class632.field9082.method735(0); var3 != null; var3 = (class23) class632.field9082.method734((byte) -50)) {
                    if (!var3.method4170(-103)) {
                        var3 = (class23) class632.field9082.method735(0);
                        if (var3 == null) {
                            break;
                        }
                    }
                    class52.method541(false, var3, true, (byte) -55);
                }
                class317.field5175 = -1;
                class632.field9082 = new class69(8);
                class791.method5692(64);
                class317.field5175 = class586.field8498;
                class210.method1900(false, (byte) -107);
                class30.method318(-71);
                class598.method4384(class317.field5175);
            }
            class237.field3642 = true;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4817[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2550(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2551(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
