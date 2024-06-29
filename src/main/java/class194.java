import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class194 extends class232 {

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "Z")
    public boolean field3226 = true;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public int field3230 = 12800;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    public int field3232 = -1;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    public int field3227 = 0;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public int field3241 = 12800;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public int field3238 = -1;

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
    public int field3240 = 0;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public int field3219;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "Lok;")
    public class146 field3229;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "Lok;")
    public class146 field3236;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "Llc;")
    public class160 field3220;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "Lok;")
    public static class146 field3222 = class235.method1724(-12908, "p11_full");

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "Lok;")
    public static class146 field3234 = class235.method1724(-12908, "<col=ffffff>");

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public static int field3223 = -1;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "Lld;")
    public static class118 field3235 = new class118(16);

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "Z")
    public static boolean field3228;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lwe;I)Lqh;", line = 4)
    public static final class293 method1494(class47 arg0, int arg1) {
        field3237++;
        if (arg1 != -1) {
            method1497(true, 45, -3, 124, -6);
        }
        class293 var2 = new class293();
        var2.field4982 = arg0.method379(arg1 ^ 0x1);
        var2.field4983 = class40.method287(var2.field4982, (byte) -96);
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLoh;)V", line = 25)
    public static final void method1495(byte arg0, class15 arg1) {
        if (arg0 != -115) {
            field3228 = true;
        }
        class211.field3486 = arg1.method103(-54, class50.field903);
        field3239++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BIII)V", line = 47)
    public static final void method1496(byte arg0, int arg1, int arg2, int arg3) {
        field3231++;
        class158 var4 = class206.method1564(arg1, 4, -118);
        var4.method1236(-13730);
        var4.field2672 = arg3;
        var4.field2663 = arg2;
        if (arg0 <= 73) {
            method1497(false, 52, -15, 107, 51);
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lok;Lok;IIIZI)V", line = 201)
    public class194(class146 arg0, class146 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3219 = arg3;
        this.field3229 = arg1;
        this.field3225 = arg2;
        this.field3236 = arg0;
        this.field3238 = arg6;
        this.field3232 = arg4;
        this.field3226 = arg5;
        if (this.field3238 == 255) {
            this.field3238 = 0;
        }
        this.field3220 = new class160();
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZIIII)V", line = 73)
    public static final void method1497(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3224++;
        if (class272.method1992(arg2 - 15592, arg3)) {
            if (arg2 != 17898) {
                field3234 = (class146) null;
            }
            class21.method149(-1, arg4, class92.field1459[arg3], arg0, arg1, arg2 - 17643);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Z", line = 95)
    public final boolean method1498(int arg0, int arg1, int arg2) {
        field3221++;
        if (arg0 < this.field3241 || arg0 > this.field3240 || arg1 < this.field3230 || arg1 > this.field3227) {
            return false;
        }
        for (class138 var4 = (class138) this.field3220.method1251(-107); var4 != null; var4 = (class138) this.field3220.method1253(arg2 - 10957)) {
            if (var4.method1019(200, arg0, arg1)) {
                return true;
            }
        }
        if (arg2 == 11052) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(B)V", line = 133)
    public final void method1499(byte arg0) {
        this.field3230 = 12800;
        this.field3240 = 0;
        this.field3241 = 12800;
        this.field3227 = 0;
        for (class138 var2 = (class138) this.field3220.method1251(-126); var2 != null; var2 = (class138) this.field3220.method1253(91)) {
            if (this.field3227 < var2.field2294) {
                this.field3227 = var2.field2294;
            }
            if (this.field3241 > var2.field2290) {
                this.field3241 = var2.field2290;
            }
            if (var2.field2304 < this.field3230) {
                this.field3230 = var2.field2304;
            }
            if (var2.field2297 > this.field3240) {
                this.field3240 = var2.field2297;
            }
        }
        int var3 = -75 % ((8 - arg0) / 52);
        field3233++;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V", line = 169)
    public static void method1500(int arg0) {
        field3234 = null;
        if (arg0 != 12800) {
            field3235 = (class118) null;
        }
        field3222 = null;
        field3235 = null;
    }
}
