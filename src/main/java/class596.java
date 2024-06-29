import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class596 extends class440 {

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    private int field8423 = 4096;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    private int field8429 = 0;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "[I")
    public static int[] field8427;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
    public static final void method3370(int arg0) {
        if (arg0 < 9) {
            field8427 = null;
        }
        ++field8428;
        try {
            if (~class313.field4623 == -2) {
                int var1 = class323.field4762.method409(-1);
                if (~var1 < -1 && class323.field4762.method382(true)) {
                    int var2 = var1 - class599.field8465;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class323.field4762.method402(var2, (byte) -91);
                    return;
                }
                class323.field4762.method395((byte) 109);
                class323.field4762.method388(-111);
                class294.field4326 = null;
                class390.field5781 = null;
                if (class208.field2929 != null) {
                    class313.field4623 = 2;
                } else {
                    class313.field4623 = 0;
                }
            }
            if (class313.field4623 == 3) {
                int var3 = class323.field4762.method409(-1);
                if (var3 < field8425 && class323.field4762.method382(true)) {
                    int var4 = class676.field9576 + var3;
                    if (field8425 < var4) {
                        var4 = field8425;
                    }
                    class323.field4762.method402(var4, (byte) -91);
                } else {
                    class313.field4623 = 0;
                    class676.field9576 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class323.field4762.method395((byte) 117);
            class313.field4623 = 0;
            class208.field2929 = null;
            class390.field5781 = null;
            class294.field4326 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        ++field8424;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        int var4 = 47 % ((-56 - arg0) / 41);
        if (super.field6412.field8047) {
            int[] var5 = this.method2611(104, arg1, 0);
            for (int var6 = 0; var6 < class549.field7715; ++var6) {
                int var7 = var5[var6];
                var3[var6] = this.field8429 <= var7 && ~var7 >= ~this.field8423 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        ++field8422;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field8423 = arg1.method3847((byte) 118);
            }
        } else {
            this.field8429 = arg1.method3847((byte) 118);
        }
        if (arg0 != 5) {
            this.field8423 = 27;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    public static final void method3371(byte arg0) {
        class586.field8207 = null;
        class515.field7284 = null;
        class274.field4182 = null;
        class83.field1371 = null;
        class135.field1981 = null;
        class498.field7055 = null;
        class420.field6107 = null;
        class272.field4093 = null;
        class626.field8768 = null;
        class563.field7931 = null;
        class258.field3939 = null;
        class26.field391 = null;
        class351.field5064 = null;
        class143.field2110 = null;
        class580.field8176 = null;
        ++field8430;
        class571.field8048 = null;
        class305.field4534 = null;
        int var1 = 38 % ((arg0 - -74) / 40);
        class124.field1863 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class596() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "(I)V")
    public static void method3372(int arg0) {
        field8427 = null;
        if (arg0 <= 71) {
            method3372(-116);
        }
    }
}
