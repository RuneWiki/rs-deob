import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class152 extends class384 implements class436 {

    @OriginalMember(owner = "client!nea", name = "E", descriptor = "[I")
    public static int[] field2223 = new int[4096];

    @OriginalMember(owner = "client!nea", name = "F", descriptor = "Llc;")
    public static class435 field2224;

    @OriginalMember(owner = "client!nea", name = "G", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!nea", name = "u", descriptor = "B")
    private byte field2213;

    @OriginalMember(owner = "client!nea", name = "t", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!nea", name = "v", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!nea", name = "w", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!nea", name = "x", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!nea", name = "y", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!nea", name = "A", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!nea", name = "B", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!nea", name = "C", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!nea", name = "D", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field2223 = null;
        field2224 = null;
        if (arg0 != 4096) {
            method1097(-101);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        super.method175(-60);
        int var2 = -48 % ((-17 - arg0) / 40);
        ++field2217;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Ljf;Z)V")
    public static final void method1098(class638 arg0, boolean arg1) {
        for (int var2 = arg0.field9038; var2 <= arg0.field9036; ++var2) {
            for (int var3 = arg0.field9035; var3 <= arg0.field9042; ++var3) {
                class375 var4 = class565.field8185[arg0.field3920][var2][var3];
                if (var4 != null) {
                    class208 var5 = var4.field5425;
                    class208 var6 = null;
                    while (var5 != null) {
                        if (var5.field3144 == arg0) {
                            if (var6 != null) {
                                var6.field3146 = var5.field3146;
                            } else {
                                var4.field5425 = var5.field3146;
                            }
                            var5.method1485(32659);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field3146;
                    }
                }
            }
        }
        if (!arg1) {
            class502.method3061(arg0);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)Z")
    public final boolean method1099(byte arg0) {
        ++field2215;
        if (arg0 >= -103) {
            this.method175(-55);
        }
        return super.method2371(-31668, super.field5548.field9245);
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lmba;Z)V")
    public class152(class643 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "(I)I")
    public final int method1100(int arg0) {
        if (arg0 != -20392) {
            field2225 = -85;
        }
        ++field2218;
        return this.field2213;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)Z")
    public final boolean method1101(int arg0, int arg1, int arg2) {
        this.field2213 = (byte) arg1;
        ++field2222;
        if (arg0 != -32376) {
            this.method1101(-70, 4, -98);
        }
        super.method174(arg2, (byte) 39);
        return true;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    public final boolean method1102(int arg0, Source arg1, int arg2, int arg3) {
        this.field2213 = (byte) arg3;
        ++field2220;
        super.method2367((byte) 97, arg1, arg0);
        return arg2 > -28 ? true : true;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method1103(byte arg0, boolean arg1) {
        if (arg0 != 73) {
            this.method1103((byte) -24, false);
        }
        ++field2216;
        return super.method2366(arg1, -6633, super.field5548.field9245);
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(B)V")
    public static final void method1104(byte arg0) {
        if (arg0 != 118) {
            field2224 = null;
        }
        ++field2219;
        class238.field3551 = true;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)I")
    public final int method1105(boolean arg0) {
        if (arg0) {
            return -112;
        } else {
            ++field2212;
            return super.method1105(arg0);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field2223[var0] = class166.method1185((byte) -71, var0);
        }
        field2224 = new class435(93, 0);
        field2225 = 1;
    }
}
