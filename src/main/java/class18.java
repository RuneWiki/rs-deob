import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class18 extends class121 {

    @OriginalMember(owner = "client!c", name = "W", descriptor = "Loc;")
    public static class99 field473 = class48.method402((byte) -104, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!c", name = "db", descriptor = "I")
    public static int field480 = 0;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "[[[Lma;")
    public static class83[][][] field476 = new class83[4][104][104];

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "Loc;")
    public static class99 field475 = class48.method402((byte) -104, " (X");

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field469 = -1;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    public static final void method173(int arg0, int arg1, int arg2, int arg3) {
        field479++;
        if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
            class135.field3375 = -1;
            class101.field2464 = -1;
            return;
        }
        if (arg3 != -1) {
            field475 = null;
        }
        int var4 = class137.method1144(true, arg2, arg1, class84.field2116) - arg0;
        int var5 = class40.field982[class94.field2288];
        int var6 = var4 - class12.field266;
        int var7 = class40.field981[class32.field754];
        int var8 = class40.field982[class32.field754];
        int var9 = arg2 - class145.field3611;
        int var10 = arg1 - class94.field2290;
        int var11 = class40.field981[class94.field2288];
        int var12 = var5 * var10 + var9 * var11 >> 16;
        int var13 = var10 * var11 - var5 * var9 >> 16;
        int var15 = var6 * var7 - var8 * var13 >> 16;
        int var16 = var6 * var8 + var7 * var13 >> 16;
        if (var16 >= 50) {
            class101.field2464 = (var12 << 9) / var16 + 256;
            class135.field3375 = (var15 << 9) / var16 + 167;
        } else {
            class135.field3375 = -1;
            class101.field2464 = -1;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZLib;)V")
    private final void method174(int arg0, boolean arg1, class57 arg2) {
        field470++;
        if (arg1) {
            this.field477 = -2;
        }
        if (arg0 == 1) {
            this.field477 = arg2.method506(-1);
            this.field478 = arg2.method510(-123);
            this.field468 = arg2.method510(-109);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)Z")
    public static final boolean method175(byte arg0, int arg1) {
        field471++;
        if (arg0 >= -49) {
            field469 = 78;
        }
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static void method176(int arg0) {
        field476 = null;
        field475 = null;
        field473 = null;
        if (arg0 != 13056) {
            field480 = 50;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILib;)V")
    public final void method177(int arg0, class57 arg1) {
        if (arg0 <= 102) {
            field469 = 111;
        }
        while (true) {
            int var3 = arg1.method510(-117);
            if (var3 == 0) {
                field472++;
                return;
            }
            this.method174(var3, false, arg1);
        }
    }
}
