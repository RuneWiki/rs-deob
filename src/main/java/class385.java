import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class385 {

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    private int field4910 = 0;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
    private int field4912 = -1;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "Lfh;")
    private class653 field4918 = new class653();

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "Z")
    public boolean field4922 = false;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    private int field4920;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    private int field4914;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "[Lbw;")
    private class690[] field4913;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "[[[I")
    private int[][][] field4916;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "Lhg;")
    public static class693 field4919 = new class693(49, 7);

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "[[B")
    public static byte[][] field4921;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2190(boolean arg0) {
        field4921 = null;
        if (!arg0) {
            field4919 = null;
        }
        field4919 = null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BI)[[I", line = 15)
    public final int[][] method2191(byte arg0, int arg1) {
        field4911++;
        if (arg0 != 52) {
            this.method2192(-38);
        }
        if (this.field4920 == this.field4914) {
            this.field4922 = this.field4913[arg1] == null;
            this.field4913[arg1] = class397.field5073;
            return this.field4916[arg1];
        } else if (this.field4914 == 1) {
            this.field4922 = this.field4912 != arg1;
            this.field4912 = arg1;
            return this.field4916[0];
        } else {
            class690 var3 = this.field4913[arg1];
            if (var3 == null) {
                this.field4922 = true;
                if (this.field4914 > this.field4910) {
                    var3 = new class690(arg1, this.field4910);
                    this.field4910++;
                } else {
                    class690 var4 = (class690) this.field4918.method3658(arg0 - 8770);
                    var3 = new class690(arg1, var4.field9597);
                    this.field4913[var4.field9594] = null;
                    var4.method1175(-2);
                }
                this.field4913[arg1] = var3;
            } else {
                this.field4922 = false;
            }
            this.field4918.method3659(false, var3);
            return this.field4916[var3.field9597];
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 86)
    public final void method2192(int arg0) {
        if (arg0 >= -44) {
            return;
        }
        field4917++;
        for (int var2 = 0; var2 < this.field4914; var2++) {
            this.field4916[var2][0] = null;
            this.field4916[var2][1] = null;
            this.field4916[var2][2] = null;
            this.field4916[var2] = null;
        }
        this.field4913 = null;
        this.field4916 = null;
        this.field4918.method3668(0);
        this.field4918 = null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)[[[I", line = 113)
    public final int[][][] method2193(byte arg0) {
        field4915++;
        int var2 = -48 / ((arg0 - 32) / 46);
        if (this.field4920 != this.field4914) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field4914; var3++) {
            this.field4913[var3] = class397.field5073;
        }
        return this.field4916;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(III)V", line = 160)
    public class385(int arg0, int arg1, int arg2) {
        this.field4920 = arg1;
        this.field4914 = arg0;
        this.field4913 = new class690[this.field4920];
        this.field4916 = new int[this.field4914][3][arg2];
    }
}
