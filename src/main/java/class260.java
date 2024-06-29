import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class260 extends class154 {

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    private int field4518;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "[[I")
    public int[][] field4520;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "[I")
    public int[] field4527;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "[Z")
    public boolean[] field4529;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static volatile int field4519 = 0;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field4524 = 0;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field4522 = 0;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field4521 = 0;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Loh;")
    public static class258 field4528 = class153.method1046(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 123);

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Loh;")
    public static class258 field4525 = class153.method1046("loc", 113);

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "Lgb;")
    public static class213 field4526;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)V", line = 38)
    public static final void method1830(byte arg0, long arg1) {
        field4523++;
        if (arg1 == 0L) {
            return;
        }
        if (class138.field2355 >= 100) {
            class140.method965(false, 0, class192.field3394, class235.field4104);
            return;
        }
        class258 var3 = class162.method1085(82, arg1).method1786((byte) 107);
        if (arg0 >= -117) {
            field4528 = (class258) null;
        }
        for (int var4 = 0; var4 < class138.field2355; var4++) {
            if (class209.field3607[var4] == arg1) {
                class140.method965(false, 0, class100.method755(-6, new class258[] { var3, class152.field2605 }), class235.field4104);
                return;
            }
        }
        for (int var5 = 0; var5 < class312.field5292; var5++) {
            if (class99.field1766[var5] == arg1) {
                class140.method965(false, 0, class100.method755(-6, new class258[] { class58.field918, var3, class218.field3784 }), class235.field4104);
                return;
            }
        }
        if (var3.method1821(-1, class152.field2606.field4007)) {
            class140.method965(false, 0, class85.field1438, class235.field4104);
            return;
        }
        class209.field3607[class138.field2355] = arg1;
        class120.field2115++;
        class279.field4779[class138.field2355++] = class162.method1085(-82, arg1);
        class69.field1188 = class182.field3259;
        class159.field2710.method885(13, -70);
        class159.field2710.method1603(arg1, -1649350304);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 104)
    public static void method1831(int arg0) {
        field4528 = null;
        field4526 = null;
        if (arg0 >= -103) {
            method1831(15);
        }
        field4525 = null;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I[B)V", line = 128)
    public class260(int arg0, byte[] arg1) {
        this.field4530 = arg0;
        class235 var3 = new class235(arg1);
        this.field4518 = var3.method1589(65);
        this.field4520 = new int[this.field4518][];
        this.field4527 = new int[this.field4518];
        this.field4529 = new boolean[this.field4518];
        for (int var4 = 0; var4 < this.field4518; var4++) {
            this.field4527[var4] = var3.method1589(110);
        }
        for (int var5 = 0; var5 < this.field4518; var5++) {
            this.field4529[var5] = var3.method1589(98) == 1;
        }
        for (int var6 = 0; var6 < this.field4518; var6++) {
            this.field4520[var6] = new int[var3.method1589(80)];
        }
        for (int var7 = 0; var7 < this.field4518; var7++) {
            for (int var8 = 0; var8 < this.field4520[var7].length; var8++) {
                this.field4520[var7][var8] = var3.method1589(113);
            }
        }
    }
}
