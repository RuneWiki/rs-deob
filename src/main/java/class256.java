import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class256 {

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field4531 = 0;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Z")
    public static boolean field4533 = false;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[Lli;")
    public static class185[] field4530 = new class185[1000];

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "Lli;")
    public static class185 field4544 = class245.method1649("RuneScape wird geladen )2 bitte warten)3)3)3", 125);

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Lli;")
    public static class185 field4546 = class245.method1649("Mem:", 124);

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field4551 = 0;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "Lli;")
    private static class185 field4554 = class245.method1649("Loading config )2 ", -65);

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Lli;")
    public static class185 field4535 = field4554;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lgf;")
    public static class7 field4528 = new class7(20);

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "Lli;")
    public static class185 field4557 = class245.method1649("Benutzeroberfl-=che geladen)3", 124);

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "Lli;")
    public static class185 field4556 = class245.method1649("Clientscript error )2 check log for details", -50);

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "Z")
    public static boolean field4560 = false;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public int field4547;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "J")
    private long field4537;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "J")
    private long field4539;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "Lhi;")
    public static class250 field4559;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "Lkc;")
    public static class29 field4555;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "Z")
    public boolean field4545;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[I")
    private int[] field4526;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
    private int[] field4532;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "[[B")
    public static byte[][] field4550;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static void method1731(byte arg0) {
        field4559 = null;
        field4557 = null;
        if (arg0 > -25) {
            return;
        }
        field4550 = null;
        field4535 = null;
        field4555 = null;
        field4554 = null;
        field4544 = null;
        field4546 = null;
        field4530 = null;
        field4556 = null;
        field4528 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public static final void method1732(byte arg0) {
        if (arg0 >= -46) {
            field4557 = null;
        }
        field4549++;
        if (class13.field234 != null && class96.field1804 != null) {
            return;
        }
        class96.field1804 = new int[256];
        class13.field234 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class13.field234[var1] = (int) (Math.sin(var2) * 4096.0D);
            class96.field1804[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)I")
    public final int method1733(int arg0) {
        field4527++;
        if (arg0 >= -94) {
            field4551 = -32;
        }
        return this.field4547 == -1 ? (this.field4526[0] << 15) + (this.field4526[11] << 5) + (this.field4526[8] << 10) + (this.field4532[4] << 20) + (this.field4532[0] << 25) + this.field4526[1] : class269.method1828(2, this.field4547).field1454 + 305419896;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lpa;ZLpa;IBI)Lic;")
    public final class98 method1734(class2 arg0, boolean arg1, class2 arg2, int arg3, byte arg4, int arg5) {
        field4552++;
        if (this.field4547 != -1) {
            return class269.method1828(2, this.field4547).method526(arg0, arg3, arg2, (byte) -83, arg5);
        }
        if (arg4 != -105) {
            this.method1744((int[]) null, true, false, 72, (int[]) null);
        }
        long var7 = this.field4539;
        int[] var9 = this.field4526;
        if (arg2 != null && (arg2.field35 >= 0 || arg2.field39 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field4526[var10];
            }
            if (arg2.field35 >= 0) {
                if (arg2.field35 == 65535) {
                    var7 ^= 0xFFFFFFFF00000000L;
                    var9[5] = 0;
                } else {
                    var9[5] = class21.method150(arg2.field35, 1073741824);
                    var7 ^= (long) var9[5] << 32;
                }
            }
            if (arg2.field39 >= 0) {
                if (arg2.field39 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var9[3] = 0;
                } else {
                    var9[3] = class21.method150(arg2.field39, 1073741824);
                    var7 ^= (long) var9[3];
                }
            }
        }
        class98 var11 = (class98) class240.field4277.method82(arg4 ^ 0xFFFFFF9C, var7);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var22 = var9[var13];
                if ((var22 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var22) != 0 && !class1.method2(var22 & 0x3FFFFFFF, (byte) 127).method1095(true)) {
                        var12 = true;
                    }
                } else if (!class165.method1179(arg4 ^ 0xFFFFFFF1, var22 & 0x3FFFFFFF).method958(0, this.field4545)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field4537 != -1L) {
                    var11 = (class98) class240.field4277.method82(arg4 + 230, this.field4537);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                class4[] var14 = new class4[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var19 = var9[var16];
                    if ((var19 & 0x40000000) != 0) {
                        class4 var21 = class165.method1179(102, var19 & 0x3FFFFFFF).method943(20, this.field4545);
                        if (var21 != null) {
                            var14[var15++] = var21;
                        }
                    } else if ((var19 & Integer.MIN_VALUE) != 0) {
                        class4 var20 = class1.method2(var19 & 0x3FFFFFFF, (byte) 20).method1091(arg4 ^ 0x69);
                        if (var20 != null) {
                            var14[var15++] = var20;
                        }
                    }
                }
                class4 var17 = new class4(var14, var15);
                for (int var18 = 0; var18 < 5; var18++) {
                    if (class130.field2332[var18].length > this.field4532[var18]) {
                        var17.method56(class43.field655[var18], class130.field2332[var18][this.field4532[var18]]);
                    }
                    if (this.field4532[var18] < class92.field1768[var18].length) {
                        var17.method56(class137.field2561[var18], class92.field1768[var18][this.field4532[var18]]);
                    }
                }
                var11 = var17.method64(64, 850, -30, -50, -30);
                if (arg1) {
                    class240.field4277.method84(123, var7, var11);
                    this.field4537 = var7;
                }
            }
        }
        if (arg2 == null && arg0 == null) {
            return var11;
        }
        class98 var23;
        if (arg2 != null && arg0 != null) {
            var23 = arg2.method23(var11, arg0, -1842587056, arg3, arg5);
        } else if (arg2 == null) {
            var23 = arg0.method19(arg5, var11, 10);
        } else {
            var23 = arg2.method19(arg3, var11, 10);
        }
        return var23;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lpa;II)Lic;")
    public final class98 method1735(class2 arg0, int arg1, int arg2) {
        field4541++;
        if (this.field4547 != -1) {
            return class269.method1828(2, this.field4547).method531(0, arg1, arg0);
        }
        class98 var4 = (class98) class81.field1407.method82(125, this.field4539);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field4526[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class1.method2(var15 & 0x3FFFFFFF, (byte) 34).method1092(true)) {
                        var5 = true;
                    }
                } else if (!class165.method1179(102, var15 & 0x3FFFFFFF).method955(0, this.field4545)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class4[] var7 = new class4[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field4526[var9];
                if ((var12 & 0x40000000) != 0) {
                    class4 var13 = class165.method1179(102, var12 & 0x3FFFFFFF).method945(this.field4545, -22);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class4 var14 = class1.method2(var12 & 0x3FFFFFFF, (byte) -107).method1093(0);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class4 var10 = new class4(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field4532[var11] < class130.field2332[var11].length) {
                    var10.method56(class43.field655[var11], class130.field2332[var11][this.field4532[var11]]);
                }
                if (this.field4532[var11] < class92.field1768[var11].length) {
                    var10.method56(class137.field2561[var11], class92.field1768[var11][this.field4532[var11]]);
                }
            }
            var4 = var10.method64(64, 768, -50, -10, -50);
            class81.field1407.method84(123, this.field4539, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method26(arg1, arg2 ^ 0x80006B10, var4);
        }
        if (arg2 != Integer.MIN_VALUE) {
            this.method1738(-87, -70, 1, (class2) null, 76);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZZ)V")
    public final void method1736(boolean arg0, boolean arg1) {
        this.field4545 = arg1;
        this.method1741(-130);
        if (!arg0) {
            field4542++;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
    public final void method1737(int arg0, int arg1, int arg2) {
        this.field4532[arg2] = arg1;
        if (arg0 == -1) {
            this.method1741(-130);
            field4534++;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILpa;I)Lic;")
    public final class98 method1738(int arg0, int arg1, int arg2, class2 arg3, int arg4) {
        field4536++;
        long var6 = (long) arg0 | (long) arg0 << 32 | (long) (arg1 << 16);
        class98 var8 = (class98) class81.field1407.method82(-100, var6);
        if (var8 == null) {
            class4[] var9 = new class4[2];
            int var10 = 0;
            if (!class1.method2(arg0, (byte) -127).method1092(true) || !class1.method2(arg1, (byte) -115).method1092(true)) {
                return null;
            }
            class4 var11 = class1.method2(arg0, (byte) 32).method1093(0);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class4 var12 = class1.method2(arg1, (byte) -102).method1093(0);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class4 var13 = new class4(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field4532[var14] < class130.field2332[var14].length) {
                    var13.method56(class43.field655[var14], class130.field2332[var14][this.field4532[var14]]);
                }
                if (this.field4532[var14] < class92.field1768[var14].length) {
                    var13.method56(class137.field2561[var14], class92.field1768[var14][this.field4532[var14]]);
                }
            }
            var8 = var13.method64(64, 768, -50, -10, -50);
            class81.field1407.method84(110, var6, var8);
        }
        if (arg2 > -47) {
            return null;
        } else {
            if (arg3 != null) {
                var8 = arg3.method26(arg4, 27408, var8);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIBIIIZII)Z")
    public static final boolean method1739(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field4543++;
        if (class241.field4310.method1014(-1) == 2) {
            return class129.method920(-82, arg4, arg9, arg7, arg6, arg1, arg10, arg11, arg0, arg8, arg2, arg3);
        } else if (class241.field4310.method1014(-1) > 2) {
            return class206.method1460(arg4, arg11, arg0, arg10, arg8, arg9, class241.field4310.method1014(-1), -1, arg7, arg1, arg3, arg2, arg6);
        } else {
            int var12 = 40 % ((arg5 + 2) / 38);
            return class24.method163(arg11, arg7, arg9, arg6, (byte) 94, arg2, arg10, arg1, arg0, arg8, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)V")
    public final void method1740(int arg0, int arg1, int arg2) {
        field4553++;
        int var4 = class158.field2985[arg0];
        if (this.field4526[var4] != 0 && class1.method2(arg2, (byte) -110) != null) {
            this.field4526[var4] = class21.method150(arg2, arg1);
            this.method1741(-130);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    private final void method1741(int arg0) {
        if (arg0 != -130) {
            this.method1735((class2) null, -89, -69);
        }
        field4529++;
        long var2 = this.field4539;
        this.field4539 = -1L;
        long[] var4 = class236.field4225;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4539 = this.field4539 >>> 8 ^ var4[(int) ((this.field4539 ^ (long) (this.field4526[var5] >> 24)) & 0xFFL)];
            this.field4539 = this.field4539 >>> 8 ^ var4[(int) (((long) (this.field4526[var5] >> 16) ^ this.field4539) & 0xFFL)];
            this.field4539 = this.field4539 >>> 8 ^ var4[(int) (((long) (this.field4526[var5] >> 8) ^ this.field4539) & 0xFFL)];
            this.field4539 = this.field4539 >>> 8 ^ var4[(int) ((this.field4539 ^ (long) this.field4526[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4539 = var4[(int) ((this.field4539 ^ (long) this.field4532[var6]) & 0xFFL)] ^ this.field4539 >>> 8;
        }
        this.field4539 = var4[(int) ((this.field4539 ^ (long) (this.field4545 ? 1 : 0)) & 0xFFL)] ^ this.field4539 >>> 8;
        if (var2 != 0L && this.field4539 != var2) {
            class240.field4277.method83(var2, arg0 ^ 0x56F8);
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)Z")
    public static final boolean method1742(byte arg0) throws IOException {
        field4538++;
        if (class125.field2252 == null) {
            return false;
        }
        int var1 = class125.field2252.method991((byte) -92);
        if (var1 == 0) {
            return false;
        }
        if (class280.field4950 == -1) {
            class125.field2252.method993(1, class142.field2669.field2115, 5623, 0);
            class142.field2669.field2155 = 0;
            class280.field4950 = class142.field2669.method585(-78);
            var1--;
            class217.field3976 = class65.field1126[class280.field4950];
        }
        if (class217.field3976 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class125.field2252.method993(1, class142.field2669.field2115, 5623, 0);
            var1--;
            class217.field3976 = class142.field2669.field2115[0] & 0xFF;
        }
        if (class217.field3976 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class125.field2252.method993(2, class142.field2669.field2115, 5623, 0);
            class142.field2669.field2155 = 0;
            class217.field3976 = class142.field2669.method827(255);
        }
        if (var1 < class217.field3976) {
            return false;
        }
        class142.field2669.field2155 = 0;
        class125.field2252.method993(class217.field3976, class142.field2669.field2115, 5623, 0);
        class166.field3104 = 0;
        class12.field212 = class189.field3527;
        class189.field3527 = class84.field1660;
        class84.field1660 = class280.field4950;
        if (class280.field4950 == 182) {
            class88.method582(true, true);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 50) {
            class80.method517(false, class142.field2669);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 87) {
            int var2 = class142.field2669.method854((byte) 83);
            int var3 = class142.field2669.method827(255);
            int var4 = class142.field2669.method851(2096);
            class71 var5 = class87.field1712[var4];
            if (var5 != null) {
                class72.method468(var2, var3, var5, (byte) -106);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 46) {
            int var6 = class142.field2669.method841((byte) -72);
            int var7 = class142.field2669.method872(16);
            int var8 = class142.field2669.method851(2096);
            int var9 = class142.field2669.method827(255);
            if ((var6 >> 30) != 0) {
                int var10 = var6 >> 28 & 0x3;
                int var11 = (var6 >> 14 & 0x3FFF) - class77.field1339;
                int var12 = (var6 & 0x3FFF) - class107.field1933;
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    int var13 = var11 * 128 + 64;
                    int var14 = var12 * 128 + 64;
                    class165 var15 = new class165(var8, var10, var13, var14, class236.method1606(82, var14, var13, var10) - var7, var9, class211.field3851);
                    class229.field4168.method1382(new class70(var15), (byte) -105);
                }
            } else if (var6 >> 29 != 0) {
                int var16 = var6 & 0xFFFF;
                class71 var17 = class87.field1712[var16];
                if (var17 != null) {
                    if (var8 == 65535) {
                        var8 = -1;
                    }
                    boolean var18 = true;
                    if (var8 != -1 && var17.field2709 != -1 && class253.method1712(class255.method1728(var8, (byte) 95).field4193, -123).field32 < class253.method1712(class255.method1728(var17.field2709, (byte) 95).field4193, -120).field32) {
                        var18 = false;
                    }
                    if (var18) {
                        var17.field2703 = class211.field3851 + var9;
                        var17.field2674 = var7;
                        var17.field2656 = 0;
                        var17.field2709 = var8;
                        var17.field2664 = 0;
                        if (var17.field2703 > class211.field3851) {
                            var17.field2656 = -1;
                        }
                        if (var17.field2709 != -1 && class211.field3851 == var17.field2703) {
                            int var19 = class255.method1728(var17.field2709, (byte) 95).field4193;
                            if (var19 != -1) {
                                class2 var20 = class253.method1712(var19, -124);
                                if (var20 != null && var20.field37 != null) {
                                    class31.method188(-1, var20, var17.field2687, false, 0, var17.field2694);
                                }
                            }
                        }
                    }
                }
            } else if (var6 >> 28 != 0) {
                int var21 = var6 & 0xFFFF;
                class188 var22;
                if (class249.field4421 == var21) {
                    var22 = class241.field4310;
                } else {
                    var22 = class93.field1774[var21];
                }
                if (var22 != null) {
                    if (var8 == 65535) {
                        var8 = -1;
                    }
                    boolean var23 = true;
                    if (var8 != -1 && var22.field2709 != -1 && class253.method1712(class255.method1728(var8, (byte) 95).field4193, -125).field32 < class253.method1712(class255.method1728(var22.field2709, (byte) 95).field4193, -126).field32) {
                        var23 = false;
                    }
                    if (var23) {
                        var22.field2656 = 0;
                        var22.field2709 = var8;
                        var22.field2703 = class211.field3851 + var9;
                        if (var22.field2709 == 65535) {
                            var22.field2709 = -1;
                        }
                        var22.field2674 = var7;
                        if (class211.field3851 < var22.field2703) {
                            var22.field2656 = -1;
                        }
                        var22.field2664 = 0;
                        if (var22.field2709 != -1 && class211.field3851 == var22.field2703) {
                            int var24 = class255.method1728(var22.field2709, (byte) 95).field4193;
                            if (var24 != -1) {
                                class2 var25 = class253.method1712(var24, -122);
                                if (var25 != null && var25.field37 != null) {
                                    class31.method188(-1, var25, var22.field2687, class241.field4310 == var22, 0, var22.field2694);
                                }
                            }
                        }
                    }
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 48) {
            int var26 = class142.field2669.method834(48);
            int var27 = class142.field2669.method866(-5702);
            int var28 = class142.field2669.method834(114);
            int var29 = class142.field2669.method872(16);
            if (class153.method1087(var29, true)) {
                class225.method1557(var26, (byte) 85, var27, var28);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 104) {
            class12.method104(-84);
            class44.method267(117);
            class21.field353 += 32;
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 8) {
            int var30 = class142.field2669.method867(false);
            int var31 = class142.field2669.method867(false);
            int var32 = class142.field2669.method867(false);
            int var33 = class142.field2669.method867(false);
            int var34 = class142.field2669.method827(255);
            class37.field583[var30] = true;
            class176.field3222[var30] = var31;
            class211.field3844[var30] = var32;
            class88.field1734[var30] = var33;
            class116.field2073[var30] = var34;
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 137) {
            byte[] var35 = new byte[class217.field3976];
            class142.field2669.method572(class217.field3976, 0, 0, var35);
            class185 var36 = class204.method1451(var35, (byte) -119, class217.field3976, 0);
            if (class131.field2357 == null && class160.field3018 == 3 || !class160.field3026.startsWith("win") || class200.field3675) {
                class257.method1749(var36, 1621, true);
            } else {
                class85.field1677 = true;
                class178.field3257 = var36;
                class13.field227 = class124.field2238.method1159((byte) -127, new String(var36.method1339((byte) 101), "ISO-8859-1"));
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 40) {
            int var37 = class142.field2669.method851(2096);
            int var38 = class142.field2669.method851(2096);
            int var39 = class142.field2669.method832((byte) 59);
            if (class153.method1087(var38, true)) {
                if (var39 == 2) {
                    class92.method599(-1);
                }
                class275.field4877 = var37;
                class227.method1569(var37, (byte) 15);
                class176.method1245(false, -1);
                class154.method1094(3, class275.field4877);
                for (int var40 = 0; var40 < 100; var40++) {
                    class44.field700[var40] = true;
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 184) {
            int var41 = class142.field2669.method851(2096);
            int var42 = class142.field2669.method851(2096);
            int var43 = class142.field2669.method832((byte) 102);
            if (class153.method1087(var42, true)) {
                class90.method597(var43, var41, false);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 242) {
            int var44 = class142.field2669.method827(255);
            if (var44 == 65535) {
                var44 = -1;
            }
            int var45 = class142.field2669.method866(-5702);
            int var46 = class142.field2669.method841((byte) -83);
            int var47 = class142.field2669.method831((byte) -110);
            if (class153.method1087(var47, true)) {
                class82 var48 = class116.method805(1, var46);
                if (var48.field1572) {
                    class162.method1167(var44, (byte) -103, var46, var45);
                    class134 var50 = class165.method1179(102, var44);
                    class234.method1598(var50.field2448, var50.field2415, var46, var50.field2455, 9463);
                    class171.method1215(var50.field2454, var50.field2437, var46, var50.field2453, 1000);
                } else if (var44 == -1) {
                    class280.field4950 = -1;
                    var48.field1626 = 0;
                    return true;
                } else {
                    class134 var49 = class165.method1179(102, var44);
                    var48.field1626 = 4;
                    var48.field1521 = var44;
                    var48.field1605 = var49.field2415 * 100 / var45;
                    var48.field1556 = var49.field2455;
                    var48.field1563 = var49.field2448;
                    class229.method1581(var48, false);
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 219) {
            class44.method267(-84);
            class42.field646 = class142.field2669.method876(65280);
            class280.field4950 = -1;
            class108.field1958 = class38.field593;
            return true;
        } else if (class280.field4950 == 73) {
            int var51 = class142.field2669.method866(-5702);
            int var52 = class142.field2669.method827(255);
            int var53 = class142.field2669.method872(16);
            if (class153.method1087(var52, true)) {
                class90.method597(var51, var53, false);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 191) {
            if (class217.field3976 == 0) {
                class24.field403 = class235.field4212;
            } else {
                class24.field403 = class142.field2669.method865(9199);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 63 || class280.field4950 == 139 || class280.field4950 == 116 || class280.field4950 == 12 || class280.field4950 == 92 || class280.field4950 == 128 || class280.field4950 == 42 || class280.field4950 == 38 || class280.field4950 == 79 || class280.field4950 == 99 || class280.field4950 == 15 || class280.field4950 == 156) {
            class92.method601(false);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 57) {
            int var54 = class142.field2669.method875((byte) 79);
            int var55 = class142.field2669.method827(255);
            int var56 = class142.field2669.method831((byte) 109);
            int var57 = class142.field2669.method831((byte) 114);
            if (class153.method1087(var55, true)) {
                class88.method586(true, var56 | var57 << 16, var54, 7);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 233) {
            int var58 = class142.field2669.method875((byte) 69);
            int var59 = class142.field2669.method827(255);
            if (var58 < -70000) {
                var59 += 32768;
            }
            class82 var60;
            if (var58 < 0) {
                var60 = null;
            } else {
                var60 = class116.method805(1, var58);
            }
            if (var60 != null) {
                for (int var61 = 0; var61 < var60.field1576.length; var61++) {
                    var60.field1576[var61] = 0;
                    var60.field1548[var61] = 0;
                }
            }
            class26.method172(var59, (byte) 115);
            int var62 = class142.field2669.method827(255);
            for (int var63 = 0; var63 < var62; var63++) {
                int var64 = class142.field2669.method831((byte) 109);
                int var65 = class142.field2669.method821(26);
                if (var65 == 255) {
                    var65 = class142.field2669.method866(-5702);
                }
                if (var60 != null && var63 < var60.field1576.length) {
                    var60.field1576[var63] = var64;
                    var60.field1548[var63] = var65;
                }
                class97.method623(1, var59, var65, var63, var64 - 1);
            }
            if (var60 != null) {
                class229.method1581(var60, false);
            }
            class44.method267(-110);
            class14.field244[class220.method1526(31, class9.field182++)] = class220.method1526(32767, var59);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 28) {
            class44.method267(-103);
            class123.field2221 = class142.field2669.method867(false);
            class280.field4950 = -1;
            class108.field1958 = class38.field593;
            return true;
        } else if (class280.field4950 == 163) {
            class88.method582(true, false);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 225) {
            int var66 = class142.field2669.method875((byte) 105);
            int var67 = class142.field2669.method827(255);
            if (var66 < -70000) {
                var67 += 32768;
            }
            class82 var68;
            if (var66 < 0) {
                var68 = null;
            } else {
                var68 = class116.method805(1, var66);
            }
            while (class142.field2669.field2155 < class217.field3976) {
                int var69 = class142.field2669.method836((byte) 110);
                int var70 = 0;
                int var71 = class142.field2669.method827(255);
                if (var71 != 0) {
                    var70 = class142.field2669.method867(false);
                    if (var70 == 255) {
                        var70 = class142.field2669.method875((byte) 89);
                    }
                }
                if (var68 != null && var69 >= 0 && var68.field1576.length > var69) {
                    var68.field1576[var69] = var71;
                    var68.field1548[var69] = var70;
                }
                class97.method623(1, var67, var70, var69, var71 - 1);
            }
            if (var68 != null) {
                class229.method1581(var68, false);
            }
            class44.method267(-97);
            class14.field244[class220.method1526(31, class9.field182++)] = class220.method1526(var67, 32767);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 196) {
            int var72 = class142.field2669.method831((byte) 38);
            int var73 = class142.field2669.method872(16);
            int var74 = class142.field2669.method872(16);
            int var75 = class142.field2669.method841((byte) -91);
            int var76 = class142.field2669.method827(255);
            if (class153.method1087(var76, true)) {
                class234.method1598(var72, var74, var75, var73, 9463);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 155) {
            int var77 = class142.field2669.method867(false);
            int var78 = class142.field2669.method832((byte) -119);
            int var79 = class142.field2669.method832((byte) -128);
            class265.field4703 = var78 >> 1;
            class241.field4310.method1356(var77, (byte) -85, var79, (var78 & 0x1) == 1);
            class280.field4950 = -1;
            return true;
        } else if (arg0 <= 26) {
            return false;
        } else if (class280.field4950 == 187) {
            long var80 = class142.field2669.method862(false);
            boolean var82 = false;
            int var83 = class142.field2669.method827(255);
            byte var84 = class142.field2669.method838(1275919136);
            if ((Long.MIN_VALUE & var80) != 0L) {
                var82 = true;
            }
            if (var82) {
                if (class48.field786 == 0) {
                    class280.field4950 = -1;
                    return true;
                }
                long var90 = var80 & Long.MAX_VALUE;
                boolean var92 = false;
                int var93;
                for (var93 = 0; var93 < class48.field786 && (class81.field1455[var93].field1278 != var90 || class81.field1455[var93].field3205 != var83); var93++) {
                }
                if (var93 < class48.field786) {
                    while ((class48.field786 - 1) > var93) {
                        class81.field1455[var93] = class81.field1455[var93 + 1];
                        var93++;
                    }
                    class48.field786--;
                    class81.field1455[class48.field786] = null;
                }
            } else {
                class185 var85 = class142.field2669.method865(9199);
                class175 var86 = new class175();
                var86.field1278 = var80;
                var86.field3197 = class271.method1859((byte) -108, var86.field1278);
                var86.field3201 = var85;
                var86.field3206 = var84;
                var86.field3205 = var83;
                int var87;
                for (var87 = class48.field786 - 1; var87 >= 0; var87--) {
                    int var88 = class81.field1455[var87].field3197.method1303(var86.field3197, (byte) -12);
                    if (var88 == 0) {
                        class81.field1455[var87].field3205 = var83;
                        class81.field1455[var87].field3206 = var84;
                        class81.field1455[var87].field3201 = var85;
                        class280.field4950 = -1;
                        class257.field4564 = class38.field593;
                        if (class130.field2326 == var80) {
                            class10.field203 = var84;
                        }
                        return true;
                    }
                    if (var88 < 0) {
                        break;
                    }
                }
                if (class81.field1455.length <= class48.field786) {
                    class280.field4950 = -1;
                    return true;
                }
                for (int var89 = class48.field786 - 1; var89 > var87; var89--) {
                    class81.field1455[var89 + 1] = class81.field1455[var89];
                }
                if (class48.field786 == 0) {
                    class81.field1455 = new class175[100];
                }
                class81.field1455[var87 + 1] = var86;
                if (class130.field2326 == var80) {
                    class10.field203 = var84;
                }
                class48.field786++;
            }
            class280.field4950 = -1;
            class257.field4564 = class38.field593;
            return true;
        } else if (class280.field4950 == 43) {
            int var94 = class142.field2669.method851(2096);
            int var95 = class142.field2669.method875((byte) 119);
            int var96 = class142.field2669.method834(-96);
            if (class153.method1087(var94, true)) {
                class202.method1438(true, var96, var95);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 183) {
            class14.method110(class124.field2238, class217.field3976, class142.field2669, -3);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 35) {
            int var97 = class142.field2669.method827(255);
            if (var97 == 65535) {
                var97 = -1;
            }
            int var98 = class142.field2669.method867(false);
            int var99 = class142.field2669.method827(255);
            class37.method234((byte) -67, var98, var97, var99);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 78) {
            long var100 = class142.field2669.method862(false);
            int var102 = class142.field2669.method827(255);
            class185 var103 = class90.method593((byte) -76, var102).method743(class142.field2669, (byte) -74);
            class7.method77(class271.method1859((byte) -108, var100).method1334(38), 19, var102, -14486, (class185) null, var103);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 149) {
            long var104 = class142.field2669.method862(false);
            long var106 = (long) class142.field2669.method827(255);
            long var108 = (long) class142.field2669.method873((byte) -94);
            int var110 = class142.field2669.method867(false);
            long var111 = (var106 << 32) + var108;
            int var113 = class142.field2669.method827(255);
            boolean var114 = false;
            int var115 = 0;
            label1172: while (true) {
                if (var115 >= 100) {
                    if (var110 <= 1) {
                        for (int var116 = 0; var116 < class127.field2276; var116++) {
                            if (class165.field3088[var116] == var104) {
                                var114 = true;
                                break label1172;
                            }
                        }
                    }
                    break;
                }
                if (class7.field152[var115] == var111) {
                    var114 = true;
                    break;
                }
                var115++;
            }
            if (!var114 && class79.field1388 == 0) {
                class7.field152[class76.field1328] = var111;
                class76.field1328 = (class76.field1328 + 1) % 100;
                class185 var117 = class90.method593((byte) -126, var113).method743(class142.field2669, (byte) -90);
                if (var110 == 2) {
                    class7.method77(class87.method567(-11039, new class185[] { class266.field4707, class271.method1859((byte) -108, var104).method1334(38) }), 18, var113, -14486, (class185) null, var117);
                } else if (var110 == 1) {
                    class7.method77(class87.method567(-11039, new class185[] { class85.field1683, class271.method1859((byte) -108, var104).method1334(38) }), 18, var113, -14486, (class185) null, var117);
                } else {
                    class7.method77(class271.method1859((byte) -108, var104).method1334(38), 18, var113, -14486, (class185) null, var117);
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 162) {
            long var118 = class142.field2669.method862(false);
            boolean var120 = false;
            class142.field2669.method838(1275919136);
            long var121 = class142.field2669.method862(false);
            long var123 = (long) class142.field2669.method827(255);
            long var125 = (long) class142.field2669.method873((byte) -116);
            long var127 = (var123 << 32) + var125;
            int var129 = class142.field2669.method867(false);
            int var130 = class142.field2669.method827(255);
            int var131 = 0;
            label1197: while (true) {
                if (var131 >= 100) {
                    if (var129 <= 1) {
                        for (int var132 = 0; var132 < class127.field2276; var132++) {
                            if (class165.field3088[var132] == var118) {
                                var120 = true;
                                break label1197;
                            }
                        }
                    }
                    break;
                }
                if (class7.field152[var131] == var127) {
                    var120 = true;
                    break;
                }
                var131++;
            }
            if (!var120 && class79.field1388 == 0) {
                class7.field152[class76.field1328] = var127;
                class76.field1328 = (class76.field1328 + 1) % 100;
                class185 var133 = class90.method593((byte) 75, var130).method743(class142.field2669, (byte) -96);
                if (var129 == 2 || var129 == 3) {
                    class7.method77(class87.method567(-11039, new class185[] { class266.field4707, class271.method1859((byte) -108, var118).method1334(38) }), 20, var130, -14486, class271.method1859((byte) -108, var121).method1334(38), var133);
                } else if (var129 == 1) {
                    class7.method77(class87.method567(-11039, new class185[] { class85.field1683, class271.method1859((byte) -108, var118).method1334(38) }), 20, var130, -14486, class271.method1859((byte) -108, var121).method1334(38), var133);
                } else {
                    class7.method77(class271.method1859((byte) -108, var118).method1334(38), 20, var130, -14486, class271.method1859((byte) -108, var121).method1334(38), var133);
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 114) {
            int var134 = class142.field2669.method872(16);
            int var135 = class142.field2669.method875((byte) 126);
            int var136 = class142.field2669.method831((byte) 60);
            if (class153.method1087(var134, true)) {
                class198.method1424((byte) 28, var135, var136);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 39) {
            class7.field153 = class142.field2669.method832((byte) -127);
            class128.field2298 = class142.field2669.method867(false);
            while (class142.field2669.field2155 < class217.field3976) {
                class280.field4950 = class142.field2669.method867(false);
                class92.method601(false);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 202) {
            if (class275.field4877 != -1) {
                class151.method1071(0, true, class275.field4877);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 80) {
            int var137 = class142.field2669.method851(2096);
            int var138 = class142.field2669.method875((byte) 126);
            class193.method1391(var138, -114, var137);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 74) {
            class128.field2298 = class142.field2669.method821(113);
            class7.field153 = class142.field2669.method832((byte) 87);
            for (int var139 = class128.field2298; var139 < class128.field2298 + 8; var139++) {
                for (int var141 = class7.field153; var141 < class7.field153 + 8; var141++) {
                    if (class71.field1238[class265.field4703][var139][var141] != null) {
                        class71.field1238[class265.field4703][var139][var141] = null;
                        class228.method1578(var141, var139, false);
                    }
                }
            }
            for (class79 var140 = (class79) class246.field4383.method1375(16259); var140 != null; var140 = (class79) class246.field4383.method1377(-19546)) {
                if (var140.field1368 >= class128.field2298 && var140.field1368 < (class128.field2298 + 8) && var140.field1369 >= class7.field153 && var140.field1369 < class7.field153 + 8 && class265.field4703 == var140.field1375) {
                    var140.field1383 = 0;
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 189) {
            for (int var142 = 0; var142 < class59.field1059.length; var142++) {
                if (class59.field1059[var142] != class269.field4752[var142]) {
                    class59.field1059[var142] = class269.field4752[var142];
                    class262.method1791(var142, 7330);
                    class251.field4475[class220.method1526(31, class21.field353++)] = var142;
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 186) {
            long var143 = class142.field2669.method862(false);
            long var145 = (long) class142.field2669.method827(255);
            long var147 = (long) class142.field2669.method873((byte) -117);
            int var149 = class142.field2669.method867(false);
            long var150 = (var145 << 32) + var147;
            boolean var152 = false;
            int var153 = 0;
            label1243: while (true) {
                if (var153 >= 100) {
                    if (var149 <= 1) {
                        if ((!class212.field3864 || class118.field2142) && !class275.field4880) {
                            for (int var154 = 0; var154 < class127.field2276; var154++) {
                                if (class165.field3088[var154] == var143) {
                                    var152 = true;
                                    break label1243;
                                }
                            }
                        } else {
                            var152 = true;
                        }
                    }
                    break;
                }
                if (class7.field152[var153] == var150) {
                    var152 = true;
                    break;
                }
                var153++;
            }
            if (!var152 && class79.field1388 == 0) {
                class7.field152[class76.field1328] = var150;
                class76.field1328 = (class76.field1328 + 1) % 100;
                class185 var155 = class270.method1844(class80.method515(class142.field2669, 32767).method1316(-6017));
                if (var149 == 2 || var149 == 3) {
                    class1.method5(class87.method567(-11039, new class185[] { class266.field4707, class271.method1859((byte) -108, var143).method1334(38) }), 7, true, var155);
                } else if (var149 == 1) {
                    class1.method5(class87.method567(-11039, new class185[] { class85.field1683, class271.method1859((byte) -108, var143).method1334(38) }), 7, true, var155);
                } else {
                    class1.method5(class271.method1859((byte) -108, var143).method1334(38), 3, true, var155);
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 215) {
            class42.field640 = class142.field2669.method867(false);
            class280.field4950 = -1;
            class130.field2323 = class38.field593;
            return true;
        } else if (class280.field4950 == 13) {
            int var156 = class142.field2669.method827(255);
            int var157 = class142.field2669.method875((byte) 77);
            if (class153.method1087(var156, true)) {
                class271 var158 = (class271) class87.field1715.method195(118, (long) var157);
                if (var158 != null) {
                    class58.method402((byte) 38, var158, true);
                }
                if (class225.field4118 != null) {
                    class229.method1581(class225.field4118, false);
                    class225.field4118 = null;
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 88) {
            int var159 = class142.field2669.method831((byte) 81);
            int var160 = class142.field2669.method867(false);
            int var161 = class142.field2669.method841((byte) -52);
            if (class153.method1087(var159, true)) {
                class68.method451(67, var160, var161);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 231) {
            class191.field3542 = class142.field2669.method831((byte) -113) * 30;
            class108.field1958 = class38.field593;
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 161) {
            class282.method1921(125);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 212) {
            int var162 = class142.field2669.method866(-5702);
            class82 var163 = class116.method805(1, var162);
            for (int var164 = 0; var164 < var163.field1576.length; var164++) {
                var163.field1576[var164] = -1;
                var163.field1576[var164] = 0;
            }
            class229.method1581(var163, false);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 51) {
            int var165 = class142.field2669.method821(-126);
            int var166 = class142.field2669.method854((byte) 102);
            class185 var167 = class142.field2669.method865(9199);
            int var168 = class142.field2669.method831((byte) -107);
            if (var168 == 65535) {
                var168 = -1;
            }
            if (var166 >= 1 && var166 <= 8) {
                if (var167.method1312(class71.field1250, -30055)) {
                    var167 = null;
                }
                class84.field1658[var166 - 1] = var167;
                class274.field4865[var166 - 1] = var168;
                class92.field1771[var166 - 1] = var165 == 0;
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 250) {
            int var169 = class142.field2669.method867(false);
            int var170 = class142.field2669.method867(false);
            int var171 = class142.field2669.method827(255);
            int var172 = class142.field2669.method867(false);
            int var173 = class142.field2669.method867(false);
            class116.method806(var173, var172, 2047, var169, var171, var170);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 209) {
            int var174 = class142.field2669.method831((byte) -107);
            class185 var175 = class142.field2669.method865(9199);
            int var176 = class142.field2669.method872(16);
            if (class153.method1087(var174, true)) {
                class130.method930(var175, var176, (byte) -111);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 41) {
            int var177 = class142.field2669.method831((byte) -125);
            if (var177 == 65535) {
                var177 = -1;
            }
            int var178 = class142.field2669.method851(2096);
            int var179 = class142.field2669.method841((byte) -90);
            int var180 = class142.field2669.method831((byte) -112);
            if (var178 == 65535) {
                var178 = -1;
            }
            int var181 = class142.field2669.method820(false);
            if (class153.method1087(var180, true)) {
                for (int var182 = var177; var182 <= var178; var182++) {
                    long var183 = ((long) var181 << 32) + (long) var182;
                    class73 var185 = class162.field3051.method195(79, var183);
                    if (var185 != null) {
                        var185.method476(-77);
                    }
                    class162.field3051.method190(new class13(var179), (byte) -107, var183);
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 110) {
            int var186 = class142.field2669.method866(-5702);
            int var187 = class142.field2669.method820(false);
            int var188 = class142.field2669.method827(255);
            if (class153.method1087(var188, true)) {
                class271 var189 = (class271) class87.field1715.method195(93, (long) var186);
                class271 var190 = (class271) class87.field1715.method195(124, (long) var187);
                if (var190 != null) {
                    class58.method402((byte) 38, var190, var189 == null || var189.field4811 != var190.field4811);
                }
                if (var189 != null) {
                    var189.method476(-55);
                    class87.field1715.method190(var189, (byte) -88, (long) var187);
                }
                class82 var191 = class116.method805(1, var186);
                if (var191 != null) {
                    class229.method1581(var191, false);
                }
                class82 var192 = class116.method805(1, var187);
                if (var192 != null) {
                    class229.method1581(var192, false);
                    class116.method809(1815818576, var192, true);
                }
                if (class275.field4877 != -1) {
                    class151.method1071(1, true, class275.field4877);
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 6) {
            field4551 = 0;
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 246) {
            class127.field2276 = class217.field3976 / 8;
            for (int var193 = 0; var193 < class127.field2276; var193++) {
                class165.field3088[var193] = class142.field2669.method862(false);
                class64.field1118[var193] = class271.method1859((byte) -108, class165.field3088[var193]);
            }
            class280.field4950 = -1;
            class130.field2323 = class38.field593;
            return true;
        } else if (class280.field4950 == 90) {
            int var194 = class142.field2669.method827(255);
            int var195 = class142.field2669.method851(2096);
            class92.field1765 = var195;
            class43.field681 = var194;
            if (class211.field3848 == 2) {
                class136.field2550 = class43.field681;
                class3.field69 = class92.field1765;
            }
            class64.method433((byte) 122);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 30) {
            class185 var196 = class142.field2669.method865(9199);
            if (var196.method1302(class65.field1143, 90)) {
                class185 var232 = var196.method1301((byte) -115, var196.method1321((byte) 104, class129.field2303), 0);
                long var233 = var232.method1327((byte) 101);
                boolean var235 = false;
                for (int var236 = 0; var236 < class127.field2276; var236++) {
                    if (class165.field3088[var236] == var233) {
                        var235 = true;
                        break;
                    }
                }
                if (!var235 && class79.field1388 == 0) {
                    class1.method5(var232, 4, true, class37.field585);
                }
            } else if (var196.method1302(class103.field1865, 116)) {
                class185 var226 = var196.method1301((byte) -67, var196.method1321((byte) 44, class129.field2303), 0);
                boolean var227 = false;
                long var228 = var226.method1327((byte) 101);
                for (int var230 = 0; var230 < class127.field2276; var230++) {
                    if (class165.field3088[var230] == var228) {
                        var227 = true;
                        break;
                    }
                }
                if (!var227 && class79.field1388 == 0) {
                    class185 var231 = var196.method1301((byte) -91, var196.method1311((byte) 49) - 9, var196.method1321((byte) 48, class129.field2303) + 1);
                    class1.method5(var226, 8, true, var231);
                }
            } else if (var196.method1302(class158.field2983, 62)) {
                boolean var197 = false;
                class185 var198 = var196.method1301((byte) -115, var196.method1321((byte) 84, class129.field2303), 0);
                long var199 = var198.method1327((byte) 101);
                for (int var201 = 0; var201 < class127.field2276; var201++) {
                    if (class165.field3088[var201] == var199) {
                        var197 = true;
                        break;
                    }
                }
                if (!var197 && class79.field1388 == 0) {
                    class1.method5(var198, 10, true, class20.field336);
                }
            } else if (var196.method1302(class150.field2828, 127)) {
                class185 var225 = var196.method1301((byte) -82, var196.method1321((byte) 66, class150.field2828), 0);
                class1.method5(class20.field336, 11, true, var225);
            } else if (var196.method1302(class161.field3047, 100)) {
                class185 var224 = var196.method1301((byte) -128, var196.method1321((byte) 103, class161.field3047), 0);
                if (class79.field1388 == 0) {
                    class1.method5(class20.field336, 12, true, var224);
                }
            } else if (var196.method1302(class132.field2361, 109)) {
                class185 var202 = var196.method1301((byte) -128, var196.method1321((byte) 74, class132.field2361), 0);
                if (class79.field1388 == 0) {
                    class1.method5(class20.field336, 13, true, var202);
                }
            } else if (var196.method1302(class165.field3067, 69)) {
                class185 var203 = var196.method1301((byte) -91, var196.method1321((byte) 81, class129.field2303), 0);
                boolean var204 = false;
                long var205 = var203.method1327((byte) 101);
                for (int var207 = 0; var207 < class127.field2276; var207++) {
                    if (class165.field3088[var207] == var205) {
                        var204 = true;
                        break;
                    }
                }
                if (!var204 && class79.field1388 == 0) {
                    class1.method5(var203, 14, true, class20.field336);
                }
            } else if (var196.method1302(class150.field2849, 83)) {
                class185 var219 = var196.method1301((byte) -56, var196.method1321((byte) 116, class129.field2303), 0);
                long var220 = var219.method1327((byte) 101);
                boolean var222 = false;
                for (int var223 = 0; var223 < class127.field2276; var223++) {
                    if (class165.field3088[var223] == var220) {
                        var222 = true;
                        break;
                    }
                }
                if (!var222 && class79.field1388 == 0) {
                    class1.method5(var219, 15, true, class20.field336);
                }
            } else if (var196.method1302(class124.field2241, 66)) {
                class185 var208 = var196.method1301((byte) -122, var196.method1321((byte) 32, class129.field2303), 0);
                boolean var209 = false;
                long var210 = var208.method1327((byte) 101);
                for (int var212 = 0; var212 < class127.field2276; var212++) {
                    if (class165.field3088[var212] == var210) {
                        var209 = true;
                        break;
                    }
                }
                if (!var209 && class79.field1388 == 0) {
                    class1.method5(var208, 16, true, class20.field336);
                }
            } else if (var196.method1302(class151.field2853, 108)) {
                boolean var213 = false;
                class185 var214 = var196.method1301((byte) -106, var196.method1321((byte) 105, class129.field2303), 0);
                long var215 = var214.method1327((byte) 101);
                for (int var217 = 0; var217 < class127.field2276; var217++) {
                    if (class165.field3088[var217] == var215) {
                        var213 = true;
                        break;
                    }
                }
                if (!var213 && class79.field1388 == 0) {
                    class185 var218 = var196.method1301((byte) -108, var196.method1311((byte) 49) - 9, var196.method1321((byte) 46, class129.field2303) + 1);
                    class1.method5(var214, 21, true, var218);
                }
            } else {
                class1.method5(class20.field336, 0, true, var196);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 131) {
            long var237 = class142.field2669.method862(false);
            class142.field2669.method838(1275919136);
            long var239 = class142.field2669.method862(false);
            long var241 = (long) class142.field2669.method827(255);
            long var243 = (long) class142.field2669.method873((byte) -124);
            int var245 = class142.field2669.method867(false);
            long var246 = (var241 << 32) + var243;
            boolean var248 = false;
            int var249 = 0;
            label1377: while (true) {
                if (var249 >= 100) {
                    if (var245 <= 1) {
                        if ((!class212.field3864 || class118.field2142) && !class275.field4880) {
                            for (int var250 = 0; var250 < class127.field2276; var250++) {
                                if (class165.field3088[var250] == var237) {
                                    var248 = true;
                                    break label1377;
                                }
                            }
                        } else {
                            var248 = true;
                        }
                    }
                    break;
                }
                if (class7.field152[var249] == var246) {
                    var248 = true;
                    break;
                }
                var249++;
            }
            if (!var248 && class79.field1388 == 0) {
                class7.field152[class76.field1328] = var246;
                class76.field1328 = (class76.field1328 + 1) % 100;
                class185 var251 = class270.method1844(class80.method515(class142.field2669, 32767).method1316(-6017));
                if (var245 == 2 || var245 == 3) {
                    class87.method568(var251, class87.method567(-11039, new class185[] { class266.field4707, class271.method1859((byte) -108, var237).method1334(38) }), class271.method1859((byte) -108, var239).method1334(38), -118, 9);
                } else if (var245 == 1) {
                    class87.method568(var251, class87.method567(-11039, new class185[] { class85.field1683, class271.method1859((byte) -108, var237).method1334(38) }), class271.method1859((byte) -108, var239).method1334(38), -112, 9);
                } else {
                    class87.method568(var251, class271.method1859((byte) -108, var237).method1334(38), class271.method1859((byte) -108, var239).method1334(38), -111, 9);
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 168) {
            int var252 = class142.field2669.method872(16);
            if (var252 == 65535) {
                var252 = -1;
            }
            class227.method1567(true, var252);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 218) {
            int var253 = class142.field2669.method844(-66);
            int var254 = class142.field2669.method872(16);
            if (var254 == 65535) {
                var254 = -1;
            }
            class253.method1715(-111, var253, var254);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 24) {
            int var255 = class142.field2669.method831((byte) 47);
            int var256 = class142.field2669.method827(255);
            class185 var257 = class142.field2669.method865(9199);
            if (class153.method1087(var255, true)) {
                class130.method930(var257, var256, (byte) -120);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 154) {
            int var258 = class142.field2669.method867(false);
            class201 var259 = new class201();
            var259.field3695 = var258 & 0x3F;
            var259.field3685 = class142.field2669.method867(false);
            int var260 = var258 >> 6;
            if (var259.field3685 >= 0 && class262.field4647.length > var259.field3685) {
                if (var259.field3695 == 1 || var259.field3695 == 10) {
                    var259.field3689 = class142.field2669.method827(255);
                    class142.field2669.field2155 += 3;
                } else if (var259.field3695 >= 2 && var259.field3695 <= 6) {
                    if (var259.field3695 == 2) {
                        var259.field3693 = 64;
                        var259.field3684 = 64;
                    }
                    if (var259.field3695 == 3) {
                        var259.field3684 = 64;
                        var259.field3693 = 0;
                    }
                    if (var259.field3695 == 4) {
                        var259.field3684 = 64;
                        var259.field3693 = 128;
                    }
                    if (var259.field3695 == 5) {
                        var259.field3684 = 0;
                        var259.field3693 = 64;
                    }
                    if (var259.field3695 == 6) {
                        var259.field3693 = 64;
                        var259.field3684 = 128;
                    }
                    var259.field3695 = 2;
                    var259.field3677 = class142.field2669.method827(255);
                    var259.field3682 = class142.field2669.method827(255);
                    var259.field3692 = class142.field2669.method867(false);
                }
                var259.field3681 = class142.field2669.method827(255);
                if (var259.field3681 == 65535) {
                    var259.field3681 = -1;
                }
                class10.field204[var260] = var259;
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 207) {
            int var261 = class142.field2669.method872(16);
            int var262 = class142.field2669.method866(-5702);
            int var263 = var262 >> 28 & 0x3;
            if (var261 == 65535) {
                var261 = -1;
            }
            int var264 = class142.field2669.method854((byte) 107);
            int var265 = (var262 & 0xFFFF233) >> 14;
            int var266 = var262 & 0x3FFF;
            int var267 = var266 - class107.field1933;
            int var268 = var264 >> 2;
            int var269 = var265 - class77.field1339;
            int var270 = var264 & 0x3;
            int var271 = class52.field860[var268];
            class117.method813(var271, var261, var263, var268, var269, (byte) 117, var267, var270);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 53) {
            class44.method267(-106);
            int var272 = class142.field2669.method841((byte) -50);
            int var273 = class142.field2669.method821(48);
            int var274 = class142.field2669.method832((byte) -102);
            class117.field2079[var273] = var272;
            class132.field2374[var273] = var274;
            class228.field4149[var273] = 1;
            for (int var275 = 0; var275 < 98; var275++) {
                if (class128.field2295[var275] <= var272) {
                    class228.field4149[var273] = var275 + 2;
                }
            }
            class257.field4577[class220.method1526(31, class274.field4864++)] = var273;
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 232) {
            int var276 = class142.field2669.method827(255);
            int var277 = class142.field2669.method851(2096);
            if (var277 == 65535) {
                var277 = -1;
            }
            int var278 = class142.field2669.method875((byte) 42);
            if (class153.method1087(var276, true)) {
                class88.method586(true, var277, var278, 1);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 16) {
            byte var279 = class142.field2669.method868((byte) 87);
            int var280 = class142.field2669.method831((byte) 106);
            class193.method1391(var279, 83, var280);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 229) {
            class199.method1427(false, class142.field2669.method865(9199));
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 142) {
            int var281 = class142.field2669.method872(16);
            int var282 = class142.field2669.method841((byte) -82);
            class242.method1634(-117, var282, var281);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 59) {
            class36.method226((byte) -122);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 113) {
            int var283 = class142.field2669.method867(false);
            int var284 = class142.field2669.method867(false);
            int var285 = class142.field2669.method827(255);
            int var286 = class142.field2669.method867(false);
            int var287 = class142.field2669.method867(false);
            class183.method1289(var287, var283, true, true, var285, var286, var284);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 243) {
            class7.field153 = class142.field2669.method867(false);
            class128.field2298 = class142.field2669.method821(28);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 197) {
            int var288 = class142.field2669.method872(16);
            int var289 = class142.field2669.method875((byte) 73);
            int var290 = class142.field2669.method827(255);
            int var291 = class142.field2669.method831((byte) -108);
            if (class153.method1087(var290, true)) {
                class165.method1180(var289, (var288 << 16) + var291, (byte) -87);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 200) {
            int var292 = class142.field2669.method872(16);
            int var293 = class142.field2669.method831((byte) 72);
            int var294 = class142.field2669.method841((byte) -79);
            if (class153.method1087(var293, true)) {
                class180.method1273(var292, var294, (byte) 62);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 109) {
            long var295 = class142.field2669.method862(false);
            class185 var297 = class270.method1844(class80.method515(class142.field2669, 32767).method1316(-6017));
            class1.method5(class271.method1859((byte) -108, var295).method1334(38), 6, true, var297);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 31) {
            int var298 = class142.field2669.method831((byte) 74);
            class44.method268(var298, -13478);
            class14.field244[class220.method1526(31, class9.field182++)] = class220.method1526(32767, var298);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 164) {
            field4531 = class142.field2669.method867(false);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 248) {
            int var299 = class142.field2669.method875((byte) 116);
            int var300 = class142.field2669.method827(255);
            if (class153.method1087(var300, true)) {
                int var301 = 0;
                if (class241.field4310.field3478 != null) {
                    var301 = class241.field4310.field3478.method1733(-97);
                }
                class88.method586(true, var301, var299, 3);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 234) {
            class157.method1113(109);
            class280.field4950 = -1;
            return false;
        } else if (class280.field4950 == 25) {
            long var302 = class142.field2669.method862(false);
            boolean var304 = true;
            int var305 = class142.field2669.method827(255);
            int var306 = class142.field2669.method867(false);
            if (var302 < 0L) {
                var304 = false;
                var302 &= Long.MAX_VALUE;
            }
            class185 var307 = class20.field336;
            if (var305 > 0) {
                var307 = class142.field2669.method865(9199);
            }
            class185 var308 = class271.method1859((byte) -108, var302).method1334(38);
            for (int var309 = 0; var309 < class126.field2253; var309++) {
                if (class259.field4602[var309] == var302) {
                    if (class138.field2590[var309] != var305) {
                        class138.field2590[var309] = var305;
                        if (var305 > 0) {
                            class1.method5(class20.field336, 5, true, class87.method567(-11039, new class185[] { var308, class205.field3755 }));
                        }
                        if (var305 == 0) {
                            class1.method5(class20.field336, 5, true, class87.method567(-11039, new class185[] { var308, class145.field2752 }));
                        }
                    }
                    class82.field1535[var309] = var307;
                    class194.field3580[var309] = var306;
                    var308 = null;
                    class127.field2267[var309] = var304;
                    break;
                }
            }
            boolean var310 = false;
            if (var308 != null && class126.field2253 < 200) {
                class259.field4602[class126.field2253] = var302;
                class128.field2290[class126.field2253] = var308;
                class138.field2590[class126.field2253] = var305;
                class82.field1535[class126.field2253] = var307;
                class194.field3580[class126.field2253] = var306;
                class127.field2267[class126.field2253] = var304;
                class126.field2253++;
            }
            int var311 = class126.field2253;
            class130.field2323 = class38.field593;
            while (var311 > 0) {
                boolean var312 = true;
                var311--;
                for (int var313 = 0; var313 < var311; var313++) {
                    if (class138.field2590[var313] != class138.field2588 && class138.field2590[var313 + 1] == class138.field2588 || class138.field2590[var313] == 0 && class138.field2590[var313 + 1] != 0) {
                        int var314 = class138.field2590[var313];
                        class138.field2590[var313] = class138.field2590[var313 + 1];
                        class138.field2590[var313 + 1] = var314;
                        class185 var315 = class82.field1535[var313];
                        var312 = false;
                        class82.field1535[var313] = class82.field1535[var313 + 1];
                        class82.field1535[var313 + 1] = var315;
                        class185 var316 = class128.field2290[var313];
                        class128.field2290[var313] = class128.field2290[var313 + 1];
                        class128.field2290[var313 + 1] = var316;
                        long var317 = class259.field4602[var313];
                        class259.field4602[var313] = class259.field4602[var313 + 1];
                        class259.field4602[var313 + 1] = var317;
                        int var319 = class194.field3580[var313];
                        class194.field3580[var313] = class194.field3580[var313 + 1];
                        class194.field3580[var313 + 1] = var319;
                        boolean var320 = class127.field2267[var313];
                        class127.field2267[var313] = class127.field2267[var313 + 1];
                        class127.field2267[var313 + 1] = var320;
                    }
                }
                if (var312) {
                    break;
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 167) {
            int var321 = class142.field2669.method867(false);
            if (class142.field2669.method867(false) == 0) {
                class60.field1084[var321] = new class129();
            } else {
                class142.field2669.field2155--;
                class60.field1084[var321] = new class129(class142.field2669);
            }
            class153.field2899 = class38.field593;
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 190) {
            for (int var322 = 0; var322 < class93.field1774.length; var322++) {
                if (class93.field1774[var322] != null) {
                    class93.field1774[var322].field2655 = -1;
                }
            }
            for (int var323 = 0; var323 < class87.field1712.length; var323++) {
                if (class87.field1712[var323] != null) {
                    class87.field1712[var323].field2655 = -1;
                }
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 179) {
            int var324 = class142.field2669.method831((byte) -106);
            int var325 = class142.field2669.method867(false);
            class242.method1634(-98, var325, var324);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 11) {
            class146.field2775 = class142.field2669.method867(false);
            class92.field1773 = class142.field2669.method867(false);
            class203.field3724 = class142.field2669.method867(false);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 61) {
            int var326 = class142.field2669.method851(2096);
            int var327 = class142.field2669.method827(255);
            int var328 = class142.field2669.method820(false);
            if (var327 == 65535) {
                var327 = -1;
            }
            if (class153.method1087(var326, true)) {
                class88.method586(true, var327, var328, 2);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 67) {
            int var329 = class142.field2669.method841((byte) -81);
            field4555 = class124.field2238.method1162((byte) 110, var329);
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 150) {
            class257.field4564 = class38.field593;
            long var330 = class142.field2669.method862(false);
            if (var330 == 0L) {
                class48.field786 = 0;
                class81.field1455 = null;
                class32.field525 = null;
                class165.field3089 = null;
                class280.field4950 = -1;
                return true;
            }
            long var332 = class142.field2669.method862(false);
            class165.field3089 = class271.method1859((byte) -108, var332);
            class32.field525 = class271.method1859((byte) -108, var330);
            class133.field2388 = class142.field2669.method838(1275919136);
            int var334 = class142.field2669.method867(false);
            if (var334 == 255) {
                class280.field4950 = -1;
                return true;
            }
            class48.field786 = var334;
            class175[] var335 = new class175[100];
            for (int var336 = 0; var336 < class48.field786; var336++) {
                var335[var336] = new class175();
                var335[var336].field1278 = class142.field2669.method862(false);
                var335[var336].field3197 = class271.method1859((byte) -108, var335[var336].field1278);
                var335[var336].field3205 = class142.field2669.method827(255);
                var335[var336].field3206 = class142.field2669.method838(1275919136);
                var335[var336].field3201 = class142.field2669.method865(9199);
                if (class130.field2326 == var335[var336].field1278) {
                    class10.field203 = var335[var336].field3206;
                }
            }
            boolean var337 = false;
            int var338 = class48.field786;
            while (var338 > 0) {
                var338--;
                boolean var339 = true;
                for (int var340 = 0; var340 < var338; var340++) {
                    if (var335[var340].field3197.method1303(var335[var340 + 1].field3197, (byte) -12) > 0) {
                        var339 = false;
                        class175 var341 = var335[var340];
                        var335[var340] = var335[var340 + 1];
                        var335[var340 + 1] = var341;
                    }
                }
                if (var339) {
                    break;
                }
            }
            class280.field4950 = -1;
            class81.field1455 = var335;
            return true;
        } else if (class280.field4950 == 37) {
            int var342 = class142.field2669.method827(255);
            class185 var343 = class142.field2669.method865(9199);
            Object[] var344 = new Object[var343.method1311((byte) 49) + 1];
            for (int var345 = var343.method1311((byte) 49) - 1; var345 >= 0; var345--) {
                if (var343.method1328((byte) 96, var345) == 115) {
                    var344[var345 + 1] = class142.field2669.method865(9199);
                } else {
                    var344[var345 + 1] = Integer.valueOf(class142.field2669.method875((byte) 109));
                }
            }
            var344[0] = Integer.valueOf(class142.field2669.method875((byte) 80));
            if (class153.method1087(var342, true)) {
                class121 var346 = new class121();
                var346.field2198 = var344;
                class274.method1877(var346, (byte) -77);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 34) {
            class185 var347 = class142.field2669.method865(9199);
            int var348 = class142.field2669.method866(-5702);
            int var349 = class142.field2669.method827(255);
            if (class153.method1087(var349, true)) {
                class113.method785(var347, 2, var348);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 129) {
            int var350 = class142.field2669.method841((byte) -117);
            int var351 = class142.field2669.method872(16);
            int var352 = class142.field2669.method854((byte) 117);
            int var353 = class142.field2669.method851(2096);
            if (class153.method1087(var351, true)) {
                class271 var354 = (class271) class87.field1715.method195(32, (long) var350);
                if (var354 != null) {
                    class58.method402((byte) 38, var354, var354.field4811 != var353);
                }
                class58.method398(var350, (byte) 122, var353, var352);
            }
            class280.field4950 = -1;
            return true;
        } else if (class280.field4950 == 111) {
            class161.method1166(-22256);
            class280.field4950 = -1;
            return true;
        } else {
            class3.method33("T1 - " + class280.field4950 + "," + class189.field3527 + "," + class12.field212 + " - " + class217.field3976, (Throwable) null, (byte) 122);
            class157.method1113(109);
            return true;
        }
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V")
    public static final void method1743(byte arg0) {
        field4540++;
        class212.field3868.method80(-14113);
        class27.field458.method80(-14113);
        class26.field435.method80(-14113);
        class106.field1903.method80(-14113);
        if (arg0 < 46) {
            field4533 = false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([IZZI[I)V")
    public final void method1744(int[] arg0, boolean arg1, boolean arg2, int arg3, int[] arg4) {
        field4548++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class104.field1889; var7++) {
                    class154 var8 = class1.method2(var7, (byte) -122);
                    if (var8 != null && !var8.field2913 && var8.field2925 == ((arg2 ? 7 : 0) + var6)) {
                        arg0[class158.field2985[var6]] = class21.method150(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field4545 = arg2;
        this.field4532 = arg4;
        this.field4526 = arg0;
        this.field4547 = arg3;
        if (!arg1) {
            field4533 = true;
        }
        this.method1741(-130);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Z")
    public static final boolean method1745(int arg0, byte arg1) {
        field4525++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class55.field936[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1004) {
            return true;
        } else {
            if (arg1 != 84) {
                method1745(-84, (byte) 31);
            }
            return false;
        }
    }
}
