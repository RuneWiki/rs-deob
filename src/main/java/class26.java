import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class26 {

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    private int field328 = 0;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    private int field330 = -1;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lwq;")
    private class92 field319 = new class92();

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Z")
    public boolean field332 = false;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[Ltk;")
    private class191[] field313;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[[[I")
    private int[][][] field318;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[Lqr;")
    public static class40[] field314 = new class40[2048];

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lop;")
    public static class101 field322 = new class101(250);

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[[Z")
    public static boolean[][] field326 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "[I")
    public static int[] field331 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)[[[I", line = 9)
    public final int[][][] method179(int arg0) {
        field316++;
        if (this.field325 != this.field320) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field325; var2++) {
            this.field313[var2] = class211.field3000;
        }
        return this.field318;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)I", line = 31)
    public static final int method180(int arg0) {
        field327++;
        if (arg0 > -66) {
            field329 = -21;
        }
        if (class255.field3680 == null) {
            return class190.field2744 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V", line = 51)
    public final void method181(int arg0) {
        field317++;
        if (arg0 != 1) {
            return;
        }
        for (int var2 = 0; var2 < this.field325; var2++) {
            this.field318[var2][0] = null;
            this.field318[var2][1] = null;
            this.field318[var2][2] = null;
            this.field318[var2] = null;
        }
        this.field313 = null;
        this.field318 = null;
        this.field319.method505((byte) 44);
        this.field319 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 78)
    public static void method182(byte arg0) {
        field326 = null;
        if (arg0 != 89) {
            method183((class376) null, true);
        }
        field314 = null;
        field322 = null;
        field331 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ltq;Z)V", line = 93)
    public static final void method183(class376 arg0, boolean arg1) {
        class102.field1251 = 0;
        if (arg1) {
            return;
        }
        class408.field5882 = 0;
        field323++;
        class257.field3687 = new class393();
        class81.field943 = new class269[1024];
        class159.method1015(arg0, -126);
        class255.method1722(-60, arg0);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III)V", line = 239)
    public class26(int arg0, int arg1, int arg2) {
        this.field325 = arg0;
        this.field320 = arg1;
        this.field313 = new class191[this.field320];
        this.field318 = new int[this.field325][3][arg2];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILdg;)V", line = 122)
    public static final void method184(int arg0, class236 arg1) {
        int var2 = -39 % ((arg0 + 35) / 44);
        for (int var3 = 0; var3 < class338.field4801; var3++) {
            int var4 = arg1.method1594(-101);
            int var5 = arg1.method1617((byte) 48);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class166.field2330[var4] != null) {
                class166.field2330[var4].field6331 = var5;
            }
        }
        field315++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[[I", line = 157)
    public final int[][] method185(byte arg0, int arg1) {
        field321++;
        if (arg0 != -48) {
            this.method181(-46);
        }
        if (this.field325 == this.field320) {
            this.field332 = this.field313[arg1] == null;
            this.field313[arg1] = class211.field3000;
            return this.field318[arg1];
        } else if (this.field325 == 1) {
            this.field332 = this.field330 != arg1;
            this.field330 = arg1;
            return this.field318[0];
        } else {
            class191 var3 = this.field313[arg1];
            if (var3 == null) {
                this.field332 = true;
                if (this.field328 < this.field325) {
                    var3 = new class191(arg1, this.field328);
                    this.field328++;
                } else {
                    class191 var4 = (class191) this.field319.method510((byte) 105);
                    var3 = new class191(arg1, var4.field2749);
                    this.field313[var4.field2753] = null;
                    var4.method2594((byte) -22);
                }
                this.field313[arg1] = var3;
            } else {
                this.field332 = false;
            }
            this.field319.method511(var3, (byte) -109);
            return this.field318[var3.field2749];
        }
    }
}
