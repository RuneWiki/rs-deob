import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class237 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static final void method1654(int arg0) {
        if (class591.field8407 == null) {
            class591.field8407 = class474.method2843(-17491);
            class145.field1962 = class591.field8407[0];
            class105.field1474 = class465.method2818(arg0 ^ 0xFFFFFF00);
        }
        field3549++;
        if (class703.field9912 == null) {
            class603.method3510(17768);
        }
        if (arg0 != -1) {
            return;
        }
        class474 var1 = class145.field1962;
        int var2 = class501.method3046(21442);
        if (class145.field1962 == var1) {
            class51.field818 = class145.field1962.field6721.method3543(arg0 ^ 0x5F1D, class45.field748);
            if (class145.field1962.field6714) {
                class62.field998 = class145.field1962.field6718 + ((class145.field1962.field6713 - class145.field1962.field6718) * var2 / 100);
            }
            if (class145.field1962.field6719) {
                class51.field818 = class51.field818 + class62.field998 + "%";
            }
        } else if (class474.field6743 == class145.field1962) {
            class703.field9912 = null;
            class79.method649(-19704, 3);
        } else {
            class51.field818 = var1.field6717.method3543(-24350, class45.field748);
            if (class145.field1962.field6719) {
                class51.field818 = class51.field818 + var1.field6713 + "%";
            }
            class62.field998 = var1.field6713;
            if (class145.field1962.field6714 || var1.field6714) {
                class105.field1474 = class465.method2818(arg0 ^ 0xFFFFFF00);
            }
        }
        if (class703.field9912 == null) {
            return;
        }
        class703.field9912.method1430(class145.field1962, class51.field818, class105.field1474, class62.field998, 255);
        if (class429.field6178 == null) {
            return;
        }
        for (int var3 = class235.field3516 + 1; var3 < class429.field6178.length; var3++) {
            if (class429.field6178[var3].method1341((byte) 126) >= 100 && var3 - 1 == class235.field3516 && class369.field5392 >= 1 && class703.field9912.method1431(false)) {
                try {
                    class429.field6178[var3].method1337((byte) -45);
                } catch (Exception var4) {
                    class429.field6178 = null;
                    return;
                }
                class703.field9912.method1429(class429.field6178[var3], (byte) 117);
                class235.field3516++;
                if (class235.field3516 >= class429.field6178.length - 1 && class429.field6178.length > 1) {
                    class235.field3516 = class563.field8157.method54((byte) -88) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILjava/awt/Canvas;B)Lmj;")
    public static final class711 method1655(int arg0, int arg1, Canvas arg2, byte arg3) {
        field3547++;
        if (arg3 <= 88) {
            return null;
        }
        try {
            Class var4 = Class.forName("dg");
            class711 var5 = (class711) var4.getDeclaredConstructor().newInstance();
            var5.method87(arg1, arg2, arg0, -23847);
            return var5;
        } catch (Throwable var7) {
            class510 var6 = new class510();
            var6.method87(arg1, arg2, arg0, -23847);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)I")
    public static final int method1656(int arg0) {
        field3548++;
        if (arg0 > -30) {
            return -96;
        } else if (class270.field3833 == 1) {
            return class222.field3279;
        } else {
            return class271.field3851;
        }
    }
}
