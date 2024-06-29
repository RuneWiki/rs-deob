import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class221 extends class239 {

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[Llp;")
    public static class267[] field3174 = new class267[14];

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field3176 = -1;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "[I")
    public static int[] field3175;

    static {
        new class331("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLuu;II)V", line = 4)
    public static final void method1503(byte arg0, class188 arg1, int arg2, int arg3) {
        field3178++;
        if (class453.field6671) {
            class284 var9 = class299.field4290 == -1 ? null : class215.field3100.method2740((byte) -108, class299.field4290);
            if (client.method1380(arg1).method1781(arg0 + 16339) && (class223.field3273 & 0x20) != 0 && (var9 == null || arg1.method1307(arg0 - 119, var9.field4127, class299.field4290) != var9.field4127)) {
                class434.method2632(47, (byte) -55, false, 0L, arg1.field2773, class91.field1252 + " -> " + arg1.field2663, true, class8.field93, arg1.field2678, arg1.field2617, class148.field2074);
                class489.field7184++;
            }
        } else {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class104.method870(var4, false, arg1);
                if (var8 != null) {
                    class209.field3041++;
                    class434.method2632(1002, (byte) -55, false, (long) (var4 + 1), arg1.field2773, arg1.field2663, true, var8, arg1.field2678, arg1.field2617, class37.method277(var4, arg1, -119));
                }
            }
            String var5 = class515.method3060(arg1, (byte) 120);
            if (var5 != null) {
                class516.field7596++;
                class434.method2632(9, (byte) -55, false, 0L, arg1.field2773, arg1.field2663, true, var5, arg1.field2678, arg1.field2617, arg1.field2736);
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class104.method870(var6, false, arg1);
                if (var7 != null) {
                    class209.field3041++;
                    class434.method2632(48, (byte) -55, false, (long) (var6 + 1), arg1.field2773, arg1.field2663, true, var7, arg1.field2678, arg1.field2617, class37.method277(var6, arg1, -113));
                }
            }
            if (client.method1380(arg1).method1784(1)) {
                class376.field5559++;
                if (arg1.field2636 == null) {
                    class434.method2632(60, (byte) -55, false, 0L, arg1.field2773, "", true, class81.field1103.method2031(true, class377.field5585), arg1.field2678, arg1.field2617, -1);
                } else {
                    class434.method2632(60, (byte) -55, false, 0L, arg1.field2773, "", true, arg1.field2636, arg1.field2678, arg1.field2617, -1);
                }
            }
        }
        if (arg0 != 118) {
            field3176 = 79;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILfs;)I", line = 82)
    public static final int method1504(int arg0, class387 arg1) {
        field3179++;
        int var2 = 0;
        if (arg1.method2384(-1, class235.field3448)) {
            var2++;
        }
        if (arg1.method2384(-1, class231.field3403)) {
            var2++;
        }
        if (arg1.method2384(-1, class490.field7192)) {
            var2++;
        }
        if (arg1.method2384(-1, class26.field313)) {
            var2++;
        }
        if (arg1.method2384(-1, class486.field7135)) {
            var2++;
        }
        if (arg1.method2384(-1, class208.field3017)) {
            var2++;
        }
        if (arg1.method2384(-1, class252.field3712)) {
            var2++;
        }
        if (arg1.method2384(-1, class318.field4513)) {
            var2++;
        }
        if (arg1.method2384(-1, class364.field5090)) {
            var2++;
        }
        if (arg1.method2384(-1, class269.field3961)) {
            var2++;
        }
        if (arg1.method2384(-1, class471.field6960)) {
            var2++;
        }
        if (arg1.method2384(-1, class13.field154)) {
            var2++;
        }
        if (arg1.method2384(-1, class12.field143)) {
            var2++;
        }
        if (arg1.method2384(-1, class425.field6278)) {
            var2++;
        }
        if (arg0 <= 110) {
            method1505(-97);
        }
        if (arg1.method2384(-1, class112.field1576)) {
            var2++;
        }
        if (arg1.method2384(-1, class455.field6695)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 154)
    public static void method1505(int arg0) {
        field3175 = null;
        if (arg0 < 98) {
            method1504(110, null);
        }
        field3174 = null;
    }
}
