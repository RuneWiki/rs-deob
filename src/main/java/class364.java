import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class364 extends class289 {

    @OriginalMember(owner = "client!cb", name = "Hb", descriptor = "Lmg;")
    public static class103 field5327 = null;

    @OriginalMember(owner = "client!cb", name = "Jb", descriptor = "Z")
    public static boolean field5329 = false;

    @OriginalMember(owner = "client!cb", name = "Ib", descriptor = "[F")
    public static float[] field5328 = new float[4];

    @OriginalMember(owner = "client!cb", name = "Fb", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!cb", name = "Gb", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!cb", name = "Kb", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V", line = 5)
    public class364(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BF)V", line = 11)
    public final void method2232(byte arg0, float arg1) {
        int var3 = -80 / ((50 - arg0) / 53);
        ++field5330;
        int var4 = NativeStream.floatToRawIntBits(arg1);
        super.field4408[super.field4399++] = (byte) var4;
        super.field4408[super.field4399++] = (byte) (var4 >> 8);
        super.field4408[super.field4399++] = (byte) (var4 >> 16);
        super.field4408[super.field4399++] = (byte) (var4 >> 24);
    }

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "(I)V", line = 26)
    public static void method2233(int arg0) {
        field5327 = null;
        field5328 = null;
        int var1 = 14 % ((arg0 - -4) / 37);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(FI)V", line = 38)
    public final void method2234(float arg0, int arg1) {
        ++field5325;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field4408[super.field4399++] = (byte) (var3 >> 24);
        if (arg1 != -1933021816) {
            field5328 = null;
        }
        super.field4408[super.field4399++] = (byte) (var3 >> 16);
        super.field4408[super.field4399++] = (byte) (var3 >> 8);
        super.field4408[super.field4399++] = (byte) var3;
    }
}
