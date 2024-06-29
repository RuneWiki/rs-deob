import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class60 {

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "[I")
    private int[] field810;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static volatile int field802 = 0;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field799 = -1;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lqj;")
    private static class196 field806 = class80.method502("RuneScape is loading )2 please wait)3)3)3", -48);

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Lqj;")
    public static class196 field808 = class80.method502("overlay)3dat", -48);

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lqj;")
    public static class196 field800 = field806;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static final void method379(byte arg0) {
        field809++;
        class206.method1405((byte) 110);
        if (arg0 < -78) {
            System.gc();
            class180.method1182((byte) -101, 25);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILbk;BI)Lqh;")
    public static final class68 method380(int arg0, class136 arg1, byte arg2, int arg3) {
        if (arg2 == 3) {
            field804++;
            return class84.method528(arg1, arg0, arg3, 0) ? class164.method1035(false) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method381(int arg0) {
        field808 = null;
        if (arg0 != 1) {
            field802 = -117;
        }
        field800 = null;
        field806 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILec;I)V")
    public static final void method382(int arg0, int arg1, class178 arg2, int arg3) {
        field807++;
        if (class156.field2510 != 0 && class156.field2510 != 3 || !arg2.method1163(-22503)) {
            return;
        }
        int var4 = arg2.field3007[arg0];
        if (var4 > arg1 || arg1 > arg2.field3060[arg0] + var4) {
            return;
        }
        int var5 = arg0 - arg2.field2997 / 2;
        int var6 = arg1 - arg2.field3085 / 2;
        int var7 = class18.field216 + class249.field4408 & 0x7FF;
        int var8 = class15.field170[var7];
        int var9 = (class90.field1325 + 256) * var8 >> 8;
        int var10 = -70 % ((71 - arg3) / 55);
        int var11 = class15.field172[var7];
        int var12 = (class90.field1325 + 256) * var11 >> 8;
        int var13 = var5 * var9 + var6 * var12 >> 11;
        int var14 = var5 * var12 - var6 * var9 >> 11;
        int var15 = class102.field1477.field2081 + var13 >> 7;
        int var16 = class102.field1477.field2085 - var14 >> 7;
        boolean var17 = class194.method1277(class102.field1477.field2102[0], 1, true, 0, var15, 0, var16, class102.field1477.field2046[0], 0, 0, 47, 0);
        if (!var17) {
            return;
        }
        class44.field520.method329((byte) 76, var6);
        class44.field520.method329((byte) 33, var5);
        class44.field520.method310(class18.field216, -36);
        class44.field520.method329((byte) 63, 57);
        class44.field520.method329((byte) 85, class249.field4408);
        class44.field520.method329((byte) 60, class90.field1325);
        class44.field520.method329((byte) 106, 89);
        class44.field520.method310(class102.field1477.field2081, -75);
        class44.field520.method310(class102.field1477.field2085, -108);
        class44.field520.method329((byte) 13, class195.field3427);
        class44.field520.method329((byte) 43, 63);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
    public static final void method383(int arg0, int arg1) {
        field805++;
        class53.field663.method1535(arg1, 30704);
        class157.field2536.method130(109, arg1);
        if (arg0 != -4) {
            method380(-84, null, (byte) 112, 25);
        }
        class84.field1230.method1535(arg1, 30704);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILbk;)V")
    public static final void method384(int arg0, class136 arg1) {
        if (arg0 > -91) {
            method381(99);
        }
        class86.field1276 = arg1;
        field798++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lbk;I)V")
    public static final void method385(class136 arg0, int arg1) {
        if (arg1 == -9595) {
            class111.field1619 = arg0;
            field801++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([I)V")
    public class60(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field810 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field810[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field810[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field810[var5 + var5] = arg0[var4];
            this.field810[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)I")
    public final int method386(byte arg0, int arg1) {
        int var3 = 31 / ((arg0 + 9) / 49);
        field797++;
        int var4 = (this.field810.length >> 1) - 1;
        int var5 = arg1 & var4;
        while (true) {
            int var6 = this.field810[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field810[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }
}
