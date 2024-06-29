import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class211 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lnj;")
    private class162 field2944 = new class162(64);

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lmg;")
    private class101 field2943;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lqp;")
    public static class466 field2939 = new class466("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Ljq;")
    public static class354 field2949 = new class354(0, 0);

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[I")
    public static int[] field2952 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Z")
    public static boolean field2948;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "[I")
    public static int[] field2951;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "[Lta;")
    public static class142[] field2950;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1303(boolean arg0) {
        if (arg0) {
            return;
        }
        field2949 = null;
        field2952 = null;
        field2950 = null;
        field2951 = null;
        field2939 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V", line = 27)
    public final void method1304(boolean arg0) {
        class162 var2 = this.field2944;
        synchronized (this.field2944) {
            this.field2944.method1066(4080);
            if (arg0) {
                method1303(false);
            }
        }
        field2940++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Lls;", line = 41)
    public final class93 method1305(int arg0, byte arg1) {
        field2941++;
        class162 var3 = this.field2944;
        class93 var4;
        synchronized (this.field2944) {
            var4 = (class93) this.field2944.method1073((long) arg0, false);
        }
        if (arg1 != -84) {
            field2950 = null;
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2943.method727(arg0, 32, 107);
        class93 var6 = new class93();
        if (var5 != null) {
            var6.method686(new class391(var5), (byte) 20);
        }
        class162 var7 = this.field2944;
        synchronized (this.field2944) {
            this.field2944.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z", line = 68)
    public static final boolean method1306(int arg0, int arg1, int arg2) {
        field2947++;
        return arg1 == 32 ? (class438.method2587(0, arg0, arg2) | class317.method1850(arg0, arg2, 0) | class121.method853(arg0, (byte) -62, arg2)) & class519.method3087(arg2, 107, arg0) : true;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V", line = 79)
    public final void method1307(int arg0, boolean arg1) {
        field2945++;
        class162 var3 = this.field2944;
        synchronized (this.field2944) {
            this.field2944.method1065((byte) -95, arg0);
            if (!arg1) {
                field2948 = true;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(Z)V", line = 93)
    public final void method1308(boolean arg0) {
        if (arg0) {
            return;
        }
        class162 var2 = this.field2944;
        synchronized (this.field2944) {
            this.field2944.method1068(0);
        }
        field2938++;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lal;ILmg;)V", line = 122)
    public class211(class66 arg0, int arg1, class101 arg2) {
        this.field2943 = arg2;
        this.field2943.method753(32, -87);
    }
}
