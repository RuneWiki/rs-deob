import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class729 {

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Lae;")
    private class283 field10072;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public int field10071;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field10073 = 1;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field10068;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field10070;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method4050(int arg0, int arg1, int arg2) {
        field10068++;
        if (arg0 < 122) {
            method4052((byte) 66, -66, 49, null);
        }
        return (arg2 & 0x40000) != 0 | class165.method1043((byte) -127, arg2, arg1) || class403.method2473(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 22)
    public static final void method4051(byte arg0) {
        if (arg0 != -104) {
            method4050(112, -40, 112);
        }
        field10069++;
        if (class7.field41 != null) {
            class7.field41.method2821((byte) 71);
            class18.field123 = null;
            class7.field41 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII[B)Ljava/lang/String;", line = 43)
    public static final String method4052(byte arg0, int arg1, int arg2, byte[] arg3) {
        field10070++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        if (arg0 <= 3) {
            field10073 = 69;
        }
        int var6 = arg1;
        int var7 = arg1 + arg2;
        while (var7 > var6) {
            int var8 = arg3[var6++] & 0xFF;
            int var9;
            if (var8 < 128) {
                if (var8 == 0) {
                    var9 = 65533;
                } else {
                    var9 = var8;
                }
            } else if (var8 < 192) {
                var9 = 65533;
            } else if (var8 >= 224) {
                if (var8 < 240) {
                    if (var7 > (var6 + 1) && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128) {
                        var9 = (var8 & 0xF) << 12 | (arg3[var6++] & 0x3F) << 6 | arg3[var6++] & 0x3F;
                        if (var9 < 2048) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var8 >= 248) {
                    var9 = 65533;
                } else if ((var6 + 2) < var7 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128 && (arg3[var6 + 2] & 0xC0) == 128) {
                    int var10 = var8 & 0x7 << 18 | (arg3[var6++] & 0x3F) << 12 | arg3[var6++] & 0x3F << 6 | arg3[var6++] & 0x3F;
                    if (var10 >= 65536 && var10 <= 1114111) {
                        var9 = 65533;
                    } else {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var7 > var6 && (arg3[var6] & 0xC0) == 128) {
                var9 = arg3[var6++] & 0x3F | var8 & 0x1F << 6;
                if (var9 < 128) {
                    var9 = 65533;
                }
            } else {
                var9 = 65533;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Ljk;ILae;)V", line = 139)
    public class729(class788 arg0, int arg1, class283 arg2) {
        new class39(64);
        this.field10072 = arg2;
        this.field10071 = this.field10072.method1867(15, (byte) 49);
    }
}
