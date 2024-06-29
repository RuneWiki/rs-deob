import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class495 extends class569 {

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lth;")
    public static class288 field7173 = new class288();

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lf;")
    private class534 field7166;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Lf;")
    public class534 field7167;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Lf;")
    private class534 field7174;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lf;")
    private class534 field7175;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Lf;")
    private class534 field7177;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "Lf;")
    private class534 field7179;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZIZ)V", line = 3)
    public final void method452(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (!arg1) {
            field7173 = null;
        }
        ++field7178;
        if (arg3) {
            int[] var5 = new int[4];
            class701.field9813.method963(var5);
            class701.field9813.method982(arg2, arg0, super.field8096.field1972 + arg2, super.field8096.field1971 + arg0);
            int var6 = this.field7175.method312();
            int var7 = this.field7175.method304();
            int var8 = this.field7166.method312();
            int var9 = this.field7166.method304();
            this.field7175.method3001(arg2, arg0 - -((-var7 + super.field8096.field1971) / 2));
            this.field7166.method3001(super.field8096.field1972 + arg2 + -var8, (-var9 + super.field8096.field1971) / 2 + arg0);
            class701.field9813.method982(arg2, arg0, super.field8096.field1972 + arg2, arg0 + this.field7179.method304());
            this.field7179.method3003(arg2 + var6, arg0, -var6 + super.field8096.field1972 + -var8, super.field8096.field1971);
            int var10 = this.field7174.method304();
            class701.field9813.method982(arg2, arg0 - var10 + super.field8096.field1971, super.field8096.field1972 + arg2, super.field8096.field1971 + arg0);
            this.field7174.method3003(arg2 + var6, super.field8096.field1971 + arg0 - var10, super.field8096.field1972 - var8 + -var6, super.field8096.field1971);
            class701.field9813.method982(var5[0], var5[1], var5[2], var5[3]);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 41)
    public static void method2863(int arg0) {
        field7173 = null;
        if (arg0 != 1) {
            method2864((class115) null, -23);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 51)
    public final void method156(int arg0) {
        super.method156(arg0);
        ++field7168;
        class631 var2 = (class631) super.field8096;
        this.field7167 = class316.method1814(var2.field8876, (byte) 121, super.field8086);
        this.field7177 = class316.method1814(var2.field8877, (byte) 116, super.field8086);
        this.field7175 = class316.method1814(var2.field8870, (byte) 111, super.field8086);
        this.field7166 = class316.method1814(var2.field8868, (byte) 115, super.field8086);
        this.field7179 = class316.method1814(var2.field8872, (byte) 127, super.field8086);
        this.field7174 = class316.method1814(var2.field8871, (byte) 121, super.field8086);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ltf;Ltf;Lwm;)V", line = 73)
    public class495(class701 arg0, class701 arg1, class631 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Z", line = 76)
    public final boolean method157(boolean arg0) {
        ++field7176;
        if (!super.method157(arg0)) {
            return false;
        } else {
            class631 var2 = (class631) super.field8096;
            if (!super.field8086.method3849(var2.field8876, false)) {
                return false;
            } else if (!super.field8086.method3849(var2.field8877, false)) {
                return false;
            } else if (!super.field8086.method3849(var2.field8870, false)) {
                return false;
            } else if (!super.field8086.method3849(var2.field8868, false)) {
                return false;
            } else if (!super.field8086.method3849(var2.field8872, false)) {
                return false;
            } else {
                return super.field8086.method3849(var2.field8871, false);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZ)V", line = 113)
    public final void method449(int arg0, int arg1, int arg2, boolean arg3) {
        ++field7171;
        int var5 = arg2 + this.field7175.method312();
        int var6 = super.field8096.field1972 + arg2 + -this.field7166.method312();
        int var7 = arg1 - -this.field7179.method304();
        int var8 = arg1 - (-super.field8096.field1971 - -this.field7174.method304());
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = this.method3223((byte) 111) * var9 / 10000;
        int[] var12 = new int[4];
        class701.field9813.method963(var12);
        class701.field9813.method982(var5, var7, var5 + var11, var8);
        this.method70(var9, var10, var5, -128, var7);
        class701.field9813.method982(var5 + var11, var7, var6, var8);
        this.field7177.method3003(var5, var7, var9, var10);
        class701.field9813.method982(var12[0], var12[1], var12[arg0], var12[3]);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lnp;I)Leba;", line = 143)
    public static final class552 method2864(class115 arg0, int arg1) {
        if (arg1 >= -88) {
            return null;
        } else {
            ++field7172;
            int var2 = arg0.method631(false);
            return new class552(var2);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V", line = 162)
    public void method70(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7167.method3003(arg2, arg4, arg0, arg1);
        ++field7170;
        if (arg3 >= -125) {
            this.field7166 = null;
        }
    }
}
