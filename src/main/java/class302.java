import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class302 extends class79 {

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    private int field5222 = 0;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Lrj;")
    private class254 field5223 = new class254(16);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
    private int field5226 = 0;

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "Lij;")
    private class175 field5228 = new class175();

    @OriginalMember(owner = "client!oa", name = "eb", descriptor = "J")
    private long field5233 = 0L;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Ltj;")
    private class75 field5191;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    private int field5210;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "Z")
    private boolean field5225;

    @OriginalMember(owner = "client!oa", name = "ab", descriptor = "Lij;")
    private class175 field5229;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    private int field5217;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Lae;")
    private class100 field5211;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    private int field5192;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Ltj;")
    private class75 field5204;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Lce;")
    private class126 field5208;

    @OriginalMember(owner = "client!oa", name = "db", descriptor = "Z")
    private boolean field5232;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "Lrl;")
    private class310 field5216;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Lke;")
    public static class256 field5215 = class316.method2202("Librairie 3D d-Bmarr-Be", 27626);

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "[Z")
    public static boolean[] field5220 = new boolean[100];

    @OriginalMember(owner = "client!oa", name = "bb", descriptor = "Z")
    public static boolean field5230 = false;

    @OriginalMember(owner = "client!oa", name = "cb", descriptor = "Z")
    public static boolean field5231 = false;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "J")
    public static long field5194;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Luh;")
    private class65 field5212;

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "Z")
    private boolean field5227;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[B")
    private byte[] field5200;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "[I")
    public static int[] field5201;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[Lob;")
    public static class317[] field5198;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V", line = 14)
    public final void method2106(byte arg0) {
        field5203++;
        if (this.field5191 == null) {
            return;
        }
        this.field5227 = true;
        if (arg0 < 104) {
            this.field5192 = -59;
        }
        if (this.field5229 == null) {
            this.field5229 = new class175();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)Lrl;", line = 32)
    private final class310 method2107(byte arg0, int arg1, int arg2) {
        field5195++;
        class310 var4 = (class310) this.field5223.method1744((byte) 123, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field5344 && var4.field5342) {
            var4.method1199(21966);
            var4 = null;
        }
        int var5 = 83 % ((arg0 - 44) / 32);
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field5191 == null || this.field5200[arg2] == -1) {
                    if (this.field5208.method877((byte) -54)) {
                        return null;
                    }
                    var4 = this.field5208.method876((byte) 2, true, true, this.field5210, arg2);
                } else {
                    var4 = this.field5211.method717(this.field5191, true, arg2);
                }
            } else if (arg1 == 1) {
                if (this.field5191 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5211.method718(this.field5191, (byte) -126, arg2);
            } else if (arg1 == 2) {
                if (this.field5191 == null) {
                    throw new RuntimeException();
                }
                if (this.field5200[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5208.method870(-95)) {
                    return null;
                }
                var4 = this.field5208.method876((byte) 2, false, true, this.field5210, arg2);
            } else {
                throw new RuntimeException();
            }
            this.field5223.method1749(true, var4, (long) arg2);
        }
        if (var4.field5342) {
            return null;
        }
        byte[] var6 = var4.method117(true);
        if (!var4 instanceof class54) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class48.field865.reset();
                class48.field865.update(var6, 0, var6.length - 2);
                int var11 = (int) class48.field865.getValue();
                if (this.field5212.field1155[arg2] != var11) {
                    throw new RuntimeException();
                }
                this.field5208.field2249 = 0;
                this.field5208.field2247 = 0;
            } catch (RuntimeException var15) {
                this.field5208.method878(86);
                var4.method1199(21966);
                if (var4.field5344 && !this.field5208.method877((byte) -54)) {
                    class19 var13 = this.field5208.method876((byte) 2, true, true, this.field5210, arg2);
                    this.field5223.method1749(true, var13, (long) arg2);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field5212.field1164[arg2] >>> 8);
            var6[var6.length - 1] = (byte) this.field5212.field1164[arg2];
            if (this.field5191 != null) {
                this.field5211.method722(-57, this.field5191, var6, arg2);
                if (this.field5200[arg2] != 1) {
                    this.field5222++;
                    this.field5200[arg2] = 1;
                }
            }
            if (!var4.field5344) {
                var4.method1199(21966);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class48.field865.reset();
            class48.field865.update(var6, 0, var6.length - 2);
            int var7 = (int) class48.field865.getValue();
            if (this.field5212.field1155[arg2] != var7) {
                throw new RuntimeException();
            }
            int var8 = ((var6[var6.length - 2] & 0xFF) << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field5212.field1164[arg2] & 0xFFFF) != var8) {
                throw new RuntimeException();
            }
            if (this.field5200[arg2] != 1) {
                if (this.field5200[arg2] == 0) {
                }
                this.field5222++;
                this.field5200[arg2] = 1;
            }
            if (!var4.field5344) {
                var4.method1199(21966);
            }
            return var4;
        } catch (Exception var14) {
            this.field5200[arg2] = -1;
            var4.method1199(21966);
            if (var4.field5344 && !this.field5208.method877((byte) -54)) {
                class19 var10 = this.field5208.method876((byte) 2, true, true, this.field5210, arg2);
                this.field5223.method1749(true, var10, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 252)
    public static final void method2108(int arg0) {
        class104.field1850++;
        field5219++;
        class308.field5322.method1599(157, (byte) 118);
        class308.field5322.method330(255, (long) arg0);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(BI)V", line = 269)
    public final void method596(byte arg0, int arg1) {
        field5205++;
        if (arg0 > -62) {
            this.method592((byte) 89, 88);
        }
        if (this.field5191 == null) {
            return;
        }
        for (class163 var3 = this.field5228.method1270((byte) -121); var3 != null; var3 = this.field5228.method1277(1)) {
            if ((long) arg1 == var3.field2895) {
                return;
            }
        }
        class163 var4 = new class163();
        var4.field2895 = (long) arg1;
        this.field5228.method1269(false, var4);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V", line = 310)
    public final void method2109(byte arg0) {
        field5209++;
        if (arg0 != 8) {
            this.method2115(-110);
        }
        if (this.field5229 == null || this.method594((byte) 122) == null) {
            return;
        }
        for (class163 var2 = this.field5228.method1270((byte) -121); var2 != null; var2 = this.field5228.method1277(arg0 - 7)) {
            int var3 = (int) var2.field2895;
            if (var3 < 0 || this.field5212.field1148 <= var3 || this.field5212.field1152[var3] == 0) {
                var2.method1199(21966);
            } else {
                if (this.field5200[var3] == 0) {
                    this.method2107((byte) 7, 1, var3);
                }
                if (this.field5200[var3] == -1) {
                    this.method2107((byte) -14, 2, var3);
                }
                if (this.field5200[var3] == 1) {
                    var2.method1199(21966);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V", line = 356)
    public static final void method2110(int arg0) {
        field5218++;
        if (class213.field3816 < class45.field843) {
            class213.field3816 = (float) ((double) class213.field3816 / 30.0D + (double) class213.field3816);
            if (class213.field3816 > class45.field843) {
                class213.field3816 = class45.field843;
            }
            class297.method2083(false);
        } else if (class45.field843 < class213.field3816) {
            class213.field3816 = (float) ((double) class213.field3816 - (double) class213.field3816 / 30.0D);
            if (class45.field843 > class213.field3816) {
                class213.field3816 = class45.field843;
            }
            class297.method2083(false);
        }
        if (arg0 != -1 || class185.field3257 == -1 || class91.field1665 == -1) {
            return;
        }
        int var1 = class91.field1665 - class271.field4645;
        int var2 = class185.field3257 - class311.field5360;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class271.field4645 -= -var1;
        if (var2 == 0 && var1 == 0) {
            class185.field3257 = -1;
            class91.field1665 = -1;
        }
        class311.field5360 += var2;
        class297.method2083(false);
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)I", line = 412)
    public final int method2111(int arg0) {
        field5193++;
        if (this.field5212 == null) {
            return 0;
        } else if (arg0 == 0) {
            return this.field5212.field1145;
        } else {
            return -93;
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)I", line = 435)
    public final int method2112(int arg0) {
        field5213++;
        int var2 = -108 / ((86 - arg0) / 39);
        return this.field5222;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)[B", line = 445)
    public final byte[] method592(byte arg0, int arg1) {
        if (arg0 <= 91) {
            this.field5211 = (class100) null;
        }
        class310 var3 = this.method2107((byte) -79, 0, arg1);
        field5207++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method117(true);
            var3.method1199(21966);
            return var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)Ljb;", line = 471)
    public static final class203 method2113(boolean arg0, int arg1) {
        field5197++;
        class203 var2 = (class203) class215.field3834.method2077(-13408, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class99.field1762.method1016(class261.method1835(arg0, arg1), 100, class225.method1537(arg1, false));
        class203 var4 = new class203();
        var4.field3683 = arg1;
        if (var3 != null) {
            var4.method1441(new class41(var3), 0);
        }
        class215.field3834.method2074(var4, (long) arg1, -1);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)I", line = 496)
    public final int method2114(int arg0) {
        if (arg0 != -17707) {
            return -97;
        }
        field5196++;
        if (this.method594((byte) 85) == null) {
            return this.field5216 == null ? 0 : this.field5216.method118(-76);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(ILtj;Ltj;Lce;Lae;IIZ)V", line = 986)
    public class302(int arg0, class75 arg1, class75 arg2, class126 arg3, class100 arg4, int arg5, int arg6, boolean arg7) {
        this.field5191 = arg1;
        this.field5210 = arg0;
        if (this.field5191 == null) {
            this.field5225 = false;
        } else {
            this.field5225 = true;
            this.field5229 = new class175();
        }
        this.field5217 = arg6;
        this.field5211 = arg4;
        this.field5192 = arg5;
        this.field5204 = arg2;
        this.field5208 = arg3;
        this.field5232 = arg7;
        if (this.field5204 != null) {
            this.field5216 = this.field5211.method717(this.field5204, true, this.field5210);
        }
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 527)
    public final void method2115(int arg0) {
        field5214++;
        if (arg0 != 1886) {
            return;
        }
        if (this.field5229 != null) {
            if (this.method594((byte) 90) == null) {
                return;
            }
            if (this.field5225) {
                boolean var6 = true;
                for (class163 var7 = this.field5229.method1270((byte) -121); var7 != null; var7 = this.field5229.method1277(arg0 - 1885)) {
                    int var8 = (int) var7.field2895;
                    if (this.field5200[var8] == 0) {
                        this.method2107((byte) -87, 1, var8);
                    }
                    if (this.field5200[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method1199(21966);
                    }
                }
                while (this.field5226 < this.field5212.field1152.length) {
                    if (this.field5212.field1152[this.field5226] == 0) {
                        this.field5226++;
                    } else {
                        if (this.field5211.field1792 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field5200[this.field5226] == 0) {
                            this.method2107((byte) 85, 1, this.field5226);
                        }
                        if (this.field5200[this.field5226] == 0) {
                            class163 var9 = new class163();
                            var9.field2895 = (long) this.field5226;
                            this.field5229.method1269(false, var9);
                            var6 = false;
                        }
                        this.field5226++;
                    }
                }
                if (var6) {
                    this.field5226 = 0;
                    this.field5225 = false;
                }
            } else if (this.field5227) {
                boolean var2 = true;
                for (class163 var3 = this.field5229.method1270((byte) -121); var3 != null; var3 = this.field5229.method1277(1)) {
                    int var4 = (int) var3.field2895;
                    if (this.field5200[var4] != 1) {
                        this.method2107((byte) -25, 2, var4);
                    }
                    if (this.field5200[var4] == 1) {
                        var3.method1199(21966);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field5212.field1152.length > this.field5226) {
                    if (this.field5212.field1152[this.field5226] == 0) {
                        this.field5226++;
                    } else {
                        if (this.field5208.method870(-59)) {
                            var2 = false;
                            break;
                        }
                        if (this.field5200[this.field5226] != 1) {
                            this.method2107((byte) -5, 2, this.field5226);
                        }
                        if (this.field5200[this.field5226] != 1) {
                            var2 = false;
                            class163 var5 = new class163();
                            var5.field2895 = (long) this.field5226;
                            this.field5229.method1269(false, var5);
                        }
                        this.field5226++;
                    }
                }
                if (var2) {
                    this.field5227 = false;
                    this.field5226 = 0;
                }
            } else {
                this.field5229 = null;
            }
        }
        if (!this.field5232 || class224.method1536(false) < this.field5233) {
            return;
        }
        for (class310 var10 = (class310) this.field5223.method1743(true); var10 != null; var10 = (class310) this.field5223.method1742((byte) 80)) {
            if (!var10.field5342) {
                if (var10.field5341) {
                    if (!var10.field5344) {
                        throw new RuntimeException();
                    }
                    var10.method1199(21966);
                } else {
                    var10.field5341 = true;
                }
            }
        }
        this.field5233 = class224.method1536(false) + 1000L;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLel;)V", line = 710)
    public static final void method2116(byte arg0, class232 arg1) {
        field5202++;
        short var2 = 256;
        for (int var3 = 0; var3 < class83.field1513.length; var3++) {
            class83.field1513[var3] = 0;
        }
        int var4 = 0;
        if (arg0 != 56) {
            return;
        }
        while (var4 < 5000) {
            int var5 = (int) ((double) var2 * Math.random() * 128.0D);
            class83.field1513[var5] = (int) (Math.random() * 284.0D);
            var4++;
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var2 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class250.field4240[var9] = (class83.field1513[var9 - 1] + class83.field1513[var9 + 128] + class83.field1513[var9 + 1] + class83.field1513[var9 + -128]) / 4;
                }
            }
            int[] var10 = class83.field1513;
            class83.field1513 = class250.field4240;
            class250.field4240 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field5009; var12++) {
            for (int var13 = 0; var13 < arg1.field5015; var13++) {
                if (arg1.field3980[var11++] != 0) {
                    int var14 = arg1.field5014 + var12 + 16;
                    int var15 = var13 + arg1.field5026 + 16;
                    int var16 = (var14 << 7) + var15;
                    class83.field1513[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)I", line = 808)
    public final int method597(int arg0, byte arg1) {
        field5224++;
        class310 var3 = (class310) this.field5223.method1744((byte) 124, (long) arg0);
        if (var3 == null) {
            return arg1 == -112 ? 0 : 27;
        } else {
            return var3.method118(arg1 ^ 0x13);
        }
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)I", line = 827)
    public final int method2117(int arg0) {
        field5199++;
        if (arg0 != 255) {
            this.field5200 = (byte[]) null;
        }
        if (this.field5212 == null) {
            return 0;
        } else if (this.field5225) {
            class163 var2 = this.field5229.method1270((byte) -121);
            return var2 == null ? 0 : (int) var2.field2895;
        } else {
            return this.field5212.field1145;
        }
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V", line = 851)
    public static void method2118(int arg0) {
        if (arg0 != -31801) {
            field5215 = (class256) null;
        }
        field5201 = null;
        field5198 = null;
        field5220 = null;
        field5215 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)Luh;", line = 868)
    public final class65 method594(byte arg0) {
        field5221++;
        if (this.field5212 != null) {
            return this.field5212;
        }
        if (this.field5216 == null) {
            if (this.field5208.method877((byte) -54)) {
                return null;
            }
            this.field5216 = this.field5208.method876((byte) 0, true, true, 255, this.field5210);
        }
        if (arg0 < 60) {
            this.method2109((byte) 11);
        }
        if (this.field5216.field5342) {
            return null;
        }
        byte[] var2 = this.field5216.method117(true);
        if (this.field5216 instanceof class54) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5212 = new class65(var2, this.field5192);
                if (this.field5212.field1162 != this.field5217) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field5212 = null;
                if (this.field5208.method877((byte) -54)) {
                    this.field5216 = null;
                } else {
                    this.field5216 = this.field5208.method876((byte) 0, true, true, 255, this.field5210);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5212 = new class65(var2, this.field5192);
            } catch (RuntimeException var6) {
                this.field5208.method878(-125);
                this.field5212 = null;
                if (this.field5208.method877((byte) -54)) {
                    this.field5216 = null;
                } else {
                    this.field5216 = this.field5208.method876((byte) 0, true, true, 255, this.field5210);
                }
                return null;
            }
            if (this.field5204 != null) {
                this.field5211.method722(-64, this.field5204, var2, this.field5210);
            }
        }
        this.field5216 = null;
        if (this.field5191 != null) {
            this.field5222 = 0;
            this.field5200 = new byte[this.field5212.field1148];
        }
        return this.field5212;
    }
}
