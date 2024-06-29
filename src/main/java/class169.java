import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class169 extends class331 {

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field2222 = 0;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "Lbh;")
    public static class429 field2234;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)I", line = 8)
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            field2234 = null;
        }
        ++field2226;
        return 1;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lts;)V", line = 19)
    public class169(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)Z", line = 22)
    public final boolean method1056(byte arg0) {
        ++field2228;
        if (arg0 <= 103) {
            return false;
        } else {
            return !super.field4203.method344((byte) 2);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V", line = 37)
    public final void method227(int arg0, int arg1) {
        ++field2231;
        if (arg0 <= 113) {
            method1058(true);
        }
        super.field4202 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ILts;)V", line = 48)
    public class169(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(II)Z", line = 52)
    public static final boolean method1057(int arg0, int arg1) {
        int var2 = 79 / ((92 - arg1) / 33);
        ++field2225;
        return ~arg0 == -22 || arg0 == 11 || ~arg0 == -1012 || arg0 == 30 || ~arg0 == -60;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 62)
    public final void method224(int arg0) {
        if (super.field4203.method344((byte) -119)) {
            super.field4202 = 0;
        }
        ++field2227;
        if (arg0 == -1959) {
            if (~super.field4202 > -1 && super.field4202 > 2) {
                super.field4202 = this.method226((byte) 13);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)V", line = 79)
    public static void method1058(boolean arg0) {
        field2234 = null;
        if (!arg0) {
            field2234 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V", line = 92)
    public static final void method1059(byte arg0) {
        ++field2232;
        if (arg0 <= -113) {
            class112 var1 = null;
            try {
                class435 var2 = class681.field9312.method1552(-12111, true, "2");
                while (var2.field6124 == 0) {
                    class517.method2965(1L, -92);
                }
                if (~var2.field6124 == -2) {
                    var1 = (class112) var2.field6123;
                    byte[] var3 = new byte[(int) var1.method757(-1)];
                    int var5;
                    for (int var4 = 0; var3.length > var4; var4 += var5) {
                        var5 = var1.method761(var3.length + -var4, (byte) 127, var4, var3);
                        if (~var5 == 0) {
                            throw new IOException("EOF");
                        }
                    }
                    class177.method1085(-60, new class179(var3));
                }
            } catch (Exception var7) {
            }
            try {
                if (var1 != null) {
                    var1.method756(-1);
                }
            } catch (Exception var6) {
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(B)I", line = 145)
    public final int method1060(byte arg0) {
        ++field2229;
        return arg0 > -119 ? 86 : super.field4202;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)I", line = 159)
    public final int method222(int arg0, int arg1) {
        ++field2223;
        if (super.field4203.method344((byte) 89)) {
            return 3;
        } else if (~arg0 != -1 && super.field4203.field591.method3604((byte) -125) != 1) {
            if (arg1 != 1) {
                field2222 = 26;
            }
            return 2;
        } else {
            return 1;
        }
    }
}
