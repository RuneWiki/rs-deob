import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class263 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field3741 = 0;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[F")
    public float[] field3745 = new float[5000];

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[Ljava/lang/Object;")
    public Object[] field3751 = new Object[5000];

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public int field3750 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[B")
    public byte[] field3744 = new byte[5000];

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public volatile int field3748 = 0;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public volatile int field3747 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field3743 = 0;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lh;")
    public static class572 field3752;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field3749;

    static {
        new class572("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field3752 = new class572("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 4)
    public static void method1664(int arg0) {
        field3752 = null;
        if (arg0 != 0) {
            method1665(null, false, -18, null);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V", line = 24)
    public static final void method1665(String arg0, boolean arg1, int arg2, String arg3) {
        class584.field8571 = arg1;
        class537.field8006 = arg3;
        class569.field8400 = arg0;
        field3749++;
        if (arg2 > -120) {
            field3743 = 71;
        }
        if (!class584.field8571 && class378.field5211 != 3 && class569.field8400.equals("") || class537.field8006.equals("")) {
            class469.method2832(-72, 3);
            return;
        }
        class152.field2301 = false;
        if (class378.field5211 != 1) {
            class161.field2375 = 0;
            class114.field1602 = -1;
        }
        class469.method2832(-83, -3);
        class313.field4317 = 1;
        class625.field9209 = 0;
        class631.field9272 = 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lds;IIIIB)V", line = 56)
    public static final void method1666(class14 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3746++;
        if (arg0.field137 == -1 && arg0.field132 == null) {
            return;
        }
        if (arg5 <= 54) {
            field3743 = -105;
        }
        int var6 = 0;
        int var7 = class56.field668.field6873 * arg0.field127 >> 8;
        if (arg0.field146 < arg2) {
            var6 += arg2 - arg0.field146;
        } else if (arg0.field123 > arg2) {
            var6 += arg0.field123 - arg2;
        }
        if (arg3 > arg0.field147) {
            var6 += arg3 - arg0.field147;
        } else if (arg0.field130 > arg3) {
            var6 += arg0.field130 - arg3;
        }
        if (arg0.field126 == 0 || (var6 - 64) > arg0.field126 || class56.field668.field6873 == 0 || arg0.field129 != arg1) {
            if (arg0.field139 != null) {
                class155.field2316.method258(arg0.field139);
                arg0.field139 = null;
            }
            if (arg0.field128 != null) {
                class155.field2316.method258(arg0.field128);
                arg0.field128 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg0.field126 - var6) * var7 / arg0.field126;
        if (arg0.field139 != null) {
            arg0.field139.method707(var8);
        } else if (arg0.field137 >= 0) {
            class154 var9 = class154.method1120(class472.field6666, arg0.field137, 0);
            if (var9 != null) {
                class16 var10 = var9.method1119().method107(class341.field4716);
                class91 var11 = class91.method703(var10, 100, var8);
                var11.method706(-1);
                class155.field2316.method267(var11);
                arg0.field139 = var11;
            }
        }
        if (arg0.field128 != null) {
            arg0.field128.method707(var8);
            if (!arg0.field128.method2453(64)) {
                arg0.field128 = null;
            }
        } else if (arg0.field132 != null && (arg0.field142 -= arg4) <= 0) {
            int var12 = (int) ((double) arg0.field132.length * Math.random());
            class154 var13 = class154.method1120(class472.field6666, arg0.field132[var12], 0);
            if (var13 != null) {
                class16 var14 = var13.method1119().method107(class341.field4716);
                class91 var15 = class91.method703(var14, 100, var8);
                var15.method706(0);
                class155.field2316.method267(var15);
                arg0.field128 = var15;
                arg0.field142 = arg0.field131 + ((int) (Math.random() * (double) (arg0.field133 - arg0.field131)));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 209)
    public static final void method1667(int arg0, String arg1, byte arg2) {
        class402.method2367(class432.field5785, (byte) 75);
        class501.field7105++;
        field3742++;
        class112.field1589.method1049(-1, class539.method3267(arg1, false) + 1);
        class112.field1589.method1050((byte) 32, arg1);
        if (arg2 <= 93) {
            method1667(-99, null, (byte) -116);
        }
        class112.field1589.method1010(122, arg0);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public abstract void method939(int arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IFLsa;ZI)V")
    public abstract void method935(int arg0, float arg1, class176 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
    public abstract void method938(int arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lnj;B)V")
    public abstract void method934(class205 arg0, byte arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
    public abstract void method937(int arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
    public abstract void method931(int arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lnj;I)V")
    public abstract void method928(class205 arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lnj;B)V")
    public abstract void method929(class205 arg0, byte arg1);
}
