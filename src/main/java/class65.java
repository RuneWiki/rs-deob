import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class65 extends class678 {

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field1434 = -1;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Z")
    public static boolean field1435 = false;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field1436 = class608.method3498(1600, (byte) 101);

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "Ltf;")
    public static class269 field1441 = new class269();

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "F")
    public static float field1442;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "Lsl;")
    private class427 field1440;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)I")
    public final int method760(int arg0, int arg1, int arg2) {
        field1439++;
        if (this.field1440 == null) {
            return arg2;
        }
        class149 var4 = (class149) this.field1440.method2596((long) arg1, 107);
        if (var4 == null) {
            return arg2;
        } else {
            int var5 = -120 % ((53 - arg0) / 43);
            return var4.field2560;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lqh;B)V")
    public final void method761(class61 arg0, byte arg1) {
        if (arg1 != -106) {
            this.method765(3, null, 22);
        }
        while (true) {
            int var3 = arg0.method732(-559537960);
            if (var3 == 0) {
                field1438++;
                return;
            }
            this.method765(96, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method762(int arg0, String arg1, int arg2) {
        field1433++;
        if (this.field1440 == null) {
            return arg1;
        }
        class426 var4 = (class426) this.field1440.method2596((long) arg0, arg2 + 64);
        if (arg2 == 1) {
            return var4 == null ? arg1 : var4.field6140;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method763(int arg0) {
        field1441 = null;
        if (arg0 != 20910) {
            field1436 = -27;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
    public static final void method764(boolean arg0) {
        field1432++;
        class481.field6904 = 0;
        class126.field2292.method1222((byte) -102);
        if (arg0) {
            field1441 = null;
        }
        class126.field2292.method1229(class288.field4337, (byte) 120);
        class481.field6904++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILqh;I)V")
    private final void method765(int arg0, class61 arg1, int arg2) {
        field1437++;
        if (arg0 <= 8) {
            this.method762(-28, null, -81);
        }
        if (arg2 != 249) {
            return;
        }
        int var4 = arg1.method732(-559537960);
        if (this.field1440 == null) {
            int var5 = class455.method2740(-1675135295, var4);
            this.field1440 = new class427(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method732(-559537960) == 1;
            int var8 = arg1.method740((byte) 112);
            class425 var9;
            if (var7) {
                var9 = new class426(arg1.method747(14598));
            } else {
                var9 = new class149(arg1.method730(124));
            }
            this.field1440.method2598(var9, (long) var8, (byte) 8);
        }
    }
}
