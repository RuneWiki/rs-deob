import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class163 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2577 = "Started 3d Library";

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2581 = 0;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2585 = 0;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[[B")
    public static byte[][] field2578;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "[[Lwf;")
    public static class250[][] field2587;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1260(int arg0) {
        field2579++;
        class309.field4925 = 0;
        class356.field5645 = 0;
        class140.method1086(-115);
        class343.method2417(true);
        class79.method650((byte) -60);
        if (arg0 != 1) {
            method1262((byte) -11);
        }
        for (int var1 = 0; var1 < class309.field4925; var1++) {
            int var2 = class211.field3379[var1];
            if (class332.field5261 != class165.field2621[var2].field3550) {
                if (class165.field2621[var2].field4692.method961(false)) {
                    class123.method969((byte) -124, class165.field2621[var2]);
                }
                class165.field2621[var2].method2092(arg0 ^ 0xFFFFFFFE, (class121) null);
                class165.field2621[var2] = null;
            }
        }
        if (class223.field3706 != class29.field383.field3760) {
            throw new RuntimeException("gnp1 pos:" + class29.field383.field3760 + " psize:" + class223.field3706);
        }
        for (int var3 = 0; var3 < class35.field508; var3++) {
            if (class165.field2621[class330.field5253[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class35.field508);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)I", line = 68)
    public static final int method1261(int arg0, String arg1) {
        if (arg0 != 1) {
            field2578 = (byte[][]) ((byte[][]) null);
        }
        field2586++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)J", line = 79)
    public static final long method1262(byte arg0) {
        if (arg0 != 125) {
            field2581 = -116;
        }
        field2580++;
        return class336.field5311.method39((byte) -32);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)Lig;", line = 100)
    public static final class65 method1263(int arg0, byte arg1) {
        class65 var2 = (class65) class165.field2617.method2329((byte) 107, (long) arg0);
        field2584++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class321.field5113.method472(arg0, 99, 33);
        if (arg1 <= 72) {
            field2578 = (byte[][]) ((byte[][]) null);
        }
        class65 var4 = new class65();
        if (var3 != null) {
            var4.method558(arg0, 111, new class227(var3));
        }
        class165.field2617.method2333((long) arg0, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V", line = 127)
    public static void method1264(byte arg0) {
        field2577 = null;
        if (arg0 < -83) {
            field2578 = (byte[][]) null;
            field2587 = (class250[][]) null;
        }
    }
}
