import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class20 extends class166 {

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Lcd;")
    private static class23 field412 = class54.method414("Welcome to RuneScape", -1);

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lcd;")
    public static class23 field419 = class54.method414(" <col=ffffff>", -1);

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Lcd;")
    public static class23 field423 = field412;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "Lcd;")
    private static class23 field425 = class54.method414("Prepared visibility map", -1);

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "Lcd;")
    public static class23 field422 = class54.method414("Schrifts-=tze geladen)3", -1);

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "Lcd;")
    private static class23 field424 = class54.method414("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", -1);

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lcd;")
    public static class23 field416 = field424;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Lcd;")
    public static class23 field415 = field425;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "Lcd;")
    public static class23 field426 = class54.method414("(U(Y", -1);

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lug;")
    public class186 field411;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lfe;")
    public static class51 field414;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "Lgd;")
    public class58 field421;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "[B")
    public byte[] field413;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static final void method127(boolean arg0) {
        if (!arg0) {
            method128(-14, (byte) 102);
        }
        field420++;
        if (class160.field3194 != null) {
            class200 var1 = class160.field3194;
            synchronized (class160.field3194) {
                class160.field3194 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Lke;")
    public static final class94 method128(int arg0, byte arg1) {
        field417++;
        class94 var2 = (class94) class81.field1766.method995(105, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class8.field148.method651(4, arg0, 12);
        if (arg1 <= 13) {
            method129(-75);
        }
        class94 var4 = new class94();
        if (var3 != null) {
            var4.method616(new class189(var3), -4);
        }
        var4.method613(25963);
        class81.field1766.method990(var4, (long) arg0, 125);
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public static void method129(int arg0) {
        field412 = null;
        field425 = null;
        field414 = null;
        field422 = null;
        field416 = null;
        field419 = null;
        if (arg0 != 0) {
            method128(-20, (byte) 106);
        }
        field415 = null;
        field423 = null;
        field424 = null;
        field426 = null;
    }
}
