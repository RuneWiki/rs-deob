import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class404 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field5114;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[[S")
    public static short[][] field5109;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2247(int arg0) {
        for (int var1 = 0; var1 < class3.field26; var1++) {
            class268 var2 = class742.field10360[var1];
            if (var2.field3372 == 3) {
                if (var2.field3379 == null) {
                    var2.field3381 = Integer.MIN_VALUE;
                } else {
                    class307.field4055.method1319(var2.field3379);
                }
            }
        }
        field5112++;
        if (arg0 > -33) {
            field5114 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLjava/lang/String;Z)V", line = 34)
    public static final void method2248(boolean arg0, String arg1, boolean arg2) {
        field5113++;
        if (!arg2) {
            method2250(-48);
        }
        class595.method3371(-1, arg0, arg1, -1, -1);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnd;IZIIZI)V", line = 45)
    public static final void method2249(class547 arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class174.field2415 = arg6;
        client.field3977 = null;
        class360.field4661 = arg1;
        if (!arg5) {
            method2247(-66);
        }
        class709.field9849 = arg2;
        class230.field3028 = arg0;
        field5111++;
        class514.field7217 = 1;
        class615.field8495 = arg4;
        class272.field3416 = arg3;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 68)
    public static void method2250(int arg0) {
        field5109 = null;
        field5114 = null;
        if (arg0 < 53) {
            method2248(false, null, true);
        }
    }
}
