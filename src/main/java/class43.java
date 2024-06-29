import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class43 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Lia;")
    public class320 field679 = new class320();

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "[I")
    public static int[] field694 = new int[50];

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field693 = 0;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Ll;")
    public static class66 field689 = new class66(64);

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "[F")
    public static float[] field698 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field697 = 7759444;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "Ll;")
    public static class66 field699 = new class66(16);

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "B")
    public static byte field687;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Lia;")
    private class320 field688;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "Lqk;")
    public static class70 field690;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Lf;", line = 5)
    public static final class212 method437(int arg0, int arg1) {
        field685++;
        class212 var2 = (class212) class231.field3610.method654(72, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class151.field2472.method187(class226.method1688(arg1, -1951127992), class86.method780(arg1, -13800), -1);
        class212 var4 = new class212();
        var4.field3334 = arg1;
        if (var3 != null) {
            var4.method1570(new class25(var3), false);
        }
        if (arg0 < 22) {
            field690 = (class70) null;
        }
        var4.method1575((byte) 78);
        if (!class162.field2573 && var4.field3269) {
            var4.field3265 = null;
        }
        if (var4.field3308) {
            var4.field3329 = 0;
            var4.field3307 = false;
        }
        class231.field3610.method652(-76, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLia;)V", line = 43)
    public final void method438(boolean arg0, class320 arg1) {
        field692++;
        if (arg1.field4928 != null) {
            arg1.method2262((byte) -102);
        }
        arg1.field4928 = this.field679.field4928;
        arg1.field4934 = this.field679;
        if (!arg0) {
            this.method448(0);
        }
        arg1.field4928.field4934 = arg1;
        arg1.field4934.field4928 = arg1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZZIILrn;)V", line = 60)
    public static final void method439(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, class18 arg5) {
        class287.field4447 = arg2;
        field683++;
        class110.field1693 = arg3;
        class150.field2450 = arg0;
        class37.field573 = 10000;
        if (!arg1) {
            class62.field952 = arg4;
            class42.field671 = 1;
            class337.field5185 = arg5;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 84)
    public final void method440(int arg0) {
        field684++;
        if (arg0 != 1906703368) {
            return;
        }
        while (true) {
            class320 var2 = this.field679.field4934;
            if (this.field679 == var2) {
                this.field688 = null;
                return;
            }
            var2.method2262((byte) -102);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)[F", line = 107)
    public static final float[] method441(boolean arg0, int arg1) {
        field680++;
        float var2 = class103.method897() + class103.method889();
        if (!arg0) {
            method446((byte) 13);
        }
        int var3 = class103.method895();
        float var4 = (float) ((var3 & 0xFFBFAA) >> 16) / 255.0F;
        class311.field4842[3] = 1.0F;
        float var5 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class311.field4842[0] = var2 * var6 * (float) class301.method2169(255, arg1 >> 16) / 255.0F * var4;
        class311.field4842[1] = var6 * (float) class301.method2169(255, arg1 >> 8) / 255.0F * var5 * var2;
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        class311.field4842[2] = var2 * (float) class301.method2169(arg1, 255) / 255.0F * var7 * var6;
        return class311.field4842;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Lia;", line = 135)
    public final class320 method442(byte arg0) {
        class320 var2 = this.field679.field4934;
        field695++;
        if (this.field679 == var2) {
            this.field688 = null;
            return null;
        }
        if (arg0 > -38) {
            field693 = 88;
        }
        this.field688 = var2.field4934;
        return var2;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I", line = 155)
    public final int method443(int arg0) {
        field682++;
        class320 var2 = this.field679.field4934;
        if (arg0 != -23800) {
            this.method438(true, (class320) null);
        }
        int var3 = 0;
        while (this.field679 != var2) {
            var3++;
            var2 = var2.field4934;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZIIZLqg;Lqg;)I", line = 188)
    public static final int method444(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, class316 arg5, class316 arg6) {
        field696++;
        int var7 = class349.method2452(arg4, arg6, arg2 ^ 0x12, arg0, arg5);
        if (arg2 != var7) {
            return arg4 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class349.method2452(arg1, arg6, 18, arg3, arg5);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 299)
    public class43() {
        this.field679.field4934 = this.field679;
        this.field679.field4928 = this.field679;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)Lia;", line = 224)
    public final class320 method445(int arg0) {
        class320 var2 = this.field679.field4934;
        field686++;
        if (arg0 != 2) {
            return (class320) null;
        } else if (this.field679 == var2) {
            return null;
        } else {
            var2.method2262((byte) -102);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V", line = 240)
    public static final void method446(byte arg0) {
        class138.field2284 = null;
        field691++;
        if (arg0 < 41) {
            method441(true, -63);
        }
        class333.method2344();
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V", line = 252)
    public static void method447(byte arg0) {
        if (arg0 != -100) {
            field689 = (class66) null;
        }
        field698 = null;
        field690 = null;
        field689 = null;
        field699 = null;
        field694 = null;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)Lia;", line = 276)
    public final class320 method448(int arg0) {
        class320 var2 = this.field688;
        field681++;
        if (this.field679 == var2) {
            this.field688 = null;
            return null;
        }
        this.field688 = var2.field4934;
        if (arg0 != 0) {
            this.method438(false, (class320) null);
        }
        return var2;
    }
}
