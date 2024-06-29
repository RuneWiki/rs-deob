import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class408 {

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Lqha;")
    private class112 field5352 = new class112();

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Ltja;")
    public static class288 field5349 = new class288(20);

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "D")
    public static double field5353;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lqha;")
    private class112 field5355;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lqha;")
    public final class112 method2439(int arg0) {
        field5347++;
        class112 var2 = this.field5355;
        if (this.field5352 == var2) {
            this.field5355 = null;
            return null;
        } else if (arg0 >= -85) {
            return null;
        } else {
            this.field5355 = var2.field1406;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lqha;")
    public final class112 method2440(int arg0) {
        field5348++;
        class112 var2 = this.field5352.field1406;
        if (this.field5352 == var2) {
            return null;
        }
        var2.method892(50560);
        if (arg0 >= -20) {
            field5353 = 0.47807961541854677D;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method2441(byte arg0) {
        field5349 = null;
        if (arg0 != -69) {
            field5349 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    public final void method2442(byte arg0) {
        while (true) {
            class112 var2 = this.field5352.field1406;
            if (this.field5352 == var2) {
                int var3 = 125 / ((arg0 - 3) / 32);
                field5350++;
                this.field5355 = null;
                return;
            }
            var2.method892(50560);
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)I")
    public final int method2443(byte arg0) {
        field5351++;
        int var2 = 0;
        int var3 = 86 / ((arg0 - 36) / 43);
        for (class112 var4 = this.field5352.field1406; var4 != this.field5352; var4 = var4.field1406) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILqha;)V")
    public final void method2444(int arg0, class112 arg1) {
        field5354++;
        if (arg1.field1407 != null) {
            arg1.method892(50560);
        }
        arg1.field1407 = this.field5352.field1407;
        if (arg0 != 11586) {
            field5349 = null;
        }
        arg1.field1406 = this.field5352;
        arg1.field1407.field1406 = arg1;
        arg1.field1406.field1407 = arg1;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)Z")
    public final boolean method2445(byte arg0) {
        field5345++;
        if (arg0 != 74) {
            this.field5355 = null;
        }
        return this.field5352.field1406 == this.field5352;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)Lqha;")
    public final class112 method2446(byte arg0) {
        field5344++;
        class112 var2 = this.field5352.field1407;
        if (this.field5352 == var2) {
            this.field5355 = null;
            return null;
        } else {
            int var3 = -40 % ((4 - arg0) / 58);
            this.field5355 = var2.field1407;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Lqha;")
    public final class112 method2447(int arg0) {
        field5346++;
        if (arg0 >= -80) {
            return null;
        }
        class112 var2 = this.field5352.field1406;
        if (this.field5352 == var2) {
            this.field5355 = null;
            return null;
        } else {
            this.field5355 = var2.field1406;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class408() {
        this.field5352.field1406 = this.field5352;
        this.field5352.field1407 = this.field5352;
    }
}
