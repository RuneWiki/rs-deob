import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class299 implements class630 {

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lea;")
    public static class547 field4015 = new class547(120, -1);

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public int field4021;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Lafa;")
    public static class348 field4020;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "Z")
    public boolean field4024;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1791(int arg0, int arg1, int arg2, int arg3) {
        class194.field2324.method36(arg1, arg2, arg0, class175.field2162);
        field4016++;
        int var4 = class175.field2162[2];
        if (var4 < 50) {
            return false;
        } else {
            class175.field2162[1] = class175.field2162[1] * class449.field6273 / var4 + class593.field8261;
            class175.field2162[2] = var4;
            class175.field2162[arg3] = class175.field2162[0] * class729.field10177 / var4 + class427.field6030;
            return true;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)J")
    public final long method1792(boolean arg0) {
        field4019++;
        long[] var2 = class723.field10105;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field4017 ^ var3) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field4013 >> 8)) & 0xFFL)];
        long var9 = var2[(int) (((long) this.field4013 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field4018 >> 24)) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field4018 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field4018 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field4018) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field4021 ^ var17) & 0xFFL)];
        long var21 = var2[(int) (((long) (this.field4023 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) (((long) (this.field4023 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field4023 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field4023 ^ var25) & 0xFFL)];
        long var29 = var2[(int) ((var27 ^ (long) this.field4014) & 0xFFL)] ^ var27 >>> 8;
        long var31 = var29 >>> 8 ^ var2[(int) (((long) (this.field4024 ? 1 : 0) ^ var29) & 0xFFL)];
        if (!arg0) {
            method1795(null, -115, '$');
        }
        return var31;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILsn;)Z")
    public final boolean method1793(int arg0, class630 arg1) {
        field4022++;
        if (!(arg1 instanceof class299)) {
            return false;
        }
        class299 var3 = (class299) arg1;
        if (this.field4017 != var3.field4017) {
            return false;
        } else if (this.field4013 != var3.field4013) {
            return false;
        } else if (this.field4018 != var3.field4018) {
            return false;
        } else if (this.field4021 != var3.field4021) {
            return false;
        } else if (this.field4023 != var3.field4023) {
            return false;
        } else if (this.field4014 == var3.field4014) {
            if (arg0 != 22000) {
                this.field4017 = -99;
            }
            return this.field4024 == var3.field4024;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public static void method1794(int arg0) {
        field4015 = null;
        field4020 = null;
        int var1 = 127 % ((arg0 + 9) / 46);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;IC)I")
    public static final int method1795(String arg0, int arg1, char arg2) {
        field4012++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg0.charAt(var5)) {
                var3++;
            }
        }
        if (arg1 < 10) {
            method1794(61);
        }
        return var3;
    }
}
