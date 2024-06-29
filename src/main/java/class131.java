import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class131 extends class116 {

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field2343 = 0;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Lma;")
    public static class105 field2344;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "[I")
    public int[] field2354;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "[I")
    private int[] field2356;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "[Lda;")
    private class275[] field2350;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "[[I")
    private int[][] field2357;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILij;[I)V")
    public final void method955(int arg0, class85 arg1, int[] arg2) {
        field2352++;
        if (this.field2356 == null) {
            return;
        }
        for (int var4 = 0; this.field2356.length > var4 && arg2.length > var4; var4++) {
            int var5 = class77.field1278[this.method956(-99, var4)];
            if (var5 > 0) {
                arg1.method590((long) arg2[var4], (byte) -42, var5);
            }
        }
        if (arg0 >= -46) {
            this.field2356 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)I")
    public final int method956(int arg0, int arg1) {
        field2353++;
        if (this.field2356 == null || arg1 < 0 || this.field2356.length < arg1) {
            return -1;
        } else {
            if (arg0 >= -67) {
                this.field2356 = null;
            }
            return this.field2356[arg1];
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lij;II)V")
    private final void method957(class85 arg0, int arg1, int arg2) {
        field2355++;
        if (arg1 == arg2) {
            this.field2350 = arg0.method599(-1).method1842((byte) 127, 60);
        } else if (arg2 == 2) {
            int var4 = arg0.method564((byte) 67);
            this.field2354 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2354[var5] = arg0.method608(class261.method1705(arg1, 98));
            }
            return;
        } else if (arg2 == 3) {
            int var6 = arg0.method564((byte) 67);
            this.field2356 = new int[var6];
            this.field2357 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method608(85);
                this.field2356[var7] = var8;
                this.field2357[var7] = new int[class185.field3170[var8]];
                for (int var9 = 0; var9 < class185.field3170[var8]; var9++) {
                    this.field2357[var7][var9] = arg0.method608(28);
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILij;)Lda;")
    public final class275 method958(int arg0, class85 arg1) {
        field2348++;
        if (arg0 > -90) {
            field2344 = null;
        }
        class275 var3 = class169.method1160(80, 103);
        if (this.field2356 != null) {
            for (int var4 = 0; var4 < this.field2356.length; var4++) {
                var3.method1835(this.field2350[var4], 0);
                var3.method1835(class30.method175(arg1.method576((byte) 126, class116.field2072[this.field2356[var4]]), this.field2357[var4], this.field2356[var4], (byte) -121), 0);
            }
        }
        var3.method1835(this.field2350[this.field2350.length - 1], 0);
        return var3.method1827(9151);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
    public final int method959(int arg0, int arg1, int arg2) {
        field2351++;
        int var4 = 21 / ((arg1 - 77) / 34);
        if (this.field2356 == null || arg2 < 0 || this.field2356.length < arg2) {
            return -1;
        } else if (this.field2357[arg2] == null || arg0 < 0 || arg0 > this.field2357[arg2].length) {
            return -1;
        } else {
            return this.field2357[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)Lh;")
    public static final class139 method960(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        return var3 == null ? null : var3.field50;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(ILij;)V")
    public final void method961(int arg0, class85 arg1) {
        while (true) {
            int var3 = arg1.method564((byte) 91);
            if (var3 == 0) {
                field2349++;
                int var4 = 87 / ((-arg0 - 57) / 42);
                return;
            }
            this.method957(arg1, 1, var3);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIZI)V")
    public static final void method962(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            field2343 = 44;
        }
        if (class246.field4355 <= arg4 && class96.field1632 >= arg4) {
            int var5 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg2);
            int var6 = class93.method673(class149.field2603, (byte) 45, class141.field2493, arg0);
            class135.method985(23284, var5, arg1, var6, arg4);
        }
        field2342++;
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V")
    public static void method963(int arg0) {
        field2344 = null;
        int var1 = -84 % ((arg0 + 63) / 59);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
    public final void method964(byte arg0) {
        if (this.field2354 != null) {
            for (int var2 = 0; var2 < this.field2354.length; var2++) {
                this.field2354[var2] = class246.method1612(this.field2354[var2], 32768);
            }
        }
        if (arg0 != -70) {
            this.method957((class85) null, 27, 106);
        }
        field2358++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Lda;")
    public final class275 method965(boolean arg0) {
        field2346++;
        class275 var2 = class169.method1160(80, 98);
        if (this.field2350 == null) {
            return class213.field3638;
        }
        var2.method1835(this.field2350[0], 0);
        int var3 = 1;
        if (arg0) {
            field2344 = null;
        }
        while (this.field2350.length > var3) {
            var2.method1835(class37.field607, 0);
            var2.method1835(this.field2350[var3], 0);
            var3++;
        }
        return var2.method1827(9151);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)I")
    public final int method966(byte arg0) {
        field2345++;
        if (this.field2356 == null) {
            return 0;
        } else if (arg0 == -97) {
            return this.field2356.length;
        } else {
            return 66;
        }
    }
}
