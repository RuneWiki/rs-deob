import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class199 {

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    private int field3197 = 0;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[Lcj;")
    public class307[] field3178;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lqd;")
    public static class40 field3192 = class147.method1106("cookieprefix", (byte) -56);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lch;")
    public static class133 field3181 = new class133(128);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "J")
    private long field3188;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lce;")
    public static class239 field3179;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lce;")
    public static class239 field3189;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Lcj;")
    private class307 field3193;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Lcj;")
    private class307 field3198;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)I", line = 12)
    public static final int method1395(int arg0) {
        int var1 = -15 % ((arg0 - 22) / 44);
        field3194++;
        return class135.field2294 == 0 ? 0 : class250.field4132[class135.field2294].method91();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IJLcj;)V", line = 34)
    public final void method1396(int arg0, long arg1, class307 arg2) {
        if (arg2.field5154 != null) {
            arg2.method2095(0);
        }
        if (arg0 != -19928) {
            field3186 = 108;
        }
        class307 var5 = this.field3178[(int) ((long) (this.field3182 - 1) & arg1)];
        field3196++;
        arg2.field5154 = var5.field5154;
        arg2.field5143 = var5;
        arg2.field5149 = arg1;
        arg2.field5154.field5143 = arg2;
        arg2.field5143.field5154 = arg2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)I", line = 58)
    public final int method1397(byte arg0) {
        field3191++;
        int var2 = 0;
        if (arg0 != 86) {
            method1402(true);
        }
        for (int var3 = 0; var3 < this.field3182; var3++) {
            class307 var4 = this.field3178[var3];
            class307 var5 = var4.field5143;
            while (var4 != var5) {
                var5 = var5.field5143;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Lcj;", line = 89)
    public final class307 method1398(int arg0) {
        field3185++;
        if (this.field3193 == null) {
            return null;
        } else if (arg0 == -29858) {
            class307 var2 = this.field3178[(int) (this.field3188 & (long) (this.field3182 - 1))];
            while (this.field3193 != var2) {
                if (this.field3193.field5149 == this.field3188) {
                    class307 var3 = this.field3193;
                    this.field3193 = this.field3193.field5143;
                    return var3;
                }
                this.field3193 = this.field3193.field5143;
            }
            this.field3193 = null;
            return null;
        } else {
            return (class307) null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 121)
    public final void method1399(byte arg0) {
        for (int var2 = 0; var2 < this.field3182; var2++) {
            class307 var3 = this.field3178[var2];
            while (true) {
                class307 var4 = var3.field5143;
                if (var3 == var4) {
                    break;
                }
                var4.method2095(0);
            }
        }
        this.field3198 = null;
        int var5 = -1 / ((63 - arg0) / 56);
        this.field3193 = null;
        field3195++;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)Lcj;", line = 160)
    public final class307 method1400(int arg0) {
        this.field3197 = 0;
        field3180++;
        return arg0 == -1 ? this.method1403(arg0 ^ 0x31) : (class307) null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(JI)Lqd;", line = 172)
    public static final class40 method1401(long arg0, int arg1) {
        field3183++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            if (arg1 != 1) {
                method1401(108L, 103);
            }
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = client.field4063[(int) (var7 - (arg0 * 37L))];
            }
            class40 var9 = new class40();
            var9.field745 = var6;
            var9.field766 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V", line = 216)
    public static void method1402(boolean arg0) {
        field3189 = null;
        field3179 = null;
        field3181 = null;
        if (arg0) {
            method1402(true);
        }
        field3192 = null;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)Lcj;", line = 233)
    public final class307 method1403(int arg0) {
        field3187++;
        if (this.field3197 > 0 && this.field3178[this.field3197 - 1] != this.field3198) {
            class307 var2 = this.field3198;
            this.field3198 = var2.field5143;
            return var2;
        }
        int var3 = 15 % ((arg0 - 56) / 52);
        class307 var4;
        do {
            if (this.field3182 <= this.field3197) {
                return null;
            }
            var4 = this.field3178[this.field3197++].field5143;
        } while (this.field3178[this.field3197 - 1] == var4);
        this.field3198 = var4.field5143;
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)I", line = 284)
    public final int method1404(boolean arg0) {
        field3190++;
        return arg0 ? this.field3182 : 24;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BJ)Lcj;", line = 295)
    public final class307 method1405(byte arg0, long arg1) {
        this.field3188 = arg1;
        field3184++;
        class307 var4 = this.field3178[(int) (arg1 & (long) (this.field3182 - 1))];
        if (arg0 != 115) {
            field3181 = (class133) null;
        }
        for (this.field3193 = var4.field5143; this.field3193 != var4; this.field3193 = this.field3193.field5143) {
            if (this.field3193.field5149 == arg1) {
                class307 var5 = this.field3193;
                this.field3193 = this.field3193.field5143;
                return var5;
            }
        }
        this.field3193 = null;
        return null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V", line = 329)
    public class199(int arg0) {
        this.field3178 = new class307[arg0];
        this.field3182 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class307 var3 = this.field3178[var2] = new class307();
            var3.field5154 = var3;
            var3.field5143 = var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[Lcj;)I", line = 357)
    public final int method1406(int arg0, class307[] arg1) {
        field3177++;
        int var3 = 0;
        if (arg0 != 128) {
            this.method1404(true);
        }
        for (int var4 = 0; var4 < this.field3182; var4++) {
            class307 var5 = this.field3178[var4];
            for (class307 var6 = var5.field5143; var6 != var5; var6 = var6.field5143) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }
}
