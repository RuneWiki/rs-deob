import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class43 extends class115 {

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    public int field899 = 12800;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    public int field902 = 0;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public int field892 = -1;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public int field900 = 12800;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public int field903 = 0;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "Z")
    public boolean field891 = true;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "I")
    public int field904 = -1;

    @OriginalMember(owner = "client!ul", name = "Y", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "Lud;")
    public class279 field901;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "Lud;")
    public class279 field896;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "Ldg;")
    public class317 field890;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    public static int field894 = 1;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "Z")
    public static volatile boolean field897 = false;

    @OriginalMember(owner = "client!ul", name = "X", descriptor = "Lud;")
    private static class279 field909 = class130.method1024("K", 255);

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "Lud;")
    public static class279 field905 = field909;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "Lud;")
    public static class279 field893 = field909;

    @OriginalMember(owner = "client!ul", name = "Z", descriptor = "Lud;")
    public static class279 field911 = class130.method1024("vert:", 255);

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ul", name = "V", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)V", line = 4)
    public final void method364(byte arg0) {
        this.field902 = 0;
        this.field900 = 12800;
        this.field899 = 12800;
        this.field903 = 0;
        if (arg0 != 32) {
            field893 = (class279) null;
        }
        for (class62 var2 = (class62) this.field890.method2248(arg0 - 139); var2 != null; var2 = (class62) this.field890.method2240(1138)) {
            if (var2.field1272 > this.field903) {
                this.field903 = var2.field1272;
            }
            if (this.field899 > var2.field1282) {
                this.field899 = var2.field1282;
            }
            if (var2.field1277 < this.field900) {
                this.field900 = var2.field1277;
            }
            if (this.field902 < var2.field1276) {
                this.field902 = var2.field1276;
            }
        }
        field907++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIII)V", line = 48)
    public static final void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -1) {
            field893 = (class279) null;
        }
        field908++;
        if (class108.field2002 < arg5 || arg2 < class135.field2463) {
            return;
        }
        boolean var6;
        if (class249.field4449 > arg4) {
            arg4 = class249.field4449;
            var6 = false;
        } else if (arg4 <= class44.field929) {
            var6 = true;
        } else {
            var6 = false;
            arg4 = class44.field929;
        }
        boolean var7;
        if (class249.field4449 > arg0) {
            var7 = false;
            arg0 = class249.field4449;
        } else if (arg0 <= class44.field929) {
            var7 = true;
        } else {
            var7 = false;
            arg0 = class44.field929;
        }
        if (class135.field2463 > arg5) {
            arg5 = class135.field2463;
        } else {
            class152.method1208(arg4, arg3, arg0, class182.field3348[arg5++], -7);
        }
        if (class108.field2002 < arg2) {
            arg2 = class108.field2002;
        } else {
            class152.method1208(arg4, arg3, arg0, class182.field3348[arg2--], arg1 - 6);
        }
        if (var6 && var7) {
            for (int var8 = arg5; var8 <= arg2; var8++) {
                int[] var9 = class182.field3348[var8];
                var9[arg4] = var9[arg0] = arg3;
            }
        } else if (var6) {
            for (int var10 = arg5; var10 <= arg2; var10++) {
                class182.field3348[var10][arg4] = arg3;
            }
        } else if (var7) {
            for (int var11 = arg5; var11 <= arg2; var11++) {
                class182.field3348[var11][arg0] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Z", line = 151)
    public final boolean method366(int arg0, int arg1, int arg2) {
        field906++;
        if (arg1 < this.field899 || arg1 > this.field903 || arg2 < this.field900 || this.field902 < arg2) {
            return false;
        }
        for (class62 var4 = (class62) this.field890.method2248(-111); var4 != null; var4 = (class62) this.field890.method2240(1138)) {
            if (var4.method545(1, arg2, arg1)) {
                return true;
            }
        }
        if (arg0 < 114) {
            method367((class279) null, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lud;Z)Z", line = 180)
    public static final boolean method367(class279 arg0, boolean arg1) {
        field898++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class194.field3498; var2++) {
            if (arg0.method2010(class248.field4417[var2], (byte) 112)) {
                return true;
            }
        }
        if (arg1) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 213)
    public static void method368(int arg0) {
        field909 = null;
        if (arg0 < -61) {
            field911 = null;
            field893 = null;
            field905 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lud;Lud;IIIZI)V", line = 278)
    public class43(class279 arg0, class279 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field891 = arg5;
        this.field892 = arg4;
        this.field910 = arg3;
        this.field901 = arg1;
        this.field904 = arg6;
        this.field895 = arg2;
        this.field896 = arg0;
        if (this.field904 == 255) {
            this.field904 = 0;
        }
        this.field890 = new class317();
    }
}
