import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class6 {

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field79 = -1;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lic;")
    public static class491 field80;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lic;")
    public static class491 field81;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[Lid;")
    public static class412[] field83;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 19)
    public static final void method36(boolean arg0, String arg1) {
        field82++;
        if (arg1.equals("")) {
            return;
        }
        class162.field2369++;
        class291.method1861((byte) -104, class177.field2611);
        class356.field5471.method1410(class456.method2739((byte) -3, arg1), -27645);
        class356.field5471.method1418(true, arg1);
        if (arg0) {
            field83 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 39)
    public static void method37(byte arg0) {
        if (arg0 == 86) {
            field81 = null;
            field80 = null;
            field83 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Lqb;", line = 52)
    public static final class148 method38(int arg0, int arg1) {
        field78++;
        if (arg1 == 0) {
            return new class385();
        } else if (arg1 == 1) {
            return new class173();
        } else if (arg1 == 2) {
            return new class356();
        } else if (arg1 == 3) {
            return new class29();
        } else if (arg1 == 4) {
            return new class98();
        } else if (arg1 == 5) {
            return new class4();
        } else if (arg1 == 6) {
            return new class463();
        } else if (arg1 == 7) {
            return new class241();
        } else if (arg1 == 8) {
            return new class425();
        } else if (arg1 == 9) {
            return new class444();
        } else if (arg1 == 10) {
            return new class34();
        } else if (arg1 == 11) {
            return new class157();
        } else if (arg1 == 12) {
            return new class272();
        } else if (arg1 == 13) {
            return new class89();
        } else if (arg1 == 14) {
            return new class442();
        } else if (arg1 == 15) {
            return new class60();
        } else if (arg1 == 16) {
            return new class318();
        } else if (arg1 == 17) {
            return new class508();
        } else if (arg1 == 18) {
            return new class9();
        } else if (arg1 == 19) {
            return new class513();
        } else if (arg1 == 20) {
            return new class26();
        } else if (arg1 == 21) {
            return new class294();
        } else if (arg1 == 22) {
            return new class457();
        } else if (arg1 == 23) {
            return new class282();
        } else if (arg1 == 24) {
            return new class346();
        } else if (arg1 == 25) {
            return new class257();
        } else if (arg1 == 26) {
            return new class70();
        } else if (arg1 == 27) {
            return new class527();
        } else if (arg1 == 28) {
            return new class30();
        } else if (arg1 == 29) {
            return new class482();
        } else if (arg1 == 30) {
            return new class435();
        } else if (arg1 == 31) {
            return new class45();
        } else if (arg1 == 32) {
            return new class514();
        } else if (arg1 == 33) {
            return new class366();
        } else if (arg1 == 34) {
            return new class409();
        } else if (arg1 == 35) {
            return new class258();
        } else if (arg1 == 36) {
            return new class75();
        } else if (arg1 == 37) {
            return new class204();
        } else if (arg1 == 38) {
            return new class166();
        } else if (arg1 == 39) {
            return new class502();
        } else {
            if (arg0 != 32) {
                method38(-71, 127);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[[B[I[B[II[[BI)I", line = 374)
    public static final int method39(int arg0, byte[][] arg1, int[] arg2, byte[] arg3, int[] arg4, int arg5, byte[][] arg6, int arg7) {
        field77++;
        int var8 = arg4[arg7];
        int var9 = arg2[arg7] + var8;
        int var10 = arg4[arg0];
        int var11 = var10 + arg2[arg0];
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg3[arg7] & 0xFF;
        if (var14 > (arg3[arg0] & 0xFF)) {
            var14 = arg3[arg0] & 0xFF;
        }
        byte[] var15 = arg6[arg7];
        byte[] var16 = arg1[arg0];
        int var17 = var12 - var8;
        if (arg5 >= -63) {
            method40((byte) -24);
        }
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Z", line = 430)
    public static final boolean method40(byte arg0) {
        field76++;
        if (class150.field2232 == 0) {
            return arg0 == -64 ? class411.field6178.method1238((byte) -67) : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method33(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
    public abstract int method34(int arg0);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method35(byte arg0, Component arg1);
}
