import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class52 implements class749 {

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Ljava/lang/String;")
    private String field550;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field547 = new String[100];

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field549 = 0;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field548 = 0;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Z")
    private boolean field546;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)I", line = 6)
    public final int method304(byte arg0) {
        field545++;
        int var2 = class614.method3460(-120, this.field550);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        }
        if (arg0 < 126) {
            this.method306(true);
        }
        this.field546 = true;
        return 100;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBIIILfl;)Ljava/awt/Frame;", line = 24)
    public static final Frame method305(int arg0, byte arg1, int arg2, int arg3, int arg4, class739 arg5) {
        field542++;
        if (arg1 <= 93) {
            field549 = 45;
        }
        if (!arg5.method4128((byte) 83)) {
            return null;
        }
        if (arg0 == 0) {
            class118[] var6 = class511.method2832(arg5, (byte) -94);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1556 == arg2 && var6[var8].field1559 == arg3 && (arg4 == 0 || var6[var8].field1561 == arg4) && (!var7 || var6[var8].field1558 > arg0)) {
                    var7 = true;
                    arg0 = var6[var8].field1558;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class107 var9 = arg5.method4137(-21605, arg0, arg2, arg4, arg3);
        while (var9.field1419 == 0) {
            class267.method1599(0, 10L);
        }
        Frame var10 = (Frame) var9.field1418;
        if (var10 == null) {
            return null;
        } else if (var9.field1419 == 2) {
            class114.method757(false, var10, arg5);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z", line = 95)
    public final boolean method306(boolean arg0) {
        field551++;
        if (!arg0) {
            method308((byte) 83);
        }
        return this.field546;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)Lmk;", line = 106)
    public final class56 method307(int arg0) {
        if (arg0 == 15763) {
            field544++;
            return class56.field572;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V", line = 137)
    public static void method308(byte arg0) {
        field547 = null;
        int var1 = -79 % ((arg0 - 76) / 40);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 147)
    public class52(String arg0) {
        this.field550 = arg0;
    }
}
