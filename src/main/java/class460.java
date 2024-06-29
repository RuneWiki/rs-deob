import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class460 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public int field6474;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Ltm;")
    public static class112 field6477 = new class112("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Z")
    public static boolean field6481 = true;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "[I")
    public static int[] field6483 = new int[3];

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field6484 = 1400;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Lmq;")
    public static class104 field6479 = new class104(200);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lfc;")
    public static class343 field6480;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "[Z")
    public static boolean[] field6482;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method2718(int arg0, byte arg1) {
        field6473++;
        for (class180 var2 = class233.field3288.method2615((byte) -18); var2 != null; var2 = class233.field3288.method2619((byte) -98)) {
            if (((long) arg0) == (var2.field2608 >> 48 & 0xFFFFL)) {
                var2.method1182(28818);
            }
        }
        if (arg1 >= -118) {
            field6481 = false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "toString", descriptor = "()Ljava/lang/String;", line = 26)
    public final String toString() {
        field6485++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)Z", line = 36)
    public static final boolean method2719(byte arg0) {
        if (arg0 != -15) {
            method2719((byte) -113);
        }
        field6475++;
        return class123.field1705;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 54)
    public static void method2720(int arg0) {
        field6480 = null;
        field6477 = null;
        field6479 = null;
        field6482 = null;
        if (arg0 != -14508) {
            method2722(71, -11L);
        }
        field6483 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZZ)I", line = 69)
    public static final int method2721(int arg0, int arg1, boolean arg2, boolean arg3) {
        field6478++;
        class459 var4 = class27.method228((byte) 96, arg2, arg1);
        if (var4 == null) {
            return -1;
        } else {
            if (!arg3) {
                method2721(35, 4, true, false);
            }
            return arg0 >= 0 && arg0 < var4.field6464.length ? var4.field6464[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IJ)V", line = 93)
    public static final void method2722(int arg0, long arg1) {
        class366.field5214.field5830 = 0;
        field6476++;
        class366.field5214.method2470((byte) -74, class430.field5936.field6474);
        if (arg0 >= -72) {
            field6484 = 94;
        }
        class366.field5214.method2471(26505, arg1);
        class350.field4792 = 0;
        class73.field1058 = 1;
        class338.field4632 = -3;
        class255.field3579 = 0;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(II)V", line = 120)
    public class460(int arg0, int arg1) {
        this.field6474 = arg0;
    }
}
