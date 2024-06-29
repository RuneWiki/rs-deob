import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class177 extends class238 {

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "Lim;")
    public static class598 field2797 = null;

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "[[I")
    public static int[][] field2801 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "Lrha;")
    public static class235 field2788 = new class235("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "F")
    public static float field2786;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "F")
    private float field2791;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "F")
    private float field2796;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "I")
    private int field2792;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!dfa", name = "C", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!dfa", name = "K", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "Ljava/lang/String;")
    private String field2784;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "Ljava/lang/String;")
    private String field2798;

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "Ljava/lang/String;")
    private String field2799;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLha;)V", line = 3)
    public static final void method1335(byte arg0, class66 arg1) {
        ++field2802;
        if (class573.field8161 != class235.field3379.field7391) {
            if (class325.field4448 != null) {
                if (class58.method412(-75, class235.field3379.field7391, arg1)) {
                    class573.field8161 = class235.field3379.field7391;
                }
                if (arg0 != 120) {
                    field2801 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 26)
    public static final String method1336(String arg0, byte arg1) {
        ++field2789;
        if (arg0 == null) {
            return null;
        } else {
            if (arg1 != 75) {
                method1336((String) null, (byte) 55);
            }
            int var2 = 0;
            int var3 = arg0.length();
            while (var2 < var3 && class451.method2616(arg0.charAt(var2), -21343)) {
                ++var2;
            }
            while (~var2 > ~var3 && class451.method2616(arg0.charAt(var3 - 1), -21343)) {
                --var3;
            }
            int var4 = var3 - var2;
            if (var4 >= 1 && var4 <= 12) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; ~var3 < ~var6; ++var6) {
                    char var7 = arg0.charAt(var6);
                    if (class307.method1964((byte) -112, var7)) {
                        char var8 = class639.method3561(arg1 ^ 29310, var7);
                        if (var8 != 0) {
                            var5.append(var8);
                        }
                    }
                }
                if (var5.length() == 0) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)F", line = 82)
    public final float method1337(int arg0) {
        if (arg0 <= 92) {
            this.method1343((byte) -127);
        }
        ++field2782;
        return this.field2791;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIB)Z", line = 95)
    public static final boolean method1338(int arg0, int arg1, byte arg2) {
        ++field2787;
        if (arg2 != 96) {
            method1342(-102);
        }
        return class154.method1209(arg1, (byte) 65, arg0) || class776.method4259(arg0, arg1, 3);
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 108)
    public class177(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V", line = 114)
    public final void method622(int arg0) {
        ++field2781;
        if (arg0 != 23586) {
            this.method1343((byte) -49);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)Ljava/lang/String;", line = 125)
    public final String method1339(int arg0) {
        ++field2795;
        if (arg0 != 128) {
            this.method1341(73);
        }
        return this.field2799;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIZLgj;)Lkc;", line = 141)
    public static final class145 method1340(int arg0, int arg1, boolean arg2, class662 arg3) {
        ++field2783;
        if (!arg2) {
            return null;
        } else {
            byte[] var4 = arg3.method3732(arg1, 8906, arg0);
            return var4 == null ? null : new class145(var4);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)F", line = 158)
    public final float method1341(int arg0) {
        if (arg0 != 114) {
            this.method1341(-31);
        }
        ++field2794;
        return this.field2796;
    }

    @OriginalMember(owner = "client!dfa", name = "g", descriptor = "(I)I", line = 171)
    public static final int method1342(int arg0) {
        ++field2790;
        if (arg0 != 2) {
            field2788 = null;
        }
        return class583.field8257;
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(B)Ljava/lang/String;", line = 190)
    public final String method1343(byte arg0) {
        if (arg0 > 0) {
            return null;
        } else {
            ++field2800;
            return this.field2798;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "h", descriptor = "(I)I", line = 202)
    public static final int method1344(int arg0) {
        ++field2793;
        if (class278.field3847 == 1) {
            return class663.field9209;
        } else {
            int var1 = -87 % ((-24 - arg0) / 57);
            return class747.field10318;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "(B)V", line = 217)
    public static void method1345(byte arg0) {
        if (arg0 > 125) {
            field2788 = null;
            field2797 = null;
            field2801 = null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V", line = 231)
    public final void method618(byte arg0, OggPacket arg1) {
        ++field2785;
        if (super.field3399 <= 0 || "SUB".equals(this.field2784)) {
            if (arg0 > 27) {
                class93 var3 = new class93(arg1.getData());
                int var4 = var3.method793((byte) 121);
                if (super.field3399 <= 8) {
                    if ((var4 | 128) == 0) {
                        throw new IllegalStateException();
                    }
                    if (super.field3399 == 0) {
                        var3.field1442 += 23;
                        this.field2803 = var3.method757(-117);
                        this.field2792 = var3.method757(-87);
                        if (this.field2803 != 0 && this.field2792 != 0) {
                            class93 var5 = new class93(16);
                            var3.method737(-32768, var5.field1413, 0, 16);
                            this.field2799 = var5.method752(0);
                            var5.field1442 = 0;
                            var3.method737(-32768, var5.field1413, 0, 16);
                            this.field2784 = var5.method752(0);
                            return;
                        }
                        throw new IllegalStateException();
                    }
                } else {
                    if (~var4 == -1) {
                        long var6 = var3.method747(true);
                        long var8 = var3.method747(true);
                        long var10 = var3.method747(true);
                        if (var6 < 0L || var8 < 0L || ~var10 > -1L || ~var6 > ~var10) {
                            throw new IllegalStateException();
                        }
                        this.field2796 = (float) ((var6 + var8) * (long) this.field2792) / (float) this.field2803;
                        this.field2791 = (float) ((long) this.field2792 * var6) / (float) this.field2803;
                        int var12 = var3.method757(-128);
                        if (~var12 > -1 || ~(var3.field1413.length - var3.field1442) > ~var12) {
                            throw new IllegalStateException();
                        }
                        this.field2798 = class554.method3193(258048, var3.field1442, var3.field1413, var12);
                    }
                    if ((128 | var4) != 0) {
                        return;
                    }
                }
            }
        }
    }
}
