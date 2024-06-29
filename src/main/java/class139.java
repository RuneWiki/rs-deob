import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class139 extends class285 {

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    private int field2186 = -1;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field2185 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "Z")
    public static boolean field2192 = false;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "F")
    public static float field2194;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public int field2183;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "[I")
    public int[] field2180;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "[Lrg;")
    public static class326[] field2181;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 3)
    public class139() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "(I)Z", line = 12)
    public final boolean method1027(int arg0) {
        if (arg0 != -23343) {
            this.method62((byte) -4, -128);
        }
        field2182++;
        if (this.field2180 != null) {
            return true;
        } else if (this.field2186 >= 0) {
            class220 var2 = class103.field1510 >= 0 ? class151.method1100(class103.field1510, class329.field5080, this.field2186, false) : class45.method288(this.field2186, class329.field5080, -16711936);
            var2.method1562();
            this.field2183 = var2.field825;
            this.field2184 = var2.field816;
            this.field2180 = var2.field3545;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)V", line = 38)
    public final void method1028(int arg0) {
        field2193++;
        if (arg0 != 13818) {
            field2189 = -35;
        }
        super.method1028(arg0);
        this.field2180 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[[I", line = 51)
    public int[][] method62(byte arg0, int arg1) {
        field2187++;
        if (arg0 < 121) {
            field2185 = (String[]) null;
        }
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529 && this.method1027(-23343)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = this.field2183 * (class27.field372 == this.field2184 ? arg1 : this.field2184 * arg1 / class27.field372);
            int[] var7 = var3[2];
            if (class287.field4599 == this.field2183) {
                for (int var11 = 0; var11 < class287.field4599; var11++) {
                    int var12 = this.field2180[var6++];
                    var7[var11] = client.method767(var12, 255) << 4;
                    var5[var11] = client.method767(65280, var12) >> 4;
                    var4[var11] = client.method767(var12 >> 12, 4080);
                }
            } else {
                for (int var8 = 0; var8 < class287.field4599; var8++) {
                    int var9 = this.field2183 * var8 / class287.field4599;
                    int var10 = this.field2180[var6 + var9];
                    var7[var8] = client.method767(4080, var10 << 4);
                    var5[var8] = client.method767(var10, 65280) >> 4;
                    var4[var8] = client.method767(var10, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLjj;I)V", line = 120)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (!arg0) {
            this.field2186 = -81;
        }
        if (arg2 == 0) {
            this.field2186 = arg1.method271(21081);
        }
        field2191++;
    }

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "(I)V", line = 134)
    public static void method1029(int arg0) {
        field2185 = null;
        field2181 = null;
        if (arg0 != 1) {
            method1030(18, (byte) 36, 62);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IBI)I", line = 154)
    public static final int method1030(int arg0, byte arg1, int arg2) {
        field2190++;
        int var3 = -62 / ((arg1 + 33) / 46);
        int var4 = 0;
        while (arg0 > 0) {
            var4 = arg2 & 0x1 | var4 << 1;
            arg2 >>>= 0x1;
            arg0--;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)I", line = 173)
    public final int method1031(int arg0) {
        if (arg0 > -127) {
            this.method1028(124);
        }
        field2188++;
        return this.field2186;
    }
}
