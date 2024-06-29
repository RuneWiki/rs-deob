import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class29 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field416 = null;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 4)
    public static void method193(int arg0) {
        field416 = null;
        if (arg0 != 0) {
            method196(null, false);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BB)Z", line = 15)
    public static final boolean method194(byte arg0, byte arg1) {
        if (arg0 > -79) {
            field416 = null;
        }
        field417++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class286.field3555[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)I", line = 39)
    public final int method195(int arg0, int arg1, int arg2) {
        if (arg2 > -82) {
            field416 = null;
        }
        field415++;
        int var4 = class244.field3022 > arg0 ? class244.field3022 : arg0;
        if (class602.field8471 == this) {
            return 0;
        } else if (class16.field259 == this) {
            return var4 - arg1;
        } else if (class676.field9488 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "toString", descriptor = "()Ljava/lang/String;", line = 65)
    public final String toString() {
        field413++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lni;Z)V", line = 74)
    public static final void method196(class687 arg0, boolean arg1) {
        if (arg0 instanceof class307) {
            class307 var2 = (class307) arg0;
            if (var2.field3902 != null) {
                class168.method965(var2, class376.field4748.field6470 != var2.field6470, (byte) -110);
            }
        } else if (arg0 instanceof class514) {
            class514 var3 = (class514) arg0;
            class469.method2487(class376.field4748.field6470 != var3.field6470, 6592, var3);
        }
        field414++;
        if (arg1) {
            method193(-18);
        }
    }
}
