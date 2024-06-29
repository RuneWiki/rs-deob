import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class32 extends class34 {

    @OriginalMember(owner = "mapview!r", name = "o", descriptor = "[J")
    private long[] field449 = new long[10];

    @OriginalMember(owner = "mapview!r", name = "s", descriptor = "I")
    private int field453 = 1;

    @OriginalMember(owner = "mapview!r", name = "t", descriptor = "I")
    private int field454 = 256;

    @OriginalMember(owner = "mapview!r", name = "v", descriptor = "I")
    private int field456 = 0;

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "J")
    private long field445 = class9.method37((byte) -109);

    @OriginalMember(owner = "mapview!r", name = "m", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "mapview!r", name = "n", descriptor = "I")
    public static int field448 = 50;

    @OriginalMember(owner = "mapview!r", name = "p", descriptor = "[I")
    public static int[] field450 = new int[128];

    @OriginalMember(owner = "mapview!r", name = "u", descriptor = "Lt;")
    public static class36 field455 = class3.method8(13631, "Estate Agent");

    @OriginalMember(owner = "mapview!r", name = "w", descriptor = "Lt;")
    public static class36 field457 = class3.method8(13631, "Key");

    @OriginalMember(owner = "mapview!r", name = "l", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "mapview!r", name = "q", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "mapview!r", name = "r", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(ZII)I", line = 5)
    public final int method182(boolean arg0, int arg1, int arg2) {
        int var4 = this.field454;
        int var5 = this.field453;
        this.field454 = 300;
        this.field453 = 1;
        this.field445 = class9.method37((byte) -46);
        if (this.field449[this.field446] == 0L) {
            this.field454 = var4;
            this.field453 = var5;
        } else if (this.field449[this.field446] < this.field445) {
            this.field454 = (int) ((long) (arg1 * 2560) / (this.field445 - this.field449[this.field446]));
        }
        if (this.field454 < 25) {
            this.field454 = 25;
        }
        if (this.field454 > 256) {
            this.field454 = 256;
            this.field453 = (int) ((long) arg1 - (this.field445 - this.field449[this.field446]) / 10L);
        }
        if (this.field453 > arg1) {
            this.field453 = arg1;
        }
        this.field449[this.field446] = this.field445;
        this.field446 = (this.field446 + 1) % 10;
        if (this.field453 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field449[var6] != 0L) {
                    this.field449[var6] += this.field453;
                }
            }
        }
        if (arg2 > this.field453) {
            this.field453 = arg2;
        }
        mapview.method140((long) this.field453, 108);
        int var7 = 0;
        if (arg0) {
            field451 = 0;
        }
        while (this.field456 < 256) {
            var7++;
            this.field456 += this.field454;
        }
        this.field456 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Z[BI)I", line = 78)
    public static final int method183(boolean arg0, byte[] arg1, int arg2) {
        if (arg0) {
            method184(-15);
        }
        return class34.method192(0, -1, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)V", line = 104)
    public static void method184(int arg0) {
        field457 = null;
        field450 = null;
        field455 = null;
        if (arg0 != 127) {
            method185(-59);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)V", line = 120)
    public static final void method185(int arg0) {
        class33 var1 = class20.field248;
        synchronized (class20.field248) {
            if (arg0 >= -19) {
                field451 = 10;
            }
            class29.field430 = class34.field474;
            if (class2.field16 >= 0) {
                while (class27.field409 != class2.field16) {
                    int var2 = field450[class27.field409];
                    class27.field409 = class27.field409 + 1 & 0x7F;
                    if (var2 < 0) {
                        class4.field32[~var2] = false;
                    } else {
                        class4.field32[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class4.field32[var3] = false;
                }
                class2.field16 = class27.field409;
            }
            class34.field474 = class2.field14;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "<init>", descriptor = "()V", line = 214)
    public class32() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field449[var1] = this.field445;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B)Z", line = 195)
    public static final boolean method186(byte arg0) {
        class33 var1 = class20.field248;
        synchronized (class20.field248) {
            if (class34.field474 == class29.field430) {
                return false;
            }
            class39.field521 = class26.field397[class29.field430];
            if (arg0 >= -61) {
                method186((byte) -77);
            }
            class41.field543 = class33.field460[class29.field430];
            class29.field430 = class29.field430 + 1 & 0x7F;
            return true;
        }
    }
}
