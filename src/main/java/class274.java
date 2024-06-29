import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class274 {

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field4354 = 0;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "[Z")
    public static boolean[] field4355 = new boolean[100];

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lue;")
    public static class222 field4357 = new class222(16);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/Object;ILfk;)V")
    public static final void method1780(Object arg0, int arg1, class52 arg2) {
        field4352++;
        int var3 = 70 % ((52 - arg1) / 45);
        if (arg2.field728 == null) {
            return;
        }
        for (int var4 = 0; var4 < 50 && arg2.field728.peekEvent() != null; var4++) {
            class17.method116(-117, 1L);
        }
        if (arg0 != null) {
            arg2.field728.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIII)V")
    public static final void method1781(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class271.field4322 <= arg4 && arg4 <= class311.field5001) {
            int var5 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg2);
            int var6 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1);
            class263.method1708(arg4, arg3, var6, -902108468, var5);
        }
        field4353++;
        int var7 = -65 / ((arg0 + 56) / 37);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILbj;)V")
    public static final void method1782(int arg0, int arg1, class215 arg2) {
        if (arg0 != 24) {
            field4354 = -85;
        }
        if (class78.field1090 != null) {
            try {
                class78.field1090.method1480(0L, true);
                class78.field1090.method1482(true, 24, arg1, arg2.field3287);
            } catch (Exception var3) {
            }
        }
        field4359++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method1783(int arg0) {
        if (arg0 != -29164) {
            field4354 = 80;
        }
        field4357 = null;
        field4355 = null;
    }
}
