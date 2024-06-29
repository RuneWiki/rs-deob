import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class200 {

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    private int field3959 = -1;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    private int field3958 = 0;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lad;")
    private class5 field3960 = new class5();

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Z")
    public boolean field3966 = false;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    private int field3964;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[[I")
    private int[][] field3961;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    private int field3955;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "[Lw;")
    private class202[] field3963;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field3952 = 500;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field3962 = -1;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lrf;")
    public static class163 field3965 = class53.method392(96, "<col=ff3000>");

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "J")
    public static long field3957;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method1315(int arg0) {
        field3965 = null;
        if (arg0 != 0) {
            method1318(-89, 51);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public final void method1316(int arg0) {
        field3953++;
        for (int var2 = 0; var2 < this.field3955; var2++) {
            this.field3961[var2] = null;
        }
        this.field3963 = null;
        if (arg0 != 774285124) {
            this.field3963 = null;
        }
        this.field3961 = null;
        this.field3960.method54((byte) 122);
        this.field3960 = null;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)[[I")
    public final int[][] method1317(int arg0) {
        field3956++;
        if (this.field3964 != this.field3955) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 > -106) {
            this.field3955 = -62;
        }
        for (int var2 = 0; var2 < this.field3955; var2++) {
            this.field3963[var2] = class125.field2602;
        }
        return this.field3961;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
    public static final int method1318(int arg0, int arg1) {
        if (arg0 != -32402) {
            return -128;
        }
        field3951++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)[I")
    public final int[] method1319(int arg0, int arg1) {
        if (arg0 >= -96) {
            return null;
        }
        field3954++;
        if (this.field3964 == this.field3955) {
            this.field3966 = this.field3963[arg1] == null;
            this.field3963[arg1] = class125.field2602;
            return this.field3961[arg1];
        } else if (this.field3955 == 1) {
            this.field3966 = this.field3959 != arg1;
            this.field3959 = arg1;
            return this.field3961[0];
        } else {
            class202 var3 = this.field3963[arg1];
            if (this.field3966 = var3 == null) {
                if (this.field3958 < this.field3955) {
                    var3 = new class202(arg1, this.field3958);
                    this.field3958++;
                } else {
                    class202 var4 = (class202) this.field3960.method48(0);
                    var3 = new class202(arg1, var4.field3987);
                    this.field3963[var4.field3978] = null;
                    var4.method630(24);
                }
                this.field3963[arg1] = var3;
            }
            this.field3960.method52(var3, 0);
            return this.field3961[var3.field3987];
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(III)V")
    public class200(int arg0, int arg1, int arg2) {
        this.field3964 = arg1;
        this.field3961 = new int[arg0][arg2];
        this.field3955 = arg0;
        this.field3963 = new class202[arg1];
    }
}
