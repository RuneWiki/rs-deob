import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class90 {

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Z")
    public boolean field1198;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Z")
    public static boolean field1196 = false;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "Lhj;")
    public static class596 field1197 = new class596(105, 6);

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "Llja;")
    public static class744 field1203 = new class744(83, 4);

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field1206 = -1;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "Lut;")
    public static class136 field1205 = new class136();

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "Ldj;")
    public static class362 field1207 = new class362(16);

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "Loda;")
    public class129 field1200;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "Loda;")
    public class129 field1204;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient;")
    public static client field1195;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "Z")
    public boolean field1194;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
    public final void method815(boolean arg0) {
        field1199++;
        if (this.field1200 != null) {
            this.field1200.method274((byte) -76);
        }
        this.field1194 = arg0;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(Z)V")
    public static final void method816(boolean arg0) {
        class118.field1502 = 0;
        if (!arg0) {
            method817((byte) 38);
        }
        field1201++;
        boolean var1 = class583.field7964.method2393((byte) -107) == 1;
        int var2 = class583.field7964.method2390((byte) 112);
        int var3 = class583.field7964.method2396((byte) -88);
        int var4 = class583.field7964.method2390((byte) 105);
        class243.method1463((byte) -122);
        class121.method943(var3, -112);
        int var5 = (class647.field8807 - class583.field7964.field5262) / 16;
        class233.field2781 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class233.field2781[var6][var10] = class583.field7964.method2381((byte) 61);
            }
        }
        class449.field6220 = new byte[var5][];
        class722.field10134 = new int[var5];
        class786.field10842 = new byte[var5][];
        class704.field9907 = null;
        class204.field2445 = new byte[var5][];
        class229.field2709 = null;
        class610.field8194 = new int[var5];
        class471.field6569 = new int[var5];
        class152.field1904 = new int[var5];
        class253.field2955 = new int[var5];
        class266.field3146 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var2 - (class596.field8090 >> 4)) / 8; var8 <= (var2 + (class596.field8090 >> 4)) / 8; var8++) {
            for (int var9 = (var4 - (class107.field1350 >> 4)) / 8; var9 <= ((var4 + (class107.field1350 >> 4)) / 8); var9++) {
                class471.field6569[var7] = (var8 << 8) + var9;
                class610.field8194[var7] = class340.field4208.method450((byte) 120, "m" + var8 + "_" + var9);
                class152.field1904[var7] = class340.field4208.method450((byte) 103, "l" + var8 + "_" + var9);
                class253.field2955[var7] = class340.field4208.method450((byte) 80, "um" + var8 + "_" + var9);
                class722.field10134[var7] = class340.field4208.method450((byte) 100, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class224.method1375(11, (byte) 66, var1, var2, var4);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public static void method817(byte arg0) {
        field1205 = null;
        if (arg0 != -90) {
            field1203 = null;
        }
        field1197 = null;
        field1195 = null;
        field1207 = null;
        field1203 = null;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Z")
    public final boolean method818(byte arg0) {
        if (arg0 <= 30) {
            return false;
        } else {
            field1202++;
            return this.field1194 && !this.field1198;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Z)V")
    public class90(boolean arg0) {
        this.field1198 = arg0;
    }
}
