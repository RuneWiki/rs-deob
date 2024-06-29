import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class241 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[[I")
    public static int[][] field3458 = new int[6][];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3456 = new String[100];

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3461 = Calendar.getInstance();

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3459 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Z")
    public static volatile boolean field3464 = true;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Lfda;")
    public static class336 field3465;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Leh;")
    public static class378 field3463;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lkia;I)I", line = 12)
    public static final int method1640(class645 arg0, int arg1) {
        field3460++;
        class279 var2 = arg0.field9071;
        if (arg1 != 0) {
            method1641(84, null);
        }
        if (var2.field3943 != null) {
            var2 = var2.method1810((byte) -113, class271.field3796);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3942;
        class607 var4 = arg0.method2708(116);
        if (arg0.field6383 == -1 || arg0.field6358) {
            var3 = var2.field3934;
        } else if (arg0.field6383 == var4.field8544 || arg0.field6383 == var4.field8577 || arg0.field6383 == var4.field8562 || arg0.field6383 == var4.field8546) {
            var3 = var2.field3910;
        } else if (arg0.field6383 == var4.field8569 || arg0.field6383 == var4.field8566 || arg0.field6383 == var4.field8550 || arg0.field6383 == var4.field8535) {
            var3 = var2.field3875;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILlc;)V", line = 50)
    public static final void method1641(int arg0, class672 arg1) {
        if (arg0 == 48) {
            field3457++;
            class285.field4370 = arg1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 65)
    public static void method1642(int arg0) {
        field3456 = null;
        field3458 = null;
        field3459 = null;
        field3461 = null;
        field3465 = null;
        if (arg0 != -28736) {
            method1642(83);
        }
        field3463 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZJI)Ljava/lang/String;", line = 81)
    public static final String method1643(int arg0, int arg1, boolean arg2, long arg3, int arg4) {
        field3462++;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < (long) arg1) {
            var8 = true;
            arg3 = -arg3;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }
}
