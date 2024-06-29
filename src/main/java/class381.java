import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class381 extends class467 {

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "Lbv;")
    public class282 field5812;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "[Lnl;")
    public static class472[] field5806 = new class472[14];

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "S")
    public static short field5811 = 256;

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field5815 = new String[100];

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!mp", name = "y", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "J")
    public static long field5814;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "Z")
    public boolean field5808;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)I", line = 4)
    public int method1454(int arg0) {
        if (arg0 != 1) {
            field5811 = -44;
        }
        field5809++;
        return 0;
    }

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(I)V", line = 21)
    public static void method2364(int arg0) {
        field5815 = null;
        if (arg0 != 27869) {
            method2366((byte) -6, 103L);
        }
        field5806 = null;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)Z", line = 36)
    public final boolean method2365(byte arg0) {
        if (arg0 < 24) {
            field5815 = null;
        }
        field5807++;
        return false;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BJ)V", line = 55)
    public static final void method2366(byte arg0, long arg1) {
        if (arg0 != -6) {
            return;
        }
        field5805++;
        int var3 = class339.field5365.field2217 + class356.field5521;
        int var4 = class339.field5365.field2215 + class63.field894;
        if (class165.field2409 - var3 < -500 || (class165.field2409 - var3) > 500 || (class205.field2896 - var4) < -500 || (class205.field2896 - var4) > 500) {
            class165.field2409 = var3;
            class205.field2896 = var4;
        }
        if (class165.field2409 != var3) {
            int var5 = var3 - class165.field2409;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class165.field2409 += var6;
        }
        if (class205.field2896 != var4) {
            int var7 = var4 - class205.field2896;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class205.field2896 += var8;
        }
        if (!class96.field1399.field5229) {
            class99.field1428 += (float) arg1 * class128.field1809 / 6.0F;
            class482.field7022 += (float) arg1 * class186.field2619 / 6.0F;
        }
        class225.method1525(3);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lbv;)V", line = 159)
    public class381(class282 arg0) {
        this.field5812 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)Z", line = 169)
    public final boolean method2367(boolean arg0) {
        field5816++;
        return arg0 ? this.field5808 : false;
    }

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "(I)I", line = 180)
    public final int method2368(int arg0) {
        if (arg0 == 1) {
            field5813++;
            return 1;
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Z")
    public abstract boolean method1452(int arg0);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
    public abstract void method1453(int arg0, int arg1);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lwg;Lwg;II)V")
    public abstract void method1445(class393 arg0, class393 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "(I)Z")
    public abstract boolean method1451(int arg0);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
    public abstract void method1447(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V")
    public abstract void method1446(byte arg0);
}
