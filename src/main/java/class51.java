import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class51 extends class191 {

    @OriginalMember(owner = "client!f", name = "O", descriptor = "[Lle;")
    public class112[] field1153;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "Ldd;")
    private static class35 field1152 = class180.method1196((byte) -45, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field1144 = -1;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "[Lkd;")
    public static class102[] field1154 = new class102[2048];

    @OriginalMember(owner = "client!f", name = "K", descriptor = "Ldd;")
    public static class35 field1149 = field1152;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "Ldd;")
    public static class35 field1157 = class180.method1196((byte) 127, ":assistreq:");

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Lac;")
    public static class4 field1151;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "[I")
    public static int[] field1155;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "[Lbg;")
    public static class18[] field1147;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Le;Ljava/lang/Object;B)V")
    public static final void method453(class41 arg0, Object arg1, byte arg2) {
        field1148++;
        if (arg0.field912 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field912.peekEvent() != null; var3++) {
            class204.method1347(1L, false);
        }
        if (arg2 >= -94) {
            field1144 = 98;
        }
        if (arg1 != null) {
            arg0.field912.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
    public static void method454(byte arg0) {
        field1154 = null;
        field1155 = null;
        field1151 = null;
        field1149 = null;
        field1152 = null;
        field1157 = null;
        field1147 = null;
        if (arg0 >= -120) {
            field1154 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILdd;IZ)V")
    public static final void method455(int arg0, int arg1, class35 arg2, int arg3, boolean arg4) {
        class55 var5 = class19.method171((byte) -119, arg3, arg1);
        field1145++;
        if (var5 == null) {
            return;
        }
        if (var5.field1356 != null) {
            class200 var6 = new class200();
            var6.field3995 = var5;
            var6.field4011 = arg2;
            var6.field4010 = var5.field1356;
            var6.field4013 = arg0;
            class1.method2(var6, (byte) -97);
        }
        boolean var7 = arg4;
        if (var5.field1299 > 0) {
            var7 = class54.method475((byte) -38, var5);
        }
        if (!var7 || !class49.method435(0, arg0 - 1, class59.method508(var5, (byte) 32))) {
            return;
        }
        if (arg0 == 1) {
            class1.field11.method659(57, true);
            class1.field11.method249(arg3, -121);
            class141.field2981++;
            class1.field11.method264(arg1, -106);
        }
        if (arg0 == 2) {
            class1.field11.method659(54, true);
            class1.field11.method249(arg3, -118);
            class1.field11.method264(arg1, -122);
            class46.field1009++;
        }
        if (arg0 == 3) {
            class92.field2041++;
            class1.field11.method659(219, true);
            class1.field11.method249(arg3, 109);
            class1.field11.method264(arg1, -118);
        }
        if (arg0 == 4) {
            class19.field364++;
            class1.field11.method659(36, true);
            class1.field11.method249(arg3, -69);
            class1.field11.method264(arg1, -107);
        }
        if (arg0 == 5) {
            class1.field11.method659(215, true);
            class8.field125++;
            class1.field11.method249(arg3, 65);
            class1.field11.method264(arg1, -121);
        }
        if (arg0 == 6) {
            class173.field3508++;
            class1.field11.method659(222, true);
            class1.field11.method249(arg3, 65);
            class1.field11.method264(arg1, -108);
        }
        if (arg0 == 7) {
            class103.field2299++;
            class1.field11.method659(24, true);
            class1.field11.method249(arg3, 70);
            class1.field11.method264(arg1, -118);
        }
        if (arg0 == 8) {
            class161.field3278++;
            class1.field11.method659(56, true);
            class1.field11.method249(arg3, -127);
            class1.field11.method264(arg1, -120);
        }
        if (arg0 == 9) {
            class93.field2065++;
            class1.field11.method659(218, true);
            class1.field11.method249(arg3, 110);
            class1.field11.method264(arg1, -103);
        }
        if (arg0 == 10) {
            class172.field3437++;
            class1.field11.method659(108, true);
            class1.field11.method249(arg3, -117);
            class1.field11.method264(arg1, -117);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lsb;")
    public static final class172 method456(Throwable arg0, String arg1) {
        field1146++;
        class172 var2;
        if (arg0 instanceof class172) {
            var2 = (class172) arg0;
            var2.field3439 = var2.field3439 + ' ' + arg1;
        } else {
            var2 = new class172(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lag;Lag;IZ)V")
    public class51(class8 arg0, class8 arg1, int arg2, boolean arg3) {
        class187 var5 = new class187();
        int var6 = arg0.method56((byte) 31, arg2);
        this.field1153 = new class112[var6];
        int[] var7 = arg0.method61(arg2, 120);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class7 var9 = null;
            byte[] var10 = arg0.method39(arg2, -1, var7[var8]);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class7 var12 = (class7) var5.method1232(25831); var12 != null; var12 = (class7) var5.method1238(22622)) {
                if (var12.field108 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method57(0, var11, -1);
                } else {
                    var13 = arg1.method57(var11, 0, -1);
                }
                var9 = new class7(var11, var13);
                var5.method1236((byte) -121, var9);
            }
            this.field1153[var7[var8]] = new class112(var10, var9);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Z")
    public final boolean method457(int arg0, int arg1) {
        field1156++;
        if (arg0 != -4) {
            field1154 = null;
        }
        return this.field1153[arg1].field2462;
    }
}
