import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class94 {

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lta;")
    public static class255 field1859 = new class255(16);

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "Lcc;")
    public static class209 field1863 = class95.method669(115, "<br>(X");

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lcc;")
    public static class209 field1860 = class95.method669(106, "leuchten1:");

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field1864 = -1;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Z")
    public static boolean field1865 = false;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lcc;ILcc;Lcc;II)V")
    public static final void method655(class209 arg0, int arg1, class209 arg2, class209 arg3, int arg4, int arg5) {
        field1858++;
        if (arg4 >= -94) {
            return;
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class102.field1956[var6] = class102.field1956[var6 - 1];
            class231.field4199[var6] = class231.field4199[var6 - 1];
            class136.field2558[var6] = class136.field2558[var6 - 1];
            class230.field4188[var6] = class230.field4188[var6 - 1];
            class192.field3481[var6] = class192.field3481[var6 - 1];
        }
        class274.field4852 = class54.field1069;
        class171.field3127++;
        class231.field4199[0] = arg3;
        class136.field2558[0] = arg0;
        class230.field4188[0] = arg2;
        class102.field1956[0] = arg5;
        class192.field3481[0] = arg1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
    public static final void method656(int arg0, int arg1, int arg2) {
        field1853++;
        class195 var3 = class178.method1229(arg2, 5, arg0 - 26150);
        if (arg0 != 26030) {
            method655((class209) null, -62, (class209) null, (class209) null, 101, -50);
        }
        var3.method1338(0);
        var3.field3511 = arg1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
    public static final void method657(boolean arg0) {
        if (class193.field3488 != null) {
            class193.field3488.method1924(arg0);
            class193.field3488 = null;
        }
        field1857++;
        class25.method209(1);
        class185.method1256();
        for (int var1 = 0; var1 < 4; var1++) {
            class122.field2404[var1].method1170((byte) -128);
        }
        class284.method1913(false, (byte) -123);
        System.gc();
        class174.method1197(125, 2);
        field1865 = arg0;
        class59.field1184 = -1;
        class87.method624(true, -67);
        class174.field3178 = 0;
        class245.field4444 = 0;
        class220.field4005 = 0;
        class31.field568 = 0;
        class254.field4574 = false;
        for (int var2 = 0; var2 < class1.field21.length; var2++) {
            class1.field21[var2] = null;
        }
        class250.field4502 = 0;
        class219.field3996 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class103.field1993[var3] = null;
            class262.field4702[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class60.field1207[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class280.field4931[var5][var6][var7] = null;
                }
            }
        }
        class137.method948(25676);
        class264.field4732 = 0;
        class171.method1185(-6858);
        class99.method691(0, true);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static void method658(int arg0) {
        field1859 = null;
        field1863 = null;
        field1860 = null;
        if (arg0 != -28255) {
            field1859 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIII)V")
    public static final void method659(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 10434) {
            method661(-62, -50, -5, 84);
        }
        field1856++;
        if (arg4 < arg3) {
            class176.method1215(arg4, arg1, class252.field4543[arg0], arg3, (byte) 118);
        } else {
            class176.method1215(arg3, arg1, class252.field4543[arg0], arg4, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ltf;I)V")
    public static final void method660(class106 arg0, int arg1) {
        field1854++;
        if (arg1 != -32030) {
            field1859 = null;
        }
        byte[] var2 = new byte[24];
        if (class136.field2561 != null) {
            try {
                class136.field2561.method243(true, 0L);
                class136.field2561.method238(var2, 0);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method743(var2, 0, 24, arg1 + 1764);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)I")
    public static final int method661(int arg0, int arg1, int arg2, int arg3) {
        field1855++;
        if (class271.field4803 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        int var7 = arg3 & 0x7F;
        int var8 = arg0 & 0x7F;
        if (arg2 < 3 && (class285.field5023[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var9 = (128 - var7) * class271.field4803[var6][var4][var5] + class271.field4803[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class271.field4803[var6][var4][var5 + 1] + (class271.field4803[var6][var4 + 1][var5 + 1] * var7) >> 7;
        if (arg1 != 19452) {
            method660((class106) null, 112);
        }
        return (128 - var8) * var9 + (var8 * var10) >> 7;
    }
}
