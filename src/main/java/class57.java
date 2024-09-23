import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UIVLSYQW")
public class class57 {

    @OriginalMember(owner = "UIVLSYQW", name = "a", descriptor = "I")
    private int field1381 = 16191;

    @OriginalMember(owner = "UIVLSYQW", name = "g", descriptor = "I")
    public int field1387 = -1;

    @OriginalMember(owner = "UIVLSYQW", name = "i", descriptor = "[I")
    public int[] field1389 = new int[6];

    @OriginalMember(owner = "UIVLSYQW", name = "j", descriptor = "[I")
    public int[] field1390 = new int[6];

    @OriginalMember(owner = "UIVLSYQW", name = "k", descriptor = "I")
    public int field1391 = 128;

    @OriginalMember(owner = "UIVLSYQW", name = "l", descriptor = "I")
    public int field1392 = 128;

    @OriginalMember(owner = "UIVLSYQW", name = "p", descriptor = "LCZWVRQJW;")
    public static class4 field1396 = new class4(false, 30);

    @OriginalMember(owner = "UIVLSYQW", name = "b", descriptor = "I")
    private static int field1382;

    @OriginalMember(owner = "UIVLSYQW", name = "c", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "UIVLSYQW", name = "e", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "UIVLSYQW", name = "f", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "UIVLSYQW", name = "m", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "UIVLSYQW", name = "n", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "UIVLSYQW", name = "o", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "UIVLSYQW", name = "h", descriptor = "LXKEHWKFH;")
    public class66 field1388;

    @OriginalMember(owner = "UIVLSYQW", name = "d", descriptor = "[LUIVLSYQW;")
    public static class57[] field1384;

    @OriginalMember(owner = "UIVLSYQW", name = "a", descriptor = "(ILSPZBTZXL;)V")
    public static void method537(int arg0, class51 arg1) {
        class34 var2 = new class34(arg1.method515("spotanim.dat", null), field1382);
        field1383 = var2.method404();
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1384 == null) {
            field1384 = new class57[field1383];
        }
        for (int var4 = 0; var4 < field1383; var4++) {
            if (field1384[var4] == null) {
                field1384[var4] = new class57();
            }
            field1384[var4].field1385 = var4;
            field1384[var4].method538(var2, 16191);
        }
    }

    @OriginalMember(owner = "UIVLSYQW", name = "a", descriptor = "(LLDILQFVA;I)V")
    public void method538(class34 arg0, int arg1) {
        if (this.field1381 != arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method402();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1386 = arg0.method404();
                } else if (var3 == 2) {
                    this.field1387 = arg0.method404();
                    if (class66.field1608 != null) {
                        this.field1388 = class66.field1608[this.field1387];
                    }
                } else if (var3 == 4) {
                    this.field1391 = arg0.method404();
                } else if (var3 == 5) {
                    this.field1392 = arg0.method404();
                } else if (var3 == 6) {
                    this.field1393 = arg0.method404();
                } else if (var3 == 7) {
                    this.field1394 = arg0.method402();
                } else if (var3 == 8) {
                    this.field1395 = arg0.method402();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1389[var3 - 40] = arg0.method404();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1390[var3 - 50] = arg0.method404();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "UIVLSYQW", name = "a", descriptor = "()LHEQROJXW;")
    public class27 method539() {
        class27 var1 = (class27) field1396.method152((long) this.field1385);
        if (var1 != null) {
            return var1;
        }
        class27 var2 = class27.method322(this.field1386, (byte) 71);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1389[0] != 0) {
                var2.method336(this.field1389[var3], this.field1390[var3]);
            }
        }
        field1396.method153(var2, true, (long) this.field1385);
        return var2;
    }
}
