import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class123 extends class125 {

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "Loa;")
    private static class99 field2152 = class221.method1463(2844, " from your friend list first)3");

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "Loa;")
    public static class99 field2157 = field2152;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "Loa;")
    public static class99 field2151 = class221.method1463(2844, "Examiner");

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "Z")
    public static boolean field2161 = false;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    public static int field2163 = 0;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
    public static int field2158 = -1;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Loa;")
    public static class99 field2154 = class221.method1463(2844, "<)4col>");

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "Ldb;")
    public static class17 field2156;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "[I")
    public static int[] field2164;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "[[B")
    public static byte[][] field2155;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIBII)V")
    public static final void method811(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2149++;
        if (class150.field2647 == 0) {
            class63.field1048++;
            int var7 = class119.field2108;
            int var8 = class86.field1492;
            int var9 = class238.field4119;
            int var10 = (arg5 - arg3) * (var9 - var8) / arg0 + var8;
            int var11 = class254.field4386;
            int var12 = (arg6 - arg1) * (var11 - var7) / arg2 + var7;
            if (class54.field896 && (class33.field592 & 0x40) == 64) {
                class107 var13 = class127.method842((byte) -48, class239.field4132, class103.field1750);
                if (var13 == null) {
                    class166.method1115(-50);
                } else {
                    class173.method1163(class169.field3018, class63.field1061, var12, (short) 18, 103, var10, 0L);
                }
            } else {
                if (class34.field613 == 1) {
                    class173.method1163(class119.field2107, class20.field234, var12, (short) 47, 70, var10, 0L);
                }
                class173.method1163(class44.field776, class20.field234, var12, (short) 33, 77, var10, 0L);
            }
        }
        long var14 = -1L;
        if (arg4 >= -7) {
            return;
        }
        for (int var16 = 0; var16 < class32.field569; var16++) {
            long var17 = class116.field2059[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3F91) >> 7;
            int var21 = ((int) var17 & 0x7BBA4D29) >> 29;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class97.method645(class255.field4407, var19, var20, var17)) {
                    class153 var23 = class247.method1601(26012, var22);
                    if (var23.field2696 != null) {
                        var23 = var23.method1023(-118);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class150.field2647 == 1) {
                        class173.method1163(class258.field4503, class198.method1332(94, new class99[] { class63.field1074, class138.field2451, var23.field2698 }), var20, (short) 39, 73, var19, var17);
                        class62.field1036++;
                    } else if (!class54.field896) {
                        class191.field3357++;
                        class99[] var24 = var23.field2684;
                        if (class65.field1101) {
                            var24 = class29.method251((byte) 66, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class86.field1490++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 11;
                                    }
                                    if (var25 == 1) {
                                        var26 = 60;
                                    }
                                    if (var25 == 2) {
                                        var26 = 51;
                                    }
                                    if (var25 == 3) {
                                        var26 = 16;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1003;
                                    }
                                    class173.method1163(var24[var25], class198.method1332(78, new class99[] { class139.field2463, var23.field2698 }), var20, var26, 92, var19, var17);
                                }
                            }
                        }
                        class173.method1163(class133.field2323, class198.method1332(114, new class99[] { class139.field2463, var23.field2698 }), var20, (short) 1005, 98, var19, (long) var23.field2709);
                    } else if ((class33.field592 & 0x4) == 4) {
                        class173.method1163(class169.field3018, class198.method1332(66, new class99[] { class93.field1562, class138.field2451, var23.field2698 }), var20, (short) 31, 76, var19, var17);
                        class94.field1588++;
                    }
                }
                if (var21 == 1) {
                    class156 var27 = class248.field4287[var22];
                    if (var27.field2793.field4469 == 1 && (var27.field1325 & 0x7F) == 64 && (var27.field1301 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class102.field1735; var28++) {
                            class156 var31 = class248.field4287[class239.field4120[var28]];
                            if (var31 != null && var27 != var31 && var31.field2793.field4469 == 1 && var27.field1325 == var31.field1325 && var27.field1301 == var31.field1301) {
                                class42.method319(var20, var19, (byte) -106, class239.field4120[var28], var31.field2793);
                            }
                        }
                        for (int var29 = 0; var29 < class190.field3342; var29++) {
                            class183 var30 = class259.field4515[class105.field1765[var29]];
                            if (var30 != null && var27.field1325 == var30.field1325 && var27.field1301 == var30.field1301) {
                                class284.method1858(var20, (byte) -112, var19, class105.field1765[var29], var30);
                            }
                        }
                    }
                    class42.method319(var20, var19, (byte) -100, var22, var27.field2793);
                }
                if (var21 == 0) {
                    class183 var32 = class259.field4515[var22];
                    if ((var32.field1325 & 0x7F) == 64 && (var32.field1301 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class102.field1735; var33++) {
                            class156 var36 = class248.field4287[class239.field4120[var33]];
                            if (var36 != null && var36.field2793.field4469 == 1 && var32.field1325 == var36.field1325 && var32.field1301 == var36.field1301) {
                                class42.method319(var20, var19, (byte) -103, class239.field4120[var33], var36.field2793);
                            }
                        }
                        for (int var34 = 0; var34 < class190.field3342; var34++) {
                            class183 var35 = class259.field4515[class105.field1765[var34]];
                            if (var35 != null && var32 != var35 && var32.field1325 == var35.field1325 && var32.field1301 == var35.field1301) {
                                class284.method1858(var20, (byte) -101, var19, class105.field1765[var34], var35);
                            }
                        }
                    }
                    class284.method1858(var20, (byte) 48, var19, var22, var32);
                }
                if (var21 == 3) {
                    class76 var37 = class32.field579[class255.field4407][var19][var20];
                    if (var37 != null) {
                        for (class280 var38 = (class280) var37.method531((byte) 124); var38 != null; var38 = (class280) var37.method535(-115)) {
                            int var39 = var38.field4902.field1125;
                            class166 var40 = class222.method1468(1, var39);
                            if (class150.field2647 == 1) {
                                class173.method1163(class258.field4503, class198.method1332(121, new class99[] { class63.field1074, class86.field1489, var40.field2963 }), var20, (short) 12, 125, var19, (long) var39);
                                class269.field4722++;
                            } else if (!class54.field896) {
                                class99[] var41 = var40.field2943;
                                if (class65.field1101) {
                                    var41 = class29.method251((byte) 66, var41);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 57;
                                        }
                                        if (var42 == 1) {
                                            var43 = 35;
                                        }
                                        if (var42 == 2) {
                                            var43 = 15;
                                        }
                                        class156.field2804++;
                                        if (var42 == 3) {
                                            var43 = 40;
                                        }
                                        if (var42 == 4) {
                                            var43 = 6;
                                        }
                                        class173.method1163(var41[var42], class198.method1332(66, new class99[] { class257.field4454, var40.field2963 }), var20, var43, 127, var19, (long) var39);
                                    } else if (var42 == 2) {
                                        class173.method1163(class230.field3978, class198.method1332(70, new class99[] { class257.field4454, var40.field2963 }), var20, (short) 15, 125, var19, (long) var39);
                                        class19.field219++;
                                    }
                                }
                                class173.method1163(class133.field2323, class198.method1332(80, new class99[] { class257.field4454, var40.field2963 }), var20, (short) 1004, 117, var19, (long) var39);
                                class169.field3011++;
                            } else if ((class33.field592 & 0x1) == 1) {
                                class173.method1163(class169.field3018, class198.method1332(61, new class99[] { class93.field1562, class86.field1489, var40.field2963 }), var20, (short) 10, 100, var19, (long) var39);
                                class272.field4796++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZII)Z")
    public final boolean method812(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method811(121, 61, 34, 33, (byte) 10, -8, -60);
        }
        field2159++;
        return this.field2162 <= arg2 && arg2 <= this.field2148 && this.field2160 <= arg1 && arg1 <= this.field2150;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLjd;Ljava/lang/Object;)V")
    public static final void method813(boolean arg0, class87 arg1, Object arg2) {
        field2165++;
        if (arg1.field1503 == null) {
            return;
        }
        if (arg0) {
            method814(119, -9);
        }
        for (int var3 = 0; var3 < 50 && arg1.field1503.peekEvent() != null; var3++) {
            class100.method711(0, 1L);
        }
        if (arg2 != null) {
            arg1.field1503.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public static final void method814(int arg0, int arg1) {
        field2153++;
        if (arg0 == -1 || !class22.method134(arg0, (byte) 106)) {
            return;
        }
        class107[] var2 = class125.field2188[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class107 var4 = var2[var3];
            if (var4.field1787 != null) {
                class260 var5 = new class260();
                var5.field4543 = var4.field1787;
                var5.field4553 = var4;
                class171.method1151(-88, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIII)V")
    public class123(int arg0, int arg1, int arg2, int arg3) {
        this.field2150 = arg3;
        this.field2160 = arg1;
        this.field2148 = arg2;
        this.field2162 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
    public static final void method815(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class13.field128; var3++) {
            for (int var4 = 0; var4 < class253.field4372; var4++) {
                for (int var5 = 0; var5 < class172.field3051; var5++) {
                    class216 var6 = class128.field2236[var3][var4][var5];
                    if (var6 != null) {
                        class167 var7 = var6.field3762;
                        if (var7 != null && var7.field2988.method653()) {
                            class234.method1530(var7.field2988, var3, var4, var5, 1, 1);
                            if (var7.field2989 != null && var7.field2989.method653()) {
                                class234.method1530(var7.field2989, var3, var4, var5, 1, 1);
                                var7.field2988.method651(var7.field2989, 0, 0, 0, false);
                                var7.field2989 = var7.field2989.method649(arg0, arg1, arg2);
                            }
                            var7.field2988 = var7.field2988.method649(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3748; var8++) {
                            class77 var10 = var6.field3743[var8];
                            if (var10 != null && var10.field1367.method653()) {
                                class234.method1530(var10.field1367, var3, var4, var5, var10.field1361 + 1 - var10.field1362, var10.field1371 - var10.field1357 + 1);
                                var10.field1367 = var10.field1367.method649(arg0, arg1, arg2);
                            }
                        }
                        class278 var9 = var6.field3757;
                        if (var9 != null && var9.field4891.method653()) {
                            class197.method1324(var9.field4891, var3, var4, var5);
                            var9.field4891 = var9.field4891.method649(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    public static void method816(int arg0) {
        field2155 = null;
        if (arg0 != -2) {
            field2164 = null;
        }
        field2157 = null;
        field2154 = null;
        field2151 = null;
        field2156 = null;
        field2152 = null;
        field2164 = null;
    }
}
