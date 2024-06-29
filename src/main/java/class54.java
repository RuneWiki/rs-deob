import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class54 {

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Lj;")
    private class165 field901 = new class165();

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    private int field900;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Llj;")
    private class25 field903;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lcf;")
    public static class93 field891 = class147.method1066("; Expires=", -48);

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
    public static boolean field894 = false;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lcf;")
    public static class93 field898 = class147.method1066("Jeter", -48);

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field905 = 0;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lcf;")
    public static class93 field893 = class147.method1066("Titelbild ge-Offnet)3", -48);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public final void method294(int arg0) {
        field902++;
        class196 var2 = (class196) this.field901.method1196(2);
        if (arg0 != 0) {
            return;
        }
        while (var2 != null) {
            if (var2.method80((byte) 47)) {
                var2.method1544((byte) -83);
                var2.method1728(arg0 ^ 0x6E09);
                this.field887++;
            }
            var2 = (class196) this.field901.method1200(9844);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)V")
    public final void method295(long arg0, int arg1) {
        class196 var4 = (class196) this.field903.method135(arg0, true);
        if (var4 != null) {
            var4.method1544((byte) -74);
            var4.method1728(28169);
            this.field887++;
        }
        field890++;
        if (arg1 >= -125) {
            field891 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Lub;")
    public static final class89 method296(int arg0, int arg1) {
        field906++;
        class89 var2 = (class89) class220.field3983.method1852((long) arg1, (byte) -105);
        if (arg0 != 17057) {
            field889 = 78;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class79.field1470.method1271(26, -2154, arg1);
        class89 var4 = new class89();
        if (var3 != null) {
            var4.method620((byte) -89, new class280(var3));
        }
        class220.field3983.method1847(var4, 83, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method297(long arg0, Object arg1, int arg2) {
        field886++;
        this.method295(arg0, -126);
        if (arg2 != 10414) {
            return;
        }
        if (this.field887 == 0) {
            class196 var5 = (class196) this.field901.method1195((byte) 69);
            var5.method1544((byte) -58);
            var5.method1728(28169);
        } else {
            this.field887--;
        }
        class218 var6 = new class218(arg1);
        this.field903.method137(arg0, var6, -1);
        this.field901.method1190(64, var6);
        var6.field4598 = 0L;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V")
    public final void method298(boolean arg0, int arg1) {
        if (class66.field1212 != null) {
            for (class196 var3 = (class196) this.field901.method1196(2); var3 != null; var3 = (class196) this.field901.method1200(9844)) {
                if (var3.method80((byte) 47)) {
                    if (var3.method79(-2) == null) {
                        var3.method1544((byte) -74);
                        var3.method1728(28169);
                        this.field887++;
                    }
                } else if (((long) arg1) < (++var3.field4598)) {
                    class196 var4 = class66.field1212.method1532(96, var3);
                    this.field903.method137(var3.field4006, var4, -1);
                    class153.method1097(var3, var4, 2);
                    var3.method1544((byte) -32);
                    var3.method1728(28169);
                }
            }
        }
        field885++;
        if (!arg0) {
            this.field887 = -125;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)I")
    public final int method299(byte arg0) {
        field899++;
        int var2 = 0;
        for (class196 var3 = (class196) this.field901.method1196(2); var3 != null; var3 = (class196) this.field901.method1200(9844)) {
            if (!var3.method80((byte) 47)) {
                var2++;
            }
        }
        if (arg0 <= 25) {
            this.field901 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public final void method300(int arg0) {
        this.field901.method1191(-27254);
        field904++;
        this.field903.method139(arg0);
        this.field887 = this.field900;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[I[ILui;[I)V")
    public static final void method301(int arg0, int[] arg1, int[] arg2, class227 arg3, int[] arg4) {
        field892++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field3775.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field3775[var9] = null;
                    } else {
                        class31 var10 = class131.method964(var6, true);
                        int var11 = var10.field471;
                        class208 var12 = arg3.field3775[var9];
                        if (var12 != null) {
                            if (var12.field3729 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field3775[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3720 = var8;
                                    var12.field3719 = 0;
                                    var12.field3723 = 0;
                                    var12.field3724 = 0;
                                    var12.field3730 = 1;
                                    class55.method309(arg3.field3784, 0, var10, arg3.field3868, -17474, false);
                                } else if (var11 == 2) {
                                    var12.field3723 = 0;
                                }
                            } else if (var10.field475 >= class131.method964(var12.field3729, true).field475) {
                                var12 = arg3.field3775[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class208 var13 = arg3.field3775[var9] = new class208();
                            var13.field3723 = 0;
                            var13.field3730 = 1;
                            var13.field3724 = 0;
                            var13.field3720 = var8;
                            var13.field3729 = var6;
                            var13.field3719 = 0;
                            class55.method309(arg3.field3784, 0, var10, arg3.field3868, arg0 - 34969, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg0 != 17495) {
            field891 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method302(long arg0, int arg1) {
        field895++;
        if (arg1 != 0) {
            field891 = null;
        }
        class196 var4 = (class196) this.field903.method135(arg0, true);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method79(-2);
        if (var5 == null) {
            var4.method1544((byte) -45);
            var4.method1728(28169);
            this.field887++;
            return null;
        }
        if (var4.method80((byte) 47)) {
            class218 var6 = new class218(var5);
            this.field903.method137(var4.field4006, var6, ~arg1);
            this.field901.method1190(64, var6);
            var6.field4598 = 0L;
            var4.method1544((byte) -30);
            var4.method1728(arg1 ^ 0x6E09);
        } else {
            this.field901.method1190(64, var4);
            var4.field4598 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
    public static final void method303(byte arg0) {
        field897++;
        if (arg0 >= -113) {
            method304(-118);
        }
        while (class250.field4504.method1565(class72.field1300, -117336381) >= 27) {
            int var1 = class250.field4504.method1569(false, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class155.field2709[var1] == null) {
                var2 = true;
                class155.field2709[var1] = new class227();
            }
            class227 var3 = class155.field2709[var1];
            class58.field995[class72.field1299++] = var1;
            var3.field3793 = class275.field4921;
            if (var3.field4062 != null && var3.field4062.method1048(-8442)) {
                class213.method1505(-1, var3);
            }
            var3.method1561(class5.method19((byte) -59, class250.field4504.method1569(false, 14)), 14579);
            int var4 = class143.field2478[class250.field4504.method1569(false, 3)];
            if (var2) {
                var3.field3770 = var3.field3807 = var4;
            }
            int var5 = class250.field4504.method1569(false, 5);
            int var6 = class250.field4504.method1569(false, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class250.field4504.method1569(false, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var7 == 1) {
                class264.field4708[class138.field2407++] = var1;
            }
            int var8 = class250.field4504.method1569(false, 1);
            var3.method1479(var3.field4062.field2504, -1);
            var3.field3861 = var3.field4062.field2533;
            var3.field3791 = var3.field4062.field2514;
            if (var3.field3791 == 0) {
                var3.field3807 = 0;
            }
            var3.method1482(7, class166.field2927.field3805[0] + var5, class166.field2927.field3820[0] + var6, var8 == 1, var3.method1475(false));
            if (var3.field4062.method1048(-8442)) {
                class159.method1146((class237) null, var3, (class240) null, (byte) -123, var3.field3820[0], class138.field2405, 0, var3.field3805[0]);
            }
        }
        class250.field4504.method1571(119);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
    public static void method304(int arg0) {
        field893 = null;
        if (arg0 >= 55) {
            field898 = null;
            field891 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V")
    public class54(int arg0) {
        this.field887 = arg0;
        this.field900 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field903 = new class25(var2);
    }
}
