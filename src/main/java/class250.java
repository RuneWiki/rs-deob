import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class250 {

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Lfc;")
    private class174 field3731 = new class174(64);

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Loi;")
    private class53 field3732;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Liv;")
    public final class66 method1626(int arg0, boolean arg1) {
        field3729++;
        class174 var3 = this.field3731;
        class66 var4;
        synchronized (this.field3731) {
            var4 = (class66) this.field3731.method1088((long) arg0, (byte) -113);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field3732;
        byte[] var6;
        synchronized (this.field3732) {
            var6 = this.field3732.method426(35, (byte) 9, arg0);
        }
        class66 var7 = new class66();
        if (var6 != null) {
            var7.method521(new class403(var6), -1);
        }
        var7.method522(arg1);
        class174 var8 = this.field3731;
        synchronized (this.field3731) {
            this.field3731.method1097(19627, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLnt;)[Lnl;")
    public static final class392[] method1627(byte arg0, class151 arg1) {
        field3727++;
        if (!arg1.method961((byte) -120)) {
            return new class392[0];
        }
        class370 var2 = arg1.method966(1);
        while (var2.field5277 == 0) {
            class52.method411(10L, (byte) 125);
        }
        if (var2.field5277 == 2) {
            return new class392[0];
        }
        int var3 = -5 / ((27 - arg0) / 47);
        int[] var4 = (int[]) var2.field5274;
        class392[] var5 = new class392[var4.length >> 2];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class392 var7 = new class392();
            var5[var6] = var7;
            var7.field5509 = var4[var6 << 2];
            var7.field5510 = var4[(var6 << 2) + 1];
            var7.field5508 = var4[(var6 << 2) + 2];
            var7.field5513 = var4[(var6 << 2) + 3];
        }
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public final void method1628(int arg0) {
        class174 var2 = this.field3731;
        synchronized (this.field3731) {
            this.field3731.method1096((byte) 109);
            if (arg0 != 14) {
                method1627((byte) 26, null);
            }
        }
        field3726++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public final void method1629(byte arg0) {
        class174 var2 = this.field3731;
        synchronized (this.field3731) {
            int var3 = -59 % ((58 - arg0) / 43);
            this.field3731.method1095(0);
        }
        field3733++;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lle;ILoi;)V")
    public class250(class205 arg0, int arg1, class53 arg2) {
        this.field3732 = arg2;
        if (this.field3732 != null) {
            this.field3732.method435(35, 0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lza;I)V")
    public static final void method1630(class290 arg0, int arg1) {
        field3730++;
        int var2 = class123.field1679;
        int var3 = field3725;
        int var4 = class388.field5445;
        int var5 = class2.field56;
        int var6 = -10660793;
        arg0.method1794(var4, var3, var6, var5, 113, var2);
        arg0.method1794(var4 - 2, var3 + 1, -16777216, 16, 82, var2 + 1);
        arg0.method1795(var3 + 18, (byte) -77, var4 - 2, var5 + -19, -16777216, var2 + 1);
        class107.field1431.method1914(var3 + 14, var2 - -3, class362.field5170.method3116(class149.field1979, (byte) 106), var6, 16144, -1);
        int var7 = class22.field277.method1192(true);
        int var8 = class22.field277.method1194(arg1 ^ 0x24);
        int var9 = arg1;
        for (class214 var10 = (class214) class363.field5190.method2655(15152); var10 != null; var10 = (class214) class363.field5190.method2660((byte) 67)) {
            int var11 = (class37.field408 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < (var2 + var4) && var11 - 13 < var8 && var8 < var11 + 3 && var10.field3095) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class308.method1869(var10.field3094, (byte) -92)) {
                var13 = class344.field5000.method993((int) var10.field3089, true).field5534;
            } else if (var10.field3085 != -1) {
                var13 = class344.field5000.method993(var10.field3085, true).field5534;
            } else if (class26.method168(var10.field3094, 205)) {
                class378 var16 = (class378) class125.field1687.method2405((long) ((int) var10.field3089), -120);
                if (var16 != null) {
                    class429 var17 = var16.field5353;
                    class322 var18 = var17.field6055;
                    if (var18.field4693 != null) {
                        var18 = var18.method1939(arg1 + 15964, class163.field2413);
                    }
                    if (var18 != null) {
                        var13 = var18.field4680;
                    }
                }
            } else if (class350.method2072(var10.field3094, (byte) 112)) {
                Object var14 = null;
                class270 var15;
                if (var10.field3094 == 1002) {
                    var15 = class377.field5338.method1901(50, (int) var10.field3089);
                } else {
                    var15 = class377.field5338.method1901(50, (int) (var10.field3089 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field3998 != null) {
                    var15 = var15.method1704((byte) 120, class163.field2413);
                }
                if (var15 != null) {
                    var13 = var15.field3934;
                }
            }
            String var19 = class120.method809(arg1 - 32060, var10);
            if (var13 != null) {
                var19 = var19 + class440.method2579(var13, false);
            }
            class107.field1431.method1918(var12, 0, var2 + 3, class81.field1048, var19, arg1, class487.field6796, var11);
            if (var10.field3086) {
                class328.field4785.method151(class113.field1536.method2430(var19, (byte) -126) + (var2 + 5), var11 + -12);
            }
            var9++;
        }
        class36.method202(class2.field56, class123.field1679, false, field3725, class388.field5445);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public final void method1631(int arg0, int arg1) {
        field3724++;
        if (arg0 == -267592222) {
            class174 var3 = this.field3731;
            synchronized (this.field3731) {
                this.field3731.method1087(1, arg1);
            }
        }
    }
}
