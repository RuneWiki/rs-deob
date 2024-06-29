import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class34 extends class297 {

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "Ljava/lang/String;")
    public static String field513 = "flash2:";

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "[I")
    public static int[] field522 = new int[256];

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "[Lkh;")
    public static class16[] field515 = new class16[6];

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "I")
    public static int field524 = -1;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "Lpk;")
    public static class120 field511;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "[I")
    public static int[] field520;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "[[[Lsg;")
    public static class42[][][] field521;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V", line = 6)
    public static final void method312(int arg0) {
        field519++;
        int var1 = 121 / ((arg0 + 78) / 40);
        for (int var2 = 0; var2 < class88.field1420; var2++) {
            int var3 = class251.field3708[var2];
            class86 var4 = class197.field3029[var3];
            int var5 = class80.field1248.method15((byte) -33);
            if ((var5 & 0x10) != 0) {
                var5 += class80.field1248.method15((byte) 60) << 8;
            }
            if ((var5 & 0x4) != 0) {
                var4.field4699 = class80.field1248.method53(32);
                var4.field4669 = 100;
            }
            if ((var5 & 0x8) != 0) {
                int var6 = class80.field1248.method19(255);
                int var7 = class80.field1248.method30(-683);
                var4.method2061(var6, class307.field4869, (byte) -41, var7);
                var4.field4703 = class307.field4869 + 300;
                var4.field4615 = class80.field1248.method30(-683);
            }
            if ((var5 & 0x80) != 0) {
                int var8 = class80.field1248.method58((byte) -78);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class80.field1248.method3((byte) -117);
                class31.method283(var9, 26506, var8, var4);
            }
            if ((var5 & 0x20) != 0) {
                int var10 = class80.field1248.method19(255);
                int var11 = class80.field1248.method3((byte) -117);
                var4.method2061(var10, class307.field4869, (byte) -70, var11);
            }
            if ((var5 & 0x100) != 0) {
                int var12 = class80.field1248.method30(-683);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class80.field1248.method29(15976);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var15[var16] = var17;
                    var13[var16] = class80.field1248.method30(-683);
                    var14[var16] = class80.field1248.method56(19612);
                }
                class168.method1253(false, var13, var14, var4, var15);
            }
            if ((var5 & 0x40) != 0) {
                int var18 = class80.field1248.method29(15976);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class80.field1248.method33(false);
                boolean var20 = true;
                if (var18 != -1 && var4.field4679 != -1 && class63.method503(class52.method429(4618, var18).field1135, (byte) 67).field583 < class63.method503(class52.method429(4618, var4.field4679).field1135, (byte) 81).field583) {
                    var20 = false;
                }
                if (var20) {
                    var4.field4647 = var19 >> 16;
                    var4.field4678 = 1;
                    var4.field4617 = 0;
                    var4.field4708 = (var19 & 0xFFFF) + class307.field4869;
                    var4.field4681 = 0;
                    if (class307.field4869 < var4.field4708) {
                        var4.field4681 = -1;
                    }
                    var4.field4679 = var18;
                    if (var4.field4679 != -1 && class307.field4869 == var4.field4708) {
                        int var21 = class52.method429(4618, var4.field4679).field1135;
                        if (var21 != -1) {
                            class38 var22 = class63.method503(var21, (byte) 126);
                            if (var22 != null && var22.field584 != null) {
                                class28.method246(false, 255, 0, var4.field4671, var22, var4.field4672);
                            }
                        }
                    }
                }
            }
            if ((var5 & 0x1) != 0) {
                if (var4.field1381.method673(false)) {
                    class207.method1527(var4, (byte) 37);
                }
                var4.method682(32090, class310.method2191(class80.field1248.method29(15976), 124));
                var4.method2069(var4.field1381.field1363, (byte) 96);
                var4.field4632 = var4.field1381.field1365;
                var4.field4683 = var4.field1381.field1315;
                if (var4.field1381.method673(false)) {
                    class158.method1167(var4.field4619[0], 0, var4, (class92) null, (class101) null, 90, var4.field4643[0], class75.field1153);
                }
            }
            if ((var5 & 0x2) != 0) {
                var4.field4695 = class80.field1248.method56(19612);
                if (var4.field4695 == 65535) {
                    var4.field4695 = -1;
                }
            }
            if ((var5 & 0x200) != 0) {
                var4.field4613 = class80.field1248.method58((byte) -78);
                var4.field4657 = class80.field1248.method58((byte) -78);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 185)
    public class34() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLaj;)Lsk;", line = 194)
    public static final class136 method313(byte arg0, class1 arg1) {
        field510++;
        if (arg0 != -37) {
            method317((Component) null, -39);
        }
        return new class136(arg1.method41((byte) -66), arg1.method41((byte) -66), arg1.method41((byte) -66), arg1.method41((byte) -66), arg1.method4(true), arg1.method4(true), arg1.method15((byte) 73));
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)V", line = 207)
    public static void method314(byte arg0) {
        int var1 = -96 / ((arg0 + 9) / 38);
        field513 = null;
        field522 = null;
        field511 = null;
        field515 = null;
        field521 = (class42[][][]) null;
        field520 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lbk;Ljava/awt/Frame;Z)V", line = 228)
    public static final void method315(class69 arg0, Frame arg1, boolean arg2) {
        while (true) {
            class23 var3 = arg0.method558(true, arg1);
            while (var3.field405 == 0) {
                class245.method1729(-10, 10L);
            }
            if (var3.field405 == 1) {
                arg1.setVisible(false);
                field514++;
                arg1.dispose();
                if (!arg2) {
                    method317((Component) null, -15);
                }
                return;
            }
            class245.method1729(126, 100L);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILpk;)V", line = 257)
    public static final void method316(int arg0, class120 arg1) {
        field523++;
        class45.field701 = arg1.method958(119, "runes");
        if (arg0 <= 57) {
            method314((byte) -96);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 274)
    public static final void method317(Component arg0, int arg1) {
        field518++;
        if (arg1 >= 60) {
            arg0.addMouseListener(class243.field3645);
            arg0.addMouseMotionListener(class243.field3645);
            arg0.addFocusListener(class243.field3645);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)[I", line = 296)
    public final int[] method173(int arg0, boolean arg1) {
        field512++;
        return arg1 ? class251.field3705 : (int[]) null;
    }
}
