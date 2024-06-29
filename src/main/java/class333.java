import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class333 extends class335 {

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    private int field4485 = 4096;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field4486 = new String[5];

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILio;I)V", line = 3)
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 != -66) {
            this.method3(true, 73);
        }
        ++field4487;
        if (arg0 == 0) {
            this.field4485 = arg1.method963(-122);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)[I", line = 17)
    public final int[] method3(boolean arg0, int arg1) {
        ++field4481;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int[] var4 = this.method1969(0, arg1 + -1 & class326.field4386, -49);
            int[] var5 = this.method1969(0, arg1, -75);
            int[] var6 = this.method1969(0, arg1 + 1 & class326.field4386, -95);
            for (int var7 = 0; ~class649.field8968 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4485;
                int var9 = (var5[var7 + 1 & class29.field413] + -var5[var7 - 1 & class29.field413]) * this.field4485;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 - -var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        if (!arg0) {
            method1965((class388) null, (Object) null, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lgba;Ljava/lang/Object;Z)V", line = 69)
    public static final void method1965(class388 arg0, Object arg1, boolean arg2) {
        ++field4482;
        if (arg2) {
            field4486 = null;
        }
        if (arg0.field5178 != null) {
            for (int var3 = 0; ~var3 > -51 && arg0.field5178.peekEvent() != null; ++var3) {
                class588.method3253(0, 1L);
            }
            try {
                if (arg1 != null) {
                    arg0.field5178.postEvent(new ActionEvent(arg1, 1001, "dummy"));
                }
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V", line = 99)
    public static void method1966(int arg0) {
        if (arg0 != 1001) {
            method1966(84);
        }
        field4486 = null;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 109)
    public class333() {
        super(1, true);
    }
}
