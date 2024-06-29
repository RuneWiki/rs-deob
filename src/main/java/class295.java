import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class295 {

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Lhu;")
    private class76 field3942 = new class76(128);

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "Lr;")
    private class110 field3940;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field3943 = -1;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Lmc;")
    public static class78 field3937 = new class78(43, 8);

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field3947 = 104;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field3946 = 0;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZIZIZ)V")
    public static final void method1654(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field3938++;
        if (!arg2 && class4.field60 == arg1 && class391.field5426 == arg3 && class373.field5104 == class160.field2220 || class488.field6789.method2415(-58, class222.field2958)) {
            return;
        }
        class160.field2220 = class373.field5104;
        class4.field60 = arg1;
        class391.field5426 = arg3;
        if (class488.field6789.method2415(110, class222.field2958)) {
            class160.field2220 = 0;
        }
        if (arg0) {
            class119.method746(28, (byte) -123);
        } else {
            class119.method746(25, (byte) 84);
        }
        class363.method2212(class284.field3828, arg4, class230.field3051.method1176(class110.field1676, (byte) -96), (byte) 98);
        int var5 = class162.field2260;
        class162.field2260 = (class4.field60 - (field3947 >> 4)) * 8;
        int var6 = class266.field3511;
        class266.field3511 = (class391.field5426 - (class39.field567 >> 4)) * 8;
        class491.field6859 = class55.method402(class4.field60 * 8, class391.field5426 * 8);
        class32.field485 = null;
        int var7 = class162.field2260 - var5;
        int var8 = class266.field3511 - var6;
        if (arg0) {
            class202.field2734 = 0;
            int var12 = (field3947 - 1) * 128;
            int var13 = (class39.field567 - 1) * 128;
            for (int var14 = 0; var14 < 32768; var14++) {
                class121 var19 = class221.field2941[var14];
                if (var19 != null) {
                    var19.field6501 -= var7 * 128;
                    var19.field6507 -= var8 * 128;
                    if (var19.field6501 >= 0 && var19.field6501 <= var12 && var19.field6507 >= 0 && var19.field6507 <= var13) {
                        boolean var20 = true;
                        for (int var21 = 0; var21 < 10; var21++) {
                            var19.field1193[var21] -= var7;
                            var19.field1197[var21] -= var8;
                            if (var19.field1193[var21] < 0 || field3947 <= var19.field1193[var21] || var19.field1197[var21] < 0 || var19.field1197[var21] >= class39.field567) {
                                var20 = false;
                            }
                        }
                        if (var20) {
                            class412.field5638[class202.field2734++] = var14;
                        } else {
                            class221.field2941[var14].method757((class429) null, 21748);
                            class221.field2941[var14] = null;
                        }
                    } else {
                        class221.field2941[var14].method757((class429) null, 21748);
                        class221.field2941[var14] = null;
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < 32768; var9++) {
                class121 var10 = class221.field2941[var9];
                if (var10 != null) {
                    for (int var11 = 0; var11 < 10; var11++) {
                        var10.field1193[var11] -= var7;
                        var10.field1197[var11] -= var8;
                    }
                    var10.field6507 -= var8 * 128;
                    var10.field6501 -= var7 * 128;
                }
            }
        }
        for (int var15 = 0; var15 < 2048; var15++) {
            class487 var17 = class413.field5644[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < 10; var18++) {
                    var17.field1193[var18] -= var7;
                    var17.field1197[var18] -= var8;
                }
                var17.field6507 -= var8 * 128;
                var17.field6501 -= var7 * 128;
            }
        }
        class112.method720((byte) -93, var8, var7);
        for (class363 var16 = (class363) class78.field1054.method652((byte) 37); var16 != null; var16 = (class363) class78.field1054.method653(8)) {
            var16.field4976 -= var7;
            var16.field4978 -= var8;
            if (var16.field4976 < 0 || var16.field4978 < 0 || var16.field4976 >= field3947 || var16.field4978 >= class39.field567) {
                var16.method2614((byte) -91);
            }
        }
        class134.field1963 = 0;
        if (class345.field4761 != 0) {
            class345.field4761 -= var7;
            class124.field1817 -= var8;
        }
        if (arg0) {
            class169.field2338 -= var7;
            class197.field2680 -= var7 * 128;
            class40.field576 -= var8;
            class412.field5637 -= var8 * 128;
            class225.field2972 -= var8;
            class153.field2148 -= var7;
            if (Math.abs(var7) > field3947 || Math.abs(var8) > class39.field567) {
                class23.method138(-58);
            }
        } else if (class56.field772 == 4) {
            class87.field1215 -= var7 * 128;
            class23.field306 -= var8 * 128;
            class186.field2560 -= var7 * 128;
            class36.field544 -= var8 * 128;
        } else {
            class56.field772 = 1;
        }
        class130.method798(8699);
        class321.method1777(-128);
        class450.field6124.method645(0);
        class177.field2403.method645(0);
        class367.field5048.method2765(-15597);
        class33.method251(0);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public final void method1655(int arg0) {
        field3945++;
        int var2 = 72 / ((arg0 + 46) / 62);
        class76 var3 = this.field3942;
        synchronized (this.field3942) {
            this.field3942.method502(0);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)V")
    public final void method1656(int arg0, byte arg1) {
        field3936++;
        class76 var3 = this.field3942;
        synchronized (this.field3942) {
            this.field3942.method496(arg0, -124);
            if (arg1 <= 16) {
                this.field3940 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public final void method1657(byte arg0) {
        class76 var2 = this.field3942;
        synchronized (this.field3942) {
            if (arg0 >= -114) {
                this.method1655(67);
            }
            this.field3942.method495(-112);
        }
        field3935++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Ltq;")
    public final class410 method1658(int arg0, int arg1) {
        field3939++;
        class76 var3 = this.field3942;
        class410 var4;
        synchronized (this.field3942) {
            var4 = (class410) this.field3942.method493((byte) 19, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3940.method702((byte) -126, arg1, arg0);
        class410 var6 = new class410();
        if (var5 != null) {
            var6.method2465(new class32(var5), -122);
        }
        class76 var7 = this.field3942;
        synchronized (this.field3942) {
            this.field3942.method505((long) arg1, var6, 77);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Ldn;ILr;)V")
    public class295(class329 arg0, int arg1, class110 arg2) {
        this.field3940 = arg2;
        this.field3940.method694(1, (byte) 119);
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V")
    public static void method1659(byte arg0) {
        field3937 = null;
        if (arg0 > -3) {
            method1659((byte) -18);
        }
    }
}
