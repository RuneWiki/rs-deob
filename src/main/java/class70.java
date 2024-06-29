import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class70 extends class166 {

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    private int field1372 = 20;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    private int field1371 = 1365;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    private int field1375 = 0;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    private int field1377 = 0;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "Lnb;")
    public static class199 field1378 = new class199(64);

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    public static int field1380 = 0;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "[I")
    public static int[] field1382 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "Lhj;")
    public static class69 field1379 = class181.method1318("Ablegen", (byte) -109);

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "[[[Lrg;")
    public static class217[][][] field1381;

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class70() {
        super(0, true);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILhj;Lhj;Lhj;II)V")
    public static final void method498(int arg0, class69 arg1, class69 arg2, class69 arg3, int arg4, int arg5) {
        for (int var6 = 99; var6 > 0; --var6) {
            class138.field2577[var6] = class138.field2577[var6 + -1];
            class81.field1551[var6] = class81.field1551[var6 + -1];
            class228.field4160[var6] = class228.field4160[var6 + -1];
            class149.field2770[var6] = class149.field2770[var6 + -1];
            class41.field578[var6] = class41.field578[var6 + -1];
        }
        if (arg4 != -1) {
            method502(true);
        }
        class81.field1551[0] = arg1;
        class138.field2577[0] = arg5;
        class41.field578[0] = arg0;
        class228.field4160[0] = arg2;
        class149.field2770[0] = arg3;
        ++field1368;
        class128.field2381 = class81.field1564;
        ++class32.field441;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field1376;
        if (arg0 != 96) {
            method500(22, 65, -59);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field1377 = arg1.method912(88);
                    }
                } else {
                    this.field1375 = arg1.method912(-116);
                }
            } else {
                this.field1372 = arg1.method912(arg0 + 19);
            }
        } else {
            this.field1371 = arg1.method912(-124);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lnc;I)V")
    public static final void method499(class83 arg0, int arg1) {
        class207.field3778 = arg0;
        ++field1374;
        class71.field1385 = class207.field3778.method594(16, (byte) 121);
        if (arg1 <= 23) {
            field1382 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(III)V")
    public static final void method500(int arg0, int arg1, int arg2) {
        ++field1369;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var4[0] = arg1;
        var3[arg2] = arg0;
        int var5 = 1;
        for (int var6 = 0; ~var6 > -5; ++var6) {
            if (class106.field2003[var6] != arg1) {
                var4[var5] = class106.field2003[var6];
                var3[var5] = class43.field621[var6];
                ++var5;
            }
        }
        class43.field621 = var3;
        class106.field2003 = var4;
        class91.method644(class3.field8, (byte) 46, 0, class3.field8.length + -1);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field1370;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (arg1 != 8388607) {
            field1379 = null;
        }
        if (super.field3071.field3142) {
            for (int var4 = 0; ~class253.field4565 < ~var4; ++var4) {
                int var5 = (class24.field347[var4] << 12) / this.field1371 - -this.field1375;
                int var6 = (class13.field187[arg0] << 12) / this.field1371 + this.field1377;
                int var7 = var6;
                int var8 = var5 * var5 >> 12;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5;
                int var12 = 0;
                int var13 = var6 * var6 >> 12;
                while (~(var8 + var13) > -16385 && var12 < this.field1372) {
                    ++var12;
                    var10 = (var10 * var11 >> 12) * 2 + var7;
                    var11 = -var13 + var8 + var9;
                    var13 = var10 * var10 >> 12;
                    var8 = var11 * var11 >> 12;
                }
                var3[var4] = var12 < this.field1372 - 1 ? (var12 << 12) / this.field1372 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)V")
    public static final void method501(boolean arg0) {
        ++field1367;
        if (arg0) {
            int[] var1 = new int[class23.field311];
            int var2 = 0;
            for (int var3 = 0; ~class23.field311 < ~var3; ++var3) {
                class205 var5 = class83.method585(var3, -1);
                if (~var5.field3693 <= -1 || ~var5.field3748 <= -1) {
                    var1[var2++] = var3;
                }
            }
            class89.field1691 = new int[var2];
            for (int var4 = 0; var2 > var4; ++var4) {
                class89.field1691[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(Z)V")
    public static void method502(boolean arg0) {
        field1381 = null;
        field1379 = null;
        field1382 = null;
        if (!arg0) {
            method498(6, (class69) null, (class69) null, (class69) null, -12, 7);
        }
        field1378 = null;
    }
}
