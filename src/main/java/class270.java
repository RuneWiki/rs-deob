import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class270 extends class261 {

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "[B")
    public static byte[] field4094 = new byte[520];

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "Z")
    public static boolean field4095 = false;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "F")
    public static float field4103;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public int field4089;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "Lph;")
    public static class459 field4100;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "[I")
    public int[] field4091;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "[I")
    public int[] field4101;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "[I")
    public int[] field4102;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "[Lwp;")
    public class121[] field4097;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "[Lwp;")
    public class121[] field4099;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "[[[B")
    public byte[][][] field4093;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)V")
    public static void method1711(boolean arg0) {
        field4094 = null;
        field4100 = null;
        if (arg0) {
            method1712((byte) -119);
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
    public static final void method1712(byte arg0) {
        if (arg0 < -8) {
            field4090++;
            class427.field6393.method1614((byte) -24);
            class370.field5431.method1614((byte) -24);
        }
    }
}
