import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class55 extends class300 {

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    private int field793 = 4096;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    private int field795 = 0;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    private int field803 = 2000;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    private int field804 = 0;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    private int field797 = 16;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field794 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field796 = new String[100];

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Ljava/lang/String;")
    public static String field805 = "";

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field806 = 0;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class55() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method358(Component arg0, byte arg1) {
        ++field800;
        arg0.removeMouseListener(class108.field1568);
        if (arg1 != 68) {
            method360(false, (byte[]) null);
        }
        arg0.removeMouseMotionListener(class108.field1568);
        arg0.removeFocusListener(class108.field1568);
        class223.field3495 = 0;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
    public static void method359(int arg0) {
        field796 = null;
        if (arg0 < 80) {
            method360(false, (byte[]) null);
        }
        field794 = null;
        field805 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z[B)V")
    public static final void method360(boolean arg0, byte[] arg1) {
        ++field801;
        class170 var2 = new class170(arg1);
        var2.field2676 = arg1.length - 2;
        class139.field2000 = var2.method1186((byte) -77);
        class64.field924 = new int[class139.field2000];
        class277.field4480 = new int[class139.field2000];
        class50.field631 = new byte[class139.field2000][];
        class284.field4603 = new int[class139.field2000];
        class166.field2569 = new int[class139.field2000];
        class190.field2959 = new byte[class139.field2000][];
        class281.field4576 = new boolean[class139.field2000];
        var2.field2676 = -(class139.field2000 * 8) + -7 + arg1.length;
        class15.field215 = var2.method1186((byte) -73);
        class86.field1308 = var2.method1186((byte) -66);
        int var3 = 1 + (var2.method1218(85) & 255);
        for (int var4 = 0; ~var4 > ~class139.field2000; ++var4) {
            class166.field2569[var4] = var2.method1186((byte) -54);
        }
        for (int var5 = 0; ~var5 > ~class139.field2000; ++var5) {
            class277.field4480[var5] = var2.method1186((byte) -61);
        }
        int var6 = 0;
        if (!arg0) {
            method361(-66, -60);
        }
        while (var6 < class139.field2000) {
            class64.field924[var6] = var2.method1186((byte) -105);
            ++var6;
        }
        for (int var7 = 0; class139.field2000 > var7; ++var7) {
            class284.field4603[var7] = var2.method1186((byte) -117);
        }
        var2.field2676 = arg1.length + -7 - ((var3 - 1) * 3 + class139.field2000 * 8);
        class229.field3539 = new int[var3];
        for (int var8 = 1; var8 < var3; ++var8) {
            class229.field3539[var8] = var2.method1212(460736848);
            if (~class229.field3539[var8] == -1) {
                class229.field3539[var8] = 1;
            }
        }
        var2.field2676 = 0;
        for (int var9 = 0; ~var9 > ~class139.field2000; ++var9) {
            int var10 = class64.field924[var9];
            int var11 = class284.field4603[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class190.field2959[var9] = var13;
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class50.field631[var9] = var15;
            int var16 = var2.method1218(-53);
            if ((1 & var16) != 0) {
                int var17 = 0;
                label90: while (true) {
                    if (var17 >= var10) {
                        if ((2 & var16) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var18 >= var10) {
                                break label90;
                            }
                            for (int var19 = 0; var11 > var19; ++var19) {
                                byte var20 = var15[var10 * var19 + var18] = var2.method1215(128);
                                var14 |= var20 != -1;
                            }
                            ++var18;
                        }
                    }
                    for (int var21 = 0; ~var21 > ~var11; ++var21) {
                        var13[var10 * var21 + var17] = var2.method1215(128);
                    }
                    ++var17;
                }
            } else {
                for (int var22 = 0; ~var22 > ~var12; ++var22) {
                    var13[var22] = var2.method1215(128);
                }
                if (~(2 & var16) != -1) {
                    for (int var23 = 0; var23 < var12; ++var23) {
                        byte var24 = var15[var23] = var2.method1215(128);
                        var14 |= var24 != -1;
                    }
                }
            }
            class281.field4576[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field798;
        if (arg1 != -957953300) {
            return null;
        } else {
            int[] var3 = super.field4797.method217(arg0, true);
            if (super.field4797.field470) {
                int var4 = this.field793 >> 1;
                int[][] var5 = super.field4797.method214(0);
                Random var6 = new Random((long) this.field804);
                for (int var7 = 0; ~this.field803 < ~var7; ++var7) {
                    int var8 = ~this.field793 < -1 ? this.field795 - (var4 + -class19.method108(var6, this.field793, 26329)) : this.field795;
                    int var9 = 255 & var8 >> 4;
                    int var10 = class19.method108(var6, class180.field2826, 26329);
                    int var11 = class19.method108(var6, class4.field61, 26329);
                    int var12 = var11 - -(class299.field4774[var9] * this.field797 >> 12);
                    int var13 = -var11 + var12;
                    int var14 = (class255.field4160[var9] * this.field797 >> 12) + var10;
                    int var15 = -var10 + var14;
                    if (~var15 != -1 || var13 != 0) {
                        if (~var13 > -1) {
                            var13 = -var13;
                        }
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        boolean var16 = var13 > var15;
                        if (var16) {
                            int var17 = var14;
                            int var18 = var10;
                            var14 = var12;
                            var12 = var17;
                            var10 = var11;
                            var11 = var18;
                        }
                        if (~var14 > ~var10) {
                            int var19 = var11;
                            var11 = var12;
                            var12 = var19;
                            int var20 = var10;
                            var10 = var14;
                            var14 = var20;
                        }
                        int var21 = -var10 + var14;
                        int var22 = var12 - var11;
                        if (var22 < 0) {
                            var22 = -var22;
                        }
                        int var23 = -var21 / 2;
                        int var24 = 2048 / var21;
                        int var25 = var11;
                        int var26 = -(class19.method108(var6, 4096, arg1 + 957979629) >> 2) + 1024;
                        int var27 = var12 <= var11 ? -1 : 1;
                        for (int var28 = var10; var14 > var28; ++var28) {
                            var23 += var22;
                            int var29 = var26 + 1024 - -((-var10 + var28) * var24);
                            int var30 = var25 & class285.field4611;
                            if (~var23 < -1) {
                                var23 += -var21;
                                var25 -= -var27;
                            }
                            int var31 = var28 & class277.field4503;
                            if (var16) {
                                var5[var30][var31] = var29;
                            } else {
                                var5[var31][var30] = var29;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 >= 126) {
            class123.method801(101);
            ++field792;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)V")
    public static final void method361(int arg0, int arg1) {
        ++field802;
        if (arg1 != 2048) {
            field796 = null;
        }
        class175.field2756.method1514(arg0, (byte) -55);
        class152.field2261.method1514(arg0, (byte) -55);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field799;
        if (arg1 >= -43) {
            this.method144(30);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field793 = arg0.method1186((byte) -38);
                        }
                    } else {
                        this.field795 = arg0.method1186((byte) -100);
                    }
                } else {
                    this.field797 = arg0.method1218(-24);
                }
            } else {
                this.field803 = arg0.method1186((byte) -47);
            }
        } else {
            this.field804 = arg0.method1218(119);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)J")
    public static final long method362(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field1646; ++var4) {
                class158 var5 = var3.field1634[var4];
                if ((var5.field2354 >> 29 & 3L) == 2L && var5.field2352 == arg1 && var5.field2359 == arg2) {
                    return var5.field2354;
                }
            }
            return 0L;
        }
    }
}
