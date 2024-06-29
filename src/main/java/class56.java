import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class56 extends class54 {

    @OriginalMember(owner = "client!f", name = "Hb", descriptor = "I")
    public static int field1131 = 2;

    @OriginalMember(owner = "client!f", name = "Fb", descriptor = "Loc;")
    public static class151 field1129 = class137.method873(2, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!f", name = "Lb", descriptor = "Loc;")
    public static class151 field1135 = class137.method873(2, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!f", name = "Mb", descriptor = "Luc;")
    public static class211 field1136 = new class211(64);

    @OriginalMember(owner = "client!f", name = "Eb", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!f", name = "Gb", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!f", name = "Jb", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!f", name = "Cb", descriptor = "Lnd;")
    public static class142 field1126;

    @OriginalMember(owner = "client!f", name = "Db", descriptor = "Lnd;")
    public static class142 field1127;

    @OriginalMember(owner = "client!f", name = "Ib", descriptor = "Lsd;")
    public static class192 field1132;

    @OriginalMember(owner = "client!f", name = "Kb", descriptor = "Lsd;")
    public static class192 field1134;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != -81) {
            field1129 = null;
        }
        int[][] var3 = super.field13.method578(arg0, -1);
        if (super.field13.field1658 && this.method371(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg0 % super.field1083 * super.field1083;
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class202.field3603; ++var8) {
                int var9 = super.field1096[var6 - -(var8 % super.field1097)];
                var7[var8] = class26.method206(255, var9) << 4;
                var5[var8] = class26.method206(65280, var9) >> 4;
                var4[var8] = class26.method206(16711680, var9) >> 12;
            }
        }
        ++field1130;
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
    public static void method382(int arg0) {
        field1129 = null;
        field1127 = null;
        field1136 = null;
        if (arg0 != 941700452) {
            field1133 = -96;
        }
        field1132 = null;
        field1126 = null;
        field1135 = null;
        field1134 = null;
    }
}
