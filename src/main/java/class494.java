import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class494 {

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public int field7224 = 128;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public int field7220 = 128;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public int field7228;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public int field7223;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public int field7231;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public int field7235;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public int field7222;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public int field7225;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public int field7227;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public int field7233;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)I")
    public static final int method2957(int arg0, byte arg1) {
        if (arg1 != -56) {
            method2962(null, (byte) -60);
        }
        field7219++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Lno;")
    public final class494 method2958(int arg0) {
        if (arg0 == -21447) {
            field7221++;
            return new class494(this.field7228, this.field7220, this.field7224, this.field7231, this.field7223, this.field7235);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2959(String arg0, byte arg1) {
        field7226++;
        if (class24.field288 != null && arg1 == 67) {
            class32.method258(-114, class216.field3132);
            class96.field1290++;
            class472.field6970.method638(arg1 ^ 0xBC, method2962(arg0, (byte) -92));
            class472.field6970.method605(arg1 ^ 0x3D, arg0);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method2960(boolean arg0, String arg1) {
        field7234++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class215.method1466(arg0, arg1.charAt(var4)) + (var3 << 5) - var3;
        }
        if (!arg0) {
            method2962(null, (byte) -6);
        }
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    public static final void method2961(int arg0) {
        field7230++;
        if (class386.field5687 < 1024.0F) {
            class386.field5687 = 1024.0F;
        }
        while (class328.field4588 >= 16384.0F) {
            class328.field4588 -= 16384.0F;
        }
        if (class386.field5687 > 3072.0F) {
            class386.field5687 = 3072.0F;
        }
        while (class328.field4588 < 0.0F) {
            class328.field4588 += 16384.0F;
        }
        int var1 = 101 % ((arg0 + 3) / 37);
        int var2 = class231.field3380 >> 7;
        int var3 = class49.field537 >> 7;
        int var4 = class66.method643(class231.field3380, -77, class525.field7714, class49.field537);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < (class397.field5828 - 4) && var3 < class457.field6713 - 4) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                    int var8 = class525.field7714;
                    if (var8 < 3 && class274.method1765(var6, -29792, var7)) {
                        var8++;
                    }
                    int var9 = 0;
                    if (class283.field4116.field3981 != null && class283.field4116.field3981[var8] != null) {
                        var9 = (class283.field4116.field3981[var8][var6][var7] & 0xFF) * 8;
                    }
                    int var10 = var9 + var4 - class131.field1899[var8].method430(var6, var7);
                    if (var5 < var10) {
                        var5 = var10;
                    }
                }
            }
        }
        int var11 = (var5 >> 0) * 1536;
        if (var11 > 786432) {
            var11 = 786432;
        }
        if (var11 < 262144) {
            var11 = 262144;
        }
        if (var11 > class67.field869) {
            class67.field869 += (var11 - class67.field869) / 24;
        } else if (class67.field869 > var11) {
            class67.field869 += (var11 - class67.field869) / 80;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2962(String arg0, byte arg1) {
        field7229++;
        return arg1 >= -73 ? 80 : arg0.length() + 1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILno;)V")
    public final void method2963(int arg0, class494 arg1) {
        this.field7228 = arg1.field7228;
        this.field7220 = arg1.field7220;
        this.field7224 = arg1.field7224;
        this.field7235 = arg1.field7235;
        this.field7223 = arg1.field7223;
        this.field7231 = arg1.field7231;
        field7232++;
        if (arg0 != 262144) {
            method2962(null, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I)V")
    public class494(int arg0) {
        this.field7228 = arg0;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(IIIIII)V")
    private class494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7223 = arg4;
        this.field7228 = arg0;
        this.field7220 = arg1;
        this.field7231 = arg3;
        this.field7224 = arg2;
        this.field7235 = arg5;
    }
}
