import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class11 {

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "[B")
    public byte[] field111;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "[S")
    public short[] field109;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field119;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "[I")
    public int[] field123;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "[S")
    public short[] field125;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field113 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Z")
    public static boolean field116 = false;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Ljava/lang/String;")
    public static String field126 = "Loaded textures";

    @OriginalMember(owner = "client!em", name = "s", descriptor = "Z")
    public static boolean field127 = true;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V", line = 6)
    public static final void method82(int arg0, int arg1) {
        class147 var2 = class92.method731(-29125, arg1, 6);
        field118++;
        if (arg0 != 63) {
            field127 = true;
        }
        var2.method1099(-109);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(II)Z", line = 22)
    public final boolean method83(int arg0, int arg1) {
        if (arg1 >= -54) {
            return true;
        } else {
            field114++;
            return (this.field111[arg0] & 0x10) == 0;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 33)
    public static final Object method84(boolean arg0, int arg1, byte[] arg2) {
        field128++;
        int var3 = -80 % ((arg1 + 37) / 36);
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class62.field939) {
            try {
                class207 var4 = (class207) Class.forName("ff").getDeclaredConstructor().newInstance();
                var4.method474(arg2, (byte) 7);
                return var4;
            } catch (Throwable var6) {
                class62.field939 = true;
            }
        }
        return arg0 ? class312.method2153((byte) -54, arg2) : arg2;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)[Lsd;", line = 73)
    public static final class27[] method85(int arg0) {
        field117++;
        class27[] var1 = new class27[class173.field2566];
        if (arg0 != 6) {
            field120 = 120;
        }
        for (int var2 = 0; var2 < class173.field2566; var2++) {
            int var3 = class323.field5027[var2] * class111.field1756[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class274.field4162[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class57.field843[class142.method1078(255, var5[var6])];
            }
            if (class36.field534) {
                var1[var2] = new class221(class150.field2273, class98.field1453, class271.field4096[var2], class101.field1541[var2], class111.field1756[var2], class323.field5027[var2], var4);
            } else {
                var1[var2] = new class134(class150.field2273, class98.field1453, class271.field4096[var2], class101.field1541[var2], class111.field1756[var2], class323.field5027[var2], var4);
            }
        }
        class265.method1835(10);
        return var1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)Z", line = 113)
    public final boolean method86(byte arg0, int arg1) {
        field122++;
        if (arg0 <= 124) {
            return true;
        } else {
            return (this.field111[arg1] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)I", line = 125)
    public final int method87(int arg0, boolean arg1) {
        field115++;
        if (arg1) {
            method82(-108, -43);
        }
        return this.field111[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIII)V", line = 139)
    public static final void method88(int arg0, int arg1, int arg2, int arg3) {
        field110++;
        String var4 = "::tele " + arg2 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        if (arg1 != 24179) {
            method85(29);
        }
        class55.method488(var4, 32217);
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(II)Z", line = 153)
    public final boolean method89(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field125 = (short[]) null;
        }
        field121++;
        return (this.field111[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 169)
    public static void method90(int arg0) {
        field113 = null;
        field126 = null;
        if (arg0 != 63) {
            field120 = -93;
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(II)V", line = 183)
    public static final void method91(int arg0, int arg1) {
        if (arg0 < 100) {
            field113 = (Calendar) null;
        }
        class244.field3675.method1429((byte) 127, arg1);
        field124++;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(I)V", line = 196)
    public class11(int arg0) {
        this.field112 = arg0;
        this.field111 = new byte[this.field112];
        this.field109 = new short[this.field112];
        this.field119 = new String[this.field112];
        this.field123 = new int[this.field112];
        this.field125 = new short[this.field112];
    }
}
