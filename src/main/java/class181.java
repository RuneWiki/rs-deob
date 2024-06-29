import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class181 {

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[B")
    private byte[] field3203 = new byte[4];

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Lh;")
    private class139 field3201;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    private int field3206;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "J")
    private long field3190;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lqj;")
    public static class196 field3188 = class80.method502("floorshadows", -48);

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "Lqj;")
    public static class196 field3205 = class80.method502("(Z", -48);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lqj;")
    public static class196 field3189 = class80.method502("sl_stars", -48);

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field3208 = -1;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    private int field3192;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    private int field3198;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3197;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "[B")
    private byte[] field3194;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[I")
    public static int[] field3191;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static final void method1184(byte arg0) {
        field3207++;
        if (arg0 >= -38) {
            method1184((byte) 118);
        }
        class110.field1562 = new class231(32);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static final void method1185(boolean arg0) {
        class63.method398(-123, 5);
        field3199++;
        class45.method238((byte) -9, 5);
        class47.method248(5, false);
        class211.method1462(5, (byte) 77);
        class200.method1350(arg0, 5);
        class130.method792(5, 30);
        class175.method1145(105, 5);
        class51.method267(0, 5);
        class223.method1509(5, 26299);
        class209.method1448(-122, 5);
        class8.method31(26155, 5);
        class60.method383(-4, 50);
        class143.method887(-1, 5);
        class192.method1272((byte) -23, 5);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)[B")
    public final byte[] method1186(int arg0) throws IOException {
        field3200++;
        if (this.field3190 < class183.method1195((byte) 127)) {
            throw new IOException("fdt");
        }
        if (this.field3206 == arg0) {
            if (this.field3201.field2140 == 2) {
                throw new IOException("fds");
            }
            if (this.field3201.field2140 == 1) {
                this.field3197 = (DataInputStream) this.field3201.field2135;
                this.field3206 = 1;
            }
        }
        if (this.field3206 == 1) {
            int var2 = this.field3197.available();
            if (var2 > 0) {
                if (this.field3192 + var2 > 4) {
                    var2 = 4 - this.field3192;
                }
                this.field3192 += this.field3197.read(this.field3203, this.field3192, var2);
                if (this.field3192 == 4) {
                    int var3 = (new class56(this.field3203)).method311(0);
                    this.field3194 = new byte[var3];
                    this.field3206 = 2;
                }
            }
        }
        if (this.field3206 == 2) {
            int var4 = this.field3197.available();
            if (var4 > 0) {
                if (var4 + this.field3198 > this.field3194.length) {
                    var4 = this.field3194.length - this.field3198;
                }
                this.field3198 += this.field3197.read(this.field3194, this.field3198, var4);
                if (this.field3194.length == this.field3198) {
                    return this.field3194;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public static final void method1187(byte arg0) {
        if (arg0 != 113) {
            field3205 = null;
        }
        field3202++;
        if (class142.field2180 != null) {
            class142.field2180.method1098(false);
        }
        if (class5.field35 != null) {
            class5.field35.method1098(false);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)I")
    public static final int method1188(int arg0, byte arg1) {
        int var2 = -52 % ((arg1 + 68) / 42);
        field3204++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Llj;Ljava/net/URL;)V")
    public class181(class205 arg0, URL arg1) {
        this.field3201 = arg0.method1391(arg1, -15586);
        this.field3206 = 0;
        this.field3190 = class183.method1195((byte) 122) + 30000L;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V")
    public static void method1189(byte arg0) {
        field3188 = null;
        field3191 = null;
        if (arg0 != -102) {
            method1188(-7, (byte) 82);
        }
        field3189 = null;
        field3205 = null;
    }
}
