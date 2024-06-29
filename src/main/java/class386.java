import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class386 implements class357 {

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field5644 = 0;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Ljava/util/Random;")
    public static Random field5650 = new Random();

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field5654 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public int field5641;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public int field5642;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public int field5645;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public int field5646;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public int field5647;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public int field5648;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Z")
    public boolean field5643;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", line = 3)
    public static final void method2466(int arg0, int arg1, String arg2, int arg3, String arg4, String arg5) {
        class348.method2213(arg2, arg4, arg5, arg1, (String) null, arg1 + 125, arg3, arg0);
        field5651++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)J", line = 11)
    public final long method2278(byte arg0) {
        field5649++;
        long[] var2 = class189.field2567;
        long var3 = -1L;
        if (arg0 >= -73) {
            this.field5646 = -63;
        }
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field5646) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field5641 >> 8)) & 0xFFL)];
        long var9 = var2[(int) (((long) this.field5641 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field5645 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field5645 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field5645 >> 8)) & 0xFFL)];
        long var17 = var2[(int) (((long) this.field5645 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field5647 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field5642 >> 24)) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field5642 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field5642 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field5642) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field5648 ^ var27) & 0xFFL)];
        return var2[(int) ((var29 ^ (long) (this.field5643 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 43)
    public static void method2467(int arg0) {
        if (arg0 == 2116935560) {
            field5650 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I", line = 66)
    public static final int method2468(int arg0) {
        field5652++;
        class331 var1 = class350.field5107;
        synchronized (class350.field5107) {
            return arg0 == 24484 ? class350.field5107.method2053(0) : -52;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([Ljava/lang/String;ZII)Ljava/lang/String;", line = 81)
    public static final String method2469(String[] arg0, boolean arg1, int arg2, int arg3) {
        field5640++;
        if (arg1) {
            return null;
        } else if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lgl;B)Z", line = 147)
    public final boolean method2277(class357 arg0, byte arg1) {
        field5653++;
        if (!(arg0 instanceof class386)) {
            return false;
        }
        class386 var3 = (class386) arg0;
        if (this.field5646 != var3.field5646) {
            return false;
        }
        if (arg1 <= 14) {
            field5654 = 102;
        }
        if (this.field5641 != var3.field5641) {
            return false;
        } else if (this.field5645 != var3.field5645) {
            return false;
        } else if (this.field5647 != var3.field5647) {
            return false;
        } else if (this.field5642 != var3.field5642) {
            return false;
        } else if (this.field5648 == var3.field5648) {
            return this.field5643 == var3.field5643;
        } else {
            return false;
        }
    }
}
