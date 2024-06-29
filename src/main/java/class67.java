import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class67 extends class310 {

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    private int field980 = 0;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    private int field993 = -1;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    private int field991 = -32768;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    private int field992 = 0;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "Z")
    public boolean field979 = false;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "Lng;")
    private class162 field995;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Z")
    public static boolean field982 = false;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "Ljava/lang/String;")
    public static String field989 = "";

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "[I")
    public static int[] field994 = new int[500];

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1001 = "Members object";

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1000 = "Please wait...";

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "Lt;")
    private class254 field984;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method564(boolean arg0) {
        if (arg0) {
            class44.field683.method1428(10935);
            field981++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V", line = 23)
    public static final void method565(boolean arg0) {
        field983++;
        class34.field431.method1433(30);
        if (arg0) {
            method564(false);
        }
        class178.field2659.method1433(30);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIII)V", line = 195)
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field996 = arg4;
        this.field988 = arg5 + arg6;
        this.field990 = arg1;
        this.field998 = arg0;
        this.field1002 = arg2;
        this.field999 = arg3;
        int var8 = class99.method778(20951, this.field998).field4050;
        if (var8 == -1) {
            this.field979 = true;
        } else {
            this.field979 = false;
            this.field995 = class173.method1259((byte) 119, var8);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V", line = 63)
    public final void method566(int arg0, int arg1) {
        field1003++;
        if (this.field979) {
            return;
        }
        this.field992 += arg1;
        while (this.field995.field2423[this.field980] < this.field992) {
            this.field992 -= this.field995.field2423[this.field980];
            this.field980++;
            if (this.field980 >= this.field995.field2401.length) {
                this.field979 = true;
                break;
            }
        }
        int var3 = -81 % ((62 - arg0) / 59);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)Laj;", line = 90)
    private final class1 method567(int arg0) {
        field987++;
        if (arg0 != 0) {
            field989 = (String) null;
        }
        class269 var2 = class99.method778(arg0 + 20951, this.field998);
        class1 var3;
        if (this.field979) {
            var3 = var2.method1871((byte) -92, -1, -1, 0);
        } else {
            var3 = var2.method1871((byte) 46, this.field993, this.field980, this.field992);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()I", line = 116)
    public final int method19() {
        field1004++;
        return this.field991;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V", line = 140)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field985++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIIIJILt;)V", line = 149)
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class254 arg10) {
        field997++;
        class1 var13 = this.method567(0);
        if (var13 != null) {
            var13.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field984);
            this.field991 = var13.method19();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V", line = 173)
    public static final void method568(boolean arg0, int arg1) {
        field986++;
        class147 var2 = class92.method731(-29125, arg1, 4);
        var2.method1099(-73);
        if (!arg0) {
            method564(false);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V", line = 185)
    public static void method569(byte arg0) {
        field1001 = null;
        field989 = null;
        int var1 = -84 / ((45 - arg0) / 62);
        field1000 = null;
        field994 = null;
    }
}
