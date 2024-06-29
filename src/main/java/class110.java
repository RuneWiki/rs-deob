import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class110 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 23)
    public static final void method802(int arg0) {
        field1486++;
        int var1 = class157.field2165.method2242(8, -14970);
        if (class292.field4352 > var1) {
            for (int var2 = var1; var2 < class292.field4352; var2++) {
                class290.field4323[class259.field3812++] = class4.field35[var2];
            }
        }
        if (class292.field4352 < var1) {
            throw new RuntimeException("gppov1");
        }
        class292.field4352 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class4.field35[var3];
            class241 var5 = class169.field2306[var4];
            int var6 = class157.field2165.method2242(1, -14970);
            if (var6 == 0) {
                class4.field35[class292.field4352++] = var4;
                var5.field3697 = class329.field4966;
            } else {
                int var7 = class157.field2165.method2242(2, -14970);
                if (var7 == 0) {
                    class4.field35[class292.field4352++] = var4;
                    var5.field3697 = class329.field4966;
                    class270.field4027[class252.field3614++] = var4;
                } else if (var7 == 1) {
                    class4.field35[class292.field4352++] = var4;
                    var5.field3697 = class329.field4966;
                    int var12 = class157.field2165.method2242(3, -14970);
                    var5.method1758(var12, 1, 119);
                    int var13 = class157.field2165.method2242(1, -14970);
                    if (var13 == 1) {
                        class270.field4027[class252.field3614++] = var4;
                    }
                } else if (var7 == 2) {
                    class4.field35[class292.field4352++] = var4;
                    var5.field3697 = class329.field4966;
                    if (class157.field2165.method2242(1, -14970) == 1) {
                        int var9 = class157.field2165.method2242(3, -14970);
                        var5.method1758(var9, 2, 121);
                        int var10 = class157.field2165.method2242(3, -14970);
                        var5.method1758(var10, 2, 110);
                    } else {
                        int var8 = class157.field2165.method2242(3, -14970);
                        var5.method1758(var8, 0, 108);
                    }
                    int var11 = class157.field2165.method2242(1, -14970);
                    if (var11 == 1) {
                        class270.field4027[class252.field3614++] = var4;
                    }
                } else if (var7 == 3) {
                    class290.field4323[class259.field3812++] = var4;
                }
            }
        }
        if (arg0 >= -79) {
            field1484 = -119;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)I", line = 166)
    public static final int method803(int arg0, int arg1, int arg2) {
        field1485++;
        if (arg0 == -1) {
            return 12345678;
        } else if (arg1 == -220884316) {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        } else {
            return -71;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)I", line = 234)
    public static final int method804(int arg0, byte arg1) {
        field1481++;
        if (arg1 != 72) {
            method805((byte) -58);
        }
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 262)
    public static final void method805(byte arg0) {
        field1483++;
        for (int var1 = 0; var1 < class338.field5084; var1++) {
            int var2 = class257.field3807[var1];
            class329 var3 = class42.field484[var2];
            if (var3 != null) {
                class262.method1791(-14374, var3.field4961.field2424, var3);
            }
        }
        if (arg0 > -63) {
            method805((byte) 69);
        }
    }
}
