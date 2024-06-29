import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class388 {

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "Lpia;")
    public static class94 field5380 = new class94(70, -1);

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BCLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 3)
    public static final String method2394(byte arg0, char arg1, String arg2, String arg3) {
        field5376++;
        int var4 = arg2.length();
        if (arg0 >= -13) {
            return null;
        }
        int var5 = arg3.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg2.indexOf(arg1, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg2.indexOf(arg1, var10);
            if (var11 < 0) {
                var9.append(arg2.substring(var10));
                return var9.toString();
            }
            var9.append(arg2.substring(var10, var11));
            var9.append(arg3);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBI)I", line = 58)
    public final int method2395(int arg0, byte arg1, int arg2) {
        field5379++;
        int var4 = arg0 < class705.field9926 ? class705.field9926 : arg0;
        if (arg1 != -48) {
            return 115;
        } else if (class635.field9134 == this) {
            return 0;
        } else if (class652.field9309 == this) {
            return var4 - arg2;
        } else if (class754.field10528 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V", line = 85)
    public static void method2396(int arg0) {
        field5380 = null;
        if (arg0 != 0) {
            method2396(-121);
        }
    }

    @OriginalMember(owner = "client!kda", name = "toString", descriptor = "()Ljava/lang/String;", line = 95)
    public final String toString() {
        field5378++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IB)V", line = 105)
    public static final void method2397(int arg0, byte arg1) {
        field5377++;
        class47 var2 = class258.method1546(8, arg0, (byte) 121);
        var2.method274(false);
        if (arg1 > -87) {
            method2396(88);
        }
    }
}
