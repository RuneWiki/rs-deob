import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public abstract class class394 extends class444 {

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "Z")
    public boolean field6020 = false;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "Z")
    public boolean field6018 = false;

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "S")
    public short field6029;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
    public int field6022;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
    public int field6025;

    @OriginalMember(owner = "client!jw", name = "s", descriptor = "I")
    public int field6031;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "[I")
    public static int[] field6021 = new int[2];

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "Lof;")
    public static class446 field6026 = new class446("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "B")
    public static byte field6019;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!jw", name = "r", descriptor = "[I")
    public static int[] field6030;

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(IIIIZZ)V", line = 102)
    public class394(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field6018 = arg4;
        this.field6029 = (short) arg3;
        this.field6022 = arg0;
        this.field6025 = arg1;
        this.field6020 = arg5;
        this.field6031 = arg2;
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(Lqa;I)V", line = 16)
    public static final void method2451(class165 arg0, int arg1) {
        field6023++;
        arg0.method739(0, 0, class147.field1961, 350);
        arg0.method747(0, 0, class147.field1961, 350, class146.field1940 << 24 | 0x332277, 1);
        int var2 = 350 / class390.field5959;
        if (class518.field7621 > 0) {
            int var3 = 346 - class390.field5959 - 4;
            int var4 = var2 * var3 / (var2 + class518.field7621 - 1);
            int var5 = 4;
            if (class518.field7621 > 1) {
                var5 += (class518.field7621 - class251.field3496 - 1) * (var3 - var4) / (class518.field7621 - 1);
            }
            arg0.method747(class147.field1961 - 16, var5, 12, var4, class146.field1940 << 24 | 0x332277, 2);
            for (int var6 = class251.field3496; (class251.field3496 + var2) > var6 && var6 < class518.field7621; var6++) {
                String[] var7 = class61.method437(class470.field7013[var6], '\b', arg1 - 107);
                int var8 = (class147.field1961 - 16 - 8) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method739(var10, 0, var8 + var10 - 8, 350);
                    class94.field1380.method1712((byte) 66, var7[var9], -1, -16777216, var10, 350 - class531.field7815 - class263.field3684.field1191 - ((-class251.field3496 + var6) * class390.field5959) - 2);
                }
            }
        }
        arg0.method739(0, 0, class147.field1961, 350);
        arg0.method1129(class147.field1961, 350 - class531.field7815, 43, -1, 0);
        class199.field2653.method1712((byte) 66, "--> " + class4.field31, -1, -16777216, 10, arg1 - class175.field2338.field1191 - 1);
        int var11 = -1;
        if (class393.field6017 % 30 > 15) {
            var11 = 16777215;
        }
        arg0.method1121(var11, 350 - class175.field2338.field1191 - 11, 12, class175.field2338.method564(-77, "--> " + class4.field31.substring(0, class44.field639)) + 10, -26030);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)V", line = 86)
    public static void method2452(byte arg0) {
        field6021 = null;
        field6026 = null;
        field6030 = null;
        if (arg0 != -107) {
            field6028 = 7;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B[B)[B", line = 115)
    public static final byte[] method2453(byte arg0, byte[] arg1) {
        field6027++;
        if (arg0 <= 75) {
            return null;
        } else {
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class192.method1299(arg1, 0, var3, 0, var2);
            return var3;
        }
    }
}
