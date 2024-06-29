import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class232 extends class53 {

    @OriginalMember(owner = "client!f", name = "V", descriptor = "[S")
    private short[] field3924 = new short[512];

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    private int field3921 = 2;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    private int field3918 = 5;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    private int field3920 = 1;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "I")
    private int field3932 = 5;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "[B")
    private byte[] field3928 = new byte[512];

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    private int field3935 = 2048;

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "I")
    private int field3937 = 0;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "[I")
    public static int[] field3922 = new int[5];

    @OriginalMember(owner = "client!f", name = "X", descriptor = "[I")
    public static int[] field3926 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    public static int field3930 = -1;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "[I")
    public static int[] field3916;

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "[I")
    public static int[] field3934;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V", line = 5)
    public static final void method1693(byte arg0) {
        field3938++;
        if (class252.field4225 == 0) {
            return;
        }
        try {
            if (++class157.field2693 > 2000) {
                if (class35.field513 != null) {
                    class35.field513.method2048((byte) -67);
                    class35.field513 = null;
                }
                if (class121.field2034 >= 1) {
                    class252.field4225 = 0;
                    class139.field2377 = -5;
                    return;
                }
                if (class311.field5304 == class155.field2663) {
                    class311.field5304 = class117.field1992;
                } else {
                    class311.field5304 = class155.field2663;
                }
                class252.field4225 = 1;
                class157.field2693 = 0;
                class121.field2034++;
            }
            if (arg0 != 17) {
                return;
            }
            if (class252.field4225 == 1) {
                class96.field1572 = class210.field3585.method937(1, class311.field5305, class311.field5304);
                class252.field4225 = 2;
            }
            if (class252.field4225 == 2) {
                if (class96.field1572.field1330 == 2) {
                    throw new IOException();
                }
                if (class96.field1572.field1330 != 1) {
                    return;
                }
                class35.field513 = new class294((Socket) class96.field1572.field1329, class210.field3585);
                class96.field1572 = null;
                class35.field513.method2043(class89.field1470.field997, class89.field1470.field1012, 0, arg0 ^ 0xFFFF84D9);
                if (class64.field1112 != null) {
                    class64.field1112.method1484(99);
                }
                if (class176.field2965 != null) {
                    class176.field2965.method1484(96);
                }
                int var1 = class35.field513.method2045(31);
                if (class64.field1112 != null) {
                    class64.field1112.method1484(arg0 ^ 0x46);
                }
                if (class176.field2965 != null) {
                    class176.field2965.method1484(-66);
                }
                if (var1 != 21) {
                    class139.field2377 = var1;
                    class252.field4225 = 0;
                    class35.field513.method2048((byte) -54);
                    class35.field513 = null;
                    return;
                }
                class252.field4225 = 3;
            }
            if (class252.field4225 == 3) {
                if (class35.field513.method2042(-78) < 1) {
                    return;
                }
                class41.field657 = new class75[class35.field513.method2045(92)];
                class252.field4225 = 4;
            }
            if (class252.field4225 == 4) {
                if (class35.field513.method2042(arg0 - 77) < class41.field657.length * 8) {
                    return;
                }
                class136.field2328.field1012 = 0;
                class35.field513.method2047(class136.field2328.field997, 0, class41.field657.length * 8, -3532);
                for (int var2 = 0; var2 < class41.field657.length; var2++) {
                    class41.field657[var2] = class260.method1855(class136.field2328.method499((byte) -54), false);
                }
                class139.field2377 = 21;
                class252.field4225 = 0;
                class35.field513.method2048((byte) -52);
                class35.field513 = null;
                return;
            }
        } catch (IOException var4) {
            if (class35.field513 != null) {
                class35.field513.method2048((byte) -106);
                class35.field513 = null;
            }
            if (class121.field2034 >= 1) {
                class139.field2377 = -4;
                class252.field4225 = 0;
            } else {
                class252.field4225 = 1;
                if (class311.field5304 == class155.field2663) {
                    class311.field5304 = class117.field1992;
                } else {
                    class311.field5304 = class155.field2663;
                }
                class157.field2693 = 0;
                class121.field2034++;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILwa;SILwa;IJ)V", line = 161)
    public static final void method1694(int arg0, class75 arg1, short arg2, int arg3, class75 arg4, int arg5, long arg6) {
        field3927++;
        if (class153.field2625 || ~class126.field2188 <= arg0) {
            return;
        }
        class272.field4692[class126.field2188] = arg1;
        class94.field1521[class126.field2188] = arg4;
        class99.field1646[class126.field2188] = arg2;
        class86.field1417[class126.field2188] = arg6;
        class171.field2884[class126.field2188] = arg3;
        class16.field216[class126.field2188] = arg5;
        class126.field2188++;
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V", line = 186)
    private final void method1695(int arg0) {
        if (arg0 >= -108) {
            this.field3935 = -110;
        }
        Random var2 = new Random((long) this.field3937);
        this.field3924 = new short[512];
        field3917++;
        if (this.field3935 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field3924[var3] = (short) class29.method197(var2, true, this.field3935);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILug;BII)V", line = 217)
    public static final void method1696(int arg0, int arg1, class290 arg2, byte arg3, int arg4, int arg5) {
        field3929++;
        if (arg3 != -111 || arg2.field4961 == -1 && arg2.field4971 == null) {
            return;
        }
        int var6 = 0;
        if (arg2.field4972 < arg0) {
            var6 += arg0 - arg2.field4972;
        } else if (arg2.field4968 > arg0) {
            var6 += arg2.field4968 - arg0;
        }
        if (arg4 > arg2.field4979) {
            var6 += arg4 - arg2.field4979;
        } else if (arg2.field4974 > arg4) {
            var6 += arg2.field4974 - arg4;
        }
        if (arg2.field4977 == 0 || arg2.field4977 < var6 - 64 || class285.field4909 == 0 || arg2.field4980 != arg1) {
            if (arg2.field4975 != null) {
                class94.field1527.method1790(arg2.field4975);
                arg2.field4975 = null;
            }
            if (arg2.field4978 != null) {
                class94.field1527.method1790(arg2.field4978);
                arg2.field4978 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg2.field4977 - var6) * class285.field4909 / arg2.field4977;
        if (arg2.field4975 != null) {
            arg2.field4975.method1371(var7);
        } else if (arg2.field4961 >= 0) {
            class179 var8 = class179.method1317(class126.field2187, arg2.field4961, 0);
            if (var8 != null) {
                class227 var9 = var8.method1319().method1664(class252.field4232);
                class183 var10 = class183.method1377(var9, 100, var7);
                var10.method1385(-1);
                class94.field1527.method1789(var10);
                arg2.field4975 = var10;
            }
        }
        if (arg2.field4978 != null) {
            arg2.field4978.method1371(var7);
            if (!arg2.field4978.method1524(121)) {
                arg2.field4978 = null;
            }
        } else if (arg2.field4971 != null && (arg2.field4966 -= arg5) <= 0) {
            int var11 = (int) (Math.random() * (double) arg2.field4971.length);
            class179 var12 = class179.method1317(class126.field2187, arg2.field4971[var11], 0);
            if (var12 != null) {
                class227 var13 = var12.method1319().method1664(class252.field4232);
                class183 var14 = class183.method1377(var13, 100, var7);
                var14.method1385(0);
                class94.field1527.method1789(var14);
                arg2.field4978 = var14;
                arg2.field4966 = (int) ((double) (arg2.field4960 - arg2.field4965) * Math.random()) + arg2.field4965;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 756)
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILre;I)V", line = 354)
    public static final void method1697(int arg0, int arg1, class262 arg2, int arg3) {
        field3925++;
        if (class217.field3718 != 0 && class217.field3718 != 3 || arg0 != 3 || !arg2.method1866(-2)) {
            return;
        }
        int var4 = arg2.field4511[arg3];
        if (var4 > arg1 || arg1 > arg2.field4470[arg3] + var4) {
            return;
        }
        int var5 = arg3 - arg2.field4517 / 2;
        int var6 = class290.field4981 + class249.field4191 & 0x7FF;
        int var7 = arg1 - arg2.field4531 / 2;
        int var8 = class21.field288[var6];
        int var9 = (class14.field191 + 256) * var8 >> 8;
        int var10 = class21.field286[var6];
        int var11 = (class14.field191 + 256) * var10 >> 8;
        int var12 = var5 * var11 - (var7 * var9) >> 11;
        int var13 = class279.field4831.field3218 - var12 >> 7;
        int var14 = var5 * var9 + var7 * var11 >> 11;
        int var15 = class279.field4831.field3259 + var14 >> 7;
        if (class250.field4201 > 0 && class163.field2767[82] && class163.field2767[81]) {
            class178.method1315(class67.field1174, class175.field2939 + var13, class275.field4737 - -var15, arg0 - 2);
            return;
        }
        boolean var16 = class112.method870(0, class279.field4831.field3236[0], (byte) 111, 0, true, 0, 1, 0, var15, 0, class279.field4831.field3205[0], var13);
        if (!var16) {
            return;
        }
        class89.field1470.method518(arg0 + 121, var7);
        class89.field1470.method518(arg0 ^ 0x7E, var5);
        class89.field1470.method503(-597878072, class290.field4981);
        class89.field1470.method518(127, 57);
        class89.field1470.method518(125, class249.field4191);
        class89.field1470.method518(arg0 + 101, class14.field191);
        class89.field1470.method518(arg0 ^ 0x76, 89);
        class89.field1470.method503(arg0 - 597878075, class279.field4831.field3259);
        class89.field1470.method503(-597878072, class279.field4831.field3218);
        class89.field1470.method518(106, class118.field1998);
        class89.field1470.method518(118, 63);
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V", line = 422)
    public static void method1698(int arg0) {
        field3926 = null;
        field3916 = null;
        if (arg0 != -31595) {
            method1693((byte) -83);
        }
        field3922 = null;
        field3934 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILja;Z)V", line = 436)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field3933++;
        if (arg0 == 0) {
            this.field3918 = this.field3932 = arg1.method501(0);
        } else if (arg0 == 1) {
            this.field3937 = arg1.method501(0);
        } else if (arg0 == 2) {
            this.field3935 = arg1.method485((byte) -2);
        } else if (arg0 == 3) {
            this.field3921 = arg1.method501(0);
        } else if (arg0 == 4) {
            this.field3920 = arg1.method501(0);
        } else if (arg0 == 5) {
            this.field3918 = arg1.method501(0);
        } else if (arg0 == 6) {
            this.field3932 = arg1.method501(0);
        }
        if (!arg2) {
            method1697(-74, -104, (class262) null, -108);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 514)
    public final void method56(byte arg0) {
        this.field3928 = class152.method1162(this.field3937, 0);
        if (arg0 != -79) {
            this.method1695(103);
        }
        this.method1695(-110);
        field3919++;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)[I", line = 540)
    public final int[] method59(int arg0, int arg1) {
        field3923++;
        int[] var3 = this.field878.method1603(arg1, (byte) 110);
        if (this.field878.field3749) {
            int var4 = (class50.field814[arg1] * this.field3932) + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class269.field4644; var7++) {
                class147.field2553 = Integer.MAX_VALUE;
                class117.field1993 = Integer.MAX_VALUE;
                class167.field2810 = Integer.MAX_VALUE;
                class73.field1227 = Integer.MAX_VALUE;
                int var8 = (class67.field1178[var7] * this.field3918) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field3928[(this.field3932 > var11 ? var11 : var11 - this.field3932) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field3928[(var13 < this.field3918 ? var13 : var13 - this.field3918) + var12 & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field3924[var14] - (var13 << 12);
                        int var16 = var4 - this.field3924[var27] - (var11 << 12);
                        int var17 = this.field3920;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 < 0 ? -var16 : var16;
                            int var25 = var15 >= 0 ? var15 : -var15;
                            var18 = var24 < var25 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var19 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var20 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var21 = var19 + var20;
                            var18 = var21 * var21 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var16 * var16;
                            int var23 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class73.field1227 > var18) {
                            class147.field2553 = class117.field1993;
                            class117.field1993 = class167.field2810;
                            class167.field2810 = class73.field1227;
                            class73.field1227 = var18;
                        } else if (class167.field2810 > var18) {
                            class147.field2553 = class117.field1993;
                            class117.field1993 = class167.field2810;
                            class167.field2810 = var18;
                        } else if (class117.field1993 > var18) {
                            class147.field2553 = class117.field1993;
                            class117.field1993 = var18;
                        } else if (class147.field2553 > var18) {
                            class147.field2553 = var18;
                        }
                    }
                }
                int var26 = this.field3921;
                if (var26 == 0) {
                    var3[var7] = class73.field1227;
                } else if (var26 == 1) {
                    var3[var7] = class167.field2810;
                } else if (var26 == 3) {
                    var3[var7] = class117.field1993;
                } else if (var26 == 4) {
                    var3[var7] = class147.field2553;
                } else if (var26 == 2) {
                    var3[var7] = class167.field2810 - class73.field1227;
                }
            }
        }
        if (arg0 != -15196) {
            this.method59(-94, -105);
        }
        return var3;
    }
}
