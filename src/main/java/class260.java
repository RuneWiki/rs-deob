import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class260 extends class182 {

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Z")
    public static boolean field4362 = false;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "Ljava/util/Random;")
    public static Random field4371 = new Random();

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "[I")
    public static int[] field4372 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "Lpf;")
    public static class17 field4373 = new class17(30);

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
    public static int field4374 = -1;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "Lpf;")
    public static class17 field4375 = new class17(64);

    @OriginalMember(owner = "client!og", name = "db", descriptor = "I")
    public static int field4376 = 0;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field2896 = arg1.method1802((byte) 85) == 1;
        }
        ++field4367;
        if (arg0) {
            method1855(-88L, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!og", name = "j", descriptor = "(I)V")
    public static final void method1854(int arg0) {
        int var1 = 97 % ((-29 - arg0) / 32);
        ++field4370;
        class190.field3074.method97(96);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class260() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(JB)V")
    public static final void method1855(long arg0, byte arg1) {
        if (~class169.field2739 != -2 && class169.field2739 != 5) {
            if (class169.field2739 != 2) {
                if (~class169.field2739 != -5) {
                    class171.method1276((byte) -118);
                } else {
                    class180.method1311(arg1 ^ 119, arg0);
                }
            } else {
                class237.method1696(111);
            }
        } else {
            class277.method1942(0, arg0);
        }
        ++field4365;
        if (!class259.field4360) {
            if (~class313.field5033 == -1) {
                if (~class29.field490 != -1) {
                    class115.field1959 = class32.field526;
                    class289.field4764 = class298.field4870;
                } else {
                    class289.field4764 = class96.field1558;
                    class115.field1959 = class87.field1448;
                }
            } else {
                class289.field4764 = class171.field2769;
                class115.field1959 = field4376;
            }
            class195.field3154[0] = 1001;
            class287.field4747 = 1;
            class63.field1065[0] = class271.field4492;
            class100.field1588[0] = class221.field3718;
            class184.field2932[0] = "";
        }
        class139.method1024((long) class275.field4598);
        if (~class243.field4082 != 0) {
            class146.method1082(-111, class243.field4082);
        }
        for (int var3 = 0; var3 < class215.field3631; ++var3) {
            if (class143.field2351[var3]) {
                class236.field3988[var3] = true;
            }
            class13.field283[var3] = class143.field2351[var3];
            class143.field2351[var3] = false;
        }
        class147.field2423 = null;
        class73.field1281 = -1;
        class268.field4454 = null;
        class17.field344 = class275.field4598;
        class124.field2095 = -1;
        if (class243.field4082 != -1) {
            class215.field3631 = 0;
            class244.method1744(arg1 ^ 34);
        }
        class211.method1496();
        if (arg1 != 119) {
            field4374 = 1;
        }
        class94.method672(15413);
        if (class259.field4360) {
            if (class67.field1133) {
                class88.method615(false);
            } else {
                class73.method520((byte) 108);
            }
        } else if (class147.field2423 == null) {
            if (class124.field2095 != -1) {
                class312.method2108(class73.field1281, (class207) null, 0, class124.field2095);
            }
        } else {
            class312.method2108(class118.field1983, class147.field2423, 0, class173.field2788);
        }
        int var4 = !class259.field4360 ? class151.method1124(arg1 ^ 4976) : -1;
        if (var4 == -1) {
            var4 = class116.field1976;
        }
        class283.method1973(false, var4);
        if (class217.field3672 == 1) {
            class217.field3672 = 2;
        }
        if (~class121.field2028 == -2) {
            class121.field2028 = 2;
        }
        if (class227.field3842 == 3) {
            for (int var5 = 0; var5 < class215.field3631; ++var5) {
                if (!class13.field283[var5]) {
                    if (class236.field3988[var5]) {
                        class211.method1480(class180.field2877[var5], class298.field4867[var5], class17.field348[var5], class159.field2607[var5], 16711680, 128);
                    }
                } else {
                    class211.method1480(class180.field2877[var5], class298.field4867[var5], class17.field348[var5], class159.field2607[var5], 16711935, 128);
                }
            }
        }
        class89.method619(class182.field2898, class16.field314.field715, class19.field356, class16.field314.field771, 112);
        class19.field356 = 0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        int var3 = -49 % ((-64 - arg0) / 49);
        ++field4366;
        int[][] var4 = super.field2905.method50(arg1, (byte) 112);
        if (super.field2905.field158) {
            int[][] var5 = this.method1327(0, 0, arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var4[0];
            for (int var12 = 0; var12 < class4.field116; ++var12) {
                var11[var12] = -var6[var12] + 4096;
                var9[var12] = -var8[var12] + 4096;
                var10[var12] = 4096 - var7[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IC)Z")
    public static final boolean method1856(int arg0, char arg1) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field4364;
            return ~arg1 == -161 || ~arg1 == -33 || arg1 == '_';
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        int[] var3 = super.field2911.method77(arg1, -115);
        if (super.field2911.field287) {
            int[] var4 = this.method1323(0, -17707, arg1);
            for (int var5 = 0; var5 < class4.field116; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg0) {
            return null;
        } else {
            ++field4368;
            return var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lab;I)Ldh;")
    public static final class34 method1857(class249 arg0, int arg1) {
        ++field4361;
        if (arg1 != 7269) {
            field4362 = false;
        }
        return new class34(arg0.method1762(-1), arg0.method1762(-1), arg0.method1762(-1), arg0.method1762(arg1 + -7270), arg0.method1812((byte) 52), arg0.method1812((byte) 52), arg0.method1802((byte) -109));
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static void method1858(byte arg0) {
        field4372 = null;
        if (arg0 == -22) {
            field4375 = null;
            field4371 = null;
            field4373 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V")
    public static final void method1859(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field4363 = 82;
        }
        ++field4369;
        if (class96.field1554 != arg1) {
            class96.field1554 = arg1;
            class94.method674((byte) -82);
        }
    }
}
