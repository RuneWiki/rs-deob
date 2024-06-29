import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class267 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "B")
    private byte field4160;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public int field4166;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static volatile int field4161 = 0;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)I")
    public final int method1803(byte arg0) {
        field4159++;
        int var2 = -60 / ((arg0 - 21) / 49);
        return (this.field4160 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
    public final int method1804(byte arg0) {
        if (arg0 < 22) {
            method1805(65, -125, -82);
        }
        field4162++;
        return this.field4160 & 0x7;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public static final void method1805(int arg0, int arg1, int arg2) {
        field4165++;
        class105 var3 = class9.method72(12, -1, arg1);
        if (arg0 <= 122) {
            field4161 = -57;
        }
        var3.method763(false);
        var3.field1553 = arg2;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)I")
    public static final int method1806(int arg0, int arg1, int arg2) {
        field4170++;
        int var3 = arg0 + arg2 & arg1 >> 31;
        return (arg1 + (arg1 >>> 31)) % arg2 + var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BIIII)V")
    public static final void method1807(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4163++;
        int var5 = 0;
        if (arg0 != 123) {
            return;
        }
        int var6 = -1;
        int var7 = -arg2;
        int var8 = arg2;
        int var9 = class251.method1710(arg2 + arg3, (byte) 27, class196.field2961, class84.field1287);
        int var10 = class251.method1710(arg3 - arg2, (byte) 27, class196.field2961, class84.field1287);
        class222.method1519((byte) -126, var10, class241.field3751[arg1], var9, arg4);
        while (var8 > var5) {
            var6 += 2;
            var7 += var6;
            if (var7 > 0) {
                var8--;
                int var11 = arg1 - var8;
                var7 -= var8 << 1;
                int var12 = arg1 + var8;
                if (class175.field2557 <= var12 && var11 <= class91.field1381) {
                    int var13 = class251.method1710(arg3 + var5, (byte) 27, class196.field2961, class84.field1287);
                    int var14 = class251.method1710(arg3 - var5, (byte) 27, class196.field2961, class84.field1287);
                    if (class91.field1381 >= var12) {
                        class222.method1519((byte) -127, var14, class241.field3751[var12], var13, arg4);
                    }
                    if (class175.field2557 <= var11) {
                        class222.method1519((byte) -114, var14, class241.field3751[var11], var13, arg4);
                    }
                }
            }
            var5++;
            int var15 = arg1 + var5;
            int var16 = arg1 - var5;
            if (class175.field2557 <= var15 && var16 <= class91.field1381) {
                int var17 = class251.method1710(arg3 + var8, (byte) 27, class196.field2961, class84.field1287);
                int var18 = class251.method1710(arg3 - var8, (byte) 27, class196.field2961, class84.field1287);
                if (class91.field1381 >= var15) {
                    class222.method1519((byte) -112, var18, class241.field3751[var15], var17, arg4);
                }
                if (var16 >= class175.field2557) {
                    class222.method1519((byte) -125, var18, class241.field3751[var16], var17, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1808(int arg0, boolean arg1) {
        if (arg1) {
            field4161 = 9;
        }
        class293 var2 = class149.method1013(arg0, true);
        field4168++;
        if (var2 == null) {
            return false;
        } else if (class26.field514 == 1 || class26.field514 == 2 || class146.field2119 == 2) {
            class258.field3964 = var2.field4444;
            class147.field2138 = var2.field4450;
            if (class146.field2119 != 0) {
                class163.field2374 = class258.field3964 + 40000;
                class223.field3474 = class163.field2374;
                class178.field2605 = class258.field3964 + 50000;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class146.field2119 != 0) {
                var4 = ":" + (var2.field4444 + 7000);
            }
            if (class4.field58 != null) {
                var3 = "/p=" + class4.field58;
            }
            String var5 = "http://" + var2.field4450 + var4 + "/l=" + class24.field394 + "/a=" + class246.field3826 + var3 + "/j" + (class150.field2183 ? "1" : "0") + ",o" + (class296.field4510 ? "1" : "0") + ",a2,m" + (class50.field820 ? "1" : "0");
            try {
                class163.field2378.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static final void method1809(int arg0) {
        field4169++;
        int var1 = class188.method1238(-8073);
        if (var1 == 0) {
            class50.field813 = null;
            class224.method1533(12, 0);
        } else if (var1 == 1) {
            class171.method1144((byte) -102, (byte) 0);
            class224.method1533(12, 512);
            if (class247.field3844 != null) {
                class246.method1690(false);
            }
        } else {
            class171.method1144((byte) -102, (byte) (class113.field1723 - 4 & 0xFF));
            class224.method1533(12, 2);
        }
        if (arg0 != 29835) {
            field4161 = -111;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class267() {
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lca;)V")
    public class267(class54 arg0) {
        this.field4160 = arg0.method459(false);
        this.field4158 = arg0.method423(99);
        this.field4164 = arg0.method420((byte) 53);
        this.field4157 = arg0.method420((byte) -83);
        this.field4166 = arg0.method420((byte) 47);
        this.field4167 = arg0.method420((byte) 33);
    }
}
