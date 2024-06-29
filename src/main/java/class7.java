import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CQXSYOPM")
public class class7 {

    @OriginalMember(owner = "client!CQXSYOPM", name = "a", descriptor = "Z")
    private boolean field611 = true;

    @OriginalMember(owner = "client!CQXSYOPM", name = "c", descriptor = "I")
    private int field613 = 21701;

    @OriginalMember(owner = "client!CQXSYOPM", name = "h", descriptor = "[LXDUWEFUG;")
    private class63[] field618 = new class63[10];

    @OriginalMember(owner = "client!CQXSYOPM", name = "b", descriptor = "I")
    private static int field612 = 21302;

    @OriginalMember(owner = "client!CQXSYOPM", name = "d", descriptor = "[LCQXSYOPM;")
    private static class7[] field614 = new class7[5000];

    @OriginalMember(owner = "client!CQXSYOPM", name = "e", descriptor = "[I")
    public static int[] field615 = new int[5000];

    @OriginalMember(owner = "client!CQXSYOPM", name = "i", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "client!CQXSYOPM", name = "j", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!CQXSYOPM", name = "g", descriptor = "LMNKDCXXG;")
    private static class37 field617;

    @OriginalMember(owner = "client!CQXSYOPM", name = "f", descriptor = "[B")
    private static byte[] field616;

    @OriginalMember(owner = "client!CQXSYOPM", name = "<init>", descriptor = "(I)V")
    private class7(int arg0) {
        if (this.field613 != arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!CQXSYOPM", name = "a", descriptor = "(LMNKDCXXG;I)V")
    public static final void method171(class37 arg0, int arg1) {
        field616 = new byte[441000];
        field617 = new class37(field616, -670);
        if (arg1 != 24570) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class63.method552();
        while (true) {
            int var3 = arg0.method388();
            if (var3 == 65535) {
                return;
            }
            field614[var3] = new class7(21701);
            field614[var3].method173(arg0, 0);
            field615[var3] = field614[var3].method174(1);
        }
    }

    @OriginalMember(owner = "client!CQXSYOPM", name = "a", descriptor = "(IIB)LMNKDCXXG;")
    public static final class37 method172(int arg0, int arg1, byte arg2) {
        if (arg2 == 0) {
            boolean var3 = false;
        } else {
            field612 = -454;
        }
        if (field614[arg0] == null) {
            return null;
        } else {
            class7 var4 = field614[arg0];
            return var4.method175(2, arg1);
        }
    }

    @OriginalMember(owner = "client!CQXSYOPM", name = "b", descriptor = "(LMNKDCXXG;I)V")
    private final void method173(class37 arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method386();
            if (var4 != 0) {
                arg0.field1212--;
                this.field618[var3] = new class63();
                this.field618[var3].method555(arg0, 0);
            }
        }
        this.field619 = arg0.method388();
        this.field620 = arg0.method388();
    }

    @OriginalMember(owner = "client!CQXSYOPM", name = "a", descriptor = "(I)I")
    private final int method174(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field618[var3] != null && this.field618[var3].field1623 / 20 < var2) {
                var2 = this.field618[var3].field1623 / 20;
            }
        }
        if (this.field619 < this.field620 && this.field619 / 20 < var2) {
            var2 = this.field619 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field618[var4] != null) {
                this.field618[var4].field1623 -= var2 * 20;
            }
        }
        if (arg0 < 1 || arg0 > 1) {
            return this.field613;
        }
        if (this.field619 < this.field620) {
            this.field619 -= var2 * 20;
            this.field620 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!CQXSYOPM", name = "a", descriptor = "(II)LMNKDCXXG;")
    private final class37 method175(int arg0, int arg1) {
        int var3 = this.method176(arg1);
        field617.field1212 = 0;
        field617.method380(1380533830);
        field617.method381(0, var3 + 36);
        field617.method380(1463899717);
        field617.method380(1718449184);
        field617.method381(0, 16);
        field617.method378(27823, 1);
        field617.method378(27823, 1);
        field617.method381(0, 22050);
        field617.method381(0, 22050);
        field617.method378(27823, 1);
        if (arg0 < 2 || arg0 > 2) {
            this.field611 = !this.field611;
        }
        field617.method378(27823, 8);
        field617.method380(1684108385);
        field617.method381(0, var3);
        field617.field1212 += var3;
        return field617;
    }

    @OriginalMember(owner = "client!CQXSYOPM", name = "b", descriptor = "(I)I")
    private final int method176(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field618[var3] != null && this.field618[var3].field1623 + this.field618[var3].field1622 > var2) {
                var2 = this.field618[var3].field1623 + this.field618[var3].field1622;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field619 * 22050 / 1000;
        int var6 = this.field620 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field616[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field618[var9] != null) {
                int var15 = this.field618[var9].field1622 * 22050 / 1000;
                int var16 = this.field618[var9].field1623 * 22050 / 1000;
                int[] var17 = this.field618[var9].method553(var15, this.field618[var9].field1622);
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = (var17[var18] >> 8) + (field616[var16 + var18 + 44] & 0xFF);
                    if ((var19 & 0xFFFFFF00) != 0) {
                        var19 = ~(var19 >> 31);
                    }
                    field616[var16 + var18 + 44] = (byte) var19;
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
                field616[var10 + var11] = field616[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field616[var13 + var14] = field616[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
