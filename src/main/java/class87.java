import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class87 implements class750 {

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "Ljo;")
    public static class353 field961 = new class353(4);

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "Lok;")
    public static class266 field970 = new class266();

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "F")
    public static float field969;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!haa", name = "n", descriptor = "Lws;")
    public static class377 field971;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "Z")
    public boolean field965;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)J", line = 3)
    public final long method654(int arg0) {
        if (arg0 != 31671) {
            field969 = -0.76592845F;
        }
        field959++;
        long[] var2 = class556.field7929;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field966 ^ var3) & 0xFFL)];
        long var7 = var2[(int) ((var5 ^ (long) (this.field962 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field962 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field960 >> 24)) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field960 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field960 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field960) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field967 ^ var17) & 0xFFL)];
        long var21 = var2[(int) ((var19 ^ (long) (this.field958 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field958 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) (((long) (this.field958 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) (((long) this.field958 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field963) & 0xFFL)];
        return var2[(int) ((var29 ^ (long) (this.field965 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V", line = 44)
    public static void method655(byte arg0) {
        field961 = null;
        field970 = null;
        field971 = null;
        if (arg0 <= 5) {
            method655((byte) 63);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 56)
    public static final void method656(int arg0, boolean arg1, String arg2) {
        field964++;
        int var3 = class514.field7278;
        int[] var4 = class522.field7381;
        boolean var5 = false;
        if (!arg1) {
            field961 = null;
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class702 var7 = class767.field10560[var4[var6]];
            if (var7 != null && class210.field3250 != var7 && var7.field9768 != null && var7.field9768.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg0 == 1) {
                    class653.field9118++;
                    class312 var8 = class353.method2245(field971, class565.field8017, (byte) 115);
                    var8.field4445.method2997(0, 13855);
                    var8.field4445.method2992((byte) 127, var4[var6]);
                    class208.method1440(var8, 106);
                } else if (arg0 == 4) {
                    class309.field4417++;
                    class312 var9 = class353.method2245(field971, class726.field10035, (byte) 25);
                    var9.field4445.method2969(var4[var6], -414819352);
                    var9.field4445.method2981((byte) -96, 0);
                    class208.method1440(var9, 43);
                } else if (arg0 == 5) {
                    class371.field5138++;
                    class312 var10 = class353.method2245(field971, class116.field1771, (byte) 82);
                    var10.field4445.method2990(255, var4[var6]);
                    var10.field4445.method2994(0, (byte) -72);
                    class208.method1440(var10, 114);
                } else if (arg0 == 6) {
                    class505.field7174++;
                    class312 var11 = class353.method2245(field971, class300.field4327, (byte) 121);
                    var11.field4445.method2992((byte) 127, var4[var6]);
                    var11.field4445.method2994(0, (byte) -72);
                    class208.method1440(var11, 46);
                } else if (arg0 == 7) {
                    class580.field8196++;
                    class312 var12 = class353.method2245(field971, class156.field2305, (byte) 63);
                    var12.field4445.method2994(0, (byte) -72);
                    var12.field4445.method2990(255, var4[var6]);
                    class208.method1440(var12, 95);
                } else if (arg0 == 9) {
                    class312 var13 = class353.method2245(field971, class66.field800, (byte) 115);
                    var13.field4445.method2981((byte) -21, 0);
                    var13.field4445.method2969(var4[var6], -414819352);
                    class208.method1440(var13, 99);
                }
                break;
            }
        }
        if (!var5) {
            class227.method1550((byte) -67, 4, class620.field8682.method3580(class140.field2081, 12) + arg2);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ldr;I)Z", line = 164)
    public final boolean method657(class750 arg0, int arg1) {
        if (arg1 != 31022) {
            return true;
        }
        field968++;
        if (!(arg0 instanceof class87)) {
            return false;
        }
        class87 var3 = (class87) arg0;
        if (this.field966 != var3.field966) {
            return false;
        } else if (this.field962 != var3.field962) {
            return false;
        } else if (this.field960 != var3.field960) {
            return false;
        } else if (this.field967 != var3.field967) {
            return false;
        } else if (this.field958 != var3.field958) {
            return false;
        } else if (this.field963 == var3.field963) {
            return var3.field965 == this.field965;
        } else {
            return false;
        }
    }
}
