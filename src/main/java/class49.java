import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OZAHPBMK")
public class class49 {

    @OriginalMember(owner = "OZAHPBMK", name = "a", descriptor = "Z")
    private boolean field1283 = true;

    @OriginalMember(owner = "OZAHPBMK", name = "i", descriptor = "Z")
    public boolean field1291 = false;

    @OriginalMember(owner = "OZAHPBMK", name = "j", descriptor = "Z")
    public boolean field1292 = true;

    @OriginalMember(owner = "OZAHPBMK", name = "l", descriptor = "Z")
    public boolean field1294 = false;

    @OriginalMember(owner = "OZAHPBMK", name = "o", descriptor = "Z")
    public boolean field1297 = false;

    @OriginalMember(owner = "OZAHPBMK", name = "p", descriptor = "I")
    public int field1298 = -1;

    @OriginalMember(owner = "OZAHPBMK", name = "q", descriptor = "Z")
    public boolean field1299 = true;

    @OriginalMember(owner = "OZAHPBMK", name = "b", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "OZAHPBMK", name = "d", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "OZAHPBMK", name = "g", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "OZAHPBMK", name = "h", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "OZAHPBMK", name = "k", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "OZAHPBMK", name = "m", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "OZAHPBMK", name = "n", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "OZAHPBMK", name = "f", descriptor = "Ljava/lang/String;")
    public String field1288;

    @OriginalMember(owner = "OZAHPBMK", name = "e", descriptor = "[I")
    public static int[] field1287;

    @OriginalMember(owner = "OZAHPBMK", name = "c", descriptor = "[LOZAHPBMK;")
    public static class49[] field1285;

    @OriginalMember(owner = "OZAHPBMK", name = "a", descriptor = "(LVSUYIIVA;I)V")
    public static void method457(class62 arg0, int arg1) {
        class8 var2 = new class8(arg0.method570("varp.dat", null), 792);
        field1286 = 0;
        field1284 = var2.method32();
        if (arg1 <= 0) {
            return;
        }
        if (field1285 == null) {
            field1285 = new class49[field1284];
        }
        if (field1287 == null) {
            field1287 = new int[field1284];
        }
        for (int var3 = 0; var3 < field1284; var3++) {
            if (field1285[var3] == null) {
                field1285[var3] = new class49();
            }
            field1285[var3].method458(var3, (byte) 5, var2);
        }
        if (var2.field71.length != var2.field72) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "OZAHPBMK", name = "a", descriptor = "(IBLCFARFRSG;)V")
    public void method458(int arg0, byte arg1, class8 arg2) {
        if (arg1 == 5) {
            boolean var4 = false;
        } else {
            this.field1283 = !this.field1283;
        }
        while (true) {
            int var5 = arg2.method30();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1289 = arg2.method30();
            } else if (var5 == 2) {
                this.field1290 = arg2.method30();
            } else if (var5 == 3) {
                this.field1291 = true;
                field1287[field1286++] = arg0;
            } else if (var5 == 4) {
                this.field1292 = false;
            } else if (var5 == 5) {
                this.field1293 = arg2.method32();
            } else if (var5 == 6) {
                this.field1294 = true;
            } else if (var5 == 7) {
                this.field1295 = arg2.method35();
            } else if (var5 == 8) {
                this.field1296 = 1;
                this.field1297 = true;
            } else if (var5 == 10) {
                this.field1288 = arg2.method37();
            } else if (var5 == 11) {
                this.field1297 = true;
            } else if (var5 == 12) {
                this.field1298 = arg2.method35();
            } else if (var5 == 13) {
                this.field1296 = 2;
                this.field1297 = true;
            } else if (var5 == 14) {
                this.field1299 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
