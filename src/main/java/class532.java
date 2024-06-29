import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class532 extends class392 {

    @OriginalMember(owner = "client!de", name = "x", descriptor = "Lrk;")
    public class33 field7226;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "[Llk;")
    public static class588[] field7227;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IIB)Z", line = 4)
    public static final boolean method2944(int arg0, int arg1, byte arg2) {
        field7224++;
        if (!class83.field1156) {
            return false;
        }
        if (arg2 != 6) {
            method2944(-33, 90, (byte) -77);
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class357.field4742[var3] == null || class357.field4742[var3][var4] == null) {
            return false;
        }
        class218 var5 = class357.field4742[var3][var4];
        if (arg1 == -1 && var5.field2832 == 0) {
            for (class227 var6 = (class227) class139.field1783.method724(32); var6 != null; var6 = (class227) class139.field1783.method723(arg2 + 99)) {
                if (var6.field2948 == 59 || var6.field2948 == 1006 || var6.field2948 == 21 || var6.field2948 == 49 || var6.field2948 == 9) {
                    for (class218 var7 = class357.method2056(var6.field2951, arg2 ^ 0xFFFFD9A2); var7 != null; var7 = class463.method2580(true, var7)) {
                        if (var5.field2708 == var7.field2708) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class227 var8 = (class227) class139.field1783.method724(32); var8 != null; var8 = (class227) class139.field1783.method723(112)) {
                if (var8.field2953 == arg1 && var5.field2708 == var8.field2951 && (var8.field2948 == 59 || var8.field2948 == 1006 || var8.field2948 == 21 || var8.field2948 == 49 || var8.field2948 == 9)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBI)I", line = 76)
    public static final int method2945(int arg0, byte arg1, int arg2) {
        field7225++;
        if (arg1 <= 103) {
            return 86;
        } else {
            int var3 = arg0 >>> 24;
            int var4 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | (arg0 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
            int var5 = 255 - var3;
            return (((arg2 & 0xFF00) * var5 & 0xFF0000 | (arg2 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 92)
    public static void method2946(byte arg0) {
        field7227 = null;
        if (arg0 != 78) {
            field7227 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lrk;)V", line = 101)
    public class532(class33 arg0) {
        this.field7226 = arg0;
    }
}
