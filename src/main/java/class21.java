import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 {

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Lvp;")
    public static class123 field304 = new class123(8, -1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field301;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method174(int arg0) {
        field299++;
        class49.field733 = null;
        class121.method914(-1, (byte) 114, 0, 0, class477.field7003, class112.field1780, class341.field5207, 0, 0);
        if (class49.field733 != null) {
            class296.method1825(class49.field733, class188.field2790, 1, class477.field7003, -1412584499, 0, class216.field3103.field984, class153.field2342, 0, class112.field1780);
            class49.field733 = null;
        }
        if (arg0 != 2) {
            field306 = 91;
        }
    }

    @OriginalMember(owner = "client!nc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field300++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static void method175(int arg0) {
        field301 = null;
        if (arg0 == -15855) {
            field304 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLci;ILjava/awt/Component;)Lig;")
    public static final class160 method176(int arg0, byte arg1, class312 arg2, int arg3, Component arg4) {
        field298++;
        if (class471.field6941 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class160 var5 = (class160) Class.forName("ok").getDeclaredConstructor().newInstance();
                var5.field2416 = new int[(class275.field3991 ? 2 : 1) * 256];
                var5.field2433 = arg0;
                var5.method1163(arg4);
                var5.field2421 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field2421 > 16384) {
                    var5.field2421 = 16384;
                }
                var5.method1161(var5.field2421);
                if (class364.field5480 > 0 && class230.field3353 == null) {
                    class230.field3353 = new class120();
                    class230.field3353.field1883 = arg2;
                    arg2.method1959(-91, class364.field5480, class230.field3353);
                }
                if (class230.field3353 != null) {
                    if (class230.field3353.field1884[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class230.field3353.field1884[arg3] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    int var6 = 11 / ((arg1 - 86) / 32);
                    class252 var7 = new class252(arg2, arg3);
                    var7.field2433 = arg0;
                    var7.field2416 = new int[(class275.field3991 ? 2 : 1) * 256];
                    var7.method1163(arg4);
                    var7.field2421 = 16384;
                    var7.method1161(var7.field2421);
                    if (class364.field5480 > 0 && class230.field3353 == null) {
                        class230.field3353 = new class120();
                        class230.field3353.field1883 = arg2;
                        arg2.method1959(-63, class364.field5480, class230.field3353);
                    }
                    if (class230.field3353 != null) {
                        if (class230.field3353.field1884[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class230.field3353.field1884[arg3] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class160();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIZZ)I")
    public static final int method177(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field303++;
        class78 var5 = class192.method1311(arg0, arg4, -29496);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = arg2; var7 < var5.field1306.length; var7++) {
            if (var5.field1306[var7] >= 0 && class8.field111.field7658 > var5.field1306[var7]) {
                class172 var8 = class8.field111.method3077(56, var5.field1306[var7]);
                int var9 = var8.method1226(0, arg1, class219.field3164.method2570((byte) -32, arg1).field1529);
                if (arg3) {
                    var6 += var5.field1302[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)I")
    public static final int method178(int arg0, byte arg1, int arg2) {
        if (arg1 != -106) {
            return 27;
        }
        field305++;
        int var3 = (class320.method2005(4, (byte) 118, arg0 + 91923, arg2 - -45365) - (-(class320.method2005(2, (byte) 114, arg0 + 37821, arg2 + 10294) - 128 >> 1) - (class320.method2005(1, (byte) 114, arg0, arg2) - 128 >> 2))) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
    public class21(int arg0) {
        this.field302 = arg0;
    }
}
