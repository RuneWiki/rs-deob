import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class207 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Lbe;")
    public static class283 field3555 = class153.method941(126, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!li", name = "g", descriptor = "[I")
    public static int[] field3561 = new int[5];

    @OriginalMember(owner = "client!li", name = "d", descriptor = "S")
    public static short field3558 = 256;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[Lul;")
    public static class39[] field3560;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lug;", line = 4)
    public static final class291 method1375(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class291 var4 = var3.field2642;
            var3.field2642 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 22)
    public static void method1376(byte arg0) {
        field3560 = null;
        if (arg0 != -127) {
            method1375(80, -31, 49);
        }
        field3561 = null;
        field3555 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLfe;)V", line = 41)
    public static final void method1377(byte arg0, class229 arg1) {
        field3556++;
        while (true) {
            while (arg1.field3879.length > arg1.field3905) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method1535((byte) 94) == 1) {
                    var2 = arg1.method1535((byte) 126);
                    var4 = arg1.method1535((byte) 97);
                    var3 = true;
                }
                int var5 = arg1.method1535((byte) 102);
                int var6 = arg1.method1535((byte) 95);
                int var7 = var5 * 64 - class123.field2045;
                int var8 = class134.field2254 + class110.field1865 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class77.field1345 > (var7 + 63) && var8 < class134.field2254) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && var2 * 8 + 8 > var11 && var12 >= var4 * 8 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method1497(false);
                                if (var13 != 0) {
                                    if (class71.field1225[var9][var10] == null) {
                                        class71.field1225[var9][var10] = new byte[4096];
                                    }
                                    class71.field1225[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1497(false);
                                    if (class77.field1346[var9][var10] == null) {
                                        class77.field1346[var9][var10] = new byte[4096];
                                    }
                                    class77.field1346[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1497(false);
                        if (var16 != 0) {
                            arg1.field3905++;
                        }
                    }
                }
            }
            int var17 = -122 % ((30 - arg0) / 42);
            return;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 142)
    public static final int method1378(KeyEvent arg0, int arg1) {
        field3557++;
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return arg1 >= -95 ? -13 : var2;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lbm;", line = 180)
    public static final class129 method1379(int arg0, int arg1) {
        field3562++;
        class129 var2 = (class129) class87.field1466.method1629(arg0 ^ 0xFFFFFF80, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field50.method1107(class216.method1427(arg1, -1147987632), class200.method1285(2001, arg1), 119);
        if (arg0 != -63) {
            field3560 = (class39[]) null;
        }
        class129 var4 = new class129();
        var4.field2174 = arg1;
        if (var3 != null) {
            var4.method812((byte) 110, new class229(var3));
        }
        var4.method809(true);
        class87.field1466.method1630(true, (long) arg1, var4);
        return var4;
    }
}
