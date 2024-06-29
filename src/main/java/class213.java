import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class213 extends class295 {

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "Ljava/lang/String;")
    public static String field2949 = "Checking for updates - ";

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field2958 = null;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "Lap;")
    public static class289 field2952 = new class289(new byte[5000]);

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "[I")
    public static int[] field2963 = new int[14];

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Lik;")
    public static class410 field2964 = new class410(4);

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "Lrk;")
    public static class427 field2956;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Ljava/lang/String;")
    public String field2960;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "[I")
    public int[] field2957;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
    public int[] field2959;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "[I")
    public static int[] field2962;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "[Laj;")
    public class71[] field2947;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field2953;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V")
    public static final void method1453(byte arg0, int arg1, int arg2) {
        field2950++;
        class71 var3 = new class71(16);
        int var4 = 29 % ((54 - arg0) / 58);
        for (class396 var5 = (class396) class451.field6514.method608(104); var5 != null; var5 = (class396) class451.field6514.method606((byte) 118)) {
            var5.method2367(5);
            int var6 = (int) (var5.field5349 >> 28);
            int var7 = (int) (var5.field5349 >> 14 & 0x3FFFL) - arg2;
            int var8 = (int) (var5.field5349 & 0x3FFFL) - arg1;
            if (var8 >= 0 && var7 >= 0 && var8 < class116.field1621 && var7 < class385.field5425) {
                var3.method612((long) (var7 << 14 | var6 << 28 | var8), -1, var5);
            }
        }
        class451.field6514 = var3;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
    public static void method1454(byte arg0) {
        field2949 = null;
        if (arg0 > -10) {
            return;
        }
        field2958 = null;
        field2956 = null;
        field2964 = null;
        field2963 = null;
        field2952 = null;
        field2962 = null;
    }
}
