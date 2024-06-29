import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class86 extends class262 {

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    private int field1360 = 0;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    private int field1370 = 16;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    private int field1363 = 4096;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    private int field1374 = 2000;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    private int field1364 = 0;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "Lok;")
    public static class146 field1367 = class235.method1724(-12908, "::setparticles");

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field1366 = 1;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "Lok;")
    private static class146 field1365 = class235.method1724(-12908, "Checking for updates )2 ");

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field1361 = 0;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Lok;")
    public static class146 field1369 = field1365;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "[I")
    public static int[] field1371 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "Loh;")
    public static class15 field1372;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lwe;II)V", line = 24)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field1359++;
        if (arg2 == 0) {
            this.field1364 = arg0.method368(-108);
        } else if (arg2 == 1) {
            this.field1374 = arg0.method379(-2);
        } else if (arg2 == 2) {
            this.field1370 = arg0.method368(-100);
        } else if (arg2 == 3) {
            this.field1360 = arg0.method379(-2);
        } else if (arg2 == 4) {
            this.field1363 = arg0.method379(arg1 - 2050);
        }
        if (arg1 != 2048) {
            field1366 = -126;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 306)
    public class86() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V", line = 88)
    public static void method600(int arg0) {
        field1372 = null;
        if (arg0 != 17206) {
            method601((class146) null, -19);
        }
        field1365 = null;
        field1367 = null;
        field1369 = null;
        field1371 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[I", line = 106)
    public final int[] method38(int arg0, byte arg1) {
        field1373++;
        if (arg1 >= -85) {
            method600(71);
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 123);
        if (this.field4350.field3333) {
            int var4 = this.field1363 >> 1;
            int[][] var5 = this.field4350.method1533(21819);
            Random var6 = new Random((long) this.field1364);
            for (int var7 = 0; var7 < this.field1374; var7++) {
                int var8 = this.field1363 <= 0 ? this.field1360 : this.field1360 + class9.method66(-482656096, this.field1363, var6) - var4;
                int var9 = var8 >> 4 & 0xFF;
                int var10 = class9.method66(-482656096, class98.field1598, var6);
                int var11 = class9.method66(-482656096, class104.field1676, var6);
                int var12 = (class260.field4324[var9] * this.field1370 >> 12) + var11;
                int var13 = (class15.field309[var9] * this.field1370 >> 12) + var10;
                int var14 = var12 - var11;
                int var15 = var13 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var13;
                        int var18 = var10;
                        var13 = var12;
                        var10 = var11;
                        var12 = var17;
                        var11 = var18;
                    }
                    if (var10 > var13) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var12;
                        var10 = var13;
                        var13 = var19;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var13 - var10;
                    int var23 = var12 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = var12 > var11 ? 1 : -1;
                    int var27 = 1024 - (class9.method66(-482656096, 4096, var6) >> 2);
                    for (int var28 = var10; var28 < var13; var28++) {
                        var24 += var23;
                        int var29 = (var28 - var10) * var25 + var27 + 1024;
                        int var30 = var28 & class218.field3595;
                        int var31 = var21 & class259.field4297;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 -= -var26;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lok;I)I", line = 267)
    public static final int method601(class146 arg0, int arg1) {
        field1376++;
        int var2 = -72 % ((arg1 + 11) / 36);
        for (int var3 = 0; var3 < class7.field153.length; var3++) {
            if (class7.field153[var3].method1106(arg0, 126)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V", line = 314)
    public final void method43(int arg0) {
        if (arg0 != -2) {
            method600(-88);
        }
        field1362++;
        class73.method543((byte) -67);
    }
}
