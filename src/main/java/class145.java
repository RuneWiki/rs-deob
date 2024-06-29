import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class145 extends class102 implements Runnable {

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "Z")
    private boolean field2274 = true;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public int field2273 = -1;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "Lhb;")
    private class431 field2280;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public static int field2275 = 0;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "[I")
    public static int[] field2278 = new int[5];

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    public static int field2283 = 127;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field2286 = 0;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "F")
    public static float field2277;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V")
    public static void method1048(int arg0) {
        if (arg0 == 32026) {
            field2278 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Ljk;")
    public static final class378 method1049(int arg0, int arg1) {
        field2282++;
        class378 var2 = (class378) class421.field6211.method1660(2, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = 72 / ((-arg0 - 44) / 50);
        byte[] var4 = class110.field1527.method2771(class120.method864((byte) 24, arg1), class381.method2423((byte) -42, arg1), 3);
        class378 var5 = new class378();
        if (var4 != null) {
            var5.method2410(new class186(var4), 119);
        }
        class421.field6211.method1655(false, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lhb;)V")
    public class145(class431 arg0) {
        this.field2280 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
    public final void method1050(int arg0) {
        field2276++;
        if (arg0 <= 22) {
            this.field2273 = -83;
        }
        (new Thread(this, "a")).start();
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V")
    public final void method1051(int arg0) {
        if (arg0 != 0) {
            method1049(-91, 114);
        }
        field2281++;
        this.field2274 = false;
    }

    @OriginalMember(owner = "client!rn", name = "run", descriptor = "()V")
    public final void run() {
        field2284++;
        while (this.field2274) {
            this.field2280.method2669((byte) -25, this);
        }
    }
}
