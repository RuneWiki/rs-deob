import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class281 extends class126 {

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "Z")
    private boolean field4937 = false;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "Z")
    public boolean field4944 = false;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    private int field4942 = -32768;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    private int field4948 = 0;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    private int field4938 = 0;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public int field4947;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public int field4955;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    private int field4935;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public int field4953;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public int field4952;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public int field4950;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "Lfl;")
    private class241 field4954;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "Z")
    public static boolean field4940 = true;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Lmd;")
    private class221 field4934;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method1893(int arg0) {
        field4945++;
        int var1 = class223.field4069.field1571 + class48.field925;
        int var2 = class168.field3025 + class223.field4069.field1534;
        if (class85.field1684 - var1 < -500 || (class85.field1684 - var1) > 500 || (class137.field2562 - var2) < -500 || (class137.field2562 - var2) > 500) {
            class137.field2562 = var2;
            class85.field1684 = var1;
        }
        if (class85.field1684 != var1) {
            class85.field1684 += (var1 - class85.field1684) / 16;
        }
        if (arg0 != 21019) {
            field4940 = true;
        }
        if (class137.field2562 != var2) {
            class137.field2562 += (var2 - class137.field2562) / 16;
        }
        if (class69.field1319) {
            for (int var3 = 0; var3 < class159.field2896; var3++) {
                int var4 = class257.field4649[var3];
                if (var4 == 98) {
                    class28.field496 = class28.field496 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class28.field496 = class28.field496 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class253.field4565 = class253.field4565 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class253.field4565 = class253.field4565 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class228.field4153[98]) {
                class8.field154 += (12 - class8.field154) / 2;
            } else if (class228.field4153[99]) {
                class8.field154 += (-class8.field154 - 12) / 2;
            } else {
                class8.field154 /= 2;
            }
            class28.field496 += class8.field154 / 2;
            if (class228.field4153[96]) {
                class18.field364 += (-class18.field364 - 24) / 2;
            } else if (class228.field4153[97]) {
                class18.field364 += (24 - class18.field364) / 2;
            } else {
                class18.field364 /= 2;
            }
            class253.field4565 += class18.field364 / 2;
        }
        class237.method1634(-106);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    public final void method1894(int arg0, int arg1) {
        field4939++;
        if (this.field4944) {
            return;
        }
        this.field4948 += arg0;
        int var3 = -48 % ((-arg1 - 8) / 49);
        while (this.field4948 > this.field4954.field4344[this.field4938]) {
            this.field4948 -= this.field4954.field4344[this.field4938];
            this.field4938++;
            if (this.field4954.field4341.length <= this.field4938) {
                this.field4944 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIIJILmd;)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class221 arg10) {
        field4946++;
        class189 var13 = this.method1896(-128);
        if (var13 != null) {
            this.method1895(65, var13);
            var13.method208(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4934);
            this.field4942 = var13.method216();
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()I")
    public final int method216() {
        field4951++;
        return this.field4942;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V")
    public final void method214(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4936++;
        if (!this.field4937) {
            class189 var6 = this.method1896(-128);
            if (var6 == null) {
                return;
            }
            this.method1895(65, var6);
        }
        if (this.field4934 != null) {
            this.field4934.method1555(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILvc;)V")
    private final void method1895(int arg0, class189 arg1) {
        field4941++;
        class55 var3 = (class55) arg1;
        if ((this.field4934 == null || this.field4934.field4024) && (var3.field1090 != null || var3.field1091 != null)) {
            this.field4934 = new class221(class163.field2968, 1, 1);
        }
        if (this.field4934 != null) {
            this.field4934.method1560(var3.field1090, var3.field1091, false, var3.field1072, var3.field1116, var3.field1079);
        }
        if (arg0 != 65) {
            this.field4953 = 28;
        }
        this.field4937 = true;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Lvc;")
    private final class189 method1896(int arg0) {
        if (arg0 != -128) {
            return null;
        }
        class226 var2 = class259.method1797(98, this.field4935);
        field4949++;
        class189 var3;
        if (this.field4944) {
            var3 = var2.method1589(-1, (byte) -102);
        } else {
            var3 = var2.method1589(this.field4938, (byte) -102);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III[B)Lcc;")
    public static final class209 method1897(int arg0, int arg1, int arg2, byte[] arg3) {
        class209 var4 = new class209();
        if (arg2 != -29806) {
            method1897(-91, 31, 46, (byte[]) null);
        }
        field4943++;
        var4.field3786 = new byte[arg1];
        var4.field3811 = 0;
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field3786[var4.field3811++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIII)V")
    public class281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4947 = arg1;
        this.field4955 = arg4;
        this.field4935 = arg0;
        this.field4953 = arg3;
        this.field4952 = arg5 + arg6;
        this.field4950 = arg2;
        int var8 = class259.method1797(112, this.field4935).field4122;
        if (var8 == -1) {
            this.field4944 = true;
        } else {
            this.field4944 = false;
            this.field4954 = class245.method1706(var8, (byte) 127);
        }
    }
}
