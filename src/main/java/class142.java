import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class142 extends class107 {

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    private int field2583 = 4096;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "Lcj;")
    public static class115 field2582;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field2586;
        if (arg0 != -17) {
            return null;
        } else {
            int[] var3 = super.field1921.method1388(arg1, (byte) -26);
            if (super.field1921.field3539) {
                int[] var4 = this.method797(0, class254.field4363 & arg1 + -1, (byte) 105);
                int[] var5 = this.method797(0, arg1, (byte) 93);
                int[] var6 = this.method797(0, class254.field4363 & arg1 + 1, (byte) 96);
                for (int var7 = 0; var7 < class106.field1862; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field2583;
                    int var9 = (var5[var7 + 1 & class110.field1937] - var5[var7 + -1 & class110.field1937]) * this.field2583;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                    int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class142() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "(I)V")
    public static void method981(int arg0) {
        if (arg0 <= 125) {
            field2585 = 4;
        }
        field2582 = null;
    }

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "(I)V")
    public static final void method982(int arg0) {
        class79.field1479 = null;
        class97.field1718 = null;
        class65.field1296 = null;
        class205.field3502 = null;
        class261.field4470 = null;
        class110.field1932 = null;
        class21.field391 = null;
        class144.field2603 = null;
        class131.field2311 = null;
        class149.field2647 = null;
        class138.field2386 = arg0;
        ++field2580;
        class59.field1210 = null;
        class54.field1122.method676(16841);
        class274.field4764 = null;
        class128.field2251 = null;
        class100.field1777 = null;
        class196.field3415 = null;
        class163.field2907 = null;
        class77.field1449 = null;
        class17.field302 = null;
        class11.field199 = null;
        class151.field2684 = null;
        class247.field4305 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field2581;
        if (arg2 == -32513) {
            if (~arg1 == -1) {
                this.field2583 = arg0.method339(arg2 ^ 16744703);
            }
        }
    }
}
