import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class117 {

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Luh;")
    private class146 field2099 = new class146();

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    private int field2094;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Lsc;")
    private class56 field2109;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
    public static int[] field2100 = new int[2000];

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field2106 = 0;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lia;")
    public static class257 field2104 = class28.method234(88, "k");

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "Lia;")
    private static class257 field2110 = class28.method234(-81, "Attack");

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lia;")
    public static class257 field2103 = field2110;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lme;")
    public static class44 field2095;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[S")
    public static short[] field2096;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    public final void method831(int arg0, int arg1) {
        if (arg1 >= -122) {
            return;
        }
        field2105++;
        if (class159.field2790 == null) {
            return;
        }
        for (class104 var3 = (class104) this.field2099.method984(-7553); var3 != null; var3 = (class104) this.field2099.method991(125)) {
            if (var3.method755((byte) -107)) {
                if (var3.method752((byte) 48) == null) {
                    var3.method254(1);
                    var3.method815((byte) 121);
                    this.field2097++;
                }
            } else if (((long) arg0) < (++var3.field2055)) {
                class104 var4 = class159.field2790.method114((byte) -102, var3);
                this.field2109.method424(var4, (byte) -40, var3.field573);
                this.field2099.method993(var4, false, var3);
                var3.method254(1);
                var3.method815((byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
    public final void method832(Object arg0, long arg1, int arg2) {
        field2107++;
        if (this.field2097 == 0) {
            class104 var5 = (class104) this.field2099.method995(-1);
            var5.method254(arg2 + 1);
            var5.method815((byte) -46);
        } else {
            this.field2097--;
        }
        class224 var6 = new class224(arg0);
        this.field2109.method424(var6, (byte) -40, arg1);
        this.field2099.method985(var6, (byte) 27);
        var6.field2055 = (long) arg2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public final void method833(int arg0) {
        field2102++;
        this.field2099.method989(-11937);
        this.field2109.method431(arg0 + 12747);
        this.field2097 = this.field2094;
        if (arg0 != 0) {
            this.field2109 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method834(int arg0) {
        field2103 = null;
        field2110 = null;
        field2104 = null;
        field2096 = null;
        field2095 = null;
        field2100 = null;
        if (arg0 <= 126) {
            method834(-65);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)V")
    public final void method835(int arg0, long arg1) {
        field2101++;
        class104 var4 = (class104) this.field2109.method434((byte) -93, arg1);
        if (arg0 > -4) {
            this.field2097 = 55;
        }
        if (var4 != null) {
            var4.method254(1);
            var4.method815((byte) -41);
            this.field2097++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method836(int arg0, long arg1) {
        int var4 = -121 / ((arg0 + 56) / 32);
        field2093++;
        class104 var5 = (class104) this.field2109.method434((byte) -93, arg1);
        if (var5 == null) {
            return null;
        }
        Object var6 = var5.method752((byte) -126);
        if (var6 == null) {
            var5.method254(1);
            var5.method815((byte) -103);
            this.field2097++;
            return null;
        }
        if (var5.method755((byte) -25)) {
            class224 var7 = new class224(var6);
            this.field2109.method424(var7, (byte) -40, var5.field573);
            this.field2099.method985(var7, (byte) 27);
            var7.field2055 = 0L;
            var5.method254(1);
            var5.method815((byte) -128);
        } else {
            this.field2099.method985(var5, (byte) 27);
            var5.field2055 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
    public class117(int arg0) {
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2097 = arg0;
        this.field2094 = arg0;
        this.field2109 = new class56(var2);
    }
}
