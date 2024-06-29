import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public abstract class class187 {

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "Lhk;")
    public class111 field2885;

    @OriginalMember(owner = "client!cka", name = "e", descriptor = "Lfja;")
    public static class783 field2887 = new class783(55, 4);

    @OriginalMember(owner = "client!cka", name = "g", descriptor = "[S")
    private static short[] field2889 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cka", name = "k", descriptor = "[S")
    private static short[] field2893 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cka", name = "j", descriptor = "[I")
    public static int[] field2892 = new int[500];

    @OriginalMember(owner = "client!cka", name = "i", descriptor = "[S")
    private static short[] field2891 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!cka", name = "h", descriptor = "[[S")
    public static short[][] field2890 = new short[][] { field2891, field2893, field2889 };

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!cka", name = "f", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Z")
    public abstract boolean method171(int arg0);

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)V")
    public static void method1381(int arg0) {
        field2891 = null;
        if (arg0 != 4) {
            return;
        }
        field2887 = null;
        field2892 = null;
        field2889 = null;
        field2890 = null;
        field2893 = null;
    }

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "(I)V")
    public static final void method1382(int arg0) {
        class369.field5000.method503(class240.field3416);
        field2883++;
        if (arg0 >= 35) {
            class369.field5000.method521(class621.field8653, class262.field3682, class600.field8390, class169.field2715);
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(Z)V")
    public abstract void method169(boolean arg0);

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IZI)V")
    public abstract void method170(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IZ)V")
    public abstract void method172(int arg0, boolean arg1);

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZB)V")
    public abstract void method168(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(BI)V")
    public static final void method1383(byte arg0, int arg1) {
        field2888++;
        if (arg0 != 86) {
            field2892 = null;
        }
        class475.field6429 = arg1;
        class281.field3898.method273(126);
    }

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lhk;)V")
    public class187(class111 arg0) {
        this.field2885 = arg0;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IBLqk;)V")
    public abstract void method167(int arg0, byte arg1, class18 arg2);

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(Z)V")
    public static final void method1384(boolean arg0) {
        field2886++;
        class535.method3035((byte) 68, class111.field1911.field6764.method2439((byte) 55));
        int var1 = (class733.field10131 >> 12) + (class217.field3198 >> 3);
        int var2 = (class450.field6172 >> 12) + (class400.field5510 >> 3);
        class282.field3917 = class235.field3379.field7391 = 0;
        class235.field3379.method4237(8, 8, 0);
        byte var3 = 18;
        class201.field3055 = new int[var3];
        class444.field6024 = new byte[var3][];
        class79.field1114 = new int[var3];
        class532.field7197 = new byte[var3][];
        class537.field7299 = new int[var3];
        class82.field1135 = new int[var3][4];
        class450.field6173 = new int[var3];
        class783.field10755 = new byte[var3][];
        class286.field3935 = new byte[var3][];
        class1.field15 = new byte[var3][];
        class320.field4373 = new int[var3];
        if (!arg0) {
            method1384(false);
        }
        class120.field2189 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class483.field6515 >> 4)) / 8; var5 <= ((class483.field6515 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class65.field926 >> 4)) / 8; var8 <= (var2 + (class65.field926 >> 4)) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class201.field3055[var4] = var9;
                class79.field1114[var4] = class193.field2947.method3738(-1, "m" + var5 + "_" + var8);
                class320.field4373[var4] = class193.field2947.method3738(-1, "l" + var5 + "_" + var8);
                class120.field2189[var4] = class193.field2947.method3738(-1, "n" + var5 + "_" + var8);
                class450.field6173[var4] = class193.field2947.method3738(-1, "um" + var5 + "_" + var8);
                class537.field7299[var4] = class193.field2947.method3738(-1, "ul" + var5 + "_" + var8);
                if (class120.field2189[var4] == -1) {
                    class79.field1114[var4] = -1;
                    class320.field4373[var4] = -1;
                    class450.field6173[var4] = -1;
                    class537.field7299[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class120.field2189.length; var6++) {
            class120.field2189[var6] = -1;
            class79.field1114[var6] = -1;
            class320.field4373[var6] = -1;
            class450.field6173[var6] = -1;
            class537.field7299[var6] = -1;
        }
        byte var7;
        if (class753.field10398 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class465.method2683(119, var7, var1, false, var2);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1385(long arg0, int arg1) {
        field2884++;
        class46.field720.setTime(new Date(arg0));
        int var3 = class46.field720.get(7);
        if (arg1 != 10) {
            method1381(-98);
        }
        int var4 = class46.field720.get(5);
        int var5 = class46.field720.get(2);
        int var6 = class46.field720.get(1);
        int var7 = class46.field720.get(11);
        int var8 = class46.field720.get(12);
        int var9 = class46.field720.get(13);
        return class12.field184[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class660.field9143[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}
