import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 {

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    private int field32 = 0;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    private int field34 = -1;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lam;")
    private class180 field23 = new class180();

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Z")
    public boolean field42 = false;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[[I")
    private int[][] field39;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[Lci;")
    private class250[] field24;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field27 = -1;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lhc;")
    public static class235 field22;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lhc;")
    public static class235 field30;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Lhc;")
    public static class235 field41;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "[[I")
    public static int[][] field29;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V")
    public static final void method14(byte arg0, int arg1) {
        class192.field2974 = 1000 / arg1;
        field25++;
        if (arg0 <= 84) {
            field22 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        field35++;
        if (arg0 < 121) {
            this.method17(-96);
        }
        if (this.field33 == this.field26) {
            this.field42 = this.field24[arg1] == null;
            this.field24[arg1] = class125.field1968;
            return this.field39[arg1];
        } else if (this.field33 == 1) {
            this.field42 = this.field34 != arg1;
            this.field34 = arg1;
            return this.field39[0];
        } else {
            class250 var3 = this.field24[arg1];
            if (var3 == null) {
                this.field42 = true;
                if (this.field33 > this.field32) {
                    var3 = new class250(arg1, this.field32);
                    this.field32++;
                } else {
                    class250 var4 = (class250) this.field23.method1224((byte) 106);
                    var3 = new class250(arg1, var4.field4034);
                    this.field24[var4.field4033] = null;
                    var4.method1123(0);
                }
                this.field24[arg1] = var3;
            } else {
                this.field42 = false;
            }
            this.field23.method1222(108, var3);
            return this.field39[var3.field4034];
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public static void method16(boolean arg0) {
        field30 = null;
        field41 = null;
        field29 = null;
        if (!arg0) {
            method18(7, (class235) null);
        }
        field22 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)[[I")
    public final int[][] method17(int arg0) {
        field38++;
        if (this.field33 != this.field26) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != -1) {
            return null;
        }
        while (this.field33 > var2) {
            this.field24[var2] = class125.field1968;
            var2++;
        }
        return this.field39;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILhc;)I")
    public static final int method18(int arg0, class235 arg1) {
        if (arg0 != 0) {
            field41 = null;
        }
        int var2 = 0;
        if (arg1.method1613(false, class248.field4008)) {
            var2++;
        }
        field28++;
        if (arg1.method1613(false, class22.field312)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method19(byte arg0) {
        field40++;
        for (int var2 = 0; var2 < this.field33; var2++) {
            this.field39[var2] = null;
        }
        if (arg0 < 53) {
            field22 = null;
        }
        this.field24 = null;
        this.field39 = null;
        this.field23.method1226(1);
        this.field23 = null;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(III)V")
    public class4(int arg0, int arg1, int arg2) {
        this.field33 = arg0;
        this.field26 = arg1;
        this.field39 = new int[this.field33][arg2];
        this.field24 = new class250[this.field26];
    }
}
