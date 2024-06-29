import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class297 extends class36 {

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
    public int field4405 = 12800;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
    public int field4410 = -1;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "Z")
    public boolean field4398 = true;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
    public int field4408 = 0;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
    public int field4414 = -1;

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
    public int field4415 = 12800;

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
    public int field4413 = 0;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "Ljava/lang/String;")
    public String field4399;

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "Ljava/lang/String;")
    public String field4406;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "Lhi;")
    public class192 field4400;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    public static int field4401 = 3;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)Ldi;", line = 24)
    public static final class186 method2020(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class186 var4 = var3.field2887;
            var3.field2887 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V", line = 38)
    public final void method2021(int arg0) {
        this.field4405 = 12800;
        this.field4408 = 0;
        field4409++;
        this.field4413 = 0;
        this.field4415 = arg0;
        for (class151 var2 = (class151) this.field4400.method1335(arg0 ^ 0x3201); var2 != null; var2 = (class151) this.field4400.method1336(3)) {
            if (var2.field2098 < this.field4405) {
                this.field4405 = var2.field2098;
            }
            if (var2.field2110 > this.field4413) {
                this.field4413 = var2.field2110;
            }
            if (this.field4408 < var2.field2105) {
                this.field4408 = var2.field2105;
            }
            if (this.field4415 > var2.field2090) {
                this.field4415 = var2.field2090;
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 202)
    public class297(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4398 = arg5;
        this.field4399 = arg2;
        this.field4406 = arg1;
        this.field4402 = arg3;
        this.field4410 = arg4;
        this.field4404 = arg0;
        this.field4414 = arg6;
        if (this.field4414 == 255) {
            this.field4414 = 0;
        }
        this.field4400 = new class192();
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)Z", line = 74)
    public final boolean method2022(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field4400 = (class192) null;
        }
        field4411++;
        for (class151 var4 = (class151) this.field4400.method1335(1); var4 != null; var4 = (class151) this.field4400.method1336(3)) {
            if (var4.method1099(arg2, arg1, true)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BII)[I", line = 102)
    public final int[] method2023(byte arg0, int arg1, int arg2) {
        field4397++;
        for (class151 var4 = (class151) this.field4400.method1335(1); var4 != null; var4 = (class151) this.field4400.method1336(3)) {
            if (var4.method1099(arg1, arg2, true)) {
                return var4.method1092(-25445, arg2, arg1);
            }
        }
        int var5 = 40 % ((44 - arg0) / 62);
        return null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBII)[I", line = 126)
    public final int[] method2024(int arg0, byte arg1, int arg2, int arg3) {
        field4403++;
        if (arg1 != 93) {
            this.field4405 = 4;
        }
        for (class151 var5 = (class151) this.field4400.method1335(1); var5 != null; var5 = (class151) this.field4400.method1336(3)) {
            if (var5.method1096(arg0, -123, arg2, arg3)) {
                return var5.method1092(-25445, arg0, arg2);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 155)
    public static final void method2025(String arg0, byte arg1) {
        field4407++;
        if (class344.field5239 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class77.method584(arg0, 92);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class344.field5239.length && class344.field5239[var2].field2522 != var3) {
            var2++;
        }
        if (var2 < class344.field5239.length && class344.field5239[var2] != null) {
            int var5 = 93 / ((arg1 - 33) / 59);
            class324.field4907++;
            class90.field1264.method2238(222, (byte) -128);
            class90.field1264.method2202(class344.field5239[var2].field2522, -105);
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(III)[I", line = 221)
    public final int[] method2026(int arg0, int arg1, int arg2) {
        if (arg1 > -7) {
            return (int[]) null;
        }
        field4412++;
        for (class151 var4 = (class151) this.field4400.method1335(1); var4 != null; var4 = (class151) this.field4400.method1336(3)) {
            if (var4.method1100(arg0, (byte) 97, arg2)) {
                return var4.method1093(0, arg2, arg0);
            }
        }
        return null;
    }
}
