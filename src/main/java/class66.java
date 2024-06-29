import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class66 extends class213 {

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public int field1271 = 0;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public int field1291 = -1;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "Z")
    public static boolean field1278 = false;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "Lob;")
    public static class141 field1281 = class175.method1195(40, "::fpsoff");

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Lob;")
    public static class141 field1273 = class175.method1195(40, "AUS");

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Lra;")
    public static class170 field1275 = null;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field1286 = 0;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "[Z")
    public static boolean[] field1279 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    public static final void method441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1280++;
        if (arg2 < arg3) {
            for (int var5 = arg2; var5 < arg3; var5++) {
                class41.field805[var5][arg0] = arg1;
            }
        } else {
            for (int var6 = arg3; var6 < arg2; var6++) {
                class41.field805[var6][arg0] = arg1;
            }
        }
        if (arg4 != 0) {
            method443(false, 51);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Z")
    public static final boolean method442(byte arg0, int arg1) {
        field1289++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg0 != -80) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)Z")
    public static final boolean method443(boolean arg0, int arg1) {
        field1283++;
        if (class69.field1363[arg1]) {
            return true;
        } else if (class168.field3234.method1069(arg1, (byte) 91)) {
            int var2 = class168.field3234.method1058(arg1, (byte) -59);
            if (var2 == 0) {
                class69.field1363[arg1] = true;
                return true;
            }
            if (class224.field4232[arg1] == null) {
                class224.field4232[arg1] = new class170[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class224.field4232[arg1][var3] == null) {
                    byte[] var4 = class168.field3234.method1065((byte) -126, var3, arg1);
                    if (var4 != null) {
                        class224.field4232[arg1][var3] = new class170();
                        class224.field4232[arg1][var3].field3396 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class224.field4232[arg1][var3].method1166(false, new class146(var4));
                        } else {
                            class224.field4232[arg1][var3].method1165(new class146(var4), -35);
                        }
                    }
                }
            }
            class69.field1363[arg1] = arg0;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method444(byte arg0) {
        field1275 = null;
        field1281 = null;
        if (arg0 != -39) {
            field1279 = null;
        }
        field1273 = null;
        field1279 = null;
    }
}
