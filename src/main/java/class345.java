import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class345 extends class155 implements Runnable {

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public int field5071 = -1;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Z")
    private boolean field5073 = true;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Lpi;")
    private class228 field5068;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "Z")
    public static boolean field5075 = false;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Lil;")
    public static class274 field5069 = new class274(10, -1);

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "S")
    public static short field5076 = 32767;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field5079 = 0;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "[I")
    public static int[] field5078 = new int[2];

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 4)
    public static void method2236(byte arg0) {
        field5069 = null;
        int var1 = 77 % ((arg0 + 31) / 57);
        field5078 = null;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 15)
    public final void method2237(int arg0) {
        field5074++;
        this.field5073 = false;
        if (arg0 != -1) {
            this.method2237(7);
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V", line = 27)
    public final void method2238(int arg0) {
        if (arg0 != 19663) {
            field5069 = null;
        }
        (new Thread(this, "a")).start();
        field5070++;
    }

    @OriginalMember(owner = "client!qk", name = "run", descriptor = "()V", line = 39)
    public final void run() {
        while (this.field5073) {
            this.field5068.method1564(71, this);
        }
        field5072++;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lpi;)V", line = 68)
    public class345(class228 arg0) {
        this.field5068 = arg0;
    }
}
