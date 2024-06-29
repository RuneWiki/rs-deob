import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class126 extends class262 {

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field2058 = 100;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "Loh;")
    public static class15 field2055;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "[Lje;")
    public static class70[] field2056;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V", line = 6)
    public static final void method864(int arg0) {
        field2049++;
        if (!class272.field4668) {
            return;
        }
        class264 var1 = class165.method1289(client.field4081, true, class214.field3535);
        if (arg0 < 110) {
            return;
        }
        if (var1 != null && var1.field4473 != null) {
            class124 var2 = new class124();
            var2.field2031 = var1.field4473;
            var2.field2039 = var1;
            class43.method297(3335, var2);
        }
        class272.field4668 = false;
        client.field4085 = -1;
        class164.method1280(false, var1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lwe;II)V", line = 35)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field2053++;
        if (arg2 == 0) {
            this.field4365 = arg0.method368(arg1 - 2152) == 1;
        }
        if (arg1 != 2048) {
            this.method38(48, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(II)Lwh;", line = 53)
    public static final class9 method865(int arg0, int arg1) {
        field2050++;
        class9 var2 = (class9) class296.field5035.method799((byte) 52, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class207.field3464.method92(4, 0, arg1);
        class9 var4 = new class9();
        if (var3 != null) {
            var4.method62(new class47(var3), arg0 ^ 0x7700, arg1);
        }
        if (arg0 == -30465) {
            class296.field5035.method797(var4, 0, (long) arg1);
            return var4;
        } else {
            return (class9) null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Leh;IIIIIIZ)V", line = 77)
    public static final void method866(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2766.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field2766[var9] - class82.field1311;
            int var11 = arg0.field2752[var9] - class298.field5066;
            int var12 = arg0.field2762[var9] - class287.field4923;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field2771 != null) {
                class162.field2764[var9] = var13;
                class162.field2756[var9] = var16;
                class162.field2763[var9] = var17;
            }
            class162.field2772[var9] = (var13 << 9) / var17 + class109.field1756;
            class162.field2753[var9] = (var16 << 9) / var17 + class109.field1744;
        }
        class109.field1748 = 0;
        int var19 = arg0.field2760.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field2760[var20];
            int var22 = arg0.field2751[var20];
            int var23 = arg0.field2769[var20];
            int var24 = class162.field2772[var21];
            int var25 = class162.field2772[var22];
            int var26 = class162.field2772[var23];
            int var27 = class162.field2753[var21];
            int var28 = class162.field2753[var22];
            int var29 = class162.field2753[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class143.field2385 && class146.method1087(class113.field1834 + class109.field1756, class206.field3419 + class109.field1744, var27, var28, var29, var24, var25, var26)) {
                    class157.field2652 = arg5;
                    class313.field5337 = arg6;
                }
                if (!class271.field4640 && !arg7) {
                    class109.field1755 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class109.field1758 || var25 > class109.field1758 || var26 > class109.field1758) {
                        class109.field1755 = true;
                    }
                    if (arg0.field2771 == null || arg0.field2771[var20] == -1) {
                        if (arg0.field2761[var20] != 12345678) {
                            class109.method725(var27, var28, var29, var24, var25, var26, arg0.field2761[var20], arg0.field2765[var20], arg0.field2758[var20]);
                        }
                    } else if (!class160.field2704) {
                        int var30 = class109.field1747.method833(false, arg0.field2771[var20]);
                        class109.method725(var27, var28, var29, var24, var25, var26, class114.method778(var30, arg0.field2761[var20]), class114.method778(var30, arg0.field2765[var20]), class114.method778(var30, arg0.field2758[var20]));
                    } else if (arg0.field2754) {
                        class109.method744(var27, var28, var29, var24, var25, var26, arg0.field2761[var20], arg0.field2765[var20], arg0.field2758[var20], class162.field2764[0], class162.field2764[1], class162.field2764[3], class162.field2756[0], class162.field2756[1], class162.field2756[3], class162.field2763[0], class162.field2763[1], class162.field2763[3], arg0.field2771[var20]);
                    } else {
                        class109.method744(var27, var28, var29, var24, var25, var26, arg0.field2761[var20], arg0.field2765[var20], arg0.field2758[var20], class162.field2764[var21], class162.field2764[var22], class162.field2764[var23], class162.field2756[var21], class162.field2756[var22], class162.field2756[var23], class162.field2763[var21], class162.field2763[var22], class162.field2763[var23], arg0.field2771[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)I", line = 194)
    public static final int method867(byte arg0) {
        if (arg0 != -56) {
            method867((byte) -105);
        }
        field2054++;
        return class75.field1217;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 211)
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)[I", line = 219)
    public final int[] method38(int arg0, byte arg1) {
        field2052++;
        if (arg1 >= -85) {
            this.method40((class47) null, -17, -60);
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 107);
        if (this.field4350.field3333) {
            int[] var4 = this.method1895(7, 0, arg0);
            for (int var5 = 0; var5 < class98.field1598; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)[[I", line = 260)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != 7) {
            method864(-48);
        }
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (this.field4347.field1202) {
            int[][] var4 = this.method1893(0, arg1, 108);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class98.field1598; var11++) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        field2057++;
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)V", line = 305)
    public static void method868(int arg0) {
        if (arg0 == 4096) {
            field2055 = null;
            field2056 = null;
        }
    }
}
