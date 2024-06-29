import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class class31 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field446 = 0;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "Lgi;")
    public static class238 field450;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "[Lih;")
    public static class38[] field447;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V", line = 15)
    public static void method288(boolean arg0) {
        if (!arg0) {
            field450 = (class238) null;
        }
        field450 = null;
        field447 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)I", line = 31)
    public static final int method290(int arg0, int arg1, int arg2, int arg3) {
        field449++;
        if (arg1 == arg2) {
            return arg2;
        }
        if (arg0 != -15791) {
            method291(-69, -112, 115);
        }
        int var4 = 128 - arg3;
        int var5 = (arg1 >>> 7 & 0x1FE01FE) * arg3 + (arg2 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
        int var6 = (arg2 & 0xFF00FF) * var4 + ((arg1 & 0xFF00FF) * arg3) & 0xFF00FF00;
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Z", line = 52)
    public static final boolean method291(int arg0, int arg1, int arg2) {
        int var3 = class295.field4717[arg0][arg1][arg2];
        if (-class322.field5115 == var3) {
            return false;
        } else if (class322.field5115 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class317.method2182(var4 + 1, class137.field2487[arg0][arg1][arg2], var5 + 1) && class317.method2182(var4 + 128 - 1, class137.field2487[arg0][arg1 + 1][arg2], var5 + 1) && class317.method2182(var4 + 128 - 1, class137.field2487[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class317.method2182(var4 + 1, class137.field2487[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class295.field4717[arg0][arg1][arg2] = class322.field5115;
                return true;
            } else {
                class295.field4717[arg0][arg1][arg2] = -class322.field5115;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(CILjava/lang/StringBuffer;I)Ljava/lang/StringBuffer;", line = 79)
    public static final StringBuffer method292(char arg0, int arg1, StringBuffer arg2, int arg3) {
        int var4 = arg2.length();
        arg2.setLength(arg3);
        field448++;
        int var5 = 81 / ((33 - arg1) / 48);
        for (int var6 = var4; var6 < arg3; var6++) {
            arg2.setCharAt(var6, arg0);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)I")
    public abstract int method285(int arg0, int arg1);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)V")
    public abstract void method286(byte arg0, int arg1);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method287(int arg0, byte arg1);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Lon;")
    public abstract class80 method289(int arg0);
}
