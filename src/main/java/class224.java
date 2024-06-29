import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class224 {

    @OriginalMember(owner = "client!re", name = "g", descriptor = "B")
    private byte field3895;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public int field3902;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public int field3891;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field3889 = 0;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Loa;")
    public static class99 field3894 = class221.method1463(2844, "leuchten2:");

    @OriginalMember(owner = "client!re", name = "h", descriptor = "[S")
    public static short[] field3896 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static volatile int field3899 = 0;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[[[B")
    public static byte[][][] field3897;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)I")
    public final int method1479(int arg0) {
        if (arg0 == 7) {
            field3892++;
            return this.field3895 & 0x7;
        } else {
            return 37;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)I")
    public final int method1480(int arg0) {
        if (arg0 <= 68) {
            this.field3901 = 117;
        }
        field3893++;
        return (this.field3895 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public static void method1481(boolean arg0) {
        if (arg0) {
            method1481(true);
        }
        field3896 = null;
        field3897 = null;
        field3894 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1482(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3903++;
        int var6 = arg2 - arg0;
        int var7 = arg5 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class93.method623(arg1, (byte) 89, arg0, arg2, arg3);
            }
        } else if (var6 == 0) {
            class51.method355((byte) -66, arg0, arg5, arg3, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg0;
                int var10 = arg5;
                arg0 = var9;
                arg5 = arg2;
                arg2 = var10;
            }
            if (arg1 > arg5) {
                int var11 = arg1;
                int var12 = arg0;
                arg1 = arg5;
                arg0 = arg2;
                arg2 = var12;
                arg5 = var11;
            }
            int var13 = arg0;
            int var14 = arg5 - arg1;
            if (!arg4) {
                field3894 = null;
            }
            int var15 = -(var14 >> 1);
            int var16 = arg2 - arg0;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = arg2 <= arg0 ? -1 : 1;
            if (var8) {
                for (int var18 = arg1; var18 <= arg5; var18++) {
                    var15 += var16;
                    class124.field2177[var18][var13] = arg3;
                    if (var15 > 0) {
                        var15 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg5; var19++) {
                    var15 += var16;
                    class124.field2177[var13][var19] = arg3;
                    if (var15 > 0) {
                        var15 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
    public static final void method1483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3898++;
        class65 var5 = class152.method1010(arg1, 10, (byte) -81);
        var5.method433(32);
        if (arg0 >= 66) {
            var5.field1092 = arg3;
            var5.field1085 = arg4;
            var5.field1094 = arg2;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class224() {
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lik;)V")
    public class224(class261 arg0) {
        this.field3895 = arg0.method1706(10819);
        this.field3902 = arg0.method1740((byte) 115);
        this.field3901 = arg0.method1712(-4);
        this.field3900 = arg0.method1712(-4);
        this.field3890 = arg0.method1712(-4);
        this.field3891 = arg0.method1712(-4);
    }
}
