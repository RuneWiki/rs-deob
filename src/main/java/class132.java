import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class132 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "[I")
    public static int[] field2362 = new int[2048];

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field2369 = 0;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lia;")
    private static class257 field2365 = class28.method234(88, "Please wait)3)3)3");

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lia;")
    public static class257 field2368 = field2365;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Lha;")
    public static class137 field2358;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lia;")
    public class257 field2367;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Z")
    public boolean field2364;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lmb;B)V")
    public static final void method916(class178 arg0, byte arg1) {
        field2363++;
        class13.field254 = class260.method1730(arg0, class55.field1173, 0, 121);
        class104.field1943 = class45.method355(class96.field1809, arg0, (byte) 122, 0);
        class160.field2803 = class251.method1640((byte) -90, arg0, class229.field3846, 0);
        class251.method1640((byte) -86, arg0, class64.field1300, 0);
        class222.field3753 = class251.method1640((byte) -117, arg0, class44.field1031, 0);
        class73.field1425 = class251.method1640((byte) -93, arg0, class213.field3640, 0);
        class241.field4190 = class170.method1169(-2048, 0, class152.field2642, arg0);
        class201.field3446 = class170.method1169(-2048, 0, class85.field1664, arg0);
        class180.field3129 = class99.method707(0, class32.field614, arg0, false);
        class255.field4364 = class170.method1169(-2048, 0, class9.field178, arg0);
        class21.field440 = class170.method1169(-2048, 0, class216.field3660, arg0);
        class13.field248 = class231.method1506(arg0, class178.field3082, (byte) -93, 0);
        class9.field179 = class231.method1506(arg0, class204.field3505, (byte) -108, 0);
        class14.field310.method774(class9.field179, (int[]) null);
        class3.field93.method774(class9.field179, (int[]) null);
        class71.field1399.method774(class9.field179, (int[]) null);
        class190 var2 = class44.method350((byte) 55, 0, class161.field2827, arg0);
        var2.method1277();
        class118.field2120 = var2;
        class190[] var3 = class45.method355(client.field1532, arg0, (byte) -97, 0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1277();
        }
        class244.field4237 = var3;
        if (arg1 > -16) {
            return;
        }
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        for (int var9 = 0; var9 < class104.field1943.length; var9++) {
            class104.field1943[var9].method1276(var6 + var8, var5 - -var8, var7 + var8);
        }
        class13.field254[0].method1086(var6 + var8, var5 + var8, var7 + var8);
        class177.field3002 = class104.field1943;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method917(byte arg0) {
        if (arg0 != -70) {
            method921((byte) -29);
        }
        field2358 = null;
        field2368 = null;
        field2362 = null;
        field2365 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZILfc;II)V")
    public static final void method918(int arg0, boolean arg1, int arg2, class31 arg3, int arg4, int arg5) {
        field2372++;
        if (class238.field4063 >= 50 || arg3.field604 == null || arg2 >= arg3.field604.length || arg3.field604[arg2] == null) {
            return;
        }
        int var6 = arg3.field604[arg2][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 & 0xF;
        if (arg3.field604[arg2].length > 1) {
            int var10 = (int) (Math.random() * (double) arg3.field604[arg2].length);
            if (var10 > 0) {
                var7 = arg3.field604[arg2][var10];
            }
        }
        if (var9 == 0) {
            if (arg1) {
                class239.method1572(0, var8, var7, true);
            }
        } else if (class99.field1830 != 0) {
            int var11 = -28 / ((arg4 + 35) / 39);
            class40.field832[class238.field4063] = var7;
            int var12 = (arg5 - 64) / 128;
            class108.field2023[class238.field4063] = var8;
            class99.field1822[class238.field4063] = 0;
            class9.field181[class238.field4063] = null;
            int var13 = (arg0 - 64) / 128;
            class35.field709[class238.field4063] = (var12 << 16) - (-(var13 << 8) - var9);
            class238.field4063++;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Ljg;")
    public static final class16 method919(int arg0, int arg1) {
        field2360++;
        class16 var2 = (class16) class129.field2302.method836(-128, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class20.field418.method1197(arg0, arg1, -2);
        class16 var4 = new class16();
        if (var3 != null) {
            var4.method165(arg0, (byte) -42, new class152(var3));
        }
        class129.field2302.method832(var4, (long) arg0, arg1 - 1);
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lrg;Z)V")
    public static final void method920(class121 arg0, boolean arg1) {
        field2371++;
        class171.field2941 = arg0;
        if (arg1) {
            method922(41);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
    public static final void method921(byte arg0) {
        class205.field3524.field2677 = 0;
        field2373++;
        field2369 = 0;
        class201.field3449 = -1;
        class40.field827.field2677 = 0;
        class209.field3582 = 0;
        class199.field3407 = 0;
        class216.field3663 = false;
        class115.field2066 = -1;
        class71.field1400 = -1;
        class87.field1694 = 0;
        class166.field2900 = 0;
        class9.field177 = 0;
        class45.field1043 = -1;
        for (int var1 = 0; var1 < class55.field1180.length; var1++) {
            if (class55.field1180[var1] != null) {
                class55.field1180[var1].field4171 = -1;
            }
        }
        if (arg0 < 101) {
            field2362 = null;
        }
        for (int var2 = 0; var2 < class92.field1758.length; var2++) {
            if (class92.field1758[var2] != null) {
                class92.field1758[var2].field4171 = -1;
            }
        }
        class134.method932(32);
        class224.field3766 = 1;
        class209.method1404((byte) -38, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class137.field2456[var3] = true;
        }
        class250.field4308.method282(-119);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I")
    public static final int method922(int arg0) {
        class5.field114 = class96.field1813;
        field2366++;
        if (arg0 != -22749) {
            method920((class121) null, true);
        }
        class231.method1509(-1, false);
        class244.method1601(768);
        class30.method250(class5.field114, 0);
        class137.field2441 = new class180();
        class137.field2441.field4177 = 3000;
        class137.field2441.field4143 = 3000;
        class85.method638((byte) 46, class42.field850);
        return 10;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)V")
    public static final void method923(int arg0, int arg1) {
        if (arg0 != 7) {
            return;
        }
        class239.field4104.method831(arg1, -125);
        class27.field521.method831(arg1, -126);
        field2374++;
        class40.field829.method831(arg1, arg0 ^ 0xFFFFFF85);
        class248.field4287.method831(arg1, -126);
    }
}
