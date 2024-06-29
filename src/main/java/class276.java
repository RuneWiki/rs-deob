import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class276 extends class24 {

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    private final int field4902;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    private final int field4888;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    private final int field4892;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    private final int field4897;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "[[[Ldg;")
    public static class317[][][] field4890 = new class317[4][104][104];

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static volatile int field4894 = 0;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field4889 = -1;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field4896 = 0;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field4901 = -1;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Lok;")
    public static class149 field4895;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I", line = 4)
    public static final int method1949(int arg0, int arg1) {
        field4898++;
        if (arg1 != 170296428) {
            field4895 = (class149) null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)V", line = 22)
    public final void method217(int arg0, int arg1, int arg2) {
        field4903++;
        int var4 = this.field4902 * arg2 >> 12;
        int var5 = this.field4897 * arg2 >> 12;
        if (arg1 == 13217) {
            int var6 = this.field4892 * arg0 >> 12;
            int var7 = this.field4888 * arg0 >> 12;
            class16.method142(arg1 - 2086, var5, var7, this.field615, this.field614, var4, var6);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 42)
    public static final void method1950(int arg0) {
        class282.field5034.method1334((byte) -25);
        field4891++;
        if (arg0 != 104) {
            method1952((byte) 30);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V", line = 59)
    public final void method216(int arg0, int arg1, int arg2) {
        field4893++;
        int var4 = this.field4902 * arg2 >> 12;
        int var5 = -5 % ((-arg0 - 72) / 34);
        int var6 = this.field4897 * arg2 >> 12;
        int var7 = this.field4892 * arg1 >> 12;
        int var8 = this.field4888 * arg1 >> 12;
        class278.method1963(-20408, this.field609, var8, var7, var4, var6);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZI)V", line = 77)
    public final void method214(int arg0, boolean arg1, int arg2) {
        field4900++;
        int var4 = this.field4902 * arg0 >> 12;
        if (!arg1) {
            field4890 = (class317[][][]) ((class317[][][]) null);
        }
        int var5 = this.field4892 * arg2 >> 12;
        int var6 = this.field4897 * arg0 >> 12;
        int var7 = this.field4888 * arg2 >> 12;
        class271.method1936(this.field614, var4, this.field609, var5, var6, var7, 500, this.field615);
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIII)V", line = 108)
    public class276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4902 = arg0;
        this.field4888 = arg3;
        this.field4892 = arg1;
        this.field4897 = arg2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lsf;IIIII)V", line = 131)
    public static final void method1951(class108 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class69.field1363 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class207.field3668) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class54.field1193 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class191 var14 = class24.field619[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class165.field2970[var11][var12 + 1][var13] + class165.field2970[var11][var12][var13] + class165.field2970[var11][var12][var13 + 1] + class165.field2970[var11][var12 + 1][var13 + 1]) / 4 - (class165.field2970[arg1][arg2 + 1][arg3] + class165.field2970[arg1][arg2][arg3] + class165.field2970[arg1][arg2][arg3 + 1] + class165.field2970[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class17 var16 = var14.field3439;
                                    if (var16 != null) {
                                        if (var16.field522.method895()) {
                                            arg0.method894(var16.field522, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field525 != null && var16.field525.method895()) {
                                            arg0.method894(var16.field525, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3451; var17++) {
                                        class18 var18 = var14.field3455[var17];
                                        if (var18 != null && var18.field563.method895() && (var18.field560 == var12 || var7 == var12) && (var18.field564 == var13 || var9 == var13)) {
                                            int var19 = var18.field562 + 1 - var18.field560;
                                            int var20 = var18.field556 + 1 - var18.field564;
                                            arg0.method894(var18.field563, (var18.field560 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field564 - arg3) * 128 + (var20 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 237)
    public static final void method1952(byte arg0) {
        field4899++;
        class111.field2046.method1334((byte) -25);
        class265.field4774.method1334((byte) -25);
        if (arg0 != 77) {
            field4894 = -105;
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 256)
    public static void method1953(int arg0) {
        field4895 = null;
        if (arg0 != 128) {
            method1950(59);
        }
        field4890 = (class317[][][]) null;
    }
}
