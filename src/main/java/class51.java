import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class51 extends class68 {

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    private int field733 = 16;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    private int field736 = 2000;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    private int field730 = 0;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    private int field737 = 4096;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    private int field739 = 0;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "Ljava/lang/String;")
    public static String field738 = "Loaded sprites";

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field731;
        int[] var3 = super.field917.method1920(arg0, true);
        if (arg1 > -118) {
            this.method192(52);
        }
        if (super.field917.field4474) {
            int var4 = this.field737 >> 1;
            int[][] var5 = super.field917.method1916(4783);
            Random var6 = new Random((long) this.field730);
            for (int var7 = 0; this.field736 > var7; ++var7) {
                int var8 = this.field737 <= 0 ? this.field739 : this.field739 + class47.method310(this.field737, (byte) -44, var6) + -var4;
                int var9 = var8 >> 4 & 255;
                int var10 = class47.method310(class89.field1248, (byte) -68, var6);
                int var11 = class47.method310(class62.field861, (byte) -114, var6);
                int var12 = (class54.field778[var9] * this.field733 >> 12) + var10;
                int var13 = (class160.field2245[var9] * this.field733 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = ~var13 >= ~var11 ? -1 : 1;
                    int var26 = 2048 / var22;
                    int var27 = 1024 - (class47.method310(4096, (byte) -47, var6) >> 2);
                    for (int var28 = var10; var12 > var28; ++var28) {
                        var24 += var23;
                        int var29 = var28 & class173.field2411;
                        int var30 = var27 - -((-var10 + var28) * var26) + 1024;
                        int var31 = class17.field184 & var21;
                        if (var24 > 0) {
                            var21 += var25;
                            var24 += -var22;
                        }
                        if (!var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method326(boolean arg0) {
        if (!arg0) {
            field738 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        ++field735;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field737 = arg0.method1445(false);
                        }
                    } else {
                        this.field739 = arg0.method1445(false);
                    }
                } else {
                    this.field733 = arg0.method1453((byte) -128);
                }
            } else {
                this.field736 = arg0.method1445(false);
            }
        } else {
            this.field730 = arg0.method1453((byte) -127);
        }
        if (!arg2) {
            this.field739 = 41;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class51() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        class250.method1674(true);
        if (arg0 > -18) {
            field738 = null;
        }
        ++field732;
    }
}
