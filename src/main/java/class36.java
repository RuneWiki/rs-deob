import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class36 extends class45 {

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lmb;")
    public static class96 field609 = class243.method1708("blinken1:", (byte) 123);

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "Lmb;")
    public static class96 field613 = class243.method1708("Ablegen", (byte) 121);

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "Lmb;")
    public static class96 field619 = class243.method1708("Wordpack geladen)3", (byte) 117);

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "Lmb;")
    public static class96 field623 = class243.method1708("null", (byte) 99);

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "Lmb;")
    public static class96 field610 = class243.method1708(")4l=", (byte) 126);

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "Lmb;")
    public static class96 field625 = class243.method1708("blinken3:", (byte) 121);

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "Lmb;")
    public class96 field614;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "Lmb;")
    public class96 field624;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[IIBI)V")
    public static final void method283(int arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        ++field608;
        --arg0;
        if (arg3 > -60) {
            field610 = null;
        }
        int var11 = arg2 - 1;
        int var5 = -7 + var11;
        while (~var5 < ~arg0) {
            int var6 = arg0 + 1;
            arg1[var6] = arg4;
            int var7 = var6 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var12 = var10 + 1;
            arg1[var12] = arg4;
            int var13 = var12 + 1;
            arg1[var13] = arg4;
            arg0 = var13 + 1;
            arg1[arg0] = arg4;
        }
        while (var11 > arg0) {
            ++arg0;
            arg1[arg0] = arg4;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(BI)I")
    public static final int method284(byte arg0, int arg1) {
        if (arg0 >= -50) {
            field610 = null;
        }
        ++field612;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)I")
    public static final int method285(int arg0, boolean arg1) {
        if (!arg1) {
            return -52;
        } else {
            ++field620;
            return arg0 & 1023;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method286(byte arg0) {
        field619 = null;
        field609 = null;
        if (arg0 > -10) {
            field619 = null;
        }
        field610 = null;
        field613 = null;
        field625 = null;
        field623 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lpj;B)V")
    public static final void method287(class48 arg0, byte arg1) {
        class77.field1311 = arg0;
        if (arg1 != -122) {
            field623 = null;
        }
        ++field617;
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)Lag;")
    public final class258 method288(int arg0) {
        ++field618;
        if (arg0 != 0) {
            this.method288(35);
        }
        return class85.field1432[super.field782];
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[Lmb;)Lmb;")
    public static final class96 method289(int arg0, class96[] arg1) {
        if (arg0 != -5615) {
            method283(-116, (int[]) null, -80, (byte) 119, 76);
        }
        ++field615;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        } else {
            return class124.method958(arg1.length, arg1, 0, -25433);
        }
    }
}
