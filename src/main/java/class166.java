import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class166 extends class232 {

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "Lhn;")
    public static class317 field2899 = new class317(64);

    @OriginalMember(owner = "client!hf", name = "fb", descriptor = "I")
    public static int field2907 = 0;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!hf", name = "hb", descriptor = "J")
    public static long field2909 = 0L;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "Lhi;")
    public static class82 field2900 = class95.method664((byte) -98, "Chargement de l(W-Bcran)2titre )2 ");

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
    public static int field2906 = 0;

    @OriginalMember(owner = "client!hf", name = "ib", descriptor = "[Z")
    public static boolean[] field2910 = new boolean[5];

    @OriginalMember(owner = "client!hf", name = "jb", descriptor = "Lme;")
    public static class75 field2911 = null;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "Lgk;")
    public static class203 field2901;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "[Ljm;")
    public static class303[] field2903;

    @OriginalMember(owner = "client!hf", name = "gb", descriptor = "[Ljf;")
    public static class86[] field2908;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)I", line = 15)
    private final int method1194(int arg0, int arg1, int arg2) {
        field2894++;
        int var4 = arg1 * 57 + arg0;
        if (arg2 == -12098) {
            int var5 = var4 << 1 ^ var4;
            return 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144);
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)I", line = 37)
    public static final int method1195(int arg0, int arg1) {
        field2896++;
        return arg1 == 0 ? arg0 & 0x7F : -74;
    }

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "(I)V", line = 53)
    public static final void method1196(int arg0) {
        field2898++;
        class55.method382(true);
        class42.method317(arg0);
        class275.method1916(1842216080);
        class308.method2125((byte) -115);
        class73.method463((byte) -81);
        class161.method1168((byte) 98);
        class165.method1191((byte) 120);
        class124.method846((byte) -125);
        class247.method1768(50);
        class273.method1908((byte) -98);
        class9.method55((byte) 83);
        class312.method2153(false);
        class88.method618(arg0 ^ 0x24);
        class149.method1028(false);
        class202.method1420(-31);
        class328.method2247(true);
        if (!class147.field2485) {
            ((class89) class102.field1821).method633((byte) 35);
        }
        class253.field4353.method2254(-2705);
        class111.field2009.method1569(false);
        class191.field3190.method1569(false);
        class164.field2880.method1569(false);
        class286.field4822.method1569(false);
        class184.field3134.method1569(false);
        class33.field484.method1569(false);
        class284.field4764.method1569(false);
        class182.field3117.method1569(false);
        class279.field4679.method1569(false);
        class296.field5051.method1569(false);
        class52.field846.method1569(false);
        class150.field2553.method2172(false);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V", line = 99)
    public static void method1197(byte arg0) {
        field2901 = null;
        field2903 = null;
        field2910 = null;
        field2900 = null;
        field2899 = null;
        field2908 = null;
        if (arg0 > 102) {
            field2911 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 115)
    public class166() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V", line = 125)
    public static final void method1198(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -8 % ((65 - arg4) / 54);
        class315.field5426 = class157.field2719 * arg1 / arg2;
        field2892++;
        class78.field1330 = -1;
        class82.field1445 = class244.field4242 * arg3 / arg0;
        class130.field2268 = -1;
        class141.method963(0);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IB)[I", line = 140)
    public final int[] method80(int arg0, byte arg1) {
        field2895++;
        int[] var3 = this.field4008.method131((byte) -92, arg0);
        int var4 = -88 / ((-arg1 - 31) / 55);
        if (this.field4008.field256) {
            int var5 = class273.field4607[arg0];
            for (int var6 = 0; var6 < class54.field858; var6++) {
                var3[var6] = this.method1194(class24.field329[var6], var5, -12098) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BILum;I)Ljm;", line = 172)
    public static final class303 method1199(byte arg0, int arg1, class222 arg2, int arg3) {
        field2897++;
        int var4 = -64 % ((arg0 + 92) / 33);
        return client.method866(arg1, arg3, (byte) 49, arg2) ? class267.method1884(-64) : null;
    }
}
