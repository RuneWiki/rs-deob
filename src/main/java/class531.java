import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class531 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Z")
    public boolean field7603 = false;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public int field7610 = 0;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lju;")
    public class112 field7609 = null;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Z")
    public boolean field7611 = false;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Z")
    public boolean field7615 = false;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "[S")
    public short[] field7601;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[S")
    public short[] field7602;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[S")
    public short[] field7604;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[S")
    public short[] field7600;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "[S")
    public short[] field7605;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "[B")
    public byte[] field7616;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[S")
    private static short[] field7606 = new short[500];

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "[S")
    private static short[] field7608 = new short[500];

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[S")
    private static short[] field7607 = new short[500];

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "[B")
    private static byte[] field7613 = new byte[500];

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "[S")
    private static short[] field7612 = new short[500];

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "[S")
    private static short[] field7614 = new short[500];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public static void method3031() {
        field7608 = null;
        field7612 = null;
        field7607 = null;
        field7614 = null;
        field7606 = null;
        field7613 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([BLju;)V")
    public class531(byte[] arg0, class112 arg1) {
        this.field7609 = arg1;
        try {
            class452 var3 = new class452(arg0);
            class452 var4 = new class452(arg0);
            var3.method2541(62);
            var3.field6215 += 2;
            int var5 = var3.method2541(124);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field6215 = var3.field6215 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field7609.field1297[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2541(99);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field7608[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field7612[var6] = var12;
                    } else {
                        field7612[var6] = (short) var4.method2572(false);
                    }
                    if ((var11 & 0x2) == 0) {
                        field7607[var6] = var12;
                    } else {
                        field7607[var6] = (short) var4.method2572(false);
                    }
                    if ((var11 & 0x4) == 0) {
                        field7614[var6] = var12;
                    } else {
                        field7614[var6] = (short) var4.method2572(false);
                    }
                    field7613[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field7612[var6] = (short) (field7612[var6] << 2 & 0x3FFF);
                        field7607[var6] = (short) (field7607[var6] << 2 & 0x3FFF);
                        field7614[var6] = (short) (field7614[var6] << 2 & 0x3FFF);
                    }
                    field7606[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field7606[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field7615 = true;
                    } else if (var10 == 7) {
                        this.field7611 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field7603 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field6215) {
                throw new RuntimeException();
            }
            this.field7610 = var6;
            this.field7601 = new short[var6];
            this.field7602 = new short[var6];
            this.field7604 = new short[var6];
            this.field7600 = new short[var6];
            this.field7605 = new short[var6];
            this.field7616 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field7601[var13] = field7608[var13];
                this.field7602[var13] = field7612[var13];
                this.field7604[var13] = field7607[var13];
                this.field7600[var13] = field7614[var13];
                this.field7605[var13] = field7606[var13];
                this.field7616[var13] = field7613[var13];
            }
        } catch (Exception var14) {
            this.field7610 = 0;
            this.field7615 = false;
            this.field7611 = false;
        }
    }
}
