import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class647 {

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "B")
    public byte field9259;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public int field9248;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "S")
    public short field9252;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "S")
    public short field9245;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public int field9250;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Z")
    public boolean field9247;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public int field9258;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "S")
    public short field9254;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public int field9255;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public int field9253;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field9249 = -1;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIILha;II)V", line = 14)
    public static final void method3687(int arg0, int arg1, int arg2, int arg3, class58 arg4, int arg5, int arg6) {
        if ((class557.field7978 == null || class675.field9564 == null || class525.field7490 == null) && class394.field5410.method2463((byte) 90, class222.field2549) && class394.field5410.method2463((byte) 123, class660.field9426) && class394.field5410.method2463((byte) 93, class22.field204)) {
            class155 var7 = class155.method953(class394.field5410, class660.field9426, 0);
            class675.field9564 = arg4.method434(var7, true);
            var7.method947();
            class327.field4243 = arg4.method434(var7, true);
            class557.field7978 = arg4.method434(class155.method953(class394.field5410, class222.field2549, 0), true);
            class155 var8 = class155.method953(class394.field5410, class22.field204, 0);
            class525.field7490 = arg4.method434(var8, true);
            var8.method947();
            class22.field200 = arg4.method434(var8, true);
        }
        if (arg0 != -28759) {
            method3688(null, null, 9);
        }
        field9243++;
        if (class557.field7978 == null || class675.field9564 == null || class525.field7490 == null) {
            return;
        }
        int var9 = (arg3 - (class525.field7490.method503() * 2)) / class557.field7978.method503();
        for (int var10 = 0; var10 < var9; var10++) {
            class557.field7978.method824(arg2 + (class525.field7490.method503() + (var10 * class557.field7978.method503())), -class557.field7978.method509() + arg5 + arg6);
        }
        int var11 = ((arg6 - class525.field7490.method509()) - arg1) / class675.field9564.method509();
        for (int var12 = 0; var12 < var11; var12++) {
            class675.field9564.method824(arg2, var12 * class675.field9564.method509() + (arg5 + arg1));
            class327.field4243.method824(arg2 + arg3 - class327.field4243.method503(), class675.field9564.method509() * var12 + arg1 + arg5);
        }
        class525.field7490.method824(arg2, arg5 + arg6 - class525.field7490.method509());
        class22.field200.method824(arg2 + (arg3 - class525.field7490.method503()), -class525.field7490.method509() + arg5 + arg6);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Loaa;Lha;I)I", line = 81)
    public static final int method3688(class287 arg0, class58 arg1, int arg2) {
        field9256++;
        if (~arg0.field3537 != arg2) {
            return arg0.field3537;
        }
        if (arg0.field3530 != -1) {
            class298 var3 = arg1.field578.method931(arg0.field3530, true);
            if (!var3.field3694) {
                return var3.field3706;
            }
        }
        return arg0.field3529;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIIIIIIIB)Z", line = 105)
    public static final boolean method3689(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field9251++;
        int var9 = class90.field937.field7187[0];
        int var10 = class90.field937.field7193[0];
        if (var9 < 0 || var9 >= class489.field6976 || var10 < 0 || var10 >= class153.field1677) {
            return false;
        } else if (arg7 >= 0 && class489.field6976 > arg7 && arg3 >= 0 && arg3 < class153.field1677) {
            int var11 = class627.method3593(class286.field3490, arg3, var9, arg7, var10, class205.field2430[class90.field937.field4628], arg5, arg6, arg0, arg4, 0, arg2, class274.field3365, arg1, class90.field937.method1128(-1));
            if (var11 < 1) {
                return false;
            }
            class471.field6718 = class286.field3490[var11 - 1];
            if (arg8 != -80) {
                field9257 = 86;
            }
            class75.field796 = class274.field3365[var11 - 1];
            class115.field1202 = false;
            class286.method1705((byte) 8);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 138)
    public class647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9259 = (byte) arg8;
        this.field9248 = arg3;
        this.field9252 = (short) arg6;
        this.field9245 = (short) arg4;
        this.field9250 = arg2;
        this.field9247 = arg10;
        this.field9258 = arg0;
        this.field9254 = (short) arg5;
        this.field9255 = arg11;
        this.field9253 = arg1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z", line = 159)
    public static final boolean method3690(int arg0, int arg1, int arg2) {
        if (arg0 <= 57) {
            method3690(-103, -37, 102);
        }
        field9246++;
        return (arg2 & 0x100) != 0;
    }
}
