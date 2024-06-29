import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class66 extends class493 {

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1029;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "[I")
    public static int[] field1023 = new int[4];

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "Lvfa;")
    public static class622 field1028 = null;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "Lsfa;")
    public static class645 field1026;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIZ[B)Ljava/lang/String;")
    public static final String method617(int arg0, int arg1, boolean arg2, byte[] arg3) {
        field1025++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = arg0;
        int var7 = arg0 + arg1;
        while (var6 < var7) {
            int var8 = arg3[var6++] & 0xFF;
            int var9;
            if (var8 >= 128) {
                if (var8 < 192) {
                    var9 = 65533;
                } else if (var8 >= 224) {
                    if (var8 < 240) {
                        if ((var6 + 1) < var7 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128) {
                            var9 = (var8 & 0xF) << 12 | (arg3[var6++] & 0x3F) << 6 | arg3[var6++] & 0x3F;
                            if (var9 < 2048) {
                                var9 = 65533;
                            }
                        } else {
                            var9 = 65533;
                        }
                    } else if (var8 >= 248) {
                        var9 = 65533;
                    } else if (var7 > (var6 + 2) && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128 && (arg3[var6 + 2] & 0xC0) == 128) {
                        int var10 = var8 & 0x7 << 18 | (arg3[var6++] & 0x3F) << 12 | (arg3[var6++] & 0x3F) << 6 | arg3[var6++] & 0x3F;
                        if (var10 >= 65536 && var10 <= 1114111) {
                            var9 = 65533;
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var6 < var7 && (arg3[var6] & 0xC0) == 128) {
                    var9 = arg3[var6++] & 0x3F | (var8 & 0x1F) << 6;
                    if (var9 < 128) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 == 0) {
                var9 = 65533;
            } else {
                var9 = var8;
            }
            var4[var5++] = (char) var9;
        }
        if (arg2) {
            field1026 = null;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIILkb;Lff;Lvc;ILr;)V")
    public static final void method618(int arg0, int arg1, int arg2, class640 arg3, class9 arg4, class289 arg5, int arg6, class165 arg7) {
        field1027++;
        int var8 = arg4.field96 - arg0 / 2 - 5;
        int var9 = arg1 + 2;
        if (~arg5.field3907 != arg6) {
            arg7.method1042(var8, arg0 + 10, 1, var9, arg5.field3907, arg2 * arg3.method3641() + arg1 + 1 - var9);
        }
        if (arg5.field3909 != 0) {
            arg7.method1046(arg6 ^ 0xFFFFFF80, arg3.method3641() * arg2 + arg1 + 1 - var9, arg5.field3909, var9, arg0 + 10, var8);
        }
        int var10 = arg5.field3887;
        if (arg4.field87 && arg5.field3902 != -1) {
            var10 = arg5.field3902;
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            String var12 = class141.field1768[var11];
            if (var11 < (arg2 - 1)) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg3.method3642(arg7, var12, arg4.field96, arg1, var10, true);
            arg1 += arg3.method3641();
        }
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I)V")
    public class66(int arg0) {
        this.field1029 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
    public final void method619(int arg0) {
        this.field1029.method3571();
        int var2 = -57 / (-arg0 / 53);
        field1024++;
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)V")
    public static void method620(byte arg0) {
        field1023 = null;
        if (arg0 >= -22) {
            field1030 = -74;
        }
        field1026 = null;
    }
}
