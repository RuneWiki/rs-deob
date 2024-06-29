import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class677 {

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "Z")
    public boolean field9586 = false;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "Z")
    public boolean field9584 = false;

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
    public int field9592 = 0;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "Z")
    public boolean field9594 = false;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "Lfda;")
    public class319 field9583 = null;

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "[S")
    public short[] field9598;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "[S")
    public short[] field9590;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "[S")
    public short[] field9587;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "[S")
    public short[] field9585;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "[S")
    public short[] field9596;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "[B")
    public byte[] field9589;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "[S")
    private static short[] field9582 = new short[500];

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "[S")
    private static short[] field9588 = new short[500];

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "[S")
    private static short[] field9595 = new short[500];

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "[B")
    private static byte[] field9591 = new byte[500];

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "[S")
    private static short[] field9597 = new short[500];

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "[S")
    private static short[] field9593 = new short[500];

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "()V", line = 4)
    public static void method3846() {
        field9588 = null;
        field9595 = null;
        field9582 = null;
        field9597 = null;
        field9593 = null;
        field9591 = null;
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "([BLfda;)V", line = 65)
    public class677(byte[] arg0, class319 arg1) {
        this.field9583 = arg1;
        try {
            class244 var3 = new class244(arg0);
            class244 var4 = new class244(arg0);
            var3.method1423(-110);
            var3.field2903 += 2;
            int var5 = var3.method1423(-74);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field2903 = var3.field2903 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field9583.field4073[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1423(-37);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field9588[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field9595[var6] = var12;
                    } else {
                        field9595[var6] = (short) var4.method1427(-80);
                    }
                    if ((var11 & 0x2) == 0) {
                        field9582[var6] = var12;
                    } else {
                        field9582[var6] = (short) var4.method1427(-74);
                    }
                    if ((var11 & 0x4) == 0) {
                        field9597[var6] = var12;
                    } else {
                        field9597[var6] = (short) var4.method1427(-20);
                    }
                    field9591[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field9595[var6] = (short) (field9595[var6] << 2 & 0x3FFF);
                        field9582[var6] = (short) (field9582[var6] << 2 & 0x3FFF);
                        field9597[var6] = (short) (field9597[var6] << 2 & 0x3FFF);
                    }
                    field9593[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field9593[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field9594 = true;
                    } else if (var10 == 7) {
                        this.field9586 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field9584 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field2903) {
                throw new RuntimeException();
            }
            this.field9592 = var6;
            this.field9598 = new short[var6];
            this.field9590 = new short[var6];
            this.field9587 = new short[var6];
            this.field9585 = new short[var6];
            this.field9596 = new short[var6];
            this.field9589 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field9598[var13] = field9588[var13];
                this.field9590[var13] = field9595[var13];
                this.field9587[var13] = field9582[var13];
                this.field9585[var13] = field9597[var13];
                this.field9596[var13] = field9593[var13];
                this.field9589[var13] = field9591[var13];
            }
        } catch (Exception var14) {
            this.field9592 = 0;
            this.field9594 = false;
            this.field9586 = false;
        }
    }
}
