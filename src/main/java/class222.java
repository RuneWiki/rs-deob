import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class222 extends class139 {

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public int field3550 = -1;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public int field3548 = -1;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public int field3561 = 0;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public int field3554 = 0;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public int field3564 = 12800;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "Z")
    public boolean field3557 = true;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public int field3568 = 12800;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "Ljava/lang/String;")
    public String field3552;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Ljava/lang/String;")
    public String field3546;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Led;")
    public class187 field3556;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "Z")
    public static boolean field3567 = false;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Lhb;")
    public static class222 field3551;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Llc;")
    public static class86 field3553;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "Llc;")
    public static class86 field3562;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(Z)V")
    public static final void method1587(boolean arg0) {
        if (arg0) {
            class220.field3525 = class215.field3420;
            class220.field3533 = class241.field3841;
        } else {
            class220.field3525 = class205.field3288;
            class220.field3533 = class169.field2724;
        }
        class80.field1158 = class220.field3525.length;
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
    public final void method1588(int arg0) {
        this.field3568 = 12800;
        this.field3564 = 12800;
        field3558++;
        this.field3554 = 0;
        this.field3561 = 0;
        if (arg0 < 20) {
            return;
        }
        for (class184 var2 = (class184) this.field3556.method1384(2); var2 != null; var2 = (class184) this.field3556.method1388((byte) 124)) {
            if (this.field3561 < var2.field2971) {
                this.field3561 = var2.field2971;
            }
            if (var2.field2954 < this.field3564) {
                this.field3564 = var2.field2954;
            }
            if (var2.field2980 > this.field3554) {
                this.field3554 = var2.field2980;
            }
            if (this.field3568 > var2.field2960) {
                this.field3568 = var2.field2960;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1589(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3560++;
        class40.method306(arg3, arg0 ^ 0xFFFFFFD1);
        int var7 = 0;
        int var8 = arg3 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg3;
        if (arg0 != -47) {
            method1591(-70, 43L, true);
        }
        int var10 = var8;
        int var11 = -1;
        int var12 = -var8;
        int var13 = arg3;
        if (class207.field3328 <= arg6 && arg6 <= class228.field3657) {
            int[] var14 = class240.field3831[arg6];
            int var15 = class281.method1924(false, class211.field3386, class272.field4374, arg1 - arg3);
            int var16 = class281.method1924(false, class211.field3386, class272.field4374, arg1 + arg3);
            int var17 = class281.method1924(false, class211.field3386, class272.field4374, arg1 - var8);
            int var18 = class281.method1924(false, class211.field3386, class272.field4374, arg1 + var8);
            class177.method1330(var14, var15, arg5, 32232, var17);
            class177.method1330(var14, var17, arg4, 32232, var18);
            class177.method1330(var14, var18, arg5, 32232, var16);
        }
        int var19 = -1;
        while (var13 > var7) {
            var11 += 2;
            var9 += var11;
            var19 += 2;
            var12 += var19;
            if (var12 >= 0 && var10 >= 1) {
                var10--;
                var12 -= var10 << 1;
                class196.field3178[var10] = var7;
            }
            var7++;
            if (var9 >= 0) {
                var13--;
                var9 -= var13 << 1;
                int var20 = arg6 + var13;
                int var21 = arg6 - var13;
                if (class207.field3328 <= var20 && var21 <= class228.field3657) {
                    if (var13 < var8) {
                        int var22 = class196.field3178[var13];
                        int var23 = class281.method1924(false, class211.field3386, class272.field4374, arg1 + var7);
                        int var24 = class281.method1924(false, class211.field3386, class272.field4374, arg1 - var7);
                        int var25 = class281.method1924(false, class211.field3386, class272.field4374, arg1 + var22);
                        int var26 = class281.method1924(false, class211.field3386, class272.field4374, arg1 - var22);
                        if (var20 <= class228.field3657) {
                            int[] var27 = class240.field3831[var20];
                            class177.method1330(var27, var24, arg5, 32232, var26);
                            class177.method1330(var27, var26, arg4, 32232, var25);
                            class177.method1330(var27, var25, arg5, 32232, var23);
                        }
                        if (class207.field3328 <= var21) {
                            int[] var28 = class240.field3831[var21];
                            class177.method1330(var28, var24, arg5, 32232, var26);
                            class177.method1330(var28, var26, arg4, 32232, var25);
                            class177.method1330(var28, var25, arg5, 32232, var23);
                        }
                    } else {
                        int var29 = class281.method1924(false, class211.field3386, class272.field4374, arg1 + var7);
                        int var30 = class281.method1924(false, class211.field3386, class272.field4374, arg1 - var7);
                        if (var20 <= class228.field3657) {
                            class177.method1330(class240.field3831[var20], var30, arg5, arg0 + 32279, var29);
                        }
                        if (class207.field3328 <= var21) {
                            class177.method1330(class240.field3831[var21], var30, arg5, arg0 + 32279, var29);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (class207.field3328 <= var32 && class228.field3657 >= var31) {
                int var33 = arg1 - var13;
                int var34 = arg1 + var13;
                if (class272.field4374 <= var34 && class211.field3386 >= var33) {
                    int var35 = class281.method1924(false, class211.field3386, class272.field4374, var34);
                    int var36 = class281.method1924(false, class211.field3386, class272.field4374, var33);
                    if (var7 < var8) {
                        int var37 = var10 < var7 ? class196.field3178[var7] : var10;
                        int var38 = class281.method1924(false, class211.field3386, class272.field4374, arg1 + var37);
                        int var39 = class281.method1924(false, class211.field3386, class272.field4374, arg1 - var37);
                        if (class228.field3657 >= var32) {
                            int[] var40 = class240.field3831[var32];
                            class177.method1330(var40, var36, arg5, 32232, var39);
                            class177.method1330(var40, var39, arg4, arg0 + 32279, var38);
                            class177.method1330(var40, var38, arg5, arg0 ^ 0xFFFF8239, var35);
                        }
                        if (var31 >= class207.field3328) {
                            int[] var41 = class240.field3831[var31];
                            class177.method1330(var41, var36, arg5, 32232, var39);
                            class177.method1330(var41, var39, arg4, 32232, var38);
                            class177.method1330(var41, var38, arg5, 32232, var35);
                        }
                    } else {
                        if (var32 <= class228.field3657) {
                            class177.method1330(class240.field3831[var32], var36, arg5, 32232, var35);
                        }
                        if (var31 >= class207.field3328) {
                            class177.method1330(class240.field3831[var31], var36, arg5, 32232, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)[I")
    public final int[] method1590(int arg0, int arg1, int arg2) {
        field3547++;
        if (arg2 != 0) {
            this.field3563 = 59;
        }
        for (class184 var4 = (class184) this.field3556.method1384(2); var4 != null; var4 = (class184) this.field3556.method1388((byte) 102)) {
            if (var4.method1370(arg1, true, arg0)) {
                return var4.method1368(arg0, arg1, 126);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IJZ)V")
    public static final void method1591(int arg0, long arg1, boolean arg2) {
        field3549++;
        if (arg1 == 0L) {
            return;
        }
        if (class180.field2895 >= 100) {
            class172.method1276(0, "", (byte) 40, class143.field2297);
            return;
        }
        String var4 = class241.method1688(arg0 + 663816356, arg1);
        for (int var5 = 0; var5 < class180.field2895; var5++) {
            if (class81.field1177[var5] == arg1) {
                class172.method1276(0, "", (byte) 40, var4 + class55.field781);
                return;
            }
        }
        if (arg0 != -663816319) {
            field3567 = false;
        }
        for (int var6 = 0; var6 < class20.field222; var6++) {
            if (class57.field819[var6] == arg1) {
                class172.method1276(0, "", (byte) 40, class215.field3417 + var4 + class204.field3276);
                return;
            }
        }
        if (var4.equals(class186.field2993.field344)) {
            class172.method1276(0, "", (byte) 40, class288.field4578);
            return;
        }
        class81.field1177[class180.field2895] = arg1;
        class229.field3700[class180.field2895] = class104.method779(arg1, 14);
        class153.field2536[class180.field2895++] = arg2;
        class76.field1089 = class231.field3717;
        class155.field2549++;
        class220.field3532.method557(148, 8);
        class220.field3532.method1069(arg1, arg0 + 663816259);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI)Z")
    public final boolean method1592(int arg0, byte arg1, int arg2) {
        field3565++;
        if (arg1 < 54) {
            field3567 = true;
        }
        for (class184 var4 = (class184) this.field3556.method1384(2); var4 != null; var4 = (class184) this.field3556.method1388((byte) 96)) {
            if (var4.method1370(arg2, true, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)[I")
    public final int[] method1593(int arg0, int arg1, int arg2) {
        field3559++;
        if (arg2 > -48) {
            return null;
        }
        for (class184 var4 = (class184) this.field3556.method1384(2); var4 != null; var4 = (class184) this.field3556.method1388((byte) 92)) {
            if (var4.method1369(arg1, arg0, 4468)) {
                return var4.method1372(25392, arg1, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static void method1594(byte arg0) {
        field3562 = null;
        field3553 = null;
        field3551 = null;
        if (arg0 != -91) {
            method1594((byte) -92);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)[I")
    public final int[] method1595(int arg0, int arg1, int arg2, int arg3) {
        field3566++;
        if (arg3 != 12800) {
            this.field3552 = null;
        }
        for (class184 var5 = (class184) this.field3556.method1384(arg3 - 12798); var5 != null; var5 = (class184) this.field3556.method1388((byte) 119)) {
            if (var5.method1362(arg1, arg3 - 12798, arg0, arg2)) {
                return var5.method1368(arg1, arg0, 125);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class222(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3552 = arg2;
        this.field3546 = arg1;
        this.field3548 = arg4;
        this.field3545 = arg0;
        this.field3550 = arg6;
        this.field3557 = arg5;
        if (this.field3550 == 255) {
            this.field3550 = 0;
        }
        this.field3563 = arg3;
        this.field3556 = new class187();
    }
}
