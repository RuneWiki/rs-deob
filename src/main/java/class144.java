import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class144 extends class189 {

    @OriginalMember(owner = "client!q", name = "nb", descriptor = "I")
    private int field3086 = 0;

    @OriginalMember(owner = "client!q", name = "pb", descriptor = "I")
    private int field3088 = 4096;

    @OriginalMember(owner = "client!q", name = "lb", descriptor = "Lgg;")
    public static class63 field3084 = class116.method911(43, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!q", name = "ob", descriptor = "[I")
    public static int[] field3087 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!q", name = "kb", descriptor = "Lgg;")
    public static class63 field3083 = class116.method911(43, "logo");

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!q", name = "mb", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!q", name = "jb", descriptor = "Lmc;")
    public static class111 field3082;

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "Z")
    public static boolean field3080;

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class144() {
        super(1, true);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V")
    public static void method1025(byte arg0) {
        field3084 = null;
        field3083 = null;
        if (arg0 != -30) {
            method1025((byte) -51);
        }
        field3087 = null;
        field3082 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg0 != 0) {
            field3080 = true;
        }
        ++field3081;
        int[] var3 = super.field3825.method681(arg1, (byte) -127);
        if (super.field3825.field1840) {
            int[] var4 = this.method1245(0, arg1, 11433);
            for (int var5 = 0; var5 < class54.field1430; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field3086 >= ~var6 && var6 <= this.field3088 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(BI)Z")
    public static final boolean method1026(byte arg0, int arg1) {
        ++field3085;
        if (class14.field332[arg1]) {
            return true;
        } else if (!class90.field2104.method750(arg1, true)) {
            return false;
        } else {
            int var2 = class90.field2104.method759(arg1, false);
            if (~var2 == -1) {
                class14.field332[arg1] = true;
                return true;
            } else {
                if (class23.field539[arg1] == null) {
                    class23.field539[arg1] = new class54[var2];
                }
                for (int var3 = 0; ~var2 < ~var3; ++var3) {
                    if (class23.field539[arg1][var3] == null) {
                        byte[] var4 = class90.field2104.method745(arg1, var3, 0);
                        if (var4 != null) {
                            class23.field539[arg1][var3] = new class54();
                            class23.field539[arg1][var3].field1323 = (arg1 << 16) + var3;
                            if (var4[0] == -1) {
                                class23.field539[arg1][var3].method538((byte) -125, new class3(var4));
                            } else {
                                class23.field539[arg1][var3].method535(new class3(var4), (byte) 105);
                            }
                        }
                    }
                }
                if (arg0 >= -123) {
                    field3080 = true;
                }
                class14.field332[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 < 32) {
            this.method77(-44, (byte) 96, (class3) null);
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field3088 = arg2.method46((byte) 65);
            }
        } else {
            this.field3086 = arg2.method46((byte) 65);
        }
        ++field3079;
    }
}
