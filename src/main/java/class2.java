import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    private int field36 = -1;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    private int field41 = 0;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lh;")
    private class69 field42 = new class69();

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Z")
    public boolean field53 = false;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    private int field49;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[Lth;")
    private class185[] field47;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[[I")
    private int[][] field35;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Ltg;")
    public static class184 field37 = class135.method812("Hierhin gehen", 3);

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    public static int[] field40 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lq;")
    public static class150 field45 = new class150();

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Lh;")
    public static class69 field51 = new class69();

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field54 = 0;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "[Ltb;")
    public static class179[] field57 = new class179[4];

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "Lid;")
    public static class83 field55;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)[[I")
    public final int[][] method6(int arg0) {
        field38++;
        if (this.field49 != this.field46) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field49; var2++) {
            this.field47[var2] = class34.field588;
        }
        if (arg0 != 11083) {
            field40 = null;
        }
        return this.field35;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int var3 = -103 / ((arg0 - 19) / 61);
        field44++;
        if (this.field49 == this.field46) {
            this.field53 = this.field47[arg1] == null;
            this.field47[arg1] = class34.field588;
            return this.field35[arg1];
        } else if (this.field49 == 1) {
            this.field53 = this.field36 != arg1;
            this.field36 = arg1;
            return this.field35[0];
        } else {
            class185 var4 = this.field47[arg1];
            if (this.field53 = var4 == null) {
                if (this.field49 <= this.field41) {
                    class185 var5 = (class185) this.field42.method412(true);
                    var4 = new class185(arg1, var5.field3582);
                    this.field47[var5.field3579] = null;
                    var5.method797((byte) -111);
                } else {
                    var4 = new class185(arg1, this.field41);
                    this.field41++;
                }
                this.field47[arg1] = var4;
            }
            this.field42.method403(true, var4);
            return this.field35[var4.field3582];
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method8(int arg0) {
        field37 = null;
        field40 = null;
        field45 = null;
        field57 = null;
        field51 = null;
        if (arg0 != -1) {
            method9(-72, (byte) 111, true, 72);
        }
        field55 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBZI)V")
    public static final void method9(int arg0, byte arg1, boolean arg2, int arg3) {
        field50++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg1 != 122) {
            method12(null, null);
        }
        class115.field2083 = arg0;
        class120.field2167 = arg2;
        class210.field4018 = arg3;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)[Loe;")
    public static final class137[] method10(int arg0) {
        field48++;
        class137[] var1 = new class137[class46.field880];
        if (arg0 != -12513) {
            return null;
        }
        for (int var2 = 0; var2 < class46.field880; var2++) {
            class137 var3 = new class137();
            var3.field2496 = class24.field436;
            var3.field2495 = class110.field1980;
            var3.field2494 = class177.field3387[var2];
            var3.field2492 = class26.field472[var2];
            var3.field2491 = class83.field1479[var2];
            var3.field2490 = class184.field3535[var2];
            byte[] var4 = class202.field3902[var2];
            int var5 = var3.field2491 * var3.field2490;
            var3.field2493 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field2493[var6] = class83.field1481[class10.method61(255, var4[var6])];
            }
            var1[var2] = var3;
        }
        class200.method1283((byte) 126);
        return var1;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public final void method11(int arg0) {
        field43++;
        int var2 = 0;
        int var3 = 119 / ((arg0 - 72) / 50);
        while (var2 < this.field49) {
            this.field35[var2] = null;
            var2++;
        }
        this.field35 = null;
        this.field47 = null;
        this.field42.method407(2);
        this.field42 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lva;")
    public static final class196 method12(Throwable arg0, String arg1) {
        field52++;
        class196 var2;
        if (arg0 instanceof class196) {
            var2 = (class196) arg0;
            var2.field3804 = var2.field3804 + ' ' + arg1;
        } else {
            var2 = new class196(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
    public class2(int arg0, int arg1, int arg2) {
        this.field49 = arg0;
        this.field47 = new class185[arg1];
        this.field35 = new int[arg0][arg2];
        this.field46 = arg1;
    }
}
