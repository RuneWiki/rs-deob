import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class440 extends class617 {

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
    public int field6168 = 12800;

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    public int field6176 = 12800;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    public int field6175 = 0;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
    public int field6177 = -1;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
    public int field6170 = -1;

    @OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
    public int field6182 = 0;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "Z")
    public boolean field6179 = true;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    public int field6169;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public int field6178;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "Ljava/lang/String;")
    public String field6180;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "Ljava/lang/String;")
    public String field6173;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "Lgk;")
    public class616 field6174;

    @OriginalMember(owner = "client!ss", name = "Q", descriptor = "[I")
    public static int[] field6184 = new int[128];

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!ss", name = "P", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public final void method2536(int arg0) {
        this.field6168 = 12800;
        this.field6175 = 0;
        this.field6182 = 0;
        this.field6176 = arg0;
        field6167++;
        for (class222 var2 = (class222) this.field6174.method3434((byte) 2); var2 != null; var2 = (class222) this.field6174.method3430(true)) {
            if (var2.field2763 > this.field6175) {
                this.field6175 = var2.field2763;
            }
            if (this.field6176 > var2.field2752) {
                this.field6176 = var2.field2752;
            }
            if (this.field6182 < var2.field2760) {
                this.field6182 = var2.field2760;
            }
            if (this.field6168 > var2.field2762) {
                this.field6168 = var2.field2762;
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
    public static void method2537(byte arg0) {
        if (arg0 > -111) {
            field6184 = null;
        }
        field6184 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)Lvn;")
    public static final class360 method2538(boolean arg0) {
        field6166++;
        if (arg0) {
            return null;
        }
        try {
            return (class360) Class.forName("eea").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZII)V")
    public static final void method2539(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field6183++;
        if (class255.method1506(arg1, (byte) 113) && arg0 >= 11) {
            class272.method1597(83, arg2, arg3, arg4, -1, class102.field1106[arg1]);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III[II)Z")
    public final boolean method2540(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field6171++;
        if (arg0 != -25551) {
            return false;
        }
        for (class222 var6 = (class222) this.field6174.method3434((byte) 2); var6 != null; var6 = (class222) this.field6174.method3430(true)) {
            if (var6.method1339(arg1, arg4, arg2, 0)) {
                var6.method1342(arg3, arg1, arg2, (byte) -4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Z")
    public final boolean method2541(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method2543(-112, null, 74, (byte) 2);
        }
        field6165++;
        for (class222 var4 = (class222) this.field6174.method3434((byte) 2); var4 != null; var4 = (class222) this.field6174.method3430(true)) {
            if (var4.method1340(arg2, arg0, -94)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II[II)Z")
    public final boolean method2542(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 != -3763) {
            this.field6178 = -39;
        }
        field6181++;
        for (class222 var5 = (class222) this.field6174.method3434((byte) 2); var5 != null; var5 = (class222) this.field6174.method3430(true)) {
            if (var5.method1340(arg3, arg1, 87)) {
                var5.method1342(arg2, arg3, arg1, (byte) -4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[IIB)Z")
    public final boolean method2543(int arg0, int[] arg1, int arg2, byte arg3) {
        field6172++;
        for (class222 var5 = (class222) this.field6174.method3434((byte) 2); var5 != null; var5 = (class222) this.field6174.method3430(true)) {
            if (var5.method1346(arg0, false, arg2)) {
                var5.method1338(arg1, arg0, -1, arg2);
                return true;
            }
        }
        int var6 = 61 / ((49 - arg3) / 46);
        return false;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class440(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field6169 = arg3;
        this.field6178 = arg0;
        this.field6177 = arg4;
        this.field6170 = arg6;
        this.field6180 = arg2;
        this.field6179 = arg5;
        this.field6173 = arg1;
        if (this.field6170 == 255) {
            this.field6170 = 0;
        }
        this.field6174 = new class616();
    }

    static {
        for (int var0 = 0; var0 < field6184.length; var0++) {
            field6184[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field6184[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field6184[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field6184[var3] = var3 + 4;
        }
        field6184[42] = field6184[43] = 62;
        field6184[45] = field6184[47] = 63;
    }
}
