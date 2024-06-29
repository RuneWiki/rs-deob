import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class83 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Z")
    public static boolean field1454 = false;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lub;")
    private static class227 field1456 = class257.method1749("K", 17263);

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lub;")
    public static class227 field1457 = field1456;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1461 = 0;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "J")
    public static long field1462 = 0L;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lub;")
    public static class227 field1464 = field1456;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "[J")
    public static long[] field1463 = new long[1000];

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lnh;")
    public static class57 field1459;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static void method505(boolean arg0) {
        field1457 = null;
        if (arg0) {
            method506(-111);
        }
        field1456 = null;
        field1463 = null;
        field1464 = null;
        field1459 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static final void method506(int arg0) {
        field1460++;
        if (arg0 <= 90) {
            field1462 = -116L;
        }
        class116.field2131 = class230.field4028;
        class12.method59(false, (byte) 112);
        class9.method35((byte) -79);
        class60.method372((byte) -88, class116.field2131);
        class216.field3639 = new class225();
        class216.field3639.field99 = 3000;
        class216.field3639.field50 = 3000;
        class98.method603((byte) 75, class94.field1639);
        class12.method60(10, 111);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method507(int arg0, int arg1) {
        field1455++;
        if (arg1 == 100 && class46.field818 > 0) {
            byte[] var2 = class25.field421[--class46.field818];
            class25.field421[class46.field818] = null;
            return var2;
        } else if (arg1 == 5000 && class151.field2631 > 0) {
            byte[] var3 = class198.field3398[--class151.field2631];
            class198.field3398[class151.field2631] = null;
            return var3;
        } else if (arg1 == 30000 && class186.field3159 > 0) {
            byte[] var4 = class174.field2907[--class186.field3159];
            class174.field2907[class186.field3159] = null;
            return var4;
        } else {
            if (arg0 != 0) {
                field1461 = 16;
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()V")
    public static final void method508() {
        for (int var0 = 0; var0 < class156.field2677; var0++) {
            for (int var5 = 0; var5 < class15.field285; var5++) {
                for (int var6 = 0; var6 < class112.field2075; var6++) {
                    class261.field4539[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < client.field1431; var1++) {
            for (int var4 = 0; var4 < client.field1438[var1]; var4++) {
                client.field1437[var1][var4] = null;
            }
            client.field1438[var1] = 0;
        }
        for (int var2 = 0; var2 < class236.field4095; var2++) {
            class167.field2795[var2] = null;
        }
        class236.field4095 = 0;
        for (int var3 = 0; var3 < class69.field1221.length; var3++) {
            class69.field1221[var3] = null;
        }
    }
}
