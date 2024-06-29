import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class152 extends class722 {

    @OriginalMember(owner = "client!fea", name = "L", descriptor = "Lmga;")
    public static class739 field2099 = new class739(56, 8);

    @OriginalMember(owner = "client!fea", name = "H", descriptor = "B")
    public byte field2095;

    @OriginalMember(owner = "client!fea", name = "E", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!fea", name = "I", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!fea", name = "J", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!fea", name = "K", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!fea", name = "M", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!fea", name = "F", descriptor = "Ljp;")
    public class376 field2094;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "(I)I", line = 4)
    public final int method1120(int arg0) {
        ++field2096;
        if (this.field2094 == null) {
            return 0;
        } else {
            return arg0 > -7 ? -125 : this.field2094.field5459 * 100 / (this.field2094.field5518.length + -this.field2095);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BIIIZ)V", line = 25)
    public static final void method1121(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2097;
        if (arg0 > -107) {
            method1122((byte) -91);
        }
        if (class768.method4253(-3, arg3)) {
            class341.method2160(-1, (byte) -118, arg2, class111.field1528[arg3], arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "(B)V", line = 40)
    public static void method1122(byte arg0) {
        int var1 = -89 / ((arg0 - -76) / 46);
        field2099 = null;
    }

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "(B)[B", line = 52)
    public final byte[] method1123(byte arg0) {
        if (arg0 > -106) {
            return null;
        } else {
            ++field2093;
            if (!super.field10051 && ~(this.field2094.field5518.length + -this.field2095) >= ~this.field2094.field5459) {
                return this.field2094.field5518;
            } else {
                throw new RuntimeException();
            }
        }
    }
}
