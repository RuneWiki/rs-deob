import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class550 {

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field7439 = -1;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
    public static int[] field7436;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "[[B")
    public static byte[][] field7434;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method3091(int arg0, int arg1) {
        field7438++;
        if (~arg1 == arg0 && class592.field8293 > 0) {
            byte[] var2 = class148.field2195[--class592.field8293];
            class148.field2195[class592.field8293] = null;
            return var2;
        } else if (arg1 == 5000 && class633.field8767 > 0) {
            byte[] var3 = class409.field5811[--class633.field8767];
            class409.field5811[class633.field8767] = null;
            return var3;
        } else if (arg1 == 30000 && class496.field6751 > 0) {
            byte[] var4 = class562.field7593[--class496.field6751];
            class562.field7593[class496.field6751] = null;
            return var4;
        } else {
            if (class44.field541 != null) {
                for (int var5 = 0; var5 < class342.field4592.length; var5++) {
                    if (class342.field4592[var5] == arg1 && class616.field8606[var5] > 0) {
                        byte[] var6 = class44.field541[var5][--class616.field8606[var5]];
                        class44.field541[var5][class616.field8606[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z[B)V")
    public static final synchronized void method3092(boolean arg0, byte[] arg1) {
        field7441++;
        if (!arg0) {
            method3094(true, 2);
        }
        if (arg1.length == 100 && class592.field8293 < 1000) {
            class148.field2195[class592.field8293++] = arg1;
        } else if (arg1.length == 5000 && class633.field8767 < 250) {
            class409.field5811[class633.field8767++] = arg1;
        } else if (arg1.length == 30000 && class496.field6751 < 50) {
            class562.field7593[class496.field6751++] = arg1;
        } else if (class44.field541 != null) {
            for (int var2 = 0; var2 < class342.field4592.length; var2++) {
                if (class342.field4592[var2] == arg1.length && class44.field541[var2].length > class616.field8606[var2]) {
                    class44.field541[var2][class616.field8606[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public static void method3093(byte arg0) {
        field7436 = null;
        field7434 = null;
        if (arg0 < 108) {
            method3093((byte) -60);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZI)I")
    public static final int method3094(boolean arg0, int arg1) {
        field7435++;
        if (!arg0) {
            method3091(-24, -74);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lsea;II)Lvk;")
    public static final class336 method3095(class648 arg0, int arg1, int arg2) {
        field7437++;
        byte[] var3 = arg0.method3632(true, arg2);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -5001) {
                method3092(false, null);
            }
            return new class336(var3);
        }
    }
}
