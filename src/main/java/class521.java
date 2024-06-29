import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class521 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Ljr;")
    private class112 field7227 = new class112(64);

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field7241 = 0;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lin;")
    private class91 field7236;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public int field7223;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[S")
    private static short[] field7224 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
    public static int[] field7226 = new int[500];

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field7233 = 16777215;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field7235 = 0;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "[S")
    private static short[] field7231 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field7238 = 13156520;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field7229 = -1;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "[Z")
    public static boolean[] field7232 = new boolean[100];

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "[S")
    private static short[] field7243 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[[S")
    public static short[][] field7237 = new short[][] { field7243, field7231, field7224 };

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)J", line = 5)
    public static final long method3029(int arg0, String arg1) {
        field7242++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (1 - (97 - var6));
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        if (arg0 != -1994) {
            field7237 = null;
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V", line = 54)
    public final void method3030(int arg0, int arg1) {
        class112 var3 = this.field7227;
        synchronized (this.field7227) {
            this.field7227.method987(2, arg0);
            if (arg1 > -10) {
                method3033(116, 38);
            }
        }
        field7230++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 68)
    public final void method3031(byte arg0) {
        field7228++;
        class112 var2 = this.field7227;
        synchronized (this.field7227) {
            if (arg0 != 46) {
                this.method3035(-66);
            }
            this.field7227.method996(-94);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)Lvd;", line = 82)
    public final class39 method3032(int arg0, boolean arg1) {
        if (arg1) {
            field7231 = null;
        }
        field7225++;
        class112 var3 = this.field7227;
        class39 var4;
        synchronized (this.field7227) {
            var4 = (class39) this.field7227.method992((long) arg0, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field7236;
        byte[] var6;
        synchronized (this.field7236) {
            var6 = this.field7236.method863(-1860, 4, arg0);
        }
        class39 var7 = new class39();
        var7.field959 = arg0;
        var7.field948 = this;
        if (var6 != null) {
            var7.method479(true, new class215(var6));
        }
        var7.method476(-4860);
        class112 var8 = this.field7227;
        synchronized (this.field7227) {
            this.field7227.method991(var7, (long) arg0, (byte) -111);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)V", line = 121)
    public static final void method3033(int arg0, int arg1) {
        field7239++;
        int var2 = class641.field8810 - class548.field7553;
        if (var2 >= 100) {
            class438.field6252 = 1;
            class705.field9558 = -1;
            class44.field978 = -1;
            return;
        }
        int var3 = (int) class440.field6267;
        if ((class113.field1948 >> 8) > var3) {
            var3 = class113.field1948 >> 8;
        }
        if (class226.field3216[4] && class20.field304[4] + 128 > var3) {
            var3 = class20.field304[4] + 128;
        }
        int var4 = (int) class451.field6366 + class637.field8757 & 0x3FFF;
        if (arg1 != 0) {
            method3029(-117, null);
        }
        class691.method3865(var3, class197.method1403(class58.field1147.field5922, class382.field5551, 11219, class58.field1147.field5933) - 200, var4, class476.field6650, arg0, -19360, class162.field2584, (var3 >> 3) * 3 + 600 << 2);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class108.field1896 = (int) ((float) (class108.field1896 - class143.field2364) * var5 + (float) class143.field2364);
        class458.field6444 = (int) ((float) (class458.field6444 - class629.field8657) * var5 + (float) class629.field8657);
        class634.field8721 = (int) ((float) (class634.field8721 - class361.field5196) * var5 + (float) class361.field5196);
        class275.field3870 = (int) ((float) (class275.field3870 - class753.field10519) * var5 + (float) class753.field10519);
        int var6 = class600.field8231 - class74.field1344;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class600.field8231 = (int) ((float) var6 * var5 + (float) class74.field1344);
        class600.field8231 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V", line = 170)
    public static void method3034(byte arg0) {
        field7237 = null;
        field7231 = null;
        if (arg0 != 121) {
            method3033(57, 35);
        }
        field7243 = null;
        field7224 = null;
        field7226 = null;
        field7232 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 185)
    public final void method3035(int arg0) {
        class112 var2 = this.field7227;
        synchronized (this.field7227) {
            this.field7227.method999(arg0 ^ arg0);
        }
        field7234++;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lsj;ILin;)V", line = 262)
    public class521(class460 arg0, int arg1, class91 arg2) {
        this.field7236 = arg2;
        this.field7223 = this.field7236.method860(0, 4);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 228)
    public static final void method3036(int arg0) {
        if (arg0 > -47) {
            return;
        }
        for (int var1 = 0; var1 < class649.field8920; var1++) {
            class456 var2 = class429.field6148[var1];
            if (var2.field6425 == 3) {
                if (var2.field6421 == null) {
                    var2.field6433 = Integer.MIN_VALUE;
                } else {
                    class326.field4510.method1321(var2.field6421);
                }
            }
        }
        field7240++;
    }
}
