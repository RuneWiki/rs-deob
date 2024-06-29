import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class class201 extends class539 {

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Lga;")
    public static class282 field2705 = null;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "Leg;")
    public static class70 field2707;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "Z")
    public static boolean field2704;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1360(boolean arg0) {
        field2706++;
        int var1 = 0;
        if (class203.field2716.method549((byte) -115, class378.field5771)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class203.field2716.field1181) {
            var1 |= 0x40;
        }
        class366.method2334(var1, 0);
        class432.field6575.method1875(2, var1);
        if (arg0) {
            field2705 = null;
        }
        class103.field1489.method1600(var1, (byte) 125);
        class137.field1834.method1621((byte) -128, var1);
        class239.field3360.method2834(var1, 14581);
        class392.method2445(638, var1);
        class5.method22((byte) 64, var1);
        class374.method2359(-2, var1);
        class507.method3047(var1, -1582849078);
        class22.method205(-57);
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(Z)V", line = 43)
    public static final void method1361(boolean arg0) {
        field2709++;
        class206.method1385(2, class466.field6949);
        class132.field1787++;
        if (class384.field5829 && class291.field4257) {
            int var1 = class502.field7404.method2323((byte) -88);
            int var2 = class502.field7404.method2325(105);
            int var3 = var2 - class350.field5395;
            int var4 = var1 - class290.field4238;
            if (var4 < class444.field6674) {
                var4 = class444.field6674;
            }
            if (var3 < class221.field3078) {
                var3 = class221.field3078;
            }
            if (arg0) {
                if ((class444.field6674 + class269.field3744.field3991) < (class466.field6949.field3991 + var4)) {
                    var4 = class269.field3744.field3991 + class444.field6674 - class466.field6949.field3991;
                }
                if (class466.field6949.field4043 + var3 > class221.field3078 - -class269.field3744.field4043) {
                    var3 = class221.field3078 + class269.field3744.field4043 - class466.field6949.field4043;
                }
                int var5 = class269.field3744.field4091 + var4 - class444.field6674;
                int var6 = var3 + class269.field3744.field4129 - class221.field3078;
                if (class502.field7404.method2737(-231)) {
                    if (class132.field1787 > class466.field6949.field4085) {
                        int var8 = var4 - class94.field1379;
                        int var9 = var3 - class72.field998;
                        if (var8 > class466.field6949.field4001 || var8 < (-class466.field6949.field4001) || var9 > class466.field6949.field4001 || -class466.field6949.field4001 > var9) {
                            class163.field2147 = true;
                        }
                    }
                    if (class466.field6949.field4128 != null && class163.field2147) {
                        class143 var10 = new class143();
                        var10.field1902 = var6;
                        var10.field1905 = var5;
                        var10.field1903 = class466.field6949;
                        var10.field1912 = class466.field6949.field4128;
                        class343.method2227(var10);
                    }
                } else {
                    if (class163.field2147) {
                        class306.method1922(-1);
                        if (class466.field6949.field4132 != null) {
                            class143 var7 = new class143();
                            var7.field1911 = class179.field2389;
                            var7.field1905 = var5;
                            var7.field1903 = class466.field6949;
                            var7.field1902 = var6;
                            var7.field1912 = class466.field6949.field4132;
                            class343.method2227(var7);
                        }
                        if (class179.field2389 != null && client.method1342(class466.field6949) != null) {
                            class454.method2767(125, class466.field6949, class179.field2389);
                        }
                    } else if ((class259.field3661 == 1 || class301.method1909(-96)) && class367.field5621 > 2) {
                        class482.method2896(class94.field1379 + class290.field4238, class350.field5395 - -class72.field998, 24177);
                    } else if (class301.method1912(2)) {
                        class482.method2896(class94.field1379 + class290.field4238, class72.field998 + class350.field5395, 24177);
                    }
                    class466.field6949 = null;
                }
            }
        } else if (class132.field1787 > 1) {
            class466.field6949 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII[B[BIII)V", line = 156)
    public static final void method1362(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field2708++;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg4[var10001] += arg5[arg2++];
                int var14 = arg6++;
                arg4[var14] += arg5[arg2++];
                int var15 = arg6++;
                arg4[var15] += arg5[arg2++];
                int var16 = arg6++;
                arg4[var16] += arg5[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg4[var10001] += arg5[arg2++];
            }
            arg2 += arg8;
            arg6 += arg7;
        }
        if (arg1 != 0) {
            field2705 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V", line = 201)
    public static void method1363(byte arg0) {
        field2707 = null;
        field2705 = null;
        if (arg0 != -78) {
            method1360(true);
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)Lus;")
    public abstract class1 method1364(int arg0);
}
