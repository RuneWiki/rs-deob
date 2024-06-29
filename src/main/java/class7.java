import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class7 {

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    private int field59 = 0;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    private int field66 = -1;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lwa;")
    private class281 field55 = new class281();

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "Z")
    public boolean field69 = false;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "[[I")
    private int[][] field63;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[Ld;")
    private class259[] field58;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field61 = 0;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "Ljava/lang/String;")
    public static String field68 = null;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[[B")
    public static byte[][] field56;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)[[I")
    public final int[][] method35(int arg0) {
        field60++;
        if (this.field67 != this.field62) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -17218) {
            this.field69 = true;
        }
        for (int var2 = 0; var2 < this.field62; var2++) {
            this.field58[var2] = class142.field2205;
        }
        return this.field63;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[I")
    public final int[] method36(int arg0, int arg1) {
        if (arg1 != 30672) {
            this.field55 = null;
        }
        field57++;
        if (this.field67 == this.field62) {
            this.field69 = this.field58[arg0] == null;
            this.field58[arg0] = class142.field2205;
            return this.field63[arg0];
        } else if (this.field62 == 1) {
            this.field69 = this.field66 != arg0;
            this.field66 = arg0;
            return this.field63[0];
        } else {
            class259 var3 = this.field58[arg0];
            if (var3 == null) {
                this.field69 = true;
                if (this.field59 >= this.field62) {
                    class259 var4 = (class259) this.field55.method1951(108);
                    var3 = new class259(arg0, var4.field4253);
                    this.field58[var4.field4252] = null;
                    var4.method900(78);
                } else {
                    var3 = new class259(arg0, this.field59);
                    this.field59++;
                }
                this.field58[arg0] = var3;
            } else {
                this.field69 = false;
            }
            this.field55.method1957(arg1 - 30554, var3);
            return this.field63[var3.field4253];
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    public final void method37(int arg0) {
        int var2 = 0;
        if (arg0 <= 46) {
            this.field58 = null;
        }
        while (var2 < this.field62) {
            this.field63[var2] = null;
            var2++;
        }
        this.field58 = null;
        this.field63 = null;
        field64++;
        this.field55.method1954((byte) 127);
        this.field55 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V")
    public static final void method38(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class229.field3657 == 1) {
            class274.field4519[class280.field4639 / 100].method252(class47.field648 - 8, class156.field2474 + -8);
        }
        if (class229.field3657 == 2) {
            class274.field4519[class280.field4639 / 100 + 4].method252(class47.field648 - 8, class156.field2474 + -8);
        }
        if (arg2 == 100) {
            class35.method207(32);
            field65++;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
    public static void method39(boolean arg0) {
        field68 = null;
        field56 = null;
        if (arg0) {
            field68 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(III)V")
    public class7(int arg0, int arg1, int arg2) {
        this.field62 = arg0;
        this.field67 = arg1;
        this.field63 = new int[this.field62][arg2];
        this.field58 = new class259[this.field67];
    }
}
