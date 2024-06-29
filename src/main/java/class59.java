import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class59 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lsf;")
    public static class108 field877 = class140.method973(255, "leuchten1:");

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field883 = 5063219;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lsf;")
    public static class108 field879 = class140.method973(255, "http:)4)4");

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field885 = 0;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)V", line = 14)
    public static final void method403(int arg0, byte arg1, int arg2) {
        field887++;
        if (arg2 == 4 && !class60.field962) {
            arg2 = 2;
            arg0 = 2;
        }
        if (arg1 > -33) {
            field879 = (class108) null;
        }
        if (class26.field398 != arg2) {
            if (class1.field18) {
                return;
            }
            if (class26.field398 != 0) {
                class106.field1837[class26.field398].method223();
            }
            if (arg2 != 0) {
                class41 var3 = class106.field1837[arg2];
                var3.method220();
                var3.method219(arg0);
            }
            class103.field1799 = arg0;
            class26.field398 = arg2;
        } else if (arg2 != 0 && class103.field1799 != arg0) {
            class106.field1837[arg2].method219(arg0);
            class103.field1799 = arg0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 76)
    public static final void method405(int arg0) {
        int var1 = class70.field1084 * 128 + 64;
        field890++;
        int var2 = class284.field4967 * 128 + 64;
        int var3 = class45.method321(-119, var1, var2, class295.field5159) - class27.field415;
        if (class268.field4707 < 100) {
            if (class15.field193 < var2) {
                class15.field193 += (var2 - class15.field193) * class268.field4707 / 1000 + class128.field2188;
                if (class15.field193 > var2) {
                    class15.field193 = var2;
                }
            }
            if (var2 < class15.field193) {
                class15.field193 -= (class15.field193 - var2) * class268.field4707 / 1000 + class128.field2188;
                if (class15.field193 < var2) {
                    class15.field193 = var2;
                }
            }
            if (var3 > class42.field560) {
                class42.field560 += (var3 - class42.field560) * class268.field4707 / 1000 + class128.field2188;
                if (class42.field560 > var3) {
                    class42.field560 = var3;
                }
            }
            if (var1 > class255.field4443) {
                class255.field4443 += (var1 - class255.field4443) * class268.field4707 / 1000 + class128.field2188;
                if (class255.field4443 > var1) {
                    class255.field4443 = var1;
                }
            }
            if (var1 < class255.field4443) {
                class255.field4443 -= (class255.field4443 - var1) * class268.field4707 / 1000 + class128.field2188;
                if (class255.field4443 < var1) {
                    class255.field4443 = var1;
                }
            }
            if (class42.field560 > var3) {
                class42.field560 -= (class42.field560 - var3) * class268.field4707 / 1000 + class128.field2188;
                if (class42.field560 < var3) {
                    class42.field560 = var3;
                }
            }
        } else {
            class255.field4443 = class70.field1084 * 128 + 64;
            class15.field193 = class284.field4967 * 128 + 64;
            class42.field560 = class45.method321(117, class255.field4443, class15.field193, class295.field5159) - class27.field415;
        }
        int var4 = class15.field197 * 128 + 64;
        int var5 = class117.field2026 * 128 + 64;
        int var6 = class45.method321(124, var4, var5, class295.field5159) - class52.field771;
        int var7 = var5 - class15.field193;
        int var8 = 93 % ((arg0 - 35) / 62);
        int var9 = var4 - class255.field4443;
        int var10 = var6 - class42.field560;
        int var11 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var12 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
        if (var12 < 128) {
            var12 = 128;
        }
        int var13 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        if (var12 > 383) {
            var12 = 383;
        }
        int var14 = var13 - class330.field5640;
        if (var12 > class135.field2346) {
            class135.field2346 += class178.field3232 + ((var12 - class135.field2346) * class135.field2343 / 1000);
            if (var12 < class135.field2346) {
                class135.field2346 = var12;
            }
        }
        if (var12 < class135.field2346) {
            class135.field2346 -= (class135.field2346 - var12) * class135.field2343 / 1000 + class178.field3232;
            if (var12 > class135.field2346) {
                class135.field2346 = var12;
            }
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class330.field5640 += class135.field2343 * var14 / 1000 + class178.field3232;
            class330.field5640 &= 0x7FF;
        }
        if (var14 < 0) {
            class330.field5640 -= -var14 * class135.field2343 / 1000 + class178.field3232;
            class330.field5640 &= 0x7FF;
        }
        int var15 = var13 - class330.field5640;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class330.field5640 = var13;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 235)
    public static void method406(int arg0) {
        field879 = null;
        if (arg0 != 19064) {
            method405(5);
        }
        field877 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)Z", line = 250)
    public static final boolean method407(int arg0, byte arg1) {
        class196.field3542 = arg0 + 1 & 0xFFFF;
        class16.field204 = true;
        field880++;
        if (arg1 >= -33) {
            method406(8);
        }
        return true;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    public abstract void method402(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public abstract void method404(int arg0, int arg1);
}
