import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class114 extends class223 {

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    private int field1756 = 1;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    private int field1752 = 1;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    private int field1760 = 204;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field1755 = -1;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1758 = "Loading title screen - ";

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1754 = "flash3:";

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "Lub;")
    public static class92 field1750;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "Lub;")
    public static class92 field1757;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lnh;III)V")
    public static final void method843(class55 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class235.field3716) {
            class22 var4 = class149.field2210[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field377 != null && var4.field377.field1664.method465()) {
                arg0.method462(var4.field377.field1664, 128, 0, 0, true);
            }
        }
        if (arg3 < class235.field3716) {
            class22 var5 = class149.field2210[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field377 != null && var5.field377.field1664.method465()) {
                arg0.method462(var5.field377.field1664, 0, 0, 128, true);
            }
        }
        if (arg2 < class235.field3716 && arg3 < class291.field4515) {
            class22 var6 = class149.field2210[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field377 != null && var6.field377.field1664.method465()) {
                arg0.method462(var6.field377.field1664, 128, 0, 128, true);
            }
        }
        if (arg2 < class235.field3716 && arg3 > 0) {
            class22 var7 = class149.field2210[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field377 != null && var7.field377.field1664.method465()) {
                arg0.method462(var7.field377.field1664, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
    public static void method844(boolean arg0) {
        field1757 = null;
        if (!arg0) {
            method844(true);
        }
        field1758 = null;
        field1754 = null;
        field1750 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 == 102) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field1760 = arg0.method260((byte) -67);
                    }
                } else {
                    this.field1752 = arg0.method265(-122);
                }
            } else {
                this.field1756 = arg0.method265(-110);
            }
            ++field1751;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 < 14) {
            return null;
        } else {
            int[] var3 = super.field3588.method1611(0, arg1);
            ++field1759;
            if (super.field3588.field3722) {
                for (int var4 = 0; var4 < class250.field4008; ++var4) {
                    int var5 = class106.field1662[var4];
                    int var6 = class307.field4925[arg1];
                    int var7 = this.field1756 * var5 >> 12;
                    int var8 = var5 % (4096 / this.field1756) * this.field1756;
                    int var9 = this.field1752 * var6 >> 12;
                    int var10 = var6 % (4096 / this.field1752) * this.field1752;
                    if (~var10 > ~this.field1760) {
                        for (var7 -= var9; ~var7 > -1; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (~var7 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~this.field1760 < ~var8) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field1760 > var8) {
                        int var11;
                        for (var11 = var7 - var9; var11 < 0; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB[B)I")
    public static final int method845(int arg0, byte arg1, byte[] arg2) {
        if (arg1 < 35) {
            return -31;
        } else {
            ++field1753;
            return class253.method1713(-1405486520, 0, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)V")
    public static final void method846(boolean arg0) {
        ++field1749;
        if (class263.field4169 != -1 && class91.field1421 != -1) {
            float[] var1 = new float[3];
            int var2 = ((-class15.field204 + class181.field2837) * class80.field1212 >> 16) + class15.field204;
            class80.field1212 += var2;
            int var3 = class222.field3502 * 2;
            if (~class80.field1212 <= -65536) {
                if (class105.field1646) {
                    class53.field840 = false;
                } else {
                    class53.field840 = true;
                }
                class105.field1646 = true;
                class80.field1212 = 65535;
            } else {
                class105.field1646 = false;
                class53.field840 = false;
            }
            float var4 = (float) class80.field1212 / 65535.0F;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = (class285.field4483[class263.field4169][var3 - -2][var5] + -class285.field4483[class263.field4169][var3 + 3][var5] + class285.field4483[class263.field4169][var3 + 2][var5]) * 3;
                int var22 = class285.field4483[class263.field4169][var3][var5];
                int var23 = class285.field4483[class263.field4169][var3][var5] * 3;
                int var24 = class285.field4483[class263.field4169][var3 - -1][var5] * 3;
                int var25 = -var23 + var24;
                int var26 = -(var24 * 2) - -var21 + var23;
                int var27 = class285.field4483[class263.field4169][var3 + 2][var5] - var22 + -var21 + var24;
                var1[var5] = (((float) var27 * var4 + (float) var26) * var4 + (float) var25) * var4 + (float) var22;
            }
            class250.field4007 = (int) var1[1] * -1;
            if (!arg0) {
                class226.field3616 = (int) var1[0] + -(class138.field2072 * 128);
                class118.field1787 = (int) var1[2] + -(class159.field2379 * 128);
                float[] var6 = new float[3];
                int var7 = class282.field4451 * 2;
                for (int var8 = 0; var8 < 3; ++var8) {
                    int var14 = class285.field4483[class91.field1421][var7][var8] * 3;
                    int var15 = class285.field4483[class91.field1421][var7 + 1][var8] * 3;
                    int var16 = (class285.field4483[class91.field1421][var7 + 2][var8] - -class285.field4483[class91.field1421][var7 + 2][var8] - class285.field4483[class91.field1421][var7 + 3][var8]) * 3;
                    int var17 = -var14 + var15;
                    int var18 = class285.field4483[class91.field1421][var7][var8];
                    int var19 = -(var15 * 2) + var14 - -var16;
                    int var20 = class285.field4483[class91.field1421][var7 - -2][var8] + -var18 + var15 + -var16;
                    var6[var8] = (((float) var20 * var4 + (float) var19) * var4 + (float) var17) * var4 + (float) var18;
                }
                float var9 = var6[0] - var1[0];
                float var10 = var6[2] - var1[2];
                float var11 = (var6[1] + -var1[1]) * -1.0F;
                double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
                class174.field2689 = (float) Math.atan2((double) var11, var12);
                class260.field4119 = -((float) Math.atan2((double) var9, (double) var10));
                class8.field128 = (int) ((double) class174.field2689 * 325.949D) & 2047;
                class82.field1244 = 2047 & (int) ((double) class260.field4119 * 325.949D);
            }
        }
    }
}
