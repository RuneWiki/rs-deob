import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class328 extends class97 {

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "Ljc;")
    public static class305 field4355 = new class305("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!cq", name = "L", descriptor = "Ljc;")
    public static class305 field4357 = new class305("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!cq", name = "O", descriptor = "I")
    public static int field4360 = 0;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "I")
    public static int field4361 = 0;

    @OriginalMember(owner = "client!cq", name = "R", descriptor = "Lao;")
    public static class191 field4363 = new class191(8, 6);

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!cq", name = "K", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!cq", name = "N", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!cq", name = "Q", descriptor = "Lgf;")
    public static class183 field4362;

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "[B")
    private byte[] field4354;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "(B)V", line = 3)
    public static void method1927(byte arg0) {
        field4357 = null;
        field4362 = null;
        field4363 = null;
        if (arg0 >= -15) {
            field4355 = null;
        }
        field4355 = null;
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V", line = 17)
    public static final void method1928(int arg0) {
        class421.field6105 = class293.field3883.field2369 + class293.field3883.field2366 + 2;
        class380.field5508 = class121.field1570.field2369 + class121.field1570.field2366 + 2;
        class176.field2278 = new String[500];
        field4358++;
        if (arg0 != 7806) {
            method1927((byte) -66);
        }
        for (int var1 = 0; var1 < class176.field2278.length; var1++) {
            class176.field2278[var1] = "";
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIII)[B", line = 38)
    public final byte[] method1929(byte arg0, int arg1, int arg2, int arg3) {
        field4353++;
        this.field4354 = new byte[arg1 * arg2 * arg3 * 2];
        if (arg0 < 14) {
            this.method1929((byte) -68, -125, 83, 45);
        }
        this.method3026(arg3, arg2, arg1, -105);
        return this.field4354;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V", line = 52)
    public class328() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(IIB)V", line = 55)
    public final void method557(int arg0, int arg1, byte arg2) {
        field4356++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field4354[var10001] = (byte) (var5 * 3 >> 5);
        if (arg1 == -22513) {
            this.field4354[var6] = (byte) (var5 * 3 >> 5);
        }
    }
}
