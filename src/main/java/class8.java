import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 implements class688 {

    @OriginalMember(owner = "client!to", name = "h", descriptor = "Z")
    public static boolean field102 = false;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "Log;")
    public static class651 field103 = new class651();

    @OriginalMember(owner = "client!to", name = "n", descriptor = "Z")
    public static boolean field108 = false;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Lqe;")
    public static class469 field105 = new class469(60, 6);

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Z")
    public boolean field97;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILvm;)Z", line = 6)
    public final boolean method50(int arg0, class688 arg1) {
        field99++;
        if (arg0 != -6508) {
            this.field106 = 58;
        }
        if (!(arg1 instanceof class8)) {
            return false;
        }
        class8 var3 = (class8) arg1;
        if (this.field101 != var3.field101) {
            return false;
        } else if (this.field109 != var3.field109) {
            return false;
        } else if (this.field104 != var3.field104) {
            return false;
        } else if (this.field95 != var3.field95) {
            return false;
        } else if (this.field106 != var3.field106) {
            return false;
        } else if (this.field107 == var3.field107) {
            return this.field97 == var3.field97;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()V", line = 49)
    public static final void method51() {
        class492.method2935(1, class409.field6165);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)J", line = 55)
    public final long method52(byte arg0) {
        field96++;
        long[] var2 = class118.field1615;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field101) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field109 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) (((long) this.field109 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field104 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field104 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field104 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field104) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field95 ^ var17) & 0xFFL)];
        if (arg0 != 31) {
            return 113L;
        }
        long var21 = var2[(int) ((var19 ^ (long) (this.field106 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field106 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field106 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field106) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field107) & 0xFFL)];
        return var2[(int) (((long) (this.field97 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V", line = 86)
    public static void method53(byte arg0) {
        if (arg0 == -47) {
            field105 = null;
            field103 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)Ljava/lang/String;", line = 108)
    public static final String method54(byte arg0) {
        if (arg0 > -39) {
            method51();
        }
        field100++;
        return class483.field6967 || class456.field6722 == null ? "" : class456.field6722.field4966;
    }
}
