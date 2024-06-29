import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class200 extends class312 {

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public int field3007 = 0;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public int field3008 = 0;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public int field3012 = 12800;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public int field3000 = -1;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "Z")
    public boolean field3015 = true;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public int field3023 = 12800;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
    public int field3024 = -1;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "Ljava/lang/String;")
    public String field3022;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "Ljava/lang/String;")
    public String field3021;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "Lnk;")
    public class2 field3013;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "[I")
    public static int[] field3014 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3016 = "Loading - please wait.";

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "[[I")
    public static int[][] field3011;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V", line = 4)
    public static void method1346(int arg0) {
        field3011 = (int[][]) null;
        if (arg0 == -1) {
            field3014 = null;
            field3016 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)Lfm;", line = 18)
    public static final class200 method1347(int arg0) {
        field3020++;
        if (arg0 <= 73) {
            field3004 = 33;
        }
        return class205.field3110;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(IIIII)V", line = 30)
    public static final void method1348(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class118.field1834 = arg4;
        class256.field3995 = arg3;
        class323.field5030 = arg2;
        field3018++;
        if (arg1 != 0) {
            method1346(-48);
        }
        class88.field1324 = arg0;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)[I", line = 44)
    public final int[] method1349(int arg0, int arg1, int arg2) {
        field3006++;
        for (class235 var4 = (class235) this.field3013.method10((byte) 54); var4 != null; var4 = (class235) this.field3013.method13((byte) -32)) {
            if (var4.method1599(false, arg1, arg0)) {
                return var4.method1605(arg0, arg1, (byte) -120);
            }
        }
        if (arg2 <= 79) {
            this.method1349(81, -105, -36);
        }
        return null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIB)[I", line = 69)
    public final int[] method1350(int arg0, int arg1, byte arg2) {
        field3005++;
        if (arg2 != -114) {
            this.method1349(-112, 107, -41);
        }
        for (class235 var4 = (class235) this.field3013.method10((byte) 121); var4 != null; var4 = (class235) this.field3013.method13((byte) -32)) {
            if (var4.method1606(28698, arg0, arg1)) {
                return var4.method1604((byte) -34, arg0, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 233)
    public class200(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3024 = arg6;
        if (this.field3024 == 255) {
            this.field3024 = 0;
        }
        this.field3003 = arg3;
        this.field3022 = arg2;
        this.field3010 = arg0;
        this.field3000 = arg4;
        this.field3015 = arg5;
        this.field3021 = arg1;
        this.field3013 = new class2();
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(IIB)Z", line = 119)
    public final boolean method1351(int arg0, int arg1, byte arg2) {
        if (arg2 != -86) {
            return false;
        }
        field3019++;
        for (class235 var4 = (class235) this.field3013.method10((byte) 49); var4 != null; var4 = (class235) this.field3013.method13((byte) -32)) {
            if (var4.method1606(arg2 + 28784, arg1, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BIII)[I", line = 161)
    public final int[] method1352(byte arg0, int arg1, int arg2, int arg3) {
        field3002++;
        class235 var5 = (class235) this.field3013.method10((byte) 71);
        if (arg0 < 73) {
            return (int[]) null;
        }
        while (var5 != null) {
            if (var5.method1608(arg2, -122, arg1, arg3)) {
                return var5.method1604((byte) -76, arg1, arg3);
            }
            var5 = (class235) this.field3013.method13((byte) -32);
        }
        return null;
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V", line = 197)
    public final void method1353(int arg0) {
        this.field3008 = 0;
        field3017++;
        this.field3007 = 0;
        this.field3012 = 12800;
        this.field3023 = 12800;
        for (class235 var2 = (class235) this.field3013.method10((byte) 94); var2 != null; var2 = (class235) this.field3013.method13((byte) -32)) {
            if (this.field3012 > var2.field3777) {
                this.field3012 = var2.field3777;
            }
            if (var2.field3780 > this.field3007) {
                this.field3007 = var2.field3780;
            }
            if (var2.field3778 > this.field3008) {
                this.field3008 = var2.field3778;
            }
            if (var2.field3774 < this.field3023) {
                this.field3023 = var2.field3774;
            }
        }
        if (arg0 <= 88) {
            field3025 = 29;
        }
    }
}
