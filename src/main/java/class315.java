import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public abstract class class315 {

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "[B")
    public byte[] field4057 = new byte[5000];

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public int field4053 = 0;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public volatile int field4054 = 0;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public volatile int field4055 = 0;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "[F")
    public float[] field4058 = new float[5000];

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public int field4061 = 0;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "[Ljava/lang/Object;")
    public Object[] field4056 = new Object[5000];

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "Ltu;")
    public static class7 field4060 = new class7();

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "Lpi;")
    public static class340 field4062 = new class340(78, 2);

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public static int field4065 = -1;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ltg;B)V")
    public abstract void method197(class510 arg0, byte arg1);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public abstract void method202(byte arg0);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ltg;I)V")
    public abstract void method198(class510 arg0, int arg1);

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
    public static void method1874(byte arg0) {
        field4060 = null;
        field4062 = null;
        if (arg0 < 59) {
            method1877(null, 26);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILm;Lhs;ILjava/awt/Canvas;)Lqa;")
    public static final class129 method1875(int arg0, class79 arg1, class441 arg2, int arg3, Canvas arg4) {
        field4059++;
        return arg0 >= -14 ? null : new class373(arg3, arg4, arg1, arg2);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V")
    public abstract void method200(int arg0, int arg1);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)V")
    public static final void method1876(int arg0, int arg1, int arg2, int arg3) {
        field4064++;
        class8.field76 = new byte[arg3][arg0][arg2];
        if (arg1 <= 36) {
            field4062 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public abstract void method199(int arg0);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZ)V")
    public abstract void method205(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZLtg;)V")
    public abstract void method196(boolean arg0, class510 arg1);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lna;IBFZ)V")
    public abstract void method201(class251 arg0, int arg1, byte arg2, float arg3, boolean arg4);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ldn;I)V")
    public static final void method1877(class201 arg0, int arg1) {
        class356.field4575 = arg0.method1297("p11_full", -5105);
        field4063++;
        class419.field5576 = arg0.method1297("p12_full", -5105);
        class187.field2444 = arg0.method1297("b12_full", -5105);
        class520.field7688 = arg0.method1297("hitmarks", arg1 - 5105);
        class337.field4301 = arg0.method1297("hitbar_default", -5105);
        class482.field7015 = arg0.method1297("timerbar_default", -5105);
        class522.field7747 = arg0.method1297("headicons_pk", -5105);
        class52.field707 = arg0.method1297("headicons_prayer", -5105);
        class152.field2040 = arg0.method1297("hint_headicons", -5105);
        class188.field2457 = arg0.method1297("hint_mapmarkers", -5105);
        class355.field4555 = arg0.method1297("mapflag", -5105);
        class486.field7059 = arg0.method1297("cross", -5105);
        class169.field2201 = arg0.method1297("mapdots", arg1 ^ 0xFFFFEC0F);
        class322.field4144 = arg0.method1297("scrollbar", -5105);
        class120.field1667 = arg0.method1297("name_icons", arg1 - 5105);
        class197.field2547 = arg0.method1297("floorshadows", -5105);
        class481.field7002 = arg0.method1297("compass", -5105);
        class288.field3689 = arg0.method1297("otherlevel", -5105);
        if (arg1 == 0) {
            class447.field6216 = arg0.method1297("hint_mapedge", -5105);
        }
    }
}
