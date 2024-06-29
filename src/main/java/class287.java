import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class287 extends class706 {

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lwia;")
    public static class791 field4223;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLha;)V", line = 5)
    public static final void method1853(byte arg0, class65 arg1) {
        field4220++;
        int var2 = 67 / ((-arg0 - 44) / 40);
        if (class543.field7798.method1735(-128) == 0) {
            return;
        }
        if (class21.field353.field10098.method1588(-44) == 0) {
            for (class70 var5 = (class70) class543.field7798.method1731((byte) -120); var5 != null; var5 = (class70) class543.field7798.method1724(0)) {
                class313.field4456.method1679(arg1, var5.field831 ? class210.field3250.field9765 : null, var5.field829, var5.field834, var5.field835, var5.field837, class718.field9945, arg1, false, var5.field830, (byte) 54, false);
                var5.method3387((byte) 125);
            }
            class351.method2224((byte) 119);
            return;
        }
        if (class578.field8148 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class578.field8148 = class774.method4267((byte) 77, 0, class48.field610, class204.field3175, var3, 0);
            class345.field4815 = class578.field8148.method437(class121.method924(class124.field1928, (byte) -89, 0, class523.field7389), class1.method14(class152.field2163, class523.field7389, 0), true);
        }
        for (class70 var4 = (class70) class543.field7798.method1731((byte) -108); var4 != null; var4 = (class70) class543.field7798.method1724(0)) {
            class313.field4456.method1679(class578.field8148, var4.field831 ? class210.field3250.field9765 : null, var4.field829, var4.field834, var4.field835, var4.field837, class345.field4815, arg1, false, var4.field830, (byte) 114, false);
            var4.method3387((byte) 119);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljga;B)Ljava/lang/String;", line = 57)
    public static final String method1854(class746 arg0, byte arg1) {
        int var2 = 88 / ((arg1 + 2) / 38);
        field4224++;
        if (arg0.field10337 == null || arg0.field10337.length() == 0) {
            return arg0.field10339 == null || arg0.field10339.length() <= 0 ? arg0.field10329 : arg0.field10329 + class620.field8693.method3580(class140.field2081, 12) + arg0.field10339;
        } else if (arg0.field10339 == null || arg0.field10339.length() <= 0) {
            return arg0.field10329 + class620.field8693.method3580(class140.field2081, 12) + arg0.field10337;
        } else {
            return arg0.field10329 + class620.field8693.method3580(class140.field2081, 12) + arg0.field10339 + class620.field8693.method3580(class140.field2081, 12) + arg0.field10337;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lin;Lti;IIIIIIIII)V", line = 86)
    public class287(class97 arg0, class463 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field4225 = arg9;
        this.field4221 = arg10;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lsaa;", line = 95)
    public final class345 method1656(int arg0) {
        field4222++;
        if (arg0 != 0) {
            this.field4221 = -107;
        }
        return class65.field793;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 106)
    public static void method1855(int arg0) {
        field4223 = null;
        if (arg0 != 1377) {
            field4223 = null;
        }
    }
}
