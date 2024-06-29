import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class229 extends class135 {

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3708 = null;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "[Z")
    public static boolean[] field3710 = new boolean[200];

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "Llf;")
    public static class211 field3706 = new class211(64);

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "[I")
    public static int[] field3711;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "[Llg;")
    public static class13[] field3700;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "[Lkj;")
    public static class145[] field3715;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)V")
    public abstract void method93(int arg0, int arg1);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public abstract void method86(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)V")
    public abstract void method71(int arg0, int arg1);

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(II)V")
    public abstract void method69(int arg0, int arg1);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIIII)V")
    public final void method1565(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3709++;
        int var6 = this.field3714 << 3;
        int var7 = (arg4 << 4) + (var6 & 0xF);
        if (!arg0) {
            field3710 = null;
        }
        int var8 = this.field3707 << 3;
        int var9 = (arg3 << 4) + (var8 & 0xF);
        this.method85(var6, var8, var7, var9, arg1, arg2);
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public static void method1566(int arg0) {
        field3715 = null;
        if (arg0 != 221) {
            return;
        }
        field3708 = null;
        field3711 = null;
        field3710 = null;
        field3706 = null;
        field3700 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(CZI)C")
    public static final char method1567(char arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1566(-82);
        }
        field3702++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
    public abstract void method81(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V")
    public abstract void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIII)V")
    public static final void method1568(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 44) {
            method1566(-8);
        }
        class287 var4 = class261.method1786(arg1, false, 11);
        field3704++;
        var4.method1914((byte) 46);
        var4.field4547 = arg3;
        var4.field4549 = arg2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
    public abstract void method91(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1569(int arg0, Component arg1) {
        field3705++;
        if (arg0 != 256) {
            method1566(-18);
        }
        Method var2 = class20.field250;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class103.field1597);
        arg1.addFocusListener(class103.field1597);
    }
}
