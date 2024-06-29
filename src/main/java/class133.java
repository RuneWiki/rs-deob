import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class133 extends class88 {

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "[B")
    public byte[] field2477;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Z")
    public static boolean field2476 = true;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "[Lu;")
    public static class116[] field2474 = new class116[6];

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "Z")
    public static boolean field2483 = false;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field2482 = 0;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field2472 = -1;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Lhj;")
    public static class69 field2481 = class181.method1318(")2", (byte) -121);

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[Lhk;")
    public static class121[] field2478;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V")
    public static final void method987(boolean arg0) {
        if (arg0) {
            field2484++;
            class193.field3519.method1709((byte) -47);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lnc;I)I")
    public static final int method988(class83 arg0, int arg1) {
        int var2 = arg1;
        if (arg0.method612(class118.field2240, -99)) {
            var2 = arg1 + 1;
        }
        field2485++;
        if (arg0.method612(class52.field916, -37)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(Z)V")
    public static void method989(boolean arg0) {
        if (arg0) {
            method987(true);
        }
        field2474 = null;
        field2478 = null;
        field2481 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)I")
    public static final int method990(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 31 & arg0 + arg1;
        field2475++;
        return (arg2 + (arg2 >>> 31)) % arg0 + var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
    public static final void method991(int arg0, boolean arg1) {
        class172.field3147.method1708(-1009973721, arg0);
        field2480++;
        if (arg1) {
            field2478 = null;
        }
        class63.field1213.method1708(-1009973721, arg0);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "([B)V")
    public class133(byte[] arg0) {
        this.field2477 = arg0;
    }
}
