import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class534 extends class498 {

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public int field7829;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public int field7828;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "Ltn;")
    public static class60 field7826 = new class60(37, 3);

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "Ltn;")
    public static class60 field7830 = new class60(72, 7);

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field7827;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "Lclient;")
    public static client field7831;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3142(boolean arg0) {
        field7831 = null;
        field7826 = null;
        field7830 = null;
        if (arg0) {
            field7826 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 28)
    public static final String method3143(long arg0, int arg1) {
        field7827++;
        class384.field5410.setTime(new Date(arg0));
        if (arg1 != 29541) {
            return null;
        }
        int var3 = class384.field5410.get(7);
        int var4 = class384.field5410.get(5);
        int var5 = class384.field5410.get(2);
        int var6 = class384.field5410.get(1);
        int var7 = class384.field5410.get(11);
        int var8 = class384.field5410.get(12);
        int var9 = class384.field5410.get(13);
        return class393.field5527[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class384.field5401[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(II)V", line = 55)
    public class534(int arg0, int arg1) {
        this.field7829 = arg0;
        this.field7828 = arg1;
    }
}
