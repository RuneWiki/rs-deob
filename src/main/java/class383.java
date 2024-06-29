import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class383 extends class400 {

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    private int field5348;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    private int field5350;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    private int field5349;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    private int field5353;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Lbn;")
    public static class371 field5347 = new class371(4, 1, 1, 1);

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Luv;")
    public static class3 field5351 = new class3(5, 4);

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field5355 = 0;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIII)V")
    public class383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5348 = arg1;
        this.field5350 = arg0;
        this.field5349 = arg3;
        this.field5353 = arg2;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)V")
    public final void method1099(int arg0, int arg1, int arg2) {
        ++field5345;
        int var4 = this.field5350 * arg2 >> 12;
        int var5 = this.field5353 * arg2 >> 12;
        if (arg1 != 4095) {
            this.method1096(3, 102, 64);
        }
        int var6 = this.field5348 * arg0 >> 12;
        int var7 = this.field5349 * arg0 >> 12;
        class131.method697(var4, super.field5478, super.field5482, var6, var7, var5, super.field5481, (byte) 58);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
    public final void method1096(int arg0, int arg1, int arg2) {
        ++field5346;
        int var4 = this.field5350 * arg0 >> 12;
        int var5 = this.field5353 * arg0 >> 12;
        int var6 = this.field5348 * arg1 >> 12;
        int var7 = this.field5349 * arg1 >> 12;
        int var8 = -55 / ((arg2 - 23) / 33);
        class568.method3180(116, var5, var6, super.field5478, var7, var4);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method2326(byte arg0) {
        if (arg0 != 61) {
            method2326((byte) -100);
        }
        field5347 = null;
        field5351 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Ltaa;")
    public static final class272 method2327(int arg0) {
        ++field5354;
        if (arg0 != 22300) {
            field5347 = null;
        }
        return class447.field6332.length > class227.field2909 ? class447.field6332[class227.field2909++] : null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)V")
    public final void method1098(int arg0, int arg1, byte arg2) {
        if (arg2 == -81) {
            ++field5352;
        }
    }
}
