import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class556 {

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Lmga;")
    private class666 field7389 = new class666(64);

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Lbi;")
    private class449 field7387;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "Z")
    public static boolean field7388 = false;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7394 = new Rectangle[100];

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Ltj;")
    public final class184 method3074(int arg0, int arg1) {
        field7391++;
        class666 var3 = this.field7389;
        class184 var4;
        synchronized (this.field7389) {
            var4 = (class184) this.field7389.method3750((long) arg0, false);
            int var5 = -6 / ((-arg1 - 55) / 55);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var6 = this.field7387;
        byte[] var7;
        synchronized (this.field7387) {
            var7 = this.field7387.method2537(false, 19, arg0);
        }
        class184 var8 = new class184();
        if (var7 != null) {
            var8.method1217(new class335(var7), true);
        }
        class666 var9 = this.field7389;
        synchronized (this.field7389) {
            this.field7389.method3745(1, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Z")
    public static final boolean method3075(int arg0, int arg1, int arg2) {
        int var3 = -38 % ((arg2 + 43) / 50);
        field7392++;
        return class294.method1812((byte) -90, arg0, arg1) | (arg1 & 0x800) != 0 || class252.method1532(arg0, (byte) -87, arg1);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILha;)V")
    public static final void method3076(int arg0, class56 arg1) {
        class44.field637 = arg1;
        field7393++;
        if (arg0 != 8107) {
            method3076(-82, null);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public static void method3077(int arg0) {
        field7394 = null;
        if (arg0 != 19) {
            method3077(113);
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lpca;ILbi;)V")
    public class556(class671 arg0, int arg1, class449 arg2) {
        this.field7387 = arg2;
        this.field7390 = this.field7387.method2527(0, 19);
    }
}
