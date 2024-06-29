import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class547 extends class301 {

    @OriginalMember(owner = "client!og", name = "Eb", descriptor = "Lbea;")
    public static class539 field7813 = new class539();

    @OriginalMember(owner = "client!og", name = "Fb", descriptor = "Lqg;")
    public static class266 field7814 = new class266();

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!og", name = "Db", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!og", name = "Gb", descriptor = "Ljt;")
    public static class36 field7815;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(I)V")
    public class547(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(FI)V")
    public final void method3200(float arg0, int arg1) {
        ++field7812;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field4543[super.field4534++] = (byte) (var3 >> 24);
        super.field4543[super.field4534++] = (byte) (var3 >> 16);
        super.field4543[super.field4534++] = (byte) (var3 >> 8);
        if (arg1 != 238551736) {
            this.method3201(112, -0.033819295F);
        }
        super.field4543[super.field4534++] = (byte) var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IF)V")
    public final void method3201(int arg0, float arg1) {
        ++field7811;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field4543[super.field4534++] = (byte) var3;
        super.field4543[super.field4534++] = (byte) (var3 >> 8);
        super.field4543[super.field4534++] = (byte) (var3 >> 16);
        if (arg0 != -1581865480) {
            field7814 = null;
        }
        super.field4543[super.field4534++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!og", name = "m", descriptor = "(B)V")
    public static void method3202(byte arg0) {
        field7813 = null;
        field7815 = null;
        int var1 = -124 % ((29 - arg0) / 60);
        field7814 = null;
    }
}
