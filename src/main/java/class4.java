import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int field55 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
    public boolean field50 = true;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public int field57 = -1;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public int field60 = -1;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Llc;")
    public static class143 field53 = class66.method374("Chargement des interfaces )2 ", -1);

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lng;")
    public static class139 field61 = new class139(100);

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field63 = 0;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Lq;")
    public static class81 field62;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static final void method13(byte arg0) {
        field51++;
        if (class254.field4552 == -1 || class70.field1333 == -1) {
            return;
        }
        int var1 = ((class226.field4093 - class141.field2461) * class176.field3149 >> 16) + class141.field2461;
        class176.field3149 += var1;
        int var2 = class254.field4551 * 2;
        if (class176.field3149 < 65535) {
            class70.field1340 = false;
            class185.field3362 = false;
        } else {
            if (class185.field3362) {
                class70.field1340 = false;
            } else {
                class70.field1340 = true;
            }
            class176.field3149 = 65535;
            class185.field3362 = true;
        }
        if (arg0 != -123) {
            field61 = null;
        }
        float[] var3 = new float[3];
        float var4 = (float) class176.field3149 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class48.field939[class254.field4552][var2 + 1][var5] * 3;
            int var22 = class48.field939[class254.field4552][var2][var5] * 3;
            int var23 = class48.field939[class254.field4552][var2][var5];
            int var24 = (class48.field939[class254.field4552][var2 + 2][var5] + class48.field939[class254.field4552][var2 + 2][var5] - class48.field939[class254.field4552][var2 + 3][var5]) * 3;
            int var25 = var21 - var22;
            int var26 = var22 + var24 - (var21 * 2);
            int var27 = class48.field939[class254.field4552][var2 + 2][var5] - (var23 + var24 - var21);
            var3[var5] = (((float) var27 * var4 + (float) var26) * var4 + (float) var25) * var4 + (float) var23;
        }
        class92.field1658 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        class167.field2992 = (int) var3[0] - (class148.field2733 * 128);
        class154.field2776 = (int) var3[2] - (class141.field2466 * 128);
        int var7 = class245.field4397 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class48.field939[class70.field1333][var7][var8] * 3;
            int var15 = class48.field939[class70.field1333][var7 + 1][var8] * 3;
            int var16 = (class48.field939[class70.field1333][var7 + 2][var8] - (class48.field939[class70.field1333][var7 + 3][var8] - class48.field939[class70.field1333][var7 + 2][var8])) * 3;
            int var17 = class48.field939[class70.field1333][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class48.field939[class70.field1333][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var4 + (float) var19) * var4 + (float) var18) * var4 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = var6[2] - var3[2];
        float var11 = (var6[1] - var3[1]) * -1.0F;
        double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
        class235.field4289 = (float) Math.atan2((double) var11, var12);
        class129.field2279 = -((float) Math.atan2((double) var9, (double) var10));
        class163.field2925 = (int) ((double) class235.field4289 * 325.949D) & 0x7FF;
        class148.field2729 = (int) ((double) class129.field2279 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Llc;I)V")
    public static final void method14(class143 arg0, int arg1) {
        field58++;
        if (class120.field2113 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method874(7);
        if (var3 == 0L) {
            return;
        }
        while (class120.field2113.length > var2 && class120.field2113[var2].field1162 != var3) {
            var2++;
        }
        int var5 = -55 % ((arg1 + 5) / 38);
        if (class120.field2113.length > var2 && class120.field2113[var2] != null) {
            class50.field1003++;
            class285.field5010.method799(103, 207);
            class285.field5010.method1243(class120.field2113[var2].field1162, 107);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method15(int arg0) {
        field53 = null;
        field61 = null;
        field62 = null;
        if (arg0 != 5869) {
            method13((byte) -64);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)V")
    public static final void method16(int arg0, byte arg1) {
        if (arg1 == -68) {
            field54++;
            class166 var2 = class262.method1746(91, arg0, 7);
            var2.method1098((byte) -119);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILh;I)V")
    public final void method17(int arg0, class190 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1265(123);
            if (var4 == 0) {
                field56++;
                if (arg2 != 3) {
                    this.field57 = 60;
                    return;
                }
                return;
            }
            this.method18(var4, arg0, arg1, arg2 ^ 0xFFFFE1E7);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILh;I)V")
    private final void method18(int arg0, int arg1, class190 arg2, int arg3) {
        field59++;
        if (arg0 == 1) {
            this.field55 = class251.method1666((byte) -58, arg2.method1282(113));
        } else if (arg0 == 2) {
            this.field57 = arg2.method1265(122);
        } else if (arg0 == 3) {
            this.field57 = arg2.method1275(arg3 ^ 0xFFFFE164);
            if (this.field57 == 65535) {
                this.field57 = -1;
            }
        } else if (arg0 == 5) {
            this.field50 = false;
        } else if (arg0 == 7) {
            this.field60 = class251.method1666((byte) -58, arg2.method1282(arg3 + 7831));
        } else if (arg0 == 8) {
            class95.field1742 = arg1;
        } else if (arg0 == 9) {
            arg2.method1275(128);
        } else if (arg0 != 10) {
            if (arg0 == 11) {
                arg2.method1265(125);
            } else if (arg0 != 12) {
                if (arg0 == 13) {
                    arg2.method1282(107);
                } else if (arg0 == 14) {
                    arg2.method1265(arg3 + 7828);
                }
            }
        }
        if (arg3 != -7708) {
            this.method17(-79, (class190) null, 61);
        }
    }
}
