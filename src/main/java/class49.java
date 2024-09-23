import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RRCEOPDB")
public class class49 {

    @OriginalMember(owner = "RRCEOPDB", name = "h", descriptor = "Z")
    public boolean field1317 = false;

    @OriginalMember(owner = "RRCEOPDB", name = "i", descriptor = "Z")
    public boolean field1318 = true;

    @OriginalMember(owner = "RRCEOPDB", name = "k", descriptor = "Z")
    public boolean field1320 = false;

    @OriginalMember(owner = "RRCEOPDB", name = "n", descriptor = "Z")
    public boolean field1323 = false;

    @OriginalMember(owner = "RRCEOPDB", name = "o", descriptor = "I")
    public int field1324 = -1;

    @OriginalMember(owner = "RRCEOPDB", name = "p", descriptor = "Z")
    public boolean field1325 = true;

    @OriginalMember(owner = "RRCEOPDB", name = "a", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "RRCEOPDB", name = "c", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "RRCEOPDB", name = "f", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "RRCEOPDB", name = "g", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "RRCEOPDB", name = "j", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "RRCEOPDB", name = "l", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "RRCEOPDB", name = "m", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "RRCEOPDB", name = "e", descriptor = "Ljava/lang/String;")
    public String field1314;

    @OriginalMember(owner = "RRCEOPDB", name = "d", descriptor = "[I")
    public static int[] field1313;

    @OriginalMember(owner = "RRCEOPDB", name = "b", descriptor = "[LRRCEOPDB;")
    public static class49[] field1311;

    @OriginalMember(owner = "RRCEOPDB", name = "a", descriptor = "(ILRVLWVPJQ;)V")
    public static void method421(int arg0, class50 arg1) {
        class55 var2 = new class55(741, arg1.method424("varp.dat", null));
        field1312 = 0;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1310 = var2.method457();
        if (field1311 == null) {
            field1311 = new class49[field1310];
        }
        if (field1313 == null) {
            field1313 = new int[field1310];
        }
        for (int var4 = 0; var4 < field1310; var4++) {
            if (field1311[var4] == null) {
                field1311[var4] = new class49();
            }
            field1311[var4].method422(var2, 593, var4);
        }
        if (var2.field1455.length != var2.field1456) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "RRCEOPDB", name = "a", descriptor = "(LUAWAYCTK;II)V")
    public void method422(class55 arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method455();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1315 = arg0.method455();
            } else if (var5 == 2) {
                this.field1316 = arg0.method455();
            } else if (var5 == 3) {
                this.field1317 = true;
                field1313[field1312++] = arg2;
            } else if (var5 == 4) {
                this.field1318 = false;
            } else if (var5 == 5) {
                this.field1319 = arg0.method457();
            } else if (var5 == 6) {
                this.field1320 = true;
            } else if (var5 == 7) {
                this.field1321 = arg0.method460();
            } else if (var5 == 8) {
                this.field1322 = 1;
                this.field1323 = true;
            } else if (var5 == 10) {
                this.field1314 = arg0.method462();
            } else if (var5 == 11) {
                this.field1323 = true;
            } else if (var5 == 12) {
                this.field1324 = arg0.method460();
            } else if (var5 == 13) {
                this.field1322 = 2;
                this.field1323 = true;
            } else if (var5 == 14) {
                this.field1325 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
