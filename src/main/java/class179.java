import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class179 implements Runnable {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Ldf;")
    public static class51 field2956 = class46.method233("runes", 100);

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field2954 = 0;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field2960 = 0;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lvh;")
    public static class252 field2958 = new class252();

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ve", name = "run", descriptor = "()V")
    public final void run() {
        field2957++;
        try {
            while (true) {
                class252 var1 = class14.field207;
                class124 var2;
                synchronized (class14.field207) {
                    var2 = (class124) class14.field207.method1720(true);
                }
                if (var2 == null) {
                    class147.method1066(100L, 0);
                    Object var6 = class23.field355;
                    synchronized (class23.field355) {
                        if (class239.field4163 <= 1) {
                            class239.field4163 = 0;
                            class23.field355.notifyAll();
                            return;
                        }
                        class239.field4163--;
                    }
                } else {
                    if (var2.field2107 == 0) {
                        var2.field2102.method1343((byte) -113, var2.field2098.length, (int) var2.field1760, var2.field2098);
                        class252 var3 = class14.field207;
                        synchronized (class14.field207) {
                            var2.method764((byte) -13);
                        }
                    } else if (var2.field2107 == 1) {
                        var2.field2098 = var2.field2102.method1340((int) var2.field1760, (byte) 94);
                        class252 var4 = class14.field207;
                        synchronized (class14.field207) {
                            class245.field4249.method1709(-125, var2);
                        }
                    }
                    Object var5 = class23.field355;
                    synchronized (class23.field355) {
                        if (class239.field4163 <= 1) {
                            class239.field4163 = 0;
                            class23.field355.notifyAll();
                            return;
                        }
                        class239.field4163 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class89.method674(var17, (String) null, 95);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1275(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2953++;
        int var8 = arg0 + 1;
        class242.method1660((byte) -79, class80.field1324[arg0], arg2, arg1, arg5);
        int var9 = arg3 - 1;
        class242.method1660((byte) -79, class80.field1324[arg3], arg2, arg1, arg5);
        if (arg4) {
            method1276(8);
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class80.field1324[var6];
            var7[arg5] = var7[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1276(int arg0) {
        field2958 = null;
        if (arg0 != 0) {
            field2959 = -79;
        }
        field2956 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public static final void method1277(int arg0, int arg1) {
        class97 var2 = class27.field395[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class97 var4 = class27.field395[var3][arg0][arg1] = class27.field395[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1617--;
                for (int var5 = 0; var5 < var4.field1620; var5++) {
                    class33 var6 = var4.field1632[var5];
                    if ((var6.field477 >> 29 & 0x3L) == 2L && var6.field492 == arg0 && var6.field491 == arg1) {
                        var6.field482--;
                    }
                }
            }
        }
        if (class27.field395[0][arg0][arg1] == null) {
            class27.field395[0][arg0][arg1] = new class97(0, arg0, arg1);
        }
        class27.field395[0][arg0][arg1].field1626 = var2;
        class27.field395[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
    public static final boolean method1278(int arg0, int arg1, int arg2) {
        field2955++;
        if (arg2 == 3) {
            return (arg0 >> arg1 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }
}
