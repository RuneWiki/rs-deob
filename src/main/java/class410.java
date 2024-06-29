import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class410 extends InputStream {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lal;")
    public static class52 field6080 = new class52(32);

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "S")
    public static short field6082 = 205;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lmo;")
    public static class447 field6078;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method2572(int arg0) {
        class224.field3736.method335((byte) -41);
        if (arg0 != -1) {
            method2572(43);
        }
        field6077++;
    }

    @OriginalMember(owner = "client!kb", name = "read", descriptor = "()I")
    public final int read() {
        class84.method517((byte) 123, 30000L);
        field6079++;
        return -1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)I")
    public static final int method2573(int arg0, byte arg1) {
        field6081++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg1 >= -4) {
            method2573(7, (byte) -51);
        }
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static final void method2574(int arg0) {
        field6076++;
        if (arg0 != -1) {
            method2572(53);
        }
        class378.field5701 = true;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static void method2575(int arg0) {
        field6078 = null;
        field6080 = null;
        if (arg0 != 1976897985) {
            method2574(67);
        }
    }
}
