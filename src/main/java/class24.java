import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class24 extends class19 {

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public int field510 = 1000;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field505 = 0;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
    public static int field512 = 0;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
    public static int field514 = 0;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "Lkc;")
    public static class67 field515 = class19.method144("Willkommen auf RuneScape", 86);

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "Lkc;")
    public static class67 field517 = class19.method144("Bitte wenden Sie sich an den Kundendienst)3", 122);

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "Lkc;")
    private static class67 field508 = class19.method144("Classic", 70);

    @OriginalMember(owner = "client!db", name = "V", descriptor = "Lkc;")
    public static class67 field501 = field508;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "Lkc;")
    public static class67 field513 = class19.method144("::qa_op_test", 124);

    @OriginalMember(owner = "client!db", name = "X", descriptor = "Lkc;")
    public static class67 field503 = class19.method144("Sichtbare Karte vorbereitet)3", 90);

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "[I")
    public static int[] field519 = new int[1000];

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "Lta;")
    public static class119 field511;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V", line = 3)
    public static void method185(int arg0) {
        field503 = null;
        field515 = null;
        field501 = null;
        field517 = null;
        field519 = null;
        field508 = null;
        field511 = null;
        if (arg0 == 0) {
            field513 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V", line = 21)
    public static final void method186(byte arg0) {
        field518++;
        if (class45.field1105 && class19.field364 != class112.field2593) {
            class21.method161(class69.field1640.field1263[0], class69.field1640.field1198[0], class29.field614, class88.field2022, (byte) 115, class112.field2593);
            return;
        }
        if (class60.field1411 != class112.field2593) {
            class60.field1411 = class112.field2593;
            class46.method386(false, class112.field2593);
        }
        if (arg0 > -90) {
            method185(31);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lhd;II)V", line = 49)
    public static final void method187(class50 arg0, int arg1, int arg2) {
        class31.method270((byte) 58, arg2, arg0.field1260, arg0.field1190);
        if (arg1 != -65536) {
            field517 = null;
        }
        field509++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIII)V", line = 62)
    public void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field507++;
        class39 var10 = this.method190((byte) -93);
        if (var10 != null) {
            this.field510 = var10.field510;
            var10.method188(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V", line = 79)
    public static final void method189(int arg0) {
        int var1 = -119 / ((arg0 + 10) / 45);
        field516++;
        for (int var2 = 0; var2 < class69.field1649; var2++) {
            int var3 = class138.field3308[var2];
            class66 var4 = class9.field189[var3];
            int var5 = class112.field2558.method1105(255);
            if ((var5 & 0x20) != 0) {
                int var6 = class112.field2558.method1105(255);
                int var7 = class112.field2558.method1105(255);
                var4.method416(60, class135.field3243, var6, var7);
                var4.field1202 = class135.field3243 + 300;
                var4.field1236 = class112.field2558.method1105(255);
                var4.field1239 = class112.field2558.method1088(1809908424);
            }
            if ((var5 & 0x40) != 0) {
                var4.field1200 = class112.field2558.method1084(112);
                if (var4.field1200 == 65535) {
                    var4.field1200 = -1;
                }
            }
            if ((var5 & 0x8) != 0) {
                var4.field1219 = class112.field2558.method1110(false);
                var4.field1251 = 100;
            }
            if ((var5 & 0x2) != 0) {
                int var8 = class112.field2558.method1105(255);
                int var9 = class112.field2558.method1088(1809908424);
                var4.method416(93, class135.field3243, var8, var9);
                var4.field1202 = class135.field3243 + 300;
                var4.field1236 = class112.field2558.method1097(false);
                var4.field1239 = class112.field2558.method1094(10);
            }
            if ((var5 & 0x4) != 0) {
                int var10 = class112.field2558.method1119(-16894);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class112.field2558.method1088(1809908424);
                if (var4.field1216 == var10 && var10 != -1) {
                    int var12 = class70.method576(12, var10).field2580;
                    if (var12 == 1) {
                        var4.field1188 = 0;
                        var4.field1252 = 0;
                        var4.field1250 = 0;
                        var4.field1207 = var11;
                    }
                    if (var12 == 2) {
                        var4.field1252 = 0;
                    }
                } else if (var10 == -1 || var4.field1216 == -1 || class70.method576(12, var10).field2567 >= class70.method576(12, var4.field1216).field2567) {
                    var4.field1246 = var4.field1201;
                    var4.field1250 = 0;
                    var4.field1207 = var11;
                    var4.field1252 = 0;
                    var4.field1188 = 0;
                    var4.field1216 = var10;
                }
            }
            if ((var5 & 0x10) != 0) {
                var4.field1194 = class112.field2558.method1107(-21560);
                int var13 = class112.field2558.method1118(4);
                var4.field1222 = (var13 & 0xFFFF) + class135.field3243;
                if (var4.field1194 == 65535) {
                    var4.field1194 = -1;
                }
                var4.field1230 = var13 >> 16;
                var4.field1261 = 0;
                var4.field1193 = 0;
                if (class135.field3243 < var4.field1222) {
                    var4.field1193 = -1;
                }
            }
            if ((var5 & 0x1) != 0) {
                var4.field1542 = class63.method483(class112.field2558.method1119(-16894), true);
                var4.field1249 = var4.field1542.field1701;
                var4.field1204 = var4.field1542.field1743;
                var4.field1231 = var4.field1542.field1723;
                var4.field1221 = var4.field1542.field1711;
                var4.field1220 = var4.field1542.field1738;
                var4.field1237 = var4.field1542.field1713;
                var4.field1208 = var4.field1542.field1707;
                var4.field1254 = var4.field1542.field1736;
                var4.field1197 = var4.field1542.field1739;
            }
            if ((var5 & 0x80) != 0) {
                var4.field1248 = class112.field2558.method1107(-21560);
                var4.field1225 = class112.field2558.method1107(-21560);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)Lfd;", line = 262)
    public class39 method190(byte arg0) {
        field506++;
        if (arg0 != -93) {
            field508 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIB[Led;III)V", line = 286)
    public static final void method191(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class33[] arg6, int arg7, int arg8, int arg9) {
        field502++;
        if (arg5 != 114) {
            return;
        }
        for (int var10 = 0; var10 < arg6.length; var10++) {
            class33 var11 = arg6[var10];
            if (var11 != null && (var11.field729 == 0 || var11.field797) && var11 != null && var11.field719 == arg7 && !class99.method760(18547, var11)) {
                int var12 = arg4 + var11.field750 - arg3;
                int var13 = var11.field813 + arg8 - arg2;
                int var14 = var11.field733 + var13;
                int var15 = var12 + var11.field704;
                int var16 = arg8 < var13 ? var13 : arg8;
                int var17 = arg4 >= var12 ? arg4 : var12;
                int var18 = var14 >= arg0 ? arg0 : var14;
                int var19 = arg9 <= var15 ? arg9 : var15;
                if (var11.field729 == 0) {
                    method191(var18, arg1, var11.field728, var11.field806, var17, (byte) 114, arg6, var11.field740, var16, var19);
                    if (var11.field700 != null) {
                        method191(var18, arg1, var11.field728, var11.field806, var17, (byte) 114, var11.field700, var11.field740, var16, var19);
                    }
                }
                if (var11.field797) {
                    boolean var20;
                    if (var16 <= class138.field3298 && class80.field1889 >= var17 && class138.field3298 < var18 && class80.field1889 < var19) {
                        var20 = true;
                    } else {
                        var20 = false;
                    }
                    boolean var21 = false;
                    boolean var22 = false;
                    if (class90.field2084 == 1 && var20) {
                        var22 = true;
                    }
                    if (class115.field2705 == 1 && class74.field1758 >= var16 && class109.field2504 >= var17 && class74.field1758 < var18 && var19 > class109.field2504) {
                        var21 = true;
                    }
                    if (var21 && class31.field654 == null && (arg1 & 0x200) != 0 && !class90.field2066 && class11.method98((byte) 80, var11) != null) {
                        class129.field3031 = class138.field3298;
                        class75.field1800 = class80.field1889;
                        class63.field1480 = 0;
                        class31.field654 = var11;
                        class88.field2034 = false;
                    }
                    if (class31.field654 != null || class90.field2066) {
                        var20 = false;
                        var21 = false;
                        var22 = false;
                    }
                    if (!var11.field765 && var21 && (arg1 & 0x1) != 0) {
                        var11.field765 = true;
                        if (var11.field766 != null) {
                            class112.method853(var11, var11.field766, false, class74.field1758 - var13, 0, class109.field2504 - var12, null);
                        }
                    }
                    if (var11.field765 && var22 && (arg1 & 0x4) != 0 && var11.field732 != null) {
                        class112.method853(var11, var11.field732, false, class138.field3298 - var13, 0, class80.field1889 - var12, null);
                    }
                    if (var11.field765 && !var22 && (arg1 & 0x2) != 0) {
                        var11.field765 = false;
                        if (var11.field785 != null) {
                            class112.method853(var11, var11.field785, false, class138.field3298 - var13, 0, class80.field1889 - var12, null);
                        }
                    }
                    if (var22 && (arg1 & 0x8) != 0 && var11.field730 != null) {
                        class112.method853(var11, var11.field730, false, class138.field3298 - var13, 0, class80.field1889 - var12, null);
                    }
                    if (!var11.field725 && var20 && (arg1 & 0x10) != 0) {
                        var11.field725 = true;
                        if (var11.field770 != null) {
                            class112.method853(var11, var11.field770, false, class138.field3298 - var13, 0, class80.field1889 - var12, null);
                        }
                    }
                    if (var11.field725 && var20 && (arg1 & 0x40) != 0 && var11.field772 != null) {
                        class112.method853(var11, var11.field772, false, class138.field3298 - var13, 0, class80.field1889 - var12, null);
                    }
                    if (var11.field725 && !var20 && (arg1 & 0x20) != 0) {
                        var11.field725 = false;
                        if (var11.field786 != null) {
                            class112.method853(var11, var11.field786, false, class138.field3298 - var13, 0, class80.field1889 - var12, null);
                        }
                    }
                    if (var11.field710 != null && (arg1 & 0x80) != 0) {
                        class112.method853(var11, var11.field710, false, 0, 0, 0, null);
                    }
                    if (var20 && class1.field8 != 0 && var11.field789 != null && (arg1 & 0x400) != 0) {
                        class112.method853(var11, var11.field789, false, 0, 0, class1.field8, null);
                    }
                    if ((arg1 & 0x100) != 0) {
                        if (var11.field708 < class90.field2076 && var11.field775 != null) {
                            class112.method853(var11, var11.field775, false, 0, 0, 0, null);
                        }
                        if (class88.field2021 > var11.field708 && var11.field794 != null) {
                            class112.method853(var11, var11.field794, false, 0, 0, 0, null);
                        }
                        if (class112.field2568 > var11.field708 && var11.field695 != null) {
                            class112.method853(var11, var11.field695, false, 0, 0, 0, null);
                        }
                        var11.field708 = class135.field3243;
                    }
                }
            }
        }
    }
}
