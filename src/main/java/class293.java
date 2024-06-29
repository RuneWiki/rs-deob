import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class293 extends class276 {

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    private int field4674 = 1;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    private int field4679 = 1;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "I")
    private int field4680 = 204;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "I")
    public static int field4678 = -1;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "[J")
    public static long[] field4676 = new long[100];

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4672 = "flash2:";

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method1975(int arg0, String arg1, boolean arg2) {
        ++field4675;
        if (arg0 != 4) {
            field4678 = 33;
        }
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class23.field354; ++var6) {
            class199 var9 = class203.method1346(arg0 + -5, var6);
            if ((!arg2 || var9.field3223) && ~var9.field3284 == 0 && ~var9.field3238 == 0 && var9.field3264 == 0 && var9.field3216.toLowerCase().indexOf(var3) != -1) {
                if (~var5 <= -251) {
                    class190.field3079 = -1;
                    class27.field413 = null;
                    return;
                }
                if (~var4.length >= ~var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class190.field3079 = var5;
        class178.field2930 = 0;
        String[] var7 = new String[class190.field3079];
        class27.field413 = var4;
        for (int var8 = 0; class190.field3079 > var8; ++var8) {
            var7[var8] = class203.method1346(-1, var4[var8]).field3216;
        }
        class31.method205(var7, arg0 ^ -122, class27.field413);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field4680 = arg1.method677(false);
                }
            } else {
                this.field4679 = arg1.method669((byte) 36);
            }
        } else {
            this.field4674 = arg1.method669((byte) 36);
        }
        ++field4671;
        if (arg2 != -1) {
            method1975(11, (String) null, true);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 < 39) {
            method1975(-43, (String) null, true);
        }
        ++field4677;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            for (int var4 = 0; ~class53.field929 < ~var4; ++var4) {
                int var5 = class175.field2883[var4];
                int var6 = class206.field3389[arg1];
                int var7 = this.field4674 * var5 >> 12;
                int var8 = this.field4679 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4674) * this.field4674;
                int var10 = var6 % (4096 / this.field4679) * this.field4679;
                if (~this.field4680 < ~var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field4680 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field4680) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)Lkc;")
    public static final class90 method1976(byte arg0, int arg1) {
        class90 var2 = (class90) class267.field4315.method57((long) arg1, -56);
        ++field4673;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class178.field2928.method746(arg1, (byte) -128, 4);
            if (arg0 <= 21) {
                method1976((byte) -119, 24);
            }
            class90 var4 = new class90();
            if (var3 != null) {
                var4.method583(false, arg1, new class101(var3));
            }
            class267.field4315.method62(0, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class293() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
    public static void method1977(byte arg0) {
        if (arg0 != -51) {
            method1976((byte) 4, 81);
        }
        field4672 = null;
        field4676 = null;
    }
}
