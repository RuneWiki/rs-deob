import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 {

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Leb;")
    private class31 field2716 = new class31();

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lve;")
    private class151 field2720 = new class151();

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    private int field2723;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    private int field2722;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lmc;")
    private class86 field2727;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lid;")
    private static class60 field2715 = class11.method72("Loading sprites )2 ", (byte) 7);

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lid;")
    public static class60 field2721 = field2715;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field2719 = 0;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lie;")
    public static class61 field2713;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public static void method913(byte arg0) {
        field2715 = null;
        if (arg0 == -111) {
            field2721 = null;
            field2713 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Leb;JB)V")
    public final void method914(class31 arg0, long arg1, byte arg2) {
        if (this.field2723 == 0) {
            class31 var5 = this.field2720.method1150(false);
            var5.method1009((byte) 126);
            var5.method234(115);
            if (this.field2716 == var5) {
                class31 var6 = this.field2720.method1150(false);
                var6.method1009((byte) 77);
                var6.method234(100);
            }
        } else {
            this.field2723--;
        }
        this.field2727.method712(arg1, arg0, (byte) 99);
        if (arg2 < 41) {
            field2715 = null;
        }
        field2717++;
        this.field2720.method1147(-26819, arg0);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJ)V")
    public final void method915(int arg0, long arg1) {
        field2712++;
        if (arg0 > -57) {
            this.method920((byte) -56);
        }
        class31 var4 = (class31) this.field2727.method716((byte) 100, arg1);
        if (var4 != null) {
            var4.method1009((byte) 99);
            var4.method234(80);
            this.field2723++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILfd;Lid;)Lid;")
    public static final class60 method916(int arg0, class40 arg1, class60 arg2) {
        if (arg0 > -98) {
            field2721 = null;
        }
        field2725++;
        if (arg2.method446(class54.field1351, 0) == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method446(class42.field1125, 0);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method446(class11.field181, 0);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method446(class12.field227, 0);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method446(class81.field2006, 0);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method446(class38.field912, 0);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method446(class55.field1381, 0);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class60 var9 = class94.field2314;
                                                    if (class38.field920 != null) {
                                                        var9 = class54.method394(-30554, class38.field920.field3142);
                                                        try {
                                                            if (class38.field920.field3144 != null) {
                                                                byte[] var10 = ((String) class38.field920.field3144).getBytes("ISO-8859-1");
                                                                var9 = class56.method404(-117, var10.length, var10, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class104.method853(-89, new class60[] { arg2.method427(var8, -108, 0), var9, arg2.method421(var8 + 4, 0) });
                                                }
                                            }
                                            arg2 = class104.method853(-88, new class60[] { arg2.method427(var7, -52, 0), class78.method635(class101.method794(-29559, 4, arg1), (byte) 87), arg2.method421(var7 + 2, 0) });
                                        }
                                    }
                                    arg2 = class104.method853(-114, new class60[] { arg2.method427(var6, -96, 0), class78.method635(class101.method794(-29559, 3, arg1), (byte) -101), arg2.method421(var6 + 2, 0) });
                                }
                            }
                            arg2 = class104.method853(-81, new class60[] { arg2.method427(var5, -70, 0), class78.method635(class101.method794(-29559, 2, arg1), (byte) 99), arg2.method421(var5 + 2, 0) });
                        }
                    }
                    arg2 = class104.method853(-118, new class60[] { arg2.method427(var4, -71, 0), class78.method635(class101.method794(-29559, 1, arg1), (byte) 113), arg2.method421(var4 + 2, 0) });
                }
            }
            arg2 = class104.method853(-79, new class60[] { arg2.method427(var3, -63, 0), class78.method635(class101.method794(-29559, 0, arg1), (byte) 117), arg2.method421(var3 + 2, 0) });
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static final void method917(int arg0) {
        for (class144 var1 = (class144) class152.field3400.method496(10153); var1 != null; var1 = (class144) class152.field3400.method500(-1)) {
            if (var1.field3236 != null) {
                class33.field770.method1104(var1.field3236);
                var1.field3236 = null;
            }
            if (var1.field3249 != null) {
                class33.field770.method1104(var1.field3249);
                var1.field3249 = null;
            }
        }
        if (arg0 != 0) {
            method917(101);
        }
        field2714++;
        class152.field3400.method506((byte) 4);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IJ)Leb;")
    public final class31 method918(int arg0, long arg1) {
        class31 var4 = (class31) this.field2727.method716((byte) 125, arg1);
        field2718++;
        if (var4 != null) {
            this.field2720.method1147(-26819, var4);
        }
        int var5 = 26 / ((arg0 - 34) / 56);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static final void method919(int arg0) {
        class12.method79(-30833, class154.field3474);
        class74.field1781++;
        field2726++;
        if (class133.field3037 && class131.field2983) {
            if (arg0 > 114) {
                int var1 = class21.field494;
                int var2 = class43.field1153;
                int var3 = var1 - class8.field128;
                int var4 = var2 - class52.field1314;
                if (class87.field2184 > var3) {
                    var3 = class87.field2184;
                }
                if (class87.field2184 + class77.field1888.field1014 < class154.field3474.field1014 + var3) {
                    var3 = class87.field2184 + class77.field1888.field1014 - class154.field3474.field1014;
                }
                if (var4 < class9.field151) {
                    var4 = class9.field151;
                }
                if (class9.field151 + class77.field1888.field1038 < var4 - -class154.field3474.field1038) {
                    var4 = class9.field151 + class77.field1888.field1038 - class154.field3474.field1038;
                }
                int var5 = var4 - class75.field1814;
                int var6 = var3 - class151.field3389;
                int var7 = class154.field3474.field1058;
                if (class74.field1781 > class154.field3474.field965 && (var7 < var5 || -var7 > var5 || var7 < var6 || var6 < -var7)) {
                    class51.field1291 = true;
                }
                int var8 = class77.field1888.field1031 + var3 - class87.field2184;
                int var9 = var4 + class77.field1888.field996 - class9.field151;
                if (class154.field3474.field1040 != null && class51.field1291) {
                    class15 var10 = new class15();
                    var10.field353 = class154.field3474.field1040;
                    var10.field340 = var8;
                    var10.field342 = var9;
                    var10.field361 = class154.field3474;
                    class61.method467(false, var10);
                }
                if (class28.field672 == 0) {
                    if (class51.field1291) {
                        if (class154.field3474.field1034 != null) {
                            class15 var11 = new class15();
                            var11.field340 = var8;
                            var11.field339 = class10.field174;
                            var11.field361 = class154.field3474;
                            var11.field353 = class154.field3474.field1034;
                            var11.field342 = var9;
                            class61.method467(false, var11);
                        }
                        if (class10.field174 != null && class90.method736((byte) -127, class154.field3474) != null) {
                            class128.field2928++;
                            class22.field519.method1214(119, 0);
                            class22.field519.method837(class154.field3474.field1008, 8895);
                            class22.field519.method811(true, class10.field174.field949);
                            class22.field519.method837(class10.field174.field1008, 8895);
                            class22.field519.method811(true, class154.field3474.field949);
                        }
                    } else if ((class61.field1539 == 1 || class103.method842(1012065392, class80.field1956 - 1)) && class80.field1956 > 2) {
                        class12.method76(16215);
                    } else if (class80.field1956 > 0) {
                        class139.method1085(true, class80.field1956 - 1);
                    }
                    class154.field3474 = null;
                }
            }
        } else if (class74.field1781 > 1) {
            class154.field3474 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public final void method920(byte arg0) {
        while (true) {
            class31 var2 = this.field2720.method1150(false);
            if (var2 == null) {
                if (arg0 != 14) {
                    return;
                }
                this.field2723 = this.field2722;
                field2724++;
                return;
            }
            var2.method1009((byte) 57);
            var2.method234(41);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
    public class115(int arg0) {
        this.field2723 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2722 = arg0;
        this.field2727 = new class86(var2);
    }
}
