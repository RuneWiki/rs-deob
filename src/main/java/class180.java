import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class180 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[B")
    private byte[] field2962 = new byte[4];

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Loj;")
    private class150 field2977;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    private int field2961;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "J")
    private long field2966;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "S")
    public static short field2963 = 256;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Ldf;")
    private static class51 field2973 = class46.method233("Select", 100);

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Ldf;")
    private static class51 field2975 = class46.method233("Allocating memory", 100);

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Ldf;")
    public static class51 field2968 = field2973;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Ldf;")
    public static class51 field2976 = field2975;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    private int field2964;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    private int field2969;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Loj;")
    public static class150 field2974;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field2970;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "[B")
    private byte[] field2978;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1279(byte arg0) {
        field2973 = null;
        field2976 = null;
        field2975 = null;
        if (arg0 == 11) {
            field2974 = null;
            field2968 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
    public static final int method1280(int arg0, int arg1, int arg2) {
        field2972++;
        int var3 = class167.method1168(4, arg0 + 91923, -59, arg2 + 45365) + (class167.method1168(2, arg0 + 37821, 125, arg2 + 10294) - 128 >> 1) + (class167.method1168(1, arg0, arg1 ^ 0xCEBA172F, arg2) - 128 >> 2) - 128;
        if (arg1 != 826665185) {
            return 121;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)[B")
    public final byte[] method1281(int arg0) throws IOException {
        field2967++;
        if (class7.method31((byte) -88) > this.field2966) {
            throw new IOException("fdt");
        }
        if (this.field2961 == 0) {
            if (this.field2977.field2504 == 2) {
                throw new IOException("fds");
            }
            if (this.field2977.field2504 == 1) {
                this.field2961 = 1;
                this.field2970 = (DataInputStream) this.field2977.field2505;
            }
        }
        if (arg0 <= 84) {
            method1280(-41, 91, 37);
        }
        if (this.field2961 == 1) {
            int var2 = this.field2970.available();
            if (var2 > 0) {
                if ((this.field2964 + var2) > 4) {
                    var2 = 4 - this.field2964;
                }
                this.field2964 += this.field2970.read(this.field2962, this.field2964, var2);
                if (this.field2964 == 4) {
                    int var3 = (new class121(this.field2962)).method865((byte) 8);
                    this.field2978 = new byte[var3];
                    this.field2961 = 2;
                }
            }
        }
        if (this.field2961 == 2) {
            int var4 = this.field2970.available();
            if (var4 > 0) {
                if (this.field2969 + var4 > this.field2978.length) {
                    var4 = this.field2978.length - this.field2969;
                }
                this.field2969 += this.field2970.read(this.field2978, this.field2969, var4);
                if (this.field2978.length == this.field2969) {
                    return this.field2978;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method1282(int arg0) {
        field2971++;
        int var1 = class89.field1475;
        int var2 = class87.field1455;
        int var3 = class92.field1531;
        int var4 = class255.field4458;
        if (arg0 != 27766) {
            return;
        }
        int var5 = 6116423;
        class59.method393(var1, var4, var3, var2, var5);
        class59.method393(var1 + 1, var4 - -1, var3 - 2, 16, 0);
        class59.method375(var1 + 1, var4 + 18, var3 - 2, var2 - 19, 0);
        class239.field4161.method1335(class259.field4515, var1 + 3, var4 + 14, var5, -1);
        int var6 = class90.field1504;
        int var7 = class89.field1482;
        for (int var8 = 0; var8 < class39.field616; var8++) {
            int var9 = 16777215;
            int var10 = (class39.field616 - var8 - 1) * 15 + var4 + 31;
            if (var7 > var1 && var7 < var1 + var3 && var6 > var10 - 13 && (var10 + 3) > var6) {
                var9 = 16776960;
            }
            class239.field4161.method1335(class168.method1170(var8, -3889), var1 + 3, var10, var9, 0);
        }
        class97.method720(class87.field1455, class92.field1531, class89.field1475, class255.field4458, (byte) -46);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljd;B)I")
    public static final int method1283(class83 arg0, byte arg1) {
        field2979++;
        if (arg1 != -79) {
            field2973 = null;
        }
        class11 var2 = arg0.field1392;
        if (var2.field120 != null) {
            var2 = var2.method60((byte) 33);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field123;
        if (arg0.field4314 == arg0.field4304) {
            var3 = var2.field162;
        } else if (arg0.field4354 == arg0.field4314) {
            var3 = var2.field144;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lsc;Ljava/net/URL;)V")
    public class180(class229 arg0, URL arg1) {
        this.field2977 = arg0.method1574(arg1, -22708);
        this.field2961 = 0;
        this.field2966 = class7.method31((byte) -88) + 30000L;
    }
}
