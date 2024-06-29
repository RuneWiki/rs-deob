import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class217 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public int field3609;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public int field3612;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "F")
    public float field3608;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "F")
    public float field3613;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "F")
    public float field3622;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field3611 = -1;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Ljava/util/Random;")
    public static Random field3614 = new Random();

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Lqd;")
    public static class40 field3621 = class147.method1106("Suche nach Updates )2 ", (byte) -75);

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Lqd;")
    public static class40 field3620 = class147.method1106("(U1", (byte) -105);

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Z")
    public static boolean field3623 = true;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "Lqd;")
    public static class40 field3625 = class147.method1106("Sprites geladen)3", (byte) -71);

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field3624 = 0;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BB)V", line = 24)
    public static final void method1521(byte arg0, byte arg1) {
        if (class255.field4241 == null) {
            class255.field4241 = new byte[4][104][104];
        }
        if (arg1 != -77) {
            field3624 = -21;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class255.field4241[var2][var3][var4] = arg0;
                }
            }
        }
        field3610++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)Lqd;", line = 63)
    public static final class40 method1522(int arg0, byte arg1) {
        field3616++;
        int var2 = 120 % ((-arg1 - 2) / 50);
        return class153.method1192(new class40[] { class276.method1927((byte) -62, arg0 >> 24 & 0xFF), class227.field3745, class276.method1927((byte) -68, arg0 >> 16 & 0xFF), class227.field3745, class276.method1927((byte) -70, arg0 >> 8 & 0xFF), class227.field3745, class276.method1927((byte) -110, arg0 & 0xFF) }, (byte) 126);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 79)
    public static void method1523(byte arg0) {
        field3621 = null;
        field3620 = null;
        field3614 = null;
        int var1 = -44 % ((44 - arg0) / 46);
        field3625 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIII)V", line = 100)
    public static final void method1524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= class125.field2164 && class48.field941 >= arg2 && class220.field3664 <= arg3 && arg4 <= class72.field1275) {
            class286.method1989(arg1, arg4, arg0, arg3, false, arg2);
        } else {
            class248.method1755(arg1, 6885, arg0, arg3, arg2, arg4);
        }
        field3618++;
        if (arg5 != -50) {
            field3614 = (Random) null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 137)
    public class217() {
        this.field3606 = class273.field4527;
        this.field3617 = -50;
        this.field3609 = -50;
        this.field3612 = class273.field4533;
        this.field3615 = -60;
        this.field3608 = 1.1523438F;
        this.field3619 = 0;
        this.field3613 = 1.2F;
        this.field3622 = 0.69921875F;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lsd;)V", line = 152)
    public class217(class26 arg0) {
        int var2 = arg0.method226(255);
        if ((var2 & 0x1) == 0) {
            this.field3612 = class273.field4533;
        } else {
            this.field3612 = arg0.method203(-22066);
        }
        if ((var2 & 0x2) == 0) {
            this.field3608 = 1.1523438F;
        } else {
            this.field3608 = (float) arg0.method197(-1) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field3622 = 0.69921875F;
        } else {
            this.field3622 = (float) arg0.method197(-1) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field3613 = 1.2F;
        } else {
            this.field3613 = (float) arg0.method197(-1) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3609 = -50;
            this.field3615 = -60;
            this.field3617 = -50;
        } else {
            this.field3609 = arg0.method201(true);
            this.field3615 = arg0.method201(true);
            this.field3617 = arg0.method201(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field3606 = class273.field4527;
        } else {
            this.field3606 = arg0.method203(-22066);
        }
        if ((var2 & 0x40) == 0) {
            this.field3619 = 0;
        } else {
            this.field3619 = arg0.method197(-1);
        }
    }
}
