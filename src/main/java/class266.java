import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class266 extends class449 {

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public int field3826 = -1;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Z")
    public boolean field3829 = false;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[S")
    public static short[] field3821 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!id", name = "E", descriptor = "Z")
    public static boolean field3834 = false;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lap;")
    public static class310 field3831 = new class310(46, 16);

    @OriginalMember(owner = "client!id", name = "G", descriptor = "[[B")
    public static byte[][] field3836 = new byte[50][];

    @OriginalMember(owner = "client!id", name = "H", descriptor = "Lch;")
    public static class151 field3837 = new class151(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public int field3830;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "Lvc;")
    public static class89 field3835;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "[I")
    public static int[] field3833;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static final void method1793(int arg0) {
        field3822++;
        class142.field1985 = null;
        class181.method1300(0, -1, class364.field5007, 0, 58, 0, class238.field3475, 0, class431.field6099);
        if (class142.field1985 != null) {
            class345.method2146(class364.field5007, false, -1412584499, class431.field6099, class137.field1914, 0, class86.field1215.field2535, 0, class199.field2933, class142.field1985);
            class142.field1985 = null;
        }
        int var1 = -36 / ((arg0 - 52) / 53);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILip;Lip;)V")
    public static final void method1794(int arg0, int arg1, int arg2, class371 arg3, class371 arg4) {
        class52 var5 = class360.method2214(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field755 = arg3;
            var5.field756 = arg4;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static void method1795(boolean arg0) {
        field3836 = null;
        field3835 = null;
        field3837 = null;
        field3831 = null;
        if (arg0) {
            field3821 = null;
            field3833 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIILfo;IIBILfo;)V")
    public static final void method1796(int arg0, int arg1, int arg2, int arg3, class418 arg4, int arg5, int arg6, byte arg7, int arg8, class418 arg9) {
        field3824++;
        int var10 = arg4.method243(-28773);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class417 var12 = (class417) class239.field3506.method2113(0, (long) var10);
        if (var12 == null) {
            class355[] var13 = class355.method2189(class454.field6440, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class374.field5152.method302(var13[0], true);
            class239.field3506.method2116((long) var10, (byte) -126, var12);
        }
        class382.method2325(0, arg9.field4537, arg9.method245(4452) * 64, arg5 >> 1, arg9.field4531, arg9.field4530, arg0, arg3, (byte) 108, arg8 >> 1);
        int var14 = arg2 + class98.field1383[0] - 18;
        int var15 = arg6 + class98.field1383[1] - 16 - 54;
        int var16 = arg1 / 4 * 18 + var14;
        int var17 = arg1 % 4 * 18 + var15;
        if (arg7 > -97) {
            method1797(49, 110, (byte) -103);
        }
        var12.method2493(var16, var17);
        if (arg4 == arg9) {
            class374.field5152.method751(18, 18, var16 - 1, -256, 96, var17 - 1);
        }
        class27 var18 = class76.method669(1);
        var18.field283 = var16;
        var18.field286 = var17 + 16;
        var18.field289 = arg4;
        var18.field290 = var16 + 16;
        var18.field285 = var17;
        class255.field3658.method1765(124, var18);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)I")
    public static final int method1797(int arg0, int arg1, byte arg2) {
        field3823++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        int var4 = -36 % ((arg2 + 42) / 34);
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
    public class266(int arg0) {
        this.field3826 = arg0;
    }
}
