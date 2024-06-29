import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class72 extends class130 {

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public int field1029 = 0;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field1031 = -1;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field1045 = 0;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "Lqj;")
    public static class196 field1048 = class80.method502("null", -48);

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Lic;")
    public class134 field1016;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "Lbk;")
    public static class136 field1032;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "Ldc;")
    public class145 field1024;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "Lhg;")
    public class164 field1042;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lga;")
    public class239 field1017;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "Lga;")
    public class239 field1019;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "Log;")
    public static class38 field1040;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Z")
    public boolean field1020;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "[I")
    public int[] field1046;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "[Lqh;")
    public static class68[] field1041;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljj;ZB)V")
    public static final void method457(class63 arg0, boolean arg1, byte arg2) {
        field1026++;
        int var3 = arg0.field864;
        int var4 = (int) arg0.field1850;
        arg0.method797((byte) 120);
        if (arg1) {
            class136.method827(true, var3);
        }
        class30.method165(-5064, var3);
        class178 var5 = class201.method1356(var4, (byte) -61);
        if (arg2 >= -113) {
            return;
        }
        if (var5 != null) {
            class214.method1472(-59, var5);
        }
        class160.field2574 = false;
        class125.field1767 = 0;
        class166.method1070(class11.field127, class158.field2551, class143.field2193, 0, class231.field4110);
        if (class9.field103 != -1) {
            class17.method92(18, class9.field103, 1);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[B)V")
    public static final void method458(int arg0, byte[] arg1) {
        field1027++;
        int var2 = class40.field458 >> 2 << 10;
        int var3 = class80.field1154 >> 1;
        byte[][] var4 = new byte[class144.field2221][class83.field1213];
        int var5 = 0;
        while (true) {
            while (arg1.length > var5) {
                int var34 = (arg1[var5++] & 0xFF) * 64 - class212.field3809;
                int var35 = (arg1[var5++] & 0xFF) * 64 - class83.field1203;
                if (var34 > 0 && var35 > 0 && var34 + 64 < class144.field2221 && var35 + 64 < class83.field1213) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        byte[] var37 = var4[var34 + var36];
                        int var38 = class83.field1213 - var35 - 1;
                        for (int var39 = -64; var39 < 0; var39++) {
                            var37[var38--] = arg1[var5++];
                        }
                    }
                } else {
                    var5 += 4096;
                }
            }
            int var6 = class83.field1213;
            int var7 = class144.field2221;
            int[] var8 = new int[var6];
            if (arg0 != -1) {
                method457(null, false, (byte) -20);
            }
            int[] var9 = new int[var6];
            int[] var10 = new int[var6];
            int[] var11 = new int[var6];
            int[] var12 = new int[var6];
            for (int var13 = -5; var13 < var7; var13++) {
                for (int var14 = 0; var14 < var6; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var7 > var28) {
                        int var29 = var4[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class25 var30 = class223.method1511(var29 - 1, (byte) -19);
                            var8[var14] += var30.field314;
                            var9[var14] += var30.field322;
                            var10[var14] += var30.field328;
                            var11[var14] += var30.field318;
                            var10002 = var12[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var4[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class25 var33 = class223.method1511(var32 - 1, (byte) -19);
                            var8[var14] -= var33.field314;
                            var9[var14] -= var33.field322;
                            var10[var14] -= var33.field328;
                            var11[var14] -= var33.field318;
                            var10002 = var12[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class164.field2654[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var6; var21++) {
                        int var22 = var21 - 5;
                        int var23 = var21 + 5;
                        if (var6 > var23) {
                            var16 += var8[var23];
                            var18 += var11[var23];
                            var20 += var10[var23];
                            var19 += var12[var23];
                            var17 += var9[var23];
                        }
                        if (var22 >= 0) {
                            var17 -= var9[var22];
                            var20 -= var10[var22];
                            var19 -= var12[var22];
                            var18 -= var11[var22];
                            var16 -= var8[var22];
                        }
                        if (var21 >= 0 && var19 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var18 == 0 ? 0 : class189.method1231(var20 / var19, var17 / var19, (byte) -121, var16 * 256 / var18);
                            if (var4[var13][var21] != 0) {
                                if (var15[var24] == null) {
                                    var15[var24] = class164.field2654[var13 >> 6][var24] = new int[4096];
                                }
                                int var26 = (var25 & 0x7F) + var3;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var2 + var25 & 0xFC00) + (var25 & 0x380) + var26;
                                var15[var24][class65.method409(63, var13) + class65.method409(var21 << 6, 4032)] = class15.field165[class168.method1089((byte) -88, var27, 96)];
                            } else if (var15[var24] != null) {
                                var15[var24][class65.method409(63, var13) + class65.method409(4032, var21 << 6)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static void method459(int arg0) {
        field1032 = null;
        if (arg0 != -1) {
            method463(57, (byte) -125);
        }
        field1041 = null;
        field1040 = null;
        field1048 = null;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public static final void method460(int arg0) {
        field1036++;
        while (class229.field4077.method1175(8, class76.field1096) >= 11) {
            int var1 = class229.field4077.method1170(11, (byte) -121);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class247.field4397[var1] == null) {
                var2 = true;
                class247.field4397[var1] = new class134();
                if (class198.field3522[var1] != null) {
                    class247.field4397[var1].method810(-4888, class198.field3522[var1]);
                }
            }
            class14.field153[class252.field4451++] = var1;
            class134 var3 = class247.field4397[var1];
            var3.field2055 = class171.field2879;
            int var4 = class219.field3936[class229.field4077.method1170(3, (byte) 122)];
            if (var2) {
                var3.field2077 = var3.field2096 = var4;
            }
            int var5 = class229.field4077.method1170(1, (byte) -111);
            if (var5 == 1) {
                class104.field1507[class148.field2336++] = var1;
            }
            int var6 = class229.field4077.method1170(5, (byte) 123);
            int var7 = class229.field4077.method1170(1, (byte) -43);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var8 = class229.field4077.method1170(5, (byte) 109);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method859(var7 == 1, (byte) 121, class102.field1477.field2102[0] + var6, class102.field1477.field2046[0] + var8);
        }
        class229.field4077.method1172((byte) -86);
        if (arg0 < 3) {
            field1030 = -17;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lec;III)V")
    public static final void method461(class178 arg0, int arg1, int arg2, int arg3) {
        field1043++;
        if (class118.field1698 != null || class160.field2574 || (arg0 == null || class85.method535(arg0, (byte) -115) == null)) {
            return;
        }
        class118.field1698 = arg0;
        class98.field1421 = class85.method535(arg0, (byte) -50);
        class193.field3402 = false;
        class41.field475 = arg1;
        class67.field956 = arg2;
        class157.field2540 = arg3;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    public final void method462(byte arg0) {
        field1035++;
        if (arg0 >= -119) {
            return;
        }
        int var2 = this.field1039;
        if (this.field1024 != null) {
            class145 var5 = this.field1024.method899(113);
            if (var5 == null) {
                this.field1039 = -1;
                this.field1022 = 0;
                this.field1044 = 0;
                this.field1046 = null;
                this.field1023 = 0;
            } else {
                this.field1046 = var5.field2227;
                this.field1022 = var5.field2260;
                this.field1023 = var5.field2283;
                this.field1039 = var5.field2235;
                this.field1044 = var5.field2245 * 128;
            }
        } else if (this.field1042 != null) {
            int var3 = class90.method554(this.field1042, 114);
            if (var2 != var3) {
                this.field1039 = var3;
                class111 var4 = this.field1042.field2648;
                if (var4.field1591 != null) {
                    var4 = var4.method659(43);
                }
                if (var4 == null) {
                    this.field1044 = 0;
                } else {
                    this.field1044 = var4.field1624 * 128;
                }
            }
        } else if (this.field1016 != null) {
            this.field1039 = class201.method1357(-101, this.field1016);
            this.field1044 = this.field1016.field1910 * 128;
        }
        if (this.field1039 != var2 && this.field1019 != null) {
            class161.field2589.method690(this.field1019);
            this.field1019 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)I")
    public static final int method463(int arg0, byte arg1) {
        field1037++;
        return arg1 <= 33 ? 89 : arg0 >> 17 & 0x7;
    }
}
