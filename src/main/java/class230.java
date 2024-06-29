import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class230 {

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public int field3484 = -1;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field3485 = 0;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3482 = "Allocating memory";

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public int field3480;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public int field3486;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public int field3487;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[I")
    public static int[] field3476;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "[[[B")
    public static byte[][][] field3491;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lph;I)I", line = 8)
    public static final int method1713(class361 arg0, int arg1) {
        field3489++;
        int var2 = 0;
        if (arg0.method2514((byte) 89, class225.field3395)) {
            var2++;
        }
        if (arg0.method2514((byte) 105, class312.field4654)) {
            var2++;
        }
        if (arg0.method2514((byte) 77, class273.field4142)) {
            var2++;
        }
        if (arg0.method2514((byte) 126, class167.field2397)) {
            var2++;
        }
        if (arg0.method2514((byte) 30, class135.field1964)) {
            var2++;
        }
        if (arg1 <= 90) {
            return -100;
        }
        if (arg0.method2514((byte) 61, class22.field334)) {
            var2++;
        }
        if (arg0.method2514((byte) 54, class318.field4788)) {
            var2++;
        }
        if (arg0.method2514((byte) 111, class2.field86)) {
            var2++;
        }
        if (arg0.method2514((byte) 32, class28.field388)) {
            var2++;
        }
        if (arg0.method2514((byte) 12, class237.field3554)) {
            var2++;
        }
        if (arg0.method2514((byte) 105, class356.field5466)) {
            var2++;
        }
        if (arg0.method2514((byte) 9, class120.field1687)) {
            var2++;
        }
        if (arg0.method2514((byte) 63, class96.field1360)) {
            var2++;
        }
        if (arg0.method2514((byte) 40, class298.field4458)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZBLkc;)V", line = 96)
    public static final void method1714(boolean arg0, byte arg1, class29 arg2) {
        field3478++;
        if (class141.field2031 || arg0) {
            int var3 = class19.field301;
            int var4 = var3 * 956 / 503;
            class50.field756.method651((class286.field4312 - var4) / 2, 0, var4, var3);
            class160.field2314.method1482(class286.field4312 / 2 - (class160.field2314.field3715 / 2), 18);
        }
        arg2.method197(class164.field2335 == 1 ? class4.field109 : class166.field2379, class286.field4312 / 2, class19.field301 / 2 - 26, 16777215, -1);
        int var5 = class19.field301 / 2 - 18;
        int var6 = -17 % ((arg1 - 24) / 63);
        if (class141.field2031) {
            class205.method1487(class286.field4312 / 2 - 152, var5, 304, 34, 9179409);
            class205.method1487(class286.field4312 / 2 - 151, var5 - -1, 302, 32, 0);
            class205.method1499(class286.field4312 / 2 - 150, var5 - -2, class120.field1685 * 3, 30, 9179409);
            class205.method1499(class286.field4312 / 2 + class120.field1685 * 3 - 150, var5 + 2, 300 - (class120.field1685 * 3), 30, 0);
        } else {
            class44.method316(class286.field4312 / 2 - 152, var5, 304, 34, 9179409);
            class44.method316(class286.field4312 / 2 - 151, var5 + 1, 302, 32, 0);
            class44.method317(class286.field4312 / 2 - 150, var5 - -2, class120.field1685 * 3, 30, 9179409);
            class44.method317(class120.field1685 * 3 + class286.field4312 / 2 - 150, var5 - -2, 300 - (class120.field1685 * 3), 30, 0);
        }
        arg2.method197(class300.field4487, class286.field4312 / 2, class19.field301 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 136)
    public static void method1715(byte arg0) {
        field3491 = (byte[][][]) null;
        field3476 = null;
        if (arg0 != 83) {
            method1714(false, (byte) -35, (class29) null);
        }
        field3482 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V", line = 151)
    public static final void method1716(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class178.field2558; var5++) {
            if (arg1 < (class338.field5251[var5] + class27.field383[var5]) && class27.field383[var5] < arg1 + arg2 && class96.field1358[var5] + class324.field4883[var5] > arg0 && arg0 + arg4 > class324.field4883[var5]) {
                class332.field5051[var5] = true;
            }
        }
        if (arg3 == 2) {
            field3483++;
        }
    }
}
