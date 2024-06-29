import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class313 extends class351 {

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    private int field4604;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    private int field4600;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    private int field4601;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field4592 = 0;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "[[B")
    public static byte[][] field4597 = new byte[1000][];

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field4603 = 0;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lfh;")
    public static class140 field4595;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Ljf;")
    public static class265 field4598;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IZ)V", line = 4)
    public static final void method2167(int arg0, boolean arg1) {
        field4599++;
        if (arg1) {
            class271.field3888.method2264((byte) -81, arg0);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 20)
    public static void method2168(int arg0) {
        field4597 = (byte[][]) null;
        field4595 = null;
        if (arg0 != -1739218740) {
            method2169((byte) 89, false);
        }
        field4598 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V", line = 36)
    public final void method1297(int arg0, int arg1, int arg2) {
        field4605++;
        if (arg0 != 1380163464) {
            this.field4600 = 42;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZ)V", line = 50)
    public final void method1295(int arg0, int arg1, boolean arg2) {
        int var4 = this.field4602 * arg0 >> 12;
        field4593++;
        if (!arg2) {
            this.method1297(44, -26, -107);
        }
        int var5 = this.field4604 * arg0 >> 12;
        int var6 = this.field4601 * arg1 >> 12;
        int var7 = this.field4600 * arg1 >> 12;
        class131.method1002(var7, var6, this.field5486, 118, var4, var5);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIB)V", line = 68)
    public final void method1294(int arg0, int arg1, byte arg2) {
        field4594++;
        if (arg2 > -108) {
            this.method1294(-89, -122, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIIIII)V", line = 78)
    public class313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4604 = arg2;
        this.field4600 = arg1;
        this.field4602 = arg0;
        this.field4601 = arg3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BZ)V", line = 90)
    public static final void method2169(byte arg0, boolean arg1) {
        if (arg0 <= 30) {
            field4603 = 17;
        }
        class214.method1562(arg1, -6090, class163.field2314, class233.field3340, class192.field2660);
        field4591++;
    }
}
