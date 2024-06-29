import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class228 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public int field3626 = 0;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3630 = new String[5];

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Lak;")
    public static class172 field3629;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 4)
    public static void method1611(int arg0) {
        field3629 = null;
        field3630 = null;
        if (arg0 != 1) {
            field3630 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjj;B)V", line = 18)
    private final void method1612(int arg0, class44 arg1, byte arg2) {
        if (arg0 == 5) {
            this.field3626 = arg1.method271(21081);
        }
        field3625++;
        if (arg2 >= -45) {
            this.field3626 = -45;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 37)
    public static final void method1613(int arg0) {
        while (true) {
            if (class247.field3898.method2370(class219.field3540, 7) >= 11) {
                int var1 = class247.field3898.method2374(11, (byte) -36);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class74.field1049[var1] == null) {
                        var2 = true;
                        class74.field1049[var1] = new class334();
                        if (class324.field5033[var1] != null) {
                            class74.field1049[var1].method2332((byte) -14, class324.field5033[var1]);
                        }
                    }
                    class160.field2656[class275.field4435++] = var1;
                    class334 var3 = class74.field1049[var1];
                    var3.field4204 = class240.field3818;
                    int var4 = client.field1667[class247.field3898.method2374(3, (byte) -36)];
                    if (var2) {
                        var3.field4277 = var3.field4196 = var4;
                    }
                    int var5 = class247.field3898.method2374(1, (byte) -36);
                    if (var5 == 1) {
                        class322.field4988[class192.field3138++] = var1;
                    }
                    int var6 = class247.field3898.method2374(5, (byte) -36);
                    int var7 = class247.field3898.method2374(1, (byte) -36);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var8 = class247.field3898.method2374(5, (byte) -36);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method2335(class191.field3129.field4184[0] + var8, class191.field3129.field4248[0] + var6, var7 == 1, (byte) 99);
                    continue;
                }
            }
            class247.field3898.method2377((byte) 122);
            if (arg0 != -9797) {
                field3630 = (String[]) null;
            }
            field3627++;
            return;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjj;)V", line = 104)
    public final void method1614(int arg0, class44 arg1) {
        while (true) {
            int var3 = arg1.method286((byte) -82);
            if (var3 == 0) {
                field3628++;
                if (arg0 != 18770) {
                    field3629 = (class172) null;
                }
                return;
            }
            this.method1612(var3, arg1, (byte) -101);
        }
    }
}
