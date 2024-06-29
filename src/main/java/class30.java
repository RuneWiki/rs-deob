import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class30 extends class93 {

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    public static int field648 = 127;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "Z")
    public static boolean field650 = false;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "Ljd;")
    private static class92 field652 = class202.method1325((byte) 90, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "Ljd;")
    private static class92 field651 = class202.method1325((byte) 90, " is already on your ignore list)3");

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "Ljd;")
    public static class92 field658 = field652;

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "Z")
    public static boolean field656 = false;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field657 = 0;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "[[S")
    public static short[][] field653 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "Ljd;")
    public static class92 field660 = field651;

    @OriginalMember(owner = "client!ci", name = "gb", descriptor = "Ljd;")
    public static class92 field662 = class202.method1325((byte) 90, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!ci", name = "hb", descriptor = "[[I")
    public static int[][] field663 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ci", name = "fb", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ci", name = "ib", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ci", name = "jb", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIII)V")
    public static final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field649;
        long var6 = class124.method831(arg0, arg3, arg2);
        if (var6 != 0L) {
            int var8 = 3 & (int) var6 >> 20;
            int var9 = (int) var6 >> 14 & 31;
            int var10 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
            int var11 = arg5;
            if (~var6 < -1L) {
                var11 = arg4;
            }
            int[] var12 = class139.field2784.field3281;
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class214 var14 = class126.method846(0, var13);
            if (~var14.field4181 == 0) {
                if (~var9 == -1 || var9 == 2) {
                    if (var8 == 0) {
                        var12[var10] = var11;
                        var12[var10 + 512] = var11;
                        var12[var10 - -1024] = var11;
                        var12[var10 + 1536] = var11;
                    } else if (var8 == 1) {
                        var12[var10] = var11;
                        var12[var10 + 1] = var11;
                        var12[var10 + 2] = var11;
                        var12[var10 + 3] = var11;
                    } else if (var8 != 2) {
                        if (var8 == 3) {
                            var12[var10 - -1536] = var11;
                            var12[var10 + 1536 + 1] = var11;
                            var12[var10 + 1538] = var11;
                            var12[var10 + 1539] = var11;
                        }
                    } else {
                        var12[var10 + 3] = var11;
                        var12[var10 + 3 + 512] = var11;
                        var12[var10 + 3 + 1024] = var11;
                        var12[var10 + 1536 + 3] = var11;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var12[var10] = var11;
                    } else if (var8 != 1) {
                        if (var8 == 2) {
                            var12[var10 + 1539] = var11;
                        } else if (~var8 == -4) {
                            var12[var10 - -1536] = var11;
                        }
                    } else {
                        var12[var10 + 3] = var11;
                    }
                }
                if (~var9 == -3) {
                    if (var8 == 3) {
                        var12[var10] = var11;
                        var12[var10 - -512] = var11;
                        var12[var10 + 1024] = var11;
                        var12[var10 + 1536] = var11;
                    } else if (~var8 != -1) {
                        if (var8 != 1) {
                            if (var8 == 2) {
                                var12[var10 + 1536] = var11;
                                var12[var10 + 1 + 1536] = var11;
                                var12[var10 + 2 - -1536] = var11;
                                var12[var10 + 1536 - -3] = var11;
                            }
                        } else {
                            var12[var10 + 3] = var11;
                            var12[var10 + 3 + 512] = var11;
                            var12[var10 - -3 + 1024] = var11;
                            var12[var10 + 3 + 1536] = var11;
                        }
                    } else {
                        var12[var10] = var11;
                        var12[var10 + 1] = var11;
                        var12[var10 + 2] = var11;
                        var12[var10 + 3] = var11;
                    }
                }
            } else {
                class173 var15 = class68.field1381[var14.field4181];
                if (var15 != null) {
                    int var16 = (var14.field4197 * 4 - var15.field3354) / 2;
                    int var17 = (var14.field4191 * 4 - var15.field3351) / 2;
                    var15.method1145(arg3 * 4 + 48 - -var16, (104 - arg2 + -var14.field4191) * 4 + var17 + 48);
                }
            }
        }
        int var18 = 29 / ((arg1 - 61) / 59);
        long var19 = class213.method1381(arg0, arg3, arg2);
        if (~var19 != -1L) {
            int var21 = (int) var19 >> 14 & 31;
            int var22 = (int) (var19 >>> 32) & Integer.MAX_VALUE;
            int var23 = (int) var19 >> 20 & 3;
            class214 var24 = class126.method846(0, var22);
            if (~var24.field4181 != 0) {
                class173 var25 = class68.field1381[var24.field4181];
                if (var25 != null) {
                    int var26 = (var24.field4197 * 4 + -var25.field3354) / 2;
                    int var27 = (var24.field4191 * 4 + -var25.field3351) / 2;
                    var25.method1145(arg3 * 4 + var26 + 48, (-var24.field4191 + 104 + -arg2) * 4 + var27 + 48);
                }
            } else if (~var21 == -10) {
                int var28 = 15658734;
                if (var19 > 0L) {
                    var28 = 15597568;
                }
                int[] var29 = class139.field2784.field3281;
                int var30 = (-arg2 + 103) * 4 * 512 + arg3 * 4 + 24624;
                if (~var23 != -1 && ~var23 != -3) {
                    var29[var30] = var28;
                    var29[var30 + 1 + 512] = var28;
                    var29[var30 + 1024 + 2] = var28;
                    var29[var30 + 1539] = var28;
                } else {
                    var29[var30 + 1536] = var28;
                    var29[var30 + 1024 - -1] = var28;
                    var29[var30 + 512 + 2] = var28;
                    var29[var30 - -3] = var28;
                }
            }
        }
        long var31 = class87.method586(arg0, arg3, arg2);
        if (~var31 != -1L) {
            int var33 = Integer.MAX_VALUE & (int) (var31 >>> 32);
            class214 var34 = class126.method846(0, var33);
            if (~var34.field4181 != 0) {
                class173 var35 = class68.field1381[var34.field4181];
                if (var35 != null) {
                    int var36 = (var34.field4197 * 4 + -var35.field3354) / 2;
                    int var37 = (var34.field4191 * 4 + -var35.field3351) / 2;
                    var35.method1145(48 - (-(arg3 * 4) - var36), (-var34.field4191 + -arg2 + 104) * 4 + var37 + 48);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(IB)I")
    public static final int method186(int arg0, byte arg1) {
        ++field664;
        class5 var2 = class214.method1388(112, arg0);
        int var3 = var2.field281;
        int var4 = var2.field284;
        int var5 = var2.field272;
        int var6 = class25.field577[-var5 + var4];
        int var7 = -32 / ((41 - arg1) / 60);
        return class165.field3242[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V")
    public static void method187(int arg0) {
        field651 = null;
        field662 = null;
        field663 = null;
        field653 = null;
        int var1 = 90 / ((arg0 - -71) / 36);
        field658 = null;
        field652 = null;
        field660 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/awt/Color;Ljd;I)V")
    public static final void method188(int arg0, Color arg1, class92 arg2, int arg3) {
        try {
            Graphics var4 = class153.field3032.getGraphics();
            if (class124.field2516 == null) {
                class124.field2516 = new Font("Helvetica", 1, 13);
                class72.field1535 = class153.field3032.getFontMetrics(class124.field2516);
            }
            if (class10.field363) {
                class10.field363 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class114.field2296, class52.field1101);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class43.field968 == null) {
                    class43.field968 = class153.field3032.createImage(304, 34);
                }
                Graphics var5 = class43.field968.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, arg0);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, -(arg3 * 3) + 300, 30);
                var5.setFont(class124.field2516);
                var5.setColor(Color.white);
                arg2.method620((304 + -arg2.method634(class72.field1535, 62)) / 2, 22, -36, var5);
                var4.drawImage(class43.field968, class114.field2296 / 2 + -152, class52.field1101 / 2 + -18, (ImageObserver) null);
            } catch (Exception var8) {
                int var6 = class114.field2296 / 2 + -152;
                int var7 = class52.field1101 / 2 + -18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + (var6 - -2), var7 + 2, -(arg3 * 3) + 300, 30);
                var4.setFont(class124.field2516);
                var4.setColor(Color.white);
                arg2.method620(var6 - -((-arg2.method634(class72.field1535, 62) + 304) / 2), var7 + 22, arg0 + 59, var4);
            }
        } catch (Exception var9) {
            class153.field3032.repaint();
        }
        ++field654;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class30() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljd;BLnh;Ljd;)Lrf;")
    public static final class167 method189(class92 arg0, byte arg1, class133 arg2, class92 arg3) {
        ++field665;
        int var4 = -7 % ((29 - arg1) / 45);
        int var5 = arg2.method880(arg0, false);
        int var6 = arg2.method881(var5, 1, arg3);
        return class123.method827(arg2, var6, 2090, var5);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int var3 = -28 / ((arg1 - 67) / 42);
        ++field659;
        int[] var4 = super.field1887.method916(arg0, -35);
        if (super.field1887.field2757) {
            for (int var5 = 0; ~class150.field2985 < ~var5; ++var5) {
                var4[var5] = class75.field1574[var5];
            }
        }
        return var4;
    }
}
