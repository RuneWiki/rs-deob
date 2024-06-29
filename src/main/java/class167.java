import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class167 extends class402 implements class359 {

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    private int field2086;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "Ljv;")
    public static class606 field2085 = new class606(5, 1);

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient;")
    public static client field2083;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "[Lxa;")
    public static class424[] field2089;

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lpea;I[BI)V", line = 5)
    public class167(class641 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2086 = arg1;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([BIII)V", line = 15)
    public final void method1109(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field2081;
        this.method2370(arg0, arg3);
        if (arg2 < 6) {
            this.field2086 = -108;
        }
        this.field2086 = arg1;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(B)I", line = 29)
    public final int method1110(byte arg0) {
        ++field2080;
        int var2 = 108 / ((22 - arg0) / 32);
        return 0;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)J", line = 42)
    public final long method1111(int arg0) {
        if (arg0 != 9677) {
            this.method1110((byte) 41);
        }
        ++field2087;
        return super.field5699.getAddress();
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(FIIIIZIII)[[I", line = 53)
    public static final int[][] method1112(float arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        ++field2084;
        int[][] var9 = new int[arg1][arg7];
        class541 var10 = new class541();
        var10.field7404 = arg5;
        var10.field7399 = (int) (arg0 * 4096.0F);
        var10.field7400 = arg3;
        var10.field7409 = arg2;
        var10.field7408 = arg4;
        var10.method11((byte) -54);
        class261.method1635(-62, arg7, arg1);
        int var11 = 0;
        if (arg6 != 5) {
            field2089 = null;
        }
        while (arg1 > var11) {
            var10.method3047(var9[var11], var11, arg6 + 4090);
            ++var11;
        }
        return var9;
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(B)V", line = 84)
    public static void method1113(byte arg0) {
        field2089 = null;
        field2083 = null;
        if (arg0 == 6) {
            field2085 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)I", line = 96)
    public final int method1114(byte arg0) {
        if (arg0 >= -58) {
            field2083 = null;
        }
        ++field2082;
        return this.field2086;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V", line = 109)
    public static final void method1115(int arg0) {
        field2083.method2065(arg0 ^ 5754);
        ++field2088;
        class253.field3491.field1745 = 0;
        class412.field5780 = 0;
        class143.field1819 = null;
        class365.field5243 = arg0;
        class164.field2068.field1745 = 0;
        class253.field3494 = null;
        class99.field1210 = null;
        class503.method2848((byte) 35);
        class21.field192 = null;
        class110.field1323 = 0;
        class35.field341 = 0;
        class99.field1209 = 0;
        class624.field8496 = null;
    }
}
