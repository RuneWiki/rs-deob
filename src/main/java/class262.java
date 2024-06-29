import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class262 extends OutputStream {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "S")
    public static short field4281 = 256;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field4283 = 2;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Z")
    public static boolean field4282 = false;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lna;")
    public static class26 field4285 = class69.method505("<col=80ff00>", (byte) -121);

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Lna;")
    public static class26 field4287 = class69.method505("; Expires=", (byte) -122);

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[I")
    public static int[] field4284;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[Lna;")
    public static class26[] field4280;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[S)[S", line = 22)
    public static final short[] method1845(int arg0, short[] arg1) {
        if (arg0 != 23032) {
            return (short[]) null;
        }
        field4290++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class75.method540(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lna;IIBI)V", line = 40)
    public static final void method1846(class26 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4286++;
        class297 var5 = class148.method1011((byte) -19, arg4, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field5126 != null) {
            class263 var6 = new class263();
            var6.field4306 = var5.field5126;
            var6.field4307 = var5;
            var6.field4293 = arg0;
            var6.field4303 = arg2;
            class215.method1442(1073376993, var6);
        }
        boolean var7 = true;
        if (var5.field4990 > 0) {
            var7 = class280.method1964(205, var5);
        }
        if (!var7 || !client.method1730(var5).method2283(arg2 - 1, (byte) -108)) {
            return;
        }
        if (arg2 == 1) {
            class114.field1789.method1431(0, 155);
            class114.field1789.method577(-120, arg4);
            class32.field533++;
            class114.field1789.method643(-20037, arg1);
        }
        if (arg3 >= -7) {
            return;
        }
        if (arg2 == 2) {
            class198.field3076++;
            class114.field1789.method1431(0, 196);
            class114.field1789.method577(-122, arg4);
            class114.field1789.method643(-20037, arg1);
        }
        if (arg2 == 3) {
            class95.field1552++;
            class114.field1789.method1431(0, 124);
            class114.field1789.method577(-122, arg4);
            class114.field1789.method643(-20037, arg1);
        }
        if (arg2 == 4) {
            class114.field1789.method1431(0, 199);
            class114.field1789.method577(-126, arg4);
            class114.field1789.method643(-20037, arg1);
            class22.field311++;
        }
        if (arg2 == 5) {
            class114.field1789.method1431(0, 234);
            class114.field1789.method577(-123, arg4);
            class114.field1789.method643(-20037, arg1);
            class10.field144++;
        }
        if (arg2 == 6) {
            class114.field1789.method1431(0, 168);
            class123.field1920++;
            class114.field1789.method577(-120, arg4);
            class114.field1789.method643(-20037, arg1);
        }
        if (arg2 == 7) {
            class308.field5300++;
            class114.field1789.method1431(0, 166);
            class114.field1789.method577(-123, arg4);
            class114.field1789.method643(-20037, arg1);
        }
        if (arg2 == 8) {
            class114.field1789.method1431(0, 64);
            class117.field1841++;
            class114.field1789.method577(-127, arg4);
            class114.field1789.method643(-20037, arg1);
        }
        if (arg2 == 9) {
            class123.field1912++;
            class114.field1789.method1431(0, 53);
            class114.field1789.method577(-123, arg4);
            class114.field1789.method643(-20037, arg1);
        }
        if (arg2 == 10) {
            class228.field3609++;
            class114.field1789.method1431(0, 9);
            class114.field1789.method577(-125, arg4);
            class114.field1789.method643(-20037, arg1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 177)
    public static void method1847(boolean arg0) {
        field4285 = null;
        field4280 = null;
        if (!arg0) {
            field4282 = true;
        }
        field4284 = null;
        field4287 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILfe;)V", line = 210)
    public static final void method1848(int arg0, int arg1, class241 arg2) {
        field4288++;
        if (class229.field3626 < arg2.field3940) {
            class272.method1928(arg2, true);
        } else if (arg2.field3927 >= class229.field3626) {
            class89.method694(arg2, (byte) -56);
        } else {
            class208.method1389((byte) -22, arg2);
        }
        if (arg2.field3962 < 128 || arg2.field3972 < 128 || arg2.field3962 >= 13184 || arg2.field3972 >= 13184) {
            arg2.field3908 = -1;
            arg2.field3986 = -1;
            arg2.field3940 = 0;
            arg2.field3927 = 0;
            arg2.field3962 = arg2.field3904[0] * 128 + (arg2.method1078((byte) 114) * 64);
            arg2.field3972 = arg2.field3890[0] * 128 + arg2.method1078((byte) 114) * 64;
            arg2.method1662(arg1 - 2395);
        }
        if (arg1 != 2279) {
            return;
        }
        if (class13.field221 == arg2 && (arg2.field3962 < 1536 || arg2.field3972 < 1536 || arg2.field3962 >= 11776 || arg2.field3972 >= 11776)) {
            arg2.field3986 = -1;
            arg2.field3940 = 0;
            arg2.field3927 = 0;
            arg2.field3908 = -1;
            arg2.field3962 = arg2.field3904[0] * 128 + arg2.method1078((byte) 114) * 64;
            arg2.field3972 = arg2.field3890[0] * 128 + arg2.method1078((byte) 114) * 64;
            arg2.method1662(-98);
        }
        class192.method1300(65536, arg2);
        class236.method1584(arg2, -11973);
    }

    @OriginalMember(owner = "client!vg", name = "write", descriptor = "(I)V", line = 258)
    public final void write(int arg0) throws IOException {
        field4289++;
        throw new IOException();
    }
}
