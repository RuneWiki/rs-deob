import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class83 {

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    private int field1558 = 0;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    private int field1564 = -1;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lch;")
    private class117 field1554 = new class117();

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Z")
    public boolean field1567 = false;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[[[I")
    private int[][][] field1560;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[Led;")
    private class252[] field1562;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lvf;")
    public static class265 field1556 = class87.method582(-46, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lvf;")
    public static class265 field1559 = class87.method582(-46, "Mem:");

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[[[I")
    public static int[][][] field1557;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILve;Ljava/lang/Object;)V")
    public static final void method568(int arg0, class226 arg1, Object arg2) {
        field1552++;
        if (arg1.field4018 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field4018.peekEvent() != null; var3++) {
            class19.method136(arg0 + 31910, 1L);
        }
        if (arg0 == -31909 && arg2 != null) {
            arg1.field4018.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)[[I")
    public final int[][] method569(byte arg0, int arg1) {
        field1565++;
        int var3 = -6 % ((-arg0 - 40) / 47);
        if (this.field1566 == this.field1561) {
            this.field1567 = this.field1562[arg1] == null;
            this.field1562[arg1] = class110.field1922;
            return this.field1560[arg1];
        } else if (this.field1566 == 1) {
            this.field1567 = this.field1564 != arg1;
            this.field1564 = arg1;
            return this.field1560[0];
        } else {
            class252 var4 = this.field1562[arg1];
            if (var4 == null) {
                this.field1567 = true;
                if (this.field1558 >= this.field1566) {
                    class252 var5 = (class252) this.field1554.method784((byte) 114);
                    var4 = new class252(arg1, var5.field4339);
                    this.field1562[var5.field4335] = null;
                    var5.method97(158);
                } else {
                    var4 = new class252(arg1, this.field1558);
                    this.field1558++;
                }
                this.field1562[arg1] = var4;
            } else {
                this.field1567 = false;
            }
            this.field1554.method794(-55, var4);
            return this.field1560[var4.field4339];
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method570(byte arg0) {
        field1555++;
        if (this.field1566 != this.field1561) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1566; var2++) {
            this.field1562[var2] = class110.field1922;
        }
        int var3 = -112 / ((arg0 + 81) / 45);
        return this.field1560;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZIIII)V")
    public static final void method571(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field1563++;
        if (arg2 != 26379) {
            return;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        class201.field3611 = (short) arg0;
        class245.field4269 = (short) arg5;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public static void method572(byte arg0) {
        field1557 = null;
        field1556 = null;
        field1559 = null;
        if (arg0 != -99) {
            field1556 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method573(int arg0) {
        int var2 = -20 / ((arg0 + 67) / 54);
        field1553++;
        for (int var3 = 0; var3 < this.field1566; var3++) {
            this.field1560[var3][0] = null;
            this.field1560[var3][1] = null;
            this.field1560[var3][2] = null;
            this.field1560[var3] = null;
        }
        this.field1560 = null;
        this.field1562 = null;
        this.field1554.method791(60);
        this.field1554 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(III)V")
    public class83(int arg0, int arg1, int arg2) {
        this.field1566 = arg0;
        this.field1560 = new int[this.field1566][3][arg2];
        this.field1561 = arg1;
        this.field1562 = new class252[this.field1561];
    }
}
