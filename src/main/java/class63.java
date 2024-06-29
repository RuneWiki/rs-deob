import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class63 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field1093 = 0;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lci;")
    public static class60 field1092 = new class60();

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[S")
    public static short[] field1094 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lsf;")
    public static class252 field1096 = new class252();

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[Z")
    public static boolean[] field1095;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static final void method398(int arg0) {
        class126.field2211 = 0;
        field1089++;
        int var1 = (class273.field4378.field1397 >> 7) + class126.field2206;
        int var2 = (class273.field4378.field1458 >> 7) + class255.field4162;
        if (arg0 <= var1 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class126.field2211 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class126.field2211 = 1;
        }
        if (class126.field2211 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class126.field2211 = 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method399(byte arg0) {
        field1092 = null;
        if (arg0 >= 69) {
            field1096 = null;
            field1094 = null;
            field1095 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method400(String arg0, int arg1) {
        field1090++;
        int var2 = class113.method792(arg0, 0);
        if (arg1 != 64) {
            method399((byte) 84);
        }
        return var2 == -1 ? "" : class267.method1757("<br>", class252.field4135.field3152[var2], " ", -120);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
    public static final void method401(int arg0, int arg1, int arg2, int arg3) {
        field1088++;
        class268.method1765(false, 101);
        class5.field62 = arg0;
        class106.field1890 = arg2;
        class100.method632(arg1, -96);
        if (arg3 != 0) {
            method402((byte) 123);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public static final void method402(byte arg0) {
        field1091++;
        if (class194.field3131 != null) {
            class194.field3131.method1380(true);
            class194.field3131 = null;
        }
        class225.method1512((byte) -55);
        class243.method1601();
        for (int var1 = 0; var1 < 4; var1++) {
            class99.field1699[var1].method1232(-123);
        }
        class268.method1765(false, 85);
        System.gc();
        class161.method1093((byte) -111, 2);
        class155.field2590 = -1;
        class175.field2874 = false;
        class186.method1223(6554, true);
        class255.field4162 = 0;
        class59.field1031 = 0;
        class96.field1654 = 0;
        class126.field2206 = 0;
        class216.field3649 = false;
        for (int var2 = 0; var2 < class26.field398.length; var2++) {
            class26.field398[var2] = null;
        }
        class187.field3037 = 0;
        class157.field2624 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class105.field1874[var3] = null;
            class53.field930[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class42.field625[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class255.field4163[var5][var6][var7] = null;
                }
            }
        }
        class99.method629(15089);
        class198.field3199 = 0;
        class53.method333((byte) 43);
        if (arg0 != -18) {
            method400((String) null, -54);
        }
        class101.method651(true, -72);
        try {
            class94.method604(class127.field2238.field2294, "loggedout", arg0 ^ 0xFFFF92AA);
        } catch (Throwable var8) {
        }
    }
}
