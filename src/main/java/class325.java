import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class325 extends class85 {

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public int field4161 = -1;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public int field4165 = 0;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public int field4171 = 0;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public int field4173 = -1;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Z")
    public boolean field4163 = true;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public int field4169 = 12800;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public int field4177 = 12800;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "Ljava/lang/String;")
    public String field4166;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Ljava/lang/String;")
    public String field4172;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "Ltu;")
    public class7 field4174;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lhb;")
    public static class250 field4176 = new class250(30, -1);

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Ljd;")
    public static class408 field4178 = new class408(8, 0, 4, 1);

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 203)
    public class325(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field4166 = arg2;
        this.field4163 = arg5;
        this.field4173 = arg6;
        this.field4161 = arg4;
        this.field4172 = arg1;
        this.field4175 = arg3;
        this.field4164 = arg0;
        if (this.field4173 == 255) {
            this.field4173 = 0;
        }
        this.field4174 = new class7();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 9)
    public final void method1932(int arg0) {
        this.field4171 = 0;
        field4167++;
        this.field4165 = 0;
        this.field4177 = 12800;
        if (arg0 != -5714) {
            this.field4161 = 24;
        }
        this.field4169 = 12800;
        for (class501 var2 = (class501) this.field4174.method49(-103); var2 != null; var2 = (class501) this.field4174.method46((byte) 58)) {
            if (var2.field7357 > this.field4171) {
                this.field4171 = var2.field7357;
            }
            if (var2.field7359 < this.field4169) {
                this.field4169 = var2.field7359;
            }
            if (this.field4165 < var2.field7368) {
                this.field4165 = var2.field7368;
            }
            if (this.field4177 > var2.field7369) {
                this.field4177 = var2.field7369;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[IBI)Z", line = 50)
    public final boolean method1933(int arg0, int[] arg1, byte arg2, int arg3) {
        field4160++;
        if (arg2 != 0) {
            return false;
        }
        for (class501 var5 = (class501) this.field4174.method49(-107); var5 != null; var5 = (class501) this.field4174.method46((byte) 88)) {
            if (var5.method2994(arg3, arg0, (byte) 99)) {
                var5.method2993(arg3, arg1, 241, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[IIB)Z", line = 76)
    public final boolean method1934(int arg0, int arg1, int[] arg2, int arg3, byte arg4) {
        field4162++;
        for (class501 var6 = (class501) this.field4174.method49(-114); var6 != null; var6 = (class501) this.field4174.method46((byte) 83)) {
            if (var6.method2996(arg0, arg3, 8, arg1)) {
                var6.method2995((byte) 103, arg3, arg0, arg2);
                return true;
            }
        }
        if (arg4 != -91) {
            this.field4174 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Z", line = 105)
    public final boolean method1935(int arg0, int arg1, int arg2) {
        field4168++;
        for (class501 var4 = (class501) this.field4174.method49(5); var4 != null; var4 = (class501) this.field4174.method46((byte) 76)) {
            if (var4.method2992(arg1, arg2, 1590627556)) {
                return true;
            }
        }
        if (arg0 > -70) {
            this.method1936(false, 80, null, 122);
        }
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI[II)Z", line = 129)
    public final boolean method1936(boolean arg0, int arg1, int[] arg2, int arg3) {
        field4170++;
        for (class501 var5 = (class501) this.field4174.method49(42); var5 != null; var5 = (class501) this.field4174.method46((byte) 74)) {
            if (var5.method2992(arg1, arg3, 1590627556)) {
                var5.method2995((byte) 99, arg3, arg1, arg2);
                return true;
            }
        }
        if (!arg0) {
            this.field4163 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V", line = 184)
    public static void method1937(byte arg0) {
        field4176 = null;
        field4178 = null;
        if (arg0 >= -81) {
            method1937((byte) 2);
        }
    }
}
