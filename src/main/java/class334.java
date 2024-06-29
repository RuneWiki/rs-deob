import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class334 {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public int field5210 = -1;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field5217 = -50;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Lic;")
    public class415 field5212;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "[I")
    public int[] field5214;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field5216;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I", line = 12)
    public static final int method2208(int arg0, int arg1) {
        field5213++;
        if (arg0 != -15761) {
            method2209(true, (byte) -107);
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZB)V", line = 24)
    public static final void method2209(boolean arg0, byte arg1) {
        field5211++;
        if (arg0) {
            if (class306.field4847 != -1) {
                class128.method951(class306.field4847, (byte) -116);
            }
            for (class196 var2 = (class196) class392.field5891.method1776(true); var2 != null; var2 = (class196) class392.field5891.method1773(-1)) {
                if (!var2.method1123((byte) 103)) {
                    var2 = (class196) class392.field5891.method1776(true);
                    if (var2 == null) {
                        break;
                    }
                }
                class140.method1020(true, false, false, var2);
            }
            class306.field4847 = -1;
            class392.field5891 = new class256(8);
            class301.method2024(arg1 ^ 0xFFFFFFC2);
            class306.field4847 = class33.field414;
            class354.method2307(118, false);
            class193.method1356((byte) 93);
            class17.method136(class306.field4847);
        }
        if (arg1 != -60) {
            field5215 = 22;
        }
        class163.method1131(true);
        class50.field617 = -1;
        class67.method425(4, class216.field3506);
        class261.field4201 = new class219();
        class261.field4201.field722 = 6656;
        class261.field4201.field724 = 6656;
        class261.field4201.field1906[0] = 52;
        class290.field4631 = 0;
        class427.field6301 = 0;
        class261.field4201.field1916[0] = 52;
        if (class13.field194 == 2) {
            class427.field6301 = class196.field3175 << 7;
            class290.field4631 = class326.field5116 << 7;
        } else {
            class351.method2294(-1451675060);
        }
        class410.method2574(-1);
        if (class427.field6301 == 0 || class290.field4631 == 0) {
            class128.method953(16205, 10);
        } else {
            class308.method2065(arg1 ^ 0x3B);
            class128.method953(16205, 28);
        }
    }
}
