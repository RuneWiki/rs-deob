import java.awt.Canvas;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class224 {

    @OriginalMember(owner = "client!r", name = "j", descriptor = "[S")
    public static short[] field4016 = new short[256];

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lsg;")
    public static class30 field4009 = class167.method1221((byte) 33, "<col=40ff00>");

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lsg;")
    public static class30 field4007 = class167.method1221((byte) 33, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lsg;")
    private static class30 field4019 = class167.method1221((byte) 33, "Please wait)3)3)3");

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Lsg;")
    public static class30 field4008 = class167.method1221((byte) 33, "Versteckt");

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field4020 = 0;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lsg;")
    public static class30 field4018 = field4019;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lsg;")
    public static class30 field4015 = class167.method1221((byte) 33, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient;")
    public static client field4013;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4021;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;B)Lsg;")
    public static final class30 method1604(String arg0, byte arg1) {
        field4010++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        if (arg1 <= 44) {
            return null;
        }
        class30 var3 = new class30();
        var3.field618 = var2;
        var3.field576 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field576++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static final void method1605(byte arg0) {
        if (arg0 != 37) {
            return;
        }
        field4011++;
        if (class196.field3548 != -1) {
            class277.method1872((byte) -108, class196.field3548);
        }
        for (int var1 = 0; var1 < class80.field1731; var1++) {
            if (class14.field288[var1]) {
                class210.field3769[var1] = true;
            }
            class195.field3508[var1] = class14.field288[var1];
            class14.field288[var1] = false;
        }
        class78.field1695 = null;
        class147.field2814 = class133.field2617;
        class168.field3135 = -1;
        class150.field2846 = -1;
        if (class196.field3548 != -1) {
            class80.field1731 = 0;
            class17.method172(0, false, -1, 0, class238.field4238, 0, class15.field324, class196.field3548, 0);
        }
        class188.method1363();
        class195.field3517 = 0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method1606(int arg0) {
        field4008 = null;
        field4021 = null;
        if (arg0 != -4560) {
            return;
        }
        field4009 = null;
        field4013 = null;
        field4016 = null;
        field4015 = null;
        field4019 = null;
        field4018 = null;
        field4007 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public static final void method1607(int arg0, int arg1) {
        field4017++;
        int var2 = -35 % ((arg1 + 88) / 34);
        short var3 = 256;
        if (arg0 > var3) {
            arg0 = var3;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class25.field490 += arg0 * 128;
        if (class25.field490 > class241.field4271.length) {
            class25.field490 -= class241.field4271.length;
            int var4 = (int) (Math.random() * 12.0D);
            class225.method1612(1, class268.field4720[var4]);
        }
        int var5 = arg0 * 128;
        int var6 = (var3 - arg0) * 128;
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            int var27 = class131.field2588[var5 + var7] - class241.field4271[class25.field490 + var7 & class241.field4271.length + -1] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class131.field2588[var7++] = var27;
        }
        for (int var9 = var3 - arg0; var9 < var3; var9++) {
            int var24 = var9 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class131.field2588[var24 + var25] = 255;
                } else {
                    class131.field2588[var24 + var25] = 0;
                }
            }
        }
        for (int var10 = 0; var10 < (var3 - arg0); var10++) {
            class245.field4372[var10] = class245.field4372[arg0 + var10];
        }
        for (int var11 = var3 - arg0; var11 < var3; var11++) {
            class245.field4372[var11] = (int) (Math.sin((double) class250.field4424 / 14.0D) * 16.0D + Math.sin((double) class250.field4424 / 15.0D) * 14.0D + Math.sin((double) class250.field4424 / 16.0D) * 12.0D);
            class250.field4424++;
        }
        int var12 = ((class133.field2617 & 0x1) + arg0) / 2;
        class87.field1779 += arg0;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class87.field1779; var13++) {
            int var22 = (int) (Math.random() * 128.0D) + 128;
            int var23 = (int) (Math.random() * 124.0D) + 2;
            class131.field2588[(var22 << 7) + var23] = 192;
        }
        class87.field1779 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if ((var21 + var12) < 128) {
                    var19 += class131.field2588[var12 + var21 + var20];
                }
                if ((-(var12 - var21) - 1) >= 0) {
                    var19 -= class131.field2588[var21 + var20 - var12 - 1];
                }
                if (var21 >= 0) {
                    class17.field346[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var3 > (var12 + var17)) {
                    var16 += class17.field346[var12 * 128 + var18 + var15];
                }
                if ((var17 - (var12 + 1)) >= 0) {
                    var16 -= class17.field346[var15 - (((var12 + 1) * 128) - var18)];
                }
                if (var17 >= 0) {
                    class131.field2588[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILmc;I)Z")
    public static final boolean method1608(int arg0, int arg1, class151 arg2, int arg3) {
        field4012++;
        if (arg3 != 0) {
            field4013 = null;
        }
        byte[] var4 = arg2.method1115(arg0, (byte) -86, arg1);
        if (var4 == null) {
            return false;
        } else {
            class263.method1814(-126, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4022++;
        if (class1.method9(arg0, (byte) -13)) {
            client.method1501(class259.field4572[arg0], -1, arg3, arg5, arg1, arg2, arg7, arg6);
            if (arg4 != 0) {
                field4019 = null;
            }
        }
    }
}
