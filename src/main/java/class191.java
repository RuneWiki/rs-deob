import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class191 extends class652 {

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    private int field2194 = 0;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "Lwa;")
    private class661 field2207 = new class661(16);

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    private int field2217 = 0;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "Lgk;")
    private class616 field2213 = new class616();

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "J")
    private long field2219 = 0L;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    private int field2201;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Lat;")
    private class585 field2185;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "Z")
    private boolean field2215;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "Lgk;")
    private class616 field2216;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "[B")
    private byte[] field2205;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    private int field2198;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    private int field2187;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Lmv;")
    private class688 field2200;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Z")
    private boolean field2218;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lql;")
    private class165 field2191;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lat;")
    private class585 field2197;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Lng;")
    private class223 field2195;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field2196 = 1337;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field2193 = 0;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "F")
    public static float field2206;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "Lof;")
    private class538 field2208;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "Z")
    private boolean field2214;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[B")
    private byte[] field2188;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)Lof;")
    public final class538 method1154(boolean arg0) {
        field2203++;
        if (this.field2208 != null) {
            return this.field2208;
        }
        if (this.field2195 == null) {
            if (this.field2191.method906(-21)) {
                return null;
            }
            this.field2195 = this.field2191.method903(21423, (byte) 0, this.field2201, true, 255);
        }
        if (this.field2195.field2767) {
            return null;
        }
        byte[] var2 = this.field2195.method1349(-99);
        if (this.field2195 instanceof class421) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2208 = new class538(var2, this.field2198, this.field2205);
                if (this.field2208.field7567 != this.field2187) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2208 = null;
                if (this.field2191.method906(-21)) {
                    this.field2195 = null;
                } else {
                    this.field2195 = this.field2191.method903(21423, (byte) 0, this.field2201, true, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2208 = new class538(var2, this.field2198, this.field2205);
            } catch (RuntimeException var4) {
                this.field2191.method905(84);
                this.field2208 = null;
                if (this.field2191.method906(-21)) {
                    this.field2195 = null;
                } else {
                    this.field2195 = this.field2191.method903(21423, (byte) 0, this.field2201, true, 255);
                }
                return null;
            }
            if (this.field2197 != null) {
                this.field2200.method3807((byte) 122, this.field2201, this.field2197, var2);
            }
        }
        this.field2195 = null;
        if (!arg0) {
            return null;
        }
        if (this.field2185 != null) {
            this.field2188 = new byte[this.field2208.field7584];
            this.field2194 = 0;
        }
        return this.field2208;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I")
    public final int method1155(int arg0) {
        field2210++;
        if (this.field2208 == null) {
            return 0;
        } else if (arg0 > -114) {
            return -81;
        } else {
            return this.field2208.field7564;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I")
    public final int method1156(byte arg0) {
        int var2 = 31 % ((arg0 - 7) / 37);
        field2190++;
        if (this.method1154(true) == null) {
            return this.field2195 == null ? 0 : this.field2195.method1351((byte) 109);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public final void method1157(int arg0) {
        field2189++;
        if (this.field2185 == null) {
            return;
        }
        this.field2214 = true;
        if (arg0 != -874) {
            this.field2216 = null;
        }
        if (this.field2216 == null) {
            this.field2216 = new class616();
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
    public final void method1158(int arg0, int arg1) {
        field2199++;
        if (this.field2185 == null) {
            return;
        }
        for (class333 var3 = this.field2213.method3434((byte) 2); var3 != null; var3 = this.field2213.method3430(true)) {
            if (((long) arg1) == var3.field4176) {
                return;
            }
        }
        if (arg0 == 64) {
            class333 var4 = new class333();
            var4.field4176 = arg1;
            this.field2213.method3425(var4, false);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lrt;I)I")
    public static final int method1159(class179 arg0, int arg1) {
        field2184++;
        if (class179.field2004 == arg0) {
            return 5120;
        } else if (class179.field2006 == arg0) {
            return 5122;
        } else if (class179.field2007 == arg0) {
            return 5124;
        } else if (class179.field2008 == arg0) {
            return 5121;
        } else if (class179.field2009 == arg0) {
            return 5123;
        } else if (class179.field2010 == arg0) {
            return 5125;
        } else if (class179.field2011 == arg0) {
            return 5131;
        } else if (class179.field2012 == arg0) {
            return 5126;
        } else {
            int var2 = -105 % ((40 - arg1) / 59);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)I")
    public final int method1160(byte arg0) {
        field2183++;
        if (this.field2208 == null) {
            return 0;
        } else if (this.field2215) {
            class333 var2 = this.field2216.method3434((byte) 2);
            if (arg0 <= 118) {
                return -8;
            } else if (var2 == null) {
                return 0;
            } else {
                return (int) var2.field4176;
            }
        } else {
            return this.field2208.field7564;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[B")
    public final byte[] method1161(int arg0, byte arg1) {
        field2211++;
        if (arg1 >= -84) {
            return null;
        }
        class223 var3 = this.method1167(0, -3, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1349(-52);
            var3.method1922(78);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)I")
    public final int method1162(int arg0, int arg1) {
        if (arg0 != 22941) {
            method1159(null, -46);
        }
        field2204++;
        class223 var3 = (class223) this.field2207.method3669((long) arg1, -1);
        return var3 == null ? 0 : var3.method1351((byte) 98);
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)I")
    public final int method1163(byte arg0) {
        if (arg0 <= 67) {
            this.field2214 = false;
        }
        field2192++;
        return this.field2194;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public final void method1164(int arg0) {
        field2209++;
        if (this.field2216 != null) {
            if (this.method1154(true) == null) {
                return;
            }
            if (this.field2215) {
                boolean var2 = true;
                for (class333 var3 = this.field2216.method3434((byte) 2); var3 != null; var3 = this.field2216.method3430(true)) {
                    int var5 = (int) var3.field4176;
                    if (this.field2188[var5] == 0) {
                        this.method1167(1, -3, var5);
                    }
                    if (this.field2188[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1922(97);
                    }
                }
                while (this.field2208.field7570.length > this.field2217) {
                    if (this.field2208.field7570[this.field2217] == 0) {
                        this.field2217++;
                    } else {
                        if (this.field2200.field9689 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2188[this.field2217] == 0) {
                            this.method1167(1, -3, this.field2217);
                        }
                        if (this.field2188[this.field2217] == 0) {
                            class333 var4 = new class333();
                            var4.field4176 = this.field2217;
                            this.field2216.method3425(var4, false);
                            var2 = false;
                        }
                        this.field2217++;
                    }
                }
                if (var2) {
                    this.field2215 = false;
                    this.field2217 = 0;
                }
            } else if (this.field2214) {
                boolean var6 = true;
                for (class333 var7 = this.field2216.method3434((byte) 2); var7 != null; var7 = this.field2216.method3430(true)) {
                    int var9 = (int) var7.field4176;
                    if (this.field2188[var9] != 1) {
                        this.method1167(2, -3, var9);
                    }
                    if (this.field2188[var9] == 1) {
                        var7.method1922(100);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2217 < this.field2208.field7570.length) {
                    if (this.field2208.field7570[this.field2217] == 0) {
                        this.field2217++;
                    } else {
                        if (this.field2191.method902(false)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2188[this.field2217] != 1) {
                            this.method1167(2, -3, this.field2217);
                        }
                        if (this.field2188[this.field2217] != 1) {
                            class333 var8 = new class333();
                            var8.field4176 = this.field2217;
                            this.field2216.method3425(var8, false);
                            var6 = false;
                        }
                        this.field2217++;
                    }
                }
                if (var6) {
                    this.field2214 = false;
                    this.field2217 = 0;
                }
            } else {
                this.field2216 = null;
            }
        }
        if (this.field2218 && this.field2219 <= class557.method3157(-74)) {
            for (class223 var10 = (class223) this.field2207.method3674(125); var10 != null; var10 = (class223) this.field2207.method3672(-1)) {
                if (!var10.field2767) {
                    if (var10.field2768) {
                        if (!var10.field2770) {
                            throw new RuntimeException();
                        }
                        var10.method1922(108);
                    } else {
                        var10.field2768 = true;
                    }
                }
            }
            this.field2219 = class557.method3157(-118) + 1000L;
        }
        if (arg0 < 68) {
            this.field2198 = 83;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V")
    public final void method1165(boolean arg0) {
        field2202++;
        if (this.field2216 == null || this.method1154(true) == null) {
            return;
        }
        for (class333 var2 = this.field2213.method3434((byte) 2); var2 != null; var2 = this.field2213.method3430(!arg0)) {
            int var3 = (int) var2.field4176;
            if (var3 < 0 || var3 >= this.field2208.field7584 || this.field2208.field7570[var3] == 0) {
                var2.method1922(107);
            } else {
                if (this.field2188[var3] == 0) {
                    this.method1167(1, -3, var3);
                }
                if (this.field2188[var3] == -1) {
                    this.method1167(2, -3, var3);
                }
                if (this.field2188[var3] == 1) {
                    var2.method1922(122);
                }
            }
        }
        if (arg0) {
            this.method1167(53, 69, -86);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILda;II)Llf;")
    public static final class676 method1166(int arg0, int arg1, class473 arg2, int arg3, int arg4) {
        field2212++;
        if (arg0 != 0) {
            method1166(68, 18, null, 59, -107);
        }
        return arg2 == null ? null : new class676(arg4, arg3, arg1, arg2.method1886(), arg2.method1912(), arg2.method1870(), arg2.method1869(), arg2.method1853(), arg2.method1865(), arg2.method1899());
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Lng;")
    private final class223 method1167(int arg0, int arg1, int arg2) {
        field2186++;
        class223 var4 = (class223) this.field2207.method3669((long) arg2, -1);
        if (arg1 != -3) {
            this.method1160((byte) -108);
        }
        if (var4 != null && arg0 == 0 && !var4.field2770 && var4.field2767) {
            var4.method1922(127);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field2185 == null || this.field2188[arg2] == -1) {
                    if (this.field2191.method906(-21)) {
                        return null;
                    }
                    var4 = this.field2191.method903(arg1 + 21426, (byte) 2, arg2, true, this.field2201);
                } else {
                    var4 = this.field2200.method3808(arg2, -17853, this.field2185);
                }
            } else if (arg0 == 1) {
                if (this.field2185 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2200.method3802(this.field2185, -1, arg2);
            } else if (arg0 == 2) {
                if (this.field2185 == null) {
                    throw new RuntimeException();
                }
                if (this.field2188[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2191.method902(false)) {
                    return null;
                }
                var4 = this.field2191.method903(21423, (byte) 2, arg2, false, this.field2201);
            } else {
                throw new RuntimeException();
            }
            this.field2207.method3671(false, var4, (long) arg2);
        }
        if (var4.field2767) {
            return null;
        }
        byte[] var5 = var4.method1349(-66);
        if (!var4 instanceof class421) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class296.field3706.reset();
                        class296.field3706.update(var5, 0, var5.length - 2);
                        int var12 = (int) class296.field3706.getValue();
                        if (this.field2208.field7573[arg2] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field2208.field7574 == null || this.field2208.field7574[arg2] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field2208.field7574[arg2];
                        byte[] var14 = class97.method533((byte) -123, var5, var5.length - 2, 0);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field2191.field1854 = 0;
                this.field2191.field1855 = 0;
            } catch (RuntimeException var18) {
                this.field2191.method905(125);
                var4.method1922(arg1 + 78);
                if (var4.field2770 && !this.field2191.method906(arg1 ^ 0x16)) {
                    class356 var16 = this.field2191.method903(21423, (byte) 2, arg2, true, this.field2201);
                    this.field2207.method3671(false, var16, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2208.field7578[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field2208.field7578[arg2];
            if (this.field2185 != null) {
                this.field2200.method3807((byte) 122, arg2, this.field2185, var5);
                if (this.field2188[arg2] != 1) {
                    this.field2194++;
                    this.field2188[arg2] = 1;
                }
            }
            if (!var4.field2770) {
                var4.method1922(126);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class296.field3706.reset();
            class296.field3706.update(var5, 0, var5.length - 2);
            int var6 = (int) class296.field3706.getValue();
            if (this.field2208.field7573[arg2] != var6) {
                throw new RuntimeException();
            }
            if (this.field2208.field7574 != null && this.field2208.field7574[arg2] != null) {
                byte[] var7 = this.field2208.field7574[arg2];
                byte[] var8 = class97.method533((byte) -53, var5, var5.length - 2, 0);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2208.field7578[arg2] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field2188[arg2] != 1) {
                this.field2194++;
                this.field2188[arg2] = 1;
            }
            if (!var4.field2770) {
                var4.method1922(117);
            }
            return var4;
        } catch (Exception var17) {
            this.field2188[arg2] = -1;
            var4.method1922(81);
            if (var4.field2770 && !this.field2191.method906(-21)) {
                class356 var11 = this.field2191.method903(21423, (byte) 2, arg2, true, this.field2201);
                this.field2207.method3671(false, var11, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(ILat;Lat;Lql;Lmv;I[BIZ)V")
    public class191(int arg0, class585 arg1, class585 arg2, class165 arg3, class688 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field2201 = arg0;
        this.field2185 = arg1;
        if (this.field2185 == null) {
            this.field2215 = false;
        } else {
            this.field2215 = true;
            this.field2216 = new class616();
        }
        this.field2205 = arg6;
        this.field2198 = arg5;
        this.field2187 = arg7;
        this.field2200 = arg4;
        this.field2218 = arg8;
        this.field2191 = arg3;
        this.field2197 = arg2;
        if (this.field2197 != null) {
            this.field2195 = this.field2200.method3808(this.field2201, -17853, this.field2197);
        }
    }
}
