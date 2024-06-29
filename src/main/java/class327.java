import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class327 {

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Leq;")
    private class357 field4173;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Lqia;")
    public static class547 field4175 = new class547();

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "[I")
    public static int[] field4182 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "J")
    public static long field4178;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Z")
    public static final boolean method1934(int arg0, int arg1, int arg2) {
        field4179++;
        if (arg2 > -51) {
            method1937(-11);
        }
        return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Z")
    public static final boolean method1935(int arg0, int arg1) {
        if (arg0 == -1604) {
            field4172++;
            return arg1 == 3 || arg1 == 7 || arg1 == 10;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I")
    public static final int method1936(byte arg0, String arg1, int arg2, String arg3) {
        field4176++;
        int var4 = arg3.length();
        int var5 = arg1.length();
        int var6 = 0;
        if (arg0 != -53) {
            field4175 = null;
        }
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var7 - var9 < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class383.method2303(var22, 198);
            var9 = class383.method2303(var24, 198);
            char var26 = class643.method3492(arg2, var22, 231);
            char var27 = class643.method3492(arg2, var24, 231);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class98.method659(-92, arg2, var28) - class98.method659(-98, arg2, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class98.method659(-71, arg2, var20) - class98.method659(-49, arg2, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class98.method659(arg0 ^ 0x42, arg2, var14) - class98.method659(-65, arg2, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Leq;II)V")
    public class327(class357 arg0, int arg1, int arg2) {
        this.field4173 = arg0;
        this.field4177 = arg2;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static final void method1937(int arg0) {
        if (arg0 != -19164) {
            method1938(-67);
        }
        class518.method2975(14);
        field4174++;
        class384.method2308(-125);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
    public static void method1938(int arg0) {
        field4182 = null;
        field4175 = null;
        if (arg0 != 7833) {
            method1938(22);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILha;)V")
    public static final void method1939(int arg0, class454 arg1) {
        field4181++;
        int var2 = 0;
        int var3 = 0;
        if (class107.field1323) {
            var2 = class173.method1075(arg0 - 125);
            var3 = class203.method1259((byte) 121);
        }
        int var4 = -10660793;
        class190.method1203(arg1, class521.field7340, class382.field5329, class333.field4301 + var2, var4, -121, class649.field8919 + var3, -16777216);
        class100.field1234.method2505(var4, -1, class586.field8149.method3261(class416.field5920, (byte) 82), class333.field4301 + var2 + 3, class649.field8919 - -var3 + 14, 255);
        int var5 = var2 + class402.field5566.method2337(-114);
        int var6 = class402.field5566.method2336((byte) 91) + var3;
        if (class44.field664) {
            int var10 = 0;
            for (class359 var11 = (class359) class681.field9283.method2565((byte) -113); var11 != null; var11 = (class359) class681.field9283.method2568(arg0 - 31354)) {
                int var15 = class649.field8919 + var10 * 16 + var3 + 31;
                var10++;
                if (var11.field5121 == 1) {
                    class91.method629(var5, (class718) var11.field5117.field6099.field8705, class382.field5329, var6, -256, var15, class333.field4301 + var2, false, class521.field7340, class649.field8919 + var3, -1, arg1);
                } else {
                    class715.method3970(arg1, var11, -256, var15, class333.field4301 + var2, class382.field5329, class649.field8919 + var3, var5, -1, arg0 + 26242, class521.field7340, var6);
                }
            }
            if (class691.field9807 != null) {
                class190.method1203(arg1, class713.field10038, class200.field2558, class471.field6767, var4, -123, class475.field6798, -16777216);
                int var12 = 0;
                class100.field1234.method2505(var4, -1, class691.field9807.field5119, class471.field6767 + 3, class475.field6798 + 14, 255);
                for (class718 var13 = (class718) class691.field9807.field5117.method2565((byte) 91); var13 != null; var13 = (class718) class691.field9807.field5117.method2568(-31355)) {
                    int var14 = var12 * 16 + class475.field6798 + 31;
                    class91.method629(var5, var13, class200.field2558, var6, -256, var14, class471.field6767, false, class713.field10038, class475.field6798, -1, arg1);
                    var12++;
                }
                class201.method1250(class200.field2558, 0, class471.field6767, class475.field6798, class713.field10038);
            }
        } else {
            int var7 = 0;
            for (class718 var8 = (class718) class565.field7906.method3111(83); var8 != null; var8 = (class718) class565.field7906.method3116(-118)) {
                int var9 = (class573.field8011 - var7 - 1) * 16 + class649.field8919 + var3 + 31;
                class91.method629(var5, var8, class382.field5329, var6, -256, var9, class333.field4301 + var2, false, class521.field7340, class649.field8919 + var3, -1, arg1);
                var7++;
            }
        }
        class201.method1250(class382.field5329, arg0 ^ arg0, class333.field4301 + var2, class649.field8919 - -var3, class521.field7340);
    }

    @OriginalMember(owner = "client!kn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4173.method2114(this.field4177, -75);
        field4180++;
        super.finalize();
    }
}
