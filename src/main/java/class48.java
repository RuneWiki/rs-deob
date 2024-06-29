import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class48 extends class452 {

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public int field604 = 12800;

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "Z")
    public boolean field615 = true;

    @OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
    public int field617 = 0;

    @OriginalMember(owner = "client!qr", name = "O", descriptor = "I")
    public int field622 = 0;

    @OriginalMember(owner = "client!qr", name = "N", descriptor = "I")
    public int field621 = 12800;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
    public int field610 = -1;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
    public int field605 = -1;

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "Ljava/lang/String;")
    public String field606;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "Ljava/lang/String;")
    public String field608;

    @OriginalMember(owner = "client!qr", name = "E", descriptor = "Loe;")
    public class137 field613;

    @OriginalMember(owner = "client!qr", name = "L", descriptor = "Lkh;")
    public static class13 field619 = new class13(8);

    @OriginalMember(owner = "client!qr", name = "Q", descriptor = "Lhn;")
    public static class509 field624 = new class509(20, -1);

    @OriginalMember(owner = "client!qr", name = "R", descriptor = "Z")
    public static boolean field625 = false;

    @OriginalMember(owner = "client!qr", name = "A", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!qr", name = "P", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!qr", name = "S", descriptor = "Lul;")
    public static class406 field626;

    @OriginalMember(owner = "client!qr", name = "D", descriptor = "[Ll;")
    public static class16[] field612;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public final void method477(int arg0) {
        this.field617 = 0;
        this.field622 = 0;
        this.field604 = 12800;
        field614++;
        this.field621 = 12800;
        for (class81 var2 = (class81) this.field613.method1004((byte) -84); var2 != null; var2 = (class81) this.field613.method996(1)) {
            if (var2.field1185 > this.field617) {
                this.field617 = var2.field1185;
            }
            if (var2.field1182 < this.field621) {
                this.field621 = var2.field1182;
            }
            if (var2.field1176 > this.field622) {
                this.field622 = var2.field1176;
            }
            if (var2.field1180 < this.field604) {
                this.field604 = var2.field1180;
            }
        }
        if (arg0 != -17568) {
            this.field622 = -23;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I[IIB)Z")
    public final boolean method478(int arg0, int[] arg1, int arg2, byte arg3) {
        if (arg3 != 21) {
            return false;
        }
        field609++;
        for (class81 var5 = (class81) this.field613.method1004((byte) -56); var5 != null; var5 = (class81) this.field613.method996(arg3 ^ 0x14)) {
            if (var5.method685((byte) 95, arg2, arg0)) {
                var5.method681(arg2, 10714, arg1, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "(I)V")
    public static void method479(int arg0) {
        if (arg0 != -1) {
            field626 = null;
        }
        field619 = null;
        field612 = null;
        field624 = null;
        field626 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II[III)Z")
    public final boolean method480(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field620++;
        if (arg1 != 16542) {
            this.field608 = null;
        }
        for (class81 var6 = (class81) this.field613.method1004((byte) -120); var6 != null; var6 = (class81) this.field613.method996(arg1 - 16541)) {
            if (var6.method687(arg3, arg0, arg4, (byte) 47)) {
                var6.method681(arg4, 10714, arg2, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIB)Z")
    public final boolean method481(int arg0, int arg1, byte arg2) {
        field618++;
        for (class81 var4 = (class81) this.field613.method1004((byte) -53); var4 != null; var4 = (class81) this.field613.method996(arg2 + 35)) {
            if (var4.method685((byte) 107, arg1, arg0)) {
                return true;
            }
        }
        if (arg2 != -34) {
            this.method482(null, -15, 44, true);
        }
        return false;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "([IIIZ)Z")
    public final boolean method482(int[] arg0, int arg1, int arg2, boolean arg3) {
        field623++;
        class81 var5 = (class81) this.field613.method1004((byte) -56);
        if (!arg3) {
            this.method480(-17, 77, null, 56, -64);
        }
        while (var5 != null) {
            if (var5.method680(0, arg1, arg2)) {
                var5.method682(arg0, arg1, arg2, 1839);
                return true;
            }
            var5 = (class81) this.field613.method996(1);
        }
        return false;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZBZI)I")
    public static final int method483(int arg0, boolean arg1, byte arg2, boolean arg3, int arg4) {
        field616++;
        class240 var5 = class516.method3061((byte) -30, arg3, arg0);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg2 != -41) {
            method483(-31, false, (byte) 98, true, -32);
        }
        for (int var7 = 0; var7 < var5.field3835.length; var7++) {
            if (var5.field3835[var7] >= 0 && var5.field3835[var7] < class390.field5847.field571) {
                class532 var8 = class390.field5847.method467((byte) -101, var5.field3835[var7]);
                int var9 = var8.method3152(-1591469952, arg4, class474.field6839.method3057(arg4, (byte) 59).field3981);
                if (arg1) {
                    var6 += var5.field3829[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class48(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field611 = arg0;
        this.field615 = arg5;
        this.field610 = arg4;
        this.field607 = arg3;
        this.field606 = arg1;
        this.field608 = arg2;
        this.field605 = arg6;
        if (this.field605 == 255) {
            this.field605 = 0;
        }
        this.field613 = new class137();
    }
}
