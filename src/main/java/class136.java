import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class136 extends class78 {

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2165 = "glow1:";

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static volatile int field2170 = 0;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "[I")
    public static int[] field2161 = new int[32];

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Lja;")
    public static class64 field2157;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "Ljava/lang/String;")
    public String field2169;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "Z")
    public static boolean field2160;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "[I")
    public int[] field2158;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "[I")
    public int[] field2173;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "[Lsa;")
    public class110[] field2164;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "[Ljava/lang/String;")
    public String[] field2162;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)V", line = 4)
    public static final void method1040(int arg0) {
        field2166++;
        int var1 = class107.field1778;
        int var2 = class121.field1938;
        if (arg0 != 8529) {
            field2157 = (class64) null;
        }
        int var3 = class297.field4686 - class73.field1127 - var2;
        int var4 = class64.field1053 - var1 - class180.field2880;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            int var6 = 0;
            Container var7;
            if (class52.field823 != null) {
                var7 = class52.field823;
            } else if (class81.field1219 == null) {
                var7 = class83.field1235.field5052;
            } else {
                var7 = class81.field1219;
            }
            if (class81.field1219 == var7) {
                Insets var8 = class81.field1219.getInsets();
                var6 = var8.left;
                var5 = var8.top;
            }
            Graphics var9 = var7.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var5, var1, class297.field4686);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var5, class64.field1053, var2);
            }
            if (var4 > 0) {
                var9.fillRect(var6 + class64.field1053 - var4, var5, var4, class297.field4686);
            }
            if (var3 > 0) {
                var9.fillRect(var6, class297.field4686 + var5 - var3, class64.field1053, var3);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)V", line = 74)
    public static void method1041(int arg0) {
        field2165 = null;
        field2161 = null;
        field2157 = null;
        if (arg0 != 0) {
            field2170 = -29;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(BI)Lua;", line = 86)
    public static final class90 method1042(byte arg0, int arg1) {
        field2167++;
        class90 var2 = (class90) class181.field2897.method1830((long) arg1, (byte) 52);
        int var3 = -48 / ((arg0 - 67) / 41);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class128.field2041.method467(class74.method558(true, arg1), 71, class26.method173(295655336, arg1));
        class90 var5 = new class90();
        var5.field1479 = arg1;
        if (var4 != null) {
            var5.method648((byte) -102, new class101(var4));
        }
        class181.field2897.method1831((long) arg1, var5, -13897);
        return var5;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 123)
    public static final void method1043(String arg0, boolean arg1) {
        class191.method1414(false, false);
        if (!arg1) {
            method1046(-73, (class64) null);
        }
        class59.method438(arg0, (byte) -65);
        field2154++;
    }

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "(I)I", line = 139)
    public static final int method1044(int arg0) {
        if (arg0 != 2053) {
            field2160 = false;
        }
        field2156++;
        return class27.field446;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILja;)Lai;", line = 157)
    public static final class126 method1045(int arg0, int arg1, class64 arg2) {
        field2153++;
        int var3 = 67 % ((56 - arg1) / 38);
        return class289.method2030(arg2, 128, arg0) ? class118.method874((byte) 70) : null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILja;)V", line = 171)
    public static final void method1046(int arg0, class64 arg1) {
        if (arg0 == -15581) {
            field2155++;
            class202.field3178 = arg1.method487(false, "titlebg");
            class12.field234 = arg1.method487(false, "logo");
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([BII)I", line = 185)
    public static final int method1047(byte[] arg0, int arg1, int arg2) {
        int var3 = -23 % ((-arg1 - 8) / 45);
        field2171++;
        return class116.method869(870622600, arg2, 0, arg0);
    }
}
