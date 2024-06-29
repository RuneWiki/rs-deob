import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class454 {

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Laj;")
    private class287 field6484 = new class287(64);

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lom;")
    private class344 field6483;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "[I")
    public static int[] field6485 = new int[32];

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lqfa;")
    public static class85 field6481 = new class85(104, 20);

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "J")
    public static long field6487 = 0L;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lcfa;")
    public final class153 method2732(int arg0, byte arg1) {
        field6476++;
        class287 var3 = this.field6484;
        class153 var4;
        synchronized (this.field6484) {
            var4 = (class153) this.field6484.method1900((long) arg0, 71);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field6483;
        byte[] var6;
        synchronized (this.field6483) {
            var6 = this.field6483.method2216(31, arg0, true);
        }
        class153 var7 = new class153();
        if (var6 != null) {
            var7.method1195(new class61(var6), -1);
        }
        class287 var8 = this.field6484;
        synchronized (this.field6484) {
            if (arg1 != -25) {
                this.field6484 = null;
            }
            this.field6484.method1904(var7, (long) arg0, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method2733(int arg0) {
        field6481 = null;
        field6485 = null;
        if (arg0 != 26) {
            method2735(14);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public final void method2734(int arg0) {
        if (arg0 != 11469) {
            this.method2738(-91, 127);
        }
        class287 var2 = this.field6484;
        synchronized (this.field6484) {
            this.field6484.method1912(-2552);
        }
        field6475++;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    public static final void method2735(int arg0) {
        class470.field6673 = class126.field2299.method734((byte) -23);
        field6480++;
        boolean var1 = class126.field2299.method713(127) == 1;
        if (arg0 <= 116) {
            field6479 = 126;
        }
        int var2 = class126.field2299.method723((byte) -25);
        int var3 = class126.field2299.method729((byte) -41);
        int var4 = class126.field2299.method713(122);
        class628.method3596(-1);
        class540.method3118(var4, -20476);
        class126.field2299.method3650((byte) 53);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class675.field9604 >> 3); var20++) {
                for (int var21 = 0; var21 < (class218.field3316 >> 3); var21++) {
                    int var22 = class126.field2299.method3648(110, 1);
                    if (var22 == 1) {
                        class674.field9598[var5][var20][var21] = class126.field2299.method3648(106, 26);
                    } else {
                        class674.field9598[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class126.field2299.method3647(-61);
        int var6 = (class478.field6872 - class126.field2299.field1393) / 16;
        class253.field3756 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class253.field3756[var7][var19] = class126.field2299.method730(-104);
            }
        }
        class335.field5019 = new int[var6];
        class408.field5904 = new byte[var6][];
        class251.field3744 = new int[var6];
        class81.field1589 = new byte[var6][];
        class118.field2100 = new int[var6];
        class304.field4509 = null;
        class600.field8603 = new int[var6];
        class520.field7366 = new byte[var6][];
        class213.field3252 = null;
        class607.field8843 = new int[var6];
        class221.field3340 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class675.field9604 >> 3); var10++) {
                for (int var11 = 0; var11 < class218.field3316 >> 3; var11++) {
                    int var12 = class674.field9598[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFFEC1) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class335.field5019[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class335.field5019[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class607.field8843[var8] = class13.field722.method2228("m" + var17 + "_" + var18, 5781);
                            class251.field3744[var8] = class13.field722.method2228("l" + var17 + "_" + var18, 5781);
                            class118.field2100[var8] = class13.field722.method2228("um" + var17 + "_" + var18, 5781);
                            class600.field8603[var8] = class13.field722.method2228("ul" + var17 + "_" + var18, 5781);
                            var8++;
                        }
                    }
                }
            }
        }
        class138.method1133(11, (byte) -16, var1, var3, var2);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BII)Z")
    public static final boolean method2736(byte arg0, int arg1, int arg2) {
        field6478++;
        if (arg0 > -115) {
            return true;
        } else {
            return (arg1 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public final void method2737(int arg0) {
        field6486++;
        class287 var2 = this.field6484;
        synchronized (this.field6484) {
            if (arg0 <= 82) {
                field6479 = -54;
            }
            this.field6484.method1913(true);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public final void method2738(int arg0, int arg1) {
        field6482++;
        class287 var3 = this.field6484;
        synchronized (this.field6484) {
            this.field6484.method1908(arg0, (byte) -11);
        }
        if (arg1 != -14556) {
            method2736((byte) -20, -119, -10);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2739(int arg0, int arg1, byte arg2) {
        field6477++;
        int var3 = -108 / ((-arg2 - 57) / 57);
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class454(class398 arg0, int arg1, class344 arg2) {
        this.field6483 = arg2;
        this.field6483.method2236(31, 0);
    }
}
