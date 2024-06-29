import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class64 {

    @OriginalMember(owner = "client!q", name = "i", descriptor = "[I")
    public static int[] field886 = new int[100];

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field879 = 0;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[I")
    public static int[] field885 = new int[32];

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Z")
    public static boolean field890 = false;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "[I")
    public static int[] field883 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!q", name = "c", descriptor = "F")
    public static float field880;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "J")
    public static long field888;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field887;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "[Lma;")
    public static class146[] field881;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "[[B")
    public static byte[][] field889;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[[Z")
    public static boolean[][] field884;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[[[B")
    public static byte[][][] field893;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method401(int arg0) {
        field881 = null;
        field889 = null;
        if (arg0 != 0) {
            field887 = null;
        }
        field893 = null;
        field887 = null;
        field884 = null;
        field886 = null;
        field883 = null;
        field885 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIII)V")
    public static final void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class188.field3296 <= arg4 && arg1 <= class95.field1388 && arg5 >= class93.field1361 && arg2 <= class23.field291) {
            if (arg0 == 1) {
                class146.method914(arg5, (byte) 91, arg1, arg6, arg2, arg4);
            } else {
                class91.method563(arg1, arg0, arg5, (byte) -99, arg6, arg4, arg2);
            }
        } else if (arg0 == 1) {
            class211.method1461(arg5, arg4, false, arg6, arg2, arg1);
        } else {
            class153.method966(arg5, arg2, arg6, arg0, true, arg4, arg1);
        }
        field892++;
        if (arg3 != 1) {
            method403(false, null, null, true, null);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLcj;Lbk;ZLbk;)V")
    public static final void method403(boolean arg0, class184 arg1, class136 arg2, boolean arg3, class136 arg4) {
        class226.field4048 = arg4;
        field878++;
        class155.field2504 = arg3;
        class5.field41 = arg2;
        int var5 = class5.field41.method834((byte) 109) - 1;
        if (!arg0) {
            class192.field3372 = class5.field41.method831(-12858, var5) + var5 * 256;
            class237.field4210 = arg1;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lec;II)Lqj;")
    public static final class196 method404(class178 arg0, int arg1, int arg2) {
        field891++;
        if (!class152.method955(19253, client.method614(arg0), arg2) && arg0.field3086 == null) {
            return null;
        } else if (arg0.field3113 == null || arg0.field3113.length <= arg2 || arg0.field3113[arg2] == null || arg0.field3113[arg2].method1304(124).method1299(37) == 0) {
            return class236.field4195 ? class93.method572(-97, new class196[] { class258.field4517, class163.method1029(arg2, false) }) : null;
        } else if (arg1 > -84) {
            return null;
        } else {
            return arg0.field3113[arg2];
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II[Lbh;II[BIZ)V")
    public static final void method405(int arg0, int arg1, class153[] arg2, int arg3, int arg4, byte[] arg5, int arg6, boolean arg7) {
        byte var8;
        if (arg7) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg7) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg1 + var11 > 0 && arg1 + var11 < 103) {
                            arg2[var9].field2462[arg4 + var10][arg1 + var11] = class65.method409(arg2[var9].field2462[arg4 + var10][arg1 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class56 var12 = new class56(arg5);
        field882++;
        if (arg6 != 11840) {
            field880 = 0.40063205F;
        }
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class123.method754(arg3, arg4 + var14, -32, 0, arg0, var12, arg7, var13, arg1 + var15);
                }
            }
        }
    }
}
