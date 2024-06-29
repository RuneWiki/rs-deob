import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class295 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public int field4282;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4285 = Calendar.getInstance();

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4283 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field4286 = -1;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Ljw;")
    public static class581 field4288 = new class581(76, -1);

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field4289;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field4290;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1878(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mm", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field4284++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)I", line = 13)
    public static final int method1875(String arg0, boolean arg1, String arg2, int arg3) {
        if (arg1) {
            return -78;
        }
        field4289++;
        int var4 = arg0.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || (var7 - var9) < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class319.method2025(var22, arg1);
            var9 = class319.method2025(var24, false);
            char var26 = class739.method4091(var22, (byte) -124, arg3);
            char var27 = class739.method4091(var24, (byte) -115, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class302.method1904(var28, arg3, (byte) 76) - class302.method1904(var29, arg3, (byte) 56);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg0.charAt(var16);
            char var19 = arg2.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class302.method1904(var20, arg3, (byte) 108) - class302.method1904(var21, arg3, (byte) 68);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class302.method1904(var14, arg3, (byte) 78) - class302.method1904(var15, arg3, (byte) 58);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 140)
    public static void method1876(int arg0) {
        field4285 = null;
        if (arg0 <= 114) {
            method1875(null, true, null, 24);
        }
        field4283 = null;
        field4288 = null;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(II)V", line = 154)
    public class295(int arg0, int arg1) {
        this.field4282 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 164)
    public static final boolean method1877(int arg0, String arg1) {
        field4287++;
        if (arg0 < 36) {
            field4288 = null;
        }
        return class669.method3718((byte) -101, arg1, field4290 == null ? (field4290 = method1878("ou")) : field4290);
    }
}
