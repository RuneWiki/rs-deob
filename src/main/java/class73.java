import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class73 {

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "Ljn;")
    private class117 field1167 = new class117(64);

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "Ljn;")
    public class117 field1171 = new class117(60);

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "Lvo;")
    public class345 field1170;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "Lvo;")
    private class345 field1163;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "[Z")
    public static boolean[] field1162 = new boolean[5];

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field1157 = 0;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "Z")
    public static volatile boolean field1166 = true;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "Z")
    public static boolean field1168 = false;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field1169 = 0;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public final void method593(int arg0) {
        class117 var2 = this.field1167;
        synchronized (this.field1167) {
            this.field1167.method950((byte) -122);
        }
        field1165++;
        if (arg0 == 14002) {
            class117 var3 = this.field1171;
            synchronized (this.field1171) {
                this.field1171.method950((byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)V")
    public final void method594(byte arg0, int arg1) {
        class117 var3 = this.field1167;
        synchronized (this.field1167) {
            this.field1167.method939(arg0 ^ 0xFFFF9270, arg1);
        }
        field1159++;
        class117 var4 = this.field1171;
        synchronized (this.field1171) {
            this.field1171.method939(arg0 ^ 0xFFFF9270, arg1);
            if (arg0 != -51) {
                this.method593(-88);
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
    public final void method595(int arg0, int arg1) {
        if (arg1 != 28001) {
            return;
        }
        this.field1172 = arg0;
        field1164++;
        class117 var3 = this.field1171;
        synchronized (this.field1171) {
            this.field1171.method936(arg1 ^ 0xFFFF92EB);
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
    public static void method596(int arg0) {
        field1162 = null;
        if (arg0 != 16231) {
            field1162 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
    public static final void method597(int arg0) {
        field1161++;
        if (arg0 != -1) {
            method596(5);
        }
        for (class131 var1 = (class131) class221.field3303.method3905(-127); var1 != null; var1 = (class131) class221.field3303.method3899(0)) {
            if (var1.field2136 > 0) {
                var1.field2136--;
            }
            if (var1.field2136 != 0) {
                if (var1.field2131 > 0) {
                    var1.field2131--;
                }
                if (var1.field2131 == 0 && var1.field2128 >= 1 && var1.field2140 >= 1 && (class430.field6136 - 2) >= var1.field2128 && class580.field8504 - 2 >= var1.field2140 && (var1.field2130 < 0 || class205.method1414(var1.field2138, (byte) -118, var1.field2130))) {
                    class582.method3368(var1.field2138, var1.field2128, var1.field2130, var1.field2135, var1.field2129, var1.field2139, (byte) -125, var1.field2140, -1);
                    var1.field2131 = -1;
                    if (var1.field2133 == var1.field2130 && var1.field2133 == -1) {
                        var1.method2549((byte) -43);
                    } else if (var1.field2133 == var1.field2130 && var1.field2139 == var1.field2127 && var1.field2138 == var1.field2132) {
                        var1.method2549((byte) -74);
                    }
                }
            } else if (var1.field2133 < 0 || class205.method1414(var1.field2132, (byte) -124, var1.field2133)) {
                class582.method3368(var1.field2132, var1.field2128, var1.field2133, var1.field2135, var1.field2129, var1.field2127, (byte) -122, var1.field2140, -1);
                var1.method2549((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(II)Lcba;")
    public final class81 method598(int arg0, int arg1) {
        field1160++;
        class117 var3 = this.field1167;
        class81 var4;
        synchronized (this.field1167) {
            var4 = (class81) this.field1167.method941((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field1163;
        byte[] var6;
        synchronized (this.field1163) {
            var6 = this.field1163.method2081(-125, class412.method2459(arg1, 94), class171.method1268(0, arg1));
        }
        class81 var7 = new class81();
        var7.field1226 = this;
        var7.field1222 = arg1;
        if (var6 != null) {
            var7.method616(8637, new class465(var6));
        }
        if (arg0 != -14624) {
            this.method598(-27, 113);
        }
        class117 var8 = this.field1167;
        synchronized (this.field1167) {
            this.field1167.method949((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
    public final void method599(byte arg0) {
        field1158++;
        class117 var2 = this.field1167;
        synchronized (this.field1167) {
            if (arg0 < 26) {
                field1166 = false;
            }
            this.field1167.method936(-96);
        }
        class117 var3 = this.field1171;
        synchronized (this.field1171) {
            this.field1171.method936(-127);
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lgn;ILvo;Lvo;)V")
    public class73(class529 arg0, int arg1, class345 arg2, class345 arg3) {
        this.field1170 = arg3;
        this.field1163 = arg2;
        int var5 = this.field1163.method2102(true) - 1;
        this.field1163.method2098(0, var5);
    }
}
