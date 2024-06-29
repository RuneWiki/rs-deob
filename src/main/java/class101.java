import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class101 {

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    private int field1536 = 0;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    private int field1544 = -1;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Lqg;")
    private class256 field1545 = new class256();

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Z")
    public boolean field1548 = false;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[[[I")
    private int[][][] field1532;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[Lid;")
    private class274[] field1535;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
    public static int[] field1539 = new int[14];

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Ltl;")
    public static class222 field1543 = new class222(16);

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static volatile int field1551 = 0;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Lol;")
    public static class246 field1550 = new class246(512);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lmf;")
    public static class53 field1549;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "[I")
    public static int[] field1552;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[Lug;")
    public static class321[] field1534;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/lang/String;)V", line = 7)
    public static final void method710(int arg0, String arg1) {
        field1546++;
        class147.field2204 = arg1;
        if (arg0 != 20647) {
            field1543 = (class222) null;
        }
        if (class264.field4183.field68 == null) {
            return;
        }
        try {
            String var2 = class264.field4183.field68.getParameter("cookieprefix");
            String var3 = class264.field4183.field68.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class184.method1266(23225, class304.method2128((byte) -110) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class72.method471(105, "document.cookie=\"" + var5 + "\"", class264.field4183.field68);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)[[[I", line = 43)
    public final int[][][] method711(byte arg0) {
        field1533++;
        if (this.field1542 != this.field1541) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -123) {
            for (int var2 = 0; var2 < this.field1542; var2++) {
                this.field1535[var2] = class69.field897;
            }
            return this.field1532;
        } else {
            return (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 65)
    public static final void method712(int arg0, int arg1) {
        if (class37.field497 == arg1) {
            class188.field3056.method1203(arg0, 0);
        } else {
            class12.field147 = arg0;
        }
        field1547++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V", line = 79)
    public static final void method713() {
        GL var0 = class186.field2990;
        var0.glDisableClientState(32886);
        class186.method1316(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class186.method1284();
        for (int var1 = 0; var1 < class60.field788[0].length; var1++) {
            class83 var2 = class60.field788[0][var1];
            if (var2.field1267 >= 0 && class16.method107(false, class25.field365.method382(var2.field1267, (byte) 93))) {
                var0.glColor4fv(class263.method1877(true, var2.field1260), 0);
                float var3 = 201.5F - (var2.field1272 ? 1.0F : 0.5F);
                var2.method617(class251.field3996, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class186.method1298();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class186.method1289();
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(III)V", line = 255)
    public class101(int arg0, int arg1, int arg2) {
        this.field1541 = arg1;
        this.field1542 = arg0;
        this.field1532 = new int[this.field1542][3][arg2];
        this.field1535 = new class274[this.field1541];
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 120)
    public final void method714(int arg0) {
        for (int var2 = 0; var2 < this.field1542; var2++) {
            this.field1532[var2][0] = null;
            this.field1532[var2][1] = null;
            this.field1532[var2][2] = null;
            this.field1532[var2] = (int[][]) null;
        }
        field1540++;
        if (arg0 != 1) {
            field1549 = (class53) null;
        }
        this.field1535 = null;
        this.field1532 = (int[][][]) null;
        this.field1545.method1811((byte) 25);
        this.field1545 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)[[I", line = 153)
    public final int[][] method715(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[][]) ((int[][]) null);
        }
        field1538++;
        if (this.field1542 == this.field1541) {
            this.field1548 = this.field1535[arg1] == null;
            this.field1535[arg1] = class69.field897;
            return this.field1532[arg1];
        } else if (this.field1542 == 1) {
            this.field1548 = this.field1544 != arg1;
            this.field1544 = arg1;
            return this.field1532[0];
        } else {
            class274 var3 = this.field1535[arg1];
            if (var3 == null) {
                this.field1548 = true;
                if (this.field1542 <= this.field1536) {
                    class274 var4 = (class274) this.field1545.method1802(2838);
                    var3 = new class274(arg1, var4.field4349);
                    this.field1535[var4.field4354] = null;
                    var4.method465((byte) -122);
                } else {
                    var3 = new class274(arg1, this.field1536);
                    this.field1536++;
                }
                this.field1535[arg1] = var3;
            } else {
                this.field1548 = false;
            }
            this.field1545.method1809(var3, (byte) -52);
            return this.field1532[var3.field4349];
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 221)
    public static void method716(int arg0) {
        field1549 = null;
        field1543 = null;
        if (arg0 != 6460) {
            method712(-44, -46);
        }
        field1550 = null;
        field1552 = null;
        field1534 = null;
        field1539 = null;
    }
}
