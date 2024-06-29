import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class290 extends class51 {

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "[Lrb;")
    public class148[] field4878;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "[I")
    public static int[] field4875 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field4877 = 0;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "Lhi;")
    private static class82 field4879 = class95.method664((byte) -89, "wishes to trade with you)3");

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field4874 = 0;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "[I")
    public static int[] field4880 = new int[100];

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "Lhi;")
    public static class82 field4869 = field4879;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "[Ljf;")
    public static class86[] field4872;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(JZ)V", line = 15)
    public static final void method2001(long arg0, boolean arg1) {
        if (arg1) {
            field4877 = 120;
        }
        field4873++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class144.method982(arg0 - 1L, (byte) 10);
            class144.method982(1L, (byte) 10);
        } else {
            class144.method982(arg0, (byte) 10);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Lcd;", line = 37)
    public static final class130 method2002(int arg0, byte arg1) {
        if (arg1 > -50) {
            return (class130) null;
        }
        field4868++;
        class130 var2 = (class130) class139.field2380.method2175((long) arg0, 3008);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class312.field5365.method1577(class72.method453(1935368042, arg0), class272.method1905(27961, arg0), -29569);
        class130 var4 = new class130();
        if (var3 != null) {
            var4.method902(new class153(var3), (byte) -112);
        }
        class139.field2380.method2169(var4, (long) arg0, (byte) 94);
        return var4;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V", line = 64)
    public static void method2003(byte arg0) {
        field4875 = null;
        if (arg0 >= 39) {
            field4869 = null;
            field4872 = null;
            field4880 = null;
            field4879 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Luh;IZILuh;)I", line = 99)
    public static final int method2004(class67 arg0, int arg1, boolean arg2, int arg3, class67 arg4) {
        if (arg1 < 46) {
            method2002(-20, (byte) -53);
        }
        field4870++;
        if (arg3 == 1) {
            int var5 = arg0.field3582;
            int var6 = arg4.field3582;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return arg0.method425(-60).field3069.method561(arg4.method425(93).field3069, true);
        } else if (arg3 == 3) {
            if (arg0.field1043.method534(-68, class42.field744)) {
                if (arg4.field1043.method534(-71, class42.field744)) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field1043.method534(-69, class42.field744)) {
                return arg2 ? 1 : -1;
            } else {
                return arg0.field1043.method561(arg4.field1043, true);
            }
        } else if (arg3 == 4) {
            return arg0.method1471(16) ? (arg4.method1471(16) ? 0 : 1) : (arg4.method1471(16) ? -1 : 0);
        } else if (arg3 == 5) {
            return arg0.method1468(120) ? (arg4.method1468(125) ? 0 : 1) : (arg4.method1468(117) ? -1 : 0);
        } else if (arg3 == 6) {
            return arg0.method1473(16) ? (arg4.method1473(16) ? 0 : 1) : (arg4.method1473(16) ? -1 : 0);
        } else if (arg3 == 7) {
            return arg0.method1469((byte) -99) ? (arg4.method1469((byte) -99) ? 0 : 1) : (arg4.method1469((byte) -99) ? -1 : 0);
        } else {
            return arg0.field1041 - arg4.field1041;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lum;Lum;IZ)V", line = 177)
    public class290(class222 arg0, class222 arg1, int arg2, boolean arg3) {
        class277 var5 = new class277();
        int var6 = arg0.method1568(1673, arg2);
        this.field4878 = new class148[var6];
        int[] var7 = arg0.method1585(false, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1577(arg2, var7[var8], -29569);
            class159 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class159 var12 = (class159) var5.method1936(16173); var12 != null; var12 = (class159) var5.method1926((byte) 90)) {
                if (var12.field2756 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1601(var11, 0, 0);
                } else {
                    var13 = arg1.method1601(0, 0, var11);
                }
                var10 = new class159(var11, var13);
                var5.method1940((byte) 11, var10);
            }
            this.field4878[var7[var8]] = new class148(var9, var10);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)Z", line = 239)
    public final boolean method2005(int arg0, int arg1) {
        if (arg0 != -1) {
            method2004((class67) null, 98, true, -108, (class67) null);
        }
        field4876++;
        return this.field4878[arg1].field2523;
    }
}
