import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class6 extends class89 {

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "Lha;")
    public static class46 field98 = class271.method1828(" )2> <col=ffff00>", -46);

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "Laa;")
    public static class39 field101 = new class39();

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "Lha;")
    public static class46 field103 = class271.method1828("hitmarks", -46);

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    public static int field102 = 0;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "Lha;")
    public static class46 field105 = class271.method1828("blaugr-Un:", -46);

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "Lha;")
    public static class46 field107 = class271.method1828("hint_mapedge", -46);

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "Lha;")
    private static class46 field104 = class271.method1828(" more options", -46);

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "Lha;")
    public static class46 field106 = field104;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "Lhi;")
    public static class24 field108;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "[Lhh;")
    public static class263[] field91;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "[[I")
    public static int[][] field100;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(BII)Lsc;")
    public static final class146 method22(byte arg0, int arg1, int arg2) {
        if (arg0 != 16) {
            method28((class181) null, -3, 38, (byte) 17);
        }
        ++field93;
        class146 var3 = (class146) class194.field3475.method1601(36, (long) arg1 << 32 | (long) arg2);
        if (var3 == null) {
            var3 = new class146(arg1, arg2);
            class194.field3475.method1597(var3.field1195, (byte) -126, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lac;")
    public static final class118 method23(int arg0, int arg1) {
        class118 var2 = (class118) class193.field3462.method86(7961, (long) arg0);
        ++field95;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class247.field4371.method1293(arg0, 3, (byte) 64);
            class118 var4 = new class118();
            int var5 = -30 % ((-23 - arg1) / 36);
            if (var3 != null) {
                var4.method943(false, new class75(var3));
            }
            class193.field3462.method80(var4, (long) arg0, (byte) 67);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(IB)Ltj;")
    public static final class10 method24(int arg0, byte arg1) {
        ++field97;
        class10 var2 = (class10) class23.field327.method86(7961, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 != 64) {
            return null;
        } else {
            byte[] var3 = class255.field4462.method1293(arg0, 16, (byte) -89);
            class10 var4 = new class10();
            if (var3 != null) {
                var4.method51(new class75(var3), false);
            }
            class23.field327.method80(var4, (long) arg0, (byte) 67);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(BI)V")
    public static final void method25(byte arg0, int arg1) {
        if (arg0 != -116) {
            field102 = 61;
        }
        class236.field4171.method81((byte) 30, arg1);
        ++field94;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field99;
        int var3 = 104 % ((arg1 - 51) / 44);
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int[][] var5 = this.method689((byte) 95, 0, arg0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            for (int var9 = 0; ~class241.field4284 < ~var9; ++var9) {
                var4[var9] = (var7[var9] - -var6[var9] + var8[var9]) / 3;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIBI)V")
    public static final void method26(int arg0, int arg1, byte arg2, int arg3) {
        ++field90;
        class146 var4 = method22((byte) 16, 9, arg0);
        var4.method1088(11102);
        var4.field2640 = arg1;
        var4.field2637 = arg3;
        int var5 = -38 % ((arg2 - 24) / 58);
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
    public static void method27(int arg0) {
        field91 = null;
        field105 = null;
        field100 = null;
        field103 = null;
        field101 = null;
        field107 = null;
        if (arg0 != 29222) {
            field108 = null;
        }
        field98 = null;
        field108 = null;
        field104 = null;
        field106 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lpi;IIB)[Lhh;")
    public static final class263[] method28(class181 arg0, int arg1, int arg2, byte arg3) {
        ++field96;
        if (arg3 >= -24) {
            return null;
        } else {
            return !class146.method1083(arg0, arg2, arg1, (byte) 28) ? null : class144.method1075(true);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class6() {
        super(1, true);
    }
}
