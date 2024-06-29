import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class315 extends class172 {

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "J")
    private long field4515 = -1L;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Ljava/lang/String;")
    private String field4516 = null;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Lgs;")
    public static class432 field4517 = new class432(15000);

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Lfm;")
    public static class279 field4518;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Luea;")
    public static class284 field4514;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLhia;)V", line = 6)
    public final void method100(byte arg0, class48 arg1) {
        arg1.method392(this.field4516, -1, this.field4515);
        if (arg0 != 71) {
            this.method102(121, null);
        }
        field4512++;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 19)
    public static void method2019(int arg0) {
        if (arg0 != -30674) {
            method2019(60);
        }
        field4517 = null;
        field4514 = null;
        field4518 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILgga;)V", line = 48)
    public final void method102(int arg0, class511 arg1) {
        if (arg0 != 2048) {
            return;
        }
        if (arg1.method3013(-107) != 255) {
            arg1.field6962--;
            this.field4515 = arg1.method3020(true);
        }
        field4513++;
        this.field4516 = arg1.method2998((byte) -114);
    }
}
