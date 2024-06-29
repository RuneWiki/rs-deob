import java.awt.event.ActionEvent;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class23 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public int field419 = 4;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    private int field421 = 0;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "[S")
    private short[] field429 = new short[512];

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    private int field431 = 4;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    private int field427 = 4;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    private int field428 = 4;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Lok;")
    public static class146 field430 = class235.method1724(-12908, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "[I")
    public static int[] field424;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[S")
    private short[] field423;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIBI)V", line = 13)
    public final void method158(int arg0, int arg1, byte arg2, int arg3) {
        field422++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg0];
        if (arg2 != -29) {
            return;
        }
        for (int var7 = 0; var7 < arg0; var7++) {
            var6[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg1];
        for (int var9 = 0; var9 < arg3; var9++) {
            var5[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var8[var10] = (var10 << 12) / arg1;
        }
        this.method161((byte) -107);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field419; var14++) {
                        int var15 = this.field423[var14] << 12;
                        int var16 = this.field427 * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = var5[var12] * var15 >> 12;
                        int var19 = this.field428 * var15 >> 12;
                        int var20 = this.field428 * var17;
                        int var21 = var20 >> 12;
                        int var22 = var6[var13] * var15 >> 12;
                        int var23 = this.field431 * var22;
                        int var24 = var21 + 1;
                        int var25 = this.field427 * var18;
                        int var26;
                        if (var24 < var19) {
                            var26 = var24 & 0xFF;
                        } else {
                            var26 = 0;
                        }
                        int var27 = var21 & 0xFF;
                        short var28 = this.field429[var27];
                        int var29 = var25 >> 12;
                        int var30 = var29 + 1;
                        int var31 = var25 & 0xFFF;
                        int var32 = this.field431 * var15 >> 12;
                        int var33;
                        if (var16 > var30) {
                            var33 = var30 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var20 & 0xFFF;
                        int var35 = var29 & 0xFF;
                        short var36 = this.field429[var28 + var35];
                        int var37 = var23 >> 12;
                        short var38 = this.field429[var28 + var33];
                        int var39 = var23 & 0xFFF;
                        int var40 = var37 + 1;
                        int var41;
                        if (var40 >= var32) {
                            var41 = 0;
                        } else {
                            var41 = var40 & 0xFF;
                        }
                        int var42 = class261.field4335[var34];
                        int var43 = var31 - 4096;
                        int var44 = var34 - 4096;
                        int var45 = var37 & 0xFF;
                        int var46 = var39 - 4096;
                        short var47 = this.field429[var26];
                        short var48 = this.field429[var33 + var47];
                        short var49 = this.field429[var35 + var47];
                        int var50 = class261.field4335[var31];
                        int var51 = class261.field4335[var39];
                        int var52 = class22.method156(this.field429[var36 + var45], var39, var34, (byte) 38, var31);
                        int var53 = class22.method156(this.field429[var41 + var36], var46, var34, (byte) 38, var31);
                        int var54 = var52 + ((var53 - var52) * var51 >> 12);
                        int var55 = class22.method156(this.field429[var38 + var45], var39, var34, (byte) 38, var43);
                        int var56 = class22.method156(this.field429[var41 + var38], var46, var34, (byte) 38, var43);
                        int var57 = ((var56 - var55) * var51 >> 12) + var55;
                        int var58 = ((var57 - var54) * var50 >> 12) + var54;
                        int var59 = class22.method156(this.field429[var45 + var49], var39, var44, (byte) 38, var31);
                        int var60 = class22.method156(this.field429[var41 + var49], var46, var44, (byte) 38, var31);
                        int var61 = ((var60 - var59) * var51 >> 12) + var59;
                        int var62 = class22.method156(this.field429[var45 + var48], var39, var44, (byte) 38, var43);
                        int var63 = class22.method156(this.field429[var41 + var48], var46, var44, (byte) 38, var43);
                        int var64 = ((var63 - var62) * var51 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var50 >> 12);
                        this.method162(var58 + ((var65 - var58) * var42 >> 12), var14, (byte) -113);
                    }
                    this.method166(-32204);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 178)
    public static void method159(boolean arg0) {
        if (!arg0) {
            field430 = null;
            field424 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)V", line = 192)
    public static final void method160(byte arg0, int arg1, int arg2) {
        class79 var3 = class150.method1186(arg1, 55);
        field420++;
        int var4 = var3.field1260;
        if (arg0 < 27) {
            return;
        }
        int var5 = var3.field1261;
        int var6 = var3.field1262;
        int var7 = client.field4069[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class182.method1442(class202.field3372[var4] & ~var8 | arg2 << var5 & var8, var4, (byte) -93);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(IIIII)V", line = 350)
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field419 = arg1;
        this.field431 = arg2;
        this.field428 = arg4;
        this.field427 = arg3;
        this.field421 = arg0;
        this.method164(15142);
        this.method163((byte) -68);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V", line = 229)
    private final void method163(byte arg0) {
        field425++;
        Random var2 = new Random((long) this.field421);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field429[var3] = (short) var3;
        }
        int var4 = -116 / ((31 - arg0) / 47);
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class9.method66(-482656096, var6, var2);
            short var8 = this.field429[var7];
            this.field429[var7] = this.field429[var6];
            this.field429[var6] = this.field429[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 270)
    private final void method164(int arg0) {
        if (arg0 != 15142) {
            this.field427 = 1;
        }
        field432++;
        this.field423 = new short[this.field419];
        for (int var2 = 0; var2 < this.field419; var2++) {
            this.field423[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lml;Ljava/lang/Object;B)V", line = 293)
    public static final void method165(class129 arg0, Object arg1, byte arg2) {
        if (arg2 > -86) {
            field418 = 88;
        }
        field426++;
        if (arg0.field2158 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2158.peekEvent() != null; var3++) {
            class281.method2041((byte) 119, 1L);
        }
        if (arg1 != null) {
            arg0.field2158.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public abstract void method161(byte arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIB)V")
    public abstract void method162(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public abstract void method166(int arg0);
}
