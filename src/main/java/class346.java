import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class346 {

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    private int field5544 = -1;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    private int field5542 = 0;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Ljo;")
    private class150 field5550 = new class150();

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Z")
    public boolean field5556 = false;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    private int field5554;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[Lpg;")
    private class350[] field5541;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    private int field5555;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[[[I")
    private int[][][] field5552;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lui;")
    public static class98 field5540 = new class98(100);

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field5553 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lfa;")
    public static class102 field5545;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)[[I", line = 8)
    public final int[][] method2435(int arg0, boolean arg1) {
        field5546++;
        if (arg1) {
            return (int[][]) ((int[][]) null);
        } else if (this.field5555 == this.field5554) {
            this.field5556 = this.field5541[arg0] == null;
            this.field5541[arg0] = class68.field1053;
            return this.field5552[arg0];
        } else if (this.field5555 == 1) {
            this.field5556 = this.field5544 != arg0;
            this.field5544 = arg0;
            return this.field5552[0];
        } else {
            class350 var3 = this.field5541[arg0];
            if (var3 == null) {
                this.field5556 = true;
                if (this.field5555 > this.field5542) {
                    var3 = new class350(arg0, this.field5542);
                    this.field5542++;
                } else {
                    class350 var4 = (class350) this.field5550.method1086(27627);
                    var3 = new class350(arg0, var4.field5589);
                    this.field5541[var4.field5592] = null;
                    var4.method1131(8);
                }
                this.field5541[arg0] = var3;
            } else {
                this.field5556 = false;
            }
            this.field5550.method1078(var3, (byte) 119);
            return this.field5552[var3.field5589];
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZJ)V", line = 72)
    public static final void method2436(int arg0, boolean arg1, long arg2) {
        field5549++;
        int var4 = 103 / ((arg0 - 19) / 50);
        if (arg2 == 0L) {
            return;
        }
        if (class265.field4361 >= 100) {
            class147.method1047(false, class257.field4064, "", 0);
            return;
        }
        String var5 = class322.method2314(arg2, true);
        for (int var6 = 0; var6 < class265.field4361; var6++) {
            if (class76.field1144[var6] == arg2) {
                class147.method1047(false, var5 + class224.field3498, "", 0);
                return;
            }
        }
        for (int var7 = 0; var7 < class339.field5458; var7++) {
            if (class328.field5374[var7] == arg2) {
                class147.method1047(false, class214.field3265 + var5 + class146.field2355, "", 0);
                return;
            }
        }
        if (var5.equals(class329.field5388.field597)) {
            class147.method1047(false, class233.field3711, "", 0);
            return;
        }
        class76.field1144[class265.field4361] = arg2;
        class166.field2624[class265.field4361] = class329.method2344(2, arg2);
        class334.field5424[class265.field4361++] = arg1;
        class262.field4123++;
        class246.field3916 = class12.field157;
        class195.field2992.method250(21066, 65);
        class195.field2992.method2228(arg2, true);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 138)
    public static final void method2437(byte arg0) {
        field5539++;
        if (arg0 != 0) {
            return;
        }
        for (class167 var1 = (class167) class218.field3363.method27(121); var1 != null; var1 = (class167) class218.field3363.method34(8)) {
            int var2 = var1.field2631;
            if (class31.method266(var2, 1)) {
                class264[] var3 = class167.field2627[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field4276;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field2549;
                    class264 var7 = class94.method629(5386, var6);
                    if (var7 != null) {
                        class218.method1472((byte) 122, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 196)
    public final void method2438(int arg0) {
        for (int var2 = 0; var2 < this.field5555; var2++) {
            this.field5552[var2][0] = null;
            this.field5552[var2][1] = null;
            this.field5552[var2][2] = null;
            this.field5552[var2] = (int[][]) null;
        }
        if (arg0 != 19880) {
            return;
        }
        field5543++;
        this.field5541 = null;
        this.field5552 = (int[][][]) null;
        this.field5550.method1082(64);
        this.field5550 = null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)[[[I", line = 220)
    public final int[][][] method2439(int arg0) {
        field5548++;
        if (this.field5555 != this.field5554) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field5555; var2++) {
            this.field5541[var2] = class68.field1053;
        }
        return this.field5552;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIIII)V", line = 242)
    public static final void method2440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 1) {
            return;
        }
        field5547++;
        if (arg4 == arg7 && arg2 == arg5 && arg6 == arg9 && arg0 == arg1) {
            class139.method988(arg3 + 167490191, arg8, arg1, arg2, arg9, arg7);
            return;
        }
        int var10 = arg7;
        int var11 = arg2;
        int var12 = arg7 * 3;
        int var13 = arg2 * 3;
        int var14 = arg4 * 3;
        int var15 = arg6 * 3;
        int var16 = arg5 * 3;
        int var17 = arg0 * 3;
        int var18 = arg1 - var17 - (-var16 - -arg2);
        int var19 = var15 + var12 - var14 - var14;
        int var20 = var13 + var17 - (var16 + var16);
        int var21 = var14 + arg9 - arg7 - var15;
        int var22 = var16 - var13;
        int var23 = var14 - var12;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var21 * var26;
            int var28 = var19 * var25;
            int var29 = var18 * var26;
            int var30 = var20 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = arg2 + (var30 + var31 + var29 >> 12);
            int var34 = (var27 + var28 + var32 >> 12) + arg7;
            class139.method988(arg3 + 167490191, arg8, var33, var11, var34, var10);
            var11 = var33;
            var10 = var34;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 334)
    public static void method2441(int arg0) {
        field5545 = null;
        if (arg0 > 25) {
            field5540 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V", line = 363)
    public class346(int arg0, int arg1, int arg2) {
        this.field5554 = arg1;
        this.field5541 = new class350[this.field5554];
        this.field5555 = arg0;
        this.field5552 = new int[this.field5555][3][arg2];
    }
}
