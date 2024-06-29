import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 extends class107 {

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "[I")
    private int[] field220 = new int[3];

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    private int field221 = 3216;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    private int field224 = 4096;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    private int field218 = 3216;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field222 = 0;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "Z")
    public static boolean field227 = true;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "[I")
    public static int[] field219 = new int[100];

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "Lpj;")
    private static class237 field226 = class33.method353("Loaded wordpack", 62);

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "[Lpj;")
    public static class237[] field213 = new class237[200];

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "Lpj;")
    public static class237 field217 = field226;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V")
    private final void method121(boolean arg0) {
        ++field223;
        double var2 = Math.cos((double) ((float) this.field218 / 4096.0F));
        this.field220[0] = (int) (Math.sin((double) ((float) this.field221 / 4096.0F)) * var2 * 4096.0D);
        if (!arg0) {
            this.field220[1] = (int) (4096.0D * Math.cos((double) ((float) this.field221 / 4096.0F)) * var2);
            this.field220[2] = (int) (4096.0D * Math.sin((double) ((float) this.field218 / 4096.0F)));
            int var4 = this.field220[2] * this.field220[2] >> 12;
            int var5 = this.field220[0] * this.field220[0] >> 12;
            int var6 = this.field220[1] * this.field220[1] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
            if (~var7 != -1) {
                this.field220[1] = (this.field220[1] << 12) / var7;
                this.field220[0] = (this.field220[0] << 12) / var7;
                this.field220[2] = (this.field220[2] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class13() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field214;
        if (arg2 == -32513) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field218 = arg0.method339(-16777216);
                    }
                } else {
                    this.field221 = arg0.method339(-16777216);
                }
            } else {
                this.field224 = arg0.method339(-16777216);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            method126(43);
        }
        ++field228;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int var4 = class158.field2845 * this.field224 >> 12;
            int[] var5 = this.method797(0, class254.field4363 & arg1 + -1, (byte) 127);
            int[] var6 = this.method797(0, arg1, (byte) -28);
            int[] var7 = this.method797(0, class254.field4363 & arg1 + 1, (byte) 118);
            for (int var8 = 0; var8 < class106.field1862; ++var8) {
                int var9 = (var6[class110.field1937 & var8 + -1] - var6[var8 + 1 & class110.field1937]) * var4 >> 12;
                int var10 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = 255 & class45.field973[((var11 - -1) * var11 >> 1) + var12];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field220[0] * var15 >> 12;
                int var17 = this.field220[2] * var14 >> 12;
                int var18 = var10 * var13 >> 8;
                int var19 = this.field220[1] * var18 >> 12;
                var3[var8] = var16 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 != 31) {
            this.method121(true);
        }
        this.method121(false);
        ++field216;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Lji;")
    public static final class41 method125(int arg0, int arg1) {
        ++field225;
        class41 var2 = (class41) class141.field2468.method1549((long) arg0, 9447);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class76.field1441.method1645(true, 0, arg0);
            if (var3 == null) {
                return null;
            } else {
                class41 var4 = new class41();
                class32 var5 = new class32(var3);
                var5.field647 = var5.field644.length - 2;
                int var6 = var5.method339(-16777216);
                int var7 = var5.field644.length - (var6 + 12) + -2;
                var5.field647 = var7;
                int var8 = var5.method319((byte) -18);
                var4.field920 = var5.method339(-16777216);
                var4.field918 = var5.method339(-16777216);
                var4.field913 = var5.method339(-16777216);
                var4.field914 = var5.method339(-16777216);
                int var9 = var5.method316((byte) 120);
                if (var9 > 0) {
                    var4.field923 = new class69[var9];
                    for (int var10 = 0; ~var9 < ~var10; ++var10) {
                        int var11 = var5.method339(-16777216);
                        class69 var12 = new class69(class10.method114(var11, (byte) -121));
                        var4.field923[var10] = var12;
                        while (~(var11--) < -1) {
                            int var13 = var5.method319((byte) -18);
                            int var14 = var5.method319((byte) -18);
                            var12.method562(new class166(var14), (long) var13, (byte) 56);
                        }
                    }
                }
                var5.field647 = 0;
                var4.field919 = var5.method297(0);
                var4.field922 = new int[var8];
                var4.field924 = new int[var8];
                var4.field916 = new class237[var8];
                int var15 = 0;
                if (arg1 <= 108) {
                    method125(120, 102);
                }
                while (~var5.field647 > ~var7) {
                    int var16 = var5.method339(-16777216);
                    if (var16 == 3) {
                        var4.field916[var15] = var5.method324(1);
                    } else if (var16 < 100 && ~var16 != -22 && var16 != 38 && ~var16 != -40) {
                        var4.field924[var15] = var5.method319((byte) -18);
                    } else {
                        var4.field924[var15] = var5.method316((byte) -34);
                    }
                    var4.field922[var15++] = var16;
                }
                class141.field2468.method1552((byte) -112, var4, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "(I)V")
    public static void method126(int arg0) {
        field219 = null;
        field213 = null;
        field217 = null;
        field226 = null;
        int var1 = -17 % ((65 - arg0) / 53);
    }
}
