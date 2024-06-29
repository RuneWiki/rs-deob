import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Hashtable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public abstract class class10 {

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    private int field109 = 4;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
    private int field113 = 4;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
    private int field114 = 0;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "[S")
    private short[] field112 = new short[512];

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
    private int field120 = 4;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public int field116 = 4;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field111 = new Hashtable();

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    public static int field118 = 0;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "[I")
    public static int[] field121 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "[I")
    public static int[] field117 = new int[128];

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
    public static int field122;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hba", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field124;

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "[I")
    public static int[] field123;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "[S")
    private short[] field119;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public static void method66(int arg0) {
        field111 = null;
        field117 = null;
        field121 = null;
        field123 = null;
        if (arg0 != -123) {
            field111 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BLjava/awt/Component;Z)Lmo;")
    public static final class779 method67(byte arg0, Component arg1, boolean arg2) {
        field107++;
        try {
            if (arg0 == -127) {
                Constructor var3 = Class.forName("cba").getDeclaredConstructor(field124 == null ? (field124 = method74("java.awt.Component")) : field124, Boolean.TYPE);
                return (class779) var3.newInstance(arg1, Boolean.valueOf(arg2));
            } else {
                return null;
            }
        } catch (Throwable var4) {
            return new class252(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
    public abstract void method68(int arg0);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIZI)V")
    public final void method69(int arg0, int arg1, boolean arg2, int arg3) {
        field115++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method68(122);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field116; var14++) {
                        int var15 = this.field119[var14] << 12;
                        int var16 = this.field120 * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field113 * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field109 * var15 >> 12;
                        int var22 = this.field109 * var20;
                        int var23 = this.field113 * var17;
                        int var24 = this.field120 * var18;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var23 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var26 >= var16) {
                            var33 = 0;
                        } else {
                            var33 = var26 & 0xFF;
                        }
                        int var34;
                        if (var29 < var21) {
                            var34 = var29 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36;
                        if (var32 >= var19) {
                            var36 = 0;
                        } else {
                            var36 = var32 & 0xFF;
                        }
                        int var37 = var30 & 0xFF;
                        int var38 = var23 & 0xFFF;
                        int var39 = var24 & 0xFFF;
                        int var40 = var39 - 4096;
                        int var41 = class80.field1100[var38];
                        short var42 = this.field112[var37];
                        int var43 = class80.field1100[var39];
                        int var44 = var35 - 4096;
                        short var45 = this.field112[var36];
                        int var46 = class80.field1100[var35];
                        int var47 = var38 - 4096;
                        short var48 = this.field112[var31 + var42];
                        short var49 = this.field112[var34 + var45];
                        short var50 = this.field112[var31 + var45];
                        short var51 = this.field112[var34 + var42];
                        int var52 = class357.method2265(this.field112[var28 + var48], var35, (byte) 112, var39, var38);
                        int var53 = class357.method2265(this.field112[var33 + var48], var35, (byte) 112, var40, var38);
                        int var54 = ((var53 - var52) * var43 >> 12) + var52;
                        int var55 = class357.method2265(this.field112[var28 + var51], var44, (byte) 112, var39, var38);
                        int var56 = class357.method2265(this.field112[var33 + var51], var44, (byte) 112, var40, var38);
                        int var57 = ((var56 - var55) * var43 >> 12) + var55;
                        int var58 = ((var57 - var54) * var46 >> 12) + var54;
                        int var59 = class357.method2265(this.field112[var28 + var50], var35, (byte) 112, var39, var47);
                        int var60 = class357.method2265(this.field112[var33 + var50], var35, (byte) 112, var40, var47);
                        int var61 = ((var60 - var59) * var43 >> 12) + var59;
                        int var62 = class357.method2265(this.field112[var28 + var49], var44, (byte) 112, var39, var47);
                        int var63 = class357.method2265(this.field112[var33 + var49], var44, (byte) 112, var40, var47);
                        int var64 = ((var63 - var62) * var43 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var46 >> 12);
                        this.method73(var14, ((var65 - var58) * var41 >> 12) + var58, (byte) -72);
                    }
                    this.method70((byte) -20);
                }
            }
        }
        if (!arg2) {
            method67((byte) -16, null, true);
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
    public abstract void method70(byte arg0);

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
    private final void method71(int arg0) {
        if (arg0 > -80) {
            method66(-7);
        }
        field108++;
        Random var2 = new Random((long) this.field114);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field112[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class594.method3335(var5, false, var2);
            short var7 = this.field112[var6];
            this.field112[var6] = this.field112[var5];
            this.field112[var5] = this.field112[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)V")
    private final void method72(byte arg0) {
        field122++;
        int var2 = -116 % ((arg0 - 35) / 57);
        this.field119 = new short[this.field116];
        for (int var3 = 0; var3 < this.field116; var3++) {
            this.field119[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIB)V")
    public abstract void method73(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(IIIII)V")
    public class10(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field114 = arg0;
        this.field109 = arg3;
        this.field116 = arg1;
        this.field113 = arg4;
        this.field120 = arg2;
        this.method72((byte) -34);
        this.method71(-85);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method74(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        for (int var0 = 0; var0 < field117.length; var0++) {
            field117[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field117[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field117[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field117[var3] = var3 + 52 - 48;
        }
        field117[45] = field117[47] = 63;
        field117[42] = field117[43] = 62;
    }
}
