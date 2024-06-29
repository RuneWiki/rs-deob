import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class347 {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field4989 = -1;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lhi;")
    public static class45 field4990 = new class45(53, 8);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field4986;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field4991;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lla;")
    public static class306 field4988;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "[Ltr;")
    public static class244[] field4994;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method2085(boolean arg0, int arg1) {
        field4992++;
        if (arg0) {
            if (class236.field3268 != -1) {
                class378.method2257(-17958, class236.field3268);
            }
            for (class91 var2 = (class91) class425.field6168.method1588(33); var2 != null; var2 = (class91) class425.field6168.method1582(arg1 - 100)) {
                if (!var2.method2790(arg1 ^ 0x72)) {
                    var2 = (class91) class425.field6168.method1588(arg1 ^ 0xFFFFFFF2);
                    if (var2 == null) {
                        break;
                    }
                }
                class147.method1052(var2, false, true, arg1 ^ 0x3);
            }
            class236.field3268 = -1;
            class425.field6168 = new class270(8);
            class241.method1467((byte) -77);
            class236.field3268 = class415.field6027;
            class454.method2663(true, false);
            class157.method1127(1508614222);
            class47.method317(class236.field3268);
        }
        class518.field7611 = "";
        class481.field6957 = "";
        class527.field7689 = false;
        class201.method1305(arg1 + 85);
        class358.field5165 = arg1;
        class9.method63(class275.field3733, arg1 + 11364);
        class81.field1158 = new class487();
        class81.field1158.field263[0] = class9.field111 / 2;
        class81.field1158.field6284 = class9.field111 * 128 / 2;
        class81.field1158.field6287 = class192.field2809 * 128 / 2;
        class108.field1747 = 0;
        class118.field1848 = 0;
        class81.field1158.field257[0] = class192.field2809 / 2;
        if (class247.field3363 == 2) {
            class108.field1747 = class187.field2753 << 7;
            class118.field1848 = class51.field750 << 7;
        } else {
            class186.method1247(false);
        }
        class325.method1925((byte) -128);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lfs;Lfs;I)V", line = 66)
    public static final void method2086(class287 arg0, class287 arg1, int arg2) {
        if (arg1.field3890 != null) {
            arg1.method1645(-126);
        }
        field4993++;
        arg1.field3888 = arg0.field3888;
        if (arg2 == 0) {
            arg1.field3890 = arg0;
            arg1.field3890.field3888 = arg1;
            arg1.field3888.field3890 = arg1;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 87)
    public static void method2087(int arg0) {
        field4988 = null;
        field4990 = null;
        int var1 = 83 % ((arg0 + 32) / 33);
        field4994 = null;
    }
}
