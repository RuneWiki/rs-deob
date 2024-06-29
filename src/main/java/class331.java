import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class331 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lmq;")
    private class472 field4400 = new class472(128);

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Ljn;")
    private class668 field4405;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "S")
    public static short field4402 = 320;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Z")
    public static boolean field4406 = false;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Lsq;")
    public static class161 field4404 = new class161(1, 2);

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[I")
    public static int[] field4408;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lr;B)V", line = 3)
    public static final void method1918(class165 arg0, byte arg1) {
        field4401++;
        if (!(class271.field3704 >= 2 || class99.field1336) || class386.field5135 != null) {
            return;
        }
        String var2;
        if (class99.field1336 && class271.field3704 < 2) {
            var2 = class52.field844 + class424.field6070.method2561(class370.field4980, 0) + class255.field3461 + " ->";
        } else if (class189.field2310 && class376.field5043.method1687(-7653, 81) && class271.field3704 > 2) {
            var2 = class207.method1245(false, (class377) class34.field679.field2232.field7522.field7522);
        } else {
            class377 var3 = (class377) class34.field679.field2232.field7522;
            var2 = class207.method1245(false, var3);
            int[] var4 = null;
            if (class267.method1619(var3.field5062, true)) {
                var4 = class65.field1021.method178(false, (int) var3.field5064).field3210;
            } else if (var3.field5067 != -1) {
                var4 = class65.field1021.method178(false, var3.field5067).field3210;
            } else if (class660.method3740((byte) 124, var3.field5062)) {
                class633 var5 = (class633) class522.field7662.method3678((long) ((int) var3.field5064), -121);
                if (var5 != null) {
                    class557 var6 = var5.field9097;
                    class323 var7 = var6.field8052;
                    if (var7.field4315 != null) {
                        var7 = var7.method1881(class410.field5804, (byte) -101);
                    }
                    if (var7 != null) {
                        var4 = var7.field4292;
                    }
                }
            } else if (class19.method333(-1002, var3.field5062)) {
                Object var8 = null;
                class232 var9;
                if (var3.field5062 == 1011) {
                    var9 = class37.field703.method807(0, (int) var3.field5064);
                } else {
                    var9 = class37.field703.method807(0, (int) (var3.field5064 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field3094 != null) {
                    var9 = var9.method1412(72, class410.field5804);
                }
                if (var9 != null) {
                    var4 = var9.field3019;
                }
            }
            if (var4 != null) {
                var2 = var2 + class416.method2497(-17581, var4);
            }
        }
        if (class271.field3704 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class271.field3704 - 2) + class424.field6063.method2561(class370.field4980, 0);
        }
        int var10 = -19 / ((arg1 + 54) / 34);
        if (class654.field9296 != null) {
            class419 var12 = class654.field9296.method201(true, arg0);
            if (var12 == null) {
                var12 = class36.field691;
            }
            var12.method2513(class654.field9296.field421, class654.field9296.field414, var2, 0, class654.field9296.field470, class654.field9296.field372, class351.field4690, class434.field6233, class479.field6726, class420.field5955, class120.field1531, class654.field9296.field324, class654.field9296.field402, class634.field9106, class102.field1356);
            class79.method661(class102.field1356[1], class102.field1356[2], 10, class102.field1356[3], class102.field1356[0]);
        } else if (class376.field5054 != null && class668.field9580 == class588.field8518) {
            int var11 = class36.field691.method2519(16777215, class434.field6233, class634.field9106, class420.field5955, 0, var2, class351.field4690, class442.field6297 + 4, class96.field1309 + 16, 122);
            class79.method661(class96.field1309, class12.field205.method553(var2, -92) + var11, 10, 16, class442.field6297 + 4);
            return;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 119)
    public static void method1919(byte arg0) {
        field4404 = null;
        field4408 = null;
        if (arg0 < 80) {
            method1920(84);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 136)
    public static final void method1920(int arg0) {
        class498.method2899(arg0, 255, arg0 - 82);
        field4407++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Lbt;", line = 148)
    public final class40 method1921(int arg0, int arg1) {
        if (arg0 != 2) {
            method1920(-35);
        }
        field4403++;
        class472 var3 = this.field4400;
        class40 var4;
        synchronized (this.field4400) {
            var4 = (class40) this.field4400.method2766(-122, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4405.method3800(class377.method2191(arg1, (byte) -96), class455.method2699(0, arg1), (byte) -92);
        class40 var6 = new class40();
        if (var5 != null) {
            var6.method458(arg0 + 13244, new class389(var5));
        }
        class472 var7 = this.field4400;
        synchronized (this.field4400) {
            this.field4400.method2772(var6, true, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Ler;ILjn;)V", line = 182)
    public class331(class90 arg0, int arg1, class668 arg2) {
        this.field4405 = arg2;
        if (this.field4405 != null) {
            int var4 = this.field4405.method3779(5) - 1;
            this.field4405.method3805(var4, false);
        }
    }
}
