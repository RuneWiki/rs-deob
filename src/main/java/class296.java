import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class296 extends class237 {

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "[B")
    public byte[] field4689;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "[Lk;")
    public static class221[] field4682 = new class221[29];

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4687 = "Loading fonts - ";

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "S")
    public static short field4681 = 32767;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Lra;")
    public static class38 field4688;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)Z")
    public static final boolean method1981(int arg0, int arg1) {
        if (arg0 == -24032) {
            field4677++;
            return arg1 >= 0 && arg1 < class297.field4698.length ? class297.field4698[arg1] : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lcg;BLjava/lang/Object;)V")
    public static final void method1982(class48 arg0, byte arg1, Object arg2) {
        field4678++;
        if (arg0.field616 == null || arg1 != -73) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field616.peekEvent() != null; var3++) {
            class115.method752((byte) -62, 1L);
        }
        if (arg2 != null) {
            arg0.field616.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)V")
    public static final void method1983(int arg0, int arg1, int arg2, int arg3) {
        field4685++;
        class233 var4 = class114.method746(arg1, 1228126432, 11);
        var4.method1651((byte) 121);
        var4.field3855 = arg0;
        if (arg2 == 11474) {
            var4.field3852 = arg3;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZBIII[Lwb;)V")
    public static final void method1984(boolean arg0, byte arg1, int arg2, int arg3, int arg4, class123[] arg5) {
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class123 var7 = arg5[var6];
            if (var7 != null && var7.field1911 == arg4) {
                class90.method492(arg0, var7, (byte) 117, arg2, arg3);
                class11.method55(arg3, var7, (byte) -86, arg2);
                if (var7.field1872 > var7.field1853 - var7.field1809) {
                    var7.field1872 = var7.field1853 - var7.field1809;
                }
                if (var7.field1770 - var7.field1879 < var7.field1835) {
                    var7.field1835 = var7.field1770 - var7.field1879;
                }
                if (var7.field1872 < 0) {
                    var7.field1872 = 0;
                }
                if (var7.field1835 < 0) {
                    var7.field1835 = 0;
                }
                if (var7.field1778 == 0) {
                    class21.method118((byte) -2, arg0, var7);
                }
            }
        }
        if (arg1 != -127) {
            field4688 = null;
        }
        field4684++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Loh;I)V")
    public static final void method1985(class156 arg0, int arg1) {
        field4683++;
        class70.method393(arg0, arg1, 1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1986(boolean arg0, String arg1) {
        field4686++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (!arg0) {
            method1985((class156) null, -45);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()V")
    public static final void method1987() {
        class162.field2576 = 0;
        label191: for (int var0 = 0; var0 < class286.field4564; var0++) {
            class61 var1 = class120.field1704[var0];
            if (class294.field4665 != null) {
                for (int var2 = 0; var2 < class294.field4665.length; var2++) {
                    if (class294.field4665[var2] != -1000000 && (var1.field801 <= class294.field4665[var2] || var1.field799 <= class294.field4665[var2]) && (var1.field775 <= class39.field482[var2] || var1.field807 <= class39.field482[var2]) && (var1.field775 >= class127.field2041[var2] || var1.field807 >= class127.field2041[var2]) && (var1.field789 <= class123.field1847[var2] || var1.field808 <= class123.field1847[var2]) && (var1.field789 >= class294.field4658[var2] || var1.field808 >= class294.field4658[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field809 == 1) {
                int var3 = var1.field793 + class194.field3111 - class259.field4198;
                if (var3 >= 0 && var3 <= class194.field3111 + class194.field3111) {
                    int var4 = var1.field779 + class194.field3111 - class99.field1326;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field791 + class194.field3111 - class99.field1326;
                    if (var5 > class194.field3111 + class194.field3111) {
                        var5 = class194.field3111 + class194.field3111;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class162.field2588[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class230.field3789 - var1.field775;
                        if (var7 > 32) {
                            var1.field804 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field804 = 2;
                            var7 = -var7;
                        }
                        var1.field788 = (var1.field789 - class236.field3909 << 8) / var7;
                        var1.field776 = (var1.field808 - class236.field3909 << 8) / var7;
                        var1.field778 = (var1.field801 - class57.field735 << 8) / var7;
                        var1.field774 = (var1.field799 - class57.field735 << 8) / var7;
                        class32.field425[class162.field2576++] = var1;
                    }
                }
            } else if (var1.field809 == 2) {
                int var8 = var1.field779 + class194.field3111 - class99.field1326;
                if (var8 >= 0 && var8 <= class194.field3111 + class194.field3111) {
                    int var9 = var1.field793 + class194.field3111 - class259.field4198;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field803 + class194.field3111 - class259.field4198;
                    if (var10 > class194.field3111 + class194.field3111) {
                        var10 = class194.field3111 + class194.field3111;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class162.field2588[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class236.field3909 - var1.field789;
                        if (var12 > 32) {
                            var1.field804 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field804 = 4;
                            var12 = -var12;
                        }
                        var1.field792 = (var1.field775 - class230.field3789 << 8) / var12;
                        var1.field798 = (var1.field807 - class230.field3789 << 8) / var12;
                        var1.field778 = (var1.field801 - class57.field735 << 8) / var12;
                        var1.field774 = (var1.field799 - class57.field735 << 8) / var12;
                        class32.field425[class162.field2576++] = var1;
                    }
                }
            } else if (var1.field809 == 4) {
                int var13 = var1.field801 - class57.field735;
                if (var13 > 128) {
                    int var14 = var1.field779 + class194.field3111 - class99.field1326;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field791 + class194.field3111 - class99.field1326;
                    if (var15 > class194.field3111 + class194.field3111) {
                        var15 = class194.field3111 + class194.field3111;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field793 + class194.field3111 - class259.field4198;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field803 + class194.field3111 - class259.field4198;
                        if (var17 > class194.field3111 + class194.field3111) {
                            var17 = class194.field3111 + class194.field3111;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class162.field2588[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field804 = 5;
                            var1.field792 = (var1.field775 - class230.field3789 << 8) / var13;
                            var1.field798 = (var1.field807 - class230.field3789 << 8) / var13;
                            var1.field788 = (var1.field789 - class236.field3909 << 8) / var13;
                            var1.field776 = (var1.field808 - class236.field3909 << 8) / var13;
                            class32.field425[class162.field2576++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
    public static void method1988(int arg0) {
        field4682 = null;
        field4688 = null;
        if (arg0 != 490) {
            field4688 = null;
        }
        field4687 = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "([B)V")
    public class296(byte[] arg0) {
        this.field4689 = arg0;
    }
}
