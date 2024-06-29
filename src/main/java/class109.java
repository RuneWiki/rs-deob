import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class109 {

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    private int field1697 = 0;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "[Lvi;")
    public class311[] field1695;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field1683 = -1;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "Lhc;")
    public static class368 field1690 = new class368("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "J")
    private long field1678;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Lvi;")
    private class311 field1688;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "Lvi;")
    private class311 field1698;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[Lvi;)I")
    public final int method832(int arg0, class311[] arg1) {
        field1686++;
        int var3 = 0;
        if (arg0 != 29264) {
            this.field1698 = null;
        }
        for (int var4 = 0; var4 < this.field1682; var4++) {
            class311 var5 = this.field1695[var4];
            for (class311 var6 = var5.field4223; var6 != var5; var6 = var6.field4223) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BZ)V")
    public static final void method833(byte arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field1692++;
        if (class237.field3379 == null) {
            class237.field3379 = new byte[4][class11.field107][class264.field3620];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class11.field107; var3++) {
                for (int var4 = 0; var4 < class264.field3620; var4++) {
                    class237.field3379[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)I")
    public final int method834(int arg0) {
        field1689++;
        if (arg0 < 8) {
            this.field1678 = 74L;
        }
        return this.field1682;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILvi;J)V")
    public final void method835(int arg0, class311 arg1, long arg2) {
        field1696++;
        if (arg1.field4225 != null) {
            arg1.method1884(false);
        }
        if (arg0 != 4) {
            return;
        }
        class311 var5 = this.field1695[(int) ((long) (this.field1682 - 1) & arg2)];
        arg1.field4225 = var5.field4225;
        arg1.field4223 = var5;
        arg1.field4225.field4223 = arg1;
        arg1.field4223.field4225 = arg1;
        arg1.field4226 = arg2;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Lvi;")
    public final class311 method836(int arg0) {
        field1687++;
        int var2 = 23 % ((arg0 + 46) / 38);
        if (this.field1697 > 0 && this.field1695[this.field1697 - 1] != this.field1698) {
            class311 var3 = this.field1698;
            this.field1698 = var3.field4223;
            return var3;
        }
        while (this.field1682 > this.field1697) {
            class311 var4 = this.field1695[this.field1697++].field4223;
            if (this.field1695[this.field1697 - 1] != var4) {
                this.field1698 = var4.field4223;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BJ)Lvi;")
    public final class311 method837(byte arg0, long arg1) {
        this.field1678 = arg1;
        field1685++;
        class311 var4 = this.field1695[(int) ((long) (this.field1682 - 1) & arg1)];
        for (this.field1688 = var4.field4223; this.field1688 != var4; this.field1688 = this.field1688.field4223) {
            if (this.field1688.field4226 == arg1) {
                class311 var5 = this.field1688;
                this.field1688 = this.field1688.field4223;
                return var5;
            }
        }
        if (arg0 != -72) {
            this.method836(2);
        }
        this.field1688 = null;
        return null;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Lvi;")
    public final class311 method838(int arg0) {
        field1679++;
        if (this.field1688 == null) {
            return null;
        }
        if (arg0 != 48) {
            field1690 = null;
        }
        class311 var2 = this.field1695[(int) ((long) (this.field1682 - 1) & this.field1678)];
        while (this.field1688 != var2) {
            if (this.field1688.field4226 == this.field1678) {
                class311 var3 = this.field1688;
                this.field1688 = this.field1688.field4223;
                return var3;
            }
            this.field1688 = this.field1688.field4223;
        }
        this.field1688 = null;
        return null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method839(int arg0, int arg1, boolean arg2, int arg3) {
        field1680++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg0 >= 0) {
            if (arg3 != 48) {
                field1690 = null;
            }
            int var4 = 2;
            for (int var5 = arg0 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg1;
                int var9 = var8 - (arg0 * arg1);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)V")
    public static void method840(int arg0) {
        field1690 = null;
        if (arg0 > -115) {
            method839(44, 34, false, 122);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)Lvk;")
    public static final class56 method841(byte arg0, int arg1) {
        field1693++;
        class408 var2 = class323.field4386;
        class56 var4;
        synchronized (class323.field4386) {
            if (arg0 != 81) {
                return null;
            }
            var4 = (class56) class323.field4386.method2529(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = class451.field6492.method1926(0, arg1, 16);
        class56 var6 = new class56();
        if (var5 != null) {
            var6.method443(-1, new class366(var5));
        }
        class408 var7 = class323.field4386;
        synchronized (class323.field4386) {
            class323.field4386.method2527(68, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Lvi;")
    public final class311 method842(byte arg0) {
        if (arg0 != -25) {
            this.field1682 = -26;
        }
        field1694++;
        this.field1697 = 0;
        return this.method836(-107);
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(I)V")
    public final void method843(int arg0) {
        for (int var2 = 0; var2 < this.field1682; var2++) {
            class311 var3 = this.field1695[var2];
            while (true) {
                class311 var4 = var3.field4223;
                if (var3 == var4) {
                    break;
                }
                var4.method1884(false);
            }
        }
        field1681++;
        this.field1688 = null;
        this.field1698 = null;
        if (arg0 != -1) {
            this.field1682 = 115;
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)I")
    public final int method844(byte arg0) {
        field1691++;
        int var2 = 0;
        int var3 = 0;
        int var4 = -34 / ((-arg0 - 31) / 41);
        while (this.field1682 > var3) {
            class311 var5 = this.field1695[var3];
            for (class311 var6 = var5.field4223; var6 != var5; var6 = var6.field4223) {
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V")
    public class109(int arg0) {
        this.field1682 = arg0;
        this.field1695 = new class311[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class311 var3 = this.field1695[var2] = new class311();
            var3.field4225 = var3;
            var3.field4223 = var3;
        }
    }
}
