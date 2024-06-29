import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class239 extends class171 {

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "J")
    public long field3981;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    public static int field3983 = -1;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public static int field3982 = 50;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "[I")
    public static int[] field3979 = new int[field3982];

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "[I")
    public static int[] field3980 = new int[field3982];

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "[I")
    public static int[] field3986 = new int[field3982];

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "[I")
    public static int[] field3985 = new int[field3982];

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "[I")
    public static int[] field3990 = new int[field3982];

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "[I")
    public static int[] field3978 = new int[field3982];

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "[Lok;")
    public static class146[] field3994 = new class146[field3982];

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "[[Z")
    public static boolean[][] field3992 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "[I")
    public static int[] field3993 = new int[field3982];

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)V", line = 7)
    public static void method1742(int arg0) {
        field3990 = null;
        field3980 = null;
        field3994 = null;
        field3979 = null;
        field3986 = null;
        if (arg0 != 0) {
            field3990 = (int[]) null;
        }
        field3978 = null;
        field3993 = null;
        field3985 = null;
        field3992 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V", line = 33)
    public static final void method1743(int arg0) {
        field3988++;
        if (class98.field1582 != null) {
            class98.field1582.method284((byte) 126);
            class98.field1582 = null;
        }
        class98.method678((byte) -122);
        class195.method1505();
        for (int var1 = 0; var1 < 4; var1++) {
            class251.field4202[var1].method1062(false);
        }
        class57.method451(false, -91);
        System.gc();
        class203.method1549(2, (byte) -20);
        class85.field1357 = false;
        class174.field2910 = -1;
        class46.method317(true, 128);
        class15.field300 = 0;
        class55.field979 = 0;
        class273.field4707 = 0;
        class201.field3357 = 0;
        class113.field1800 = false;
        for (int var2 = 0; var2 < class216.field3569.length; var2++) {
            class216.field3569[var2] = null;
        }
        class151.field2574 = 0;
        class158.field2670 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class75.field1215[var3] = null;
            class140.field2339[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class173.field2906[var4] = null;
        }
        if (arg0 <= 81) {
            method1742(-69);
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class268.field4614[var5][var6][var7] = null;
                }
            }
        }
        class322.method2234(-1);
        class32.field616 = 0;
        class309.method2177(22);
        class28.method182(true, 12252);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLoh;)V", line = 125)
    public static final void method1744(byte arg0, class15 arg1) {
        class100.field1618 = arg1.method103(-116, class194.field3222);
        class196.field3266 = arg1.method103(arg0 ^ 0x6, class236.field3938);
        field3989++;
        class94.field1512 = arg1.method103(117, class250.field4191);
        class83.field1319 = arg1.method103(-74, class302.field5185);
        class99.field1608 = arg1.method103(48, class229.field3823);
        class76.field1231 = arg1.method103(68, class31.field581);
        class249.field4176 = arg1.method103(-93, class292.field4972);
        class62.field1059 = arg1.method103(-100, class82.field1304);
        if (arg0 != -111) {
            field3985 = (int[]) null;
        }
        class168.field2839 = arg1.method103(95, class98.field1584);
        class134.field2245 = arg1.method103(arg0 ^ 0x2E, class302.field5192);
        class1.field3 = arg1.method103(-83, class147.field2503);
        field3984 = arg1.method103(-79, class19.field378);
        class222.field3697 = arg1.method103(-104, class25.field442);
        class211.field3499 = arg1.method103(64, class164.field2775);
        class91.field1447 = arg1.method103(58, class252.field4227);
        class160.field2700 = arg1.method103(86, class268.field4611);
        class311.field5303 = arg1.method103(arg0 + 21, class280.field4803);
        class140.field2335 = arg1.method103(arg0 - 12, class148.field2514);
        class189.field3135 = arg1.method103(arg0 ^ 0x19, class298.field5069);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V", line = 153)
    public class239() {
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(J)V", line = 158)
    public class239(long arg0) {
        this.field3981 = arg0;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)[Lhj;", line = 190)
    public static final class28[] method1745(byte arg0) {
        field3987++;
        class28[] var1 = new class28[class241.field4004];
        for (int var2 = 0; var2 < class241.field4004; var2++) {
            if (class271.field4640) {
                var1[var2] = new class154(class177.field3006, class242.field4027, class226.field3776[var2], class23.field424[var2], class238.field3967[var2], class150.field2562[var2], class17.field353[var2], class94.field1514);
            } else {
                var1[var2] = new class315(class177.field3006, class242.field4027, class226.field3776[var2], class23.field424[var2], class238.field3967[var2], class150.field2562[var2], class17.field353[var2], class94.field1514);
            }
        }
        int var3 = -126 / ((arg0 - 63) / 47);
        class301.method2122((byte) 0);
        return var1;
    }
}
