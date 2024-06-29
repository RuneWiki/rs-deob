import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class class278 extends class115 {

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "Z")
    public volatile boolean field4920 = true;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "Lud;")
    public static class279 field4916 = class130.method1024("Musik)2Engine vorbereitet)3", 255);

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field4913 = 0;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "Z")
    public static boolean field4915 = false;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "F")
    public static float field4918;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "Z")
    public boolean field4910;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "Z")
    public boolean field4914;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "[I")
    public static int[] field4909;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILaj;I)V", line = 11)
    public static final void method1961(int arg0, class1 arg1, int arg2) {
        if (arg1.field65 > class8.field279) {
            class324.method2280(arg1, -24376);
        } else if (class8.field279 <= arg1.field98) {
            class1.method6(true, arg1);
        } else {
            class8.method56(57, arg1);
        }
        if (arg1.field86 < 128 || arg1.field79 < 128 || arg1.field86 >= 13184 || arg1.field79 >= 13184) {
            arg1.field65 = 0;
            arg1.field30 = -1;
            arg1.field98 = 0;
            arg1.field81 = -1;
            arg1.field86 = arg1.field11[0] * 128 + arg1.method3((byte) -127) * 64;
            arg1.field79 = arg1.field34[0] * 128 + (arg1.method3((byte) -128) * 64);
            arg1.method11(true);
        }
        if (class72.field1420 == arg1 && (arg1.field86 < 1536 || arg1.field79 < 1536 || arg1.field86 >= 11776 || arg1.field79 >= 11776)) {
            arg1.field98 = 0;
            arg1.field30 = -1;
            arg1.field65 = 0;
            arg1.field81 = -1;
            arg1.field86 = arg1.field11[0] * 128 + (arg1.method3((byte) -127) * 64);
            arg1.field79 = arg1.field34[0] * 128 + arg1.method3((byte) -114) * 64;
            arg1.method11(true);
        }
        class216.method1580(104, arg1);
        int var3 = 45 % ((arg2 - 39) / 49);
        class41.method356(arg1, -127);
        field4911++;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V", line = 59)
    public static final void method1962(boolean arg0) {
        if (arg0) {
            field4908++;
            class63.field1297.method1334((byte) -25);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V", line = 76)
    public static final void method1963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= class249.field4449 && arg5 <= class44.field929 && arg3 >= class135.field2463 && arg2 <= class108.field2002) {
            class294.method2089(7, arg5, arg4, arg3, arg1, arg2);
        } else {
            class92.method783(arg5, arg4, arg1, arg3, arg2, true);
        }
        field4912++;
        if (arg0 != -20408) {
            field4915 = true;
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)V", line = 103)
    public static void method1964(byte arg0) {
        if (arg0 < 76) {
            field4918 = -1.6252894F;
        }
        field4909 = null;
        field4916 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([SB[Lud;)V", line = 136)
    public static final void method1965(short[] arg0, byte arg1, class279[] arg2) {
        field4919++;
        class207.method1528(arg0, (byte) 49, arg2, 0, arg2.length - 1);
        int var3 = 32 % ((arg1 - 1) / 54);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)[B")
    public abstract byte[] method873(int arg0);

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)I")
    public abstract int method869(boolean arg0);
}
