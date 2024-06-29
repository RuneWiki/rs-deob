import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class513 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lme;")
    public class206 field7374 = new class206();

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7387 = new String[] { method3881(method3880("\bL&q:\u0003C|s{")), method3881(method3880("\bL&\u001d{")), method3881(method3880("\u0003_d!")), method3881(method3880("\u0016\u0004&c.")), method3881(method3880("\bL&\u0006{")), method3881(method3880("\bL&\u001c{")), method3881(method3880("\bL&\u000b{")), method3881(method3880("\bL&\n{")), method3881(method3880("\bL&\u0003{")), method3881(method3880("\bL&\u0002{")), method3881(method3880("\bL&\u001f{")), method3881(method3880("\bL&\b{")), method3881(method3880("\bL&\t{")), method3881(method3880("\bL&\u000e{")), method3881(method3880("\bL&\u0007{")), method3881(method3880("\bL&\u0004{")), method3881(method3880("\bL&\u0005{")), method3881(method3880("\bL&\u000f{")), method3881(method3880("\bL&\u0000{")), method3881(method3880("\bL&\f{")), method3881(method3880("\bL&\u0001{")) };

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "F")
    public static float field7376;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Lme;")
    private class206 field7385;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lsg;")
    public static class417 field7366;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lsn;")
    public static class656 field7378;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Lme;")
    public final class206 method3862(int arg0) {
        try {
            field7365++;
            class206 var2 = this.field7385;
            if (arg0 != -353) {
                field7376 = -0.8149989F;
            }
            if (this.field7374 == var2) {
                this.field7385 = null;
                return null;
            } else {
                this.field7385 = var2.field3180;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7387[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)Lme;")
    public final class206 method3863(byte arg0) {
        try {
            field7384++;
            if (arg0 != 64) {
                this.field7374 = null;
            }
            class206 var2 = this.field7374.field3180;
            if (this.field7374 == var2) {
                this.field7385 = null;
                return null;
            } else {
                this.field7385 = var2.field3180;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7387[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lef;Lme;Z)V")
    private final void method3864(class513 arg0, class206 arg1, boolean arg2) {
        try {
            field7367++;
            class206 var4 = this.field7374.field3179;
            if (!arg2) {
                this.field7374 = null;
            }
            this.field7374.field3179 = arg1.field3179;
            arg1.field3179.field3180 = this.field7374;
            if (this.field7374 != arg1) {
                arg1.field3179 = arg0.field7374.field3179;
                arg1.field3179.field3180 = arg1;
                arg0.field7374.field3179 = var4;
                var4.field3180 = arg0.field7374;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7387[8] + (arg0 == null ? field7387[2] : field7387[3]) + ',' + (arg1 == null ? field7387[2] : field7387[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method3865(int arg0) {
        try {
            if (arg0 < 61) {
                field7378 = null;
            }
            class375.field5718.method638((byte) -112);
            field7379++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7387[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILef;)V")
    public final void method3866(int arg0, class513 arg1) {
        try {
            field7369++;
            if (arg0 == -2775) {
                this.method3864(arg1, this.field7374.field3180, true);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7387[16] + arg0 + ',' + (arg1 == null ? field7387[2] : field7387[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IC)B")
    public static final byte method3867(int arg0, char arg1) {
        try {
            field7373++;
            if (arg0 != 7635) {
                method3865(-44);
            }
            byte var2;
            if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
                var2 = (byte) arg1;
            } else if (arg1 == '€') {
                var2 = -128;
            } else if (arg1 == '‚') {
                var2 = -126;
            } else if (arg1 == 'ƒ') {
                var2 = -125;
            } else if (arg1 == '„') {
                var2 = -124;
            } else if (arg1 == '…') {
                var2 = -123;
            } else if (arg1 == '†') {
                var2 = -122;
            } else if (arg1 == '‡') {
                var2 = -121;
            } else if (arg1 == 'ˆ') {
                var2 = -120;
            } else if (arg1 == '‰') {
                var2 = -119;
            } else if (arg1 == 'Š') {
                var2 = -118;
            } else if (arg1 == '‹') {
                var2 = -117;
            } else if (arg1 == 'Œ') {
                var2 = -116;
            } else if (arg1 == 'Ž') {
                var2 = -114;
            } else if (arg1 == '‘') {
                var2 = -111;
            } else if (arg1 == '’') {
                var2 = -110;
            } else if (arg1 == '“') {
                var2 = -109;
            } else if (arg1 == '”') {
                var2 = -108;
            } else if (arg1 == '•') {
                var2 = -107;
            } else if (arg1 == '–') {
                var2 = -106;
            } else if (arg1 == '—') {
                var2 = -105;
            } else if (arg1 == '˜') {
                var2 = -104;
            } else if (arg1 == '™') {
                var2 = -103;
            } else if (arg1 == 'š') {
                var2 = -102;
            } else if (arg1 == '›') {
                var2 = -101;
            } else if (arg1 == 'œ') {
                var2 = -100;
            } else if (arg1 == 'ž') {
                var2 = -98;
            } else if (arg1 == 'Ÿ') {
                var2 = -97;
            } else {
                var2 = 63;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7387[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILme;)V")
    public final void method3868(int arg0, class206 arg1) {
        try {
            if (arg1.field3179 != null) {
                arg1.method1824(1);
            }
            field7383++;
            arg1.field3180 = this.field7374;
            arg1.field3179 = this.field7374.field3179;
            arg1.field3179.field3180 = arg1;
            int var3 = -63 % ((18 - arg0) / 52);
            arg1.field3180.field3179 = arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7387[9] + arg0 + ',' + (arg1 == null ? field7387[2] : field7387[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)Lme;")
    public final class206 method3869(int arg0) {
        try {
            field7380++;
            if (arg0 != -762) {
                method3877(null, 47, 55, null);
            }
            class206 var2 = this.field7385;
            if (this.field7374 == var2) {
                this.field7385 = null;
                return null;
            } else {
                this.field7385 = var2.field3179;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7387[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method3870(byte arg0) {
        try {
            if (arg0 != -125) {
                field7376 = 0.07123057F;
            }
            field7366 = null;
            field7378 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7387[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Lme;")
    public final class206 method3871(boolean arg0) {
        try {
            field7368++;
            if (!arg0) {
                this.field7385 = null;
            }
            class206 var2 = this.field7374.field3179;
            if (this.field7374 == var2) {
                this.field7385 = null;
                return null;
            } else {
                this.field7385 = var2.field3179;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7387[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V")
    public static final void method3872(int arg0, byte arg1) {
        try {
            field7382++;
            int var2 = -120 % ((arg1 - 33) / 38);
            if (class203.method1806(false)) {
                if (class472.field6852 != arg0) {
                    class76.field872 = "";
                }
                class472.field6852 = arg0;
                if (class629.field9198 != null) {
                    class629.field9198.method2700((byte) 126);
                    class629.field9198 = null;
                }
                class86.method728(5, (byte) -96);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7387[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)Z")
    public final boolean method3873(int arg0) {
        try {
            int var2 = -10 / ((-arg0 - 58) / 59);
            field7370++;
            return this.field7374.field3180 == this.field7374;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7387[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I")
    public final int method3874(int arg0) {
        try {
            field7377++;
            int var2 = 0;
            if (arg0 != -32154) {
                this.method3869(-112);
            }
            for (class206 var3 = this.field7374.field3180; var3 != this.field7374; var3 = var3.field3180) {
                var2++;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7387[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Lme;")
    public final class206 method3875(int arg0) {
        try {
            field7375++;
            int var2 = -13 % ((arg0 - 12) / 62);
            class206 var3 = this.field7374.field3180;
            if (this.field7374 == var3) {
                return null;
            } else {
                var3.method1824(1);
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7387[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLme;)V")
    public final void method3876(boolean arg0, class206 arg1) {
        try {
            if (arg1.field3179 != null) {
                arg1.method1824(1);
            }
            field7381++;
            arg1.field3179 = this.field7374;
            arg1.field3180 = this.field7374.field3180;
            if (arg0) {
                field7366 = null;
            }
            arg1.field3179.field3180 = arg1;
            arg1.field3180.field3179 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7387[4] + arg0 + ',' + (arg1 == null ? field7387[2] : field7387[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method3877(String arg0, int arg1, int arg2, String arg3) {
        try {
            field7386++;
            if (arg3.length() <= 320) {
                if (arg2 != 32428) {
                    field7378 = null;
                }
                if (class203.method1806(false)) {
                    class729.method5315(256);
                    class489.field7027 = arg0;
                    class591.field8684 = arg1;
                    class122.field1439 = arg3;
                    class86.method728(6, (byte) -96);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7387[1] + (arg0 == null ? field7387[2] : field7387[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7387[2] : field7387[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)Ljava/lang/String;")
    public static final String method3878(int arg0) {
        try {
            if (arg0 < 50) {
                return null;
            } else {
                field7372++;
                return class216.field3297 || field7366 == null ? "" : field7366.field6139;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7387[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
    public final void method3879(int arg0) {
        try {
            while (true) {
                class206 var2 = this.field7374.field3180;
                if (this.field7374 == var2) {
                    if (arg0 < 61) {
                        this.field7385 = null;
                    }
                    field7371++;
                    this.field7385 = null;
                    return;
                }
                var2.method1824(1);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7387[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class513() {
        try {
            this.field7374.field3180 = this.field7374;
            this.field7374.field3179 = this.field7374;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7387[0] + ')');
        }
    }

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3880(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3881(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 8;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
