import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class237 extends class585 {

    @OriginalMember(owner = "client!jda", name = "E", descriptor = "Lbu;")
    public static class21 field3563 = new class21(62, 3);

    @OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!jda", name = "G", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field3565;
        if (arg1 <= 123) {
            field3563 = null;
        }
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            int[][] var4 = this.method3417(0, arg0, (byte) 113);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class293.field4278; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V")
    public class237() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(Z)V")
    public static void method1586(boolean arg0) {
        if (arg0) {
            method1587((byte) -27);
        }
        field3563 = null;
    }

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "(B)V")
    public static final void method1587(byte arg0) {
        ++field3564;
        if (class694.field9699 != class300.field4326) {
            if (arg0 > -124) {
                method1587((byte) 118);
            }
            try {
                class323.method2083(-10217, "tbrefresh", class256.field3768);
            } catch (Throwable var1) {
            }
        }
    }
}
