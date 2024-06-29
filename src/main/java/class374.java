import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class374 implements class401 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5666 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "[[B")
    public static byte[][] field5668 = new byte[250][];

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 3)
    public static void method2326(int arg0) {
        field5668 = null;
        if (arg0 != 115) {
            field5666 = 65;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)I", line = 15)
    public static final int method2327(boolean arg0) {
        if (arg0) {
            field5669++;
            return 16;
        } else {
            return -100;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JLef;I[I)Ljava/lang/String;", line = 35)
    public final String method2328(long arg0, class335 arg1, int arg2, int[] arg3) {
        field5671++;
        if (class463.field6936 == arg1) {
            class308 var6 = class365.field5520.method886(arg3[0], (byte) -78);
            return var6.method2020(arg2 ^ 0x32, (int) arg0);
        } else if (class129.field2049 == arg1 || class60.field1057 == arg1) {
            class134 var7 = class367.field5550.method1312((byte) 91, (int) arg0);
            return var7.field2133;
        } else {
            if (arg2 != 0) {
                this.method2328(125L, null, -92, null);
            }
            return class399.field6020 == arg1 || class318.field4780 == arg1 || class130.field2064 == arg1 ? class365.field5520.method886(arg3[0], (byte) -78).method2020(50, (int) arg0) : null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BC)C", line = 71)
    public static final char method2329(byte arg0, char arg1) {
        field5670++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else if (arg0 == 82) {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        } else {
            return '\u0004';
        }
    }
}
