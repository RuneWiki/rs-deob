import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class97 {

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "Lfq;")
    public static class141 field1210 = new class141(6, 0, 4, 2);

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
    public static final void method651(byte arg0) {
        if (arg0 >= -18) {
            method654((byte) 99);
        }
        field1208++;
        class614.method3369(11, (byte) -91);
        class350.method2056(true);
        System.gc();
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLnga;)[Lrha;")
    public static final class434[] method652(byte arg0, class256 arg1) {
        field1211++;
        if (!arg1.method1554((byte) 120)) {
            return new class434[0];
        }
        class435 var2 = arg1.method1550((byte) -47);
        while (var2.field6124 == 0) {
            class517.method2965(10L, -92);
        }
        if (var2.field6124 == 2) {
            return new class434[0];
        } else if (arg0 == -1) {
            int[] var3 = (int[]) var2.field6123;
            class434[] var4 = new class434[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class434 var6 = new class434();
                var4[var5] = var6;
                var6.field6121 = var3[var5 << 2];
                var6.field6117 = var3[(var5 << 2) + 1];
                var6.field6120 = var3[(var5 << 2) + 2];
                var6.field6118 = var3[(var5 << 2) + 3];
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V")
    public static void method653(byte arg0) {
        if (arg0 != -73) {
            method653((byte) -51);
        }
        field1210 = null;
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(B)J")
    public static final synchronized long method654(byte arg0) {
        field1209++;
        long var1 = System.currentTimeMillis();
        if (class162.field2074 > var1) {
            class88.field1120 += class162.field2074 - var1;
        }
        class162.field2074 = var1;
        if (arg0 <= 41) {
            field1210 = null;
        }
        return class88.field1120 + var1;
    }
}
