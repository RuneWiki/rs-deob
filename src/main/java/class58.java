import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class58 extends class42 {

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
    private int field1183 = 0;

    @OriginalMember(owner = "client!gb", name = "tb", descriptor = "Z")
    public boolean field1201 = false;

    @OriginalMember(owner = "client!gb", name = "qb", descriptor = "I")
    private int field1198 = 0;

    @OriginalMember(owner = "client!gb", name = "vb", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!gb", name = "nb", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!gb", name = "jb", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client!gb", name = "ob", descriptor = "Lgg;")
    private class62 field1196;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "[I")
    public static int[] field1186 = new int[32768];

    @OriginalMember(owner = "client!gb", name = "lb", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "[S")
    public static short[] field1189 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!gb", name = "rb", descriptor = "Lsd;")
    public static class166 field1199 = class135.method935("Fallen lassen", 0);

    @OriginalMember(owner = "client!gb", name = "sb", descriptor = "Lff;")
    public static class53 field1200 = new class53(new byte[5000]);

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!gb", name = "kb", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!gb", name = "mb", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!gb", name = "pb", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!gb", name = "ub", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)Lo;")
    public final class126 method111(int arg0) {
        if (arg0 < 8) {
            this.field1191 = 8;
        }
        field1185++;
        class117 var2 = class12.method77(this.field1188, 13);
        class126 var3;
        if (this.field1201) {
            var3 = var2.method843((byte) 117, -1);
        } else {
            var3 = var2.method843((byte) 117, this.field1183);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "(I)V")
    public static void method496(int arg0) {
        field1199 = null;
        field1186 = null;
        field1200 = null;
        if (arg0 != 25238) {
            field1193 = -35;
        }
        field1189 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
    public final void method497(int arg0, int arg1) {
        field1192++;
        if (arg1 != 0) {
            method496(90);
        }
        if (this.field1201) {
            return;
        }
        this.field1198 += arg0;
        while (this.field1196.field1268[this.field1183] < this.field1198) {
            this.field1198 -= this.field1196.field1268[this.field1183];
            this.field1183++;
            if (this.field1183 >= this.field1196.field1279.length) {
                this.field1201 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIII)V")
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1203 = arg2;
        this.field1190 = arg4;
        this.field1187 = arg6 + arg5;
        this.field1195 = arg3;
        this.field1191 = arg1;
        this.field1188 = arg0;
        int var8 = class12.method77(this.field1188, 13).field2275;
        if (var8 == -1) {
            this.field1201 = true;
        } else {
            this.field1201 = false;
            this.field1196 = class110.method798(var8, 12);
        }
    }
}
