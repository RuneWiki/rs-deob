import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class75 extends class23 {

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    private int field1391 = 0;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    private int field1394 = 1365;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    private int field1390 = 0;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    private int field1401 = 20;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "Llc;")
    private static class143 field1397 = class66.method374("Loading interfaces )2 ", -1);

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "Llc;")
    public static class143 field1393 = class66.method374("Sprites geladen)3", -1);

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "Llc;")
    public static class143 field1396 = field1397;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field1398 = -1;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "[Lhe;")
    public static class78[] field1403 = new class78[50];

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field1402 = 128;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "Llc;")
    public static class143 field1404 = class66.method374("Annuler", -1);

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)I")
    public static final int method430(int arg0, int arg1, int arg2) {
        ++field1388;
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        if (arg1 != 2) {
            return 65;
        } else {
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (134131846 & var5) >> 19;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        if (arg0 > -13) {
            method433(-121, 74, 81, 9, (class51) null, 40L, (class51) null, (class51) null);
        }
        ++field1389;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            for (int var4 = 0; var4 < class72.field1359; ++var4) {
                int var5 = (class3.field43[var4] << 12) / this.field1394 + this.field1390;
                int var6 = (class31.field495[arg1] << 12) / this.field1394 + this.field1391;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 - -var12) > -16385 && ~var13 > ~this.field1401) {
                    ++var13;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 - -var7;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 < this.field1401 + -1 ? (var13 << 12) / this.field1401 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZII)V")
    public static final void method431(int arg0, boolean arg1, int arg2, int arg3) {
        class166 var4 = class262.method1746(109, arg3, 4);
        var4.method1097((byte) -74);
        var4.field2978 = arg2;
        ++field1392;
        var4.field2979 = arg0;
        if (arg1) {
            method432((short) 68, (class143) null, -68, false, (class143) null, 1, -14L);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(SLlc;IZLlc;IJ)V")
    public static final void method432(short arg0, class143 arg1, int arg2, boolean arg3, class143 arg4, int arg5, long arg6) {
        if (arg3) {
            ++field1395;
            if (!class139.field2415) {
                if (~class257.field4625 > -501) {
                    class132.field2319[class257.field4625] = arg1;
                    class136.field2382[class257.field4625] = arg4;
                    class122.field2147[class257.field4625] = arg0;
                    class69.field1321[class257.field4625] = arg6;
                    class128.field2269[class257.field4625] = arg2;
                    class168.field3006[class257.field4625] = arg5;
                    ++class257.field4625;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field1387;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field1391 = arg0.method1275(128);
                    }
                } else {
                    this.field1390 = arg0.method1275(128);
                }
            } else {
                this.field1401 = arg0.method1275(128);
            }
        } else {
            this.field1394 = arg0.method1275(128);
        }
        if (!arg2) {
            field1399 = -25;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIILqk;JLqk;Lqk;)V")
    public static final void method433(int arg0, int arg1, int arg2, int arg3, class51 arg4, long arg5, class51 arg6, class51 arg7) {
        class105 var9 = new class105();
        var9.field1856 = arg4;
        var9.field1855 = arg1 * 128 + 64;
        var9.field1862 = arg2 * 128 + 64;
        var9.field1860 = arg3;
        var9.field1858 = arg5;
        var9.field1859 = arg6;
        var9.field1848 = arg7;
        int var10 = 0;
        class120 var11 = class7.field122[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2134; ++var12) {
                class211 var13 = var11.field2144[var12];
                if ((var13.field3928 & 4194304L) == 4194304L) {
                    int var14 = var13.field3916.method166();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1852 = -var10;
        if (class7.field122[arg0][arg1][arg2] == null) {
            class7.field122[arg0][arg1][arg2] = new class120(arg0, arg1, arg2);
        }
        class7.field122[arg0][arg1][arg2].field2146 = var9;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public static void method434(int arg0) {
        field1397 = null;
        field1403 = null;
        field1393 = null;
        field1396 = null;
        if (arg0 < 102) {
            method432((short) 90, (class143) null, -122, false, (class143) null, -12, 120L);
        }
        field1404 = null;
    }
}
