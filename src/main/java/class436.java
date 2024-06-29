import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class436 implements Runnable {

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    private int field6122 = 0;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    private int field6120 = 0;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field6121;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    private int field6118;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "[B")
    private byte[] field6115;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field6119;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "Z")
    public static boolean field6123 = false;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field6117;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)V")
    public final void method2473(boolean arg0) {
        this.field6121 = new class410();
        field6126++;
        if (!arg0) {
            this.field6115 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "run", descriptor = "()V")
    public final void run() {
        field6124++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field6117 != null) {
                        return;
                    }
                    if (this.field6122 > this.field6120) {
                        var2 = this.field6120 + this.field6118 - this.field6122;
                    } else {
                        var2 = this.field6120 - this.field6122;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                if (this.field6122 + var2 > this.field6118) {
                    int var3 = this.field6118 - this.field6122;
                    this.field6121.write(this.field6115, this.field6122, var3);
                    this.field6121.write(this.field6115, 0, var2 - var3);
                } else {
                    this.field6121.write(this.field6115, this.field6122, var2);
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field6117 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field6122 = (this.field6122 + var2) % this.field6118;
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IBILem;)V")
    public static final void method2474(int arg0, byte arg1, int arg2, class227 arg3) {
        field6113++;
        if (arg3 == null || class139.field1783.field1438 == arg3) {
            return;
        }
        int var4 = arg3.field2953;
        int var5 = arg3.field2951;
        int var6 = arg3.field2948;
        int var7 = (int) arg3.field2945;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg3.field2945;
        if (var6 == 1002) {
            class698.field9826 = 2;
            class703.field9873 = arg0;
            class96.field1251 = 0;
            class68.field750 = arg2;
            class706 var10 = (class706) class681.field9475.method2552((long) var7, -1);
            if (var10 != null) {
                class215 var11 = var10.field9890;
                class274 var12 = var11.field2589;
                if (var12.field3616 != null) {
                    var12 = var12.method1637(class386.field5455, (byte) 45);
                }
                if (var12 != null) {
                    class598.field8326++;
                    class103 var13 = class752.method4186(260, class215.field2595, class449.field6285);
                    var13.field1379.method3423(var12.field3602, 1571862888);
                    class27.method104(false, var13);
                }
            }
        }
        if (var6 == 51) {
            class83 var14 = class361.field4793[var7];
            if (var14 != null) {
                class96.field1251 = 0;
                class698.field9826 = 2;
                class703.field9873 = arg0;
                class617.field8653++;
                class68.field750 = arg2;
                class103 var15 = class752.method4186(arg1 ^ 0x14A, class519.field6980, class449.field6285);
                var15.field1379.method3437(var7, 128);
                var15.field1379.method3430(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) 107);
                class27.method104(false, var15);
                class556.method3152(0, 0, var14.method543(0), -2, 0, var14.field899[0], var14.field898[0], true, var14.method543(0));
            }
        }
        if (var6 == 45) {
            class83 var16 = class361.field4793[var7];
            if (var16 != null) {
                class68.field750 = arg2;
                class96.field1251 = 0;
                class68.field742++;
                class698.field9826 = 2;
                class703.field9873 = arg0;
                class103 var17 = class752.method4186(260, class201.field2389, class449.field6285);
                var17.field1379.method3405(class290.field3843.method1426(82, 5503) ? 1 : 0, -102);
                var17.field1379.method3423(var7, 1571862888);
                class27.method104(false, var17);
                class556.method3152(0, 0, var16.method543(0), -2, arg1 - 78, var16.field899[0], var16.field898[0], true, var16.method543(0));
            }
        }
        if (var6 == 58) {
            class703.field9873 = arg0;
            class68.field750 = arg2;
            class698.field9826 = 2;
            class213.field2552++;
            class96.field1251 = 0;
            class103 var18 = class752.method4186(260, class353.field4714, class449.field6285);
            var18.field1379.method3399((byte) 127, class631.field8779);
            var18.field1379.method3437(class133.field1704 + var5, 128);
            var18.field1379.method3437(var7, 128);
            var18.field1379.method3393(class290.field3843.method1426(82, 5503) ? 1 : 0, 66);
            var18.field1379.method3437(class169.field2109, 128);
            var18.field1379.method3394(class99.field1313 + var4, 17624);
            var18.field1379.method3437(class355.field4735, 128);
            class27.method104(false, var18);
            class178.method1013(-19181, var5, var4);
        }
        if (var6 == 1011 || var6 == 1003 || var6 == 1001 || var6 == 1010 || var6 == 1004) {
            class594.method3291(-1004, var6, var4, var7);
        }
        if (var6 == 2) {
            class698.field9826 = 2;
            class703.field9873 = arg0;
            class68.field750 = arg2;
            class96.field1251 = 0;
            class568.field8002++;
            class103 var19 = class752.method4186(arg1 + 182, class15.field111, class449.field6285);
            var19.field1379.method3394(class99.field1313 + var4, 17624);
            var19.field1379.method3394(var7, 17624);
            var19.field1379.method3381(class133.field1704 + var5, (byte) 126);
            var19.field1379.method3443(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) 112);
            class27.method104(false, var19);
            class178.method1013(-19181, var5, var4);
        }
        if (var6 == 50) {
            class510.field6886++;
            class96.field1251 = 0;
            class68.field750 = arg2;
            class703.field9873 = arg0;
            class698.field9826 = 2;
            class103 var20 = class752.method4186(260, class684.field9523, class449.field6285);
            var20.field1379.method3444(class631.field8779, 1046032984);
            var20.field1379.method3437(class355.field4735, 128);
            var20.field1379.method3423(class169.field2109, 1571862888);
            var20.field1379.method3423(class99.field1313 + var4, arg1 ^ 0x5DB0B926);
            var20.field1379.method3405(class290.field3843.method1426(82, 5503) ? 1 : 0, arg1 - 112);
            var20.field1379.method3381((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 126);
            var20.field1379.method3437(class133.field1704 + var5, arg1 + 50);
            class27.method104(false, var20);
            class364.method2082(-23, var8, var4, var5);
        }
        if (var6 == 11) {
            class706 var21 = (class706) class681.field9475.method2552((long) var7, -1);
            if (var21 != null) {
                class703.field9873 = arg0;
                class51.field531++;
                class215 var22 = var21.field9890;
                class96.field1251 = 0;
                class68.field750 = arg2;
                class698.field9826 = 2;
                class103 var23 = class752.method4186(arg1 + 182, class270.field3569, class449.field6285);
                var23.field1379.method3423(var7, 1571862888);
                var23.field1379.method3430(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) 35);
                class27.method104(false, var23);
                class556.method3152(0, 0, var22.method543(0), -2, 0, var22.field899[0], var22.field898[0], true, var22.method543(0));
            }
        }
        if (var6 == 20) {
            class83 var24 = class361.field4793[var7];
            if (var24 != null) {
                class68.field750 = arg2;
                class96.field1251 = 0;
                class698.field9826 = 2;
                class703.field9873 = arg0;
                class452.field6300++;
                class103 var25 = class752.method4186(arg1 + 182, class110.field1466, class449.field6285);
                var25.field1379.method3394(var7, 17624);
                var25.field1379.method3405(class290.field3843.method1426(82, 5503) ? 1 : 0, -37);
                class27.method104(false, var25);
                class556.method3152(0, 0, var24.method543(0), -2, arg1 - 78, var24.field899[0], var24.field898[0], true, var24.method543(arg1 ^ 0x4E));
            }
        }
        if (var6 == 5) {
            class83 var26 = class361.field4793[var7];
            if (var26 != null) {
                class698.field9826 = 2;
                client.field4108++;
                class68.field750 = arg2;
                class96.field1251 = 0;
                class703.field9873 = arg0;
                class103 var27 = class752.method4186(260, class505.field6856, class449.field6285);
                var27.field1379.method3437(var7, 128);
                var27.field1379.method3381(class355.field4735, (byte) 126);
                var27.field1379.method3444(class631.field8779, 1046032984);
                var27.field1379.method3430(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) -128);
                var27.field1379.method3381(class169.field2109, (byte) 126);
                class27.method104(false, var27);
                class556.method3152(0, 0, var26.method543(0), -2, 0, var26.field899[0], var26.field898[0], true, var26.method543(arg1 ^ 0x4E));
            }
        }
        if (var6 == 19) {
            class83 var28 = class361.field4793[var7];
            if (var28 != null) {
                class511.field6902++;
                class703.field9873 = arg0;
                class96.field1251 = 0;
                class698.field9826 = 2;
                class68.field750 = arg2;
                class103 var29 = class752.method4186(260, class284.field3759, class449.field6285);
                var29.field1379.method3381(var7, (byte) 126);
                var29.field1379.method3443(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) 112);
                class27.method104(false, var29);
                class556.method3152(0, 0, var28.method543(0), -2, 0, var28.field899[0], var28.field898[0], true, var28.method543(arg1 - 78));
            }
        }
        if (var6 == 30) {
            class703.field9873 = arg0;
            class109.field1450++;
            class698.field9826 = 2;
            class96.field1251 = 0;
            class68.field750 = arg2;
            class103 var30 = class752.method4186(arg1 ^ 0x14A, class235.field3090, class449.field6285);
            var30.field1379.method3394(class133.field1704 + var5, 17624);
            var30.field1379.method3437(var7, 128);
            var30.field1379.method3394(class99.field1313 + var4, arg1 ^ 0x4496);
            var30.field1379.method3430(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) 126);
            class27.method104(false, var30);
            class178.method1013(arg1 - 19259, var5, var4);
        }
        if (var6 == 47) {
            class83 var31 = class361.field4793[var7];
            if (var31 != null) {
                class68.field750 = arg2;
                class488.field6685++;
                class703.field9873 = arg0;
                class698.field9826 = 2;
                class96.field1251 = 0;
                class103 var32 = class752.method4186(260, class735.field10257, class449.field6285);
                var32.field1379.method3405(class290.field3843.method1426(82, arg1 + 5425) ? 1 : 0, -52);
                var32.field1379.method3423(var7, 1571862888);
                class27.method104(false, var32);
                class556.method3152(0, 0, var31.method543(0), -2, 0, var31.field899[0], var31.field898[0], true, var31.method543(0));
            }
        }
        if (var6 == 16) {
            class68.field750 = arg2;
            class703.field9873 = arg0;
            class96.field1251 = 0;
            class163.field2047++;
            class698.field9826 = 2;
            class103 var33 = class752.method4186(arg1 + 182, class303.field4088, class449.field6285);
            var33.field1379.method3394(var4 + class99.field1313, 17624);
            var33.field1379.method3394(class133.field1704 + var5, arg1 + 17546);
            var33.field1379.method3381((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 126);
            var33.field1379.method3430(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) 74);
            class27.method104(false, var33);
            class364.method2082(-23, var8, var4, var5);
        }
        if (var6 == 3) {
            class83 var34 = class361.field4793[var7];
            if (var34 != null) {
                class703.field9873 = arg0;
                class698.field9826 = 2;
                class68.field750 = arg2;
                class96.field1251 = 0;
                class340.field4581++;
                class103 var35 = class752.method4186(260, class414.field5852, class449.field6285);
                var35.field1379.method3443(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) 112);
                var35.field1379.method3423(var7, 1571862888);
                class27.method104(false, var35);
                class556.method3152(0, 0, var34.method543(0), -2, arg1 - 78, var34.field899[0], var34.field898[0], true, var34.method543(0));
            }
        }
        if (var6 == 8) {
            class698.field9826 = 2;
            class703.field9873 = arg0;
            class14.field100++;
            class68.field750 = arg2;
            class96.field1251 = 0;
            class103 var36 = class752.method4186(260, class105.field1405, class449.field6285);
            var36.field1379.method3381(class99.field1313 + var4, (byte) 126);
            var36.field1379.method3437(Integer.MAX_VALUE & (int) (var8 >>> 32), 128);
            var36.field1379.method3430(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) -124);
            var36.field1379.method3437(class133.field1704 + var5, 128);
            class27.method104(false, var36);
            class364.method2082(-23, var8, var4, var5);
        }
        if (var6 == 17) {
            class706 var37 = (class706) class681.field9475.method2552((long) var7, -1);
            if (var37 != null) {
                class215 var38 = var37.field9890;
                class421.field5895++;
                class68.field750 = arg2;
                class698.field9826 = 2;
                class96.field1251 = 0;
                class703.field9873 = arg0;
                class103 var39 = class752.method4186(260, class425.field5991, class449.field6285);
                var39.field1379.method3423(var7, 1571862888);
                var39.field1379.method3430(class290.field3843.method1426(82, arg1 ^ 0x1531) ? 1 : 0, (byte) 37);
                class27.method104(false, var39);
                class556.method3152(0, 0, var38.method543(0), -2, 0, var38.field899[0], var38.field898[0], true, var38.method543(0));
            }
        }
        if (var6 == 9 && class414.field5851 == null) {
            class135.method845(var4, arg1 ^ 0x1F, var5);
            class414.field5851 = class408.method2359((byte) 72, var5, var4);
            class277.method1652(1, class414.field5851);
        }
        if (var6 == 59) {
            class218 var40 = class408.method2359((byte) 72, var5, var4);
            if (var40 != null) {
                class624.method3526(false, var40);
            }
        }
        if (var6 == 13) {
            class68.field750 = arg2;
            class703.field9873 = arg0;
            class96.field1251 = 0;
            class376.field5224++;
            class698.field9826 = 2;
            class103 var41 = class752.method4186(260, class202.field2397, class449.field6285);
            var41.field1379.method3430(class290.field3843.method1426(82, arg1 ^ 0x1531) ? 1 : 0, (byte) 32);
            var41.field1379.method3381(var4 + class99.field1313, (byte) 126);
            var41.field1379.method3394(var7, 17624);
            var41.field1379.method3437(var5 + class133.field1704, 128);
            class27.method104(false, var41);
            class178.method1013(-19181, var5, var4);
        }
        if (var6 == 49 || var6 == 1006) {
            class461.method2566(var7, var4, arg3.field2950, -124, var5);
        }
        if (var6 == 48) {
            class706 var42 = (class706) class681.field9475.method2552((long) var7, arg1 - 79);
            if (var42 != null) {
                class68.field750 = arg2;
                class698.field9826 = 2;
                class215 var43 = var42.field9890;
                class703.field9873 = arg0;
                class513.field6947++;
                class96.field1251 = 0;
                class103 var44 = class752.method4186(260, class130.field1677, class449.field6285);
                var44.field1379.method3399((byte) 125, class631.field8779);
                var44.field1379.method3394(class355.field4735, arg1 + 17546);
                var44.field1379.method3423(var7, arg1 ^ 0x5DB0B926);
                var44.field1379.method3405(class290.field3843.method1426(82, 5503) ? 1 : 0, -53);
                var44.field1379.method3394(class169.field2109, arg1 + 17546);
                class27.method104(false, var44);
                class556.method3152(0, 0, var43.method543(0), -2, arg1 ^ 0x4E, var43.field899[0], var43.field898[0], true, var43.method543(0));
            }
        }
        if (var6 == 1009) {
            class703.field9873 = arg0;
            class68.field750 = arg2;
            class516.field6963++;
            class698.field9826 = 2;
            class96.field1251 = 0;
            class103 var45 = class752.method4186(260, class582.field8159, class449.field6285);
            var45.field1379.method3423(var7, arg1 + 1571862810);
            class27.method104(false, var45);
        }
        if (arg1 != 78) {
            method2474(-42, (byte) 33, 80, null);
        }
        if (var6 == 57) {
            client.field4108++;
            class698.field9826 = 2;
            class68.field750 = arg2;
            class703.field9873 = arg0;
            class96.field1251 = 0;
            class103 var46 = class752.method4186(arg1 ^ 0x14A, class505.field6856, class449.field6285);
            var46.field1379.method3437(class653.field9086.field817, arg1 ^ 0xCE);
            var46.field1379.method3381(class355.field4735, (byte) 126);
            var46.field1379.method3444(class631.field8779, 1046032984);
            var46.field1379.method3430(class290.field3843.method1426(82, arg1 ^ 0x1531) ? 1 : 0, (byte) -72);
            var46.field1379.method3381(class169.field2109, (byte) 126);
            class27.method104(false, var46);
        }
        if (var6 == 15) {
            class68.field750 = arg2;
            class411.field5797++;
            class96.field1251 = 0;
            class698.field9826 = 2;
            class703.field9873 = arg0;
            class103 var47 = class752.method4186(260, class650.field9067, class449.field6285);
            var47.field1379.method3394(Integer.MAX_VALUE & (int) (var8 >>> 32), 17624);
            var47.field1379.method3393(class290.field3843.method1426(82, 5503) ? 1 : 0, -108);
            var47.field1379.method3437(class99.field1313 + var4, arg1 ^ 0xCE);
            var47.field1379.method3381(class133.field1704 + var5, (byte) 126);
            class27.method104(false, var47);
            class364.method2082(arg1 - 101, var8, var4, var5);
        }
        if (var6 == 6) {
            if (class596.field8304 > 0 && class290.field3843.method1426(82, arg1 ^ 0x1531) && class290.field3843.method1426(81, arg1 + 5425)) {
                class363.method2077(class133.field1704 + var5, class99.field1313 - -var4, class653.field9086.field2175, 32);
            } else {
                class103 var48 = class346.method2025(var5, var7, var4, -91);
                if (var7 == 1) {
                    var48.field1379.method3393(-1, -39);
                    var48.field1379.method3393(-1, -90);
                    var48.field1379.method3423((int) class183.field2237, 1571862888);
                    var48.field1379.method3393(57, -116);
                    var48.field1379.method3393(class514.field6956, 116);
                    var48.field1379.method3393(class283.field3747, -95);
                    var48.field1379.method3393(89, 68);
                    var48.field1379.method3423(class653.field9086.field2170, 1571862888);
                    var48.field1379.method3423(class653.field9086.field2165, arg1 + 1571862810);
                    var48.field1379.method3393(63, -38);
                } else {
                    class698.field9826 = 1;
                    class96.field1251 = 0;
                    class703.field9873 = arg0;
                    class68.field750 = arg2;
                }
                class27.method104(false, var48);
                class556.method3152(0, 0, 1, -4, arg1 ^ 0x4E, var5, var4, true, 1);
            }
        }
        if (var6 == 4) {
            class698.field9826 = 2;
            class391.field5497++;
            class96.field1251 = 0;
            class68.field750 = arg2;
            class703.field9873 = arg0;
            class103 var49 = class752.method4186(260, class412.field5823, class449.field6285);
            var49.field1379.method3423(class133.field1704 + var5, arg1 ^ 0x5DB0B926);
            var49.field1379.method3394((int) (var8 >>> 32) & Integer.MAX_VALUE, 17624);
            var49.field1379.method3423(class99.field1313 + var4, 1571862888);
            var49.field1379.method3405(class290.field3843.method1426(82, 5503) ? 1 : 0, arg1 ^ 0xFFFFFF91);
            class27.method104(false, var49);
            class364.method2082(-23, var8, var4, var5);
        }
        if (var6 == 60) {
            if (class596.field8304 > 0 && class290.field3843.method1426(82, 5503) && class290.field3843.method1426(81, arg1 + 5425)) {
                class363.method2077(class133.field1704 + var5, class99.field1313 + var4, class653.field9086.field2175, -67);
            } else {
                class703.field9873 = arg0;
                class96.field1251 = 0;
                class324.field4340++;
                class698.field9826 = 1;
                class68.field750 = arg2;
                class103 var50 = class752.method4186(260, class231.field2969, class449.field6285);
                var50.field1379.method3381(class133.field1704 + var5, (byte) 126);
                var50.field1379.method3381(class99.field1313 + var4, (byte) 126);
                class27.method104(false, var50);
            }
        }
        if (var6 == 1007) {
            class96.field1251 = 0;
            class500.field6812++;
            class703.field9873 = arg0;
            class698.field9826 = 2;
            class68.field750 = arg2;
            class103 var51 = class752.method4186(260, class72.field772, class449.field6285);
            var51.field1379.method3381(class99.field1313 + var4, (byte) 126);
            var51.field1379.method3437(Integer.MAX_VALUE & (int) (var8 >>> 32), arg1 ^ 0xCE);
            var51.field1379.method3430(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) -120);
            var51.field1379.method3437(class133.field1704 + var5, 128);
            class27.method104(false, var51);
            class364.method2082(arg1 - 101, var8, var4, var5);
        }
        if (var6 == 21) {
            class218 var52 = class408.method2359((byte) 72, var5, var4);
            if (var52 != null) {
                class96.method661((byte) 96);
                class703 var53 = client.method1835(var52);
                class572.method3215(var53.field9872, var52, var53.method3967(-1), -6838);
                class702.field9857 = class117.method771(arg1 - 79, var52);
                if (class702.field9857 == null) {
                    class702.field9857 = "Null";
                }
                class719.field10067 = var52.field2683 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 10) {
            class706 var54 = (class706) class681.field9475.method2552((long) var7, -1);
            if (var54 != null) {
                class96.field1251 = 0;
                class68.field750 = arg2;
                class215 var55 = var54.field9890;
                class658.field9178++;
                class698.field9826 = 2;
                class703.field9873 = arg0;
                class103 var56 = class752.method4186(260, class246.field3203, class449.field6285);
                var56.field1379.method3430(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) -109);
                var56.field1379.method3394(var7, arg1 + 17546);
                class27.method104(false, var56);
                class556.method3152(0, 0, var55.method543(0), -2, 0, var55.field899[0], var55.field898[0], true, var55.method543(0));
            }
        }
        if (var6 == 46) {
            class698.field9826 = 1;
            class493.field6717++;
            class68.field750 = arg2;
            class96.field1251 = 0;
            class703.field9873 = arg0;
            class103 var57 = class752.method4186(260, class146.field1884, class449.field6285);
            var57.field1379.method3431(class631.field8779, (byte) 94);
            var57.field1379.method3437(class355.field4735, 128);
            var57.field1379.method3423(class99.field1313 + var4, arg1 + 1571862810);
            var57.field1379.method3423(class169.field2109, 1571862888);
            var57.field1379.method3423(class133.field1704 + var5, 1571862888);
            class27.method104(false, var57);
            class556.method3152(0, 0, 1, -4, 0, var5, var4, true, 1);
        }
        if (var6 == 18) {
            class703.field9873 = arg0;
            class698.field9826 = 2;
            class68.field750 = arg2;
            class572.field8049++;
            class96.field1251 = 0;
            class103 var58 = class752.method4186(arg1 + 182, class183.field2232, class449.field6285);
            var58.field1379.method3437(class99.field1313 + var4, 128);
            var58.field1379.method3437(var7, 128);
            var58.field1379.method3437(class133.field1704 + var5, 128);
            var58.field1379.method3393(class290.field3843.method1426(82, 5503) ? 1 : 0, 110);
            class27.method104(false, var58);
            class178.method1013(-19181, var5, var4);
        }
        if (var6 == 1008) {
            class96.field1251 = 0;
            class557.field7852++;
            class68.field750 = arg2;
            class698.field9826 = 2;
            class703.field9873 = arg0;
            class103 var59 = class752.method4186(arg1 + 182, class677.field9454, class449.field6285);
            var59.field1379.method3423(var7, 1571862888);
            class27.method104(false, var59);
        }
        if (var6 == 22) {
            class83 var60 = class361.field4793[var7];
            if (var60 != null) {
                class96.field1251 = 0;
                class698.field9826 = 2;
                class68.field750 = arg2;
                class745.field10351++;
                class703.field9873 = arg0;
                class103 var61 = class752.method4186(260, class395.field5597, class449.field6285);
                var61.field1379.method3437(var7, 128);
                var61.field1379.method3430(class290.field3843.method1426(82, arg1 ^ 0x1531) ? 1 : 0, (byte) 122);
                class27.method104(false, var61);
                class556.method3152(0, 0, var60.method543(0), -2, 0, var60.field899[0], var60.field898[0], true, var60.method543(0));
            }
        }
        if (var6 == 44) {
            class83 var62 = class361.field4793[var7];
            if (var62 != null) {
                class681.field9482++;
                class96.field1251 = 0;
                class68.field750 = arg2;
                class703.field9873 = arg0;
                class698.field9826 = 2;
                class103 var63 = class752.method4186(260, class304.field4119, class449.field6285);
                var63.field1379.method3423(var7, 1571862888);
                var63.field1379.method3393(class290.field3843.method1426(82, 5503) ? 1 : 0, -91);
                class27.method104(false, var63);
                class556.method3152(0, 0, var62.method543(0), -2, 0, var62.field899[0], var62.field898[0], true, var62.method543(0));
            }
        }
        if (var6 == 23) {
            class703.field9873 = arg0;
            class583.field8168++;
            class96.field1251 = 0;
            class68.field750 = arg2;
            class698.field9826 = 2;
            class103 var64 = class752.method4186(260, class457.field6321, class449.field6285);
            var64.field1379.method3437(var5 + class133.field1704, arg1 ^ 0xCE);
            var64.field1379.method3430(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) 101);
            var64.field1379.method3381(var7, (byte) 126);
            var64.field1379.method3437(var4 + class99.field1313, 128);
            class27.method104(false, var64);
            class178.method1013(-19181, var5, var4);
        }
        if (var6 == 12) {
            class706 var65 = (class706) class681.field9475.method2552((long) var7, -1);
            if (var65 != null) {
                class96.field1251 = 0;
                class196.field2339++;
                class698.field9826 = 2;
                class703.field9873 = arg0;
                class215 var66 = var65.field9890;
                class68.field750 = arg2;
                class103 var67 = class752.method4186(arg1 + 182, class344.field4613, class449.field6285);
                var67.field1379.method3423(var7, arg1 ^ 0x5DB0B926);
                var67.field1379.method3430(class290.field3843.method1426(82, arg1 + 5425) ? 1 : 0, (byte) -99);
                class27.method104(false, var67);
                class556.method3152(0, 0, var66.method543(0), -2, 0, var66.field899[0], var66.field898[0], true, var66.method543(arg1 ^ 0x4E));
            }
        }
        if (var6 == 25) {
            class706 var68 = (class706) class681.field9475.method2552((long) var7, arg1 ^ 0xFFFFFFB1);
            if (var68 != null) {
                class68.field750 = arg2;
                class698.field9826 = 2;
                class703.field9873 = arg0;
                class96.field1251 = 0;
                class582.field8153++;
                class215 var69 = var68.field9890;
                class103 var70 = class752.method4186(260, class475.field6570, class449.field6285);
                var70.field1379.method3423(var7, 1571862888);
                var70.field1379.method3443(class290.field3843.method1426(82, 5503) ? 1 : 0, (byte) 112);
                class27.method104(false, var70);
                class556.method3152(0, 0, var69.method543(arg1 - 78), -2, 0, var69.field899[0], var69.field898[0], true, var69.method543(0));
            }
        }
        if (class595.field8291) {
            class96.method661((byte) -30);
        }
        if (class236.field3097 != null && class725.field10128 == 0) {
            class277.method1652(arg1 - 77, class236.field3097);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II[BI)V")
    public final void method2475(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6125++;
        if (arg1 < 0 || arg0 < 0 || arg0 + arg1 > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.field6117 != null) {
                throw new IOException(this.field6117.toString());
            }
            int var6;
            if (this.field6122 <= this.field6120) {
                var6 = this.field6118 - this.field6120 - (-this.field6122 - -1);
            } else {
                var6 = this.field6122 - this.field6120 - 1;
            }
            if (var6 < arg1) {
                throw new IOException("");
            }
            if (arg3 != -5) {
                this.method2473(true);
            }
            if (this.field6120 + arg1 > this.field6118) {
                int var7 = this.field6118 - this.field6120;
                class373.method2194(arg2, arg0, this.field6115, this.field6120, var7);
                class373.method2194(arg2, arg0 + var7, this.field6115, 0, arg1 - var7);
            } else {
                class373.method2194(arg2, arg0, this.field6115, this.field6120, arg1);
            }
            this.field6120 = (this.field6120 + arg1) % this.field6118;
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public final void method2476(byte arg0) {
        synchronized (this) {
            if (this.field6117 == null) {
                this.field6117 = new IOException("");
            }
            if (arg0 > -113) {
                return;
            }
            this.notifyAll();
        }
        field6112++;
        try {
            this.field6119.join();
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2477(int arg0, String arg1) {
        field6114++;
        int var2 = -104 % ((arg0 + 2) / 40);
        return class407.method2353(10, true, arg1, -21972);
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
    public class436(OutputStream arg0, int arg1) {
        this.field6121 = arg0;
        this.field6118 = arg1 + 1;
        this.field6115 = new byte[this.field6118];
        this.field6119 = new Thread(this);
        this.field6119.setDaemon(true);
        this.field6119.start();
    }
}
