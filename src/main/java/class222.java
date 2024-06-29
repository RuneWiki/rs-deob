import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class222 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Ld;")
    private class242 field3394 = new class242(64);

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Ld;")
    private class242 field3401 = new class242(100);

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lum;")
    private class83 field3400;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Ljp;")
    public static class55 field3392 = new class55(12, 16);

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Ljp;")
    public static class55 field3397 = new class55(93, 6);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public final void method1535(int arg0) {
        if (arg0 != 16) {
            method1537(99);
        }
        field3396++;
        class242 var2 = this.field3394;
        synchronized (this.field3394) {
            this.field3394.method1637((byte) 13);
        }
        class242 var3 = this.field3401;
        synchronized (this.field3401) {
            this.field3401.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public final void method1536(int arg0, int arg1) {
        field3399++;
        class242 var3 = this.field3394;
        synchronized (this.field3394) {
            this.field3394.method1631(arg0, (byte) -19);
        }
        class242 var4 = this.field3401;
        synchronized (this.field3401) {
            this.field3401.method1631(arg0, (byte) -19);
            if (arg1 != 99999999) {
                this.field3400 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static void method1537(int arg0) {
        field3392 = null;
        field3397 = null;
        if (arg0 != 6) {
            field3398 = 13;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Lkt;")
    public final class61 method1538(int arg0, int arg1) {
        field3391++;
        class242 var3 = this.field3394;
        class61 var4;
        synchronized (this.field3394) {
            var4 = (class61) this.field3394.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field3400;
        byte[] var6;
        synchronized (this.field3400) {
            var6 = this.field3400.method731(arg0 ^ arg0, class178.method1262((byte) -90, arg1), class470.method2851(-17453, arg1));
        }
        class61 var7 = new class61();
        var7.field953 = arg1;
        var7.field950 = this;
        if (var6 != null) {
            var7.method412(new class194(var6), -79);
        }
        var7.method405((byte) -115);
        class242 var8 = this.field3394;
        synchronized (this.field3394) {
            this.field3394.method1623((long) arg1, arg0 + 21652, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public final void method1539(int arg0) {
        field3395++;
        class242 var2 = this.field3394;
        synchronized (this.field3394) {
            if (arg0 > -61) {
                return;
            }
            this.field3394.method1630(-13);
        }
        class242 var3 = this.field3401;
        synchronized (this.field3401) {
            this.field3401.method1630(-61);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method1540(byte arg0) {
        class73.field1248.method502(((float) class40.field667.field4207 * 0.1F + 0.7F) * class22.field251);
        if (arg0 != 87) {
            method1537(59);
        }
        field3390++;
        class73.field1248.method596(class342.field5115, class68.field1088, class138.field2093, (float) (class201.field3107 << 0), (float) (class35.field418 << 0), (float) (class58.field886 << 0));
        class73.field1248.method526(class172.field2666);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;BJZ)V")
    public static final void method1541(String arg0, byte arg1, long arg2, boolean arg3) {
        field3393++;
        if (arg3) {
            class525.method3122(82);
            if (class420.field6173.equals("")) {
                class336.field5062 = 39;
                return;
            }
        }
        class194 var5 = new class194(128);
        var5.method1381(10, (byte) 87);
        var5.method1364((int) (Math.random() * 65535.0D), true);
        var5.method1385(arg2, (byte) -124);
        var5.method1364(class516.field7505, true);
        var5.method1348((byte) -65, (int) (Math.random() * 9.9999999E7D));
        var5.method1343(arg0, (byte) -14);
        var5.method1348((byte) -65, (int) (Math.random() * 9.9999999E7D));
        if (arg3) {
            var5.method1385(class279.method1891(113, class420.field6173), (byte) -99);
            try {
                var5.method1385(Long.parseLong(class112.field1671), (byte) -99);
            } catch (Exception var6) {
                class336.field5062 = 39;
                return;
            }
        } else {
            var5.method1348((byte) -65, (int) (Math.random() * 9.9999999E7D));
            var5.method1348((byte) -65, (int) (Math.random() * 9.9999999E7D));
            var5.method1348((byte) -65, (int) (Math.random() * 9.9999999E7D));
            var5.method1348((byte) -65, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method1348((byte) -65, (int) (Math.random() * 9.9999999E7D));
        var5.method1387(class337.field5070, class376.field5544, arg1 + 34);
        class312.field4752.field2982 = 0;
        class312.field4752.method1381(arg3 ? class491.field7197.field7746 : class491.field7194.field7746, (byte) 95);
        class312.field4752.method1364(var5.field2982 + 28, true);
        class312.field4752.method1364(602, true);
        class312.field4752.method1381(class345.field5141, (byte) 127);
        class312.field4752.method1381(class401.field5923.field4704, (byte) 95);
        class369.method2344(class312.field4752, (byte) -116);
        class312.field4752.method1355(var5.field2982, (byte) 76, 0, var5.field2973);
        class259.field4152 = 1;
        class448.field6648 = 0;
        if (arg1 == 37) {
            class336.field5062 = -3;
            class327.field4949 = 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)Lgo;")
    public final class313 method1542(int arg0, int arg1) {
        field3389++;
        class242 var3 = this.field3401;
        class313 var5;
        synchronized (this.field3401) {
            if (arg0 != 0) {
                return null;
            }
            var5 = (class313) this.field3401.method1634((long) arg1, arg0 ^ 0x40);
            if (var5 == null) {
                var5 = new class313(arg1);
                this.field3401.method1623((long) arg1, 17621, var5);
            }
        }
        synchronized (var5) {
            return var5.method2076((byte) -18) ? var5 : null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lpt;ILum;Lum;Lum;)V")
    public class222(class308 arg0, int arg1, class83 arg2, class83 arg3, class83 arg4) {
        this.field3400 = arg2;
        if (this.field3400 != null) {
            int var6 = this.field3400.method754(false) - 1;
            this.field3400.method748(var6, 12408);
        }
        class460.method2823(-59, arg4, arg3);
    }
}
