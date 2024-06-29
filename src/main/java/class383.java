import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class383 {

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    private int field5694;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "[Lmg;")
    private class96[] field5693;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Lwt;")
    public static class194 field5695 = new class194("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field5696 = 0;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "J")
    private long field5692;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Lmg;")
    private class96 field5688;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "[Lqg;")
    public static class307[] field5697;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lmg;")
    public final class96 method2303(int arg0) {
        field5687++;
        if (this.field5688 == null) {
            return null;
        }
        class96 var2 = this.field5693[(int) ((long) (this.field5694 + arg0) & this.field5692)];
        while (this.field5688 != var2) {
            if (this.field5688.field1291 == this.field5692) {
                class96 var3 = this.field5688;
                this.field5688 = this.field5688.field1287;
                return var3;
            }
            this.field5688 = this.field5688.field1287;
        }
        this.field5688 = null;
        return null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lqp;")
    public static final class450 method2304(int arg0) {
        int var1 = 15 % ((92 - arg0) / 32);
        field5689++;
        class482.field6965 = 0;
        return class225.method1392((byte) -98);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZJ)Lmg;")
    public final class96 method2305(boolean arg0, long arg1) {
        field5690++;
        this.field5692 = arg1;
        class96 var4 = this.field5693[(int) ((long) (this.field5694 - 1) & arg1)];
        for (this.field5688 = var4.field1287; this.field5688 != var4; this.field5688 = this.field5688.field1287) {
            if (this.field5688.field1291 == arg1) {
                class96 var5 = this.field5688;
                this.field5688 = this.field5688.field1287;
                return var5;
            }
        }
        if (arg0) {
            return null;
        } else {
            this.field5688 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public static void method2306(int arg0) {
        field5697 = null;
        field5695 = null;
        if (arg0 != 0) {
            field5696 = 120;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BJLmg;)V")
    public final void method2307(byte arg0, long arg1, class96 arg2) {
        field5691++;
        if (arg2.field1286 != null) {
            arg2.method589((byte) 51);
        }
        class96 var5 = this.field5693[(int) (arg1 & (long) (this.field5694 - 1))];
        arg2.field1287 = var5;
        arg2.field1286 = var5.field1286;
        arg2.field1286.field1287 = arg2;
        if (arg0 != -39) {
            method2306(49);
        }
        arg2.field1287.field1286 = arg2;
        arg2.field1291 = arg1;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(I)V")
    public class383(int arg0) {
        this.field5694 = arg0;
        this.field5693 = new class96[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class96 var3 = this.field5693[var2] = new class96();
            var3.field1287 = var3;
            var3.field1286 = var3;
        }
    }
}
