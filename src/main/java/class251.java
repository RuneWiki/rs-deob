import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class251 extends class349 {

    @OriginalMember(owner = "client!an", name = "B", descriptor = "I")
    private int field3381 = 0;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "I")
    private int field3382 = 4096;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "I")
    public static int field3388 = -1;

    @OriginalMember(owner = "client!an", name = "J", descriptor = "I")
    public static int field3389 = -1;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "Lcb;")
    public static class318 field3386 = new class318(86, 2);

    @OriginalMember(owner = "client!an", name = "F", descriptor = "F")
    public static float field3385;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILdga;)V", line = 5)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field3382 = arg2.method922((byte) -121);
            }
        } else {
            this.field3381 = arg2.method922((byte) -123);
        }
        if (arg0 == 4095) {
            ++field3387;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 92)
    public class251() {
        super(1, true);
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(B)V", line = 47)
    public static void method1562(byte arg0) {
        field3386 = null;
        if (arg0 <= 89) {
            field3388 = 30;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(BI)[I", line = 57)
    public final int[] method13(byte arg0, int arg1) {
        ++field3384;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int[] var4 = this.method2181(0, -1090477337, arg1);
            for (int var5 = 0; ~class39.field497 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3381 && var6 <= this.field3382 ? 4096 : 0;
            }
        }
        int var7 = -128 % ((56 - arg0) / 41);
        return var3;
    }
}
