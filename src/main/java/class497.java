import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class497 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lpp;")
    public class640 field7293;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public int field7292;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7294 = new String[] { method3824(method3823("v`m2nij70/")), method3824(method3823("|-m z")), method3824(method3823("iv/b")), method3824(method3823("v`mD/")), method3824(method3823("v`mE/")) };

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "D")
    public static double field7289;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V", line = 5)
    public final void method3821(int arg0, int arg1) {
        try {
            if (arg1 != ~this.method1029((byte) -73, arg0)) {
                this.method1030(64, arg0);
            }
            field7291++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7294[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 22)
    public static final void method3822(boolean arg0) {
        try {
            field7290++;
            if (class189.field2516 != 0) {
                try {
                    if (++class399.field5822 > 2000) {
                        class60.field911.method5604(1350);
                        if (class723.field10286 >= 2) {
                            class189.field2516 = 0;
                            class121.field1533 = -5;
                            return;
                        }
                        class671.field9456.method5713(96);
                        class399.field5822 = 0;
                        class189.field2516 = 1;
                        class723.field10286++;
                    }
                    if (class189.field2516 == 1) {
                        class60.field911.field11088 = class671.field9456.method5709(43594, class651.field9249);
                        class189.field2516 = 2;
                    }
                    if (class189.field2516 == 2) {
                        if (class60.field911.field11088.field4486 == 2) {
                            throw new IOException();
                        }
                        if (class60.field911.field11088.field4486 != 1) {
                            return;
                        }
                        class60.field911.field11096 = class684.method4900((byte) -45, (Socket) class60.field911.field11088.field4487, 15000);
                        class60.field911.field11088 = null;
                        class60.field911.method5603(0);
                        class189.field2516 = 4;
                    }
                    if (arg0) {
                        field7289 = 0.7367476821080875D;
                    }
                    if (class189.field2516 == 4 && class60.field911.field11096.method316(-120, 1)) {
                        class60.field911.field11096.method313(0, -28221, 1, class60.field911.field11099.field9996);
                        int var1 = class60.field911.field11099.field9996[0] & 0xFF;
                        class121.field1533 = var1;
                        class189.field2516 = 0;
                        class60.field911.method5604(1350);
                    }
                } catch (IOException var3) {
                    class60.field911.method5604(1350);
                    if (class723.field10286 < 2) {
                        class671.field9456.method5713(98);
                        class189.field2516 = 1;
                        class723.field10286++;
                        class399.field5822 = 0;
                    } else {
                        class121.field1533 = -4;
                        class189.field2516 = 0;
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7294[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lpp;)V", line = 115)
    public class497(class640 arg0) {
        try {
            this.field7293 = arg0;
            this.field7292 = this.method1032(-112);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7294[0] + (arg0 == null ? field7294[2] : field7294[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILpp;)V", line = 126)
    public class497(int arg0, class640 arg1) {
        try {
            this.field7292 = arg0;
            this.field7293 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7294[0] + arg0 + ',' + (arg1 == null ? field7294[2] : field7294[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I")
    public abstract int method1032(int arg0);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    public abstract void method1030(int arg0, int arg1);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public abstract void method1031(byte arg0);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
    public abstract int method1029(byte arg0, int arg1);

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3823(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3824(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 67;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
