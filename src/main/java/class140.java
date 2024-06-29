import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class140 {

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lge;")
    private class511 field2169 = new class511(16);

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lci;")
    private class320 field2167;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[Lrw;")
    public static class543[] field2164 = new class543[14];

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[I")
    public static int[] field2174 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method1017(int arg0) {
        if (arg0 != 0) {
            field2174 = null;
        }
        field2164 = null;
        field2174 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
    public static final void method1018(int arg0, int arg1) {
        class168.method1202(20);
        field2173++;
        int var2 = class429.field6177.method431(arg1, (byte) 127).field225;
        if (var2 == 0) {
            return;
        }
        int var3 = class84.field1335.field4552[arg1];
        if (var2 == 5) {
            class390.field5540 = var3;
        }
        if (var2 == 6) {
            class487.field7050 = var3;
        }
        if (arg0 != 5737) {
            field2164 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V")
    public final void method1019(int arg0, int arg1) {
        if (arg0 != -15190) {
            field2174 = null;
        }
        field2171++;
        class511 var3 = this.field2169;
        synchronized (this.field2169) {
            this.field2169.method2989(false, arg1);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public final void method1020(int arg0) {
        field2165++;
        class511 var2 = this.field2169;
        synchronized (this.field2169) {
            if (arg0 <= 122) {
                this.field2169 = null;
            }
            this.field2169.method2980(-182819096);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lsq;IIIII)Lvq;")
    public final class328 method1021(class121 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2168++;
        class129[] var7 = null;
        class296 var8 = this.method1023(arg4, 115);
        int var9 = 29 / ((-arg5 - 63) / 41);
        if (var8.field4427 != null) {
            var7 = new class129[var8.field4427.length];
            for (int var10 = 0; var10 < var7.length; var10++) {
                class538 var11 = arg0.method897(var8.field4427[var10], 10186);
                var7[var10] = new class129(var11.field7912, var11.field7909, var11.field7905, var11.field7914, var11.field7911, var11.field7906, var11.field7915, var11.field7917);
            }
        }
        return new class328(var8.field4421, var7, var8.field4423, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[[I)V")
    public static final void method1022(int arg0, int[][] arg1) {
        class271.field4078 = arg1;
        if (arg0 != 0) {
            field2164 = null;
        }
        field2170++;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)Lep;")
    private final class296 method1023(int arg0, int arg1) {
        field2172++;
        class511 var3 = this.field2169;
        class296 var4;
        synchronized (this.field2169) {
            var4 = (class296) this.field2169.method2982(0, (long) arg0);
        }
        int var5 = -19 / ((arg1 - 21) / 61);
        if (var4 != null) {
            return var4;
        }
        class320 var6 = this.field2167;
        byte[] var7;
        synchronized (this.field2167) {
            var7 = this.field2167.method2037(arg0, (byte) 85, 29);
        }
        class296 var8 = new class296();
        if (var7 != null) {
            var8.method1907(new class519(var7), -2905);
        }
        class511 var9 = this.field2169;
        synchronized (this.field2169) {
            this.field2169.method2981(var8, 33, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lsn;ILci;)V")
    public class140(class453 arg0, int arg1, class320 arg2) {
        this.field2167 = arg2;
        this.field2167.method2030(-10914, 29);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public final void method1024(int arg0) {
        field2166++;
        class511 var2 = this.field2169;
        synchronized (this.field2169) {
            if (arg0 != -16993) {
                this.method1023(61, 114);
            }
            this.field2169.method2990((byte) -106);
        }
    }
}
