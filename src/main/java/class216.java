import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class216 implements class221 {

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "[C")
    public static char[] field2980 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field2986;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Z")
    public boolean field2985;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 17)
    public static final void method1424(String arg0, int arg1) {
        field2976++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        if (arg1 != -1985375032) {
            method1426((byte) -63, 47);
        }
        String var2 = class207.method1323(32682, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class602.field8781; var3++) {
            String var4 = class37.field408[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class207.method1323(arg1 + 1985407714, var4);
            if (var5 != null && var5.equals(var2)) {
                class602.field8781--;
                for (int var6 = var3; var6 < class602.field8781; var6++) {
                    class37.field408[var6] = class37.field408[var6 + 1];
                    class546.field7812[var6] = class546.field7812[var6 + 1];
                    class248.field3519[var6] = class248.field3519[var6 + 1];
                    class32.field361[var6] = class32.field361[var6 + 1];
                    class356.field5075[var6] = class356.field5075[var6 + 1];
                    class163.field1994[var6] = class163.field1994[var6 + 1];
                }
                class327.field4715++;
                class236.field3383 = class240.field3406;
                class308.method2044(class352.field5024, -7434);
                class468.field6960.method1205((byte) -69, class456.method2816(-113, arg0));
                class468.field6960.method1237(1049279824, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 78)
    public static void method1425(byte arg0) {
        field2980 = null;
        if (arg0 != -123) {
            field2980 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)Lem;", line = 88)
    public static final class192 method1426(byte arg0, int arg1) {
        field2981++;
        class192 var2 = (class192) class517.field7523.method1801(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class638.field9170.method1286(arg1, 1, (byte) -49);
        class192 var4 = new class192();
        var4.field2541 = arg1;
        if (var3 != null) {
            var4.method1159((byte) -57, new class194(var3));
        }
        var4.method1161((byte) -103);
        if (arg0 >= -103) {
            method1426((byte) -103, 72);
        }
        if (var4.field2535 == 2 && class38.field411.method524((byte) 100, (long) arg1) == null) {
            class38.field411.method520((byte) -69, new class388(class443.field6633), (long) arg1);
            class132.field1657[class443.field6633++] = var4;
        }
        class517.field7523.method1808((long) arg1, var4, (byte) -124);
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Luk;I)Z", line = 124)
    public final boolean method1427(class221 arg0, int arg1) {
        if (arg1 != 23593) {
            method1424(null, 2);
        }
        field2984++;
        if (!(arg0 instanceof class216)) {
            return false;
        }
        class216 var3 = (class216) arg0;
        if (this.field2978 != var3.field2978) {
            return false;
        } else if (this.field2986 != var3.field2986) {
            return false;
        } else if (this.field2977 != var3.field2977) {
            return false;
        } else if (this.field2975 != var3.field2975) {
            return false;
        } else if (this.field2979 != var3.field2979) {
            return false;
        } else if (this.field2983 == var3.field2983) {
            return var3.field2985 == this.field2985;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)J", line = 165)
    public final long method1428(int arg0) {
        field2982++;
        long[] var2 = class144.field1771;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field2978) & 0xFFL)] ^ var3 >>> 8;
        int var7 = -118 % ((6 - arg0) / 32);
        long var8 = var2[(int) (((long) (this.field2986 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var10 = var8 >>> 8 ^ var2[(int) ((var8 ^ (long) this.field2986) & 0xFFL)];
        long var12 = var2[(int) (((long) (this.field2977 >> 24) ^ var10) & 0xFFL)] ^ var10 >>> 8;
        long var14 = var12 >>> 8 ^ var2[(int) (((long) (this.field2977 >> 16) ^ var12) & 0xFFL)];
        long var16 = var14 >>> 8 ^ var2[(int) ((var14 ^ (long) (this.field2977 >> 8)) & 0xFFL)];
        long var18 = var2[(int) ((var16 ^ (long) this.field2977) & 0xFFL)] ^ var16 >>> 8;
        long var20 = var2[(int) (((long) this.field2975 ^ var18) & 0xFFL)] ^ var18 >>> 8;
        long var22 = var20 >>> 8 ^ var2[(int) (((long) (this.field2979 >> 24) ^ var20) & 0xFFL)];
        long var24 = var2[(int) (((long) (this.field2979 >> 16) ^ var22) & 0xFFL)] ^ var22 >>> 8;
        long var26 = var2[(int) ((var24 ^ (long) (this.field2979 >> 8)) & 0xFFL)] ^ var24 >>> 8;
        long var28 = var26 >>> 8 ^ var2[(int) ((var26 ^ (long) this.field2979) & 0xFFL)];
        long var30 = var2[(int) (((long) this.field2983 ^ var28) & 0xFFL)] ^ var28 >>> 8;
        return var2[(int) (((long) (this.field2985 ? 1 : 0) ^ var30) & 0xFFL)] ^ var30 >>> 8;
    }
}
