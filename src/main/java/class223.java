import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class223 extends class227 {

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    private int field2988 = 1024;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "I")
    private int field2997 = 4;

    @OriginalMember(owner = "client!on", name = "P", descriptor = "I")
    private int field2996 = 8;

    @OriginalMember(owner = "client!on", name = "L", descriptor = "I")
    private int field2992 = 81;

    @OriginalMember(owner = "client!on", name = "R", descriptor = "I")
    private int field2998 = 1024;

    @OriginalMember(owner = "client!on", name = "S", descriptor = "I")
    private int field2999 = 0;

    @OriginalMember(owner = "client!on", name = "Z", descriptor = "I")
    private int field3006 = 409;

    @OriginalMember(owner = "client!on", name = "Y", descriptor = "I")
    private int field3005 = 204;

    @OriginalMember(owner = "client!on", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field2990 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!on", name = "V", descriptor = "[I")
    public static int[] field3002 = new int[8];

    @OriginalMember(owner = "client!on", name = "bb", descriptor = "[I")
    public static int[] field3008 = new int[1];

    @OriginalMember(owner = "client!on", name = "W", descriptor = "Lho;")
    public static class103 field3003 = new class103(3, 18);

    @OriginalMember(owner = "client!on", name = "db", descriptor = "[I")
    public static int[] field3010 = new int[8];

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!on", name = "M", descriptor = "I")
    private int field2993;

    @OriginalMember(owner = "client!on", name = "O", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!on", name = "U", descriptor = "I")
    private int field3001;

    @OriginalMember(owner = "client!on", name = "X", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!on", name = "ab", descriptor = "I")
    private int field3007;

    @OriginalMember(owner = "client!on", name = "T", descriptor = "[I")
    private int[] field3000;

    @OriginalMember(owner = "client!on", name = "N", descriptor = "[[I")
    private int[][] field2994;

    @OriginalMember(owner = "client!on", name = "cb", descriptor = "[[I")
    private int[][] field3009;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method62(int arg0, int arg1) {
        ++field2989;
        if (arg0 != 15811) {
            field3008 = null;
        }
        int[] var3 = super.field3068.method1970(arg1, (byte) 120);
        if (super.field3068.field4480) {
            int var4 = 0;
            int var5;
            for (var5 = class190.field2457[arg1] + this.field2999; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field2996 < ~var4 && ~var5 <= ~this.field3000[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field3000[var4];
            int var9 = this.field3000[var4 + -1];
            if (this.field3007 + var9 < var5 && ~var5 > ~(var8 - this.field3007)) {
                for (int var10 = 0; ~var10 > ~class446.field6486; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field2988 : this.field2988;
                    int var13;
                    for (var13 = class4.field37[var10] - -(this.field2993 * var12 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field2997 && ~this.field2994[var6][var11] >= ~var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field2994[var6][var14];
                    int var16 = this.field2994[var6][var11];
                    if (~var13 < ~(var15 - -this.field3007) && ~(-this.field3007 + var16) < ~var13) {
                        var3[var10] = this.field3009[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class438.method2688(var3, 0, class446.field6486, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!on", name = "j", descriptor = "(I)V", line = 108)
    private final void method1403(int arg0) {
        ++field2987;
        Random var2 = new Random((long) this.field2996);
        this.field2993 = 4096 / this.field2997;
        this.field3007 = this.field2992 / 2;
        this.field3001 = 4096 / this.field2996;
        int var3 = this.field2993 / 2;
        int var4 = this.field3001 / 2;
        this.field3000 = new int[this.field2996 + arg0];
        this.field2994 = new int[this.field2996][this.field2997 + 1];
        this.field3009 = new int[this.field2996][this.field2997];
        this.field3000[0] = 0;
        for (int var5 = 0; var5 < this.field2996; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field3001;
                int var7 = (class477.method2908((byte) 112, var2, 4096) + -2048) * this.field3005 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3000[var5] = this.field3000[var5 - 1] + var8;
            }
            this.field2994[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2997; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field2993;
                    int var11 = (class477.method2908((byte) -120, var2, 4096) - 2048) * this.field3006 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2994[var5][var9] = this.field2994[var5][var9 + -1] - -var12;
                }
                this.field3009[var5][var9] = ~this.field2998 < -1 ? -class477.method2908((byte) 46, var2, this.field2998) + 4096 : 4096;
            }
            this.field2994[var5][this.field2997] = 4096;
        }
        this.field3000[this.field2996] = 4096;
    }

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V", line = 172)
    public final void method877(int arg0) {
        ++field2995;
        this.method1403(arg0);
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V", line = 183)
    public class223() {
        super(0, true);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lug;II)V", line = 193)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field2998 = arg0.method2386(-23648);
                                    }
                                } else {
                                    this.field2992 = arg0.method2386(-23648);
                                }
                            } else {
                                this.field2999 = arg0.method2386(-23648);
                            }
                        } else {
                            this.field2988 = arg0.method2386(-23648);
                        }
                    } else {
                        this.field3005 = arg0.method2386(-23648);
                    }
                } else {
                    this.field3006 = arg0.method2386(-23648);
                }
            } else {
                this.field2996 = arg0.method2388((byte) -124);
            }
        } else {
            this.field2997 = arg0.method2388((byte) -121);
        }
        if (arg1 != 487215116) {
            this.field2999 = 36;
        }
        ++field2991;
    }

    @OriginalMember(owner = "client!on", name = "k", descriptor = "(I)V", line = 282)
    public static void method1404(int arg0) {
        field3002 = null;
        field2990 = null;
        field3008 = null;
        if (arg0 != 0) {
            field3002 = null;
        }
        field3003 = null;
        field3010 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLfq;)[Lit;", line = 333)
    public static final class459[] method1405(byte arg0, class137 arg1) {
        ++field3004;
        if (!arg1.method842(false)) {
            return new class459[0];
        } else {
            class236 var2 = arg1.method845(-125);
            while (var2.field3149 == 0) {
                class316.method1873(10L, false);
            }
            if (var2.field3149 == 2) {
                return new class459[0];
            } else {
                int[] var3 = (int[]) var2.field3151;
                if (arg0 <= 116) {
                    method1405((byte) -80, (class137) null);
                }
                class459[] var4 = new class459[var3.length >> 2];
                for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                    class459 var6 = new class459();
                    var4[var5] = var6;
                    var6.field6842 = var3[var5 << 2];
                    var6.field6845 = var3[(var5 << 2) + 1];
                    var6.field6839 = var3[(var5 << 2) + 2];
                    var6.field6843 = var3[(var5 << 2) + 3];
                }
                return var4;
            }
        }
    }
}
