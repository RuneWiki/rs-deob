import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class163 {

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "J")
    public long field2347 = 0L;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lpj;")
    public static class98 field2332 = new class98(5000);

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lg;")
    public static class237 field2338 = new class237(0, 0);

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field2340 = 2;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field2348 = 1;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field2345 = 0;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "S")
    public static short field2343 = 256;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "[Z")
    public static boolean[] field2341 = new boolean[100];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public int field2331;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lca;")
    public class131 field2334;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lca;")
    public class131 field2335;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Lbc;")
    public static class282 field2346;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Lbd;")
    public static class81 field2344;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2342;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILbc;Lbc;)V")
    public static final void method1072(int arg0, class282 arg1, class282 arg2) {
        field2327++;
        class165.field2378 = arg1;
        class6.field75 = arg2;
        class165.field2378.method1874((byte) 18, 34);
        if (arg0 != 25702) {
            method1074(87);
        }
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 41.0D) - 20;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        class42.field519 = var3 + var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class233.field3365 = var5 + var4;
        class108.field1459 = var4 + var6;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method1073(byte arg0) {
        field2332 = null;
        field2344 = null;
        field2346 = null;
        field2338 = null;
        field2342 = null;
        field2341 = null;
        if (arg0 > -17) {
            field2338 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lmc;")
    public static final class176 method1074(int arg0) {
        if (arg0 != 0) {
            method1074(66);
        }
        field2330++;
        return class138.field2012.length > class285.field4400 ? class138.field2012[class285.field4400++] : null;
    }
}
