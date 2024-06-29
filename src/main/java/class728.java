import java.io.File;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class728 {

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    private int field10147 = 4;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public int field10148 = 4;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    private int field10151 = 0;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    private int field10155 = 4;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "[S")
    private short[] field10152 = new short[512];

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    private int field10162 = 4;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "Lsv;")
    public static class570 field10156 = new class570(29, 2);

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "[I")
    public static int[] field10158 = new int[2];

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Z")
    public static boolean field10157 = false;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field10160 = 0;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field10163 = 0;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field10149;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field10150;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field10153;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field10159;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field10161;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field10164;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[Lrs;")
    public static class730[] field10154;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "[S")
    private short[] field10143;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLha;Luf;II)V")
    public static final void method4041(byte arg0, class475 arg1, class519 arg2, int arg3, int arg4) {
        field10161++;
        byte var5 = 63;
        byte var6 = 7;
        for (int var7 = 63; var7 >= 0; var7--) {
            class588.method3450(false, (byte) -6, true);
            int var8 = var6 & 0x7 << 7 | var7 << 10 & 0xFC00 | var5 & 0x7F;
            int var9 = class789.field10788[var8];
            class511.method2982(0, true, false);
            arg1.method436(arg3, ((63 - var7) * arg2.field7255 >> 6) + arg4, arg2.field7128, (arg2.field7255 >> 6) + 1, var9, 0);
        }
        if (arg0 < 103) {
            field10158 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZII)V")
    public abstract void method1672(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public abstract void method1671(int arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    private final void method4042(byte arg0) {
        field10150++;
        Random var2 = new Random((long) this.field10151);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field10152[var3] = (short) var3;
        }
        int var4 = -101 % ((-arg0 - 34) / 42);
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = method4047(116, var6, var2);
            short var8 = this.field10152[var7];
            this.field10152[var7] = this.field10152[var6];
            this.field10152[var6] = this.field10152[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public abstract void method1673(int arg0);

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public static void method4043(int arg0) {
        field10154 = null;
        int var1 = 53 % ((arg0 + 66) / 50);
        field10158 = null;
        field10156 = null;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)Leu;")
    public static final class201 method4044(byte arg0) {
        field10145++;
        try {
            return new class175();
        } catch (Throwable var2) {
            try {
                return (class201) Class.forName("pn").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                if (arg0 >= -90) {
                    method4044((byte) -90);
                }
                return new class462();
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/io/File;Z)V")
    public static final void method4045(byte arg0, File arg1, boolean arg2) {
        field10153++;
        if (class595.field8509 == null) {
            class687.method3880(true);
        }
        int var3 = 67 / ((arg0 + 61) / 56);
        try {
            Class var4 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var5 = var4.getDeclaredMethod("dumpHeap", field10164 == null ? (field10164 = method4049("java.lang.String")) : field10164, Boolean.TYPE);
            var5.invoke(class595.field8509, arg1.getAbsolutePath(), Boolean.valueOf(arg2));
        } catch (Exception var7) {
            System.out.println("HeapDump error:");
            var7.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V")
    public final void method4046(int arg0, int arg1, int arg2, int arg3) {
        field10144++;
        if (arg1 != -4995) {
            this.method4046(17, -121, -21, -75);
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var7[var10] = (var10 << 12) / arg3;
        }
        this.method1673(arg1 + 4879);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field10148; var14++) {
                        int var15 = this.field10143[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = this.field10147 * var15 >> 12;
                        int var18 = this.field10162 * var15 >> 12;
                        int var19 = this.field10155 * var15 >> 12;
                        int var20 = var7[var11] * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field10162 * var16;
                        int var23 = this.field10147 * var20;
                        int var24 = this.field10155 * var21;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var29 >= var19) {
                            var33 = 0;
                        } else {
                            var33 = var29 & 0xFF;
                        }
                        int var34 = var24 & 0xFFF;
                        int var35 = var31 & 0xFF;
                        int var36 = var23 & 0xFFF;
                        int var37;
                        if (var17 <= var32) {
                            var37 = 0;
                        } else {
                            var37 = var32 & 0xFF;
                        }
                        int var38 = var22 & 0xFFF;
                        int var39;
                        if (var26 >= var18) {
                            var39 = 0;
                        } else {
                            var39 = var26 & 0xFF;
                        }
                        short var40 = this.field10152[var37];
                        int var41 = var38 - 4096;
                        int var42 = class741.field10259[var34];
                        int var43 = class741.field10259[var38];
                        short var44 = this.field10152[var35];
                        int var45 = class741.field10259[var36];
                        int var46 = var36 - 4096;
                        int var47 = var34 - 4096;
                        short var48 = this.field10152[var30 + var40];
                        short var49 = this.field10152[var33 + var40];
                        short var50 = this.field10152[var30 + var44];
                        short var51 = this.field10152[var33 + var44];
                        int var52 = class368.method2199(arg1 ^ 0xFFFFFC7D, this.field10152[var28 + var50], var36, var38, var34);
                        int var53 = class368.method2199(arg1 ^ 0xFFFFFC7D, this.field10152[var39 + var50], var36, var41, var34);
                        int var54 = ((var53 - var52) * var43 >> 12) + var52;
                        int var55 = class368.method2199(4096, this.field10152[var28 + var51], var36, var38, var47);
                        int var56 = class368.method2199(4096, this.field10152[var39 + var51], var36, var41, var47);
                        int var57 = ((var56 - var55) * var43 >> 12) + var55;
                        int var58 = ((var57 - var54) * var42 >> 12) + var54;
                        int var59 = class368.method2199(arg1 + 9091, this.field10152[var28 - -var48], var46, var38, var34);
                        int var60 = class368.method2199(4096, this.field10152[var39 + var48], var46, var41, var34);
                        int var61 = var59 + ((var60 - var59) * var43 >> 12);
                        int var62 = class368.method2199(4096, this.field10152[var28 + var49], var46, var38, var47);
                        int var63 = class368.method2199(4096, this.field10152[var39 + var49], var46, var41, var47);
                        int var64 = var62 + ((var63 - var62) * var43 >> 12);
                        int var65 = ((var64 - var61) * var42 >> 12) + var61;
                        this.method1672(true, var14, ((var65 - var58) * var45 >> 12) + var58);
                    }
                    this.method1671(-54);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method4047(int arg0, int arg1, Random arg2) {
        field10159++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class362.method2181(arg1, -1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            if (arg0 < 114) {
                return 118;
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class381.method2295(27328, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
    private final void method4048(int arg0) {
        this.field10143 = new short[this.field10148];
        field10146++;
        for (int var2 = 0; var2 < this.field10148; var2++) {
            this.field10143[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 1159653420) {
            this.field10147 = -74;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIII)V")
    public class728(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10148 = arg1;
        this.field10155 = arg3;
        this.field10147 = arg4;
        this.field10162 = arg2;
        this.field10151 = arg0;
        this.method4048(1159653420);
        this.method4042((byte) 72);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4049(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
