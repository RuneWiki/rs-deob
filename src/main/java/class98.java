import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class98 extends class355 {

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "F")
    public float field1705;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "F")
    public float field1702;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "Z")
    public boolean field1700;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "Lbv;")
    public static class567 field1703 = new class567("K", "T", "K", "K");

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field1708 = 0;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "Lha;")
    public static class116 field1706;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljj;IIIII[BI)V")
    public class98(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1704 = arg2;
        this.field1701 = arg3;
        this.method2161(arg6, 0, arg2, (byte) -119, true, 0, 0, arg3, arg7, 0);
        this.field1705 = (float) arg2 / (float) arg4;
        this.field1702 = (float) arg3 / (float) arg5;
        this.field1700 = false;
        this.method2163(105, false, false);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljj;IIIZ[I)V")
    public class98(class66 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field1704 = arg2;
        if (super.field3347 != 34037) {
            this.field1700 = true;
            this.field1705 = this.field1702 = 1.0F;
        } else {
            this.field1705 = (float) arg2;
            this.field1702 = (float) arg3;
            this.field1700 = false;
        }
        this.field1701 = arg3;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public static void method844(int arg0) {
        field1703 = null;
        field1706 = null;
        int var1 = -29 / ((73 - arg0) / 53);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljj;IIIIIZ)V")
    public class98(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field1704 = arg4;
        if (super.field3347 != 34037) {
            this.field1700 = true;
            this.field1705 = this.field1702 = 1.0F;
        } else {
            this.field1705 = (float) arg4;
            this.field1700 = false;
            this.field1702 = (float) arg5;
        }
        this.field1701 = arg5;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljj;IIIIIIZ)V")
    public class98(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1702 = (float) arg4 / (float) arg6;
        this.field1700 = false;
        this.field1704 = arg3;
        this.field1705 = (float) arg3 / (float) arg5;
        this.field1701 = arg4;
        this.method2163(77, false, false);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljj;IIII[I)V")
    public class98(class66 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1701 = arg2;
        this.field1704 = arg1;
        this.method2164(0, 0, arg5, 0, -26929, arg1, 0, arg2, true);
        this.field1705 = (float) arg1 / (float) arg3;
        this.field1702 = (float) arg2 / (float) arg4;
        this.field1700 = false;
        this.method2163(110, false, false);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljj;IIIIZ[BI)V")
    public class98(class66 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field3347 == 34037) {
            this.field1705 = (float) arg3;
            this.field1700 = false;
            this.field1702 = (float) arg4;
        } else {
            this.field1700 = true;
            this.field1705 = this.field1702 = 1.0F;
        }
        this.field1704 = arg3;
        this.field1701 = arg4;
    }
}
