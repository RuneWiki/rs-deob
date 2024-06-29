import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class68 extends class335 {

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    private int field1125 = 0;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
    private int field1131 = 4096;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
    public static int field1130 = 0;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "Lnb;")
    public static class161 field1127;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLl;)V", line = 5)
    public static final void method522(byte arg0, class133 arg1) {
        if (arg0 != 107) {
            method523((byte) 53);
        }
        field1123++;
        class332.field5169 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)V", line = 22)
    public static void method523(byte arg0) {
        field1127 = null;
        if (arg0 != 15) {
            method522((byte) -40, (class133) null);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)[I", line = 36)
    public final int[] method149(int arg0, int arg1) {
        if (arg1 != 621) {
            this.method149(-87, -99);
        }
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        field1128++;
        if (this.field5233.field2467) {
            int[] var4 = this.method2330(arg0, true, 0);
            for (int var5 = 0; var5 < class105.field1630; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1125 && this.field1131 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 138)
    public class68() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)Ltb;", line = 78)
    public static final class220 method524(byte arg0, int arg1) {
        field1124++;
        int var2 = arg1 >> 16;
        if (arg0 >= -78) {
            return (class220) null;
        }
        int var3 = arg1 & 0xFFFF;
        if (class163.field2463[var2] == null || class163.field2463[var2][var3] == null) {
            boolean var4 = class321.method2189(var2, (byte) 79);
            if (!var4) {
                return null;
            }
        }
        return class163.field2463[var2][var3];
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILkh;I)V", line = 102)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field1129++;
        if (arg2 < 51) {
            method524((byte) -63, -63);
        }
        if (arg0 == 0) {
            this.field1125 = arg1.method1151(-67);
        } else if (arg0 == 1) {
            this.field1131 = arg1.method1151(-94);
        }
    }
}
