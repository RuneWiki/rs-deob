import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class234 {

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "J")
    public static volatile long field3861 = 0L;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILrg;Lrg;B)Lph;", line = 35)
    public static final class71 method1622(int arg0, int arg1, class88 arg2, class88 arg3, byte arg4) {
        field3858++;
        if (class96.method763((byte) 70, arg0, arg1, arg3)) {
            if (arg4 != 104) {
                field3861 = 115L;
            }
            return class253.method1732(arg2.method636(arg0, (byte) 84, arg1), arg4 ^ 0xFFFFFF96);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 84)
    public static final void method1623(int arg0) {
        field3859++;
        if (client.field4041 != null) {
            client.field4041.method1650((byte) -118);
            client.field4041 = null;
        }
        class196.method1402(695633762);
        class143.method1061();
        for (int var1 = 0; var1 < 4; var1++) {
            class310.field5292[var1].method1177((byte) -24);
        }
        class274.method1922((byte) -68);
        System.gc();
        class262.method1827(2, 88);
        class124.field2070 = -1;
        class148.field2505 = false;
        class121.method900(true, 0);
        class268.field4615 = 0;
        class197.field3355 = 0;
        class250.field4221 = false;
        for (int var2 = 0; var2 < class108.field1824.length; var2++) {
            class108.field1824[var2] = null;
        }
        class309.field5269 = 0;
        class282.field4858 = 0;
        for (int var3 = arg0; var3 < 2048; var3++) {
            class151.field2555[var3] = null;
            class85.field1380[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class82.field1334[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class16.field230[var5][var6][var7] = null;
                }
            }
        }
        class271.method1880((byte) -108);
        class93.field1604 = 0;
        class199.method1428(true, arg0 + 117);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljc;BLjc;)V", line = 227)
    public static final void method1624(class285 arg0, byte arg1, class285 arg2) {
        field3862++;
        if (arg0.field4901 != null) {
            arg0.method2024((byte) 91);
        }
        if (arg1 == -46) {
            arg0.field4901 = arg2;
            arg0.field4907 = arg2.field4907;
            arg0.field4901.field4907 = arg0;
            arg0.field4907.field4901 = arg0;
        }
    }
}
