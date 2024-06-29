import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class213 {

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Z")
    public static volatile boolean field2886 = true;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2880 = "glow2:";

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2887 = "glow1:";

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
    public static boolean field2883 = false;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Lam;")
    public static class286 field2884;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field2888;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lur;B)V", line = 4)
    public static final void method1154(class91 arg0, byte arg1) {
        field2885++;
        if (class244.field3323 >= 400) {
            return;
        }
        class345 var2 = arg0.field1035;
        if (var2.field4672 != null) {
            var2 = var2.method2026(-1);
            if (var2 == null) {
                return;
            }
        }
        if (!var2.field4660 || arg1 < 44) {
            return;
        }
        String var3 = var2.field4653;
        if (var2.field4674 != 0) {
            String var4 = class62.field636 == 1 ? class57.field586 : class366.field5131;
            var3 = var3 + class54.method269(class427.field6264.field2022, var2.field4674, (byte) -68) + " (" + var4 + var2.field4674 + ")";
        }
        if (class171.field2155 == 1) {
            class353.field4955++;
            class380.method2342(0, class114.field1425 + " -> <col=ffff00>" + var3, (byte) -102, (long) arg0.field6095, class418.field6013, class12.field113, 0, 48);
        } else if (class65.field682) {
            class193 var12 = class291.field3960 == -1 ? null : class110.method580(class291.field3960, true);
            if ((class306.field4143 & 0x2) != 0) {
                if (var12 == null || var2.method2025(class291.field3960, var12.field2441, -1) != var12.field2441) {
                    class3.field26++;
                    class380.method2342(0, class77.field874 + " -> <col=ffff00>" + var3, (byte) -110, (long) arg0.field6095, class383.field5467, class132.field1699, 0, 20);
                }
                return;
            }
        } else {
            String[] var5 = var2.field4675;
            if (class87.field977) {
                var5 = class435.method2693(-20122, var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && (class62.field636 != 0 || !var5[var6].equalsIgnoreCase(class305.field4135))) {
                        byte var7 = 0;
                        int var8 = class110.field1358;
                        if (var6 == 0) {
                            var7 = 40;
                        }
                        if (var6 == 1) {
                            var7 = 50;
                        }
                        if (var6 == 2) {
                            var7 = 37;
                        }
                        if (var6 == 3) {
                            var7 = 30;
                        }
                        if (var6 == 4) {
                            var7 = 12;
                        }
                        if (var2.field4688 == var6) {
                            var8 = var2.field4693;
                        }
                        if (var2.field4652 == var6) {
                            var8 = var2.field4646;
                        }
                        class380.method2342(0, "<col=ffff00>" + var3, (byte) -124, (long) arg0.field6095, var8, var5[var6], 0, var7);
                        class140.field1788++;
                    }
                }
            }
            if (class62.field636 == 0 && var5 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var5[var9] != null && var5[var9].equalsIgnoreCase(class305.field4135)) {
                        short var10 = 0;
                        if (var2.field4674 > class427.field6264.field2022) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 40;
                        }
                        if (var9 == 1) {
                            var11 = 50;
                        }
                        if (var9 == 2) {
                            var11 = 37;
                        }
                        if (var9 == 3) {
                            var11 = 30;
                        }
                        if (var9 == 4) {
                            var11 = 12;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class126.field1620++;
                        class380.method2342(0, "<col=ffff00>" + var3, (byte) -114, (long) arg0.field6095, var2.field4681, var5[var9], 0, var11);
                    }
                }
            }
            class380.method2342(0, "<col=ffff00>" + var3, (byte) -110, (long) arg0.field6095, class356.field5023, class434.field6349, 0, 1011);
            field2882++;
            return;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 170)
    public static void method1155(int arg0) {
        field2887 = null;
        if (arg0 == 0) {
            field2880 = null;
            field2884 = null;
            field2888 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)I", line = 187)
    public static final int method1156(int arg0, int arg1) {
        field2879++;
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAA) >>> 1);
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg0 != 0) {
            method1156(65, 89);
        }
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
