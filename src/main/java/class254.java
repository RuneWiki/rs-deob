import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class254 {

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "Ldc;")
    private class5 field3669 = new class5(64);

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "Ldc;")
    public class5 field3672 = new class5(2);

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "Lhe;")
    public class239 field3671;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "Lhe;")
    private class239 field3665;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field3660 = 0;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "[Lav;")
    public static class434[] field3662 = new class434[8];

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "Lwt;")
    public static class194 field3664 = new class194("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "Liu;")
    public static class390 field3670 = new class390(84, 6);

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BI)Ljc;")
    public final class290 method1588(byte arg0, int arg1) {
        field3667++;
        class5 var3 = this.field3669;
        class290 var4;
        synchronized (this.field3669) {
            var4 = (class290) this.field3669.method40(arg0 ^ 0xFFFFFF9B, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3665.method1470(4, arg1, 33);
        class290 var6 = new class290();
        var6.field4150 = this;
        if (arg0 != -101) {
            return null;
        }
        if (var5 != null) {
            var6.method1752(-26114, new class156(var5));
        }
        class5 var7 = this.field3669;
        synchronized (this.field3669) {
            this.field3669.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public final void method1589(byte arg0) {
        field3661++;
        class5 var2 = this.field3669;
        synchronized (this.field3669) {
            this.field3669.method35((byte) -1);
        }
        if (arg0 != -2) {
            this.method1589((byte) -101);
        }
        class5 var3 = this.field3672;
        synchronized (this.field3672) {
            this.field3672.method35((byte) -1);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIII)V")
    public static final void method1590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg5 + 1;
        class238.method1440(class41.field629[arg5], arg3, arg2, arg0, -14726);
        field3666++;
        if (arg4 <= 52) {
            method1590(-62, -25, -109, 89, -109, 8);
        }
        int var8 = arg1 - 1;
        class238.method1440(class41.field629[arg1], arg3, arg2, arg0, -14726);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class41.field629[var6];
            var7[arg0] = var7[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
    public final void method1591(int arg0, int arg1) {
        class5 var3 = this.field3669;
        synchronized (this.field3669) {
            this.field3669.method39(false, arg0);
        }
        field3659++;
        if (arg1 != 4836) {
            method1590(30, -75, -41, 42, -118, -70);
        }
        class5 var4 = this.field3672;
        synchronized (this.field3672) {
            this.field3672.method39(false, arg0);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public static void method1592(int arg0) {
        field3670 = null;
        field3664 = null;
        if (arg0 < -9) {
            field3662 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
    public final void method1593(int arg0) {
        class5 var2 = this.field3669;
        synchronized (this.field3669) {
            this.field3669.method38((byte) -53);
        }
        int var3 = 90 % ((arg0 + 1) / 58);
        field3668++;
        class5 var4 = this.field3672;
        synchronized (this.field3672) {
            this.field3672.method38((byte) -75);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BII)Z")
    public static final boolean method1594(byte arg0, int arg1, int arg2) {
        field3663++;
        if (arg0 < 53) {
            method1592(-74);
        }
        return class294.method1778(arg2, arg1, (byte) -101) | (arg1 & 0x40000) != 0 || class56.method419(arg2, true, arg1);
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lci;ILhe;Lhe;)V")
    public class254(class298 arg0, int arg1, class239 arg2, class239 arg3) {
        this.field3671 = arg3;
        this.field3665 = arg2;
        this.field3665.method1473(4309, 33);
    }
}
