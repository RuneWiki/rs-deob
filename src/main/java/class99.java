import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class99 extends class103 {

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Lda;")
    public static class275 field1668 = class255.method1672(109, ":trade:");

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "Lda;")
    public static class275 field1679 = class255.method1672(107, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public int field1675;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lrh;")
    public static class21 field1666;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Lfd;")
    public class229 field1671;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "Lfd;")
    public class229 field1677;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "Lda;")
    public class275 field1676;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Z")
    public static boolean field1669;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "Z")
    public boolean field1670;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "[Ljava/lang/Object;")
    public Object[] field1678;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILcf;IIB)V")
    public static final void method706(int arg0, class23 arg1, int arg2, int arg3, byte arg4) {
        field1665++;
        if (class52.field863 >= 400) {
            return;
        }
        if (arg1.field406 != null) {
            arg1 = arg1.method140(1);
        }
        if (arg1 == null || !arg1.field402) {
            return;
        }
        if (arg4 != -92) {
            method708(-11);
        }
        class275 var5 = arg1.field357;
        if (arg1.field398 != 0) {
            var5 = class197.method1291(new class275[] { var5, class124.method898(arg1.field398, 120, class66.field1094.field1908), class11.field161, class141.field2498, class250.method1644(arg1.field398, (byte) -115), class30.field450 }, -30025);
        }
        if (class190.field3272 == 1) {
            class215.field3661++;
            class246.method1619((long) arg3, arg0, class197.method1291(new class275[] { class210.field3550, class209.field3540, var5 }, arg4 ^ 0x7513), class165.field2869, arg2, (byte) -70, (short) 40);
        } else if (!class144.field2523) {
            class248.field4373++;
            class275[] var6 = arg1.field343;
            if (class181.field3099) {
                var6 = class271.method1785(var6, (byte) 110);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class38.field630 != 0 || !var6[var7].method1844(90, class139.field2435))) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 10;
                        }
                        if (var7 == 1) {
                            var8 = 41;
                        }
                        if (var7 == 2) {
                            var8 = 32;
                        }
                        if (var7 == 3) {
                            var8 = 48;
                        }
                        class273.field4713++;
                        if (var7 == 4) {
                            var8 = 26;
                        }
                        class246.method1619((long) arg3, arg0, class197.method1291(new class275[] { class203.field3450, var5 }, -30025), var6[var7], arg2, (byte) -70, var8);
                    }
                }
            }
            if (class38.field630 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1844(arg4 ^ 0xFFFFFFFE, class139.field2435)) {
                        class150.field2621++;
                        short var10 = 0;
                        if (arg1.field398 > class66.field1094.field1908) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 10;
                        }
                        if (var9 == 1) {
                            var11 = 41;
                        }
                        if (var9 == 2) {
                            var11 = 32;
                        }
                        if (var9 == 3) {
                            var11 = 48;
                        }
                        if (var9 == 4) {
                            var11 = 26;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class246.method1619((long) arg3, arg0, class197.method1291(new class275[] { class203.field3450, var5 }, arg4 ^ 0x7513), var6[var9], arg2, (byte) -70, var11);
                    }
                }
            }
            class246.method1619((long) arg3, arg0, class197.method1291(new class275[] { class203.field3450, var5 }, -30025), class248.field4368, arg2, (byte) -70, (short) 1003);
        } else if ((class150.field2619 & 0x2) == 2) {
            class53.field891++;
            class246.method1619((long) arg3, arg0, class197.method1291(new class275[] { class19.field266, class209.field3540, var5 }, -30025), class103.field1715, arg2, (byte) -70, (short) 5);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)Lub;")
    public static final class133 method707(boolean arg0, int arg1) {
        field1673++;
        class133 var2 = (class133) class162.field2835.method252(arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class118.field2101.method775(0, arg1 & 0x7FFF, -24799);
        } else {
            var3 = class157.field2766.method775(0, arg1, -24799);
        }
        class133 var4 = new class133();
        if (var3 != null) {
            var4.method972(new class85(var3), -125);
        }
        if (!arg0) {
            field1679 = null;
        }
        if (arg1 >= 32768) {
            var4.method975(32768);
        }
        class162.field2835.method251(var4, (byte) 125, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
    public static void method708(int arg0) {
        if (arg0 != 32) {
            method706(115, (class23) null, -11, 14, (byte) -70);
        }
        field1668 = null;
        field1666 = null;
        field1679 = null;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)I")
    public static final int method709(int arg0, byte arg1) {
        int var2 = 85 % ((-arg1 - 53) / 44);
        field1667++;
        return arg0 & 0xFF;
    }
}
