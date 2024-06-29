import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class35 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lbca;")
    public static class662 field514 = new class662();

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method286(int arg0) {
        if (arg0 > 46) {
            field514 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
    public abstract int method287(int arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V")
    public abstract void method288(byte arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZI)I")
    public static final int method289(int arg0, boolean arg1, int arg2) {
        field512++;
        if (class141.field2263 == -1) {
            return 1;
        }
        if (arg0 != class411.field5711.field3913.method3282(true)) {
            class480.method2707(arg0, class517.field6853.method2877(class713.field9854, (byte) -108), (byte) -9, true);
            if (arg0 != class411.field5711.field3913.method3282(true)) {
                return -1;
            }
        }
        try {
            Dimension var3 = class295.field4217.getSize();
            class88.method675(class180.field2728, class148.field2334, class341.field4807, (byte) -27, arg1, class517.field6853.method2877(class713.field9854, (byte) -108));
            class538 var4 = class47.method333(0, class13.field205, -106, class141.field2263);
            long var5 = class375.method2193(116);
            class341.field4807.method435();
            class512.field6795.method1727(0, class307.field4416, 0);
            class341.field4807.method481(class512.field6795);
            class341.field4807.method445(var3.width / 2, var3.height / 2, 512, 512);
            class341.field4807.method486(1.0F);
            class341.field4807.method423(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class475 var7 = class341.field4807.method401(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label41: for (int var9 = 0; var9 < 500; var9++) {
                class341.field4807.method392(0);
                class341.field4807.method454();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class178.field2679.method1727((int) (((float) var11 - (float) var10 / 2.0F) * (float) class384.field5377), 0, (var10 + 1) * class384.field5377);
                        var7.method155(class178.field2679, null, 0);
                        var8++;
                        if ((class375.method2193(116) - var5) >= ((long) arg2)) {
                            break label41;
                        }
                    }
                }
            }
            class341.field4807.method500();
            long var12 = (long) (var8 * 1000) / (class375.method2193(116) - var5);
            class341.field4807.method392(0);
            class341.field4807.method454();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lqia;")
    public abstract class20 method290(int arg0);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[B")
    public abstract byte[] method291(int arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)I")
    public static final int method292(int arg0, int arg1) {
        if (arg1 == 10663) {
            field515++;
            return arg0 >>> 8;
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
    public static final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field513++;
        if (arg1 != 768) {
            field516 = 49;
        }
        for (class381 var7 = (class381) class36.field518.method3874((byte) 108); var7 != null; var7 = (class381) class36.field518.method3868(-24951)) {
            if (class29.field474 >= var7.field5293) {
                var7.method2815(-122);
            } else {
                class494.method2791(var7.field5301, arg3 >> 1, arg2 >> 1, arg0, (var7.field5295 << 9) + 256, var7.field5300 * 2, (var7.field5296 << 9) + 256, arg5, (byte) -102);
                class64.field785.method513(arg4 + class259.field3621[0], 0, var7.field5290, class259.field3621[1] + arg6, var7.field5291 | 0xFF000000, 0);
            }
        }
    }
}
