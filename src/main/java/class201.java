import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class201 implements class28 {

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Z")
    private boolean field3624 = false;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    private int field3637 = 50;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Lbj;")
    private class151 field3622;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "Lbj;")
    private class151 field3638;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Lnh;")
    private class53 field3636;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "Lnh;")
    private class53 field3629;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "[S")
    private short[] field3633;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "[Z")
    private boolean[] field3611;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "[Z")
    private boolean[] field3609;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "[Z")
    private boolean[] field3635;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[B")
    private byte[] field3613;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "[Z")
    private boolean[] field3619;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "[Z")
    private boolean[] field3617;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[B")
    private byte[] field3618;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "[B")
    private byte[] field3612;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "[B")
    private byte[] field3634;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Ljd;")
    public static class86 field3614 = class122.method868("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", true);

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3615 = 0;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Ljd;")
    private static class86 field3608 = class122.method868("Discard", true);

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Z")
    public static boolean field3626 = false;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Ljd;")
    public static class86 field3610 = field3608;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Lbj;")
    public static class151 field3616;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class48.field1036 = arg5;
        field3621++;
        class64.field1276 = arg2;
        if (arg3 <= 119) {
            method1435((byte) 5, -5);
        }
        class2.field21 = arg0;
        class242.field4334 = arg1;
        class8.field261 = arg4;
        if (class48.field1036 >= 100) {
            int var6 = class242.field4334 * 128 + 64;
            int var7 = class8.field261 * 128 + 64;
            int var8 = class30.method198(31482, var7, var6, class180.field3244) - class64.field1276;
            int var9 = var7 - class70.field1430;
            int var10 = var8 - class88.field1748;
            int var11 = var6 - class4.field61;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class255.field4541 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class176.field3202 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class255.field4541 < 128) {
                class255.field4541 = 128;
            }
            if (class255.field4541 > 383) {
                class255.field4541 = 383;
            }
        }
        class152.field2874 = 2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public final void method1433(int arg0) {
        field3606++;
        this.field3636.method394(32767);
        if (arg0 != 0) {
            this.method1434(32, -1);
        }
        if (this.field3629 != null) {
            this.field3629.method394(32767);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IFI)[I")
    public final int[] method185(int arg0, float arg1, int arg2) {
        field3620++;
        if (arg2 != 255) {
            method1439((byte) 94);
        }
        class116 var4 = this.method1437(arg0, (byte) -90);
        if (var4 == null) {
            return null;
        } else {
            var4.field2219 = true;
            return var4.method821(this, this.field3622, (byte) 68, this.field3624 || this.field3617[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)V")
    public final void method1434(int arg0, int arg1) {
        for (class116 var3 = (class116) this.field3636.method397(113); var3 != null; var3 = (class116) this.field3636.method399((byte) -28)) {
            if (var3.field2219) {
                var3.method816((byte) 118, arg0);
                var3.field2219 = false;
            }
        }
        int var4 = -83 % ((-arg1 - 83) / 39);
        field3605++;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(BI)Llf;")
    public static final class202 method1435(byte arg0, int arg1) {
        field3623++;
        if (arg0 > -76) {
            method1439((byte) 41);
        }
        class202 var2 = (class202) class81.field1592.method701((byte) -118, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class241.field4333.method1084((byte) -128, 3, arg1);
        class202 var4 = new class202();
        if (var3 != null) {
            var4.method1443(-16, new class200(var3));
        }
        class81.field1592.method696((long) arg1, var4, (byte) -96);
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I")
    public final int[] method184(int arg0, int arg1) {
        class116 var3 = this.method1437(arg0, (byte) -90);
        field3604++;
        if (arg1 != 2047) {
            this.method185(51, -1.3374523F, -104);
        }
        return var3 == null ? null : var3.method822((byte) -70, this.field3624 || this.field3617[arg0], this, this.field3622);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(BI)Z")
    public final boolean method189(byte arg0, int arg1) {
        field3632++;
        int var3 = -57 / ((-arg0 - 1) / 42);
        class116 var4 = this.method1437(arg1, (byte) -90);
        return var4 == null ? false : var4.method819(this.field3622, 2, this);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)I")
    public final int method188(byte arg0, int arg1) {
        field3628++;
        return arg0 >= -56 ? 70 : this.field3633[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IB)Z")
    public final boolean method186(int arg0, byte arg1) {
        if (arg1 > -79) {
            this.field3613 = null;
        }
        field3631++;
        return this.field3635[arg0];
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BZ)V")
    public final void method1436(byte arg0, boolean arg1) {
        this.field3624 = arg1;
        field3630++;
        this.method1433(0);
        if (arg0 != 79) {
            method1439((byte) -48);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(IB)Lu;")
    private final class116 method1437(int arg0, byte arg1) {
        if (arg1 != -90) {
            method1438(-105);
        }
        class116 var3 = (class116) this.field3636.method395((long) arg0, (byte) 106);
        field3602++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3638.method1084((byte) -126, arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            class200 var5 = new class200(var4);
            class116 var6 = new class116(var5);
            this.field3636.method398((long) arg0, (byte) 116, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Z")
    public final boolean method187(int arg0, int arg1) {
        if (arg1 >= -111) {
            return false;
        } else {
            field3603++;
            return this.field3611[arg0];
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static void method1438(int arg0) {
        field3616 = null;
        field3614 = null;
        if (arg0 != 128) {
            method1438(40);
        }
        field3610 = null;
        field3608 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static final void method1439(byte arg0) {
        class122.field2375.method702((byte) -88);
        field3625++;
        if (arg0 <= 111) {
            field3610 = null;
        }
        class60.field1198.method702((byte) -88);
        class237.field4276.method702((byte) -88);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Z")
    public final boolean method183(int arg0, byte arg1) {
        int var3 = -29 / ((arg1 - 59) / 60);
        field3607++;
        return this.field3624 || this.field3617[arg0];
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lbj;Lbj;Lbj;IZ)V")
    public class201(class151 arg0, class151 arg1, class151 arg2, int arg3, boolean arg4) {
        this.field3622 = arg2;
        this.field3637 = arg3;
        this.field3624 = arg4;
        this.field3638 = arg0;
        this.field3636 = new class53(this.field3637);
        this.field3629 = null;
        class200 var6 = new class200(arg1.method1084((byte) -118, 0, 0));
        int var7 = var6.method1410(-87);
        this.field3633 = new short[var7];
        this.field3611 = new boolean[var7];
        this.field3609 = new boolean[var7];
        this.field3635 = new boolean[var7];
        this.field3613 = new byte[var7];
        this.field3619 = new boolean[var7];
        this.field3617 = new boolean[var7];
        this.field3618 = new byte[var7];
        this.field3612 = new byte[var7];
        this.field3634 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3609[var8] = var6.method1408((byte) -113) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3609[var9]) {
                this.field3635[var9] = var6.method1408((byte) -114) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3609[var10]) {
                this.field3611[var10] = var6.method1408((byte) -46) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3609[var11]) {
                this.field3617[var11] = var6.method1408((byte) -106) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3609[var12]) {
                this.field3619[var12] = var6.method1408((byte) -30) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3609[var13]) {
                this.field3612[var13] = var6.method1412((byte) 119);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3609[var14]) {
                this.field3634[var14] = var6.method1412((byte) 87);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3609[var15]) {
                this.field3618[var15] = var6.method1412((byte) 110);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3609[var16]) {
                this.field3613[var16] = var6.method1412((byte) 102);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3609[var17]) {
                this.field3633[var17] = (short) var6.method1410(-90);
            }
        }
    }
}
