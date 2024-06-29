import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class563 {

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "Ljava/lang/String;")
    private String field7600 = "null";

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "Lou;")
    public static class562 field7604 = new class562();

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "[I")
    public static int[] field7614 = new int[256];

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "C")
    public char field7607;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "C")
    public char field7608;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    private int field7611;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "Lfaa;")
    private class139 field7615;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "Lfaa;")
    public class139 field7616;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7614[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLac;)V", line = 5)
    public final void method3145(byte arg0, class501 arg1) {
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                field7612++;
                if (arg0 <= 56) {
                    this.method3147(30, -73);
                    return;
                }
                return;
            }
            this.method3151(var3, (byte) -111, arg1);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V", line = 26)
    private final void method3146(int arg0) {
        this.field7615 = new class139(this.field7616.method969((byte) -122));
        field7613++;
        if (arg0 != -306674912) {
            method3150(false, (byte) 42, null);
        }
        for (class256 var2 = (class256) this.field7616.method977(0); var2 != null; var2 = (class256) this.field7616.method975(arg0 ^ 0x12477CDF)) {
            class114 var3 = new class114(var2.field3496, (int) var2.field5623);
            this.field7615.method968(class26.method248(var2.field3496, -110), var3, arg0 + 306674911);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)I", line = 48)
    public final int method3147(int arg0, int arg1) {
        if (arg1 != -31500) {
            field7604 = null;
        }
        field7610++;
        if (this.field7616 == null) {
            return this.field7611;
        } else {
            class72 var3 = (class72) this.field7616.method970((byte) 89, (long) arg0);
            return var3 == null ? this.field7611 : var3.field956;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V", line = 69)
    public static void method3148(boolean arg0) {
        field7614 = null;
        field7604 = null;
        if (!arg0) {
            method3149(null, null, (byte) -54);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;Lac;B)I", line = 82)
    public static final int method3149(String arg0, class501 arg1, byte arg2) {
        field7606++;
        int var3 = arg1.field6892;
        byte[] var4 = class75.method582(arg0, 8217);
        arg1.method2877(var4.length, (byte) -123);
        arg1.field6892 += class84.field1246.method3399(var4.length, var4, 0, arg2 + 25445909, arg1.field6892, arg1.field6855);
        if (arg2 != -82) {
            field7614 = null;
        }
        return arg1.field6892 - var3;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZBLqh;)V", line = 102)
    public static final void method3150(boolean arg0, byte arg1, class61 arg2) {
        field7599++;
        if (arg1 > -43 || class137.field1948 >= 400) {
            return;
        }
        class568 var3 = arg2.field674;
        if (var3.field8079 != null) {
            var3 = var3.method3259((byte) 119, class578.field8156);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field8054) {
            return;
        }
        String var4 = var3.field8049;
        if (var3.field8027 != 0) {
            String var5 = class704.field9959 == class219.field3065 ? class65.field818.method555(class697.field9900, true) : class65.field816.method555(class697.field9900, true);
            var4 = var4 + class151.method1093((byte) -82, var3.field8027, class143.field2063.field9663) + " (" + var5 + var3.field8027 + ")";
        }
        if (class426.field5971 && !arg0) {
            class488 var6 = class698.field9905 == -1 ? null : class71.field952.method1977((byte) 58, class698.field9905);
            if ((class89.field1283 & 0x2) != 0 && (var6 == null || var3.method3261(-102, class698.field9905, var6.field6697) != var6.field6697)) {
                class63.field732++;
                class547.method3077(22, 0, class178.field2551, class547.field7417, false, true, class185.field2679 + " -> <col=ffff00>" + var4, (long) arg2.field1697, -102, 0, -1);
            }
        }
        if (!arg0) {
            String[] var7 = var3.field8081;
            if (class468.field6426) {
                var7 = class703.method3936(16672, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field8014 == 0 || !var7[var8].equalsIgnoreCase(class65.field811.method555(class697.field9900, true)))) {
                        byte var9 = 0;
                        int var10 = class76.field1005;
                        if (var8 == 0) {
                            var9 = 6;
                        }
                        if (var8 == 1) {
                            var9 = 57;
                        }
                        if (var8 == 2) {
                            var9 = 10;
                        }
                        if (var8 == 3) {
                            var9 = 47;
                        }
                        if (var3.field8053 == var8) {
                            var10 = var3.field8043;
                        }
                        if (var8 == 4) {
                            var9 = 49;
                        }
                        if (var3.field8031 == var8) {
                            var10 = var3.field8011;
                        }
                        class547.method3077(var9, 0, var7[var8], var7[var8].equalsIgnoreCase(class65.field811.method555(class697.field9900, true)) ? var3.field8009 : var10, false, true, "<col=ffff00>" + var4, (long) arg2.field1697, -62, 0, -1);
                        class687.field9802++;
                    }
                }
            }
            if (var3.field8014 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class65.field811.method555(class697.field9900, true))) {
                        short var12 = 0;
                        if (class143.field2063.field9663 < var3.field8027) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 6;
                        }
                        if (var11 == 1) {
                            var13 = 57;
                        }
                        if (var11 == 2) {
                            var13 = 10;
                        }
                        if (var11 == 3) {
                            var13 = 47;
                        }
                        if (var11 == 4) {
                            var13 = 49;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class250.field3405++;
                        class547.method3077(var13, 0, var7[var11], var3.field8009, false, true, "<col=ffff00>" + var4, (long) arg2.field1697, -74, 0, -1);
                    }
                }
            }
        }
        class339.field4544++;
        class547.method3077(1012, 0, class65.field810.method555(class697.field9900, true), class180.field2610, arg0, true, "<col=ffff00>" + var4, (long) arg2.field1697, -58, 0, -1);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBLac;)V", line = 266)
    private final void method3151(int arg0, byte arg1, class501 arg2) {
        field7609++;
        if (arg0 == 1) {
            this.field7607 = class435.method2490(-128, arg2.method2863(110));
        } else if (arg0 == 2) {
            this.field7608 = class435.method2490(-128, arg2.method2863(113));
        } else if (arg0 == 3) {
            this.field7600 = arg2.method2851((byte) -119);
        } else if (arg0 == 4) {
            this.field7611 = arg2.method2840(false);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method2845(-1);
            this.field7616 = new class139(class206.method1334(-1, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2840(false);
                class401 var7;
                if (arg0 == 5) {
                    var7 = new class256(arg2.method2851((byte) -84));
                } else {
                    var7 = new class72(arg2.method2840(false));
                }
                this.field7616.method968((long) var6, var7, -1);
            }
        }
        if (arg1 >= -103) {
            field7614 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V", line = 322)
    private final void method3152(int arg0) {
        field7617++;
        this.field7615 = new class139(this.field7616.method969((byte) -125));
        for (class72 var2 = (class72) this.field7616.method977(0); var2 != null; var2 = (class72) this.field7616.method975(-1)) {
            class72 var3 = new class72((int) var2.field5623);
            this.field7615.method968((long) var2.field956, var3, -1);
        }
        if (arg0 != -5309) {
            field7604 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)I", line = 344)
    public static final int method3153(int arg0) {
        field7602++;
        if (arg0 != 3439) {
            return -21;
        }
        class166 var1 = class334.field4506;
        boolean var2 = false;
        if (class503.field6917 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class166.method1169(96, 0, 0, var3, null, null);
            var2 = true;
        }
        long var4 = class577.method3295((byte) 15);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method119(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class577.method3295((byte) 15) - var4);
        var1.method1170(-16777216, 100, 0, 100, 0, arg0 ^ 0xFFFF9CBE);
        if (var2) {
            var1.method1168(89);
        }
        return var7;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)Z", line = 389)
    public final boolean method3154(int arg0, int arg1) {
        field7601++;
        if (this.field7616 == null) {
            return false;
        }
        if (this.field7615 == null) {
            this.method3152(-5309);
        }
        if (arg1 != 0) {
            method3148(true);
        }
        class72 var3 = (class72) this.field7615.method970((byte) 89, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(II)Ljava/lang/String;", line = 416)
    public final String method3155(int arg0, int arg1) {
        field7605++;
        if (this.field7616 == null) {
            return this.field7600;
        }
        if (arg0 != 0) {
            this.field7607 = 'Y';
        }
        class256 var3 = (class256) this.field7616.method970((byte) 89, (long) arg1);
        return var3 == null ? this.field7600 : var3.field3496;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 444)
    public final boolean method3156(byte arg0, String arg1) {
        field7603++;
        if (arg0 != 126) {
            return false;
        } else if (this.field7616 == null) {
            return false;
        } else {
            if (this.field7615 == null) {
                this.method3146(-306674912);
            }
            for (class114 var3 = (class114) this.field7615.method970((byte) 89, class26.method248(arg1, -106)); var3 != null; var3 = (class114) this.field7615.method976((byte) -81)) {
                if (var3.field1573.equals(arg1)) {
                    return true;
                }
            }
            return false;
        }
    }
}
