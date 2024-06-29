import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class86 {

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field1192 = 0;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field1195 = 0;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field1196 = 0;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "Lie;")
    public static class138 field1193;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "Lir;")
    public static class185 field1188;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "Luh;")
    public static class414 field1201;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1194++;
        int var6 = class400.method2567(class157.field1981, class312.field4602, (byte) 29, arg5);
        int var7 = class400.method2567(class157.field1981, class312.field4602, (byte) 26, arg1);
        int var8 = class400.method2567(class240.field3368, class136.field1769, (byte) -15, arg0);
        int var9 = class400.method2567(class240.field3368, class136.field1769, (byte) 127, arg4);
        for (int var10 = var6; var10 <= var7; var10++) {
            class351.method2317(false, var9, class444.field6416[var10], var8, arg3);
        }
        if (arg2 != -1) {
            method701(false, 58, 95, -96, 90, -96, 67, 9, -41, -42);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 30)
    public static final void method697(byte arg0) {
        field1189++;
        class51 var1 = class159.field2043;
        synchronized (class159.field2043) {
            class159.field2043.method366(-96);
        }
        class51 var2 = class379.field5550;
        synchronized (class379.field5550) {
            int var3 = -108 % ((arg0 + 76) / 41);
            class379.field5550.method366(-123);
        }
        class51 var4 = class289.field4328;
        synchronized (class289.field4328) {
            class289.field4328.method366(25);
        }
        class51 var5 = class192.field2677;
        synchronized (class192.field2677) {
            class192.field2677.method366(-73);
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)I", line = 51)
    public final int method698(byte arg0) {
        int var2 = -59 % ((arg0 - 15) / 46);
        field1190++;
        return this.field1198 & 0x3FFF;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)V", line = 61)
    public final void method699(byte arg0, int arg1) {
        if (arg0 >= 88) {
            this.field1186 = 0;
            field1200++;
            this.field1198 = arg1;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 75)
    public static void method700(int arg0) {
        field1201 = null;
        field1188 = null;
        field1193 = null;
        if (arg0 != 5882) {
            field1195 = 32;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZIIIIIIIII)V", line = 93)
    public static final void method701(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg9 && arg3 == arg7 && arg5 == arg6 && arg2 == arg8) {
            class131.method941(arg6, arg8, arg9, (byte) 125, arg4, arg3);
        } else {
            int var10 = arg9;
            int var11 = arg3;
            int var12 = arg9 * 3;
            int var13 = arg3 * 3;
            int var14 = arg1 * 3;
            int var15 = arg7 * 3;
            int var16 = arg5 * 3;
            int var17 = arg2 * 3;
            int var18 = arg6 + var14 - var16 - arg9;
            int var19 = arg8 + var15 - arg3 - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg9;
                int var34 = (var30 + var32 + var28 >> 12) + arg3;
                class131.method941(var33, var34, var10, (byte) 104, arg4, var11);
                var10 = var33;
                var11 = var34;
            }
        }
        if (!arg0) {
            field1191++;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)Z", line = 172)
    public final boolean method702(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 10) {
            this.field1186 = 100;
        }
        field1197++;
        int var5 = this.field1186;
        if (this.field1198 == arg2 && this.field1186 == 0) {
            return false;
        }
        boolean var6;
        if (this.field1186 == 0) {
            if (this.field1198 < arg2 && arg2 <= (this.field1198 + arg0) || this.field1198 > arg2 && (this.field1198 - arg0) <= arg2) {
                this.field1198 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field1186 > 0 && this.field1198 < arg2) {
            int var7 = this.field1186 * this.field1186 / (arg0 * 2);
            int var8 = this.field1198 + var7;
            if (var8 < arg2 && var8 >= this.field1198) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field1186 < 0 && this.field1198 > arg2) {
            int var9 = this.field1186 * this.field1186 / (arg0 * 2);
            int var10 = this.field1198 - var9;
            if (var10 > arg2 && var10 <= this.field1198) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg2 > this.field1198) {
                this.field1186 += arg0;
                if (arg3 != 0 && this.field1186 > arg3) {
                    this.field1186 = arg3;
                }
            } else {
                this.field1186 -= arg0;
                if (arg3 != 0 && this.field1186 < (-arg3)) {
                    this.field1186 = -arg3;
                }
            }
            if (this.field1186 != var5) {
                int var11 = this.field1186 * this.field1186 / (arg0 * 2);
                if (arg2 > this.field1198) {
                    if (this.field1198 + var11 > arg2) {
                        this.field1186 = var5;
                    }
                } else if (arg2 < this.field1198 && this.field1198 - var11 < arg2) {
                    this.field1186 = var5;
                }
            }
        } else if (this.field1186 > 0) {
            this.field1186 -= arg0;
            if (this.field1186 < 0) {
                this.field1186 = 0;
            }
        } else {
            this.field1186 += arg0;
            if (this.field1186 > 0) {
                this.field1186 = 0;
            }
        }
        this.field1198 += this.field1186 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V", line = 311)
    public final void method703(int arg0) {
        field1185++;
        this.field1198 &= 0x3FFF;
        if (arg0 != 13150) {
            field1192 = -112;
        }
    }
}
