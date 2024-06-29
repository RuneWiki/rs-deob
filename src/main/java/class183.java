import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class183 extends class335 {

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    private int field2551 = 0;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    private int field2546 = 2000;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    private int field2554 = 16;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    private int field2553 = 0;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    private int field2549 = 4096;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field2550 = -1;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public final void method317(byte arg0) {
        ++field2548;
        int var2 = 76 / ((arg0 - 58) / 60);
        class420.method2371(10779);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IC)C")
    public static final char method1216(int arg0, char arg1) {
        ++field2545;
        if (arg1 == 198) {
            return 'E';
        } else if (arg1 == 230) {
            return 'e';
        } else if (arg1 == 223) {
            return 's';
        } else if (~arg1 == arg0) {
            return 'E';
        } else {
            return (char) (~arg1 == -340 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field2549 = arg1.method963(-118);
                        }
                    } else {
                        this.field2553 = arg1.method963(-122);
                    }
                } else {
                    this.field2554 = arg1.method930(arg2 ^ -191);
                }
            } else {
                this.field2546 = arg1.method963(-125);
            }
        } else {
            this.field2551 = arg1.method930(arg2 + 321);
        }
        if (arg2 != -66) {
            field2550 = -15;
        }
        ++field2556;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lio;I)Lmc;")
    public static final class420 method1217(class157 arg0, int arg1) {
        ++field2555;
        class689 var2 = class423.method2389(arg0, 1);
        int var3 = arg0.method908(false);
        int var4 = arg0.method908(false);
        int var5 = arg0.method963(-121);
        if (arg1 > -89) {
            method1217((class157) null, 57);
        }
        return new class420(var2.field9726, var2.field9729, var2.field9731, var2.field9736, var2.field9733, var2.field9743, var2.field9744, var2.field9727, var2.field9740, var3, var4, var5);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class183() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        ++field2552;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (!arg0) {
            this.field2554 = 125;
        }
        if (super.field4525.field5435) {
            int var4 = this.field2549 >> 1;
            int[][] var5 = super.field4525.method2345((byte) 97);
            Random var6 = new Random((long) this.field2551);
            for (int var7 = 0; ~this.field2546 < ~var7; ++var7) {
                int var8 = this.field2549 <= 0 ? this.field2553 : this.field2553 + -var4 + class584.method3227(false, this.field2549, var6);
                int var9 = var8 >> 4 & 255;
                int var10 = class584.method3227(false, class649.field8968, var6);
                int var11 = class584.method3227(false, class316.field4237, var6);
                int var12 = (class245.field3211[var9] * this.field2554 >> 12) + var10;
                int var13 = (class104.field1239[var9] * this.field2554 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class584.method3227(false, 4096, var6) >> 2) + 1024;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = var11 < var13 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class29.field413 & var28;
                        int var31 = class326.field4386 & var21;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
