import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class238 {

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "Lwo;")
    private class52 field3351 = null;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "Lbs;")
    private class187 field3358;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "Z")
    private boolean field3366;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3341 = "Use";

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Ljava/awt/Frame;")
    public static Frame field3346;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "[Ljava/lang/Object;")
    private Object[] field3345;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3332;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Z")
    public final boolean method1451(int arg0, int arg1) {
        field3333++;
        if (!this.method1455((byte) 39)) {
            return false;
        } else if (this.field3351.field759.length == 1) {
            return this.method1462(arg1, 0, 105);
        } else if (!this.method1482(arg1, true)) {
            return false;
        } else if (arg0 > -109) {
            return false;
        } else if (this.field3351.field759[arg1] == 1) {
            return this.method1462(0, arg1, 105);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)V")
    public final void method1452(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1459(true);
        }
        field3361++;
        if (this.method1482(arg0, true) && this.field3332 != null) {
            this.field3332[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method1453(byte arg0, String arg1) {
        field3339++;
        if (arg0 != 58) {
            field3341 = null;
        }
        if (this.method1455((byte) 39)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3351.field775.method1768(124, class265.method1678((byte) 107, var3));
            return this.method1475(var4, (byte) 42);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static final void method1454(byte arg0) {
        field3331++;
        if (arg0 == -67) {
            class24.field417.method2102(class336.field4960, class413.field6165 ? class41.field643 + 256 : -1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Z")
    private final boolean method1455(byte arg0) {
        field3340++;
        if (this.field3351 == null) {
            this.field3351 = this.field3358.method1163(255);
            if (this.field3351 == null) {
                return false;
            }
            this.field3332 = new Object[this.field3351.field763][];
            this.field3345 = new Object[this.field3351.field763];
        }
        return arg0 == 39;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZZ)V")
    public final void method1456(int arg0, boolean arg1, boolean arg2) {
        field3360++;
        if (!this.method1455((byte) 39)) {
            return;
        }
        if (arg2) {
            this.field3351.field761 = null;
            this.field3351.field775 = null;
        }
        if (arg1) {
            this.field3351.field764 = null;
            this.field3351.field765 = null;
        }
        if (arg0 != -1) {
            field3341 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)[I")
    public final int[] method1457(byte arg0, int arg1) {
        field3338++;
        if (!this.method1482(arg1, true)) {
            return null;
        } else if (arg0 == -114) {
            int[] var3 = this.field3351.field769[arg1];
            if (var3 == null) {
                var3 = new int[this.field3351.field773[arg1]];
                int var4 = 0;
                while (var4 < var3.length) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static void method1458(boolean arg0) {
        field3341 = null;
        field3346 = null;
        if (arg0) {
            field3341 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)Z")
    public final boolean method1459(boolean arg0) {
        field3364++;
        if (!this.method1455((byte) 39)) {
            return false;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field3351.field771.length; var3++) {
            int var4 = this.field3351.field771[var3];
            if (this.field3345[var4] == null) {
                this.method1474(var4, 0);
                if (this.field3345[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)V")
    private final void method1460(int arg0, int arg1) {
        field3365++;
        if (arg0 != 0) {
            this.field3345 = null;
        }
        this.field3358.method1164(7355, arg1);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(BLjava/lang/String;)V")
    public final void method1461(byte arg0, String arg1) {
        if (arg0 < 115) {
            this.method1465((int[]) null, 97, -122, 37);
        }
        field3354++;
        if (this.method1455((byte) 39)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3351.field775.method1768(125, class265.method1678((byte) 127, var3));
            this.method1460(0, var4);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Z")
    public final boolean method1462(int arg0, int arg1, int arg2) {
        field3335++;
        if (!this.method1473(arg0, arg1, (byte) 88)) {
            return false;
        } else if (arg2 < 99) {
            return true;
        } else if (this.field3332[arg1] != null && this.field3332[arg1][arg0] != null) {
            return true;
        } else if (this.field3345[arg1] == null) {
            this.method1474(arg1, 0);
            return this.field3345[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I")
    public final int method1463(int arg0) {
        field3343++;
        if (!this.method1455((byte) 39)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3345.length; var4++) {
            if (this.field3351.field773[var4] > 0) {
                var2 += 100;
                var3 += this.method1483(var4, -122);
            }
        }
        if (var2 == 0) {
            return 100;
        }
        int var5 = var3 * 100 / var2;
        if (arg0 < 107) {
            this.method1464(false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V")
    public final void method1464(boolean arg0) {
        if (arg0) {
            this.method1480((byte) 100, -10);
        }
        field3334++;
        if (this.field3332 != null) {
            for (int var2 = 0; var2 < this.field3332.length; var2++) {
                this.field3332[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([IIII)Z")
    private final boolean method1465(int[] arg0, int arg1, int arg2, int arg3) {
        field3329++;
        if (!this.method1482(arg3, true)) {
            return false;
        } else if (this.field3345[arg3] == null) {
            return false;
        } else {
            int var5 = this.field3351.field773[arg3];
            int[] var6 = this.field3351.field769[arg3];
            if (this.field3332[arg3] == null) {
                this.field3332[arg3] = new Object[this.field3351.field759[arg3]];
            }
            Object[] var7 = this.field3332[arg3];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var11 = class28.method250(0, true, this.field3345[arg3]);
                class265 var12 = new class265(var11);
                var12.method1699((byte) 127, 5, var12.field3879.length, arg0);
            } else {
                var11 = class28.method250(0, false, this.field3345[arg3]);
            }
            int var13 = -56 / ((13 - arg1) / 50);
            byte[] var14;
            try {
                var14 = class316.method1969(var11, (byte) -91);
            } catch (RuntimeException var50) {
                throw class82.method519(var50, "T3 - " + (arg0 != null) + "," + arg3 + "," + var11.length + "," + class204.method1287(var11.length, var11, (byte) 20) + "," + class204.method1287(var11.length - 2, var11, (byte) 90) + "," + this.field3351.field782[arg3] + "," + this.field3351.field766);
            }
            if (this.field3366) {
                this.field3345[arg3] = null;
            }
            if (var5 <= 1) {
                int var16;
                if (var6 == null) {
                    var16 = 0;
                } else {
                    var16 = var6[0];
                }
                if (this.field3348 == 0) {
                    var7[var16] = class116.method804(var14, false, (byte) 122);
                } else {
                    var7[var16] = var14;
                }
            } else if (this.field3348 == 2) {
                int var17 = var14.length;
                int var51 = var17 - 1;
                int var18 = var14[var51] & 0xFF;
                int var19 = var51 - var5 * 4 * var18;
                class265 var20 = new class265(var14);
                int var21 = 0;
                var20.field3915 = var19;
                int var22 = 0;
                for (int var23 = 0; var23 < var18; var23++) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < var5; var25++) {
                        var24 += var20.method1666(-2);
                        int var26;
                        if (var6 == null) {
                            var26 = var25;
                        } else {
                            var26 = var6[var25];
                        }
                        if (arg2 == var26) {
                            var21 += var24;
                            var22 = var26;
                        }
                    }
                }
                if (var21 == 0) {
                    return true;
                }
                byte[] var27 = new byte[var21];
                int var28 = 0;
                var20.field3915 = var19;
                int var29 = 0;
                for (int var30 = 0; var30 < var18; var30++) {
                    int var31 = 0;
                    for (int var32 = 0; var32 < var5; var32++) {
                        var31 += var20.method1666(-2);
                        int var33;
                        if (var6 == null) {
                            var33 = var32;
                        } else {
                            var33 = var6[var32];
                        }
                        if (arg2 == var33) {
                            class111.method770(var14, var29, var27, var28, var31);
                            var28 += var31;
                        }
                        var29 += var31;
                    }
                }
                var7[var22] = var27;
            } else {
                int var34 = var14.length;
                int var52 = var34 - 1;
                int var35 = var14[var52] & 0xFF;
                int var36 = var52 - var5 * var35 * 4;
                class265 var37 = new class265(var14);
                var37.field3915 = var36;
                int[] var38 = new int[var5];
                for (int var39 = 0; var39 < var35; var39++) {
                    int var40 = 0;
                    for (int var41 = 0; var41 < var5; var41++) {
                        var40 += var37.method1666(-2);
                        var38[var41] += var40;
                    }
                }
                byte[][] var42 = new byte[var5][];
                for (int var43 = 0; var43 < var5; var43++) {
                    var42[var43] = new byte[var38[var43]];
                    var38[var43] = 0;
                }
                var37.field3915 = var36;
                int var44 = 0;
                for (int var45 = 0; var45 < var35; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var37.method1666(-2);
                        class111.method770(var14, var44, var42[var47], var38[var47], var46);
                        var44 += var46;
                        var38[var47] += var46;
                    }
                }
                for (int var48 = 0; var48 < var5; var48++) {
                    int var49;
                    if (var6 == null) {
                        var49 = var48;
                    } else {
                        var49 = var6[var48];
                    }
                    if (this.field3348 == 0) {
                        var7[var49] = class116.method804(var42[var48], false, (byte) 115);
                    } else {
                        var7[var49] = var42[var48];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(II)[B")
    public final byte[] method1466(int arg0, int arg1) {
        field3349++;
        if (!this.method1455((byte) 39)) {
            return null;
        } else if (this.field3351.field759.length == 1) {
            return this.method1472(arg0, 0, 0);
        } else if (this.method1482(arg0, true)) {
            int var3 = -60 / ((-arg1 - 50) / 53);
            if (this.field3351.field759[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method1472(0, arg0, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method1467(int arg0, String arg1) {
        field3350++;
        if (!this.method1455((byte) 39)) {
            return -1;
        }
        if (arg0 <= 94) {
            this.method1464(true);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3351.field775.method1768(127, class265.method1678((byte) 108, var3));
        return this.method1482(var4, true) ? var4 : -1;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "([IIII)[B")
    public final byte[] method1468(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 8610) {
            this.method1473(88, 50, (byte) -43);
        }
        field3336++;
        if (!this.method1473(arg3, arg1, (byte) 125)) {
            return null;
        }
        if (this.field3332[arg1] == null || this.field3332[arg1][arg3] == null) {
            boolean var5 = this.method1465(arg0, -75, arg3, arg1);
            if (!var5) {
                this.method1474(arg1, 0);
                boolean var6 = this.method1465(arg0, arg2 - 8506, arg3, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class28.method250(0, false, this.field3332[arg1][arg3]);
        if (this.field3348 == 1) {
            this.field3332[arg1][arg3] = null;
            if (this.field3351.field759[arg1] == 1) {
                this.field3332[arg1] = null;
            }
        } else if (this.field3348 == 2) {
            this.field3332[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)I")
    public final int method1469(byte arg0) {
        field3330++;
        if (this.method1455((byte) 39)) {
            int var2 = 76 / ((arg0 + 93) / 32);
            return this.field3351.field759.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1470(String arg0, int arg1) {
        field3359++;
        if (!this.method1455((byte) 39)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 == 0) {
            int var4 = this.field3351.field775.method1768(127, class265.method1678((byte) 125, var3));
            return this.method1483(var4, -97);
        } else {
            return -103;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method1471(int arg0, String arg1, String arg2) {
        field3363++;
        if (!this.method1455((byte) 39)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3351.field775.method1768(120, class265.method1678((byte) 121, var4));
        if (!this.method1482(var6, true)) {
            return false;
        }
        int var7 = this.field3351.field765[var6].method1768(99, class265.method1678((byte) 107, var5));
        if (arg0 != -1) {
            this.method1457((byte) -122, -57);
        }
        return this.method1462(var7, var6, 106);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)[B")
    public final byte[] method1472(int arg0, int arg1, int arg2) {
        field3362++;
        return arg2 == 0 ? this.method1468((int[]) null, arg1, 8610, arg0) : null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIB)Z")
    private final boolean method1473(int arg0, int arg1, byte arg2) {
        field3347++;
        if (!this.method1455((byte) 39)) {
            return false;
        }
        if (arg2 <= 82) {
            this.field3345 = null;
        }
        if (arg1 >= 0 && arg0 >= 0 && this.field3351.field759.length > arg1 && arg0 < this.field3351.field759[arg1]) {
            return true;
        } else if (class135.field1794) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(II)V")
    private final void method1474(int arg0, int arg1) {
        field3367++;
        if (this.field3366) {
            this.field3345[arg0] = this.field3358.method1165((byte) 108, arg0);
        } else {
            this.field3345[arg0] = class116.method804(this.field3358.method1165((byte) 100, arg0), false, (byte) 127);
        }
        if (arg1 != 0) {
            this.method1451(-19, 17);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)Z")
    public final boolean method1475(int arg0, byte arg1) {
        if (arg1 != 42) {
            return true;
        }
        field3368++;
        if (!this.method1482(arg0, true)) {
            return false;
        } else if (this.field3345[arg0] == null) {
            this.method1474(arg0, 0);
            return this.field3345[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IB)I")
    public final int method1476(int arg0, byte arg1) {
        field3352++;
        if (arg1 != -72) {
            this.method1483(-89, 95);
        }
        return this.method1482(arg0, true) ? this.field3351.field759[arg0] : 0;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
    public final int method1477(int arg0) {
        if (arg0 > -4) {
            this.method1483(17, 84);
        }
        field3353++;
        if (!this.method1455((byte) 39)) {
            throw new IllegalStateException("");
        }
        return this.field3351.field766;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
    public final byte[] method1478(String arg0, String arg1, byte arg2) {
        field3357++;
        if (!this.method1455((byte) 39)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3351.field775.method1768(106, class265.method1678((byte) 102, var4));
        if (this.method1482(var6, true)) {
            int var7 = 109 / ((21 - arg2) / 57);
            int var8 = this.field3351.field765[var6].method1768(112, class265.method1678((byte) 96, var5));
            return this.method1472(var8, var6, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1479(int arg0, String arg1) {
        field3344++;
        if (this.method1455((byte) 39)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3351.field775.method1768(102, class265.method1678((byte) 120, var3));
            return ~var4 <= arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(BI)I")
    public final int method1480(byte arg0, int arg1) {
        int var3 = -38 / ((42 - arg0) / 62);
        field3337++;
        if (this.method1455((byte) 39)) {
            int var4 = this.field3351.field775.method1768(102, arg1);
            return this.method1482(var4, true) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(Z)V")
    public final void method1481(boolean arg0) {
        if (this.field3345 != null) {
            for (int var2 = 0; var2 < this.field3345.length; var2++) {
                this.field3345[var2] = null;
            }
        }
        field3355++;
        if (!arg0) {
            method1458(true);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)Z")
    private final boolean method1482(int arg0, boolean arg1) {
        field3356++;
        if (!this.method1455((byte) 39)) {
            return false;
        }
        if (!arg1) {
            this.method1468((int[]) null, 67, -4, 113);
        }
        if (arg0 >= 0 && this.field3351.field759.length > arg0 && this.field3351.field759[arg0] != 0) {
            return true;
        } else if (class135.field1794) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(II)I")
    private final int method1483(int arg0, int arg1) {
        if (arg1 > -86) {
            return -55;
        }
        field3342++;
        if (this.method1482(arg0, true)) {
            return this.field3345[arg0] == null ? this.field3358.method1166((byte) 22, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lbs;ZI)V")
    public class238(class187 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field3358 = arg0;
        this.field3348 = arg2;
        this.field3366 = arg1;
    }
}
