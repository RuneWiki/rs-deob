import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class567 extends class90 {

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public int field8016;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "[[I")
    public static int[][] field8018 = new int[128][128];

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public static final void method3272(boolean arg0) {
        field8015++;
        class111.field1911.method2823(arg0, class111.field1911.field6756, 1);
        class111.field1911.method2823(arg0, class111.field1911.field6734, 1);
        class111.field1911.method2823(true, class111.field1911.field6728, 1);
        class111.field1911.method2823(true, class111.field1911.field6722, 1);
        class111.field1911.method2823(true, class111.field1911.field6716, 1);
        class111.field1911.method2823(arg0, class111.field1911.field6754, 1);
        class111.field1911.method2823(true, class111.field1911.field6739, 0);
        class111.field1911.method2823(true, class111.field1911.field6718, 0);
        class111.field1911.method2823(true, class111.field1911.field6742, 0);
        class111.field1911.method2823(true, class111.field1911.field6717, 0);
        class111.field1911.method2823(arg0, class111.field1911.field6743, 0);
        class111.field1911.method2823(arg0, class111.field1911.field6749, 0);
        class111.field1911.method2823(true, class111.field1911.field6735, 0);
        class111.field1911.method2823(true, class111.field1911.field6765, 0);
        class111.field1911.method2823(true, class111.field1911.field6715, 0);
        class111.field1911.method2823(arg0, class111.field1911.field6744, 0);
        class111.field1911.method2823(arg0, class111.field1911.field6733, 0);
        class111.field1911.method2823(true, class111.field1911.field6764, 0);
        class111.field1911.method2823(true, class111.field1911.field6760, 0);
        class421.method2480((byte) -61);
        class111.field1911.method2823(arg0, class111.field1911.field6758, 2);
        class111.field1911.method2823(true, class111.field1911.field6750, 2);
        class463.method2677(121);
        class596.method3394(9);
        class235.field3375 = true;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILuv;)V")
    public static final void method3273(int arg0, class385 arg1) {
        field8017++;
        boolean var2 = false;
        if (class440.field5977 == arg1.field5269 || arg1.field5230 == -1 || arg1.field5296 != 0) {
            var2 = true;
        } else {
            class200 var3 = class108.field1696.method1279((byte) 92, arg1.field5230);
            if (var3.field3048 || var3.field3024[arg1.field5270] < arg1.field5238 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field5269 - arg1.field5254;
            int var5 = class440.field5977 - arg1.field5254;
            int var6 = arg1.field5218 * 512 + arg1.method2342((byte) -50) * 256;
            int var7 = arg1.field5226 * 512 + (arg1.method2342((byte) 96) * 256);
            int var8 = arg1.field5219 * 512 + arg1.method2342((byte) 92) * 256;
            int var9 = arg1.field5264 * 512 + arg1.method2342((byte) 88) * 256;
            arg1.field7398 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
            arg1.field7396 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg1.field5309 = 0;
        if (arg1.field5235 == 0) {
            arg1.method2340(65, 8192, false);
        }
        int var10 = 103 % ((arg0 - 73) / 44);
        if (arg1.field5235 == 1) {
            arg1.method2340(40, 12288, false);
        }
        if (arg1.field5235 == 2) {
            arg1.method2340(58, 0, false);
        }
        if (arg1.field5235 == 3) {
            arg1.method2340(74, 4096, false);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method3274(int arg0) {
        if (arg0 != 0) {
            method3272(false);
        }
        field8018 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method3275(int arg0) {
        field8019++;
        if (arg0 != 0) {
            field8013 = -100;
        }
        String var1 = "www";
        if (class727.field9987 == class556.field7850) {
            var1 = "www-wtrc";
        } else if (class556.field7850 == class209.field3127) {
            var1 = "www-wtqa";
        } else if (class556.field7850 == class333.field4510) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class178.field2806 != null) {
            var2 = "/p=" + class178.field2806;
        }
        return "http://" + var1 + "." + class177.field2797.field8380 + ".com/l=" + class464.field6309 + "/a=" + class361.field4919 + var2 + "/";
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZI)V")
    public static final void method3276(int arg0, boolean arg1, int arg2) {
        field8012++;
        if (arg1) {
            class537 var3 = class476.method2729(class513.field7013, (byte) -46, class551.field7498);
            var3.field7295.method781(99, arg2);
            class173.method1314(false, var3);
        } else {
            class76.method660(class336.field4529, arg2, -1);
        }
        if (arg0 != -1) {
            method3276(-107, false, 19);
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I)V")
    public class567(int arg0) {
        this.field8016 = arg0;
    }
}
