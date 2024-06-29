import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class353 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Z")
    public boolean field5506 = false;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public int field5512 = 0;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public int field5510 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lfh;")
    public static class140 field5507;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lwf;")
    public static class333 field5508;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Llk;")
    public class34 field5513;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field5511;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 8)
    public static void method2453(int arg0) {
        field5508 = null;
        if (arg0 == 0) {
            field5507 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I", line = 21)
    public static final int method2454(byte arg0) {
        if (arg0 < 96) {
            method2453(110);
        }
        field5509++;
        return class56.field719 == 0 ? 0 : class84.field1081[class56.field719].method128();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ltf;B)V", line = 36)
    public static final void method2455(class162 arg0, byte arg1) {
        arg0.field2310 = false;
        if (arg1 != 24) {
            method2454((byte) -8);
        }
        field5514++;
        if (arg0.field2308 != null) {
            arg0.field2308.field540 = 0;
        }
        for (class162 var2 = arg0.method284(); var2 != null; var2 = arg0.method285()) {
            method2455(var2, (byte) 24);
        }
    }
}
