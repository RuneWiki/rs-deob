import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class414 implements class37 {

    @OriginalMember(owner = "client!op", name = "d", descriptor = "Luu;")
    private class237 field5867;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "Loda;")
    private class691 field5873;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field5868 = new String[8];

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "Lfd;")
    private class298 field5870;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)Z", line = 4)
    public static final boolean method2579(int arg0, boolean arg1) {
        if (arg1) {
            field5866++;
            return arg0 == 3 || arg0 == 7 || arg0 == 10;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BZ)V", line = 16)
    public final void method201(byte arg0, boolean arg1) {
        field5874++;
        if (arg1) {
            int var3 = class118.field1561 > class732.field10164 ? class118.field1561 : class732.field10164;
            int var4 = class553.field7716 > class84.field1195 ? class553.field7716 : class84.field1195;
            int var5 = this.field5870.method1963();
            int var6 = this.field5870.method1961();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var9 > var4) {
                var9 = var4;
                var10 = 0;
                var8 = var4 * var5 / var6;
                var7 = (var3 - var8) / 2;
            }
            this.field5870.method1959(var7, var10, var8, var9);
        }
        if (arg0 >= -74) {
            this.method202((byte) 97);
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V", line = 56)
    public static void method2580(byte arg0) {
        if (arg0 == 21) {
            field5868 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)Z", line = 67)
    public final boolean method202(byte arg0) {
        if (arg0 > -46) {
            return true;
        } else {
            field5871++;
            return this.field5867.method1578(this.field5873.field9618, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V", line = 82)
    public static final void method2581(int arg0) {
        class726.field10059 = arg0;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III)Z", line = 94)
    public static final boolean method2582(int arg0, int arg1, int arg2) {
        if (arg2 != -20157) {
            method2579(105, true);
        }
        field5872++;
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 108)
    public final void method200(int arg0) {
        field5869++;
        this.field5870 = class532.method3159(this.field5867, 0, this.field5873.field9618);
        if (arg0 <= 12) {
            method2581(103);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Luu;Loda;)V", line = 119)
    public class414(class237 arg0, class691 arg1) {
        this.field5867 = arg0;
        this.field5873 = arg1;
    }
}
