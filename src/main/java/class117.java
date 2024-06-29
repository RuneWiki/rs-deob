import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class117 {

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lka;")
    private class406 field1843;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lid;")
    private class240 field1849;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Lma;")
    private class306 field1850;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1842 = 0;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1844 = 0;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1854 = 0;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1851 = "Loading - please wait.";

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lec;")
    private class37 field1840;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1839;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "[Los;")
    private class377[] field1846;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public final void method990(int arg0) {
        field1847++;
        if (this.field1846 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1846.length; var2++) {
            if (this.field1846[var2] != null) {
                this.field1846[var2].method2388(true);
            }
        }
        for (int var3 = 0; var3 < this.field1846.length; var3++) {
            if (this.field1846[var3] != null) {
                this.field1846[var3].method2394((byte) 7);
            }
        }
        int var4 = 108 / ((arg0 + 49) / 54);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Luf;ILuf;ZI)Los;")
    private final class377 method991(class281 arg0, int arg1, class281 arg2, boolean arg3, int arg4) {
        field1848++;
        if (this.field1840 == null) {
            throw new RuntimeException();
        }
        this.field1840.field565 = arg1 * 8 + 5;
        int var6 = -101 % ((arg4 - 67) / 58);
        if (this.field1840.field578.length <= this.field1840.field565) {
            throw new RuntimeException();
        } else if (this.field1846[arg1] == null) {
            int var7 = this.field1840.method278(-16);
            int var8 = this.field1840.method278(-127);
            class377 var9 = new class377(arg1, arg0, arg2, this.field1843, this.field1849, var7, var8, arg3);
            this.field1846[arg1] = var9;
            return var9;
        } else {
            return this.field1846[arg1];
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method992(boolean arg0) {
        if (arg0) {
            field1839 = null;
            field1851 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lka;Lid;)V")
    public class117(class406 arg0, class240 arg1) {
        this.field1843 = arg0;
        this.field1849 = arg1;
        if (!this.field1843.method2560(true)) {
            this.field1850 = this.field1843.method2571((byte) 0, 255, true, 255, false);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILuf;ILuf;)Los;")
    public final class377 method993(int arg0, class281 arg1, int arg2, class281 arg3) {
        if (arg2 > -45) {
            this.method990(-54);
        }
        field1853++;
        return this.method991(arg3, arg0, arg1, true, 125);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Z")
    public final boolean method994(byte arg0) {
        if (arg0 != -110) {
            this.method994((byte) -13);
        }
        field1855++;
        if (this.field1840 != null) {
            return true;
        }
        if (this.field1850 == null) {
            if (this.field1843.method2560(true)) {
                return false;
            }
            this.field1850 = this.field1843.method2571((byte) 0, 255, true, 255, false);
        }
        if (this.field1850.field5053) {
            return false;
        } else {
            this.field1840 = new class37(this.field1850.method1883(arg0 ^ 0x19));
            this.field1846 = new class377[(this.field1840.field578.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
    public static final void method995(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1841++;
        class221 var5 = class447.method2795(arg1, (byte) -49, arg0);
        var5.method1692(arg1 ^ 0x8);
        var5.field3295 = arg2;
        var5.field3297 = arg3;
        var5.field3291 = arg4;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static final void method996(int arg0) {
        class423.field6156.method106((byte) -112);
        if (arg0 != 18952) {
            method992(false);
        }
        field1845++;
    }
}
