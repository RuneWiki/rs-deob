import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class59 extends class81 {

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lna;")
    public static class26 field958 = class69.method505("M", (byte) -121);

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "[Lna;")
    public static class26[] field959 = new class26[100];

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Z")
    public static boolean field960 = true;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lna;")
    public static class26 field956 = class69.method505("; Max)2Age=", (byte) -119);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lna;")
    public static class26 field963 = class69.method505("<col=ff3000>", (byte) -125);

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
    public static int[] field964 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    public static int[] field955;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[[B")
    public static byte[][] field961;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 16)
    public static void method424(byte arg0) {
        field963 = null;
        field964 = null;
        field959 = null;
        if (arg0 == 37) {
            field961 = (byte[][]) null;
            field958 = null;
            field956 = null;
            field955 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 50)
    public static final void method425(byte arg0) {
        class28.field474 = 0;
        field962++;
        class312.field5341 = 0;
        class203.method1364((byte) 81);
        class109.method776(false);
        class12.method73(-59);
        class71.method510(-102);
        if (arg0 > -69) {
            return;
        }
        for (int var1 = 0; var1 < class312.field5341; var1++) {
            int var2 = class116.field1824[var1];
            if (class229.field3626 != class268.field4427[var2].field3982) {
                if (class268.field4427[var2].field2498 > 0) {
                    class104.method746(class268.field4427[var2], 8);
                }
                class268.field4427[var2] = null;
            }
        }
        if (class259.field4228 != class300.field5157.field1301) {
            throw new RuntimeException("gpp1 pos:" + class300.field5157.field1301 + " psize:" + class259.field4228);
        }
        for (int var3 = 0; var3 < class80.field1261; var3++) {
            if (class268.field4427[class95.field1550[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class80.field1261);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(JB)V", line = 101)
    public static final void method426(long arg0, byte arg1) {
        field965++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class321.field5520 < 100 || class240.field3880) || class321.field5520 >= 200) {
            class214.method1420(class2.field18, 0, class252.field4146, -1);
            return;
        }
        class26 var3 = class153.method1042(-29664, arg0).method176((byte) -50);
        if (arg1 != -91) {
            method424((byte) 22);
        }
        for (int var4 = 0; var4 < class321.field5520; var4++) {
            if (class121.field1890[var4] == arg0) {
                class214.method1420(class2.field18, 0, class236.method1587(new class26[] { var3, class277.field4640 }, (byte) -93), -1);
                return;
            }
        }
        for (int var5 = 0; var5 < class132.field2014; var5++) {
            if (class85.field1394[var5] == arg0) {
                class214.method1420(class2.field18, 0, class236.method1587(new class26[] { class45.field708, var3, class325.field5622 }, (byte) -66), -1);
                return;
            }
        }
        if (var3.method159((byte) -42, class13.field221.field2495)) {
            class214.method1420(class2.field18, 0, class212.field3293, -1);
            return;
        }
        class300.field5170++;
        class267.field4406[class321.field5520] = var3;
        class121.field1890[class321.field5520] = arg0;
        class208.field3226[class321.field5520] = 0;
        class96.field1560[class321.field5520] = class2.field18;
        class117.field1842[class321.field5520] = 0;
        class147.field2295[class321.field5520] = false;
        class321.field5520++;
        class100.field1611 = class74.field1144;
        class114.field1789.method1431(0, 120);
        class114.field1789.method579(arg0, arg1 ^ 0x7971A6B5);
    }
}
