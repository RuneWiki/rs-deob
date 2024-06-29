import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class81 extends class66 {

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "[B")
    public byte[] field2029;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "[I")
    public int[] field2025;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()V", line = 3)
    public final void method682() {
        if (this.field2027 == this.field2022 && this.field2028 == this.field2026) {
            return;
        }
        byte[] var1 = new byte[this.field2026 * this.field2022];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2028; var3++) {
            for (int var4 = 0; var4 < this.field2027; var4++) {
                var1[(this.field2023 + var3) * this.field2022 + this.field2024 + var4] = this.field2029[var2++];
            }
        }
        this.field2029 = var1;
        this.field2027 = this.field2022;
        this.field2028 = this.field2026;
        this.field2024 = 0;
        this.field2023 = 0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V", line = 37)
    public final void method683(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2025.length; var4++) {
            int var5 = this.field2025[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2025[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2025[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2025[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "()V", line = 78)
    public final void method684() {
        byte[] var1 = new byte[this.field2028 * this.field2027];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2028; var3++) {
            for (int var4 = this.field2027 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2029[this.field2027 * var3 + var4];
            }
        }
        this.field2029 = var1;
        this.field2024 = this.field2022 - this.field2027 - this.field2024;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "()Lnc;", line = 103)
    public final class81 method685() {
        class81 var1 = new class81(this.field2027, this.field2028, this.field2025.length);
        var1.field2022 = this.field2022;
        var1.field2026 = this.field2026;
        var1.field2024 = this.field2024;
        var1.field2023 = this.field2023;
        int var2 = this.field2029.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2029[var3] = this.field2029[var3];
        }
        int var4 = this.field2025.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2025[var5] = this.field2025[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([I[B[IIIIIII)V", line = 133)
    private static final void method686(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                byte var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var16 & 0xFF];
                }
                byte var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var18 & 0xFF];
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                byte var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var14 & 0xFF];
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)V", line = 197)
    public final void method687(int arg0, int arg1) {
        int var3 = this.field2024 + arg0;
        int var4 = this.field2023 + arg1;
        int var5 = class66.field1721 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2028;
        int var8 = this.field2027;
        int var9 = class66.field1721 - var8;
        int var10 = 0;
        if (var4 < class66.field1717) {
            int var11 = class66.field1717 - var4;
            var7 -= var11;
            var4 = class66.field1717;
            var6 += var8 * var11;
            var5 += class66.field1721 * var11;
        }
        if (var4 + var7 > class66.field1718) {
            var7 -= var4 + var7 - class66.field1718;
        }
        if (var3 < class66.field1716) {
            int var12 = class66.field1716 - var3;
            var8 -= var12;
            var3 = class66.field1716;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class66.field1719) {
            int var13 = var3 + var8 - class66.field1719;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method686(class66.field1722, this.field2029, this.field2025, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "()V", line = 256)
    public final void method688() {
        byte[] var1 = new byte[this.field2028 * this.field2027];
        int var2 = 0;
        for (int var3 = this.field2028 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2027; var4++) {
                var1[var2++] = this.field2029[this.field2027 * var3 + var4];
            }
        }
        this.field2029 = var1;
        this.field2023 = this.field2026 - this.field2028 - this.field2023;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 279)
    public class81() {
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V", line = 283)
    private class81(int arg0, int arg1, int arg2) {
        this.field2022 = this.field2027 = arg0;
        this.field2026 = this.field2028 = arg1;
        this.field2024 = this.field2023 = 0;
        this.field2029 = new byte[arg0 * arg1];
        this.field2025 = new int[arg2];
    }
}
