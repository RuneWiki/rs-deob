import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class230 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[S")
    public static short[] field3221 = new short[256];

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lsn;")
    public static class205 field3220 = new class205(13, 17);

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lkc;")
    public static class157 field3222 = new class157("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Lrq;")
    public static class39 field3223;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[Lo;")
    public static class359[] field3224;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lnb;I)Lnb;")
    public abstract class225 method843(class225 arg0, int arg1);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method1411(int arg0) {
        field3220 = null;
        if (arg0 > -44) {
            field3221 = null;
        }
        field3224 = null;
        field3223 = null;
        field3221 = null;
        field3222 = null;
    }
}
