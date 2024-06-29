import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lsc;")
    public static class128 field513 = class129.method1017(false, "Null");

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lrb;")
    public static class120 field520 = new class120(128);

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field523 = 0;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field529 = 1;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field530 = 0;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field525 = 0;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Lsc;")
    private static class128 field531 = class129.method1017(false, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lsc;")
    public static class128 field526 = field531;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Lrc;")
    public static class121 field522 = new class121();

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public int field512;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lsf;")
    public static class131 field532;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lwc;")
    public class156 field511;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lwc;")
    public class156 field514;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lwc;")
    public class156 field516;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lnb;")
    public static class92 field521;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "[I")
    public static int[] field533;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)Ljb;")
    public static final class64 method230(byte arg0, int arg1) {
        field528++;
        class64 var2 = (class64) class131.field3036.method917((long) arg1, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class134.field3147.method1023(arg1, 10, (byte) -35);
        class64 var4 = new class64();
        var4.field1425 = arg1;
        if (var3 != null) {
            var4.method480(true, new class86(var3));
        }
        var4.method476((byte) 86);
        if (var4.field1371 != -1) {
            var4.method477(method230((byte) -44, var4.field1403), method230((byte) -44, var4.field1371), 1);
        }
        if (!class62.field1331 && var4.field1375) {
            var4.field1364 = null;
            var4.field1378 = class42.field788;
            var4.field1407 = null;
            var4.field1392 = 0;
        }
        if (arg0 != -44) {
            field523 = -85;
        }
        class131.field3036.method913((long) arg1, var4, (byte) 77);
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method231(int arg0) {
        field513 = null;
        field532 = null;
        field533 = null;
        field526 = null;
        if (arg0 != 0) {
            field515 = 112;
        }
        field522 = null;
        field520 = null;
        field521 = null;
        field531 = null;
    }
}
