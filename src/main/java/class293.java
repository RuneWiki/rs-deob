import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class293 extends class220 {

    @OriginalMember(owner = "client!c", name = "O", descriptor = "Z")
    public volatile boolean field5018 = true;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Lmh;")
    private static class128 field5008 = class22.method156(124, "Ok");

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Lmh;")
    public static class128 field5017 = class22.method156(122, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!c", name = "R", descriptor = "Lmh;")
    public static class128 field5020 = class22.method156(123, "::serverjs5drop");

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field5011 = 0;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "Lmh;")
    public static class128 field5021 = class22.method156(123, ")1a2)1m");

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "Lmh;")
    public static class128 field5019 = field5008;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "Lmh;")
    private static class128 field5010 = class22.method156(123, "K");

    @OriginalMember(owner = "client!c", name = "T", descriptor = "Lmh;")
    public static class128 field5022 = field5010;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "Lmh;")
    public static class128 field5013 = field5010;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "Lni;")
    public static class23 field5014;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Z")
    public boolean field5015;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "Z")
    public boolean field5016;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V", line = 21)
    public static void method2009(byte arg0) {
        field5014 = null;
        field5013 = null;
        field5008 = null;
        field5020 = null;
        field5022 = null;
        field5019 = null;
        field5021 = null;
        field5017 = null;
        field5010 = null;
        if (arg0 > -75) {
            field5017 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILem;)V", line = 40)
    public static final void method2010(int arg0, class10 arg1) {
        int var2 = arg1.field222;
        field5009++;
        if (var2 == 324) {
            if (class248.field4281 == -1) {
                class62.field1172 = arg1.field321;
                class248.field4281 = arg1.field331;
            }
            if (class50.field989.field119) {
                arg1.field331 = class248.field4281;
            } else {
                arg1.field331 = class62.field1172;
            }
        } else if (var2 == 325) {
            if (class248.field4281 == -1) {
                class248.field4281 = arg1.field331;
                class62.field1172 = arg1.field321;
            }
            if (class50.field989.field119) {
                arg1.field331 = class62.field1172;
            } else {
                arg1.field331 = class248.field4281;
            }
        } else if (var2 == 327) {
            arg1.field231 = 150;
            arg1.field290 = (int) (Math.sin((double) field5011 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field283 = 5;
            arg1.field265 = -1;
        } else if (var2 != 328) {
            int var3 = -88 / ((26 - arg0) / 59);
        } else if (class163.field2796.field2079 == null) {
            arg1.field265 = 0;
        } else {
            arg1.field231 = 150;
            arg1.field290 = (int) (Math.sin((double) field5011 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field283 = 5;
            arg1.field265 = ((int) class163.field2796.field2079.method819((byte) 99) << 11) + 2047;
            arg1.field275 = class163.field2796.field474;
            arg1.field354 = class163.field2796.field444;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIBI)V", line = 117)
    public static final void method2011(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg2 >= class70.field1315 && arg2 <= class181.field3173) {
            int var5 = class7.method59(class43.field875, arg1, class193.field3335, 0);
            int var6 = class7.method59(class43.field875, arg0, class193.field3335, 0);
            class219.method1514(arg3 - 1898732179, var6, arg2, arg4, var5);
        }
        field5012++;
        if (arg3 != -108) {
            method2010(-43, (class10) null);
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)I")
    public abstract int method1146(int arg0);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)[B")
    public abstract byte[] method1144(int arg0);
}
