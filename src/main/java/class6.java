import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class6 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    private int field78 = -1;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    private int field87 = 0;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Lfg;")
    private class203 field77 = new class203();

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "Z")
    public boolean field94 = false;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    private int field79;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "[Ls;")
    private class260[] field88;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "[[[I")
    private int[][][] field81;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lve;")
    public static class255 field84 = class87.method607(125, "mapdots");

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Lve;")
    private static class255 field86 = class87.method607(94, "Connected to update server");

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Lve;")
    public static class255 field90 = field86;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lkf;")
    public static class212 field83 = new class212(5000);

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field95 = -2;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Lph;")
    public static class71 field82;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)[[[I", line = 10)
    public final int[][][] method32(int arg0) {
        field80++;
        if (this.field92 != this.field79) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field79; var2++) {
            this.field88[var2] = class75.field1235;
        }
        return this.field81;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 38)
    public static void method33(int arg0) {
        field82 = null;
        if (arg0 != 10461) {
            method33(23);
        }
        field83 = null;
        field90 = null;
        field84 = null;
        field86 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(III)V", line = 224)
    public class6(int arg0, int arg1, int arg2) {
        this.field79 = arg0;
        this.field92 = arg1;
        this.field88 = new class260[this.field92];
        this.field81 = new int[this.field79][3][arg2];
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 85)
    public final void method34(byte arg0) {
        for (int var2 = 0; var2 < this.field79; var2++) {
            this.field81[var2][0] = null;
            this.field81[var2][1] = null;
            this.field81[var2][2] = null;
            this.field81[var2] = (int[][]) null;
        }
        this.field88 = null;
        field85++;
        this.field81 = (int[][][]) null;
        int var3 = 10 % ((arg0 - 31) / 33);
        this.field77.method1474(true);
        this.field77 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)[[I", line = 111)
    public final int[][] method35(int arg0, int arg1) {
        field91++;
        if (arg1 <= 81) {
            field84 = (class255) null;
        }
        if (this.field92 == this.field79) {
            this.field94 = this.field88[arg0] == null;
            this.field88[arg0] = class75.field1235;
            return this.field81[arg0];
        } else if (this.field79 == 1) {
            this.field94 = this.field78 != arg0;
            this.field78 = arg0;
            return this.field81[0];
        } else {
            class260 var3 = this.field88[arg0];
            if (var3 == null) {
                this.field94 = true;
                if (this.field79 > this.field87) {
                    var3 = new class260(arg0, this.field87);
                    this.field87++;
                } else {
                    class260 var4 = (class260) this.field77.method1470(28527);
                    var3 = new class260(arg0, var4.field4401);
                    this.field88[var4.field4413] = null;
                    var4.method1502((byte) -82);
                }
                this.field88[arg0] = var3;
            } else {
                this.field94 = false;
            }
            this.field77.method1469(47, var3);
            return this.field81[var3.field4401];
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 178)
    public static final void method36(byte arg0) {
        class307.method2136((byte) 51);
        field89++;
        class217.method1539((byte) 113);
        class58.method357(true);
        class275.method1930(116);
        class260.method1815(85);
        class10.method52(32);
        class55.method342(-24957);
        class249.method1717((byte) 95);
        class81.method557(80);
        class144.method1071((byte) 75);
        class269.method1874(-25683);
        class208.method1500(-1470534552);
        class242.method1681((byte) 96);
        class64.method392(3758);
        class53.field820.method554(0);
        if (arg0 < 39) {
            method33(68);
        }
    }
}
