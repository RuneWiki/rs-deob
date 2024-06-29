import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class552 extends class334 {

    @OriginalMember(owner = "client!rfa", name = "I", descriptor = "Lvt;")
    public static class768 field7657 = new class768();

    @OriginalMember(owner = "client!rfa", name = "G", descriptor = "F")
    public static float field7655;

    @OriginalMember(owner = "client!rfa", name = "E", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!rfa", name = "F", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!rfa", name = "H", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!rfa", name = "J", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V")
    public static void method3184(boolean arg0) {
        field7657 = null;
        if (arg0) {
            method3186((class745) null);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(B)Lvi;")
    public static final class302 method3185(byte arg0) {
        ++field7653;
        if (arg0 != 86) {
            field7655 = 0.87413126F;
        }
        return ~class7.field94 == -1 ? new class302() : class754.field10491[--class7.field94];
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field7654;
        int[] var3 = super.field4743.method1027((byte) -106, arg0);
        if (arg1 != -22563988) {
            this.method28(-98, -43);
        }
        if (super.field4743.field1993) {
            int[][] var4 = this.method2053(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class439.field6099 < ~var8; ++var8) {
                var3[var8] = (var5[var8] - (-var6[var8] - var7[var8])) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lnfa;)V")
    public static final void method3186(class745 arg0) {
        class29.field307.method482(arg0.field10347, arg0.field10358 + (arg0.method1167(93) >> 1), arg0.field10350, class138.field2290);
        arg0.field10352 = class138.field2290[0];
        arg0.field10355 = class138.field2290[1];
        arg0.field10348 = class138.field2290[2];
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[Lmq;)V")
    public static final void method3187(int arg0, class85[] arg1) {
        class224.field3292 = arg1.length;
        ++field7656;
        class91.field1312 = new int[class224.field3292 + 10];
        class312.field4420 = new class85[class224.field3292 + 10];
        class171.method1265(arg1, 0, class312.field4420, 0, class224.field3292);
        for (int var2 = 0; var2 < class224.field3292; ++var2) {
            class91.field1312[var2] = class312.field4420[var2].method14();
        }
        int var3 = class224.field3292;
        if (arg0 != -17080) {
            field7655 = 1.0808189F;
        }
        while (class312.field4420.length > var3) {
            class91.field1312[var3] = 12;
            ++var3;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
    public class552() {
        super(1, true);
    }
}
