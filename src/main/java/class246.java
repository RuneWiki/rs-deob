import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class246 extends class147 {

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "Lah;")
    public static class22 field4381 = new class22(50);

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "Lqj;")
    public static class196 field4387 = class80.method502("(R", -48);

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "Lec;")
    public static class178 field4388 = null;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field4383 = 0;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "[I")
    public static int[] field4385 = new int[500];

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    private int field4380;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "Lqj;")
    public class196 field4384;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V")
    public static final void method1674(byte arg0) {
        field4376++;
        if (arg0 == -43) {
            class198.field3515.method135(arg0 - 61);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)I")
    public static int method1675(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field4381 = null;
        if (arg0 == -32587) {
            field4385 = null;
            field4387 = null;
            field4388 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILp;B)V")
    private final void method1677(int arg0, class56 arg1, byte arg2) {
        field4382++;
        if (arg0 == 1) {
            this.field4380 = arg1.method367(1);
        } else if (arg0 == 2) {
            this.field4375 = arg1.method311(arg2 ^ 0xFFFFFFB5);
        } else if (arg0 == 5) {
            this.field4384 = arg1.method326(true);
        }
        if (arg2 != -75) {
            method1679((byte) 7);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Z")
    public static final boolean method1678(int arg0, int arg1, int arg2) {
        int var3 = class51.field639[arg0][arg1][arg2];
        if (-class102.field1480 == var3) {
            return false;
        } else if (class102.field1480 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class25.method144(var4 + 1, class42.field480[arg0][arg1][arg2], var5 + 1) && class25.method144(var4 + 128 - 1, class42.field480[arg0][arg1 + 1][arg2], var5 + 1) && class25.method144(var4 + 128 - 1, class42.field480[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class25.method144(var4 + 1, class42.field480[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class51.field639[arg0][arg1][arg2] = class102.field1480;
                return true;
            } else {
                class51.field639[arg0][arg1][arg2] = -class102.field1480;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V")
    public static final void method1679(byte arg0) {
        class229.field4077.method1167(false);
        field4377++;
        if (arg0 != 112) {
            method1676(-119);
        }
        int var1 = class229.field4077.method1170(1, (byte) 92);
        if (var1 == 0) {
            return;
        }
        int var2 = class229.field4077.method1170(2, (byte) -87);
        if (var2 == 0) {
            class104.field1507[class148.field2336++] = 2047;
        } else if (var2 == 1) {
            int var3 = class229.field4077.method1170(3, (byte) 110);
            class102.field1477.method852(var3, false, 9);
            int var4 = class229.field4077.method1170(1, (byte) 98);
            if (var4 == 1) {
                class104.field1507[class148.field2336++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class229.field4077.method1170(3, (byte) 123);
            class102.field1477.method852(var5, true, 9);
            int var6 = class229.field4077.method1170(3, (byte) -93);
            class102.field1477.method852(var6, true, 9);
            int var7 = class229.field4077.method1170(1, (byte) -69);
            if (var7 == 1) {
                class104.field1507[class148.field2336++] = 2047;
            }
        } else if (var2 == 3) {
            class27.field335 = class229.field4077.method1170(2, (byte) 101);
            int var8 = class229.field4077.method1170(7, (byte) 102);
            int var9 = class229.field4077.method1170(1, (byte) 125);
            int var10 = class229.field4077.method1170(1, (byte) -58);
            if (var10 == 1) {
                class104.field1507[class148.field2336++] = 2047;
            }
            int var11 = class229.field4077.method1170(7, (byte) 95);
            class102.field1477.method859(var9 == 1, (byte) 115, var8, var11);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILp;)V")
    public final void method1680(int arg0, class56 arg1) {
        field4379++;
        while (true) {
            int var3 = arg1.method367(arg0 + 2);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    field4387 = null;
                    return;
                }
            }
            this.method1677(var3, arg1, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public static final void method1681(int arg0) {
        field4374++;
        if (arg0 == 11059) {
            class217.field3900.method135(arg0 - 10988);
        }
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)Z")
    public final boolean method1682(int arg0) {
        field4378++;
        if (arg0 <= 41) {
            method1681(-58);
        }
        return this.field4380 == 115;
    }
}
