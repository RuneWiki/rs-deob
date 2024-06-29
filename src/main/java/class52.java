import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SSCICQYX")
public class class52 extends class72 {

    @OriginalMember(owner = "client!SSCICQYX", name = "z", descriptor = "Z")
    private boolean field1387 = false;

    @OriginalMember(owner = "client!SSCICQYX", name = "A", descriptor = "Z")
    private boolean field1388 = false;

    @OriginalMember(owner = "client!SSCICQYX", name = "B", descriptor = "I")
    private int field1389 = -103;

    @OriginalMember(owner = "client!SSCICQYX", name = "C", descriptor = "I")
    private int field1390 = -103;

    @OriginalMember(owner = "client!SSCICQYX", name = "J", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!SSCICQYX", name = "K", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!SSCICQYX", name = "E", descriptor = "[I")
    public int[] field1392;

    @OriginalMember(owner = "client!SSCICQYX", name = "H", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!SSCICQYX", name = "I", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!SSCICQYX", name = "F", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!SSCICQYX", name = "G", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!SSCICQYX", name = "D", descriptor = "[B")
    public byte[] field1391;

    @OriginalMember(owner = "client!SSCICQYX", name = "<init>", descriptor = "(LRPFMUSNN;Ljava/lang/String;I)V")
    public class52(class49 arg0, String arg1, int arg2) {
        class63 var4 = new class63((byte) -58, arg0.method414(arg1 + ".dat", null));
        class63 var5 = new class63((byte) -58, arg0.method414("index.dat", null));
        var5.field1571 = var4.method504();
        this.field1397 = var5.method504();
        this.field1398 = var5.method504();
        int var6 = var5.method502();
        this.field1392 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1392[var7 + 1] = var5.method506();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1571 += 2;
            var4.field1571 += var5.method504() * var5.method504();
            var5.field1571++;
        }
        this.field1395 = var5.method502();
        this.field1396 = var5.method502();
        this.field1393 = var5.method504();
        this.field1394 = var5.method504();
        int var9 = var5.method502();
        int var10 = this.field1394 * this.field1393;
        this.field1391 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1391[var11] = var4.method503();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field1393; var12++) {
                    for (int var13 = 0; var13 < this.field1394; var13++) {
                        this.field1391[this.field1393 * var13 + var12] = var4.method503();
                    }
                }
            }
            if (class33.field960) {
            }
        }
    }

    @OriginalMember(owner = "client!SSCICQYX", name = "c", descriptor = "(I)V")
    public void method423(int arg0) {
        this.field1397 /= 2;
        this.field1398 /= 2;
        byte[] var2 = new byte[this.field1398 * this.field1397];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1394; var4++) {
            for (int var6 = 0; var6 < this.field1393; var6++) {
                var2[(this.field1395 + var6 >> 1) + (this.field1396 + var4 >> 1) * this.field1397] = this.field1391[var3++];
            }
        }
        this.field1391 = var2;
        this.field1393 = this.field1397;
        this.field1394 = this.field1398;
        this.field1395 = 0;
        this.field1396 = 0;
        if (arg0 != -25157) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "client!SSCICQYX", name = "a", descriptor = "(Z)V")
    public void method424(boolean arg0) {
        if (this.field1397 == this.field1393 && this.field1398 == this.field1394) {
            return;
        }
        byte[] var2 = new byte[this.field1398 * this.field1397];
        if (arg0) {
            this.field1388 = !this.field1388;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1394; var4++) {
            for (int var5 = 0; var5 < this.field1393; var5++) {
                var2[(this.field1396 + var4) * this.field1397 + this.field1395 + var5] = this.field1391[var3++];
            }
        }
        this.field1391 = var2;
        this.field1393 = this.field1397;
        this.field1394 = this.field1398;
        this.field1395 = 0;
        this.field1396 = 0;
    }

    @OriginalMember(owner = "client!SSCICQYX", name = "a", descriptor = "(B)V")
    public void method425(byte arg0) {
        byte[] var2 = new byte[this.field1394 * this.field1393];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1394; var4++) {
            for (int var5 = this.field1393 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1391[this.field1393 * var4 + var5];
            }
        }
        this.field1391 = var2;
        this.field1395 = this.field1397 - this.field1393 - this.field1395;
        if (arg0 != 1) {
            this.field1387 = !this.field1387;
        }
    }

    @OriginalMember(owner = "client!SSCICQYX", name = "b", descriptor = "(Z)V")
    public void method426(boolean arg0) {
        if (arg0) {
            return;
        }
        byte[] var2 = new byte[this.field1394 * this.field1393];
        int var3 = 0;
        for (int var4 = this.field1394 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1393; var5++) {
                var2[var3++] = this.field1391[this.field1393 * var4 + var5];
            }
        }
        this.field1391 = var2;
        this.field1396 = this.field1398 - this.field1394 - this.field1396;
    }

    @OriginalMember(owner = "client!SSCICQYX", name = "a", descriptor = "(IIII)V")
    public void method427(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1392.length; var5++) {
            int var6 = this.field1392[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1392[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1392[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1392[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg0 != 3) {
            this.field1387 = !this.field1387;
        }
    }

    @OriginalMember(owner = "client!SSCICQYX", name = "a", descriptor = "(ZII)V")
    public void method428(boolean arg0, int arg1, int arg2) {
        int var4 = this.field1395 + arg1;
        int var5 = this.field1396 + arg2;
        int var6 = class72.field1731 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1394;
        int var9 = this.field1393;
        int var10 = class72.field1731 - var9;
        int var11 = 0;
        if (var5 < class72.field1733) {
            int var12 = class72.field1733 - var5;
            var8 -= var12;
            var5 = class72.field1733;
            var7 += var9 * var12;
            var6 += class72.field1731 * var12;
        }
        if (var5 + var8 > class72.field1734) {
            var8 -= var5 + var8 - class72.field1734;
        }
        if (var4 < class72.field1735) {
            int var13 = class72.field1735 - var4;
            var9 -= var13;
            var4 = class72.field1735;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class72.field1736) {
            int var14 = var4 + var9 - class72.field1736;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method429(var6, var9, this.field1391, var11, this.field1392, var10, var7, class72.field1730, var8, (byte) -118);
            if (!arg0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!SSCICQYX", name = "a", descriptor = "(II[BI[III[IIB)V")
    private void method429(int arg0, int arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, byte arg9) {
        int var11 = -(arg1 >> 2);
        int var12 = -(arg1 & 0x3);
        if (arg9 != -118) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg2[arg6++];
                if (var18 == 0) {
                    arg0++;
                } else {
                    arg7[arg0++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg2[arg6++];
                if (var19 == 0) {
                    arg0++;
                } else {
                    arg7[arg0++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg2[arg6++];
                if (var20 == 0) {
                    arg0++;
                } else {
                    arg7[arg0++] = arg4[var20 & 0xFF];
                }
                byte var21 = arg2[arg6++];
                if (var21 == 0) {
                    arg0++;
                } else {
                    arg7[arg0++] = arg4[var21 & 0xFF];
                }
            }
            for (int var16 = var12; var16 < 0; var16++) {
                byte var17 = arg2[arg6++];
                if (var17 == 0) {
                    arg0++;
                } else {
                    arg7[arg0++] = arg4[var17 & 0xFF];
                }
            }
            arg0 += arg5;
            arg6 += arg3;
        }
    }
}
