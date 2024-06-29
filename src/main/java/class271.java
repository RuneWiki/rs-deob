import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class271 implements class758 {

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lk;")
    private class563 field3352;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "Loh;")
    private class404 field3346;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Loh;")
    private class404 field3353;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lpia;")
    public static class94 field3349 = new class94(19, -1);

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field3354 = -1;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Lda;")
    private class59 field3348;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Z")
    public final boolean method9(byte arg0) {
        field3345++;
        boolean var2 = true;
        if (!this.field3353.method2463((byte) 92, this.field3352.field8018)) {
            var2 = false;
        }
        if (!this.field3346.method2463(arg0, this.field3352.field8018)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)V")
    public final void method12(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = this.field3352.field8009.method2395(class12.field92, (byte) -48, this.field3352.field8020) + this.field3352.field8013;
            int var4 = this.field3352.field8011.method1280(true, class181.field2143, this.field3352.field8022) + this.field3352.field8019;
            this.field3348.method459(this.field3352.field8014, this.field3352.field8010, null, null, this.field3352.field8020, null, this.field3352.field8025, 0, this.field3352.field8016, var3, 0, this.field3352.field8012, this.field3352.field8024, this.field3352.field8022, var4, 0);
        }
        int var5 = -73 / ((-arg1 - 56) / 42);
        field3347++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public final void method11(int arg0) {
        field3350++;
        if (arg0 == 23169) {
            class535 var2 = class618.method3528(this.field3346, (byte) 101, this.field3352.field8018);
            this.field3348 = class275.field3370.method373(var2, class155.method959(this.field3353, this.field3352.field8018), true);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lig;I)V")
    public static final void method1614(class244 arg0, int arg1) {
        field3351++;
        for (int var2 = 0; var2 < class267.field3327; var2++) {
            int var3 = arg0.method1463(3010);
            int var4 = arg0.method1476(arg1 + 19);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class341.field4407[var3] != null) {
                class341.field4407[var3].field9071 = var4;
            }
        }
        if (arg1 != -1) {
            field3354 = -109;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public static void method1615(int arg0) {
        field3349 = null;
        if (arg0 != -1) {
            field3349 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Loh;Loh;Lk;)V")
    public class271(class404 arg0, class404 arg1, class563 arg2) {
        this.field3352 = arg2;
        this.field3346 = arg1;
        this.field3353 = arg0;
    }
}
