import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class56 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public int field727 = 0;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field733 = 99;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Z")
    public static boolean field731 = false;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "[I")
    public static int[] field736 = new int[4096];

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lij;")
    public static class316 field735;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBLrg;)V")
    private final void method441(int arg0, byte arg1, class366 arg2) {
        field729++;
        if (arg0 == 5) {
            this.field727 = arg2.method2297(13352);
        }
        if (arg1 < 105) {
            this.field727 = -19;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
    public static final void method442(int arg0, byte arg1) {
        class408 var2 = class55.field711;
        synchronized (class55.field711) {
            if (arg1 < 26) {
                field732 = 57;
            }
            class55.field711.method2531(arg0, 112);
        }
        field728++;
        class408 var3 = class422.field5838;
        synchronized (class422.field5838) {
            class422.field5838.method2531(arg0, 112);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILrg;)V")
    public final void method443(int arg0, class366 arg1) {
        while (true) {
            int var3 = arg1.method2306((byte) 96);
            if (var3 == 0) {
                field730++;
                if (arg0 != -1) {
                    method442(-29, (byte) 29);
                    return;
                }
                return;
            }
            this.method441(var3, (byte) 110, arg1);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method444(int arg0) {
        field735 = null;
        field736 = null;
        if (arg0 != -17219) {
            method442(54, (byte) -11);
        }
    }
}
