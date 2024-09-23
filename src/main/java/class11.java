import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DGXCFOYI")
public class class11 extends class35 {

    @OriginalMember(owner = "DGXCFOYI", name = "z", descriptor = "Z")
    private boolean field598 = true;

    @OriginalMember(owner = "DGXCFOYI", name = "A", descriptor = "I")
    private int field599 = 1;

    @OriginalMember(owner = "DGXCFOYI", name = "B", descriptor = "I")
    private int field600 = 7964;

    @OriginalMember(owner = "DGXCFOYI", name = "C", descriptor = "B")
    private byte field601 = 3;

    @OriginalMember(owner = "DGXCFOYI", name = "D", descriptor = "Z")
    private boolean field602 = false;

    @OriginalMember(owner = "DGXCFOYI", name = "E", descriptor = "I")
    private int field603 = -313;

    @OriginalMember(owner = "DGXCFOYI", name = "F", descriptor = "B")
    private byte field604 = -81;

    @OriginalMember(owner = "DGXCFOYI", name = "G", descriptor = "I")
    private int field605 = -13936;

    @OriginalMember(owner = "DGXCFOYI", name = "H", descriptor = "I")
    private int field606 = 133;

    @OriginalMember(owner = "DGXCFOYI", name = "O", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "DGXCFOYI", name = "P", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "DGXCFOYI", name = "J", descriptor = "[I")
    public int[] field608;

    @OriginalMember(owner = "DGXCFOYI", name = "M", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "DGXCFOYI", name = "N", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "DGXCFOYI", name = "K", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "DGXCFOYI", name = "L", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "DGXCFOYI", name = "I", descriptor = "[B")
    public byte[] field607;

