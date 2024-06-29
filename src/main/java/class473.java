import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class473 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "B")
    public byte field6979;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "S")
    public short field6980;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lvd;")
    public class30 field6975;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "B")
    public byte field6976;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
    public static int[] field6973 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
    public static int[] field6978 = new int[13];

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Z")
    public static boolean field6974 = false;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field6982 = -1;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Ll;")
    public static class16 field6977;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "[S")
    public static short[] field6981;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V")
    public static final void method2860(int arg0, boolean arg1) {
        field6983++;
        class106.method876((byte) -109);
        if (class113.field1589 != 30 && class113.field1589 != 25) {
            return;
        }
        class6.field82++;
        if (class6.field82 < 50 && !arg1) {
            return;
        }
        if (arg0 >= -31) {
            method2863(55, 105, 124);
        }
        class6.field82 = 0;
        if (!class450.field6642 && class383.field5635 != null) {
            class32.method258(-92, class445.field6582);
            class47.field521++;
            try {
                class383.field5635.method650(class472.field6970.field827, 0, class472.field6970.field783, 127);
                class472.field6970.field827 = 0;
            } catch (IOException var2) {
                class450.field6642 = true;
            }
        }
        class106.method876((byte) -109);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
    public static final boolean method2861(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class299.field4291; var3++) {
            class413 var4 = class244.field3585[var3];
            if (var4.field6134 == 1) {
                int var5 = var4.field6122 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field6119 * var5 >> 8) + var4.field6126;
                    int var7 = (var4.field6137 * var5 >> 8) + var4.field6123;
                    int var8 = (var4.field6135 * var5 >> 8) + var4.field6136;
                    int var9 = (var4.field6130 * var5 >> 8) + var4.field6129;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field6134 == 2) {
                int var10 = arg0 - var4.field6122;
                if (var10 > 0) {
                    int var11 = (var4.field6119 * var10 >> 8) + var4.field6126;
                    int var12 = (var4.field6137 * var10 >> 8) + var4.field6123;
                    int var13 = (var4.field6135 * var10 >> 8) + var4.field6136;
                    int var14 = (var4.field6130 * var10 >> 8) + var4.field6129;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field6134 == 3) {
                int var15 = var4.field6126 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field6120 * var15 >> 8) + var4.field6122;
                    int var17 = (var4.field6125 * var15 >> 8) + var4.field6139;
                    int var18 = (var4.field6135 * var15 >> 8) + var4.field6136;
                    int var19 = (var4.field6130 * var15 >> 8) + var4.field6129;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field6134 == 4) {
                int var20 = arg2 - var4.field6126;
                if (var20 > 0) {
                    int var21 = (var4.field6120 * var20 >> 8) + var4.field6122;
                    int var22 = (var4.field6125 * var20 >> 8) + var4.field6139;
                    int var23 = (var4.field6135 * var20 >> 8) + var4.field6136;
                    int var24 = (var4.field6130 * var20 >> 8) + var4.field6129;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field6134 == 5) {
                int var25 = arg1 - var4.field6136;
                if (var25 > 0) {
                    int var26 = (var4.field6120 * var25 >> 8) + var4.field6122;
                    int var27 = (var4.field6125 * var25 >> 8) + var4.field6139;
                    int var28 = (var4.field6119 * var25 >> 8) + var4.field6126;
                    int var29 = (var4.field6137 * var25 >> 8) + var4.field6123;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method2862(byte arg0) {
        field6981 = null;
        if (arg0 != -14) {
            method2862((byte) -54);
        }
        field6978 = null;
        field6977 = null;
        field6973 = null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)Z")
    public static final boolean method2863(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field6972++;
            return class150.method1083(arg0, (byte) -91, arg1) & class27.method223(arg1, arg0, (byte) -32);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lvd;III)V")
    public class473(class30 arg0, int arg1, int arg2, int arg3) {
        this.field6979 = (byte) arg2;
        this.field6980 = (short) arg1;
        this.field6975 = arg0;
        this.field6976 = (byte) arg3;
    }
}
