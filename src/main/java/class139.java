import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class139 {

    @OriginalMember(owner = "client!su", name = "a", descriptor = "Lao;")
    public static class188 field2095 = new class188(31, 1);

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field2099 = 0;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1023(boolean arg0) {
        if (!arg0) {
            method1024(-26, 35, 65, 46, 119);
        }
        field2095 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V", line = 18)
    public static final void method1024(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2098++;
        if (arg2 >= -48) {
            field2095 = null;
        }
        class434 var5 = class483.method2888(arg4, -105, 10);
        var5.method2632((byte) 81);
        var5.field6310 = arg3;
        var5.field6306 = arg0;
        var5.field6314 = arg1;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V", line = 38)
    public static final void method1025(byte arg0) {
        class416.field6157 = new class58[class335.field5139.method658((byte) 109)][];
        field2097++;
        class103.field1643 = new class58[class335.field5139.method658((byte) -96)][];
        class210.field3022 = new boolean[class335.field5139.method658((byte) -102)];
        if (arg0 <= 98) {
            field2095 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lqg;B)V", line = 53)
    public static final void method1026(class321 arg0, byte arg1) {
        field2100++;
        if (class339.field5168 == null) {
            class346 var2 = new class346();
            byte[] var3 = var2.method2250(128, 4096, 16, 128);
            class339.field5168 = class412.method2545(-125, var3, false);
        }
        if (class474.field6989 == null) {
            class56 var4 = new class56();
            byte[] var5 = var4.method402(128, 16, 128, true);
            class474.field6989 = class412.method2545(-128, var5, false);
        }
        class122 var6 = arg0.field4782;
        if (arg1 > 29 && var6.method924(false) && class21.field301 == null) {
            byte[] var7 = class359.method2313(16.0F, 128, 0.6F, 4.0F, (byte) 65, new class50(419684), 4.0F, 0.5F, 8, 16, 128);
            class21.field301 = class412.method2545(-126, var7, false);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Ltn;Z)V", line = 94)
    public static final void method1027(class58 arg0, boolean arg1) {
        if (!arg1) {
            if (class35.field537 == arg0.field969) {
                class165.field2473[arg0.field984] = true;
            }
            field2096++;
        }
    }
}
