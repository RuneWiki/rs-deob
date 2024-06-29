import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class59 {

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field818 = 0;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "J")
    public static long field821 = 0L;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Ljava/lang/String;")
    public static String field816 = "M";

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "[I")
    public static int[] field827 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "Lnh;")
    public static class305 field824;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "[I")
    public static int[] field823;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method371(boolean arg0, int arg1) {
        field825++;
        if (arg1 == 100 && class216.field3306 > 0) {
            byte[] var2 = class123.field1744[--class216.field3306];
            class123.field1744[class216.field3306] = null;
            return var2;
        } else if (!arg0) {
            return null;
        } else if (arg1 == 5000 && class58.field807 > 0) {
            byte[] var3 = class275.field4362[--class58.field807];
            class275.field4362[class58.field807] = null;
            return var3;
        } else if (arg1 == 30000 && class303.field4812 > 0) {
            byte[] var4 = class120.field1718[--class303.field4812];
            class120.field1718[class303.field4812] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILim;II)V")
    public static final void method372(int arg0, class178 arg1, int arg2, int arg3) {
        field819++;
        if (class8.field92 != null || class171.field2447 || arg1 == null || class53.method337(arg1, 0) == null) {
            return;
        }
        class8.field92 = arg1;
        class276.field4384 = class53.method337(arg1, arg3);
        class274.field4356 = 0;
        class38.field579 = arg2;
        class275.field4372 = false;
        class252.field3944 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V")
    public static final void method373(String arg0, String arg1, byte arg2, int arg3) {
        class171.field2435 = arg1;
        class308.field4948 = arg3;
        field822++;
        class10.field175 = arg0;
        if (class171.field2435.equals("") || class10.field175.equals("")) {
            class174.field2457 = 3;
        } else if (class211.field3178 == -1) {
            class44.field662 = 0;
            class84.field1180 = 1;
            class174.field2457 = -3;
            class21.field343 = 0;
            class215 var4 = new class215(128);
            if (arg2 == 22) {
                var4.method1363(10, 94);
                var4.method1398(true, (int) (Math.random() * 9.9999999E7D));
                var4.method1386(class92.method594(-15250, class171.field2435), true);
                var4.method1398(true, (int) (Math.random() * 9.9999999E7D));
                var4.method1384(class10.field175, arg2 - 595448398);
                var4.method1398(true, (int) (Math.random() * 9.9999999E7D));
                var4.method1397(class258.field4163, 123, class136.field1867);
                class231.field3614.field3280 = 0;
                class231.field3614.method1363(24, 93);
                class231.field3614.method1363(var4.field3280 + 2, -57);
                class231.field3614.method1385(551, true);
                class231.field3614.method1365(var4.field3280, 0, var4.field3287, (byte) -62);
            }
        } else {
            class114.method724(-119);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method374(int arg0, boolean arg1) {
        if (!arg1) {
            field823 = null;
        }
        field820++;
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method375(int arg0) {
        int var1 = 112 % ((36 - arg0) / 50);
        field827 = null;
        field816 = null;
        field824 = null;
        field823 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
    public static final void method376(byte arg0, int arg1) {
        class205 var2 = (class205) class278.field4412.method1453(true, (long) arg1);
        if (arg0 >= -12) {
            method376((byte) -84, -108);
        }
        field817++;
        if (var2 != null) {
            var2.method962(128);
        }
    }
}
