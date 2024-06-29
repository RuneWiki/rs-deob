import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class174 extends class73 {

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    private int field2469;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    private int field2473;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    private int field2465;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    private int field2470;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    private int field2475;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    private int field2478;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    private int field2476;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    private int field2477;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
    public static boolean field2468 = false;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lct;")
    public static class285 field2464 = new class285(25, 7);

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Ltd;")
    public static class351 field2471;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V", line = 6)
    public final void method627(int arg0, int arg1, int arg2) {
        ++field2474;
        int var4 = this.field2475 * arg1 >> 12;
        int var5 = this.field2473 * arg2 >> 12;
        int var6 = this.field2469 * arg1 >> 12;
        if (arg0 != -16) {
            this.method632(73, 115, -72);
        }
        int var7 = this.field2478 * arg2 >> 12;
        int var8 = this.field2476 * arg1 >> 12;
        int var9 = this.field2465 * arg2 >> 12;
        int var10 = this.field2470 * arg1 >> 12;
        int var11 = this.field2477 * arg2 >> 12;
        class136.method956(var8, var9, var4, var11, var10, var5, var7, var6, (byte) -41, super.field988);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V", line = 35)
    public final void method632(int arg0, int arg1, int arg2) {
        if (arg0 != 5263) {
            method1195(-69);
        }
        ++field2466;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 46)
    public static void method1194(int arg0) {
        if (arg0 != -6056) {
            field2471 = null;
        }
        field2464 = null;
        field2471 = null;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 59)
    public static final void method1195(int arg0) {
        ++field2472;
        if (class384.field5692 < 0) {
            class384.field5692 = 0;
            class294.field4429 = -1;
            class303.field4512 = -1;
        }
        if (class189.field2899 < class384.field5692) {
            class303.field4512 = -1;
            class294.field4429 = -1;
            class384.field5692 = class189.field2899;
        }
        if (~class446.field6309 > -1) {
            class446.field6309 = 0;
            class303.field4512 = -1;
            class294.field4429 = -1;
        }
        if (~class189.field2914 > ~class446.field6309) {
            class446.field6309 = class189.field2914;
            class294.field4429 = -1;
            class303.field4512 = -1;
        }
        int var1 = -4 / ((43 - arg0) / 63);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 103)
    public class174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2469 = arg2;
        this.field2473 = arg1;
        this.field2465 = arg5;
        this.field2470 = arg6;
        this.field2475 = arg0;
        this.field2478 = arg3;
        this.field2476 = arg4;
        this.field2477 = arg7;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V", line = 120)
    public final void method630(byte arg0, int arg1, int arg2) {
        ++field2467;
        if (arg0 <= 39) {
            this.method630((byte) 60, -74, 98);
        }
    }
}
