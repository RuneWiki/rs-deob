import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class261 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public int field3713 = 0;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Z")
    private boolean field3718 = false;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public int field3729 = 0;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field3723 = 0;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "[I")
    public static int[] field3735 = new int[13];

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Liq;")
    public static class362 field3732 = new class362("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public int field3717;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    private int field3734;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "J")
    public long field3728;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "Ljs;")
    public static class180 field3738;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lgj;")
    public static class381 field3722;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1743(int arg0) {
        if (arg0 != 18291) {
            field3732 = null;
        }
        field3738 = null;
        field3735 = null;
        field3732 = null;
        field3722 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZILjava/awt/Component;Lrd;)Lir;")
    public static final class19 method1744(int arg0, boolean arg1, int arg2, Component arg3, class185 arg4) {
        field3714++;
        if (class313.field4484 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class19 var5 = (class19) Class.forName("n").getDeclaredConstructor().newInstance();
                if (arg1) {
                    field3723 = 87;
                }
                var5.field248 = arg2;
                var5.field219 = new int[(class217.field3062 ? 2 : 1) * 256];
                var5.method97(arg3);
                var5.field247 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field247 > 16384) {
                    var5.field247 = 16384;
                }
                var5.method95(var5.field247);
                if (class138.field1719 > 0 && class265.field3779 == null) {
                    class265.field3779 = new class189();
                    class265.field3779.field2731 = arg4;
                    arg4.method1276(class265.field3779, class138.field1719, (byte) -112);
                }
                if (class265.field3779 != null) {
                    if (class265.field3779.field2728[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class265.field3779.field2728[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class445 var6 = new class445(arg4, arg0);
                    var6.field219 = new int[(class217.field3062 ? 2 : 1) * 256];
                    var6.field248 = arg2;
                    var6.method97(arg3);
                    var6.field247 = 16384;
                    var6.method95(var6.field247);
                    if (class138.field1719 > 0 && class265.field3779 == null) {
                        class265.field3779 = new class189();
                        class265.field3779.field2731 = arg4;
                        arg4.method1276(class265.field3779, class138.field1719, (byte) 87);
                    }
                    if (class265.field3779 != null) {
                        if (class265.field3779.field2728[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class265.field3779.field2728[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class19();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public final void method1745(int arg0) {
        if (arg0 != 26513) {
            this.method1745(92);
        }
        field3720++;
        this.field3721 = class158.field2059[this.field3734 << 3];
        this.field3715 = (int) Math.sqrt((double) (this.field3724 * this.field3724 + (this.field3726 * this.field3726 + (this.field3716 * this.field3716))));
        if (this.field3717 == 0) {
            this.field3717 = 1;
        }
        if (this.field3719 == 0) {
            this.field3728 = 2147483647L;
        } else if (this.field3719 == 1) {
            this.field3728 = (long) (this.field3715 * 8 / this.field3717);
            this.field3728 *= this.field3728;
        } else if (this.field3719 == 2) {
            this.field3728 = (long) (this.field3715 * 8 / this.field3717);
        }
        if (this.field3718) {
            this.field3715 *= -1;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Z")
    public static final boolean method1746(int arg0, int arg1, int arg2) {
        int var3 = class389.field5494[arg0][arg1][arg2];
        if (-class396.field5655 == var3) {
            return false;
        } else if (class396.field5655 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class331.method2131(var4 + 1, class161.field2122[arg0].method328(arg1, arg2), var5 + 1) && class331.method2131(var4 + 128 - 1, class161.field2122[arg0].method328(arg1 + 1, arg2), var5 + 1) && class331.method2131(var4 + 128 - 1, class161.field2122[arg0].method328(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class331.method2131(var4 + 1, class161.field2122[arg0].method328(arg1, arg2 + 1), var5 + 128 - 1)) {
                class389.field5494[arg0][arg1][arg2] = class396.field5655;
                return true;
            } else {
                class389.field5494[arg0][arg1][arg2] = -class396.field5655;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)S")
    public static final short method1747(int arg0, byte arg1) {
        field3727++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & 0x7F;
        if (arg1 < 66) {
            field3723 = -44;
        }
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILdg;)V")
    public final void method1748(int arg0, class236 arg1) {
        if (arg0 != -896294812) {
            return;
        }
        while (true) {
            int var3 = arg1.method1574(arg0 + 896294776);
            if (var3 == 0) {
                field3730++;
                return;
            }
            this.method1749(103, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILdg;)V")
    private final void method1749(int arg0, int arg1, class236 arg2) {
        if (arg1 == 1) {
            this.field3734 = arg2.method1617((byte) 48);
        } else if (arg1 == 2) {
            arg2.method1574(-19);
        } else if (arg1 == 3) {
            this.field3726 = arg2.method1597(3641);
            this.field3716 = arg2.method1597(3641);
            this.field3724 = arg2.method1597(3641);
        } else if (arg1 == 4) {
            this.field3719 = arg2.method1574(-80);
            this.field3717 = arg2.method1597(3641);
        } else if (arg1 == 6) {
            this.field3725 = arg2.method1574(-93);
        } else if (arg1 == 8) {
            this.field3713 = 1;
        } else if (arg1 == 9) {
            this.field3729 = 1;
        } else if (arg1 == 10) {
            this.field3718 = true;
        }
        field3733++;
        if (arg0 <= 22) {
            field3737 = 101;
        }
    }
}
