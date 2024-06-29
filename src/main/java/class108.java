import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class108 extends class49 {

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[Lwk;")
    public static class294[] field1683 = new class294[14];

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lti;")
    public static class5 field1682 = new class5(128);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public static final void method760(byte arg0) {
        field1678++;
        if (!class143.method981(22351) && class87.field1367 != class214.field3389) {
            class93.method655(class214.field3389, class296.field4824, false, class217.field3408.field956[0], false, class217.field3408.field965[0], class311.field5030, 40);
            return;
        }
        class152.method1030(false);
        if (class92.field1469 != class214.field3389) {
            class89.method623((byte) 117);
        }
        if (arg0 < 85) {
            field1681 = -37;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
    public static void method761(byte arg0) {
        field1683 = null;
        field1682 = null;
        if (arg0 != -10) {
            method764(35, (byte) 45);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIILjava/lang/String;)Z")
    public static final boolean method762(boolean arg0, int arg1, int arg2, String arg3) {
        field1679++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        if (arg1 != -6558) {
            field1685 = -37;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public static final void method763(boolean arg0) {
        field1684++;
        int var1 = class251.field4125.length;
        if (arg0) {
            field1682 = null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class251.field4125[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class21.field406; var4++) {
                    if (class192.field3142[var4] == class122.field1938[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class192.field3142[class21.field406] = class122.field1938[var2];
                    var3 = class21.field406++;
                }
                class274 var5 = new class274(class251.field4125[var2]);
                int var6 = 0;
                while (class251.field4125[var2].length > var5.field4458 && var6 < 511 && class91.field1439 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1837(252);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3F;
                    int var11 = (var8 & 0x1F92) >> 7;
                    int var12 = (class122.field1938[var2] & 0xFF) * 64 + var10 - class145.field2327;
                    int var13 = (class122.field1938[var2] >> 8) * 64 + var11 - class75.field1211;
                    class242 var14 = class206.method1422(var5.method1837(252), (byte) 55);
                    if (class131.field2113[var7] == null && (var14.field3817 & 0x1) > 0 && class87.field1367 == var9 && var13 >= 0 && (var13 + var14.field3789) < 104 && var12 >= 0 && var14.field3789 + var12 < 104) {
                        class131.field2113[var7] = new class104();
                        class104 var15 = class131.field2113[var7];
                        class34.field556[class91.field1439++] = var7;
                        var15.field907 = class274.field4472;
                        var15.method743(var14, (byte) -105);
                        var15.method408(7, var15.field1645.field3789);
                        var15.field963 = var15.field954 = class120.field1908[var15.field1645.field3839];
                        var15.field897 = var15.field1645.field3822;
                        var15.field933 = var15.field1645.field3804;
                        if (var15.field933 == 0) {
                            var15.field954 = 0;
                        }
                        var15.method397(-17192, var12, var15.method101(false), true, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)V")
    public static final void method764(int arg0, byte arg1) {
        field1680++;
        if (!class186.field3077) {
            arg0 = -1;
        }
        if (class132.field2119 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class84 var2 = class193.method1350(true, arg0);
            class67 var3 = var2.method603(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class44.field659.method484(new Point(var2.field1335, var2.field1343), var3.field4778, var3.method458(), var3.field4781, (byte) 107, class122.field1926);
                class132.field2119 = arg0;
            }
        }
        if (arg0 == -1 && class132.field2119 != -1) {
            class44.field659.method484(new Point(), -1, (int[]) null, -1, (byte) 107, class122.field1926);
            class132.field2119 = -1;
        }
        if (arg1 >= -91) {
            field1681 = -3;
        }
    }
}
