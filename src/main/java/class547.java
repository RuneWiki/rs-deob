import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class547 extends class386 {

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
    private int field7935 = 4;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    private int field7939 = 1024;

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "I")
    private int field7948 = 204;

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
    private int field7947 = 8;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
    private int field7944 = 81;

    @OriginalMember(owner = "client!nu", name = "X", descriptor = "I")
    private int field7956 = 0;

    @OriginalMember(owner = "client!nu", name = "V", descriptor = "I")
    private int field7954 = 1024;

    @OriginalMember(owner = "client!nu", name = "T", descriptor = "I")
    private int field7952 = 409;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "Z")
    public static boolean field7943 = false;

    @OriginalMember(owner = "client!nu", name = "S", descriptor = "F")
    public static float field7951;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    private int field7936;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    private int field7940;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!nu", name = "Q", descriptor = "I")
    private int field7949;

    @OriginalMember(owner = "client!nu", name = "R", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!nu", name = "U", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!nu", name = "W", descriptor = "[I")
    private int[] field7955;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "[[I")
    private int[][] field7937;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "[[I")
    private int[][] field7945;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(II)Llt;")
    public static final class626 method3208(int arg0, int arg1) {
        ++field7950;
        class363[] var2 = class34.field680;
        synchronized (class34.field680) {
            if (arg1 != -16660) {
                return null;
            } else {
                class626 var4;
                if (arg0 < class34.field680.length && !class34.field680[arg0].method2065((byte) -80)) {
                    var4 = (class626) class34.field680[arg0].method2069(arg1 + 16535);
                    var4.method2564((byte) 2);
                    int var10002 = class6.field59[arg0]--;
                } else {
                    var4 = new class626();
                    var4.field8985 = new class605[arg0];
                    for (int var5 = 0; arg0 > var5; ++var5) {
                        var4.field8985[var5] = new class605();
                    }
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V")
    private final void method3209(int arg0) {
        ++field7953;
        Random var2 = new Random((long) this.field7947);
        this.field7940 = 4096 / this.field7947;
        this.field7949 = 4096 / this.field7935;
        this.field7936 = this.field7944 / arg0;
        int var3 = this.field7949 / 2;
        this.field7945 = new int[this.field7947][this.field7935];
        this.field7955 = new int[this.field7947 + 1];
        int var4 = this.field7940 / 2;
        this.field7937 = new int[this.field7947][this.field7935 + 1];
        this.field7955[0] = 0;
        for (int var5 = 0; ~var5 > ~this.field7947; ++var5) {
            if (var5 > 0) {
                int var6 = this.field7940;
                int var7 = (class517.method3062(var2, 26100, 4096) + -2048) * this.field7948 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field7955[var5] = this.field7955[var5 - 1] + var8;
            }
            this.field7937[var5][0] = 0;
            for (int var9 = 0; var9 < this.field7935; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field7949;
                    int var11 = (class517.method3062(var2, 26100, 4096) + -2048) * this.field7952 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field7937[var5][var9] = this.field7937[var5][var9 + -1] + var12;
                }
                this.field7945[var5][var9] = ~this.field7954 < -1 ? 4096 + -class517.method3062(var2, arg0 + 26098, this.field7954) : 4096;
            }
            this.field7937[var5][this.field7935] = 4096;
        }
        this.field7955[this.field7947] = 4096;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg1 < 111) {
            this.method3209(37);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field7954 = arg2.method2260(-47);
                                    }
                                } else {
                                    this.field7944 = arg2.method2260(-31);
                                }
                            } else {
                                this.field7956 = arg2.method2260(-108);
                            }
                        } else {
                            this.field7939 = arg2.method2260(-77);
                        }
                    } else {
                        this.field7948 = arg2.method2260(-84);
                    }
                } else {
                    this.field7952 = arg2.method2260(-46);
                }
            } else {
                this.field7947 = arg2.method2229(255);
            }
        } else {
            this.field7935 = arg2.method2229(255);
        }
        ++field7941;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
    public class547() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        if (arg0 < 0) {
            this.field7949 = 64;
        }
        this.method3209(2);
        ++field7938;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3210(int arg0, int arg1, int arg2, Class arg3) {
        class433 var4 = class281.field3808[arg0][arg1][arg2];
        if (var4 != null) {
            for (class182 var5 = var4.field6218; var5 != null; var5 = var5.field2226) {
                class43 var6 = var5.field2227;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field769 == arg1 && var6.field768 == arg2) {
                    class702.method3937(var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field7946;
        int var3 = -128 % ((13 - arg1) / 40);
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int var5 = 0;
            int var6;
            for (var6 = class562.field8114[arg0] - -this.field7956; ~var6 > -1; var6 += 4096) {
            }
            while (~var6 < -4097) {
                var6 -= 4096;
            }
            while (~this.field7947 < ~var5 && this.field7955[var5] <= var6) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = ~(var5 & 1) == -1;
            int var9 = this.field7955[var5];
            int var10 = this.field7955[var5 - 1];
            if (~(this.field7936 + var10) > ~var6 && var6 < -this.field7936 + var9) {
                for (int var11 = 0; var11 < class599.field8643; ++var11) {
                    int var12 = !var8 ? -this.field7939 : this.field7939;
                    int var13 = 0;
                    int var14;
                    for (var14 = (this.field7949 * var12 >> 12) + class152.field1879[var11]; var14 < 0; var14 += 4096) {
                    }
                    while (~var14 < -4097) {
                        var14 -= 4096;
                    }
                    while (~var13 > ~this.field7935 && var14 >= this.field7937[var7][var13]) {
                        ++var13;
                    }
                    int var15 = var13 - 1;
                    int var16 = this.field7937[var7][var15];
                    int var17 = this.field7937[var7][var13];
                    if (var14 > this.field7936 + var16 && -this.field7936 + var17 > var14) {
                        var4[var11] = this.field7945[var7][var15];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class252.method1539(var4, 0, class599.field8643, 0);
            }
        }
        return var4;
    }
}
