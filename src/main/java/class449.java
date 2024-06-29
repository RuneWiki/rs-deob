import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class449 extends class634 {

    @OriginalMember(owner = "client!jea", name = "H", descriptor = "I")
    private int field6477 = 0;

    @OriginalMember(owner = "client!jea", name = "I", descriptor = "I")
    private int field6478 = 12288;

    @OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
    private int field6476 = 2048;

    @OriginalMember(owner = "client!jea", name = "P", descriptor = "I")
    private int field6485 = 4096;

    @OriginalMember(owner = "client!jea", name = "O", descriptor = "I")
    private int field6484 = 2048;

    @OriginalMember(owner = "client!jea", name = "K", descriptor = "I")
    private int field6480 = 8192;

    @OriginalMember(owner = "client!jea", name = "N", descriptor = "I")
    private int field6483 = 0;

    @OriginalMember(owner = "client!jea", name = "Q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6486 = new BigInteger("84a3c58f1f44ab1d664a6497196892be50add75254469ac3fec03d819247b9b548c45e5d45aa0dffcc2cc55ed6675e368afc7867d1f75f47f402e7421e642c835a85b3118852ae0bf26a59c5fd17504a095e97b8bf07a5734cd7860176f4c893db5e2138233e75343d45101df427316e0174e4893dccb87ec5e89405f40ca7037049a858129cc33de85edf4a8e1f7c6a77ea05da2ee90608aba29e9fb09d2f604f451b91c9e64a520a64cd253660ed83a8fd69f50d4f9528d37f415741564af81b517afdf98726268d88627bba6e59410fd45b1d63a8a1e79cc2fadca1bfa140de20e222621daa885cf1c5f8777eb40a159ae5de16ec6723824a52f52002c67dd0fe33f86e5f5866cd714421be8492b04047ddedca29b7697bad07a161d3cd5588147281eac95d020ceef701e73b44319c20510d3eab63bc71e2a037db8abb7e782b7a6dbb595145cb67b492e6e52a967adaf4860b502c9576e4fa02455a3dc39a8ed04b69fe0680a9963aa3f9d7239c7add970c73304e90d724fb778d3f81f9b4575cb92ff759f5451194eabce85314a9eb418651d1b5be6fd0fa7ba15fdded2e9662eac727b3f623e7e013cb9586461a71972215fd10b27ab11d8fa2151b497d5d96c150f5845895f4ce9bf325290af59c657523520ad0f0fe59b03f774efdd4dbf5e4b81fcf7ccefad140088d88ea4c56767e70c55d680b8909d9e0e93c25", 16);

    @OriginalMember(owner = "client!jea", name = "F", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!jea", name = "J", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!jea", name = "L", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!jea", name = "M", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!jea", name = "R", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!jea", name = "S", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "(I)V")
    public static void method2772(int arg0) {
        if (arg0 >= 19) {
            field6486 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field6479;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 > -55) {
            this.method3(-125, (class244) null, true);
        }
        if (super.field9114.field3897) {
            int var4 = class164.field1840[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class635.field9139; ++var5) {
                int var6 = class246.field2980[var5] + -2048;
                int var7 = var6 - -this.field6484;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = ~var8 < -2049 ? var8 - 4096 : var8;
                int var10 = this.field6483 + var4;
                int var11 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field6477;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = this.field6476 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method2773(6, var9, var12) && !this.method2774(var15, (byte) 101, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(III)Z")
    private final boolean method2773(int arg0, int arg1, int arg2) {
        ++field6482;
        if (arg0 != 6) {
            this.field6477 = 54;
        }
        int var4 = (-arg1 + arg2) * this.field6478 >> 12;
        int var5 = class412.field5620[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field6478;
        int var7 = (var6 << 12) / this.field6480;
        int var8 = this.field6485 * var7 >> 12;
        return arg1 - -arg2 < var8 && -var8 < arg1 - -arg2;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V")
    public class449() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field6480 = arg1.method1476(-103);
                                }
                            } else {
                                this.field6485 = arg1.method1476(-84);
                            }
                        } else {
                            this.field6478 = arg1.method1476(-128);
                        }
                    } else {
                        this.field6476 = arg1.method1476(103);
                    }
                } else {
                    this.field6477 = arg1.method1476(-105);
                }
            } else {
                this.field6483 = arg1.method1476(-105);
            }
        } else {
            this.field6484 = arg1.method1476(-79);
        }
        if (arg2) {
            this.field6476 = -84;
        }
        ++field6475;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IBI)Z")
    private final boolean method2774(int arg0, byte arg1, int arg2) {
        ++field6488;
        int var4 = (arg2 - -arg0) * this.field6478 >> 12;
        int var5 = class412.field5620[(1046364 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field6478;
        int var7 = (var6 << 12) / this.field6480;
        if (arg1 < 3) {
            this.field6483 = 43;
        }
        int var8 = this.field6485 * var7 >> 12;
        return var8 > -arg0 + arg2 && arg2 - arg0 > -var8;
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        class581.method3345((byte) 89);
        ++field6481;
        if (arg0 < 65) {
            this.method13((byte) -59, 27);
        }
    }
}
