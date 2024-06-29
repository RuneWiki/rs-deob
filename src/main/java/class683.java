import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class683 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "[I")
    private int[] field9611;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "Lqaa;")
    public static class27 field9615 = new class27(5, 8);

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Lqaa;")
    public static class27 field9616 = new class27(49, 3);

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "([I)V")
    public class683(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field9611 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field9611[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field9611[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field9611[var5 + var5] = arg0[var4];
            this.field9611[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method3849(int arg0) {
        field9615 = null;
        if (arg0 == -1) {
            field9616 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)I")
    public static final int method3850(int arg0) {
        field9612++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class341.field4796.field5141 && !class341.field4796.field5130) {
            var1 = true;
            if (class367.field5136.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
        }
        if (class130.field1951) {
            var3 = false;
        }
        if (class595.field8702) {
            var2 = false;
        }
        if (class455.field6588) {
            var1 = false;
        }
        if (arg0 != 49) {
            field9615 = null;
        }
        if (!var1 && !var2 && !var3) {
            return class545.method3221(-26536);
        }
        int var4 = -1;
        int var5 = -1;
        if (var1) {
            try {
                var4 = class242.method1625((byte) -69, 2, 1000);
            } catch (Exception var15) {
            }
        }
        int var6 = -1;
        if (var3) {
            try {
                var6 = class242.method1625((byte) -122, 3, 1000);
                if (class471.field6781.field6684.method1843(27669) == 3) {
                    class732 var7 = class359.field5046.method599();
                    long var8 = var7.field10242 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field10244;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class242.method1625((byte) -119, 1, 1000);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class545.method3221(-26536);
        }
        int var11 = (int) ((float) var6 * 1.1F);
        int var12 = (int) ((float) var5 * 1.1F);
        if (var4 > var11 && var12 < var4) {
            return class630.method3627((byte) 60, var4);
        } else if (var12 >= var11) {
            return class131.method1003(68, var12, 1);
        } else {
            return class131.method1003(119, var11, 3);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method3851(boolean arg0, String arg1) {
        field9614++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class425.field5945; var2++) {
            if (arg1.equalsIgnoreCase(class583.field8236[var2])) {
                return var2;
            }
        }
        if (arg0) {
            method3851(true, null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)I")
    public final int method3852(byte arg0, int arg1) {
        field9613++;
        int var3 = (this.field9611.length >> 1) - 1;
        if (arg0 != -17) {
            method3851(true, null);
        }
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field9611[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field9611[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
