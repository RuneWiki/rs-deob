import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class227 extends class248 {

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "[Lhj;")
    public class147[] field3820;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "[J")
    public static long[] field3823 = new long[100];

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Le;")
    public static class86 field3824 = new class86();

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field3825 = 0;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3826 = new CRC32();

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field3828 = 2;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "Lij;")
    private static class50 field3829 = class78.method578(126, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "Lij;")
    public static class50 field3827 = field3829;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field3830 = 0;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z")
    public final boolean method1551(int arg0, int arg1) {
        field3818++;
        if (arg0 != 2) {
            method1553(0);
        }
        return this.field3820[arg1].field2532;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B[B)V")
    public static final void method1552(byte arg0, byte[] arg1) {
        if (arg0 != -19) {
            method1555(-95, 88);
        }
        field3822++;
        int var2 = 0;
        while (true) {
            while (var2 < arg1.length) {
                int var3 = arg1[var2++] * 64 - class90.field1714;
                int var4 = arg1[var2++] * 64 - class46.field847;
                if (var3 > 0 && var4 > 0 && (var3 + 64) < class155.field2701 && (var4 + 64) < class140.field2460) {
                    int var5 = var3 >> 6;
                    int var6 = class140.field2460 - (var4 + 1) >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if ((var9 & 0x1) == 1) {
                                    byte var10 = arg1[var2++];
                                    if (class237.field4012[var5][var6] == null) {
                                        class237.field4012[var5][var6] = new byte[4096];
                                    }
                                    class237.field4012[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) var10;
                                }
                                if ((var9 & 0x2) == 2) {
                                    byte var11 = arg1[var2++];
                                    if (class153.field2679[var5][var6] == null) {
                                        class153.field2679[var5][var6] = new byte[4096];
                                    }
                                    class153.field2679[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) (var11 - 28);
                                }
                                if ((var9 & 0x4) == 4) {
                                    var2 += 3;
                                    int var12 = ((arg1[var2 - 3] & 0xFF) << 16) + ((arg1[var2 - 2] & 0xFF) << 8) + (arg1[var2 + -1] & 0xFF);
                                    if (class210.field3483[var5][var6] == null) {
                                        class210.field3483[var5][var6] = new int[4096];
                                    }
                                    var12--;
                                    class243 var13 = class53.method426((byte) -90, var12);
                                    if (var13.field4197 != null) {
                                        var13 = var13.method1645(arg0 ^ 0xFFFFFFB7);
                                        if (var13 == null || var13.field4179 == -1) {
                                            continue;
                                        }
                                    }
                                    class210.field3483[var5][var6][(-(var8 + 1) << 6) + var7] = var13.field4200 + 1;
                                    class1 var14 = new class1();
                                    var14.field9 = var3;
                                    var14.field8 = class140.field2460 - var4;
                                    var14.field4 = var13.field4179;
                                    class101.field1863.method684(var14, (byte) 109);
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < 64; var15++) {
                        for (int var16 = -64; var16 < 0; var16++) {
                            byte var17 = arg1[var2++];
                            if (var17 != 0) {
                                if ((var17 & 0x1) == 1) {
                                    var2++;
                                }
                                if ((var17 & 0x2) == 2) {
                                    var2++;
                                }
                                if ((var17 & 0x4) == 4) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public static void method1553(int arg0) {
        if (arg0 != 32640) {
            method1552((byte) 38, (byte[]) null);
        }
        field3823 = null;
        field3829 = null;
        field3824 = null;
        field3826 = null;
        field3827 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static final void method1554(byte arg0) {
        field3819++;
        client.field1524.method762((byte) 117);
        class188.field3107.method762((byte) 117);
        if (arg0 <= 40) {
            field3827 = null;
        }
        class20.field416.method762((byte) 117);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
    public static final void method1555(int arg0, int arg1) {
        field3817++;
        class99 var2 = (class99) class90.field1716.method443((long) arg0, (byte) -84);
        if (var2 != null) {
            if (arg1 != 2) {
                method1552((byte) -85, (byte[]) null);
            }
            var2.method267(-42);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lda;Lda;IZ)V")
    public class227(class22 arg0, class22 arg1, int arg2, boolean arg3) {
        class86 var5 = new class86();
        int var6 = arg0.method180(false, arg2);
        this.field3820 = new class147[var6];
        int[] var7 = arg0.method178(arg2, true);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method190((byte) -39, var7[var8], arg2);
            class94 var10 = null;
            int var11 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            for (class94 var12 = (class94) var5.method689(1001); var12 != null; var12 = (class94) var5.method688(-31)) {
                if (var12.field1758 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method174(var11, 0, 145);
                } else {
                    var13 = arg1.method174(0, var11, 145);
                }
                var10 = new class94(var11, var13);
                var5.method684(var10, (byte) 109);
            }
            this.field3820[var7[var8]] = new class147(var9, var10);
        }
    }
}
