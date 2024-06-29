import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class309 {

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    private int field4665 = 0;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public int field4662 = -1;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    private int field4666 = 128;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Z")
    public boolean field4664 = false;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Z")
    public boolean field4675 = false;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    private int field4677 = 0;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    private int field4670 = 0;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    private int field4678 = 128;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "[I")
    public static int[] field4660 = new int[50];

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field4671 = 0;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    private int field4668;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public int field4672;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[S")
    private short[] field4657;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[S")
    private short[] field4658;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "[S")
    private short[] field4673;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "[S")
    private short[] field4676;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLcg;)V", line = 4)
    public final void method2118(boolean arg0, class316 arg1) {
        field4661++;
        while (true) {
            int var3 = arg1.method2219(16448);
            if (var3 == 0) {
                if (!arg0) {
                    method2120(false, 36L);
                }
                return;
            }
            this.method2125(-41, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIC)C", line = 28)
    public static final char method2119(int arg0, int arg1, char arg2) {
        field4674++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            if (arg0 != 200) {
                field4671 = -2;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 116)
    public static final String method2120(boolean arg0, long arg1) {
        field4656++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg0) {
            return (String) null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class185.field2555[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lpg;", line = 157)
    public static final class119 method2121(int arg0, int arg1) {
        if (arg1 < 52) {
            method2120(false, -109L);
        }
        field4669++;
        class119 var2 = (class119) class145.field2001.method716((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class183.field2525.method955(1, arg0, -21853);
        class119 var4 = new class119();
        if (var3 != null) {
            var4.method866(47, new class316(var3), arg0);
        }
        class145.field2001.method721((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)Lq;", line = 186)
    public final class345 method2122(int arg0, int arg1, int arg2, int arg3) {
        field4659++;
        class345 var5 = (class345) class257.field3796.method716((long) this.field4672, false);
        if (var5 == null) {
            class308 var6 = class308.method2089(class123.field1669, this.field4668, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field4658 != null) {
                for (int var7 = 0; var7 < this.field4658.length; var7++) {
                    var6.method2095(this.field4658[var7], this.field4657[var7]);
                }
            }
            if (this.field4673 != null) {
                for (int var8 = 0; var8 < this.field4673.length; var8++) {
                    var6.method2092(this.field4673[var8], this.field4676[var8]);
                }
            }
            var5 = var6.method2097(this.field4670 + 64, 850 - -this.field4665, -30, -50, -30);
            class257.field3796.method721((long) this.field4672, var5, 0);
        }
        int var9 = 126 % ((arg1 - 60) / 63);
        class345 var10;
        if (this.field4662 == -1 || arg0 == -1) {
            var10 = var5.method323(true, true, true);
        } else {
            var10 = class52.method361(true, this.field4662).method902(arg2, var5, arg0, arg3, true);
        }
        if (this.field4666 != 128 || this.field4678 != 128) {
            var10.method332(this.field4666, this.field4678, this.field4666);
        }
        if (this.field4677 != 0) {
            if (this.field4677 == 90) {
                var10.method324();
            }
            if (this.field4677 == 180) {
                var10.method348();
            }
            if (this.field4677 == 270) {
                var10.method315();
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V", line = 270)
    public static final void method2123(boolean arg0, int arg1) {
        field4667++;
        class213.field3073.method720(arg1, 1088);
        if (!arg0) {
            method2120(true, -46L);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 288)
    public static void method2124(int arg0) {
        if (arg0 != 37) {
            method2119(38, -69, '\'');
        }
        field4660 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILcg;I)V", line = 321)
    private final void method2125(int arg0, class316 arg1, int arg2) {
        if (arg0 != -41) {
            this.field4672 = 108;
        }
        field4663++;
        if (arg2 == 1) {
            this.field4668 = arg1.method2220((byte) 60);
        } else if (arg2 == 2) {
            this.field4662 = arg1.method2220((byte) 81);
        } else if (arg2 == 4) {
            this.field4666 = arg1.method2220((byte) 37);
        } else if (arg2 == 5) {
            this.field4678 = arg1.method2220((byte) 105);
        } else if (arg2 == 6) {
            this.field4677 = arg1.method2220((byte) 54);
        } else if (arg2 == 7) {
            this.field4670 = arg1.method2219(16448);
        } else if (arg2 == 8) {
            this.field4665 = arg1.method2219(16448);
        } else if (arg2 == 9) {
            this.field4675 = true;
        } else if (arg2 == 10) {
            this.field4664 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method2219(16448);
            this.field4658 = new short[var6];
            this.field4657 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4658[var7] = (short) arg1.method2220((byte) 115);
                this.field4657[var7] = (short) arg1.method2220((byte) 70);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method2219(16448);
            this.field4673 = new short[var4];
            this.field4676 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4673[var5] = (short) arg1.method2220((byte) 60);
                this.field4676[var5] = (short) arg1.method2220((byte) 125);
            }
        }
    }
}
