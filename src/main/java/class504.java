import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class504 extends class382 {

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public int field7362;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public int field7363;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public int field7364;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public int field7367;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Lms;")
    public class535 field7365;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBLsf;Ljc;IIILig;)V", line = 5)
    public static final void method3028(int arg0, byte arg1, class366 arg2, class306 arg3, int arg4, int arg5, int arg6, class163 arg7) {
        field7361++;
        if (arg1 != 86) {
            return;
        }
        class358 var8 = new class358();
        var8.field5267 = arg0 << 7;
        var8.field5245 = arg6;
        var8.field5262 = arg4 << 7;
        if (arg3 != null) {
            var8.field5252 = arg3;
            int var10 = arg3.field4601;
            int var11 = arg3.field4595;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg3.field4595;
                var11 = arg3.field4601;
            }
            var8.field5250 = arg4 + var10 << 7;
            var8.field5255 = arg0 + var11 << 7;
            var8.field5249 = arg3.field4607;
            var8.field5264 = arg3.field4585;
            var8.field5247 = arg3.field4565 << 7;
            var8.field5256 = arg3.field4562;
            var8.field5246 = arg3.field4646;
            var8.field5265 = arg3.field4577;
            if (arg3.field4593 != null) {
                var8.field5268 = true;
                var8.method2208(76);
            }
            if (var8.field5249 != null) {
                var8.field5257 = (int) ((double) (var8.field5246 - var8.field5265) * Math.random()) + var8.field5265;
            }
            class378.field5531.method1885(false, var8);
        } else if (arg7 != null) {
            var8.field5253 = arg7;
            class51 var9 = arg7.field2613;
            if (var9.field1038 != null) {
                var8.field5268 = true;
                var9 = var9.method475(class402.field6080, -1);
            }
            if (var9 != null) {
                var8.field5255 = arg0 + var9.field1050 << 7;
                var8.field5250 = arg4 + var9.field1050 << 7;
                var8.field5256 = class405.method2518(arg7, -5662);
                var8.field5264 = var9.field1056;
                var8.field5247 = var9.field1043 << 7;
            }
            class492.field7212.method1885(false, var8);
        } else if (arg2 != null) {
            var8.field5263 = arg2;
            var8.field5250 = arg4 + arg2.method2241(-40) << 7;
            var8.field5255 = arg0 + arg2.method2241(-101) << 7;
            var8.field5256 = class268.method1705((byte) -82, arg2);
            var8.field5247 = arg2.field5380 << 7;
            var8.field5264 = arg2.field5347;
            class407.field6167.method1618(var8, (long) arg2.field7789, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I", line = 96)
    public static final int method3029(int arg0, int arg1) {
        if (arg1 > -34) {
            method3029(68, 43);
        }
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        field7366++;
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
