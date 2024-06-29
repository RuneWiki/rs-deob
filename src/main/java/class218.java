import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class218 extends class213 {

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field4139 = 0;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Z")
    public static boolean field4132 = false;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field4138 = -1;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "[[I")
    public static int[][] field4135 = new int[104][104];

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "Lfa;")
    public static class52 field4143;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[I")
    public int[] field4131;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "[I")
    public int[] field4140;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "[I")
    public int[] field4141;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "[Lfd;")
    public class55[] field4137;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "[Lfd;")
    public class55[] field4144;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "[[[B")
    public byte[][][] field4134;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public static void method1413(int arg0) {
        field4135 = null;
        field4143 = null;
        if (arg0 <= 66) {
            method1414(74, 96, -89, 96, null, 21L, null, null);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIILaa;JLaa;Laa;)V")
    public static final void method1414(int arg0, int arg1, int arg2, int arg3, class2 arg4, long arg5, class2 arg6, class2 arg7) {
        class36 var9 = new class36();
        var9.field725 = arg4;
        var9.field716 = arg1 * 128 + 64;
        var9.field719 = arg2 * 128 + 64;
        var9.field711 = arg3;
        var9.field727 = arg5;
        var9.field729 = arg6;
        var9.field722 = arg7;
        int var10 = 0;
        class153 var11 = class131.field2506[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2933; var12++) {
                class9 var13 = var11.field2935[var12];
                if ((var13.field141 & 0x400000L) == 4194304L) {
                    int var14 = var13.field147.method16();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field723 = -var10;
        if (class131.field2506[arg0][arg1][arg2] == null) {
            class131.field2506[arg0][arg1][arg2] = new class153(arg0, arg1, arg2);
        }
        class131.field2506[arg0][arg1][arg2].field2936 = var9;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
    public static final void method1415(int arg0, int arg1) {
        class200 var2 = class212.field4046;
        synchronized (class212.field4046) {
            class138.field2656 = arg0;
        }
        if (arg1 != -23383) {
            field4139 = 0;
        }
        field4136++;
    }
}
