import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class105 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Lok;")
    public static class41 field1491 = class137.method956("::fpsoff", 45);

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lok;")
    public static class41 field1489 = class137.method956("Texturen geladen)3", 45);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lok;")
    public static class41 field1488 = class137.method956("<col=00ff00>", 45);

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Lok;")
    public static class41 field1496 = class137.method956("Lade Texturen )2 ", 45);

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Ltb;")
    public static class199 field1493;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILic;II)V", line = 9)
    public static final void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class171 arg6, int arg7, int arg8) {
        field1490++;
        int var9 = arg7 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg6.field2784;
            var11 = arg6.field2752;
        } else {
            var10 = arg6.field2752;
            var11 = arg6.field2784;
        }
        int var12;
        int var13;
        if (arg0 + var10 > 104) {
            var12 = arg0;
            var13 = arg0 + 1;
        } else {
            var12 = (var10 >> 1) + arg0;
            var13 = (var10 + 1 >> 1) + arg0;
        }
        int var14 = (arg4 << 7) + (var11 << 6);
        int var15 = (arg0 << 7) + (var10 << 6);
        int var16;
        int var17;
        if (arg4 + var11 > 104) {
            var16 = arg4 + 1;
            var17 = arg4;
        } else {
            var17 = (var11 >> 1) + arg4;
            var16 = (var11 + 1 >> 1) + arg4;
        }
        int[][] var18 = class278.field4548[arg2];
        int var19 = var18[var12][var17] + var18[var13][var17] + var18[var12][var16] + var18[var13][var16] >> 2;
        int var20 = arg5;
        if (arg2 != 0) {
            int[][] var21 = class278.field4548[0];
            var20 = var19 - (var21[var12][var17] + var21[var13][var16] + var21[var13][var17] + var21[var12][var16] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg2 < 3) {
            var22 = class278.field4548[arg2 + 1];
        }
        class175 var23 = arg6.method1231((class279) null, false, arg7, var18, var14, true, 3778, var15, var19, var22, arg8);
        class263.method1855(var23.field2840, var15 - arg3, var20, var14 - arg1);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBIIIIII)V", line = 97)
    public static final void method724(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1495++;
        if (arg1 <= 43) {
            field1491 = (class41) null;
        }
        if (arg4 >= class273.field4449 && class153.field2439 >= arg6 && arg7 >= class15.field192 && arg5 <= class237.field3801) {
            class147.method1019(arg0, arg6, arg3, false, arg7, arg2, arg5, arg4);
        } else {
            class202.method1433(arg3, arg4, 18480, arg0, arg5, arg7, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZIZI)V", line = 115)
    public static final void method725(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field1492++;
        class26.field381 = 0L;
        int var5 = class33.method228((byte) 105);
        if (arg2 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (class211.field3400.startsWith("mac") && arg2 > 0) {
            arg3 = true;
        }
        boolean var6 = arg1;
        if (arg2 > 0 == var5 <= 0) {
            var6 = true;
        }
        if (arg3 && arg2 > 0) {
            var6 = true;
        }
        class125.method880(var6, arg0, arg4, var5, arg2, 15732, arg3);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)Lok;", line = 144)
    public static final class41 method726(boolean arg0, int arg1, int arg2) {
        field1494++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class311.field5242;
        } else if (var3 < -6) {
            return class196.field3160;
        } else if (var3 < -3) {
            return class152.field2377;
        } else if (var3 < 0) {
            return class237.field3800;
        } else if (var3 > 9) {
            return field1488;
        } else if (var3 > 6) {
            return class160.field2539;
        } else if (!arg0) {
            return (class41) null;
        } else if (var3 <= 3) {
            return var3 > 0 ? class23.field352 : class75.field1118;
        } else {
            return class290.field4708;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 193)
    public static void method727(int arg0) {
        field1493 = null;
        field1488 = null;
        field1496 = null;
        if (arg0 != -9190) {
            field1491 = (class41) null;
        }
        field1489 = null;
        field1491 = null;
    }
}
