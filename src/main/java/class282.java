import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class282 extends class180 {

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field3867 = -1;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Ltm;")
    public static class112 field3866 = new class112("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public int field3865;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public int field3869;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public int field3871;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public int field3872;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public int field3875;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public int field3877;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public int field3880;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public int field3883;

    // $FF: synthetic field
    @OriginalMember(owner = "client!af", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field3884;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "[S")
    public static short[] field3879;

    // $FF: synthetic method
    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1757(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZLkm;)Lab;", line = 28)
    public final class232 method1753(int arg0, boolean arg1, class487 arg2) {
        if (!arg1) {
            return null;
        }
        field3870++;
        int var4 = class104.field1501[this.field3871];
        if (var4 == 0) {
            class467 var5 = class37.method309(this.field3877, this.field3869, this.field3876);
            if (var5 instanceof class383) {
                class383 var6 = (class383) var5;
                if (var6.field5435 != null) {
                    return ((class278) var6.field5435).method208(arg2, 105, arg0);
                }
            }
        } else if (var4 == 1) {
            class87 var11 = class245.method1528(this.field3877, this.field3869, this.field3876);
            if (var11 instanceof class203) {
                class203 var12 = (class203) var11;
                if (var12.field2904 != null) {
                    return ((class278) var12.field2904).method208(arg2, 84, arg0);
                }
            }
        } else if (var4 == 2) {
            class478 var7 = class75.method518(this.field3877, this.field3869, this.field3876, field3884 == null ? (field3884 = method1757("wk")) : field3884);
            if (var7 instanceof class295) {
                class295 var8 = (class295) var7;
                if (var8.field4081 != null) {
                    return ((class278) var8.field4081).method208(arg2, 118, arg0);
                }
            }
        } else if (var4 == 3) {
            class367 var9 = class292.method1807(this.field3877, this.field3869, this.field3876);
            if (var9 instanceof class440) {
                class440 var10 = (class440) var9;
                if (var10.field6032 != null) {
                    return ((class278) var10.field6032).method208(arg2, 76, arg0);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V", line = 112)
    public static final void method1754(byte arg0) {
        field3863++;
        if (class60.field933 > 0) {
            class166.method1021(-105);
        } else {
            class381.field5410 = class237.field3339;
            class237.field3339 = null;
            int var1 = 10 / ((81 - arg0) / 35);
            class8.method94(40, 127);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V", line = 130)
    public static final void method1755(byte arg0) {
        int var1 = -122 / ((arg0 - 8) / 43);
        class248.field3481.method656(100);
        field3874++;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V", line = 142)
    public static void method1756(byte arg0) {
        if (arg0 != -74) {
            method1754((byte) 75);
        }
        field3879 = null;
        field3866 = null;
    }
}
