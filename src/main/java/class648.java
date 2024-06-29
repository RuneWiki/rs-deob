import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class648 {

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Lnea;")
    public static class664 field9104 = new class664(71, 17);

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Lnea;")
    public static class664 field9105 = new class664(56, 2);

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Lvg;")
    public static class49 field9107 = null;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "Lde;")
    public static class491 field9106;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
    public static void method3594(boolean arg0) {
        field9105 = null;
        field9106 = null;
        if (arg0) {
            field9104 = null;
            field9107 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3595(int arg0, String arg1) {
        field9102++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var9 = arg1.charAt(var4);
            if (var9 == '<' || var9 == '>') {
                var3 += 3;
            }
        }
        int var5 = -52 / ((59 - arg0) / 54);
        StringBuffer var6 = new StringBuffer(var2 + var3);
        for (int var7 = 0; var7 < var2; var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 == '<') {
                var6.append("<lt>");
            } else if (var8 == '>') {
                var6.append("<gt>");
            } else {
                var6.append(var8);
            }
        }
        return var6.toString();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BILr;)Luq;")
    public static final class146 method3596(byte arg0, int arg1, class166 arg2) {
        field9101++;
        class355 var3 = class518.method2958(arg2, -14005, true, arg1);
        if (var3 == null) {
            return null;
        } else if (arg0 >= -30) {
            return null;
        } else {
            return var3.field5105;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static final void method3597(int arg0) {
        if (arg0 != -23888) {
            field9107 = null;
        }
        class8.method44(false, (byte) -124);
        field9103++;
        if (class457.field6544 >= 0 && class457.field6544 != 0) {
            class33.method363(-30052, class457.field6544);
            class457.field6544 = -1;
        }
    }
}
