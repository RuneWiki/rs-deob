import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class629 extends class601 {

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    private int field8384 = 0;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    private int field8385 = 4096;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field8382 = new Rectangle[100];

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "Lwu;")
    public static class376 field8381;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BJLha;)V")
    public static final void method3464(byte arg0, long arg1, class59 arg2) {
        if (arg0 < 101) {
            method3466(-53, 92);
        }
        class580.field7621 = class376.field5243;
        class456.field6220 = 0;
        ++field8380;
        class149.field2339 = 0;
        class376.field5243 = 0;
        long var4 = class375.method2193(116);
        for (class17 var6 = (class17) class543.field7191.method3874((byte) 76); var6 != null; var6 = (class17) class543.field7191.method3868(-24951)) {
            if (var6.method126(arg2, arg1)) {
                ++class149.field2339;
            }
        }
        if (class370.field5161 && ~(arg1 % 100L) == -1L) {
            System.out.println("Particle system count: " + class543.field7191.method3866((byte) 4) + ", running: " + class149.field2339);
            System.out.println("Emitters: " + class456.field6220 + " Particles: " + class376.field5243 + ". Time taken: " + (class375.method2193(116) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
    public class629() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(IZ)[[I")
    public final int[][] method7(int arg0, boolean arg1) {
        ++field8379;
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (!arg1) {
            return null;
        } else {
            if (super.field7890.field9769) {
                int[][] var4 = this.method3268(arg0, 0, 65535);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class171.field2624; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (this.field8384 > var12) {
                        var8[var11] = this.field8384;
                    } else if (~this.field8385 > ~var12) {
                        var8[var11] = this.field8385;
                    } else {
                        var8[var11] = var12;
                    }
                    if (var13 < this.field8384) {
                        var9[var11] = this.field8384;
                    } else if (~this.field8385 > ~var13) {
                        var9[var11] = this.field8385;
                    } else {
                        var9[var11] = var13;
                    }
                    if (~var14 <= ~this.field8384) {
                        if (this.field8385 >= var14) {
                            var10[var11] = var14;
                        } else {
                            var10[var11] = this.field8385;
                        }
                    } else {
                        var10[var11] = this.field8384;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field7897 = arg0.method3821((byte) -24) == 1;
                }
            } else {
                this.field8385 = arg0.method3807(-1);
            }
        } else {
            this.field8384 = arg0.method3807(-1);
        }
        if (arg1 == -61) {
            ++field8377;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field8378;
        int[] var3 = super.field7902.method382(arg1, true);
        if (arg0 != -40) {
            return null;
        } else {
            if (super.field7902.field704) {
                int[] var4 = this.method3266((byte) 64, arg1, 0);
                for (int var5 = 0; ~class171.field2624 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (var6 < this.field8384) {
                        var3[var5] = this.field8384;
                    } else if (this.field8385 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field8385;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public static void method3465(byte arg0) {
        field8381 = null;
        if (arg0 < -95) {
            field8382 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Lrs;")
    public static final class653 method3466(int arg0, int arg1) {
        if (arg0 != -3652) {
            method3464((byte) -25, -71L, (class59) null);
        }
        ++field8383;
        return client.field4357 && ~class309.field4442 >= ~arg1 && class568.field7465 >= arg1 ? class82.field989[-class309.field4442 + arg1] : null;
    }
}
