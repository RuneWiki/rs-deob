import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class143 extends class86 {

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Lbe;")
    public class283 field2378;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "[Lbe;")
    public static class283[] field2372 = new class283[200];

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Lbe;")
    public static class283 field2371 = class153.method941(126, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Lbe;")
    public static class283 field2370 = class153.method941(127, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Lgl;")
    public static class180 field2379;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V", line = 14)
    public static final void method896(int arg0) {
        field2377++;
        int var1 = 0;
        if (arg0 != 5) {
            field2370 = (class283) null;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class222.method1455(true, var2, class86.field1459, var3, var1, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V", line = 51)
    public static final void method897(byte arg0, int arg1) {
        field2369++;
        int var2 = 13 / ((arg0 - 87) / 38);
        class159.field2604 = arg1;
        class237.field3962 = -1;
        class237.field3962 = -1;
        class305.method2070(-1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Lsd;", line = 69)
    public static final class26 method898(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2627; var4++) {
            class26 var5 = var3.field2623[var4];
            if ((var5.field379 >> 29 & 0x3L) == 2L && var5.field398 == arg1 && var5.field394 == arg2) {
                class180.method1191(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V", line = 93)
    public static void method899(int arg0) {
        if (arg0 == -105) {
            field2372 = null;
            field2379 = null;
            field2370 = null;
            field2371 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 106)
    public static final void method900(boolean arg0) {
        class73.method487();
        class207.field3560 = new class39[7];
        field2375++;
        class207.field3560[1] = new class179();
        class207.field3560[2] = new class105();
        class207.field3560[3] = new class161();
        class207.field3560[4] = new class185();
        class207.field3560[5] = new class178();
        class207.field3560[6] = new class108();
        if (arg0) {
            method898(-19, 8, -6);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIB)V", line = 125)
    public static final void method901(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2374++;
        int var6 = arg1 - arg4;
        int var7 = arg2 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class26.method181(arg4, arg5 ^ 0xFFFFC7CC, arg2, arg0, arg3);
            }
        } else if (var7 == 0) {
            class18.method113(arg4, arg0, arg1, arg3, 0);
        } else {
            if (arg5 != 36) {
                field2370 = (class283) null;
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg4 < class269.field4551) {
                var11 = (class269.field4551 * var8 >> 12) + var9;
                var10 = class269.field4551;
            } else if (class166.field2765 < arg4) {
                var10 = class166.field2765;
                var11 = (class166.field2765 * var8 >> 12) + var9;
            } else {
                var10 = arg4;
                var11 = arg3;
            }
            int var12;
            int var13;
            if (arg1 < class269.field4551) {
                var12 = (class269.field4551 * var8 >> 12) + var9;
                var13 = class269.field4551;
            } else if (arg1 > class166.field2765) {
                var12 = var9 + (class166.field2765 * var8 >> 12);
                var13 = class166.field2765;
            } else {
                var12 = arg2;
                var13 = arg1;
            }
            if (class217.field3677 > var11) {
                var11 = class217.field3677;
                var10 = (class217.field3677 - var9 << 12) / var8;
            } else if (var11 > class247.field4220) {
                var10 = (class247.field4220 - var9 << 12) / var8;
                var11 = class247.field4220;
            }
            if (class217.field3677 > var12) {
                var12 = class217.field3677;
                var13 = (class217.field3677 - var9 << 12) / var8;
            } else if (class247.field4220 < var12) {
                var13 = (class247.field4220 - var9 << 12) / var8;
                var12 = class247.field4220;
            }
            class97.method647(var12, var13, arg0, (byte) 115, var10, var11);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V", line = 228)
    public static final void method902(int arg0, int arg1, int arg2) {
        class34.field511 = true;
        class79.field1363 = arg0;
        class36.field536 = arg1;
        class197.field3358 = arg2;
        class263.field4473 = -1;
        class27.field411 = -1;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V", line = 237)
    public static final void method903(byte arg0) {
        class167.method1035();
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        if (class1.field2 != null) {
            class60.method396(class1.field2, class150.field2460, -29204);
        }
        class1.field2 = null;
        field2376++;
        class202.method1291(0, (byte) 109);
        if (arg0 <= -92) {
            class245.method1669(false);
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 260)
    public class143() {
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lbe;I)V", line = 268)
    public class143(class283 arg0, int arg1) {
        this.field2378 = arg0;
    }
}
