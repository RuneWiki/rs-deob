import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MWRUKLPF")
public class class44 {

    @OriginalMember(owner = "MWRUKLPF", name = "a", descriptor = "I")
    private int field1286 = 654;

    @OriginalMember(owner = "MWRUKLPF", name = "h", descriptor = "Z")
    public boolean field1293 = false;

    @OriginalMember(owner = "MWRUKLPF", name = "i", descriptor = "I")
    public int field1294 = -1;

    @OriginalMember(owner = "MWRUKLPF", name = "b", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "MWRUKLPF", name = "e", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "MWRUKLPF", name = "f", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "MWRUKLPF", name = "g", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "MWRUKLPF", name = "j", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "MWRUKLPF", name = "d", descriptor = "Ljava/lang/String;")
    public String field1289;

    @OriginalMember(owner = "MWRUKLPF", name = "c", descriptor = "[LMWRUKLPF;")
    public static class44[] field1288;

    @OriginalMember(owner = "MWRUKLPF", name = "a", descriptor = "(LDYBMLHQM;Z)V")
    public static void method418(class16 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        class29 var2 = new class29((byte) -28, arg0.method248("varbit.dat", null));
        field1287 = var2.method310();
        if (field1288 == null) {
            field1288 = new class44[field1287];
        }
        for (int var3 = 0; var3 < field1287; var3++) {
            if (field1288[var3] == null) {
                field1288[var3] = new class44();
            }
            field1288[var3].method419(-45827, var3, var2);
            if (field1288[var3].field1293) {
                class64.field1558[field1288[var3].field1290].field1570 = true;
            }
        }
        if (var2.field1106.length != var2.field1107) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "MWRUKLPF", name = "a", descriptor = "(IILINLHDAGO;)V")
    public void method419(int arg0, int arg1, class29 arg2) {
        if (arg0 != -45827) {
            this.field1286 = -34;
        }
        while (true) {
            int var4 = arg2.method308();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1290 = arg2.method310();
                this.field1291 = arg2.method308();
                this.field1292 = arg2.method308();
            } else if (var4 == 10) {
                this.field1289 = arg2.method315();
            } else if (var4 == 2) {
                this.field1293 = true;
            } else if (var4 == 3) {
                this.field1294 = arg2.method313();
            } else if (var4 == 4) {
                this.field1295 = arg2.method313();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
