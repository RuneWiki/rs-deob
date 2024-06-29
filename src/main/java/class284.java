import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class284 {

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "Ljj;")
    private class66 field4144;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "[I")
    public static int[] field4146 = new int[8];

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "Lgp;")
    public static class561 field4145;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Lcd;")
    public static class86 field4142;

    @OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() throws Throwable {
        field4139++;
        this.field4144.method591(256, this.field4140);
        super.finalize();
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 21)
    public static void method1806(int arg0) {
        field4146 = null;
        field4145 = null;
        if (arg0 >= -117) {
            method1807(76, -45, -115);
        }
        field4142 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method1807(int arg0, int arg1, int arg2) {
        field4138++;
        if (arg1 == -24291) {
            return (arg0 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLqa;)V", line = 46)
    public static final void method1808(boolean arg0, class167 arg1) {
        field4141++;
        int var2 = class270.field3975;
        int var3 = class6.field49;
        int var4 = class526.field7324;
        int var5 = class354.field5064;
        int var6 = -10660793;
        arg1.method1159(var6, var5, var3, var2, (byte) 110, var4);
        arg1.method1159(-16777216, 16, var3 + 1, var2 + 1, (byte) 89, var4 - 2);
        arg1.method1156(arg0, var3 + 18, var5 + -19, -16777216, var2 + 1, var4 - 2);
        class273.field3996.method1642(-1, (byte) 88, var2 + 3, var3 + 14, class291.field4210.method3220(false, class538.field7500), var6);
        int var7 = class619.field8735.method1614((byte) -46);
        int var8 = class619.field8735.method1607((byte) -78);
        int var9 = 0;
        for (class587 var10 = (class587) class432.field6356.method427(true); var10 != null; var10 = (class587) class432.field6356.method420(false)) {
            int var11 = (class480.field6825 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && (var2 + var4) > var7 && var8 > var11 - 13 && var8 < var11 + 3 && var10.field8362) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class458.method2682(var10.field8359, true)) {
                var13 = class611.field8684.method1621((byte) -87, (int) var10.field8365).field5666;
            } else if (var10.field8368 != -1) {
                var13 = class611.field8684.method1621((byte) -111, var10.field8368).field5666;
            } else if (class393.method2383(-23131, var10.field8359)) {
                class181 var14 = (class181) class432.field6368.method740(0, (long) ((int) var10.field8365));
                if (var14 != null) {
                    class170 var15 = var14.field2623;
                    class432 var16 = var15.field2492;
                    if (var16.field6304 != null) {
                        var16 = var16.method2582(0, class401.field6001);
                    }
                    if (var16 != null) {
                        var13 = var16.field6342;
                    }
                }
            } else if (class36.method315(48, var10.field8359)) {
                Object var17 = null;
                class370 var18;
                if (var10.field8359 == 1004) {
                    var18 = class552.field7819.method2890(0, (int) var10.field8365);
                } else {
                    var18 = class552.field7819.method2890(0, (int) (var10.field8365 >>> 32 & 0x7FFFFFFFL));
                }
                if (var18.field5272 != null) {
                    var18 = var18.method2238((byte) 65, class401.field6001);
                }
                if (var18 != null) {
                    var13 = var18.field5301;
                }
            }
            String var19 = class215.method1459(109, var10);
            if (var13 != null) {
                var19 = var19 + class347.method2106(var13, -52);
            }
            class273.field3996.method1637(class144.field2231, class158.field2366, var19, (byte) 120, var12, 0, var2 + 3, var11);
            if (var10.field8358) {
                class202.field2849.method953(class26.field358.method3651(-10408, var19) + var2 + 5, var11 - 12);
            }
            var9++;
        }
        class235.method1525(class270.field3975, class6.field49, class354.field5064, (byte) -126, class526.field7324);
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Ljj;II)V", line = 156)
    public class284(class66 arg0, int arg1, int arg2) {
        this.field4140 = arg2;
        this.field4144 = arg0;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI[S)[S", line = 171)
    public static final short[] method1809(byte arg0, int arg1, short[] arg2) {
        int var3 = 84 % ((58 - arg0) / 53);
        field4143++;
        short[] var4 = new short[arg1];
        class164.method1147(arg2, 0, var4, 0, arg1);
        return var4;
    }
}
