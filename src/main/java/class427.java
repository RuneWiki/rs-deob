import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class427 {

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    private int field6135 = -1;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    private int field6134 = 0;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "Ltc;")
    private class196 field6136 = new class196();

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "Z")
    public boolean field6138 = false;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    private int field6132;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    private int field6123;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "[[I")
    private int[][] field6131;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "[Lal;")
    private class53[] field6128;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field6126 = 0;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Z")
    public static boolean field6127 = true;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "Lqj;")
    public static class296 field6137;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2686(byte arg0) {
        if (arg0 != 114) {
            return;
        }
        class344.method2205((byte) -84);
        field6133++;
        class395.method2563((byte) 115);
        class4.method27(-1);
        class296.method1888(-3);
        class409.method2623(0);
        class132.method899((byte) 43);
        class310.method1965((byte) -122);
        class340.method2181((byte) -118);
        class16.method90((byte) 109);
        class231.method1448((byte) -5);
        class377.method2465((byte) 22);
        class123.method825(-882360351);
        class408.method2620(arg0 - 217);
        class448.method2789(-21);
        class438.method2752(arg0 - 20);
        class433.method2718(true);
        class36.method260(-90);
        class309.method1960((byte) -78);
        class431.method2713(true);
        class31.method235(0);
        class113.method745(-24);
        class249.method1551(-1298479124);
        class62.method419(true);
        class411.field5967.method1243(arg0 ^ 0x39A);
        class26.field424.method1243(1000);
        class222.field2977.method1243(1000);
        class2.field21.method1243(1000);
        class111.field1640.method1243(1000);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)[[I", line = 41)
    public final int[][] method2687(int arg0) {
        field6125++;
        if (this.field6132 != this.field6123) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field6132; var2++) {
            this.field6128[var2] = class331.field4483;
        }
        return this.field6131;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)[I", line = 64)
    public final int[] method2688(byte arg0, int arg1) {
        if (arg0 > -51) {
            this.field6123 = 37;
        }
        field6124++;
        if (this.field6132 == this.field6123) {
            this.field6138 = this.field6128[arg1] == null;
            this.field6128[arg1] = class331.field4483;
            return this.field6131[arg1];
        } else if (this.field6132 == 1) {
            this.field6138 = this.field6135 != arg1;
            this.field6135 = arg1;
            return this.field6131[0];
        } else {
            class53 var3 = this.field6128[arg1];
            if (var3 == null) {
                this.field6138 = true;
                if (this.field6134 < this.field6132) {
                    var3 = new class53(arg1, this.field6134);
                    this.field6134++;
                } else {
                    class53 var4 = (class53) this.field6136.method1313(-14122);
                    var3 = new class53(arg1, var4.field781);
                    this.field6128[var4.field785] = null;
                    var4.method2459(198);
                }
                this.field6128[arg1] = var3;
            } else {
                this.field6138 = false;
            }
            this.field6136.method1307(var3, -4);
            return this.field6131[var3.field781];
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V", line = 136)
    public static void method2689(byte arg0) {
        if (arg0 < 36) {
            field6126 = 121;
        }
        field6137 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V", line = 151)
    public static final void method2690(int arg0, int arg1) {
        if (arg0 > -10) {
            return;
        }
        class377.field5382 = arg1;
        field6130++;
        class190 var2 = class395.field5772;
        synchronized (class395.field5772) {
            class395.field5772.method1249(1);
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(III)V", line = 223)
    public class427(int arg0, int arg1, int arg2) {
        this.field6132 = arg0;
        this.field6123 = arg1;
        this.field6131 = new int[this.field6132][arg2];
        this.field6128 = new class53[this.field6123];
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V", line = 194)
    public final void method2691(byte arg0) {
        field6129++;
        for (int var2 = 0; var2 < this.field6132; var2++) {
            this.field6131[var2] = null;
        }
        this.field6131 = null;
        if (arg0 < 13) {
            field6122 = -50;
        }
        this.field6128 = null;
        this.field6136.method1315(119);
        this.field6136 = null;
    }
}
