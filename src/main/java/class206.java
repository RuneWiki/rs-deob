import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class206 extends class34 {

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    private int field2781;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    private int field2779;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    private int field2773;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    private int field2778;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "[Ln;")
    public static class25[] field2777 = new class25[2048];

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V", line = 8)
    public static void method1218(int arg0) {
        if (arg0 == -540) {
            field2777 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)V", line = 20)
    public final void method227(int arg0, int arg1, int arg2) {
        if (arg0 <= 26) {
            this.field2779 = -112;
        }
        ++field2774;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIIII)V", line = 30)
    public class206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2781 = arg0;
        this.field2779 = arg2;
        this.field2773 = arg1;
        this.field2778 = arg3;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(III)V", line = 41)
    public final void method228(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            ++field2776;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILlm;)I", line = 53)
    public static final int method1219(int arg0, class347 arg1) {
        ++field2780;
        int var2 = 0;
        if (arg1.method2257(true, class244.field3263)) {
            ++var2;
        }
        if (arg1.method2257(true, class167.field2260)) {
            ++var2;
        }
        if (arg0 != 10455) {
            method1218(53);
        }
        if (arg1.method2257(true, class90.field1273)) {
            ++var2;
        }
        if (arg1.method2257(true, class184.field2494)) {
            ++var2;
        }
        if (arg1.method2257(true, class439.field6448)) {
            ++var2;
        }
        if (arg1.method2257(true, class5.field69)) {
            ++var2;
        }
        if (arg1.method2257(true, class94.field1352)) {
            ++var2;
        }
        if (arg1.method2257(true, class347.field5022)) {
            ++var2;
        }
        if (arg1.method2257(true, class63.field850)) {
            ++var2;
        }
        if (arg1.method2257(true, class65.field862)) {
            ++var2;
        }
        if (arg1.method2257(true, class379.field5508)) {
            ++var2;
        }
        if (arg1.method2257(true, class382.field5545)) {
            ++var2;
        }
        if (arg1.method2257(true, class131.field1803)) {
            ++var2;
        }
        if (arg1.method2257(true, class115.field1609)) {
            ++var2;
        }
        if (arg1.method2257(true, class213.field2848)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V", line = 126)
    public final void method224(int arg0, int arg1, int arg2) {
        ++field2775;
        int var4 = this.field2781 * arg2 >> 12;
        int var5 = this.field2779 * arg2 >> 12;
        int var6 = this.field2773 * arg0 >> 12;
        int var7 = this.field2778 * arg0 >> 12;
        class434.method2739(var6, var5, var7, var4, super.field479, (byte) 48);
        if (arg1 != 512) {
            this.field2773 = 86;
        }
    }
}
