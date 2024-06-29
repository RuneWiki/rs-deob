import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class71 {

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lok;")
    public static class146 field1161 = class235.method1724(-12908, "vert:");

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lok;")
    public static class146 field1168 = class235.method1724(-12908, "Regarder dans cette direction");

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Lok;")
    private static class146 field1160 = class235.method1724(-12908, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Lok;")
    public static class146 field1169 = field1160;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "[Lan;")
    public static class315[] field1162;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 10)
    public static void method524(boolean arg0) {
        field1162 = null;
        field1160 = null;
        field1161 = null;
        if (arg0) {
            field1161 = (class146) null;
        }
        field1169 = null;
        field1168 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)Z", line = 43)
    public static final boolean method525(boolean arg0, int arg1) {
        if (!arg0) {
            field1160 = (class146) null;
        }
        field1166++;
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 54)
    public static final void method526(int arg0) {
        field1164++;
        if (arg0 <= 112) {
            return;
        }
        for (int var1 = 0; var1 < class182.field3045; var1++) {
            int var2 = class228.field3809[var1];
            class234 var3 = class75.field1215[var2];
            int var4 = client.field4080.method368(-123);
            if ((var4 & 0x80) != 0) {
                var4 += client.field4080.method368(93) << 8;
            }
            class156.method1216(var3, var2, -65536, var4);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/awt/Frame;Lml;)V", line = 88)
    public static final void method527(byte arg0, Frame arg1, class129 arg2) {
        if (arg0 != -12) {
            field1167 = -58;
        }
        field1159++;
        while (true) {
            class256 var3 = arg2.method922(1, arg1);
            while (var3.field4265 == 0) {
                class281.method2041((byte) 87, 10L);
            }
            if (var3.field4265 == 1) {
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class281.method2041((byte) 121, 100L);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Loh;I)V", line = 121)
    public static final void method528(class15 arg0, int arg1) {
        class84.field1336 = arg0;
        field1163++;
        if (arg1 != 100) {
            field1161 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lok;IIILok;Lok;)V", line = 139)
    public static final void method529(class146 arg0, int arg1, int arg2, int arg3, class146 arg4, class146 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class97.field1575[var6] = class97.field1575[var6 - 1];
            class167.field2826[var6] = class167.field2826[var6 - 1];
            class80.field1280[var6] = class80.field1280[var6 - 1];
            class87.field1388[var6] = class87.field1388[var6 - 1];
            class274.field4723[var6] = class274.field4723[var6 - 1];
        }
        field1157++;
        class55.field981 = class13.field253;
        if (arg2 != 140) {
            field1168 = (class146) null;
        }
        class103.field1670++;
        class167.field2826[0] = arg0;
        class97.field1575[0] = arg1;
        class80.field1280[0] = arg4;
        class87.field1388[0] = arg5;
        class274.field4723[0] = arg3;
    }
}
