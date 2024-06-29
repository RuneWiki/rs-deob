import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class350 {

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    private int field5060 = 0;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    private int field5061 = 4;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    private int field5058 = 4;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field5067 = 4;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    private int field5066 = 4;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[S")
    private short[] field5070 = new short[512];

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field5065 = 0;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
    public static int[] field5063 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field5069 = 765;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[S")
    private short[] field5059;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public abstract void method1498(boolean arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
    public static final void method2184(int arg0, boolean arg1) {
        field5057++;
        class29.field390 = 0;
        if (arg0 != -1004525076) {
            method2189(23, 78, -56, (Class) null);
        }
        class94.field1202 = 0;
        class163.method1023(33);
        class102.method571(arg1, 1);
        class92.method526((byte) -105);
        for (int var2 = 0; var2 < class29.field390; var2++) {
            int var4 = class262.field3842[var2];
            if (class353.field5090 != class139.field1851[var4].field2144) {
                if (class139.field1851[var4].field3232.method2744(110)) {
                    class451.method2631(1721537889, class139.field1851[var4]);
                }
                class139.field1851[var4].method1386(arg0 ^ 0x3BDF9E3D, (class466) null);
                class139.field1851[var4] = null;
            }
        }
        if (class382.field5447 != class345.field5016.field4021) {
            throw new RuntimeException("gnp1 pos:" + class345.field5016.field4021 + " psize:" + class382.field5447);
        }
        for (int var3 = 0; var3 < class225.field3418; var3++) {
            if (class139.field1851[class281.field4139[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class225.field3418);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method2185(int arg0) {
        field5063 = null;
        int var1 = -76 % ((arg0 - 41) / 59);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    private final void method2186(int arg0) {
        field5064++;
        this.field5059 = new short[this.field5067];
        for (int var2 = 0; var2 < this.field5067; var2++) {
            this.field5059[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 6143) {
            this.method1502(-4);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIII)V")
    public final void method2187(byte arg0, int arg1, int arg2, int arg3) {
        field5068++;
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        if (arg0 <= 16) {
            this.method2186(-120);
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method1498(true);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field5067; var14++) {
                        int var15 = this.field5059[var14] << 12;
                        int var16 = this.field5061 * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = this.field5058 * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = this.field5066 * var15 >> 12;
                        int var22 = this.field5066 * var20;
                        int var23 = this.field5061 * var19;
                        int var24 = this.field5058 * var17;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var24 >> 12;
                        int var31 = var28 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var29 < var16) {
                            var33 = var29 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34;
                        if (var32 >= var18) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35 = var30 & 0xFF;
                        int var36;
                        if (var21 <= var26) {
                            var36 = 0;
                        } else {
                            var36 = var26 & 0xFF;
                        }
                        int var37 = var22 & 0xFFF;
                        int var38 = var23 & 0xFFF;
                        int var39 = var24 & 0xFFF;
                        int var40 = class348.field5031[var37];
                        int var41 = class348.field5031[var38];
                        int var42 = var38 - 4096;
                        int var43 = var39 - 4096;
                        int var44 = class348.field5031[var39];
                        short var45 = this.field5070[var35];
                        short var46 = this.field5070[var34];
                        int var47 = var37 - 4096;
                        short var48 = this.field5070[var33 + var46];
                        short var49 = this.field5070[var31 + var46];
                        short var50 = this.field5070[var31 + var45];
                        short var51 = this.field5070[var33 + var45];
                        int var52 = class453.method2668(var37, var39, var38, -108, this.field5070[var27 + var50]);
                        int var53 = class453.method2668(var47, var39, var38, -108, this.field5070[var36 + var50]);
                        int var54 = var52 + ((var53 - var52) * var40 >> 12);
                        int var55 = class453.method2668(var37, var39, var42, -108, this.field5070[var27 + var51]);
                        int var56 = class453.method2668(var47, var39, var42, -108, this.field5070[var36 + var51]);
                        int var57 = ((var56 - var55) * var40 >> 12) + var55;
                        int var58 = class453.method2668(var37, var43, var38, -108, this.field5070[var27 + var49]);
                        int var59 = ((var57 - var54) * var41 >> 12) + var54;
                        int var60 = class453.method2668(var47, var43, var38, -108, this.field5070[var36 + var49]);
                        int var61 = ((var60 - var58) * var40 >> 12) + var58;
                        int var62 = class453.method2668(var37, var43, var42, -108, this.field5070[var27 + var48]);
                        int var63 = class453.method2668(var47, var43, var42, -108, this.field5070[var36 + var48]);
                        int var64 = ((var63 - var62) * var40 >> 12) + var62;
                        int var65 = ((var64 - var61) * var41 >> 12) + var61;
                        this.method1500((byte) -62, var14, ((var65 - var59) * var44 >> 12) + var59);
                    }
                    this.method1502(-36);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    private final void method2188(int arg0) {
        field5062++;
        Random var2 = new Random((long) this.field5060);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field5070[var3] = (short) var3;
        }
        if (arg0 != 4) {
            field5069 = -56;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class351.method2194(-119, var2, var5);
            short var7 = this.field5070[var6];
            this.field5070[var6] = this.field5070[var5];
            this.field5070[var5] = this.field5070[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    public abstract void method1502(int arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V")
    public abstract void method1500(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method2189(int arg0, int arg1, int arg2, Class arg3) {
        class88 var4 = class330.field4786[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class93 var5 = var4.field1068; var5 != null; var5 = var5.field1178) {
            class304 var6 = var5.field1177;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4330 == arg1 && var6.field4324 == arg2) {
                class363.method2244(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIII)V")
    public class350(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5066 = arg2;
        this.field5060 = arg0;
        this.field5061 = arg3;
        this.field5067 = arg1;
        this.field5058 = arg4;
        this.method2186(6143);
        this.method2188(4);
    }
}
