import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3302 = 0;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field3303 = 2;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lhe;")
    private static class54 field3308 = class6.method58("K", false);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lhe;")
    public static class54 field3306 = field3308;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field3307 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Z")
    public static volatile boolean field3300 = false;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lhe;")
    public static class54 field3312 = field3308;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lhe;")
    public static class54 field3304 = class6.method58("Sprites geladen)3", false);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Leb;")
    public static class31 field3309;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method1113(int arg0) {
        int var1 = -122 % ((arg0 - 51) / 42);
        field3308 = null;
        field3304 = null;
        field3312 = null;
        field3309 = null;
        field3306 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static final void method1114(byte arg0) {
        class130.field2938 = new int[104];
        class27.field728 = new byte[4][104][104];
        class39.field1002 = 99;
        field3311++;
        class54.field1318 = new int[104];
        class141.field3206 = new int[104];
        int var1 = 6 / ((arg0 + 42) / 57);
        class84.field2096 = new byte[4][104][104];
        class100.field2530 = new byte[4][105][105];
        class16.field474 = new int[4][105][105];
        class132.field2988 = new int[104];
        class84.field2085 = new byte[4][104][104];
        class118.field2760 = new byte[4][104][104];
        class87.field2151 = new int[104];
        class70.field1727 = new int[105][105];
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILd;I)V")
    public static final void method1115(int arg0, int arg1, class22 arg2, int arg3) {
        if (arg1 != 17933) {
            field3312 = null;
        }
        field3310++;
        if ((arg3 & 0x100) != 0) {
            int var4 = class40.field1044.method662(32767);
            int var5 = class40.field1044.method662(32767);
            arg2.method287(var4, false, class4.field138, var5);
            arg2.field977 = class4.field138 + 300;
            arg2.field963 = class40.field1044.method661((byte) 111);
            arg2.field966 = class40.field1044.method661((byte) 92);
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field930 = class40.field1044.method631((byte) -110);
            int var6 = class40.field1044.method659(arg1 - 18031);
            arg2.field945 = 0;
            arg2.field946 = 0;
            if (arg2.field930 == 65535) {
                arg2.field930 = -1;
            }
            arg2.field939 = (var6 & 0xFFFF) + class4.field138;
            arg2.field933 = var6 >> 16;
            if (arg2.field939 > class4.field138) {
                arg2.field946 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field997 = class40.field1044.method635((byte) -85);
            if (arg2.field997 == 65535) {
                arg2.field997 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field996 = class40.field1044.method657((byte) -52);
            arg2.field935 = class40.field1044.method657((byte) -118);
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field944 = class40.field1044.method662(32767);
            arg2.field983 = class40.field1044.method662(32767);
            arg2.field982 = class40.field1044.method662(arg1 + 14834);
            arg2.field936 = class40.field1044.method661((byte) 42);
            arg2.field928 = class40.field1044.method645(0) + class4.field138;
            arg2.field985 = class40.field1044.method631((byte) -114) + class4.field138;
            arg2.field949 = class40.field1044.method630(255);
            arg2.field940 = 0;
            arg2.field932 = 1;
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field975 = class40.field1044.method634(arg1 - 17848);
            if (arg2.field975.method413(21340, 0) == 126) {
                arg2.field975 = arg2.field975.method384(1, arg1 ^ 0xFFFFB995);
                class80.method612(arg2.field975, arg2.field626, (byte) 122, 2);
            } else if (class108.field2639 == arg2) {
                class80.method612(arg2.field975, arg2.field626, (byte) 114, 2);
            }
            arg2.field957 = 150;
            arg2.field924 = 0;
            arg2.field929 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            int var7 = class40.field1044.method635((byte) -87);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class40.field1044.method630(arg1 - 17678);
            class129.method972(var8, (byte) 91, arg2, var7);
        }
        if ((arg3 & 0x1) != 0) {
            int var9 = class40.field1044.method657((byte) 116);
            int var10 = class40.field1044.method661((byte) 34);
            int var11 = class40.field1044.method638(0);
            int var12 = class40.field1044.field2076;
            if (arg2.field626 != null && arg2.field642 != null) {
                long var13 = arg2.field626.method385((byte) -113);
                boolean var15 = false;
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < class54.field1347; var16++) {
                        if (class15.field464[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && class156.field3557 == 0) {
                    class78.field1887.field2076 = 0;
                    class40.field1044.method642(class78.field1887.field2055, 0, arg1 + 960034779, var11);
                    class78.field1887.field2076 = 0;
                    class54 var17 = class154.method1186(class138.method1073((byte) -83, class78.field1887).method380(false));
                    arg2.field975 = var17.method394(124);
                    arg2.field957 = 150;
                    arg2.field924 = var9 & 0xFF;
                    arg2.field929 = var9 >> 8;
                    if (var10 == 2 || var10 == 3) {
                        class80.method612(var17, class143.method1105(new class54[] { class129.field2909, arg2.field626 }, arg1 - 18775), (byte) 122, 1);
                    } else if (var10 == 1) {
                        class80.method612(var17, class143.method1105(new class54[] { class89.field2200, arg2.field626 }, arg1 ^ 0xFFFFBABB), (byte) 126, 1);
                    } else {
                        class80.method612(var17, arg2.field626, (byte) 122, 2);
                    }
                }
            }
            class40.field1044.field2076 = var11 + var12;
        }
        if ((arg3 & 0x2) != 0) {
            int var18 = class40.field1044.method661((byte) 33);
            int var19 = class40.field1044.method662(32767);
            arg2.method287(var18, false, class4.field138, var19);
            arg2.field977 = class4.field138 + 300;
            arg2.field963 = class40.field1044.method662(arg1 + 14834);
            arg2.field966 = class40.field1044.method662(arg1 ^ 0x39F2);
        }
        if ((arg3 & 0x40) == 0) {
            return;
        }
        int var20 = class40.field1044.method661((byte) 108);
        byte[] var21 = new byte[var20];
        class83 var22 = new class83(var21);
        class40.field1044.method675(0, (byte) -75, var20, var21);
        class50.field1199[arg0] = var22;
        arg2.method179(arg1 ^ 0x460C, var22);
    }
}
