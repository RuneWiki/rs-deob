import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class404 {

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lg;")
    public class87 field5888 = new class87();

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field5884 = 0;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field5892 = 0;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field5887 = 1;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Z")
    public static boolean field5889 = true;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lg;")
    private class87 field5891;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Lg;", line = 4)
    public final class87 method2557(byte arg0) {
        field5886++;
        class87 var2 = this.field5891;
        if (arg0 != 108) {
            return null;
        } else if (this.field5888 == var2) {
            this.field5891 = null;
            return null;
        } else {
            this.field5891 = var2.field975;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLg;)V", line = 27)
    public final void method2558(byte arg0, class87 arg1) {
        if (arg0 >= -53) {
            return;
        }
        field5885++;
        if (arg1.field974 != null) {
            arg1.method475(102);
        }
        arg1.field974 = this.field5888.field974;
        arg1.field975 = this.field5888;
        arg1.field974.field975 = arg1;
        arg1.field975.field974 = arg1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 52)
    public final void method2559(int arg0) {
        while (true) {
            class87 var2 = this.field5888.field975;
            if (this.field5888 == var2) {
                field5883++;
                this.field5891 = null;
                if (arg0 != 1) {
                    field5892 = 56;
                    return;
                }
                return;
            }
            var2.method475(95);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 118)
    public class404() {
        this.field5888.field974 = this.field5888;
        this.field5888.field975 = this.field5888;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)Lg;", line = 93)
    public final class87 method2560(byte arg0) {
        field5893++;
        class87 var2 = this.field5888.field975;
        if (this.field5888 == var2) {
            this.field5891 = null;
            return null;
        } else if (arg0 <= 93) {
            return null;
        } else {
            this.field5891 = var2.field975;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V", line = 133)
    public static final void method2561(int arg0, byte arg1) {
        class329.field4707.method2054(96, arg0);
        if (arg1 > 61) {
            field5890++;
        }
    }
}
