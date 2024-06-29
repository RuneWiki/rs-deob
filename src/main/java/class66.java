import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class66 extends class558 implements class90 {

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "[Lnm;")
    public static class340[] field755;

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lqba;Z)V", line = 3)
    public class66(class540 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 6)
    public static final String method405(int arg0, int arg1, byte[] arg2, int arg3) {
        field754++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        if (arg3 != 14569) {
            method407(-120);
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class42.field489[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 47)
    public static final void method406(byte arg0) {
        class203.field3031 = class519.field7716.field2253 + class519.field7716.field2256 + 2;
        class580.field8545 = class511.field7585.field2256 + class511.field7585.field2253 + 2;
        class59.field709 = new String[500];
        field760++;
        int var1 = 12 % ((arg0 - 50) / 53);
        for (int var2 = 0; var2 < class59.field709.length; var2++) {
            class59.field709[var2] = "";
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V", line = 67)
    public static void method407(int arg0) {
        field755 = null;
        int var1 = -79 % (-arg0 / 61);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z", line = 78)
    public final boolean method408(Source arg0, int arg1, int arg2, int arg3) {
        field761++;
        if (arg2 == 6831) {
            super.method3270(arg1, arg0, (byte) -53);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V", line = 96)
    public final void method409(boolean arg0) {
        super.method409(arg0);
        field759++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 105)
    public final Buffer method410(boolean arg0, byte arg1) {
        field756++;
        return arg1 == -56 ? super.method410(arg0, (byte) -56) : null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)I", line = 118)
    public final int method404(int arg0) {
        if (arg0 == -4469) {
            field762++;
            return super.method404(-4469);
        } else {
            return -128;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Z", line = 129)
    public final boolean method411(int arg0) {
        field758++;
        int var2 = 51 % ((arg0 - 39) / 62);
        return this.method411(127);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIB)Z", line = 146)
    public final boolean method412(int arg0, int arg1, byte arg2) {
        super.method464(true, arg0);
        if (arg2 != -61) {
            field755 = null;
        }
        field757++;
        return true;
    }
}
