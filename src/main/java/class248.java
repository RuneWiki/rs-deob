import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class248 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
    public static int[] field3904 = new int[500];

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Z")
    public static boolean field3909 = false;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[Lun;")
    public static class190[] field3908;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[[[B")
    public static byte[][][] field3903;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lgh;IIIZ)V", line = 4)
    public void method1213(class248 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3911++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Lgh;", line = 15)
    public class248 method1228(int arg0, int arg1, int arg2) {
        field3906++;
        return this;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 27)
    public static void method1786(boolean arg0) {
        if (arg0) {
            field3908 = (class190[]) null;
        }
        field3903 = (byte[][][]) null;
        field3908 = null;
        field3904 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 46)
    public static final void method1787(byte arg0) {
        field3910++;
        if (arg0 != -120) {
            method1787((byte) -68);
        }
        int var1 = 0;
        int[] var2 = new int[class269.field4188];
        for (int var3 = 0; var3 < class269.field4188; var3++) {
            class316 var4 = class149.method1092((byte) -104, var3);
            if (var4.field5006 >= 0 || var4.field4942 >= 0) {
                var2[var1++] = var3;
            }
        }
        class146.field2305 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            class146.field2305[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()Z", line = 86)
    public boolean method1237() {
        field3905++;
        return false;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V", line = 96)
    public static final void method1788(int arg0, byte arg1) {
        int var2 = 109 % ((-arg1 - 26) / 44);
        field3902++;
        if (arg0 >= 0 && arg0 < class342.field5320.length) {
            class342.field5320[arg0] = !class342.field5320[arg0];
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIJILtk;)V")
    public abstract void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class151 arg10);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)V")
    public abstract void method595(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
    public abstract int method397();
}
