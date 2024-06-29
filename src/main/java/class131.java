import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class131 {

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "Lrh;")
    private class69 field1688 = new class69();

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "Luc;")
    private class58 field1684;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "Lmk;")
    public static class154 field1687 = new class154();

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "Lph;")
    public static class114 field1689 = new class114(5);

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "[S")
    public static short[] field1694 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field1695 = 0;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field1697 = 52;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "Lam;")
    public static class286 field1693;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "[Llg;")
    public static class20[] field1696;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)Ljj;")
    public static final class156 method700(byte arg0, int arg1) {
        field1678++;
        if (arg0 != -105) {
            method700((byte) -34, 23);
        }
        return class327.field4338 && arg1 >= class7.field64 && class6.field54 >= arg1 ? class193.field2437[arg1 - class7.field64] : null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[BIILjava/lang/String;I)I")
    public static final int method701(int arg0, byte[] arg1, int arg2, int arg3, String arg4, int arg5) {
        field1685++;
        int var6 = arg5 - arg3;
        if (arg2 >= -100) {
            field1693 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg0 + var7] = -97;
            } else {
                arg1[arg0 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)I")
    public final int method702(byte arg0) {
        field1676++;
        if (arg0 != 16) {
            this.method706((byte) 23);
        }
        return this.field1679;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
    public final void method703(byte arg0) {
        this.field1688.method391((byte) 114);
        field1683++;
        this.field1684.method307((byte) 115);
        this.field1675 = this.field1679;
        if (arg0 != -32) {
            this.field1675 = 110;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILwa;Ljava/lang/Object;)V")
    public final void method704(int arg0, class407 arg1, Object arg2) {
        field1686++;
        this.method708(arg0 ^ 0xFFFFF3D4, arg1);
        if (this.field1675 == 0) {
            class46 var4 = (class46) this.field1688.method398((byte) 38);
            var4.method1967(-1);
            var4.method1009((byte) 120);
        } else {
            this.field1675--;
        }
        class88 var5 = new class88(arg1, arg2);
        this.field1684.method314(arg1.method248(arg0 + 19149), var5, 7079);
        this.field1688.method393((byte) 99, var5);
        var5.field2365 = 0L;
        if (arg0 != -1676) {
            this.method706((byte) 75);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILwa;)Ljava/lang/Object;")
    public final Object method705(int arg0, class407 arg1) {
        field1681++;
        long var3 = arg1.method248(17473);
        for (class46 var5 = (class46) this.field1684.method308(var3, (byte) -113); var5 != null; var5 = (class46) this.field1684.method312(arg0 ^ 0x6DC5)) {
            if (var5.field460.method244(arg1, (byte) 118)) {
                Object var6 = var5.method215((byte) -123);
                if (var6 != null) {
                    if (var5.method214(-106)) {
                        class88 var7 = new class88(arg1, var6);
                        this.field1684.method314(var5.field4510, var7, 7079);
                        this.field1688.method393((byte) 86, var7);
                        var7.field2365 = 0L;
                        var5.method1967(-1);
                        var5.method1009((byte) 125);
                    } else {
                        this.field1688.method393((byte) 106, var5);
                        var5.field2365 = 0L;
                    }
                    return var6;
                }
                var5.method1967(-1);
                var5.method1009((byte) -104);
                this.field1675++;
            }
        }
        if (arg0 != -28102) {
            this.field1679 = 49;
        }
        return null;
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(B)V")
    public final void method706(byte arg0) {
        int var2 = 69 / (arg0 / 36);
        for (class46 var3 = (class46) this.field1688.method399(126); var3 != null; var3 = (class46) this.field1688.method397(18244)) {
            if (var3.method214(-96)) {
                var3.method1967(-1);
                var3.method1009((byte) 118);
                this.field1675++;
            }
        }
        field1682++;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
    public static final void method707(int arg0, int arg1) {
        class114 var2 = class389.field5560;
        synchronized (class389.field5560) {
            class389.field5560.method614(arg0 + 212, arg1);
        }
        if (arg0 != -339) {
            field1695 = 63;
        }
        field1691++;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(ILwa;)V")
    private final void method708(int arg0, class407 arg1) {
        field1690++;
        long var3 = arg1.method248(17473);
        if (arg0 != 2720) {
            this.field1684 = null;
        }
        for (class46 var5 = (class46) this.field1684.method308(var3, (byte) -109); var5 != null; var5 = (class46) this.field1684.method312(-1)) {
            if (var5.field460.method244(arg1, (byte) -127)) {
                var5.method1967(-1);
                var5.method1009((byte) -98);
                this.field1675++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V")
    public class131(int arg0) {
        this.field1675 = arg0;
        this.field1679 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1684 = new class58(var2);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method709(int arg0) {
        field1696 = null;
        field1689 = null;
        field1694 = null;
        field1687 = null;
        field1693 = null;
        if (arg0 != 160) {
            method701(-25, (byte[]) null, 13, -14, (String) null, 71);
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)V")
    public final void method710(int arg0, int arg1) {
        if (class423.field6195 != null) {
            for (class46 var3 = (class46) this.field1688.method399(arg0 + 10428); var3 != null; var3 = (class46) this.field1688.method397(18244)) {
                if (var3.method214(-74)) {
                    if (var3.method215((byte) -123) == null) {
                        var3.method1967(arg0 + 10303);
                        var3.method1009((byte) -101);
                        this.field1675++;
                    }
                } else if (((long) arg1) < (++var3.field2365)) {
                    class46 var4 = class423.field6195.method2207(true, var3);
                    this.field1684.method314(var3.field4510, var4, 7079);
                    class235.method1273(var4, var3, 0);
                    var3.method1967(arg0 + 10303);
                    var3.method1009((byte) 124);
                }
            }
        }
        if (arg0 != -10304) {
            this.method705(97, (class407) null);
        }
        field1677++;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)I")
    public final int method711(int arg0) {
        field1692++;
        return arg0 == -23289 ? this.field1675 : -70;
    }
}
