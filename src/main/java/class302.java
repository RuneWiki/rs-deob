import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class302 {

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4663 = null;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4665;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1986(int arg0, int arg1) {
        field4662++;
        class132.field2070.method1287(arg0, 118);
        int var2 = -46 % ((arg1 - 40) / 63);
        class280.field4318.method1287(arg0, 120);
        class46.field647.method1287(arg0, 113);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 33)
    public static void method1987(int arg0) {
        if (arg0 == -1) {
            field4663 = null;
            field4665 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 48)
    public static final void method1988(byte arg0, String arg1, boolean arg2) {
        short[] var3 = new short[16];
        String var4 = arg1.toLowerCase();
        field4660++;
        if (arg0 <= 69) {
            field4665 = (Canvas) null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < class298.field4563; var6++) {
            class291 var7 = class160.method1106(var6, -87);
            if ((!arg2 || var7.field4482) && var7.field4432 == -1 && var7.field4483 == -1 && var7.field4495 == 0 && var7.field4468.toLowerCase().indexOf(var4) != -1) {
                if (var5 >= 250) {
                    class26.field336 = -1;
                    class27.field347 = null;
                    return;
                }
                if (var3.length <= var5) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var5++] = (short) var6;
            }
        }
        class125.field1960 = 0;
        class27.field347 = var3;
        class26.field336 = var5;
        String[] var10 = new String[class26.field336];
        for (int var11 = 0; var11 < class26.field336; var11++) {
            var10[var11] = class160.method1106(var3[var11], 114).field4468;
        }
        class138.method939(false, class27.field347, var10);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILwf;Lwf;)V", line = 119)
    public static final void method1989(int arg0, class306 arg1, class306 arg2) {
        class174.field2664 = arg1;
        field4664++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class266.field4111 = arg2;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        class266.field4111.method2086(0, 34);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class197.field2961 = var5 + var6;
        class78.field1159 = var3 + var6;
        class22.field282 = var4 + var6;
        if (arg0 != -32449) {
            field4665 = (Canvas) null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)[B", line = 145)
    public static final synchronized byte[] method1990(int arg0, int arg1) {
        field4659++;
        if (arg1 == 100 && class266.field4104 > 0) {
            byte[] var2 = class225.field3588[--class266.field4104];
            class225.field3588[class266.field4104] = null;
            return var2;
        } else if (arg0 != 16) {
            return (byte[]) null;
        } else if (arg1 == 5000 && class173.field2638 > 0) {
            byte[] var3 = class81.field1194[--class173.field2638];
            class81.field1194[class173.field2638] = null;
            return var3;
        } else if (arg1 == 30000 && class257.field3999 > 0) {
            byte[] var4 = class190.field2884[--class257.field3999];
            class190.field2884[class257.field3999] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
