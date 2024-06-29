import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class558 {

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    private int field8300;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    private int field8298;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    private int field8295;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    private int field8284;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    private int field8296;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    private int field8290;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    private int field8285;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    private int field8292;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    private int field8297;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    private int field8291;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Lis;")
    public static class429 field8294 = new class429();

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "Lada;")
    public static class144 field8299 = new class144(4, -2);

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lqa;Ljj;BLbc;)V")
    public static final void method3361(class208 arg0, class101 arg1, byte arg2, class308 arg3) {
        if (arg2 != -7) {
            return;
        }
        field8289++;
        class53 var4 = arg3.method1879(arg0, 116);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method325();
        if (var5 < var4.method318()) {
            var5 = var4.method318();
        }
        byte var6 = 10;
        int var7 = arg1.field1467;
        int var8 = arg1.field1466;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field4235 != null) {
            var9 = class335.field4642.method2129((byte) -126, null, class116.field1634, null, arg3.field4235);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class116.field1634[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class117.field1641.method3537(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class117.field1641.method3533() * var9 + class117.field1641.method3534() / 2;
        }
        int var15 = var5 / 2 + arg1.field1467;
        if ((class339.field4691 + var5) > var7) {
            var7 = class339.field4691;
            var15 = var10 / 2 + (class339.field4691 + var6 + (var5 / 2)) + 5;
        } else if (class339.field4694 - var5 < var7) {
            var15 = class339.field4694 - var6 - var5 / 2 - var10 / 2 - 5;
            var7 = class339.field4694 - var5;
        }
        int var16 = arg1.field1466;
        if (class339.field4684 + var5 > var8) {
            var16 = class339.field4684 + var6 + (var5 / 2);
            var8 = class339.field4684;
        } else if (class339.field4687 - var5 < var8) {
            var16 = class339.field4687 - var6 - var11 - (var5 / 2);
            var8 = class339.field4687 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field1467), (double) (var8 - arg1.field1466)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method328((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field4235 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var16 + (class117.field1641.method3533() * var9) + 3;
            var20 = var10 + var18 + 10;
            if (arg3.field4217 != 0) {
                arg0.method1378(true, var18, arg3.field4217, var20 - var18, -var16 + var21, var16);
            }
            if (arg3.field4220 != 0) {
                arg0.method1374(true, var21 - var16, var20 - var18, arg3.field4220, var18, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class116.field1634[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class117.field1641.method3535(arg0, var23, var15, var16, arg3.field4251, true);
                var16 += class117.field1641.method3533();
            }
        }
        if (arg3.field4252 == -1 && arg3.field4235 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class561 var25 = new class561(arg1);
        var25.field8339 = var8 + var24;
        var25.field8344 = var18;
        var25.field8335 = var20;
        var25.field8343 = var19;
        var25.field8345 = var7 - var24;
        var25.field8332 = var8 - var24;
        var25.field8333 = var21;
        var25.field8340 = var7 + var24;
        class227.field3313.method131(var25, 0);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)Z")
    public final boolean method3362(int arg0, int arg1, int arg2, int arg3) {
        field8287++;
        if (arg0 < this.field8297 || arg0 > this.field8292) {
            return false;
        } else if (arg3 != -20444) {
            return true;
        } else if (this.field8296 > arg2 || arg2 > this.field8291) {
            return false;
        } else if (arg1 >= this.field8285 && arg1 <= this.field8290) {
            int var5 = arg0 - this.field8300;
            int var6 = arg1 - this.field8284;
            return this.field8298 > (var5 * var5 + var6 * var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static void method3363(byte arg0) {
        field8299 = null;
        if (arg0 == -128) {
            field8294 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method3364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field8295 = arg3;
        this.field8298 = arg6 * arg6;
        field8286++;
        this.field8300 = arg8;
        this.field8284 = arg2;
        this.field8285 = this.field8284 + arg1;
        this.field8291 = this.field8295 + arg7;
        this.field8290 = this.field8284 + arg4;
        this.field8292 = this.field8300 + arg9;
        this.field8296 = this.field8295 + arg10;
        this.field8297 = this.field8300 + arg5;
        if (arg0 != -1030) {
            this.field8291 = -112;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static final void method3365(int arg0) {
        class13.field122.method122((byte) 14);
        field8293++;
        for (class583 var1 = (class583) class174.field2677.method124((byte) 42); var1 != null; var1 = (class583) class174.field2677.method120(16)) {
            if (var1.field8566 < 1000) {
                var1.method2457(-8422);
                class13.field122.method131(var1, 0);
            }
        }
        class13.field122.method130(class174.field2677, 0);
        if (class103.field1484 <= 1) {
            class151.field2298 = null;
        } else if (class335.field4641 && class24.field237.method1788(16, 81) && class103.field1484 > 2) {
            class151.field2298 = (class583) class174.field2677.field179.field5648.field5648;
        } else {
            class151.field2298 = (class583) class174.field2677.field179.field5648;
        }
        int var2 = -1;
        class68 var3 = (class68) class367.field5074.method124((byte) 42);
        if (arg0 < 87) {
            return;
        }
        if (var3 != null) {
            var2 = var3.method541(30818);
        }
        if (!class446.field6245) {
            if (var2 == 0 && (class299.field4105 == 1 && class103.field1484 > 2 || class93.method736(false))) {
                var2 = 2;
            }
            if (var2 == 2 && class103.field1484 > 0 && var3 != null) {
                if (class307.field4210 == null && class171.field2665 == 0) {
                    class311.method1898(var3.method536(false), var3.method532((byte) 108), (byte) 113);
                } else {
                    class1.field3 = 2;
                }
            }
            if (var2 == 0 && class103.field1484 > 0) {
                class2.method5(-85);
            }
            if (class307.field4210 != null || class171.field2665 != 0) {
                return;
            }
            class1.field3 = 0;
            class99.field1451 = null;
            return;
        }
        if (var2 == -1) {
            int var4 = class623.field9182.method1587((byte) 66);
            int var5 = class623.field9182.method1594(2028208128);
            if (var4 < (class37.field454 - 10) || var4 > (class37.field454 + class340.field4704 + 10) || (class483.field6896 - 10) > var5 || (class483.field6896 + class131.field1805 + 10) < var5) {
                class157.method1128((byte) -96);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class37.field454;
        int var7 = class483.field6896;
        int var8 = class340.field4704;
        int var9 = var3.method536(false);
        int var10 = var3.method532((byte) 108);
        int var11 = -1;
        for (int var12 = 0; var12 < class103.field1484; var12++) {
            if (class398.field5469) {
                int var17 = (class103.field1484 - var12 - 1) * 16 + var7 + 33;
                if (var6 < var9 && (var6 + var8) > var9 && var10 > (var17 - 13) && (var17 + 4) > var10) {
                    var11 = var12;
                }
            } else {
                int var16 = (class103.field1484 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && (var6 + var8) > var9 && var16 - 13 < var10 && var10 < var16 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class277 var14 = new class277(class174.field2677);
            for (class583 var15 = (class583) var14.method1738(true); var15 != null; var15 = (class583) var14.method1739(-5301)) {
                if (var11 == var13) {
                    class348.method2115(var15, (byte) -103, var9, var10);
                }
                var13++;
            }
        }
        class157.method1128((byte) -122);
        return;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field8300 = arg0;
        this.field8298 = arg3 * arg3;
        this.field8295 = arg1;
        this.field8284 = arg2;
        this.field8296 = this.field8295 + arg6;
        this.field8290 = this.field8284 + arg9;
        this.field8285 = this.field8284 + arg8;
        this.field8292 = this.field8300 + arg5;
        this.field8297 = this.field8300 + arg4;
        this.field8291 = this.field8295 + arg7;
    }
}
