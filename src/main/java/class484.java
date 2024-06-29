import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class484 {

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Lgba;")
    public static class625 field6543 = null;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "Lmf;")
    public static class388 field6545 = new class388();

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field6548 = -1;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field6549 = new String[100];

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Lbi;")
    public static class449 field6544;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)I", line = 3)
    public static final int method2702(int arg0, int arg1, int arg2) {
        if (arg0 != 256) {
            method2704((byte) 27);
        }
        field6541++;
        return arg2 == 4 || arg2 == 5 ? class201.field2923[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLno;)V", line = 22)
    public static final void method2703(byte arg0, class658 arg1) {
        if (class702.field9898 == null) {
            class329 var2 = new class329();
            byte[] var3 = var2.method1967(16, 128, 16384, 128);
            class702.field9898 = class230.method1443(var3, (byte) -106, false);
        }
        if (arg0 >= -42) {
            method2703((byte) -44, null);
        }
        field6547++;
        if (class172.field2650 == null) {
            class680 var4 = new class680();
            byte[] var5 = var4.method3796(128, 128, -26694, 16);
            class172.field2650 = class230.method1443(var5, (byte) -106, false);
        }
        class109 var6 = arg1.field9188;
        if (var6.method809((byte) -109) && class11.field212 == null) {
            byte[] var7 = class141.method1034((byte) 81, 8, 128, 4.0F, 0.6F, 16, 0.5F, new class623(419684), 16.0F, 4.0F, 128);
            class11.field212 = class230.method1443(var7, (byte) -106, false);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 70)
    public static void method2704(byte arg0) {
        field6549 = null;
        field6543 = null;
        field6544 = null;
        field6545 = null;
        int var1 = 90 / ((17 - arg0) / 58);
    }
}
