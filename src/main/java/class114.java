import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class114 extends class366 {

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lgf;")
    public static class180 field1812 = new class180("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lao;")
    public static class188 field1816 = new class188(13, 0);

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method5(boolean arg0, int arg1) {
        ++field1803;
        int var3 = 109 / ((10 - arg1) / 48);
        super.field5494.method2040(true, (byte) 87);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 13)
    public static final void method840(byte arg0) {
        if (arg0 <= -45) {
            class351.field5334.method1770(116);
            ++field1807;
            class481.field7063.method717((byte) 106);
            if (class264.field3804 != null) {
                class264.field3804.method539(true, class31.field503);
            }
            class238.field3446.method2507(0);
            class31.field503.setBackground(Color.black);
            class272.field3936 = -1;
            class351.field5334 = class29.method235(true, class31.field503);
            class481.field7063 = class18.method168(true, 0, class31.field503);
            if (class264.field3804 != null) {
                class264.field3804.method541((byte) 66, class31.field503);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLvp;)V", line = 38)
    public static final void method841(boolean arg0, class123 arg1) {
        if (arg0) {
            method840((byte) -71);
        }
        ++field1811;
        class86.field1436.method2852(46, arg1.method928(-1));
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILhh;II)Lds;", line = 50)
    public static final class12 method842(int arg0, class84 arg1, int arg2, int arg3) {
        ++field1814;
        byte[] var4 = arg1.method683(arg3, arg2, 5);
        if (arg0 > -70) {
            return null;
        } else {
            return var4 == null ? null : new class12(var4);
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 66)
    public static void method843(int arg0) {
        field1812 = null;
        field1816 = null;
        if (arg0 != 302) {
            method840((byte) 36);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLtn;)Ljava/lang/String;", line = 78)
    public static final String method844(byte arg0, class58 arg1) {
        ++field1806;
        if (~client.method1349(arg1).method779((byte) 122) == -1) {
            return null;
        } else {
            if (arg0 != 9) {
                field1812 = null;
            }
            if (arg1.field907 != null && ~arg1.field907.trim().length() != -1) {
                return arg1.field907;
            } else {
                return class38.field578 ? "Hidden-use" : null;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZZ)V", line = 105)
    public final void method7(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field1810;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Z", line = 115)
    public final boolean method9(int arg0) {
        if (arg0 <= 21) {
            return true;
        } else {
            ++field1815;
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V", line = 129)
    public final void method1(int arg0) {
        super.field5494.method2040(false, (byte) 81);
        if (arg0 > 2) {
            ++field1808;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIB)V", line = 143)
    public final void method8(int arg0, int arg1, byte arg2) {
        if (arg2 < 18) {
            field1805 = 111;
        }
        ++field1813;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lqg;)V", line = 154)
    public class114(class321 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V", line = 160)
    public static final void method845(boolean arg0) {
        class156.field2367.method2476(0);
        ++field1804;
        if (!arg0) {
            field1817 = 59;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILgo;B)V", line = 172)
    public final void method6(int arg0, class440 arg1, byte arg2) {
        ++field1809;
        super.field5494.method2042(arg1, 0);
        super.field5494.method2068(arg0, 13134);
        int var4 = 20 / ((arg2 - 31) / 59);
    }
}
