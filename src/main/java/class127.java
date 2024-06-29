import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class127 extends class32 {

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "Z")
    private boolean field2724 = false;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "Z")
    private volatile boolean field2725 = false;

    @OriginalMember(owner = "client!ob", name = "qb", descriptor = "I")
    private int field2735 = -1;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "Ls;")
    private class161 field2711;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    private int field2721;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "Ls;")
    private class161 field2717;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "Ljava/util/zip/CRC32;")
    private static CRC32 field2715 = new CRC32();

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "Lea;")
    public static class38 field2731 = class9.method46((byte) 119, "rect_debug=");

    @OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
    public static int field2736 = 0;

    @OriginalMember(owner = "client!ob", name = "sb", descriptor = "Lea;")
    public static class38 field2737 = class9.method46((byte) 118, "Clientscript error in: ");

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!ob", name = "nb", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!ob", name = "ob", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ob", name = "pb", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "Ldb;")
    public static class30 field2720;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "[Z")
    private volatile boolean[] field2716;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "[Z")
    public static boolean[] field2728;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(II)I")
    private final int method939(int arg0, int arg1) {
        ++field2723;
        if (super.field647[arg1] != null) {
            return 100;
        } else if (arg0 != -1) {
            return 87;
        } else {
            return this.field2716[arg1] ? 100 : class136.method988(-44866364, arg1, this.field2721);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IB)V")
    public final void method201(int arg0, byte arg1) {
        if (arg1 >= -42) {
            this.field2711 = null;
        }
        ++field2730;
        class197.method1300(arg0, this.field2721, (byte) 3);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)V")
    public final void method202(int arg0, int arg1) {
        ++field2733;
        if (this.field2717 != null && this.field2716 != null && this.field2716[arg0]) {
            class187.method1257(this.field2717, arg0, this, false);
        } else {
            class41.method305(true, arg0, super.field646[arg0], arg1 + -1350430543, this, (byte) 2, this.field2721);
        }
        if (arg1 != -1) {
            this.field2721 = -31;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ls;Ls;IZZZ)V")
    public class127(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2724 = arg5;
        this.field2711 = arg1;
        this.field2721 = arg2;
        this.field2717 = arg0;
        class192.method1280(10684, this.field2721, this);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)I")
    public final int method940(byte arg0) {
        ++field2714;
        if (this.field2725) {
            return 100;
        } else if (super.field647 != null) {
            return 99;
        } else {
            if (arg0 <= 47) {
                field2728 = null;
            }
            int var2 = class136.method988(-44866364, this.field2721, 255);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)I")
    public final int method941(byte arg0) {
        int var2 = 0;
        ++field2726;
        int var3 = 0;
        for (int var4 = 0; var4 < super.field647.length; ++var4) {
            if (super.field625[var4] > 0) {
                var3 += this.method939(-1, var4);
                var2 += 100;
            }
        }
        if (arg0 != -16) {
            this.method942(95, (byte) -83, (byte[]) null, true, true);
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB[BZZ)V")
    public final void method942(int arg0, byte arg1, byte[] arg2, boolean arg3, boolean arg4) {
        ++field2710;
        if (arg1 == 97) {
            if (!arg3) {
                arg2[arg2.length + -2] = (byte) (super.field632[arg0] >> 8);
                arg2[arg2.length + -1] = (byte) super.field632[arg0];
                if (this.field2717 != null) {
                    class7.method41(true, arg2, arg0, this.field2717);
                    this.field2716[arg0] = true;
                }
                if (arg4) {
                    super.field647[arg0] = class202.method1327(false, arg2, (byte) 2);
                    return;
                }
            } else {
                if (this.field2725) {
                    throw new RuntimeException();
                }
                if (this.field2711 != null) {
                    class7.method41(true, arg2, this.field2721, this.field2711);
                }
                this.method193(arg2, 29725);
                this.method946(99);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2731 = null;
        if (arg0 == 11729) {
            field2737 = null;
            field2715 = null;
            field2720 = null;
            field2728 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)V")
    public final void method944(byte arg0, int arg1, int arg2) {
        if (arg0 > -61) {
            this.field2734 = -35;
        }
        this.field2734 = arg2;
        ++field2729;
        this.field2732 = arg1;
        if (this.field2711 == null) {
            class41.method305(true, this.field2721, this.field2732, -1350430544, this, (byte) 0, 255);
        } else {
            class187.method1257(this.field2711, this.field2721, this, false);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBLdd;)[Lfa;")
    public static final class47[] method945(int arg0, int arg1, byte arg2, class32 arg3) {
        if (arg2 != 0) {
            return null;
        } else {
            ++field2713;
            return !class74.method592(arg1, arg3, (byte) 124, arg0) ? null : class140.method1006(arg2 ^ -5048);
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    private final void method946(int arg0) {
        this.field2716 = new boolean[super.field647.length];
        int var2 = 0;
        if (arg0 > 82) {
            while (this.field2716.length > var2) {
                this.field2716[var2] = false;
                ++var2;
            }
            ++field2719;
            if (this.field2717 == null) {
                this.field2725 = true;
            } else {
                this.field2735 = -1;
                for (int var3 = 0; ~this.field2716.length < ~var3; ++var3) {
                    if (super.field625[var3] > 0) {
                        class95.method796(var3, this, this.field2717, 1);
                        this.field2735 = var3;
                    }
                }
                if (~this.field2735 == 0) {
                    this.field2725 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZILs;[B)V")
    public final void method947(int arg0, boolean arg1, int arg2, class161 arg3, byte[] arg4) {
        ++field2718;
        int var6 = 13 / ((arg2 - 47) / 42);
        if (this.field2711 == arg3) {
            if (this.field2725) {
                throw new RuntimeException();
            } else if (arg4 == null) {
                class41.method305(true, this.field2721, this.field2732, -1350430544, this, (byte) 0, 255);
            } else {
                field2715.reset();
                field2715.update(arg4, 0, arg4.length);
                int var7 = (int) field2715.getValue();
                class66 var8 = new class66(class95.method795(arg4, (byte) 106));
                int var9 = var8.method509(116);
                if (var9 != 5 && var9 != 6) {
                    throw new RuntimeException("Incorrect JS5 protocol number: " + var9);
                } else {
                    int var10 = 0;
                    if (var9 >= 6) {
                        var10 = var8.method464(-32);
                    }
                    if (~this.field2732 == ~var7 && ~this.field2734 == ~var10) {
                        this.method193(arg4, 29725);
                        this.method946(119);
                    } else {
                        class41.method305(true, this.field2721, this.field2732, -1350430544, this, (byte) 0, 255);
                    }
                }
            }
        } else {
            if (!arg1 && this.field2735 == arg0) {
                this.field2725 = true;
            }
            if (arg4 != null && arg4.length > 2) {
                field2715.reset();
                field2715.update(arg4, 0, arg4.length - 2);
                int var11 = (int) field2715.getValue();
                int var12 = (arg4[arg4.length + -2] << 8 & 65280) - -(arg4[arg4.length - 1] & 255);
                if (super.field646[arg0] == var11 && super.field632[arg0] == var12) {
                    this.field2716[arg0] = true;
                    if (arg1) {
                        super.field647[arg0] = class202.method1327(false, arg4, (byte) 2);
                    }
                } else {
                    this.field2716[arg0] = false;
                    if (this.field2724 || arg1) {
                        class41.method305(arg1, arg0, super.field646[arg0], -1350430544, this, (byte) 2, this.field2721);
                    }
                }
            } else {
                this.field2716[arg0] = false;
                if (this.field2724 || arg1) {
                    class41.method305(arg1, arg0, super.field646[arg0], -1350430544, this, (byte) 2, this.field2721);
                }
            }
        }
    }
}
