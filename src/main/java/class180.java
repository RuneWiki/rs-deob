import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class180 extends class182 {

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    private int field2958 = 4096;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    private int field2957 = 0;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "J")
    public static long field2962 = 0L;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2959 = " is already on your ignore list.";

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "F")
    public static float field2963;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "Lbn;")
    public static class75 field2960;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V", line = 13)
    public static void method1263(byte arg0) {
        field2960 = null;
        field2959 = null;
        if (arg0 != -28) {
            field2959 = (String) null;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 197)
    public class180() {
        super(1, false);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Loe;IB)V", line = 33)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field2964++;
        if (arg2 != 60) {
            return;
        }
        if (arg1 == 0) {
            this.field2957 = arg0.method989(85);
        } else if (arg1 == 1) {
            this.field2958 = arg0.method989(72);
        } else if (arg1 == 2) {
            this.field3154 = arg0.method1005((byte) 122) == 1;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[[I", line = 77)
    public final int[][] method122(int arg0, int arg1) {
        field2956++;
        int[][] var3 = this.field3152.method1953(arg0, 115);
        if (this.field3152.field4493) {
            int[][] var4 = this.method1291(arg0, (byte) 95, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class26.field672; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (this.field2957 > var13) {
                    var8[var11] = this.field2957;
                } else if (var13 > this.field2958) {
                    var8[var11] = this.field2958;
                } else {
                    var8[var11] = var13;
                }
                if (this.field2957 > var12) {
                    var10[var11] = this.field2957;
                } else if (this.field2958 >= var12) {
                    var10[var11] = var12;
                } else {
                    var10[var11] = this.field2958;
                }
                if (var14 < this.field2957) {
                    var9[var11] = this.field2957;
                } else if (this.field2958 < var14) {
                    var9[var11] = this.field2958;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        return arg1 == 4944 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)[I", line = 159)
    public final int[] method125(int arg0, int arg1) {
        int[] var3 = this.field3166.method775(arg1, arg0 + 123);
        if (this.field3166.field1903) {
            int[] var4 = this.method1292(arg1, 0, -73);
            for (int var5 = 0; var5 < class26.field672; var5++) {
                int var6 = var4[var5];
                if (this.field2957 > var6) {
                    var3[var5] = this.field2957;
                } else if (this.field2958 < var6) {
                    var3[var5] = this.field2958;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg0 != 2) {
            method1263((byte) -51);
        }
        field2955++;
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IBIZ[Lg;I)V", line = 204)
    public static final void method1264(int arg0, byte arg1, int arg2, boolean arg3, class181[] arg4, int arg5) {
        field2961++;
        if (arg1 != -44) {
            method1264(-116, (byte) 4, -30, true, (class181[]) null, 43);
        }
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class181 var7 = arg4[var6];
            if (var7 != null && var7.field2970 == arg5) {
                class227.method1581(true, var7, arg0, arg2, arg3);
                class85.method649(var7, 2, arg0, arg2);
                if (var7.field3035 > var7.field3019 - var7.field3024) {
                    var7.field3035 = var7.field3019 - var7.field3024;
                }
                if (var7.field3035 < 0) {
                    var7.field3035 = 0;
                }
                if (var7.field2992 > (var7.field3089 - var7.field2972)) {
                    var7.field2992 = var7.field3089 - var7.field2972;
                }
                if (var7.field2992 < 0) {
                    var7.field2992 = 0;
                }
                if (var7.field3098 == 0) {
                    class353.method2513(arg3, var7, 120);
                }
            }
        }
    }
}
