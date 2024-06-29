import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class281 extends class97 {

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Lsf;")
    public static class398 field4298 = new class398();

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "[I")
    public static int[] field4300 = new int[2048];

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lpf;")
    public static class425 field4299 = new class425(17, 2);

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Z")
    public static boolean field4301 = false;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "[Llg;")
    public static class21[] field4303;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)B")
    public static final byte method1730(int arg0, int arg1, byte arg2) {
        field4295++;
        if (arg1 != 9) {
            return 0;
        } else if (arg2 == -86) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)J")
    public abstract long method460(int arg0);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static void method1731(byte arg0) {
        field4299 = null;
        if (arg0 <= 108) {
            method1731((byte) -114);
        }
        field4300 = null;
        field4298 = null;
        field4303 = null;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)I")
    public abstract int method467(int arg0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILiq;)V")
    public static final void method1732(int arg0, class134 arg1) {
        if (arg0 != -32665) {
            method1733(true);
        }
        field4297++;
        client.field6680 = arg1;
        class308.field4650 = client.field6680.method812(4, (byte) -41);
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)I")
    public abstract int method465(byte arg0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public static final void method1733(boolean arg0) {
        class319.field4812.method1482((byte) 82);
        field4296++;
        if (!arg0) {
            method1733(false);
        }
        class87.field1234.method1482((byte) 75);
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)I")
    public abstract int method461(int arg0);

    static {
        new class151(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
