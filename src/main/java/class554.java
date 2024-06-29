import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class554 {

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "Lat;")
    public class342 field7894 = new class342();

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    public static int field7895 = 0;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "F")
    public static float field7897;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "Lat;")
    private class342 field7896;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "[Lmea;")
    public static class391[] field7899;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)I")
    public final int method3121(byte arg0) {
        if (arg0 > -93) {
            this.method3126(95, null);
        }
        field7890++;
        int var2 = 0;
        class342 var3 = this.field7894.field4441;
        while (this.field7894 != var3) {
            var3 = var3.field4441;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)Lat;")
    public final class342 method3122(int arg0) {
        field7891++;
        int var2 = -93 / ((arg0 - 45) / 47);
        class342 var3 = this.field7896;
        if (this.field7894 == var3) {
            this.field7896 = null;
            return null;
        } else {
            this.field7896 = var3.field4441;
            return var3;
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)V")
    public static void method3123(byte arg0) {
        if (arg0 > -70) {
            field7897 = -0.93356067F;
        }
        field7899 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)Lat;")
    public final class342 method3124(boolean arg0) {
        field7893++;
        class342 var2 = this.field7894.field4441;
        if (this.field7894 == var2) {
            this.field7896 = null;
            return null;
        }
        this.field7896 = var2.field4441;
        if (arg0) {
            this.method3125(-27);
        }
        return var2;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V")
    public final void method3125(int arg0) {
        while (true) {
            class342 var2 = this.field7894.field4441;
            if (this.field7894 == var2) {
                field7892++;
                if (arg0 != 0) {
                    return;
                }
                this.field7896 = null;
                return;
            }
            var2.method1901(false);
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
    public class554() {
        this.field7894.field4440 = this.field7894;
        this.field7894.field4441 = this.field7894;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILat;)V")
    public final void method3126(int arg0, class342 arg1) {
        if (arg1.field4440 != null) {
            arg1.method1901(false);
        }
        field7889++;
        arg1.field4440 = this.field7894.field4440;
        if (arg0 <= 110) {
            field7898 = 70;
        }
        arg1.field4441 = this.field7894;
        arg1.field4440.field4441 = arg1;
        arg1.field4441.field4440 = arg1;
    }
}
