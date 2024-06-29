import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class157 extends class163 {

    @OriginalMember(owner = "client!tca", name = "M", descriptor = "[I")
    public static int[] field2680 = new int[1000];

    @OriginalMember(owner = "client!tca", name = "T", descriptor = "[I")
    public static int[] field2686 = new int[25];

    @OriginalMember(owner = "client!tca", name = "O", descriptor = "Lph;")
    public static class598 field2681 = new class598(0, 1);

    @OriginalMember(owner = "client!tca", name = "U", descriptor = "Loda;")
    public static class103 field2687 = new class103();

    @OriginalMember(owner = "client!tca", name = "V", descriptor = "I")
    public static int field2688 = -1;

    @OriginalMember(owner = "client!tca", name = "I", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!tca", name = "J", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!tca", name = "K", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!tca", name = "L", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!tca", name = "Q", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!tca", name = "R", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!tca", name = "S", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!tca", name = "P", descriptor = "[B")
    private byte[] field2682;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "(B)V")
    public static void method1213(byte arg0) {
        field2680 = null;
        field2686 = null;
        int var1 = 124 % ((arg0 - 80) / 34);
        field2687 = null;
        field2681 = null;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILjava/lang/String;IZI)V")
    public static final void method1214(int arg0, String arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 == -1) {
            class22.method453(arg2, arg4, -124, false, arg1, arg3, null);
            field2678++;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lfe;Z)V")
    public static final void method1215(class531 arg0, boolean arg1) {
        arg0.field7450 = null;
        field2679++;
        if (arg1) {
            return;
        }
        int var2 = arg0.field7451.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field7451[var3].field9707 = false;
        }
        class578[] var4 = class278.field4157;
        synchronized (class278.field4157) {
            if (var2 < class278.field4157.length && class239.field3539[var2] < 200) {
                class278.field4157[var2].method3322(arg0, -97);
                int var10002 = class239.field3539[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(BILoe;)Z")
    public static final boolean method1216(byte arg0, int arg1, class185 arg2) {
        field2683++;
        class576.field8372.method906(arg2.field2973[arg1], arg2.field2977[arg1], arg2.field2986[arg1], class296.field4440);
        int var3 = class296.field4440[2];
        if (var3 < 50) {
            return false;
        }
        arg2.field2983[arg1] = (short) (class296.field4440[0] * class216.field3286 / var3 + class35.field1028);
        arg2.field2982[arg1] = (short) (class296.field4440[1] * class639.field9202 / var3 + class559.field7905);
        arg2.field2976[arg1] = (short) var3;
        if (arg0 != 123) {
            field2680 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1217(int arg0, int arg1, int arg2, int arg3) {
        field2676++;
        this.field2682 = new byte[arg0 * arg2 * 2 * arg1];
        this.method1439(arg0, arg2, true, arg1);
        return arg3 == 4096 ? this.field2682 : null;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1218(String arg0, byte arg1) {
        field2684++;
        String var2 = class220.method1524(class312.method2032(true, arg0), -6898);
        if (arg1 == -69) {
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "(B)V")
    public static final void method1219(byte arg0) {
        field2677++;
        for (int var1 = 0; var1 < 5; var1++) {
            class409.field5926[var1] = false;
        }
        class453.field6464 = class206.field3158;
        class494.field7054 = -1;
        class525.field7402 = 0;
        class423.field6123 = 5;
        class519.field7365 = 0;
        class562.field8093 = class336.field5031;
        class386.field5662 = class537.field7518;
        if (arg0 <= 89) {
            field2681 = null;
        }
        class379.field5609 = -1;
        class405.field5848 = class499.field7113;
        class2.field380 = class517.field7300;
        class488.field6995 = -1;
        class266.field3950 = -1;
        class641.field9225 = class1.field97;
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
    public class157() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBB)V")
    public final void method1151(int arg0, byte arg1, byte arg2) {
        field2685++;
        int var4 = arg0 * 2;
        if (arg2 != -100) {
            method1218(null, (byte) -89);
        }
        int var5 = arg1 & 0xFF;
        this.field2682[var4++] = -1;
        this.field2682[var4] = (byte) (var5 * 3 >> 5);
    }
}
