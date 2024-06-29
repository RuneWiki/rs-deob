import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class702 implements class135 {

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lqha;")
    private class112 field10206 = new class112(128);

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
    private int[] field10197;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    public int[] field10195;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10209 = new String[] { method5135(method5134("C&n>m")), method5135(method5134("C&n:m")), method5135(method5134("C&n<m")), method5135(method5134("C&n;m")), method5135(method5134("C&n8m")), method5135(method5134("C&n?m")), method5135(method5134("C&nE,K-4Gm")), method5135(method5134("C&n=m")), method5135(method5134("C&n1m")), method5135(method5134("C&n0m")) };

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lwia;")
    public static class790 field10198 = new class790(86, 0);

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field10205 = 1;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field10200;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field10201;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field10204;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field10207;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field10208;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Ld;")
    public static class160 field10199;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIZ)V")
    public final void method5127(int arg0, int arg1, boolean arg2) {
        try {
            field10196++;
            class564 var4 = class369.field5638.method4265(true, arg0);
            int var5 = var4.field8367;
            if (arg2) {
                this.method5128(-31, 24, -7);
            }
            int var6 = var4.field8366;
            int var7 = var4.field8373;
            int var8 = class104.field1207[var7 - var6];
            if (arg1 < 0 || var8 < arg1) {
                arg1 = 0;
            }
            int var9 = var8 << var6;
            this.method5132(var5, (byte) -62, arg1 << var6 & var9 | ~var9 & this.field10197[var5]);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10209[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
    public final void method5128(int arg0, int arg1, int arg2) {
        try {
            int var4 = 90 / ((-arg2 - 58) / 48);
            this.field10195[arg0] = arg1;
            field10208++;
            class195 var5 = (class195) this.field10206.method977((long) arg0, 1);
            if (var5 == null) {
                class195 var6 = new class195(class430.method3299(103) + 500L);
                this.field10206.method968((byte) -111, (long) arg0, var6);
            } else {
                var5.field2614 = class430.method3299(121) + 500L;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10209[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method5129(int arg0) {
        try {
            for (int var2 = arg0; var2 < class289.field4303.field5457; var2++) {
                class77 var3 = class289.field4303.method2903(var2, (byte) 38);
                if (var3 != null && var3.field891 == 0) {
                    this.field10197[var2] = 0;
                    this.field10195[var2] = 0;
                }
            }
            field10202++;
            this.field10206 = new class112(128);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10209[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZ)V")
    public final void method5130(int arg0, int arg1, boolean arg2) {
        try {
            field10201++;
            class564 var4 = class369.field5638.method4265(arg2, arg1);
            int var5 = var4.field8367;
            int var6 = var4.field8366;
            int var7 = var4.field8373;
            int var8 = class104.field1207[var7 - var6];
            if (arg0 < 0 || var8 < arg0) {
                arg0 = 0;
            }
            int var9 = var8 << var6;
            this.method5128(var5, var9 & arg0 << var6 | ~var9 & this.field10195[var5], -110);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10209[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method5131(byte arg0) {
        try {
            if (arg0 != -32) {
                method5131((byte) -101);
            }
            field10199 = null;
            field10198 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10209[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI)V")
    public final void method5132(int arg0, byte arg1, int arg2) {
        try {
            this.field10197[arg0] = arg2;
            field10207++;
            if (arg1 != -62) {
                this.field10197 = null;
            }
            class195 var4 = (class195) this.field10206.method977((long) arg0, arg1 ^ 0xFFFFFFC3);
            if (var4 == null) {
                class195 var5 = new class195(4611686018427387905L);
                this.field10206.method968((byte) -111, (long) arg0, var5);
            } else if (var4.field2614 != 4611686018427387905L) {
                var4.field2614 = class430.method3299(126) + 500L | 0x4000000000000000L;
                return;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10209[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)I")
    public final int method1150(int arg0, int arg1) {
        try {
            field10200++;
            class564 var3 = class369.field5638.method4265(true, arg1);
            int var4 = var3.field8367;
            if (arg0 != 0) {
                field10199 = null;
            }
            int var5 = var3.field8366;
            int var6 = var3.field8373;
            int var7 = class104.field1207[var6 - var5];
            return var7 & this.field10195[var4] >> var5;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field10209[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)I")
    public final int method5133(boolean arg0, int arg1) {
        try {
            field10203++;
            long var3 = class430.method3299(85);
            for (class195 var5 = arg0 ? (class195) this.field10206.method971(347) : (class195) this.field10206.method973(true); var5 != null; var5 = (class195) this.field10206.method973(true)) {
                if ((var5.field2614 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                    if ((var5.field2614 & 0x4000000000000000L) != 0L) {
                        int var6 = (int) var5.field3177;
                        this.field10195[var6] = this.field10197[var6];
                        var5.method1824(arg1 ^ 0x531E);
                        return var6;
                    }
                    var5.method1824(1);
                }
            }
            if (arg1 != 21279) {
                field10199 = null;
            }
            return -1;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10209[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class702() {
        try {
            this.field10197 = new int[class289.field4303.field5457];
            this.field10195 = new int[class289.field4303.field5457];
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10209[6] + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
    public final int method1149(int arg0, int arg1) {
        try {
            field10204++;
            if (arg0 <= 0) {
                field10199 = null;
            }
            return this.field10195[arg1];
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10209[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5134(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5135(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
