import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class263 {

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "B")
    public byte field3802 = 0;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "S")
    public short field3790;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "S")
    public short field3781;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "B")
    public byte field3796;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "B")
    public byte field3792;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3778 = new String[100];

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field3803 = 1338;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field3786 = -1;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "Lsd;")
    public static class74 field3799 = new class74(82, 3);

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "B")
    public byte field3789;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "B")
    public byte field3797;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "B")
    public byte field3800;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "B")
    public byte field3804;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lrm;")
    public class183 field3782;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lrm;")
    public class183 field3784;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "Loe;")
    public class248 field3801;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lv;")
    public class261 field3780;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lv;")
    public class261 field3783;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lqa;")
    public class263 field3788;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lil;")
    public class287 field3787;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Lcd;")
    public class46 field3791;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "Lva;")
    public class60 field3798;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "S")
    public short field3793;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
    public boolean field3785;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Z")
    public boolean field3794;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Z")
    public boolean field3795;

    static {
        new class40("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field3805 = 0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 3)
    public static void method1602(int arg0) {
        if (arg0 == 17452) {
            field3799 = null;
            field3778 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILjava/lang/Class;)Lmt;", line = 23)
    public static final class83 method1603(int arg0, int arg1, int arg2, Class arg3) {
        class263 var4 = class293.field4356[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class248 var5 = var4.field3801; var5 != null; var5 = var5.field3490) {
            class83 var6 = var5.field3487;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field999 == arg1 && var6.field1004 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 47)
    public final void method1604(byte arg0) {
        field3779++;
        while (this.field3801 != null) {
            class248 var2 = this.field3801.field3490;
            this.field3801.method1510((byte) 47);
            this.field3801 = var2;
        }
        this.field3802 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(III)V", line = 63)
    public class263(int arg0, int arg1, int arg2) {
        this.field3790 = (short) arg2;
        this.field3781 = (short) arg1;
        this.field3792 = this.field3796 = (byte) arg0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBLqo;I)V", line = 85)
    public static final void method1605(int arg0, byte arg1, class137 arg2, int arg3) {
        if (arg2.field2449 == arg0 && arg0 != -1) {
            class207 var4 = class175.field2103.method1267(-60, arg0);
            int var5 = var4.field2848;
            if (var5 == 1) {
                arg2.field2507 = 0;
                arg2.field2450 = 0;
                arg2.field2498 = 0;
                arg2.field2495 = arg3;
                arg2.field2518 = 1;
                class126.method602(var4, false, arg2.field1008, arg2.field2498, arg2.field1005, false, arg2.field994);
            }
            if (var5 == 2) {
                arg2.field2507 = 0;
            }
        } else if (arg0 == -1 || arg2.field2449 == -1 || class175.field2103.method1267(arg1 ^ 0x26, arg0).field2860 >= class175.field2103.method1267(-89, arg2.field2449).field2860) {
            arg2.field2498 = 0;
            arg2.field2449 = arg0;
            arg2.field2507 = 0;
            arg2.field2450 = 0;
            arg2.field2495 = arg3;
            arg2.field2537 = arg2.field2538;
            arg2.field2518 = 1;
            if (arg2.field2449 != -1) {
                class126.method602(class175.field2103.method1267(arg1 - 48, arg2.field2449), false, arg2.field1008, arg2.field2498, arg2.field1005, false, arg2.field994);
            }
        }
        if (arg1 != -25) {
            field3786 = -4;
        }
        field3777++;
    }
}
