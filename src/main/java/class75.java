import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class75 extends class238 implements class525 {

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1260 = 0;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lvj;ILjaggl/memory/NativeBuffer;)V", line = 5)
    public class75(class303 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field1259 = arg1;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lvj;I[BI)V", line = 17)
    public class75(class303 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1259 = arg1;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)I", line = 26)
    public final int method601(int arg0) {
        ++field1264;
        if (arg0 != 536) {
            field1260 = -90;
        }
        return this.field1259;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)J", line = 38)
    public final long method602(int arg0) {
        if (arg0 != -16182) {
            return -84L;
        } else {
            ++field1263;
            return super.field3435.method2628();
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIII)V", line = 51)
    public final void method603(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method1557(arg0, arg1);
        ++field1261;
        this.field1259 = arg3;
        if (arg2 != 19049) {
            this.method603((byte[]) null, -120, 61, 62);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)I", line = 63)
    public final int method604(byte arg0) {
        if (arg0 != 35) {
            return 44;
        } else {
            ++field1262;
            return 0;
        }
    }
}
