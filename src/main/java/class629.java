import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class629 {

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public int field8777;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public int field8774;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public int field8780;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public int field8779;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "B")
    public byte field8775;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public int field8778;

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "Luc;")
    public static class27 field8785 = new class27(73, 6);

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "[I")
    public static int[] field8788 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "Lju;")
    public class111 field8784;

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "Lji;")
    public class559 field8787;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "Lqr;")
    public class59 field8776;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "Ljt;")
    public class90 field8783;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3493(String arg0, int arg1) {
        field8782++;
        if (arg1 >= -97) {
            field8789 = 12;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public static void method3494(int arg0) {
        if (arg0 != 16384) {
            method3494(-20);
        }
        field8788 = null;
        field8785 = null;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
    public static final void method3495(int arg0, int arg1) {
        field8781++;
        int var2 = class239.field3440 - class17.field247;
        if (var2 >= 100) {
            class670.field9445 = 1;
            return;
        }
        int var3 = (int) class249.field3516;
        if (var3 < class21.field289 >> 8) {
            var3 = class21.field289 >> 8;
        }
        if (class459.field6496[arg1] && class399.field5544[4] + 128 > var3) {
            var3 = class399.field5544[4] + 128;
        }
        int var4 = (int) class646.field9167 + class520.field7077 & 0x3FFF;
        class274.method1667(class652.field9218, var3, class203.method1355(class253.field3576.field514, class253.field3576.field509, 4, class233.field3305) - 200, class581.field8108, arg1 - 5, 600 - -((var3 >> 3) * 3) << 2, arg0, var4);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class117.field1563 = (int) ((float) (class117.field1563 - class170.field2556) * var5 + (float) class170.field2556);
        class172.field2572 = (int) ((float) (class172.field2572 - class429.field6022) * var5 + (float) class429.field6022);
        class628.field8762 = (int) ((float) (class628.field8762 - class305.field4488) * var5 + (float) class305.field4488);
        class492.field6794 = (int) ((float) (class492.field6794 - class274.field3871) * var5 + (float) class274.field3871);
        int var6 = class591.field8245 - class1.field9;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class591.field8245 = (int) ((float) var6 * var5 + (float) class1.field9);
        class591.field8245 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)Z")
    public final boolean method3496(byte arg0) {
        field8786++;
        if (arg0 != 2) {
            this.field8776 = null;
        }
        return this.field8775 == 2 || this.field8775 == 3;
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(BIIIII)V")
    public class629(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8777 = arg5;
        this.field8774 = arg4;
        this.field8780 = arg1;
        this.field8779 = arg3;
        this.field8775 = arg0;
        this.field8778 = arg2;
    }
}
