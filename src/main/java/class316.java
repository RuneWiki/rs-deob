import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class316 {

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public int field4108 = 1;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field4115 = -50;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4114 = "";

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "C")
    public char field4113;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILpe;BIII)Ljava/awt/Frame;")
    public static final Frame method1787(int arg0, class556 arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4109++;
        int var6 = -82 / ((-arg2 - 72) / 52);
        if (!arg1.method3139(255)) {
            return null;
        }
        if (arg4 == 0) {
            class438[] var7 = class63.method426(-3, arg1);
            if (var7 == null) {
                return null;
            }
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].field6090 == arg5 && var7[var9].field6092 == arg3 && (arg0 == 0 || var7[var9].field6094 == arg0) && (!var8 || var7[var9].field6088 > arg4)) {
                    var8 = true;
                    arg4 = var7[var9].field6088;
                }
            }
            if (!var8) {
                return null;
            }
        }
        class199 var10 = arg1.method3135(14, arg5, arg3, arg0, arg4);
        while (var10.field2437 == 0) {
            class370.method2025(-1, 10L);
        }
        Frame var11 = (Frame) var10.field2434;
        if (var11 == null) {
            return null;
        } else if (var10.field2437 == 2) {
            class330.method1865(var11, (byte) 111, arg1);
            return null;
        } else {
            return var11;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Liaa;I)V")
    public final void method1788(class452 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2541(51);
            if (var3 == 0) {
                field4111++;
                int var4 = -84 / ((arg1 + 40) / 52);
                return;
            }
            this.method1790(var3, arg0, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    public static void method1789(byte arg0) {
        field4114 = null;
        if (arg0 != 108) {
            method1787(-78, null, (byte) 122, -92, -1, -16);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILiaa;B)V")
    private final void method1790(int arg0, class452 arg1, byte arg2) {
        if (arg2 <= 0) {
            return;
        }
        if (arg0 == 1) {
            this.field4113 = class278.method1589(arg1.method2547(true), false);
        } else if (arg0 == 2) {
            this.field4108 = 0;
        }
        field4112++;
    }
}
