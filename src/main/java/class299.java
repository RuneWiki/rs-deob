import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class299 implements class435 {

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Z")
    public static boolean field4222 = false;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public int field4208;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public int field4211;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field4215;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public int field4219;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lfp;")
    public static class323 field4218;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Z")
    public boolean field4210;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)J", line = 8)
    public final long method1942(boolean arg0) {
        field4214++;
        long[] var2 = class344.field4828;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field4221) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field4219 >> 8)) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field4219 ^ var7) & 0xFFL)];
        long var11 = var2[(int) ((var9 ^ (long) (this.field4208 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) ((var11 ^ (long) (this.field4208 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field4208 >> 8)) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field4208) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) (((long) this.field4215 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field4220 >> 24) ^ var19) & 0xFFL)];
        if (!arg0) {
            field4222 = true;
        }
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field4220 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field4220 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field4220) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field4211 ^ var27) & 0xFFL)];
        return var2[(int) ((var29 ^ (long) (this.field4210 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 37)
    public static void method1943(int arg0) {
        if (arg0 != -15784) {
            method1946(-68, null);
        }
        field4218 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 51)
    public static final void method1944(byte arg0) {
        class426.field5985 = null;
        class657.field9011 = null;
        class336.field4684 = null;
        class504.field7231 = null;
        class166.field2285 = null;
        class213.field2811 = null;
        field4213++;
        class681.field9344 = null;
        class648.field8916 = null;
        if (arg0 != -126) {
            field4222 = false;
        }
        class748.field10391 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILaf;)Z", line = 75)
    public final boolean method1945(int arg0, class435 arg1) {
        field4212++;
        if (!(arg1 instanceof class299)) {
            return false;
        }
        class299 var3 = (class299) arg1;
        if (this.field4221 != var3.field4221) {
            return false;
        } else if (this.field4219 != var3.field4219) {
            return false;
        } else if (this.field4208 != var3.field4208) {
            return false;
        } else if (this.field4215 != var3.field4215) {
            return false;
        } else if (this.field4220 == var3.field4220) {
            if (arg0 > -17) {
                this.field4221 = -34;
            }
            if (this.field4211 == var3.field4211) {
                return this.field4210 == var3.field4210;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILkd;)V", line = 120)
    public static final void method1946(int arg0, class280 arg1) {
        if (arg0 != 0) {
            method1943(108);
        }
        field4216++;
        class231 var2 = (class231) class402.field5703.method1180((byte) 26, (long) arg1.field7958);
        if (var2 == null) {
            class209.method1283(null, arg1.field8015[0], 0, arg1, arg1.field1266, arg1.field8009[0], arg0 ^ 0x72, null);
        } else {
            var2.method1496(107);
        }
    }
}
