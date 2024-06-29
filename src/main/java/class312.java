import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class312 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "[[B")
    public static byte[][] field5019 = new byte[50][];

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lhg;")
    public static class207 field5023 = null;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "[Lgd;")
    public static class189[] field5024 = new class189[29];

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[Lek;")
    public static class250[] field5028;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public static int method2107(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
    public boolean method1634() {
        field5030++;
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILhg;II)V")
    public static final void method2108(int arg0, class207 arg1, int arg2, int arg3) {
        field5029++;
        if (arg2 != 0 || class287.field4747 < 2 && class272.field4554 == 0 && !class302.field4918) {
            return;
        }
        String var4 = class286.method1995((byte) -81);
        if (arg1 == null) {
            int var6 = class183.field2930.method1221(var4, arg3 + 4, arg0 + 15, 16777215, 0, class260.field4371, class20.field374);
            class244.method1748(15, (byte) -93, class183.field2930.method1229(var4) + var6, arg0, arg3 + 4);
            return;
        }
        class165 var5 = arg1.method1446(0, class57.field1000);
        if (var5 == null) {
            var5 = class183.field2930;
        }
        var5.method1215(var4, arg3, arg0, arg1.field3484, arg1.field3481, arg1.field3403, arg1.field3362, arg1.field3456, arg1.field3409, class260.field4371, class20.field374, class256.field4332);
        class244.method1748(class256.field4332[3], (byte) -93, class256.field4332[2], class256.field4332[1], class256.field4332[0]);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIJILge;)V")
    public abstract void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class139 arg10);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Lda;")
    public class312 method1630(int arg0, int arg1, int arg2) {
        field5018++;
        return this;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static final void method2109(byte arg0) {
        for (int var1 = -1; var1 < class154.field2553; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class162.field2627[var1];
            }
            class123 var3 = class15.field300[var2];
            if (var3 != null) {
                class26.method166((byte) -104, var3.method294((byte) -117), var3);
            }
        }
        if (arg0 != 40) {
            field5023 = null;
        }
        field5025++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Laj;ILaj;)V")
    public static final void method2110(class151 arg0, int arg1, class151 arg2) {
        class36.field573 = arg0;
        class78.field1319 = arg2;
        if (arg1 != -11157) {
            method2112(35);
        }
        field5022++;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public static void method2111(byte arg0) {
        field5024 = null;
        field5028 = null;
        field5023 = null;
        field5019 = null;
        if (arg0 != 79) {
            method2108(-49, (class207) null, 26, -80);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method2112(int arg0) {
        field5021++;
        class140.method1037(12401);
        class85.method598(-22018);
        class1.method5(-19759);
        class94.method674((byte) -128);
        class71.method504(-109);
        class306.method2072(123);
        class238.method1707(-31074);
        class71.method490((byte) -121);
        class260.method1854(arg0 + 60);
        class131.method973((byte) -103);
        class279.method1947(-111);
        class123.method924(arg0 + 37);
        class215.method1534((byte) 56);
        class250.method1824(0);
        class167.method1245((byte) 118);
        class168.method1253(arg0 ^ arg0);
        class81.method565(0);
        class313.method2125(false);
        class51.method327(false);
        if (class310.field4990 != 0) {
            for (int var1 = 0; var1 < class68.field1139.length; var1++) {
                class68.field1139[var1] = null;
            }
            class80.field1340 = 0;
        }
        class219.method1559((byte) -121);
        class1.method3(1);
        class70.method480(116);
        class221.method1572(-1);
        class84.field1388.method97(arg0 + 97);
        ((class185) class128.field2136).method1339(64);
        class90.field1496.method253(0);
        class87.field1433.method1152((byte) 125);
        class313.field5047.method1152((byte) 115);
        class66.field1113.method1152((byte) 118);
        class13.field286.method1152((byte) 115);
        class270.field4488.method1152((byte) 118);
        class71.field1246.method1152((byte) 123);
        class26.field463.method1152((byte) 123);
        class25.field445.method1152((byte) 121);
        class64.field1069.method1152((byte) 124);
        class123.field2090.method1152((byte) 114);
        class32.field528.method1152((byte) 126);
        class290.field4775.method97(arg0 + 69);
        class125.field2100.method97(arg0 + 117);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()I")
    public abstract int method860();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lda;IIIZ)V")
    public void method1635(class312 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5020++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIBI)V")
    public static final void method2113(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5026++;
        int var10 = arg2 + 1;
        class134.method996(0, arg0, arg3, arg5, class41.field630[arg2]);
        int var9 = arg1 - 1;
        class134.method996(0, arg0, arg3, arg5, class41.field630[arg1]);
        if (arg4 > -44) {
            method2111((byte) -87);
        }
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var7 = class41.field630[var6];
            var7[arg3] = var7[arg0] = arg5;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class4.field118 * arg0 + class273.field4570 * arg3 >> 16;
        int var6 = class4.field118 * arg3 - class273.field4570 * arg0 >> 16;
        int var7 = class310.field4992 * arg1 + class236.field3984 * var6 >> 16;
        int var8 = class236.field3984 * arg1 - class310.field4992 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class310.field4992 * arg2 + class236.field3984 * var6 >> 16;
        int var12 = class236.field3984 * arg2 - class310.field4992 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class293.field4825 && var13 < class293.field4825) {
            return false;
        } else if (var9 > class116.field1977 && var13 > class116.field1977) {
            return false;
        } else if (var10 < class311.field5014 && var14 < class311.field5014) {
            return false;
        } else {
            return var10 <= class40.field605 || var14 <= class40.field605;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIII)V")
    public abstract void method930(int arg0, int arg1, int arg2, int arg3, int arg4);
}
