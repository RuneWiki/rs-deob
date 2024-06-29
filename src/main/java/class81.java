import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class81 {

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static volatile int field1871 = -1;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field1870 = 50;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Lva;")
    private static class121 field1874 = class107.method797(" seconds)3", -10983);

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lva;")
    private static class121 field1875 = class107.method797("Enter name of friend to add to list", -10983);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lva;")
    public static class121 field1867 = field1875;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lva;")
    public static class121 field1877 = field1874;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Li;")
    public static class48 field1872 = new class48(64);

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static volatile int field1880 = 0;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Lva;")
    private static class121 field1878 = class107.method797("Accept trade", -10983);

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Lva;")
    private static class121 field1883 = class107.method797("Loading game screen )2 ", -10983);

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lva;")
    public static class121 field1879 = field1883;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lva;")
    public static class121 field1881 = field1878;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V", line = 5)
    public static final void method555(int arg0, int arg1) {
        if (arg1 >= -75) {
            method556((byte) -92);
        }
        class14.field257 += arg0;
        field1873++;
        while (class14.field257 >= class35.field836) {
            class14.field257 -= class35.field836;
            class126.field2881 -= class126.field2881 >> 2;
        }
        class126.field2881 -= arg0 * 1000;
        if (class126.field2881 < 0) {
            class126.field2881 = 0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 29)
    public static final void method556(byte arg0) {
        field1868++;
        try {
            if (arg0 == -54) {
                Graphics var1 = class46.field1079.getGraphics();
                class86.field1988.method196(arg0 - 5863, 4, 550, var1);
            }
        } catch (Exception var2) {
            class46.field1079.repaint();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 64)
    public static void method557(int arg0) {
        field1874 = null;
        field1879 = null;
        field1867 = null;
        field1875 = null;
        field1881 = null;
        field1878 = null;
        field1877 = null;
        field1872 = null;
        field1883 = null;
        if (arg0 != 8) {
            method558((byte) 104, 67, -67, null, -100, -33, 106, 111, -31, null);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII[Lcb;IIIII[B)V", line = 94)
    public static final void method558(byte arg0, int arg1, int arg2, class15[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg8 + var15 > 0 && arg8 + var15 < 103) {
                    arg3[arg1].field276[arg7 + var10][arg8 + var15] = class90.method614(arg3[arg1].field276[arg7 + var10][arg8 + var15], -16777217);
                }
            }
        }
        if (arg0 >= -36) {
            field1882 = 11;
        }
        class113 var11 = new class113(arg9);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg6 == var12 && arg2 <= var13 && arg2 + 8 > var13 && var14 >= arg5 && var14 < arg5 + 8) {
                        class100.method675(0, arg8 + class35.method241(true, var13 & 0x7, var14 & 0x7, arg4), arg4, arg1, 0, 120, arg7 + class11.method89(var13 & 0x7, 3, var14 & 0x7, arg4), var11);
                    } else {
                        class100.method675(0, -1, 0, 0, 0, 125, -1, var11);
                    }
                }
            }
        }
        field1869++;
    }
}
