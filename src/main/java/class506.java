import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class506 extends class431 {

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
    public int field7396;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
    public int field7393;

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
    public int field7392;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "Z")
    public boolean field7391;

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
    public static int field7389 = -1;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "Lak;")
    public static class234 field7394 = new class234("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "[[I")
    public static int[][] field7397 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "[I")
    public static int[] field7400 = new int[13];

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!dw", name = "v", descriptor = "[Ljr;")
    public static class74[] field7399;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V")
    public static void method3015(byte arg0) {
        field7400 = null;
        field7397 = null;
        field7394 = null;
        if (arg0 == -19) {
            field7399 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Z")
    public static final boolean method3016(int arg0, int arg1) {
        if (arg1 != -9) {
            method3016(-125, 2);
        }
        field7395++;
        return arg0 == 6 || arg0 == 7 || arg0 == 8;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZIII)I")
    public static final int method3017(boolean arg0, int arg1, int arg2, int arg3) {
        field7388++;
        class240 var4 = class516.method3061((byte) -30, arg0, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            if (arg2 != -11948) {
                field7394 = null;
            }
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field3829.length; var6++) {
                if (var4.field3835[var6] == arg1) {
                    var5 += var4.field3829[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIIIZ)V")
    public class506(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field7396 = arg0;
        this.field7393 = arg4;
        this.field7392 = arg1;
        this.field7390 = arg3;
        this.field7391 = arg5;
        this.field7398 = arg2;
    }
}
