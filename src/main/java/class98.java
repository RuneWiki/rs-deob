import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class98 extends class72 {

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "[Lma;")
    public class73[] field2160;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "Lec;")
    public static class28 field2163 = class28.method210(-46, ":");

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "Lec;")
    public static class28 field2169 = class28.method210(-46, "Username: ");

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "Lec;")
    public static class28 field2165 = class28.method210(-46, "No reply from loginserver)3");

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field2168 = -1;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "Lec;")
    public static class28 field2166 = class28.method210(-46, "Dec");

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "Lec;")
    public static class28 field2172 = class28.method210(-46, "Loading game screen )2 ");

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "Lec;")
    public static class28 field2164 = class28.method210(-46, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    public static int field2173 = 0;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "Lvb;")
    public static class122 field2162;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "[Lkc;")
    public static class63[] field2170;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)I")
    public static final int method700(byte arg0, int arg1, int arg2) {
        if (arg0 >= -9) {
            return -87;
        }
        field2171++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        } else {
            int var4 = (arg1 & 0x7F) * arg2 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg1 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V")
    public static void method701(byte arg0) {
        field2170 = null;
        field2172 = null;
        field2163 = null;
        field2162 = null;
        field2165 = null;
        field2164 = null;
        field2166 = null;
        if (arg0 < 106) {
            field2173 = -34;
        }
        field2169 = null;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lvb;Lvb;IZ)V")
    public class98(class122 arg0, class122 arg1, int arg2, boolean arg3) {
        class42 var5 = new class42();
        int var6 = arg0.method947(arg2, (byte) 67);
        this.field2160 = new class73[var6];
        int[] var7 = arg0.method931(1, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method932(126, var7[var8], arg2);
            class37 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class37 var12 = (class37) var5.method326(0); var12 != null; var12 = (class37) var5.method325((byte) 122)) {
                if (var12.field855 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method926(var11, 48, 0);
                } else {
                    var13 = arg1.method926(0, 122, var11);
                }
                var10 = new class37(var11, var13);
                var5.method337(25563, var10);
            }
            this.field2160[var7[var8]] = new class73(var9, var10);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)Z")
    public final boolean method702(int arg0, int arg1) {
        if (arg1 != -30624) {
            method701((byte) 125);
        }
        field2161++;
        return this.field2160[arg0].field1617;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)V")
    public static final void method703(int arg0, byte arg1) {
        if (class53.field1206) {
            class122.field2661 = arg0;
        } else {
            class5.method24(true, arg0);
        }
        int var2 = 48 % ((arg1 - 61) / 57);
        field2175++;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static final void method704(int arg0) {
        class91.field2003 = 0;
        field2174++;
        class16.field306 = 0;
        class95.method687(3);
        class18.method109((byte) 118);
        class117.method834(-13111);
        class37.method306(95);
        for (int var1 = 0; var1 < class91.field2003; var1++) {
            int var3 = class17.field327[var1];
            if (class83.field1888 != class129.field2779[var3].field1458) {
                class129.field2779[var3] = null;
            }
        }
        if (class76.field1692 != class56.field1282.field2554) {
            throw new RuntimeException("gpp1 pos:" + class56.field1282.field2554 + " psize:" + class76.field1692);
        }
        for (int var2 = arg0; var2 < class74.field1641; var2++) {
            if (class129.field2779[class4.field66[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class74.field1641);
            }
        }
    }
}
