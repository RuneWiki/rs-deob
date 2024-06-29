import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class104 extends class135 {

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
    private int field1504 = 4096;

    @OriginalMember(owner = "client!wh", name = "fb", descriptor = "Lqj;")
    public static class196 field1509 = class80.method502("<)4col>", -48);

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "I")
    public static int field1499 = 2;

    @OriginalMember(owner = "client!wh", name = "db", descriptor = "[I")
    public static int[] field1507 = new int[2048];

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "[I")
    public static int[] field1505 = new int[25];

    @OriginalMember(owner = "client!wh", name = "hb", descriptor = "[I")
    public static int[] field1511 = new int[25];

    @OriginalMember(owner = "client!wh", name = "kb", descriptor = "Lqj;")
    private static class196 field1514 = class80.method502("Loading title screen )2 ", -48);

    @OriginalMember(owner = "client!wh", name = "gb", descriptor = "Lqj;")
    public static class196 field1510 = field1514;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!wh", name = "eb", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!wh", name = "ib", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!wh", name = "jb", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!wh", name = "lb", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!wh", name = "mb", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "Lbk;")
    public static class136 field1503;

    @OriginalMember(owner = "client!wh", name = "cb", descriptor = "Lsj;")
    public static class213 field1506;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "[[[B")
    public static byte[][][] field1500;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    public static void method635(int arg0) {
        field1500 = null;
        field1509 = null;
        if (arg0 != 16777215) {
            method639((class178) null, (byte) -35, (class196) null);
        }
        field1507 = null;
        field1511 = null;
        field1503 = null;
        field1505 = null;
        field1510 = null;
        field1506 = null;
        field1514 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BZLqj;)V")
    public static final void method636(byte arg0, boolean arg1, class196 arg2) {
        ++field1513;
        int var3 = class226.field4045.method1250(arg2, 250);
        byte var4 = 4;
        int var5 = 13 * class226.field4045.method1239(arg2, 250);
        int var6 = var4 + 6;
        int var7 = var4 + 6;
        if (arg0 != 34) {
            field1505 = null;
        }
        class55.method295(-var4 + var7, var6 - var4, var3 - -var4 + var4, var4 + var5 + var4, 0);
        class55.method302(-var4 + var7, -var4 + var6, var3 + var4 + var4, var4 + var5 + var4, 16777215);
        class226.field4045.method1259(arg2, var7, var6, var3, var5, 16777215, -1, 1, 1, 0);
        class166.method1070(var3 + var4 + var4, var4 + var5 + var4, -var4 + var7, 0, -var4 + var6);
        if (!arg1) {
            class54.method281(var7, var6, var5, var3, 0);
        } else {
            try {
                Graphics var8 = class52.field643.getGraphics();
                class43.field490.method202(false, var8, 0, 0);
            } catch (Exception var9) {
                class52.field643.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILbk;)V")
    public static final void method637(int arg0, class136 arg1) {
        int var2 = -86 / ((arg0 - 49) / 37);
        ++field1516;
        class234.field4167 = arg1;
        class240.field4269 = class234.field4167.method831(-12858, 4);
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)[Lsc;")
    public static final class212[] method638(byte arg0) {
        ++field1515;
        class212[] var1 = new class212[class76.field1102];
        if (arg0 != -95) {
            method637(78, (class136) null);
        }
        for (int var2 = 0; class76.field1102 > var2; ++var2) {
            var1[var2] = new class68(class149.field2391, class92.field1347, class234.field4169[var2], class240.field4261[var2], class77.field1126[var2], class31.field392[var2], class203.field3645[var2], class84.field1237);
        }
        class168.method1099(false);
        return var1;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class104() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field1504 = arg0.method318(true);
        }
        if (arg2 != -16231) {
            field1510 = null;
        }
        ++field1508;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field1501;
            int[] var3 = super.field1954.method110(arg0, 95);
            if (super.field1954.field244) {
                int[] var4 = this.method819(-115, 0, arg0 + -1 & class53.field667);
                int[] var5 = this.method819(-97, 0, arg0);
                int[] var6 = this.method819(-116, 0, arg0 + 1 & class53.field667);
                for (int var7 = 0; class131.field1862 > var7; ++var7) {
                    int var8 = (var5[class61.field816 & var7 - -1] + -var5[class61.field816 & var7 + -1]) * this.field1504;
                    int var9 = (var6[var7] + -var4[var7]) * this.field1504;
                    int var10 = var8 >> 12;
                    int var11 = var9 >> 12;
                    int var12 = var11 * var11 >> 12;
                    int var13 = var10 * var10 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)));
                    int var15 = var14 != 0 ? 16777216 / var14 : 0;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lec;BLqj;)Lqj;")
    public static final class196 method639(class178 arg0, byte arg1, class196 arg2) {
        if (~arg2.method1333(class27.field337, 0) != 0) {
            label58: while (true) {
                int var3 = arg2.method1333(class93.field1359, 0);
                if (~var3 == 0) {
                    while (true) {
                        int var4 = arg2.method1333(class34.field409, 0);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method1333(class8.field82, 0);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method1333(class214.field3836, 0);
                                        if (~var6 == 0) {
                                            while (true) {
                                                int var7 = arg2.method1333(class129.field1833, 0);
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg2.method1333(class45.field545, 0);
                                                        if (~var8 == 0) {
                                                            break label58;
                                                        }
                                                        class196 var9 = class152.field2450;
                                                        if (class57.field773 != null) {
                                                            var9 = class245.method1672(class57.field773.field2139, 0);
                                                            try {
                                                                if (class57.field773.field2135 != null) {
                                                                    byte[] var10 = ((String) class57.field773.field2135).getBytes("ISO-8859-1");
                                                                    var9 = class16.method88(var10.length, 0, var10, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg2 = class93.method572(-55, new class196[] { arg2.method1290(var8, 13324, 0), var9, arg2.method1296(var8 - -4, -1) });
                                                    }
                                                }
                                                arg2 = class93.method572(-91, new class196[] { arg2.method1290(var7, 13324, 0), class188.method1230(class132.method803(arg0, 4, false), true), arg2.method1296(var7 + 2, -1) });
                                            }
                                        }
                                        arg2 = class93.method572(-108, new class196[] { arg2.method1290(var6, 13324, 0), class188.method1230(class132.method803(arg0, 3, false), true), arg2.method1296(var6 + 2, -1) });
                                    }
                                }
                                arg2 = class93.method572(-88, new class196[] { arg2.method1290(var5, 13324, 0), class188.method1230(class132.method803(arg0, 2, false), true), arg2.method1296(var5 + 2, -1) });
                            }
                        }
                        arg2 = class93.method572(-66, new class196[] { arg2.method1290(var4, 13324, 0), class188.method1230(class132.method803(arg0, 1, false), true), arg2.method1296(var4 + 2, -1) });
                    }
                }
                arg2 = class93.method572(-113, new class196[] { arg2.method1290(var3, 13324, 0), class188.method1230(class132.method803(arg0, 0, false), true), arg2.method1296(var3 - -2, -1) });
            }
        }
        ++field1502;
        int var11 = -98 % ((arg1 - -37) / 54);
        return arg2;
    }
}
