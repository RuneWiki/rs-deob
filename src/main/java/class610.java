import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class610 {

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public int field8139 = 0;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public int field8142 = 0;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Lqr;")
    private class65 field8138 = new class65(64);

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Ldea;")
    private class249 field8143 = null;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Lwu;")
    private class376 field8135;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lwu;")
    private class376 field8140;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "F")
    public static float field8133;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lkg;JB[I)Ljava/lang/String;", line = 4)
    public final String method3325(class275 arg0, long arg1, byte arg2, int[] arg3) {
        field8136++;
        if (this.field8143 != null) {
            String var6 = this.field8143.method1529(arg3, arg1, -7751, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg2 >= -56) {
            this.field8142 = 65;
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILwu;Lwu;Ldea;)V", line = 135)
    public class610(int arg0, class376 arg1, class376 arg2, class249 arg3) {
        this.field8143 = arg3;
        this.field8135 = arg1;
        this.field8140 = arg2;
        if (this.field8135 != null) {
            this.field8142 = this.field8135.method2195(1, 0);
        }
        if (this.field8140 != null) {
            this.field8139 = this.field8140.method2195(1, 0);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)Lwg;", line = 40)
    public final class430 method3326(boolean arg0, int arg1) {
        field8141++;
        class430 var3 = (class430) this.field8138.method552(4, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field8135.method2218((byte) 126, 1, arg1);
        } else {
            var4 = this.field8140.method2218((byte) 121, 1, arg1 & 0x7FFF);
        }
        class430 var5 = new class430();
        var5.field5933 = this;
        if (var4 != null) {
            var5.method2479(new class677(var4), (byte) 108);
        }
        if (arg1 >= 32768) {
            var5.method2478((byte) -109);
        }
        if (arg0) {
            this.field8138.method556((byte) 0, (long) arg1, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I", line = 84)
    public static final int method3327(int arg0, int arg1) {
        field8137++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xF4) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg0 > -62) {
            method3327(-127, -77);
        }
        return 0;
    }
}
