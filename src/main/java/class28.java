import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class28 extends class300 {

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    private int field335 = 2048;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    private int field346 = 0;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    private int field349 = 10;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field345 = -1;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "[I")
    public static int[] field342 = new int[100];

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "Ljava/lang/String;")
    public static String field351 = null;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field348 = -1;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "Ljava/lang/String;")
    public static String field352 = "Members object";

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "Lnj;")
    public static class215 field338;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "[I")
    private int[] field347;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "[I")
    private int[] field350;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "[S")
    public static short[] field340;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class28() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field341;
        int[] var3 = super.field4797.method217(arg0, true);
        if (arg1 != -957953300) {
            method143(-74);
        }
        if (super.field4797.field470) {
            int var4 = class235.field3797[arg0];
            if (this.field346 != 0) {
                for (int var5 = 0; ~class180.field2826 < ~var5; ++var5) {
                    int var6 = 0;
                    int var7 = class5.field73[var5];
                    short var8 = 0;
                    int var9 = this.field346;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var7 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(var7 - (-var4 + 4096) >> 1);
                        }
                    } else {
                        var6 = var7;
                    }
                    for (int var10 = 0; ~this.field349 < ~var10; ++var10) {
                        if (~this.field350[var10] >= ~var6 && var6 < this.field350[var10 + 1]) {
                            if (var6 < this.field347[var10]) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var8;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field349; ++var12) {
                    if (~var4 <= ~this.field350[var12] && var4 < this.field350[var12 + 1]) {
                        if (this.field347[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class103.method695(var3, 0, class180.field2826, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
    public static void method140(byte arg0) {
        field338 = null;
        field342 = null;
        field352 = null;
        field351 = null;
        field340 = null;
        if (arg0 != 26) {
            field352 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V")
    private final void method141(byte arg0) {
        this.field347 = new int[this.field349 + 1];
        this.field350 = new int[this.field349 + 1];
        ++field343;
        int var2 = 0;
        int var3 = 4096 / this.field349;
        int var4 = -85 % ((arg0 - 46) / 62);
        int var5 = this.field335 * var3 >> 12;
        for (int var6 = 0; ~var6 > ~this.field349; ++var6) {
            this.field350[var6] = var2;
            this.field347[var6] = var2 + var5;
            var2 += var3;
        }
        this.field350[this.field349] = 4096;
        this.field347[this.field349] = this.field347[0] + 4096;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ISJII)V")
    public static final void method142(String arg0, int arg1, String arg2, int arg3, short arg4, long arg5, int arg6, int arg7) {
        ++field337;
        int var9 = -120 % ((arg1 - -16) / 54);
        if (!class311.field4995) {
            if (class173.field2721 < 500) {
                class186.field2925[class173.field2721] = arg2;
                class43.field521[class173.field2721] = arg0;
                class163.field2495[class173.field2721] = ~arg7 == 0 ? class288.field4653 : arg7;
                class192.field3056[class173.field2721] = arg4;
                class150.field2205[class173.field2721] = arg5;
                class92.field1378[class173.field2721] = arg6;
                class180.field2830[class173.field2721] = arg3;
                ++class173.field2721;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)[Lca;")
    public static final class91[] method143(int arg0) {
        ++field339;
        class91[] var1 = new class91[class139.field2000];
        for (int var2 = 0; var2 < class139.field2000; ++var2) {
            var1[var2] = new class91(class15.field215, class86.field1308, class166.field2569[var2], class277.field4480[var2], class64.field924[var2], class284.field4603[var2], class190.field2959[var2], class229.field3539);
        }
        if (arg0 != -4) {
            method140((byte) 45);
        }
        class115.method762((byte) -112);
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 < 126) {
            method140((byte) 100);
        }
        ++field344;
        this.method141((byte) -112);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg1 < -43) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field346 = arg0.method1218(-117);
                    }
                } else {
                    this.field335 = arg0.method1186((byte) -73);
                }
            } else {
                this.field349 = arg0.method1218(70);
            }
            ++field336;
        }
    }
}
