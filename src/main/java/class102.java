import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class102 {

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1588 = "Loading fonts - ";

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1586 = " has logged in.";

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1593 = -1;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Ldl;")
    public static class123 field1582;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1592;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "[I")
    public static int[] field1595;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method673(int arg0) {
        if (arg0 != -32709) {
            method673(-17);
        }
        field1582 = null;
        field1588 = null;
        field1595 = null;
        field1586 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method674(int arg0, int arg1) {
        if (arg0 != -19736) {
            method678((byte) -69, (class82) null, 68);
        }
        field1580++;
        return class19.field225[arg1].length() <= 0 ? class96.field1491[arg1] : class96.field1491[arg1] + class223.field3604 + class19.field225[arg1];
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLdl;I)[Lwe;")
    public static final class15[] method675(byte arg0, class123 arg1, int arg2) {
        field1581++;
        if (class98.method653(-1, arg2, arg1)) {
            if (arg0 != -61) {
                field1593 = 62;
            }
            return class56.method414(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILlj;[B)V")
    public final void method676(int arg0, class25 arg1, byte[] arg2) {
        field1583++;
        if (arg0 != 500) {
            return;
        }
        if (arg1.field339[arg1.field349] != 31 || arg1.field339[arg1.field349 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1592 == null) {
            this.field1592 = new Inflater(true);
        }
        try {
            this.field1592.setInput(arg1.field339, arg1.field349 + 10, arg1.field339.length - (arg1.field349 + 8 + 10));
            this.field1592.inflate(arg2);
        } catch (Exception var4) {
            this.field1592.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1592.reset();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIB)V")
    public static final void method677(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class287 var5 = class261.method1786(arg0, false, 4);
        field1585++;
        if (arg4 != 84) {
            field1586 = null;
        }
        var5.method1914((byte) 46);
        var5.field4549 = arg3;
        var5.field4547 = arg2;
        var5.field4550 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLlk;I)V")
    public static final void method678(byte arg0, class82 arg1, int arg2) {
        if (class111.field1684 < arg1.field1208) {
            class269.method1827((byte) 103, arg1);
        } else if (arg1.field1290 >= class111.field1684) {
            class2.method8(arg1, (byte) 120);
        } else {
            class58.method420(-95, arg1);
        }
        field1590++;
        if (arg1.field1226 < 128 || arg1.field1273 < 128 || arg1.field1226 >= 13184 || arg1.field1273 >= 13184) {
            arg1.field1252 = -1;
            arg1.field1208 = 0;
            arg1.field1290 = 0;
            arg1.field1280 = -1;
            arg1.field1226 = arg1.field1257[0] * 128 + (arg1.method565((byte) 0) * 64);
            arg1.field1273 = arg1.field1272[0] * 128 + arg1.method565((byte) 0) * 64;
            arg1.method574((byte) 34);
        }
        if (class149.field2227 == arg1 && (arg1.field1226 < 1536 || arg1.field1273 < 1536 || arg1.field1226 >= 11776 || arg1.field1273 >= 11776)) {
            arg1.field1280 = -1;
            arg1.field1208 = 0;
            arg1.field1290 = 0;
            arg1.field1252 = -1;
            arg1.field1226 = arg1.field1257[0] * 128 + arg1.method565((byte) 0) * 64;
            arg1.field1273 = arg1.field1272[0] * 128 + (arg1.method565((byte) 0) * 64);
            arg1.method574((byte) 88);
        }
        class50.method368(-128, arg1);
        int var3 = 53 / ((-arg0 - 53) / 55);
        class71.method479((byte) -7, arg1);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIZ)V")
    public static final void method679(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class158.field2433 = arg1;
        class54.field749 = arg2;
        class33.field429 = arg3;
        class266.field4273 = new class49[arg0][class158.field2433][class54.field749];
        class198.field3108 = new int[arg0][class158.field2433 + 1][class54.field749 + 1];
        if (arg4) {
            class173.field2712 = new class49[1][class158.field2433][class54.field749];
            class103.field1601 = new int[class158.field2433][class54.field749];
            class235.field3772 = new int[1][class158.field2433 + 1][class54.field749 + 1];
        } else {
            class173.field2712 = null;
            class103.field1601 = null;
            class235.field3772 = null;
        }
        class167.method1144(false);
        class17.field199 = new class13[500];
        class270.field4299 = 0;
        class229.field3700 = new class13[500];
        class272.field4328 = 0;
        class74.field1044 = new int[arg0][class158.field2433 + 1][class54.field749 + 1];
        class190.field2993 = new class284[5000];
        class243.field3890 = 0;
        class186.field2924 = new class284[100];
        class17.field197 = new boolean[class33.field429 + class33.field429 + 1][class33.field429 + class33.field429 + 1];
        class108.field1656 = new boolean[class33.field429 + class33.field429 + 2][class33.field429 + class33.field429 + 2];
        class253.field4065 = new byte[arg0][class158.field2433][class54.field749];
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILvk;Z)V")
    public static final void method680(int arg0, class35 arg1, boolean arg2) {
        field1591++;
        int var3 = arg1.field456;
        int var4 = (int) arg1.field1750;
        arg1.method784(false);
        if (arg2) {
            class45.method340(var3, -25149);
        }
        class99.method661(var3, -262318352);
        class214 var5 = class206.method1403((byte) 7, var4);
        if (var5 != null) {
            class55.method397(arg0, var5);
        }
        int var6 = class245.field3920;
        for (int var7 = arg0; var7 < var6; var7++) {
            if (class287.method1917(class2.field21[var7], 31)) {
                class245.method1654(5526, var7);
            }
        }
        if (class245.field3920 == 1) {
            class286.field4542 = false;
            class286.method1908(class106.field1641, 101, class240.field3852, class57.field808, class25.field345);
        } else {
            class286.method1908(class106.field1641, 62, class240.field3852, class57.field808, class25.field345);
            int var8 = class232.field3734.method1309(class86.field1366);
            for (int var9 = 0; var9 < class245.field3920; var9++) {
                int var10 = class232.field3734.method1309(method674(-19736, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class106.field1641 = var8 + 8;
            class25.field345 = (class264.field4247 ? 26 : 22) + class245.field3920 * 15;
        }
        if (class242.field3880 != -1) {
            class159.method1067(1, class242.field3880, false);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(III)V")
    private class102(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class102() {
        this(-1, 1000000, 1000000);
    }
}
