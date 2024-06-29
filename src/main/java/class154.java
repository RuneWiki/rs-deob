import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class154 extends class216 {

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    private int field2517 = -32768;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lph;")
    public static class229 field2508 = class266.method1858("Veuillez commencer par supprimer ", 0);

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lph;")
    public static class229 field2506 = class266.method1858(")0", 0);

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public int field2505;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 7)
    public static void method1114(int arg0) {
        field2506 = null;
        if (arg0 == -32768) {
            field2508 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V", line = 20)
    public static final void method1115(int arg0) {
        if (arg0 == 0) {
            class84.field1446++;
            field2514++;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIIIJILbn;)V", line = 40)
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class194 arg10) {
        field2509++;
        class286 var13 = class124.method920(-84, this.field2505).method1337((class312) null, this.field2511, 0, false);
        if (var13 != null) {
            var13.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2517 = var13.method182();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V", line = 59)
    public static final void method1116(int arg0, boolean arg1) {
        class5.field54 = (byte[][][]) null;
        class243.field4012 = (byte[][][]) null;
        class119.field2001 = 0;
        class321.field5438 = (int[][][]) null;
        class68.field1096 = (int[][][]) null;
        class68.field1097 = (byte[][][]) null;
        class186.field3029 = (byte[][][]) null;
        field2515++;
        class84.field1451 = (byte[][][]) null;
        class38.field612 = (short[][][]) null;
        class293.field4793 = null;
        if (arg1 && class169.field2795 != null) {
            class299.field4868 = class169.field2795.field3874;
        } else {
            class299.field4868 = null;
        }
        class169.field2795 = null;
        class320.field5407 = null;
        class25.field330.method1573((byte) -48);
        class102.field1736 = null;
        class25.field332 = null;
        class316.field5373 = null;
        class145.field2357 = null;
        class1.field5 = null;
        class118.field1986 = null;
        class187.field3053 = null;
        class240.field3966 = null;
        class205.field3380 = -1;
        class61.field870 = arg0;
        class119.field1999 = null;
        class141.field2276 = null;
        class118.field1988 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)V", line = 99)
    public static final void method1117(int arg0, byte arg1) {
        field2510++;
        class48.field696 = arg0;
        class214.field3527 = 50;
        if (arg1 != 40) {
            field2512 = 58;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIII)V", line = 112)
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2513++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIII)V", line = 120)
    public static final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < 7) {
            field2507 = 89;
        }
        field2516++;
        if (arg4 < 1 || arg3 < 1 || arg4 > 102 || arg3 > 102) {
            return;
        }
        if (!class61.method415((byte) 68) && (class245.field4050[0][arg4][arg3] & 0x2) == 0) {
            int var8 = arg6;
            if ((class245.field4050[arg6][arg4][arg3] & 0x8) != 0) {
                var8 = 0;
            }
            if (class102.field1742 != var8) {
                return;
            }
        }
        int var9 = arg6;
        if (arg6 < 3 && (class245.field4050[1][arg4][arg3] & 0x2) == 2) {
            var9 = arg6 + 1;
        }
        class84.method621(80, class160.field2592[arg6], arg4, var9, arg6, arg0, arg3);
        if (arg5 >= 0) {
            boolean var10 = class120.field2017;
            class120.field2017 = true;
            class213.method1509(arg2, false, false, arg4, arg3, arg7, false, var9, arg6, class160.field2592[arg6], arg5);
            class120.field2017 = var10;
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)I", line = 174)
    public static final int method1119(int arg0) {
        if (arg0 <= 112) {
            method1118(66, 122, 44, 121, 32, 60, -110, -116);
        }
        field2518++;
        if (class1.field5 == null) {
            return -1;
        }
        while (class1.field5.field882 > class249.field4139) {
            if (class1.field5.method410(class249.field4139, (byte) -12)) {
                return class249.field4139++;
            }
            class249.field4139++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()I", line = 202)
    public final int method182() {
        field2504++;
        return this.field2517;
    }
}
