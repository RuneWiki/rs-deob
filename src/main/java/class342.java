import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class342 extends class306 {

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    private int field5431 = 32768;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "[Lsg;")
    public static class44[] field5422;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIILio;IJ)Z", line = 4)
    public static final boolean method2346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class294 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class237.method1646(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V", line = 22)
    public final void method43(byte arg0) {
        class105.method682((byte) -113);
        field5424++;
        if (arg0 >= -103) {
            this.field5431 = -70;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 32)
    public class342() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[[I", line = 37)
    public final int[][] method681(int arg0, byte arg1) {
        if (arg1 != -119) {
            this.field5431 = 32;
        }
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179) {
            int[] var4 = this.method2161(arg0, (byte) 116, 1);
            int[] var5 = this.method2161(arg0, (byte) 126, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class31.field367; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field5431 >> 12;
                int var12 = class304.field4741[var10] * var11 >> 12;
                int var13 = class323.field5147[var10] * var11 >> 12;
                int var14 = class311.field4878 & (var13 >> 12) + var9;
                int var15 = (var12 >> 12) + arg0 & class56.field663;
                int[][] var16 = this.method2160(0, (byte) -49, var15);
                var6[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        field5429++;
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILlf;)V", line = 92)
    public static final void method2347(int arg0, class143 arg1) {
        field5428++;
        if (arg1.field2260.length - arg1.field2295 < 1) {
            return;
        }
        int var2 = arg1.method1043(true);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg1.field2260.length - arg1.field2295) < var3) {
            return;
        }
        class164.field2522 = arg1.method1043(true);
        if (class164.field2522 < 1) {
            class164.field2522 = 1;
        } else if (class164.field2522 > 4) {
            class164.field2522 = 4;
        }
        class361.method2521(-53, ~arg1.method1043(true) == -2);
        class38.field430 = arg1.method1043(true) == 1;
        class353.field5629 = arg1.method1043(true) == 1;
        class13.field136 = arg1.method1043(true) == 1;
        class327.field5233 = arg1.method1043(true) == 1;
        class10.field104 = arg1.method1043(true) == 1;
        class139.field2087 = arg1.method1043(true) == 1;
        class171.field2601 = arg1.method1043(true) == 1;
        class16.field164 = arg1.method1043(true);
        if (class16.field164 > 2) {
            class16.field164 = 2;
        }
        if (var2 < 2) {
            class290.field4566 = arg1.method1043(true) == 1;
            arg1.method1043(true);
        } else {
            class290.field4566 = arg1.method1043(true) == 1;
        }
        class76.field993 = arg1.method1043(true) == 1;
        class347.field5512 = arg1.method1043(true) == 1;
        client.field4441 = arg1.method1043(true);
        if (client.field4441 > 2) {
            client.field4441 = 2;
        }
        class24.field285 = client.field4441;
        class90.field1192 = arg1.method1043(true) == 1;
        class189.field2847 = arg1.method1043(true);
        if (class189.field2847 > 127) {
            class189.field2847 = 127;
        }
        class31.field365 = arg1.method1043(true);
        class213.field3240 = arg1.method1043(true);
        if (class213.field3240 > 127) {
            class213.field3240 = 127;
        }
        if (var2 >= 1) {
            class352.field5609 = arg1.method1051(1);
            class226.field3413 = arg1.method1051(1);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1043(true);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1043(true);
            if (class357.field5667 < 96) {
                var4 = 0;
            }
            class141.method986(var4);
        }
        if (~var2 <= arg0) {
            class261.field4133 = arg1.method1057(-109);
        }
        if (var2 >= 6) {
            class161.field2482 = arg1.method1043(true);
        }
        if (var2 >= 7) {
            class283.field4519 = arg1.method1043(true) == 1;
        }
        if (var2 >= 8) {
            class222.field3355 = arg1.method1043(true) == 1;
        }
        if (var2 >= 9) {
            class75.field966 = arg1.method1043(true);
        }
        if (var2 >= 10) {
            class151.field2386 = arg1.method1043(true) != 0;
        }
        if (var2 >= 11) {
            class178.field2680 = arg1.method1043(true) != 0;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)V", line = 255)
    public static void method2348(boolean arg0) {
        if (arg0) {
            field5422 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lac;", line = 267)
    public static final class184 method2349(byte arg0, int arg1) {
        if (arg0 != -91) {
            method2351(-32, (char) 65509);
        }
        class184 var2 = (class184) class122.field1686.method380(arg0 + 91, (long) arg1);
        field5426++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class111.field1549.method100(30, arg1, (byte) -107);
        class184 var4 = new class184();
        if (var3 != null) {
            var4.method1269(24344, arg1, new class143(var3));
        }
        class122.field1686.method377((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V", line = 291)
    public static final void method2350(int arg0) {
        int var1 = class282.field4499.method307(8, true);
        if (arg0 != 2712) {
            return;
        }
        field5427++;
        if (var1 < class302.field4704) {
            for (int var2 = var1; var2 < class302.field4704; var2++) {
                class351.field5608[class44.field492++] = class80.field1067[var2];
            }
        }
        if (class302.field4704 < var1) {
            throw new RuntimeException("gppov1");
        }
        class302.field4704 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class80.field1067[var3];
            class67 var5 = class105.field1443[var4];
            int var6 = class282.field4499.method307(1, true);
            if (var6 == 0) {
                class80.field1067[class302.field4704++] = var4;
                var5.field3772 = class102.field1381;
            } else {
                int var7 = class282.field4499.method307(2, true);
                if (var7 == 0) {
                    class80.field1067[class302.field4704++] = var4;
                    var5.field3772 = class102.field1381;
                    class127.field1864[class218.field3280++] = var4;
                } else if (var7 == 1) {
                    class80.field1067[class302.field4704++] = var4;
                    var5.field3772 = class102.field1381;
                    int var8 = class282.field4499.method307(3, true);
                    var5.method1710(var8, 1, (byte) -102);
                    int var9 = class282.field4499.method307(1, true);
                    if (var9 == 1) {
                        class127.field1864[class218.field3280++] = var4;
                    }
                } else if (var7 == 2) {
                    class80.field1067[class302.field4704++] = var4;
                    var5.field3772 = class102.field1381;
                    if (class282.field4499.method307(1, true) == 1) {
                        int var11 = class282.field4499.method307(3, true);
                        var5.method1710(var11, 2, (byte) -102);
                        int var12 = class282.field4499.method307(3, true);
                        var5.method1710(var12, 2, (byte) -102);
                    } else {
                        int var10 = class282.field4499.method307(3, true);
                        var5.method1710(var10, 0, (byte) -102);
                    }
                    int var13 = class282.field4499.method307(1, true);
                    if (var13 == 1) {
                        class127.field1864[class218.field3280++] = var4;
                    }
                } else if (var7 == 3) {
                    class351.field5608[class44.field492++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILlf;I)V", line = 413)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field5431 = arg1.method1051(1) << 4;
        } else if (arg2 == 1) {
            this.field4759 = arg1.method1043(true) == 1;
        }
        field5430++;
        if (arg0 != -15334) {
            field5422 = (class44[]) null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[I", line = 442)
    public final int[] method47(int arg0, int arg1) {
        field5423++;
        int[] var3 = this.field4757.method903(arg0, -67);
        if (arg1 != -1546337535) {
            field5422 = (class44[]) null;
        }
        if (this.field4757.field1898) {
            int[] var4 = this.method2161(arg0, (byte) 117, 1);
            int[] var5 = this.method2161(arg0, (byte) 119, 2);
            for (int var6 = 0; var6 < class31.field367; var6++) {
                int var7 = (var4[var6] & 0xFFD) >> 4;
                int var8 = var5[var6] * this.field5431 >> 12;
                int var9 = class323.field5147[var7] * var8 >> 12;
                int var10 = class304.field4741[var7] * var8 >> 12;
                int var11 = class311.field4878 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg0 & class56.field663;
                int[] var13 = this.method2161(var12, (byte) 119, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IC)C", line = 490)
    public static final char method2351(int arg0, char arg1) {
        field5425++;
        return (char) arg0 == arg1 || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }
}
