import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class414 {

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    private int field5421 = 0;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "I")
    private int field5432 = -1;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "Lwo;")
    private class445 field5422 = new class445();

    @OriginalMember(owner = "client!bba", name = "o", descriptor = "Z")
    public boolean field5435 = false;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    private int field5425;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    private int field5424;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "[[I")
    private int[][] field5429;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "[Lve;")
    private class244[] field5428;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
    public static int field5430 = 7000;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "Z")
    public static boolean field5431 = false;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!bba", name = "n", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "Lba;")
    public static class661 field5426;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
    public static void method2342(int arg0) {
        if (arg0 != 25311) {
            method2342(22);
        }
        field5426 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)V")
    public final void method2343(byte arg0) {
        field5434++;
        int var2 = 95 / ((58 - arg0) / 41);
        for (int var3 = 0; var3 < this.field5425; var3++) {
            this.field5429[var3] = null;
        }
        this.field5429 = null;
        this.field5428 = null;
        this.field5422.method2512(-11558);
        this.field5422 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)[I")
    public final int[] method2344(int arg0, int arg1) {
        field5427++;
        if (arg0 != -2) {
            this.method2343((byte) 49);
        }
        if (this.field5425 == this.field5424) {
            this.field5435 = this.field5428[arg1] == null;
            this.field5428[arg1] = class418.field5488;
            return this.field5429[arg1];
        } else if (this.field5425 == 1) {
            this.field5435 = this.field5432 != arg1;
            this.field5432 = arg1;
            return this.field5429[0];
        } else {
            class244 var3 = this.field5428[arg1];
            if (var3 == null) {
                this.field5435 = true;
                if (this.field5421 >= this.field5425) {
                    class244 var4 = (class244) this.field5422.method2500((byte) -41);
                    var3 = new class244(arg1, var4.field3203);
                    this.field5428[var4.field3195] = null;
                    var4.method242(true);
                } else {
                    var3 = new class244(arg1, this.field5421);
                    this.field5421++;
                }
                this.field5428[arg1] = var3;
            } else {
                this.field5435 = false;
            }
            this.field5422.method2501(arg0 + 10022, var3);
            return this.field5429[var3.field3203];
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(B)[[I")
    public final int[][] method2345(byte arg0) {
        field5423++;
        if (this.field5425 != this.field5424) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -14 % ((arg0 + 55) / 53);
        for (int var3 = 0; var3 < this.field5425; var3++) {
            this.field5428[var3] = class418.field5488;
        }
        return this.field5429;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(III)V")
    public class414(int arg0, int arg1, int arg2) {
        this.field5425 = arg0;
        this.field5424 = arg1;
        this.field5429 = new int[this.field5425][arg2];
        this.field5428 = new class244[this.field5424];
    }
}
