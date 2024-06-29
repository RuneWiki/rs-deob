import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public abstract class class657 {

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "Luf;")
    public static class445 field9242 = new class445();

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "Z")
    public static boolean field9249 = false;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public int field9240;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
    public int field9244;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    public int field9247;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
    public static int field9248;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method3699(int arg0) {
        field9246++;
        if (arg0 != 0) {
            method3705((byte) -94);
        }
        return (this.field9240 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)[I", line = 20)
    public static final int[] method3700(byte arg0) {
        field9245++;
        if (arg0 < 50) {
            field9242 = null;
        }
        return new int[] { class299.field4155, class590.field8281, class515.field7339 };
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)Z", line = 33)
    public final boolean method3701(int arg0) {
        if (arg0 == -24460) {
            field9241++;
            return (this.field9240 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)Z", line = 45)
    public final boolean method3702(int arg0) {
        if (arg0 < 61) {
            return false;
        } else {
            field9248++;
            return (this.field9240 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZILak;)V", line = 72)
    public static final void method3703(boolean arg0, int arg1, class349 arg2) {
        field9243++;
        if (class409.field5682 >= 400) {
            return;
        }
        if (class468.field6748 != arg2) {
            String var3;
            if (arg2.field4910 == 0) {
                boolean var4 = true;
                if (class468.field6748.field4914 != -1 && arg2.field4914 != -1) {
                    int var5 = arg2.field4903 >= class468.field6748.field4903 ? arg2.field4903 : class468.field6748.field4903;
                    int var6 = arg2.field4914 > class468.field6748.field4914 ? class468.field6748.field4914 : arg2.field4914;
                    int var7 = (var5 * 10 / 100) + var6 + 5;
                    int var8 = class468.field6748.field4903 - arg2.field4903;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class696.field9784 == class649.field9170 ? class281.field3971.method1839((byte) 45, class744.field10426) : class281.field3969.method1839((byte) 45, class744.field10426);
                if (arg2.field4903 < arg2.field4927) {
                    var3 = arg2.method2192(true, -32526) + (var4 ? class127.method986((byte) 119, arg2.field4903, class468.field6748.field4903) : "<col=ffffff>") + " (" + var9 + arg2.field4903 + "+" + (arg2.field4927 - arg2.field4903) + ")";
                } else {
                    var3 = arg2.method2192(true, -32526) + (var4 ? class127.method986((byte) 123, arg2.field4903, class468.field6748.field4903) : "<col=ffffff>") + " (" + var9 + arg2.field4903 + ")";
                }
            } else if (arg2.field4910 == -1) {
                var3 = arg2.method2192(true, arg1 - 32526);
            } else {
                var3 = arg2.method2192(true, -32526) + " (" + class281.field3970.method1839((byte) 45, class744.field10426) + arg2.field4910 + ")";
            }
            if (class737.field10375 && !arg0 && (class464.field6709 & 0x8) != 0) {
                class716.field10012++;
                class673.method3807((long) arg2.field931, class623.field8966 + " -> <col=ffffff>" + var3, 0, (byte) -82, (long) arg2.field931, true, class322.field4580, 25, false, 0, false, class23.field299, -1);
            }
            if (arg0) {
                class673.method3807((long) arg2.field931, "", 0, (byte) -128, 0L, false, "<col=cccccc>" + var3, -1, false, 0, true, -1, 0);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class675.field9478[var10] != null) {
                        short var11 = 0;
                        if (class87.field1576 == class649.field9170 && class675.field9478[var10].equalsIgnoreCase(class281.field3964.method1839((byte) 45, class744.field10426))) {
                            if (class468.field6748.field4903 < arg2.field4903) {
                                var11 = 2000;
                            }
                            if (class468.field6748.field4895 != 0 && arg2.field4895 != 0) {
                                if (class468.field6748.field4895 == arg2.field4895) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class94.field1642[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class260.field3811[var10] + var11);
                        int var13 = class485.field6851[var10] == -1 ? class719.field10072 : class485.field6851[var10];
                        class189.field2724++;
                        class673.method3807((long) arg2.field931, "<col=ffffff>" + var3, 0, (byte) -48, (long) arg2.field931, true, class675.field9478[var10], var12, false, 0, false, var13, -1);
                    }
                }
            }
            if (arg1 == 0 && !arg0) {
                for (class66 var14 = (class66) class288.field4066.method1522(true); var14 != null; var14 = (class66) class288.field4066.method1527((byte) 81)) {
                    if (var14.field1198 == 16) {
                        var14.field1182 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class737.field10375 && (class464.field6709 & 0x10) != 0) {
            class706.field9884++;
            class673.method3807((long) arg2.field931, class623.field8966 + " -> <col=ffffff>" + class281.field3978.method1839((byte) 45, class744.field10426), 0, (byte) -124, 0L, true, class322.field4580, 46, false, 0, false, class23.field299, -1);
        }
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(I)Z", line = 224)
    public final boolean method3704(int arg0) {
        int var2 = 27 % ((arg0 - 41) / 56);
        field9239++;
        return (this.field9240 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V", line = 235)
    public static void method3705(byte arg0) {
        if (arg0 <= 23) {
            method3705((byte) -26);
        }
        field9242 = null;
    }
}
