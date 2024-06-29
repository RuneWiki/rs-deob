import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class128 {

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Z")
    public boolean field1667 = false;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Lku;")
    private class232 field1665 = new class232(64);

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Lku;")
    public class232 field1679 = new class232(500);

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Lku;")
    public class232 field1681 = new class232(30);

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Lku;")
    public class232 field1682 = new class232(50);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lb;")
    private class201 field1662;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Z")
    public boolean field1674;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lb;")
    public class201 field1664;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "[I")
    public static int[] field1677;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "[[I")
    public static int[][] field1676;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)Lbd;")
    public static final class42 method798(byte arg0) {
        field1668++;
        if (arg0 <= 12) {
            method798((byte) -22);
        }
        return class454.field6397 < class156.field2323.length ? class156.field2323[class454.field6397++] : null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
    public final void method799(boolean arg0, int arg1) {
        field1669++;
        if (this.field1674 == arg0) {
            return;
        }
        this.field1674 = arg0;
        this.method800(50);
        if (arg1 <= 103) {
            this.field1665 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public final void method800(int arg0) {
        field1672++;
        class232 var2 = this.field1665;
        synchronized (this.field1665) {
            this.field1665.method1478((byte) -97);
            if (arg0 != 50) {
                this.field1667 = true;
            }
        }
        class232 var3 = this.field1679;
        synchronized (this.field1679) {
            this.field1679.method1478((byte) -115);
        }
        class232 var4 = this.field1681;
        synchronized (this.field1681) {
            this.field1681.method1478((byte) -90);
        }
        class232 var5 = this.field1682;
        synchronized (this.field1682) {
            this.field1682.method1478((byte) -111);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    public final void method801(int arg0, int arg1) {
        class232 var3 = this.field1665;
        synchronized (this.field1665) {
            this.field1665.method1486(438127120, arg1);
        }
        field1661++;
        class232 var4 = this.field1679;
        synchronized (this.field1679) {
            this.field1679.method1486(arg0 + 438124078, arg1);
        }
        if (arg0 != 3042) {
            this.field1682 = null;
        }
        class232 var5 = this.field1681;
        synchronized (this.field1681) {
            this.field1681.method1486(arg0 ^ 0x1A1D41F2, arg1);
        }
        class232 var6 = this.field1682;
        synchronized (this.field1682) {
            this.field1682.method1486(438127120, arg1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZB)V")
    public final void method802(boolean arg0, byte arg1) {
        field1670++;
        if (arg0 == this.field1667) {
            return;
        }
        this.field1667 = arg0;
        if (arg1 <= 85) {
            this.method807(-34, -8);
        }
        this.method800(50);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    public final void method803(int arg0, int arg1) {
        this.field1683 = arg0;
        field1663++;
        class232 var3 = this.field1679;
        synchronized (this.field1679) {
            this.field1679.method1478((byte) -92);
        }
        class232 var4 = this.field1681;
        synchronized (this.field1681) {
            this.field1681.method1478((byte) -123);
            if (arg1 != 0) {
                this.field1667 = false;
            }
        }
        class232 var5 = this.field1682;
        synchronized (this.field1682) {
            this.field1682.method1478((byte) -88);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)Z")
    public static final boolean method804(int arg0, boolean arg1) {
        field1678++;
        if (!arg1) {
            method804(-107, false);
        }
        if (arg0 == 9 || arg0 == 58 || arg0 == 46 || arg0 == 10 || arg0 == 4) {
            return true;
        } else {
            return arg0 == 3 || arg0 == 1012;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method805(int arg0) {
        field1677 = null;
        field1676 = null;
        if (arg0 > -92) {
            method806(113, (byte[]) null, -71, -55);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method806(int arg0, byte[] arg1, int arg2, int arg3) {
        field1680++;
        if (arg2 != -17364) {
            method810(-32, -89, -60, 86, -24);
        }
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg1[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class304.field4335[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(II)V")
    public final void method807(int arg0, int arg1) {
        if (arg1 >= -49) {
            this.method800(-97);
        }
        this.field1665 = new class232(arg0);
        field1675++;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(II)Ldq;")
    public final class453 method808(int arg0, int arg1) {
        field1660++;
        class232 var3 = this.field1665;
        class453 var4;
        synchronized (this.field1665) {
            var4 = (class453) this.field1665.method1479(arg1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1662.method1257(class31.method221((byte) -126, arg0), class179.method1090(arg0, (byte) 70), 24558);
        class453 var6 = new class453();
        var6.field6343 = arg0;
        var6.field6387 = this;
        if (var5 != null) {
            var6.method2653(new class276(var5), (byte) 22);
        }
        var6.method2666(arg1 ^ 0xFFFFFF87);
        if (var6.field6334) {
            var6.field6371 = 0;
            var6.field6359 = false;
        }
        if (!this.field1674 && var6.field6363) {
            var6.field6346 = null;
            var6.field6315 = null;
        }
        class232 var7 = this.field1665;
        synchronized (this.field1665) {
            this.field1665.method1473(var6, (long) arg0, arg1 ^ 0x73);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public final void method809(int arg0) {
        class232 var2 = this.field1665;
        synchronized (this.field1665) {
            this.field1665.method1475(0);
        }
        field1673++;
        class232 var3 = this.field1679;
        synchronized (this.field1679) {
            this.field1679.method1475(0);
        }
        class232 var4 = this.field1681;
        synchronized (this.field1681) {
            this.field1681.method1475(0);
        }
        int var5 = -5 / ((arg0 - 7) / 39);
        class232 var6 = this.field1682;
        synchronized (this.field1682) {
            this.field1682.method1475(0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
    public static final void method810(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class114.field1465 != null) {
            class114.field1465[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class135.field1788 != null) {
            class135.field1788[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class191.field2841 != null) {
            class191.field2841[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lea;IZLb;Lb;)V")
    public class128(class353 arg0, int arg1, boolean arg2, class201 arg3, class201 arg4) {
        this.field1662 = arg3;
        this.field1674 = arg2;
        this.field1664 = arg4;
        if (this.field1662 != null) {
            int var6 = this.field1662.method1233(-1) - 1;
            this.field1662.method1235(0, var6);
        }
    }

    static {
        new class326((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
    }
}
