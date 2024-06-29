import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class643 extends InputStream {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field8627 = 0;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "[Z")
    public static boolean[] field8628 = new boolean[8];

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!vm", name = "read", descriptor = "()I", line = 3)
    public final int read() {
        class486.method2722(0, 30000L);
        field8633++;
        return -1;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)Z", line = 12)
    public static final boolean method3535(int arg0, int arg1, int arg2) {
        field8629++;
        if (arg2 != -53212090) {
            method3535(-22, 110, -112);
        }
        return (arg1 & 0x70000) != 0 | class695.method3846((byte) -36, arg0, arg1) || class74.method563(arg1, (byte) 115, arg0);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 35)
    public static void method3536(int arg0) {
        field8628 = null;
        if (arg0 >= -48) {
            method3537((byte) -17, 8, null);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BILcea;)Z", line = 51)
    public static final boolean method3537(byte arg0, int arg1, class201 arg2) {
        field8630++;
        int var3 = arg2.method1318(-117, 2);
        if (var3 == 0) {
            if (arg2.method1318(-37, 1) != 0) {
                method3537((byte) -126, arg1, arg2);
            }
            int var4 = arg2.method1318(-43, 6);
            int var5 = arg2.method1318(-75, 6);
            boolean var6 = arg2.method1318(-62, 1) == 1;
            if (var6) {
                class24.field415[class220.field3113++] = arg1;
            }
            if (class572.field7601[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class8 var7 = class541.field7123[arg1];
            class403 var8 = class572.field7601[arg1] = new class403();
            var8.field5633 = arg1;
            if (class131.field2156[arg1] != null) {
                var8.method2318(class131.field2156[arg1], 795);
            }
            var8.method2359(var7.field190, (byte) -126, true);
            var8.field5551 = var7.field191;
            int var9 = var7.field187;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            var8.field5394 = var7.field189;
            var8.field5650[0] = class425.field5841[arg1];
            var8.field8609 = (byte) var10;
            var8.method2314((var12 << 6) + var5 - class233.field3269, 0, (var11 << 6) + var4 - class473.field6334);
            var8.field5386 = false;
            class541.field7123[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg2.method1318(113, 2);
            int var14 = class541.field7123[arg1].field187;
            class541.field7123[arg1].field187 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg2.method1318(-119, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class541.field7123[arg1].field187;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class541.field7123[arg1].field187 = (var20 << 14) + (var19 << 28) + var21;
            return false;
        } else {
            int var22 = arg2.method1318(109, 18);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFFAC) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class541.field7123[arg1].field187;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            if (arg0 >= -107) {
                return false;
            } else {
                int var29 = var25 + var26 & 0xFF;
                class541.field7123[arg1].field187 = (var28 << 14) + (var27 << 28) + var29;
                return false;
            }
        }
    }
}
