import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class446 extends class323 {

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!iea", name = "s", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!iea", name = "t", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!iea", name = "w", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!iea", name = "y", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "Lxa;")
    private class468 field5599;

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "Lxa;")
    public class468 field5604;

    @OriginalMember(owner = "client!iea", name = "v", descriptor = "Lxa;")
    private class468 field5605;

    @OriginalMember(owner = "client!iea", name = "x", descriptor = "Lxa;")
    private class468 field5607;

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "Lxa;")
    private class468 field5609;

    @OriginalMember(owner = "client!iea", name = "A", descriptor = "Lxa;")
    private class468 field5610;

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lpfa;Lpfa;Lvj;)V", line = 8)
    public class446(class275 arg0, class275 arg1, class410 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)Z", line = 11)
    public final boolean method516(int arg0) {
        ++field5602;
        if (!super.method516(arg0)) {
            return false;
        } else {
            class410 var2 = (class410) super.field4027;
            if (!super.field4024.method1669((byte) 115, var2.field5263)) {
                return false;
            } else if (!super.field4024.method1669((byte) 117, var2.field5266)) {
                return false;
            } else if (!super.field4024.method1669((byte) 120, var2.field5268)) {
                return false;
            } else if (!super.field4024.method1669((byte) 125, var2.field5264)) {
                return false;
            } else if (!super.field4024.method1669((byte) 113, var2.field5273)) {
                return false;
            } else {
                return super.field4024.method1669((byte) 124, var2.field5275);
            }
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 44)
    public final void method518(int arg0) {
        ++field5601;
        super.method518(-841);
        class410 var2 = (class410) super.field4027;
        this.field5604 = class132.method853(0, super.field4024, var2.field5263);
        this.field5609 = class132.method853(arg0 ^ -841, super.field4024, var2.field5266);
        this.field5605 = class132.method853(0, super.field4024, var2.field5268);
        this.field5607 = class132.method853(arg0 + 841, super.field4024, var2.field5264);
        this.field5610 = class132.method853(arg0 ^ arg0, super.field4024, var2.field5273);
        this.field5599 = class132.method853(arg0 + 841, super.field4024, var2.field5275);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IBIII)V", line = 65)
    public void method769(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = 76 / ((51 - arg1) / 42);
        ++field5606;
        this.field5604.method2552(arg2, arg0, arg3, arg4);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZBII)V", line = 75)
    public final void method1861(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field5608;
        int var5 = arg2 + this.field5605.method1552();
        int var6 = arg2 - -super.field4027.field9574 + -this.field5607.method1552();
        int var7 = this.field5610.method1549() + arg3;
        int var8 = super.field4027.field9572 + arg3 - this.field5599.method1549();
        int var9 = var6 - var5;
        int var10 = var8 - var7;
        int var11 = var9 * this.method1860(0) / 10000;
        int[] var12 = new int[4];
        int var13 = -121 % ((-83 - arg1) / 37);
        class309.field3898.method478(var12);
        class309.field3898.method403(var5, var7, var5 + var11, var8);
        this.method769(var7, (byte) -128, var5, var9, var10);
        class309.field3898.method403(var5 - -var11, var7, var6, var8);
        this.field5609.method2552(var5, var7, var9, var10);
        class309.field3898.method403(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIZZ)V", line = 109)
    public final void method1862(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (!arg3) {
            this.field5599 = null;
        }
        if (arg2) {
            int[] var5 = new int[4];
            class309.field3898.method478(var5);
            class309.field3898.method403(arg1, arg0, super.field4027.field9574 + arg1, super.field4027.field9572 + arg0);
            int var6 = this.field5605.method1552();
            int var7 = this.field5605.method1549();
            int var8 = this.field5607.method1552();
            int var9 = this.field5607.method1549();
            this.field5605.method2556(arg1, (-var7 + super.field4027.field9572) / 2 + arg0);
            this.field5607.method2556(super.field4027.field9574 + arg1 + -var8, (-var9 + super.field4027.field9572) / 2 + arg0);
            class309.field3898.method403(arg1, arg0, super.field4027.field9574 + arg1, arg0 - -this.field5610.method1549());
            this.field5610.method2552(arg1 + var6, arg0, -var8 + super.field4027.field9574 + -var6, super.field4027.field9572);
            int var10 = this.field5599.method1549();
            class309.field3898.method403(arg1, -var10 + arg0 + super.field4027.field9572, super.field4027.field9574 + arg1, super.field4027.field9572 + arg0);
            this.field5599.method2552(arg1 + var6, arg0 - -super.field4027.field9572 - var10, -var8 + super.field4027.field9574 + -var6, super.field4027.field9572);
            class309.field3898.method403(var5[0], var5[1], var5[2], var5[3]);
        }
        ++field5603;
    }

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "(I)V", line = 144)
    public static final void method2442(int arg0) {
        ++field5600;
        class448 var1 = null;
        try {
            class218 var2 = class386.field4955.method2596((byte) 127, true, "2");
            while (~var2.field2546 == -1) {
                class700.method3867(29279, 1L);
            }
            if (~var2.field2546 == -2) {
                var1 = (class448) var2.field2547;
                byte[] var3 = new byte[(int) var1.method2447(1)];
                int var5;
                for (int var4 = 0; var3.length > var4; var4 += var5) {
                    var5 = var1.method2448((byte) 122, var4, var3, var3.length - var4);
                    if (~var5 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class601.method3300(new class572(var3), 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2451(true);
            }
        } catch (Exception var6) {
        }
        if (arg0 <= 15) {
            method2442(27);
        }
    }
}
