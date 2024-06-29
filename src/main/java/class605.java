import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class605 extends class263 {

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public int field8141;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public int field8142;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public int field8143;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field8144;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field8145;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field8146;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public int field8147;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public int field8150;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public int field8151;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public int field8153;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public int field8154;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public int field8155;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public int field8156;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public int field8157;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public int field8158;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field8159;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3358(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3355(int arg0) throws IOException {
        if (class335.field4139 != null && class95.field1235 > 0) {
            int var1 = 0;
            while (true) {
                class124 var2 = (class124) class394.field5025.method1909(true);
                if (var2 == null) {
                    class169.field1984 += var1;
                    class299.field3800 = 0;
                    break;
                }
                class335.field4139.method2515(var2.field1515, var2.field1516.field7318, 0, (byte) 80);
                var1 += var2.field1515;
                class95.field1235 -= var2.field1515;
                var2.method1566(-49);
                var2.field1516.method3041(-1);
                var2.method825(false);
            }
        }
        field8148++;
        int var3 = -53 % ((arg0 - 19) / 61);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 37)
    public static final void method3356(byte arg0) {
        field8149++;
        int var1 = 0;
        if (class611.field8310 != null) {
            var1 = class611.field8310.method2736(arg0 ^ 0xFFFFFFB7, class628.field8526);
        }
        if (var1 == 2) {
            int var2 = class578.field7765 > 800 ? 800 : class578.field7765;
            int var3 = class200.field2327 <= 600 ? class200.field2327 : 600;
            class151.field1799 = (class578.field7765 - var2) / 2;
            class309.field3890 = var2;
            class398.field5063 = 0;
            class491.field6129 = var3;
        } else if (var1 == 1) {
            int var4 = class578.field7765 <= 1024 ? class578.field7765 : 1024;
            class309.field3890 = var4;
            class151.field1799 = (class578.field7765 - var4) / 2;
            int var5 = class200.field2327 > 768 ? 768 : class200.field2327;
            class491.field6129 = var5;
            class398.field5063 = 0;
        } else {
            class309.field3890 = class578.field7765;
            class151.field1799 = 0;
            class398.field5063 = 0;
            class491.field6129 = class200.field2327;
        }
        if (arg0 != 101) {
            method3356((byte) -58);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILoa;)Lba;", line = 95)
    public final class359 method3357(int arg0, int arg1, class650 arg2) {
        field8152++;
        if (arg0 != -28298) {
            return null;
        }
        int var4 = class158.field1876[this.field8155];
        class359 var5 = null;
        if (var4 == 0) {
            class567 var12 = class593.method3281(this.field8158, this.field8157, this.field8141);
            if (var12 instanceof class21) {
                class21 var13 = (class21) var12;
                if (var13.field226 != null) {
                    var5 = ((class310) var13.field226).method134(arg2, (byte) 96, arg1);
                }
            }
        } else if (var4 == 1) {
            class539 var6 = class546.method2924(this.field8158, this.field8157, this.field8141);
            if (var6 instanceof class322) {
                class322 var7 = (class322) var6;
                if (var7.field4004 != null) {
                    var5 = ((class310) var7.field4004).method134(arg2, (byte) 119, arg1);
                }
            }
        } else if (var4 == 2) {
            class597 var10 = class513.method2796(this.field8158, this.field8157, this.field8141, field8159 == null ? (field8159 = method3358("pba")) : field8159);
            if (var10 instanceof class484) {
                class484 var11 = (class484) var10;
                if (var11.field6007 != null) {
                    var5 = ((class310) var11.field6007).method134(arg2, (byte) 91, arg1);
                }
            }
        } else if (var4 == 3) {
            class445 var8 = class618.method3444(this.field8158, this.field8157, this.field8141);
            if (var8 instanceof class471) {
                class471 var9 = (class471) var8;
                if (var9.field5820 != null) {
                    var5 = ((class310) var9.field5820).method134(arg2, (byte) 100, arg1);
                }
            }
        }
        return var5 == null ? null : var5.method951((byte) 0, arg1, true);
    }
}
