import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class110 {

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    private int field1964 = 32;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "J")
    private long field1961 = class57.method391(19211);

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    private int field1981 = 0;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "Z")
    private boolean field1986 = true;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    private int field1983 = 0;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    private int field1987 = 0;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "[Ljk;")
    private class278[] field1990 = new class278[8];

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    private int field1984 = 0;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "[Ljk;")
    private class278[] field1991 = new class278[8];

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "J")
    private long field1992 = 0L;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "J")
    private long field1993 = 0L;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "[Lhi;")
    public static class82[] field1970 = new class82[1000];

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field1980 = 0;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    private int field1982;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Ljk;")
    private class278 field1978;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "[I")
    public int[] field1971;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 4)
    public final void method752(byte arg0) {
        if (arg0 > -28) {
            method763(true);
        }
        this.field1986 = true;
        field1972++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljk;B)V", line = 17)
    public final synchronized void method753(class278 arg0, byte arg1) {
        field1979++;
        this.field1978 = arg0;
        if (arg1 != 18) {
            this.field1986 = false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V", line = 29)
    private final void method754(int arg0, int arg1) {
        this.field1984 -= arg0;
        field1985++;
        if (this.field1984 < 0) {
            this.field1984 = 0;
        }
        if (arg1 != 781) {
            this.method752((byte) 11);
        }
        if (this.field1978 != null) {
            this.field1978.method883(arg0);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 52)
    public void method755(Component arg0) throws Exception {
        field1975++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjk;I)V", line = 67)
    private final void method756(int arg0, class278 arg1, int arg2) {
        field1968++;
        int var4 = arg0 >> 5;
        class278 var5 = this.field1990[var4];
        if (var5 == null) {
            this.field1991[var4] = arg1;
        } else {
            var5.field4671 = arg1;
        }
        if (arg2 == 11334) {
            this.field1990[var4] = arg1;
            arg1.field4670 = arg0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V", line = 95)
    public void method757() throws Exception {
        field1966++;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V", line = 107)
    public final synchronized void method758(byte arg0) {
        if (class122.field2132 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class122.field2132.field3043[var3] == this) {
                    class122.field2132.field3043[var3] = null;
                }
                if (class122.field2132.field3043[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class122.field2132.field3042 = true;
                while (class122.field2132.field3056) {
                    class290.method2001(50L, false);
                }
                class122.field2132 = null;
            }
        }
        this.method766();
        field1965++;
        int var4 = -112 % ((72 - arg0) / 34);
        this.field1971 = null;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()V", line = 150)
    public void method759() throws Exception {
        field1967++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 159)
    public final synchronized void method760(int arg0) {
        if (arg0 != 0) {
            field1974 = -63;
        }
        field1973++;
        this.field1986 = true;
        try {
            this.method759();
        } catch (Exception var3) {
            this.method766();
            this.field1993 = class57.method391(19211) + 2000L;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()I", line = 182)
    public int method761() throws Exception {
        field1976++;
        return this.field1988;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 193)
    public void method762(int arg0) throws Exception {
        field1962++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V", line = 200)
    public static void method763(boolean arg0) {
        if (arg0) {
            method763(true);
        }
        field1970 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([II)V", line = 211)
    private final void method764(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class219.field3799) {
            var3 = arg1 << 1;
        }
        class190.method1320(arg0, 0, var3);
        this.field1984 -= arg1;
        if (this.field1978 != null && this.field1984 <= 0) {
            this.field1984 += class307.field5236 >> 4;
            class247.method1771(true, this.field1978);
            this.method756(this.field1978.method1695(), this.field1978, 11334);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class278 var10 = null;
                        class278 var11 = this.field1991[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class170 var12 = var11.field4669;
                                if (var12 == null || var12.field2943 <= var8) {
                                    var11.field4672 = true;
                                    int var13 = var11.method878();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2943 += var13;
                                    }
                                    if (var4 >= this.field1964) {
                                        break label105;
                                    }
                                    class278 var14 = var11.method886();
                                    if (var14 != null) {
                                        int var15 = var11.field4670;
                                        while (var14 != null) {
                                            this.method756(var15 * var14.method1695() >> 8, var14, 11334);
                                            var14 = var11.method875();
                                        }
                                    }
                                    class278 var16 = var11.field4671;
                                    var11.field4671 = null;
                                    if (var10 == null) {
                                        this.field1991[var7] = var16;
                                    } else {
                                        var10.field4671 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1990[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4671;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class278 var18 = this.field1991[var17];
                this.field1991[var17] = this.field1990[var17] = null;
                while (var18 != null) {
                    class278 var19 = var18.field4671;
                    var18.field4671 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1984 < 0) {
            this.field1984 = 0;
        }
        if (this.field1978 != null) {
            this.field1978.method881(arg0, 0, arg1);
        }
        this.field1961 = class57.method391(19211);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V", line = 373)
    public static final void method765(byte arg0) {
        for (int var1 = -1; var1 < class297.field5054; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class310.field5292[var1];
            }
            class81 var3 = class29.field405[var2];
            if (var3 != null) {
                class194.method1351(arg0 ^ 0x26, var3.method520(true), var3);
            }
        }
        if (arg0 != 81) {
            field1980 = 80;
        }
        field1977++;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()V", line = 412)
    public void method766() {
        field1960++;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V", line = 420)
    public final synchronized void method767(byte arg0) {
        field1963++;
        if (this.field1971 == null) {
            return;
        }
        long var2 = class57.method391(19211);
        try {
            if (this.field1993 != 0L) {
                if (this.field1993 > var2) {
                    return;
                }
                this.method762(this.field1988);
                this.field1993 = 0L;
                this.field1986 = true;
            }
            int var4 = this.method761();
            int var5 = this.field1989 + this.field1982;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field1983 < this.field1981 - var4) {
                this.field1983 = this.field1981 - var4;
            }
            if (this.field1988 < (var5 + 256)) {
                var4 = 0;
                this.field1988 += 1024;
                if (this.field1988 > 16384) {
                    this.field1988 = 16384;
                }
                this.method766();
                this.method762(this.field1988);
                if (this.field1988 < (var5 + 256)) {
                    var5 = this.field1988 - 256;
                    this.field1982 = var5 - this.field1989;
                }
                this.field1986 = true;
            }
            while (var4 < var5) {
                this.method764(this.field1971, 256);
                var4 += 256;
                this.method757();
            }
            if (this.field1992 < var2) {
                if (this.field1986) {
                    this.field1986 = false;
                } else if (this.field1983 == 0 && this.field1987 == 0) {
                    this.method766();
                    this.field1993 = var2 + 2000L;
                    return;
                } else {
                    this.field1982 = Math.min(this.field1987, this.field1983);
                    this.field1987 = this.field1983;
                }
                this.field1983 = 0;
                this.field1992 = var2 + 2000L;
            }
            this.field1981 = var4;
        } catch (Exception var9) {
            this.method766();
            this.field1993 = var2 + 2000L;
        }
        try {
            if ((this.field1961 + 500000L) < var2) {
                var2 = this.field1961;
            }
            if (arg0 > -30) {
                this.field1986 = true;
            }
            while ((this.field1961 + 5000L) < var2) {
                this.method754(256, 781);
                this.field1961 += (long) (256000 / class307.field5236);
            }
        } catch (Exception var8) {
            this.field1961 = var2;
        }
    }
}
