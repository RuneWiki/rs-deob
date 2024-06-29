import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class72 extends class367 implements class92 {

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "F")
    public static float field1244;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)J", line = 6)
    public final long method512(boolean arg0) {
        ++field1249;
        if (arg0) {
            this.method512(false);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(B)V", line = 17)
    public final void method513(byte arg0) {
        ++field1247;
        super.field5710.method1411(this, 75);
        if (arg0 < 89) {
            field1244 = -0.46376705F;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I", line = 28)
    public final int method514(int arg0) {
        if (arg0 != -10228) {
            this.method512(true);
        }
        ++field1246;
        return this.field1251;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lih;ILjaggl/memory/NativeBuffer;IZ)V", line = 41)
    public class72(class214 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1251 = arg1;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lih;I[BIZ)V", line = 49)
    public class72(class214 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1251 = arg1;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)Z", line = 60)
    public static final boolean method515(int arg0, int arg1, int arg2) {
        ++field1248;
        if (arg2 >= -12) {
            method515(96, 17, -112);
        }
        return ~(arg0 & 2048) != -1;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B[BII)V", line = 74)
    public final void method516(byte arg0, byte[] arg1, int arg2, int arg3) {
        this.method2332(arg2, (byte) 28, arg1);
        ++field1245;
        this.field1251 = arg3;
        int var5 = 19 % ((-64 - arg0) / 32);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)I", line = 85)
    public final int method517(byte arg0) {
        ++field1250;
        if (arg0 > -86) {
            this.method512(false);
        }
        return super.field5709;
    }
}
