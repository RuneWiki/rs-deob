import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class272 extends class337 {

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    private int field4155 = 0;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    private int field4156 = 16;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    private int field4157 = 0;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    private int field4159 = 4096;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    private int field4160 = 2000;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Lak;")
    public static class234 field4163;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field4162;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int var4 = this.field4159 >> 1;
            int[][] var5 = super.field5007.method511(arg1 ^ -11);
            Random var6 = new Random((long) this.field4155);
            for (int var7 = 0; this.field4160 > var7; ++var7) {
                int var8 = this.field4159 > 0 ? this.field4157 + class477.method2873(var6, 58, this.field4159) + -var4 : this.field4157;
                int var9 = 255 & var8 >> 4;
                int var10 = class477.method2873(var6, 47, class402.field5977);
                int var11 = class477.method2873(var6, 76, class329.field4952);
                int var12 = (class333.field4972[var9] * this.field4156 >> 12) + var10;
                int var13 = var11 - -(class60.field716[var9] * this.field4156 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class477.method2873(var6, -106, 4096) >> 2) + 1024;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class446.field6541 & var28;
                        int var31 = class123.field1843 & var21;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        if (arg1 != -11) {
            this.method177((byte) -51, -73, (class217) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class272() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public final void method174(byte arg0) {
        class61.method539((byte) 111);
        if (arg0 < 1) {
            this.method179(53, (byte) 1);
        }
        ++field4158;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = -52 % ((arg0 - 82) / 40);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field4159 = arg2.method1511(-79);
                        }
                    } else {
                        this.field4157 = arg2.method1511(-52);
                    }
                } else {
                    this.field4156 = arg2.method1515((byte) 123);
                }
            } else {
                this.field4160 = arg2.method1511(-123);
            }
        } else {
            this.field4155 = arg2.method1515((byte) 123);
        }
        ++field4165;
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(III)V")
    public static final void method1796(int arg0, int arg1, int arg2) {
        if (arg2 != 9524) {
            method1796(109, 10, -59);
        }
        ++field4161;
        class334.field4988 = -class7.field106 + arg0;
        class108.field1510 = arg1 - class7.field103;
    }

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)V")
    public static void method1797(int arg0) {
        field4163 = null;
        if (arg0 >= -51) {
            field4164 = 41;
        }
    }

    static {
        new class234("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field4164 = 0;
        field4163 = new class234("yellow:", "gelb:", "jaune:", "amarelo:");
    }
}
