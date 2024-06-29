import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class182 extends class379 {

    @OriginalMember(owner = "client!mm", name = "Lb", descriptor = "[Ljava/lang/String;")
    public static String[] field2602 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!mm", name = "Mb", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!mm", name = "Nb", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!mm", name = "Ob", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(I)V", line = 3)
    public class182(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BF)V", line = 7)
    public final void method1194(byte arg0, float arg1) {
        ++field2604;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field5152[super.field5173++] = (byte) (var3 >> 24);
        super.field5152[super.field5173++] = (byte) (var3 >> 16);
        super.field5152[super.field5173++] = (byte) (var3 >> 8);
        super.field5152[super.field5173++] = (byte) var3;
        int var4 = -104 / ((arg0 - 25) / 52);
    }

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "(B)V", line = 22)
    public static final void method1195(byte arg0) {
        ++field2603;
        if (arg0 >= -52) {
            method1195((byte) 17);
        }
        class190.method1229();
    }

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "(B)V", line = 36)
    public static void method1196(byte arg0) {
        if (arg0 < 126) {
            field2602 = null;
        }
        field2602 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IF)V", line = 46)
    public final void method1197(int arg0, float arg1) {
        ++field2605;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field5152[super.field5173++] = (byte) var3;
        super.field5152[super.field5173++] = (byte) (var3 >> 8);
        super.field5152[super.field5173++] = (byte) (var3 >> 16);
        if (arg0 != 1495637648) {
            field2602 = null;
        }
        super.field5152[super.field5173++] = (byte) (var3 >> 24);
    }
}
