import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class70 extends class148 {

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    private int field1060 = 0;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    private int field1057 = 4096;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "[I")
    public static int[] field1058 = new int[256];

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Z")
    public static boolean field1059 = false;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "[F")
    public static float[] field1062 = new float[16];

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "[Ljv;")
    public static class55[] field1063;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        ++field1061;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field1057 = arg1.method1450((byte) 100);
            }
        } else {
            this.field1060 = arg1.method1450((byte) 89);
        }
        int var5 = 15 % ((-88 - arg2) / 33);
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    public static void method407(int arg0) {
        field1058 = null;
        field1062 = null;
        field1063 = null;
        if (arg0 != 16) {
            method407(-111);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class70() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field1056;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int[] var4 = this.method971(false, arg1, 0);
            for (int var5 = 0; ~class320.field4579 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1060 && ~var6 >= ~this.field1057 ? 4096 : 0;
            }
        }
        if (arg0 >= -65) {
            field1059 = true;
        }
        return var3;
    }
}
