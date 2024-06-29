import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class72 extends class243 {

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    private int field1268 = 32768;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "Lub;")
    public static class227 field1262 = class257.method1749("mapflag", 17263);

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "[I")
    public static int[] field1266;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field1264;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field4230 = ~arg0.method1471(255) == -2;
            }
        } else {
            this.field1268 = arg0.method1447(0) << 4;
        }
        if (arg1) {
            field1257 = -34;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field1260;
        int var3 = 26 / ((-15 - arg0) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int[] var5 = this.method1614(1, arg1, 127);
            int[] var6 = this.method1614(2, arg1, 80);
            for (int var7 = 0; ~class212.field3586 < ~var7; ++var7) {
                int var8 = 255 & var5[var7] >> 4;
                int var9 = var6[var7] * this.field1268 >> 12;
                int var10 = class43.field716[var8] * var9 >> 12;
                int var11 = class128.field2260[var8] * var9 >> 12;
                int var12 = class254.field4469 & (var11 >> 12) + arg1;
                int var13 = class179.field3062 & var7 - -(var10 >> 12);
                int[] var14 = this.method1614(0, var12, 106);
                var4[var7] = var14[var13];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
    public static void method433(byte arg0) {
        if (arg0 != -122) {
            field1262 = null;
        }
        field1262 = null;
        field1266 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        if (arg0 != 230) {
            return null;
        } else {
            int[][] var3 = super.field4213.method1406(arg1, 0);
            ++field1261;
            if (super.field4213.field3771) {
                int[] var4 = this.method1614(1, arg1, 93);
                int[] var5 = this.method1614(2, arg1, 86);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; class212.field3586 > var9; ++var9) {
                    int var10 = var4[var9] * 255 >> 12 & 255;
                    int var11 = var5[var9] * this.field1268 >> 12;
                    int var12 = class43.field716[var10] * var11 >> 12;
                    int var13 = class128.field2260[var10] * var11 >> 12;
                    int var14 = class179.field3062 & (var12 >> 12) + var9;
                    int var15 = arg1 - -(var13 >> 12) & class254.field4469;
                    int[][] var16 = this.method1616(arg0 ^ -231, var15, 0);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIILn;)[Lnf;")
    public static final class213[] method434(int arg0, int arg1, int arg2, class138 arg3) {
        if (arg0 <= 2) {
            return null;
        } else {
            ++field1259;
            return !class123.method760(arg3, arg1, arg2, 68) ? null : class218.method1381(0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class72() {
        super(3, false);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBII)V")
    public static final void method435(int arg0, byte arg1, int arg2, int arg3) {
        ++field1263;
        if (arg1 <= -23) {
            if (~class193.field3294 != -1 && ~arg3 != -1 && ~class144.field2478 > -51 && ~arg0 != 0) {
                class130.field2281[class144.field2478] = arg0;
                class221.field3747[class144.field2478] = arg3;
                class236.field4101[class144.field2478] = arg2;
                class22.field384[class144.field2478] = null;
                class34.field585[class144.field2478] = 0;
                ++class144.field2478;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
    public static final void method436(int arg0) {
        class254.field4457.method1723(arg0 + -4173);
        class27.field438.method1723(arg0 ^ -4173);
        class97.field1704.method1723(-4173);
        class13.field249.method1723(-4173);
        ++field1267;
        if (arg0 != 0) {
            method435(-34, (byte) -38, 33, -100);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        if (!arg0) {
            class87.method522(57);
            ++field1258;
        }
    }
}
