import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class323 extends class309 {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Z")
    public boolean field4770 = false;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Z")
    public boolean field4775 = false;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[I")
    public static int[] field4767;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "Z")
    public static boolean field4773;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "[I")
    public static int[] field4768;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Lvq;")
    public static class24 field4769;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "[[I")
    public static int[][] field4777;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "[[I")
    public static int[][] field4774;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lct;Lct;Lct;I)V")
    public static final void method2121(class104 arg0, class104 arg1, class104 arg2, int arg3) {
        if (arg3 != 1) {
            field4768 = null;
        }
        field4765++;
        class79.field994 = arg1;
        class115.method803(arg0, true, arg2);
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(B)V")
    public static void method2122(byte arg0) {
        field4767 = null;
        field4777 = null;
        field4774 = null;
        field4768 = null;
        int var1 = 61 / ((arg0 - 50) / 57);
        field4769 = null;
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(B)V")
    public static final void method2123(byte arg0) {
        for (class463 var1 = (class463) class184.field2596.method2025(-65536); var1 != null; var1 = (class463) class184.field2596.method2025(-65536)) {
            class119.method813(var1, true);
        }
        field4772++;
        int var2;
        int var3;
        if (class163.method1082((byte) 95)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class276.field4085;
            var3 = class276.field4085;
        }
        client.method1807();
        if (arg0 < 112) {
            return;
        }
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1805();
            client.method1801(var4);
            client.method1802(var4);
        }
        client.method1797();
        client.method1803();
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIZZ)V")
    public class323(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field4771 = arg0;
        this.field4766 = arg1;
        this.field4770 = arg4;
        this.field4764 = arg2;
        this.field4775 = arg3;
    }

    static {
        new class289(64);
        field4767 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
        field4773 = true;
        field4768 = new int[5];
        field4769 = new class24(41, 3);
        field4777 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
    }
}
