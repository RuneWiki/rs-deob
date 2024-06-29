import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class52 {

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field766 = 0;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field770 = 0;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "Lad;")
    public static class275 field762 = new class275(4);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method328(byte arg0) {
        field762 = null;
        if (arg0 != -114) {
            method329((class104) null, 44, 17, -77);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Luk;III)V")
    public static final void method329(class104 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 4) {
            method328((byte) -28);
        }
        field765++;
        if (arg0.field900 == arg1 && arg1 != -1) {
            class91 var4 = class159.method1085((byte) -63, arg1);
            int var5 = var4.field1453;
            if (var5 == 1) {
                arg0.field934 = 0;
                arg0.field984 = 1;
                arg0.field955 = 0;
                arg0.field951 = 0;
                arg0.field973 = arg3;
                class252.method1710(arg0.field934, arg0.field929, var4, arg0.field994, false, 116);
            }
            if (var5 == 2) {
                arg0.field955 = 0;
            }
        } else if (arg1 == -1 || arg0.field900 == -1 || class159.method1085((byte) -63, arg1).field1447 >= class159.method1085((byte) -63, arg0.field900).field1447) {
            arg0.field955 = 0;
            arg0.field900 = arg1;
            arg0.field951 = 0;
            arg0.field973 = arg3;
            arg0.field943 = arg0.field936;
            arg0.field984 = 1;
            arg0.field934 = 0;
            if (arg0.field900 == -1) {
                return;
            }
            class252.method1710(arg0.field934, arg0.field929, class159.method1085((byte) -63, arg0.field900), arg0.field994, false, 46);
        }
    }
}
