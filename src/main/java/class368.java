import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class368 extends class73 {

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    private int field5678;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    private int field5680;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    private int field5676;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    private int field5674;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "[[I")
    public static int[][] field5677 = new int[6][];

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public static int field5681 = 0;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "Lru;")
    public static class177 field5673 = new class177(512);

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "F")
    public static float field5685 = 1.0F;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public static final void method2408(byte arg0) {
        class229.field3804 = new class317();
        ++field5672;
        if (arg0 < 1) {
            method2410(-37);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIB)V")
    public final void method532(int arg0, int arg1, byte arg2) {
        ++field5682;
        int var4 = this.field5678 * arg1 >> 12;
        if (arg2 != -67) {
            method2410(40);
        }
        int var5 = this.field5680 * arg1 >> 12;
        int var6 = this.field5674 * arg0 >> 12;
        int var7 = this.field5676 * arg0 >> 12;
        class222.method1618((byte) 48, var4, super.field1096, var6, var7, var5);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZI)V")
    public final void method538(int arg0, boolean arg1, int arg2) {
        ++field5684;
        if (arg1) {
            this.method538(108, false, -65);
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(IIB)V")
    public final void method537(int arg0, int arg1, byte arg2) {
        ++field5679;
        if (arg2 < -78) {
            int var4 = this.field5678 * arg0 >> 12;
            int var5 = this.field5680 * arg0 >> 12;
            int var6 = this.field5674 * arg1 >> 12;
            int var7 = this.field5676 * arg1 >> 12;
            class526.method3137(super.field1098, 65534, super.field1096, var5, var6, var4, var7, super.field1101);
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(B)V")
    public static void method2409(byte arg0) {
        int var1 = -66 % ((arg0 - 67) / 48);
        field5677 = null;
        field5673 = null;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
    public static final void method2410(int arg0) {
        ++field5675;
        class328 var1 = class211.field3462;
        synchronized (class211.field3462) {
            class211.field3462.method2189(false);
        }
        class328 var2 = class524.field7739;
        synchronized (class524.field7739) {
            if (arg0 > -56) {
                field5677 = null;
            }
            class524.field7739.method2189(false);
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIII)V")
    public class368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5678 = arg0;
        this.field5680 = arg2;
        this.field5676 = arg3;
        this.field5674 = arg1;
    }
}
