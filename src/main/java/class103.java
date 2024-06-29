import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class103 {

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Z")
    private boolean field1576;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    private int field1583;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[I")
    private static int[] field1573 = new int[4];

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lwf;")
    private class17 field1574;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Luj;")
    private static class264 field1582;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[B")
    private static byte[] field1567;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIILve;)V")
    public final void method761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class103 arg6) {
        int var8 = this.field1570 - arg4 & 0x7FF;
        int var9 = this.field1568 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field1571) / 2 + var10;
        int var13 = (arg2 - this.field1571) / 2 + var11;
        if (var12 < arg3 && this.field1571 + var12 > 0 && var13 < arg2 && this.field1571 + var13 > 0 && this.method772(arg6)) {
            this.field1574.method132(arg0 + var13, arg1 + var12, this.field1571, this.field1571);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method762(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field1567[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ve", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method768();
        super.finalize();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)Z")
    public final boolean method763(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1576) {
            this.field1581 = 1073741823;
            var8 = this.field1580;
            var9 = this.field1577;
            var10 = this.field1569;
        } else {
            int var5 = this.field1580 - arg0;
            int var6 = this.field1577 - arg1;
            int var7 = this.field1569 - arg2;
            this.field1581 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1581 == 0) {
                this.field1581 = 1;
            }
            var8 = (var5 << 8) / this.field1581;
            var9 = (var6 << 8) / this.field1581;
            var10 = (var7 << 8) / this.field1581;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1571 = this.field1578 * arg3 / (this.field1576 ? 1024 : this.field1581);
        } else {
            this.field1571 = 0;
        }
        if (this.field1571 < 8) {
            this.method768();
            this.field1574 = null;
            return false;
        }
        int var12 = class274.method1859(184601800, this.field1571);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1575 != var12) {
            this.field1575 = var12;
        }
        this.field1570 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field1568 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field1574 = null;
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
    private final void method764() {
        int var1 = this.field1575;
        int var2 = this.field1575;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class63.field1049 - var1;
        if (var2 > class63.field1055) {
            var2 -= var2 - class63.field1055;
        }
        if (class63.field1052 > 0) {
            int var9 = class63.field1052;
            var2 -= var9;
            var7 += class63.field1049 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class63.field1056) {
            int var10 = var1 - class63.field1056;
            var1 -= var10;
            var8 += var10;
        }
        if (class63.field1050 > 0) {
            int var11 = class63.field1050;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method773(class63.field1048, this.field1579, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lve;)V")
    private final void method765(class103 arg0) {
        method766();
        method767();
        this.field1574 = new class202(this.field1575, this.field1575);
        class63.method489(field1573);
        this.field1574.method110();
        class95.method713();
        class63.method493(0, 0, this.field1575, this.field1575, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field1576) {
                var2 = -arg0.field1580;
                var3 = -arg0.field1577;
                var4 = -arg0.field1569;
            } else {
                var2 = this.field1580 - arg0.field1580;
                var3 = this.field1577 - arg0.field1577;
                var4 = this.field1569 - arg0.field1569;
            }
        }
        if (this.field1570 != 0) {
            int var5 = class95.field1482[this.field1570];
            int var6 = class95.field1475[this.field1570];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field1568 != 0) {
            int var8 = this.field1568 - 1024 & 0x7FF;
            int var9 = class95.field1482[var8];
            int var10 = class95.field1475[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class68.method530(field1582.field4187, 0, field1582.field4192, (short) class95.field1483.method1612(-70, this.field1583));
        class41 var12 = field1582.method1787(64, 512, -var2, -var3, -var4);
        int var13 = var12.method359() - var12.method337();
        int var14 = var12.method368() - var12.method99();
        if (var13 > var14) {
            int var15 = this.field1579 == 0 ? (var13 << 9) / this.field1575 : (var13 * 16 << 9) / (this.field1575 * 13);
            var12.method365(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field1579 == 0 ? (var14 << 9) / this.field1575 : (var14 * 16 << 9) / (this.field1575 * 13);
            var12.method365(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field1579 == 0) {
            for (int var17 = 0; var17 < class63.field1048.length; var17++) {
                if (class63.field1048[var17] != 0) {
                    class63.field1048[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method771();
            this.method764();
        }
        class263.field4173.method943(128);
        class63.method478(field1573);
        class95.method713();
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()V")
    private static final void method766() {
        if (field1582 != null) {
            return;
        }
        class264 var0 = field1582 = new class264(260, 480, 0);
        int[] var1 = var0.field4203;
        int[] var2 = var0.field4215;
        int[] var3 = var0.field4181;
        int[] var4 = var0.field4214;
        int[] var5 = var0.field4217;
        int[] var6 = var0.field4194;
        var0.field4213 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class95.field1482[var8] >> 1;
            int var10 = class95.field1475[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class95.field1475[var17] >> 9;
                int var19 = (class95.field1482[var17] >> 1) * var9 >> 23;
                int var20 = (class95.field1482[var17] >> 1) * var10 >> 23;
                var1[var0.field4213] = var20;
                var2[var0.field4213] = var18;
                var3[var0.field4213] = -var19;
                var0.field4213++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field4192] = 0;
                var5[var0.field4192] = var13;
                var6[var0.field4192] = var12;
                var0.field4192++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field4192] = var13;
                    var5[var0.field4192] = var15;
                    var6[var0.field4192] = var12;
                    var0.field4192++;
                    var4[var0.field4192] = var15;
                    var5[var0.field4192] = var16;
                    var6[var0.field4192] = var12;
                    var0.field4192++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field4192] = var12;
                var5[var0.field4192] = var13;
                var6[var0.field4192] = 1;
                var0.field4192++;
            }
        }
        var0.field4183 = var0.field4213;
        var0.field4196 = null;
        var0.field4228 = null;
        var0.field4191 = null;
        var0.field4212 = null;
        var0.field4206 = null;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()V")
    private static final void method767() {
        if (field1567 != null) {
            return;
        }
        field1567 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field1567[var4 + var6] = field1567[var4 + var9] = field1567[var5 + var6] = field1567[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "()V")
    private final void method768() {
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "()V")
    public static void method769() {
        field1582 = null;
        field1567 = null;
        field1573 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Lve;)V")
    private final void method770(class103 arg0) {
        class264 var2 = class264.method1779(class121.field2022, this.field1583, 0);
        if (var2 == null) {
            return;
        }
        this.field1574 = new class17(this.field1575, this.field1575);
        class63.method489(field1573);
        this.field1574.method110();
        class95.method713();
        class63.method493(0, 0, this.field1575, this.field1575, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field1576) {
                var3 = -arg0.field1580;
                var4 = -arg0.field1577;
                var5 = -arg0.field1569;
            } else {
                var3 = this.field1580 - arg0.field1580;
                var4 = this.field1577 - arg0.field1577;
                var5 = this.field1569 - arg0.field1569;
            }
        }
        if (this.field1570 != 0) {
            int var6 = class95.field1482[this.field1570];
            int var7 = class95.field1475[this.field1570];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field1568 != 0) {
            int var9 = this.field1568 - 1024 & 0x7FF;
            int var10 = class95.field1482[var9];
            int var11 = class95.field1475[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class41 var13 = var2.method1787(64, 768, -var3, -var4, -var5);
        int var14 = var13.method359() - var13.method337();
        int var15 = var13.method368() - var13.method99();
        int var16 = var13.method337() + var14 / 2;
        int var17 = var13.method99() + var15 / 2;
        if (var14 > var15) {
            var13.method365(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field1575);
        } else {
            var13.method365(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field1575);
        }
        class263.field4173.method943(128);
        class63.method478(field1573);
        class95.method713();
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "()V")
    private final void method771() {
        int var1 = this.field1575 * 3 / 32;
        int var3 = this.field1575 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class63.field1049 * var1 + var1;
        int var8 = class63.field1049 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class63.field1055) {
            var4 = var3 - (var1 + var3 - class63.field1055);
        }
        if (var1 < class63.field1052) {
            int var11 = class63.field1052 - var1;
            var4 -= var11;
            var7 += class63.field1049 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class63.field1056) {
            int var12 = var1 + var3 - class63.field1056;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class63.field1050) {
            int var13 = class63.field1050 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method762(class63.field1048, 0, this.field1579, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(Lve;)Z")
    private final boolean method772(class103 arg0) {
        if (this.field1574 == null) {
            if (this.field1572 == 0) {
                this.field1574 = class95.field1483.method1610(this.field1583, false, class95.field1485, this.field1575, true);
            } else if (this.field1572 == 2) {
                this.method770(arg0);
            } else if (this.field1572 == 1) {
                this.method765(arg0);
            }
        }
        return this.field1574 != null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method773(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field1567[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1580 = arg2;
        this.field1577 = arg3;
        this.field1569 = arg4;
        this.field1576 = arg7;
        this.field1583 = arg1;
        this.field1579 = arg6;
        this.field1578 = arg5;
        this.field1572 = arg0;
    }
}
