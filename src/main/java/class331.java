import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class331 {

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lts;")
    public class41 field4203;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public int field4202;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[I")
    public static int[] field4205 = new int[16];

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lus;")
    public static class328 field4199 = new class328(55, 2);

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "[[I")
    public static int[][] field4206 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Lwp;")
    public static class435 field4207;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Ljaa;")
    public static final class266 method1944(byte arg0) {
        class236.field3049 = 0;
        if (arg0 == -46) {
            field4204++;
            return class373.method2273(-63);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIZLqg;)V")
    public static final void method1945(int arg0, int arg1, int arg2, boolean arg3, class290 arg4) {
        if (arg3) {
            field4199 = null;
        }
        field4201++;
        for (class389 var5 = (class389) class326.field4157.method3111(96); var5 != null; var5 = (class389) class326.field4157.method3116(-100)) {
            if (var5.field5432 == arg1 && (arg2 << 9) == var5.field5409 && arg0 << 9 == var5.field5416 && var5.field5426.field3771 == arg4.field3771) {
                if (var5.field5419 != null) {
                    class668.field9148.method664(var5.field5419);
                    var5.field5419 = null;
                }
                if (var5.field5418 != null) {
                    class668.field9148.method664(var5.field5418);
                    var5.field5418 = null;
                }
                var5.method3426((byte) -67);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public final void method1946(int arg0, int arg1) {
        field4200++;
        if (this.method222(arg0, arg1) != 3) {
            this.method227(114, arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)I")
    public abstract int method226(byte arg0);

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)I")
    public abstract int method222(int arg0, int arg1);

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)V")
    public abstract void method227(int arg0, int arg1);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1947(String arg0, byte arg1) {
        field4208++;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 != 56) {
            method1945(76, -39, 13, false, null);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4197++;
        if (arg0 != 8 && arg0 != 16) {
            class73 var7 = class495.field7002[arg1][arg6][arg2];
            if (var7 == null) {
                var7 = new class73(arg1);
            }
            if (arg0 == 1) {
                var7.field970 = (short) arg5;
                var7.field967 = (short) arg3;
            } else if (arg0 == 2) {
                var7.field968 = (short) arg5;
                var7.field972 = (short) arg3;
            }
            if (class116.field1424) {
                class408.method2417((byte) -2);
            }
        } else if (arg0 == 8) {
            int var14 = arg6 << class455.field6383;
            int var15 = class431.field6109 + var14;
            int var16 = arg2 << class455.field6383;
            int var17 = class431.field6109 + var16;
            int var18 = class716.field10106[arg1].method2381(-111, arg6, arg2);
            int var19 = class716.field10106[arg1].method2381(-112, arg6 + 1, arg2 + 1);
            class359.field5120[class206.field2635++] = new class600(arg0, arg1, var14, var15, var15, var14, var18, var19, var19 - arg3, -arg3 + var18, var16, var17, var17, var16);
        } else {
            int var8 = (arg6 << class455.field6383) + class431.field6109;
            int var9 = var8 - class431.field6109;
            int var10 = arg2 << class455.field6383;
            int var11 = var10 + class431.field6109;
            int var12 = class716.field10106[arg1].method2381(arg4 ^ 0xFFFFFB2C, arg6 + 1, arg2);
            int var13 = class716.field10106[arg1].method2381(-90, arg6, arg2 + 1);
            class359.field5120[class206.field2635++] = new class600(arg0, arg1, var8, var9, var9, var8, var12, var13, var13 - arg3, -arg3 + var12, var10, var11, var11, var10);
        }
        if (arg4 != 1188) {
            field4207 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lts;)V")
    public class331(class41 arg0) {
        this.field4203 = arg0;
        this.field4202 = this.method226((byte) 13);
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILts;)V")
    public class331(int arg0, class41 arg1) {
        this.field4203 = arg1;
        this.field4202 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public abstract void method224(int arg0);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static void method1949(boolean arg0) {
        field4205 = null;
        field4207 = null;
        field4199 = null;
        field4206 = null;
        if (arg0) {
            field4207 = null;
        }
    }
}
