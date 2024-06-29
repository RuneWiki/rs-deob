import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class439 implements class400 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field6172;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public int field6173;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public int field6175;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public int field6177;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public int field6178;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public int field6180;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "Lpf;")
    public static class348 field6181;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Z")
    public boolean field6174;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)J", line = 5)
    public final long method2517(int arg0) {
        if (arg0 <= 109) {
            return 68L;
        }
        field6176++;
        long[] var2 = class343.field4679;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field6172 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field6178 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field6178) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field6175 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) ((var11 ^ (long) (this.field6175 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field6175 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field6175 ^ var15) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field6173 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field6180 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field6180 >> 16)) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field6180 >> 8)) & 0xFFL)];
        long var27 = var2[(int) (((long) this.field6180 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field6177 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field6174 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILt;)Z", line = 42)
    public final boolean method2518(int arg0, class400 arg1) {
        field6179++;
        if (!(arg1 instanceof class439)) {
            return false;
        }
        class439 var3 = (class439) arg1;
        if (this.field6172 != var3.field6172) {
            return false;
        } else if (this.field6178 != var3.field6178) {
            return false;
        } else if (this.field6175 != var3.field6175) {
            return false;
        } else if (this.field6173 != var3.field6173) {
            return false;
        } else if (this.field6180 != var3.field6180) {
            return false;
        } else if (this.field6177 != var3.field6177) {
            return false;
        } else if (this.field6174 == var3.field6174) {
            if (arg0 != -4857) {
                this.method2518(-2, (class400) null);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 87)
    public static void method2758(byte arg0) {
        field6181 = null;
        if (arg0 < 106) {
            field6181 = null;
        }
    }
}
