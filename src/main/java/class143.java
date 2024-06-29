import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class143 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[I")
    public static int[] field2478 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[I")
    public static int[] field2484 = new int[14];

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2480 = 127;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[S")
    public static short[] field2486 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lgl;")
    public class211 field2483;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method1037(byte arg0) {
        field2478 = null;
        field2486 = null;
        if (arg0 == -6) {
            field2484 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIZI)V")
    public static final void method1038(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            return;
        }
        if (arg0 <= arg2) {
            class58.method337(arg0, class76.field1406[arg4], arg1, arg2, false);
        } else {
            class58.method337(arg2, class76.field1406[arg4], arg1, arg0, false);
        }
        field2479++;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public static final void method1039(byte arg0) {
        class131.method960((byte) -28, false);
        field2482++;
        System.gc();
        class19.method88(25, false);
        if (arg0 > -28) {
            field2481 = -59;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2477++;
        int var8 = arg4 - arg5;
        int var9 = arg7 + arg5;
        for (int var10 = arg7; var10 < var9; var10++) {
            class58.method337(arg6, class76.field1406[var10], arg1, arg3, false);
        }
        for (int var11 = arg4; var11 > var8; var11--) {
            class58.method337(arg6, class76.field1406[var11], arg1, arg3, false);
        }
        int var12 = arg5 + arg6;
        int var13 = arg3 - arg5;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class76.field1406[var14];
            class58.method337(arg6, var15, arg1, var12, false);
            class58.method337(var12, var15, arg2, var13, false);
            class58.method337(var13, var15, arg1, arg3, false);
        }
        if (arg0 < 74) {
            method1041(-62, -66, -36, 6, 113, (byte) 106, (class102) null);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIBLvf;)V")
    public static final void method1041(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class102 arg6) {
        field2485++;
        long var7 = 0L;
        if (arg0 == 0) {
            var7 = class90.method625(arg2, arg4, arg1);
        } else if (arg0 == 1) {
            var7 = class131.method957(arg2, arg4, arg1);
        } else if (arg0 == 2) {
            var7 = class180.method1324(arg2, arg4, arg1);
        } else if (arg0 == 3) {
            var7 = class269.method1795(arg2, arg4, arg1);
        }
        boolean var9 = true;
        if (arg5 != -42) {
            method1039((byte) 123);
        }
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        int var12 = ((int) var7 & 0x3BA08E) >> 20;
        class240 var13 = class34.method197(-124, var10);
        boolean var14 = false;
        int var15 = (int) var7 >> 14 & 0x1F;
        if (var13.method1634(arg5 ^ 0x51)) {
            class211.method1492(arg4, arg1, var13, arg2, (byte) -128);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                class266.method1781(arg2, arg4, arg1);
                return;
            }
            if (arg0 != 2) {
                if (arg0 == 3) {
                    class209.method1473(arg2, arg4, arg1);
                    if (var13.field4274 == 1) {
                        arg6.method739((byte) 119, arg4, arg1);
                        return;
                    }
                }
                return;
            }
            class108.method778(arg2, arg4, arg1);
            if (var13.field4274 != 0 && var13.field4288 + arg4 < 104 && (arg1 + var13.field4288) < 104 && (var13.field4285 + arg4) < 104 && (var13.field4285 + arg1) < 104) {
                arg6.method735(arg5 + 47, var12, arg1, var13.field4285, var13.field4288, arg4, var13.field4329);
                return;
            }
            return;
        }
        class111.method791(arg2, arg4, arg1);
        if (var13.field4274 != 0) {
            arg6.method740(arg1, arg4, var15, 71, var13.field4329, var12);
            return;
        }
    }
}
