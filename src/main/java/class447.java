import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class447 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public int field6430 = 8;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public int field6436 = 16777215;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "S")
    public static short field6434 = 320;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "[Lrc;")
    public static class501[] field6429 = new class501[14];

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public int field6427;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public int field6428;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public int field6431;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public int field6437;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public int field6440;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "Z")
    public boolean field6438;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public static void method2687(int arg0) {
        if (arg0 != -6) {
            field6432 = 120;
        }
        field6429 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2688(String arg0, int arg1) {
        field6439++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + (var3 << 5) - var3;
        }
        return arg1 == 8 ? var3 : 79;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lqh;IB)V")
    private final void method2689(class61 arg0, int arg1, byte arg2) {
        field6435++;
        if (arg2 < 125) {
            return;
        }
        if (arg1 == 1) {
            this.field6430 = arg0.method723((byte) -25);
        } else if (arg1 == 2) {
            this.field6438 = true;
        } else if (arg1 == 3) {
            this.field6440 = arg0.method721(-461515024);
            this.field6427 = arg0.method721(-461515024);
            this.field6428 = arg0.method721(-461515024);
        } else if (arg1 == 4) {
            this.field6437 = arg0.method732(-559537960);
        } else if (arg1 == 5) {
            this.field6431 = arg0.method723((byte) -25);
        } else if (arg1 == 6) {
            this.field6436 = arg0.method740((byte) 115);
            return;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILqh;)V")
    public final void method2690(int arg0, class61 arg1) {
        while (true) {
            int var3 = arg1.method732(-559537960);
            if (var3 == 0) {
                field6433++;
                if (arg0 < 4) {
                    method2688(null, -74);
                    return;
                }
                return;
            }
            this.method2689(arg1, var3, (byte) 126);
        }
    }
}
