import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class120 extends class132 {

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public int field2271;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field2267 = 0;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lvd;")
    public static class222 field2263 = class212.method1357("mapscene", 10731);

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "[Lvd;")
    public static class222[] field2270 = new class222[200];

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Lvd;")
    public static class222 field2269 = class212.method1357("(U1", 10731);

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "[S")
    public static short[] field2274 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    public static int field2276 = 0;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "Z")
    public static boolean field2278 = false;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "Lve;")
    public static class223 field2268;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2266;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public static void method766(byte arg0) {
        field2263 = null;
        field2270 = null;
        field2268 = null;
        field2274 = null;
        if (arg0 != 78) {
            field2270 = null;
        }
        field2266 = null;
        field2269 = null;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
    public static final void method767(int arg0) {
        int var1 = -60 % ((69 - arg0) / 56);
        field2264++;
        class72.field1406 = false;
        class122.field2331 = false;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lvd;BLab;Lvd;)[Lbg;")
    public static final class19[] method768(class222 arg0, byte arg1, class3 arg2, class222 arg3) {
        field2277++;
        int var4 = arg2.method14(arg1 - 32197, arg0);
        if (arg1 != -52) {
            method768(null, (byte) 34, null, null);
        }
        int var5 = arg2.method30(arg3, var4, (byte) 72);
        return class208.method1335(arg2, 82, var5, var4);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method769(Component arg0, int arg1) {
        arg0.addMouseListener(class176.field3301);
        field2273++;
        if (arg1 != 4626) {
            method768(null, (byte) -41, null, null);
        }
        arg0.addMouseMotionListener(class176.field3301);
        arg0.addFocusListener(class176.field3301);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lre;IIZII)V")
    public static final void method770(class183 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2265++;
        if (class52.field993 >= 50 || (arg0.field3397 == null || arg0.field3397.length <= arg2)) {
            return;
        }
        int var6 = arg0.field3397[arg2];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 8;
        int var8 = var6 & 0xF;
        int var9 = var6 >> 4 & 0x7;
        if (var8 == 0) {
            if (arg3) {
                class197.method1211(0, var9, (byte) 65, var7);
            }
        } else if (class210.field3904 != 0) {
            class121.field2309[class52.field993] = var7;
            class115.field2198[class52.field993] = var9;
            class96.field1792[class52.field993] = 0;
            class91.field1720[class52.field993] = null;
            int var10 = (arg4 - 64) / 128;
            if (arg1 < 114) {
                field2276 = 40;
            }
            int var11 = (arg5 - 64) / 128;
            class70.field1307[class52.field993] = (var10 << 16) + (var11 << 8) + var8;
            class52.field993++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
    public class120(int arg0, int arg1) {
        this.field2271 = arg0;
        this.field2272 = arg1;
    }
}
