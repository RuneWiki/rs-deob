import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class478 {

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "Z")
    public boolean field6373 = false;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "Z")
    public boolean field6377 = false;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "Z")
    public boolean field6369 = false;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public int field6379 = 0;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "Lrh;")
    public class247 field6372 = null;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "[S")
    public short[] field6371;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "[S")
    public short[] field6365;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "[S")
    public short[] field6376;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "[S")
    public short[] field6375;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "[S")
    public short[] field6368;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "[B")
    public byte[] field6367;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "[S")
    private static short[] field6374 = new short[500];

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "[S")
    private static short[] field6363 = new short[500];

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "[S")
    private static short[] field6364 = new short[500];

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "[S")
    private static short[] field6370 = new short[500];

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "[B")
    private static byte[] field6366 = new byte[500];

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "[S")
    private static short[] field6378 = new short[500];

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "()V", line = 10)
    public static void method2676() {
        field6364 = null;
        field6378 = null;
        field6374 = null;
        field6363 = null;
        field6370 = null;
        field6366 = null;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "([BLrh;)V", line = 65)
    public class478(byte[] arg0, class247 arg1) {
        this.field6372 = arg1;
        try {
            class335 var3 = new class335(arg0);
            class335 var4 = new class335(arg0);
            var3.method2034(255);
            var3.field4619 += 2;
            int var5 = var3.method2034(255);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field4619 = var3.field4619 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field6372.field3439[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2034(255);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field6364[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field6378[var6] = var12;
                    } else {
                        field6378[var6] = (short) var4.method2026(-9399);
                    }
                    if ((var11 & 0x2) == 0) {
                        field6374[var6] = var12;
                    } else {
                        field6374[var6] = (short) var4.method2026(-9399);
                    }
                    if ((var11 & 0x4) == 0) {
                        field6363[var6] = var12;
                    } else {
                        field6363[var6] = (short) var4.method2026(-9399);
                    }
                    field6366[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field6378[var6] = (short) (field6378[var6] << 2 & 0x3FFF);
                        field6374[var6] = (short) (field6374[var6] << 2 & 0x3FFF);
                        field6363[var6] = (short) (field6363[var6] << 2 & 0x3FFF);
                    }
                    field6370[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field6370[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field6377 = true;
                    } else if (var10 == 7) {
                        this.field6369 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field6373 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field4619) {
                throw new RuntimeException();
            }
            this.field6379 = var6;
            this.field6371 = new short[var6];
            this.field6365 = new short[var6];
            this.field6376 = new short[var6];
            this.field6375 = new short[var6];
            this.field6368 = new short[var6];
            this.field6367 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field6371[var13] = field6364[var13];
                this.field6365[var13] = field6378[var13];
                this.field6376[var13] = field6374[var13];
                this.field6375[var13] = field6363[var13];
                this.field6368[var13] = field6370[var13];
                this.field6367[var13] = field6366[var13];
            }
        } catch (Exception var14) {
            this.field6379 = 0;
            this.field6377 = false;
            this.field6369 = false;
        }
    }
}
