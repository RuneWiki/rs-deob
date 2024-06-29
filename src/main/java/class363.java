import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class363 extends class42 implements class322 {

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
    private int field4866;

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "[Lfb;")
    public static class579[] field4863;

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)I")
    public final int method1996(int arg0) {
        if (arg0 != -17760) {
            method2174(123);
        }
        ++field4867;
        return this.field4866;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B[BII)V")
    public final void method1998(byte arg0, byte[] arg1, int arg2, int arg3) {
        ++field4871;
        this.method416(arg1, arg2);
        if (arg0 < 117) {
            method2173((byte) -22, false);
        }
        this.field4866 = arg3;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
    public static final void method2172(boolean arg0) {
        if (class360.field4844 > 0) {
            int var1 = 0;
            for (int var2 = 0; class607.field8742.length > var2; ++var2) {
                if (class607.field8742[var2].startsWith("--> ")) {
                    ++var1;
                    if (class360.field4844 == var1) {
                        class585.field8364 = class607.field8742[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class585.field8364 = "";
        }
        if (arg0) {
            field4863 = null;
        }
        ++field4864;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BZ)C")
    public static final char method2173(byte arg0, boolean arg1) {
        ++field4868;
        int var2 = arg0 & 255;
        if (~var2 == -1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else if (!arg1) {
            return '+';
        } else {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class3.field44[var2 - 128];
                if (var3 == 0) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "(I)V")
    public static void method2174(int arg0) {
        field4863 = null;
        if (arg0 >= -79) {
            field4863 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lgi;I[BI)V")
    public class363(class583 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4866 = arg1;
    }

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(I)J")
    public final long method1997(int arg0) {
        ++field4865;
        if (arg0 != -14011) {
            this.field4866 = -69;
        }
        return super.field811.getAddress();
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)I")
    public final int method1995(int arg0) {
        if (arg0 != -16846) {
            method2174(-16);
        }
        ++field4869;
        return 0;
    }
}
