import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class215 implements Runnable {

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Z")
    public boolean field3632 = true;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field3625 = new Object();

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public int field3634 = 0;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "[I")
    public int[] field3635 = new int[500];

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "[I")
    public int[] field3636 = new int[500];

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Ldl;")
    public static class46 field3624 = null;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3626 = "Loading defaults - ";

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3627 = "white:";

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3631 = "Please wait...";

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field3633 = -1;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lvh;")
    public static class108 field3629;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "[S")
    public static short[] field3630;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method1436(int arg0) {
        if (arg0 != 500) {
            method1436(99);
        }
        field3627 = null;
        field3631 = null;
        field3624 = null;
        field3626 = null;
        field3629 = null;
        field3630 = null;
    }

    @OriginalMember(owner = "client!kl", name = "run", descriptor = "()V")
    public final void run() {
        field3623++;
        while (this.field3632) {
            Object var1 = this.field3625;
            synchronized (this.field3625) {
                if (this.field3634 < 500) {
                    this.field3636[this.field3634] = class48.field839;
                    this.field3635[this.field3634] = class256.field4182;
                    this.field3634++;
                }
            }
            class245.method1636(false, 50L);
        }
    }
}
