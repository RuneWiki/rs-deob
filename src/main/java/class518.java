import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class518 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
    public static boolean field7227 = false;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lvj;B)Lfaa;", line = 3)
    public static final class32 method3077(class26 arg0, byte arg1) {
        field7228++;
        class104 var2 = class119.method779(arg0, 0);
        if (arg1 != 26) {
            field7227 = true;
        }
        int var3 = arg0.method150(true);
        return new class32(var2.field1504, var2.field1498, var2.field1503, var2.field1506, var2.field1502, var3);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILvfa;IIIIIIILrq;I)V", line = 19)
    public static final void method3078(int arg0, int arg1, class92 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class482 arg10, int arg11) {
        class24.field271 = arg8;
        class755.field10482 = arg0;
        class220.field3096 = arg3;
        class294.field3833 = arg10;
        class509.field7101 = arg5;
        class13.field188 = null;
        field7230++;
        if (arg6 != 3408) {
            field7227 = false;
        }
        class698.field9726 = arg1;
        class270.field3646 = arg2;
        class515.field7186 = arg9;
        class269.field3633 = arg4;
        class637.field9057 = arg7;
        class757.field10527 = null;
        class204.field2928 = null;
        class306.field3971 = arg11;
        class494.method2955(10);
        class70.field987 = true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIZI)V", line = 50)
    public static final void method3079(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class48.method331((byte) 27);
        field7229++;
        class395.field5493 = 0L;
        int var5 = class615.method3609((byte) 98);
        if (arg4 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (!class96.field1401.method2099()) {
            arg0 = true;
        }
        if (!arg3) {
            method3077(null, (byte) -55);
        }
        class76.method470((byte) -47, var5, arg0, arg1, arg4, arg2);
    }
}
