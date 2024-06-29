import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class202 {

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    private int field3446 = -1;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    private int field3434 = 0;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lc;")
    private class331 field3440 = new class331();

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Z")
    public boolean field3451 = false;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[Lid;")
    private class282[] field3437;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "[[I")
    private int[][] field3447;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3441 = "M";

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field3442 = 0;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lgh;")
    public static class250 field3436;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Lde;", line = 9)
    public static final class70 method1518(int arg0, int arg1) {
        field3435++;
        class70 var2 = (class70) class102.field1645.method2400((long) arg0, arg1 ^ 0x63);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class37.field544.method441(false, 1, arg0);
        } else {
            var3 = class220.field3682.method441(false, 1, arg0 & 0x7FFF);
        }
        class70 var4 = new class70();
        if (var3 != null) {
            var4.method676((byte) -65, new class336(var3));
        }
        if (arg0 >= 32768) {
            var4.method669(32768);
        }
        class102.field1645.method2396(arg1 ^ arg1, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIIIIIII)V", line = 43)
    public static final void method1519(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3445++;
        int var8 = 0;
        int var9 = arg7 - arg1;
        int var10 = 0;
        int var11 = arg7 * arg7;
        int var12 = arg4;
        int var13 = arg4 * arg4;
        int var14 = var9 * var9;
        int var15 = arg4 - arg1;
        int var16 = var11 << 1;
        int var17 = var15 * var15;
        int var18 = var13 << 1;
        int var19 = var14 << 1;
        int var20 = var17 << 1;
        int var21 = var15 << 1;
        int var22 = (1 - var21) * var14 + var20;
        int var23 = arg4 << 1;
        int var24 = (1 - var23) * var11 + var18;
        int var25 = var17 - ((var21 - 1) * var19);
        if (arg0 != 34) {
            field3441 = (String) null;
        }
        int var26 = var13 - ((var23 - 1) * var16);
        int var27 = var11 << 2;
        int var28 = var14 << 2;
        int var29 = var13 << 2;
        int var30 = (var23 - 3) * var16;
        int var31 = var18 * 3;
        int var32 = var29;
        int var33 = var20 * 3;
        int var34 = (var21 - 3) * var19;
        int var35 = var17 << 2;
        int var36 = (arg4 - 1) * var27;
        int var37 = var35;
        int var38 = (var15 - 1) * var28;
        if (arg6 >= class90.field1428 && class135.field2358 >= arg6) {
            int[] var39 = class64.field1007[arg6];
            int var40 = class105.method899(false, class310.field4916, class170.field2944, arg3 - arg7);
            int var41 = class105.method899(false, class310.field4916, class170.field2944, arg3 + arg7);
            int var42 = class105.method899(false, class310.field4916, class170.field2944, arg3 - var9);
            int var43 = class105.method899(false, class310.field4916, class170.field2944, arg3 + var9);
            class317.method2184(var42, (byte) 109, var39, arg2, var40);
            class317.method2184(var43, (byte) -44, var39, arg5, var42);
            class317.method2184(var41, (byte) 126, var39, arg2, var43);
        }
        while (var12 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var26 += var32;
                    var8++;
                    var32 += var29;
                    var24 += var31;
                    var31 += var29;
                }
            }
            boolean var44 = var15 >= var12;
            if (var26 < 0) {
                var26 += var32;
                var32 += var29;
                var24 += var31;
                var31 += var29;
                var8++;
            }
            if (var44) {
                if (var22 < 0) {
                    while (var22 < 0) {
                        var10++;
                        var22 += var33;
                        var33 += var35;
                        var25 += var37;
                        var37 += var35;
                    }
                }
                if (var25 < 0) {
                    var10++;
                    var22 += var33;
                    var25 += var37;
                    var37 += var35;
                    var33 += var35;
                }
                var25 += -var34;
                var22 += -var38;
                var34 -= var28;
                var38 -= var28;
            }
            var12--;
            var26 += -var30;
            int var45 = arg6 - var12;
            var24 += -var36;
            int var46 = arg6 + var12;
            var36 -= var27;
            if (var46 >= class90.field1428 && class135.field2358 >= var45) {
                int var47 = class105.method899(false, class310.field4916, class170.field2944, arg3 + var8);
                int var48 = class105.method899(false, class310.field4916, class170.field2944, arg3 - var8);
                if (var44) {
                    int var49 = class105.method899(false, class310.field4916, class170.field2944, arg3 + var10);
                    int var50 = class105.method899(false, class310.field4916, class170.field2944, arg3 - var10);
                    if (class90.field1428 <= var45) {
                        int[] var51 = class64.field1007[var45];
                        class317.method2184(var50, (byte) 109, var51, arg2, var48);
                        class317.method2184(var49, (byte) 106, var51, arg5, var50);
                        class317.method2184(var47, (byte) 102, var51, arg2, var49);
                    }
                    if (class135.field2358 >= var46) {
                        int[] var52 = class64.field1007[var46];
                        class317.method2184(var50, (byte) -126, var52, arg2, var48);
                        class317.method2184(var49, (byte) -25, var52, arg5, var50);
                        class317.method2184(var47, (byte) -37, var52, arg2, var49);
                    }
                } else {
                    if (var45 >= class90.field1428) {
                        class317.method2184(var47, (byte) -9, class64.field1007[var45], arg2, var48);
                    }
                    if (var46 <= class135.field2358) {
                        class317.method2184(var47, (byte) 122, class64.field1007[var46], arg2, var48);
                    }
                }
            }
            var30 -= var27;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)[I", line = 259)
    public final int[] method1520(int arg0, int arg1) {
        if (arg0 != -1908965694) {
            field3442 = -47;
        }
        field3443++;
        if (this.field3449 == this.field3448) {
            this.field3451 = this.field3437[arg1] == null;
            this.field3437[arg1] = class119.field2066;
            return this.field3447[arg1];
        } else if (this.field3449 == 1) {
            this.field3451 = this.field3446 != arg1;
            this.field3446 = arg1;
            return this.field3447[0];
        } else {
            class282 var3 = this.field3437[arg1];
            if (var3 == null) {
                this.field3451 = true;
                if (this.field3434 >= this.field3449) {
                    class282 var4 = (class282) this.field3440.method2293(arg0 ^ 0x8E37463B);
                    var3 = new class282(arg1, var4.field4462);
                    this.field3437[var4.field4469] = null;
                    var4.method2195(-1);
                } else {
                    var3 = new class282(arg1, this.field3434);
                    this.field3434++;
                }
                this.field3437[arg1] = var3;
            } else {
                this.field3451 = false;
            }
            this.field3440.method2295(var3, (byte) -89);
            return this.field3447[var3.field4462];
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 322)
    public final void method1521(boolean arg0) {
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < this.field3449; var2++) {
            this.field3447[var2] = null;
        }
        this.field3437 = null;
        this.field3447 = (int[][]) null;
        this.field3440.method2302(128);
        field3439++;
        this.field3440 = null;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(III)V", line = 401)
    public class202(int arg0, int arg1, int arg2) {
        this.field3449 = arg0;
        this.field3448 = arg1;
        this.field3437 = new class282[this.field3448];
        this.field3447 = new int[this.field3449][arg2];
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)[[I", line = 346)
    public final int[][] method1522(int arg0) {
        field3450++;
        if (this.field3449 != this.field3448) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3449; var2++) {
            this.field3437[var2] = class119.field2066;
        }
        return this.field3447;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 382)
    public static void method1523(int arg0) {
        field3441 = null;
        field3436 = null;
        if (arg0 != 0) {
            field3436 = (class250) null;
        }
    }
}
