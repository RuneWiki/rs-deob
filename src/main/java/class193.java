import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class193 extends class263 {

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 5)
    public class193() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)[I", line = 9)
    public final int[] method33(int arg0, byte arg1) {
        ++field2851;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int[][] var4 = this.method1646(0, 2, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class367.field5597 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (arg1 <= 40) {
            this.method33(-107, (byte) 46);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILsr;ZI)V", line = 54)
    public static final void method1283(int arg0, class351 arg1, boolean arg2, int arg3) {
        if (arg1.field5973 == arg3 && arg3 != -1) {
            class520 var4 = class510.field7490.method575(arg3, -78);
            int var5 = var4.field7618;
            if (~var5 == -2) {
                arg1.field6009 = 0;
                arg1.field6011 = 1;
                arg1.field5977 = 0;
                arg1.field5992 = 0;
                arg1.field6002 = arg0;
                class283.method1761(var4, false, arg1.field7671, -45, arg1.field7686, arg1.field7681, arg1.field5992);
            }
            if (~var5 == -3) {
                arg1.field6009 = 0;
            }
        } else if (arg3 == -1 || arg1.field5973 == -1 || class510.field7490.method575(arg3, -126).field7644 >= class510.field7490.method575(arg1.field5973, -111).field7644) {
            arg1.field5992 = 0;
            arg1.field6011 = 1;
            arg1.field6009 = 0;
            arg1.field6002 = arg0;
            arg1.field5977 = 0;
            arg1.field6064 = arg1.field6066;
            arg1.field5973 = arg3;
            if (arg1.field5973 != -1) {
                class283.method1761(class510.field7490.method575(arg1.field5973, -77), false, arg1.field7671, -44, arg1.field7686, arg1.field7681, arg1.field5992);
            }
        }
        if (!arg2) {
            ++field2849;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)I", line = 111)
    public static final int method1284(int arg0, int arg1) {
        if (arg1 != -4418) {
            return -64;
        } else {
            ++field2850;
            return 255 & arg0;
        }
    }
}
