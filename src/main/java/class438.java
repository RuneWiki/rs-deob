import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class438 extends class41 {

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lao;")
    public static class188 field6381 = new class188(108, 7);

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Lgf;")
    public static class180 field6392 = new class180("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Z")
    public static boolean field6394 = false;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public int field6380;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public int field6382;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public int field6385;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lao;")
    public static class188 field6388;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Z")
    public boolean field6386;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V", line = 9)
    public final void method117(int arg0) {
        if (arg0 <= -127) {
            field6383++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)Z", line = 21)
    public final boolean method121(int arg0) {
        field6390++;
        if (arg0 != 26923) {
            this.method117(62);
        }
        return false;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V", line = 39)
    public static final void method2660(int arg0, boolean arg1) {
        if (arg1 && class2.field19 != null) {
            class357.field5407 = class2.field19.field2136;
        } else {
            class357.field5407 = -1;
        }
        field6387++;
        class373.field5588 = null;
        class2.field19 = null;
        class73.field1229 = 0;
        int var2 = 4 / ((arg0 - 47) / 52);
        class282.field4093 = null;
        class2.method13();
        class2.field23.method2264(96);
        class504.field7389 = -1;
        class389.field5756 = null;
        class360.field5440 = null;
        class511.field7539 = -1;
        class242.field3511 = null;
        class518.field7613 = null;
        class226.field3304 = null;
        class246.field3569 = null;
        class121.field1896 = null;
        class335.field5138 = null;
        class503.field7374 = null;
        class2.field26 = null;
        class2.field15.method1833((byte) -112);
        class2.field16.method1762(64, 64, -71);
        class2.field15.method1834((byte) -3, 128, 64);
        class2.field20.method616((byte) -82, 64);
        class369.field5528.method718(64, -5328);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILqa;IZLha;I)V", line = 76)
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        if (arg3 >= 5) {
            field6384++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 96)
    public static void method2661(int arg0) {
        field6392 = null;
        if (arg0 <= 101) {
            method2661(-123);
        }
        field6388 = null;
        field6381 = null;
    }
}
