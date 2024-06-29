import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class227 extends class196 {

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "Z")
    public static boolean field3974;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        field3973++;
        if (arg1 != 10565) {
            field3974 = false;
        }
        return class211.field3510;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class227() {
        super(0, true);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(II)I")
    public static final int method1562(int arg0, int arg1) {
        field3971++;
        if (arg1 < 38) {
            return 119;
        } else {
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(II)Z")
    public static final boolean method1563(int arg0, int arg1) {
        field3972++;
        if (arg0 != 20039) {
            field3974 = true;
        }
        return ((arg1 & 0x5F123181) >> 30) != 0;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V")
    public static final void method1564(byte arg0) {
        class80.field1290.method1350((byte) 115);
        if (arg0 != -102) {
            method1563(43, 19);
        }
        field3969++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLlb;)V")
    public static final void method1565(byte arg0, class121 arg1) {
        field3975++;
        if (arg0 != 80) {
            field3974 = false;
        }
        while (true) {
            while (arg1.field2026 < arg1.field2014.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method897(121) == 1) {
                    var3 = true;
                    var2 = arg1.method897(arg0 ^ 0x3E);
                    var4 = arg1.method897(118);
                }
                int var5 = arg1.method897(127);
                int var6 = arg1.method897(-79);
                int var7 = var5 * 64 - class107.field1764;
                int var8 = class46.field736 + class85.field1433 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class5.field38 > var7 + 63 && var8 < class85.field1433) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var2 * 8 <= var11 && var11 < var2 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                byte var13 = arg1.method912((byte) -90);
                                if (var13 != 0) {
                                    if (class172.field2817[var9][var10] == null) {
                                        class172.field2817[var9][var10] = new byte[4096];
                                    }
                                    class172.field2817[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method912((byte) -90);
                                    if (class202.field3379[var9][var10] == null) {
                                        class202.field3379[var9][var10] = new byte[4096];
                                    }
                                    class202.field3379[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method912((byte) -90);
                        if (var16 != 0) {
                            arg1.field2026++;
                        }
                    }
                }
            }
            return;
        }
    }
}
