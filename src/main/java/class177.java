import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class177 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field2337 = 0;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field2339 = -1;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field2341 = 16777215;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field2344 = 0;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
    public static int[] field2340;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[Z")
    public static boolean[] field2338;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Llm;ZLlm;)V", line = 9)
    public static final void method1078(class347 arg0, boolean arg1, class347 arg2) {
        class438.field6421 = arg0;
        field2346++;
        class312.field4573 = arg2;
        if (arg1) {
            field2344 = -39;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IC)B", line = 23)
    public static final byte method1079(int arg0, char arg1) {
        field2342++;
        if (arg0 < 122) {
            method1081(false);
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)I", line = 170)
    public static final int method1080(int arg0, int arg1, int arg2) {
        if (arg1 < 113) {
            return -44;
        } else {
            field2336++;
            return arg2 == 1 || arg2 == 3 ? class59.field797[arg0 & 0x3] : class28.field406[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 194)
    public static void method1081(boolean arg0) {
        field2340 = null;
        field2338 = null;
        if (!arg0) {
            method1082(-117, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V", line = 208)
    public static final void method1082(int arg0, byte arg1) {
        if (arg1 != -118) {
            field2339 = 36;
        }
        field2343++;
        class72 var2 = (class72) class8.field145.method384((long) arg0, true);
        if (var2 != null) {
            var2.method322(11);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public abstract void method978(int arg0);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public abstract void method980(int arg0);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III[I)V")
    public abstract void method979(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([I)V")
    public abstract void method987(int[] arg0);

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public abstract void method988(int arg0);

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
    public abstract void method984(int arg0);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lvj;)V")
    public abstract void method986(class177 arg0);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()V")
    public abstract void method976();

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V")
    public abstract void method981(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
    public abstract void method982(int arg0);

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)V")
    public abstract void method985(int arg0, int arg1, int arg2);
}
