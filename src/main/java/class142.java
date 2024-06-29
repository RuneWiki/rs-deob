import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class142 extends class392 {

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "[Lmha;")
    public static class422[] field2319;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(Z)V", line = 3)
    public final void method291(boolean arg0) {
        ++field2316;
        if (~super.field5452 > -1 || ~super.field5452 < -5) {
            super.field5452 = this.method292(true);
        }
        if (arg0) {
            method1146(false);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BI)V", line = 16)
    public final void method286(byte arg0, int arg1) {
        super.field5452 = arg1;
        int var3 = 52 % ((arg0 - -80) / 38);
        ++field2321;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lw;)V", line = 28)
    public class142(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "([BIBI)Ljava/lang/String;", line = 32)
    public static final String method1144(byte[] arg0, int arg1, byte arg2, int arg3) {
        ++field2320;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = 0;
        if (arg2 != -53) {
            field2319 = null;
        }
        while (~arg1 < ~var6) {
            int var7 = 255 & arg0[arg3 + var6];
            if (~var7 != -1) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class183.field2787[var7 + -128];
                    if (~var8 == -1) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
            ++var6;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)I", line = 75)
    public final int method292(boolean arg0) {
        if (!arg0) {
            return -42;
        } else {
            ++field2318;
            return 3;
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)I", line = 88)
    public final int method1145(int arg0) {
        if (arg0 != 17539) {
            return -56;
        } else {
            ++field2315;
            return super.field5452;
        }
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(ILw;)V", line = 99)
    public class142(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(II)I", line = 102)
    public final int method290(int arg0, int arg1) {
        if (arg1 > -124) {
            field2319 = null;
        }
        ++field2314;
        return 1;
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(Z)V", line = 113)
    public static void method1146(boolean arg0) {
        field2319 = null;
        if (!arg0) {
            field2319 = null;
        }
    }
}
