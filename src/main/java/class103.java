import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class103 extends class303 {

    @OriginalMember(owner = "client!qda", name = "w", descriptor = "Lbg;")
    public static class464 field1219 = new class464();

    @OriginalMember(owner = "client!qda", name = "H", descriptor = "Leh;")
    public static class360 field1230 = new class360();

    @OriginalMember(owner = "client!qda", name = "J", descriptor = "I")
    public static int field1232 = 4;

    @OriginalMember(owner = "client!qda", name = "x", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!qda", name = "y", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!qda", name = "z", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!qda", name = "A", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!qda", name = "D", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!qda", name = "F", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!qda", name = "B", descriptor = "Lmda;")
    public class263 field1224;

    @OriginalMember(owner = "client!qda", name = "I", descriptor = "Lhda;")
    public static class748 field1231;

    @OriginalMember(owner = "client!qda", name = "E", descriptor = "[B")
    public byte[] field1227;

    @OriginalMember(owner = "client!qda", name = "C", descriptor = "[Loia;")
    public static class88[] field1225;

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "(I)V")
    public static void method732(int arg0) {
        field1219 = null;
        field1231 = null;
        if (arg0 == 0) {
            field1225 = null;
            field1230 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "(B)I")
    public static final int method733(byte arg0) {
        ++field1228;
        return arg0 >= -104 ? -100 : class268.field3824.method3992(false);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)I")
    public final int method734(int arg0) {
        ++field1223;
        if (arg0 != 0) {
            method737(80, 6, (String) null, (String) null);
        }
        return super.field4256 ? 0 : 100;
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(B)[B")
    public final byte[] method735(byte arg0) {
        ++field1226;
        if (super.field4256) {
            throw new RuntimeException();
        } else {
            if (arg0 != 68) {
                field1232 = 19;
            }
            return this.field1227;
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(III)Z")
    public static final boolean method736(int arg0, int arg1, int arg2) {
        if (arg0 >= -116) {
            field1219 = null;
        }
        ++field1222;
        return ~(2048 & arg1) != -1;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
    public static final int method737(int arg0, int arg1, String arg2, String arg3) {
        ++field1220;
        if (arg0 != -1) {
            method738(-46, -101, -7);
        }
        int var4 = arg2.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (-var8 + var6 < var4 || var7 - var9 < var5) {
            if (-var8 + var6 >= var4) {
                return -1;
            }
            if (~(var7 - var9) <= ~var5) {
                return 1;
            }
            char var22;
            if (var8 != 0) {
                var22 = var8;
                boolean var23 = false;
            } else {
                var22 = arg2.charAt(var6++);
            }
            char var24;
            if (var9 == 0) {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class425.method2597(5, var22);
            var9 = class425.method2597(5, var24);
            char var26 = class116.method812(arg1, arg0 ^ 63, var22);
            char var27 = class116.method812(arg1, -58, var24);
            if (~var26 != ~var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class376.method2362(var28, arg1, (byte) -115) - class376.method2362(var29, arg1, (byte) -128);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; ++var11) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var4 - (1 - -var11);
                var17 = var5 + -1 - var11;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg2.charAt(var16);
            char var19 = arg3.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (~var20 != ~var21) {
                    return class376.method2362(var20, arg1, (byte) -122) + -class376.method2362(var21, arg1, (byte) -98);
                }
            }
        }
        int var12 = -var5 + var4;
        if (var12 != 0) {
            return var12;
        } else {
            for (int var13 = 0; var10 > var13; ++var13) {
                char var14 = arg2.charAt(var13);
                char var15 = arg3.charAt(var13);
                if (~var14 != ~var15) {
                    return class376.method2362(var14, arg1, (byte) -102) + -class376.method2362(var15, arg1, (byte) -103);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(III)Z")
    public static final boolean method738(int arg0, int arg1, int arg2) {
        if (arg0 != 12869) {
            field1219 = null;
        }
        ++field1229;
        return ~(arg2 & 32) != -1;
    }
}
