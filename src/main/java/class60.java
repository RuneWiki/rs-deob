import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 extends class12 {

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "[I")
    public int[] field1175;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[[I")
    public int[][] field1169;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lpe;")
    private static class109 field1168 = class141.method1120("Connecting to update server", 0);

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Lpe;")
    public static class109 field1166 = class141.method1120("au", 0);

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[I")
    public static int[] field1167 = new int[32];

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Lpe;")
    public static class109 field1170 = class141.method1120("bevor Sie den Vorgang wiederholen)3", 0);

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Lpe;")
    public static class109 field1165 = field1168;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field1178 = 0;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "Lpe;")
    public static class109 field1174 = class141.method1120(" zuerst von Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field1164 = 0;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "Lpe;")
    public static class109 field1179 = class141.method1120("cross", 0);

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "Ldf;")
    public static class28 field1177;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Lna;")
    public static class91 field1163;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "[Le;")
    public static class29[] field1176;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static void method456(int arg0) {
        field1166 = null;
        field1176 = null;
        field1177 = null;
        field1165 = null;
        field1174 = null;
        field1170 = null;
        field1167 = null;
        field1179 = null;
        if (arg0 == 20709) {
            field1168 = null;
            field1163 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I[B)V")
    public class60(int arg0, byte[] arg1) {
        this.field1173 = arg0;
        class13 var3 = new class13(arg1);
        this.field1172 = var3.method142(27467);
        this.field1175 = new int[this.field1172];
        this.field1169 = new int[this.field1172][];
        for (int var4 = 0; var4 < this.field1172; var4++) {
            this.field1175[var4] = var3.method142(27467);
        }
        for (int var5 = 0; var5 < this.field1172; var5++) {
            this.field1169[var5] = new int[var3.method142(27467)];
        }
        for (int var6 = 0; var6 < this.field1172; var6++) {
            for (int var7 = 0; var7 < this.field1169[var6].length; var7++) {
                this.field1169[var6][var7] = var3.method142(27467);
            }
        }
    }
}
