import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class102 implements class510 {

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
    public static int field1421 = -1;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "Z")
    public boolean field1427;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLwu;ILjava/lang/String;)Lws;", line = 4)
    public static final class362 method763(boolean arg0, class376 arg1, int arg2, String arg3) {
        field1418++;
        int var4 = arg1.method2223((byte) 83, arg3);
        if (var4 == -1) {
            return new class362(0);
        }
        int[] var5 = arg1.method2214(var4, -123);
        class362 var6 = new class362(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field5095 > var7) {
                class677 var9 = new class677(arg1.method2218((byte) 126, var4, var5[var8++]));
                int var10 = var9.method3799(false);
                int var11 = var9.method3807(-1);
                int var12 = var9.method3821((byte) 95);
                if (!arg0 && var12 == 1) {
                    var6.field5095--;
                } else {
                    var6.field5096[var7] = var10;
                    var6.field5098[var7] = var11;
                    var7++;
                }
            }
            if (arg2 != 255) {
                field1421 = 58;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lek;Z)Z", line = 49)
    public final boolean method764(class510 arg0, boolean arg1) {
        field1425++;
        if (!(arg0 instanceof class102)) {
            return false;
        }
        class102 var3 = (class102) arg0;
        if (this.field1417 != var3.field1417) {
            return false;
        } else if (this.field1420 != var3.field1420) {
            return false;
        } else if (this.field1419 != var3.field1419) {
            return false;
        } else if (this.field1426 == var3.field1426) {
            if (!arg1) {
                method763(false, null, 124, null);
            }
            if (this.field1423 != var3.field1423) {
                return false;
            } else if (this.field1422 == var3.field1422) {
                return this.field1427 == var3.field1427;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)J", line = 95)
    public final long method765(byte arg0) {
        field1424++;
        long[] var2 = class534.field7035;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field1417 ^ var3) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field1420 >> 8)) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field1420) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field1419 >> 24)) & 0xFFL)];
        long var13 = var2[(int) (((long) (this.field1419 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        int var15 = 34 / ((-arg0 - 42) / 46);
        long var16 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field1419 >> 8)) & 0xFFL)];
        long var18 = var16 >>> 8 ^ var2[(int) (((long) this.field1419 ^ var16) & 0xFFL)];
        long var20 = var18 >>> 8 ^ var2[(int) (((long) this.field1426 ^ var18) & 0xFFL)];
        long var22 = var20 >>> 8 ^ var2[(int) (((long) (this.field1423 >> 24) ^ var20) & 0xFFL)];
        long var24 = var22 >>> 8 ^ var2[(int) ((var22 ^ (long) (this.field1423 >> 16)) & 0xFFL)];
        long var26 = var24 >>> 8 ^ var2[(int) (((long) (this.field1423 >> 8) ^ var24) & 0xFFL)];
        long var28 = var2[(int) (((long) this.field1423 ^ var26) & 0xFFL)] ^ var26 >>> 8;
        long var30 = var28 >>> 8 ^ var2[(int) (((long) this.field1422 ^ var28) & 0xFFL)];
        return var2[(int) ((var30 ^ (long) (this.field1427 ? 1 : 0)) & 0xFFL)] ^ var30 >>> 8;
    }
}
