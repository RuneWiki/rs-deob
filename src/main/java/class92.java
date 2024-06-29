import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class92 {

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "S")
    public static short field1266 = 1;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Lbg;")
    public static class324 field1265 = new class324(104, 6);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Lok;")
    public class167 field1262;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field1267;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Liv;I)V", line = 5)
    public final void method815(class65 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method577(255);
            if (var3 == 0) {
                field1263++;
                if (arg1 != 27223) {
                    field1266 = -90;
                    return;
                }
                return;
            }
            this.method819(arg1 - 27222, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lmu;ZII)V", line = 26)
    public static final void method816(class196 arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field1264++;
            class435.field6370[arg2][arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;", line = 38)
    public static final String[] method817(byte arg0, String arg1, char arg2) {
        field1270++;
        int var3 = class272.method1758((byte) -92, arg1, arg2);
        int var4 = -16 % ((-arg0 - 34) / 38);
        String[] var5 = new String[var3 + 1];
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = var7; arg1.charAt(var9) != arg2; var9++) {
            }
            var5[var6++] = arg1.substring(var7, var9);
            var7 = var9 + 1;
        }
        var5[var3] = arg1.substring(var7);
        return var5;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 73)
    public static void method818(int arg0) {
        field1265 = null;
        if (arg0 != 1) {
            method818(56);
        }
        field1267 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILiv;)V", line = 86)
    private final void method819(int arg0, int arg1, class65 arg2) {
        field1259++;
        if (arg0 == arg1) {
            this.field1268 = arg2.method623((byte) -83);
        } else if (arg1 == 2) {
            this.field1261 = arg2.method577(255);
            this.field1260 = arg2.method577(255);
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Lbb;", line = 119)
    public final synchronized class218 method820(int arg0) {
        field1269++;
        class218 var2 = (class218) this.field1262.field2372.method1115((long) this.field1268, (byte) 58);
        if (var2 != null) {
            return var2;
        }
        class218 var3 = class218.method1488(this.field1262.field2369, this.field1268, arg0);
        if (var3 != null) {
            this.field1262.field2372.method1107(1, (long) this.field1268, var3);
        }
        return var3;
    }
}
