import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class735 extends class175 {

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    private int field9964 = 4096;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field9962 = 2;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "[[I")
    public static int[][] field9965 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public static int field9967 = 0;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field9959;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public static int field9960;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field9961;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field9963;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "Lqw;")
    public static class84 field9966;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field9961;
        if (~arg0 == -1) {
            this.field9964 = arg1.method1728((byte) 35);
        }
        if (arg2) {
            method4052(-36);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class735() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)Lai;")
    public static final class624 method4050(byte arg0) {
        ++field9963;
        if (arg0 != 3) {
            method4052(6);
        }
        try {
            return new class242();
        } catch (Throwable var2) {
            try {
                return (class624) Class.forName("rt").newInstance();
            } catch (Throwable var1) {
                return new class650();
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(ZI)I")
    public static final int method4051(boolean arg0, int arg1) {
        ++field9959;
        if (!arg0) {
            method4051(false, 5);
        }
        byte var2;
        if (~arg1 >= -12001) {
            if (~arg1 < -5001) {
                class383.method2379(-2);
                var2 = 3;
            } else if (~arg1 < -2001) {
                var2 = 2;
                class517.method3013((byte) -126);
            } else {
                var2 = 1;
                class37.method212(28974, true);
            }
        } else {
            class630.method3480(false);
            var2 = 4;
        }
        if (class125.field1721.field5141.method2541(43) != 2) {
            class125.field1721.method2255(true, 2, class125.field1721.field5140);
            class399.method2434(false, (byte) -115, 2);
        }
        class515.method3006(-2);
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)V")
    public static final void method4052(int arg0) {
        class199.method1302(22050, ~class125.field1721.field5181.method3364(43) == -2, -48001, 2);
        ++field9968;
        class318.field4526 = class52.method329(22050, (byte) 65, arg0, class669.field8962, class786.field10800);
        class651.method3620(true, true, class557.method3191(-115, (class64) null));
        class790.field10850 = class52.method329(2048, (byte) 65, 1, class669.field8962, class786.field10800);
        class701.field9285 = new class3();
        class790.field10850.method2500(arg0 + -27177, class701.field9285);
        class548.field7564 = new class702(22050, class624.field8419);
        class542.method3131(true);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field9969;
        if (!arg0) {
            field9960 = -55;
        }
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int[] var4 = this.method1202(class698.field9254 & arg1 - 1, -1150480797, 0);
            int[] var5 = this.method1202(arg1, -1150480797, 0);
            int[] var6 = this.method1202(class698.field9254 & arg1 + 1, -1150480797, 0);
            for (int var7 = 0; ~class598.field8136 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field9964;
                int var9 = (var5[var7 - -1 & class412.field5896] + -var5[class412.field5896 & var7 - 1]) * this.field9964;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "(I)V")
    public static void method4053(int arg0) {
        field9966 = null;
        field9965 = null;
        if (arg0 <= 34) {
            field9966 = null;
        }
    }
}
