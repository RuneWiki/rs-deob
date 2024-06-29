import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class204 extends class16 {

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field2822;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[Z")
    public static boolean[] field2824 = new boolean[100];

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "S")
    public static short field2827;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "Leb;")
    public static class439 field2828;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Lpc;")
    public static class473 field2826;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public static final void method1307(byte arg0) {
        field2825++;
        if (class383.field5225 == null || class289.field3779 == null) {
            class289.field3779 = new int[256];
            class383.field5225 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class383.field5225[var1] = (int) (Math.sin(var2) * 4096.0D);
                class289.field3779[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 64) {
            method1307((byte) 119);
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    public final void method1308(int arg0) {
        field2823++;
        if (arg0 == -257) {
            this.field2822.method2532();
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
    public static void method1309(boolean arg0) {
        if (arg0) {
            method1307((byte) 17);
        }
        field2826 = null;
        field2824 = null;
        field2828 = null;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
    public class204(int arg0) {
        this.field2822 = new NativeHeap(arg0);
    }

    static {
        new class304("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field2827 = 205;
    }
}
