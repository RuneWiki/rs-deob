import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class304 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[S")
    public short[] field4553;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "J")
    public long field4551;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public int[] field4554;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[S")
    public short[] field4556;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZLdd;I)V", line = 6)
    public static final void method2007(int arg0, int arg1, boolean arg2, class731 arg3, int arg4) {
        if (arg2) {
            arg3.field10211.method879((byte) -56, arg0);
            field4555++;
            arg3.field10211.method860(arg1, (byte) 119);
            arg3.field10211.method896(arg4, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(J[I[S[S)V", line = 23)
    public class304(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field4553 = arg2;
        this.field4551 = arg0;
        this.field4554 = arg1;
        this.field4556 = arg3;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 33)
    protected class304() {
    }
}
