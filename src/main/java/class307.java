import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class307 {

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Lgk;")
    private class463 field3948;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "J")
    public long field3949;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Z")
    public static boolean field3955 = false;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "Lhb;")
    public static class250 field3950 = new class250(77, 3);

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        field3954++;
        this.field3948.method2789(0, this.field3949);
        super.finalize();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILeo;)V", line = 15)
    public static final void method1830(int arg0, int arg1, int arg2, class423 arg3) {
        if (arg0 != 16383) {
            method1833(-75, -94, 93);
        }
        if (class515.field7573) {
            class483 var4 = class227.field2931 == -1 ? null : class495.field7242.method1837(11, class227.field2931);
            if (client.method3037(arg3).method1631(119) && (class182.field2380 & 0x20) != 0 && (var4 == null || arg3.method2507(15967, var4.field7035, class227.field2931) != var4.field7035)) {
                class398.field5300++;
                class126.method793(arg3.field5734, 46, 0L, arg3.field5763, arg3.field5756, (byte) -5, false, class195.field2532 + " -> " + arg3.field5799, true, class257.field3252, class35.field543);
            }
        } else {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var9 = class290.method1751(var5, false, arg3);
                if (var9 != null) {
                    class126.method793(arg3.field5734, 1008, (long) (var5 + 1), arg3.field5763, arg3.field5756, (byte) -5, false, arg3.field5799, true, var9, class353.method2072(var5, arg3, -1));
                    class482.field7028++;
                }
            }
            String var6 = class517.method3072(94, arg3);
            if (var6 != null) {
                class283.field3613++;
                class126.method793(arg3.field5734, 45, 0L, arg3.field5763, arg3.field5756, (byte) -5, false, arg3.field5799, true, var6, arg3.field5723);
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var8 = class290.method1751(var7, false, arg3);
                if (var8 != null) {
                    class482.field7028++;
                    class126.method793(arg3.field5734, 18, (long) (var7 + 1), arg3.field5763, arg3.field5756, (byte) -5, false, arg3.field5799, true, var8, class353.method2072(var7, arg3, -1));
                }
            }
            if (client.method3037(arg3).method1629(17131)) {
                if (arg3.field5698 == null) {
                    class126.method793(arg3.field5734, 3, 0L, arg3.field5763, arg3.field5756, (byte) -5, false, "", true, class450.field6263.method1127(class379.field4920, false), -1);
                } else {
                    class126.method793(arg3.field5734, 3, 0L, arg3.field5763, arg3.field5756, (byte) -5, false, "", true, arg3.field5698, -1);
                }
                class64.field817++;
            }
        }
        field3951++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 92)
    public static void method1831(int arg0) {
        field3950 = null;
        int var1 = -53 % ((-arg0 - 66) / 41);
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 101)
    public static final void method1832(int arg0) {
        field3952++;
        int var1 = class524.field7766 * 128 + 64;
        int var2 = class517.field7619 * 128 + 64;
        int var3 = class366.method2145(class366.field4715, (byte) -122, var1, var2) - class5.field45;
        if (class125.field1719 < 100) {
            if (var1 > class299.field3885) {
                class299.field3885 += (var1 - class299.field3885) * class125.field1719 / 1000 + class382.field5039;
                if (var1 < class299.field3885) {
                    class299.field3885 = var1;
                }
            }
            if (class299.field3885 > var1) {
                class299.field3885 -= (class299.field3885 - var1) * class125.field1719 / 1000 + class382.field5039;
                if (var1 > class299.field3885) {
                    class299.field3885 = var1;
                }
            }
            if (var3 > class53.field730) {
                class53.field730 += (var3 - class53.field730) * class125.field1719 / 1000 + class382.field5039;
                if (var3 < class53.field730) {
                    class53.field730 = var3;
                }
            }
            if (class53.field730 > var3) {
                class53.field730 -= (class53.field730 - var3) * class125.field1719 / 1000 + class382.field5039;
                if (var3 > class53.field730) {
                    class53.field730 = var3;
                }
            }
            if (var2 > class291.field3724) {
                class291.field3724 += (var2 - class291.field3724) * class125.field1719 / 1000 + class382.field5039;
                if (var2 < class291.field3724) {
                    class291.field3724 = var2;
                }
            }
            if (class291.field3724 > var2) {
                class291.field3724 -= (class291.field3724 - var2) * class125.field1719 / 1000 + class382.field5039;
                if (class291.field3724 < var2) {
                    class291.field3724 = var2;
                }
            }
        } else {
            class291.field3724 = class517.field7619 * 128 + 64;
            class299.field3885 = class524.field7766 * 128 + 64;
            class53.field730 = class366.method2145(class366.field4715, (byte) -121, class299.field3885, class291.field3724) - class5.field45;
        }
        int var4 = class93.field1307 * 128 + 64;
        int var5 = class98.field1370 * 128 + 64;
        int var6 = class366.method2145(class366.field4715, (byte) 64, var4, var5) - class514.field7558;
        if (arg0 != 14235) {
            field3950 = null;
        }
        int var7 = var4 - class299.field3885;
        int var8 = var6 - class53.field730;
        int var9 = var5 - class291.field3724;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class430.field5935 < var11) {
            class430.field5935 += (var11 - class430.field5935 >> 3) * class93.field1304 / 1000 + class289.field3694 << 3;
            if (var11 < class430.field5935) {
                class430.field5935 = var11;
            }
        }
        if (class430.field5935 > var11) {
            class430.field5935 -= (class430.field5935 - var11 >> 3) * class93.field1304 / 1000 + class289.field3694 << 3;
            if (var11 > class430.field5935) {
                class430.field5935 = var11;
            }
        }
        int var13 = var12 - class261.field3319;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class261.field3319 += class93.field1304 * var14 / 1000 + class289.field3694 << 3;
            class261.field3319 &= 0x3FFF;
        }
        if (var14 < 0) {
            class261.field3319 -= -var14 * class93.field1304 / 1000 + class289.field3694 << 3;
            class261.field3319 &= 0x3FFF;
        }
        int var15 = var12 - class261.field3319;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class74.field927 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class261.field3319 = var12;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(III)Z", line = 264)
    public static final boolean method1833(int arg0, int arg1, int arg2) {
        field3953++;
        int var3 = -40 % ((68 - arg2) / 47);
        return (arg0 & 0x70000) != 0 | class250.method1566(arg1, arg0, -1) || class71.method404(arg0, (byte) 88, arg1);
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lgk;JI)V", line = 276)
    public class307(class463 arg0, long arg1, int arg2) {
        this.field3948 = arg0;
        this.field3949 = arg1;
    }
}
