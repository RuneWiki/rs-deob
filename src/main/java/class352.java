import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class352 extends class213 {

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "Z")
    public boolean field5492 = false;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public int field5493 = -1;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "Z")
    public boolean field5498 = false;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "Z")
    public static boolean field5491 = true;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field5502 = 0;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public int field5496;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public int field5497;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public int field5501;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public int field5503;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public int field5504;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "[[[B")
    public static byte[][][] field5500;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V", line = 20)
    public static void method2449(int arg0) {
        field5500 = (byte[][][]) null;
        if (arg0 != -28811) {
            field5491 = false;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIZIIIIBII)V", line = 36)
    public static final void method2450(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        if (class359.field5616.method1699(-1) == 2) {
            class222.method1613(arg10, arg4, arg6, arg7, arg0, arg3, arg5, -1, arg1, arg2, arg9);
        } else if (class359.field5616.method1699(-1) > 2) {
            class321.method2223(arg7, arg10, arg0, arg4, arg6, 26109, arg9, arg5, arg2, class359.field5616.method1699(-1), arg1, arg3);
        } else {
            class171.method1263(arg3, arg6, arg10, arg9, arg1, arg5, arg7, arg0, arg2, 82, arg4);
        }
        if (arg8 < -87) {
            field5499++;
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V", line = 72)
    public static final void method2451(int arg0) {
        field5495++;
        int[] var1 = new int[class26.field296];
        int var2 = 0;
        for (int var3 = 0; var3 < class26.field296; var3++) {
            class362 var4 = class172.method1265(var3, (byte) -122);
            if (var4.field5692 >= 0 || var4.field5701 >= 0) {
                var1[var2++] = var3;
            }
        }
        class312.field4587 = new int[var2];
        if (arg0 > -117) {
            method2452((byte) -58, 109, -113, 39);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            class312.field4587[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIII)I", line = 108)
    public static final int method2452(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -123) {
            field5502 = -28;
        }
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        field5490++;
        return (arg3 >> 1) + (arg1 >> 2 << 10) + (arg2 >> 5 << 7);
    }
}
