import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class33 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lme;")
    private class668 field487 = new class668(64);

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lpe;")
    private class615 field494;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lpe;")
    public class615 field490;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lbc;")
    public static class9 field491 = new class9(8);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 3)
    public final void method262(int arg0) {
        if (arg0 != 3) {
            method265((byte) -52);
        }
        class668 var2 = this.field487;
        synchronized (this.field487) {
            this.field487.method3656((byte) 0);
        }
        field493++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Lqd;", line = 18)
    public final class515 method263(byte arg0, int arg1) {
        field484++;
        class668 var3 = this.field487;
        class515 var4;
        synchronized (this.field487) {
            var4 = (class515) this.field487.method3655(-24, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -27 / ((6 - arg0) / 32);
        class615 var6 = this.field494;
        byte[] var7;
        synchronized (this.field494) {
            var7 = this.field494.method3346(-1, 3, arg1);
        }
        class515 var8 = new class515();
        var8.field6757 = this;
        if (var7 != null) {
            var8.method2778(new class418(var7), (byte) 71);
        }
        class668 var9 = this.field487;
        synchronized (this.field487) {
            this.field487.method3650((long) arg1, -105, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BIII)V", line = 49)
    public static final void method264(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = class260.field3509.field1276 * arg2 >> 8;
        field485++;
        if (arg0 != 46) {
            field491 = null;
        }
        if (var4 != 0 && arg3 != -1) {
            class597.method3247(var4, 8364, class683.field9391, false, 0, arg3);
            class60.field823 = true;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 69)
    public static void method265(byte arg0) {
        field491 = null;
        int var1 = -112 % ((59 - arg0) / 45);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Z", line = 81)
    public static final boolean method266(int arg0, int arg1) {
        if (arg0 != -12281) {
            method265((byte) 25);
        }
        field488++;
        return arg1 == 15 || arg1 == 50 || arg1 == 1003 || arg1 == 5 || arg1 == 11;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 99)
    public final void method267(int arg0) {
        class668 var2 = this.field487;
        synchronized (this.field487) {
            this.field487.method3658(arg0);
        }
        field486++;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(BI)V", line = 109)
    public static final void method268(byte arg0, int arg1) {
        field495++;
        class668 var2 = class207.field2671;
        synchronized (class207.field2671) {
            if (arg0 != 82) {
                field491 = null;
            }
            class207.field2671.method3659(arg0 - 202, arg1);
        }
        class668 var3 = class201.field2622;
        synchronized (class201.field2622) {
            class201.field2622.method3659(-119, arg1);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V", line = 126)
    public final void method269(boolean arg0, int arg1) {
        if (arg0) {
            this.field487 = null;
        }
        class668 var3 = this.field487;
        synchronized (this.field487) {
            this.field487.method3659(-106, arg1);
        }
        field492++;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lvd;ILpe;Lpe;)V", line = 148)
    public class33(class635 arg0, int arg1, class615 arg2, class615 arg3) {
        this.field494 = arg2;
        this.field490 = arg3;
        this.field494.method3341(3, -19046);
    }
}
