import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class118 {

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    private int field1986 = 0;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    private int field1994 = -1;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Lci;")
    private class327 field1993 = new class327();

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Z")
    public boolean field2001 = false;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    private int field1990;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "[Lsd;")
    private class138[] field1996;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    private int field1991;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "[[I")
    private int[][] field1997;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1984 = 0;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Ljl;")
    public static class332 field1998 = new class332(64);

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "[Lim;")
    public static class201[] field1999 = new class201[0];

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "Lml;")
    public static class17 field2002;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Lth;")
    public static class57 field1992;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "[I")
    public static int[] field2000;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 5)
    public static final void method928(String arg0, boolean arg1) {
        field1989++;
        System.out.println("Error: " + class267.method2026("\n", "%0a", arg0, 2206));
        if (!arg1) {
            field1998 = (class332) null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 24)
    public final void method929(byte arg0) {
        for (int var2 = 0; var2 < this.field1991; var2++) {
            this.field1997[var2] = null;
        }
        if (arg0 > -9) {
            field2000 = (int[]) null;
        }
        field1983++;
        this.field1996 = null;
        this.field1997 = (int[][]) null;
        this.field1993.method2301(-23);
        this.field1993 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I", line = 51)
    public final int[] method930(int arg0, int arg1) {
        field1995++;
        if (arg1 != 0) {
            this.method929((byte) 96);
        }
        if (this.field1991 == this.field1990) {
            this.field2001 = this.field1996[arg0] == null;
            this.field1996[arg0] = class278.field4576;
            return this.field1997[arg0];
        } else if (this.field1991 == 1) {
            this.field2001 = this.field1994 != arg0;
            this.field1994 = arg0;
            return this.field1997[0];
        } else {
            class138 var3 = this.field1996[arg0];
            if (var3 == null) {
                this.field2001 = true;
                if (this.field1986 < this.field1991) {
                    var3 = new class138(arg0, this.field1986);
                    this.field1986++;
                } else {
                    class138 var4 = (class138) this.field1993.method2311(true);
                    var3 = new class138(arg0, var4.field2283);
                    this.field1996[var4.field2282] = null;
                    var4.method330(15);
                }
                this.field1996[arg0] = var3;
            } else {
                this.field2001 = false;
            }
            this.field1993.method2299(false, var3);
            return this.field1997[var3.field2283];
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 124)
    public static void method931(int arg0) {
        field1992 = null;
        if (arg0 > 57) {
            field2002 = null;
            field1998 = null;
            field1999 = null;
            field2000 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(III)V", line = 185)
    public class118(int arg0, int arg1, int arg2) {
        this.field1990 = arg1;
        this.field1996 = new class138[this.field1990];
        this.field1991 = arg0;
        this.field1997 = new int[this.field1991][arg2];
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)[[I", line = 143)
    public final int[][] method932(byte arg0) {
        field1985++;
        if (arg0 != 32) {
            field2000 = (int[]) null;
        }
        if (this.field1991 != this.field1990) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1991; var2++) {
            this.field1996[var2] = class278.field4576;
        }
        return this.field1997;
    }
}
