import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class318 implements class284 {

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field4913 = 0;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public int field4909;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public int field4912;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public int field4915;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "Z")
    public boolean field4916;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)J")
    public final long method1767(byte arg0) {
        field4911++;
        long[] var2 = class256.field3476;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field4912 ^ var3) & 0xFFL)];
        long var7 = var2[(int) ((var5 ^ (long) (this.field4907 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) (((long) this.field4907 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        if (arg0 > -97) {
            this.field4912 = -66;
        }
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field4910 >> 24) ^ var9) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field4910 >> 16) ^ var11) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field4910 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) (((long) this.field4910 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field4909 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field4915 >> 24) ^ var19) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field4915 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field4915 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) (((long) this.field4915 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field4914) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field4916 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lrb;I)Z")
    public final boolean method1766(class284 arg0, int arg1) {
        field4908++;
        if (!(arg0 instanceof class318)) {
            return false;
        }
        if (arg1 != 2655) {
            this.field4914 = -90;
        }
        class318 var3 = (class318) arg0;
        if (this.field4912 != var3.field4912) {
            return false;
        } else if (this.field4907 != var3.field4907) {
            return false;
        } else if (this.field4910 != var3.field4910) {
            return false;
        } else if (this.field4909 != var3.field4909) {
            return false;
        } else if (this.field4915 != var3.field4915) {
            return false;
        } else if (this.field4914 == var3.field4914) {
            return var3.field4916 == this.field4916;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1984(long arg0, byte arg1) {
        field4906++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 75 / ((-arg1 - 27) / 33);
            int var4 = 0;
            for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                var4++;
            }
            StringBuffer var7 = new StringBuffer(var4);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                char var10 = class373.field5643[(int) (var8 - (arg0 * 37L))];
                if (var10 == '_') {
                    int var11 = var7.length() - 1;
                    var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                    var10 = ' ';
                }
                var7.append(var10);
            }
            var7.reverse();
            var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
            return var7.toString();
        }
    }
}
