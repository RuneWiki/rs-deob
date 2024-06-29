import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class128 {

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "[I")
    private int[] field1753 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field1745 = -1;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "[I")
    public static int[] field1749 = new int[256];

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Ltu;")
    public class230 field1755;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "[I")
    private int[] field1744;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "[S")
    private short[] field1741;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "[S")
    private short[] field1746;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "[S")
    private short[] field1748;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "[S")
    private short[] field1750;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Llh;B)V", line = 8)
    public final void method837(class365 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2099(255);
            if (var3 == 0) {
                field1754++;
                if (arg1 != 57) {
                    method841(-66);
                    return;
                }
                return;
            }
            this.method843(arg0, var3, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Lwk;", line = 36)
    public final class94 method838(int arg0) {
        field1752++;
        if (this.field1744 == null) {
            return null;
        }
        class94[] var2 = new class94[this.field1744.length];
        class240 var3 = this.field1755.field3201;
        synchronized (this.field1755.field3201) {
            int var4 = 0;
            while (true) {
                if (this.field1744.length <= var4) {
                    break;
                }
                var2[var4] = class183.method1110(this.field1755.field3201, -5960, this.field1744[var4], 0);
                var4++;
            }
        }
        for (int var5 = arg0; var5 < this.field1744.length; var5++) {
            if (var2[var5].field1251 < 13) {
                var2[var5].method630(80, 0);
            }
        }
        class94 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class94(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field1750 != null) {
            for (int var7 = 0; var7 < this.field1750.length; var7++) {
                var6.method628(this.field1746[var7], 55, this.field1750[var7]);
            }
        }
        if (this.field1748 != null) {
            for (int var8 = 0; var8 < this.field1748.length; var8++) {
                var6.method635(this.field1748[var8], arg0 ^ 0xFFFFFFD6, this.field1741[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Z", line = 106)
    public final boolean method839(int arg0) {
        field1747++;
        if (this.field1744 == null) {
            return true;
        }
        boolean var2 = true;
        class240 var3 = this.field1755.field3201;
        synchronized (this.field1755.field3201) {
            for (int var4 = arg0; var4 < this.field1744.length; var4++) {
                if (!this.field1755.field3201.method1404(this.field1744[var4], 0, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)Lwk;", line = 143)
    public final class94 method840(boolean arg0) {
        field1751++;
        class94[] var2 = new class94[5];
        int var3 = 0;
        class240 var4 = this.field1755.field3201;
        synchronized (this.field1755.field3201) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field1753[var5] != -1) {
                    var2[var3++] = class183.method1110(this.field1755.field3201, -5960, this.field1753[var5], 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field1251 < 13) {
                var2[var6].method630(27, 0);
            }
        }
        class94 var7 = new class94(var2, var3);
        if (this.field1750 != null) {
            for (int var8 = 0; var8 < this.field1750.length; var8++) {
                var7.method628(this.field1746[var8], 80, this.field1750[var8]);
            }
        }
        if (!arg0) {
            return null;
        }
        if (this.field1748 != null) {
            for (int var9 = 0; var9 < this.field1748.length; var9++) {
                var7.method635(this.field1748[var9], -70, this.field1741[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V", line = 215)
    public static void method841(int arg0) {
        field1749 = null;
        if (arg0 > -61) {
            method841(-14);
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Z", line = 225)
    public final boolean method842(int arg0) {
        field1743++;
        boolean var2 = true;
        class240 var3 = this.field1755.field3201;
        synchronized (this.field1755.field3201) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field1753[var4] != -1 && !this.field1755.field3201.method1404(this.field1753[var4], 0, 0)) {
                    var2 = false;
                }
            }
            if (arg0 != -27787) {
                method841(-83);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Llh;IB)V", line = 257)
    private final void method843(class365 arg0, int arg1, byte arg2) {
        if (arg2 != -69) {
            this.method839(16);
        }
        if (arg1 == 1) {
            arg0.method2099(255);
        } else if (arg1 == 2) {
            int var4 = arg0.method2099(arg2 + 324);
            this.field1744 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1744[var5] = arg0.method2062((byte) 14);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg0.method2099(arg2 + 324);
                this.field1746 = new short[var6];
                this.field1750 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1750[var7] = (short) arg0.method2062((byte) 14);
                    this.field1746[var7] = (short) arg0.method2062((byte) 14);
                }
            } else if (arg1 == 41) {
                int var8 = arg0.method2099(255);
                this.field1741 = new short[var8];
                this.field1748 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field1748[var9] = (short) arg0.method2062((byte) 14);
                    this.field1741[var9] = (short) arg0.method2062((byte) 14);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field1753[arg1 - 60] = arg0.method2062((byte) 14);
            }
        }
        field1756++;
    }
}
