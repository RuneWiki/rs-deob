import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class196 {

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "[B")
    private byte[] field205 = new byte[512];

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "[S")
    private short[] field206 = new short[512];

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    private int field201 = 2048;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    private int field200 = 5;

    @OriginalMember(owner = "client!fk", name = "fb", descriptor = "I")
    private int field215 = 1;

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "I")
    private int field210 = 0;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    private int field204 = 5;

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "I")
    private int field212 = 2;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "Ldf;")
    public static class51 field203 = class46.method233("hint_mapedge", 100);

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "Lvh;")
    public static class252 field207 = new class252();

    @OriginalMember(owner = "client!fk", name = "eb", descriptor = "[I")
    public static int[] field214 = new int[32];

    @OriginalMember(owner = "client!fk", name = "ib", descriptor = "Ldf;")
    public static class51 field218 = class46.method233(":duelstake:", 100);

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!fk", name = "db", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!fk", name = "jb", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!fk", name = "gb", descriptor = "Lja;")
    public static class55 field216;

    @OriginalMember(owner = "client!fk", name = "hb", descriptor = "Lti;")
    public static class5 field217;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field208;
        if (arg2 != 82) {
            this.method44(71, (class121) null, (byte) 21);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field200 = arg1.method897(107);
                                }
                            } else {
                                this.field204 = arg1.method897(-117);
                            }
                        } else {
                            this.field215 = arg1.method897(127);
                        }
                    } else {
                        this.field212 = arg1.method897(-64);
                    }
                } else {
                    this.field201 = arg1.method876(false);
                }
            } else {
                this.field210 = arg1.method897(106);
            }
        } else {
            this.field204 = this.field200 = arg1.method897(arg2 ^ 44);
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)V")
    public static final void method76(byte arg0) {
        ++field211;
        class63.field1031.method834((byte) -109);
        for (int var1 = 0; var1 < 32; ++var1) {
            class12.field187[var1] = 0L;
        }
        if (arg0 != -36) {
            field218 = null;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class240.field4174[var2] = 0L;
        }
        class164.field2684 = 0;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field213;
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int var4 = class161.field2639[arg0] * this.field200 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class49.field767 > var7; ++var7) {
                class185.field3067 = Integer.MAX_VALUE;
                class48.field757 = Integer.MAX_VALUE;
                class244.field4216 = Integer.MAX_VALUE;
                class75.field1196 = Integer.MAX_VALUE;
                int var8 = class211.field3510[var7] * this.field204 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field205[255 & (this.field200 <= var11 ? -this.field200 + var11 : var11)] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field205[255 & (~this.field204 < ~var14 ? var14 : -this.field204 + var14) + var13]);
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field206[var15] - -(var14 << 12));
                        int var17 = -(var11 << 12) + -this.field206[var27] + var4;
                        int var18 = this.field215;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (var16 < 0 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = ~var25 > ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class75.field1196 > var19) {
                            class185.field3067 = class48.field757;
                            class48.field757 = class244.field4216;
                            class244.field4216 = class75.field1196;
                            class75.field1196 = var19;
                        } else if (var19 >= class244.field4216) {
                            if (~var19 <= ~class48.field757) {
                                if (var19 < class185.field3067) {
                                    class185.field3067 = var19;
                                }
                            } else {
                                class185.field3067 = class48.field757;
                                class48.field757 = var19;
                            }
                        } else {
                            class185.field3067 = class48.field757;
                            class48.field757 = class244.field4216;
                            class244.field4216 = var19;
                        }
                    }
                }
                int var12 = this.field212;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = class244.field4216 - class75.field1196;
                                }
                            } else {
                                var3[var7] = class185.field3067;
                            }
                        } else {
                            var3[var7] = class48.field757;
                        }
                    } else {
                        var3[var7] = class244.field4216;
                    }
                } else {
                    var3[var7] = class75.field1196;
                }
            }
        }
        if (arg1 != 10565) {
            this.method78((byte) 38);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        int var2 = 0 / ((43 - arg0) / 41);
        ++field219;
        this.field205 = class240.method1650(124, this.field210);
        this.method78((byte) -97);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lu;I)V")
    public static final void method77(class111 arg0, int arg1) {
        ++field209;
        class156.field2567 = class240.method1649(class210.field3489, arg0, (byte) -108);
        class75.field1199 = new int[256];
        for (int var2 = 0; var2 < 3; ++var2) {
            float var4 = (float) (255 & class98.field1639[var2] >> 16);
            int var5 = 255 & class98.field1639[var2 + 1] >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) (class98.field1639[var2] >> 8 & 255);
            int var8 = (class98.field1639[var2 + 1] & 65280) >> 8;
            float var9 = ((float) var8 + -var7) / 64.0F;
            float var10 = (float) (255 & class98.field1639[var2]);
            int var11 = class98.field1639[var2 + 1] & 255;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; ++var13) {
                class75.field1199[var2 * 64 + var13] = class82.method642(class82.method642((int) var7 << 8, (int) var4 << 16), (int) var10);
                var4 += var6;
                var7 += var9;
                var10 += var12;
            }
        }
        for (int var3 = 192; var3 < 255; ++var3) {
            class75.field1199[var3] = class98.field1639[3];
        }
        class143.field2393 = new int[32768];
        class207.field3455 = new int[32768];
        class261.method1776(113, (class158) null);
        if (arg1 >= -8) {
            field207 = null;
        }
        class100.field1675 = new int[32768];
        class37.field570 = new int[32768];
        class38.field589 = new class254(128, 254);
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(B)V")
    private final void method78(byte arg0) {
        ++field202;
        Random var2 = new Random((long) this.field210);
        if (arg0 >= -81) {
            this.field205 = null;
        }
        this.field206 = new short[512];
        if (this.field201 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field206[var3] = (short) class193.method1373(-1634280864, this.field201, var2);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public static void method79(int arg0) {
        if (arg0 != -513) {
            method76((byte) 122);
        }
        field214 = null;
        field207 = null;
        field216 = null;
        field217 = null;
        field203 = null;
        field218 = null;
    }
}
