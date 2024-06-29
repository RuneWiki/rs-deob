import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class738 extends class122 implements class408 {

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    private int field10175;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "[[I")
    public static int[][] field10178 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "[I")
    public static int[] field10182 = new int[500];

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field10172;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    public static int field10173;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field10176;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public static int field10177;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
    public static int field10180;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "I")
    public static int field10181;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "(I)V", line = 3)
    public static final void method4107(int arg0) {
        class274.field3951.method515((0.7F + 0.1F * (float) class21.field353.field10074.method315(-63)) * 1.1523438F);
        ++field10172;
        class274.field3951.method469(class763.field10521, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class274.field3951.method502(class251.field3707, -1, arg0);
        class274.field3951.method464(class528.field7541);
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)J", line = 15)
    public final long method1242(int arg0) {
        int var2 = 12 % ((arg0 - -42) / 62);
        ++field10179;
        return super.field1903.getAddress();
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IB[BI)V", line = 25)
    public final void method1240(int arg0, byte arg1, byte[] arg2, int arg3) {
        this.method930(arg2, arg3);
        if (arg1 != 76) {
            this.field10175 = -122;
        }
        ++field10181;
        this.field10175 = arg0;
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lqfa;I[BI)V", line = 40)
    public class738(class106 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field10175 = arg1;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)I", line = 51)
    public final int method1246(int arg0) {
        ++field10176;
        if (arg0 != -13768) {
            this.method1240(63, (byte) -59, (byte[]) null, -76);
        }
        return this.field10175;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lwn;Z)I", line = 65)
    public static final int method4108(class753 arg0, boolean arg1) {
        if (!arg1) {
            field10178 = null;
        }
        ++field10173;
        String var2 = class313.method2010(arg0, -81);
        return class395.field5431.method40(var2, class132.field1980, (byte) -120);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V", line = 78)
    public static void method4109(byte arg0) {
        field10182 = null;
        field10178 = null;
        if (arg0 != 122) {
            field10182 = null;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIIIBIIII)V", line = 93)
    public static final void method4110(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field10174;
        if (arg4 <= -117) {
            class111.field1700[class169.field2647++] = new class478(arg5, arg8, arg7, arg6, arg6, arg7, arg3, arg1, arg1, arg3, arg2, arg2, arg0, arg0);
        }
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)I", line = 104)
    public final int method1245(int arg0) {
        ++field10177;
        if (arg0 != -7597) {
            method4109((byte) -65);
        }
        return 0;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Z)V", line = 117)
    public static final void method4111(boolean arg0) {
        ++field10180;
        class478.method2853(2);
        class624.method3590((byte) 113, ~class21.field353.field10081.method1474(-99) == -2, 22050, 2);
        class16.field299 = class386.method2413(class629.field8819, 22050, 0, (byte) -62, class519.field7328);
        class460.method2735(arg0, class391.method2423((class462) null, 13955), (byte) -110);
        class443.field6038 = class386.method2413(class629.field8819, 2048, 1, (byte) -74, class519.field7328);
        class443.field6038.method2190(0, class184.field2828);
    }
}
