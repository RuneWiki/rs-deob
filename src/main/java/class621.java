import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public abstract class class621 extends class61 {

    @OriginalMember(owner = "client!et", name = "N", descriptor = "S")
    public short field8524;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "Lhj;")
    public static class596 field8521 = new class596(95, 12);

    @OriginalMember(owner = "client!et", name = "P", descriptor = "Lfj;")
    public static class684 field8526 = new class684(12, 7);

    @OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
    public static int field8527 = 7000;

    @OriginalMember(owner = "client!et", name = "R", descriptor = "I")
    public static int field8528 = field8527;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "Loga;")
    public static class500 field8525;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "[Ls;")
    public static class296[] field8523;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II[BBII)V", line = 4)
    public static final void method3536(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 1) {
            method3538((Component) null, -26, (class675) null, -106, -12);
        }
        ++field8520;
        if (~arg0 < ~arg4) {
            int var6 = arg4 + arg5;
            int var7 = arg0 - arg4 >> 2;
            while (true) {
                --var7;
                if (var7 < 0) {
                    int var8 = arg0 - arg4 & 3;
                    while (true) {
                        --var8;
                        if (var8 < 0) {
                            return;
                        }
                        arg2[var6++] = 1;
                    }
                }
                arg2[var6++] = 1;
                arg2[var6++] = 1;
                arg2[var6++] = 1;
                arg2[var6++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lha;B)Z", line = 36)
    public final boolean method523(class66 arg0, byte arg1) {
        ++field8517;
        int var3 = 107 % ((arg1 - 18) / 55);
        return class506.method3033(super.field823 >> class714.field10017, super.field813 >> class714.field10017, -91, super.field811, this);
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)Z", line = 47)
    public final boolean method529(int arg0) {
        if (arg0 != -31509) {
            return true;
        } else {
            ++field8518;
            return class308.field3820[(super.field823 >> class714.field10017) - class463.field6493 - -class573.field7852][(super.field813 >> class714.field10017) + class573.field7852 + -class619.field8331];
        }
    }

    @OriginalMember(owner = "client!et", name = "h", descriptor = "(I)V", line = 59)
    public static void method3537(int arg0) {
        field8521 = null;
        field8523 = null;
        field8526 = null;
        if (arg0 != 1) {
            method3538((Component) null, 93, (class675) null, 59, 15);
        }
        field8525 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Component;ILlc;II)Lnj;", line = 74)
    public static final class260 method3538(Component arg0, int arg1, class675 arg2, int arg3, int arg4) {
        ++field8522;
        if (~class478.field6632 == -1) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (~arg4 > -257) {
                arg4 = 256;
            }
            try {
                class260 var5 = (class260) Class.forName("ega").newInstance();
                var5.field3098 = arg4;
                var5.field3083 = new int[(class270.field3189 ? 2 : 1) * 256];
                var5.method1361(arg0);
                var5.field3109 = (-1024 & arg4) + 1024;
                if (arg1 != 1) {
                    return null;
                } else {
                    if (var5.field3109 > 16384) {
                        var5.field3109 = 16384;
                    }
                    var5.method1359(var5.field3109);
                    if (class140.field1752 > 0 && class615.field8269 == null) {
                        class615.field8269 = new class5();
                        class615.field8269.field57 = arg2;
                        arg2.method3805(class140.field1752, 68, class615.field8269);
                    }
                    if (class615.field8269 != null) {
                        if (class615.field8269.field59[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class615.field8269.field59[arg3] = var5;
                    }
                    return var5;
                }
            } catch (Throwable var8) {
                try {
                    class220 var6 = new class220(arg2, arg3);
                    var6.field3098 = arg4;
                    var6.field3083 = new int[256 * (!class270.field3189 ? 1 : 2)];
                    var6.method1361(arg0);
                    var6.field3109 = 16384;
                    var6.method1359(var6.field3109);
                    if (~class140.field1752 < -1 && class615.field8269 == null) {
                        class615.field8269 = new class5();
                        class615.field8269.field57 = arg2;
                        arg2.method3805(class140.field1752, 122, class615.field8269);
                    }
                    if (class615.field8269 != null) {
                        if (class615.field8269.field59[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class615.field8269.field59[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class260();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B[Lkp;)I", line = 160)
    public final int method528(byte arg0, class515[] arg1) {
        ++field8519;
        int var3 = super.field823 >> class714.field10017;
        int var4 = super.field813 >> class714.field10017;
        int var5 = 0;
        if (class463.field6493 != var3) {
            if (~class463.field6493 > ~var3) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (class619.field8331 == var4) {
            var5 += 3;
        } else if (class619.field8331 > var4) {
            var5 += 6;
        }
        int var6 = class41.field572[var5];
        if ((this.field8524 & var6) != 0) {
            return this.method525(var4, var3, (byte) -123, arg1);
        } else if (~this.field8524 == -2 && var3 > 0) {
            return this.method525(var4, var3 - 1, (byte) -119, arg1);
        } else if (this.field8524 == 4 && ~var3 >= ~class307.field3799) {
            return this.method525(var4, var3 - -1, (byte) -122, arg1);
        } else if (~this.field8524 == -9 && var4 > 0) {
            return this.method525(var4 + -1, var3, (byte) -116, arg1);
        } else if (this.field8524 == 2 && ~class250.field2938 <= ~var4) {
            return this.method525(var4 + 1, var3, (byte) -118, arg1);
        } else if (this.field8524 == 16 && var3 > 0 && var4 <= class250.field2938) {
            return this.method525(var4 + 1, var3 + -1, (byte) -113, arg1);
        } else if (this.field8524 == 32 && ~class307.field3799 <= ~var3 && class250.field2938 >= var4) {
            return this.method525(var4 + 1, var3 + 1, (byte) -122, arg1);
        } else if (arg0 != -48) {
            return -22;
        } else if (~this.field8524 == -129 && var3 > 0 && var4 > 0) {
            return this.method525(var4 + -1, var3 + -1, (byte) -119, arg1);
        } else if (~this.field8524 == -65 && var3 <= class307.field3799 && var4 > 0) {
            return this.method525(var4 - 1, var3 + 1, (byte) -111, arg1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIII)V", line = 245)
    public class621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8524 = (short) arg5;
        super.field813 = arg2;
        super.field823 = arg0;
        super.field809 = arg1;
        super.field811 = (byte) arg4;
        super.field808 = (byte) arg3;
    }
}
