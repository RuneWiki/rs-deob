import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class260 extends class297 {

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Lnb;")
    public static class117 field4430 = new class117();

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Leb;")
    public static class253 field4434 = null;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field4437 = 0;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field4436 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field4433 = 0;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "[I")
    public static int[] field4442 = new int[5];

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "Lma;")
    public static class5 field4444 = class12.method119(")4a=", (byte) 77);

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "F")
    public static float field4441;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public int field4432;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public int field4440;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "Lrj;")
    public static class237 field4438;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "[Lrj;")
    public static class237[] field4439;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "[[S")
    public static short[][] field4435;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Lma;", line = 7)
    public static final class5 method1799(int arg0, int arg1) {
        if (arg0 != 0) {
            return (class5) null;
        }
        field4424++;
        if (arg1 < 100000) {
            return class288.method1940((byte) 126, new class5[] { class168.field2561, class175.method1148(arg1, false), class146.field2115 });
        } else if (arg1 < 10000000) {
            return class288.method1940((byte) 114, new class5[] { class264.field4507, class175.method1148(arg1 / 1000, false), class189.field2960, class146.field2115 });
        } else {
            return class288.method1940((byte) 57, new class5[] { class10.field155, class175.method1148(arg1 / 1000000, false), class297.field5001, class146.field2115 });
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V", line = 26)
    public static final void method1800(int arg0) {
        if (class265.field4536 != null) {
            class155 var1 = class265.field4536;
            synchronized (class265.field4536) {
                class265.field4536 = null;
            }
        }
        int var3 = 19 / ((arg0 + 8) / 48);
        field4429++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIIIZI)Lrj;", line = 44)
    public static final class237 method1801(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4425++;
        int var6 = (arg2 << 17) + (arg4 ? 65536 : 0) + (arg3 - -(arg5 << 19));
        if (!arg0) {
            field4437 = 2;
        }
        long var8 = (long) arg1 * 3147483667L + ((long) var6 * 3849834839L);
        class237 var10 = (class237) class37.field584.method521(var8, (byte) 80);
        if (var10 != null) {
            return var10;
        }
        class229.field3800 = false;
        class237 var11 = class67.method485(arg1, arg4, arg5, false, arg3, arg2, false, 0);
        if (var11 != null && !class229.field3800) {
            class37.field584.method519((byte) -95, var11, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Lsb;", line = 75)
    public static final class114 method1802(int arg0, int arg1) {
        field4428++;
        class114 var2 = (class114) class131.field1963.method521((long) arg0, (byte) 80);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class41.field627.method1342(arg1 + 32282, 1, arg0);
        class114 var4 = new class114();
        if (arg1 != -32243) {
            field4433 = 5;
        }
        if (var3 != null) {
            var4.method752(arg1 + 16798, new class221(var3), arg0);
        }
        class131.field1963.method519((byte) -95, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V", line = 102)
    public static void method1803(int arg0) {
        field4435 = (short[][]) null;
        field4438 = null;
        field4434 = null;
        if (arg0 == 5) {
            field4439 = null;
            field4430 = null;
            field4444 = null;
            field4442 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V", line = 119)
    public static final void method1804(int arg0) {
        if (arg0 > -39) {
            method1800(-49);
        }
        class37.field584.method523(125);
        field4443++;
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V", line = 131)
    public static final void method1805(int arg0) {
        if (arg0 != -10000001) {
            method1799(-71, -18);
        }
        class59.field926.method523(arg0 + 10000123);
        field4431++;
    }
}
