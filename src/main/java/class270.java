import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class270 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field4449;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public int field4455;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public int field4463;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lck;")
    public static class119 field4454 = class298.method1987((byte) 28, "<col=ff7000>");

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lck;")
    public static class119 field4457 = class298.method1987((byte) 70, "<)4col>");

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field4462 = 0;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lva;")
    public static class36 field4460;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLck;I)V", line = 13)
    public static final void method1790(boolean arg0, class119 arg1, int arg2) {
        field4451++;
        if (arg2 < 23) {
            method1792(true);
        }
        if (!arg0) {
            try {
                class237.field3811.getAppletContext().showDocument(arg1.method757(class237.field3811.getCodeBase(), (byte) -25), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class231.field3737) {
            try {
                class107.method693(new Object[] { arg1.method757(class237.field3811.getCodeBase(), (byte) -25).toString() }, (byte) -121, class220.field3533.field4664, "openjs");
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class237.field3811.getAppletContext().showDocument(arg1.method757(class237.field3811.getCodeBase(), (byte) -25), "_blank");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)J", line = 55)
    public static final long method1791(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        return var3 == null || var3.field1590 == null ? 0L : var3.field1590.field1617;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 64)
    public static void method1792(boolean arg0) {
        field4460 = null;
        field4454 = null;
        field4457 = null;
        if (!arg0) {
            field4462 = 21;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V", line = 77)
    public static final void method1793(int arg0, int arg1) {
        field4453++;
        if (arg0 == arg1 || !class247.method1609(30881, arg0)) {
            return;
        }
        class134[] var2 = class135.field2189[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class134 var4 = var2[var3];
            if (var4.field2091 != null) {
                class1 var5 = new class1();
                var5.field8 = var4;
                var5.field14 = var4.field2091;
                class20.method154(2000000, false, var5);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Llh;I)V", line = 120)
    public static final void method1794(class282 arg0, int arg1) {
        field4459++;
        class133 var2 = null;
        try {
            class275 var3 = arg0.method1882(8, "runescape");
            while (var3.field4496 == 0) {
                class232.method1493(1L, (byte) -51);
            }
            if (var3.field4496 == arg1) {
                var2 = (class133) var3.field4499;
                class3 var4 = class161.method1030((byte) 82);
                var2.method877(var4.field44, (byte) -36, var4.field101, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method879(13943);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 155)
    public static final void method1795(int arg0) {
        field4450++;
        class26.method194(class131.field2007, -63);
        class36.field521++;
        if (class94.field1447 && class154.field2463) {
            int var1 = class65.field1024;
            int var2 = var1 - class250.field4038;
            int var3 = class129.field1984;
            int var4 = var3 - class118.field1789;
            if (class142.field2269 > var2) {
                var2 = class142.field2269;
            }
            if (class131.field2007.field2057 + var2 > class142.field2269 - -class288.field4742.field2057) {
                var2 = class142.field2269 + class288.field4742.field2057 - class131.field2007.field2057;
            }
            if (var4 < class210.field3357) {
                var4 = class210.field3357;
            }
            int var5 = class288.field4742.field2169 + var2 - class142.field2269;
            int var6 = var2 - class196.field3134;
            if ((class210.field3357 + class288.field4742.field2180) < (class131.field2007.field2180 + var4)) {
                var4 = class288.field4742.field2180 + class210.field3357 - class131.field2007.field2180;
            }
            if (arg0 != 27359) {
                field4457 = (class119) null;
            }
            int var7 = var4 - class242.field3877;
            int var8 = class131.field2007.field2185;
            if (class131.field2007.field2177 < class36.field521 && (var7 > var8 || -var8 > var7 || var8 < var6 || -var8 > var6)) {
                class237.field3810 = true;
            }
            int var9 = class288.field4742.field2173 + var4 - class210.field3357;
            if (class131.field2007.field2140 != null && class237.field3810) {
                class1 var10 = new class1();
                var10.field10 = var5;
                var10.field11 = var9;
                var10.field14 = class131.field2007.field2140;
                var10.field8 = class131.field2007;
                class184.method1170(var10, 125);
            }
            if (class272.field4475 == 0) {
                if (class237.field3810) {
                    if (class131.field2007.field2111 != null) {
                        class1 var11 = new class1();
                        var11.field6 = class292.field4855;
                        var11.field11 = var9;
                        var11.field14 = class131.field2007.field2111;
                        var11.field10 = var5;
                        var11.field8 = class131.field2007;
                        class184.method1170(var11, arg0 ^ 0x6AA2);
                    }
                    if (class292.field4855 != null && client.method623(class131.field2007) != null) {
                        class298.field5026++;
                        class6.field149.method966(0, 160);
                        class6.field149.method67((byte) 72, class292.field4855.field2120);
                        class6.field149.method72(-2031558584, class292.field4855.field2138);
                        class6.field149.method51(-14912, class131.field2007.field2138);
                        class6.field149.method56(class131.field2007.field2120, (byte) -56);
                    }
                } else if ((class238.field3815 == 1 || class293.method1948(true, class272.field4474 - 1)) && class272.field4474 > 2) {
                    class261.method1674(32);
                } else if (class272.field4474 > 0) {
                    class55.method406(false, class272.field4474 - 1);
                }
                class131.field2007 = null;
            }
        } else if (class36.field521 > 1) {
            class131.field2007 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIJ)Z", line = 279)
    public static final boolean method1796(int arg0, int arg1, int arg2, long arg3) {
        class104 var5 = class150.field2390[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1593 != null && var5.field1593.field2341 == arg3) {
            return true;
        } else if (var5.field1590 != null && var5.field1590.field1617 == arg3) {
            return true;
        } else if (var5.field1598 != null && var5.field1598.field3175 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1596; var6++) {
                if (var5.field1610[var6].field3130 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 323)
    public class270() {
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lag;)V", line = 325)
    public class270(class270 arg0) {
        this.field4449 = arg0.field4449;
        this.field4455 = arg0.field4455;
        this.field4463 = arg0.field4463;
        this.field4456 = arg0.field4456;
    }
}
