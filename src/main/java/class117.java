import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class117 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[Lvs;")
    private class617[] field1290;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "J")
    private long field1297;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lcj;")
    public static class178 field1294;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lvs;")
    private class617 field1291;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lvs;")
    public final class617 method680(int arg0) {
        field1296++;
        if (this.field1291 == null) {
            return null;
        } else if (arg0 == -27978) {
            class617 var2 = this.field1290[(int) (this.field1297 & (long) (this.field1293 - 1))];
            while (this.field1291 != var2) {
                if (this.field1291.field8693 == this.field1297) {
                    class617 var3 = this.field1291;
                    this.field1291 = this.field1291.field8692;
                    return var3;
                }
                this.field1291 = this.field1291.field8692;
            }
            this.field1291 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method681(int arg0) {
        if (arg0 != 7) {
            method681(-103);
        }
        field1294 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)Lvs;")
    public final class617 method682(int arg0, long arg1) {
        this.field1297 = arg1;
        if (arg0 >= -101) {
            field1294 = null;
        }
        field1295++;
        class617 var4 = this.field1290[(int) (arg1 & (long) (this.field1293 - 1))];
        for (this.field1291 = var4.field8692; this.field1291 != var4; this.field1291 = this.field1291.field8692) {
            if (this.field1291.field8693 == arg1) {
                class617 var5 = this.field1291;
                this.field1291 = this.field1291.field8692;
                return var5;
            }
        }
        this.field1291 = null;
        return null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(JBLvs;)V")
    public final void method683(long arg0, byte arg1, class617 arg2) {
        field1292++;
        if (arg2.field8698 != null) {
            arg2.method3443(113);
        }
        class617 var5 = this.field1290[(int) ((long) (this.field1293 - 1) & arg0)];
        arg2.field8692 = var5;
        arg2.field8698 = var5.field8698;
        arg2.field8698.field8692 = arg2;
        if (arg1 != -111) {
            field1289 = 32;
        }
        arg2.field8692.field8698 = arg2;
        arg2.field8693 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
    public class117(int arg0) {
        this.field1290 = new class617[arg0];
        this.field1293 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class617 var3 = this.field1290[var2] = new class617();
            var3.field8692 = var3;
            var3.field8698 = var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lr;II)Lho;")
    public static final class463 method684(class564 arg0, int arg1, int arg2) {
        field1299++;
        class651 var3 = class386.method2210(arg0, -75, arg1, true);
        int var4 = 12 / ((43 - arg2) / 63);
        return var3 == null ? null : var3.field9143;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBI)V")
    public static final void method685(int arg0, byte arg1, int arg2) {
        field1298++;
        class76 var3 = class3.method28(7, (byte) 42, arg2);
        var3.method403((byte) -84);
        var3.field785 = arg0;
        int var4 = 20 % ((arg1 + 80) / 39);
    }
}
