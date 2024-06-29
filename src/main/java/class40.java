import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class40 extends class166 {

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[B")
    public byte[] field850;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field848 = 255;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Lcd;")
    public static class23 field849 = class54.method414("sch-Utteln:", -1);

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Lcd;")
    private static class23 field853 = class54.method414("Please check your message)2centre for details)3", -1);

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Lcd;")
    public static class23 field854 = field853;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Lcd;")
    private static class23 field859 = class54.method414("Please subscribe)1 or use a different world)3", -1);

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Lcd;")
    public static class23 field851 = field859;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "[[[I")
    public static int[][][] field852;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([Lfa;II)V")
    public static final void method327(class47[] arg0, int arg1, int arg2) {
        field857++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class47 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field1127 == 0) {
                    if (var4.field1029 != null) {
                        method327(var4.field1029, 1, arg2);
                    }
                    class115 var5 = (class115) class31.field665.method260((long) var4.field1071, (byte) 28);
                    if (var5 != null) {
                        class162.method991(var5.field2408, arg2, (byte) 12);
                    }
                }
                if (arg2 == 0 && var4.field1148 != null) {
                    class144 var6 = new class144();
                    var6.field2939 = var4;
                    var6.field2942 = var4.field1148;
                    class50.method391(arg1 ^ 0xBBE3FE6F, var6);
                }
                if (arg2 == 1 && var4.field1126 != null) {
                    if (var4.field1070 >= 0) {
                        class47 var7 = class113.method725((byte) 117, var4.field1071);
                        if (var7 == null || var7.field1029 == null || var7.field1029.length <= var4.field1070 || var7.field1029[var4.field1070] != var4) {
                            continue;
                        }
                    }
                    class144 var8 = new class144();
                    var8.field2942 = var4.field1126;
                    var8.field2939 = var4;
                    class50.method391(-1142686098, var8);
                }
            }
        }
        if (arg1 != 1) {
            field848 = 55;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static final void method328(byte arg0) {
        field858++;
        if (class193.field3810 && class59.field1385 != class28.field614) {
            class43.method344(class84.field1787, class134.field2790.field230[0], class59.field1385, class58.field1349, false, class134.field2790.field219[0]);
            return;
        }
        if (class59.field1385 != class119.field2448) {
            class119.field2448 = class59.field1385;
            class190.method1236(class59.field1385, (byte) -53);
        }
        if (arg0 != -77) {
            field848 = 2;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIB)I")
    public static final int method329(int arg0, int arg1, int arg2, byte arg3) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        field860++;
        if (arg2 > 243) {
            arg1 /= 2;
        }
        int var4 = (arg1 / 32 << 7) + (arg0 / 4 << 10) + arg2 / 2;
        if (arg3 != -82) {
            method331((byte) 22);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V")
    public class40(byte[] arg0) {
        this.field850 = arg0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lod;")
    public static final class129 method330(int arg0, int arg1) {
        field855++;
        class129 var2 = (class129) class28.field609.method995(-125, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class95.field2000.method651(4, arg1, 8);
        if (arg0 < 107) {
            field849 = null;
        }
        class129 var4 = new class129();
        if (var3 != null) {
            var4.method834(new class189(var3), 5715);
        }
        class28.field609.method990(var4, (long) arg1, -116);
        return var4;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
    public static void method331(byte arg0) {
        field849 = null;
        field852 = null;
        field851 = null;
        field853 = null;
        if (arg0 >= -16) {
            method331((byte) 70);
        }
        field854 = null;
        field859 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lva;Lcd;B)I")
    public static final int method332(class189 arg0, class23 arg1, byte arg2) {
        field856++;
        if (arg2 < 124) {
            return 48;
        } else {
            int var3 = arg0.field3752;
            arg0.method1192(arg1.field473, 96);
            arg0.field3752 += class4.field48.method520(arg1.field473, arg0.field3753, 0, 84, arg1.field480, arg0.field3752);
            return arg0.field3752 - var3;
        }
    }
}
