import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class61 extends class176 {

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "Z")
    public boolean field1206 = false;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Ll;")
    private class109 field1184;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "Z")
    public boolean field1186;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "Z")
    public boolean field1185;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "Z")
    private boolean field1188;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "Lob;")
    private static class141 field1187 = class175.method1195(40, " is already on your friend list)3");

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field1190 = 0;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "Z")
    public static boolean field1194 = false;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "Lob;")
    private static class141 field1197 = class175.method1195(40, "Close");

    @OriginalMember(owner = "client!g", name = "X", descriptor = "Lob;")
    public static class141 field1203 = field1187;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "Lob;")
    public static class141 field1204 = field1197;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "Lob;")
    private static class141 field1209 = class175.method1195(40, "glow2:");

    @OriginalMember(owner = "client!g", name = "I", descriptor = "Lob;")
    public static class141 field1189 = field1209;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "Lob;")
    public static class141 field1193 = field1209;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "F")
    private float field1207;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "[I")
    private int[] field1192;

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1211++;
        super.finalize();
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)V")
    public final void method406(int arg0, byte arg1) {
        if (arg1 <= 49) {
            return;
        }
        field1208++;
        if (this.field1192 == null || this.field1201 == 0 && this.field1199 == 0) {
            return;
        }
        if (class104.field2011 == null || this.field1192.length > class104.field2011.length) {
            class104.field2011 = new int[this.field1192.length];
        }
        int var3 = this.field1192.length == 4096 ? 64 : 128;
        int var4 = this.field1199 * arg0;
        int var5 = var3 - 1;
        int var6 = this.field1192.length;
        int var7 = var6 - 1;
        int var8 = this.field1201 * var3 * arg0;
        for (int var9 = 0; var9 < var6; var9 += var3) {
            int var11 = var7 & var8 + var9;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var5 & var4 + var12) + var11;
                class104.field2011[var13] = this.field1192[var14];
            }
        }
        int[] var10 = this.field1192;
        this.field1192 = class104.field2011;
        class104.field2011 = var10;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
    public static void method407(int arg0) {
        field1193 = null;
        field1197 = null;
        field1204 = null;
        field1189 = null;
        field1187 = null;
        if (arg0 == -16733) {
            field1209 = null;
            field1203 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIII)V")
    public static final void method408(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 75) {
            method412(-101, 17);
        }
        field1191++;
        for (int var5 = arg4; var5 <= arg3 + arg4; var5++) {
            for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class57.field1118[0][var6][var5] = 127;
                    if (arg0 == var6 && var6 > 0) {
                        class31.field617[0][var6][var5] = class31.field617[0][var6 - 1][var5];
                    }
                    if (arg0 + arg2 == var6 && var6 < 103) {
                        class31.field617[0][var6][var5] = class31.field617[0][var6 + 1][var5];
                    }
                    if (arg4 == var5 && var5 > 0) {
                        class31.field617[0][var6][var5] = class31.field617[0][var6][var5 - 1];
                    }
                    if (arg3 + arg4 == var5 && var5 < 103) {
                        class31.field617[0][var6][var5] = class31.field617[0][var6][var5 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lof;FIILpe;)[I")
    public final int[] method409(class145 arg0, float arg1, int arg2, int arg3, class154 arg4) {
        field1212++;
        if (arg2 != 65344) {
            field1189 = null;
        }
        if (this.field1192 == null || this.field1207 != arg1) {
            if (!this.field1184.method718(arg4, arg0, (byte) 10)) {
                return null;
            }
            int var6 = arg3 >= this.field1195 ? this.field1195 : arg3;
            this.field1192 = this.field1184.method720((byte) -48, arg4, var6, (double) arg1, true, arg0, var6);
            this.field1207 = arg1;
            if (this.field1188) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 * var6;
                for (int var17 = 2; var17 >= 0; var17--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field1192[var12];
                        var7[var34] += class15.method94(16718580, var35) >> 16;
                        var8[var34] += class15.method94(var35, 65344) >> 8;
                        var9[var34] += class15.method94(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var16;
                    }
                }
                int var18 = var6 - 1;
                int var19 = var16;
                for (int var20 = var18; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var22 += var9[var25];
                        var23 += var7[var25];
                        var21 += var8[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        var25--;
                        var24--;
                        int var31 = var22 / 9;
                        int var32 = var23 / 9;
                        int var33 = var21 / 9;
                        var19--;
                        var10[var19] = class57.method389(class57.method389(var32 << 16, var33 << 8), var31);
                        var22 += var9[var25] - var9[var24];
                        var23 += var7[var25] - var7[var24];
                        var21 += var8[var25] - var8[var24];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field1192[var13];
                        var12--;
                        int var30 = this.field1192[var12];
                        var7[var28] += (class15.method94(var30, 16744338) >> 16) - class15.method94(255, var29 >> 16);
                        var8[var28] += -(class15.method94(var29, 65308) >> 8) + (class15.method94(var30, 65506) >> 8);
                        var9[var28] += -class15.method94(255, var29) + class15.method94(255, var30);
                    }
                    if (var12 == 0) {
                        var12 = var16;
                    }
                    if (var13 == 0) {
                        var13 = var16;
                    }
                }
                this.field1192 = var10;
            }
        }
        return this.field1192;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lpe;BLof;)Z")
    public final boolean method410(class154 arg0, byte arg1, class145 arg2) {
        field1210++;
        if (arg1 != -101) {
            field1193 = null;
        }
        return this.field1184.method718(arg0, arg2, (byte) 10);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILpe;ILof;)[I")
    public final int[] method411(int arg0, class154 arg1, int arg2, class145 arg3) {
        field1196++;
        if (!this.field1184.method718(arg1, arg3, (byte) 10)) {
            return null;
        }
        int var5 = this.field1195 <= arg0 ? this.field1195 : arg0;
        if (arg2 > -88) {
            method412(94, -52);
        }
        return this.field1184.method720((byte) -115, arg1, var5, 1.0D, false, arg3, var5);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)I")
    public static final int method412(int arg0, int arg1) {
        field1198++;
        return arg0 == 128 ? arg1 >>> 8 : 57;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Log;)V")
    public class61(class146 arg0) {
        this.field1184 = new class109(arg0);
        int var2 = arg0.method991(255);
        this.field1186 = (var2 & 0x2) != 0;
        this.field1185 = (var2 & 0x1) != 0;
        int var3 = arg0.method991(255);
        this.field1195 = 0x1 << (var3 & 0x7) + 1;
        int var4 = var2 >> 3 & 0x3;
        this.field1188 = (var3 & 0x8) != 0;
        this.field1205 = arg0.method1007(31);
        this.field1200 = arg0.method991(255);
        if (this.field1200 == 255) {
            this.field1200 = 256;
        }
        this.field1199 = arg0.method1000(1064893128);
        this.field1201 = arg0.method1000(1064893128);
        arg0.method991(255);
        arg0.method991(255);
        arg0.method991(255);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class61() {
        this.field1184 = new class109();
        this.field1195 = 64;
        this.field1185 = true;
    }
}
