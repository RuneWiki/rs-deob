import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class35 {

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static volatile int field652 = 0;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "[I")
    public static int[] field650 = new int[99];

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Lok;")
    public static class146 field656;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Loh;")
    public static class15 field653;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[Lje;")
    public static class70[] field657;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Ltg;", line = 5)
    public final class307 method249(int arg0) {
        field651++;
        class307 var2 = (class307) class305.field5214.method799((byte) 52, (long) this.field647);
        if (var2 != null) {
            return var2;
        }
        class307 var3 = class258.method1876(this.field647, -124, class229.field3825, 0);
        if (arg0 > -76) {
            field656 = (class146) null;
        }
        if (var3 != null) {
            class305.field5214.method797(var3, 0, (long) this.field647);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILwe;Z)V", line = 29)
    public final void method250(int arg0, class47 arg1, boolean arg2) {
        while (true) {
            int var4 = arg1.method368(-113);
            if (var4 == 0) {
                field646++;
                if (!arg2) {
                    method251((byte) -61, -59);
                }
                return;
            }
            this.method256(arg1, var4, (byte) 79, arg0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)I", line = 54)
    public static final int method251(byte arg0, int arg1) {
        if (arg0 > -126) {
            field650 = (int[]) null;
        }
        field654++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 70)
    public static void method252(int arg0) {
        field650 = null;
        field656 = null;
        field657 = null;
        if (arg0 == 127) {
            field653 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field650[var1] = var0 / 4;
        }
        field656 = class235.method1724(-12908, "cookieprefix");
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V", line = 88)
    public static final void method253(int arg0, int arg1, int arg2) {
        int var3 = 0;
        if (arg0 != -1) {
            method251((byte) 51, -104);
        }
        while (class124.field2019 > var3) {
            class9 var4 = class126.method865(arg0 - 30464, var3);
            if (var4 != null) {
                int var5 = var4.field198;
                if (var5 >= 0 && !class109.field1747.method825(true, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field183 >= 0) {
                    int var10 = var4.field183;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg2 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class109.field1746[class294.method2096(var12, arg0 - 90, 96)];
                } else if (var5 >= 0) {
                    var6 = class109.field1746[class294.method2096(class109.field1747.method833(false, var5), arg0 - 115, 96)];
                } else if (var4.field180 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field180;
                    int var8 = (var7 & 0x7F) + arg1;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg2 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class109.field1746[class294.method2096(var9, arg0 + 118, 96)];
                }
                class190.field3150[var3 + 1] = var6;
            }
            var3++;
        }
        field648++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BII)V", line = 168)
    public static final void method254(byte arg0, int arg1, int arg2) {
        field644++;
        int var3 = -24 % ((-arg0 - 3) / 54);
        if (class272.method1992(2306, arg1)) {
            class87.method603(64, class92.field1459[arg1], arg2);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I", line = 181)
    public static int method255(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lwe;IBI)V", line = 189)
    private final void method256(class47 arg0, int arg1, byte arg2, int arg3) {
        field655++;
        if (arg2 < 42) {
            field650 = (int[]) null;
        }
        if (arg1 == 1) {
            this.field647 = arg0.method379(-2);
        } else if (arg1 == 2) {
            this.field645 = arg0.method368(-127);
            this.field649 = arg0.method368(-124);
        }
    }
}
