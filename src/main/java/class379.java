import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class379 extends class21 implements class337 {

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    private int field5449;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5448;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static void method2259(boolean arg0) {
        if (arg0) {
            method2260(69, 79, (byte) 27);
        }
        field5448 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2260(int arg0, int arg1, byte arg2) {
        if (arg2 != -41) {
            return true;
        } else {
            ++field5447;
            return class279.method1614((byte) -110, arg0, arg1) || class12.method88(arg0, (byte) 25, arg1);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZI)Lof;")
    public static final class412 method2261(int arg0, boolean arg1, int arg2) {
        if (arg0 != 3597) {
            method2264((byte) 35, (class421) null);
        }
        ++field5453;
        long var3 = (long) (arg2 | (arg1 ? Integer.MIN_VALUE : 0));
        return (class412) class349.field5071.method1592((byte) -25, var3);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILza;)V")
    public static final void method2262(int arg0, class295 arg1) {
        arg1.method511(0, 0, class66.field953, 350);
        ++field5455;
        arg1.method508(0, 0, class66.field953, 350, class338.field4903 << 24 | 3351159, 1);
        int var2 = 350 / class392.field5655;
        if (class9.field110 > 0) {
            int var3 = 346 - class392.field5655 + -4;
            int var4 = var2 * var3 / (class9.field110 + var2 + -1);
            int var5 = 4;
            if (~class9.field110 < -2) {
                var5 += (var3 - var4) * (class9.field110 + -1 + -class343.field4961) / (class9.field110 - 1);
            }
            arg1.method508(class66.field953 + -16, var5, 12, var4, 3351159 | class338.field4903 << 24, 2);
            for (int var6 = class343.field4961; class343.field4961 + var2 > var6 && ~class9.field110 < ~var6; ++var6) {
                String[] var7 = class139.method982('\b', (byte) 10, field5448[var6]);
                int var8 = (class66.field953 + -16 - 8) / var7.length;
                for (int var9 = 0; var7.length > var9; ++var9) {
                    int var10 = var8 * var9 + 8;
                    arg1.method511(var10, 0, var10 - -var8 + -8, 350);
                    class331.field4510.method1769(-class147.field2261 + 350 - ((-class343.field4961 + var6) * class392.field5655 + 2) + -class44.field638.field883, var10, var7[var9], -1, 0, -16777216);
                }
            }
        }
        arg1.method511(0, 0, class66.field953, 350);
        arg1.method1711((byte) 115, class66.field953, -1, -class147.field2261 + 350, 0);
        class108.field1751.method1769(-class80.field1127.field883 + 350 + -1, 10, "--> " + class441.field6349, -1, 0, -16777216);
        int var11 = -1;
        if (~(class28.field417 % 30) < -16) {
            var11 = 16777215;
        }
        arg1.method1714(class80.field1127.method416(8364, "--> " + class441.field6349.substring(0, class480.field6949)) + 10, -class80.field1127.field883 + 350 + -11, var11, arg0, (byte) -24);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
    public final int method2053(int arg0) {
        int var2 = -110 / ((arg0 - 22) / 34);
        ++field5454;
        return 0;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lpg;I[BI)V")
    public class379(class333 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5449 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)J")
    public final long method2054(int arg0) {
        if (arg0 > -30) {
            return 10L;
        } else {
            ++field5452;
            return super.field296.method2841();
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public static final void method2263(int arg0) {
        ++field5456;
        int var1 = class210.field3001;
        int[] var2 = class169.field2570;
        if (arg0 < -7) {
            for (int var3 = 0; var1 > var3; ++var3) {
                class487 var4 = class45.field642[var2[var3]];
                if (var4 != null) {
                    class292.method1691(var4.method116(8569), var4, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III[B)V")
    public final void method2052(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field5450;
        this.method134(arg3, arg1);
        this.field5449 = arg0;
        if (arg2 != 16734) {
            this.field5449 = 86;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLdk;)V")
    public static final void method2264(byte arg0, class421 arg1) {
        if (arg0 < 68) {
            field5448 = null;
        }
        class222.field3143 = arg1.method2488("titlebg", false);
        ++field5446;
        class84.field1290 = arg1.method2488("logo", false);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)I")
    public final int method2055(int arg0) {
        int var2 = 66 % ((arg0 - 58) / 56);
        ++field5451;
        return this.field5449;
    }

    static {
        new class157("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }
}
