import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class120 extends class430 {

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "[B")
    public byte[] field1642;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field1639 = -1;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([B)V")
    public class120(byte[] arg0) {
        this.field1642 = arg0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)Z")
    public static final boolean method839(int arg0, int arg1, byte arg2) {
        int var3 = 23 % ((arg2 + 24) / 53);
        field1640++;
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBILl;)V")
    public static final void method840(int arg0, int arg1, byte arg2, int arg3, class639 arg4) {
        if (arg3 != -14808) {
            return;
        }
        field1641++;
        int var5 = arg4.field4646[0];
        int var6 = arg4.field4645[0];
        if (var5 < 0 || class184.field2546 <= var5 || var6 < 0 || class240.field3555 <= var6 || arg0 < 0 || arg0 >= class184.field2546 || arg1 < 0 || class240.field3555 <= arg1) {
            return;
        }
        int var7 = class235.method1638(arg4.method2053(true), true, class6.field57[arg4.field3920], 0, -4, arg0, 0, arg3 + 31913, 0, var6, 0, arg1, class47.field786, class332.field4509, var5);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg4.method3685(class332.field4509[var8], arg2, 0, class47.field786[var8]);
            }
        }
    }
}
