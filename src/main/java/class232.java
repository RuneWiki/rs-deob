import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class232 {

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public int field3629;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field3633 = 0;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3639 = "shake:";

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public int field3631;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lpa;")
    public class291 field3628;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[I")
    public int[] field3617;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "[I")
    public int[] field3621;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "[I")
    public int[] field3626;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
    public int[] field3632;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "[I")
    public int[] field3636;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "[I")
    public int[] field3637;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[Lpa;")
    public class291[] field3616;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[[I")
    public int[][] field3618;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[[I")
    public int[][] field3620;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLim;)V")
    public static final void method1522(byte arg0, class178 arg1) {
        field3622++;
        int var2 = 79 / ((85 - arg0) / 35);
        int var3 = arg1.field2694;
        if (var3 == 324) {
            if (class79.field1094 == -1) {
                class79.field1094 = arg1.field2649;
                class233.field3653 = arg1.field2633;
            }
            if (class190.field2881.field968) {
                arg1.field2649 = class79.field1094;
            } else {
                arg1.field2649 = class233.field3653;
            }
        } else if (var3 == 325) {
            if (class79.field1094 == -1) {
                class79.field1094 = arg1.field2649;
                class233.field3653 = arg1.field2633;
            }
            if (class190.field2881.field968) {
                arg1.field2649 = class233.field3653;
            } else {
                arg1.field2649 = class79.field1094;
            }
        } else if (var3 == 327) {
            arg1.field2627 = 150;
            arg1.field2569 = (int) (Math.sin((double) class35.field533 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2693 = -1;
            arg1.field2581 = 5;
        } else if (var3 == 328) {
            if (class250.field3905.field5053 == null) {
                arg1.field2635 = 0;
                arg1.field2693 = 0;
            } else {
                arg1.field2627 = 150;
                arg1.field2569 = (int) (Math.sin((double) class35.field533 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2581 = 5;
                arg1.field2693 = 2047;
                arg1.field2635 = class36.method248(class250.field3905.field5053, -128);
                arg1.field2562 = class250.field3905.field4128;
                arg1.field2681 = class250.field3905.field4080;
                arg1.field2558 = class250.field3905.field4102;
                arg1.field2566 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lam;IB)V")
    public static final void method1523(class314 arg0, int arg1, byte arg2) {
        if (arg2 <= 85) {
            return;
        }
        class309 var3 = (class309) class274.field4357.method1453(true, (long) arg1);
        field3627++;
        if (var3 == null) {
            class284.method1869(0, arg1, 28549, (class310) null, arg0.field4053[0], (class240) null, arg0.field4143[0], arg0, class166.field2364);
        } else {
            var3.method2100(true);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I[B)V")
    private final void method1524(int arg0, byte[] arg1) {
        class215 var3 = new class215(class151.method955(arg1, (byte) -80));
        field3624++;
        int var4 = var3.method1374((byte) -60);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3631 = 0;
        } else {
            this.field3631 = var3.method1383((byte) 18);
        }
        int var5 = var3.method1374((byte) -60);
        this.field3638 = var3.method1379(-75);
        this.field3636 = new int[this.field3638];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field3638; var8++) {
            this.field3636[var8] = var6 += var3.method1379(-78);
            if (var7 < this.field3636[var8]) {
                var7 = this.field3636[var8];
            }
        }
        if (arg0 != 7366) {
            this.method1524(8, (byte[]) null);
        }
        this.field3615 = var7 + 1;
        this.field3617 = new int[this.field3615];
        this.field3637 = new int[this.field3615];
        this.field3632 = new int[this.field3615];
        this.field3621 = new int[this.field3615];
        this.field3620 = new int[this.field3615][];
        if (var5 != 0) {
            this.field3626 = new int[this.field3615];
            for (int var9 = 0; var9 < this.field3615; var9++) {
                this.field3626[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3638; var10++) {
                this.field3626[this.field3636[var10]] = var3.method1383((byte) 79);
            }
            this.field3628 = new class291(this.field3626);
        }
        for (int var11 = 0; var11 < this.field3638; var11++) {
            this.field3637[this.field3636[var11]] = var3.method1383((byte) -90);
        }
        for (int var12 = 0; var12 < this.field3638; var12++) {
            this.field3632[this.field3636[var12]] = var3.method1383((byte) -120);
        }
        for (int var13 = 0; var13 < this.field3638; var13++) {
            this.field3617[this.field3636[var13]] = var3.method1379(-86);
        }
        for (int var14 = 0; var14 < this.field3638; var14++) {
            int var21 = 0;
            int var22 = this.field3636[var14];
            int var23 = this.field3617[var22];
            int var24 = -1;
            this.field3620[var22] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3620[var22][var25] = var21 += var3.method1379(class207.method1290(arg0, -7331));
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field3621[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field3620[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3618 = new int[var7 + 1][];
        this.field3616 = new class291[var7 + 1];
        for (int var15 = 0; var15 < this.field3638; var15++) {
            int var16 = this.field3636[var15];
            int var17 = this.field3617[var16];
            this.field3618[var16] = new int[this.field3621[var16]];
            for (int var18 = 0; var18 < this.field3621[var16]; var18++) {
                this.field3618[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3620[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3620[var16][var19];
                }
                this.field3618[var16][var20] = var3.method1383((byte) -104);
            }
            this.field3616[var16] = new class291(this.field3618[var16]);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    public static final void method1525(int arg0, int arg1) {
        if (arg0 != 0) {
            field3639 = null;
        }
        class143.field1964.method943(arg1, true);
        class119.field1706.method943(arg1, true);
        field3634++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3625++;
        if (arg3 == arg9 && arg7 == arg8 && arg5 == arg6 && arg1 == arg4) {
            class225.method1490(true, arg8, arg0, arg4, arg5, arg9);
        } else {
            int var10 = arg9;
            int var11 = arg8;
            int var12 = arg9 * 3;
            int var13 = arg8 * 3;
            int var14 = arg3 * 3;
            int var15 = arg7 * 3;
            int var16 = arg6 * 3;
            int var17 = arg1 * 3;
            int var18 = var14 + arg5 - arg9 - var16;
            int var19 = var15 + arg4 - var17 - arg8;
            int var20 = var13 + var17 - var15 - var15;
            int var21 = var15 - var13;
            int var22 = var12 + var16 - var14 - var14;
            int var23 = var14 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var22 * var25;
                int var28 = var18 * var26;
                int var29 = var19 * var26;
                int var30 = var20 * var25;
                int var31 = var23 * var24;
                int var32 = (var27 + var31 + var28 >> 12) + arg9;
                int var33 = var21 * var24;
                int var34 = (var29 + var30 + var33 >> 12) + arg8;
                class225.method1490(true, var11, arg0, var34, var32, var10);
                var11 = var34;
                var10 = var32;
            }
        }
        if (arg2 != 1385066284) {
            method1522((byte) -7, (class178) null);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
    public static final boolean method1527(int arg0, int arg1, String arg2, boolean arg3) {
        field3619++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg1 != -1) {
            method1528(35);
        }
        int var6 = arg2.length();
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg0) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var7 + var11;
            if (var10 / arg0 != var7) {
                return false;
            }
            var7 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "([BI)V")
    public class232(byte[] arg0, int arg1) {
        this.field3629 = class233.method1531(arg0.length, false, arg0);
        if (this.field3629 != arg1) {
            throw new RuntimeException();
        }
        this.method1524(7366, arg0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method1528(int arg0) {
        if (arg0 == -8431) {
            field3639 = null;
        }
    }
}
