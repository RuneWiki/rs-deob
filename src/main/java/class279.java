import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class279 extends class287 {

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field4301 = 0;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "J")
    public long field4294;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "Luj;")
    public static class169 field4302;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Lug;")
    public static class253 field4297;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lwa;")
    public class279 field4295;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Lwa;")
    public class279 field4299;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V", line = 6)
    public static final void method1958(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class314.field4916; var3++) {
            for (int var4 = 0; var4 < class131.field1938; var4++) {
                for (int var5 = 0; var5 < class308.field4794; var5++) {
                    class124 var6 = class83.field1138[var3][var4][var5];
                    if (var6 != null) {
                        class102 var7 = var6.field1775;
                        if (var7 != null && var7.field1362.method1237()) {
                            class83.method607(var7.field1362, var3, var4, var5, 1, 1);
                            if (var7.field1365 != null && var7.field1365.method1237()) {
                                class83.method607(var7.field1365, var3, var4, var5, 1, 1);
                                var7.field1362.method1213(var7.field1365, 0, 0, 0, false);
                                var7.field1365 = var7.field1365.method1228(arg0, arg1, arg2);
                            }
                            var7.field1362 = var7.field1362.method1228(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1798; var8++) {
                            class263 var9 = var6.field1783[var8];
                            if (var9 != null && var9.field4118.method1237()) {
                                class83.method607(var9.field4118, var3, var4, var5, var9.field4115 + 1 - var9.field4124, var9.field4126 - var9.field4127 + 1);
                                var9.field4118 = var9.field4118.method1228(arg0, arg1, arg2);
                            }
                        }
                        class138 var10 = var6.field1788;
                        if (var10 != null && var10.field2205.method1237()) {
                            class260.method1866(var10.field2205, var3, var4, var5);
                            var10.field2205 = var10.field2205.method1228(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V", line = 78)
    public static void method1959(int arg0) {
        field4297 = null;
        if (arg0 == 11958) {
            field4302 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V", line = 91)
    public final void method1960(int arg0) {
        if (arg0 != -27621) {
            this.field4294 = 101L;
        }
        field4300++;
        if (this.field4295 != null) {
            this.field4295.field4299 = this.field4299;
            this.field4299.field4295 = this.field4295;
            this.field4299 = null;
            this.field4295 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BB)[B", line = 118)
    public static final byte[] method1961(byte[] arg0, byte arg1) {
        int var2 = -27 % ((arg1 - 16) / 49);
        field4296++;
        int var3 = arg0.length;
        byte[] var4 = new byte[var3];
        class54.method422(arg0, 0, var4, 0, var3);
        return var4;
    }
}
