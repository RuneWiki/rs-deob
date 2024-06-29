import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class137 extends class29 {

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public int field1872 = 0;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public static int field1875 = 0;

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1878;

    @OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!gr", name = "L", descriptor = "I")
    public static int field1879;

    static {
        new class409("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field1878 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field1880 = -1;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILat;)V", line = 3)
    private final void method910(int arg0, int arg1, class256 arg2) {
        if (arg1 == -3346) {
            field1873++;
            if (arg0 == 2) {
                this.field1872 = arg2.method1767(arg1 ^ 0x8CEF0C66);
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZI)I", line = 23)
    public static final int method911(int arg0, boolean arg1, int arg2) {
        field1879++;
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg2--;
        }
        if (arg1) {
            field1878 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)V", line = 44)
    public static final void method912(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class260.field3858[var1] = false;
        }
        field1876++;
        class244.field3612 = -1;
        class15.field238 = 0;
        class28.field402 = arg0;
        class447.field6538 = -1;
        class359.field5225 = 0;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Lcl;", line = 67)
    public static final class323 method913(int arg0, int arg1, int arg2) {
        class369 var3 = class178.field2530[arg0][arg1][arg2];
        return var3 == null || var3.field5346 == null ? null : var3.field5346;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(Z)V", line = 80)
    public static void method914(boolean arg0) {
        field1878 = null;
        if (!arg0) {
            field1875 = 54;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lat;I)V", line = 98)
    public final void method915(class256 arg0, int arg1) {
        field1877++;
        while (true) {
            int var3 = arg0.method1738((byte) 78);
            if (var3 == 0) {
                if (arg1 == 16659) {
                    return;
                } else {
                    method913(-111, 33, -61);
                    return;
                }
            }
            this.method910(var3, arg1 ^ 0xFFFFB3FD, arg0);
        }
    }
}
