import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class73 extends class280 {

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Z")
    public static boolean field1051 = false;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field1056 = 64;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Lhl;")
    public static class40 field1053 = new class40(64);

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field1069 = -1;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "Ljj;")
    public static class107 field1057;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)I")
    public final int method526(int arg0) {
        if (arg0 >= -123) {
            field1056 = 25;
        }
        field1068++;
        return class18.method126((byte) 126, this.field1063);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)Z")
    public final boolean method527(int arg0) {
        if (arg0 == 11169) {
            field1052++;
            return (this.field1063 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)Z")
    public final boolean method528(byte arg0) {
        field1055++;
        int var2 = 54 % ((arg0 + 61) / 48);
        return ((this.field1063 & 0x52A89C) >> 22) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)Z")
    public final boolean method529(int arg0) {
        if (arg0 != 1) {
            this.method529(108);
        }
        field1064++;
        return ((this.field1063 & 0x26CD49A0) >> 29) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)Z")
    public final boolean method530(byte arg0) {
        int var2 = 99 / ((-arg0 - 11) / 34);
        field1058++;
        return (this.field1063 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)Z")
    public final boolean method531(int arg0) {
        field1054++;
        int var2 = -18 / ((arg0 + 12) / 38);
        return (this.field1063 & 0x734BE95A) >> 30 != 0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)Z")
    public final boolean method532(int arg0, byte arg1) {
        if (arg1 == -29) {
            field1065++;
            return (this.field1063 >> arg0 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)I")
    public final int method533(byte arg0) {
        field1067++;
        int var2 = -106 / ((arg0 - 45) / 41);
        return this.field1063 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "(I)V")
    public static void method534(int arg0) {
        field1053 = null;
        if (arg0 != -28) {
            field1062 = 106;
        }
        field1057 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6;
        class297[] var8 = class96.field1425;
        while (var8.length > var7) {
            class297 var9 = var8[var7];
            if (var9 != null && var9.field4693 == 2) {
                class42.method316(arg5, arg2 >> 1, (var9.field4701 - class282.field4487 << 7) + var9.field4702, (byte) -118, arg3, arg4 >> 1, (var9.field4708 - class99.field1465 << 7) + var9.field4704, var9.field4692 * 2);
                if (class268.field4332 > -1 && class264.field4290 % 20 < 10) {
                    class243.field3910[var9.field4699].method60(arg0 + class268.field4332 - 12, arg1 - -class297.field4697 + -28);
                }
            }
            var7++;
        }
        field1061++;
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "(I)Z")
    public final boolean method536(int arg0) {
        field1059++;
        int var2 = -128 % ((41 - arg0) / 42);
        return (this.field1063 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)Z")
    public final boolean method537(boolean arg0) {
        field1060++;
        if (arg0) {
            this.field1063 = 113;
        }
        return (this.field1063 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Lqe;")
    public static final class99 method538(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4526;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(II)V")
    public class73(int arg0, int arg1) {
        this.field1063 = arg0;
        this.field1066 = arg1;
    }
}
