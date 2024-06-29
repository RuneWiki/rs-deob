import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class158 extends class209 {

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "[J")
    private long[] field2361 = new long[10];

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    private int field2356 = 1;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    private int field2370 = 256;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    private int field2366 = 0;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "J")
    private long field2358 = class234.method1650((byte) -127);

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field2360 = 0;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2369 = "Loading textures - ";

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Lhb;")
    public static class35 field2359 = new class35(new byte[5000]);

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Llb;")
    public static class211 field2357;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Llb;Z)V", line = 5)
    public static final void method1140(class211 arg0, boolean arg1) {
        class113.field1775 = arg0;
        field2362++;
        if (arg1) {
            method1140((class211) null, true);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIII)V", line = 17)
    public static final void method1141(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class147 var5 = class92.method731(-29125, arg1, arg0);
        var5.method1095(73);
        var5.field2240 = arg3;
        var5.field2241 = arg4;
        field2363++;
        var5.field2249 = arg2;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 30)
    public final void method1142(byte arg0) {
        field2365++;
        if (arg0 != 61) {
            field2360 = 61;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2361[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIILng;ZI)V", line = 50)
    public static final void method1143(int arg0, int arg1, int arg2, class162 arg3, boolean arg4, int arg5) {
        field2364++;
        if (class111.field1754 >= 50 || arg3.field2420 == null || arg5 >= arg3.field2420.length || arg3.field2420[arg5] == null) {
            return;
        }
        int var6 = arg3.field2420[arg5][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0xFC) >> 5;
        int var9 = var6 & 0x1F;
        if (arg3.field2420[arg5].length > 1) {
            int var10 = (int) (Math.random() * (double) arg3.field2420[arg5].length);
            if (var10 > 0) {
                var7 = arg3.field2420[arg5][var10];
            }
        }
        if (var9 == 0) {
            if (arg4) {
                class193.method1397(var8, 0, -103, var7);
            }
        } else if (class238.field3618 != 0) {
            class54.field817[class111.field1754] = var7;
            class142.field2199[class111.field1754] = var8;
            class15.field179[class111.field1754] = 0;
            if (arg1 > 71) {
                class302.field4721[class111.field1754] = null;
                int var11 = (arg2 - 64) / 128;
                int var12 = (arg0 - 64) / 128;
                class133.field2096[class111.field1754] = (var11 << 16) + (var12 << 8) + var9;
                class111.field1754++;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)I", line = 108)
    public final int method1144(int arg0, int arg1, int arg2) {
        int var4 = this.field2370;
        this.field2370 = 300;
        int var5 = this.field2356;
        field2367++;
        this.field2356 = 1;
        this.field2358 = class234.method1650((byte) 67);
        if (this.field2361[this.field2368] == 0L) {
            this.field2370 = var4;
            this.field2356 = var5;
        } else if (this.field2358 > this.field2361[this.field2368]) {
            this.field2370 = (int) ((long) (arg2 * 2560) / (this.field2358 - this.field2361[this.field2368]));
        }
        if (this.field2370 < 25) {
            this.field2370 = 25;
        }
        if (this.field2370 > 256) {
            this.field2370 = 256;
            this.field2356 = (int) ((long) arg2 - ((this.field2358 - this.field2361[this.field2368]) / 10L));
        }
        if (arg2 < this.field2356) {
            this.field2356 = arg2;
        }
        this.field2361[this.field2368] = this.field2358;
        this.field2368 = (this.field2368 + 1) % 10;
        if (this.field2356 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2361[var6] != 0L) {
                    this.field2361[var6] -= -((long) this.field2356);
                }
            }
        }
        if (arg1 > this.field2356) {
            this.field2356 = arg1;
        }
        class97.method768((long) this.field2356, 107);
        if (arg0 != -223016735) {
            this.method1142((byte) 97);
        }
        int var7 = 0;
        while (this.field2366 < 256) {
            var7++;
            this.field2366 += this.field2370;
        }
        this.field2366 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 218)
    public class158() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2361[var1] = this.field2358;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 199)
    public static void method1145(int arg0) {
        field2357 = null;
        if (arg0 == 2560) {
            field2359 = null;
            field2369 = null;
        }
    }
}
