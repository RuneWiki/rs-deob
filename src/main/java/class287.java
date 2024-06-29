import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class287 {

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "S")
    public static short field4186 = 205;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4169 = 1;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lub;")
    public static class15 field4179 = new class15(5);

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "[I")
    public static int[] field4187 = new int[4096];

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field4188 = 1;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "B")
    public byte field4165;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "B")
    public byte field4168;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "B")
    public byte field4172;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "B")
    public byte field4174;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "B")
    public byte field4177;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "B")
    public byte field4182;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "B")
    public byte field4185;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Ltj;")
    public static class108 field4167;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "S")
    public short field4175;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Z")
    public boolean field4164;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
    public boolean field4170;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
    public boolean field4171;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Z")
    public boolean field4173;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Z")
    public boolean field4178;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Z")
    public boolean field4181;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Z")
    public boolean field4183;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Z")
    public boolean field4184;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "Z")
    public boolean field4189;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lvq;IIB)V", line = 3)
    public static final void method1960(class269 arg0, int arg1, int arg2, byte arg3) {
        field4166++;
        class390.field5490 = arg0;
        class148.field2215 = new class129[arg2][arg1];
        if (class325.field4724 != null) {
            class216.field3118 = class359.method2337(class325.field4724[4], class325.field4724[5], class325.field4724[2], class325.field4724[1], class325.field4724[3], 65535, class325.field4724[0]);
        }
        class2.field8 = new class129();
        class342.method2243((byte) 49);
        int var4 = -48 / ((29 - arg3) / 44);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 44)
    public static void method1961(byte arg0) {
        if (arg0 > -53) {
            field4179 = null;
        }
        field4167 = null;
        field4187 = null;
        field4179 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)I", line = 57)
    public static final int method1962(byte arg0, int arg1, int arg2) {
        int var3 = -11 / ((arg0 - 24) / 44);
        field4176++;
        return arg2 == 1 || arg2 == 3 ? class130.field1878[arg1 & 0x3] : class63.field846[arg1 & 0x3];
    }
}
