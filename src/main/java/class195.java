import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class195 {

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Leh;")
    private static class47 field3796 = method1282((byte) -4, "You have only just left another world)3");

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field3793 = 0;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Leh;")
    public static class47 field3795 = method1282((byte) -4, "Konfig geladen)3");

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Leh;")
    public static class47 field3794 = method1282((byte) -4, ")1j");

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field3797 = -1;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field3803 = 99;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field3792 = 0;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field3805 = 1;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Leh;")
    public static class47 field3802 = field3796;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "[Lfb;")
    public static class50[] field3804;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "[[S")
    public static short[][] field3798;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lgg;ILfd;Z)V")
    public static final void method1281(class62 arg0, int arg1, class52 arg2, boolean arg3) {
        class181 var4 = new class181();
        var4.field3475 = arg0;
        field3806++;
        var4.field2283 = arg1;
        var4.field3474 = arg2;
        var4.field3463 = 1;
        class40 var5 = class80.field1725;
        synchronized (class80.field1725) {
            class80.field1725.method337(var4, (byte) -22);
            if (arg3) {
                method1282((byte) -31, null);
            }
        }
        class82.method692(true);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLjava/lang/String;)Leh;")
    public static final class47 method1282(byte arg0, String arg1) {
        field3799++;
        if (arg0 != -4) {
            return null;
        }
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class47 var4 = new class47();
        int var5 = 0;
        var4.field960 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field960[var4.field940++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field960[var4.field940++] = (byte) var6;
            }
        }
        var4.method377((byte) -117);
        return var4.method389(false);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Leh;I)Z")
    public static final boolean method1283(class47 arg0, int arg1) {
        field3801++;
        if (arg1 != -1) {
            method1283(null, -65);
        }
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class5.field88; var2++) {
            if (arg0.method411(false, class14.field303[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lfh;")
    public static final class56 method1284(int arg0, int arg1) {
        field3791++;
        class56 var2 = (class56) class159.field3090.method986((byte) 50, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 43) {
            method1285(47);
        }
        byte[] var3 = class154.field3026.method67(9, -1, arg0);
        class56 var4 = new class56();
        var4.field1077 = arg0;
        if (var3 != null) {
            var4.method491((byte) -109, new class68(var3));
        }
        var4.method484(-30);
        class159.field3090.method987((long) arg0, var4, 28842);
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method1285(int arg0) {
        field3804 = null;
        field3795 = null;
        field3796 = null;
        field3798 = null;
        if (arg0 != 43) {
            method1281(null, -25, null, true);
        }
        field3794 = null;
        field3802 = null;
    }
}
