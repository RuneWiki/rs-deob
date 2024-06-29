import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class36 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Ldj;")
    public static class44 field638 = class89.method650(255, "scrollbar");

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Ldj;")
    public static class44 field639 = class89.method650(255, "Konfig geladen)3");

    @OriginalMember(owner = "client!db", name = "q", descriptor = "D")
    public static double field649 = -1.0D;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "J")
    private long field635;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "J")
    private long field648;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Laj;")
    public static class11 field634;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lve;")
    public static class225 field652;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Z")
    public boolean field642;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    private int[] field636;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[I")
    private int[] field653;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[Lle;")
    public static class125[] field650;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B[I[IZI)V")
    public final void method244(byte arg0, int[] arg1, int[] arg2, boolean arg3, int arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class62.field1162; var7++) {
                    class131 var8 = class24.method175(119, var7);
                    if (var8 != null && !var8.field2342 && (arg3 ? 7 : 0) + var6 == var8.field2347) {
                        arg1[class201.field3571[var6]] = class238.method1545(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field651 = arg4;
        this.field642 = arg3;
        this.field653 = arg2;
        this.field636 = arg1;
        this.method254(-107);
        field646++;
        if (arg0 < 123) {
            this.field635 = -52L;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIB)V")
    public final void method245(int arg0, int arg1, byte arg2) {
        int var4 = class201.field3571[arg1];
        field640++;
        int var5 = -73 % ((arg2 + 5) / 49);
        if (this.field636[var4] != 0 && class24.method175(82, arg0) != null) {
            this.field636[var4] = class238.method1545(arg0, Integer.MIN_VALUE);
            this.method254(-127);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILtd;ILtd;B)Llg;")
    public final class127 method246(int arg0, class204 arg1, int arg2, class204 arg3, byte arg4) {
        field645++;
        if (this.field651 != -1) {
            return class154.method996(this.field651, (byte) -76).method1308(-1, arg2, arg3, arg0, arg1);
        }
        if (arg4 > -15) {
            this.field648 = -89L;
        }
        long var6 = this.field648;
        int[] var8 = this.field636;
        if (arg3 != null && (arg3.field3652 >= 0 || arg3.field3655 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field636[var9];
            }
            if (arg3.field3652 >= 0) {
                if (arg3.field3652 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class238.method1545(1073741824, arg3.field3652);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field3655 >= 0) {
                if (arg3.field3655 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class238.method1545(arg3.field3655, 1073741824);
                    var6 ^= var8[3];
                }
            }
        }
        class127 var10 = (class127) class215.field3909.method677(1000, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var21) != 0 && !class24.method175(125, var21 & 0x3FFFFFFF).method892(11538)) {
                        var11 = true;
                    }
                } else if (!class192.method1227(-31700, var21 & 0x3FFFFFFF).method1385(this.field642, 1000)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field635 != -1L) {
                    var10 = (class127) class215.field3909.method677(1000, this.field635);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class195[] var13 = new class195[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class195 var20 = class192.method1227(-31700, var18 & 0x3FFFFFFF).method1380(0, this.field642);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    } else if ((Integer.MIN_VALUE & var18) != 0) {
                        class195 var19 = class24.method175(95, var18 & 0x3FFFFFFF).method891(127);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                class195 var16 = new class195(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field653[var17] < class162.field2802[var17].length) {
                        var16.method1249(class140.field2519[var17], class162.field2802[var17][this.field653[var17]]);
                    }
                    if (class231.field4328[var17].length > this.field653[var17]) {
                        var16.method1249(class10.field208[var17], class231.field4328[var17][this.field653[var17]]);
                    }
                }
                var10 = var16.method1257(64, 850, -30, -50, -30);
                class215.field3909.method675(var10, var6, -32074);
                this.field635 = var6;
            }
        }
        if (arg3 == null && arg1 == null) {
            return var10;
        }
        class127 var22;
        if (arg3 != null && arg1 != null) {
            var22 = arg3.method1320(var10, arg0, 65535, arg1, arg2);
        } else if (arg3 == null) {
            var22 = arg1.method1318(arg2, -25768, var10);
        } else {
            var22 = arg3.method1318(arg0, -25768, var10);
        }
        return var22;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Lhe;")
    public static final class82 method247(int arg0, int arg1) {
        field654++;
        if (arg1 == 0) {
            return new class193();
        } else if (arg1 == 1) {
            return new class32();
        } else if (arg1 == 2) {
            return new class41();
        } else if (arg1 == 3) {
            return new class163();
        } else if (arg1 == 4) {
            return new class156();
        } else if (arg1 == 5) {
            return new class20();
        } else if (arg1 == 6) {
            return new class89();
        } else if (arg1 == 7) {
            return new class145();
        } else if (arg1 == 8) {
            return new class61();
        } else if (arg1 == 9) {
            return new class37();
        } else if (arg1 == 10) {
            return new class227();
        } else if (arg1 == 11) {
            return new class196();
        } else if (arg1 == 12) {
            return new class102();
        } else if (arg1 == 13) {
            return new class116();
        } else if (arg1 == 14) {
            return new class171();
        } else if (arg1 == 15) {
            return new class115();
        } else if (arg1 == 16) {
            return new class199();
        } else if (arg1 == 17) {
            return new class80();
        } else if (arg1 == 18) {
            return new class175();
        } else if (arg1 == 19) {
            return new class226();
        } else if (arg1 == 20) {
            return new class22();
        } else if (arg1 == 21) {
            return new class1();
        } else if (arg1 == 22) {
            return new class157();
        } else if (arg1 == 23) {
            return new class118();
        } else if (arg1 == 24) {
            return new class216();
        } else if (arg1 == 25) {
            return new class205();
        } else if (arg1 == 26) {
            return new class71();
        } else if (arg1 == 27) {
            return new class230();
        } else if (arg1 == 28) {
            return new class165();
        } else if (arg1 == 29) {
            return new class239();
        } else if (arg1 == 30) {
            return new class53();
        } else if (arg1 == 31) {
            return new class17();
        } else if (arg1 == 32) {
            return new class48();
        } else if (arg1 == 33) {
            return new class182();
        } else if (arg1 == 34) {
            return new class181();
        } else if (arg1 == 35) {
            return new class92();
        } else if (arg1 == 36) {
            return new class30();
        } else if (arg1 == 37) {
            return new class8();
        } else if (arg1 == 38) {
            return new class208();
        } else if (arg1 == 39) {
            return new class94();
        } else {
            if (arg0 != 24572) {
                field650 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILtd;B)Llg;")
    public final class127 method248(int arg0, class204 arg1, byte arg2) {
        field637++;
        if (this.field651 != -1) {
            return class154.method996(this.field651, (byte) -86).method1300(arg0, (byte) -40, arg1);
        }
        if (arg2 != 36) {
            this.method245(29, -74, (byte) -106);
        }
        class127 var4 = (class127) class169.field2914.method677(1000, this.field648);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field636[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class24.method175(96, var15 & 0x3FFFFFFF).method887(-14437)) {
                        var5 = true;
                    }
                } else if (!class192.method1227(arg2 ^ 0xFFFF8408, var15 & 0x3FFFFFFF).method1393(-1, this.field642)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class195[] var7 = new class195[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field636[var9];
                if ((var12 & 0x40000000) != 0) {
                    class195 var14 = class192.method1227(-31700, var12 & 0x3FFFFFFF).method1389(23634, this.field642);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class195 var13 = class24.method175(arg2 + 90, var12 & 0x3FFFFFFF).method893(24238);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
            }
            class195 var10 = new class195(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field653[var11] < class162.field2802[var11].length) {
                    var10.method1249(class140.field2519[var11], class162.field2802[var11][this.field653[var11]]);
                }
                if (this.field653[var11] < class231.field4328[var11].length) {
                    var10.method1249(class10.field208[var11], class231.field4328[var11][this.field653[var11]]);
                }
            }
            var4 = var10.method1257(64, 768, -50, -10, -50);
            class169.field2914.method675(var4, this.field648, -32074);
        }
        if (arg1 != null) {
            var4 = arg1.method1325(arg0, 0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I")
    public final int method249(byte arg0) {
        field633++;
        if (arg0 != 28) {
            field649 = 1.0606086622855715D;
        }
        return this.field651 == -1 ? (this.field653[0] << 25) + (this.field636[8] << 10) + (this.field636[0] << 15) + (this.field653[4] << 20) + (this.field636[11] << 5) + this.field636[1] : class154.method996(this.field651, (byte) -91).field3584 + 305419896;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public static void method250(byte arg0) {
        field650 = null;
        field652 = null;
        field634 = null;
        field638 = null;
        field639 = null;
        if (arg0 != 90) {
            field639 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)V")
    public final void method251(boolean arg0, int arg1) {
        this.field642 = arg0;
        this.method254(-97);
        field641++;
        if (arg1 != -1001308768) {
            this.method254(-5);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
    public final void method252(int arg0, int arg1, int arg2) {
        field644++;
        this.field653[arg0] = arg2;
        if (arg1 != 265199749) {
            field649 = 1.0893316166357536D;
        }
        this.method254(83);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
    public static final void method253(int arg0, int arg1, int arg2, int arg3) {
        class68 var4 = class32.field567[arg0][arg1][arg2];
        if (var4 != null) {
            class32.field567[arg0][arg1][arg2].field1319 = arg3;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    private final void method254(int arg0) {
        field647++;
        long var2 = this.field648;
        long[] var4 = class19.field313;
        this.field648 = -1L;
        int var5 = -84 / ((arg0 + 26) / 58);
        for (int var6 = 0; var6 < 12; var6++) {
            this.field648 = var4[(int) (((long) (this.field636[var6] >> 24) ^ this.field648) & 0xFFL)] ^ this.field648 >>> 8;
            this.field648 = var4[(int) (((long) (this.field636[var6] >> 16) ^ this.field648) & 0xFFL)] ^ this.field648 >>> 8;
            this.field648 = var4[(int) (((long) (this.field636[var6] >> 8) ^ this.field648) & 0xFFL)] ^ this.field648 >>> 8;
            this.field648 = this.field648 >>> 8 ^ var4[(int) ((this.field648 ^ (long) this.field636[var6]) & 0xFFL)];
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field648 = this.field648 >>> 8 ^ var4[(int) (((long) this.field653[var7] ^ this.field648) & 0xFFL)];
        }
        this.field648 = var4[(int) (((long) (this.field642 ? 1 : 0) ^ this.field648) & 0xFFL)] ^ this.field648 >>> 8;
        if (var2 != 0L && this.field648 != var2) {
            class215.field3909.method673(1000, var2);
        }
    }
}
