import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class54 {

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public int field796 = -1;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field788 = 0;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field790 = -1;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "S")
    public static short field798 = 205;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field795 = 0;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lmn;")
    public class110 field792;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lp;")
    public static class25 field791;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lnf;")
    public static class61 field787;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "[I")
    public int[] field794;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field797;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lh;IIIII)V", line = 9)
    public static final void method444(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class252.field3748 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class18.field295) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class146.field2109 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class167 var14 = class302.field4502[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class132.field1930[var11][var12 + 1][var13] + class132.field1930[var11][var12][var13] + class132.field1930[var11][var12][var13 + 1] + class132.field1930[var11][var12 + 1][var13 + 1]) / 4 - (class132.field1930[arg1][arg2 + 1][arg3] + class132.field1930[arg1][arg2][arg3] + class132.field1930[arg1][arg2][arg3 + 1] + class132.field1930[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class11 var16 = var14.field2387;
                                    if (var16 != null) {
                                        if (var16.field165.method390()) {
                                            arg0.method386(var16.field165, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field174 != null && var16.field174.method390()) {
                                            arg0.method386(var16.field174, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2407; var17++) {
                                        class180 var18 = var14.field2406[var17];
                                        if (var18 != null && var18.field2591.method390() && (var18.field2590 == var12 || var7 == var12) && (var18.field2580 == var13 || var9 == var13)) {
                                            int var19 = var18.field2581 + 1 - var18.field2590;
                                            int var20 = var18.field2601 + 1 - var18.field2580;
                                            arg0.method386(var18.field2591, (var18.field2590 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2580 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BJ)V", line = 105)
    public static final void method445(byte arg0, long arg1) {
        class107.field1533.field2776 = 0;
        class107.field1533.method1355((byte) -127, 21);
        class107.field1533.method1327(arg1, (byte) 7);
        field795 = 0;
        field793++;
        if (arg0 < -51) {
            class9.field156 = 1;
            class121.field1710 = -3;
            class108.field1566 = 0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 127)
    public static final void method446(int arg0) {
        field799++;
        class40.method289();
        for (int var1 = 0; var1 < 4; var1++) {
            class92.field1269[var1].method744(false);
        }
        if (arg0 != 1) {
            field789 = -77;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 151)
    public static void method447(byte arg0) {
        field791 = null;
        if (arg0 != -17) {
            field795 = -66;
        }
        field787 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;Lsb;I)I", line = 177)
    public static final int method448(String arg0, class190 arg1, int arg2) {
        int var3 = arg1.field2776;
        field800++;
        int var4 = -58 % ((arg2 + 6) / 40);
        byte[] var5 = class211.method1530((byte) -108, arg0);
        arg1.method1373(71, var5.length);
        arg1.field2776 += class58.field853.method767(var5, 0, 0, arg1.field2776, arg1.field2718, var5.length);
        return arg1.field2776 - var3;
    }
}
