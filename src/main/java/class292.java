import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class292 {

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field4593 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public int field4582;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lb;")
    public static class60 field4587;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "[I")
    public static int[] field4590;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[Lq;")
    public static class96[] field4592;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Lkj;", line = 6)
    public static final class177 method2056(byte arg0, int arg1) {
        field4588++;
        if (arg1 == 0) {
            return new class38();
        } else if (arg1 == 1) {
            return new class53();
        } else if (arg1 == 2) {
            return new class143();
        } else if (arg1 == 3) {
            return new class22();
        } else if (arg1 == 4) {
            return new class248();
        } else if (arg1 == 5) {
            return new class199();
        } else if (arg1 == 6) {
            return new class119();
        } else if (arg1 == 7) {
            return new class12();
        } else if (arg1 == 8) {
            return new class299();
        } else if (arg1 == 9) {
            return new class62();
        } else if (arg1 == 10) {
            return new class250();
        } else if (arg1 == 11) {
            return new class28();
        } else if (arg1 == 12) {
            return new class50();
        } else if (arg1 == 13) {
            return new class182();
        } else if (arg1 == 14) {
            return new class235();
        } else if (arg1 == 15) {
            return new class298();
        } else if (arg1 == 16) {
            return new class256();
        } else if (arg1 == 17) {
            return new class104();
        } else if (arg1 == 18) {
            return new class57();
        } else if (arg1 == 19) {
            return new class66();
        } else if (arg1 == 20) {
            return new class34();
        } else if (arg1 == 21) {
            return new class178();
        } else if (arg1 == 22) {
            return new class213();
        } else if (arg1 == 23) {
            return new class179();
        } else if (arg1 == 24) {
            return new class79();
        } else if (arg1 == 25) {
            return new class135();
        } else if (arg1 == 26) {
            return new class261();
        } else if (arg1 == 27) {
            return new class281();
        } else if (arg1 == 28) {
            return new class309();
        } else if (arg1 == 29) {
            return new class130();
        } else if (arg1 == 30) {
            return new class88();
        } else if (arg1 == 31) {
            return new class146();
        } else if (arg1 == 32) {
            return new class59();
        } else if (arg1 == 33) {
            return new class39();
        } else if (arg1 == 34) {
            return new class295();
        } else if (arg1 == 35) {
            return new class231();
        } else if (arg1 == 36) {
            return new class15();
        } else if (arg1 == 37) {
            return new class125();
        } else if (arg1 == 38) {
            return new class242();
        } else if (arg1 == 39) {
            return new class263();
        } else {
            if (arg0 != 37) {
                field4585 = 92;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 318)
    public static final void method2057(int arg0) {
        field4594++;
        if (arg0 <= 17) {
            field4587 = (class60) null;
        }
        class69.field1014.method1433(30);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 332)
    public static final void method2058(int arg0, Component arg1) {
        int var2 = 61 % ((arg0 + 48) / 62);
        Method var3 = class26.field300;
        field4581++;
        if (var3 != null) {
            try {
                var3.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        arg1.addKeyListener(class126.field1994);
        arg1.addFocusListener(class126.field1994);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)V", line = 358)
    public static final void method2059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class273[] var7 = class141.field2185;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class273 var9 = var7[var8];
            if (var9 != null && var9.field4132 == 2) {
                class89.method723(arg3 >> 1, arg4, -108, (var9.field4139 - class302.field4735 << 7) + var9.field4131, (-class110.field1744 + var9.field4140 << 7) - -var9.field4142, arg5, var9.field4134 * 2, arg0 >> 1);
                if (class138.field2145 > -1 && class312.field4852 % 20 < 10) {
                    class163.field2432[var9.field4127].method186(class138.field2145 + arg6 - 12, arg2 - (-class318.field4961 - -28));
                }
            }
        }
        if (arg1 != -12) {
            method2059(-16, 10, 1, 54, 85, -46, 15);
        }
        field4591++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)Z", line = 394)
    public static final boolean method2060(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class325.field5057 * arg0 + class304.field4758 * arg3 >> 16;
        int var6 = class325.field5057 * arg3 - class304.field4758 * arg0 >> 16;
        int var7 = class235.field3598 * arg1 + class10.field103 * var6 >> 16;
        int var8 = class10.field103 * arg1 - class235.field3598 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class235.field3598 * arg2 + class10.field103 * var6 >> 16;
        int var12 = class10.field103 * arg2 - class235.field3598 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class288.field4476 && var13 < class288.field4476) {
            return false;
        } else if (var9 > class307.field4796 && var13 > class307.field4796) {
            return false;
        } else if (var10 < class257.field3834 && var14 < class257.field3834) {
            return false;
        } else {
            return var10 <= class142.field2202 || var14 <= class142.field2202;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZII)I", line = 441)
    public static final int method2061(int arg0, boolean arg1, int arg2, int arg3) {
        field4586++;
        if (arg1) {
            return 11;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 482)
    public static final void method2062(int arg0) {
        field4580++;
        for (class156 var1 = (class156) class159.field2376.method986(false); var1 != null; var1 = (class156) class159.field2376.method982(14877)) {
            class67 var2 = var1.field2342;
            if (class50.field775 != var2.field990 || var2.field979) {
                var1.method1554((byte) -113);
            } else if (var2.field988 <= class312.field4852) {
                var2.method566(-117, class88.field1297);
                if (var2.field979) {
                    var1.method1554((byte) -73);
                } else {
                    class141.method1063(var2.field990, var2.field1002, var2.field999, var2.field996, 60, var2, 0, -1L, false);
                }
            }
        }
        int var3 = -67 % ((-arg0 - 61) / 60);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 515)
    public static void method2063(boolean arg0) {
        field4587 = null;
        field4590 = null;
        if (arg0) {
            field4590 = (int[]) null;
        }
        field4592 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
    public abstract void method589(int arg0, int arg1);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public abstract void method582(int arg0, int arg1, int arg2);
}
