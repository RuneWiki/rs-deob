import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class203 extends class115 {

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public int field2955 = 0;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "Z")
    public static boolean field2966 = false;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2970 = null;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public int field2963;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Lsr;")
    public class351 field2950;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Ltd;")
    public class380 field2951;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "Ltd;")
    public class380 field2959;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "Lvi;")
    public class480 field2968;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "Lpf;")
    public class486 field2949;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "Z")
    public boolean field2964;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "[I")
    public int[] field2957;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 3)
    public final void method1333(int arg0) {
        field2965++;
        if (arg0 != -13076) {
            field2966 = true;
        }
        int var2 = this.field2967;
        if (this.field2949 != null) {
            class486 var3 = this.field2949.method2909((byte) 98, class307.field4619);
            if (var3 == null) {
                this.field2948 = 0;
                this.field2953 = 0;
                this.field2962 = 0;
                this.field2961 = 0;
                this.field2967 = -1;
                this.field2957 = null;
            } else {
                this.field2953 = var3.field7233;
                this.field2961 = var3.field7212;
                this.field2948 = var3.field7189;
                this.field2957 = var3.field7239;
                this.field2967 = var3.field7229;
                this.field2962 = var3.field7159 << 7;
            }
        } else if (this.field2950 != null) {
            int var4 = class275.method1716(true, this.field2950);
            if (var2 != var4) {
                this.field2967 = var4;
                class277 var5 = this.field2950.field5409;
                if (var5.field4148 != null) {
                    var5 = var5.method1734((byte) -128, class307.field4619);
                }
                if (var5 == null) {
                    this.field2953 = this.field2962 = 0;
                } else {
                    this.field2953 = var5.field4166;
                    this.field2962 = var5.field4156 << 7;
                }
            }
        } else if (this.field2968 != null) {
            this.field2967 = class457.method2655(this.field2968, arg0 + 13076);
            this.field2962 = this.field2968.field7071 << 7;
            this.field2953 = this.field2968.field7066;
        }
        if (this.field2967 != var2 && this.field2959 != null) {
            class176.field2598.method2372(this.field2959);
            this.field2959 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIIIIILep;I)Z", line = 97)
    public static final boolean method1334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class311 arg9, int arg10) {
        field2969++;
        int var11 = arg10;
        int var12 = arg8;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg10 - var13;
        class143.field2158[var13][var14] = 99;
        int var16 = arg8 - var14;
        class239.field3353[var13][var14] = 0;
        byte var17 = 0;
        class491.field7326[var17] = arg10;
        int var18 = 0;
        int var19 = 43 % ((arg3 + 16) / 33);
        byte var10001 = var17;
        int var27 = var17 + 1;
        class110.field1659[var10001] = arg8;
        int[][] var20 = arg9.field4819;
        while (var27 != var18) {
            var11 = class491.field7326[var18];
            var12 = class110.field1659[var18];
            int var21 = var11 - arg9.field4813;
            int var22 = var12 - arg9.field4820;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var11 - var15;
            int var24 = var12 - var16;
            if (arg5 == -4) {
                if (arg7 == var11 && arg1 == var12) {
                    class425.field6332 = var12;
                    class227.field3203 = var11;
                    return true;
                }
            } else if (arg5 == -3) {
                if (class482.method2882(var11, arg7, 1, var12, arg6, -101, arg1, 1, arg4)) {
                    class425.field6332 = var12;
                    class227.field3203 = var11;
                    return true;
                }
            } else if (arg5 == -2) {
                if (arg9.method1954(1, arg4, (byte) -86, var12, arg6, arg7, 1, arg0, arg1, var11)) {
                    class425.field6332 = var12;
                    class227.field3203 = var11;
                    return true;
                }
            } else if (arg5 == -1) {
                if (arg9.method1951(var12, true, var11, 1, arg4, arg6, arg0, arg1, arg7)) {
                    class227.field3203 = var11;
                    class425.field6332 = var12;
                    return true;
                }
            } else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
                if (arg9.method1955(var12, arg5, arg7, 1, -3, arg2, var11, arg1)) {
                    class425.field6332 = var12;
                    class227.field3203 = var11;
                    return true;
                }
            } else if (arg9.method1952(arg7, arg2, arg1, (byte) 102, var11, var12, 1, arg5)) {
                class227.field3203 = var11;
                class425.field6332 = var12;
                return true;
            }
            int var26 = class239.field3353[var23][var24] + 1;
            if (var23 > 0 && class143.field2158[var23 - 1][var24] == 0 && (var20[var21 - 1][var22] & 0x42240000) == 0) {
                class491.field7326[var27] = var11 - 1;
                class110.field1659[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class143.field2158[var23 - 1][var24] = 2;
                class239.field3353[var23 - 1][var24] = var26;
            }
            if (var23 < 127 && class143.field2158[var23 + 1][var24] == 0 && (var20[var21 + 1][var22] & 0x60240000) == 0) {
                class491.field7326[var27] = var11 + 1;
                class110.field1659[var27] = var12;
                class143.field2158[var23 + 1][var24] = 8;
                var27 = var27 + 1 & 0xFFF;
                class239.field3353[var23 + 1][var24] = var26;
            }
            if (var24 > 0 && class143.field2158[var23][var24 - 1] == 0 && (var20[var21][var22 - 1] & 0x40A40000) == 0) {
                class491.field7326[var27] = var11;
                class110.field1659[var27] = var12 - 1;
                class143.field2158[var23][var24 - 1] = 1;
                var27 = var27 + 1 & 0xFFF;
                class239.field3353[var23][var24 - 1] = var26;
            }
            if (var24 < 127 && class143.field2158[var23][var24 + 1] == 0 && (var20[var21][var22 + 1] & 0x48240000) == 0) {
                class491.field7326[var27] = var11;
                class110.field1659[var27] = var12 + 1;
                class143.field2158[var23][var24 + 1] = 4;
                var27 = var27 + 1 & 0xFFF;
                class239.field3353[var23][var24 + 1] = var26;
            }
            if (var23 > 0 && var24 > 0 && class143.field2158[var23 - 1][var24 - 1] == 0 && (var20[var21 - 1][var22 - 1] & 0x43A40000) == 0 && (var20[var21 - 1][var22] & 0x42240000) == 0 && (var20[var21][var22 - 1] & 0x40A40000) == 0) {
                class491.field7326[var27] = var11 - 1;
                class110.field1659[var27] = var12 - 1;
                class143.field2158[var23 - 1][var24 - 1] = 3;
                var27 = var27 + 1 & 0xFFF;
                class239.field3353[var23 - 1][var24 - 1] = var26;
            }
            if (var23 < 127 && var24 > 0 && class143.field2158[var23 + 1][var24 - 1] == 0 && (var20[var21 + 1][var22 - 1] & 0x60E40000) == 0 && (var20[var21 + 1][var22] & 0x60240000) == 0 && (var20[var21][var22 - 1] & 0x40A40000) == 0) {
                class491.field7326[var27] = var11 + 1;
                class110.field1659[var27] = var12 - 1;
                class143.field2158[var23 + 1][var24 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class239.field3353[var23 + 1][var24 - 1] = var26;
            }
            if (var23 > 0 && var24 < 127 && class143.field2158[var23 - 1][var24 + 1] == 0 && (var20[var21 - 1][var22 + 1] & 0x4E240000) == 0 && (var20[var21 - 1][var22] & 0x42240000) == 0 && (var20[var21][var22 + 1] & 0x48240000) == 0) {
                class491.field7326[var27] = var11 - 1;
                class110.field1659[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class143.field2158[var23 - 1][var24 + 1] = 6;
                class239.field3353[var23 - 1][var24 + 1] = var26;
            }
            if (var23 < 127 && var24 < 127 && class143.field2158[var23 + 1][var24 + 1] == 0 && (var20[var21 + 1][var22 + 1] & 0x78240000) == 0 && (var20[var21 + 1][var22] & 0x60240000) == 0 && (var20[var21][var22 + 1] & 0x48240000) == 0) {
                class491.field7326[var27] = var11 + 1;
                class110.field1659[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class143.field2158[var23 + 1][var24 + 1] = 12;
                class239.field3353[var23 + 1][var24 + 1] = var26;
            }
        }
        class227.field3203 = var11;
        class425.field6332 = var12;
        return false;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V", line = 351)
    public static void method1335(byte arg0) {
        field2970 = null;
        if (arg0 < 125) {
            field2970 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lkq;I)Z", line = 371)
    public static final boolean method1336(class78 arg0, int arg1) {
        int var2 = 51 / ((arg1 + 47) / 58);
        field2960++;
        return class242.field3371 == arg0 || class376.field5672 == arg0 || class436.field6429 == arg0 || class208.field3004 == arg0;
    }
}
