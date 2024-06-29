import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UDNCEGOL")
public class Wave {

    @OriginalMember(owner = "client!UDNCEGOL", name = "b", descriptor = "I")
    private int field1468 = -573;

    @OriginalMember(owner = "client!UDNCEGOL", name = "c", descriptor = "I")
    private int field1469 = -252;

    @OriginalMember(owner = "client!UDNCEGOL", name = "i", descriptor = "[LDXRZIVAQ;")
    private SoundTone[] field1475 = new SoundTone[10];

    @OriginalMember(owner = "client!UDNCEGOL", name = "a", descriptor = "B")
    private static byte field1467 = 6;

    @OriginalMember(owner = "client!UDNCEGOL", name = "d", descriptor = "Z")
    private static boolean field1470 = true;

    @OriginalMember(owner = "client!UDNCEGOL", name = "e", descriptor = "[LUDNCEGOL;")
    private static Wave[] field1471 = new Wave[5000];

    @OriginalMember(owner = "client!UDNCEGOL", name = "f", descriptor = "[I")
    public static int[] field1472 = new int[5000];

    @OriginalMember(owner = "client!UDNCEGOL", name = "j", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client!UDNCEGOL", name = "k", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!UDNCEGOL", name = "h", descriptor = "LMFMVIYHT;")
    private static Packet field1474;

    @OriginalMember(owner = "client!UDNCEGOL", name = "g", descriptor = "[B")
    private static byte[] field1473;

    @OriginalMember(owner = "client!UDNCEGOL", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!UDNCEGOL", name = "a", descriptor = "(LMFMVIYHT;I)V")
    public static final void method478(Packet arg0, int arg1) {
        if (arg1 != 36135) {
            return;
        }
        field1473 = new byte[441000];
        field1474 = new Packet(true, field1473);
        SoundTone.method186();
        while (true) {
            int var2 = arg0.g2();
            if (var2 == 65535) {
                return;
            }
            field1471[var2] = new Wave(-524);
            field1471[var2].method480(field1467, arg0);
            field1472[var2] = field1471[var2].method481(0);
        }
    }

    @OriginalMember(owner = "client!UDNCEGOL", name = "a", descriptor = "(IBI)LMFMVIYHT;")
    public static final Packet method479(int arg0, byte arg1, int arg2) {
        if (arg1 != 6) {
            field1470 = !field1470;
        }
        if (field1471[arg2] == null) {
            return null;
        } else {
            Wave var3 = field1471[arg2];
            return var3.method482(-573, arg0);
        }
    }

    @OriginalMember(owner = "client!UDNCEGOL", name = "a", descriptor = "(BLMFMVIYHT;)V")
    private final void method480(byte arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg1.g1();
            if (var5 != 0) {
                arg1.pos--;
                this.field1475[var3] = new SoundTone();
                this.field1475[var3].method189(field1467, arg1);
            }
        }
        this.field1476 = arg1.g2();
        this.field1477 = arg1.g2();
        if (arg0 == 6) {
            boolean var4 = false;
        } else {
            this.field1469 = 64;
        }
    }

    @OriginalMember(owner = "client!UDNCEGOL", name = "a", descriptor = "(I)I")
    private final int method481(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1475[var3] != null && this.field1475[var3].field662 / 20 < var2) {
                var2 = this.field1475[var3].field662 / 20;
            }
        }
        if (this.field1476 < this.field1477 && this.field1476 / 20 < var2) {
            var2 = this.field1476 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1475[var4] != null) {
                this.field1475[var4].field662 -= var2 * 20;
            }
        }
        if (arg0 != 0) {
            field1470 = !field1470;
        }
        if (this.field1476 < this.field1477) {
            this.field1476 -= var2 * 20;
            this.field1477 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!UDNCEGOL", name = "a", descriptor = "(II)LMFMVIYHT;")
    private final Packet method482(int arg0, int arg1) {
        int var3 = this.method483(arg1);
        field1474.pos = 0;
        field1474.p4(1380533830);
        field1474.ip4(var3 + 36, false);
        field1474.p4(1463899717);
        field1474.p4(1718449184);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        field1474.ip4(16, false);
        field1474.ip2(1, false);
        field1474.ip2(1, false);
        field1474.ip4(22050, false);
        field1474.ip4(22050, false);
        field1474.ip2(1, false);
        field1474.ip2(8, false);
        field1474.p4(1684108385);
        field1474.ip4(var3, false);
        field1474.pos += var3;
        return field1474;
    }

    @OriginalMember(owner = "client!UDNCEGOL", name = "b", descriptor = "(I)I")
    private final int method483(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1475[var3] != null && this.field1475[var3].field662 + this.field1475[var3].field661 > var2) {
                var2 = this.field1475[var3].field662 + this.field1475[var3].field661;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1476 * 22050 / 1000;
        int var6 = this.field1477 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1473[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1475[var9] != null) {
                int var15 = this.field1475[var9].field661 * 22050 / 1000;
                int var16 = this.field1475[var9].field662 * 22050 / 1000;
                int[] var17 = this.field1475[var9].method187(var15, this.field1475[var9].field661);
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = (var17[var18] >> 8) + (field1473[var16 + var18 + 44] & 0xFF);
                    if ((var19 & 0xFFFFFF00) != 0) {
                        var19 = ~(var19 >> 31);
                    }
                    field1473[var16 + var18 + 44] = (byte) var19;
                }
            }
        }
        if (arg0 > 1) {
            var5 += 44;
            var6 += 44;
            var4 += 44;
            var7 += 44;
            int var10 = var7 - var4;
            for (int var11 = var4 - 1; var11 >= var6; var11--) {
                field1473[var10 + var11] = field1473[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1473[var13 + var14] = field1473[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
