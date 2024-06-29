import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public abstract class class434 {

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "Lmt;")
    public static class401 field5974 = new class401(0, 0);

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
    public static int field5977 = -1;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    public static int field5979 = 328;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "Lhda;")
    public static class752 field5976 = new class752(25, -1);

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "Lwu;")
    public static class376 field5973;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "[[S")
    public static short[][] field5978;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1469(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZIIZII)V")
    public static final void method2495(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field5975++;
        if (arg5 > arg6) {
            int var7 = (arg5 + arg6) / 2;
            int var8 = arg6;
            class653 var9 = class721.field10045[var7];
            class721.field10045[var7] = class721.field10045[arg5];
            class721.field10045[arg5] = var9;
            for (int var10 = arg6; var10 < arg5; var10++) {
                if (class503.method2834(arg4, arg1, var9, arg0, (byte) 121, class721.field10045[var10], arg2) <= 0) {
                    class653 var11 = class721.field10045[var10];
                    class721.field10045[var10] = class721.field10045[var8];
                    class721.field10045[var8++] = var11;
                }
            }
            class721.field10045[arg5] = class721.field10045[var8];
            class721.field10045[var8] = var9;
            method2495(arg0, arg1, arg2, 69, arg4, var8 - 1, arg6);
            method2495(arg0, arg1, arg2, 69, arg4, arg5, var8 + 1);
        }
        if (arg3 != 69) {
            method2498(true, (char) 65520);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILuk;)Z")
    public static final boolean method2496(int arg0, class263 arg1) {
        field5972++;
        if (arg0 >= -113) {
            method2495(-87, false, 113, 32, false, 104, -43);
        }
        return class612.field8154 == arg1 || class672.field9266 == arg1 || class464.field6384 == arg1 || class500.field6722 == arg1;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
    public static void method2497(int arg0) {
        field5974 = null;
        field5976 = null;
        if (arg0 != 2) {
            field5976 = null;
        }
        field5978 = null;
        field5973 = null;
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1470(int arg0);

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B[B)V")
    public abstract void method1468(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZC)C")
    public static final char method2498(boolean arg0, char arg1) {
        field5971++;
        if (arg1 == 'Æ') {
            return 'E';
        }
        if (!arg0) {
            method2498(true, (char) 65452);
        }
        if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }
}
