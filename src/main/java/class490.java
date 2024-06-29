import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class490 {

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public int field7069 = 8;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    public int field7071 = 16777215;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "F")
    public static float field7077 = 1024.0F;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public int field7064;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public int field7065;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public int field7066;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public int field7070;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public int field7076;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "Z")
    public boolean field7072;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILofa;I)V")
    private final void method2972(int arg0, class301 arg1, int arg2) {
        if (arg0 != 256) {
            return;
        }
        if (arg2 == 1) {
            this.field7069 = arg1.method1989((byte) -57);
        } else if (arg2 == 2) {
            this.field7072 = true;
        } else if (arg2 == 3) {
            this.field7065 = arg1.method1977((byte) 100);
            this.field7066 = arg1.method1977((byte) 31);
            this.field7070 = arg1.method1977((byte) -120);
        } else if (arg2 == 4) {
            this.field7064 = arg1.method1987(-6);
        } else if (arg2 == 5) {
            this.field7076 = arg1.method1989((byte) -82);
        } else if (arg2 == 6) {
            this.field7071 = arg1.method1952(22085);
        }
        field7067++;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIZIIIII)Z")
    public static final boolean method2973(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7068++;
        int var9 = class145.field2251.field1702[0];
        int var10 = class145.field2251.field1704[0];
        if (var9 < 0 || var9 >= class191.field3229 || var10 < 0 || var10 >= class314.field4720) {
            return false;
        } else if (arg0 < 0 || arg0 >= class191.field3229 || arg7 < 0 || class314.field4720 <= arg7) {
            return false;
        } else if (arg2 == -30526) {
            int var11 = class606.method3475(var9, arg7, arg1, var10, arg3, class145.field2251.method878(-5740), arg8, arg0, class247.field3958[class145.field2251.field9470], class563.field7977, arg6, class423.field6227, arg5, arg4, 0);
            if (var11 < 1) {
                return false;
            }
            class404.field5991 = class563.field7977[var11 - 1];
            class257.field4036 = class423.field6227[var11 - 1];
            class382.field5740 = false;
            class508.method3061((byte) 85);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lfc;Ljava/awt/Component;III)Len;")
    public static final class107 method2974(class731 arg0, Component arg1, int arg2, int arg3, int arg4) {
        field7074++;
        if (class608.field8585 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class107 var5 = (class107) Class.forName("hda").getDeclaredConstructor().newInstance();
                var5.field1578 = arg4;
                var5.field1567 = new int[(class53.field849 ? 2 : 1) * 256];
                var5.method867(arg1);
                var5.field1574 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field1574 > 16384) {
                    var5.field1574 = 16384;
                }
                var5.method876(var5.field1574);
                if (class411.field6064 > 0 && class125.field1935 == null) {
                    class125.field1935 = new class293();
                    class125.field1935.field4505 = arg0;
                    arg0.method4066(-24533, class125.field1935, class411.field6064);
                }
                if (class125.field1935 != null) {
                    if (class125.field1935.field4500[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class125.field1935.field4500[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class712 var6 = new class712(arg0, arg3);
                    var6.field1578 = arg4;
                    var6.field1567 = new int[(class53.field849 ? 2 : 1) * 256];
                    if (arg2 >= -32) {
                        method2973(83, -89, 87, true, -118, 35, 124, -92, 36);
                    }
                    var6.method867(arg1);
                    var6.field1574 = 16384;
                    var6.method876(var6.field1574);
                    if (class411.field6064 > 0 && class125.field1935 == null) {
                        class125.field1935 = new class293();
                        class125.field1935.field4505 = arg0;
                        arg0.method4066(-24533, class125.field1935, class411.field6064);
                    }
                    if (class125.field1935 != null) {
                        if (class125.field1935.field4500[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class125.field1935.field4500[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class107();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lofa;I)V")
    public final void method2975(class301 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1987(-28);
            if (var3 == 0) {
                if (arg1 != 14497) {
                    method2974(null, null, -11, -119, 126);
                }
                field7073++;
                return;
            }
            this.method2972(256, arg0, var3);
        }
    }
}
