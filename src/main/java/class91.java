import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class91 extends class318 {

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "S")
    public short field1275;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
    public static final void method625(int arg0, int arg1, int arg2) {
        ++class496.field6941;
        ++field1278;
        class583 var3 = class54.method400(class213.field2800, (byte) -95, class596.field8096);
        var3.field7963.method492(-2, arg0);
        var3.field7963.method509(arg2, arg1 ^ 1470420841);
        if (arg1 != 1) {
            method625(-57, -115, -3);
        }
        class463.method2838(var3, (byte) 126);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([Ltj;B)I")
    public final int method626(class687[] arg0, byte arg1) {
        ++field1274;
        int var3 = super.field4410 >> class371.field5241;
        int var4 = super.field4418 >> class371.field5241;
        int var5 = 0;
        if (class103.field1410 != var3) {
            if (var3 > class103.field1410) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (class307.field4314 == var4) {
            var5 += 3;
        } else if (~var4 > ~class307.field4314) {
            var5 += 6;
        }
        int var6 = class289.field4136[var5];
        if ((var6 & this.field1275) != 0) {
            return this.method2059((byte) -111, var3, var4, arg0);
        } else if (this.field1275 == 1 && ~var3 < -1) {
            return this.method2059((byte) -111, var3 + -1, var4, arg0);
        } else if (~this.field1275 == -5 && ~class61.field877 <= ~var3) {
            return this.method2059((byte) -111, var3 + 1, var4, arg0);
        } else if (this.field1275 == 8 && var4 > 0) {
            return this.method2059((byte) -111, var3, var4 + -1, arg0);
        } else if (~this.field1275 == -3 && ~var4 >= ~class713.field9959) {
            return this.method2059((byte) -111, var3, var4 + 1, arg0);
        } else if (this.field1275 == 16 && ~var3 < -1 && class713.field9959 >= var4) {
            return this.method2059((byte) -111, var3 + -1, var4 - -1, arg0);
        } else if (~this.field1275 == -33 && ~var3 >= ~class61.field877 && class713.field9959 >= var4) {
            return this.method2059((byte) -111, var3 + 1, var4 - -1, arg0);
        } else if (~this.field1275 == -129 && var3 > 0 && var4 > 0) {
            return this.method2059((byte) -111, var3 + -1, var4 + -1, arg0);
        } else if (~this.field1275 == -65 && class61.field877 >= var3 && var4 > 0) {
            return this.method2059((byte) -111, var3 + 1, var4 + -1, arg0);
        } else {
            if (arg1 != -80) {
                this.method627((class548) null, (byte) -120);
            }
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(Lha;B)Z")
    public final boolean method627(class548 arg0, byte arg1) {
        ++field1276;
        if (arg1 < 80) {
            this.method628(-105);
        }
        return class115.method732(true, super.field4410 >> class371.field5241, super.field4419, this, super.field4418 >> class371.field5241);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIII)V")
    public class91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field4408 = (byte) arg3;
        super.field4410 = arg0;
        super.field4413 = arg1;
        super.field4418 = arg2;
        this.field1275 = (short) arg5;
        super.field4419 = (byte) arg4;
    }

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "(I)Z")
    public final boolean method628(int arg0) {
        ++field1277;
        if (arg0 < 95) {
            this.field1275 = 91;
        }
        return class417.field5900[(super.field4410 >> class371.field5241) + -class103.field1410 + class218.field2854][(super.field4418 >> class371.field5241) - -class218.field2854 + -class307.field4314];
    }
}
