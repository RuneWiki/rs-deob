import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class281 {

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "[I")
    private int[] field4358;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "[I")
    private int[] field4362;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field4357 = 0;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    private int field4355;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    private int field4359;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    private int field4367;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    private int field4368;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "[[Lgj;")
    public static class245[][] field4365;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 17)
    private final void method2005(boolean arg0) {
        if (arg0) {
            this.field4358 = (int[]) null;
        }
        field4360++;
        this.field4367 += ++this.field4355;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4358[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field4359 ^= this.field4359 << 13;
                } else {
                    this.field4359 ^= this.field4359 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field4359 ^= this.field4359 << 2;
            } else {
                this.field4359 ^= this.field4359 >>> 16;
            }
            this.field4359 += this.field4358[var2 + 128 & 0xFF];
            int var4;
            this.field4358[var2] = var4 = this.field4367 + this.field4358[class229.method1613(1020, var3) >> 2] + this.field4359;
            this.field4362[var2] = this.field4367 = this.field4358[class229.method1613(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Llc;I)V", line = 68)
    public static final void method2006(class175 arg0, int arg1) {
        class149.field2064 = arg0.method1179((byte) -98, "p11_full");
        if (arg1 < 110) {
            return;
        }
        field4361++;
        class175.field2524 = arg0.method1179((byte) 20, "p12_full");
        class313.field4843 = arg0.method1179((byte) -121, "b12_full");
        class175.field2506 = arg0.method1179((byte) -120, "mapfunction");
        class336.field5197 = arg0.method1179((byte) 43, "hitmarks");
        class208.field2957 = arg0.method1179((byte) 101, "hitbar_default");
        class19.field244 = arg0.method1179((byte) -110, "headicons_pk");
        class162.field2244 = arg0.method1179((byte) 106, "headicons_prayer");
        class325.field4985 = arg0.method1179((byte) -115, "hint_headicons");
        class91.field1139 = arg0.method1179((byte) 113, "hint_mapmarkers");
        class326.field4992 = arg0.method1179((byte) -124, "mapflag");
        class264.field4157 = arg0.method1179((byte) -121, "cross");
        class264.field4168 = arg0.method1179((byte) 65, "mapdots");
        class10.field139 = arg0.method1179((byte) 90, "scrollbar");
        class29.field368 = arg0.method1179((byte) 125, "name_icons");
        class130.field1791 = arg0.method1179((byte) -104, "floorshadows");
        class43.field511 = arg0.method1179((byte) 114, "compass");
        class25.field340 = arg0.method1179((byte) 34, "hint_mapedge");
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 104)
    private final void method2007(int arg0) {
        field4366++;
        if (arg0 > -62) {
            this.field4362 = (int[]) null;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var12 ^ var7 >>> 2;
            int var14 = var5 + var13;
            int var15 = var6 + var11;
            int var16 = var7 + var15;
            int var17 = var16 ^ var15 << 8;
            int var18 = var14 + var15;
            int var19 = var4 + var17;
            var6 = var18 ^ var14 >>> 16;
            int var20 = var14 + var19;
            var5 = var20 ^ var19 << 10;
            int var21 = var2 + var5;
            int var22 = var3 + var6;
            int var23 = var19 + var22;
            var4 = var23 ^ var22 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var22;
            var3 = var25 ^ var21 << 8;
            var8 = var3 + var13;
            int var26 = var21 + var24;
            var2 = var26 ^ var24 >>> 9;
            var9 = var8 + var24;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field4362[var27 + 6] + var3;
            int var29 = this.field4362[var27 + 1] + var8;
            int var30 = this.field4362[var27 + 5] + var4;
            int var31 = this.field4362[var27 + 4] + var5;
            int var32 = this.field4362[var27 + 7] + var2;
            int var33 = this.field4362[var27 + 3] + var6;
            int var34 = this.field4362[var27 + 2] + var7;
            int var35 = this.field4362[var27] + var9;
            int var36 = var35 ^ var29 << 11;
            int var37 = var29 + var34;
            int var38 = var37 ^ var34 >>> 2;
            int var39 = var31 + var38;
            int var40 = var33 + var36;
            int var41 = var34 + var40;
            int var42 = var41 ^ var40 << 8;
            int var43 = var30 + var42;
            int var44 = var39 + var40;
            var6 = var44 ^ var39 >>> 16;
            int var45 = var39 + var43;
            int var46 = var6 + var28;
            var5 = var45 ^ var43 << 10;
            int var47 = var43 + var46;
            int var48 = var5 + var32;
            var4 = var47 ^ var46 >>> 4;
            int var49 = var4 + var36;
            int var50 = var46 + var48;
            var3 = var50 ^ var48 << 8;
            int var51 = var48 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var42;
            var8 = var3 + var38;
            var9 = var8 + var49;
            this.field4358[var27] = var9;
            this.field4358[var27 + 1] = var8;
            this.field4358[var27 + 2] = var7;
            this.field4358[var27 + 3] = var6;
            this.field4358[var27 + 4] = var5;
            this.field4358[var27 + 5] = var4;
            this.field4358[var27 + 6] = var3;
            this.field4358[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field4358[var52 + 3] + var6;
            int var54 = this.field4358[var52 + 4] + var5;
            int var55 = this.field4358[var52 + 5] + var4;
            int var56 = this.field4358[var52 + 6] + var3;
            int var57 = this.field4358[var52 + 1] + var8;
            int var58 = this.field4358[var52 + 7] + var2;
            int var59 = this.field4358[var52] + var9;
            int var60 = var59 ^ var57 << 11;
            int var61 = this.field4358[var52 + 2] + var7;
            int var62 = var53 + var60;
            int var63 = var57 + var61;
            int var64 = var63 ^ var61 >>> 2;
            int var65 = var54 + var64;
            int var66 = var61 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var55 + var67;
            int var70 = var6 + var56;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var5 + var58;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var60;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
            this.field4358[var52] = var9;
            this.field4358[var52 + 1] = var8;
            this.field4358[var52 + 2] = var7;
            this.field4358[var52 + 3] = var6;
            this.field4358[var52 + 4] = var5;
            this.field4358[var52 + 5] = var4;
            this.field4358[var52 + 6] = var3;
            this.field4358[var52 + 7] = var2;
        }
        this.method2005(false);
        this.field4368 = 256;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 248)
    private class281() {
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V", line = 253)
    public static final void method2008(int arg0, int arg1) {
        class259.field3931 = new int[arg0];
        class322.field4946 = new int[arg0];
        class309.field4785 = new int[arg0];
        class312.field4829 = new int[arg0];
        if (arg1 != 0) {
            field4365 = (class245[][]) ((class245[][]) null);
        }
        class158.field2178 = new int[arg0];
        field4356++;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "([I)V", line = 266)
    public class281(int[] arg0) {
        this.field4358 = new int[256];
        this.field4362 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4362[var2] = arg0[var2];
        }
        this.method2007(-120);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I", line = 287)
    public final int method2009(int arg0) {
        if (this.field4368-- == 0) {
            this.method2005(false);
            this.field4368 = 255;
        }
        if (arg0 == 26813) {
            field4363++;
            return this.field4362[this.field4368];
        } else {
            return 70;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Llk;", line = 304)
    public static final class293 method2010(Throwable arg0, String arg1) {
        field4364++;
        class293 var2;
        if ((arg0 instanceof class293)) {
            var2 = (class293) arg0;
            var2.field4589 = var2.field4589 + ' ' + arg1;
        } else {
            var2 = new class293(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V", line = 322)
    public static void method2011(int arg0) {
        if (arg0 == 256) {
            field4365 = (class245[][]) null;
        }
    }
}
