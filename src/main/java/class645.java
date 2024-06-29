import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class645 implements class228 {

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
    public static int[] field9066 = new int[8];

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
    public static int[] field9067 = new int[2];

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field9071 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field9060;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public int field9062;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field9064;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public int field9065;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public int field9068;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public int field9072;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Z")
    public boolean field9070;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLkw;)Z", line = 9)
    public final boolean method1677(byte arg0, class228 arg1) {
        field9061++;
        if (!(arg1 instanceof class645)) {
            return false;
        }
        class645 var3 = (class645) arg1;
        if (this.field9064 != var3.field9064) {
            return false;
        } else if (this.field9062 != var3.field9062) {
            return false;
        } else if (this.field9068 != var3.field9068) {
            return false;
        } else if (this.field9065 != var3.field9065) {
            return false;
        } else if (this.field9072 != var3.field9072) {
            return false;
        } else if (this.field9060 == var3.field9060) {
            if (arg0 != -11) {
                this.field9060 = -91;
            }
            return this.field9070 == var3.field9070;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZB)V", line = 57)
    public static final void method3734(boolean arg0, byte arg1) {
        field9063++;
        class636.method3698(true);
        if (!class650.method3744(-13, class682.field9564)) {
            return;
        }
        if (arg1 != 35) {
            field9066 = null;
        }
        class159.field2722++;
        if (class159.field2722 < 50 && !arg0) {
            return;
        }
        class159.field2722 = 0;
        if (!class628.field8864 && class499.field7329 != null) {
            class162.field2743++;
            class165 var2 = class271.method1917(class420.field6424, (byte) -47, class470.field6968);
            class642.method3726(-684096285, var2);
            try {
                class132.method1151(arg1 - 35);
            } catch (IOException var3) {
                class628.field8864 = true;
            }
        }
        class636.method3698(true);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 91)
    public static void method3735(int arg0) {
        field9066 = null;
        field9067 = null;
        if (arg0 != 255) {
            method3734(false, (byte) -60);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Lcs;", line = 104)
    public static final class313 method3736(int arg0, int arg1, int arg2) {
        class252 var3 = class454.field6818[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class313 var4 = var3.field4034;
            var3.field4034 = null;
            class200.method1554(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)J", line = 124)
    public final long method1678(int arg0) {
        field9069++;
        long[] var2 = class114.field1792;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field9064) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field9062 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field9062) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field9068 >> 24)) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field9068 >> 16) ^ var11) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field9068 >> 8) ^ var13) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field9068) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field9065 ^ var17) & 0xFFL)];
        long var21 = var2[(int) (((long) (this.field9072 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field9072 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field9072 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field9072) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field9060) & 0xFFL)] ^ var27 >>> 8;
        long var31 = var29 >>> 8 ^ var2[(int) (((long) (this.field9070 ? 1 : 0) ^ var29) & 0xFFL)];
        return arg0 == 9640 ? var31 : 2L;
    }
}
