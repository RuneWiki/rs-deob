import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class256 extends class259 {

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "Z")
    public static boolean field3942 = false;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field3949 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "Lpj;")
    public static class284 field3947 = new class284();

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3950 = "Attack";

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "[I")
    public static int[] field3937;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
    public abstract void method1226(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)V")
    public static void method1733(byte arg0) {
        field3937 = null;
        field3949 = null;
        field3950 = null;
        field3947 = null;
        if (arg0 >= -76) {
            field3950 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
    public abstract void method1225(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIII)V")
    public final void method1734(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field3943 << 3;
        int var7 = this.field3941 << 3;
        int var8 = (arg1 << 4) + (arg2 & var6);
        field3938++;
        int var9 = (arg4 << 4) + (var7 & 0xF);
        this.method1231(var7, var6, var9, var8, arg3, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(II)V")
    public abstract void method1230(int arg0, int arg1);

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(II)Ljava/lang/String;")
    public static final String method1735(int arg0, int arg1) {
        field3940++;
        if (arg0 != 1788373316) {
            field3937 = null;
        }
        return arg1 < 999999999 ? Integer.toString(arg1) : "*";
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(II)V")
    public abstract void method1234(int arg0, int arg1);

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(II)V")
    public abstract void method1227(int arg0, int arg1);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
    public abstract void method1229(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
