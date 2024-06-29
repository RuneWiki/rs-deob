import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class426 {

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public int field5967;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public int field5970;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Lwf;")
    public static class79 field5965 = new class79(11, 8);

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[S")
    public static short[] field5969 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "[I")
    public static int[] field5971 = new int[50];

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lir;")
    public static class22 field5968;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V")
    public abstract void method1212(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)I")
    public abstract int method1209(int arg0, int arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
    public static void method2507(boolean arg0) {
        field5965 = null;
        field5968 = null;
        field5969 = null;
        field5971 = null;
        if (!arg0) {
            method2508(42, 125L);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1220(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILtm;)Ltm;")
    public abstract class242 method1214(int arg0, int arg1, class242 arg2);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ltm;IIIIZ)V")
    public abstract void method1215(class242 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Ltm;IIIIZ)Z")
    public abstract boolean method1210(class242 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
    public abstract void method1222();

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Leo;[I)V")
    public abstract void method1211(class178 arg0, int[] arg1);

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(Ltm;IIIIZ)V")
    public abstract void method1217(class242 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1221(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I")
    public abstract int method1218(int arg0, int arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1206(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(II)V")
    public abstract void method1219(int arg0, int arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2508(int arg0, long arg1) {
        class138.field1827.setTime(new Date(arg1));
        field5966++;
        int var3 = class138.field1827.get(7);
        int var4 = class138.field1827.get(5);
        int var5 = class138.field1827.get(arg0);
        int var6 = class138.field1827.get(1);
        int var7 = class138.field1827.get(11);
        int var8 = class138.field1827.get(12);
        int var9 = class138.field1827.get(13);
        return class141.field1869[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class271.field3957[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(II)V")
    public class426(int arg0, int arg1) {
        this.field5967 = arg0;
        this.field5970 = arg1;
    }
}
