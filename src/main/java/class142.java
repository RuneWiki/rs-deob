import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class142 extends class120 {

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "Llf;")
    public static class211 field2085 = new class211(4);

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public int field2080;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public int field2083;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Lef;")
    public class214 field2079;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Lef;")
    public class214 field2081;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "Ljava/awt/Image;")
    public static Image field2089;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "Ljava/lang/String;")
    public String field2087;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Z")
    public boolean field2076;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field2086;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method948(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2077++;
        if (arg7 == arg9 && arg2 == arg6 && arg1 == arg4 && arg0 == arg8) {
            class98.method654(arg5, arg4, arg0, arg7, arg2, (byte) 91);
        } else {
            int var10 = arg7;
            int var11 = arg2;
            int var12 = arg7 * 3;
            int var13 = arg9 * 3;
            int var14 = arg2 * 3;
            int var15 = arg6 * 3;
            int var16 = arg1 * 3;
            int var17 = arg8 * 3;
            int var18 = arg4 - (var16 - var13) - arg7;
            int var19 = arg0 + var15 - var17 - arg2;
            int var20 = var16 + var12 - var13 - var13;
            int var21 = var14 + var17 - var15 - var15;
            int var22 = var13 - var12;
            int var23 = var15 - var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var21 * var25;
                int var30 = var23 * var24;
                int var31 = var20 * var25;
                int var32 = var22 * var24;
                int var33 = (var31 + var32 + var27 >> 12) + arg7;
                int var34 = arg2 + (var28 + var30 + var29 >> 12);
                class98.method654(arg5, var33, var34, var10, var11, (byte) 91);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg3 != 56) {
            method948(12, -97, -66, (byte) 71, -12, -125, 68, 78, 51, -29);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
    public static final void method949(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2088++;
        class127.method861(arg4, arg3, arg2 + arg4, arg3 - -arg1);
        class127.method876(arg4, arg3, arg2, arg1, 0);
        int var5 = -2 / ((20 - arg0) / 32);
        if (class30.field401 < 100) {
            return;
        }
        if (class68.field959 == null || class68.field959.field3712 != arg2 || class68.field959.field3713 != arg1) {
            class12 var6 = new class12(arg2, arg1);
            class127.method867(var6.field152, arg2, arg1);
            class140.method942(0, class165.field2565, arg1, class104.field1611, 0, 0, true, arg2, 0);
            class68.field959 = var6;
            class26.field369.method513(-3);
        }
        class68.field959.method69(arg4, arg3);
        int var7 = arg4 + (class76.field1075 * arg2 / class165.field2565);
        int var8 = class49.field626 * arg1 / class104.field1611 + arg3;
        int var9 = class56.field785 * arg1 / class104.field1611;
        int var10 = class53.field727 * arg2 / class165.field2565;
        int var11 = 16711680;
        if (class80.field1151 == 1) {
            var11 = 16777215;
        }
        class127.method860(var7, var8, var10, var9, var11, 128);
        class127.method855(var7, var8, var10, var9, var11);
        if (class78.field1111 <= 0) {
            return;
        }
        int var12;
        if (class10.field147 <= 10) {
            var12 = class10.field147 * 25;
        } else {
            var12 = (20 - class10.field147) * 25;
        }
        for (class202 var13 = (class202) class249.field3984.method350(8240); var13 != null; var13 = (class202) class249.field3984.method353((byte) -120)) {
            if (class63.field888 == var13.field3167) {
                int var14 = var13.field3162 * arg2 / class165.field2565 + arg4;
                int var15 = var13.field3164 * arg1 / class104.field1611 + arg3;
                class127.method860(var14 - 2, var15 + -2, 4, 4, 16776960, var12);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public static void method950(int arg0) {
        if (arg0 == -5628) {
            field2085 = null;
            field2089 = null;
        }
    }
}
