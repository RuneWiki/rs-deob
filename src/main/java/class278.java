import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class278 {

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Z")
    public boolean field3616 = true;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Liba;")
    public static class211 field3613 = new class211(19, 1);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "C")
    private char field3610;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Ljava/lang/String;")
    public String field3617;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 4)
    public static void method1647(int arg0) {
        int var1 = 124 % ((64 - arg0) / 45);
        field3613 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lgk;II)V", line = 19)
    private final void method1648(class540 arg0, int arg1, int arg2) {
        if (arg2 != -25851) {
            return;
        }
        field3618++;
        if (arg1 == 1) {
            this.field3610 = class36.method214(arg0.method3128(32767), -129);
        } else if (arg1 == 2) {
            this.field3615 = arg0.method3160(false);
        } else if (arg1 == 4) {
            this.field3616 = false;
        } else if (arg1 == 5) {
            this.field3617 = arg0.method3145((byte) -121);
            return;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lgk;B)V", line = 48)
    public final void method1649(class540 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method3115(29871);
            if (var3 == 0) {
                int var4 = -22 / ((arg1 - 15) / 63);
                field3612++;
                return;
            }
            this.method1648(arg0, var3, -25851);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V", line = 76)
    public static final void method1650(int arg0, int arg1) {
        class525.field7471 = arg1;
        field3614++;
        class692 var2 = class423.field6210;
        synchronized (class423.field6210) {
            if (arg0 == -2) {
                class423.field6210.method3890(-1);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)Z", line = 90)
    public final boolean method1651(byte arg0) {
        field3611++;
        if (arg0 != 76) {
            this.method1649(null, (byte) 28);
        }
        return this.field3610 == 's';
    }
}
