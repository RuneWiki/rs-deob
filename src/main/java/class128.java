import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class128 {

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "J")
    public long field2051 = 0L;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field2052 = 0;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field2055 = -1;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "[I")
    public static int[] field2057 = new int[2];

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public int field2050;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public int field2053;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lpb;")
    public class264 field2043;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lpb;")
    public class264 field2061;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Ldl;")
    public static class27 field2048;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Ljava/awt/Font;")
    public static Font field2059;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "[I")
    public static int[] field2060;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static final void method871(byte arg0) {
        field2054++;
        class135.method912(-199, 5);
        class95.method535(1, 5);
        class15.method78(5, true);
        class218.method1546(7, 5);
        class78.method438((byte) 7, 5);
        class21.method120(-40, 5);
        class115.method749(5, (byte) 115);
        if (arg0 >= -16) {
            method874(-15, (String) null);
        }
        class14.method73((byte) 92, 5);
        class19.method106(5, -91);
        class156.method1098(5, -35);
        class180.method1255(5, 60);
        class154.method1051(-1, 5);
        class175.method1213((byte) -54, 5);
        class86.method468((byte) -79, 5);
        class42.method234(5, 47);
        class213.method1500(5, (byte) 101);
        class286.method1920(5, (byte) -34);
        class255.method1744(50, false);
        class183.method1278((byte) 92, 5);
        class202.method1409(5, -17293);
        class104.field1401.method1695(5, 0);
        class253.field4118.method1695(5, 0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)I")
    public static final int method872(byte arg0, int arg1, String arg2, String arg3) {
        int var4 = arg3.length();
        field2044++;
        if (arg0 < 42) {
            return 5;
        }
        int var5 = arg2.length();
        char var6 = 0;
        int var7 = 0;
        char var8 = 0;
        int var9 = 0;
        while (var9 - var6 < var4 || (var7 - var8) < var5) {
            if (var4 <= var9 - var6) {
                return -1;
            }
            if (var7 - var8 >= var5) {
                return 1;
            }
            char var22;
            if (var6 == '\u0000') {
                var22 = arg3.charAt(var9++);
            } else {
                var22 = var6;
                boolean var23 = false;
            }
            char var24;
            if (var8 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var8;
                boolean var25 = false;
            }
            var6 = class39.method211(112, var22);
            var8 = class39.method211(100, var24);
            char var26 = class280.method1867(false, var22, arg1);
            char var27 = class280.method1867(false, var24, arg1);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class63.method366(var28, arg1, (byte) -21) - class63.method366(var29, arg1, (byte) -72);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class63.method366(var20, arg1, (byte) -35) - class63.method366(var21, arg1, (byte) -68);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class63.method366(var14, arg1, (byte) -80) - class63.method366(var15, arg1, (byte) -10);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method873(int arg0) {
        field2059 = null;
        field2048 = null;
        field2057 = null;
        if (arg0 != 5) {
            field2052 = -70;
        }
        field2060 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method874(int arg0, String arg1) {
        field2045++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 == 5) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = class121.method788((byte) 58, arg1.charAt(var4)) + (var3 << 5) - var3;
            }
            return var3;
        } else {
            return -42;
        }
    }
}
