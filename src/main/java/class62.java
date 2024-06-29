import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class62 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lpj;")
    private static class237 field1244 = class33.method353("Cancel", 121);

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lpj;")
    public static class237 field1245 = class33.method353("Wordpack geladen)3", 32);

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lpj;")
    private static class237 field1247 = class33.method353("Loading world list data", 124);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lpj;")
    public static class237 field1239 = field1247;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lpj;")
    public static class237 field1242 = field1244;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lpj;")
    private static class237 field1243 = class33.method353("Loaded input handler", 36);

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lpj;")
    public static class237 field1246 = class33.method353("rot:", 95);

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lpj;")
    public static class237 field1253 = field1243;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "J")
    public static long field1254;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Z")
    public static boolean field1248;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "[[I")
    public static int[][] field1241;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Ltb;")
    public abstract class68 method140(boolean arg0);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
    public abstract int method145(int arg0, int arg1);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
    public static void method523(boolean arg0) {
        field1247 = null;
        field1239 = null;
        field1244 = null;
        field1253 = null;
        field1241 = null;
        field1246 = null;
        if (!arg0) {
            method526(false, 64);
        }
        field1242 = null;
        field1245 = null;
        field1243 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLie;)V")
    public static final void method524(byte arg0, class32 arg1) {
        if (arg0 != -25) {
            method525((class32) null, 62);
        }
        for (int var2 = 0; var2 < class193.field3338; var2++) {
            int var3 = arg1.method303(-127);
            int var4 = arg1.method339(-16777216);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class81.field1521[var3] != null) {
                class81.field1521[var3].field3131 = var4;
            }
        }
        field1249++;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[B")
    public abstract byte[] method141(int arg0, int arg1);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lie;I)V")
    public static final void method525(class32 arg0, int arg1) {
        field1252++;
        if (arg1 != 63) {
            method524((byte) 79, (class32) null);
        }
        while (true) {
            while (arg0.field644.length > arg0.field647) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method316((byte) -80) == 1) {
                    var2 = true;
                    var3 = arg0.method316((byte) -44);
                    var4 = arg0.method316((byte) 122);
                }
                int var5 = arg0.method316((byte) -50);
                int var6 = arg0.method316((byte) -85);
                int var7 = class17.field296 + class115.field2017 - var6 * 64 - 1;
                int var8 = var5 * 64 - class202.field3466;
                if (var8 >= 0 && (var7 - 63) >= 0 && (var8 + 63) < class148.field2629 && class115.field2017 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var3 * 8 + 8 > var11 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method325(arg1 ^ 0x60);
                                if (var13 != 0) {
                                    if (class97.field1718[var9][var10] == null) {
                                        class97.field1718[var9][var10] = new byte[4096];
                                    }
                                    class97.field1718[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method325(-111);
                                    if (class205.field3502[var9][var10] == null) {
                                        class205.field3502[var9][var10] = new byte[4096];
                                    }
                                    class205.field3502[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method325(87);
                        if (var16 != 0) {
                            arg0.field647++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V")
    public abstract void method137(byte arg0, int arg1);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)V")
    public static final void method526(boolean arg0, int arg1) {
        field1251++;
        if (arg0) {
            field1243 = null;
        }
        if (arg1 == -1 && !class140.field2406) {
            class55.method483(3);
        } else if (arg1 != -1 && (class190.field3311 != arg1 || !class3.method56(-1026652120)) && class113.field1983 != 0 && !class140.field2406) {
            class92.method693(arg1, 7525, class113.field1983, false, 2, 0, class151.field2685);
        }
        class190.field3311 = arg1;
    }
}
