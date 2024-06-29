import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class29 extends class56 {

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field548 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public static int field549 = 1;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    public static int field559 = 50;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "[I")
    public static int[] field550 = new int[field559];

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "[I")
    public static int[] field546 = new int[field559];

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field553 = new String[field559];

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "[I")
    public static int[] field556 = new int[field559];

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "[I")
    public static int[] field554 = new int[field559];

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "Z")
    public static boolean field551 = false;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "[I")
    public static int[] field560 = new int[field559];

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "[I")
    public static int[] field544 = new int[field559];

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "[I")
    public static int[] field557 = new int[field559];

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "Lpg;")
    public static class319 field561;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V", line = 5)
    public static void method235(int arg0) {
        field557 = null;
        field554 = null;
        if (arg0 != 22826) {
            field561 = (class319) null;
        }
        field546 = null;
        field556 = null;
        field550 = null;
        field553 = null;
        field560 = null;
        field561 = null;
        field544 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIII)I", line = 48)
    public static final int method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg2;
            arg2 = var8;
        }
        field552++;
        if (arg3 == var7) {
            return arg6;
        } else if (var7 == 1) {
            return 7 + 1 - arg0 - arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg6;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V", line = 78)
    public static final void method237(int arg0) {
        field558++;
        if (!class249.field3893 || class168.field2702) {
            return;
        }
        if (arg0 != -21650) {
            field546 = (int[]) null;
        }
        class47[][][] var1 = class326.field4975;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class47[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class47 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field967 != null && var6.field967.field4443 instanceof class184) {
                            class184 var7 = (class184) var6.field967.field4443;
                            if ((Long.MIN_VALUE & var6.field967.field4446) == 0L) {
                                var7.method1159(false, true, true, true, false, true, true);
                            } else {
                                var7.method1159(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field975 != null) {
                            if (var6.field975.field224 instanceof class184) {
                                class184 var8 = (class184) var6.field975.field224;
                                if ((var6.field975.field228 & Long.MIN_VALUE) == 0L) {
                                    var8.method1159(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1159(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field975.field231 instanceof class184) {
                                class184 var9 = (class184) var6.field975.field231;
                                if ((Long.MIN_VALUE & var6.field975.field228) == 0L) {
                                    var9.method1159(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1159(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field965 != null) {
                            if (var6.field965.field796 instanceof class184) {
                                class184 var10 = (class184) var6.field965.field796;
                                if ((var6.field965.field795 & Long.MIN_VALUE) == 0L) {
                                    var10.method1159(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1159(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field965.field788 instanceof class184) {
                                class184 var11 = (class184) var6.field965.field788;
                                if ((Long.MIN_VALUE & var6.field965.field795) == 0L) {
                                    var11.method1159(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1159(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field969; var12++) {
                            if (var6.field974[var12].field4182 instanceof class184) {
                                class184 var13 = (class184) var6.field974[var12].field4182;
                                if ((var6.field974[var12].field4191 & Long.MIN_VALUE) == 0L) {
                                    var13.method1159(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1159(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class168.field2702 = true;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V", line = 228)
    public static final void method238(int arg0, int arg1) {
        field547++;
        for (class35 var2 = class222.field3516.method306(arg0 ^ arg0); var2 != null; var2 = class222.field3516.method300(arg0 + 1)) {
            if ((var2.field702 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method278((byte) -105);
            }
        }
    }
}
