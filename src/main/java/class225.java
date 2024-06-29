import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class225 extends class312 {

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "Ljava/lang/String;")
    private String field3591 = "null";

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "[[B")
    public static byte[][] field3588 = new byte[1000][];

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "C")
    public char field3594;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "C")
    public char field3599;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
    private int field3600;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!dn", name = "Q", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "Ljf;")
    private class227 field3587;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "Ljf;")
    public class227 field3602;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "Lwf;")
    public static class306 field3590;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V", line = 6)
    private final void method1528(byte arg0) {
        int var2 = 97 / ((arg0 + 40) / 33);
        field3598++;
        this.field3587 = new class227(this.field3602.method1552(true));
        for (class27 var3 = (class27) this.field3602.method1549((byte) -61); var3 != null; var3 = (class27) this.field3602.method1546(-1)) {
            class27 var4 = new class27((int) var3.field2852);
            this.field3587.method1550(var4, (long) var3.field344, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I", line = 27)
    public final int method1529(int arg0, int arg1) {
        field3596++;
        if (this.field3602 == null) {
            return this.field3600;
        }
        class27 var3 = (class27) this.field3602.method1558((long) arg1, false);
        if (var3 == null) {
            return this.field3600;
        } else if (arg0 == 10) {
            return var3.field344;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)V", line = 49)
    private final void method1530(byte arg0) {
        field3585++;
        this.field3587 = new class227(this.field3602.method1552(true));
        for (class139 var2 = (class139) this.field3602.method1549((byte) 89); var2 != null; var2 = (class139) this.field3602.method1546(arg0 ^ 0xFFFFFFC1)) {
            class129 var3 = new class129(var2.field2151, (int) var2.field2852);
            this.field3587.method1550(var3, class151.method1062((byte) -92, var2.field2151), (byte) 73);
        }
        if (arg0 != 62) {
            this.field3600 = -116;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)Z", line = 76)
    public final boolean method1531(int arg0, int arg1) {
        field3601++;
        if (this.field3602 == null) {
            return false;
        }
        if (this.field3587 == null) {
            this.method1528((byte) -125);
        }
        class27 var3 = (class27) this.field3587.method1558((long) arg1, false);
        if (arg0 == 22292) {
            return var3 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[[III)I", line = 106)
    public static final int method1532(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
        if (arg5 == 10) {
            field3589++;
            int var6 = (128 - arg0) * arg3[arg4][arg2 + 1] + (arg3[arg4 + 1][arg2 + 1] * arg0) >> 7;
            int var7 = (128 - arg0) * arg3[arg4][arg2] + arg3[arg4 + 1][arg2] * arg0 >> 7;
            return (128 - arg1) * var7 + arg1 * var6 >> 7;
        } else {
            return 46;
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V", line = 124)
    public static final void method1533(byte arg0) {
        field3593++;
        if (class205.field3110 == null) {
            return;
        }
        if (class74.field1109 < 10) {
            if (!class96.field1469.method2108(class205.field3110.field3021, 0)) {
                class74.field1109 = class2.field13.method2085(-1, class205.field3110.field3021) / 10;
                return;
            }
            class307.method2115((byte) 117);
            class74.field1109 = 10;
        }
        if (class74.field1109 == 10) {
            class338.field5233 = class205.field3110.field3012 >> 6 << 6;
            class129.field2021 = (class205.field3110.field3008 >> 6 << 6) + 64 - class338.field5233;
            class78.field1161 = class205.field3110.field3023 >> 6 << 6;
            class204.field3088 = (class205.field3110.field3007 >> 6 << 6) + 64 - class78.field1161;
            int[] var1 = class205.field3110.method1352((byte) 123, class30.field374 + (class79.field1173.field537 >> 7), class77.field1154, class294.field4535 + (class79.field1173.field519 >> 7));
            int var2 = -1;
            int var3 = -1;
            if (var1 != null) {
                var2 = var1[1] - class78.field1161;
                var3 = class338.field5233 + class129.field2021 - var1[2] - 1;
            }
            if (var2 >= 0 && class204.field3088 > var2 && var3 >= 0 && var3 < class129.field2021) {
                int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
                class342.field5334 = var4;
                int var5 = var2 + ((int) (Math.random() * 10.0D) - 5);
                class129.field2023 = var5;
            } else if (class148.field2348 == -1 || class116.field1796 == -1) {
                int[] var7 = class205.field3110.method1350((class205.field3110.field3003 & 0xFFFDA55) >> 14, class205.field3110.field3003 & 0x3FFF, (byte) -114);
                class342.field5334 = class338.field5233 + class129.field2021 - var7[2] - 1;
                class129.field2023 = var7[1] - class78.field1161;
            } else {
                int[] var6 = class205.field3110.method1350(class148.field2348, class116.field1796, (byte) -114);
                class116.field1796 = -1;
                class148.field2348 = -1;
                if (var6 != null) {
                    class129.field2023 = var6[1] - class78.field1161;
                    class342.field5334 = class129.field2021 + class338.field5233 - var6[2] - 1;
                }
            }
            if (class205.field3110.field3024 == 37) {
                class276.field4253 = 3.0F;
                class246.field3863 = 3.0F;
            } else if (class205.field3110.field3024 == 50) {
                class276.field4253 = 4.0F;
                class246.field3863 = 4.0F;
            } else if (class205.field3110.field3024 == 75) {
                class276.field4253 = 6.0F;
                class246.field3863 = 6.0F;
            } else if (class205.field3110.field3024 == 100) {
                class276.field4253 = 8.0F;
                class246.field3863 = 8.0F;
            } else if (class205.field3110.field3024 == 200) {
                class276.field4253 = 16.0F;
                class246.field3863 = 16.0F;
            } else {
                class276.field4253 = 8.0F;
                class246.field3863 = 8.0F;
            }
            class242.method1649(1);
            class157.field2461 = new int[class87.field1311 + 1];
            int var8 = class50.field708 >> 2 << 10;
            int var9 = class129.field2021 >> 6;
            int var10 = class204.field3088 >> 6;
            class128.field1993 = new int[var10][var9][];
            class164.field2525 = new byte[var10][var9][];
            class76.field1145 = new byte[var10][var9][];
            class34.field435 = new byte[var10][var9][];
            class163.field2519 = new int[var10][var9][];
            class165.field2548 = new int[var10][var9][];
            int var11 = class335.field5204 >> 1;
            class338.field5234 = new byte[var10][var9][];
            class94.field1445 = new byte[var10][var9][];
            class104.method711(var8, true, var11);
            class74.field1109 = 20;
        } else if (class74.field1109 == 20) {
            class277.method1821(64512, new class303(class96.field1469.method2097(class205.field3110.field3021, "underlay", (byte) 29)));
            class74.field1109 = 30;
            class133.method910(true, 0);
            class293.method1909(0);
        } else if (class74.field1109 == 30) {
            class173.method1173(new class303(class96.field1469.method2097(class205.field3110.field3021, "overlay", (byte) 29)), (byte) -40);
            class74.field1109 = 40;
            class293.method1909(0);
        } else if (class74.field1109 == 40) {
            class126.method843(new class303(class96.field1469.method2097(class205.field3110.field3021, "overlay2", (byte) 29)), 64);
            class74.field1109 = 50;
            class293.method1909(0);
        } else if (class74.field1109 == 50) {
            class208.method1400(8, new class303(class96.field1469.method2097(class205.field3110.field3021, "loc", (byte) 29)));
            class74.field1109 = 60;
            class133.method910(true, 0);
            class293.method1909(0);
        } else if (class74.field1109 == 60) {
            if (class96.field1469.method2101(class205.field3110.field3021 + "_labels", 0)) {
                if (!class96.field1469.method2108(class205.field3110.field3021 + "_labels", 0)) {
                    return;
                }
                class23.field293 = class110.method743(class205.field3110.field3021 + "_labels", class96.field1469, -109);
            } else {
                class23.field293 = new class121(0);
            }
            class74.field1109 = 70;
            class293.method1909(0);
        } else if (class74.field1109 == 70) {
            class310.field4910 = new class8(11, true, class302.field4665);
            class74.field1109 = 73;
            class133.method910(true, 0);
            class293.method1909(0);
        } else if (class74.field1109 == 73) {
            class152.field2400 = new class8(12, true, class302.field4665);
            class74.field1109 = 76;
            class133.method910(true, 0);
            class293.method1909(0);
        } else if (class74.field1109 == 76) {
            class312.field4937 = new class8(14, true, class302.field4665);
            class74.field1109 = 79;
            class133.method910(true, 0);
            class293.method1909(0);
        } else if (class74.field1109 == 79) {
            class22.field272 = new class8(17, true, class302.field4665);
            class74.field1109 = 82;
            class133.method910(true, 0);
            class293.method1909(0);
        } else if (class74.field1109 == 82) {
            class47.field672 = new class8(19, true, class302.field4665);
            class74.field1109 = 85;
            class133.method910(true, 0);
            class293.method1909(0);
        } else if (arg0 >= 84) {
            if (class74.field1109 == 85) {
                class305.field4777 = new class8(22, true, class302.field4665);
                class74.field1109 = 88;
                class133.method910(true, 0);
                class293.method1909(0);
            } else if (class74.field1109 == 88) {
                class288.field4405 = new class8(26, true, class302.field4665);
                class74.field1109 = 91;
                class133.method910(true, 0);
                class293.method1909(0);
            } else {
                class92.field1428 = new class8(30, true, class302.field4665);
                class74.field1109 = 100;
                class133.method910(true, 0);
                class293.method1909(0);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 370)
    public final boolean method1534(String arg0, int arg1) {
        field3604++;
        if (arg1 != 64) {
            field3588 = (byte[][]) ((byte[][]) null);
        }
        if (this.field3602 == null) {
            return false;
        }
        if (this.field3587 == null) {
            this.method1530((byte) 62);
        }
        for (class129 var3 = (class129) this.field3587.method1558(class151.method1062((byte) -92, arg0), false); var3 != null; var3 = (class129) this.field3587.method1554(0)) {
            if (var3.field2019.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILgn;I)V", line = 399)
    private final void method1535(int arg0, class303 arg1, int arg2) {
        field3603++;
        if (arg2 != 22) {
            this.field3591 = (String) null;
        }
        if (arg0 == 1) {
            this.field3599 = class152.method1064(0, arg1.method2001(-3));
        } else if (arg0 == 2) {
            this.field3594 = class152.method1064(0, arg1.method2001(arg2 - 25));
        } else if (arg0 == 3) {
            this.field3591 = arg1.method2027(0);
        } else if (arg0 == 4) {
            this.field3600 = arg1.method1996(arg2 - 110);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1994(false);
            this.field3602 = new class227(class47.method330((byte) -123, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1996(115);
                class187 var7;
                if (arg0 == 5) {
                    var7 = new class139(arg1.method2027(0));
                } else {
                    var7 = new class27(arg1.method1996(71));
                }
                this.field3602.method1550(var7, (long) var6, (byte) 88);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 455)
    public final String method1536(byte arg0, int arg1) {
        if (arg0 != -110) {
            return (String) null;
        }
        field3595++;
        if (this.field3602 == null) {
            return this.field3591;
        } else {
            class139 var3 = (class139) this.field3602.method1558((long) arg1, false);
            return var3 == null ? this.field3591 : var3.field2151;
        }
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(B)V", line = 475)
    public static void method1537(byte arg0) {
        field3588 = (byte[][]) null;
        if (arg0 != 99) {
            field3590 = (class306) null;
        }
        field3590 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZLgn;)V", line = 494)
    public final void method1538(boolean arg0, class303 arg1) {
        field3586++;
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method2043((byte) -108);
            if (var3 == 0) {
                return;
            }
            this.method1535(var3, arg1, 22);
        }
    }
}
