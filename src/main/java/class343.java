import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class343 extends class603 {

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "Lpu;")
    public static class559 field4824 = new class559(11, -1);

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "Lpk;")
    public static class195 field4827;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "[B")
    private byte[] field4822;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)Z")
    public static final boolean method2172(int arg0, int arg1, int arg2) {
        field4826++;
        if (arg2 >= -73) {
            field4827 = null;
        }
        return (arg0 & 0x70000) != 0 | class368.method2297(arg0, -123, arg1) || class555.method3249(arg1, arg0, 34336);
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class343() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
    public static void method2173(int arg0) {
        field4827 = null;
        if (arg0 != 16) {
            method2174((byte) 41, -45, -118);
        }
        field4824 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V")
    public final void method1157(int arg0, int arg1, byte arg2) {
        field4823++;
        int var4 = arg1 * 2;
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + arg0);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field4822[var10001] = var5;
        this.field4822[var6] = var5;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)V")
    public static final void method2174(byte arg0, int arg1, int arg2) {
        int var3 = 1 / ((59 - arg0) / 54);
        field4825++;
        if (class731.field10231 != 0) {
            if (arg1 < 0) {
                for (int var4 = 0; var4 < 16; var4++) {
                    class454.field6579[var4] = arg2;
                }
            } else {
                class454.field6579[arg1] = arg2;
            }
        }
        class284.field4029.method1671((byte) -118, arg2, arg1);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBI)[B")
    public final byte[] method2175(int arg0, int arg1, byte arg2, int arg3) {
        this.field4822 = new byte[arg3 * 2 * arg0 * arg1];
        field4828++;
        if (arg2 >= -10) {
            field4824 = null;
        }
        this.method2430(arg0, 124, arg1, arg3);
        return this.field4822;
    }
}
