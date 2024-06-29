import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class33 extends class265 {

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "Loe;")
    public static class127 field537 = null;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "Lwm;")
    public static class152 field540 = class157.method1048("Mem:", 103);

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "Z")
    public static boolean field539 = true;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "Lwm;")
    public static class152 field547 = class157.method1048("Utiliser", 125);

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "Lah;")
    public static class205 field541;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "[Lbg;")
    public static class203[] field543;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V", line = 5)
    public final void method243(int arg0, int arg1, int arg2) {
        field546++;
        int var4 = this.field542 * arg0 >> 12;
        int var5 = this.field552 * arg1 >> 12;
        int var6 = this.field549 * arg0 >> 12;
        if (arg2 <= -113) {
            int var7 = this.field548 * arg1 >> 12;
            class18.method115((byte) -97, var6, var5, var4, var7, this.field4474);
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 29)
    public static final void method244(int arg0) {
        field551++;
        if (class23.field399 == null) {
            return;
        }
        if (class37.field616 < arg0) {
            if (!class48.field754.method1359(-2, class23.field399.field5328)) {
                class37.field616 = class141.field2172.method1362((byte) 84, class23.field399.field5328) / 10;
                return;
            }
            class77.method508(60);
            class37.field616 = 10;
        }
        if (class37.field616 == 10) {
            if (class23.field399.field5330 == 37) {
                class41.field660 = 3.0F;
                class213.field3484 = 3.0F;
            } else if (class23.field399.field5330 == 50) {
                class41.field660 = 4.0F;
                class213.field3484 = 4.0F;
            } else if (class23.field399.field5330 == 75) {
                class41.field660 = 6.0F;
                class213.field3484 = 6.0F;
            } else if (class23.field399.field5330 == 100) {
                class41.field660 = 8.0F;
                class213.field3484 = 8.0F;
            } else if (class23.field399.field5330 == 200) {
                class41.field660 = 16.0F;
                class213.field3484 = 16.0F;
            } else {
                class41.field660 = 8.0F;
                class213.field3484 = 8.0F;
            }
            class252.field4335 = class23.field399.field5315 >> 6 << 6;
            int var1 = (class85.field1176.field4162 >> 7) + class272.field4670 - class252.field4335;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            class239.field3921 = (class23.field399.field5336 >> 6 << 6) + 64 - class252.field4335;
            class197.field3160 = class23.field399.field5319 >> 6 << 6;
            class26.field446 = (class23.field399.field5316 >> 6 << 6) + 64 - class197.field3160;
            int var3 = class197.field3160 + class26.field446 - class199.field3226 - (class85.field1176.field4231 >> 7) - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && class239.field3921 > var2 && var4 >= 0 && var4 < class26.field446) {
                class146.field2244 = var2;
                class84.field1158 = var4;
            } else {
                class146.field2244 = class23.field399.field5339 * 64 - class252.field4335;
                class84.field1158 = class197.field3160 + class26.field446 - class23.field399.field5323 * 64 - 1;
            }
            class79.method521((byte) -118);
            int var5 = class237.field3880 >> 2 << 10;
            int var6 = class26.field446 >> 6;
            int var7 = class239.field3921 >> 6;
            class232.field3792 = new byte[var7][var6][];
            class39.field643 = new int[var7][var6][];
            class317.field5497 = new int[var7][var6][];
            class2.field41 = new byte[var7][var6][];
            class69.field1005 = new byte[var7][var6][];
            class291.field4981 = new byte[var7][var6][];
            class86.field1213 = new int[var7][var6][];
            int var8 = class282.field4804 >> 1;
            class156.field2487 = new byte[var7][var6][];
            class322.field5630 = new int[class297.field5076 + 1];
            class9.method43(var5, arg0 + 96, var8);
            class37.field616 = 20;
        } else if (class37.field616 == 20) {
            class205.method1360(new class291(class48.field754.method1355(arg0 + 71, class23.field399.field5328, class179.field2851)), false);
            class37.field616 = 30;
            class8.method41(true, (byte) 33);
            class204.method1346(arg0 - 4873);
        } else if (class37.field616 == 30) {
            class51.method351(-19852, new class291(class48.field754.method1355(arg0 ^ -74, class23.field399.field5328, class114.field1622)));
            class37.field616 = 40;
            class204.method1346(-4863);
        } else if (class37.field616 == 40) {
            class194.method1298(-63, new class291(class48.field754.method1355(arg0 + 49, class23.field399.field5328, class37.field602)));
            class37.field616 = 50;
            class204.method1346(-4863);
        } else if (class37.field616 == 50) {
            class251.method1732(-16268, new class291(class48.field754.method1355(arg0 - 77, class23.field399.field5328, class116.field1646)));
            class37.field616 = 60;
            class8.method41(true, (byte) 75);
            class204.method1346(-4863);
        } else if (class37.field616 == 60) {
            if (class48.field754.method1364(true, class195.method1307(new class152[] { class23.field399.field5328, class272.field4644 }, (byte) 29))) {
                if (!class48.field754.method1359(-2, class195.method1307(new class152[] { class23.field399.field5328, class272.field4644 }, (byte) 29))) {
                    return;
                }
                class194.field3086 = class148.method935((byte) -60, class48.field754, class195.method1307(new class152[] { class23.field399.field5328, class272.field4644 }, (byte) 29));
            } else {
                class194.field3086 = new class279(0);
            }
            class37.field616 = 70;
            class204.method1346(-4863);
        } else if (class37.field616 == 70) {
            class156.field2486 = new class209(11, true, class224.field3648);
            class37.field616 = 73;
            class8.method41(true, (byte) 92);
            class204.method1346(-4863);
        } else if (class37.field616 == 73) {
            class216.field3512 = new class209(12, true, class224.field3648);
            class37.field616 = 76;
            class8.method41(true, (byte) 100);
            class204.method1346(arg0 - 4873);
        } else if (class37.field616 == 76) {
            class160.field2559 = new class209(14, true, class224.field3648);
            class37.field616 = 79;
            class8.method41(true, (byte) 35);
            class204.method1346(arg0 ^ 0xFFFFED0B);
        } else if (class37.field616 == 79) {
            class134.field2052 = new class209(17, true, class224.field3648);
            class37.field616 = 82;
            class8.method41(true, (byte) 59);
            class204.method1346(arg0 - 4873);
        } else if (class37.field616 == 82) {
            class267.field4504 = new class209(19, true, class224.field3648);
            class37.field616 = 85;
            class8.method41(true, (byte) 61);
            class204.method1346(-4863);
        } else if (class37.field616 == 85) {
            class66.field997 = new class209(22, true, class224.field3648);
            class37.field616 = 88;
            class8.method41(true, (byte) 102);
            class204.method1346(arg0 ^ 0xFFFFED0B);
        } else if (class37.field616 == 88) {
            class39.field641 = new class209(26, true, class224.field3648);
            class37.field616 = 91;
            class8.method41(true, (byte) 43);
            class204.method1346(-4863);
        } else {
            class27.field473 = new class209(30, true, class224.field3648);
            class37.field616 = 100;
            class8.method41(true, (byte) 116);
            class204.method1346(-4863);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 247)
    public static void method245(byte arg0) {
        field547 = null;
        if (arg0 != 49) {
            field541 = (class205) null;
        }
        field541 = null;
        field537 = null;
        field543 = null;
        field540 = null;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(IIIIIII)V", line = 268)
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field549 = arg2;
        this.field542 = arg0;
        this.field552 = arg1;
        this.field548 = arg3;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 290)
    public static final void method246(int arg0) {
        class26.field452 = 0;
        field550++;
        class238.field3912 = 0;
        class140.method879(arg0 ^ 0x30AA);
        class278.method1897((byte) -103);
        class79.method525((byte) -39);
        if (arg0 != -443) {
            return;
        }
        for (int var1 = 0; var1 < class26.field452; var1++) {
            int var2 = class305.field5243[var1];
            if (class142.field2187 != class40.field649[var2].field4251) {
                if (class40.field649[var2].field72.method1654(9193)) {
                    class288.method1936(4096, class40.field649[var2]);
                }
                class40.field649[var2].method15((class242) null, 0);
                class40.field649[var2] = null;
            }
        }
        if (class288.field4882 != class73.field1058.field4946) {
            throw new RuntimeException("gnp1 pos:" + class73.field1058.field4946 + " psize:" + class288.field4882);
        }
        for (int var3 = 0; var3 < class233.field3826; var3++) {
            if (class40.field649[class97.field1403[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class233.field3826);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(III)V", line = 343)
    public final void method247(int arg0, int arg1, int arg2) {
        field535++;
        int var4 = this.field542 * arg1 >> 12;
        if (arg2 < 86) {
            field536 = -13;
        }
        int var5 = this.field549 * arg1 >> 12;
        int var6 = this.field552 * arg0 >> 12;
        int var7 = this.field548 * arg0 >> 12;
        class244.method1677(this.field4466, this.field4472, var5, var4, var6, var7, 1);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BII)V", line = 362)
    public final void method248(byte arg0, int arg1, int arg2) {
        field545++;
        int var4 = this.field542 * arg2 >> 12;
        int var5 = this.field549 * arg2 >> 12;
        int var6 = 34 % ((arg0 - 22) / 52);
        int var7 = this.field548 * arg1 >> 12;
        int var8 = this.field552 * arg1 >> 12;
        class162.method1087(1, this.field4466, var8, var7, var4, this.field4472, this.field4474, var5);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILah;)[Leg;", line = 383)
    public static final class300[] method249(int arg0, int arg1, class205 arg2) {
        field538++;
        if (class52.method356((byte) 106, arg2, arg0)) {
            return arg1 == 0 ? class148.method936((byte) -128) : (class300[]) null;
        } else {
            return null;
        }
    }
}
