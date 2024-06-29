import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class280 extends class179 {

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field3623 = -1;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field3627 = 0;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Lcq;")
    public static class72 field3621 = new class72("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "Lhq;")
    public static class365 field3629 = new class365(128);

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Ltm;")
    private class349 field3619;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sg", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field3630;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sg", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field3631;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sg", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field3632;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1755(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)V", line = 11)
    public static final void method1748(boolean arg0) {
        class420.field5755 = arg0;
        class80.field970 = 1;
        class427.field5843 = 0;
        field3624++;
        class252.field3306 = -1;
        class332.field4539 = 0;
        class406.field5620 = -3;
        class411.field5665 = 0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lbg;I)V", line = 26)
    public final void method1749(class242 arg0, int arg1) {
        if (arg1 > -87) {
            this.method1750(-52, 100, -68);
        }
        field3622++;
        while (true) {
            int var3 = arg0.method1563(-128);
            if (var3 == 0) {
                return;
            }
            this.method1754(0, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)I", line = 46)
    public final int method1750(int arg0, int arg1, int arg2) {
        field3620++;
        int var4 = -97 / ((arg0 - 76) / 49);
        if (this.field3619 == null) {
            return arg1;
        } else {
            class369 var5 = (class369) this.field3619.method2218(1, (long) arg2);
            return var5 == null ? arg1 : var5.field5032;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 67)
    public static void method1751(int arg0) {
        if (arg0 != 0) {
            field3629 = null;
        }
        field3629 = null;
        field3621 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 78)
    public final String method1752(int arg0, String arg1, int arg2) {
        field3628++;
        if (this.field3619 == null) {
            return arg1;
        }
        if (arg0 < 48) {
            this.method1752(89, (String) null, -122);
        }
        class28 var4 = (class28) this.field3619.method2218(1, (long) arg2);
        return var4 == null ? arg1 : var4.field319;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/awt/Canvas;Lnh;Lgd;IB)Luo;", line = 98)
    public static final class118 method1753(int arg0, Canvas arg1, class441 arg2, class172 arg3, int arg4, byte arg5) {
        field3626++;
        try {
            if (arg5 != 36) {
                field3621 = null;
            }
            Class var6 = Class.forName("h");
            Constructor var7 = var6.getConstructor(field3630 == null ? (field3630 = method1755("java.awt.Canvas")) : field3630, field3631 == null ? (field3631 = method1755("gd")) : field3631, Integer.TYPE, Integer.TYPE, field3632 == null ? (field3632 = method1755("nh")) : field3632);
            return (class118) var7.newInstance(arg1, arg3, Integer.valueOf(arg4), new Integer(arg0), arg2);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILbg;I)V", line = 128)
    private final void method1754(int arg0, class242 arg1, int arg2) {
        if (arg0 != 0) {
            return;
        }
        if (arg2 == 249) {
            int var4 = arg1.method1563(-128);
            if (this.field3619 == null) {
                int var5 = class39.method249(var4, true);
                this.field3619 = new class349(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1563(-128) == 1;
                int var8 = arg1.method1545(8);
                class43 var9;
                if (var7) {
                    var9 = new class28(arg1.method1565(arg0 ^ 0xFFFFFF89));
                } else {
                    var9 = new class369(arg1.method1576((byte) 121));
                }
                this.field3619.method2227(var9, -8218, (long) var8);
            }
        }
        field3625++;
    }
}
