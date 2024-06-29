import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class231 {

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lrm;")
    public static class184 field3604 = new class184(30);

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field3610 = 0;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "[I")
    public static int[] field3608 = new int[4096];

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[Z")
    public static boolean[] field3607 = new boolean[100];

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[Lwf;")
    public static class56[] field3611;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[[[B")
    public static byte[][][] field3609;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 4)
    public static void method1666(byte arg0) {
        field3608 = null;
        field3604 = null;
        field3607 = null;
        if (arg0 != 114) {
            method1666((byte) -29);
        }
        field3611 = null;
        field3609 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 24)
    public static final void method1667(int arg0) {
        field3606++;
        class56.field778.method243((byte) -107);
        for (int var1 = 0; var1 < 32; var1++) {
            class272.field4225[var1] = 0L;
        }
        if (arg0 >= -45) {
            field3611 = (class56[]) null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class94.field1245[var2] = 0L;
        }
        class283.field4376 = 0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB[Lcd;)V", line = 56)
    public static final void method1668(int arg0, byte arg1, class136[] arg2) {
        int var3 = 0;
        int var4 = 120 / ((arg1 + 72) / 48);
        while (arg2.length > var3) {
            class136 var5 = arg2[var3];
            if (var5 != null) {
                if (var5.field2063 == 0) {
                    if (var5.field2062 != null) {
                        method1668(arg0, (byte) 76, var5.field2062);
                    }
                    class25 var6 = (class25) class210.field3304.method2168((long) var5.field2069, (byte) -85);
                    if (var6 != null) {
                        class72.method555(arg0, -101, var6.field376);
                    }
                }
                if (arg0 == 0 && var5.field2120 != null) {
                    class15 var7 = new class15();
                    var7.field248 = var5;
                    var7.field243 = var5.field2120;
                    class172.method1282(var7, (byte) 73);
                }
                if (arg0 == 1 && var5.field2003 != null) {
                    label62: {
                        if (var5.field2086 >= 0) {
                            class136 var8 = class14.method140(var5.field2069, 1036508464);
                            if (var8 == null || var8.field2062 == null || var5.field2086 >= var8.field2062.length || var8.field2062[var5.field2086] != var5) {
                                break label62;
                            }
                        }
                        class15 var9 = new class15();
                        var9.field243 = var5.field2003;
                        var9.field248 = var5;
                        class172.method1282(var9, (byte) 73);
                    }
                }
            }
            var3++;
        }
        field3602++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lvl;Z)V", line = 124)
    public static final void method1669(class6 arg0, boolean arg1) {
        field3605++;
        if (!arg1) {
            return;
        }
        for (int var2 = 0; var2 < class42.field575; var2++) {
            int var3 = arg0.method52(-32768);
            int var4 = arg0.method39((byte) 93);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class142.field2251[var3] != null) {
                class142.field2251[var3].field1215 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)Lli;", line = 154)
    public static final class194 method1670(int arg0, byte arg1) {
        field3603++;
        class194 var2 = (class194) class81.field1115.method1351((long) arg0, 63);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field1280.method1813(arg0, 3, true);
        class194 var4 = new class194();
        if (var3 != null) {
            var4.method1434(new class6(var3), (byte) 120);
        }
        class81.field1115.method1347(var4, (long) arg0, (byte) -112);
        return arg1 >= -32 ? (class194) null : var4;
    }
}
