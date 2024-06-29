import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class641 extends class335 {

    @OriginalMember(owner = "client!iga", name = "F", descriptor = "I")
    private int field8840 = 0;

    @OriginalMember(owner = "client!iga", name = "U", descriptor = "[S")
    private short[] field8854 = new short[257];

    @OriginalMember(owner = "client!iga", name = "B", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!iga", name = "C", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!iga", name = "D", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!iga", name = "E", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!iga", name = "I", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!iga", name = "J", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!iga", name = "K", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!iga", name = "L", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!iga", name = "N", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!iga", name = "O", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!iga", name = "P", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!iga", name = "R", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!iga", name = "S", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!iga", name = "T", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!iga", name = "H", descriptor = "[I")
    private int[] field8842;

    @OriginalMember(owner = "client!iga", name = "Q", descriptor = "[I")
    private int[] field8850;

    @OriginalMember(owner = "client!iga", name = "G", descriptor = "[[I")
    private int[][] field8841;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZZ)V")
    public static final void method3545(boolean arg0, boolean arg1) {
        ++field8851;
        if (arg1) {
            if (class164.field2349 != -1) {
                class190.method1254(class164.field2349, !arg0);
            }
            for (class137 var2 = (class137) class152.field2079.method3053((byte) 105); var2 != null; var2 = (class137) class152.field2079.method3056(18113)) {
                if (!var2.method241(true)) {
                    var2 = (class137) class152.field2079.method3053((byte) 69);
                    if (var2 == null) {
                        break;
                    }
                }
                class3.method17(-1718294864, var2, true, false);
            }
            class164.field2349 = -1;
            class152.field2079 = new class546(8);
            class99.method562((byte) -125);
            class164.field2349 = class230.field2983;
            class166.method1012(34, false);
            class398.method2275(-1);
            class656.method3741(class164.field2349);
        }
        class188.field2614 = false;
        class299.field3960 = "";
        class213.field2815 = "";
        class442.method2497(-127);
        class689.field9739 = -1;
        class665.method3790((byte) -124, class420.field5510);
        class408.field5369 = new class573();
        class408.field5369.field3088[0] = class703.field9886 / 2;
        class408.field5369.field398 = class703.field9886 * 512 / 2;
        class408.field5369.field397 = class431.field5789 * 512 / 2;
        class147.field1980 = 0;
        class82.field946 = 0;
        class408.field5369.field3086[0] = class431.field5789 / 2;
        if (~class311.field4200 != -3) {
            class686.method3881(2048);
        } else {
            class82.field946 = class174.field2462 << 9;
            class147.field1980 = class252.field3316 << 9;
        }
        class382.method2189(arg0);
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(Z)V")
    public static final void method3546(boolean arg0) {
        for (int var1 = 0; ~class31.field440.length < ~var1; ++var1) {
            for (int var2 = 0; var2 < class31.field440[0].length; ++var2) {
                for (int var3 = 0; ~class31.field440[0][0].length < ~var3; ++var3) {
                    class31.field440[var1][var2][var3] = 0;
                }
            }
        }
        ++field8836;
        if (!arg0) {
            method3546(true);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field8840 = arg1.method930(arg2 + 321);
            this.field8841 = new int[arg1.method930(255)][2];
            for (int var4 = 0; ~this.field8841.length < ~var4; ++var4) {
                this.field8841[var4][0] = arg1.method963(arg2 + -55);
                this.field8841[var4][1] = arg1.method963(-126);
            }
        }
        ++field8844;
        if (arg2 != -66) {
            this.method3(true, 111);
        }
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(B)V")
    private final void method3547(byte arg0) {
        int var2 = this.field8840;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field8841.length + -1 && var4 >= this.field8841[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field8841[var5 + -1];
                    int[] var7 = this.field8841[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class245.field3211[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field8854[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field8841.length - 1) && this.field8841[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field8841[var14 + -1];
                    int[] var16 = this.field8841[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field8854[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field8841.length - 1 && ~var21 <= ~this.field8841[var22][0]; ++var22) {
                }
                int[] var23 = this.field8841[var22 + -1];
                int[] var24 = this.field8841[var22];
                int var25 = this.method3552(var22 + -2, (byte) 125)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3552(var22 + 1, (byte) 127)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 - (var27 - var26);
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var35 + var36 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field8854[var20] = (short) var38;
            }
        }
        if (arg0 < 32) {
            this.field8841 = null;
        }
        ++field8845;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V")
    public final void method317(byte arg0) {
        ++field8839;
        int var2 = 63 % ((58 - arg0) / 60);
        if (this.field8841 == null) {
            this.field8841 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field8841.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field8840 == 2) {
                this.method3551((byte) 117);
            }
            class420.method2371(10779);
            this.method3547((byte) 90);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ILqw;)V")
    public static final void method3548(int arg0, class329 arg1) {
        arg1.field4417 = null;
        ++field8847;
        int var2 = arg1.field4414.length;
        for (int var3 = 0; ~var2 < ~var3; ++var3) {
            arg1.field4414[var3].field9487 = false;
        }
        class204[] var4 = class538.field7389;
        synchronized (class538.field7389) {
            if (~var2 > ~class538.field7389.length && class421.field5525[var2] < 200) {
                class538.field7389[var2].method1300(arg1, arg0 ^ -2);
                int var10002 = class421.field5525[var2]++;
            }
        }
        if (arg0 != 1) {
            method3545(false, false);
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "()V")
    public class641() {
        super(1, true);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(BI)I")
    public static final int method3549(byte arg0, int arg1) {
        if (arg0 < 68) {
            method3550((byte) 39);
        }
        ++field8849;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "(B)V")
    public static final void method3550(byte arg0) {
        ++field8838;
        class315.method1841((byte) 68, class146.field1963, (long) class327.field4404);
        if (class164.field2349 != -1) {
            class327.method1904(class164.field2349, -1);
        }
        for (int var1 = 0; class629.field8707 > var1; ++var1) {
            if (class325.field4383[var1]) {
                class13.field166[var1] = true;
            }
            class14.field174[var1] = class325.field4383[var1];
            class325.field4383[var1] = false;
        }
        class297.field3932 = class327.field4404;
        if (~class164.field2349 != 0) {
            class629.field8707 = 0;
            class688.method3890(29326);
        }
        class146.field1963.method1044();
        class317.method1849((byte) -43, class146.field1963);
        if (arg0 >= -124) {
            method3550((byte) -101);
        }
        int var2 = class368.method2136(true);
        if (~var2 == 0) {
            var2 = class689.field9739;
        }
        if (~var2 == 0) {
            var2 = class420.field5510;
        }
        class665.method3790((byte) -97, var2);
        class498.field6849 = 0;
    }

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "(B)V")
    private final void method3551(byte arg0) {
        ++field8837;
        int[] var2 = this.field8841[0];
        int[] var3 = this.field8841[1];
        if (arg0 <= 84) {
            method3549((byte) -25, 118);
        }
        int[] var4 = this.field8841[this.field8841.length + -2];
        int[] var5 = this.field8841[this.field8841.length + -1];
        this.field8842 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
        this.field8850 = new int[] { var4[0] + var4[0] - var5[0], var4[1] + -var5[1] + var4[1] };
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IB)[I")
    private final int[] method3552(int arg0, byte arg1) {
        ++field8853;
        if (~arg0 > -1) {
            return this.field8842;
        } else if (arg1 <= 124) {
            return null;
        } else {
            return arg0 >= this.field8841.length ? this.field8850 : this.field8841[arg0];
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        ++field8852;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (!arg0) {
            this.field8842 = null;
        }
        if (super.field4525.field5435) {
            int[] var4 = this.method1969(0, arg1, -75);
            for (int var5 = 0; class649.field8968 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field8854[var6];
            }
        }
        return var3;
    }
}
