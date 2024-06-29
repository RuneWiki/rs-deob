import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class83 {

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "[Lwe;")
    private class408[] field1162;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "Z")
    public static boolean field1166 = false;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "J")
    private long field1159;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "Lwe;")
    private class408 field1168;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "Lrm;")
    public static class411 field1160;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)Ltaa;")
    public static final class409 method663(byte arg0, int arg1) {
        field1165++;
        class409[] var2 = class587.method3393((byte) 73);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class409 var4 = var2[var3];
            if (var4.field6167 == arg1) {
                return var4;
            }
        }
        if (arg0 != -50) {
            method663((byte) -101, 81);
        }
        return null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(JZLwe;)V")
    public final void method664(long arg0, boolean arg1, class408 arg2) {
        field1164++;
        if (arg2.field6157 != null) {
            arg2.method2597(124);
        }
        class408 var5 = this.field1162[(int) ((long) (this.field1161 - 1) & arg0)];
        arg2.field6156 = var5;
        arg2.field6157 = var5.field6157;
        arg2.field6157.field6156 = arg2;
        arg2.field6154 = arg0;
        if (!arg1) {
            this.method665(-116L, 75);
        }
        arg2.field6156.field6157 = arg2;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(JI)Lwe;")
    public final class408 method665(long arg0, int arg1) {
        field1167++;
        this.field1159 = arg0;
        class408 var4 = this.field1162[(int) ((long) (this.field1161 + arg1) & arg0)];
        for (this.field1168 = var4.field6156; this.field1168 != var4; this.field1168 = this.field1168.field6156) {
            if (this.field1168.field6154 == arg0) {
                class408 var5 = this.field1168;
                this.field1168 = this.field1168.field6156;
                return var5;
            }
        }
        this.field1168 = null;
        return null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
    public static void method666(int arg0) {
        if (arg0 != 0) {
            field1166 = false;
        }
        field1160 = null;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)Lwe;")
    public final class408 method667(int arg0) {
        field1163++;
        if (this.field1168 == null) {
            return null;
        }
        class408 var2 = this.field1162[(int) ((long) (this.field1161 - 1) & this.field1159)];
        while (this.field1168 != var2) {
            if (this.field1168.field6154 == this.field1159) {
                class408 var3 = this.field1168;
                this.field1168 = this.field1168.field6156;
                return var3;
            }
            this.field1168 = this.field1168.field6156;
        }
        this.field1168 = null;
        if (arg0 != -18653) {
            field1160 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V")
    public class83(int arg0) {
        this.field1162 = new class408[arg0];
        this.field1161 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class408 var3 = this.field1162[var2] = new class408();
            var3.field6156 = var3;
            var3.field6157 = var3;
        }
    }
}
