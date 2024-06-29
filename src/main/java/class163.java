import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class163 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1993 = 0;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1994 = 0;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILoh;I)Lbo;")
    public static final class760 method1140(int arg0, int arg1, class425 arg2, int arg3) {
        field1995++;
        if (arg3 != -1394844150) {
            field1993 = 101;
        }
        int var4 = arg1 << 10 | arg2.field5641;
        class760 var5 = (class760) class569.field7811.method901((long) var4 << 16, -86);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class251.field2945.method453(class251.field2945.method447(var4, (byte) 102), 11040);
        if (var6 == null) {
            int var9 = arg2.field5641 | arg0 + 65536 << 10;
            class760 var10 = (class760) class569.field7811.method901((long) var9 << 16, 126);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class251.field2945.method453(class251.field2945.method447(var9, (byte) 98), arg3 ^ 0xACDC752A);
            if (var11 == null) {
                int var14 = arg2.field5641 | 0x3FFFC00;
                class760 var15 = (class760) class569.field7811.method901((long) var14 << 16, arg3 ^ 0xACDC5E75);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class251.field2945.method453(class251.field2945.method447(var14, (byte) 93), arg3 + 1394855190);
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class760 var17;
                    try {
                        var17 = class776.method4312(arg3 ^ 0x5323A1CC, var16);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field10515 = arg2;
                    class569.field7811.method897((long) var14 << 16, var17, false);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class760 var12;
                try {
                    var12 = class776.method4312(54, var11);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field10515 = arg2;
                class569.field7811.method897((long) var9 << 16, var12, false);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class760 var7;
            try {
                var7 = class776.method4312(arg3 ^ 0xACDC5E65, var6);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field10515 = arg2;
            class569.field7811.method897((long) var4 << 16, var7, false);
            return var7;
        }
    }
}
