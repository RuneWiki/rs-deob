import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class328 {

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "J")
    private long field4640;

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
    private int field4641;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ofa", name = "i", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "Lkr;")
    public static class743 field4637;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIII)V", line = 3)
    public static final void method2092(int arg0, int arg1, int arg2, int arg3) {
        field4643++;
        if (class609.field8824 == arg2 && class501.field7165 == arg3 && class32.field424 == arg0) {
            return;
        }
        class70.field1267 = true;
        class501.field7165 = arg3;
        class32.field424 = arg0;
        class609.field8824 = arg2;
        double var4 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg3 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        int var16 = -83 % ((-arg1 - 23) / 37);
        class123.field1905 = var8 * var12;
        class300.field4192 = var12;
        class552.field7733 = var14;
        class449.field6224 = var10 * var14;
        class428.field5983 = var10;
        class6.field103 = var8;
        class586.field8255 = -var10 * var12;
        class408.field5679 = 0.0D;
        class478.field6825 = -var8 * var14;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILwca;)V", line = 65)
    private final void method2093(int arg0, class674 arg1) {
        this.field4640 |= (arg1.field9451 << this.field4641++ * class674.field9465);
        field4639++;
        if (arg0 != 2) {
            this.field4641 = -7;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V", line = 76)
    public static void method2094(int arg0) {
        if (arg0 > 7) {
            field4637 = null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZI)I", line = 87)
    private final int method2095(boolean arg0, int arg1) {
        if (arg0) {
            this.method2095(true, 83);
        }
        field4642++;
        return (int) (this.field4640 >> class674.field9465 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IBIII)Z", line = 98)
    public static final boolean method2096(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4636++;
        if ((class435.field6078[0][arg0][arg3] & 0x2) != 0) {
            return true;
        } else if (arg1 != -73) {
            return true;
        } else if ((class435.field6078[arg2][arg0][arg3] & 0x10) == 0) {
            return class673.method3809(arg2, 76, arg0, arg3) == arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)Lwca;", line = 121)
    public final class674 method2097(int arg0, int arg1) {
        field4638++;
        int var3 = 124 / ((arg0 - 57) / 34);
        return class674.method3811((byte) 97, this.method2095(false, arg1));
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)I", line = 132)
    public final int method2098(int arg0) {
        if (arg0 != -28377) {
            field4637 = null;
        }
        field4635++;
        return this.field4641;
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lwca;)V", line = 144)
    public class328(class674 arg0) {
        this.field4640 = arg0.field9451;
        this.field4641 = 1;
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "([Lwca;)V", line = 153)
    public class328(class674[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2093(2, arg0[var2]);
        }
    }
}
