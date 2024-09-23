import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QORKDXHW")
public class class42 {

    @OriginalMember(owner = "QORKDXHW", name = "h", descriptor = "Z")
    public boolean field1373 = false;

    @OriginalMember(owner = "QORKDXHW", name = "i", descriptor = "Z")
    public boolean field1374 = true;

    @OriginalMember(owner = "QORKDXHW", name = "k", descriptor = "Z")
    public boolean field1376 = false;

    @OriginalMember(owner = "QORKDXHW", name = "n", descriptor = "Z")
    public boolean field1379 = false;

    @OriginalMember(owner = "QORKDXHW", name = "o", descriptor = "I")
    public int field1380 = -1;

    @OriginalMember(owner = "QORKDXHW", name = "p", descriptor = "Z")
    public boolean field1381 = true;

    @OriginalMember(owner = "QORKDXHW", name = "a", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "QORKDXHW", name = "c", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "QORKDXHW", name = "f", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "QORKDXHW", name = "g", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "QORKDXHW", name = "j", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "QORKDXHW", name = "l", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "QORKDXHW", name = "m", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "QORKDXHW", name = "e", descriptor = "Ljava/lang/String;")
    public String field1370;

    @OriginalMember(owner = "QORKDXHW", name = "d", descriptor = "[I")
    public static int[] field1369;

    @OriginalMember(owner = "QORKDXHW", name = "b", descriptor = "[LQORKDXHW;")
    public static class42[] field1367;

    @OriginalMember(owner = "QORKDXHW", name = "a", descriptor = "(LDTIATKJO;I)V")
    public static void method467(class8 arg0, int arg1) {
        if (arg1 < 1 || arg1 > 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class14 var3 = new class14(-527, arg0.method168("varp.dat", null));
        field1368 = 0;
        field1366 = var3.method204();
        if (field1367 == null) {
            field1367 = new class42[field1366];
        }
        if (field1369 == null) {
            field1369 = new int[field1366];
        }
        for (int var4 = 0; var4 < field1366; var4++) {
            if (field1367[var4] == null) {
                field1367[var4] = new class42();
            }
            field1367[var4].method468(95, var4, var3);
        }
        if (var3.field768.length != var3.field769) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "QORKDXHW", name = "a", descriptor = "(IILGHHPHSRU;)V")
    public void method468(int arg0, int arg1, class14 arg2) {
        int var4 = 77 / arg0;
        while (true) {
            int var5 = arg2.method202();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1371 = arg2.method202();
            } else if (var5 == 2) {
                this.field1372 = arg2.method202();
            } else if (var5 == 3) {
                this.field1373 = true;
                field1369[field1368++] = arg1;
            } else if (var5 == 4) {
                this.field1374 = false;
            } else if (var5 == 5) {
                this.field1375 = arg2.method204();
            } else if (var5 == 6) {
                this.field1376 = true;
            } else if (var5 == 7) {
                this.field1377 = arg2.method207();
            } else if (var5 == 8) {
                this.field1378 = 1;
                this.field1379 = true;
            } else if (var5 == 10) {
                this.field1370 = arg2.method209();
            } else if (var5 == 11) {
                this.field1379 = true;
            } else if (var5 == 12) {
                this.field1380 = arg2.method207();
            } else if (var5 == 13) {
                this.field1378 = 2;
                this.field1379 = true;
            } else if (var5 == 14) {
                this.field1381 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
