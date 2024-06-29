import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class217 {

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field3616 = 0;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field3620 = 0;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "[I")
    public static int[] field3619 = new int[14];

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public int field3625;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ[JI[I)V", line = 5)
    public static final void method1512(int arg0, boolean arg1, long[] arg2, int arg3, int[] arg4) {
        if (arg0 < arg3) {
            int var5 = arg0;
            int var6 = (arg0 + arg3) / 2;
            long var7 = arg2[var6];
            arg2[var6] = arg2[arg3];
            arg2[arg3] = var7;
            int var9 = arg4[var6];
            arg4[var6] = arg4[arg3];
            arg4[arg3] = var9;
            for (int var10 = arg0; var10 < arg3; var10++) {
                if (arg2[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var5];
                    arg2[var5] = var11;
                    int var13 = arg4[var10];
                    arg4[var10] = arg4[var5];
                    arg4[var5++] = var13;
                }
            }
            arg2[arg3] = arg2[var5];
            arg2[var5] = var7;
            arg4[arg3] = arg4[var5];
            arg4[var5] = var9;
            method1512(arg0, false, arg2, var5 - 1, arg4);
            method1512(var5 + 1, false, arg2, arg3, arg4);
        }
        if (arg1) {
            field3616 = -103;
        }
        field3624++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Z", line = 64)
    public final boolean method1513(int arg0) {
        if (arg0 != 8) {
            this.field3614 = -101;
        }
        field3611++;
        return (this.field3625 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 78)
    public static void method1514(int arg0) {
        field3619 = null;
        if (arg0 != -10080) {
            method1519(68);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lg;I)V", line = 89)
    public static final void method1515(class181 arg0, int arg1) {
        if (arg1 != 24411) {
            method1514(-17);
        }
        class181 var2 = class328.method2339(-76, arg0);
        field3622++;
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class287.field4696;
            var3 = class133.field2287;
        } else {
            var3 = var2.field3024;
            var4 = var2.field2972;
        }
        class227.method1581(true, arg0, var3, var4, false);
        class85.method649(arg0, 2, var3, var4);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)Z", line = 120)
    public final boolean method1516(byte arg0) {
        if (arg0 != -67) {
            this.field3625 = -117;
        }
        field3621++;
        return (this.field3625 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)Z", line = 135)
    public final boolean method1517(byte arg0) {
        if (arg0 == 106) {
            field3613++;
            return (this.field3625 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)Z", line = 151)
    public final boolean method1518(int arg0) {
        field3617++;
        if (arg0 <= 120) {
            return false;
        } else {
            return (this.field3625 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V", line = 163)
    public static final void method1519(int arg0) {
        int var1 = class358.field5699 * 128 + 64;
        field3618++;
        int var2 = class253.field4163 * 128 + 64;
        int var3 = class21.method189((byte) 64, var2, var1, class276.field4506) - class339.field5375;
        if (class14.field424 >= 100) {
            class16.field462 = class253.field4163 * 128 + 64;
            class223.field3693 = class358.field5699 * 128 + 64;
            class141.field2380 = class21.method189((byte) -114, class16.field462, class223.field3693, class276.field4506) - class339.field5375;
        } else {
            if (class141.field2380 < var3) {
                class141.field2380 += class55.field1088 + ((var3 - class141.field2380) * class14.field424 / 1000);
                if (class141.field2380 > var3) {
                    class141.field2380 = var3;
                }
            }
            if (class141.field2380 > var3) {
                class141.field2380 -= class55.field1088 + ((class141.field2380 - var3) * class14.field424 / 1000);
                if (class141.field2380 < var3) {
                    class141.field2380 = var3;
                }
            }
            if (var1 > class223.field3693) {
                class223.field3693 += class55.field1088 + ((var1 - class223.field3693) * class14.field424 / 1000);
                if (class223.field3693 > var1) {
                    class223.field3693 = var1;
                }
            }
            if (class223.field3693 > var1) {
                class223.field3693 -= class55.field1088 + ((class223.field3693 - var1) * class14.field424 / 1000);
                if (class223.field3693 < var1) {
                    class223.field3693 = var1;
                }
            }
            if (class16.field462 < var2) {
                class16.field462 += (var2 - class16.field462) * class14.field424 / 1000 + class55.field1088;
                if (class16.field462 > var2) {
                    class16.field462 = var2;
                }
            }
            if (var2 < class16.field462) {
                class16.field462 -= (class16.field462 - var2) * class14.field424 / 1000 + class55.field1088;
                if (class16.field462 < var2) {
                    class16.field462 = var2;
                }
            }
        }
        int var4 = class227.field3735 * 128 + 64;
        int var5 = class282.field4621 * 128 + 64;
        int var6 = class21.method189((byte) 101, var5, var4, class276.field4506) - class278.field4533;
        int var7 = var6 - class141.field2380;
        int var8 = var5 - class16.field462;
        int var9 = -35 % ((arg0 - 22) / 58);
        int var10 = var4 - class223.field3693;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var7, (double) var11) * 325.949D) & 0x7FF;
        int var13 = (int) (-325.949D * Math.atan2((double) var10, (double) var8)) & 0x7FF;
        int var14 = var13 - class18.field500;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class18.field500 += class251.field4122 * var14 / 1000 + class6.field208;
            class18.field500 &= 0x7FF;
        }
        if (var14 < 0) {
            class18.field500 -= class6.field208 + (-var14 * class251.field4122 / 1000);
            class18.field500 &= 0x7FF;
        }
        int var15 = var13 - class18.field500;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (var12 > class298.field4847) {
            class298.field4847 += (var12 - class298.field4847) * class251.field4122 / 1000 + class6.field208;
            if (class298.field4847 > var12) {
                class298.field4847 = var12;
            }
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class18.field500 = var13;
        }
        if (class298.field4847 > var12) {
            class298.field4847 -= (class298.field4847 - var12) * class251.field4122 / 1000 + class6.field208;
            if (class298.field4847 < var12) {
                class298.field4847 = var12;
            }
        }
    }
}
