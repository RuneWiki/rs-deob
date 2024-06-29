import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class540 {

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "Lcja;")
    public class46 field7916 = new class46();

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7927 = new String[] { method4074(method4073("!\b\u0001yS")), method4074(method4073("!\b\u0001rS")), method4074(method4073("!\b\u0001zS")), method4074(method4073("!\b\u0001|S")), method4074(method4073("=W\u0001\u0015\u0006")), method4074(method4073("!\b\u0001sS")), method4074(method4073("(\fCW")), method4074(method4073("!\b\u0001xS")), method4074(method4073("!\b\u0001}S")), method4074(method4073("!\b\u0001\u007fS")), method4074(method4073("f\nJX\u0014(\u001d\\\u0015Uh")), method4074(method4073("6\u0018ZH\u001e")), method4074(method4073("\u0016\u0018ZH\u0012(\u001e\u000f]\u00144Y")), method4074(method4073("!\b\u0001\u0007\u0012(\u0010[\u0005S")), method4074(method4073("!\b\u0001~S")) };

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "[I")
    public static int[] field7913 = new int[2];

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "Z")
    public static boolean field7914 = false;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field7917 = 0;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Lcja;")
    private class46 field7922;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "Lfj;")
    public static class682 field7920;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)Lcja;", line = 3)
    public final class46 method4064(int arg0) {
        try {
            if (arg0 != -21877) {
                return null;
            }
            field7926++;
            class46 var2 = this.field7916.field529;
            if (this.field7916 == var2) {
                return null;
            } else {
                var2.method362((byte) 72);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7927[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 23)
    public static final void method4065(int arg0, String[] arg1) {
        try {
            if (arg0 == 5) {
                field7924++;
                if (arg1.length <= 1) {
                    class194.field2609 = class194.field2609 + arg1[0];
                    class373.field5696 += arg1[0].length();
                } else {
                    for (int var2 = 0; var2 < arg1.length; var2++) {
                        if (arg1[var2].startsWith(field7927[11])) {
                            int var3 = 5;
                            try {
                                var3 = Integer.parseInt(arg1[var2].substring(6));
                            } catch (Exception var5) {
                            }
                            class437.method3350(22, field7927[12] + var3 + field7927[10]);
                            class138.field1647 = arg1;
                            class457.field6649 = var2 + 1;
                            class321.field5068 = (long) (var3 * 1000) + class430.method3299(127);
                            return;
                        }
                        class194.field2609 = arg1[var2];
                        class251.method2128(false, 0);
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7927[9] + arg0 + ',' + (arg1 == null ? field7927[6] : field7927[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V", line = 70)
    public static void method4066(int arg0) {
        try {
            field7913 = null;
            if (arg0 != -29448) {
                field7914 = false;
            }
            field7920 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7927[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BLcja;)V", line = 99)
    public final void method4067(byte arg0, class46 arg1) {
        try {
            field7918++;
            if (arg1.field527 != null) {
                arg1.method362((byte) 72);
            }
            int var3 = 3 / ((arg0 + 23) / 54);
            arg1.field527 = this.field7916.field527;
            arg1.field529 = this.field7916;
            arg1.field527.field529 = arg1;
            arg1.field529.field527 = arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7927[5] + arg0 + ',' + (arg1 == null ? field7927[6] : field7927[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)Lcja;", line = 118)
    public final class46 method4068(boolean arg0) {
        try {
            field7923++;
            class46 var2 = this.field7916.field529;
            if (this.field7916 == var2) {
                this.field7922 = null;
                return null;
            }
            if (arg0) {
                field7915 = -31;
            }
            this.field7922 = var2.field529;
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7927[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V", line = 205)
    public class540() {
        try {
            this.field7916.field529 = this.field7916;
            this.field7916.field527 = this.field7916;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7927[13] + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V", line = 144)
    public final void method4069(byte arg0) {
        try {
            if (arg0 >= -40) {
                this.method4064(-88);
            }
            while (true) {
                class46 var2 = this.field7916.field529;
                if (this.field7916 == var2) {
                    field7919++;
                    this.field7922 = null;
                    return;
                }
                var2.method362((byte) 72);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7927[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)I", line = 168)
    public static final int method4070(byte arg0) {
        try {
            field7925++;
            if (arg0 <= 63) {
                field7920 = null;
            }
            return class768.field11101.method5218(16711680);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7927[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)I", line = 183)
    public final int method4071(int arg0) {
        try {
            field7912++;
            int var2 = 0;
            if (arg0 >= -47) {
                field7913 = null;
            }
            class46 var3 = this.field7916.field529;
            while (this.field7916 != var3) {
                var3 = var3.field529;
                var2++;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7927[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Lcja;", line = 216)
    public final class46 method4072(int arg0) {
        try {
            if (arg0 > -43) {
                return null;
            }
            field7911++;
            class46 var2 = this.field7922;
            if (this.field7916 == var2) {
                this.field7922 = null;
                return null;
            } else {
                this.field7922 = var2.field529;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7927[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4073(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4074(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
