import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class288 extends class239 {

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    private final int field5042;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    private final int field5044;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    private final int field5043;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    private final int field5033;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lsf;")
    private static class108 field5032 = class140.method973(255, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lsf;")
    public static class108 field5026 = field5032;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lsf;")
    public static class108 field5030 = class140.method973(255, "Monde de jeu cr-B-B");

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field5041 = 0;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Lsf;")
    private static class108 field5031 = class140.method973(255, "Use");

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field5038 = 0;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Lsf;")
    public static class108 field5039 = class140.method973(255, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field5028 = 0;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "Lsf;")
    public static class108 field5045 = field5031;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 5)
    public static void method2056(int arg0) {
        field5030 = null;
        field5026 = null;
        field5032 = null;
        field5039 = null;
        field5031 = null;
        field5045 = null;
        if (arg0 < 4) {
            field5038 = -75;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lca;B)Z", line = 27)
    public static final boolean method2057(class98 arg0, byte arg1) {
        field5046++;
        if (arg0.field1689 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field1689.length; var2++) {
            int var3 = class99.method691(0, var2, arg0);
            int var4 = arg0.field1641[var2];
            if (arg0.field1689[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field1689[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field1689[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        int var5 = 125 / ((arg1 - 49) / 46);
        return true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILsf;)Z", line = 86)
    public static final boolean method2058(int arg0, class108 arg1) {
        field5029++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class120.field2056; var2++) {
            if (arg1.method781(class197.field3563[var2], -26321)) {
                return true;
            }
        }
        if (arg1.method781(class95.field1513.field757, -26321)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 127)
    public final void method1419(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field5030 = (class108) null;
        }
        field5037++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V", line = 137)
    public final void method1417(int arg0, int arg1, int arg2) {
        field5035++;
        int var4 = this.field5033 * arg2 >> 12;
        if (arg1 != -1) {
            field5045 = (class108) null;
        }
        int var5 = this.field5042 * arg2 >> 12;
        int var6 = this.field5044 * arg0 >> 12;
        int var7 = this.field5043 * arg0 >> 12;
        class115.method823(var7, (byte) -118, this.field4170, var4, var5, var6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)V", line = 163)
    public final void method1420(boolean arg0, int arg1, int arg2) {
        field5034++;
        int var4 = this.field5042 * arg1 >> 12;
        int var5 = this.field5033 * arg1 >> 12;
        if (!arg0) {
            field5032 = (class108) null;
        }
        int var6 = this.field5044 * arg2 >> 12;
        int var7 = this.field5043 * arg2 >> 12;
        class177.method1249(this.field4169, this.field4168, var5, var7, this.field4170, false, var4, var6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIIII)V", line = 189)
    public class288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5042 = arg2;
        this.field5044 = arg1;
        this.field5043 = arg3;
        this.field5033 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)[F", line = 204)
    public static final float[] method2059(int arg0) {
        float var1 = class217.method1492() + class217.method1497();
        field5027++;
        int var2 = class217.method1498();
        float var3 = (float) ((var2 & 0xFFB6) >> 8) / 255.0F;
        float var4 = (float) (var2 & 0xFF) / 255.0F;
        class322.field5508[3] = 1.0F;
        float var5 = (float) ((var2 & 0xFFEF06) >> 16) / 255.0F;
        float var6 = 0.58823526F;
        class322.field5508[1] = class29.field431[1] * var3 * var6 * var1;
        class322.field5508[arg0] = class29.field431[0] * var5 * var6 * var1;
        class322.field5508[2] = class29.field431[2] * var4 * var6 * var1;
        return class322.field5508;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIZ)V", line = 246)
    public static final void method2060(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        if (class203.field3671 != 0 && arg0 != -1) {
            class134.method921(0, class69.field1079, class203.field3671, -8949, false, arg0);
            class95.field1524 = true;
        }
        field5036++;
    }
}
