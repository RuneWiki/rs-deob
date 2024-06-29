import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class140 extends class11 {

    @OriginalMember(owner = "client!su", name = "H", descriptor = "Lwj;")
    public static class270 field1986 = new class270(82, 6);

    @OriginalMember(owner = "client!su", name = "I", descriptor = "[I")
    public static int[] field1987 = new int[100];

    @OriginalMember(owner = "client!su", name = "J", descriptor = "I")
    public static int field1988 = 2;

    @OriginalMember(owner = "client!su", name = "G", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!su", name = "K", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!su", name = "L", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!su", name = "M", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "(II)I")
    public static final int method937(int arg0, int arg1) {
        return class391.field5739 != null ? class391.field5739[arg0][arg1] & 255 : 0;
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field1990;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int var4 = class328.field4484[arg1];
            for (int var5 = 0; var5 < class90.field1316; ++var5) {
                var3[var5] = this.method939(class448.field6606[var5], var4, -272943391) % 4096;
            }
        }
        if (arg0 >= -42) {
            this.method44(-91, 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lju;B)V")
    public static final void method938(class82 arg0, byte arg1) {
        ++field1985;
        if (!class181.field2659) {
            int var2 = -27 / ((arg1 - 40) / 36);
            arg0.method1565(0);
            --class274.field3764;
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(III)I")
    private final int method939(int arg0, int arg1, int arg2) {
        ++field1989;
        if (arg2 != -272943391) {
            this.method939(-10, -51, -17);
        }
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 - -789221) * var5 - -1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!su", name = "f", descriptor = "(I)V")
    public static void method940(int arg0) {
        if (arg0 != -28689) {
            method937(98, 58);
        }
        field1986 = null;
        field1987 = null;
    }
}
