import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lef;")
    private class35 field2852 = new class35(256);

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Lef;")
    private class35 field2864 = new class35(256);

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lff;")
    private class42 field2855;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lff;")
    private class42 field2853;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lr;")
    private static class118 field2851 = class153.method1136(109, "Click to switch");

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lr;")
    public static class118 field2859 = field2851;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2862 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Lr;")
    public static class118 field2868 = class153.method1136(91, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!s", name = "t", descriptor = "Lr;")
    public static class118 field2867 = class153.method1136(115, "null");

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Lr;")
    public static class118 field2866 = class153.method1136(76, "p12_full");

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lr;")
    public static class118 field2863 = class153.method1136(77, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field2869 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BIIZ)V")
    public static final void method967(byte arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 != -39) {
            field2862 = null;
        }
        field2856++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class41.field972 = arg3;
        class85.field2084 = arg1;
        class136.field3087 = arg2;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method968(int arg0) {
        field2859 = null;
        field2862 = null;
        field2868 = null;
        if (arg0 < 13) {
            field2862 = null;
        }
        field2867 = null;
        field2863 = null;
        field2851 = null;
        field2866 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([IBI)Lqf;")
    public final class117 method969(int[] arg0, byte arg1, int arg2) {
        field2850++;
        if (this.field2853.method357(true) == 1) {
            return this.method973((byte) -99, arg0, 0, arg2);
        } else if (this.field2853.method343((byte) 120, arg2) == 1) {
            return this.method973((byte) -94, arg0, arg2, 0);
        } else {
            int var4 = 4 / ((arg1 - 52) / 49);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Lw;")
    public static final class153 method970(byte arg0, int arg1) {
        field2858++;
        class153 var2 = (class153) class91.field2167.method395((byte) -127, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == -68) {
            byte[] var3 = class84.field2024.method350(12, -112, arg1);
            class153 var4 = new class153();
            if (var3 != null) {
                var4.method1140((byte) -125, new class105(var3));
            }
            var4.method1144(arg0 + 16596);
            class91.field2167.method391(var4, (long) arg1, true);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static final void method971(int arg0) {
        field2860++;
        Object var1 = class84.field2020;
        synchronized (class84.field2020) {
            if (class35.field874 != 0) {
                class35.field874 = 1;
                try {
                    class84.field2020.wait();
                } catch (InterruptedException var2) {
                }
            }
            if (arg0 < 47) {
                method968(76);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[III)Lqf;")
    private final class117 method972(int arg0, int[] arg1, int arg2, int arg3) {
        field2861++;
        int var5 = (arg3 >>> 12 | (arg3 & 0x20000FFF) << 4) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class117 var9 = (class117) this.field2864.method297(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            int var10 = 74 / ((arg0 - 55) / 55);
            class96 var11 = class96.method752(this.field2855, arg3, arg2);
            if (var11 == null) {
                return null;
            }
            class117 var12 = var11.method753();
            this.field2864.method288(var12, var7, (byte) -91);
            if (arg1 != null) {
                arg1[0] -= var12.field2711.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B[III)Lqf;")
    private final class117 method973(byte arg0, int[] arg1, int arg2, int arg3) {
        field2854++;
        int var5 = ((arg2 & 0x10000FFF) << 4 | arg2 >>> 12) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class117 var9 = (class117) this.field2864.method297(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class5 var10 = (class5) this.field2852.method297(var7, -1);
            if (var10 == null) {
                var10 = class5.method28(this.field2853, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2852.method288(var10, var7, (byte) -91);
            }
            class117 var11 = var10.method20(arg1);
            if (var11 == null) {
                return null;
            }
            var10.method768(-1);
            this.field2864.method288(var11, var7, (byte) -91);
            if (arg0 >= -35) {
                this.field2852 = null;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I)Lqf;")
    public final class117 method974(int arg0, int arg1, int[] arg2) {
        if (arg0 < 121) {
            field2859 = null;
        }
        field2849++;
        if (this.field2855.method357(true) == 1) {
            return this.method972(110, arg2, arg1, 0);
        } else if (this.field2855.method343((byte) 124, arg1) == 1) {
            return this.method972(-74, arg2, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lff;Lff;)V")
    public class125(class42 arg0, class42 arg1) {
        this.field2855 = arg0;
        this.field2853 = arg1;
    }
}
