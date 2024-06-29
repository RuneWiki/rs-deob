import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class391 extends class538 {

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "S")
    public short field5912;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "S")
    public short field5913;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "[I")
    public static int[] field5908;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)Z", line = 5)
    public final boolean method1809(int arg0) {
        if (arg0 != 0) {
            field5908 = null;
        }
        ++field5917;
        return class406.field6066[(super.field7895 >> class125.field1831) - -class176.field2466 + -class361.field5293][(super.field7896 >> class125.field1831) + class176.field2466 + -class545.field8045];
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)V", line = 17)
    public final void method315(byte arg0) {
        ++field5915;
        if (arg0 > 101) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(B)V", line = 30)
    public static void method2422(byte arg0) {
        if (arg0 != -118) {
            method2423(-80, (byte) -36);
        }
        field5908 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)I", line = 42)
    public static final int method2423(int arg0, byte arg1) {
        if (arg1 != 89) {
            field5908 = null;
        }
        ++field5910;
        int var2 = (1431655765 & arg0 >>> 1) + (arg0 & 1431655765);
        int var3 = (var2 & 858993459) - -(858993459 & var2 >>> 2);
        int var4 = 252645135 & (var3 >>> 4) + var3;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 255;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILr;ILcaa;ZII)V", line = 61)
    public final void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6) {
        ++field5914;
        if (arg5 > 24) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(Z)Z", line = 72)
    public final boolean method309(boolean arg0) {
        ++field5911;
        return !arg0 ? false : false;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[Ltg;)I", line = 87)
    public final int method1808(int arg0, class334[] arg1) {
        if (arg0 != 16) {
            this.method1807(false);
        }
        ++field5916;
        return this.method3104(super.field7895 >> class125.field1831, super.field7896 >> class125.field1831, (byte) -51, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIIIIII)V", line = 97)
    public class391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field7896 = arg2;
        this.field5912 = (short) arg6;
        super.field7895 = arg0;
        super.field7894 = arg1;
        super.field7905 = (byte) arg3;
        this.field5913 = (short) arg5;
        super.field7900 = (byte) arg4;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(Z)Z", line = 111)
    public final boolean method1807(boolean arg0) {
        ++field5907;
        if (arg0) {
            this.field5912 = 41;
        }
        return class476.method2735(super.field7896 >> class125.field1831, super.field7895 >> class125.field1831, this.method271(false), -1, super.field7900);
    }
}
