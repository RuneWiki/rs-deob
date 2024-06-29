import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class444 {

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    private int field6127 = 0;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    private int field6133 = -1;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lsm;")
    private class249 field6126 = new class249();

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Z")
    public boolean field6135 = false;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    private int field6132;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    private int field6122;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[[I")
    private int[][] field6134;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "[Lnm;")
    private class292[] field6129;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field6120 = 0;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lfn;")
    public static class52 field6125 = new class52(18, -1);

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "[[I")
    public static int[][] field6136 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "[I")
    public static int[] field6138 = new int[14];

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lwl;")
    public static class139 field6124;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "[[S")
    public static short[][] field6137;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)[[I")
    public final int[][] method2582(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field6130++;
        if (this.field6132 != this.field6122) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field6132; var2++) {
            this.field6129[var2] = class15.field251;
        }
        return this.field6134;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static final void method2583(byte arg0) {
        field6121++;
        class7.field125 = new class106(class189.field2710.method695(-114, class487.field6867), "", class299.field4106, 1001, -1, 0L, 0, 0, true, false);
        if (arg0 >= -41) {
            field6125 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public final void method2584(int arg0) {
        field6131++;
        for (int var2 = 0; var2 < this.field6132; var2++) {
            this.field6134[var2] = null;
        }
        this.field6129 = null;
        this.field6134 = null;
        this.field6126.method1552((byte) 117);
        if (arg0 == -23339) {
            this.field6126 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[I")
    public final int[] method2585(int arg0, int arg1) {
        field6123++;
        if (arg1 != 0) {
            this.method2584(94);
        }
        if (this.field6132 == this.field6122) {
            this.field6135 = this.field6129[arg0] == null;
            this.field6129[arg0] = class15.field251;
            return this.field6134[arg0];
        } else if (this.field6132 == 1) {
            this.field6135 = this.field6133 != arg0;
            this.field6133 = arg0;
            return this.field6134[0];
        } else {
            class292 var3 = this.field6129[arg0];
            if (var3 == null) {
                this.field6135 = true;
                if (this.field6132 > this.field6127) {
                    var3 = new class292(arg0, this.field6127);
                    this.field6127++;
                } else {
                    class292 var4 = (class292) this.field6126.method1545(-15);
                    var3 = new class292(arg0, var4.field4004);
                    this.field6129[var4.field4010] = null;
                    var4.method1182(28818);
                }
                this.field6129[arg0] = var3;
            } else {
                this.field6135 = false;
            }
            this.field6126.method1541((byte) -74, var3);
            return this.field6134[var3.field4004];
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method2586(int arg0) {
        field6136 = null;
        field6125 = null;
        field6138 = null;
        field6124 = null;
        if (arg0 <= 44) {
            method2583((byte) -48);
        }
        field6137 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(III)V")
    public class444(int arg0, int arg1, int arg2) {
        this.field6132 = arg0;
        this.field6122 = arg1;
        this.field6134 = new int[this.field6132][arg2];
        this.field6129 = new class292[this.field6122];
    }
}
