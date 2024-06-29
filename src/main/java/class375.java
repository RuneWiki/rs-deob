import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class375 {

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    private int field5041 = 0;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    private int field5046 = 0;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "Lmw;")
    private class418 field5047 = null;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    private int field5053 = 0;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "Lgi;")
    private class583 field5049;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "Lde;")
    private class454 field5040;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "[Lmp;")
    private class648[] field5045;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "Lpm;")
    public class501 field5052;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5050++;
        if (arg2 < 128 || arg6 < 128 || (class32.field513 - 2) * 128 < arg2 || arg6 > ((class611.field8786 - 2) * 128)) {
            class328.field4394[0] = class328.field4394[1] = -1;
            return;
        }
        int var10 = class183.method1144(91, arg2, arg6, arg7) - arg9;
        class333.field4459.method1051(arg5, 0, 0);
        class69.field1165.method1355(class333.field4459);
        class69.field1165.method1324(arg2, var10, arg6, class328.field4394);
        if (arg3 == 22976) {
            class333.field4459.method1051(-arg5, 0, 0);
            class69.field1165.method1355(class333.field4459);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[BII)[B")
    public static final byte[] method2221(int arg0, byte[] arg1, int arg2, int arg3) {
        field5044++;
        byte[] var4 = new byte[arg0];
        if (arg2 < 1) {
            field5051 = -109;
        }
        class416.method2498(arg1, arg3, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILmw;I)Z")
    public final boolean method2222(int arg0, class418 arg1, int arg2) {
        if (arg0 != -9584) {
            return true;
        }
        field5043++;
        if (this.field5053 == 0) {
            return false;
        }
        if (this.field5047 != arg1) {
            this.field5045[Integer.MAX_VALUE & this.field5053].method942((byte) -30, arg1, arg2);
            this.field5047 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Z")
    public final boolean method2223(int arg0, int arg1) {
        if (arg0 != 15938) {
            method2220(-77, 11, -42, -19, 30, -79, -97, 21, 21, 97);
        }
        field5048++;
        return this.field5045[arg1].method946(124);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIIIIZ)V")
    public final void method2224(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg0 & this.field5049.method1294();
        field5042++;
        if (arg2 <= 59) {
            method2220(5, 64, 58, -14, 90, 69, 51, -110, -24, 117);
        }
        if (!var7 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
            if (arg3 == 4) {
                arg1 = arg4;
            }
            arg3 = 2;
        }
        if (arg3 != 0 && arg5) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field5053 != arg3) {
            if (this.field5053 != 0) {
                this.field5045[Integer.MAX_VALUE & this.field5053].method941(1);
            }
            if (arg3 != 0) {
                this.field5045[arg3 & Integer.MAX_VALUE].method947(17729, arg5);
                this.field5045[Integer.MAX_VALUE & arg3].method944((byte) -126, arg5);
                this.field5045[Integer.MAX_VALUE & arg3].method945(arg1, arg4, -63);
            }
            this.field5047 = null;
            this.field5041 = arg1;
            this.field5046 = arg4;
            this.field5053 = arg3;
        } else if (this.field5053 != 0) {
            this.field5045[this.field5053 & Integer.MAX_VALUE].method944((byte) -117, arg5);
            if (this.field5046 != arg4 || this.field5041 != arg1) {
                this.field5045[this.field5053 & Integer.MAX_VALUE].method945(arg1, arg4, -71);
                this.field5046 = arg4;
                this.field5041 = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lgi;)V")
    public class375(class583 arg0) {
        this.field5049 = arg0;
        this.field5040 = new class454(arg0);
        this.field5045 = new class648[10];
        this.field5045[1] = new class173(arg0);
        this.field5045[2] = new class285(arg0, this.field5040);
        this.field5045[4] = new class177(arg0, this.field5040);
        this.field5045[5] = new class554(arg0, this.field5040);
        this.field5045[6] = new class632(arg0);
        this.field5045[7] = new class143(arg0);
        this.field5045[3] = this.field5052 = new class501(arg0);
        this.field5045[8] = new class343(arg0, this.field5040);
        this.field5045[9] = new class272(arg0, this.field5040);
        if (!this.field5045[8].method946(123)) {
            this.field5045[8] = this.field5045[4];
        }
        if (!this.field5045[9].method946(127)) {
            this.field5045[9] = this.field5045[8];
        }
    }
}
