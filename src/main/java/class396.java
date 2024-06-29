import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public abstract class class396 implements class410 {

    @OriginalMember(owner = "client!at", name = "j", descriptor = "Lla;")
    public class476 field5925;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "Lbc;")
    public class384 field5922;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "Lla;")
    private class476 field5932;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5933 = new String[] { method3132(method3131("|7\u0005U4")), method3132(method3131("|7\u0005Y4")), method3132(method3131("fm\u00059a")), method3132(method3131("s6G{")), method3132(method3131("|7\u0005T4")), method3132(method3131("|7\u0005Z4")), method3132(method3131("=k")), method3132(method3131("|7\u0005]4")), method3132(method3131("|7\u0005+us*_)4")), method3132(method3131("|7\u0005X4")) };

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Lwq;")
    public static class178 field5928 = new class178(10);

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    public static int field5930 = 1;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    private int field5924;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "J")
    private long field5923;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "Lla;")
    public static class476 field5931;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "Lot;")
    public static class616 field5927;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "Lda;")
    private class67 field5917;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Z")
    public boolean method369(int arg0) {
        try {
            field5920++;
            if (arg0 != -17976) {
                this.method370((byte) 52);
            }
            boolean var2 = true;
            if (!this.field5925.method3618(this.field5922.field5806, arg0 + 18039)) {
                var2 = false;
            }
            if (!this.field5932.method3618(this.field5922.field5806, 106)) {
                var2 = false;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5933[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZB)V")
    public final void method368(boolean arg0, byte arg1) {
        try {
            field5919++;
            int var3 = this.field5922.field5805.method4532(this.field5922.field5809, 0, class604.field8861) + this.field5922.field5804;
            int var4 = this.field5922.field5813.method2339(this.field5922.field5810, (byte) -31, class524.field7654) + this.field5922.field5807;
            this.method188(arg0, var3, (byte) -109, var4);
            int var5 = -96 / ((arg1 - 38) / 37);
            this.method187(true, var3, arg0, var4);
            String var6 = class768.field11101.method5228(false);
            if (class430.method3299(120) - this.field5923 > 10000L) {
                var6 = var6 + field5933[6] + class768.field11101.method5229(0).method4649(3) + ")";
            }
            this.field5917.method608(this.field5922.field5809 / 2 + var3, this.field5922.field5810 / 2 + 4 + var4 + this.field5922.field5814, this.field5922.field5815, true, -1, var6);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5933[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V")
    public static void method3128(int arg0) {
        try {
            field5928 = null;
            field5927 = null;
            field5931 = null;
            if (arg0 != 29896) {
                field5921 = 111;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5933[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public void method370(byte arg0) {
        try {
            field5929++;
            if (arg0 <= -98) {
                class578 var2 = class350.method2876(7, this.field5922.field5806, this.field5932);
                this.field5917 = class610.field8913.method563(var2, class481.method3677(this.field5925, this.field5922.field5806), true);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5933[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lec;II)V")
    public static final void method3129(class247 arg0, int arg1, int arg2) {
        try {
            if (arg0.field3841 != null) {
                int var3 = arg0.field3841[arg2 + 1];
                if (arg0.field3814 != var3) {
                    arg0.field3851 = 0;
                    arg0.field3821 = 0;
                    arg0.field3763 = 1;
                    arg0.field3794 = 0;
                    arg0.field3858 = arg0.field3862;
                    arg0.field3814 = var3;
                    if (arg0.field3814 != -1) {
                        class418.method3242(-256, class272.field4122.method2242(arg0.field3814, 100), arg0, arg0.field3821);
                    }
                }
            }
            if (arg1 != 0) {
                method3129(null, 39, 110);
            }
            field5926++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5933[1] + (arg0 == null ? field5933[3] : field5933[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)I")
    public final int method3130(int arg0) {
        try {
            field5916++;
            if (arg0 != -1) {
                return 39;
            }
            int var2 = class768.field11101.method5226((byte) -76);
            int var3 = var2 * 100;
            if (this.field5924 == var2 && var2 != 0) {
                int var4 = class768.field11101.method5222(true);
                if (var4 > var2) {
                    long var5 = this.field5923 - class768.field11101.method5217(29723);
                    if (var5 > 0L) {
                        long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                        long var9 = (class430.method3299(100) - this.field5923) * 10000L;
                        if (var7 > var9) {
                            var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + ((long) (var2 * 100)));
                        } else {
                            var3 = var4 * 100;
                        }
                    }
                }
            } else {
                this.field5924 = var2;
                this.field5923 = class430.method3299(69);
            }
            return var3;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field5933[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZIBI)V")
    public abstract void method188(boolean arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZIZI)V")
    public abstract void method187(boolean arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lla;Lla;Lbc;)V")
    public class396(class476 arg0, class476 arg1, class384 arg2) {
        try {
            this.field5925 = arg0;
            this.field5922 = arg2;
            this.field5932 = arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5933[8] + (arg0 == null ? field5933[3] : field5933[2]) + ',' + (arg1 == null ? field5933[3] : field5933[2]) + ',' + (arg2 == null ? field5933[3] : field5933[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!at", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3131(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!at", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3132(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
