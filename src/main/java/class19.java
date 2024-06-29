import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class19 extends class23 {

    @OriginalMember(owner = "mapview!ja", name = "j", descriptor = "[B")
    public byte[] field168;

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "mapview!ja", name = "i", descriptor = "Lt;")
    public static class31 field167 = class14.method84(113, " map");

    @OriginalMember(owner = "mapview!ja", name = "h", descriptor = "Lt;")
    public static class31 field166 = class14.method84(115, "Jewellery");

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "Lt;")
    public static class31 field165 = class14.method84(127, "Bank");

    @OriginalMember(owner = "mapview!ja", name = "k", descriptor = "Lt;")
    public static class31 field169 = class14.method84(122, "Slayer Master");

    @OriginalMember(owner = "mapview!ja", name = "l", descriptor = "Lt;")
    public static class31 field170 = class14.method84(118, "Clothes Shop");

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I[BII)V", line = 5)
    public final void method103(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 21451) {
            this.method117(null, -106, 86, (byte) 45);
        }
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            arg1[var5] = this.field168[this.field164++];
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(II)V", line = 32)
    public final void method104(int arg0, int arg1) {
        this.field168[this.field164++] = (byte) (arg0 >> 24);
        this.field168[this.field164++] = (byte) (arg0 >> 16);
        this.field168[this.field164++] = (byte) (arg0 >> 8);
        this.field168[this.field164++] = (byte) arg0;
        int var3 = 75 / ((arg1 - 19) / 51);
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(I)I", line = 48)
    public final int method105(int arg0) {
        this.field164 += 2;
        int var2 = 43 % ((arg0 - 61) / 62);
        return ((this.field168[this.field164 - 2] & 0xFF) << 8) + (this.field168[this.field164 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "(I)I", line = 69)
    public final int method106(int arg0) {
        if (arg0 < 38) {
            field165 = null;
        }
        this.field164 += 3;
        return ((this.field168[this.field164 - 3] & 0xFF) << 16) - (-(this.field168[this.field164 - 2] << 8 & 0xFF00) - (this.field168[this.field164 - 1] & 0xFF));
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIILca;)[Lha;", line = 86)
    public static final class15[] method107(int arg0, int arg1, int arg2, class6 arg3) {
        if (arg1 >= -5) {
            method115(33, null, -41, 45);
        }
        return method115(arg2, arg3, -45, arg0) ? class1.method5(-69) : null;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 104)
    public static final void method108(Component arg0, boolean arg1) {
        try {
            Method var2 = class16.field126;
            if (var2 != null) {
                var2.invoke(arg0, Boolean.FALSE);
            }
        } catch (Throwable var4) {
        }
        arg0.addKeyListener(class11.field78);
        arg0.addFocusListener(class11.field78);
        if (arg1) {
            field167 = null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(B)I", line = 146)
    public final int method109(byte arg0) {
        this.field164 += 4;
        if (arg0 != -45) {
            field165 = null;
        }
        return (this.field168[this.field164 - 1] & 0xFF) + ((this.field168[this.field164 - 2] & 0xFF) << 8) + ((this.field168[this.field164 + -4] & 0xFF) << 24) + ((this.field168[this.field164 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(B)I", line = 187)
    public final int method110(byte arg0) {
        if (arg0 != -73) {
            this.field164 = 69;
        }
        return this.field168[this.field164++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(II)V", line = 214)
    public final void method111(int arg0, int arg1) {
        if (arg1 <= 24) {
            this.method117(null, -88, 48, (byte) 114);
        }
        this.field168[this.field164++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(B)Lt;", line = 233)
    public final class31 method112(byte arg0) {
        int var2 = this.field164;
        while (this.field168[this.field164++] != 0) {
        }
        if (arg0 != 24) {
            method115(20, null, -38, -51);
        }
        return method116(var2, this.field164 - var2 - 1, this.field168, 0);
    }

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "(B)B", line = 260)
    public final byte method113(byte arg0) {
        if (arg0 != 39) {
            method115(-113, null, -45, -125);
        }
        return this.field168[this.field164++];
    }

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "(B)V", line = 272)
    public static void method114(byte arg0) {
        field165 = null;
        field166 = null;
        field167 = null;
        if (arg0 != 30) {
            method108(null, true);
        }
        field170 = null;
        field169 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(ILca;II)Z", line = 294)
    public static final boolean method115(int arg0, class6 arg1, int arg2, int arg3) {
        byte[] var4 = arg1.method26(arg0, (byte) -66, arg3);
        if (arg2 > -31) {
            return false;
        } else if (var4 == null) {
            return false;
        } else {
            class6.method30(0, var4);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "(I)V", line = 309)
    public class19(int arg0) {
        this.field168 = class12.method73(-122, arg0);
        this.field164 = 0;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(II[BI)Lt;", line = 323)
    private static final class31 method116(int arg0, int arg1, byte[] arg2, int arg3) {
        class31 var4 = new class31();
        var4.field339 = arg3;
        var4.field336 = new byte[arg1];
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg2[var5] != 0) {
                var4.field336[var4.field339++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "([IIIB)V", line = 349)
    public final void method117(int[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -52) {
            return;
        }
        int var5 = this.field164;
        this.field164 = arg1;
        int var6 = (arg2 - arg1) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method109((byte) -45);
            int var9 = this.method109((byte) -45);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ arg0[var10 >>> 11 & 0x1C400003] + var10;
                var10 -= var11;
                var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ arg0[var10 & 0x3] + var10;
            }
            this.field164 -= 8;
            this.method104(var8, -108);
            this.method104(var9, -112);
        }
        this.field164 = var5;
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "([B)V", line = 392)
    public class19(byte[] arg0) {
        this.field164 = 0;
        this.field168 = arg0;
    }
}
