import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class291 {

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Lm;")
    public class71 field3847 = new class71();

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Z")
    public boolean field3848 = false;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "[S")
    public static short[] field3842 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lcq;")
    public static class72 field3846 = new class72("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field3850;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Lwo;")
    public static class285 field3843;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 4)
    public static void method1861(int arg0) {
        if (arg0 == 8597) {
            field3842 = null;
            field3843 = null;
            field3846 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLbg;)Lsr;", line = 26)
    public static final class304 method1862(boolean arg0, class242 arg1) {
        field3845++;
        if (arg0) {
            field3842 = null;
        }
        return new class304(arg1.method1582(arg0), arg1.method1582(false), arg1.method1582(arg0), arg1.method1582(false), arg1.method1582(false), arg1.method1582(arg0), arg1.method1582(false), arg1.method1582(false), arg1.method1545(8), arg1.method1563(-128));
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZII)Z", line = 38)
    public static final boolean method1863(boolean arg0, int arg1, int arg2) {
        field3844++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class446 var3 = class380.method2361(arg1, -29012);
        if (arg0) {
            field3846 = null;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method2768(arg2, (byte) -90);
    }
}
