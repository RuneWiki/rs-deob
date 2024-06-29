import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class438 {

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field6181 = 0;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lhc;")
    public static class368 field6182 = new class368("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Lkm;")
    public class438 field6178;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Lkm;")
    public class438 field6179;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class352.field4736 = arg1;
        class422.field5844 = arg5;
        class442.field6202 = arg6;
        class86.field1210 = arg0;
        field6184++;
        if (arg3 <= 92) {
            method2696((byte) 123);
        }
        class174.field2481 = arg4;
        class448.field6351 = arg2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public final void method2695(int arg0) {
        field6180++;
        if (this.field6178 == null) {
            return;
        }
        this.field6178.field6179 = this.field6179;
        this.field6179.field6178 = this.field6178;
        this.field6179 = null;
        if (arg0 == 0) {
            this.field6178 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static void method2696(byte arg0) {
        if (arg0 >= -87) {
            field6183 = 95;
        }
        field6182 = null;
    }
}
