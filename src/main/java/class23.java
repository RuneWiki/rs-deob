import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class class23 {

    @OriginalMember(owner = "cb", name = "d", descriptor = "Leh;")
    private class49 field510 = new class49(256);

    @OriginalMember(owner = "cb", name = "s", descriptor = "Leh;")
    private class49 field525 = new class49(256);

    @OriginalMember(owner = "cb", name = "i", descriptor = "Lbg;")
    private class18 field515;

    @OriginalMember(owner = "cb", name = "k", descriptor = "Lbg;")
    private class18 field517;

    @OriginalMember(owner = "cb", name = "b", descriptor = "Llf;")
    public static class109 field508 = class35.method275("(U", 2);

    @OriginalMember(owner = "cb", name = "j", descriptor = "Llf;")
    public static class109 field516 = class35.method275("headicons_pk", 2);

    @OriginalMember(owner = "cb", name = "h", descriptor = "Llf;")
    private static class109 field514 = class35.method275("Loading textures )2 ", 2);

    @OriginalMember(owner = "cb", name = "n", descriptor = "Llf;")
    private static class109 field520 = class35.method275("as it was used to break our rules)3", 2);

    @OriginalMember(owner = "cb", name = "e", descriptor = "Llf;")
    private static class109 field511 = class35.method275("Error connecting to server)3", 2);

    @OriginalMember(owner = "cb", name = "r", descriptor = "Llf;")
    public static class109 field524 = class35.method275("hel", 2);

    @OriginalMember(owner = "cb", name = "o", descriptor = "Llf;")
    public static class109 field521 = field520;

    @OriginalMember(owner = "cb", name = "c", descriptor = "Llf;")
    public static class109 field509 = field511;

    @OriginalMember(owner = "cb", name = "x", descriptor = "Llf;")
    public static class109 field530 = field514;

    @OriginalMember(owner = "cb", name = "u", descriptor = "Llf;")
    private static class109 field527 = class35.method275("Loading config )2 ", 2);

    @OriginalMember(owner = "cb", name = "t", descriptor = "Llf;")
    public static class109 field526 = field527;

    @OriginalMember(owner = "cb", name = "a", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "cb", name = "g", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "cb", name = "l", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "cb", name = "q", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "cb", name = "v", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "cb", name = "w", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "cb", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field512;

    @OriginalMember(owner = "cb", name = "p", descriptor = "[[[[Z")
    public static boolean[][][][] field522;

    @OriginalMember(owner = "cb", name = "a", descriptor = "([IIII)Lk;")
    private final class94 method206(int[] arg0, int arg1, int arg2, int arg3) {
        field518++;
        int var5 = arg3 ^ (arg1 >>> 12 | (arg1 & 0xD0000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class94 var9 = (class94) this.field525.method337(var7, (byte) -95);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (arg2 != -900517724) {
                field516 = null;
            }
            class56 var10 = (class56) this.field510.method337(var7, (byte) -109);
            if (var10 == null) {
                var10 = class56.method369(this.field517, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field510.method339(var7, false, var10);
            }
            class94 var11 = var10.method366(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method452(true);
                this.field525.method339(var7, false, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(Lvg;I)Z")
    public static final boolean method207(class200 arg0, int arg1) {
        field507++;
        if (arg0.field3871 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < arg0.field3871.length; var2++) {
            int var3 = class181.method1235(arg0, 10, var2);
            int var4 = arg0.field3819[var2];
            if (arg0.field3871[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field3871[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field3871[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "([IBI)Lk;")
    public final class94 method208(int[] arg0, byte arg1, int arg2) {
        field513++;
        if (this.field515.method168((byte) 97) == 1) {
            return this.method211(arg0, arg2, 0, 1);
        } else if (this.field515.method167((byte) 69, arg2) == 1) {
            return this.method211(arg0, 0, arg2, 1);
        } else {
            if (arg1 >= -111) {
                field521 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(Z)V")
    public static void method209(boolean arg0) {
        field527 = null;
        field522 = null;
        field526 = null;
        field524 = null;
        field508 = null;
        field530 = null;
        field516 = null;
        field511 = null;
        field520 = null;
        field512 = null;
        field509 = null;
        if (arg0) {
            field521 = null;
            field514 = null;
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(II[I)Lk;")
    public final class94 method210(int arg0, int arg1, int[] arg2) {
        field529++;
        if (this.field517.method168((byte) 122) == arg0) {
            return this.method206(arg2, 0, -900517724, arg1);
        } else if (this.field517.method167((byte) 87, arg1) == 1) {
            return this.method206(arg2, arg1, -900517724, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "cb", name = "b", descriptor = "([IIII)Lk;")
    private final class94 method211(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg2 >>> 12 | (arg2 & 0xB0000FFF) << 4) ^ arg1;
        field523++;
        int var6 = var5 | arg2 << 16;
        if (arg3 != 1) {
            return null;
        }
        long var7 = (long) var6;
        class94 var9 = (class94) this.field525.method337(var7, (byte) -82);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class120 var10 = class120.method867(this.field515, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class94 var11 = var10.method868();
            this.field525.method339(var7, false, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field1929.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(III[[[I)V")
    public static final void method212(int arg0, int arg1, int arg2, int[][][] arg3) {
        class44.field920 = arg0;
        class103.field2036 = arg1;
        class65.field1245 = arg2;
        class78.field1550 = new class3[arg0][arg1][arg2];
        class206.field4051 = new int[arg0][arg1 + 1][arg2 + 1];
        class29.field623 = arg3;
        class26.method219();
    }

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(Lbg;Lbg;)V")
    public class23(class18 arg0, class18 arg1) {
        this.field515 = arg0;
        this.field517 = arg1;
    }
}
