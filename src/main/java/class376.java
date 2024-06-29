import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class376 extends class361 {

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public int field5336 = 0;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "Z")
    public static volatile boolean field5333 = true;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lwm;B)V", line = 3)
    public final void method2193(class403 arg0, byte arg1) {
        if (arg1 != -14) {
            this.method2195((byte) -64, null, -43);
        }
        while (true) {
            int var3 = arg0.method2357((byte) 110);
            if (var3 == 0) {
                field5335++;
                return;
            }
            this.method2195((byte) 122, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 26)
    public static final void method2194(String arg0, byte arg1) {
        if (arg1 != -122) {
            method2194(null, (byte) 27);
        }
        field5332++;
        if (!arg0.equals("")) {
            class22.field257++;
            class61.method498(class247.field3708, arg1 ^ 0xFFFFFF87);
            class30.field357.method2376((byte) 122, class540.method3175(arg0, 1));
            class30.field357.method2377((byte) -53, arg0);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLwm;I)V", line = 48)
    private final void method2195(byte arg0, class403 arg1, int arg2) {
        if (arg0 != 122) {
            this.method2193(null, (byte) -9);
        }
        if (arg2 == 2) {
            this.field5336 = arg1.method2338(0);
        }
        field5334++;
    }
}
