import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class404 extends class115 {

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public int field6089;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public int field6092;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "Lsl;")
    public static class456 field6091 = new class456("", 13);

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "Z")
    public static boolean field6095 = false;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "Luv;")
    public static class2 field6094 = new class2(10, 4);

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "[I")
    public static int[] field6096 = new int[14];

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)V")
    public static void method2435(byte arg0) {
        field6091 = null;
        int var1 = -106 / ((27 - arg0) / 38);
        field6096 = null;
        field6094 = null;
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(B)Z")
    public static final boolean method2436(byte arg0) {
        if (arg0 != 76) {
            return false;
        }
        field6093++;
        if (class134.field2005) {
            try {
                class331.method2049(class25.field375.field1611, "showVideoAd", -3460);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(JB)V")
    public static final void method2437(long arg0, byte arg1) {
        field6088++;
        if (class236.field3305 != null) {
            if (class350.field5388 == 1 || class350.field5388 == 5) {
                class134.method984(arg0, 320);
            } else if (class350.field5388 == 4) {
                class229.method1425((byte) -30, arg0);
            }
        }
        class263.method1645(class407.field6147, (long) class86.field1350, 0);
        if (class256.field3477 != -1) {
            class11.method133(true, class256.field3477);
        }
        for (int var3 = 0; var3 < class81.field1139; var3++) {
            if (class147.field2223[var3]) {
                class462.field6727[var3] = true;
            }
            class272.field4059[var3] = class147.field2223[var3];
            class147.field2223[var3] = false;
        }
        class206.field2993 = class86.field1350;
        if (class407.field6147.method112()) {
            class336.field5191 = true;
        }
        if (class256.field3477 != -1) {
            class81.field1139 = 0;
            class172.method1186(true);
        }
        class407.field6147.method94();
        class204.method1339(0, class407.field6147);
        int var4 = class45.method350(1);
        if (var4 == -1) {
            var4 = class98.field1510;
        }
        if (var4 == -1) {
            var4 = class52.field675;
        }
        class152.method1096(19716, var4);
        class350.method2117(class410.field6198.field7671, class410.field6198.field7681, class410.field6198.field7686, (byte) -67, class469.field6876);
        class469.field6876 = 0;
        int var5 = 40 / ((arg1 - 29) / 42);
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(II)V")
    public class404(int arg0, int arg1) {
        this.field6089 = arg1;
        this.field6092 = arg0;
    }
}
