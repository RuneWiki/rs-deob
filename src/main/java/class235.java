import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class235 extends class747 {

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "Lkq;")
    public static class345 field3478 = new class345();

    @OriginalMember(owner = "client!wv", name = "H", descriptor = "I")
    public static int field3480 = -1;

    @OriginalMember(owner = "client!wv", name = "E", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!wv", name = "G", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!wv", name = "I", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!wv", name = "J", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!wv", name = "K", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!wv", name = "M", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V", line = 3)
    public class235() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method182(int arg0, int arg1) {
        field3483++;
        if (arg1 > -89) {
            method1565(true, -57, null);
        }
        return class639.field8571;
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(B)V", line = 18)
    public static void method1563(byte arg0) {
        if (arg0 != -119) {
            method1567(null, (byte) 28, null);
        }
        field3478 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILjava/awt/Component;)Leh;", line = 33)
    public static final class259 method1564(int arg0, Component arg1) {
        field3484++;
        return arg0 == 9 ? new class22(arg1) : null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZILwq;)V", line = 46)
    public static final void method1565(boolean arg0, int arg1, class679 arg2) {
        field3482++;
        if (class284.field4103 >= 400) {
            return;
        }
        class123 var3 = arg2.field9436;
        if (arg1 != -24434) {
            return;
        }
        String var4 = arg2.field9425;
        if (var3.field1700 != null) {
            var3 = var3.method773(class124.field1712, false);
            if (var3 == null) {
                return;
            }
            var4 = var3.field1691;
        }
        if (!var3.field1647) {
            return;
        }
        if (arg2.field9419 != 0) {
            String var5 = class712.field9955 == class289.field4140 ? class155.field2149.method978(class120.field1576, (byte) -108) : class155.field2147.method978(class120.field1576, (byte) -126);
            var4 = var4 + class49.method353(class388.field5601.field1342, arg2.field9419, arg1 + 32523) + " (" + var5 + arg2.field9419 + ")";
        }
        if (class160.field2235 && !arg0) {
            class648 var6 = class41.field505 == -1 ? null : class360.field5161.method2279(arg1 + 24325, class41.field505);
            if ((class623.field8403 & 0x2) != 0 && (var6 == null || var3.method763(class41.field505, arg1 ^ 0xFFFF9E49, var6.field8689) != var6.field8689)) {
                class300.method1979(true, class721.field10028, false, -1, class468.field6500 + " -> <col=ffff00>" + var4, (long) arg2.field7148, (byte) 115, false, 0, (long) arg2.field7148, 0, 22, class488.field6817);
                class364.field5187++;
            }
        }
        if (!arg0) {
            String[] var7 = var3.field1670;
            if (class30.field361) {
                var7 = class216.method1270(var7, false);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field1630 == 0 || !var7[var8].equalsIgnoreCase(class155.field2142.method978(class120.field1576, (byte) -110)))) {
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 3;
                        }
                        int var10 = class42.field520;
                        if (var8 == 1) {
                            var9 = 17;
                        }
                        if (var8 == 2) {
                            var9 = 10;
                        }
                        if (var8 == 3) {
                            var9 = 45;
                        }
                        if (var3.field1664 == var8) {
                            var10 = var3.field1643;
                        }
                        if (var8 == 4) {
                            var9 = 9;
                        }
                        if (var3.field1642 == var8) {
                            var10 = var3.field1674;
                        }
                        class300.method1979(true, var7[var8].equalsIgnoreCase(class155.field2142.method978(class120.field1576, (byte) -109)) ? var3.field1666 : var10, false, -1, "<col=ffff00>" + var4, (long) arg2.field7148, (byte) 115, false, 0, (long) arg2.field7148, 0, var9, var7[var8]);
                        class665.field9165++;
                    }
                }
            }
            if (var3.field1630 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class155.field2142.method978(class120.field1576, (byte) -112))) {
                        short var12 = 0;
                        if (class388.field5601.field1342 < arg2.field9419) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 3;
                        }
                        if (var11 == 1) {
                            var13 = 17;
                        }
                        if (var11 == 2) {
                            var13 = 10;
                        }
                        if (var11 == 3) {
                            var13 = 45;
                        }
                        if (var11 == 4) {
                            var13 = 9;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class300.method1979(true, var3.field1666, false, -1, "<col=ffff00>" + var4, (long) arg2.field7148, (byte) 115, false, 0, (long) arg2.field7148, 0, var13, var7[var11]);
                        class489.field6837++;
                    }
                }
            }
        }
        class263.field3857++;
        class300.method1979(true, class323.field4473, arg0, -1, "<col=ffff00>" + var4, (long) arg2.field7148, (byte) 115, false, 0, (long) arg2.field7148, 0, 1007, class155.field2141.method978(class120.field1576, (byte) -124));
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V", line = 212)
    public static final void method1566(int arg0) {
        field3477++;
        if (arg0 != 16349) {
            field3478 = null;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class669.field9236[var1] = true;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/awt/Frame;BLrp;)V", line = 233)
    public static final void method1567(Frame arg0, byte arg1, class135 arg2) {
        while (true) {
            class246 var3 = arg2.method870((byte) 118, arg0);
            while (var3.field3633 == 0) {
                class688.method3874(10L, -7375);
            }
            if (var3.field3633 == 1) {
                field3479++;
                arg0.setVisible(false);
                arg0.dispose();
                if (arg1 != 92) {
                    method1563((byte) 62);
                    return;
                }
                return;
            }
            class688.method3874(100L, arg1 ^ 0xFFFFE36D);
        }
    }
}
