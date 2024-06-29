import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class144 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "[Ltd;")
    public static class71[] field2599 = new class71[4];

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[J")
    public static long[] field2601 = new long[200];

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lpj;")
    public static class237 field2607 = class33.method353("<br>(X100(U(Y", 121);

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[[[I")
    public static int[][][] field2603;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(JI)V")
    public static final void method988(long arg0, int arg1) {
        field2598++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != 9502) {
            method992((byte) -64, 93, 71, -24, 75, 42, 58, 66);
        }
        for (int var3 = 0; var3 < class179.field3143; var3++) {
            if (class17.field289[var3] == arg0) {
                class179.field3143--;
                class149.field2655++;
                for (int var4 = var3; var4 < class179.field3143; var4++) {
                    class17.field289[var4] = class17.field289[var4 + 1];
                    class78.field1477[var4] = class78.field1477[var4 + 1];
                }
                class20.field381 = class3.field31;
                class223.field3830.method368(arg1 - 9598, 22);
                class223.field3830.method292(120, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)V")
    public static final void method989(byte arg0, int arg1) {
        class270 var2 = class202.method1368(-15, 6, arg1);
        if (arg0 <= -116) {
            field2602++;
            var2.method1795(-2113);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method990(int arg0) {
        field2603 = null;
        int var1 = -64 % ((66 - arg0) / 50);
        field2607 = null;
        field2599 = null;
        field2601 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZIILfa;I)V")
    public static final void method991(int arg0, boolean arg1, int arg2, int arg3, class239 arg4, int arg5) {
        class230.field3942 = arg2;
        class199.field3452 = arg3;
        class43.field953 = 10000;
        field2600++;
        class193.field3340 = arg0;
        if (arg5 >= -15) {
            field2597 = -75;
        }
        class55.field1144 = arg4;
        class41.field930 = 1;
        class62.field1248 = arg1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method992(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2605++;
        if (arg0 > -5) {
            return;
        }
        int var8 = 2048 - arg2 & 0x7FF;
        int var9 = 2048 - arg3 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = class150.field2676[var8];
            int var14 = class150.field2670[var8];
            var11 = -arg6 * var14 >> 16;
            var12 = arg6 * var13 >> 16;
        }
        if (var9 != 0) {
            int var15 = class150.field2676[var9];
            int var16 = class150.field2670[var9];
            var10 = var12 * var16 >> 16;
            var12 = var12 * var15 >> 16;
        }
        class20.field380 = arg7 - var10;
        class167.field2957 = arg4 - var12;
        class214.field3654 = arg2;
        class189.field3289 = arg3;
        class112.field1957 = arg5 - var11;
    }
}
