import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class14 {

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "[I")
    private int[] field404;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lwb;")
    private static class130 field402 = class26.method212("M", -32376);

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lwb;")
    public static class130 field400 = class26.method212("blinken2:", -32376);

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lwb;")
    public static class130 field397 = class26.method212("(Z", -32376);

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "[I")
    public static int[] field409 = new int[500];

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lwb;")
    public static class130 field394 = class26.method212("Wordpack geladen)3", -32376);

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lwb;")
    public static class130 field396 = field402;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lwb;")
    public static class130 field393 = class26.method212("W-=hlen Sie eine Option", -32376);

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field411 = 0;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field403 = 0;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "[I")
    public static int[] field410 = new int[200];

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lqa;")
    public static class97 field406 = new class97(5000);

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Lwb;")
    private static class130 field412 = class26.method212("To", -32376);

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lwb;")
    public static class130 field413 = field412;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lwb;")
    private static class130 field415 = class26.method212("Please try again)3", -32376);

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Lwb;")
    public static class130 field414 = field415;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lqc;")
    public static class99 field405;

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([I)V", line = 38)
    public class14(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field404 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field404[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field404[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field404[var5 + var5] = arg0[var4];
            this.field404[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V", line = 80)
    public static final void method105(int arg0, int arg1, int arg2) {
        field401++;
        if (arg1 != -9674) {
            return;
        }
        long var3 = (long) ((arg2 << 16) + arg0);
        class99 var5 = (class99) class95.field2304.method78((byte) -21, var3);
        if (var5 != null) {
            class106.field2579.method458((byte) -102, var5);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 106)
    public static final void method106(byte arg0) {
        field407++;
        class117.field2904++;
        class72.method572(true, -8998);
        class33.method262(true, -18946);
        class72.method572(false, -8998);
        class33.method262(false, -18946);
        class18.method151(1);
        class47.method422(true);
        if (!class40.field1140) {
            int var1 = class72.field1850;
            int var2 = class3.field80 + class95.field2305 & 0x7FF;
            if (class8.field264 / 256 > var1) {
                var1 = class8.field264 / 256;
            }
            if (class84.field2016[4] && class112.field2757[4] + 128 > var1) {
                var1 = class112.field2757[4] + 128;
            }
            class69.method560(class128.field3022, var1 * 3 + 600, var1, class15.field444, class27.method219(336137319, class71.field1818, class42.field1179.field2128, class42.field1179.field2071) - 50, (byte) 112, var2);
        }
        int var3;
        if (class40.field1140) {
            var3 = class99.method739(-105);
        } else {
            var3 = class45.method413(true);
        }
        int var4 = class29.field815;
        int var5 = class103.field2528;
        int var6 = class58.field1465;
        int var7 = class10.field337;
        int var8 = class113.field2780;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class84.field2016[var9]) {
                int var10 = (int) ((double) -class45.field1221[var9] + Math.random() * (double) (class45.field1221[var9] * 2 + 1) + Math.sin((double) class31.field877[var9] / 100.0D * (double) class128.field3027[var9]) * (double) class112.field2757[var9]);
                if (var9 == 2) {
                    class58.field1465 += var10;
                }
                if (var9 == 3) {
                    class113.field2780 = class113.field2780 + var10 & 0x7FF;
                }
                if (var9 == 0) {
                    class103.field2528 += var10;
                }
                if (var9 == 1) {
                    class29.field815 += var10;
                }
                if (var9 == 4) {
                    class10.field337 += var10;
                    if (class10.field337 < 128) {
                        class10.field337 = 128;
                    }
                    if (class10.field337 > 383) {
                        class10.field337 = 383;
                    }
                }
            }
        }
        class84.method627(27800);
        class102.field2509 = true;
        class102.field2500 = class101.field2429 - 4;
        class102.field2517 = 0;
        class102.field2491 = class18.field483 - 4;
        class49.method433();
        class79.field1926.method310(class103.field2528, class29.field815, class58.field1465, class10.field337, class113.field2780, var3);
        class79.field1926.method284();
        class69.method561((byte) 116);
        class19.method178(true);
        ((class6) class12.field362).method41(-120, class31.field860);
        class129.method952(false);
        if (class33.field916 && class27.method222(true, (byte) 12, false) == 0) {
            class33.field916 = false;
        }
        if (class33.field916) {
            class84.method627(27800);
            class49.method433();
            class4.method30(null, false, (byte) 118, class45.field1228);
        }
        class29.method241(1);
        class29.field815 = var4;
        class58.field1465 = var6;
        class10.field337 = var7;
        if (arg0 < 112) {
            method105(82, 23, 60);
        }
        class113.field2780 = var8;
        class103.field2528 = var5;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 230)
    public static void method107(boolean arg0) {
        field397 = null;
        field402 = null;
        field406 = null;
        field412 = null;
        field405 = null;
        field414 = null;
        field394 = null;
        field413 = null;
        if (!arg0) {
            field396 = null;
        }
        field396 = null;
        field409 = null;
        field400 = null;
        field410 = null;
        field393 = null;
        field415 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)I", line = 265)
    public final int method108(int arg0, byte arg1) {
        if (arg1 != 122) {
            field400 = null;
        }
        field398++;
        int var3 = this.field404.length - 2;
        int var4 = var3 & arg0 << 1;
        while (true) {
            int var5 = this.field404[var4];
            if (arg0 == var5) {
                return this.field404[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIB)I", line = 296)
    public static final int method109(int arg0, int arg1, int arg2, byte arg3) {
        field408++;
        int var4 = arg0 / arg1;
        if (arg3 >= -124) {
            field400 = null;
        }
        int var5 = arg2 & arg1 - 1;
        int var6 = arg2 / arg1;
        int var7 = class103.method794(var4, var6, 90);
        int var8 = arg0 & arg1 - 1;
        int var9 = class103.method794(var4 + 1, var6, 78);
        int var10 = class103.method794(var4, var6 + 1, 96);
        int var11 = class103.method794(var4 + 1, var6 + 1, 90);
        int var12 = class20.method185(arg1, (byte) 74, var9, var7, var8);
        int var13 = class20.method185(arg1, (byte) 74, var11, var10, var8);
        return class20.method185(arg1, (byte) 74, var13, var12, var5);
    }
}
