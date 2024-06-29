import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class324 extends class396 {

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Lgl;")
    public class357 field4576;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field4568 = -13423323;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lnm;")
    public static class277 field4570;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Lra;")
    public static class57 field4574;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "Z")
    public static boolean field4572;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V", line = 3)
    public static final void method1998(byte arg0) {
        field4569++;
        if (class135.field1886 < 1024.0F) {
            class135.field1886 = 1024.0F;
        }
        while (class276.field3893 >= 16384.0F) {
            class276.field3893 -= 16384.0F;
        }
        if (class135.field1886 > 3072.0F) {
            class135.field1886 = 3072.0F;
        }
        while (class276.field3893 < 0.0F) {
            class276.field3893 += 16384.0F;
        }
        int var1 = class297.field4241 >> 7;
        int var2 = class10.field113 >> 7;
        if (arg0 < 89) {
            method2000(124);
        }
        int var3 = class372.method2335(class10.field113, class410.field5931, (byte) 102, class297.field4241);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class410.field5931;
                    if (var7 < 3 && class278.method1759(var6, 26002, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class228.field3115 != null && class228.field3115[var7] != null) {
                        var8 = (class228.field3115[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + (var8 - class132.field1814[var7].method1990(var5, var6));
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class51.field590 < var10) {
            class51.field590 += (var10 - class51.field590) / 24;
        } else if (class51.field590 > var10) {
            class51.field590 += (var10 - class51.field590) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V", line = 93)
    public static final void method1999(int arg0, byte arg1) {
        field4571++;
        if (class266.field3716 == null) {
            class266.field3716 = new byte[4][class279.field3935][class164.field2287];
        }
        for (int var2 = arg0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class279.field3935; var3++) {
                for (int var4 = 0; var4 < class164.field2287; var4++) {
                    class266.field3716[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V", line = 130)
    public static void method2000(int arg0) {
        field4570 = null;
        field4574 = null;
        if (arg0 != 1) {
            method2001(70, 72, -108, -98);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z", line = 143)
    public static final boolean method2001(int arg0, int arg1, int arg2, int arg3) {
        if (class377.method2370(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class37.method223(var4 + 1, class132.field1814[arg0].method1990(arg1, arg2) + arg3, var5 + 1) && class37.method223(var4 + 128 - 1, class132.field1814[arg0].method1990(arg1 + 1, arg2) + arg3, var5 + 1) && class37.method223(var4 + 128 - 1, class132.field1814[arg0].method1990(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class37.method223(var4 + 1, class132.field1814[arg0].method1990(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V", line = 156)
    public static final void method2002(byte arg0, int arg1) {
        if (arg0 >= 120) {
            field4575++;
            class348 var2 = class385.method2464(14, 1302, arg1);
            var2.method2214((byte) 121);
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lgl;)V", line = 170)
    public class324(class357 arg0) {
        this.field4576 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1946(int arg0);

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Z")
    public abstract boolean method1945(int arg0);
}
