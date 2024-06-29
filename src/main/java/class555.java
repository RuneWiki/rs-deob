import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class555 implements class42 {

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field7762 = 10;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field7766 = 0;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Ldm;")
    public static class368 field7757 = new class368();

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field7759;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public int field7760;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public int field7761;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public int field7763;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public int field7764;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public int field7769;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Ln;")
    public static class473 field7756;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Z")
    public boolean field7767;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[[B")
    public static byte[][] field7758;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
    public static final void method3110() {
        if (class497.field6933 != null) {
            for (int var0 = 0; var0 < class497.field6933.length; var0++) {
                for (int var1 = 0; var1 < class260.field3211; var1++) {
                    for (int var2 = 0; var2 < class541.field7566; var2++) {
                        if (class497.field6933[var0][var1][var2] != null) {
                            class497.field6933[var0][var1][var2].method3160(-12384);
                        }
                        class497.field6933[var0][var1][var2] = null;
                    }
                }
            }
        }
        class497.field6933 = null;
        class50.field672 = null;
        if (class319.field4403 != null) {
            for (int var3 = 0; var3 < class319.field4403.length; var3++) {
                for (int var4 = 0; var4 < class260.field3211; var4++) {
                    for (int var5 = 0; var5 < class541.field7566; var5++) {
                        if (class319.field4403[var3][var4][var5] != null) {
                            class319.field4403[var3][var4][var5].method3160(-12384);
                        }
                        class319.field4403[var3][var4][var5] = null;
                    }
                }
            }
        }
        class319.field4403 = null;
        class353.field4949 = null;
        class199.field2605 = null;
        class501.field6947 = null;
        class355.field4976 = 0;
        if (class247.field3114 != null) {
            for (int var6 = 0; var6 < class355.field4976; var6++) {
                class247.field3114[var6] = null;
            }
        }
        if (class315.field4364 != null) {
            for (int var7 = 0; var7 < class548.field7628; var7++) {
                class315.field4364[var7] = null;
            }
            class548.field7628 = 0;
        }
        if (class256.field3175 != null) {
            for (int var8 = 0; var8 < class444.field6143; var8++) {
                class256.field3175[var8] = null;
            }
            for (int var9 = 0; var9 < class183.field2341; var9++) {
                for (int var10 = 0; var10 < class260.field3211; var10++) {
                    for (int var11 = 0; var11 < class541.field7566; var11++) {
                        class238.field3050[var9][var10][var11] = 0L;
                    }
                }
            }
            class444.field6143 = 0;
        }
        class406.field5575 = null;
        class113.method612(true);
        class358.field4993.method1874(-24444);
        class596.field8593 = null;
        class558.field7819 = null;
        class599.field8649 = null;
        class171.field2196 = null;
        class22.field308 = null;
        class583.field8427 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)J")
    public final long method237(int arg0) {
        field7755++;
        long[] var2 = class81.field1100;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field7760 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field7763 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field7763 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field7759 >> 24)) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field7759 >> 16) ^ var11) & 0xFFL)];
        long var15 = var2[(int) ((var13 ^ (long) (this.field7759 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        if (arg0 != -6403) {
            method3110();
        }
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field7759) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field7769 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) ((var19 ^ (long) (this.field7764 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field7764 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field7764 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field7764 ^ var25) & 0xFFL)];
        long var29 = var2[(int) (((long) this.field7761 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field7767 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public static void method3111(int arg0) {
        field7758 = null;
        field7757 = null;
        field7756 = null;
        if (arg0 != -1943742696) {
            method3110();
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lmaa;I)Z")
    public final boolean method236(class42 arg0, int arg1) {
        field7765++;
        if (!(arg0 instanceof class555)) {
            return false;
        }
        class555 var3 = (class555) arg0;
        if (this.field7760 != var3.field7760) {
            return false;
        }
        if (arg1 != -19126) {
            method3110();
        }
        if (this.field7763 != var3.field7763) {
            return false;
        } else if (this.field7759 != var3.field7759) {
            return false;
        } else if (this.field7769 != var3.field7769) {
            return false;
        } else if (this.field7764 != var3.field7764) {
            return false;
        } else if (this.field7761 == var3.field7761) {
            return this.field7767 == var3.field7767;
        } else {
            return false;
        }
    }
}
