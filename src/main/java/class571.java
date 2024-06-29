import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class571 extends class281 {

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "[I")
    private int[] field8168 = new int[this.field4507];

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "I")
    private int field8169;

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
    private int field8171;

    @OriginalMember(owner = "client!jaa", name = "w", descriptor = "[B")
    private byte[] field8172;

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(IIIIIF)V", line = 5)
    public class571(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field4507 < ~var7; ++var7) {
            this.field8168[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(III)V", line = 25)
    public final void method1996(int arg0, int arg1, int arg2) {
        ++field8167;
        this.field8169 += this.field8168[arg1] * arg0 >> 12;
        if (arg2 != 255) {
            this.method2869(-63, -107, (byte) -6);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIB)V", line = 36)
    public void method2869(int arg0, int arg1, byte arg2) {
        this.field8172[this.field8171++] = (byte) ((class453.method2846(arg2, 255) >> 1) + arg1);
        ++field8166;
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Z)V", line = 46)
    public final void method1999(boolean arg0) {
        this.field8169 = 0;
        if (!arg0) {
            this.field8168 = null;
        }
        ++field8170;
        this.field8171 = 0;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V", line = 58)
    public final void method1993(int arg0) {
        ++field8165;
        this.field8169 = Math.abs(this.field8169);
        if (~this.field8169 <= -4097) {
            this.field8169 = 4095;
        }
        this.method2869(this.field8171++, 127, (byte) (this.field8169 >> 4));
        int var2 = 32 % ((arg0 - 12) / 60);
        this.field8169 = 0;
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V", line = 78)
    public static final void method3367(int arg0) {
        for (int var1 = arg0; class283.field4523 > var1; ++var1) {
            int var2 = class102.field1690[var1];
            class348 var3 = (class348) class592.field8395.method1558((long) var2, (byte) -93);
            if (var3 != null) {
                class589 var4 = var3.field5577;
                class529.method3202(0, var4.field8354.field9949, var4);
            }
        }
        ++field8164;
    }
}
