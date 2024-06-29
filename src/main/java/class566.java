import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class566 extends class297 {

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    private int field7796 = 4096;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "Lkm;")
    public static class355 field7798 = null;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "Ljr;")
    public static class112 field7800 = new class112(4);

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "Lda;")
    public static class60 field7802;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
    public static void method3276(byte arg0) {
        if (arg0 != 59) {
            field7798 = null;
        }
        field7800 = null;
        field7802 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class566() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(B)V")
    public static final void method3277(byte arg0) {
        ++field7797;
        int var1 = class693.field9368.field4461.method2473(-32350);
        int var2 = 14 / ((arg0 - -34) / 61);
        if (var1 == 0) {
            class591.field8070 = null;
            class378.method2400(0, (byte) -61);
        } else if (~var1 == -2) {
            class173.method1295((byte) 0, 28587);
            class378.method2400(512, (byte) -61);
            if (class607.field8331 != null) {
                class238.method1658(3613);
            }
        } else {
            class173.method1295((byte) (class448.field6342 + -4 & 255), 28587);
            class378.method2400(2, (byte) -61);
        }
        class8.field93 = class382.field5551;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 != 31015) {
            this.method15(-111, 25);
        }
        ++field7799;
        if (arg1 == 0) {
            this.field7796 = arg0.method1478(842397944);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3278(int arg0, int arg1, byte arg2) {
        ++field7801;
        if (arg2 != 50) {
            return false;
        } else {
            return ~(52 & arg1) != -1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field7795;
        int[] var3 = super.field4165.method127(arg1 ^ arg1, arg0);
        if (super.field4165.field266) {
            int[] var4 = this.method1951(class319.field4394 & arg0 + -1, 633706337, 0);
            int[] var5 = this.method1951(arg0, 633706337, 0);
            int[] var6 = this.method1951(arg0 - -1 & class319.field4394, 633706337, 0);
            for (int var7 = 0; class525.field7275 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field7796;
                int var9 = (var5[class677.field9204 & var7 - -1] + -var5[class677.field9204 & var7 + -1]) * this.field7796;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -4096 + var13) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
