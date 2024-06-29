import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class27 extends class45 {

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Ldh;")
    public static class179 field347 = new class179(64);

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Ljava/lang/String;")
    public static String field353 = "Loaded textures";

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "Ljava/lang/String;")
    public static String field354 = "Loading world list data";

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "Lam;")
    public static class269 field352;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBII)Ldj;", line = 9)
    public static final class343 method167(int arg0, byte arg1, int arg2, int arg3) {
        field350++;
        class343 var4 = new class343();
        var4.field5324 = arg2;
        var4.field5329 = arg3;
        class292.field4585.method1541(false, var4, (long) arg0);
        class303.method2125(arg3, (byte) 36);
        class263 var5 = class91.method530(arg0, 10989328);
        if (var5 != null) {
            class239.method1712(0, var5);
        }
        if (class262.field3960 != null) {
            class239.method1712(0, class262.field3960);
            class262.field3960 = null;
        }
        int var6 = class310.field4794;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class330.method2278(class30.field371[var7], (byte) 102)) {
                class261.method1878(1, var7);
            }
        }
        if (class310.field4794 == 1) {
            class140.field1951 = false;
            class63.method390(class325.field4984, class172.field2480, 96, class221.field3123, class205.field2871);
        } else {
            class63.method390(class325.field4984, class172.field2480, 102, class221.field3123, class205.field2871);
            int var8 = class88.field1097.method80(class164.field2262);
            for (int var9 = 0; var9 < class310.field4794; var9++) {
                int var10 = class88.field1097.method80(class106.method615(var9, true));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class172.field2480 = class310.field4794 * 15 + (class262.field3964 ? 26 : 22);
            class205.field2871 = var8 + 8;
        }
        if (arg1 >= -115) {
            method168((class175) null, 19);
        }
        if (var5 != null) {
            class112.method769(var5, false, 268219088);
        }
        class142.method944(7485, arg3);
        if (class146.field2031 != -1) {
            class90.method526(class146.field2031, 1, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Llc;I)V", line = 89)
    public static final void method168(class175 arg0, int arg1) {
        class9.field130 = arg0;
        class79.field997 = class9.field130.method1197(-125, 4);
        if (arg1 != -7077) {
            field353 = (String) null;
        }
        field349++;
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V", line = 102)
    public static void method169(byte arg0) {
        field354 = null;
        field353 = null;
        field347 = null;
        if (arg0 < -50) {
            field352 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLtb;)V", line = 117)
    public static final void method170(byte arg0, class234 arg1) {
        if (arg0 >= -42) {
            field354 = (String) null;
        }
        for (int var2 = 0; var2 < class318.field4889.length; var2++) {
            class318.field4889[var2] = 0;
        }
        field348++;
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var3 * 128.0D * Math.random());
            class318.field4889[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var3 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class153.field2108[var9] = (class318.field4889[var9 - 1] - (-class318.field4889[var9 + 1] - (class318.field4889[var9 - 128] + class318.field4889[var9 + 128]))) / 4;
                }
            }
            int[] var10 = class318.field4889;
            class318.field4889 = class153.field2108;
            class153.field2108 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field4749; var12++) {
            for (int var13 = 0; var13 < arg1.field4743; var13++) {
                if (arg1.field3410[var11++] != 0) {
                    int var14 = var13 + arg1.field4748 + 16;
                    int var15 = arg1.field4751 + var12 + 16;
                    int var16 = (var15 << 7) + var14;
                    class318.field4889[var16] = 0;
                }
            }
        }
    }
}
