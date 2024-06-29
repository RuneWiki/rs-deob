import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 extends class120 {

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "I")
    private int field1133 = 4096;

    @OriginalMember(owner = "client!l", name = "db", descriptor = "I")
    private int field1136 = 4096;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    private int field1138 = 4096;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "Lok;")
    public static class41 field1127 = class137.method956("Hierhin gehen", 45);

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "Lok;")
    public static class41 field1132 = class137.method956(" x ", 45);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "[I")
    public static int[] field1126 = new int[100];

    @OriginalMember(owner = "client!l", name = "X", descriptor = "Lok;")
    public static class41 field1130 = class137.method956("::wm1", 45);

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "Lmh;")
    public static class65 field1134;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IZ)[[I", line = 33)
    public final int[][] method168(int arg0, boolean arg1) {
        field1135++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[][] var4 = this.method858(0, arg0, 123);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class307.field5160; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var14 && var13 == var14) {
                    var9[var11] = this.field1133 * var12 >> 12;
                    var8[var11] = this.field1136 * var14 >> 12;
                    var10[var11] = this.field1138 * var13 >> 12;
                } else {
                    var9[var11] = this.field1133;
                    var8[var11] = this.field1136;
                    var10[var11] = this.field1138;
                }
            }
        }
        return arg1 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Llb;II)V", line = 107)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1133 = arg0.method759((byte) -125);
        } else if (arg2 == 1) {
            this.field1136 = arg0.method759((byte) -59);
        } else if (arg2 == 2) {
            this.field1138 = arg0.method759((byte) -72);
        }
        if (arg1 != -1) {
            field1132 = (class41) null;
        }
        field1129++;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V", line = 147)
    public static void method556(boolean arg0) {
        field1126 = null;
        field1132 = null;
        field1130 = null;
        field1134 = null;
        field1127 = null;
        if (!arg0) {
            method556(true);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 198)
    public class76() {
        super(1, false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lmh;Llj;ILmh;)V", line = 172)
    public static final void method557(class65 arg0, class25 arg1, int arg2, class65 arg3) {
        field1128++;
        class79.field1163 = arg1;
        class120.field1780 = arg0;
        class98.field1433 = arg3;
        if (arg2 != 0) {
            method556(false);
        }
        if (class120.field1780 != null) {
            class73.field1081 = class120.field1780.method481(arg2 ^ 0x43E1, 1);
        }
        if (class98.field1433 != null) {
            class308.field5185 = class98.field1433.method481(17377, 1);
        }
    }
}
