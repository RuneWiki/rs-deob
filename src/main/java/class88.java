import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class88 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Z")
    public static boolean field1213 = false;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field1212 = -1;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method619(int arg0, String arg1, boolean arg2) {
        String var3 = arg1.toLowerCase();
        field1209++;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class249.field3991; var6++) {
            class208 var9 = class64.method514(var6, arg0 ^ 0x1E2A);
            if ((!arg2 || var9.field3357) && var9.field3370 == -1 && var9.field3399 == -1 && var9.field3377 == 0 && var9.field3358.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class183.field2931 = -1;
                    class197.field3177 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        if (arg0 != 7722) {
            field1213 = false;
        }
        class197.field3177 = var4;
        class183.field2931 = var5;
        String[] var7 = new String[class183.field2931];
        class278.field4459 = 0;
        for (int var8 = 0; var8 < class183.field2931; var8++) {
            var7[var8] = class64.method514(var4[var8], 0).field3358;
        }
        class173.method1205(class197.field3177, var7, (byte) 30);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
    public abstract void method620(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V")
    public abstract void method621(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Leb;II)V")
    public static final void method622(class103[] arg0, int arg1, int arg2) {
        if (arg2 > -115) {
            field1212 = -32;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class103 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field1655 == 0) {
                    if (var4.field1624 != null) {
                        method622(var4.field1624, arg1, -118);
                    }
                    class128 var5 = (class128) class294.field4656.method457((long) var4.field1659, (byte) -115);
                    if (var5 != null) {
                        class76.method577(var5.field2135, arg1, 21767);
                    }
                }
                if (arg1 == 0 && var4.field1697 != null) {
                    class173 var6 = new class173();
                    var6.field2798 = var4.field1697;
                    var6.field2796 = var4;
                    class223.method1480(8170, var6);
                }
                if (arg1 == 1 && var4.field1577 != null) {
                    if (var4.field1680 >= 0) {
                        class103 var7 = class168.method1180(8931, var4.field1659);
                        if (var7 == null || var7.field1624 == null || var7.field1624.length <= var4.field1680 || var7.field1624[var4.field1680] != var4) {
                            continue;
                        }
                    }
                    class173 var8 = new class173();
                    var8.field2798 = var4.field1577;
                    var8.field2796 = var4;
                    class223.method1480(8170, var8);
                }
            }
        }
        field1202++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V")
    public static final void method623(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1211++;
        class283 var5 = class46.method360(8, -85, arg3);
        var5.method1893(arg1 ^ arg1);
        var5.field4527 = arg4;
        var5.field4523 = arg0;
        var5.field4528 = arg2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZBLeb;)V")
    public static final void method624(boolean arg0, byte arg1, class103 arg2) {
        if (arg1 <= 95) {
            return;
        }
        int var3 = arg2.field1721 == 0 ? arg2.field1691 : arg2.field1721;
        field1201++;
        int var4 = arg2.field1561 == 0 ? arg2.field1693 : arg2.field1561;
        class151.method1023((byte) 122, arg0, arg2.field1659, class133.field2204[arg2.field1659 >> 16], var4, var3);
        if (arg2.field1624 != null) {
            class151.method1023((byte) 118, arg0, arg2.field1659, arg2.field1624, var4, var3);
        }
        class128 var5 = (class128) class294.field4656.method457((long) arg2.field1659, (byte) -115);
        if (var5 != null) {
            class242.method1595(var4, arg0, -80, var5.field2135, var3);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static final void method625(boolean arg0) {
        field1210++;
        class58.method444(-4);
        class155.method1042(-4);
        class283.method1899(-128);
        class140.method959(-82);
        class10.method61((byte) -121);
        class285.method1914(-23988);
        class150.method1019((byte) 127);
        class248.method1640((byte) 104);
        class21.method148(-1);
        class246.method1627(118);
        class226.method1492(0);
        class93.method650((byte) 76);
        class291.method1950(-128);
        class234.method1547(46);
        class169.method1189((byte) 113);
        class74.method564(true);
        class115.method821(-118);
        if (arg0) {
            field1215 = 89;
        }
        class127.method888(12634);
        class153.method1035((byte) -8);
        class1.method1((byte) -52);
        class83.field1150.method1831(-116);
        class272.field4398.method1831(-118);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lhi;IZ)V")
    public static final void method626(class264 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field1214++;
        if (class101.field1525 == null) {
            return;
        }
        try {
            class101.field1525.method1057((byte) -116, 0L);
            class101.field1525.method1050(arg0.field4198, (byte) 45, 24, arg1);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
    public static final void method627(boolean arg0) {
        field1203++;
        int[] var1 = new int[class249.field3991];
        if (arg0) {
            method627(true);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class249.field3991; var3++) {
            class208 var5 = class64.method514(var3, 0);
            if (var5.field3382 >= 0 || var5.field3401 >= 0) {
                var1[var2++] = var3;
            }
        }
        class129.field2166 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class129.field2166[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILeb;)Z")
    public static final boolean method628(int arg0, class103 arg1) {
        field1205++;
        if (arg0 != -1) {
            field1215 = -69;
        }
        if (arg1.field1716 == 205) {
            class128.field2139 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIB)V")
    public abstract void method629(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(III)V")
    public class88(int arg0, int arg1, int arg2) {
        this.field1200 = arg2;
        this.field1208 = arg1;
        this.field1207 = arg0;
    }
}
