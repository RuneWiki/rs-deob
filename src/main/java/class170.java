import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class170 {

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public int field2514 = 0;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "[[I")
    public static int[][] field2510 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2512 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "F")
    public static float field2515 = 0.0F;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLap;I)V", line = 6)
    private final void method1274(byte arg0, class289 arg1, int arg2) {
        if (arg2 == 5) {
            this.field2514 = arg1.method1853(118);
        }
        field2507++;
        int var4 = 76 % ((arg0 - 16) / 56);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)I", line = 23)
    public static final int method1275(boolean arg0) {
        if (arg0) {
            method1275(false);
        }
        field2516++;
        return class445.field6399;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 37)
    public static void method1276(byte arg0) {
        field2510 = null;
        if (arg0 > 34) {
            field2512 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lap;I)V", line = 50)
    public final void method1277(class289 arg0, int arg1) {
        int var3 = -28 / ((arg1 + 28) / 60);
        field2513++;
        while (true) {
            int var4 = arg0.method1861((byte) -72);
            if (var4 == 0) {
                return;
            }
            this.method1274((byte) -98, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZB)Z", line = 71)
    public static final boolean method1278(boolean arg0, byte arg1) {
        field2511++;
        boolean var2 = class249.field3415.method250();
        if (arg1 < 9) {
            field2512 = null;
        }
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class249.field3415.method101();
        } else if (!class249.field3415.method173()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class318.field4308 = arg0;
            class447.method2786((byte) 90, class30.field502);
            return true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lrk;I)V", line = 112)
    public static final void method1279(class427 arg0, int arg1) {
        field2508++;
        if (arg1 != 4) {
            field2512 = null;
        }
        class296.field3993 = arg0;
    }
}
