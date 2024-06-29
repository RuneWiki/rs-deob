import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class285 {

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Z")
    public boolean field4525 = false;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Z")
    public boolean field4523 = false;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field4517 = 5;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public int field4528 = -1;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Z")
    public boolean field4530 = false;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public int field4520 = -1;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Z")
    public boolean field4516 = false;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public int field4541 = -1;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public int field4544 = -1;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public int field4532 = 2;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public int field4526 = 99;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public int field4545 = -1;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4533 = "yellow:";

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Llg;")
    public static class137 field4524 = null;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Z")
    public static boolean field4521 = true;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field4522 = -1;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
    private int[] field4519;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "[I")
    public int[] field4531;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "[I")
    public int[] field4536;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "[Z")
    public boolean[] field4529;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "[[I")
    public int[][] field4535;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIILgk;)Lgk;", line = 6)
    public final class10 method1941(int arg0, int arg1, int arg2, int arg3, class10 arg4) {
        int var6 = this.field4536[arg1];
        field4540++;
        int var7 = this.field4531[arg1];
        class100 var8 = class297.method2027(arg2 + 23286, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method96(true, true, true);
        }
        class100 var10 = null;
        if (arg2 != -23286) {
            field4522 = -37;
        }
        int var11 = 0;
        class100 var12 = null;
        class100 var13 = null;
        if ((this.field4516 || class255.field4105) && arg3 != -1 && arg3 < this.field4531.length) {
            int var14 = this.field4531[arg3];
            var10 = class297.method2027(0, var14 >> 16);
            arg3 = var14 & 0xFFFF;
        }
        int var15 = 0;
        if (this.field4519 != null) {
            if (arg1 < this.field4519.length) {
                var11 = this.field4519[arg1];
                if (var11 != 65535) {
                    var13 = class297.method2027(arg2 ^ 0xFFFFA50A, var11 >> 16);
                    var11 &= 0xFFFF;
                }
            }
            if ((this.field4516 || class255.field4105) && arg3 != -1 && arg3 < this.field4519.length) {
                var15 = this.field4519[arg3];
                if (var15 != 65535) {
                    var12 = class297.method2027(0, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method871(var9, 107);
        boolean var17 = !var8.method863(var9, 2);
        if (var13 != null) {
            var16 &= !var13.method871(var11, 110);
            var17 &= !var13.method863(var11, arg2 + 23288);
        }
        if (var10 != null) {
            var16 &= !var10.method871(arg3, -109);
            var17 &= !var10.method863(arg3, 2);
        }
        if (var12 != null) {
            var16 &= !var12.method871(var15, 96);
            var17 &= !var12.method863(var15, arg2 + 23288);
        }
        class10 var18 = arg4.method96(var16, var17, !this.field4523);
        var18.method93(var8, var9, var10, arg3, arg0 - 1, var6, this.field4523);
        if (var13 != null) {
            var18.method93(var13, var11, var12, var15, arg0 - 1, var6, this.field4523);
        }
        return var18;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lpi;II)V", line = 105)
    private final void method1942(class336 arg0, int arg1, int arg2) {
        field4542++;
        if (arg1 == 1) {
            int var13 = arg0.method2339((byte) -46);
            this.field4536 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4536[var14] = arg0.method2339((byte) -46);
            }
            this.field4531 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field4531[var15] = arg0.method2339((byte) -46);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field4531[var16] = (arg0.method2339((byte) -46) << 16) + this.field4531[var16];
            }
        } else if (arg1 == 2) {
            this.field4544 = arg0.method2339((byte) -46);
        } else if (arg1 == 3) {
            this.field4529 = new boolean[256];
            int var4 = arg0.method2364(-9069);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4529[arg0.method2364(-9069)] = true;
            }
        } else if (arg1 == 4) {
            this.field4530 = true;
        } else if (arg1 == 5) {
            this.field4517 = arg0.method2364(-9069);
        } else if (arg1 == 6) {
            this.field4520 = arg0.method2339((byte) -46);
        } else if (arg1 == 7) {
            this.field4528 = arg0.method2339((byte) -46);
        } else if (arg1 == 8) {
            this.field4526 = arg0.method2364(-9069);
        } else if (arg1 == 9) {
            this.field4541 = arg0.method2364(-9069);
        } else if (arg1 == 10) {
            this.field4545 = arg0.method2364(-9069);
        } else if (arg1 == 11) {
            this.field4532 = arg0.method2364(-9069);
        } else if (arg1 == 12) {
            int var10 = arg0.method2364(-9069);
            this.field4519 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field4519[var11] = arg0.method2339((byte) -46);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field4519[var12] = (arg0.method2339((byte) -46) << 16) + this.field4519[var12];
            }
        } else if (arg1 == 13) {
            int var6 = arg0.method2339((byte) -46);
            this.field4535 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method2364(-9069);
                if (var8 > 0) {
                    this.field4535[var7] = new int[var8];
                    this.field4535[var7][0] = arg0.method2317(21803);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field4535[var7][var9] = arg0.method2339((byte) -46);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4523 = true;
        } else if (arg1 == 15) {
            this.field4516 = true;
        } else if (arg1 == 16) {
            this.field4525 = true;
        }
        if (arg2 <= 8) {
            this.field4528 = -16;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lpi;I)V", line = 263)
    public final void method1943(class336 arg0, int arg1) {
        field4527++;
        if (arg1 != 21697) {
            this.method1944((byte) 122, 39, 46, 84, (class10) null);
        }
        while (true) {
            int var3 = arg0.method2364(-9069);
            if (var3 == 0) {
                return;
            }
            this.method1942(arg0, var3, 36);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIIILgk;)Lgk;", line = 293)
    public final class10 method1944(byte arg0, int arg1, int arg2, int arg3, class10 arg4) {
        field4538++;
        int var6 = this.field4536[arg1];
        int var7 = this.field4531[arg1];
        class100 var8 = class297.method2027(0, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method73(true, true, true);
        }
        class100 var10 = null;
        if ((this.field4516 || class255.field4105) && arg3 != -1 && this.field4531.length > arg3) {
            int var11 = this.field4531[arg3];
            var10 = class297.method2027(0, var11 >> 16);
            arg3 = var11 & 0xFFFF;
        }
        if (arg0 > -116) {
            field4524 = (class137) null;
        }
        class10 var12;
        if (var10 == null) {
            var12 = arg4.method73(!var8.method871(var9, 110), !var8.method863(var9, 2), !this.field4523);
        } else {
            var12 = arg4.method73(!var8.method871(var9, -94) & !var10.method871(arg3, -125), !var8.method863(var9, 2) & !var10.method863(arg3, 2), !this.field4523);
        }
        var12.method93(var8, var9, var10, arg3, arg2 - 1, var6, this.field4523);
        return var12;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 354)
    public final void method1945(int arg0) {
        if (arg0 != 380446480) {
            method1948(-108, (byte[]) null);
        }
        field4515++;
        if (this.field4541 == -1) {
            if (this.field4529 == null) {
                this.field4541 = 0;
            } else {
                this.field4541 = 2;
            }
        }
        if (this.field4545 != -1) {
            return;
        }
        if (this.field4529 == null) {
            this.field4545 = 0;
        } else {
            this.field4545 = 2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([Ljava/lang/String;ZII)Ljava/lang/String;", line = 387)
    public static final String method1946(String[] arg0, boolean arg1, int arg2, int arg3) {
        field4534++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var11 = arg0[arg3];
            return var11 == null ? "null" : var11.toString();
        } else {
            int var4 = arg2 + arg3;
            int var5 = 0;
            for (int var6 = arg3; var6 < var4; var6++) {
                String var7 = arg0[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }
            if (arg1) {
                method1948(-89, (byte[]) null);
            }
            StringBuffer var8 = new StringBuffer(var5);
            for (int var9 = arg3; var9 < var4; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 450)
    public static void method1947(int arg0) {
        field4524 = null;
        if (arg0 <= 123) {
            field4533 = (String) null;
        }
        field4533 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[B)V", line = 475)
    public static final void method1948(int arg0, byte[] arg1) {
        field4539++;
        class336 var2 = new class336(arg1);
        var2.field5353 = arg1.length - 2;
        class130.field2242 = var2.method2339((byte) -46);
        class191.field3205 = new byte[class130.field2242][];
        class123.field2138 = new int[class130.field2242];
        class32.field452 = new boolean[class130.field2242];
        class85.field1367 = new byte[class130.field2242][];
        class104.field1743 = new int[class130.field2242];
        class352.field5575 = new int[class130.field2242];
        int var3 = -48 / ((arg0 + 20) / 46);
        class39.field585 = new int[class130.field2242];
        var2.field5353 = arg1.length - ((class130.field2242 * 8) + 7);
        class308.field4901 = var2.method2339((byte) -46);
        class4.field58 = var2.method2339((byte) -46);
        int var4 = (var2.method2364(-9069) & 0xFF) + 1;
        for (int var5 = 0; var5 < class130.field2242; var5++) {
            class352.field5575[var5] = var2.method2339((byte) -46);
        }
        for (int var6 = 0; var6 < class130.field2242; var6++) {
            class104.field1743[var6] = var2.method2339((byte) -46);
        }
        for (int var7 = 0; var7 < class130.field2242; var7++) {
            class39.field585[var7] = var2.method2339((byte) -46);
        }
        for (int var8 = 0; var8 < class130.field2242; var8++) {
            class123.field2138[var8] = var2.method2339((byte) -46);
        }
        var2.field5353 = arg1.length - ((var4 - 1) * 3) - (class130.field2242 * 8) - 7;
        class40.field600 = new int[var4];
        for (int var9 = 1; var9 < var4; var9++) {
            class40.field600[var9] = var2.method2317(21803);
            if (class40.field600[var9] == 0) {
                class40.field600[var9] = 1;
            }
        }
        var2.field5353 = 0;
        for (int var10 = 0; var10 < class130.field2242; var10++) {
            int var11 = class39.field585[var10];
            int var12 = class123.field2138[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class191.field3205[var10] = var14;
            byte[] var15 = new byte[var13];
            boolean var16 = false;
            class85.field1367[var10] = var15;
            int var17 = var2.method2364(-9069);
            if ((var17 & 0x1) == 0) {
                for (int var23 = 0; var23 < var13; var23++) {
                    var14[var23] = var2.method2323(105);
                }
                if ((var17 & 0x2) != 0) {
                    for (int var24 = 0; var24 < var13; var24++) {
                        byte var25 = var15[var24] = var2.method2323(99);
                        var16 |= var25 != -1;
                    }
                }
            } else {
                int var18 = 0;
                label88: while (true) {
                    if (var11 <= var18) {
                        if ((var17 & 0x2) == 0) {
                            break;
                        }
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var11) {
                                break label88;
                            }
                            for (int var21 = 0; var21 < var12; var21++) {
                                byte var22 = var15[var20 + (var11 * var21)] = var2.method2323(102);
                                var16 |= var22 != -1;
                            }
                            var20++;
                        }
                    }
                    for (int var19 = 0; var19 < var12; var19++) {
                        var14[var11 * var19 + var18] = var2.method2323(-6);
                    }
                    var18++;
                }
            }
            class32.field452[var10] = var16;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lgk;IZIII)Lgk;", line = 647)
    public final class10 method1949(class10 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4537++;
        if (!arg2) {
            field4521 = true;
        }
        int var7 = this.field4536[arg5];
        int var8 = this.field4531[arg5];
        class100 var9 = class297.method2027(0, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method100(true, true, true);
        }
        int var11 = arg3 & 0x3;
        class100 var12 = null;
        if ((this.field4516 || class255.field4105) && arg4 != -1 && this.field4531.length > arg4) {
            int var13 = this.field4531[arg4];
            var12 = class297.method2027(0, var13 >> 16);
            arg4 = var13 & 0xFFFF;
        }
        class10 var14;
        if (var12 == null) {
            var14 = arg0.method100(!var9.method871(var10, 97), !var9.method863(var10, 2), !this.field4523);
        } else {
            var14 = arg0.method100(!var9.method871(var10, -117) & !var12.method871(arg4, -126), !var9.method863(var10, 2) & !var12.method863(arg4, 2), !this.field4523);
        }
        if (class43.field680 && this.field4523) {
            if (var11 == 1) {
                ((class183) var14).method1398();
            } else if (var11 == 2) {
                ((class183) var14).method1411();
            } else if (var11 == 3) {
                ((class183) var14).method1384();
            }
        } else if (var11 == 1) {
            var14.method92();
        } else if (var11 == 2) {
            var14.method75();
        } else if (var11 == 3) {
            var14.method90();
        }
        var14.method93(var9, var10, var12, arg4, arg1 - 1, var7, this.field4523);
        if (class43.field680 && this.field4523) {
            if (var11 == 1) {
                ((class183) var14).method1384();
            } else if (var11 == 2) {
                ((class183) var14).method1411();
            } else if (var11 == 3) {
                ((class183) var14).method1398();
            }
        } else if (var11 == 1) {
            var14.method90();
        } else if (var11 == 2) {
            var14.method75();
        } else if (var11 == 3) {
            var14.method92();
        }
        return var14;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIILgk;II)Lgk;", line = 755)
    public final class10 method1950(byte arg0, int arg1, int arg2, class10 arg3, int arg4, int arg5) {
        field4543++;
        int var7 = -90 % ((-arg0 - 2) / 43);
        int var8 = this.field4536[arg5];
        int var9 = this.field4531[arg5];
        class100 var10 = class297.method2027(0, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            return arg3.method96(true, true, true);
        }
        int var12 = arg2 & 0x3;
        class100 var13 = null;
        if ((this.field4516 || class255.field4105) && arg4 != -1 && this.field4531.length > arg4) {
            int var14 = this.field4531[arg4];
            var13 = class297.method2027(0, var14 >> 16);
            arg4 = var14 & 0xFFFF;
        }
        class10 var15;
        if (var13 == null) {
            var15 = arg3.method96(!var10.method871(var11, -99), !var10.method863(var11, 2), !this.field4523);
        } else {
            var15 = arg3.method96(!var10.method871(var11, -102) & !var13.method871(arg4, -110), !var10.method863(var11, 2) & !var13.method863(arg4, 2), !this.field4523);
        }
        if (this.field4523 && class43.field680) {
            if (var12 == 1) {
                ((class183) var15).method1398();
            } else if (var12 == 2) {
                ((class183) var15).method1411();
            } else if (var12 == 3) {
                ((class183) var15).method1384();
            }
        } else if (var12 == 1) {
            var15.method92();
        } else if (var12 == 2) {
            var15.method75();
        } else if (var12 == 3) {
            var15.method90();
        }
        var15.method93(var10, var11, var13, arg4, arg1 - 1, var8, this.field4523);
        if (this.field4523 && class43.field680) {
            if (var12 == 1) {
                ((class183) var15).method1384();
            } else if (var12 == 2) {
                ((class183) var15).method1411();
            } else if (var12 == 3) {
                ((class183) var15).method1398();
            }
        } else if (var12 == 1) {
            var15.method90();
        } else if (var12 == 2) {
            var15.method75();
        } else if (var12 == 3) {
            var15.method92();
        }
        return var15;
    }
}
