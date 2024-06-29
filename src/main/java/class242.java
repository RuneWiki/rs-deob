import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class242 {

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lhj;")
    public static class69 field4447 = class181.method1318("Clientscript error in: ", (byte) -116);

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Lhj;")
    public static class69 field4444 = class181.method1318("showingVideoAd", (byte) -109);

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lhj;")
    public static class69 field4446 = null;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lhj;")
    public static class69 field4439 = class181.method1318("<)4col>", (byte) -120);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lhj;")
    public static class69 field4443 = class181.method1318("welle:", (byte) -114);

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "F")
    public static float field4448;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBIZJ)Lhj;")
    public static final class69 method1716(int arg0, byte arg1, int arg2, boolean arg3, long arg4) {
        field4450++;
        class69 var6 = class103.method758(0, true);
        if (arg4 < 0L) {
            var6.method462(8914, class133.field2481);
            arg4 = -arg4;
        }
        if (arg1 < 50) {
            field4439 = null;
        }
        class69 var7 = class79.field1524;
        class69 var8 = class39.field563;
        if (arg0 == 1) {
            var8 = class79.field1524;
            var7 = class39.field563;
        }
        if (arg0 == 2) {
            var7 = class39.field563;
            var8 = class229.field4177;
        }
        class69 var9 = class103.method758(0, true);
        class69 var10 = class103.method758(0, true);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method462(8914, class98.method727(-229, (int) (arg4 % 10L)));
            arg4 /= 10L;
        }
        if (arg4 == 0L) {
            var9 = class129.field2409;
        }
        int var12 = 0;
        while (arg4 > 0L) {
            if (arg3 && var12 != 0 && var12 % 3 == 0) {
                var9.method462(8914, var8);
            }
            var12++;
            var9.method462(8914, class98.method727(-229, (int) (arg4 % 10L)));
            arg4 /= 10L;
        }
        if (var10.method441((byte) 73) > 0) {
            var10.method462(8914, var7);
        }
        return class9.method42(-103, new class69[] { var6, var9.method482((byte) -128), var10.method482((byte) -57) });
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method1717(byte arg0, int arg1) {
        field4440++;
        if (arg1 == 100 && class116.field2217 > 0) {
            byte[] var2 = class39.field543[--class116.field2217];
            class39.field543[class116.field2217] = null;
            return var2;
        }
        if (arg0 <= 29) {
            field4448 = -0.09862678F;
        }
        if (arg1 == 5000 && class99.field1874 > 0) {
            byte[] var3 = class265.field4720[--class99.field1874];
            class265.field4720[class99.field1874] = null;
            return var3;
        } else if (arg1 == 30000 && class84.field1627 > 0) {
            byte[] var4 = class104.field1968[--class84.field1627];
            class104.field1968[class84.field1627] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lhj;")
    public static final class69 method1718(int arg0, int arg1) {
        field4449++;
        return arg0 > arg1 ? class98.method727(-229, arg1) : class186.field3358;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method1719(int arg0) {
        field4443 = null;
        if (arg0 != -1001) {
            method1716(21, (byte) 105, -42, true, 68L);
        }
        field4439 = null;
        field4447 = null;
        field4446 = null;
        field4444 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[S[Lhj;)V")
    public static final void method1720(int arg0, int arg1, int arg2, short[] arg3, class69[] arg4) {
        field4451++;
        if (arg2 != 3 || arg0 >= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        class69 var6 = arg4[var5];
        int var7 = arg0;
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var6;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (var6 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].method465(var6, (byte) 126)) {
                class69 var10 = arg4[var9];
                arg4[var9] = arg4[var7];
                arg4[var7] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var7];
                arg3[var7++] = var11;
            }
        }
        arg4[arg1] = arg4[var7];
        arg4[var7] = var6;
        arg3[arg1] = arg3[var7];
        arg3[var7] = var8;
        method1720(arg0, var7 - 1, 3, arg3, arg4);
        method1720(var7 + 1, arg1, 3, arg3, arg4);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lrj;")
    public static final class8 method1721(int arg0, int arg1) {
        field4442++;
        class8 var2 = (class8) class235.field4267.method1448((long) arg1, (byte) -40);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class110.field2100.method590(arg1, 5, arg0);
        class8 var4 = new class8();
        if (var3 != null) {
            var4.method40(new class128(var3), -29834);
        }
        class235.field4267.method1453(arg0, var4, (long) arg1);
        return var4;
    }
}
