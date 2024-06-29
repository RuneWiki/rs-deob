import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class94 {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1470 = "Please remove ";

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Lde;")
    public class70 field1469;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "[I")
    public static int[] field1471;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[I")
    public int[] field1478;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 5)
    public static final void method809(byte arg0) {
        field1473++;
        if (class126.field2168 == 5) {
            class126.field2168 = 6;
            if (arg0 > -30) {
                field1471 = (int[]) null;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BC)B", line = 22)
    public static final byte method810(byte arg0, char arg1) {
        if (arg0 < 123) {
            return 125;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        field1468++;
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 149)
    public static void method811(int arg0) {
        field1470 = null;
        if (arg0 != -129) {
            field1471 = (int[]) null;
        }
        field1471 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lcg;Z)V", line = 164)
    public static final void method812(class49 arg0, boolean arg1) {
        if (arg1) {
            method809((byte) 45);
        }
        field1477++;
        class125.field2162 = arg0.method437((byte) -33, "runes");
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIII)V", line = 178)
    public static final void method813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1472++;
        int var7 = class105.method899(false, class135.field2358, class90.field1428, arg0);
        int var8 = class105.method899(false, class135.field2358, class90.field1428, arg3);
        int var9 = class105.method899(false, class310.field4916, class170.field2944, arg5);
        int var10 = class105.method899(false, class310.field4916, class170.field2944, arg2);
        if (arg1 != 11384) {
            return;
        }
        int var11 = class105.method899(false, class135.field2358, class90.field1428, arg0 + arg6);
        int var12 = class105.method899(false, class135.field2358, class90.field1428, arg3 - arg6);
        for (int var13 = var7; var13 < var11; var13++) {
            class317.method2184(var10, (byte) 102, class64.field1007[var13], arg4, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class317.method2184(var10, (byte) -30, class64.field1007[var14], arg4, var9);
        }
        int var15 = class105.method899(false, class310.field4916, class170.field2944, arg5 + arg6);
        int var16 = class105.method899(false, class310.field4916, class170.field2944, arg2 - arg6);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class64.field1007[var17];
            class317.method2184(var15, (byte) 98, var18, arg4, var9);
            class317.method2184(var10, (byte) 120, var18, arg4, var16);
        }
    }
}
