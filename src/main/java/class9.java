import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 extends class61 {

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "[B")
    public byte[] field152;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field156 = 0;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field161 = 0;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "Leb;")
    public static class230 field160 = class68.method589(0, "m");

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "Leb;")
    public static class230 field157 = class68.method589(0, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Leb;")
    private static class230 field155 = class68.method589(0, "Cancel");

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "Leb;")
    public static class230 field154 = class68.method589(0, " )2>");

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "Leb;")
    public static class230 field158 = field155;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "[I")
    public static int[] field162 = new int[2];

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)I")
    public static final int method85(int arg0, int arg1) {
        field163++;
        if (arg1 <= 125) {
            return 59;
        }
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)I")
    public static final int method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field151++;
        if ((arg4 & arg0) == 1) {
            int var7 = arg3;
            arg3 = arg1;
            arg1 = var7;
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 - (arg3 - 1) - arg5;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg1;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V")
    public class9(byte[] arg0) {
        this.field152 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V")
    public static void method87(byte arg0) {
        int var1 = -100 / ((arg0 - 11) / 38);
        field158 = null;
        field157 = null;
        field155 = null;
        field162 = null;
        field160 = null;
        field154 = null;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static final void method88(int arg0) {
        class135.field2433.method1124(0);
        if (arg0 >= -75) {
            method89(35, (class14) null);
        }
        class70.field1285.method1124(0);
        class245.field4259.method1124(0);
        class60.field1132.method1124(0);
        field159++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILfk;)Lwi;")
    public static final class131 method89(int arg0, class14 arg1) {
        if (arg0 != 7) {
            field155 = null;
        }
        field153++;
        class131 var2 = new class131();
        var2.field2345 = arg1.method161(4);
        var2.field2355 = class13.method136((byte) 40, var2.field2345);
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILeb;)V")
    public static final void method90(int arg0, int arg1, class230 arg2) {
        class197 var3 = class164.method1228(arg0, arg1, -1665874464);
        field164++;
        var3.method1402((byte) -102);
        var3.field3531 = arg2;
    }
}
