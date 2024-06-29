import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class45 extends class182 {

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "Lsg;")
    private static class169 field833 = class165.method1060("yellow:", 1536);

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "Lsg;")
    public static class169 field838 = class165.method1060("", 1536);

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "Lsg;")
    public static class169 field841 = field833;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "Lsg;")
    public static class169 field840 = field833;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Lsg;")
    public static class169 field844 = field838;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "Lpg;")
    public class142 field836;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "Lqd;")
    public static class148 field842;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "Lqd;")
    public class148 field845;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Z")
    public static boolean field839;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "[B")
    public byte[] field847;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method282(byte arg0) {
        field833 = null;
        field842 = null;
        if (arg0 > -68) {
            method285(false, null, -92);
        }
        field844 = null;
        field838 = null;
        field841 = null;
        field840 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method283(int arg0, Random arg1, int arg2) {
        if (arg0 != -1838102752) {
            return 63;
        }
        field843++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class103.method611(arg2, (byte) -9)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class3.method22(arg2, (byte) -54, var4);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLsg;Lsg;Lke;Lke;)Lhg;")
    public static final class71 method284(byte arg0, class169 arg1, class169 arg2, class95 arg3, class95 arg4) {
        if (arg0 != -72) {
            method287((byte) -113, -82L);
        }
        field834++;
        int var5 = arg3.method553(-64, arg1);
        int var6 = arg3.method562(var5, arg2, 25284);
        return class66.method423(-117, var6, var5, arg4, arg3);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLga;I)V")
    public static final void method285(boolean arg0, class57 arg1, int arg2) {
        field837++;
        if (class116.field2148 != null) {
            try {
                class116.field2148.method359((byte) 63);
            } catch (Exception var8) {
            }
            class116.field2148 = null;
        }
        class116.field2148 = arg1;
        if (arg2 != 4) {
            method287((byte) 84, 16L);
        }
        class201.method1312(arg0, (byte) 26);
        class91.field1683.field2346 = 0;
        class189.field3731 = null;
        class182.field3558 = null;
        class42.field785 = 0;
        while (true) {
            class13 var3 = (class13) class192.field3796.method1042((byte) 104);
            if (var3 == null) {
                while (true) {
                    class13 var4 = (class13) class60.field1115.method1042((byte) 104);
                    if (var4 == null) {
                        if (class90.field1648 != 0) {
                            try {
                                class127 var5 = new class127(4);
                                var5.method821(4, 64);
                                var5.method821(class90.field1648, 64);
                                var5.method801(0, (byte) 87);
                                class116.field2148.method361(0, 4, arg2 ^ 0xFFFFFFFB, var5.field2325);
                            } catch (IOException var7) {
                                try {
                                    class116.field2148.method359((byte) 97);
                                } catch (Exception var6) {
                                }
                                class193.field3813++;
                                class116.field2148 = null;
                            }
                        }
                        class103.field1900 = 0;
                        class201.field3924 = class116.method712((byte) -122);
                        return;
                    }
                    class197.field3879.method1240(16, var4);
                    class46.field855.method1044(var4.field3543, true, var4);
                    class137.field2557--;
                    class154.field2974++;
                }
            }
            class54.field985.method1044(var3.field3543, true, var3);
            class48.field875--;
            class16.field332++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Lic;")
    public static final class76 method286(byte arg0, int arg1) {
        class76 var2 = (class76) class204.field4001.method1206((long) arg1, -24742);
        field832++;
        if (var2 != null) {
            return var2;
        } else if (arg0 < 126) {
            return null;
        } else {
            byte[] var3 = class148.field2717.method552(arg1, 13, 0);
            class76 var4 = new class76();
            var4.field1431 = arg1;
            if (var3 != null) {
                var4.method465((byte) -90, new class127(var3));
            }
            class204.field4001.method1208((long) arg1, -81, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BJ)V")
    public static final void method287(byte arg0, long arg1) {
        if (arg0 < 77) {
            return;
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field846++;
    }
}
