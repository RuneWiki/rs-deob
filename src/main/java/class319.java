import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class319 extends class390 {

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public int field4353;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public int field4355;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public int field4362;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public int field4368;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    public int field4372;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "Lvj;")
    public class256 field4370;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Lpi;")
    public class290 field4365;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "Llc;")
    public class387 field4374;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "Ldd;")
    public class421 field4360;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 7)
    public final void method2065(int arg0) {
        if (arg0 <= 99) {
            method2066(false, 88, -6, (class453) null, (byte) 31);
        }
        this.field4365 = null;
        this.field4360 = null;
        this.field4370 = null;
        this.field4374 = null;
        field4366++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZIILms;B)V", line = 38)
    public static final void method2066(boolean arg0, int arg1, int arg2, class453 arg3, byte arg4) {
        field4363++;
        int var5 = arg3.field6342;
        if (arg3.field6400 == 0) {
            arg3.field6342 = arg3.field6350;
        } else if (arg3.field6400 == 1) {
            arg3.field6342 = arg2 - arg3.field6350;
        } else if (arg3.field6400 == 2) {
            arg3.field6342 = arg3.field6350 * arg2 >> 14;
        }
        int var6 = arg3.field6447;
        if (arg3.field6353 == 0) {
            arg3.field6447 = arg3.field6383;
        } else if (arg3.field6353 == 1) {
            arg3.field6447 = arg1 - arg3.field6383;
        } else if (arg3.field6353 == 2) {
            arg3.field6447 = arg3.field6383 * arg1 >> 14;
        }
        if (arg3.field6400 == 4) {
            arg3.field6342 = arg3.field6447 * arg3.field6424 / arg3.field6455;
        }
        if (arg3.field6353 == 4) {
            arg3.field6447 = arg3.field6455 * arg3.field6342 / arg3.field6424;
        }
        int var7 = -98 % (arg4 / 49);
        if (class293.field4106 && (client.method1091(arg3).field1985 != 0 || arg3.field6356 == 0)) {
            if (arg3.field6447 < 5 && arg3.field6342 < 5) {
                arg3.field6447 = 5;
                arg3.field6342 = 5;
            } else {
                if (arg3.field6342 <= 0) {
                    arg3.field6342 = 5;
                }
                if (arg3.field6447 <= 0) {
                    arg3.field6447 = 5;
                }
            }
        }
        if (arg3.field6403 == 1337) {
            class143.field2056 = arg3;
        }
        if (arg0 && arg3.field6438 != null && arg3.field6342 != var5 || arg3.field6447 != var6) {
            class7 var8 = new class7();
            var8.field95 = arg3;
            var8.field97 = arg3.field6438;
            class139.field1981.method643(var8, -114);
        }
    }
}
