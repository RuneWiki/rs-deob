import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class280 extends class5 {

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    private int field4355;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    private int field4343;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public int field4349;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    private int field4351;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    private int field4359;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    private int field4350;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    private int field4357;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field4344 = new String[100];

    @OriginalMember(owner = "client!te", name = "I", descriptor = "C")
    public static char field4356;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "Lrj;")
    public static class269 field4353;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Lfm;")
    public static class336 field4345;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIBI)Z", line = 11)
    public final boolean method1935(int arg0, int arg1, byte arg2, int arg3) {
        field4363++;
        if (arg2 != 42) {
            this.method1939((byte) -124, 127, -106);
        }
        return this.field4357 == arg0 && arg1 >= this.field4355 && arg1 <= this.field4350 && this.field4359 <= arg3 && arg3 <= this.field4343;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZI)[I", line = 35)
    public final int[] method1936(int arg0, boolean arg1, int arg2) {
        field4346++;
        if (!arg1) {
            field4352 = 120;
        }
        return new int[] { this.field4351, arg2 - (this.field4355 - this.field4365), arg0 - (-this.field4364 + this.field4359) };
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BC)Z", line = 47)
    public static final boolean method1937(byte arg0, char arg1) {
        field4362++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg0 >= -119) {
            return false;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIB)Z", line = 70)
    public final boolean method1938(int arg0, int arg1, byte arg2) {
        if (arg2 <= 102) {
            method1937((byte) -47, 'Y');
        }
        field4341++;
        return arg1 >= this.field4365 && arg1 <= this.field4342 && this.field4364 <= arg0 && this.field4349 >= arg0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BII)[I", line = 89)
    public final int[] method1939(byte arg0, int arg1, int arg2) {
        field4348++;
        int var4 = 45 / ((arg0 + 36) / 57);
        return new int[] { this.field4357, arg2 - (this.field4365 - this.field4355), -this.field4364 + this.field4359 + arg1 };
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V", line = 106)
    public static void method1940(int arg0) {
        if (arg0 < -4) {
            field4353 = null;
            field4344 = null;
            field4345 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)Z", line = 118)
    public final boolean method1941(int arg0, byte arg1, int arg2) {
        if (arg1 != 116) {
            this.method1939((byte) 56, 1, -17);
        }
        field4361++;
        return arg2 >= this.field4355 && arg2 <= this.field4350 && arg0 >= this.field4359 && this.field4343 >= arg0;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 132)
    public class280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4365 = arg6;
        this.field4342 = arg8;
        this.field4355 = arg2;
        this.field4343 = arg5;
        this.field4349 = arg9;
        this.field4351 = arg1;
        this.field4359 = arg3;
        this.field4350 = arg4;
        this.field4364 = arg7;
        this.field4357 = arg0;
    }
}
