import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class140 extends class401 implements class293 {

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "Z")
    public static boolean field1703 = false;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "Lcea;")
    public static class180 field1696 = new class180("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z", line = 5)
    public final boolean method439(int arg0, Source arg1, int arg2, int arg3) {
        super.method2296(arg1, arg0, arg2 - 26169);
        if (arg2 == 26190) {
            field1697++;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZII)Z", line = 21)
    public final boolean method444(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method443(-91);
        }
        field1699++;
        super.method644(-121, arg1);
        return true;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)I", line = 37)
    public final int method441(int arg0) {
        if (arg0 != 16304) {
            method779((byte) -90);
        }
        field1700++;
        return super.method441(16304);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V", line = 50)
    public static void method779(byte arg0) {
        field1696 = null;
        if (arg0 != -87) {
            field1703 = true;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BII)Z", line = 60)
    public static final boolean method780(byte arg0, int arg1, int arg2) {
        field1702++;
        return arg0 >= -74 ? true : class199.method1073(arg2, false, arg1) & class358.method2012(1, arg2, arg1);
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ltm;Z)V", line = 74)
    public class140(class327 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 77)
    public final Buffer method440(int arg0, boolean arg1) {
        if (arg0 > -97) {
            field1696 = null;
        }
        field1701++;
        return super.method440(-108, arg1);
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)Z", line = 88)
    public final boolean method442(int arg0) {
        field1698++;
        int var2 = 43 % (-arg0 / 63);
        return this.method442(-109);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V", line = 99)
    public final void method443(int arg0) {
        field1704++;
        super.method443(arg0);
    }
}
