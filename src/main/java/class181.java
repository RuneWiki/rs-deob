import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class181 {

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    private int field2933;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[Lol;")
    private class189[] field2929;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lbj;")
    public static class162 field2924 = new class162(47, 3);

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Los;")
    public static class309 field2930;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "J")
    private long field2926;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lol;")
    private class189 field2927;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)Z")
    public static final boolean method1237(int arg0, int arg1, int arg2) {
        field2931++;
        if (class419.method2561(-1, arg2, arg0)) {
            return class280.method1754((byte) -123, arg0, arg2) | (arg0 & 0xB000) != arg1 | class355.method2192(arg0, (byte) 85, arg2) ? true : (arg2 & 0x37) == 0 & (class71.method611(arg0, arg2, 86) | class307.method1967(arg2, (byte) 102, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(JLol;I)V")
    public final void method1238(long arg0, class189 arg1, int arg2) {
        field2934++;
        if (arg1.field3035 != null) {
            arg1.method1289((byte) 95);
        }
        class189 var5 = this.field2929[(int) ((long) (this.field2933 + arg2) & arg0)];
        arg1.field3035 = var5.field3035;
        arg1.field3032 = var5;
        arg1.field3035.field3032 = arg1;
        arg1.field3032.field3035 = arg1;
        arg1.field3034 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lol;")
    public final class189 method1239(byte arg0) {
        int var2 = 64 / ((arg0 + 61) / 49);
        field2925++;
        if (this.field2927 == null) {
            return null;
        }
        class189 var3 = this.field2929[(int) ((long) (this.field2933 - 1) & this.field2926)];
        while (this.field2927 != var3) {
            if (this.field2927.field3034 == this.field2926) {
                class189 var4 = this.field2927;
                this.field2927 = this.field2927.field3032;
                return var4;
            }
            this.field2927 = this.field2927.field3032;
        }
        this.field2927 = null;
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)Lqg;")
    public static final class325 method1240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 61 / ((21 - arg1) / 62);
        field2932++;
        long var8 = (long) arg3 * 76724863L ^ (long) arg2 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg5 * 67481L ^ (long) arg6 * 97549L ^ (long) arg4 * 986053L;
        class325 var10 = (class325) class175.field2853.method2478(1, var8);
        if (var10 == null) {
            class325 var11 = client.field3213.method330(arg5, arg6, arg0, arg4, arg2, arg3);
            class175.field2853.method2472(-125, var11, var8);
            return var11;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1241(int arg0) {
        field2924 = null;
        field2930 = null;
        int var1 = 124 % ((-arg0 - 76) / 34);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(JI)Lol;")
    public final class189 method1242(long arg0, int arg1) {
        if (arg1 != 20939) {
            return null;
        }
        this.field2926 = arg0;
        field2928++;
        class189 var4 = this.field2929[(int) (arg0 & (long) (this.field2933 - 1))];
        for (this.field2927 = var4.field3032; this.field2927 != var4; this.field2927 = this.field2927.field3032) {
            if (this.field2927.field3034 == arg0) {
                class189 var5 = this.field2927;
                this.field2927 = this.field2927.field3032;
                return var5;
            }
        }
        this.field2927 = null;
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
    public class181(int arg0) {
        this.field2933 = arg0;
        this.field2929 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2929[var2] = new class189();
            var3.field3032 = var3;
            var3.field3035 = var3;
        }
    }

    static {
        new class309("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field2930 = new class309("level: ", "Stufe: ", "niveau ", "nível: ");
    }
}
