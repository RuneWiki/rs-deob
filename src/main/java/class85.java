import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class85 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "J")
    public static long field970;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
    public static final void method464(byte arg0, int arg1) {
        field966++;
        class237 var2 = class337.field4789;
        synchronized (class337.field4789) {
            class337.field4789.method1629(arg1, 67);
        }
        class237 var3 = class420.field6007;
        synchronized (class420.field6007) {
            if (arg0 == 47) {
                class420.field6007.method1629(arg1, arg0 + 47);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIILrd;)Ljava/awt/Frame;")
    public static final Frame method465(int arg0, int arg1, int arg2, int arg3, int arg4, class185 arg5) {
        field967++;
        if (!arg5.method1266(21)) {
            return null;
        }
        if (arg4 == 0) {
            class337[] var6 = class167.method1129(arg5, 111);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4783 == arg0 && var6[var8].field4786 == arg3 && (arg2 == 0 || var6[var8].field4784 == arg2) && (!var7 || var6[var8].field4785 > arg4)) {
                    arg4 = var6[var8].field4785;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class315 var9 = arg5.method1261(arg0, arg2, (byte) 42, arg4, arg3);
        while (var9.field4498 == 0) {
            class150.method907(10L, (byte) -32);
        }
        Frame var10 = (Frame) var9.field4497;
        if (var10 == null) {
            return null;
        } else if (arg1 <= 103) {
            return null;
        } else if (var9.field4498 == 2) {
            class5.method43(var10, 10, arg5);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static final void method466(int arg0) {
        field968++;
        while (class359.field5120.method2140(14369, class55.field658) >= 27) {
            int var1 = class359.field5120.method2146(15, (byte) 52);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class167.field2335[var1] == null) {
                class167.field2335[var1] = new class77();
                class167.field2335[var1].field5620 = var1;
                var2 = true;
            }
            class77 var3 = class167.field2335[var1];
            class86.field981[class102.field1250++] = var1;
            var3.field5625 = class189.field2726;
            if (var3.field912 != null && var3.field912.method833(-33)) {
                class217.method1453(83, var3);
            }
            int var4 = class359.field5120.method2146(3, (byte) 52) + 4 << 11 & 0x3D68;
            int var5 = class359.field5120.method2146(1, (byte) 52);
            if (var5 == 1) {
                class150.field1853[class176.field2399++] = var1;
            }
            int var6 = class359.field5120.method2146(5, (byte) 52);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class359.field5120.method2146(5, (byte) 52);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class359.field5120.method2146(1, (byte) 52);
            var3.method431(class403.method2568(class359.field5120.method2146(14, (byte) 52), (byte) 109), 105);
            var3.method2532(0, var3.field912.field1697);
            var3.field5577 = var3.field912.field1646 << 3;
            if (var3.field5577 == 0) {
                var3.method2533(0, -75);
            } else if (var2) {
                var3.method2533(var4, -115);
            }
            var3.method2522(class129.field1570, var3.method242(-30129), class384.field5422.field5677[0] + var6, class384.field5422.field5664[0] + var7, var8 == 1, (byte) 127);
            if (var3.field912.method833(-40)) {
                class3.method15(var3, class129.field1570, (class88) null, -88, 0, var3.field5664[0], (class40) null, var3.field5677[0]);
            }
        }
        class359.field5120.method2145((byte) -53);
        if (arg0 < 55) {
            field970 = 57L;
        }
    }

    static {
        new class362((String) null, "geschickt werden.", (String) null, (String) null);
        field969 = -60;
        field970 = 0L;
        new class362("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }
}
