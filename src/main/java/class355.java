import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class355 extends class70 {

    @OriginalMember(owner = "client!an", name = "r", descriptor = "[Leb;")
    public static class133[] field5663 = new class133[14];

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field5659 = 0;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "[I")
    public static int[] field5670 = new int[2000];

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public int field5657;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public int field5661;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "[[[B")
    public static byte[][][] field5656;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V", line = 8)
    public static final void method2518(int arg0) {
        field5666++;
        if (class346.field5530 != -1) {
            class319.method2297(class346.field5530, -1, -1, false, 0);
            class346.field5530 = -1;
        }
        int var1 = -68 / ((arg0 - 5) / 45);
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)V", line = 26)
    public static void method2519(int arg0) {
        if (arg0 == -11197) {
            field5663 = null;
            field5656 = (byte[][][]) null;
            field5670 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLec;I)V", line = 40)
    public static final void method2520(boolean arg0, class47 arg1, int arg2) {
        field5665++;
        Object[] var3 = arg1.field936;
        int var4 = (Integer) var3[0];
        class351 var5 = class112.method838(0, var4);
        if (var5 == null) {
            return;
        }
        class284.field4632 = new int[var5.field5605];
        class341.field5403 = new String[var5.field5609];
        int var6 = 0;
        int var7 = 0;
        if (!arg0) {
            return;
        }
        for (int var8 = 1; var8 < var3.length; var8++) {
            if (var3[var8] instanceof Integer) {
                int var9 = (Integer) var3[var8];
                if (var9 == -2147483647) {
                    var9 = arg1.field945;
                }
                if (var9 == -2147483646) {
                    var9 = arg1.field941;
                }
                if (var9 == -2147483645) {
                    var9 = arg1.field939 == null ? -1 : arg1.field939.field3103;
                }
                if (var9 == -2147483644) {
                    var9 = arg1.field949;
                }
                if (var9 == -2147483643) {
                    var9 = arg1.field939 == null ? -1 : arg1.field939.field3023;
                }
                if (var9 == -2147483642) {
                    var9 = arg1.field944 == null ? -1 : arg1.field944.field3103;
                }
                if (var9 == -2147483641) {
                    var9 = arg1.field944 == null ? -1 : arg1.field944.field3023;
                }
                if (var9 == -2147483640) {
                    var9 = arg1.field937;
                }
                if (var9 == -2147483639) {
                    var9 = arg1.field947;
                }
                class284.field4632[var7++] = var9;
            } else if (var3[var8] instanceof String) {
                String var10 = (String) var3[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg1.field935;
                }
                class341.field5403[var6++] = var10;
            }
        }
        class50.method443(var5, 256, arg2);
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(I)V", line = 136)
    public static final void method2521(int arg0) {
        field5664++;
        if (arg0 != -18283) {
            method2519(-9);
        }
        class147.field2513.method889((byte) 91);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V", line = 169)
    public static final void method2522(byte arg0) {
        field5669++;
        class23.field565.method889((byte) -127);
        if (arg0 >= -18) {
            field5659 = -62;
        }
        class125.field2200.method889((byte) -122);
    }
}
