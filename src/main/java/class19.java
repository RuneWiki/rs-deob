import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class19 {

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    private int field306 = 32;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "J")
    private long field308 = class69.method535(true);

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "J")
    private long field315 = 0L;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "J")
    private long field317 = 0L;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "[Lcg;")
    private class38[] field319 = new class38[8];

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    private int field322 = 0;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    private int field320 = 0;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
    private int field316 = 0;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "[Lcg;")
    private class38[] field326 = new class38[8];

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    private int field325 = 0;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "Z")
    private boolean field328 = true;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "Lqd;")
    public static class40 field300 = class147.method1106(" loggt sich aus)3", (byte) -118);

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field313 = 0;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Li;")
    public static class207 field295 = new class207(5000);

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "[I")
    public static int[] field321 = new int[2];

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "Lee;")
    public static class271 field323;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Lcg;")
    private class38 field293;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "[I")
    public int[] field294;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()V", line = 10)
    public void method105() {
        field291++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IB)V", line = 17)
    private final void method106(int arg0, byte arg1) {
        field299++;
        this.field320 -= arg0;
        if (this.field320 < 0) {
            this.field320 = 0;
        }
        if (arg1 == -35 && this.field293 != null) {
            this.field293.method316(arg0);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILcg;)V", line = 37)
    public final synchronized void method107(int arg0, class38 arg1) {
        this.field293 = arg1;
        if (arg0 != 255) {
            method119(119, -65);
        }
        field310++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([II)V", line = 49)
    private final void method108(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class292.field4890) {
            var3 = arg1 << 1;
        }
        class234.method1626(arg0, 0, var3);
        this.field320 -= arg1;
        if (this.field293 != null && this.field320 <= 0) {
            this.field320 += class25.field448 >> 4;
            class31.method286(this.field293, (byte) -119);
            this.method121(this.field293.method318(), this.field293, 21937);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class38 var10 = null;
                        class38 var11 = this.field326[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class183 var12 = var11.field701;
                                if (var12 == null || var12.field2965 <= var8) {
                                    var11.field702 = true;
                                    int var13 = var11.method321();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2965 += var13;
                                    }
                                    if (var4 >= this.field306) {
                                        break label105;
                                    }
                                    class38 var14 = var11.method317();
                                    if (var14 != null) {
                                        int var15 = var11.field700;
                                        while (var14 != null) {
                                            this.method121(var15 * var14.method318() >> 8, var14, 21937);
                                            var14 = var11.method320();
                                        }
                                    }
                                    class38 var16 = var11.field703;
                                    var11.field703 = null;
                                    if (var10 == null) {
                                        this.field326[var7] = var16;
                                    } else {
                                        var10.field703 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field319[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field703;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class38 var18 = this.field326[var17];
                this.field326[var17] = this.field319[var17] = null;
                while (var18 != null) {
                    class38 var19 = var18.field703;
                    var18.field703 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field320 < 0) {
            this.field320 = 0;
        }
        if (this.field293 != null) {
            this.field293.method319(arg0, 0, arg1);
        }
        this.field308 = class69.method535(true);
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "()V", line = 213)
    public void method109() throws Exception {
        field289++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 221)
    public void method110(int arg0) throws Exception {
        field302++;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 235)
    public final void method111(int arg0) {
        field301++;
        this.field328 = true;
        if (arg0 != 5000) {
            this.field327 = -105;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 250)
    public static final void method112(boolean arg0) {
        class312.field5261 = (byte[][][]) null;
        class237.field3894 = null;
        class120.field2038 = null;
        class80.field1399 = (byte[][][]) null;
        class89.field1609 = (byte[][][]) null;
        class194.field3122 = null;
        field307++;
        class252.field4178 = null;
        class104.field1845 = (byte[][][]) null;
        class235.field3853 = null;
        class205.field3270 = (byte[][][]) null;
        if (!arg0) {
            field323 = (class271) null;
        }
        class252.field4188 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 278)
    public final synchronized void method113(int arg0) {
        field304++;
        this.field328 = true;
        if (arg0 != 2000) {
            this.field317 = -69L;
        }
        try {
            this.method109();
        } catch (Exception var3) {
            this.method105();
            this.field315 = class69.method535(true) + 2000L;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 301)
    public static final void method114(byte arg0) {
        if (arg0 != -25) {
            method118(-18, -1, 125);
        }
        for (class297 var1 = (class297) class165.field2731.method1400(arg0 + 24); var1 != null; var1 = (class297) class165.field2731.method1403(arg0 ^ 0x3B)) {
            int var2 = var1.field4959;
            if (class255.method1799(var2, false)) {
                boolean var3 = true;
                class213[] var4 = class44.field845[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3520;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field5149;
                    class213 var7 = class314.method2172((byte) 37, var6);
                    if (var7 != null) {
                        class25.method188(0, var7);
                    }
                }
            }
        }
        field303++;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IB)Ljg;", line = 361)
    public static final class290 method115(int arg0, byte arg1) {
        field309++;
        class290 var2 = (class290) class104.field1830.method984(arg1 - 69, (long) arg0);
        if (arg1 != 69) {
            field323 = (class271) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class300.field5028.method1651(11, arg0, -1);
        class290 var4 = new class290();
        if (var3 != null) {
            var4.method2001(new class26(var3), 94);
        }
        class104.field1830.method982(var4, (long) arg0, (byte) 79);
        return var4;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V", line = 384)
    public final synchronized void method116(byte arg0) {
        if (arg0 != 107) {
            return;
        }
        if (field323 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (field323.field4512[var3] == this) {
                    field323.field4512[var3] = null;
                }
                if (field323.field4512[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                field323.field4511 = true;
                while (field323.field4507) {
                    class160.method1227(50L, false);
                }
                field323 = null;
            }
        }
        field312++;
        this.method105();
        this.field294 = null;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V", line = 434)
    public final synchronized void method117(int arg0) {
        field311++;
        if (arg0 >= -116) {
            this.method111(114);
        }
        if (this.field294 == null) {
            return;
        }
        long var2 = class69.method535(true);
        try {
            if (this.field315 != 0L) {
                if (this.field315 > var2) {
                    return;
                }
                this.method110(this.field318);
                this.field315 = 0L;
                this.field328 = true;
            }
            int var4 = this.method123();
            if (this.field322 < (this.field316 - var4)) {
                this.field322 = this.field316 - var4;
            }
            int var5 = this.field327 + this.field314;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field318 < var5 + 256) {
                var4 = 0;
                this.field318 += 1024;
                if (this.field318 > 16384) {
                    this.field318 = 16384;
                }
                this.method105();
                this.method110(this.field318);
                this.field328 = true;
                if (this.field318 < (var5 + 256)) {
                    var5 = this.field318 - 256;
                    this.field314 = var5 - this.field327;
                }
            }
            while (var5 > var4) {
                this.method108(this.field294, 256);
                var4 += 256;
                this.method120();
            }
            if (this.field317 < var2) {
                if (this.field328) {
                    this.field328 = false;
                } else if (this.field322 == 0 && this.field325 == 0) {
                    this.method105();
                    this.field315 = var2 + 2000L;
                    return;
                } else {
                    this.field314 = Math.min(this.field325, this.field322);
                    this.field325 = this.field322;
                }
                this.field317 = var2 + 2000L;
                this.field322 = 0;
            }
            this.field316 = var4;
        } catch (Exception var9) {
            this.method105();
            this.field315 = var2 + 2000L;
        }
        try {
            if (this.field308 + 500000L < var2) {
                var2 = this.field308;
            }
            while (var2 > this.field308 + 5000L) {
                this.method106(256, (byte) -35);
                this.field308 += (long) (256000 / class25.field448);
            }
        } catch (Exception var8) {
            this.field308 = var2;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V", line = 551)
    public static final void method118(int arg0, int arg1, int arg2) {
        field305++;
        class177 var3 = class177.method1310(arg2 + 46, arg2, arg0);
        var3.method1302(-20040);
        var3.field2908 = arg1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V", line = 563)
    public static final void method119(int arg0, int arg1) {
        field296++;
        if (arg0 != -256) {
            method112(true);
        }
        class285.field4795.method1348(0, arg1);
        class104.field1843.method1348(0, arg1);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "()V", line = 575)
    public void method120() throws Exception {
        field292++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILcg;I)V", line = 582)
    private final void method121(int arg0, class38 arg1, int arg2) {
        field298++;
        int var4 = arg0 >> 5;
        class38 var5 = this.field319[var4];
        if (var5 == null) {
            this.field326[var4] = arg1;
        } else {
            var5.field703 = arg1;
        }
        this.field319[var4] = arg1;
        if (arg2 == 21937) {
            arg1.field700 = arg0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V", line = 603)
    public static void method122(int arg0) {
        field295 = null;
        field300 = null;
        if (arg0 > -47) {
            field313 = 115;
        }
        field321 = null;
        field323 = null;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "()I", line = 631)
    public int method123() throws Exception {
        field290++;
        return this.field318;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 639)
    public void method124(Component arg0) throws Exception {
        field297++;
    }
}
