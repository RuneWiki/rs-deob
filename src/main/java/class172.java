import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class172 {

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Lfi;")
    public class374 field2654 = new class374();

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "Lig;")
    public static class154 field2656;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Lfi;")
    private class374 field2658;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Lfi;")
    public final class374 method1074(int arg0) {
        field2655++;
        if (arg0 != 24302) {
            field2656 = null;
        }
        class374 var2 = this.field2654.field5456;
        if (this.field2654 == var2) {
            this.field2658 = null;
            return null;
        } else {
            this.field2658 = var2.field5456;
            return var2;
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)Lfi;")
    public final class374 method1075(int arg0) {
        field2657++;
        class374 var2 = this.field2658;
        if (this.field2654 == var2) {
            this.field2658 = null;
            return null;
        }
        this.field2658 = var2.field5456;
        if (arg0 <= 120) {
            this.field2654 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
    public final void method1076(byte arg0) {
        while (true) {
            class374 var2 = this.field2654.field5456;
            if (this.field2654 == var2) {
                field2659++;
                this.field2658 = null;
                if (arg0 != -104) {
                    this.method1076((byte) -89);
                    return;
                }
                return;
            }
            var2.method2251(arg0 ^ 0xFFFF8A9F);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lfi;B)V")
    public final void method1077(class374 arg0, byte arg1) {
        if (arg1 != 28) {
            return;
        }
        if (arg0.field5454 != null) {
            arg0.method2251(29959);
        }
        field2660++;
        arg0.field5456 = this.field2654;
        arg0.field5454 = this.field2654.field5454;
        arg0.field5454.field5456 = arg0;
        arg0.field5456.field5454 = arg0;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
    public static void method1078(int arg0) {
        if (arg0 == 31215) {
            field2656 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
    public class172() {
        this.field2654.field5454 = this.field2654;
        this.field2654.field5456 = this.field2654;
    }
}
