import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class177 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field2953 = -1;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "S")
    public static short field2955 = 32767;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Leg;")
    public static class37 field2962 = class174.method1167("<)4col>", -96);

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Leg;")
    public static class37 field2960 = class174.method1167(")0", -55);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Ljl;")
    public static class101 field2959;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Llb;")
    public static class207 field2957;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[I")
    public static int[] field2961;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[[[I")
    public static int[][][] field2958;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
    public static final void method1179(int arg0, int arg1, int arg2) {
        field2954++;
        for (int var3 = 0; var3 < class271.field4759; var3++) {
            class110 var4 = class152.method1037(var3, arg2 - 64508);
            if (var4 != null) {
                int var5 = var4.field1843;
                if (var5 >= 0 && !class76.field1196.method708(true, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field1839 >= 0) {
                    int var6 = var4.field1839;
                    int var7 = (var6 & 0x7F) + arg1;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class76.field1183[class263.method1779(96, arg2 ^ 0xFFFF0382, var8)];
                } else if (var5 >= 0) {
                    var9 = class76.field1183[class263.method1779(96, -124, class76.field1196.method717(0, var5))];
                } else if (var4.field1846 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field1846;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 + arg0 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class76.field1183[class263.method1779(96, -128, var12)];
                }
                field2961[var3 + 1] = var9;
            }
        }
        if (arg2 != 64512) {
            method1182(-75);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2956++;
        if (arg0 != 768) {
            return;
        }
        int var9 = arg6 - arg5;
        int var10 = arg1 - arg8;
        int var11 = (arg2 - arg7 << 16) / var9;
        int var12 = (arg3 - arg4 << 16) / var10;
        class154.method1055(arg4, arg5, arg6, 0, (byte) 127, arg8, var11, var12, 0, arg7, arg1);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)V")
    public static final void method1181(int arg0, int arg1, int arg2, int arg3) {
        field2963++;
        if (arg3 != 906) {
            field2959 = null;
        }
        class37 var4 = class156.method1061((byte) 87, new class37[] { class263.field4627, class163.method1096(arg1, (byte) -35), class264.field4647, class163.method1096(arg0 >> 6, (byte) -35), class264.field4647, class163.method1096(arg2 >> 6, (byte) -35), class264.field4647, class163.method1096(arg0 & 0x3F, (byte) -35), class264.field4647, class163.method1096(arg2 & 0x3F, (byte) -35) });
        var4.method237((byte) -100);
        class154.method1057(arg3 + 26743, var4);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1182(int arg0) {
        field2962 = null;
        int var1 = 49 % ((38 - arg0) / 57);
        field2959 = null;
        field2957 = null;
        field2961 = null;
        field2958 = null;
        field2960 = null;
    }
}
