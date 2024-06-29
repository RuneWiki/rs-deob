import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class37 {

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field556 = 0;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[[I")
    public static int[][] field554;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method286(byte arg0, int arg1) {
        field562++;
        class262.field4256 = 0;
        class14.field220 = false;
        class207.field3298 = null;
        class249.field4022 = -1;
        class126.field1947 = 1;
        class185.field2928 = -1;
        class140.field2256 = arg1;
        int var2 = 92 / ((-arg0 - 28) / 45);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLva;Lva;Lva;Lva;)V", line = 24)
    public static final void method287(byte arg0, class36 arg1, class36 arg2, class36 arg3, class36 arg4) {
        field559++;
        class260.field4169 = arg1;
        int var5 = -87 % ((63 - arg0) / 56);
        class23.field349 = arg2;
        class216.field3487 = arg4;
        class50.field832 = arg3;
        class135.field2189 = new class134[class216.field3487.method258(-20811)][];
        class234.field3786 = new boolean[class216.field3487.method258(-20811)];
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIII)V", line = 45)
    public static final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field555++;
        if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
            if (!class64.method479(301989888) && (class111.field1707[0][arg3][arg6] & 0x2) == 0) {
                int var8 = arg4;
                if ((class111.field1707[arg4][arg3][arg6] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class119.field1862 != var8) {
                    return;
                }
            }
            int var9 = arg4;
            if (arg4 < 3 && (class111.field1707[1][arg3][arg6] & 0x2) == 2) {
                var9 = arg4 + 1;
            }
            class64.method476(arg7, arg4, 8, arg6, var9, class217.field3510[arg4], arg3);
            if (arg1 >= 0) {
                boolean var10 = class198.field3168;
                class198.field3168 = true;
                class3.method65(23421, arg2, arg3, arg1, arg5, arg6, false, arg4, false, var9, class217.field3510[arg4]);
                class198.field3168 = var10;
            }
        }
        if (arg0 != 0) {
            method292(-11);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIII)V", line = 95)
    public static final void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field563++;
        class237.field3801[0].method246(arg4, arg5);
        int var6 = (arg0 + arg2) * arg0 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        class237.field3801[1].method246(arg4, arg5 - (16 - arg0));
        int var7 = (arg0 - var6 - 32) * arg1 / (arg3 - arg0);
        class121.method811(arg4, arg5 + 16, 16, arg0 - 32, class207.field3302);
        class121.method811(arg4, arg5 + var7 + 16, 16, var6, class265.field4331);
        class121.method805(arg4, arg5 + var7 + 16, var6, class102.field1552);
        class121.method805(arg4 + 1, arg5 + 16 + var7, var6, class102.field1552);
        class121.method806(arg4, var7 + arg5 + 16, 16, class102.field1552);
        class121.method806(arg4, arg5 + var7 + 17, 16, class102.field1552);
        class121.method805(arg4 + 15, arg5 + var7 + 16, var6, class189.field2977);
        class121.method805(arg4 + 14, arg5 + var7 + 17, var6 - 1, class189.field2977);
        class121.method806(arg4, arg5 + var7 + var6 + 15, 16, class189.field2977);
        class121.method806(arg4 + 1, arg5 - -var7 + var6 + 14, 15, class189.field2977);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIIIII)V", line = 137)
    public static final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field561++;
        int var6 = arg0 - arg1;
        int var7 = arg2 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class209.method1311(arg3, arg0, arg5, 111, arg1);
            }
        } else if (var6 == 0) {
            class179.method1152(arg2, arg5, arg1, arg3, (byte) -61);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (arg4 <= 98) {
                field554 = (int[][]) ((int[][]) null);
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg3;
                int var10 = arg2;
                arg3 = arg1;
                arg1 = var9;
                arg2 = arg0;
                arg0 = var10;
            }
            if (arg3 > arg2) {
                int var11 = arg3;
                arg3 = arg2;
                arg2 = var11;
                int var12 = arg1;
                arg1 = arg0;
                arg0 = var12;
            }
            int var13 = arg1;
            int var14 = arg2 - arg3;
            int var15 = arg0 - arg1;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg0 <= arg1 ? -1 : 1;
            if (var8) {
                for (int var18 = arg3; var18 <= arg2; var18++) {
                    class256.field4113[var18][var13] = arg5;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg3; var19 <= arg2; var19++) {
                    class256.field4113[var13][var19] = arg5;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 255)
    public static void method291(byte arg0) {
        field554 = (int[][]) null;
        if (arg0 <= 59) {
            field554 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 275)
    public static final void method292(int arg0) {
        field558++;
        if (arg0 != 24100) {
            method290(60, -73, -119, 3, -76, 77);
        }
        class57.method427();
        for (int var1 = 0; var1 < 4; var1++) {
            class217.field3510[var1].method1748((byte) -68);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIIIIZ)V", line = 293)
    public class37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field557 = arg5;
        this.field560 = arg2;
    }
}
