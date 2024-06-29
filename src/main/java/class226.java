import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class226 {

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "[S")
    public short[] field3929;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "[I")
    public int[] field3940;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[S")
    public short[] field3931;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "[Lmh;")
    public class62[] field3934;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "[B")
    public byte[] field3935;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Z")
    public static volatile boolean field3930 = true;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lmh;")
    public static class62 field3928 = class201.method1405(true, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3933 = new CRC32();

    @OriginalMember(owner = "client!li", name = "n", descriptor = "[Ljj;")
    public static class27[] field3939 = new class27[500];

    @OriginalMember(owner = "client!li", name = "m", descriptor = "Lmh;")
    public static class62 field3938 = class201.method1405(true, "<)4col>");

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "[[[B")
    public static byte[][][] field3941;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z", line = 13)
    public static final boolean method1597(int arg0) {
        field3943++;
        try {
            if (class60.field876 == 2) {
                if (class306.field5263 == null) {
                    class306.field5263 = class217.method1543(class289.field4925, class237.field4064, class15.field122);
                    if (class306.field5263 == null) {
                        return false;
                    }
                }
                if (class159.field2564 == null) {
                    class159.field2564 = new class75(class270.field4576, class300.field5155);
                }
                if (class78.field1307.method544(class159.field2564, 0, 22050, class306.field5263, class146.field2318)) {
                    class78.field1307.method558((byte) -114);
                    class78.field1307.method562(class246.field4180, arg0 - 2123);
                    class78.field1307.method534(class24.field273, arg0 ^ 0x49EE, class306.field5263);
                    class306.field5263 = null;
                    class289.field4925 = null;
                    class159.field2564 = null;
                    class60.field876 = 0;
                    return true;
                }
            }
            if (arg0 != 1976) {
                field3939 = (class27[]) null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class78.field1307.method542(arg0 ^ 0xFFFFE34E);
            class289.field4925 = null;
            class60.field876 = 0;
            class306.field5263 = null;
            class159.field2564 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)I", line = 64)
    public final int method1598(int arg0, byte arg1) {
        field3926++;
        if (arg1 != -86) {
            field3939 = (class27[]) null;
        }
        return this.field3935[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lmh;Z)V", line = 78)
    public static final void method1599(class62 arg0, boolean arg1) {
        field3937++;
        if (class293.field4985 >= 2) {
            if (arg0.method436(class5.field59, 32)) {
                class21.method97((byte) 84);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class116.method901(0, (class62) null, class254.method1772(new class62[] { class265.field4471, class42.method284(var4, -128), class42.field642 }, 0), (byte) 86);
            }
            if (arg0.method436(class69.field1062, 32)) {
                System.out.println("oncard_geometry:" + class79.field1323);
                System.out.println("oncard_2d:" + class79.field1321);
                System.out.println("oncard_texture:" + class79.field1326);
            }
            if (arg0.method436(class291.field4941, 32)) {
                class194.method1359(127);
            }
            if (arg0.method436(class50.field722, 32)) {
                class276.method1889(-128, 25);
            }
            if (arg0.method436(class152.field2406, 32)) {
                class214.field3639 = true;
            }
            if (arg0.method436(class286.field4898, 32)) {
                class214.field3639 = false;
            }
            if (arg0.method436(class161.field2610, 32)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class250.field4244[var5].field3756[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method414((byte) -39, class204.field3439) && class101.field1669 != 0) {
                class118.method921(!arg1, arg0.method407(6, 15552).method431(64));
            }
            if (arg0.method436(class183.field2925, 32) && class101.field1669 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method414((byte) -39, class215.field3651)) {
                class32.field444 = arg0.method407(12, 15552).method440((byte) 79).method431(64);
                class116.method901(0, (class62) null, class254.method1772(new class62[] { class222.field3880, class42.method284(class32.field444, -123) }, 0), (byte) 82);
            }
            if (arg0.method436(class152.field2405, 32)) {
                class263.field4433 = true;
            }
            if (arg0.method446((byte) 111, class241.field4119)) {
                if (class212.field3569 == null) {
                    class267.method1836((byte) -17, 1024, 768);
                } else {
                    class57.method376(-28268);
                }
            }
        }
        class298.field5085++;
        class170.field2772.method1693(67, false);
        class170.field2772.method717(1, arg0.method439(-12) - 1);
        class170.field2772.method710(arg0.method407(2, 15552), arg1);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 200)
    public static void method1600(int arg0) {
        if (arg0 != -28993) {
            return;
        }
        field3939 = null;
        field3928 = null;
        field3938 = null;
        field3941 = (byte[][][]) null;
        field3933 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lb;", line = 224)
    public static final class275 method1601(int arg0, int arg1) {
        field3932++;
        class275 var2 = (class275) class249.field4226.method1396(arg0 - 768, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class163.field2638.method157(class112.method879(arg0 - 20842, arg1), class75.method571(256, arg1), (byte) 19);
        class275 var4 = new class275();
        var4.field4681 = arg1;
        if (var3 != null) {
            var4.method1888(new class92(var3), -1);
        }
        var4.method1883(-88);
        class249.field4226.method1397((long) arg1, var4, true);
        return arg0 == 768 ? var4 : (class275) null;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)Z", line = 256)
    public final boolean method1602(int arg0, int arg1) {
        field3927++;
        if (arg1 != -5) {
            method1599((class62) null, false);
        }
        return (this.field3935[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Lfd;", line = 293)
    public static final class61 method1603(int arg0) {
        class61 var1 = new class61(class41.field626, class189.field3005, class183.field2931[arg0], class113.field1878[0], class15.field132[0], class184.field2940[0], class42.field645[0], class235.field4048);
        class135.method1020(-92);
        field3936++;
        return var1;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V", line = 308)
    public class226(int arg0) {
        this.field3942 = arg0;
        this.field3929 = new short[this.field3942];
        this.field3940 = new int[this.field3942];
        this.field3931 = new short[this.field3942];
        this.field3934 = new class62[this.field3942];
        this.field3935 = new byte[this.field3942];
    }
}
