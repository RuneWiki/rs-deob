import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class56 extends class260 {

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Z")
    public static boolean field862 = true;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Ljava/lang/String;")
    public static String field870 = null;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field872 = 50;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[I")
    public static int[] field860 = new int[field872];

    @OriginalMember(owner = "client!df", name = "t", descriptor = "[I")
    public static int[] field864 = new int[field872];

    @OriginalMember(owner = "client!df", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field871 = new String[field872];

    @OriginalMember(owner = "client!df", name = "F", descriptor = "[I")
    public static int[] field876 = new int[field872];

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field873 = 0;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "[I")
    public static int[] field865 = new int[field872];

    @OriginalMember(owner = "client!df", name = "v", descriptor = "[I")
    public static int[] field866 = new int[field872];

    @OriginalMember(owner = "client!df", name = "y", descriptor = "[I")
    public static int[] field869 = new int[field872];

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[I")
    public static int[] field867 = new int[field872];

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Lll;")
    public static class211 field868 = new class211(16);

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "Lag;")
    public static class188 field878;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "[[S")
    public static short[][] field863;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method451(int arg0) {
        field863 = null;
        field868 = null;
        field867 = null;
        field865 = null;
        field878 = null;
        field864 = null;
        field871 = null;
        if (arg0 != 871429573) {
            return;
        }
        field876 = null;
        field870 = null;
        field866 = null;
        field860 = null;
        field869 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BIILql;ZI)V")
    public static final void method452(byte arg0, int arg1, int arg2, class223 arg3, boolean arg4, int arg5) {
        field877++;
        if (class88.field1443 >= 50 || arg3 == null || arg3.field3501 == null || arg3.field3501.length <= arg1 || arg3.field3501[arg1] == null) {
            return;
        }
        int var6 = arg3.field3501[arg1][0];
        int var7 = (var6 & 0xF1) >> 5;
        int var8 = var6 & 0x1F;
        int var9 = var6 >> 8;
        if (arg3.field3501[arg1].length > 1) {
            int var10 = (int) (Math.random() * (double) arg3.field3501[arg1].length);
            if (var10 > 0) {
                var9 = arg3.field3501[arg1][var10];
            }
        }
        if (var8 == 0) {
            if (arg4) {
                class57.method457(var7, 255, var9, (byte) 102, 0);
            }
        } else if (class253.field3896 != 0) {
            int var11 = 34 % ((30 - arg0) / 62);
            int var12 = (arg2 - 64) / 128;
            int var13 = (arg5 - 64) / 128;
            class94.field1528[class88.field1443] = var9;
            class94.field1517[class88.field1443] = var7;
            class48.field786[class88.field1443] = 0;
            class163.field2482[class88.field1443] = null;
            class1.field15[class88.field1443] = 255;
            class206.field3199[class88.field1443] = (var12 << 16) + ((var13 << 8) + var8);
            class88.field1443++;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
    public static final void method453(int arg0, int arg1, int arg2) {
        if (arg2 >= 18) {
            class295 var3 = class250.method1673(-120, 1, arg1);
            var3.method1980(1022716908);
            field874++;
            var3.field4632 = arg0;
        }
    }
}
