import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class215 extends class55 {

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public int field2901 = -1;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public int field2902 = -1;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public int field2904;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public int field2907;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "[S")
    public static short[] field2897;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lni;)V")
    public static final void method1348(class360 arg0) {
        if (class249.field3300 < 65535) {
            class451 var1 = arg0.field4867;
            class37.field586[class249.field3300] = arg0;
            class118.field1709[class249.field3300] = false;
            ++class249.field3300;
            int var2 = arg0.field4850;
            if (arg0.field4859) {
                var2 = 0;
            }
            int var3 = arg0.field4850;
            if (arg0.field4852) {
                var3 = class508.field7055 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method2582((byte) 70) - var1.method2578(22477) + class497.field6892 >> class530.field7813;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method2582((byte) 70) + var1.method2578(22477) - class497.field6892 >> class530.field7813;
                if (var7 >= class318.field4170) {
                    var7 = class318.field4170 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field4868[var5++];
                    int var10 = (var1.method2577((byte) -68) - var1.method2578(22477) + class497.field6892 >> class530.field7813) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class439.field6036) {
                        var11 = class439.field6036 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class203.field2818[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class203.field2818[var4][var12][var8] = var13 | (long) class249.field3300;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class203.field2818[var4][var12][var8] = var13 | (long) class249.field3300 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class203.field2818[var4][var12][var8] = var13 | (long) class249.field3300 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class203.field2818[var4][var12][var8] = var13 | (long) class249.field3300 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method1349(int arg0) {
        if (arg0 != -1) {
            method1348((class360) null);
        }
        field2897 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLpc;)V")
    public static final void method1350(byte arg0, class473 arg1) {
        ++field2905;
        class116.field1648 = arg1;
        if (arg0 <= 66) {
            method1348((class360) null);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lqa;Z)V")
    public final void method334(class162 arg0, boolean arg1) {
        if (arg1) {
            ++field2906;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field2900;
        class414 var5 = arg2.method611();
        var5.method971(super.field864, super.field866, super.field861);
        class121 var6 = class127.field1852.method2390(46, this.field2904).method2784((class5) null, arg0, (class480) null, this.field2907, 0, arg2, (byte) -124, 131072, 0);
        if (var6 != null && var6.method847(arg3, arg1, var5, true)) {
            return true;
        } else {
            if (this.field2902 != -1) {
                class121 var7 = class127.field1852.method2390(120, this.field2902).method2784((class5) null, -1, (class480) null, this.field2899, 0, arg2, (byte) -124, 131072, 0);
                if (var7 != null && var7.method847(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            if (this.field2901 != -1) {
                class121 var8 = class127.field1852.method2390(106, this.field2901).method2784((class5) null, -1, (class480) null, this.field2903, 0, arg2, (byte) -124, 131072, 0);
                if (var8 != null && var8.method847(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(ILqa;)Lfm;")
    public final class514 method339(int arg0, class162 arg1) {
        ++field2898;
        class414 var3 = arg1.method611();
        if (arg0 != 9124) {
            this.method339(-90, (class162) null);
        }
        var3.method971(super.field864, super.field866, super.field861);
        class514 var4 = class148.method1020(0, 3);
        if (~this.field2901 != 0) {
            class121 var5 = class127.field1852.method2390(arg0 + -9020, this.field2901).method2784((class5) null, -1, (class480) null, this.field2903, 0, arg1, (byte) -124, 2048, 0);
            if (var5 != null) {
                var5.method853(var3, var4.field7563[2], 0);
            }
        }
        if (this.field2902 != -1) {
            class121 var6 = class127.field1852.method2390(arg0 + -9063, this.field2902).method2784((class5) null, -1, (class480) null, this.field2899, 0, arg1, (byte) -124, 2048, 0);
            if (var6 != null) {
                var6.method853(var3, var4.field7563[1], 0);
            }
        }
        class121 var7 = class127.field1852.method2390(121, this.field2904).method2784((class5) null, -1, (class480) null, this.field2907, 0, arg1, (byte) -124, 2048, 0);
        if (var7 != null) {
            var7.method853(var3, var4.field7563[0], 0);
        }
        return var4;
    }
}
