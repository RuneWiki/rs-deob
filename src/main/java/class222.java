import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class class222 {

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3471 = -1;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "[I")
    public static int[] field3477 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lvj;")
    public static class106 field3467 = new class106(64);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public int field3466;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIZI)V", line = 6)
    public static final void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class177.field2642 = arg0;
        class53.field802 = arg2;
        class98.field1451 = arg1;
        if (arg3 != 16) {
            field3467 = (class106) null;
        }
        field3468++;
        class243.field3654 = arg4;
        class51.field791 = arg6;
        if (arg5 && class243.field3654 >= 100) {
            class311.field4845 = class53.field802 * 128 + 64;
            class220.field3455 = class51.field791 * 128 + 64;
            class294.field4628 = class294.method2080(899, class311.field4845, class220.field3455, class50.field775) - class177.field2642;
        }
        class78.field1104 = 2;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Z", line = 35)
    public final boolean method1583(int arg0) {
        if (arg0 != 9162) {
            method1582(-54, -108, 125, 103, -121, true, 51);
        }
        field3475++;
        return (this.field3472 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZ[I[I)V", line = 51)
    public static final void method1584(int arg0, int arg1, boolean arg2, int[] arg3, int[] arg4) {
        if (arg1 > arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; var9++) {
                if (arg4[var9] > (var7 + (var9 & 0x1))) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method1584(arg0, var6 - 1, false, arg3, arg4);
            method1584(var6 + 1, arg1, arg2, arg3, arg4);
        }
        field3479++;
        if (arg2) {
            method1582(-104, 121, -62, -55, 11, true, -67);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)J", line = 106)
    public static final long method1585(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        return var3 == null || var3.field1486 == null ? 0L : var3.field1486.field91;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V", line = 115)
    public static final void method1586(int arg0, int arg1, int arg2) {
        class45.field713 = class193.field3089 + class318.field4932 - arg2 - 1;
        class257.field3832 = arg1 - class69.field1018;
        int var3 = class257.field3832 - ((int) ((float) class253.field3774.field2890 / class79.field1111));
        field3470++;
        int var4 = class257.field3832 + ((int) ((float) class253.field3774.field2890 / class79.field1111));
        int var5 = class45.field713 - ((int) ((float) class253.field3774.field2904 / class79.field1111));
        if (var3 < 0) {
            class257.field3832 = (int) ((float) class253.field3774.field2890 / class79.field1111);
        }
        if (class87.field1280 < var4) {
            class257.field3832 = class87.field1280 - ((int) ((float) class253.field3774.field2890 / class79.field1111));
        }
        int var6 = (int) ((float) class253.field3774.field2904 / class79.field1111) + class45.field713;
        if (arg0 <= 119) {
            field3473 = 123;
        }
        if (var5 < 0) {
            class45.field713 = (int) ((float) class253.field3774.field2904 / class79.field1111);
        }
        if (class193.field3089 < var6) {
            class45.field713 = class193.field3089 - (int) ((float) class253.field3774.field2904 / class79.field1111);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Z", line = 149)
    public final boolean method1587(int arg0) {
        field3478++;
        if (arg0 > -32) {
            this.method1583(-45);
        }
        return (this.field3472 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)Z", line = 165)
    public final boolean method1588(int arg0) {
        field3469++;
        if (arg0 > -59) {
            this.method1587(-42);
        }
        return (this.field3472 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Z", line = 187)
    public final boolean method1589(int arg0) {
        field3476++;
        if (arg0 != -9100) {
            method1585(45, -1, 120);
        }
        return (this.field3472 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 198)
    public static final void method1590(boolean arg0) {
        field3480++;
        class57.field849.method1428(10935);
        class126.field1996.method1428(10935);
        if (arg0) {
            field3473 = 101;
        }
        class279.field4287.method1428(10935);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 216)
    public static void method1591(byte arg0) {
        field3467 = null;
        field3477 = null;
        if (arg0 != -98) {
            field3473 = 48;
        }
    }
}
