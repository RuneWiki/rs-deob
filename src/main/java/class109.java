import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class109 extends OutputStream {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lcf;")
    public static class93 field1861 = class147.method1066("<)4col>", -48);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[[[Lmb;")
    public static class160[][][] field1858 = new class160[4][104][104];

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lcf;")
    public static class93 field1860 = class147.method1066("overlay2", -48);

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[[I")
    public static int[][] field1867 = new int[5][5000];

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lcf;")
    public static class93 field1865 = class147.method1066("0", -48);

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lcf;")
    public static class93 field1868 = class147.method1066("1", -48);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!de", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1864++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lhg;III)Luf;")
    public static final class173 method780(class177 arg0, int arg1, int arg2, int arg3) {
        field1866++;
        if (class149.method1074(arg1, arg0, arg3 + 505719357, arg2)) {
            return arg3 == -505702760 ? class279.method1865((byte) 117) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZB)V")
    public static final void method781(boolean arg0, byte arg1) {
        field1863++;
        byte var2 = 4;
        byte[][] var3 = class50.field827;
        if (arg1 != -23) {
            return;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class226.method1559(false);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class126.field2231[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 3 & 0x7FF;
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = (var7 & 0xFFE3B2) >> 14;
                            int var12 = (var11 / 8 << 8) + var9 / 8;
                            for (int var13 = 0; var13 < class149.field2614.length; var13++) {
                                if (class149.field2614[var13] == var12 && var3[var13] != null) {
                                    class94.method695((byte) -117, class148.field2605, (var11 & 0x7) * 8, var10, (var9 & 0x7) * 8, var5 * 8, var6 * 8, arg0, var3[var13], var4, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method782(int arg0) {
        field1860 = null;
        field1861 = null;
        field1867 = null;
        field1858 = null;
        field1868 = null;
        int var1 = 43 % ((53 - arg0) / 51);
        field1865 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V")
    public static final void method783(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 22466) {
            method782(7);
        }
        if (class129.field2270 == 1) {
            class152.field2677[class149.field2618 / 100].method560(class60.field1022 - 8, class31.field497 - 8);
        }
        if (class129.field2270 == 2) {
            class152.field2677[(class149.field2618 / 100) + 4].method560(class60.field1022 - 8, class31.field497 + -8);
        }
        field1869++;
        class89.method614((byte) -80);
    }
}
