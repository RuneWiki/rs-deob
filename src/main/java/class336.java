import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public abstract class class336 {

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Z")
    public boolean field5194 = true;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "Z")
    public boolean field5196 = true;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "Z")
    public boolean field5208 = true;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public int field5204 = 2;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public int field5212 = 0;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "Z")
    public boolean field5210 = true;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Z")
    public boolean field5202 = true;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public int field5207 = 0;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    public int field5216 = 127;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public int field5195 = 3;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Z")
    public boolean field5198 = true;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "Z")
    public boolean field5200 = true;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    public int field5221 = 127;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Z")
    public boolean field5209 = false;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public int field5215 = 0;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "Z")
    public boolean field5222 = true;

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
    public int field5226 = 255;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    public int field5223 = 1;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "I")
    public int field5225 = 0;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
    public int field5213 = 0;

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
    public int field5228 = 0;

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "Z")
    public boolean field5227 = false;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "Z")
    public boolean field5220 = true;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "Z")
    public boolean field5211 = false;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Z")
    public boolean field5203 = true;

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "I")
    public int field5234 = 2;

    @OriginalMember(owner = "client!ep", name = "Q", descriptor = "Z")
    public boolean field5235 = true;

    @OriginalMember(owner = "client!ep", name = "T", descriptor = "I")
    public int field5238 = 2;

    @OriginalMember(owner = "client!ep", name = "S", descriptor = "Z")
    public boolean field5237 = true;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public int field5219 = 0;

    @OriginalMember(owner = "client!ep", name = "U", descriptor = "I")
    public int field5239 = 2;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Lcm;")
    public static class449 field5206 = new class449(73, -1);

    @OriginalMember(owner = "client!ep", name = "L", descriptor = "[[[I")
    public static int[][][] field5230 = new int[2][][];

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
    public static int field5233 = -2;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ep", name = "R", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Z")
    public boolean field5197;

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "Z")
    public boolean field5229;

    @OriginalMember(owner = "client!ep", name = "M", descriptor = "Z")
    public boolean field5231;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "[S")
    public static short[] field5218;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLjava/lang/String;)V", line = 3)
    public static final void method2164(byte arg0, String arg1) {
        field5232++;
        if (arg0 > -116) {
            field5230 = null;
        }
        class165.field2407 = arg1;
        if (class419.field6254.field6861 == null) {
            return;
        }
        try {
            String var2 = class419.field6254.field6861.getParameter("cookieprefix");
            String var3 = class419.field6254.field6861.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class24.method196((byte) -128, class264.method1698(true) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class131.method840("document.cookie=\"" + var5 + "\"", class419.field6254.field6861, (byte) -42);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLns;)I", line = 43)
    public static final int method2165(byte arg0, class438 arg1) {
        field5236++;
        int var2 = 0;
        if (arg1.method2624(-90, class23.field350)) {
            var2++;
        }
        if (arg1.method2624(-100, class322.field4952)) {
            var2++;
        }
        return arg0 < 77 ? 74 : var2;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V", line = 70)
    public final void method2166(int arg0, int arg1, int arg2) {
        if (arg1 > -86) {
            method2168(-78);
        }
        if (arg2 == 1 || arg2 == 3) {
            this.field5238 = arg0;
        } else {
            this.field5213 = arg0;
        }
        field5224++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZB)V", line = 92)
    public final void method2167(int arg0, boolean arg1, byte arg2) {
        field5205++;
        if (arg2 < 72) {
            method2169(116, -121, -101);
        }
        if (arg0 == 1 || arg0 == 3) {
            this.field5231 = arg1;
        } else {
            this.field5197 = arg1;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 137)
    public static final void method2168(int arg0) {
        field5217++;
        class414 var1 = (class414) class94.field1369.method1970(64);
        boolean var2 = class362.field5615 != null || class515.field7638 > 0;
        if (var2) {
            class276.field3834 = 1;
        }
        if (arg0 <= 46) {
            field5218 = null;
        }
        if (class99.field1426 && class382.field5821.method705((byte) 43, 81) && class12.field201 > 2) {
            if (var2) {
                class83.field1139 = (class32) class96.field1395.field4498.field6803.field6803;
            } else {
                class515.method3062(var1.method717(18591), (class32) class96.field1395.field4498.field6803.field6803, -14223, var1.method712(25));
            }
        } else if (var2) {
            class83.field1139 = (class32) class96.field1395.field4498.field6803;
        } else {
            class515.method3062(var1.method717(18591), (class32) class96.field1395.field4498.field6803, -14223, var1.method712(64));
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(III)V", line = 177)
    public static final void method2169(int arg0, int arg1, int arg2) {
        field5199++;
        if (class109.method719((byte) -128, arg0)) {
            class310.method1994((byte) 115, arg2, class59.field791[arg0]);
            if (arg1 != 22590) {
                method2172((byte) -123);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZ)I", line = 203)
    public final int method2170(int arg0, boolean arg1) {
        field5201++;
        if (!arg1) {
            this.method2171(81, -61);
        }
        return arg0 == 1 || arg0 == 3 ? this.field5238 : this.field5213;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Z", line = 227)
    public final boolean method2171(int arg0, int arg1) {
        field5214++;
        if (arg1 < 113) {
            return true;
        } else if (arg0 == 1 || arg0 == 3) {
            return this.field5231;
        } else {
            return this.field5197;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 238)
    public static void method2172(byte arg0) {
        field5206 = null;
        field5230 = null;
        if (arg0 == 88) {
            field5218 = null;
        }
    }
}
