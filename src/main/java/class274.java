import java.awt.Frame;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class274 extends class130 {

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    private int field4703 = 0;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    private int field4710 = -1;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    private int field4707;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "[I")
    public static int[] field4708 = new int[25];

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field4709 = 0;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Lcd;")
    public static class64 field4705 = class44.method335((byte) 71, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Z")
    public static boolean field4701 = true;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "[[[Lke;")
    public static class106[][][] field4712 = new class106[4][104][104];

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "Z")
    public static boolean field4713;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lte;B)V", line = 20)
    public static final void method1899(class282 arg0, byte arg1) {
        field4700++;
        class57 var2 = null;
        try {
            class22 var3 = arg0.method1959(0, "runescape");
            while (var3.field375 == 0) {
                class267.method1871(10, 1L);
            }
            if (var3.field375 == 1) {
                var2 = (class57) var3.field377;
                class13 var4 = class17.method177((byte) 61);
                var2.method436(0, 118, var4.field281, var4.field254);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method441(107);
            }
            if (arg1 != -41) {
                field4705 = (class64) null;
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V", line = 64)
    public static void method1900(int arg0) {
        field4705 = null;
        field4708 = null;
        if (arg0 != 23) {
            method1899((class282) null, (byte) 14);
        }
        field4712 = (class106[][][]) null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Frame;ILte;)V", line = 76)
    public static final void method1901(Frame arg0, int arg1, class282 arg2) {
        field4711++;
        while (true) {
            class22 var3 = arg2.method1955(arg0, 0);
            while (var3.field375 == 0) {
                class267.method1871(10, 10L);
            }
            if (var3.field375 == 1) {
                arg0.setVisible(false);
                if (arg1 != 10) {
                    field4705 = (class64) null;
                }
                arg0.dispose();
                return;
            }
            class267.method1871(arg1, 100L);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V", line = 104)
    public final void method1902(byte arg0) {
        if (arg0 != 111) {
            method1901((Frame) null, -125, (class282) null);
        }
        field4702++;
        int var2 = class75.method600(77);
        if ((var2 & 0x1) == 0) {
            class123.method867(this.field4710);
        }
        if ((var2 & 0x2) == 0) {
            class123.method894(0);
        }
        if ((var2 & 0x4) == 0) {
            class123.method881(0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V", line = 131)
    public static final void method1903(byte arg0) {
        class101.field1830 = 0;
        field4706++;
        int var1 = (class139.field2472.field1859 >> 7) + class190.field3269;
        int var2 = (class139.field2472.field1865 >> 7) + class121.field2184;
        if (arg0 != 74) {
            return;
        }
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class101.field1830 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class101.field1830 = 1;
        }
        if (class101.field1830 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class101.field1830 = 0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V", line = 161)
    public static final void method1904(int arg0, int arg1) {
        field4714++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class223.field3806[arg0];
        int var3 = class235.field3964[arg0];
        long var4 = class64.field1237[arg0];
        int var6 = (int) class64.field1237[arg0];
        int var7 = class289.field4934[arg0];
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        if (var7 == 10) {
            class247.field4297++;
            boolean var8 = class85.method650(0, 2, 0, -12920, var2, var3, 0, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 0);
            if (!var8) {
                class85.method650(0, 2, 0, -12920, var2, var3, 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
            }
            class277.field4778 = class268.field4609;
            class237.field3995 = 2;
            class238.field4051 = 0;
            class237.field4004 = class238.field4061;
            class17.field353.method1214(arg1 + 31688, 79);
            class17.field353.method145(108, var6);
            class17.field353.method126(class190.field3269 + var2, true);
            class17.field353.method145(81, class121.field2184 + var3);
        }
        if (var7 == 39) {
            class92.field1657++;
            class17.field353.method1214(arg1 ^ 0x7C02, 101);
            class17.field353.method145(119, var2);
            class17.field353.method126(var6, true);
            class17.field353.method162((byte) 58, var3);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, arg1 ^ 0x7C40);
            class72.field1387 = var2;
        }
        if (var7 == 44) {
            class232 var10 = class2.field12[var6];
            if (var10 != null) {
                class85.method650(0, 2, 0, -12920, var10.field1876[0], var10.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class277.field4778 = class268.field4609;
                class237.field3995 = 2;
                class237.field4004 = class238.field4061;
                class276.field4735++;
                class238.field4051 = 0;
                class17.field353.method1214(-98, 177);
                class17.field353.method126(var6, true);
            }
        }
        if (var7 == 28) {
            class41 var11 = class284.field4888[var6];
            if (var11 != null) {
                class85.method650(0, 2, 0, -12920, var11.field1876[0], var11.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class237.field4004 = class238.field4061;
                class277.field4778 = class268.field4609;
                class30.field507++;
                class238.field4051 = 0;
                class237.field3995 = 2;
                class17.field353.method1214(-40, 84);
                class17.field353.method145(126, var6);
            }
        }
        if (var7 == 19) {
            boolean var12 = class85.method650(0, 2, 0, arg1 + 18866, var2, var3, 0, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 0);
            class278.field4792++;
            if (!var12) {
                class85.method650(0, 2, 0, arg1 ^ 0x4E5E, var2, var3, 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
            }
            class237.field4004 = class238.field4061;
            class237.field3995 = 2;
            class238.field4051 = 0;
            class277.field4778 = class268.field4609;
            class17.field353.method1214(-35, 254);
            class17.field353.method126(var3 + class121.field2184, true);
            class17.field353.method160((byte) -96, class190.field3269 + var2);
            class17.field353.method160((byte) -67, var6);
        }
        if (var7 == 32) {
            class17.field353.method1214(-127, 255);
            class17.field353.method128((byte) 121, var3);
            class17.field353.method149(var2, true);
            class106.field1948++;
            class17.field353.method126(var6, true);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, arg1 + 31660);
            class72.field1387 = var2;
        }
        if (var7 == 48) {
            class232 var14 = class2.field12[var6];
            if (var14 != null) {
                class85.method650(0, 2, 0, -12920, var14.field1876[0], var14.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class277.field4778 = class268.field4609;
                class237.field4004 = class238.field4061;
                class237.field3995 = 2;
                class238.field4051 = 0;
                class264.field4529++;
                class17.field353.method1214(-106, 207);
                class17.field353.method149(class223.field3809, true);
                class17.field353.method126(var6, true);
                class17.field353.method128((byte) 125, class185.field3168);
            }
        }
        if (var7 == 24) {
            boolean var15 = class85.method650(0, 2, 0, -12920, var2, var3, 0, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 0);
            class89.field1609++;
            if (!var15) {
                class85.method650(0, 2, 0, -12920, var2, var3, 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
            }
            class238.field4051 = 0;
            class237.field4004 = class238.field4061;
            class237.field3995 = 2;
            class277.field4778 = class268.field4609;
            class17.field353.method1214(-5, 39);
            class17.field353.method126(var6, true);
            class17.field353.method126(class190.field3269 + var2, true);
            class17.field353.method160((byte) -54, var3 + class121.field2184);
        }
        if (var7 == 18) {
            class41 var17 = class284.field4888[var6];
            if (var17 != null) {
                class28.field450++;
                class85.method650(0, 2, 0, -12920, var17.field1876[0], var17.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class238.field4051 = 0;
                class277.field4778 = class268.field4609;
                class237.field3995 = 2;
                class237.field4004 = class238.field4061;
                class17.field353.method1214(arg1 + 31764, 199);
                class17.field353.method149(var6, true);
            }
        }
        if (var7 == 45) {
            class315.field5336++;
            boolean var18 = class85.method650(0, 2, 0, -12920, var2, var3, 0, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 0);
            if (!var18) {
                class85.method650(0, 2, 0, arg1 + 18866, var2, var3, 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
            }
            class238.field4051 = 0;
            class237.field4004 = class238.field4061;
            class277.field4778 = class268.field4609;
            class237.field3995 = 2;
            class17.field353.method1214(-11, 40);
            class17.field353.method149(class190.field3269 + var2, true);
            class17.field353.method149(var6, true);
            class17.field353.method145(arg1 ^ 0xFFFF83B8, class121.field2184 + var3);
        }
        if (var7 == 20) {
            boolean var20 = true;
            class60 var21 = class125.method907(var3, arg1 + 31703);
            if (var21.field1013 > 0) {
                var20 = class26.method236((byte) 45, var21);
            }
            if (var20) {
                class287.field4912++;
                class17.field353.method1214(arg1 + 31775, 94);
                class17.field353.method128((byte) -71, var3);
            }
        }
        if (var7 == 43) {
            class263.field4512++;
            boolean var22 = class85.method650(0, 2, 0, arg1 + 18866, var2, var3, 0, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 0);
            if (!var22) {
                class85.method650(0, 2, 0, -12920, var2, var3, 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
            }
            class238.field4051 = 0;
            class237.field3995 = 2;
            class237.field4004 = class238.field4061;
            class277.field4778 = class268.field4609;
            class17.field353.method1214(-121, 180);
            class17.field353.method160((byte) -58, var3 + class121.field2184);
            class17.field353.method126(class223.field3809, true);
            class17.field353.method149(var6, true);
            class17.field353.method145(112, class190.field3269 + var2);
            class17.field353.method162((byte) 58, class185.field3168);
        }
        if (var7 == 9) {
            class41 var24 = class284.field4888[var6];
            if (var24 != null) {
                class125.field2261++;
                class85.method650(0, 2, 0, -12920, var24.field1876[0], var24.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class237.field4004 = class238.field4061;
                class237.field3995 = 2;
                class238.field4051 = 0;
                class277.field4778 = class268.field4609;
                class17.field353.method1214(-103, 109);
                class17.field353.method126(var6, true);
            }
        }
        if (var7 == 51) {
            class232 var25 = class2.field12[var6];
            if (var25 != null) {
                class85.method650(0, 2, 0, -12920, var25.field1876[0], var25.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class277.field4778 = class268.field4609;
                class249.field4326++;
                class238.field4051 = 0;
                class237.field4004 = class238.field4061;
                class237.field3995 = 2;
                class17.field353.method1214(-114, 142);
                class17.field353.method149(var6, true);
            }
        }
        if (var7 == 25) {
            class198.field3381++;
            boolean var26 = class85.method650(0, 2, 0, -12920, var2, var3, 0, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 0);
            if (!var26) {
                class85.method650(0, 2, 0, -12920, var2, var3, 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
            }
            class238.field4051 = 0;
            class277.field4778 = class268.field4609;
            class237.field3995 = 2;
            class237.field4004 = class238.field4061;
            class17.field353.method1214(-107, 80);
            class17.field353.method149(class190.field3269 + var2, true);
            class17.field353.method149(class121.field2184 + var3, true);
            class17.field353.method149(var6, true);
        }
        if (var7 == 40) {
            class137.method980(arg1 ^ 0xFFFFE1CD);
            class60 var49 = class125.method907(var3, -106);
            class162.field2853 = var6;
            class77.field1453 = 1;
            class107.field1976 = var2;
            class108.field2001 = var3;
            class190.method1342(var49, 0);
            class32.field534 = class104.method768(new class64[] { class190.field3261, class132.method949(var6, false).field1669, class172.field2966 }, false);
            if (class32.field534 == null) {
                class32.field534 = class104.field1927;
            }
            return;
        }
        if (var7 == 6) {
            class228.field3872++;
            class17.field353.method1214(arg1 + 31778, 153);
            class17.field353.method126(var2, true);
            class17.field353.method149(var6, true);
            class17.field353.method109(var3, arg1 + 612024978);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -117);
            class72.field1387 = var2;
        }
        if (var7 == 15) {
            class120.field2171++;
            class17.field353.method1214(-89, 188);
            class17.field353.method162((byte) 58, var3);
            class17.field353.method145(arg1 + 31880, var6);
            class17.field353.method149(var2, true);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -103);
            class72.field1387 = var2;
        }
        if (var7 == 21) {
            class17.field353.method1214(arg1 ^ 0x7C7C, 62);
            class78.field1462++;
            class17.field353.method145(88, var2);
            class17.field353.method126(var6, true);
            class17.field353.method109(var3, 611993192);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -123);
            class72.field1387 = var2;
        }
        if (var7 == 34 && class265.method1858(var3, var2, 126, var4)) {
            class17.field353.method1214(arg1 + 31757, 121);
            class17.field353.method149(class121.field2184 + var3, true);
            class14.field312++;
            class17.field353.method109(class185.field3168, arg1 + 612024978);
            class17.field353.method160((byte) -47, class190.field3269 + var2);
            class17.field353.method145(109, Integer.MAX_VALUE & (int) (var4 >>> 32));
            class17.field353.method126(class223.field3809, true);
        }
        if (var7 == 1001) {
            class238.field4051 = 0;
            class237.field3995 = 2;
            class277.field4778 = class268.field4609;
            class55.field928++;
            class237.field4004 = class238.field4061;
            class17.field353.method1214(-45, 183);
            class17.field353.method160((byte) -88, var6);
        }
        if (var7 == 14) {
            class232 var28 = class2.field12[var6];
            if (var28 != null) {
                class173.field2980++;
                class85.method650(0, 2, 0, -12920, var28.field1876[0], var28.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class277.field4778 = class268.field4609;
                class237.field4004 = class238.field4061;
                class238.field4051 = 0;
                class237.field3995 = 2;
                class17.field353.method1214(-99, 230);
                class17.field353.method149(var6, true);
            }
        }
        if (var7 == 11) {
            class41 var29 = class284.field4888[var6];
            if (var29 != null) {
                class85.method650(0, 2, 0, -12920, var29.field1876[0], var29.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class277.field4778 = class268.field4609;
                class237.field4004 = class238.field4061;
                class128.field2281++;
                class238.field4051 = 0;
                class237.field3995 = 2;
                class17.field353.method1214(-86, 56);
                class17.field353.method145(arg1 + 31905, var6);
            }
        }
        if (var7 == 4) {
            class238.field4060++;
            class17.field353.method1214(-46, 169);
            class17.field353.method122((byte) 113, var3);
            class17.field353.method145(92, class107.field1976);
            class17.field353.method145(101, var2);
            class17.field353.method126(var6, true);
            class17.field353.method109(class108.field2001, arg1 ^ 0xDB85C5BE);
            class17.field353.method160((byte) -49, class162.field2853);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -122);
            class72.field1387 = var2;
        }
        if (var7 == 13) {
            class41 var30 = class284.field4888[var6];
            if (var30 != null) {
                class112.field2078++;
                class85.method650(0, 2, 0, arg1 ^ 0x4E5E, var30.field1876[0], var30.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class238.field4051 = 0;
                class237.field4004 = class238.field4061;
                class237.field3995 = 2;
                class277.field4778 = class268.field4609;
                class17.field353.method1214(-85, 32);
                class17.field353.method145(96, var6);
            }
        }
        if (var7 == 1007) {
            class265.method1858(var3, var2, arg1 ^ 0xFFFF83A9, var4);
            class17.field353.method1214(-65, 59);
            class17.field353.method149(class121.field2184 + var3, true);
            class17.field353.method126(var2 + class190.field3269, true);
            class32.field535++;
            class17.field353.method126((int) (var4 >>> 32) & Integer.MAX_VALUE, true);
        }
        if (var7 == 41) {
            class232 var31 = class2.field12[var6];
            if (var31 != null) {
                class96.field1760++;
                class85.method650(0, 2, 0, -12920, var31.field1876[0], var31.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class238.field4051 = 0;
                class277.field4778 = class268.field4609;
                class237.field4004 = class238.field4061;
                class237.field3995 = 2;
                class17.field353.method1214(-64, 228);
                class17.field353.method160((byte) -99, var6);
            }
        }
        if (var7 == 57 || var7 == 1002) {
            class85.method656(var3, var2, -120, var6, class69.field1334[arg0]);
        }
        if (var7 == 16) {
            class232 var32 = class2.field12[var6];
            if (var32 != null) {
                class85.method650(0, 2, 0, -12920, var32.field1876[0], var32.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class237.field3995 = 2;
                class238.field4051 = 0;
                class237.field4004 = class238.field4061;
                class277.field4778 = class268.field4609;
                class17.field353.method1214(-104, 201);
                class17.field353.method145(arg1 ^ 0xFFFF83AF, class162.field2853);
                class17.field353.method145(arg1 + 31872, var6);
                class277.field4767++;
                class17.field353.method162((byte) 58, class108.field2001);
                class17.field353.method145(arg1 ^ 0xFFFF839A, class107.field1976);
            }
        }
        if (var7 == 31) {
            class41 var33 = class284.field4888[var6];
            if (var33 != null) {
                class85.method650(0, 2, 0, -12920, var33.field1876[0], var33.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class238.field4051 = 0;
                class237.field3995 = 2;
                class277.field4778 = class268.field4609;
                class298.field5140++;
                class237.field4004 = class238.field4061;
                class17.field353.method1214(-124, 248);
                class17.field353.method149(var6, true);
            }
        }
        if (var7 == 1005) {
            class277.field4778 = class268.field4609;
            class237.field3995 = 2;
            class238.field4051 = 0;
            class237.field4004 = class238.field4061;
            class232 var34 = class2.field12[var6];
            if (var34 != null) {
                class6 var35 = var34.field3911;
                if (var35.field144 != null) {
                    var35 = var35.method66(0);
                }
                if (var35 != null) {
                    class17.field353.method1214(-27, 24);
                    class141.field2492++;
                    class17.field353.method145(92, var35.field129);
                }
            }
        }
        if (var7 == 33) {
            class70.method573(15);
        }
        if (var7 == 7) {
            class41 var36 = class284.field4888[var6];
            if (var36 != null) {
                class85.method650(0, 2, 0, -12920, var36.field1876[0], var36.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class82.field1511++;
                class277.field4778 = class268.field4609;
                class237.field3995 = 2;
                class237.field4004 = class238.field4061;
                class238.field4051 = 0;
                class17.field353.method1214(-69, 83);
                class17.field353.method149(var6, true);
            }
        }
        if (var7 == 47) {
            class265.method1858(var3, var2, 127, var4);
            class17.field353.method1214(arg1 + 31758, 35);
            class283.field4872++;
            class17.field353.method145(76, class190.field3269 + var2);
            class17.field353.method160((byte) -84, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class17.field353.method145(90, class121.field2184 + var3);
        }
        if (var7 == 50) {
            class17.field353.method1214(-11, 63);
            class44.field723++;
            class17.field353.method145(98, var2);
            class17.field353.method145(106, var6);
            class17.field353.method109(var3, arg1 + 612024978);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -119);
            class72.field1387 = var2;
        }
        if (var7 == 2) {
            class60 var48 = class25.method229(var2, (byte) 124, var3);
            if (var48 != null) {
                class137.method980(25115);
                class273.method1895(var2, class69.method562(client.method1762(var48), (byte) 109), var3, -185714772);
                class77.field1453 = 0;
                class43.field708 = class92.method705(0, var48);
                if (class43.field708 == null) {
                    class43.field708 = class181.field3119;
                }
                if (var48.field1017) {
                    class103.field1891 = class104.method768(new class64[] { var48.field1142, class172.field2966 }, false);
                } else {
                    class103.field1891 = class104.method768(new class64[] { class117.field2142, var48.field1086, class172.field2966 }, false);
                }
            }
            return;
        }
        if (var7 == 42) {
            class35.field566++;
            class265.method1858(var3, var2, arg1 ^ 0xFFFF83A9, var4);
            class17.field353.method1214(-40, 68);
            class17.field353.method145(110, class190.field3269 + var2);
            class17.field353.method126((int) (var4 >>> 32) & Integer.MAX_VALUE, true);
            class17.field353.method149(class121.field2184 + var3, true);
        }
        if (var7 == 12 && class265.method1858(var3, var2, arg1 ^ 0xFFFF83AB, var4)) {
            class125.field2251++;
            class17.field353.method1214(-69, 119);
            class17.field353.method160((byte) -71, class190.field3269 + var2);
            class17.field353.method149(var3 + class121.field2184, true);
            class17.field353.method122((byte) 74, class108.field2001);
            class17.field353.method160((byte) -113, class107.field1976);
            class17.field353.method149((int) (var4 >>> 32) & Integer.MAX_VALUE, true);
            class17.field353.method145(arg1 + 31908, class162.field2853);
        }
        if (var7 == 8) {
            class183.field3135++;
            class17.field353.method1214(arg1 + 31677, 139);
            class17.field353.method149(class223.field3809, true);
            class17.field353.method149(var2, true);
            class17.field353.method162((byte) 58, var3);
            class17.field353.method122((byte) 101, class185.field3168);
        }
        if (var7 == 37) {
            class41 var37 = class284.field4888[var6];
            if (var37 != null) {
                class132.field2351++;
                class85.method650(0, 2, 0, -12920, var37.field1876[0], var37.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class238.field4051 = 0;
                class277.field4778 = class268.field4609;
                class237.field3995 = 2;
                class237.field4004 = class238.field4061;
                class17.field353.method1214(arg1 ^ 0x7C3C, 78);
                class17.field353.method149(class107.field1976, true);
                class17.field353.method122((byte) 115, class108.field2001);
                class17.field353.method126(var6, true);
                class17.field353.method160((byte) -50, class162.field2853);
            }
        }
        if (var7 == 49) {
            class265.method1858(var3, var2, 125, var4);
            class17.field353.method1214(-51, 75);
            class247.field4302++;
            class17.field353.method145(115, class121.field2184 + var3);
            class17.field353.method126(class190.field3269 + var2, true);
            class17.field353.method160((byte) -77, (int) (var4 >>> 32) & Integer.MAX_VALUE);
        }
        if (var7 == 46) {
            class17.field353.method1214(-66, 165);
            class13.field245++;
            class17.field353.method160((byte) -104, var2);
            class17.field353.method122((byte) 96, var3);
            class17.field353.method126(var6, true);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -115);
            class72.field1387 = var2;
        }
        if (var7 == 36) {
            class41 var38 = class284.field4888[var6];
            if (var38 != null) {
                class142.field2501++;
                class85.method650(0, 2, 0, arg1 + 18866, var38.field1876[0], var38.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class277.field4778 = class268.field4609;
                class237.field4004 = class238.field4061;
                class238.field4051 = 0;
                class237.field3995 = 2;
                class17.field353.method1214(-117, 205);
                class17.field353.method162((byte) 58, class185.field3168);
                class17.field353.method149(var6, true);
                class17.field353.method160((byte) -91, class223.field3809);
            }
        }
        if (arg1 != -31786) {
            method1901((Frame) null, 35, (class282) null);
        }
        if (var7 == 17) {
            class248.field4316++;
            class17.field353.method1214(-58, 244);
            class17.field353.method149(var2, true);
            class17.field353.method126(var6, true);
            class17.field353.method122((byte) 88, var3);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -101);
            class72.field1387 = var2;
        }
        if (var7 == 22) {
            class17.field353.method1214(-80, 197);
            class17.field353.method149(var6, true);
            class17.field353.method145(arg1 ^ 0xFFFF83A5, class223.field3809);
            class17.field353.method126(var2, true);
            class304.field5193++;
            class17.field353.method162((byte) 58, var3);
            class17.field353.method122((byte) 103, class185.field3168);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -80);
            class72.field1387 = var2;
        }
        if (var7 == 26) {
            class232 var39 = class2.field12[var6];
            if (var39 != null) {
                class114.field2100++;
                class85.method650(0, 2, 0, -12920, var39.field1876[0], var39.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class277.field4778 = class268.field4609;
                class238.field4051 = 0;
                class237.field4004 = class238.field4061;
                class237.field3995 = 2;
                class17.field353.method1214(arg1 + 31685, 234);
                class17.field353.method145(104, var6);
            }
        }
        if (var7 == 1) {
            class17.field353.method1214(-34, 242);
            class268.field4608++;
            class17.field353.method128((byte) -117, var3);
            class17.field353.method145(93, var6);
            class17.field353.method160((byte) -108, var2);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -124);
            class72.field1387 = var2;
        }
        if (var7 == 35) {
            class19.field361++;
            class265.method1858(var3, var2, arg1 ^ 0xFFFF83A8, var4);
            class17.field353.method1214(-78, 10);
            class17.field353.method160((byte) -65, class190.field3269 + var2);
            class17.field353.method145(117, class121.field2184 + var3);
            class17.field353.method149(Integer.MAX_VALUE & (int) (var4 >>> 32), true);
        }
        if (var7 == 30) {
            class17.field353.method1214(-114, 27);
            class218.field3693++;
            class17.field353.method128((byte) 116, var3);
            class17.field353.method126(var2, true);
            class17.field353.method160((byte) -96, var6);
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -88);
            class72.field1387 = var2;
        }
        if (var7 == 29 && class106.field1952 == null) {
            class200.method1403(true, var3, var2);
            class106.field1952 = class25.method229(var2, (byte) 124, var3);
            class190.method1342(class106.field1952, 0);
        }
        if (var7 == 23) {
            class41 var40 = class284.field4888[var6];
            if (var40 != null) {
                class307.field5250++;
                class85.method650(0, 2, 0, -12920, var40.field1876[0], var40.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                class237.field4004 = class238.field4061;
                class238.field4051 = 0;
                class237.field3995 = 2;
                class277.field4778 = class268.field4609;
                class17.field353.method1214(-55, 133);
                class17.field353.method126(var6, true);
            }
        }
        if (var7 == 38) {
            class195.field3316++;
            boolean var41 = class85.method650(0, 2, 0, arg1 + 18866, var2, var3, 0, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 0);
            if (!var41) {
                class85.method650(0, 2, 0, -12920, var2, var3, 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
            }
            class237.field4004 = class238.field4061;
            class237.field3995 = 2;
            class277.field4778 = class268.field4609;
            class238.field4051 = 0;
            class17.field353.method1214(-88, 106);
            class17.field353.method160((byte) -82, class190.field3269 + var2);
            class17.field353.method109(class108.field2001, 611993192);
            class17.field353.method160((byte) -98, var6);
            class17.field353.method145(100, class107.field1976);
            class17.field353.method160((byte) -87, class121.field2184 + var3);
            class17.field353.method149(class162.field2853, true);
        }
        if (var7 == 5) {
            class287.field4912++;
            class17.field353.method1214(-123, 94);
            class17.field353.method128((byte) 109, var3);
            class60 var43 = class125.method907(var3, -101);
            if (var43.field1185 != null && var43.field1185[0][0] == 5) {
                int var44 = var43.field1185[0][1];
                if (class289.field4941[var44] != var43.field1069[0]) {
                    class289.field4941[var44] = var43.field1069[0];
                    class65.method546(var44, -10);
                }
            }
        }
        if (var7 == 3) {
            class185.method1314(class20.field364, var2, var3);
        }
        if (var7 == 59) {
            class15.field320 = true;
            class185.method1314(class20.field364, var2, var3);
        }
        if (var7 == 58) {
            class17.field353.method1214(-22, 94);
            class17.field353.method128((byte) -38, var3);
            class287.field4912++;
            class60 var45 = class125.method907(var3, -70);
            if (var45.field1185 != null && var45.field1185[0][0] == 5) {
                int var46 = var45.field1185[0][1];
                class289.field4941[var46] = 1 - class289.field4941[var46];
                class65.method546(var46, -10);
            }
        }
        if (var7 == 1004) {
            class237.field4004 = class238.field4061;
            class238.field4051 = 0;
            class237.field3995 = 2;
            class277.field4778 = class268.field4609;
            class17.field353.method1214(-35, 7);
            class11.field220++;
            class17.field353.method126(var6, true);
        }
        if (var7 == 1003) {
            class60 var47 = class125.method907(var3, -91);
            if (var47 == null || var47.field1110[var2] < 100000) {
                class11.field220++;
                class17.field353.method1214(-70, 7);
                class17.field353.method126(var6, true);
            } else {
                class233.method1670(class104.method768(new class64[] { class310.method2149(var47.field1110[var2], (byte) -8), class135.field2394, class132.method949(var6, false).field1669 }, false), class188.field3240, 0, (byte) -115);
            }
            class307.field5244 = 0;
            class8.field180 = class125.method907(var3, -94);
            class72.field1387 = var2;
        }
        if (class77.field1453 != 0) {
            class77.field1453 = 0;
            class190.method1342(class125.method907(class108.field2001, -113), 0);
        }
        if (class42.field690) {
            class137.method980(25115);
        }
        if (class8.field180 != null && class307.field5244 == 0) {
            class190.method1342(class8.field180, arg1 + 31786);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I)V", line = 1184)
    public class274(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class123.field2212;
        var3.glGenTextures(1, var2, 0);
        this.field4710 = var2[0];
        this.field4707 = class285.field4893;
        class123.method867(this.field4710);
        int var4 = class50.field829[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class285.field4891 += var6.limit() - this.field4703;
        this.field4703 = var6.limit();
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 1157)
    protected final void finalize() throws Throwable {
        if (this.field4710 != -1) {
            class285.method1979(this.field4710, this.field4703, this.field4707);
            this.field4703 = 0;
            this.field4710 = -1;
        }
        field4704++;
        super.finalize();
    }
}
