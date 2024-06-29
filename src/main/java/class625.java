import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class625 extends class416 {

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8749;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "[Lcba;")
    public static class551[] field8747 = new class551[8];

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 3)
    public final void method3535(byte arg0) {
        field8746++;
        if (arg0 != 41) {
            method3537(41, -90, (byte) 42, null);
        }
        this.field8749.method3780();
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 18)
    public static void method3536(int arg0) {
        if (arg0 == -129) {
            field8747 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIB[B)Ljava/lang/String;", line = 31)
    public static final String method3537(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 > -35) {
            field8745 = 112;
        }
        field8748++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = arg0;
        int var7 = arg0 + arg1;
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
            } else if (var8 < 224) {
                if (var6 < var7 && (arg3[var6] & 0xC0) == 128) {
                    var9 = arg3[var6++] & 0x3F | var8 & 0x1F << 6;
                    if (var9 < 128) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 < 240) {
                if (var6 + 1 < var7 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128) {
                    var9 = (arg3[var6++] & 0x3F) << 6 | (var8 & 0xF) << 12 | arg3[var6++] & 0x3F;
                    if (var9 < 2048) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 >= 248) {
                var9 = 65533;
            } else if (var6 + 2 < var7 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128 && (arg3[var6 + 2] & 0xC0) == 128) {
                int var10 = var8 & 0x7 << 18 | (arg3[var6++] & 0x3F) << 12 | (arg3[var6++] & 0x3F) << 6 | arg3[var6++] & 0x3F;
                if (var10 >= 65536 && var10 <= 1114111) {
                    var9 = 65533;
                } else {
                    var9 = 65533;
                }
            } else {
                var9 = 65533;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V", line = 124)
    public class625(int arg0) {
        this.field8749 = new NativeHeap(arg0);
    }
}
