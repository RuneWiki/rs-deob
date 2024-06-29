import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class618 implements class686 {

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Llu;")
    public static class651 field8699 = new class651();

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "F")
    public static float field8697;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public int field8693;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public int field8694;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field8698;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public int field8700;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public int field8707;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public int field8709;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lir;")
    public static class25 field8696;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Loa;")
    public static class635 field8703;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
    public boolean field8695;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "[Lxa;")
    public static class458[] field8704;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method3468(byte arg0, int arg1) {
        if (arg0 == 23) {
            field8701++;
            class530 var2 = class242.method1402(arg0 - 70, 7, arg1);
            var2.method3027((byte) -100);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V", line = 19)
    public static final void method3469(byte arg0) {
        class653 var1 = class84.field896;
        synchronized (class84.field896) {
            if (arg0 != 98) {
                field8703 = null;
            }
            class84.field896.method3687((byte) -10);
        }
        field8706++;
        class653 var2 = class416.field5522;
        synchronized (class416.field5522) {
            class416.field5522.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)J", line = 35)
    public final long method3470(byte arg0) {
        field8702++;
        long[] var2 = class508.field7311;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field8693) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field8709 >> 8) ^ var5) & 0xFFL)];
        long var9 = var2[(int) (((long) this.field8709 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field8694 >> 24) ^ var9) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field8694 >> 16)) & 0xFFL)];
        long var15 = var2[(int) ((var13 ^ (long) (this.field8694 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field8694) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field8700) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field8707 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field8707 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field8707 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field8707) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field8698 ^ var27) & 0xFFL)];
        long var31 = var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field8695 ? 1 : 0)) & 0xFFL)];
        int var33 = 99 / ((-arg0 - 59) / 52);
        return var31;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZ)V", line = 69)
    public static final void method3471(byte arg0, boolean arg1) {
        int var2 = 44 / ((arg0 + 64) / 35);
        for (class282 var3 = (class282) class144.field1618.method3174((byte) 49); var3 != null; var3 = (class282) class144.field1618.method3168(false)) {
            if (var3.field3577 != null) {
                class424.field5641.method2852(var3.field3577);
                var3.field3577 = null;
            }
            if (var3.field3586 != null) {
                class424.field5641.method2852(var3.field3586);
                var3.field3586 = null;
            }
            var3.method1519((byte) 121);
        }
        field8692++;
        if (!arg1) {
            return;
        }
        for (class282 var4 = (class282) class390.field5211.method3174((byte) 49); var4 != null; var4 = (class282) class390.field5211.method3168(false)) {
            if (var4.field3577 != null) {
                class424.field5641.method2852(var4.field3577);
                var4.field3577 = null;
            }
            var4.method1519((byte) 121);
        }
        for (class282 var5 = (class282) class279.field3524.method3232(-1); var5 != null; var5 = (class282) class279.field3524.method3236(-27646)) {
            if (var5.field3577 != null) {
                class424.field5641.method2852(var5.field3577);
                var5.field3577 = null;
            }
            var5.method1519((byte) 121);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BLjava/lang/String;)I", line = 138)
    public static final int method3472(int arg0, int arg1, byte[] arg2, String arg3) {
        field8708++;
        int var4 = arg0;
        int var5 = arg3.length();
        if (arg1 != 7) {
            method3471((byte) -107, false);
        }
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class89.method553((byte) 5, arg3.charAt(var6));
            int var8 = var5 <= (var6 + 1) ? -1 : class89.method553((byte) 5, arg3.charAt(var6 + 1));
            int var9 = var5 > var6 + 2 ? class89.method553((byte) 5, arg3.charAt(var6 + 2)) : -1;
            int var10 = var5 > var6 + 3 ? class89.method553((byte) 5, arg3.charAt(var6 + 3)) : -1;
            arg2[arg0++] = (byte) class139.method776(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class139.method776(class203.method1246(var8 << 4, 240), var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class139.method776(class203.method1246(var9, 3) << 6, var10);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V", line = 188)
    public static void method3473(byte arg0) {
        field8699 = null;
        int var1 = 49 % ((-arg0 - 29) / 43);
        field8703 = null;
        field8696 = null;
        field8704 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLlo;)Z", line = 202)
    public final boolean method3474(boolean arg0, class686 arg1) {
        field8705++;
        if (!(arg1 instanceof class618)) {
            return false;
        }
        class618 var3 = (class618) arg1;
        if (this.field8693 != var3.field8693) {
            return false;
        } else if (this.field8709 != var3.field8709) {
            return false;
        } else if (this.field8694 != var3.field8694) {
            return false;
        } else if (this.field8700 != var3.field8700) {
            return false;
        } else if (arg0) {
            return true;
        } else if (this.field8707 != var3.field8707) {
            return false;
        } else if (this.field8698 == var3.field8698) {
            return this.field8695 == var3.field8695;
        } else {
            return false;
        }
    }
}