    @OriginalMember(owner = "DGXCFOYI", name = "<init>", descriptor = "(LTKEGJSFV;Ljava/lang/String;I)V")
    public class11(class58 arg0, String arg1, int arg2) {
        class15 var4 = new class15(arg0.method542(arg1 + ".dat", null), false);
        class15 var5 = new class15(arg0.method542("index.dat", null), false);
        var5.field709 = var4.method263();
        this.field613 = var5.method263();
        this.field614 = var5.method263();
        int var6 = var5.method261();
        this.field608 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field608[var7 + 1] = var5.method265();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field709 += 2;
            var4.field709 += var5.method263() * var5.method263();
            var5.field709++;
        }
        this.field611 = var5.method261();
        this.field612 = var5.method261();
        this.field609 = var5.method263();
        this.field610 = var5.method263();
        int var9 = var5.method261();
        int var10 = this.field610 * this.field609;
        this.field607 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field607[var11] = var4.method262();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field609; var12++) {
                for (int var13 = 0; var13 < this.field610; var13++) {
                    this.field607[this.field609 * var13 + var12] = var4.method262();
                }
            }
        }
    }

    @OriginalMember(owner = "DGXCFOYI", name = "a", descriptor = "(I)V")
    public void method178(int arg0) {
        this.field613 /= 2;
        this.field614 /= 2;
        byte[] var2 = new byte[this.field614 * this.field613];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field610; var4++) {
            for (int var5 = 0; var5 < this.field609; var5++) {
                var2[(this.field611 + var5 >> 1) + (this.field612 + var4 >> 1) * this.field613] = this.field607[var3++];
            }
        }
        this.field607 = var2;
        if (arg0 != 14439) {
            this.field605 = -386;
        }
        this.field609 = this.field613;
        this.field610 = this.field614;
        this.field611 = 0;
        this.field612 = 0;
    }

    @OriginalMember(owner = "DGXCFOYI", name = "b", descriptor = "(I)V")
    public void method179(int arg0) {
        if (arg0 != 0 || this.field613 == this.field609 && this.field614 == this.field610) {
            return;
        }
        byte[] var2 = new byte[this.field614 * this.field613];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field610; var4++) {
            for (int var5 = 0; var5 < this.field609; var5++) {
                var2[(this.field612 + var4) * this.field613 + this.field611 + var5] = this.field607[var3++];
            }
        }
        this.field607 = var2;
        this.field609 = this.field613;
        this.field610 = this.field614;
        this.field611 = 0;
        this.field612 = 0;
    }

    @OriginalMember(owner = "DGXCFOYI", name = "c", descriptor = "(I)V")
    public void method180(int arg0) {
        byte[] var2 = new byte[this.field610 * this.field609];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field610; var4++) {
            for (int var5 = this.field609 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field607[this.field609 * var4 + var5];
            }
        }
        this.field607 = var2;
        this.field611 = this.field613 - this.field609 - this.field611;
        if (arg0 < this.field599 || arg0 > this.field599) {
            ;
        }
    }

    @OriginalMember(owner = "DGXCFOYI", name = "d", descriptor = "(I)V")
    public void method181(int arg0) {
        byte[] var2 = new byte[this.field610 * this.field609];
        int var3 = 0;
        for (int var4 = this.field610 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field609; var5++) {
                var2[var3++] = this.field607[this.field609 * var4 + var5];
            }
        }
        this.field607 = var2;
        if (arg0 >= 0) {
            this.field598 = !this.field598;
        }
        this.field612 = this.field614 - this.field610 - this.field612;
    }

    @OriginalMember(owner = "DGXCFOYI", name = "a", descriptor = "(IIBI)V")
    public void method182(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 1) {
            this.field602 = !this.field602;
        }
        for (int var5 = 0; var5 < this.field608.length; var5++) {
            int var6 = this.field608[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field608[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field608[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field608[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "DGXCFOYI", name = "a", descriptor = "(III)V")
    public void method183(int arg0, int arg1, int arg2) {
        if (this.field600 != arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = this.field611 + arg2;
        int var6 = this.field612 + arg1;
        int var7 = class35.field1020 * var6 + var5;
        int var8 = 0;
        int var9 = this.field610;
        int var10 = this.field609;
        int var11 = class35.field1020 - var10;
        int var12 = 0;
        if (var6 < class35.field1022) {
            int var13 = class35.field1022 - var6;
            var9 -= var13;
            var6 = class35.field1022;
            var8 += var10 * var13;
            var7 += class35.field1020 * var13;
        }
        if (var6 + var9 > class35.field1023) {
            var9 -= var6 + var9 - class35.field1023;
        }
        if (var5 < class35.field1024) {
            int var14 = class35.field1024 - var5;
            var10 -= var14;
            var5 = class35.field1024;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class35.field1025) {
            int var15 = var5 + var10 - class35.field1025;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method184(var8, var7, this.field608, var12, var9, class35.field1019, (byte) 8, var10, var11, this.field607);
        }
    }

    @OriginalMember(owner = "DGXCFOYI", name = "a", descriptor = "(II[III[IBII[B)V")
    private void method184(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, byte arg6, int arg7, int arg8, byte[] arg9) {
        int var11 = -(arg7 >> 2);
        if (arg6 != 8) {
            this.field598 = !this.field598;
        }
        int var12 = -(arg7 & 0x3);
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg9[arg0++];
                if (var17 == 0) {
                    arg1++;
                } else {
                    arg5[arg1++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg9[arg0++];
                if (var18 == 0) {
                    arg1++;
                } else {
                    arg5[arg1++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg9[arg0++];
                if (var19 == 0) {
                    arg1++;
                } else {
                    arg5[arg1++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg9[arg0++];
                if (var20 == 0) {
                    arg1++;
                } else {
                    arg5[arg1++] = arg2[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg9[arg0++];
                if (var16 == 0) {
                    arg1++;
                } else {
                    arg5[arg1++] = arg2[var16 & 0xFF];
                }
            }
            arg1 += arg8;
            arg0 += arg3;
        }
    }
}
