import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class126 {

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lc;")
    private class70 field2229 = new class70();

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lc;")
    private class70 field2230 = new class70();

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lc;")
    private class70 field2234 = new class70();

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lc;")
    private class70 field2239 = new class70();

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Lra;")
    private class41 field2243 = new class41(4);

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "B")
    private byte field2248 = 0;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public volatile int field2249 = 0;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public volatile int field2247 = 0;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "Lra;")
    private class41 field2250 = new class41(8);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    private int field2240;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "J")
    private long field2245;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lng;")
    public static class138 field2223;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "Lbe;")
    private class19 field2251;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Lhj;")
    private class243 field2244;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "[[[B")
    public static byte[][][] field2242;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I", line = 4)
    public final int method866(int arg0) {
        if (arg0 != -18653) {
            this.method873((byte) 13);
        }
        field2235++;
        return this.field2229.method535(0) + this.field2230.method535(0);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I", line = 16)
    private final int method867(int arg0) {
        field2222++;
        int var2 = -85 % ((-arg0 - 80) / 41);
        return this.field2234.method535(0) + this.field2239.method535(0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V", line = 26)
    public final void method868(int arg0, boolean arg1) {
        field2225++;
        if (this.field2244 == null) {
            return;
        }
        try {
            this.field2243.field738 = 0;
            this.field2243.method308(arg1 ? 2 : 3, -2);
            this.field2243.method307(-105, 0);
            this.field2244.method1636((byte) 20, 0, this.field2243.field772, 4);
        } catch (IOException var7) {
            try {
                this.field2244.method1627(110);
            } catch (Exception var6) {
            }
            this.field2247 = -2;
            this.field2249++;
            this.field2244 = null;
        }
        int var5 = -6 % ((22 - arg0) / 47);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 53)
    public static void method869(byte arg0) {
        field2242 = (byte[][][]) null;
        int var1 = 6 % ((35 - arg0) / 44);
        field2223 = null;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Z", line = 64)
    public final boolean method870(int arg0) {
        int var2 = 72 / ((arg0 - 45) / 50);
        field2241++;
        return this.method867(-121) >= 20;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V", line = 77)
    public final void method871(int arg0) {
        field2228++;
        if (this.field2244 == null) {
            return;
        }
        try {
            this.field2243.field738 = 0;
            this.field2243.method308(7, arg0 ^ 0x0);
            this.field2243.method307(-124, 0);
            if (arg0 != -2) {
                return;
            }
            this.field2244.method1636((byte) 20, 0, this.field2243.field772, 4);
        } catch (IOException var5) {
            try {
                this.field2244.method1627(110);
            } catch (Exception var4) {
            }
            this.field2247 = -2;
            this.field2249++;
            this.field2244 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIILmc;IZJ)Z", line = 104)
    public static final boolean method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class51 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class222.field3884 == class118.field2090;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class129.field2264 || var16 >= class57.field1051) {
                    return false;
                }
                class271 var17 = class41.field790[arg0][var15][var16];
                if (var17 != null && var17.field4641 >= 5) {
                    return false;
                }
            }
        }
        class269 var18 = new class269();
        var18.field4601 = arg11;
        var18.field4581 = arg0;
        var18.field4592 = arg5;
        var18.field4591 = arg6;
        var18.field4593 = arg7;
        var18.field4590 = arg8;
        var18.field4600 = arg9;
        var18.field4594 = arg1;
        var18.field4587 = arg2;
        var18.field4597 = arg1 + arg3 - 1;
        var18.field4599 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class41.field790[var22][var19][var20] == null) {
                        class41.field790[var22][var19][var20] = new class271(var22, var19, var20);
                    }
                }
                class271 var23 = class41.field790[arg0][var19][var20];
                var23.field4624[var23.field4641] = var18;
                var23.field4627[var23.field4641] = var21;
                var23.field4634 |= var21;
                var23.field4641++;
                if (var13 && class11.field167[var19][var20] != 0) {
                    var14 = class11.field167[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class11.field167[var24][var25] == 0) {
                        class11.field167[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class174.field3091[class243.field4127++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z", line = 223)
    public final boolean method873(byte arg0) {
        if (this.field2244 != null) {
            long var2 = class224.method1536(false);
            int var4 = (int) (var2 - this.field2245);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2245 = var2;
            this.field2240 += var4;
            if (this.field2240 > 30000) {
                try {
                    this.field2244.method1627(113);
                } catch (Exception var30) {
                }
                this.field2244 = null;
            }
        }
        field2246++;
        if (this.field2244 == null) {
            return this.method866(-18653) == 0 && this.method867(-122) == 0;
        }
        try {
            this.field2244.method1637(false);
            if (arg0 < 97) {
                this.field2244 = (class243) null;
            }
            for (class19 var6 = (class19) this.field2229.method534(109); var6 != null; var6 = (class19) this.field2229.method536((byte) -94)) {
                this.field2243.field738 = 0;
                this.field2243.method308(1, -2);
                this.field2243.method307(68, (int) var6.field539);
                this.field2244.method1636((byte) 20, 0, this.field2243.field772, 4);
                this.field2230.method537(var6, -1);
            }
            for (class19 var7 = (class19) this.field2234.method534(108); var7 != null; var7 = (class19) this.field2234.method536((byte) -28)) {
                this.field2243.field738 = 0;
                this.field2243.method308(0, -2);
                this.field2243.method307(49, (int) var7.field539);
                this.field2244.method1636((byte) 20, 0, this.field2243.field772, 4);
                this.field2239.method537(var7, -1);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field2244.method1633((byte) -5);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field2240 = 0;
                byte var10 = 0;
                if (this.field2251 == null) {
                    var10 = 8;
                } else if (this.field2251.field256 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field2251.field259.field772.length - this.field2251.field254;
                    int var12 = 512 - this.field2251.field256;
                    if (var12 > var11 - this.field2251.field259.field738) {
                        var12 = var11 - this.field2251.field259.field738;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field2244.method1635(this.field2251.field259.field738, this.field2251.field259.field772, var12, -1078);
                    if (this.field2248 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field2251.field259.field772[this.field2251.field259.field738 + var13] = (byte) class288.method2011(this.field2251.field259.field772[this.field2251.field259.field738 + var13], this.field2248);
                        }
                    }
                    this.field2251.field256 += var12;
                    this.field2251.field259.field738 += var12;
                    if (this.field2251.field259.field738 == var11) {
                        this.field2251.method235(97);
                        this.field2251.field5342 = false;
                        this.field2251 = null;
                    } else if (this.field2251.field256 == 512) {
                        this.field2251.field256 = 0;
                    }
                } else {
                    int var14 = var10 - this.field2250.field738;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field2244.method1635(this.field2250.field738, this.field2250.field772, var14, -1078);
                    if (this.field2248 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field2250.field772[this.field2250.field738 + var15] = (byte) class288.method2011(this.field2250.field772[this.field2250.field738 + var15], this.field2248);
                        }
                    }
                    this.field2250.field738 += var14;
                    if (this.field2250.field738 >= var10) {
                        if (this.field2251 == null) {
                            this.field2250.field738 = 0;
                            int var16 = this.field2250.method357(false);
                            int var17 = this.field2250.method346(-16);
                            long var18 = (long) ((var16 << 16) + var17);
                            int var20 = this.field2250.method357(false);
                            boolean var21 = (var20 & 0x80) != 0;
                            int var22 = this.field2250.method327(4);
                            int var23 = var20 & 0x7F;
                            Object var24 = null;
                            class19 var25;
                            if (var21) {
                                for (var25 = (class19) this.field2239.method534(95); var25 != null && var25.field539 != var18; var25 = (class19) this.field2239.method536((byte) -41)) {
                                }
                            } else {
                                for (var25 = (class19) this.field2230.method534(96); var25 != null && var25.field539 != var18; var25 = (class19) this.field2230.method536((byte) -128)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field2251 = var25;
                            int var26 = var23 == 0 ? 5 : 9;
                            this.field2251.field259 = new class41(this.field2251.field254 + var26 + var22);
                            this.field2251.field259.method308(var23, -2);
                            this.field2251.field259.method365((byte) -32, var22);
                            this.field2251.field256 = 8;
                            this.field2250.field738 = 0;
                        } else if (this.field2251.field256 != 0) {
                            throw new IOException();
                        } else if (this.field2250.field772[0] == -1) {
                            this.field2251.field256 = 1;
                            this.field2250.field738 = 0;
                        } else {
                            this.field2251 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field2244.method1627(124);
            } catch (Exception var29) {
            }
            this.field2244 = null;
            this.field2249++;
            this.field2247 = -2;
            return this.method866(-18653) == 0 && this.method867(-128) == 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V", line = 505)
    private final void method874(byte arg0) {
        field2237++;
        if (this.field2244 == null) {
            return;
        }
        try {
            this.field2243.field738 = 0;
            this.field2243.method308(6, -2);
            this.field2243.method307(-115, 3);
            if (arg0 <= 63) {
                return;
            }
            this.field2244.method1636((byte) 20, 0, this.field2243.field772, 4);
        } catch (IOException var5) {
            try {
                this.field2244.method1627(118);
            } catch (Exception var4) {
            }
            this.field2247 = -2;
            this.field2244 = null;
            this.field2249++;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lhj;ZB)V", line = 532)
    public final void method875(class243 arg0, boolean arg1, byte arg2) {
        if (arg2 < 69) {
            this.method877((byte) -64);
        }
        if (this.field2244 != null) {
            try {
                this.field2244.method1627(117);
            } catch (Exception var11) {
            }
            this.field2244 = null;
        }
        this.field2244 = arg0;
        this.method874((byte) 79);
        field2236++;
        this.method868(124, arg1);
        this.field2250.field738 = 0;
        this.field2251 = null;
        while (true) {
            class19 var5 = (class19) this.field2230.method538(96);
            if (var5 == null) {
                while (true) {
                    class19 var6 = (class19) this.field2239.method538(106);
                    if (var6 == null) {
                        if (this.field2248 != 0) {
                            try {
                                this.field2243.field738 = 0;
                                this.field2243.method308(4, -2);
                                this.field2243.method308(this.field2248, -2);
                                this.field2243.method366(0, -120);
                                this.field2244.method1636((byte) 20, 0, this.field2243.field772, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field2244.method1627(84);
                                } catch (Exception var9) {
                                }
                                this.field2244 = null;
                                this.field2249++;
                                this.field2247 = -2;
                            }
                        }
                        this.field2240 = 0;
                        this.field2245 = class224.method1536(false);
                        return;
                    }
                    this.field2234.method537(var6, -1);
                }
            }
            this.field2229.method537(var5, -1);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BZZII)Lbe;", line = 614)
    public final class19 method876(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            return (class19) null;
        }
        field2233++;
        long var6 = (long) ((arg3 << 16) + arg4);
        class19 var8 = new class19();
        var8.field539 = var6;
        var8.field5344 = arg1;
        var8.field254 = arg0;
        if (arg1) {
            if (this.method866(-18653) >= 20) {
                throw new RuntimeException();
            }
            this.field2229.method537(var8, -1);
        } else if (this.method867(76) < 20) {
            this.field2234.method537(var8, -1);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)Z", line = 663)
    public final boolean method877(byte arg0) {
        if (arg0 == -54) {
            field2232++;
            return this.method866(-18653) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V", line = 676)
    public final void method878(int arg0) {
        try {
            this.field2244.method1627(109);
        } catch (Exception var4) {
        }
        this.field2248 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2247 = -1;
        this.field2249++;
        this.field2244 = null;
        field2238++;
        int var3 = 37 / ((-arg0 - 50) / 40);
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V", line = 700)
    public final void method879(int arg0) {
        if (arg0 >= -119) {
            this.field2250 = (class41) null;
        }
        if (this.field2244 != null) {
            this.field2244.method1627(87);
        }
        field2227++;
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)V", line = 714)
    public final void method880(int arg0) {
        if (arg0 != -2112591184) {
            method869((byte) -18);
        }
        if (this.field2244 != null) {
            this.field2244.method1626(arg0 ^ 0x61C81371);
        }
        field2231++;
    }
}
