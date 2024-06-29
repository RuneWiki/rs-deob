import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class119 extends class206 {

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "Lmh;")
    public static class62 field1995 = class201.method1405(true, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Lmh;")
    public static class62 field1993 = class201.method1405(true, "");

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Lmh;")
    public static class62 field1988 = class201.method1405(true, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lmh;")
    private static class62 field1987 = class201.method1405(true, "cyan:");

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Lmh;")
    public static class62 field1989 = field1987;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Lmh;")
    public static class62 field1994 = field1987;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "Lcc;")
    public static class205 field1999 = null;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "[Lwj;")
    public static class135[] field1990;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lwc;IIIIII)V", line = 4)
    public static final void method924(class218 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1997++;
        long var7 = 0L;
        if (arg1 == 0) {
            var7 = class150.method1080(arg3, arg5, arg4);
        } else if (arg1 == 1) {
            var7 = class274.method1875(arg3, arg5, arg4);
        } else if (arg1 == 2) {
            var7 = class240.method1682(arg3, arg5, arg4);
        } else if (arg1 == 3) {
            var7 = class44.method290(arg3, arg5, arg4);
        }
        if (arg2 != 4) {
            method924((class218) null, -95, 36, 93, -120, 11, -21);
        }
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        boolean var12 = false;
        int var13 = ((int) var7 & 0x3E2399) >> 20;
        int var14 = ((int) var7 & 0x7EFCC) >> 14;
        class216 var15 = class252.method1755(var10, (byte) -63);
        if (var15.method1539(98)) {
            class32.method209(arg5, true, var15, arg4, arg3);
        }
        if (var7 == 0L) {
            return;
        }
        class123 var16 = null;
        class123 var17 = null;
        if (arg1 == 0) {
            class54 var21 = class152.method1091(arg3, arg5, arg4);
            if (var21 != null) {
                var17 = var21.field788;
                var16 = var21.field786;
            }
            if (var15.field3706 != 0) {
                arg0.method1558(var15.field3695, var13, arg4, arg5, -3, var14);
            }
        } else if (arg1 == 1) {
            class268 var18 = class297.method2010(arg3, arg5, arg4);
            if (var18 != null) {
                var16 = var18.field4559;
                var17 = var18.field4552;
            }
        } else if (arg1 == 2) {
            class164 var20 = class74.method563(arg3, arg5, arg4);
            if (var20 != null) {
                var16 = var20.field2672;
            }
            if (var15.field3706 != 0 && var15.field3669 + arg5 < 104 && (var15.field3669 + arg4) < 104 && (var15.field3676 + arg5) < 104 && (var15.field3676 + arg4) < 104) {
                arg0.method1552((byte) 17, var15.field3695, arg5, var13, var15.field3676, arg4, var15.field3669);
            }
        } else if (arg1 == 3) {
            class32 var19 = class192.method1344(arg3, arg5, arg4);
            if (var19 != null) {
                var16 = var19.field443;
            }
            if (var15.field3706 == 1) {
                arg0.method1545(arg4, -1337, arg5);
            }
        }
        if (!var15.field3716) {
            return;
        }
        if (var14 == 2) {
            if (var16 instanceof class265) {
                ((class265) var16).method1826(arg2 - 5);
            } else {
                class15.method59(0, var13 + 4, arg6, var15, arg4, arg5, 0, var14, -29827);
            }
            if (var17 instanceof class265) {
                ((class265) var17).method1826(arg2 - 5);
            } else {
                class15.method59(0, var13 + 1 & 0x3, arg6, var15, arg4, arg5, 0, var14, arg2 ^ 0xFFFF8B79);
            }
        } else if (var14 == 5) {
            if ((var16 instanceof class265)) {
                ((class265) var16).method1826(arg2 ^ 0xFFFFFFFB);
            } else {
                class15.method59(class87.field1395[var13] * 8, var13, arg6, var15, arg4, arg5, class118.field1966[var13] * 8, 4, -29827);
            }
        } else if (var14 == 6) {
            if (var16 instanceof class265) {
                ((class265) var16).method1826(arg2 - 5);
            } else {
                class15.method59(class192.field3237[var13] * 8, var13 + 4, arg6, var15, arg4, arg5, class262.field4398[var13] * 8, 4, -29827);
            }
        } else if (var14 == 7) {
            if ((var16 instanceof class265)) {
                ((class265) var16).method1826(-1);
            } else {
                class15.method59(0, (var13 + 2 & 0x3) + 4, arg6, var15, arg4, arg5, 0, 4, -29827);
            }
        } else if (var14 == 8) {
            if ((var16 instanceof class265)) {
                ((class265) var16).method1826(arg2 ^ 0xFFFFFFFB);
            } else {
                class15.method59(class192.field3237[var13] * 8, var13 + 4, arg6, var15, arg4, arg5, class262.field4398[var13] * 8, 4, -29827);
            }
            if ((var17 instanceof class265)) {
                ((class265) var17).method1826(-1);
            } else {
                class15.method59(class192.field3237[var13] * 8, (var13 + 2 & 0x3) + 4, arg6, var15, arg4, arg5, class262.field4398[var13] * 8, 4, -29827);
            }
        } else if (var14 == 11) {
            if (var16 instanceof class265) {
                ((class265) var16).method1826(arg2 ^ 0xFFFFFFFB);
            } else {
                class15.method59(0, var13 + 4, arg6, var15, arg4, arg5, 0, 10, -29827);
            }
        } else if (var16 instanceof class265) {
            ((class265) var16).method1826(-1);
        } else {
            class15.method59(0, var13, arg6, var15, arg4, arg5, 0, var14, -29827);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 203)
    public static void method925(int arg0) {
        int var1 = -45 % ((arg0 - 43) / 46);
        field1990 = null;
        field1995 = null;
        field1988 = null;
        field1987 = null;
        field1993 = null;
        field1989 = null;
        field1994 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLhi;)V", line = 256)
    public static final void method926(byte arg0, class26 arg1) {
        if (arg0 != -38) {
            field1988 = (class62) null;
        }
        field1991++;
        class42.field647 = arg1;
        class297.field5073 = class42.field647.method159(4, true);
    }
}
