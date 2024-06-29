import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class385 extends class374 {

    @OriginalMember(owner = "client!gt", name = "Gb", descriptor = "[B")
    public static byte[] field5080 = new byte[2048];

    @OriginalMember(owner = "client!gt", name = "Fb", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!gt", name = "Hb", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!gt", name = "Ib", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "(I)V", line = 4)
    public static void method2219(int arg0) {
        int var1 = -58 % ((arg0 - 36) / 54);
        field5080 = null;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(I)V", line = 13)
    public class385(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IF)V", line = 16)
    public final void method2220(int arg0, float arg1) {
        ++field5082;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field4929[super.field4966++] = (byte) var3;
        if (arg0 >= -53) {
            field5080 = null;
        }
        super.field4929[super.field4966++] = (byte) (var3 >> 8);
        super.field4929[super.field4966++] = (byte) (var3 >> 16);
        super.field4929[super.field4966++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(IF)V", line = 40)
    public final void method2221(int arg0, float arg1) {
        ++field5081;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field4929[super.field4966++] = (byte) (var3 >> 24);
        super.field4929[super.field4966++] = (byte) (var3 >> 16);
        if (arg0 > -127) {
            this.method2220(26, -1.6989048F);
        }
        super.field4929[super.field4966++] = (byte) (var3 >> 8);
        super.field4929[super.field4966++] = (byte) var3;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILwv;)V", line = 57)
    public static final void method2222(int arg0, int arg1, int arg2, class31 arg3) {
        class349 var4 = class78.method450(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field4506 = arg3;
        }
    }
}
