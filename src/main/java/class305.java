import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class305 {

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "Lqw;")
    private class84 field4343;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "[Lbea;")
    public static class236[] field4349 = new class236[14];

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "Lmg;")
    private class159 field4351;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1972(int arg0, int arg1, int arg2) {
        if (arg0 > -33) {
            field4347 = -128;
        }
        field4345++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZB)V", line = 16)
    public static final void method1973(boolean arg0, byte arg1) {
        field4344++;
        class183.field2406.method816(class685.field9171.method444());
        int[] var2 = class685.field9171.method532();
        class715.field9756 = var2[0];
        class175.field2319 = var2[2];
        if (arg1 != 77) {
            method1973(false, (byte) 15);
        }
        class163.field2174 = var2[1];
        class434.field6261 = var2[3];
        if (arg0) {
            class685.field9171.method436(class148.field1998, class93.field1310, class294.field4167, class701.field9275);
            class127.method900(class212.field2762, false);
        } else {
            class685.field9171.method436(class427.field6211, field4347, class303.field4254, class619.field8375);
            class127.method900(class107.field1504, false);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IB)V", line = 49)
    public static final void method1974(int arg0, byte arg1) {
        field4342++;
        if (!class422.method2542(-107, arg0)) {
            return;
        }
        int var2 = -17 % ((arg1 + 45) / 57);
        class347[] var3 = class419.field6032[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class347 var5 = var3[var4];
            if (var5 != null) {
                var5.field5022 = 0;
                var5.field4984 = 1;
                var5.field4906 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V", line = 86)
    public static void method1975(boolean arg0) {
        if (!arg0) {
            field4349 = null;
        }
        field4349 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(Z)Lmg;", line = 99)
    public final class159 method1976(boolean arg0) {
        field4350++;
        class159 var2 = this.field4343.field1194.field2139;
        if (this.field4343.field1194 == var2) {
            this.field4351 = null;
            return null;
        }
        if (arg0) {
            method1979(-93, -16, 59, -105, -52, true, 47);
        }
        this.field4351 = var2.field2139;
        return var2;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)Lmg;", line = 124)
    public final class159 method1977(int arg0) {
        field4346++;
        class159 var2 = this.field4351;
        int var3 = -109 / ((42 - arg0) / 36);
        if (this.field4343.field1194 == var2) {
            this.field4351 = null;
            return null;
        } else {
            this.field4351 = var2.field2139;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILqw;)V", line = 144)
    public final void method1978(int arg0, class84 arg1) {
        if (arg0 == 2) {
            this.field4343 = arg1;
            field4341++;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIIIZI)V", line = 155)
    public static final void method1979(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg4 != 8 && arg4 != 16) {
            class194 var7 = class443.field6387[arg6][arg2][arg3];
            if (var7 == null) {
                var7 = new class194(arg6);
            }
            if (arg4 == 1) {
                var7.field2518 = (short) arg0;
                var7.field2530 = (short) arg1;
            } else if (arg4 == 2) {
                var7.field2517 = (short) arg0;
                var7.field2528 = (short) arg1;
            }
            if (class634.field8566) {
                class183.method1237(8390);
            }
        } else if (arg4 == 8) {
            int var14 = arg2 << class478.field6717;
            int var15 = class30.field299 + var14;
            int var16 = arg3 << class478.field6717;
            int var17 = class30.field299 + var16;
            int var18 = class648.field8748[arg6].method1898(arg3, arg2, (byte) -52);
            int var19 = class648.field8748[arg6].method1898(arg3 + 1, arg2 - -1, (byte) -86);
            class135.field1833[class282.field4079++] = new class378(arg4, arg6, var14, var15, var15, var14, var18, var19, var19 - arg1, var18 - arg1, var16, var17, var17, var16);
        } else {
            int var8 = (arg2 << class478.field6717) + class30.field299;
            int var9 = var8 - class30.field299;
            int var10 = arg3 << class478.field6717;
            int var11 = class30.field299 + var10;
            int var12 = class648.field8748[arg6].method1898(arg3, arg2 + 1, (byte) -53);
            int var13 = class648.field8748[arg6].method1898(arg3 + 1, arg2, (byte) -58);
            class135.field1833[class282.field4079++] = new class378(arg4, arg6, var8, var9, var9, var8, var12, var13, var13 - arg1, -arg1 + var12, var10, var11, var11, var10);
        }
        field4348++;
        if (arg5) {
            method1973(true, (byte) -43);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "()V", line = 226)
    public class305() {
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lqw;)V", line = 228)
    public class305(class84 arg0) {
        this.field4343 = arg0;
    }
}
