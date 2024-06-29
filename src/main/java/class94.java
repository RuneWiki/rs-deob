import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class94 extends class107 {

    @OriginalMember(owner = "client!ie", name = "Cb", descriptor = "I")
    public static int field1227 = -1;

    @OriginalMember(owner = "client!ie", name = "Ib", descriptor = "[I")
    public static int[] field1233 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ie", name = "Jb", descriptor = "[J")
    public static long[] field1234 = new long[1000];

    @OriginalMember(owner = "client!ie", name = "Eb", descriptor = "I")
    public static volatile int field1229 = 0;

    @OriginalMember(owner = "client!ie", name = "xb", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ie", name = "yb", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ie", name = "zb", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ie", name = "Ab", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ie", name = "Bb", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ie", name = "Db", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!ie", name = "Fb", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ie", name = "Gb", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!ie", name = "Kb", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ie", name = "Lb", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ie", name = "Mb", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ie", name = "Hb", descriptor = "Lcn;")
    private class281 field1232;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "(II)I", line = 4)
    public final int method566(int arg0, int arg1) {
        field1228++;
        int var3 = this.field1231 >> 3;
        int var4 = arg1;
        int var5 = 8 - (this.field1231 & 0x7);
        this.field1231 += arg0;
        while (arg0 > var5) {
            var4 += (this.field1388[var3++] & class116.field1646[var5]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg0 == var5) {
            var6 = (this.field1388[var3] & class116.field1646[var5]) + var4;
        } else {
            var6 = (this.field1388[var3] >> var5 - arg0 & class116.field1646[arg0]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "(B)I", line = 36)
    public final int method567(byte arg0) {
        int var2 = 32 / ((-arg0 - 53) / 45);
        field1224++;
        return this.field1388[this.field1400++] - this.field1232.method2009(26813) & 0xFF;
    }

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "(II)I", line = 46)
    public final int method568(int arg0, int arg1) {
        field1223++;
        if (arg0 >= -24) {
            field1229 = 123;
        }
        return arg1 * 8 - this.field1231;
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(Z)V", line = 62)
    public final void method569(boolean arg0) {
        this.field1400 = (this.field1231 + 7) / 8;
        if (arg0) {
            field1237++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lp;B)V", line = 74)
    public static final void method570(class107 arg0, byte arg1) {
        if (arg1 >= 0) {
            field1234 = (long[]) null;
        }
        while (true) {
            while (arg0.field1388.length > arg0.field1400) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method661(-1) == 1) {
                    var2 = true;
                    var3 = arg0.method661(-1);
                    var4 = arg0.method661(-1);
                }
                int var5 = arg0.method661(-1);
                int var6 = arg0.method661(-1);
                int var7 = class308.field4766 + class249.field3771 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class239.field3595;
                if (var8 >= 0 && (var7 - 63) >= 0 && class291.field4574 > (var8 + 63) && class308.field4766 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && (var3 * 8 + 8) > var11 && var4 * 8 <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method679(-3);
                                if (var13 != 0) {
                                    if (class222.field3143[var9][var10] == null) {
                                        class222.field3143[var9][var10] = new byte[4096];
                                    }
                                    class222.field3143[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method679(-3);
                                    if (class224.field3179[var9][var10] == null) {
                                        class224.field3179[var9][var10] = new byte[4096];
                                    }
                                    class224.field3179[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method679(-3);
                        if (var16 != 0) {
                            arg0.field1400++;
                        }
                    }
                }
            }
            field1235++;
            return;
        }
    }

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "(I)V", line = 186)
    public static void method571(int arg0) {
        int var1 = 87 / ((arg0 - 42) / 34);
        field1233 = null;
        field1234 = null;
    }

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "(I)V", line = 200)
    public final void method572(int arg0) {
        field1222++;
        this.field1231 = this.field1400 * 8;
        int var2 = -99 / ((-arg0 - 29) / 35);
    }

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "(II)V", line = 210)
    public final void method573(int arg0, int arg1) {
        if (arg0 < 114) {
            this.method567((byte) -122);
        }
        this.field1388[this.field1400++] = (byte) (arg1 + this.field1232.method2009(26813));
        field1225++;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V", line = 220)
    public class94(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B[I)V", line = 227)
    public final void method574(byte arg0, int[] arg1) {
        if (arg0 < -72) {
            field1226++;
            this.field1232 = new class281(arg1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III[B)V", line = 245)
    public final void method575(int arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = 0;
        if (arg1 != 8) {
            field1227 = 35;
        }
        while (arg2 > var5) {
            arg3[arg0 + var5] = (byte) (this.field1388[this.field1400++] - this.field1232.method2009(class312.method2192(arg1, 26805)));
            var5++;
        }
        field1230++;
    }
}
