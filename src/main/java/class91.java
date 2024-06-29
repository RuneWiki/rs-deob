import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class91 extends class17 {

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    private int field1425 = -1;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "Lsf;")
    private static class108 field1426 = class140.method973(255, "flash3:");

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "[I")
    public static int[] field1427 = new int[128];

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "Lsf;")
    public static class108 field1431 = field1426;

    @OriginalMember(owner = "client!pc", name = "ob", descriptor = "Lsf;")
    public static class108 field1439 = class140.method973(255, "gr-Un:");

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "Lsf;")
    public static class108 field1430 = class140.method973(255, "Votre liste noire est pleine (X100 noms maximum(Y)3");

    @OriginalMember(owner = "client!pc", name = "qb", descriptor = "Lsf;")
    public static class108 field1441 = field1426;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!pc", name = "pb", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "[I")
    private int[] field1434;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLrm;I)V", line = 7)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            this.method114((byte) -1, (class249) null, -105);
        }
        if (arg2 == 0) {
            this.field1425 = arg1.method1712(-1);
        }
        field1435++;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 210)
    public class91() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)I", line = 38)
    public final int method117(byte arg0) {
        if (arg0 > -81) {
            method614(14, -83, 84, -15, 86);
        }
        field1429++;
        return this.field1425;
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V", line = 50)
    public static void method613(int arg0) {
        field1431 = null;
        field1441 = null;
        if (arg0 != 65280) {
            field1430 = (class108) null;
        }
        field1426 = null;
        field1439 = null;
        field1427 = null;
        field1430 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V", line = 71)
    public static final void method614(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1436++;
        class120 var5 = class248.method1704(10, 121, arg2);
        var5.method844((byte) -28);
        if (arg1 != 255) {
            field1430 = (class108) null;
        }
        var5.field2066 = arg4;
        var5.field2067 = arg3;
        var5.field2055 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)[[I", line = 88)
    public final int[][] method122(boolean arg0, int arg1) {
        field1432++;
        int[][] var3 = this.field224.method2081(arg1, -105);
        if (arg0) {
            this.field1425 = 107;
        }
        if (this.field224.field5106 && this.method615(5366)) {
            int var4 = this.field1437 * (class289.field5059 == this.field1440 ? arg1 : this.field1440 * arg1 / class289.field5059);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class116.field2008 == this.field1437) {
                for (int var11 = 0; var11 < class116.field2008; var11++) {
                    int var12 = this.field1434[var4++];
                    var7[var11] = class162.method1118(var12, 255) << 4;
                    var6[var11] = class162.method1118(var12, 65280) >> 4;
                    var5[var11] = class162.method1118(4080, var12 >> 12);
                }
            } else {
                for (int var8 = 0; var8 < class116.field2008; var8++) {
                    int var9 = this.field1437 * var8 / class116.field2008;
                    int var10 = this.field1434[var4 + var9];
                    var7[var8] = class162.method1118(var10, 255) << 4;
                    var6[var8] = class162.method1118(65280, var10) >> 4;
                    var5[var8] = class162.method1118(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 165)
    public final void method107(int arg0) {
        field1428++;
        super.method107(arg0);
        this.field1434 = null;
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)Z", line = 174)
    private final boolean method615(int arg0) {
        field1433++;
        if (arg0 != 5366) {
            this.method122(false, -89);
        }
        if (this.field1434 != null) {
            return true;
        } else if (this.field1425 >= 0) {
            int var2 = class116.field2008;
            int var3 = class289.field5059;
            int var4 = class38.field523.method562(this.field1425, (byte) 84) ? 64 : 128;
            this.field1434 = class38.field523.method568(this.field1425, 105);
            this.field1437 = var4;
            this.field1440 = var4;
            class316.method2199(var2, var3, -32527);
            return this.field1434 != null;
        } else {
            return false;
        }
    }
}
