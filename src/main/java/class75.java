import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class75 {

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public int field1283 = 2048;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public int field1284 = 0;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public int field1285 = 0;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public int field1287 = 2048;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lfg;")
    public static class18 field1286 = new class18(50);

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field1288 = 64;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "[I")
    public static int[] field1290 = new int[250];

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
    public static int[] field1289;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILec;I)V")
    private final void method590(int arg0, int arg1, class37 arg2, int arg3) {
        field1291++;
        if (arg0 == 1) {
            this.field1284 = arg2.method271((byte) 106);
        } else if (arg0 == 2) {
            this.field1283 = arg2.method320((byte) -87);
        } else if (arg0 == 3) {
            this.field1287 = arg2.method320((byte) -87);
        } else if (arg0 == 4) {
            this.field1285 = arg2.method321((byte) 106);
        }
        if (arg3 != 3536) {
            method593(-118);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLec;I)V")
    public final void method591(byte arg0, class37 arg1, int arg2) {
        if (arg0 > -103) {
            this.method590(-20, 17, (class37) null, -59);
        }
        field1292++;
        while (true) {
            int var4 = arg1.method271((byte) 101);
            if (var4 == 0) {
                return;
            }
            this.method590(var4, arg2, arg1, 3536);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)V")
    public static final void method592(int arg0, int arg1, int arg2) {
        class168 var3 = class443.field6447[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2505 != null) {
            var3.field2505 = null;
        }
        if (var3.field2510 != null) {
            var3.field2510 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public static void method593(int arg0) {
        if (arg0 != 64) {
            field1288 = 42;
        }
        field1290 = null;
        field1289 = null;
        field1286 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)V")
    public static final void method594(int arg0, int arg1, int arg2, int arg3) {
        class278.field4176 = new byte[arg2][arg1][arg0];
        field1293++;
        if (arg3 < 98) {
            method592(91, 53, -78);
        }
    }
}
