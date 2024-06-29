import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class148 extends class478 {

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    private int field1631 = 4096;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
    private int field1635 = 0;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    public static int field1637 = -1;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "[[I")
    public static int[][] field1633 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "Z")
    public static boolean field1632;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field1631 = arg1.method643((byte) -77);
            }
        } else {
            this.field1635 = arg1.method643((byte) -77);
        }
        if (arg0 != 255) {
            this.method35(97, 64);
        }
        ++field1636;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([[BBLuk;)V")
    public static final void method811(byte[][] arg0, byte arg1, class476 arg2) {
        int var3 = 4 % ((7 - arg1) / 43);
        ++field1638;
        int var4 = class248.field3079.length;
        for (int var5 = 0; var4 > var5; ++var5) {
            byte[] var6 = arg0[var5];
            if (var6 != null) {
                int var7 = (class306.field3784[var5] >> 8) * 64 + -class26.field245;
                int var8 = (class306.field3784[var5] & 255) * 64 + -class231.field2860;
                class530.method2975((byte) 108);
                arg2.method2745(class282.field3534, -1, class701.field9813, var8, var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1634;
        int[] var3 = super.field6886.method789(arg0, (byte) -103);
        if (arg1 != -11323) {
            this.method33(92, (class115) null, 71);
        }
        if (super.field6886.field1592) {
            int[] var4 = this.method2752(arg0, 104, 0);
            for (int var5 = 0; class436.field6154 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field1635 >= ~var6 && ~var6 >= ~this.field1631 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1639;
        if (arg3 != -31957) {
            method814(-94, (byte) 59, -25);
        }
        for (int var6 = arg1; var6 <= arg4; ++var6) {
            for (int var7 = arg2; arg0 >= var7; ++var7) {
                if (class80.field830[var6][var7] == arg5 && class333.field4180[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V")
    public static void method813(int arg0) {
        int var1 = -47 / ((30 - arg0) / 37);
        field1633 = null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI)Z")
    public static final boolean method814(int arg0, byte arg1, int arg2) {
        if (arg1 < 97) {
            method811((byte[][]) null, (byte) -66, (class476) null);
        }
        ++field1640;
        return class186.method1131((byte) 34, arg0, arg2) & class48.method256(2048, arg2, arg0);
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, true);
    }
}
