import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 {

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public int field4 = -1;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lcf;")
    public static class93 field3 = class147.method1066(")3runescape)3com)4l=", -48);

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Ltg;")
    public static class181 field8 = null;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lcf;")
    private static class93 field13 = class147.method1066("Loading)3)3)3", -48);

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lcf;")
    public static class93 field9 = field13;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lhg;")
    public static class177 field11;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lhb;")
    public class216 field7;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "[I")
    public int[] field5;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[Lcf;")
    public class93[] field1;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)I")
    public static final int method1(int arg0, byte arg1) {
        if (arg1 == 11) {
            field6++;
            return arg0 >>> 8;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method2(Component arg0, boolean arg1) {
        Method var2 = class286.field5130;
        if (arg1) {
            field9 = null;
        }
        field2++;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class172.field3011);
        arg0.addFocusListener(class172.field3011);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static final void method3(byte arg0) {
        field10++;
        class255 var1 = (class255) class156.field2744.method1151(109);
        if (arg0 != 7) {
            field3 = null;
        }
        while (var1 != null) {
            class121 var2 = var1.field4608;
            if (class138.field2405 != var2.field2164 || var2.field2154 < class275.field4921) {
                var1.method1544((byte) -84);
            } else if (var2.field2180 <= class275.field4921) {
                if (var2.field2149 > 0) {
                    class227 var3 = class155.field2709[var2.field2149 - 1];
                    if (var3 != null && var3.field3868 >= 0 && var3.field3868 < 13312 && var3.field3784 >= 0 && var3.field3784 < 13312) {
                        var2.method898(class275.field4921, class13.method56(var3.field3784, var3.field3868, (byte) 35, var2.field2164) - var2.field2150, (byte) -74, var3.field3784, var3.field3868);
                    }
                }
                if (var2.field2149 < 0) {
                    int var4 = -var2.field2149 - 1;
                    class237 var5;
                    if (class141.field2446 == var4) {
                        var5 = class166.field2927;
                    } else {
                        var5 = class224.field4031[var4];
                    }
                    if (var5 != null && var5.field3868 >= 0 && var5.field3868 < 13312 && var5.field3784 >= 0 && var5.field3784 < 13312) {
                        var2.method898(class275.field4921, class13.method56(var5.field3784, var5.field3868, (byte) 104, var2.field2164) - var2.field2150, (byte) 86, var5.field3784, var5.field3868);
                    }
                }
                var2.method894(class203.field3670, (byte) -34);
                class280.method1901(class138.field2405, (int) var2.field2145, (int) var2.field2165, (int) var2.field2160, 60, var2, var2.field2156, -1L, false);
            }
            var1 = (class255) class156.field2744.method1159(46);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method4(int arg0) {
        field3 = null;
        field9 = null;
        field11 = null;
        field13 = null;
        field8 = null;
        if (arg0 <= 69) {
            method2((Component) null, false);
        }
    }
}
