import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class138 extends class182 {

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    private int field2265 = 4096;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "J")
    public static long field2259 = 0L;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field2264 = 0;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2261 = "Loading...";

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Laj;")
    public static class151 field2258;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILaj;ZLaj;)V")
    public static final void method1017(int arg0, class151 arg1, boolean arg2, class151 arg3) {
        class278.field4625 = arg3;
        if (arg0 == 13459) {
            ++field2263;
            class160.field2615 = arg1;
            class96.field1554 = arg2;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg0) {
            method1017(-119, (class151) null, false, (class151) null);
        }
        ++field2260;
        if (~arg2 == -1) {
            this.field2265 = arg1.method1821((byte) 51);
        }
    }

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "(I)V")
    public static void method1018(int arg0) {
        field2258 = null;
        if (arg0 > -108) {
            method1018(-3);
        }
        field2261 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        int[] var3 = super.field2911.method77(arg1, -68);
        ++field2262;
        if (arg0) {
            this.method155(true, (class249) null, 12);
        }
        if (super.field2911.field287) {
            int[] var4 = this.method1323(0, -17707, class107.field1749 & arg1 + -1);
            int[] var5 = this.method1323(0, -17707, arg1);
            int[] var6 = this.method1323(0, -17707, class107.field1749 & arg1 + 1);
            for (int var7 = 0; var7 < class4.field116; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2265;
                int var9 = var8 >> 12;
                int var10 = var9 * var9 >> 12;
                int var11 = (var5[var7 + 1 & class103.field1644] + -var5[class103.field1644 & var7 + -1]) * this.field2265;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + 4096 - -var10) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class138() {
        super(1, true);
    }
}
