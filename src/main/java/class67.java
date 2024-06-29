import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class67 extends class513 {

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public int field940 = 0;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "Lqv;")
    public class110 field921;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "Lqv;")
    public class110 field947;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "Llu;")
    public class194 field919;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "Llu;")
    public class194 field927;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Laaa;")
    public class25 field923;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "Laaa;")
    public class25 field943;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "Lkha;")
    public class30 field931;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "Lam;")
    public class55 field917;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "Liw;")
    public static class608 field932;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "Lkc;")
    public class655 field942;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "Z")
    public boolean field929;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
    public boolean field934;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "Z")
    public boolean field938;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "[I")
    public int[] field928;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "[Lpba;")
    public static class198[] field918;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 3)
    public static void method434(int arg0) {
        field918 = null;
        if (arg0 <= -119) {
            field932 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Lria;", line = 31)
    public static final class501 method435(int arg0, int arg1) {
        field935++;
        if (arg0 < 41) {
            field932 = null;
        }
        class501 var2 = (class501) class470.field6422.method3200((long) arg1, -19983);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class242.field3376.method3322(0, arg1, (byte) 95);
        class501 var4 = new class501();
        if (var3 != null) {
            var4.method2994(new class26(var3), (byte) 106, arg1);
        }
        class470.field6422.method3199((byte) 78, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lck;", line = 57)
    public static final class703 method436(Throwable arg0, String arg1) {
        field930++;
        class703 var2;
        if ((arg0 instanceof class703)) {
            var2 = (class703) arg0;
            var2.field9786 = var2.field9786 + ' ' + arg1;
        } else {
            var2 = new class703(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V", line = 84)
    public final void method437(byte arg0) {
        field924++;
        int var2 = this.field922;
        if (arg0 < 108) {
            return;
        }
        boolean var3 = this.field929;
        if (this.field931 != null) {
            class30 var4 = this.field931.method219(-1, class554.field7826);
            if (var4 == null) {
                this.field915 = 0;
                this.field937 = 0;
                this.field925 = 256;
                this.field938 = false;
                this.field929 = false;
                this.field928 = null;
                this.field920 = 0;
                this.field922 = -1;
                this.field926 = 256;
                this.field945 = 0;
            } else {
                this.field925 = var4.field391;
                this.field922 = var4.field393;
                this.field920 = var4.field460;
                this.field929 = var4.field454;
                this.field938 = var4.field381;
                this.field915 = var4.field382 << 9;
                this.field928 = var4.field412;
                this.field937 = var4.field438;
                this.field945 = var4.field432;
                this.field926 = var4.field396;
            }
        } else if (this.field917 != null) {
            int var5 = class259.method1611(this.field917, (byte) -48);
            if (var2 != var5) {
                this.field922 = var5;
                class11 var6 = this.field917.field771;
                if (var6.field111 != null) {
                    var6 = var6.method55((byte) 118, class554.field7826);
                }
                if (var6 == null) {
                    this.field926 = 256;
                    this.field929 = this.field917.field771.field160;
                    this.field925 = 256;
                    this.field937 = this.field915 = 0;
                } else {
                    this.field937 = var6.field155;
                    this.field929 = var6.field160;
                    this.field925 = var6.field167;
                    this.field915 = var6.field112 << 9;
                    this.field926 = var6.field172;
                }
            }
        } else if (this.field942 != null) {
            this.field922 = class300.method1760(false, this.field942);
            this.field937 = this.field942.field9234;
            this.field915 = this.field942.field9275 << 9;
            this.field925 = 256;
            this.field926 = 256;
            this.field929 = this.field942.field9271;
        }
        if (this.field922 == var2 && this.field929 == var3) {
            return;
        }
        if (this.field927 == null) {
            return;
        }
        class237.field3299.method3761(this.field927);
        this.field921 = null;
        this.field927 = null;
        this.field943 = null;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 197)
    public static final void method438(byte arg0) {
        field936++;
        class136.method884((byte) -28, (long) class245.field3409, class96.field1401);
        int var1 = -124 / ((45 - arg0) / 56);
        if (class312.field4004 != -1) {
            class370.method2063(class312.field4004, -1);
        }
        for (int var2 = 0; var2 < class752.field10450; var2++) {
            if (class142.field1966[var2]) {
                class523.field7346[var2] = true;
            }
            class513.field7167[var2] = class142.field1966[var2];
            class142.field1966[var2] = false;
        }
        class217.field3073 = class245.field3409;
        if (class312.field4004 != -1) {
            class752.field10450 = 0;
            class310.method1814((byte) -58);
        }
        class96.field1401.method2198();
        class217.method1421(class96.field1401, 1);
        int var3 = class474.method2817(-1);
        if (var3 == -1) {
            var3 = class565.field8033;
        }
        if (var3 == -1) {
            var3 = class623.field8898;
        }
        class156.method987(true, var3);
        class284.field3763 = 0;
    }
}
