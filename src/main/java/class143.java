import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class143 extends class141 {

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    private int field2218 = 0;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lll;")
    private class211 field2188 = new class211(16);

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    private int field2220 = 0;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "Lgb;")
    private class149 field2223 = new class149();

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "J")
    private long field2226 = 0L;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    private int field2215;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "Lpe;")
    private class252 field2203;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "Z")
    private boolean field2224;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "Lgb;")
    private class149 field2221;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    private int field2213;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "Lpe;")
    private class252 field2199;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    private int field2212;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "Lth;")
    private class112 field2210;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "Z")
    private boolean field2225;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Lui;")
    private class234 field2193;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "Lbj;")
    private class156 field2201;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "S")
    public static short field2202 = 1;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2208 = "Close";

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2207 = "purple:";

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field2197 = 0;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "[S")
    public static short[] field2206 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "Lvj;")
    private class116 field2214;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "Luf;")
    public static class176 field2217;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lud;")
    public static class2 field2189;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "Z")
    private boolean field2222;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "[B")
    private byte[] field2216;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg4;
            arg4 = var8;
        }
        field2195++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return arg1;
        } else {
            if (arg3 != -2115) {
                method983(-81, -32, 122, -102, 118, 119, 27);
            }
            return var7 == 2 ? 7 + 1 - arg2 - arg5 : -arg1 + 7 + -arg4 + 1;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)I")
    public final int method984(boolean arg0) {
        field2190++;
        if (this.field2214 == null) {
            return 0;
        } else {
            if (arg0) {
                this.method990(127);
            }
            return this.field2214.field1807;
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)I")
    public final int method985(int arg0) {
        if (arg0 == 2) {
            field2187++;
            return this.field2218;
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Lvj;")
    public final class116 method975(int arg0) {
        field2196++;
        if (arg0 >= -107) {
            return null;
        } else if (this.field2214 == null) {
            if (this.field2201 == null) {
                if (this.field2193.method1559((byte) -41)) {
                    return null;
                }
                this.field2201 = this.field2193.method1569(true, 255, (byte) 0, this.field2215, 20);
            }
            if (this.field2201.field2386) {
                return null;
            }
            byte[] var2 = this.field2201.method517(10933);
            if (this.field2201 instanceof class80) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field2214 = new class116(var2, this.field2213);
                    if (this.field2214.field1810 != this.field2212) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field2214 = null;
                    if (this.field2193.method1559((byte) -41)) {
                        this.field2201 = null;
                    } else {
                        this.field2201 = this.field2193.method1569(true, 255, (byte) 0, this.field2215, 20);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field2214 = new class116(var2, this.field2213);
                } catch (RuntimeException var4) {
                    this.field2193.method1565(1);
                    this.field2214 = null;
                    if (this.field2193.method1559((byte) -41)) {
                        this.field2201 = null;
                    } else {
                        this.field2201 = this.field2193.method1569(true, 255, (byte) 0, this.field2215, 20);
                    }
                    return null;
                }
                if (this.field2199 != null) {
                    this.field2210.method826(this.field2199, this.field2215, var2, 102);
                }
            }
            this.field2201 = null;
            if (this.field2203 != null) {
                this.field2216 = new byte[this.field2214.field1795];
                this.field2218 = 0;
            }
            return this.field2214;
        } else {
            return this.field2214;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lcd;I)V")
    public static final void method986(class28 arg0, int arg1) {
        field2194++;
        class144 var2 = (class144) class61.field981.method1414(true, class247.method1668(arg0.field446, true));
        if (var2 != null) {
            if (var2.field2233 != null) {
                class39.field661.method718(var2.field2233);
                var2.field2233 = null;
            }
            var2.method693(96);
        }
        if (arg1 != 0) {
            method983(-127, 102, -91, -66, -110, -94, 38);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method987(byte arg0) {
        field2189 = null;
        int var1 = 45 % ((-arg0 - 63) / 46);
        field2208 = null;
        field2217 = null;
        field2207 = null;
        field2206 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBI)Lbj;")
    private final class156 method988(int arg0, byte arg1, int arg2) {
        if (arg1 != -47) {
            this.field2222 = false;
        }
        class156 var4 = (class156) this.field2188.method1414(true, (long) arg2);
        if (var4 != null && arg0 == 0 && !var4.field2383 && var4.field2386) {
            var4.method693(arg1 + 133);
            var4 = null;
        }
        field2198++;
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field2203 == null || this.field2216[arg2] == -1) {
                    if (this.field2193.method1559((byte) -41)) {
                        return null;
                    }
                    var4 = this.field2193.method1569(true, this.field2215, (byte) 2, arg2, 20);
                } else {
                    var4 = this.field2210.method833(arg2, this.field2203, (byte) 116);
                }
            } else if (arg0 == 1) {
                if (this.field2203 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2210.method829(arg2, 3, this.field2203);
            } else if (arg0 == 2) {
                if (this.field2203 == null) {
                    throw new RuntimeException();
                }
                if (this.field2216[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2193.method1570((byte) -114)) {
                    return null;
                }
                var4 = this.field2193.method1569(false, this.field2215, (byte) 2, arg2, 20);
            } else {
                throw new RuntimeException();
            }
            this.field2188.method1409((long) arg2, 1, var4);
        }
        if (var4.field2386) {
            return null;
        }
        byte[] var5 = var4.method517(10933);
        if (!var4 instanceof class80) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class86.field1412.reset();
                class86.field1412.update(var5, 0, var5.length - 2);
                int var9 = (int) class86.field1412.getValue();
                if (this.field2214.field1809[arg2] != var9) {
                    throw new RuntimeException();
                }
                this.field2193.field3637 = 0;
                this.field2193.field3636 = 0;
            } catch (RuntimeException var12) {
                this.field2193.method1565(1);
                var4.method693(95);
                if (var4.field2383 && !this.field2193.method1559((byte) -41)) {
                    class65 var10 = this.field2193.method1569(true, this.field2215, (byte) 2, arg2, 20);
                    this.field2188.method1409((long) arg2, 1, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2214.field1800[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field2214.field1800[arg2];
            if (this.field2203 != null) {
                this.field2210.method826(this.field2203, arg2, var5, -85);
                if (this.field2216[arg2] != 1) {
                    this.field2218++;
                    this.field2216[arg2] = 1;
                }
            }
            if (!var4.field2383) {
                var4.method693(-122);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class86.field1412.reset();
            class86.field1412.update(var5, 0, var5.length - 2);
            int var6 = (int) class86.field1412.getValue();
            if (this.field2214.field1809[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2214.field1800[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field2216[arg2] != 1) {
                this.field2218++;
                this.field2216[arg2] = 1;
            }
            if (!var4.field2383) {
                var4.method693(80);
            }
            return var4;
        } catch (Exception var11) {
            this.field2216[arg2] = -1;
            var4.method693(-57);
            if (var4.field2383 && !this.field2193.method1559((byte) -41)) {
                class65 var8 = this.field2193.method1569(true, this.field2215, (byte) 2, arg2, arg1 ^ 0xFFFFFFC5);
                this.field2188.method1409((long) arg2, arg1 + 48, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)I")
    public final int method989(byte arg0) {
        if (arg0 != 2) {
            this.field2199 = null;
        }
        field2192++;
        if (this.field2214 == null) {
            return 0;
        } else if (this.field2224) {
            class86 var2 = this.field2221.method1010(arg0 ^ 0x6C);
            return var2 == null ? 0 : (int) var2.field1408;
        } else {
            return this.field2214.field1807;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)I")
    public final int method978(int arg0, int arg1) {
        class156 var3 = (class156) this.field2188.method1414(true, (long) arg1);
        field2204++;
        if (var3 == null) {
            if (arg0 != 9214) {
                method987((byte) -38);
            }
            return 0;
        } else {
            return var3.method515(true);
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)I")
    public final int method990(int arg0) {
        field2211++;
        if (this.method975(-111) == null) {
            return this.field2201 == null ? 0 : this.field2201.method515(true);
        } else if (arg0 >= -72) {
            return 26;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V")
    public final void method991(byte arg0) {
        field2209++;
        if (this.field2221 == null || arg0 != -69 || this.method975(-124) == null) {
            return;
        }
        for (class86 var2 = this.field2223.method1010(arg0 ^ 0xFFFFFFCD); var2 != null; var2 = this.field2223.method1008((byte) 88)) {
            int var3 = (int) var2.field1408;
            if (var3 < 0 || this.field2214.field1795 <= var3 || this.field2214.field1802[var3] == 0) {
                var2.method693(103);
            } else {
                if (this.field2216[var3] == 0) {
                    this.method988(1, (byte) -47, var3);
                }
                if (this.field2216[var3] == -1) {
                    this.method988(2, (byte) -47, var3);
                }
                if (this.field2216[var3] == 1) {
                    var2.method693(75);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)V")
    public final void method971(boolean arg0, int arg1) {
        field2205++;
        if (arg0) {
            this.method993((byte) -44);
        }
        if (this.field2203 == null) {
            return;
        }
        for (class86 var3 = this.field2223.method1010(114); var3 != null; var3 = this.field2223.method1008((byte) 88)) {
            if (((long) arg1) == var3.field1408) {
                return;
            }
        }
        class86 var4 = new class86();
        var4.field1408 = (long) arg1;
        this.field2223.method1013(312991604, var4);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)V")
    public final void method992(boolean arg0) {
        field2219++;
        if (this.field2203 == null) {
            return;
        }
        this.field2222 = true;
        if (arg0) {
            this.field2201 = null;
        }
        if (this.field2221 == null) {
            this.field2221 = new class149();
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)[B")
    public final byte[] method973(int arg0, byte arg1) {
        field2191++;
        int var3 = 44 % ((arg1 - 27) / 57);
        class156 var4 = this.method988(0, (byte) -47, arg0);
        if (var4 == null) {
            return null;
        } else {
            byte[] var5 = var4.method517(10933);
            var4.method693(-52);
            return var5;
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(B)V")
    public final void method993(byte arg0) {
        field2200++;
        if (this.field2221 != null) {
            if (this.method975(-114) == null) {
                return;
            }
            if (this.field2224) {
                boolean var2 = true;
                for (class86 var3 = this.field2221.method1010(118); var3 != null; var3 = this.field2221.method1008((byte) 88)) {
                    int var5 = (int) var3.field1408;
                    if (this.field2216[var5] == 0) {
                        this.method988(1, (byte) -47, var5);
                    }
                    if (this.field2216[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method693(105);
                    }
                }
                while (this.field2220 < this.field2214.field1802.length) {
                    if (this.field2214.field1802[this.field2220] == 0) {
                        this.field2220++;
                    } else {
                        if (this.field2210.field1774 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2216[this.field2220] == 0) {
                            this.method988(1, (byte) -47, this.field2220);
                        }
                        if (this.field2216[this.field2220] == 0) {
                            var2 = false;
                            class86 var4 = new class86();
                            var4.field1408 = (long) this.field2220;
                            this.field2221.method1013(312991604, var4);
                        }
                        this.field2220++;
                    }
                }
                if (var2) {
                    this.field2224 = false;
                    this.field2220 = 0;
                }
            } else if (this.field2222) {
                boolean var6 = true;
                for (class86 var7 = this.field2221.method1010(125); var7 != null; var7 = this.field2221.method1008((byte) 88)) {
                    int var9 = (int) var7.field1408;
                    if (this.field2216[var9] != 1) {
                        this.method988(2, (byte) -47, var9);
                    }
                    if (this.field2216[var9] == 1) {
                        var7.method693(-43);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2214.field1802.length > this.field2220) {
                    if (this.field2214.field1802[this.field2220] == 0) {
                        this.field2220++;
                    } else {
                        if (this.field2193.method1570((byte) -114)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2216[this.field2220] != 1) {
                            this.method988(2, (byte) -47, this.field2220);
                        }
                        if (this.field2216[this.field2220] != 1) {
                            var6 = false;
                            class86 var8 = new class86();
                            var8.field1408 = (long) this.field2220;
                            this.field2221.method1013(arg0 + 312991581, var8);
                        }
                        this.field2220++;
                    }
                }
                if (var6) {
                    this.field2222 = false;
                    this.field2220 = 0;
                }
            } else {
                this.field2221 = null;
            }
        }
        if (arg0 != 23 || !this.field2225 || class269.method1823(arg0 - 98) < this.field2226) {
            return;
        }
        for (class156 var10 = (class156) this.field2188.method1410(-124); var10 != null; var10 = (class156) this.field2188.method1413(-1)) {
            if (!var10.field2386) {
                if (var10.field2384) {
                    if (!var10.field2383) {
                        throw new RuntimeException();
                    }
                    var10.method693(-119);
                } else {
                    var10.field2384 = true;
                }
            }
        }
        this.field2226 = class269.method1823(arg0 ^ 0xFFFFFFCE) + 1000L;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(ILpe;Lpe;Lui;Lth;IIZ)V")
    public class143(int arg0, class252 arg1, class252 arg2, class234 arg3, class112 arg4, int arg5, int arg6, boolean arg7) {
        this.field2215 = arg0;
        this.field2203 = arg1;
        if (this.field2203 == null) {
            this.field2224 = false;
        } else {
            this.field2224 = true;
            this.field2221 = new class149();
        }
        this.field2213 = arg5;
        this.field2199 = arg2;
        this.field2212 = arg6;
        this.field2210 = arg4;
        this.field2225 = arg7;
        this.field2193 = arg3;
        if (this.field2199 != null) {
            this.field2201 = this.field2210.method833(this.field2215, this.field2199, (byte) 111);
        }
    }
}
