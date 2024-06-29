import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class215 implements class272 {

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    private int field3714 = 50;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "Z")
    private boolean field3705 = false;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "Ltg;")
    private class180 field3713;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Ltg;")
    private class180 field3700;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "Lka;")
    private class253 field3686;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "Lka;")
    private class253 field3708;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "[Z")
    private boolean[] field3712;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "[Z")
    private boolean[] field3715;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "[B")
    private byte[] field3699;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "[Z")
    private boolean[] field3701;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "[Z")
    private boolean[] field3684;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "[S")
    private short[] field3704;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[B")
    private byte[] field3685;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "[B")
    private byte[] field3682;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "[Z")
    private boolean[] field3696;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "[B")
    private byte[] field3709;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "Lp;")
    public static class280 field3707 = class18.method140((byte) -120, "K");

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lp;")
    public static class280 field3697 = class18.method140((byte) -125, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "Z")
    public static boolean field3711 = false;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3706 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "Lp;")
    public static class280 field3717 = class18.method140((byte) -118, "Abbrechen");

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "Lp;")
    public static class280 field3718 = class18.method140((byte) -122, "Shift)2click ENABLED(Q");

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Z")
    public static boolean field3720 = true;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field3719 = 0;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Ltg;")
    public static class180 field3702;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Z")
    public static final boolean method1436(int arg0) {
        if (arg0 == 104) {
            field3688++;
            return class92.field1501;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)Z")
    public final boolean method1437(int arg0, int arg1) {
        field3698++;
        class246 var3 = this.method1440(arg1, 103);
        if (var3 == null) {
            return false;
        } else {
            int var4 = 95 / ((-arg0 - 69) / 40);
            return var3.method1669(this, 64, this.field3700);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)Z")
    public final boolean method1438(byte arg0, int arg1) {
        field3681++;
        if (arg0 != -86) {
            this.method1448(false, -46);
        }
        return this.field3684[arg1];
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)I")
    public final int method1439(int arg0, int arg1) {
        field3692++;
        return arg1 == -11728 ? this.field3704[arg0] & 0xFFFF : 91;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(II)Lfa;")
    private final class246 method1440(int arg0, int arg1) {
        if (arg1 <= 63) {
            return null;
        }
        field3691++;
        class246 var3 = (class246) this.field3686.method1699((long) arg0, 107);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3713.method1258(arg0, 0, (byte) 96);
        if (var4 == null) {
            return null;
        } else {
            class25 var5 = new class25(var4);
            class246 var6 = new class246(var5);
            this.field3686.method1703(var6, (byte) 111, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static final void method1441(byte arg0) {
        if (arg0 >= -56) {
            method1446(-38, -44, -114, 86, 21, -70, (class99) null);
        }
        if (class147.field2561 != null) {
            class52.method382(82, class147.field2561);
            class147.field2561 = null;
        }
        field3693++;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)V")
    public final void method1442(int arg0, byte arg1) {
        for (class246 var3 = (class246) this.field3686.method1700((byte) -77); var3 != null; var3 = (class246) this.field3686.method1702(-16170)) {
            if (var3.field4318) {
                var3.method1671(117, arg0);
                var3.field4318 = false;
            }
        }
        if (arg1 >= -62) {
            this.method1450(85, (byte) -103);
        }
        field3695++;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static void method1443(int arg0) {
        field3702 = null;
        field3717 = null;
        field3707 = null;
        field3706 = null;
        field3697 = null;
        field3718 = null;
        if (arg0 != 0) {
            method1443(-54);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Z")
    public final boolean method1444(int arg0, int arg1) {
        if (arg1 == 22897) {
            field3710++;
            return this.field3712[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
    public final void method1445(boolean arg0) {
        this.field3686.method1704(1);
        if (this.field3708 != null) {
            this.field3708.method1704(1);
        }
        field3689++;
        if (arg0) {
            field3707 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIILpk;)V")
    public static final void method1446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class99 arg6) {
        field3694++;
        long var7 = 0L;
        boolean var9 = false;
        boolean var10 = true;
        if (arg4 == 0) {
            var7 = class113.method798(arg2, arg1, arg5);
        } else if (arg4 == 1) {
            var7 = class17.method133(arg2, arg1, arg5);
        } else if (arg4 == 2) {
            var7 = class155.method1108(arg2, arg1, arg5);
        } else if (arg4 == 3) {
            var7 = class27.method242(arg2, arg1, arg5);
        }
        boolean var11 = false;
        int var12 = (int) var7 >> 14 & 0x1F;
        int var13 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        if (arg3 < 8) {
            method1441((byte) 59);
        }
        int var14 = ((int) var7 & 0x3A00C3) >> 20;
        class130 var15 = class32.method277((byte) -90, var13);
        if (var15.method895(1)) {
            class54.method395(var15, arg1, arg5, (byte) 99, arg2);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg4 == 0) {
            class131.method912(arg2, arg1, arg5);
            if (var15.field2281 != 0) {
                arg6.method709(arg1, 95, arg5, var12, var15.field2249, var14);
                return;
            }
            return;
        }
        if (arg4 == 1) {
            class208.method1405(arg2, arg1, arg5);
            return;
        }
        if (arg4 == 2) {
            class93.method663(arg2, arg1, arg5);
            if (var15.field2281 != 0 && var15.field2277 + arg1 < 104 && arg5 + var15.field2277 < 104 && (var15.field2265 + arg1) < 104 && (arg5 + var15.field2265) < 104) {
                arg6.method700(var15.field2249, arg5, var14, var15.field2277, 131072, var15.field2265, arg1);
                return;
            }
            return;
        }
        if (arg4 != 3) {
            return;
        }
        class176.method1204(arg2, arg1, arg5);
        if (var15.field2281 == 1) {
            arg6.method699(arg1, false, arg5);
            return;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZZ)V")
    public final void method1447(boolean arg0, boolean arg1) {
        this.field3705 = arg0;
        field3680++;
        this.method1445(false);
        if (!arg1) {
            this.field3709 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)[I")
    public final int[] method1448(boolean arg0, int arg1) {
        field3687++;
        class246 var3 = this.method1440(arg1, 95);
        if (!arg0) {
            method1436(39);
        }
        return var3 == null ? null : var3.method1668(this.field3700, this.field3705 || this.field3696[arg1], 125, this);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(FII)[I")
    public final int[] method1449(float arg0, int arg1, int arg2) {
        field3683++;
        if (arg1 > -18) {
            return null;
        }
        class246 var4 = this.method1440(arg2, 84);
        if (var4 == null) {
            return null;
        } else {
            var4.field4318 = true;
            return var4.method1672(-11284, this, this.field3705 || this.field3696[arg2], arg0, this.field3700);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)Z")
    public final boolean method1450(int arg0, byte arg1) {
        field3690++;
        if (this.field3705 || this.field3696[arg0]) {
            return true;
        } else {
            if (arg1 > -61) {
                field3707 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ltg;Ltg;Ltg;IZ)V")
    public class215(class180 arg0, class180 arg1, class180 arg2, int arg3, boolean arg4) {
        this.field3714 = arg3;
        this.field3713 = arg0;
        this.field3705 = arg4;
        this.field3700 = arg2;
        this.field3686 = new class253(this.field3714);
        this.field3708 = null;
        class25 var6 = new class25(arg1.method1258(0, 0, (byte) 110));
        int var7 = var6.method193((byte) 77);
        this.field3712 = new boolean[var7];
        this.field3715 = new boolean[var7];
        this.field3699 = new byte[var7];
        this.field3701 = new boolean[var7];
        this.field3684 = new boolean[var7];
        this.field3704 = new short[var7];
        this.field3685 = new byte[var7];
        this.field3682 = new byte[var7];
        this.field3696 = new boolean[var7];
        this.field3709 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3715[var8] = var6.method189((byte) -103) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3715[var9]) {
                this.field3712[var9] = var6.method189((byte) -103) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3715[var10]) {
                this.field3684[var10] = var6.method189((byte) -103) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3715[var11]) {
                this.field3696[var11] = var6.method189((byte) -103) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3715[var12]) {
                this.field3701[var12] = var6.method189((byte) -103) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3715[var13]) {
                this.field3699[var13] = var6.method200(32768);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3715[var14]) {
                this.field3709[var14] = var6.method200(32768);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3715[var15]) {
                this.field3685[var15] = var6.method200(32768);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3715[var16]) {
                this.field3682[var16] = var6.method200(32768);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3715[var17]) {
                this.field3704[var17] = (short) var6.method193((byte) 77);
            }
        }
    }
}
