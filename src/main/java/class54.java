import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SFNSVANZ")
public class class54 {

    @OriginalMember(owner = "SFNSVANZ", name = "i", descriptor = "Z")
    public boolean field1317 = false;

    @OriginalMember(owner = "SFNSVANZ", name = "j", descriptor = "Z")
    public boolean field1318 = true;

    @OriginalMember(owner = "SFNSVANZ", name = "l", descriptor = "Z")
    public boolean field1320 = false;

    @OriginalMember(owner = "SFNSVANZ", name = "o", descriptor = "Z")
    public boolean field1323 = false;

    @OriginalMember(owner = "SFNSVANZ", name = "p", descriptor = "I")
    public int field1324 = -1;

    @OriginalMember(owner = "SFNSVANZ", name = "q", descriptor = "Z")
    public boolean field1325 = true;

    @OriginalMember(owner = "SFNSVANZ", name = "a", descriptor = "Z")
    private static boolean field1309 = true;

    @OriginalMember(owner = "SFNSVANZ", name = "b", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "SFNSVANZ", name = "d", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "SFNSVANZ", name = "g", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "SFNSVANZ", name = "h", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "SFNSVANZ", name = "k", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "SFNSVANZ", name = "m", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "SFNSVANZ", name = "n", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "SFNSVANZ", name = "f", descriptor = "Ljava/lang/String;")
    public String field1314;

    @OriginalMember(owner = "SFNSVANZ", name = "e", descriptor = "[I")
    public static int[] field1313;

    @OriginalMember(owner = "SFNSVANZ", name = "c", descriptor = "[LSFNSVANZ;")
    public static class54[] field1311;

    @OriginalMember(owner = "SFNSVANZ", name = "a", descriptor = "(LFNOQZAYQ;I)V")
    public static void method412(class14 arg0, int arg1) {
        class11 var2 = new class11(arg0.method246("varp.dat", null), field1309);
        field1312 = 0;
        field1310 = var2.method191();
        int var3 = 93 / arg1;
        if (field1311 == null) {
            field1311 = new class54[field1310];
        }
        if (field1313 == null) {
            field1313 = new int[field1310];
        }
        for (int var4 = 0; var4 < field1310; var4++) {
            if (field1311[var4] == null) {
                field1311[var4] = new class54();
            }
            field1311[var4].method413(var2, var4, (byte) 1);
        }
        if (var2.field642.length != var2.field643) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "SFNSVANZ", name = "a", descriptor = "(LDNRIFKTO;IB)V")
    public void method413(class11 arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            field1309 = !field1309;
        }
        while (true) {
            int var4 = arg0.method189();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1315 = arg0.method189();
            } else if (var4 == 2) {
                this.field1316 = arg0.method189();
            } else if (var4 == 3) {
                this.field1317 = true;
                field1313[field1312++] = arg1;
            } else if (var4 == 4) {
                this.field1318 = false;
            } else if (var4 == 5) {
                this.field1319 = arg0.method191();
            } else if (var4 == 6) {
                this.field1320 = true;
            } else if (var4 == 7) {
                this.field1321 = arg0.method194();
            } else if (var4 == 8) {
                this.field1322 = 1;
                this.field1323 = true;
            } else if (var4 == 10) {
                this.field1314 = arg0.method196();
            } else if (var4 == 11) {
                this.field1323 = true;
            } else if (var4 == 12) {
                this.field1324 = arg0.method194();
            } else if (var4 == 13) {
                this.field1322 = 2;
                this.field1323 = true;
            } else if (var4 == 14) {
                this.field1325 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
