import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class274 extends class120 {

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4372 = "glow1:";

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4374 = "Close";

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
    public static int field4382 = -1;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public int field4360;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public int field4362;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public int field4368;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
    public int field4377;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public int field4379;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Lu;")
    public class119 field4371;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Lqk;")
    public class207 field4363;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "Lta;")
    public class255 field4384;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lli;")
    public class290 field4366;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method1847(byte arg0) {
        field4374 = null;
        if (arg0 <= 50) {
            method1850((byte) -26, (class214) null);
        }
        field4372 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ldl;Ldl;Ljg;Ldl;I)Z")
    public static final boolean method1848(class123 arg0, class123 arg1, class168 arg2, class123 arg3, int arg4) {
        field4378++;
        if (arg4 != -24564) {
            return true;
        }
        class5.field75 = arg1;
        class276.field4403 = arg0;
        class135.field1965 = arg2;
        class67.field934 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public final void method1849(int arg0) {
        if (arg0 != -1) {
            return;
        }
        this.field4363 = null;
        this.field4384 = null;
        field4380++;
        this.field4366 = null;
        this.field4371 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLef;)V")
    public static final void method1850(byte arg0, class214 arg1) {
        class214 var2 = class176.method1232((byte) 127, arg1);
        field4369++;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class135.field1960;
            var4 = class98.field1510;
        } else {
            var3 = var2.field3473;
            var4 = var2.field3369;
        }
        int var5 = 124 / ((19 - arg0) / 44);
        class282.method1884(arg1, var4, 83, var3, false);
        class77.method520(var3, var4, (byte) -120, arg1);
    }
}
