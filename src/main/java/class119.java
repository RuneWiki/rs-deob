import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class119 {

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lwb;")
    private class142 field1660;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Lgi;")
    private class310 field1656;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lpa;")
    private class163 field1649;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Luj;")
    public static class169 field1663;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lug;")
    public static class253 field1657;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lvl;")
    private class6 field1650;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[I")
    public static int[] field1653;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "[I")
    public static int[] field1659;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "[Lhl;")
    private class235[] field1651;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V", line = 6)
    public static final void method851(int arg0, int arg1, int arg2) {
        field1658++;
        if (arg1 != 3924) {
            return;
        }
        class220.field3477[arg2] = arg0;
        class286 var3 = (class286) class10.field192.method2168((long) arg2, (byte) -104);
        if (var3 == null) {
            class286 var4 = new class286(class219.method1609(-898) + 500L);
            class10.field192.method2161(var4, (long) arg2, -1);
        } else {
            var3.field4419 = class219.method1609(-898) + 500L;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Z", line = 29)
    public final boolean method852(int arg0) {
        field1654++;
        int var2 = 49 / ((arg0 + 26) / 61);
        if (this.field1650 != null) {
            return true;
        }
        if (this.field1649 == null) {
            if (this.field1656.method2139(77)) {
                return false;
            }
            this.field1649 = this.field1656.method2153(255, 255, true, -21, (byte) 0);
        }
        if (this.field1649.field3055) {
            return false;
        } else {
            this.field1650 = new class6(this.field1649.method603(true));
            this.field1651 = new class235[(this.field1650.field115.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)Z", line = 55)
    public static final boolean method853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class183.field2973[arg0][var8][var9] == -class234.field3643) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class172.field2843[arg0][arg1][arg3] + arg5;
            if (!class117.method830(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class117.method830(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class117.method830(var10, var12, var14)) {
                return false;
            } else if (class117.method830(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class307.method2124(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class117.method830(var6 + 1, class172.field2843[arg0][arg1][arg3] + arg5, var7 + 1) && class117.method830(var6 + 128 - 1, class172.field2843[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class117.method830(var6 + 128 - 1, class172.field2843[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class117.method830(var6 + 1, class172.field2843[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lga;IZLga;)Lhl;", line = 120)
    public final class235 method854(class180 arg0, int arg1, boolean arg2, class180 arg3) {
        field1655++;
        if (!arg2) {
            this.method854((class180) null, 90, true, (class180) null);
        }
        return this.method857(8, true, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 136)
    public static void method855(byte arg0) {
        if (arg0 != 87) {
            field1661 = 66;
        }
        field1663 = null;
        field1657 = null;
        field1653 = null;
        field1659 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 157)
    public static final void method856(boolean arg0) {
        int var1 = class162.method1207(true);
        field1648++;
        if (var1 == 0) {
            class214.field3376 = (byte[][][]) null;
            class154.method1120(0, (byte) -47);
        } else if (var1 == 1) {
            class59.method483((byte) 0, (byte) -67);
            class154.method1120(512, (byte) -47);
            class327.method2296(85);
        } else {
            class59.method483((byte) (class301.field4629 - 4 & 0xFF), (byte) -36);
            class154.method1120(2, (byte) -47);
        }
        if (arg0) {
            field1663 = (class169) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lgi;Lwb;)V", line = 187)
    public class119(class310 arg0, class142 arg1) {
        this.field1660 = arg1;
        this.field1656 = arg0;
        if (!this.field1656.method2139(97)) {
            this.field1649 = this.field1656.method2153(255, 255, true, -21, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZLga;Lga;I)Lhl;", line = 204)
    private final class235 method857(int arg0, boolean arg1, class180 arg2, class180 arg3, int arg4) {
        field1652++;
        if (this.field1650 == null) {
            throw new RuntimeException();
        }
        this.field1650.field111 = arg0 * arg4 + 5;
        if (this.field1650.field115.length <= this.field1650.field111) {
            throw new RuntimeException();
        } else if (this.field1651[arg4] == null) {
            int var6 = this.field1650.method73((byte) 19);
            int var7 = this.field1650.method73((byte) 19);
            class235 var8 = new class235(arg4, arg2, arg3, this.field1656, this.field1660, var6, var7, arg1);
            this.field1651[arg4] = var8;
            return var8;
        } else {
            return this.field1651[arg4];
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V", line = 241)
    public final void method858(byte arg0) {
        field1662++;
        if (this.field1651 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1651.length; var2++) {
            if (this.field1651[var2] != null) {
                this.field1651[var2].method1688(false);
            }
        }
        for (int var3 = 0; var3 < this.field1651.length; var3++) {
            if (this.field1651[var3] != null) {
                this.field1651[var3].method1684(-116);
            }
        }
        if (arg0 < 2) {
            this.method857(-94, true, (class180) null, (class180) null, -28);
        }
    }
}
