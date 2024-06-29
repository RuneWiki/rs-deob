import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class650 implements class175 {

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Ljaa;")
    private class642 field9325;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lgda;")
    private class58 field9319;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lgda;")
    private class58 field9315;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9326 = new String[] { method4743(method4742("G3\u00161y")), method4743(method4742("G3\u00166y")), method4743(method4742("G3\u0016N8F<LLy")), method4743(method4742("S{\u0016\\,")), method4743(method4742("F T\u001e")), method4743(method4742("G3\u00167y")), method4743(method4742("G3\u00164y")), method4743(method4742("G3\u00163y")), method4743(method4742("G3\u00160y")) };

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lat;")
    public static class398 field9317 = new class398();

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lvn;")
    public static class330 field9323 = new class330(89, 1);

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[I")
    public static int[] field9324 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lda;")
    private class64 field9316;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Z")
    public final boolean method457(byte arg0) {
        try {
            if (arg0 < 9) {
                return true;
            }
            field9321++;
            boolean var2 = true;
            if (!this.field9315.method595(-2, this.field9325.field9215)) {
                var2 = false;
            }
            if (!this.field9319.method595(-2, this.field9325.field9215)) {
                var2 = false;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9326[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method4739(int arg0) {
        try {
            field9323 = null;
            if (arg0 == 35) {
                field9317 = null;
                field9324 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9326[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)Lnt;")
    public static final class232 method4740(int arg0, byte arg1) {
        try {
            field9314++;
            if (arg1 > -12) {
                return null;
            } else if (arg0 == 0) {
                return new class342();
            } else if (arg0 == 1) {
                return new class453();
            } else if (arg0 == 2) {
                return new class368();
            } else if (arg0 == 3) {
                return new class91();
            } else if (arg0 == 4) {
                return new class54();
            } else if (arg0 == 5) {
                return new class503();
            } else if (arg0 == 6) {
                return new class112();
            } else if (arg0 == 7) {
                return new class119();
            } else if (arg0 == 8) {
                return new class95();
            } else if (arg0 == 9) {
                return new class18();
            } else if (arg0 == 10) {
                return new class286();
            } else if (arg0 == 11) {
                return new class187();
            } else if (arg0 == 12) {
                return new class166();
            } else if (arg0 == 13) {
                return new class169();
            } else if (arg0 == 14) {
                return new class608();
            } else if (arg0 == 15) {
                return new class534();
            } else if (arg0 == 16) {
                return new class252();
            } else if (arg0 == 17) {
                return new class702();
            } else if (arg0 == 18) {
                return new class558();
            } else if (arg0 == 19) {
                return new class82();
            } else if (arg0 == 20) {
                return new class97();
            } else if (arg0 == 21) {
                return new class253();
            } else if (arg0 == 22) {
                return new class199();
            } else if (arg0 == 23) {
                return new class167();
            } else if (arg0 == 24) {
                return new class227();
            } else if (arg0 == 25) {
                return new class545();
            } else if (arg0 == 26) {
                return new class393();
            } else if (arg0 == 27) {
                return new class221();
            } else if (arg0 == 28) {
                return new class8();
            } else if (arg0 == 29) {
                return new class142();
            } else if (arg0 == 30) {
                return new class188();
            } else if (arg0 == 31) {
                return new class222();
            } else if (arg0 == 32) {
                return new class634();
            } else if (arg0 == 33) {
                return new class226();
            } else if (arg0 == 34) {
                return new class767();
            } else if (arg0 == 35) {
                return new class477();
            } else if (arg0 == 36) {
                return new class757();
            } else if (arg0 == 37) {
                return new class425();
            } else if (arg0 == 38) {
                return new class150();
            } else if (arg0 == 39) {
                return new class244();
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9326[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public final void method459(byte arg0) {
        try {
            if (arg0 != -13) {
                this.method457((byte) -17);
            }
            field9322++;
            class49 var2 = class570.method4197(this.field9319, (byte) 28, this.field9325.field9215);
            this.field9316 = class662.field9437.method184(var2, class174.method1603(this.field9315, this.field9325.field9215), true);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9326[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZZ)V")
    public final void method1618(boolean arg0, boolean arg1) {
        try {
            field9318++;
            if (arg0 && arg1) {
                int var3 = this.field9325.field9214.method4806(class696.field10028, this.field9325.field9205, -121) + this.field9325.field9202;
                int var4 = this.field9325.field9203.method4833(this.field9325.field9217, class518.field7672, (byte) 84) + this.field9325.field9207;
                this.field9316.method681((byte) -120, null, this.field9325.field9218, 0, this.field9325.field9204, this.field9325.field9217, this.field9325.field9205, this.field9325.field9219, var3, null, 0, this.field9325.field9208, this.field9325.field9206, null, this.field9325.field9209, var4);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9326[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)V")
    public static final void method4741(int arg0, byte arg1) {
        try {
            field9320++;
            class670 var2 = (class670) class700.field10071.method737((byte) -39, (long) arg0);
            if (arg1 < 30) {
                field9323 = null;
            }
            if (var2 != null) {
                var2.field9518.method3066(0);
                class303.method2604(var2.field9523, var2.field9516, 8);
                var2.method4173(-1);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9326[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lgda;Lgda;Ljaa;)V")
    public class650(class58 arg0, class58 arg1, class642 arg2) {
        try {
            this.field9325 = arg2;
            this.field9319 = arg1;
            this.field9315 = arg0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9326[2] + (arg0 == null ? field9326[4] : field9326[3]) + ',' + (arg1 == null ? field9326[4] : field9326[3]) + ',' + (arg2 == null ? field9326[4] : field9326[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4742(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!of", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4743(char[] arg0) {
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
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
