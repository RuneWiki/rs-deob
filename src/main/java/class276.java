import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class276 {

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    private int field4754 = 0;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    private int field4752 = -1;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lmi;")
    private class12 field4761 = new class12();

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Z")
    public boolean field4765 = false;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    private int field4757;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[Lkf;")
    private class152[] field4756;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    private int field4755;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "[[[I")
    private int[][][] field4759;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Loh;")
    public static class258 field4758 = class153.method1046("mapscene", 100);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lfk;")
    public static class144 field4750 = new class144(8);

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[I")
    public static int[] field4763 = new int[100];

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "[I")
    public static int[] field4764;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[[I", line = 9)
    public final int[][] method1936(int arg0, int arg1) {
        if (arg1 != 17174) {
            this.method1936(-87, 17);
        }
        field4753++;
        if (this.field4757 == this.field4755) {
            this.field4765 = this.field4756[arg0] == null;
            this.field4756[arg0] = class243.field4226;
            return this.field4759[arg0];
        } else if (this.field4755 == 1) {
            this.field4765 = this.field4752 != arg0;
            this.field4752 = arg0;
            return this.field4759[0];
        } else {
            class152 var3 = this.field4756[arg0];
            if (var3 == null) {
                this.field4765 = true;
                if (this.field4755 <= this.field4754) {
                    class152 var4 = (class152) this.field4761.method78((byte) 58);
                    var3 = new class152(arg0, var4.field2611);
                    this.field4756[var4.field2603] = null;
                    var4.method1054((byte) 79);
                } else {
                    var3 = new class152(arg0, this.field4754);
                    this.field4754++;
                }
                this.field4756[arg0] = var3;
            } else {
                this.field4765 = false;
            }
            this.field4761.method79(var3, -109);
            return this.field4759[var3.field2611];
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)Z", line = 76)
    public static final boolean method1937(int arg0, int arg1, int arg2, int arg3) {
        if (client.method346(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class229.method1526(var4 + 1, class201.field3482[arg0][arg1][arg2] + arg3, var5 + 1) && class229.method1526(var4 + 128 - 1, class201.field3482[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class229.method1526(var4 + 128 - 1, class201.field3482[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class229.method1526(var4 + 1, class201.field3482[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 95)
    public static void method1938(int arg0) {
        if (arg0 != -1) {
            field4763 = (int[]) null;
        }
        field4758 = null;
        field4764 = null;
        field4750 = null;
        field4763 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)[[[I", line = 108)
    public final int[][][] method1939(boolean arg0) {
        field4751++;
        if (this.field4757 != this.field4755) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0) {
            this.method1940((byte) 52);
        }
        for (int var2 = 0; var2 < this.field4755; var2++) {
            this.field4756[var2] = class243.field4226;
        }
        return this.field4759;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 129)
    public final void method1940(byte arg0) {
        field4760++;
        for (int var2 = 0; var2 < this.field4755; var2++) {
            this.field4759[var2][0] = null;
            this.field4759[var2][1] = null;
            this.field4759[var2][2] = null;
            this.field4759[var2] = (int[][]) null;
        }
        if (arg0 != 73) {
            this.field4759 = (int[][][]) ((int[][][]) null);
        }
        this.field4756 = null;
        this.field4759 = (int[][][]) null;
        this.field4761.method80(0);
        this.field4761 = null;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(III)V", line = 191)
    public class276(int arg0, int arg1, int arg2) {
        this.field4757 = arg1;
        this.field4756 = new class152[this.field4757];
        this.field4755 = arg0;
        this.field4759 = new int[this.field4755][3][arg2];
    }
}
