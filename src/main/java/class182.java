import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class182 extends class60 {

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "Z")
    public boolean field3114 = false;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "Lub;")
    private static class227 field3109 = class257.method1749("Close", 17263);

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field3107 = 0;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Lub;")
    public static class227 field3103 = field3109;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "Lub;")
    public static class227 field3113 = class257.method1749("not yet implemented", 17263);

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "Lub;")
    public static class227 field3116 = class257.method1749("unzap", 17263);

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "[Lnh;")
    public static class57[] field3117 = new class57[256];

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "[Lud;")
    public static class139[] field3104;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    public static final void method1161(byte arg0) {
        class245.field4276 = null;
        class132.field2302 = null;
        int var1 = -60 / ((71 - arg0) / 39);
        class119.field2161 = null;
        class149.field2612 = null;
        class176.field2932 = null;
        field3110++;
        class246.field4299 = null;
        class186.field3171 = null;
        class147.field2535 = null;
        class51.field895 = null;
        class123.field2215 = null;
        class40.field650 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;III)Loc;")
    public static final class188 method1162(Component arg0, int arg1, int arg2, int arg3) {
        field3112++;
        try {
            Class var4 = Class.forName("ui");
            int var5 = -48 % ((arg3 + 14) / 56);
            class188 var6 = (class188) var4.getDeclaredConstructor().newInstance();
            var6.method717(arg2, arg0, (byte) -84, arg1);
            return var6;
        } catch (Throwable var8) {
            class161 var7 = new class161();
            var7.method717(arg2, arg0, (byte) -39, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static void method1163(int arg0) {
        field3109 = null;
        if (arg0 != 0) {
            field3107 = -119;
        }
        field3113 = null;
        field3104 = null;
        field3117 = null;
        field3116 = null;
        field3103 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BJ)V")
    public static final void method1164(byte arg0, long arg1) {
        field3111++;
        if (arg1 == 0L) {
            return;
        }
        if (class86.field1485 >= 100) {
            class130.method799(1403, 0, class91.field1558, class61.field1128);
            return;
        }
        class227 var3 = class118.method744(arg1, arg0 ^ 0x22).method1527(-96);
        for (int var4 = 0; var4 < class86.field1485; var4++) {
            if (class230.field4031[var4] == arg1) {
                class130.method799(arg0 ^ 0xFFFFFADC, 0, class91.field1558, class76.method445((byte) 57, new class227[] { var3, class78.field1372 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class166.field2781; var5++) {
            if (class28.field460[var5] == arg1) {
                class130.method799(1403, 0, class91.field1558, class76.method445((byte) 77, new class227[] { class253.field4445, var3, class88.field1529 }));
                return;
            }
        }
        if (var3.method1487(127, class216.field3639.field3819)) {
            class130.method799(1403, 0, class91.field1558, class120.field2179);
            return;
        }
        class230.field4031[class86.field1485] = arg1;
        class21.field374++;
        class249.field4321[class86.field1485++] = class118.method744(arg1, -123);
        class152.field2645 = class77.field1356;
        if (arg0 == -89) {
            class176.field2935.method664((byte) -108, 117);
            class176.field2935.method1457(arg1, -103);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILnh;BLjk;)V")
    public static final void method1165(int arg0, class57 arg1, byte arg2, class192 arg3) {
        field3108++;
        int var4 = 26 / ((arg2 - 55) / 46);
        byte[] var5 = null;
        class198 var6 = class192.field3256;
        synchronized (class192.field3256) {
            for (class41 var7 = (class41) class192.field3256.method1277(125); var7 != null; var7 = (class41) class192.field3256.method1271(250)) {
                if (((long) arg0) == var7.field1113 && var7.field678 == arg3 && var7.field671 == 0) {
                    var5 = var7.field680;
                    break;
                }
            }
        }
        if (var5 == null) {
            byte[] var8 = arg3.method1221(arg0, 4);
            arg1.method344(arg3, -2, true, arg0, var8);
        } else {
            arg1.method344(arg3, -2, true, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class116 var8 = new class116();
        var8.field2139 = arg2 / 128;
        var8.field2126 = arg3 / 128;
        var8.field2135 = arg4 / 128;
        var8.field2128 = arg5 / 128;
        var8.field2130 = arg1;
        var8.field2125 = arg2;
        var8.field2116 = arg3;
        var8.field2115 = arg4;
        var8.field2123 = arg5;
        var8.field2121 = arg6;
        var8.field2141 = arg7;
        client.field1437[arg0][client.field1438[arg0]++] = var8;
    }
}
