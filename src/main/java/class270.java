import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class270 extends class82 {

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public int field4065 = 0;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "[I")
    public int[] field4076 = new int[5];

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "[Lud;")
    public class2[] field4069 = new class2[5];

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public int field4066;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public int field4077;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public int field4078;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field4058 = 0;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public int field4067;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public int field4070;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public int field4071;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public int field4079;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public int field4080;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lc;")
    public class108 field4063;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "Ldd;")
    public class135 field4081;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "Lmb;")
    public class162 field4084;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Lk;")
    public class183 field4073;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Lia;")
    public class231 field4068;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "Lsc;")
    public class256 field4085;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Lnd;")
    public class270 field4072;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Z")
    public boolean field4064;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "Z")
    public boolean field4074;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Z")
    public boolean field4075;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V")
    public static final void method1801(boolean arg0, int arg1) {
        class39.method231(false);
        field4060++;
        if (class184.field2794 != 30 && class184.field2794 != 25) {
            return;
        }
        class26.field317++;
        if (class26.field317 < 50 && !arg0) {
            return;
        }
        class26.field317 = 0;
        if (arg1 >= -55) {
            field4061 = 11;
        }
        if (!class254.field3859 && class44.field706 != null) {
            class247.field3691++;
            class196.field2979.method1106(219, false);
            try {
                class44.field706.method951(class196.field2979.field3748, 56, 0, class196.field2979.field3723);
                class196.field2979.field3748 = 0;
            } catch (IOException var2) {
                class254.field3859 = true;
            }
        }
        class39.method231(false);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Loh;")
    public static final class281 method1802(int arg0, byte arg1) {
        field4057++;
        class281 var2 = (class281) class81.field1297.method1777((long) arg0, (byte) 112);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -88) {
            byte[] var3 = class262.field3968.method1973(1, 1, arg0);
            class281 var4 = new class281();
            if (var3 != null) {
                var4.method1856(arg0, new class248(var3), 5953);
            }
            class81.field1297.method1784((long) arg0, var4, 0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILfg;)V")
    public static final void method1803(int arg0, class12 arg1) {
        class222 var2 = null;
        field4083++;
        class7.field107 = 3;
        class197.method1234(true, 8398);
        class284.field4248 = 255;
        class154.field2318 = 0;
        class189.field2896 = true;
        class32.field464 = true;
        class256.field3905 = 0;
        class100.field1574 = 127;
        class89.field1405 = 0;
        class166.field2550 = 2;
        class274.field4119 = 0;
        class213.field3188 = true;
        class297.field4692 = true;
        class196.field2988 = 127;
        class102.field1602 = true;
        class84.field1338 = true;
        class107.field1657 = true;
        class256.field3906 = true;
        class63.field996 = true;
        class145.field2115 = true;
        if (arg0 >= -9) {
            return;
        }
        class140.field2047 = true;
        if (class54.field880 < 96) {
            class245.method1541(0);
        } else {
            class245.method1541(2);
        }
        class215.field3248 = false;
        class127.field1911 = 0;
        class142.field2088 = false;
        class4.field81 = true;
        class145.field2125 = 0;
        class132.field1937 = 0;
        class195.field2970 = false;
        try {
            class78 var3 = arg1.method59((byte) -84, "runescape");
            while (var3.field1249 == 0) {
                class250.method1643(1, 1L);
            }
            if (var3.field1249 == 1) {
                var2 = (class222) var3.field1250;
                byte[] var4 = new byte[(int) var2.method1421((byte) -106)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1423(var5, var4.length - var5, var4, (byte) -94);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class235.method1491(new class248(var4), 2);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1422(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
    public static final void method1804(int arg0, int arg1) {
        int var2 = 0 / ((61 - arg1) / 40);
        field4059++;
        class187 var3 = class120.method762((byte) -94, 1, arg0);
        var3.method1162(1);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
    public class270(int arg0, int arg1, int arg2) {
        this.field4066 = arg1;
        this.field4082 = this.field4077 = arg0;
        this.field4078 = arg2;
    }
}
