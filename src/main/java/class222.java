import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class222 extends class205 {

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    private int field3465 = -32768;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "[Z")
    public static boolean[] field3476 = new boolean[100];

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "Z")
    public static boolean field3479 = false;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public int field3477;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Luf;")
    public static class176 field3470;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field3480;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "[[[B")
    public static byte[][][] field3467;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class240 arg10) {
        class233 var13 = class32.method260(this.field3477, true).method872(0, (class242) null, 0, (class223) null, 0, this.field3464, -1);
        field3475++;
        if (var13 != null) {
            var13.method225(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3465 = var13.method223();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static final void method1482(byte arg0) {
        if (arg0 != -102) {
            method1484((byte) 35);
        }
        field3478++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3473++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZIIB)I")
    public static final int method1483(boolean arg0, int arg1, int arg2, byte arg3) {
        field3472++;
        class127 var4 = (class127) class251.field3858.method1414(true, (long) arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg3 > -12) {
            return -106;
        }
        for (int var6 = 0; var6 < var4.field1998.length; var6++) {
            if (var4.field1998[var6] >= 0 && var4.field1998[var6] < class292.field4595) {
                class123 var7 = class32.method260(var4.field1998[var6], true);
                if (var7.field1940 != null) {
                    class229 var8 = (class229) var7.field1940.method1414(true, (long) arg2);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field1989[var6] * var8.field3580;
                        } else {
                            var5 += var8.field3580;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static void method1484(byte arg0) {
        field3470 = null;
        field3476 = null;
        field3467 = null;
        if (arg0 >= -8) {
            method1482((byte) -20);
        }
        field3480 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()I")
    public final int method223() {
        field3466++;
        return this.field3465;
    }
}
