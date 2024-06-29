import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class156 {

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public int field1801 = -1;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "Z")
    public boolean field1807 = false;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public int field1813 = -1;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public int field1805 = 99;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public int field1814 = -1;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Z")
    public boolean field1800 = false;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public int field1804 = 2;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public int field1802 = -1;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Z")
    public boolean field1819 = false;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    public int field1822 = -1;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "Z")
    public boolean field1816 = false;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public int field1827 = 5;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "[Lg;")
    public static class366[] field1815 = new class366[4];

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "F")
    public static float field1826;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "[I")
    private int[] field1799;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "[I")
    public int[] field1817;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "[I")
    public int[] field1821;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "[Z")
    public boolean[] field1824;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "[[I")
    public int[][] field1818;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public final void method992(int arg0) {
        if (this.field1802 == -1) {
            if (this.field1824 == null) {
                this.field1802 = 0;
            } else {
                this.field1802 = 2;
            }
        }
        if (this.field1814 == arg0) {
            if (this.field1824 == null) {
                this.field1814 = 0;
            } else {
                this.field1814 = 2;
            }
        }
        field1811++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)I")
    public static final int method993(int arg0, byte arg1) {
        field1820++;
        return arg1 == 68 ? arg0 >>> 7 : 18;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
    public static final void method994(int arg0, Object[] arg1, long[] arg2) {
        if (arg0 > -26) {
            field1826 = -0.9306564F;
        }
        class203.method1243(arg2.length - 1, true, 0, arg2, arg1);
        field1808++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLbg;)V")
    public final void method995(byte arg0, class242 arg1) {
        field1823++;
        while (true) {
            int var3 = arg1.method1563(-128);
            if (var3 == 0) {
                int var4 = -80 / ((39 - arg0) / 41);
                return;
            }
            this.method998(var3, arg1, 997);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)C")
    public static final char method996(byte arg0, int arg1) {
        field1803++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class296.field3953[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        int var4 = -70 % ((64 - arg1) / 33);
        return (char) var2;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIBIILge;)Lge;")
    public final class386 method997(int arg0, int arg1, byte arg2, int arg3, int arg4, class386 arg5) {
        field1806++;
        int var7 = this.field1817[arg3];
        int var8 = this.field1821[arg3];
        class140 var9 = class57.method320(-16, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method1459((byte) 1, arg1, true);
        }
        class140 var11 = null;
        if ((this.field1816 || class338.field4610) && arg4 != -1 && arg4 < this.field1821.length) {
            int var12 = this.field1821[arg4];
            var11 = class57.method320(-16, var12 >> 16);
            arg4 = var12 & 0xFFFF;
        }
        class140 var13 = null;
        class140 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (arg2 != -120) {
            method993(-51, (byte) -98);
        }
        if (this.field1799 != null) {
            if (this.field1799.length > arg3) {
                var15 = this.field1799[arg3];
                if (var15 != 65535) {
                    var13 = class57.method320(-16, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1816 || class338.field4610) && arg4 != -1 && this.field1799.length > arg4) {
                var16 = this.field1799[arg4];
                if (var16 != 65535) {
                    var14 = class57.method320(-16, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1807) {
            arg1 |= 0x200;
        }
        if (var9.method894(var10, 0)) {
            arg1 |= 0x80;
        }
        if (var9.method900((byte) 30, var10)) {
            arg1 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method894(var15, 0)) {
                arg1 |= 0x80;
            }
            if (var13.method900((byte) 50, var15)) {
                arg1 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method894(arg4, arg2 ^ 0xFFFFFF88)) {
                arg1 |= 0x80;
            }
            if (var11.method900((byte) -122, arg4)) {
                arg1 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method894(var16, 0)) {
                arg1 |= 0x80;
            }
            if (var14.method900((byte) -121, var16)) {
                arg1 |= 0x100;
            }
        }
        int var17 = arg1 | 0x20;
        class386 var18 = arg5.method1459((byte) 1, var17, true);
        var18.method2405(var7, this.field1807, var9, 0, var11, arg4, 65535, var10, arg0 - 1);
        if (var13 != null) {
            var18.method2405(var7, this.field1807, var13, 0, var14, var16, 65535, var15, arg0 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILbg;I)V")
    private final void method998(int arg0, class242 arg1, int arg2) {
        if (arg2 != 997) {
            method994(110, (Object[]) null, (long[]) null);
        }
        if (arg0 == 1) {
            int var13 = arg1.method1587((byte) -102);
            this.field1817 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1817[var14] = arg1.method1587((byte) -102);
            }
            this.field1821 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field1821[var15] = arg1.method1587((byte) -102);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field1821[var16] += arg1.method1587((byte) -102) << 16;
            }
        } else if (arg0 == 2) {
            this.field1801 = arg1.method1587((byte) -102);
        } else if (arg0 == 3) {
            this.field1824 = new boolean[256];
            int var4 = arg1.method1563(-128);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1824[arg1.method1563(-128)] = true;
            }
        } else if (arg0 == 4) {
            this.field1819 = true;
        } else if (arg0 == 5) {
            this.field1827 = arg1.method1563(-128);
        } else if (arg0 == 6) {
            this.field1822 = arg1.method1587((byte) -102);
        } else if (arg0 == 7) {
            this.field1813 = arg1.method1587((byte) -102);
        } else if (arg0 == 8) {
            this.field1805 = arg1.method1563(arg2 ^ 0xFFFFFC65);
        } else if (arg0 == 9) {
            this.field1814 = arg1.method1563(-128);
        } else if (arg0 == 10) {
            this.field1802 = arg1.method1563(-128);
        } else if (arg0 == 11) {
            this.field1804 = arg1.method1563(arg2 ^ 0xFFFFFC65);
        } else if (arg0 == 12) {
            int var6 = arg1.method1563(arg2 ^ 0xFFFFFC65);
            this.field1799 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1799[var7] = arg1.method1587((byte) -102);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field1799[var8] = (arg1.method1587((byte) -102) << 16) + this.field1799[var8];
            }
        } else if (arg0 == 13) {
            int var9 = arg1.method1587((byte) -102);
            this.field1818 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg1.method1563(-128);
                if (var11 > 0) {
                    this.field1818[var10] = new int[var11];
                    this.field1818[var10][0] = arg1.method1545(8);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field1818[var10][var12] = arg1.method1587((byte) -102);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field1807 = true;
        } else if (arg0 == 15) {
            this.field1816 = true;
        } else if (arg0 == 16) {
            this.field1800 = true;
        }
        field1812++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
    public static void method999(boolean arg0) {
        field1815 = null;
        if (arg0) {
            method996((byte) 49, 10);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIBIIILge;I)Lge;")
    public final class386 method1000(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class386 arg6, int arg7) {
        field1825++;
        int var9 = this.field1817[arg0];
        int var10 = this.field1821[arg0];
        class140 var11 = class57.method320(-16, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method1459(arg2, arg7, true);
        } else if (arg5 < 15) {
            return null;
        } else {
            class140 var13 = null;
            if ((this.field1816 || class338.field4610) && arg4 != -1 && arg4 < this.field1821.length) {
                int var14 = this.field1821[arg4];
                var13 = class57.method320(-16, var14 >> 16);
                arg4 = var14 & 0xFFFF;
            }
            if (this.field1807) {
                arg7 |= 0x200;
            }
            if (var11.method894(var12, 0)) {
                arg7 |= 0x80;
            }
            if (var11.method900((byte) -121, var12)) {
                arg7 |= 0x100;
            }
            if (var13 != null) {
                if (var13.method894(arg4, 0)) {
                    arg7 |= 0x80;
                }
                if (var13.method900((byte) -117, arg4)) {
                    arg7 |= 0x100;
                }
            }
            int var15 = arg7 | 0x20;
            class386 var16 = arg6.method1459(arg2, var15, true);
            var16.method2405(var9, this.field1807, var11, arg3, var13, arg4, 65535, var12, arg1 - 1);
            return var16;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZIZ)I")
    public final int method1001(int arg0, boolean arg1, int arg2, boolean arg3) {
        field1810++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field1821[arg0];
        class140 var8 = null;
        class140 var9 = class57.method320(-16, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1816 || class338.field4610) && arg2 != -1 && arg2 < this.field1821.length) {
            int var11 = this.field1821[arg2];
            var8 = class57.method320(-16, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1807) {
            var5 |= 0x200;
        }
        if (var9.method894(var10, 0)) {
            var5 |= 0x80;
        }
        if (var9.method900((byte) 34, var10)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method894(var6, 0)) {
                var5 |= 0x80;
            }
            if (var8.method900((byte) 83, var6)) {
                var5 |= 0x100;
            }
        }
        if (this.field1799 != null && arg1) {
            if (arg0 < this.field1799.length) {
                int var12 = this.field1799[arg0];
                if (var12 != 65535) {
                    class140 var13 = class57.method320(-16, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method894(var14, 0)) {
                            var5 |= 0x80;
                        }
                        if (var13.method900((byte) -126, var14)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field1816 || class338.field4610) && arg2 != -1 && this.field1799.length > arg2) {
                int var15 = this.field1799[arg2];
                if (var15 != 65535) {
                    class140 var16 = class57.method320(-16, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method894(var17, 0)) {
                            var5 |= 0x80;
                        }
                        if (var16.method900((byte) 25, var17)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        if (!arg3) {
            this.field1821 = null;
        }
        return var5 | 0x20;
    }
}
