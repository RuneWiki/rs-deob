import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UYLUCQNM")
public class class63 {

    @OriginalMember(owner = "UYLUCQNM", name = "a", descriptor = "I")
    private int field1586 = -247;

    @OriginalMember(owner = "UYLUCQNM", name = "f", descriptor = "I")
    public int field1591 = -1;

    @OriginalMember(owner = "UYLUCQNM", name = "h", descriptor = "[I")
    public int[] field1593 = new int[6];

    @OriginalMember(owner = "UYLUCQNM", name = "i", descriptor = "[I")
    public int[] field1594 = new int[6];

    @OriginalMember(owner = "UYLUCQNM", name = "j", descriptor = "I")
    public int field1595 = 128;

    @OriginalMember(owner = "UYLUCQNM", name = "k", descriptor = "I")
    public int field1596 = 128;

    @OriginalMember(owner = "UYLUCQNM", name = "o", descriptor = "LASORKPAH;")
    public static class2 field1600 = new class2(48975, 30);

    @OriginalMember(owner = "UYLUCQNM", name = "b", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "UYLUCQNM", name = "d", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "UYLUCQNM", name = "e", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "UYLUCQNM", name = "l", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "UYLUCQNM", name = "m", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "UYLUCQNM", name = "n", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "UYLUCQNM", name = "g", descriptor = "LKIRTNGZJ;")
    public class39 field1592;

    @OriginalMember(owner = "UYLUCQNM", name = "c", descriptor = "[LUYLUCQNM;")
    public static class63[] field1588;

    @OriginalMember(owner = "UYLUCQNM", name = "a", descriptor = "(ZLEAXVDNXA;)V")
    public static void method562(boolean arg0, class12 arg1) {
        class5 var2 = new class5(2, arg1.method255("spotanim.dat", null));
        field1587 = var2.method46();
        if (field1588 == null) {
            field1588 = new class63[field1587];
        }
        for (int var3 = 0; var3 < field1587; var3++) {
            if (field1588[var3] == null) {
                field1588[var3] = new class63();
            }
            field1588[var3].field1589 = var3;
            field1588[var3].method563((byte) -18, var2);
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "UYLUCQNM", name = "a", descriptor = "(BLCKBTFRZM;)V")
    public void method563(byte arg0, class5 arg1) {
        if (arg0 != -18) {
            this.field1586 = -376;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method44();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1590 = arg1.method46();
                } else if (var3 == 2) {
                    this.field1591 = arg1.method46();
                    if (class39.field1195 != null) {
                        this.field1592 = class39.field1195[this.field1591];
                    }
                } else if (var3 == 4) {
                    this.field1595 = arg1.method46();
                } else if (var3 == 5) {
                    this.field1596 = arg1.method46();
                } else if (var3 == 6) {
                    this.field1597 = arg1.method46();
                } else if (var3 == 7) {
                    this.field1598 = arg1.method44();
                } else if (var3 == 8) {
                    this.field1599 = arg1.method44();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1593[var3 - 40] = arg1.method46();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1594[var3 - 50] = arg1.method46();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "UYLUCQNM", name = "a", descriptor = "()LGFYXEFQY;")
    public class21 method564() {
        class21 var1 = (class21) field1600.method1((long) this.field1589);
        if (var1 != null) {
            return var1;
        }
        class21 var2 = class21.method341((byte) 7, this.field1590);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1593[0] != 0) {
                var2.method355(this.field1593[var3], this.field1594[var3]);
            }
        }
        field1600.method2(23574, (long) this.field1589, var2);
        return var2;
    }
}
