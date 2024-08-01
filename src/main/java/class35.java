import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dd")
public class class35 extends class85 {

    @OriginalMember(owner = "dd", name = "Q", descriptor = "Llf;")
    public static class109 field778 = method275("<br>(X", 2);

    @OriginalMember(owner = "dd", name = "W", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "dd", name = "R", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "dd", name = "S", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "dd", name = "U", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "dd", name = "V", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "dd", name = "X", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "dd", name = "Y", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "dd", name = "Z", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "dd", name = "ab", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "dd", name = "T", descriptor = "[I")
    public static int[] field781;

    @OriginalMember(owner = "dd", name = "<init>", descriptor = "(I)V")
    private class35(int arg0) {
        super(0, false);
        this.method274(arg0, (byte) 27);
    }

    @OriginalMember(owner = "dd", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        if (arg1 != 2177) {
            this.field786 = -38;
        }
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (super.field1719.field1926) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class57.field1152; ++var7) {
                var5[var7] = this.field785;
                var4[var7] = this.field783;
                var6[var7] = this.field786;
            }
        }
        ++field779;
        return var3;
    }

    @OriginalMember(owner = "dd", name = "e", descriptor = "(I)V")
    public static void method273(int arg0) {
        int var1 = -79 % ((arg0 - 36) / 42);
        field778 = null;
        field781 = null;
    }

    @OriginalMember(owner = "dd", name = "a", descriptor = "(IB)V")
    private final void method274(int arg0, byte arg1) {
        this.field785 = 4080 & arg0 >> 12;
        int var3 = -89 / ((88 - arg1) / 36);
        ++field782;
        this.field786 = (arg0 & 255) << 4;
        this.field783 = arg0 >> 4 & 4080;
    }

    @OriginalMember(owner = "dd", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field780;
        if (~arg1 == -1) {
            this.method274(arg2.method578((byte) 59), (byte) 127);
        }
        if (arg0 >= -120) {
            this.method31((byte) -127, -35, (class86) null);
        }
    }

    @OriginalMember(owner = "dd", name = "a", descriptor = "(Ljava/lang/String;I)Llf;")
    public static final class109 method275(String arg0, int arg1) {
        ++field788;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class109 var5 = new class109();
        if (arg1 != 2) {
            method273(52);
        }
        var5.field2182 = new byte[var3];
        while (~var4 > ~var3) {
            int var6 = var2[var4++] & 255;
            if (var6 <= 45 && ~var6 <= -41) {
                if (~var3 >= ~var4) {
                    break;
                }
                int var7 = var2[var4++] & 255;
                var5.field2182[var5.field2176++] = (byte) (var6 * 43 + var7 + -48 + -1720);
            } else if (~var6 != -1) {
                var5.field2182[var5.field2176++] = (byte) var6;
            }
        }
        var5.method791(arg1 + 18877);
        return var5.method775(arg1 + 18710);
    }

    @OriginalMember(owner = "dd", name = "<init>", descriptor = "()V")
    public class35() {
        this(0);
    }
}
