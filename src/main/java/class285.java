import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class285 {

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lpb;")
    private class78 field4378 = new class78();

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Lti;")
    private class222 field4388 = new class222();

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    private int field4385;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    private int field4387;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lsa;")
    private class110 field4384;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "[Ljh;")
    public static class269[] field4380 = new class269[14];

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4377 = "Examine";

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lik;")
    public static class259 field4371 = new class259(100);

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field4383 = 0;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4386 = "yellow:";

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lja;")
    public static class64 field4372;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIILdg;IJIIII)Z", line = 6)
    public static final boolean method2016(int arg0, int arg1, int arg2, int arg3, class320 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class128.method960(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IJ)Lpb;", line = 18)
    public final class78 method2017(int arg0, long arg1) {
        if (arg0 != 1022) {
            this.method2024(true);
        }
        field4375++;
        class78 var4 = (class78) this.field4384.method833(false, arg1);
        if (var4 != null) {
            this.field4388.method1616(1, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(JLpb;I)V", line = 45)
    public final void method2018(long arg0, class78 arg1, int arg2) {
        field4373++;
        if (this.field4387 == 0) {
            class78 var5 = this.field4388.method1609(-1709);
            var5.method1701(-116);
            var5.method571(7);
            if (this.field4378 == var5) {
                class78 var6 = this.field4388.method1609(-1709);
                var6.method1701(-122);
                var6.method571(7);
            }
        } else {
            this.field4387--;
        }
        if (arg2 >= -59) {
            field4383 = -62;
        }
        this.field4384.method845(arg1, (byte) 113, arg0);
        this.field4388.method1616(1, arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 76)
    public final void method2019(byte arg0) {
        field4382++;
        this.field4388.method1613(-14142);
        this.field4384.method837(true);
        int var2 = 116 % ((arg0 - 72) / 32);
        this.field4378 = new class78();
        this.field4387 = this.field4385;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)I", line = 90)
    public static final int method2020(byte arg0) {
        field4374++;
        if ((double) class54.field862 == 3.0D) {
            return 37;
        }
        int var1 = -79 % ((arg0) / 39);
        if ((double) class54.field862 == 4.0D) {
            return 50;
        } else if ((double) class54.field862 == 6.0D) {
            return 75;
        } else if ((double) class54.field862 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBLja;)Lte;", line = 131)
    public static final class295 method2021(int arg0, byte arg1, class64 arg2) {
        field4370++;
        byte[] var3 = arg2.method490(arg0, true);
        if (var3 == null) {
            return null;
        } else if (arg1 < 116) {
            return (class295) null;
        } else {
            return new class295(var3);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)Lfj;", line = 150)
    public final class240 method2022(int arg0) {
        if (arg0 != 1) {
            this.field4385 = 120;
        }
        field4381++;
        return this.field4384.method841(0);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IJ)V", line = 170)
    public static final void method2023(int arg0, long arg1) {
        class269.field4191.field1667 = 0;
        class269.field4191.method772((byte) -75, 21);
        field4379++;
        class269.field4191.method760(arg1, true);
        class231.field3671 = -3;
        class279.field4313 = 0;
        class70.field1113 = 0;
        class316.field4932 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)Lfj;", line = 192)
    public final class240 method2024(boolean arg0) {
        if (arg0) {
            field4386 = (String) null;
        }
        field4376++;
        return this.field4384.method842((byte) -40);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V", line = 203)
    public static void method2025(byte arg0) {
        field4386 = null;
        field4372 = null;
        int var1 = -83 / ((-arg0 - 19) / 52);
        field4377 = null;
        field4371 = null;
        field4380 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(I)V", line = 231)
    public class285(int arg0) {
        this.field4385 = arg0;
        this.field4387 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4384 = new class110(var2);
    }
}
