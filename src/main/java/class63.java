import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class63 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    private int field1121 = 0;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lwd;")
    private class97 field1120;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lw;")
    private class104 field1125;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Lng;")
    public static class121 field1119;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIII)V")
    public static final void method419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1123++;
        int var6 = arg5 - arg3;
        int var7 = arg4 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class37.method254(arg1, arg3, arg0, arg4, (byte) 52);
            }
        } else if (var7 == 0) {
            class167.method1126((byte) -122, arg0, arg1, arg5, arg3);
        } else {
            if (arg2 != 7185) {
                method423(-48, 17, -95, -124, 4, -89);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class37.field678 > arg5) {
                var11 = var9 + (class37.field678 * var8 >> 12);
                var10 = class37.field678;
            } else if (class207.field3680 < arg5) {
                var10 = class207.field3680;
                var11 = (class207.field3680 * var8 >> 12) + var9;
            } else {
                var10 = arg5;
                var11 = arg4;
            }
            int var12;
            int var13;
            if (arg3 < class37.field678) {
                var12 = class37.field678;
                var13 = (class37.field678 * var8 >> 12) + var9;
            } else if (arg3 <= class207.field3680) {
                var12 = arg3;
                var13 = arg0;
            } else {
                var12 = class207.field3680;
                var13 = var9 + (class207.field3680 * var8 >> 12);
            }
            if (class242.field4314 > var11) {
                var11 = class242.field4314;
                var10 = (class242.field4314 - var9 << 12) / var8;
            } else if (class99.field1584 < var11) {
                var11 = class99.field1584;
                var10 = (class99.field1584 - var9 << 12) / var8;
            }
            if (class242.field4314 > var13) {
                var12 = (class242.field4314 - var9 << 12) / var8;
                var13 = class242.field4314;
            } else if (var13 > class99.field1584) {
                var12 = (class99.field1584 - var9 << 12) / var8;
                var13 = class99.field1584;
            }
            class236.method1668(1, var10, var13, var11, arg1, var12);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)Lw;")
    public final class104 method420(int arg0) {
        field1127++;
        this.field1121 = arg0;
        return this.method421((byte) -108);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Lw;")
    public final class104 method421(byte arg0) {
        if (arg0 > -106) {
            return null;
        }
        field1124++;
        if (this.field1121 > 0 && this.field1120.field1560[this.field1121 - 1] != this.field1125) {
            class104 var2 = this.field1125;
            this.field1125 = var2.field1711;
            return var2;
        }
        while (this.field1120.field1561 > this.field1121) {
            class104 var3 = this.field1120.field1560[this.field1121++].field1711;
            if (this.field1120.field1560[this.field1121 - 1] != var3) {
                this.field1125 = var3.field1711;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public static final void method422(int arg0, int arg1) {
        class25.field362 = new int[arg1];
        if (arg0 != -671859316) {
            method424((class12) null);
        }
        class82.field1386 = new int[arg1];
        class223.field3976 = new int[arg1];
        class232.field4150 = new int[arg1];
        field1126++;
        class157.field2674 = new int[arg1];
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IIIIII)V")
    public static final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1122++;
        class97.field1550 = arg1;
        class70.field1236 = arg5;
        if (arg2 != -1) {
            method423(24, 80, 7, 2, -100, 104);
        }
        class56.field1033 = arg0;
        class164.field2774 = arg4;
        class224.field3990 = arg3;
        if (class224.field3990 >= 100) {
            int var6 = class97.field1550 * 128 + 64;
            int var7 = class164.field2774 * 128 + 64;
            int var8 = class222.method1546(class261.field4598, var6, var7, 247425607) - class56.field1033;
            int var9 = var6 - class137.field2306;
            int var10 = var7 - class244.field4353;
            int var11 = var8 - class229.field4116;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class170.field2876 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class81.field1371 = (int) (-325.949D * Math.atan2((double) var9, (double) var10)) & 0x7FF;
            if (class170.field2876 < 128) {
                class170.field2876 = 128;
            }
            if (class170.field2876 > 383) {
                class170.field2876 = 383;
            }
        }
        class243.field4345 = 2;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lo;)V")
    public static final void method424(class12 arg0) {
        for (int var1 = arg0.field152; var1 <= arg0.field146; var1++) {
            for (int var2 = arg0.field144; var2 <= arg0.field150; var2++) {
                class199 var3 = class201.field3608[arg0.field142][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3550; var4++) {
                        if (var3.field3549[var4] == arg0) {
                            var3.field3550--;
                            for (int var5 = var4; var5 < var3.field3550; var5++) {
                                var3.field3549[var5] = var3.field3549[var5 + 1];
                                var3.field3536[var5] = var3.field3536[var5 + 1];
                            }
                            var3.field3549[var3.field3550] = null;
                            break;
                        }
                    }
                    var3.field3542 = 0;
                    for (int var6 = 0; var6 < var3.field3550; var6++) {
                        var3.field3542 |= var3.field3536[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lwd;)V")
    public class63(class97 arg0) {
        this.field1120 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method425(int arg0) {
        if (arg0 != 128) {
            method425(99);
        }
        field1119 = null;
    }
}
