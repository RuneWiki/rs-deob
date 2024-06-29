import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class388 implements class23 {

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "Lrc;")
    public static class108 field5318 = new class108(17, -2);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public int field5315;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public int field5319;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public int field5320;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public int field5323;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public int field5326;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    public int field5328;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "Lnl;")
    public static class435 field5327;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "Z")
    public boolean field5325;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "[I")
    public static int[] field5324;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static final void method2354(int arg0) {
        field5322++;
        if (arg0 == 0) {
            class266.field3835.method363(class95.field1338, class318.field4498, class475.field6701);
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
    public static void method2355(byte arg0) {
        if (arg0 <= -39) {
            field5324 = null;
            field5318 = null;
            field5327 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lts;I)Z")
    public final boolean method167(class23 arg0, int arg1) {
        field5316++;
        if (!(arg0 instanceof class388)) {
            return false;
        }
        class388 var3 = (class388) arg0;
        if (this.field5315 != var3.field5315) {
            return false;
        } else if (this.field5328 != var3.field5328) {
            return false;
        } else if (this.field5326 != var3.field5326) {
            return false;
        } else if (this.field5319 != var3.field5319) {
            return false;
        } else if (this.field5323 != var3.field5323) {
            return false;
        } else if (this.field5320 != var3.field5320) {
            return false;
        } else if (this.field5325 == var3.field5325) {
            if (arg1 >= -92) {
                this.field5326 = -62;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I")
    public static final int method2356(int arg0, int arg1, int arg2) {
        if (arg0 != -31955) {
            field5324 = null;
        }
        field5313++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)J")
    public final long method168(byte arg0) {
        field5314++;
        long[] var2 = class481.field6808;
        if (arg0 >= -107) {
            method2354(106);
        }
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field5315) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field5328 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field5328) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) ((var9 ^ (long) (this.field5326 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field5326 >> 16)) & 0xFFL)];
        long var15 = var2[(int) ((var13 ^ (long) (this.field5326 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field5326) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field5319) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field5323 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field5323 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field5323 >> 8) ^ var23) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field5323) & 0xFFL)];
        long var29 = var2[(int) ((var27 ^ (long) this.field5320) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field5325 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method2357(byte[] arg0, int arg1, int arg2, int arg3) {
        field5317++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        if (arg3 != -28860) {
            field5327 = null;
        }
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg0[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class130.field1784[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}
