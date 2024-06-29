import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class153 {

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "Z")
    public boolean field1940 = false;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public int field1947 = 0;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "Lwha;")
    public class359 field1945 = null;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Z")
    public boolean field1938 = false;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "Z")
    public boolean field1951 = false;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "[S")
    public short[] field1953;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "[S")
    public short[] field1952;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "[S")
    public short[] field1954;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "[S")
    public short[] field1943;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "[S")
    public short[] field1942;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[B")
    public byte[] field1939;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "[S")
    private static short[] field1944 = new short[500];

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "[S")
    private static short[] field1946 = new short[500];

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "[B")
    private static byte[] field1941 = new byte[500];

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "[S")
    private static short[] field1950 = new short[500];

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "[S")
    private static short[] field1949 = new short[500];

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "[S")
    private static short[] field1948 = new short[500];

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "()V")
    public static void method871() {
        field1946 = null;
        field1948 = null;
        field1950 = null;
        field1944 = null;
        field1949 = null;
        field1941 = null;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([BLwha;)V")
    public class153(byte[] arg0, class359 arg1) {
        this.field1945 = arg1;
        try {
            class234 var3 = new class234(arg0);
            class234 var4 = new class234(arg0);
            var3.method1509(true);
            var3.field3133 += 2;
            int var5 = var3.method1509(true);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3133 = var3.field3133 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field1945.field4382[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1509(true);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field1946[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field1948[var6] = var12;
                    } else {
                        field1948[var6] = (short) var4.method1538(65);
                    }
                    if ((var11 & 0x2) == 0) {
                        field1950[var6] = var12;
                    } else {
                        field1950[var6] = (short) var4.method1538(65);
                    }
                    if ((var11 & 0x4) == 0) {
                        field1944[var6] = var12;
                    } else {
                        field1944[var6] = (short) var4.method1538(65);
                    }
                    field1941[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field1948[var6] = (short) (field1948[var6] << 2 & 0x3FFF);
                        field1950[var6] = (short) (field1950[var6] << 2 & 0x3FFF);
                        field1944[var6] = (short) (field1944[var6] << 2 & 0x3FFF);
                    }
                    field1949[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field1949[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field1951 = true;
                    } else if (var10 == 7) {
                        this.field1940 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field1938 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3133) {
                throw new RuntimeException();
            }
            this.field1947 = var6;
            this.field1953 = new short[var6];
            this.field1952 = new short[var6];
            this.field1954 = new short[var6];
            this.field1943 = new short[var6];
            this.field1942 = new short[var6];
            this.field1939 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field1953[var13] = field1946[var13];
                this.field1952[var13] = field1948[var13];
                this.field1954[var13] = field1950[var13];
                this.field1943[var13] = field1944[var13];
                this.field1942[var13] = field1949[var13];
                this.field1939[var13] = field1941[var13];
            }
        } catch (Exception var14) {
            this.field1947 = 0;
            this.field1951 = false;
            this.field1940 = false;
        }
    }
}
