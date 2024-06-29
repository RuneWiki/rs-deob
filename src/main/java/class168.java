import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class168 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lrv;")
    public class93 field2049 = null;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[Lcs;")
    public class289[] field2054 = null;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[Lcs;")
    public class289[] field2051 = null;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lrv;")
    public class93 field2057 = null;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lrv;")
    public class93 field2058 = null;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Z")
    public boolean field2048;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "[Lxa;")
    public static class433[] field2052;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2050;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([IZLad;BII)Lah;")
    public static final class325 method965(int[] arg0, boolean arg1, class362 arg2, byte arg3, int arg4, int arg5) {
        int var6 = -21 / ((9 - arg3) / 46);
        field2053++;
        if (!arg2.field5433 && (!class229.method1482(arg5, 44) || !class229.method1482(arg4, 29))) {
            return arg2.field5473 ? new class325(arg2, 34037, arg5, arg4, arg1, arg0) : new class325(arg2, arg5, arg4, class367.method2354(-224121456, arg5), class367.method2354(-224121456, arg4), arg0);
        } else {
            return new class325(arg2, 3553, arg5, arg4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static final void method966(int arg0) {
        field2055++;
        class33.method187(class39.field425, (byte) 99);
        class509.field7459++;
        if (arg0 != 2) {
            method966(-80);
        }
        if (class384.field5788 && class34.field386) {
            int var1 = class32.field369.method778(6);
            int var2 = class32.field369.method777((byte) 72);
            int var3 = var1 - class556.field7893;
            int var4 = var2 - class87.field994;
            if (class454.field6781 > var3) {
                var3 = class454.field6781;
            }
            if ((class454.field6781 + class273.field3821.field8570) < (class39.field425.field8570 + var3)) {
                var3 = class273.field3821.field8570 + class454.field6781 - class39.field425.field8570;
            }
            if (class332.field4782 > var4) {
                var4 = class332.field4782;
            }
            if (class39.field425.field8518 + var4 > class332.field4782 + class273.field3821.field8518) {
                var4 = class332.field4782 + class273.field3821.field8518 - class39.field425.field8518;
            }
            int var5 = var3 + class273.field3821.field8598 - class454.field6781;
            int var6 = var4 + class273.field3821.field8662 - class332.field4782;
            if (class32.field369.method3710((byte) 90)) {
                if (class509.field7459 > class39.field425.field8648) {
                    int var8 = var3 - class332.field4783;
                    int var9 = var4 - class56.field663;
                    if (var8 > class39.field425.field8663 || var8 < -class39.field425.field8663 || var9 > class39.field425.field8663 || (-class39.field425.field8663) > var9) {
                        class538.field7748 = true;
                    }
                }
                if (class39.field425.field8647 != null && class538.field7748) {
                    class86 var10 = new class86();
                    var10.field976 = class39.field425;
                    var10.field978 = var6;
                    var10.field980 = var5;
                    var10.field985 = class39.field425.field8647;
                    class604.method3516(var10);
                }
            } else {
                if (class538.field7748) {
                    class650.method3713(true);
                    if (class39.field425.field8560 != null) {
                        class86 var7 = new class86();
                        var7.field985 = class39.field425.field8560;
                        var7.field980 = var5;
                        var7.field983 = class273.field3814;
                        var7.field976 = class39.field425;
                        var7.field978 = var6;
                        class604.method3516(var7);
                    }
                    if (class273.field3814 != null && client.method1667(class39.field425) != null) {
                        class477.method2917(class273.field3814, (byte) 60, class39.field425);
                    }
                } else if ((class319.field4622 == 1 || class264.method1746((byte) 127)) && class111.field1359 > 2) {
                    class93.method593(class87.field994 + class56.field663, class556.field7893 + class332.field4783, false);
                } else if (class507.method3014(arg0 ^ 0x5EB8)) {
                    class93.method593(class87.field994 + class56.field663, class556.field7893 + class332.field4783, false);
                }
                class39.field425 = null;
            }
        } else if (class509.field7459 > 1) {
            class39.field425 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method967(byte arg0) {
        field2052 = null;
        int var1 = -81 % ((-arg0 - 5) / 58);
        field2050 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
    public static final void method968(int arg0, int arg1, int arg2) {
        class99 var3 = class431.field6408[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field1168 != null) {
            var3.field1168 = null;
        }
        if (var3.field1176 != null) {
            var3.field1176 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lad;)V")
    public class168(class362 arg0) {
        this.field2048 = arg0.field5441;
        class363.method2340(28492, arg0);
        if (this.field2048) {
            byte[] var6 = class89.method574(false, (byte) 40, class626.field9060);
            this.field2057 = new class93(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class89.method574(false, (byte) 63, class238.field3390);
            this.field2058 = new class93(arg0, 6410, 128, 128, 16, var7, 6410);
            class489 var8 = arg0.field5352;
            if (var8.method2936((byte) 80)) {
                byte[] var9 = class89.method574(false, (byte) 95, class277.field3860);
                this.field2049 = new class93(arg0, 6408, 128, 128, 16);
                class93 var10 = new class93(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method2942(-102, this.field2049, 2.0F, var10)) {
                    this.field2049.method3026(-127);
                } else {
                    this.field2049.method3023(false);
                    this.field2049 = null;
                }
                var10.method3023(false);
            }
        } else {
            this.field2054 = new class289[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class199.method1268(2, class626.field9060, 32768, var2 * 128 * 128 * 2);
                this.field2054[var2] = new class289(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field2051 = new class289[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class199.method1268(2, class238.field3390, 32768, var3 * 32768);
                this.field2051[var3] = new class289(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
