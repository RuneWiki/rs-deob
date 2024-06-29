import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class240 extends class206 {

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Lmh;")
    private static class62 field4088 = class201.method1405(true, "Please remove ");

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field4090 = 0;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Lmh;")
    public static class62 field4087 = field4088;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "Lmh;")
    public static class62 field4097 = field4088;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "Lmh;")
    public static class62 field4092 = class201.method1405(true, "Okay");

    @OriginalMember(owner = "client!of", name = "H", descriptor = "Lmh;")
    private static class62 field4099 = class201.method1405(true, "flash1:");

    @OriginalMember(owner = "client!of", name = "z", descriptor = "Lmh;")
    public static class62 field4091 = field4099;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "Lmh;")
    public static class62 field4098 = class201.method1405(true, "headicons_pk");

    @OriginalMember(owner = "client!of", name = "C", descriptor = "Lmh;")
    public static class62 field4094 = field4099;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILai;Lai;)V", line = 10)
    public static final void method1680(int arg0, class206 arg1, class206 arg2) {
        if (arg1.field3495 != null) {
            arg1.method1444((byte) 89);
        }
        arg1.field3492 = arg2;
        if (arg0 != -1) {
            field4092 = (class62) null;
        }
        arg1.field3495 = arg2.field3495;
        arg1.field3495.field3492 = arg1;
        arg1.field3492.field3495 = arg1;
        field4089++;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 28)
    public static void method1681(int arg0) {
        field4099 = null;
        field4088 = null;
        field4091 = null;
        field4087 = null;
        field4098 = null;
        field4094 = null;
        int var1 = 62 % ((arg0 + 10) / 55);
        field4097 = null;
        field4092 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)J", line = 46)
    public static final long method1682(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2724; var4++) {
            class164 var5 = var3.field2713[var4];
            if ((var5.field2668 >> 29 & 0x3L) == 2L && var5.field2651 == arg1 && var5.field2670 == arg2) {
                return var5.field2668;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 68)
    public static final void method1683(boolean arg0) {
        field4086++;
        class36.field496.method1392(0);
        if (arg0) {
            class62.field899.method1392(0);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V", line = 97)
    public static final void method1684(boolean arg0) {
        if (class187.field2990 < class169.field2758) {
            class187.field2990 = (float) ((double) class187.field2990 / 30.0D + (double) class187.field2990);
            if (class187.field2990 > class169.field2758) {
                class187.field2990 = class169.field2758;
            }
            class225.method1595((byte) 93);
        } else if (class187.field2990 > class169.field2758) {
            class187.field2990 = (float) ((double) class187.field2990 - (double) class187.field2990 / 30.0D);
            if (class169.field2758 > class187.field2990) {
                class187.field2990 = class169.field2758;
            }
            class225.method1595((byte) 101);
        }
        field4085++;
        if (!arg0) {
            method1682(-30, -3, -7);
        }
        if (class103.field1696 == -1 || class90.field1422 == -1) {
            return;
        }
        int var1 = class90.field1422 - class282.field4813;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class282.field4813 += var1;
        int var2 = class103.field1696 - class114.field1915;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class114.field1915 += var2;
        if (var2 == 0 && var1 == 0) {
            class90.field1422 = -1;
            class103.field1696 = -1;
        }
        class225.method1595((byte) 31);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIII)V", line = 167)
    public static final void method1685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4093++;
        if (arg5 < 51) {
            field4088 = (class62) null;
        }
        if (arg2 >= class176.field2819 && arg3 <= class52.field755 && class99.field1630 <= arg4 && class81.field1348 >= arg1) {
            if (arg0 == 1) {
                class115.method898(arg4, arg3, arg6, 124, arg1, arg2);
            } else {
                class140.method1049(arg3, arg1, arg6, arg2, -24258, arg0, arg4);
            }
        } else if (arg0 == 1) {
            class108.method831(arg2, arg6, arg3, arg1, arg4, 40);
        } else {
            class283.method1927(arg4, arg2, arg1, arg6, 66, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(II)V", line = 204)
    public class240(int arg0, int arg1) {
        this.field4100 = arg1;
        this.field4095 = arg0;
    }
}
