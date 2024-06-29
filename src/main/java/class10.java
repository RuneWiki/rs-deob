import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class10 {

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Ld;")
    private class242 field120 = new class242(64);

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lum;")
    private class83 field115;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field116 = 1;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method47(byte arg0, String arg1, boolean arg2) {
        class93.field1495.field1355 = 1;
        field117++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class300.field4608.field4787; var6++) {
            class221 var9 = class300.field4608.method2088(var6, 113);
            if ((!arg2 || var9.field3308) && var9.field3386 == -1 && var9.field3364 == -1 && var9.field3361 == 0 && var9.field3377.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class6.field75 = null;
                    class132.field1947 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class132.field1947 = var5;
        class6.field75 = var4;
        class186.field2860 = 0;
        String[] var7 = new String[class132.field1947];
        for (int var8 = 0; var8 < class132.field1947; var8++) {
            var7[var8] = class300.field4608.method2088(var4[var8], 127).field3377;
        }
        if (arg0 < 43) {
            method48((byte) 1, -111, 106);
        }
        class252.method1794(var7, class6.field75, 1);
        class93.field1495.method728((byte) 122);
        class93.field1495.field1355 = 2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BII)Llb;")
    public static final class188 method48(byte arg0, int arg1, int arg2) {
        field110++;
        if (arg0 <= 32) {
            field116 = -80;
        }
        class188 var3 = (class188) class350.field5223.method358((byte) -122, (long) arg2 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class188(arg1, arg2);
            class350.field5223.method357(var3, 1, var3.field1932);
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public final void method49(int arg0, int arg1) {
        class242 var3 = this.field120;
        synchronized (this.field120) {
            this.field120.method1631(arg1, (byte) -19);
        }
        if (arg0 <= 87) {
            method48((byte) -10, -78, -54);
        }
        field114++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final void method50(int arg0) {
        field111++;
        class242 var2 = this.field120;
        synchronized (this.field120) {
            this.field120.method1637((byte) 13);
            if (arg0 != -29654) {
                this.method52(-17, (byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static final void method51(boolean arg0) {
        if (class350.field5227 != null) {
            class350.field5227.method2819(44);
        }
        if (arg0) {
            field118++;
            if (class176.field2707 != null) {
                class176.field2707.method2819(53);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)Llf;")
    public final class518 method52(int arg0, byte arg1) {
        field112++;
        class242 var3 = this.field120;
        class518 var4;
        synchronized (this.field120) {
            var4 = (class518) this.field120.method1634((long) arg0, 64);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -126 / ((arg1 - 5) / 62);
        class83 var6 = this.field115;
        byte[] var7;
        synchronized (this.field115) {
            var7 = this.field115.method731(0, arg0, 16);
        }
        class518 var8 = new class518();
        if (var7 != null) {
            var8.method3060(new class194(var7), (byte) -94);
        }
        class242 var9 = this.field120;
        synchronized (this.field120) {
            this.field120.method1623((long) arg0, 17621, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public final void method53(byte arg0) {
        field113++;
        class242 var2 = this.field120;
        synchronized (this.field120) {
            if (arg0 != -70) {
                this.field119 = -121;
            }
            this.field120.method1630(-19);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lpt;ILum;)V")
    public class10(class308 arg0, int arg1, class83 arg2) {
        this.field115 = arg2;
        if (this.field115 == null) {
            this.field119 = 0;
        } else {
            this.field119 = this.field115.method748(16, 12408);
        }
    }
}
