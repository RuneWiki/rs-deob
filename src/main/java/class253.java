import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class253 {

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Luc;")
    private class14 field3989 = null;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Z")
    private boolean field3972;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "Ljh;")
    private class69 field3991;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Z")
    private boolean field3975;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3969 = 0;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field3974 = 1;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[I")
    public static int[] field3964;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "[I")
    public static int[] field3997;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "[Ljava/lang/Object;")
    private Object[] field3976;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4001;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/String;)I", line = 8)
    public final int method1808(int arg0, String arg1) {
        field3995++;
        if (!this.method1835(30)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3989.field227.method613(true, class192.method1421(var3, 1068628072));
        if (this.method1819((byte) -123, var4)) {
            return arg0 == -1 ? var4 : 38;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 28)
    public final boolean method1809(String arg0, String arg1, int arg2) {
        field3978++;
        if (!this.method1835(35)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg2 <= 44) {
            return true;
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field3989.field227.method613(true, class192.method1421(var4, 1068628072));
        if (this.method1819((byte) -120, var6)) {
            int var7 = this.field3989.field235[var6].method613(true, class192.method1421(var5, 1068628072));
            return this.method1823(var6, var7, (byte) -100);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I", line = 56)
    public final int method1810(int arg0) {
        if (arg0 != 0) {
            field3969 = 19;
        }
        field3979++;
        return this.method1835(31) ? this.field3989.field239.length : -1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)V", line = 74)
    public final void method1811(int arg0, byte arg1) {
        if (arg1 != 114) {
            this.method1815(-124);
        }
        field3988++;
        if (this.method1819((byte) -123, arg0) && this.field4001 != null) {
            this.field4001[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 91)
    public static void method1812(int arg0) {
        field3997 = null;
        if (arg0 != 0) {
            field3969 = -17;
        }
        field3964 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZ)[B", line = 106)
    public final byte[] method1813(int arg0, int arg1, boolean arg2) {
        field3981++;
        return arg2 ? this.method1838(arg1, arg0, (int[]) null, (byte) -68) : (byte[]) null;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I", line = 119)
    public final int method1814(int arg0) {
        field3994++;
        if (!this.method1835(32)) {
            throw new IllegalStateException("");
        }
        if (arg0 <= 87) {
            this.method1813(33, 107, false);
        }
        return this.field3989.field232;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)I", line = 135)
    public final int method1815(int arg0) {
        field3965++;
        if (!this.method1835(arg0 ^ 0x6A)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3976.length; var4++) {
            if (this.field3989.field219[var4] > 0) {
                var3 += this.method1816((byte) 110, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return arg0 * var3 / var2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I", line = 174)
    private final int method1816(byte arg0, int arg1) {
        if (arg0 != 110) {
            this.field3976 = (Object[]) null;
        }
        field3990++;
        if (this.method1819((byte) -128, arg1)) {
            return this.field3976[arg1] == null ? this.field3991.method546(arg1, 65) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V", line = 193)
    private final void method1817(int arg0, int arg1) {
        field3999++;
        if (this.field3975) {
            this.field3976[arg0] = this.field3991.method542(arg1 - 5136, arg0);
        } else {
            this.field3976[arg0] = class182.method1338(this.field3991.method542(0, arg0), 9117, false);
        }
        if (arg1 != 5136) {
            this.method1816((byte) 85, 77);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)V", line = 214)
    private final void method1818(int arg0, byte arg1) {
        if (arg1 != 59) {
            method1839(true);
        }
        field3977++;
        this.field3991.method541(-75, arg0);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(BI)Z", line = 225)
    private final boolean method1819(byte arg0, int arg1) {
        if (arg0 >= -119) {
            this.method1837(-79, 103);
        }
        field3971++;
        if (!this.method1835(120)) {
            return false;
        } else if (arg1 >= 0 && this.field3989.field239.length > arg1 && this.field3989.field239[arg1] != 0) {
            return true;
        } else if (class220.field3484) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZZ)V", line = 251)
    public final void method1820(int arg0, boolean arg1, boolean arg2) {
        field4004++;
        if (!this.method1835(arg0 ^ 0xFFFFB33C)) {
            return;
        }
        if (arg0 != -19609) {
            this.method1809((String) null, (String) null, 2);
        }
        if (arg2) {
            this.field3989.field235 = null;
            this.field3989.field229 = (int[][]) null;
        }
        if (arg1) {
            this.field3989.field227 = null;
            this.field3989.field238 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)Z", line = 276)
    public final boolean method1821(int arg0) {
        if (arg0 > -26) {
            this.method1810(-3);
        }
        field3992++;
        if (!this.method1835(104)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3989.field225.length; var3++) {
            int var4 = this.field3989.field225[var3];
            if (this.field3976[var4] == null) {
                this.method1817(var4, 5136);
                if (this.field3976[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 314)
    public final boolean method1822(String arg0, boolean arg1) {
        field3998++;
        if (this.method1835(64)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3989.field227.method613(arg1, class192.method1421(var3, 1068628072));
            return this.method1829(var4, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIB)Z", line = 333)
    public final boolean method1823(int arg0, int arg1, byte arg2) {
        int var4 = 81 / ((21 - arg2) / 51);
        field3985++;
        if (!this.method1841(arg0, -1, arg1)) {
            return false;
        } else if (this.field4001[arg0] != null && this.field4001[arg0][arg1] != null) {
            return true;
        } else if (this.field3976[arg0] == null) {
            this.method1817(arg0, 5136);
            return this.field3976[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 363)
    public final int method1824(boolean arg0, String arg1) {
        field3982++;
        if (this.method1835(28)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3989.field227.method613(arg0, class192.method1421(var3, 1068628072));
            return this.method1816((byte) 110, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[IB)Z", line = 378)
    private final boolean method1825(int arg0, int[] arg1, byte arg2) {
        field3987++;
        if (!this.method1819((byte) -125, arg0)) {
            return false;
        } else if (this.field3976[arg0] == null) {
            return false;
        } else {
            int var4 = this.field3989.field219[arg0];
            int[] var5 = this.field3989.field222[arg0];
            if (arg2 != -73) {
                this.method1833((String) null, -1);
            }
            boolean var6 = true;
            if (this.field4001[arg0] == null) {
                this.field4001[arg0] = new Object[this.field3989.field239[arg0]];
            }
            Object[] var7 = this.field4001[arg0];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var10 = class272.method1919(this.field3976[arg0], arg2 ^ 0xFFFFFFC6, false);
            } else {
                var10 = class272.method1919(this.field3976[arg0], 119, true);
                class6 var11 = new class6(var10);
                var11.method62(arg1, -2511, 5, var11.field115.length);
            }
            byte[] var12;
            try {
                var12 = class307.method2123(var10, (byte) -47);
            } catch (RuntimeException var31) {
                throw class281.method1987(var31, "T3 - " + (arg1 != null) + "," + arg0 + "," + var10.length + "," + class233.method1676(var10, false, var10.length) + "," + class233.method1676(var10, false, var10.length - 2) + "," + this.field3989.field218[arg0] + "," + this.field3989.field232);
            }
            if (this.field3975) {
                this.field3976[arg0] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                class6 var16 = new class6(var12);
                int var17 = var32 - var4 * 4 * var15;
                var16.field111 = var17;
                int[] var18 = new int[var4];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var16.method73((byte) 19);
                        var18[var21] += var20;
                        if (var5 != null) {
                        }
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                int var24 = 0;
                var16.field111 = var17;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var16.method73((byte) 19);
                        class54.method422(var12, var24, var22[var27], var18[var27], var26);
                        var18[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field3972) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class182.method1338(var22[var28], 9117, false);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field3972) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class182.method1338(var12, 9117, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)I", line = 573)
    public final int method1826(int arg0, int arg1) {
        field4000++;
        if (this.method1819((byte) -121, arg1)) {
            if (arg0 != 0) {
                field3964 = (int[]) null;
            }
            return this.field3989.field239[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V", line = 588)
    public final void method1827(int arg0) {
        if (arg0 != 0) {
            this.method1822((String) null, false);
        }
        field3993++;
        if (this.field4001 != null) {
            for (int var2 = 0; var2 < this.field4001.length; var2++) {
                this.field4001[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLjava/lang/String;)V", line = 609)
    public final void method1828(byte arg0, String arg1) {
        field4002++;
        if (!this.method1835(60)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 < -76) {
            int var4 = this.field3989.field227.method613(true, class192.method1421(var3, 1068628072));
            this.method1818(var4, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)Z", line = 631)
    public final boolean method1829(int arg0, int arg1) {
        field3970++;
        if (arg1 != 0) {
            this.method1834(-23, -14);
        }
        if (!this.method1819((byte) -127, arg0)) {
            return false;
        } else if (this.field3976[arg0] == null) {
            this.method1817(arg0, 5136);
            return this.field3976[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)[B", line = 655)
    public final byte[] method1830(int arg0, int arg1, int arg2) {
        field3968++;
        if (!this.method1841(arg2, -1, arg1)) {
            return null;
        }
        if (this.field4001[arg2] == null || this.field4001[arg2][arg1] == null) {
            boolean var4 = this.method1825(arg2, (int[]) null, (byte) -73);
            if (!var4) {
                this.method1817(arg2, 5136);
                boolean var5 = this.method1825(arg2, (int[]) null, (byte) -73);
                if (!var5) {
                    return null;
                }
            }
        }
        if (arg0 != 536) {
            this.method1822((String) null, true);
        }
        return class272.method1919(this.field4001[arg2][arg1], arg0 ^ 0x27B, false);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILug;)V", line = 688)
    public static final void method1831(int arg0, class253 arg1) {
        field3973++;
        if (arg0 == 0) {
            class172.field2839 = arg1.method1808(-1, "runes");
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V", line = 700)
    public static final void method1832(String arg0, byte arg1, String arg2, int arg3) {
        class336.field5243 = arg0;
        class254.field4016 = arg3;
        class181.field2940 = arg2;
        field3983++;
        if (class336.field5243.equals("") || class181.field2940.equals("")) {
            class91.field1216 = 3;
        } else if (class271.field4209 == -1) {
            class91.field1216 = -3;
            class27.field403 = 0;
            class308.field4800 = 1;
            class15.field256 = 0;
            class6 var4 = new class6(128);
            var4.method81((byte) -104, 10);
            var4.method34((int) (Math.random() * 9.9999999E7D), 294335144);
            var4.method53((byte) -61, class83.method608(class336.field5243, (byte) 119));
            var4.method34((int) (Math.random() * 9.9999999E7D), arg1 ^ 0xEE74CD22);
            var4.method48(128, class181.field2940);
            var4.method34((int) (Math.random() * 9.9999999E7D), 294335144);
            var4.method76(class80.field1087, class95.field1257, -82);
            class183.field2965.field111 = 0;
            class183.field2965.method81((byte) -110, 24);
            class183.field2965.method81((byte) -127, var4.field111 + 2);
            class183.field2965.method65((byte) -9, 536);
            if (arg1 != -118) {
                field3964 = (int[]) null;
            }
            class183.field2965.method67(var4.field111, 0, (byte) -126, var4.field115);
        } else {
            class129.method945(false);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 744)
    public final boolean method1833(String arg0, int arg1) {
        field3967++;
        if (this.method1835(107)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3989.field227.method613(true, class192.method1421(var3, arg1 ^ 0xC04E0797));
            return ~var4 <= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)[B", line = 764)
    public final byte[] method1834(int arg0, int arg1) {
        field3966++;
        if (!this.method1835(99)) {
            return null;
        } else if (this.field3989.field239.length == 1) {
            return this.method1813(arg1, 0, true);
        } else if (this.method1819((byte) -124, arg1)) {
            if (arg0 > -127) {
                method1812(-8);
            }
            if (this.field3989.field239[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method1813(0, arg1, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)Z", line = 791)
    private final boolean method1835(int arg0) {
        if (arg0 < 13) {
            this.field4001 = (Object[][]) ((Object[][]) null);
        }
        field3980++;
        if (this.field3989 == null) {
            this.field3989 = this.field3991.method543(false);
            if (this.field3989 == null) {
                return false;
            }
            this.field3976 = new Object[this.field3989.field237];
            this.field4001 = new Object[this.field3989.field237][];
        }
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ljh;ZZ)V", line = 1004)
    public class253(class69 arg0, boolean arg1, boolean arg2) {
        this.field3972 = arg2;
        this.field3991 = arg0;
        this.field3975 = arg1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B", line = 829)
    public final byte[] method1836(int arg0, String arg1, String arg2) {
        field3996++;
        if (!this.method1835(arg0 ^ 0x13)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3989.field227.method613(true, class192.method1421(var4, 1068628072));
        if (this.method1819((byte) -125, var6)) {
            int var7 = this.field3989.field235[var6].method613(true, class192.method1421(var5, 1068628072));
            return arg0 == 0 ? this.method1813(var7, var6, true) : (byte[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(II)Z", line = 859)
    public final boolean method1837(int arg0, int arg1) {
        field4005++;
        if (!this.method1835(32)) {
            return false;
        } else if (this.field3989.field239.length == 1) {
            return this.method1823(0, arg1, (byte) 87);
        } else if (!this.method1819((byte) -128, arg1)) {
            return false;
        } else if (this.field3989.field239[arg1] == 1) {
            return this.method1823(arg1, 0, (byte) 122);
        } else {
            if (arg0 <= 77) {
                this.method1814(-110);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[IB)[B", line = 890)
    public final byte[] method1838(int arg0, int arg1, int[] arg2, byte arg3) {
        field3986++;
        if (!this.method1841(arg0, -1, arg1)) {
            return null;
        }
        if (this.field4001[arg0] == null || this.field4001[arg0][arg1] == null) {
            boolean var5 = this.method1825(arg0, arg2, (byte) -73);
            if (!var5) {
                this.method1817(arg0, 5136);
                boolean var6 = this.method1825(arg0, arg2, (byte) -73);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg3 >= -55) {
            this.method1818(62, (byte) 4);
        }
        byte[] var7 = class272.method1919(this.field4001[arg0][arg1], 114, false);
        if (this.field3972) {
            this.field4001[arg0][arg1] = null;
            if (this.field3989.field239[arg0] == 1) {
                this.field4001[arg0] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V", line = 936)
    public static final void method1839(boolean arg0) {
        if (arg0) {
            method1812(-46);
        }
        class120.field1670.method1359(105);
        field3984++;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)Lne;", line = 948)
    public static final class138 method1840(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        return var3 == null || var3.field1788 == null ? null : var3.field1788;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(III)Z", line = 956)
    private final boolean method1841(int arg0, int arg1, int arg2) {
        field4003++;
        if (!this.method1835(85)) {
            return false;
        } else if (arg1 >= ~arg0 && arg2 >= 0 && this.field3989.field239.length > arg0 && arg2 < this.field3989.field239[arg0]) {
            return true;
        } else if (class220.field3484) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(BI)[I", line = 978)
    public final int[] method1842(byte arg0, int arg1) {
        int var3 = -120 % ((-arg0 - 62) / 60);
        field4006++;
        if (!this.method1819((byte) -120, arg1)) {
            return null;
        }
        int[] var4 = this.field3989.field222[arg1];
        if (var4 == null) {
            var4 = new int[this.field3989.field219[arg1]];
            int var5 = 0;
            while (var4.length > var5) {
                var4[var5] = var5++;
            }
        }
        return var4;
    }
}
