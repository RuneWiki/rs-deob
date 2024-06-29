import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class156 implements class35 {

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "Z")
    public static boolean field1903 = false;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1908 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "[[B")
    public static byte[][] field1915 = new byte[250][];

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "F")
    public static float field1914;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "Z")
    public boolean field1912;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "[Lf;")
    public static class701[] field1902;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILbe;)Z", line = 3)
    public final boolean method414(int arg0, class35 arg1) {
        field1907++;
        if (!(arg1 instanceof class156)) {
            return false;
        }
        class156 var3 = (class156) arg1;
        if (this.field1905 != var3.field1905) {
            return false;
        } else if (this.field1904 == var3.field1904) {
            if (arg0 != -13652) {
                this.method413(true);
            }
            if (this.field1913 != var3.field1913) {
                return false;
            } else if (this.field1906 != var3.field1906) {
                return false;
            } else if (this.field1911 != var3.field1911) {
                return false;
            } else if (this.field1901 == var3.field1901) {
                return this.field1912 == var3.field1912;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(BIIZ)I", line = 47)
    public static final int method988(byte arg0, int arg1, int arg2, boolean arg3) {
        field1909++;
        class122 var4 = class673.method3829(arg0 ^ 0xD, arg3, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field1572.length; var6++) {
                if (var4.field1574[var6] == arg2) {
                    var5 += var4.field1572[var6];
                }
            }
            if (arg0 != 12) {
                method988((byte) -80, 110, -13, true);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)J", line = 80)
    public final long method413(boolean arg0) {
        if (!arg0) {
            this.field1906 = -105;
        }
        field1910++;
        long[] var2 = class529.field7725;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field1905) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field1904 >> 8)) & 0xFFL)];
        long var9 = var2[(int) (((long) this.field1904 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) ((var9 ^ (long) (this.field1913 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field1913 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field1913 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field1913) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field1906) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field1911 >> 24)) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field1911 >> 16)) & 0xFFL)];
        long var25 = var2[(int) (((long) (this.field1911 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field1911 ^ var25) & 0xFFL)];
        long var29 = var2[(int) ((var27 ^ (long) this.field1901) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field1912 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(Z)V", line = 117)
    public static void method989(boolean arg0) {
        field1908 = null;
        field1902 = null;
        field1915 = null;
        if (!arg0) {
            method988((byte) 24, 98, -50, true);
        }
    }
}
