import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class27 extends class484 {

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Ljo;")
    private class303 field334;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[B")
    public static byte[] field332 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lxa;")
    private class458 field328;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lxa;")
    private class458 field329;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Lxa;")
    private class458 field336;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Lxa;")
    private class458 field337;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Lxa;")
    private class458 field339;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Lxa;")
    private class458 field340;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZZI)V", line = 4)
    public final void method148(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field330;
        if (arg2) {
            int[] var5 = new int[4];
            class453.field6284.method274(var5);
            class453.field6284.method314(arg3, arg0, super.field7055.field4617 + arg3, super.field7055.field4607 + arg0);
            int var6 = this.field339.method418();
            int var7 = this.field339.method408();
            int var8 = this.field329.method418();
            int var9 = this.field329.method408();
            this.field339.method2612(arg3, (super.field7055.field4607 - var7) / 2 + arg0);
            this.field329.method2612(arg3 - var8 + super.field7055.field4617, arg0 - -((-var9 + super.field7055.field4607) / 2));
            class453.field6284.method314(arg3, arg0, arg3 - -super.field7055.field4617, arg0 + this.field337.method408());
            this.field337.method2608(arg3 + var6, arg0, -var8 + super.field7055.field4617 - var6, super.field7055.field4607);
            int var10 = this.field328.method408();
            class453.field6284.method314(arg3, super.field7055.field4607 + arg0 + -var10, arg3 - -super.field7055.field4617, arg0 - -super.field7055.field4607);
            this.field328.method2608(arg3 + var6, arg0 - var10 + super.field7055.field4607, -var8 + super.field7055.field4617 + -var6, super.field7055.field4607);
            class453.field6284.method314(var5[0], var5[1], var5[2], var5[3]);
        }
        if (!arg1) {
            this.field338 = -90;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 41)
    public final void method149(int arg0) {
        ++field335;
        class408 var2 = (class408) super.field7055;
        this.field336 = class505.method2907((byte) -121, this.field334.method1722(var2.field5431, arg0 ^ arg0));
        this.field340 = class505.method2907((byte) -122, this.field334.method1722(var2.field5435, 0));
        this.field339 = class505.method2907((byte) -120, this.field334.method1722(var2.field5430, 0));
        this.field329 = class505.method2907((byte) -118, this.field334.method1722(var2.field5428, 0));
        this.field337 = class505.method2907((byte) -118, this.field334.method1722(var2.field5432, 0));
        this.field328 = class505.method2907((byte) -118, this.field334.method1722(var2.field5427, 0));
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 56)
    public static void method150(byte arg0) {
        field332 = null;
        int var1 = 54 / ((arg0 - 15) / 45);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BZII)V", line = 67)
    public final void method151(byte arg0, boolean arg1, int arg2, int arg3) {
        ++field333;
        if (arg1 || ~class112.field1300 != ~this.field338) {
            this.field338 = class112.field1300;
            int var5 = arg2 + this.field339.method418();
            int var6 = arg2 - (-super.field7055.field4617 - -this.field329.method418());
            int var7 = this.field337.method408() + arg3;
            int var8 = super.field7055.field4607 + arg3 + -this.field328.method408();
            int var9 = -var5 + var6;
            int var10 = var8 - var7;
            int var11 = class112.field1300 * var9 / 100;
            int[] var12 = new int[4];
            class453.field6284.method274(var12);
            class453.field6284.method314(var5, var7, var5 + var11, var8);
            this.field336.method2608(var5, var7, var9, var10);
            class453.field6284.method314(var5 - -var11, var7, var6, var8);
            this.field340.method2608(var5, var7, var9, var10);
            class453.field6284.method314(var12[0], var12[1], var12[2], var12[3]);
        }
        if (arg0 <= 16) {
            this.method151((byte) -78, false, 16, 71);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljo;Luf;)V", line = 104)
    public class27(class303 arg0, class408 arg1) {
        super(arg1);
        this.field334 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Z", line = 118)
    public final boolean method152(int arg0) {
        ++field331;
        class408 var2 = (class408) super.field7055;
        if (!this.field334.method1711(var2.field5431, 1)) {
            return false;
        } else if (!this.field334.method1711(var2.field5435, 1)) {
            return false;
        } else if (!this.field334.method1711(var2.field5430, 1)) {
            return false;
        } else if (!this.field334.method1711(var2.field5428, 1)) {
            return false;
        } else {
            if (arg0 != -18257) {
                method150((byte) -91);
            }
            if (!this.field334.method1711(var2.field5432, arg0 ^ -18258)) {
                return false;
            } else {
                return this.field334.method1711(var2.field5428, 1);
            }
        }
    }
}
