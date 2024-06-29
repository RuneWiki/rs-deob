import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class133 {

    @OriginalMember(owner = "client!km", name = "D", descriptor = "Lki;")
    private class160 field1843 = null;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Z")
    private boolean field1815;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "Lpc;")
    private class93 field1831;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Z")
    private boolean field1821;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "[Ljava/lang/Object;")
    private Object[] field1841;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1820;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)Z", line = 8)
    private final boolean method946(int arg0) {
        field1816++;
        int var2 = 7 / ((arg0 - 36) / 49);
        if (this.field1843 == null) {
            this.field1843 = this.field1831.method696((byte) -106);
            if (this.field1843 == null) {
                return false;
            }
            this.field1820 = new Object[this.field1843.field2195][];
            this.field1841 = new Object[this.field1843.field2195];
        }
        return true;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IBI)[B", line = 30)
    public final byte[] method947(int arg0, byte arg1, int arg2) {
        field1833++;
        if (!this.method956(31, arg2, arg0)) {
            return null;
        }
        if (this.field1820[arg0] == null || this.field1820[arg0][arg2] == null) {
            boolean var4 = this.method966((int[]) null, arg0, 71);
            if (!var4) {
                this.method962(arg0, 0);
                boolean var5 = this.method966((int[]) null, arg0, 75);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class198.method1403(this.field1820[arg0][arg2], (byte) -120, false);
        if (arg1 >= -49) {
            this.field1841 = (Object[]) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)[B", line = 70)
    public final byte[] method948(byte arg0, int arg1) {
        field1838++;
        if (!this.method946(-70)) {
            return null;
        } else if (this.field1843.field2204.length == 1) {
            return this.method955(0, arg1, -21853);
        } else if (!this.method953(arg1, (byte) 46)) {
            return null;
        } else if (this.field1843.field2204[arg1] == 1) {
            return this.method955(arg1, 0, -21853);
        } else {
            int var3 = 10 / ((-arg0 - 67) / 44);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)I", line = 107)
    private final int method949(int arg0, int arg1) {
        field1814++;
        if (this.method953(arg1, (byte) 46)) {
            if (arg0 != -31374) {
                this.method948((byte) -25, 110);
            }
            return this.field1841[arg1] == null ? this.field1831.method698((byte) -12, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[IIB)[B", line = 125)
    public final byte[] method950(int arg0, int[] arg1, int arg2, byte arg3) {
        field1824++;
        if (!this.method956(57, arg2, arg0)) {
            return null;
        }
        if (this.field1820[arg0] == null || this.field1820[arg0][arg2] == null) {
            boolean var5 = this.method966(arg1, arg0, 118);
            if (!var5) {
                this.method962(arg0, 0);
                boolean var6 = this.method966(arg1, arg0, 111);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg3 < 126) {
            return (byte[]) null;
        }
        byte[] var7 = class198.method1403(this.field1820[arg0][arg2], (byte) -117, false);
        if (this.field1815) {
            this.field1820[arg0][arg2] = null;
            if (this.field1843.field2204[arg0] == 1) {
                this.field1820[arg0] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 169)
    public final boolean method951(String arg0, int arg1) {
        field1848++;
        if (!this.method946(104)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 2) {
            this.method951((String) null, -75);
        }
        int var4 = this.field1843.field2205.method2083(arg1 - 1, class1.method2(var3, (byte) -116));
        return this.method969(0, var4);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)I", line = 187)
    public final int method952(byte arg0) {
        if (arg0 <= 5) {
            this.field1831 = (class93) null;
        }
        field1840++;
        return this.method946(-89) ? this.field1843.field2204.length : -1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IB)Z", line = 201)
    private final boolean method953(int arg0, byte arg1) {
        if (arg1 != 46) {
            this.method965((byte) -96, (String) null);
        }
        field1839++;
        if (!this.method946(91)) {
            return false;
        } else if (arg0 >= 0 && this.field1843.field2204.length > arg0 && this.field1843.field2204[arg0] != 0) {
            return true;
        } else if (class167.field2285) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(II)[I", line = 235)
    public final int[] method954(int arg0, int arg1) {
        field1844++;
        if (!this.method953(arg1, (byte) 46)) {
            return null;
        } else if (arg0 == 0) {
            int[] var3 = this.field1843.field2206[arg1];
            if (var3 == null) {
                var3 = new int[this.field1843.field2200[arg1]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)[B", line = 264)
    public final byte[] method955(int arg0, int arg1, int arg2) {
        if (arg2 == -21853) {
            field1836++;
            return this.method950(arg0, (int[]) null, arg1, (byte) 127);
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(III)Z", line = 275)
    private final boolean method956(int arg0, int arg1, int arg2) {
        field1842++;
        if (arg0 <= 20) {
            return false;
        } else if (!this.method946(101)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && this.field1843.field2204.length > arg2 && arg1 < this.field1843.field2204[arg2]) {
            return true;
        } else if (class167.field2285) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I", line = 300)
    public final int method957(int arg0) {
        field1835++;
        if (!this.method946(-40)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 <= 85) {
            return 90;
        }
        for (int var4 = 0; var4 < this.field1841.length; var4++) {
            if (this.field1843.field2200[var4] > 0) {
                var3 += this.method949(-31374, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V", line = 343)
    public final void method958(int arg0) {
        if (this.field1820 != null) {
            for (int var2 = 0; var2 < this.field1820.length; var2++) {
                this.field1820[var2] = null;
            }
        }
        field1829++;
        int var3 = 117 % ((arg0 - 21) / 62);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)Z", line = 365)
    public final boolean method959(boolean arg0) {
        field1845++;
        if (!this.method946(-24)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1843.field2191.length; var3++) {
            int var4 = this.field1843.field2191[var3];
            if (this.field1841[var4] == null) {
                this.method962(var4, 0);
                if (this.field1841[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0) {
            this.method954(-89, 99);
        }
        return var2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLjava/lang/String;)V", line = 401)
    public final void method960(byte arg0, String arg1) {
        field1849++;
        if (this.method946(115)) {
            String var3 = arg1.toLowerCase();
            int var4 = 92 / ((arg0 - 27) / 38);
            int var5 = this.field1843.field2205.method2083(1, class1.method2(var3, (byte) -117));
            this.method973(110, var5);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(IB)Z", line = 419)
    public final boolean method961(int arg0, byte arg1) {
        if (arg1 != -128) {
            this.method963((byte) -28);
        }
        field1827++;
        if (!this.method946(126)) {
            return false;
        } else if (this.field1843.field2204.length == 1) {
            return this.method975((byte) 56, arg0, 0);
        } else if (!this.method953(arg0, (byte) 46)) {
            return false;
        } else if (this.field1843.field2204[arg0] == 1) {
            return this.method975((byte) -118, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V", line = 460)
    private final void method962(int arg0, int arg1) {
        if (this.field1821) {
            this.field1841[arg0] = this.field1831.method700(arg0, (byte) 54);
        } else {
            this.field1841[arg0] = class219.method1516(arg1 - 118, false, this.field1831.method700(arg0, (byte) 54));
        }
        if (arg1 != 0) {
            this.method951((String) null, 3);
        }
        field1832++;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)I", line = 475)
    public final int method963(byte arg0) {
        field1828++;
        if (arg0 != 63) {
            this.method957(37);
        }
        if (!this.method946(-119)) {
            throw new IllegalStateException("");
        }
        return this.field1843.field2202;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;)I", line = 495)
    public final int method964(int arg0, String arg1) {
        field1834++;
        if (arg0 < 10) {
            this.method949(82, -101);
        }
        if (this.method946(106)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1843.field2205.method2083(1, class1.method2(var3, (byte) -112));
            return this.method953(var4, (byte) 46) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(BLjava/lang/String;)Z", line = 518)
    public final boolean method965(byte arg0, String arg1) {
        field1847++;
        if (!this.method946(104)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 == -60) {
            int var4 = this.field1843.field2205.method2083(1, class1.method2(var3, (byte) -108));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lpc;ZZ)V", line = 880)
    public class133(class93 arg0, boolean arg1, boolean arg2) {
        this.field1815 = arg2;
        this.field1831 = arg0;
        this.field1821 = arg1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([III)Z", line = 545)
    private final boolean method966(int[] arg0, int arg1, int arg2) {
        field1823++;
        if (!this.method953(arg1, (byte) 46)) {
            return false;
        } else if (this.field1841[arg1] == null) {
            return false;
        } else {
            int var4 = this.field1843.field2200[arg1];
            int[] var5 = this.field1843.field2206[arg1];
            if (arg2 <= 66) {
                return false;
            }
            boolean var6 = true;
            if (this.field1820[arg1] == null) {
                this.field1820[arg1] = new Object[this.field1843.field2204[arg1]];
            }
            Object[] var7 = this.field1820[arg1];
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
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class198.method1403(this.field1841[arg1], (byte) -121, true);
                class316 var11 = new class316(var10);
                var11.method2166(5, arg0, var11.field4798.length, 68);
            } else {
                var10 = class198.method1403(this.field1841[arg1], (byte) -102, false);
            }
            byte[] var12;
            try {
                var12 = class170.method1198((byte) 57, var10);
            } catch (RuntimeException var31) {
                throw class242.method1661(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class207.method1461(var10, -25376, var10.length) + "," + class207.method1461(var10, -25376, var10.length - 2) + "," + this.field1843.field2187[arg1] + "," + this.field1843.field2202);
            }
            if (this.field1821) {
                this.field1841[arg1] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                class316 var16 = new class316(var12);
                int[] var17 = new int[var4];
                int var18 = var32 - var4 * 4 * var15;
                var16.field4777 = var18;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        if (var5 == null) {
                        }
                        var20 += var16.method2172((byte) 71);
                        var17[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var17[var23]];
                    var17[var23] = 0;
                }
                int var24 = 0;
                var16.field4777 = var18;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var16.method2172((byte) 71);
                        class281.method1943(var12, var24, var22[var27], var17[var27], var26);
                        var17[var27] += var26;
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
                    if (this.field1815) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class219.method1516(-124, false, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field1815) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class219.method1516(-122, false, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIZ)V", line = 737)
    public final void method967(boolean arg0, int arg1, boolean arg2) {
        field1846++;
        if (!this.method946(95)) {
            return;
        }
        if (arg0) {
            this.field1843.field2205 = null;
            this.field1843.field2190 = null;
        }
        if (arg1 != 0) {
            this.field1841 = (Object[]) null;
        }
        if (arg2) {
            this.field1843.field2188 = null;
            this.field1843.field2199 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(BLjava/lang/String;)I", line = 766)
    public final int method968(byte arg0, String arg1) {
        field1818++;
        if (!this.method946(121)) {
            return 0;
        }
        if (arg0 <= 118) {
            this.method969(-120, -122);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1843.field2205.method2083(1, class1.method2(var3, (byte) -121));
        return this.method949(-31374, var4);
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(II)Z", line = 783)
    public final boolean method969(int arg0, int arg1) {
        field1826++;
        if (!this.method953(arg1, (byte) 46)) {
            return false;
        } else if (this.field1841[arg1] == null) {
            this.method962(arg1, arg0);
            return this.field1841[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(II)I", line = 806)
    public final int method970(int arg0, int arg1) {
        field1822++;
        if (arg0 >= -61) {
            this.field1831 = (class93) null;
        }
        return this.method953(arg1, (byte) 46) ? this.field1843.field2204[arg1] : 0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", line = 823)
    public final byte[] method971(String arg0, String arg1, int arg2) {
        field1825++;
        if (!this.method946(95)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        if (arg2 <= 54) {
            this.method959(false);
        }
        int var6 = this.field1843.field2205.method2083(1, class1.method2(var4, (byte) -119));
        if (this.method953(var6, (byte) 46)) {
            int var7 = this.field1843.field2188[var6].method2083(1, class1.method2(var5, (byte) -110));
            return this.method955(var6, var7, -21853);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 847)
    public final boolean method972(String arg0, String arg1, int arg2) {
        if (arg2 != -32002) {
            this.field1820 = (Object[][]) ((Object[][]) null);
        }
        field1837++;
        if (!this.method946(-74)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field1843.field2205.method2083(1, class1.method2(var4, (byte) -108));
        if (this.method953(var6, (byte) 46)) {
            int var7 = this.field1843.field2188[var6].method2083(arg2 ^ 0xFFFF82FF, class1.method2(var5, (byte) -121));
            return this.method975((byte) -90, var7, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(II)V", line = 871)
    private final void method973(int arg0, int arg1) {
        field1819++;
        this.field1831.method701((byte) -98, arg1);
        if (arg0 <= 17) {
            this.field1843 = (class160) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "g", descriptor = "(II)V", line = 891)
    public final void method974(int arg0, int arg1) {
        if (arg0 != -12736) {
            this.method965((byte) -20, (String) null);
        }
        field1830++;
        if (this.method953(arg1, (byte) 46) && this.field1820 != null) {
            this.field1820[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BII)Z", line = 909)
    public final boolean method975(byte arg0, int arg1, int arg2) {
        field1817++;
        int var4 = 116 / ((-arg0 - 25) / 39);
        if (!this.method956(84, arg1, arg2)) {
            return false;
        } else if (this.field1820[arg2] != null && this.field1820[arg2][arg1] != null) {
            return true;
        } else if (this.field1841[arg2] == null) {
            this.method962(arg2, 0);
            return this.field1841[arg2] != null;
        } else {
            return true;
        }
    }
}
