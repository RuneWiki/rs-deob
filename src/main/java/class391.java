import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class391 extends class105 {

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public int field5461;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public int field5462;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public int field5463;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    public int field5465;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "Leq;")
    public static class209 field5460;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "Ljava/lang/String;")
    public String field5458;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIBJ)V", line = 4)
    public static final void method2436(int arg0, int arg1, byte arg2, long arg3) {
        field5466++;
        int var5 = ((int) arg3 & 0x7FFF6) >> 14;
        int var6 = (int) arg3 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class414 var8 = class66.field1181.method131(2, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field5732;
                var10 = var8.field5800;
            } else {
                var9 = var8.field5800;
                var10 = var8.field5732;
            }
            int var11 = var8.field5746;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class453.method2713(var11, true, var9, (byte) -127, 0, var10, arg1, arg0, 0);
        } else {
            class453.method2713(0, true, 0, (byte) -112, var5, 0, arg1, arg0, var6);
        }
        if (arg2 != 112) {
            method2436(-61, -69, (byte) -69, -78L);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 53)
    public static final int method2437(String arg0, byte arg1) {
        field5459++;
        if (arg1 != -66) {
            method2438(73, -128, 90, 70, 34);
        }
        for (int var2 = 0; var2 < class415.field5815.length; var2++) {
            if (class415.field5815[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIII)V", line = 74)
    public static final void method2438(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5456++;
        float var5 = (float) class542.field7636 / (float) class542.field7639;
        int var6 = arg2;
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg1 - (arg2 - var6) / 2;
        int var9 = arg3 - (arg4 - var7) / 2;
        class590.field8288 = class542.field7636 - (class542.field7636 * var9 / var7);
        class358.field5026 = -1;
        class587.field8271 = class542.field7639 * var8 / var6;
        class320.field4554 = arg0;
        class63.method682((byte) 123);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 101)
    public static void method2439(int arg0) {
        if (arg0 != 0) {
            method2436(-94, 118, (byte) -50, 90L);
        }
        field5460 = null;
    }
}
