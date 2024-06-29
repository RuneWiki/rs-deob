import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class90 extends class51 {

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
    private int field2059 = 1;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    private int field2051 = 0;

    @OriginalMember(owner = "client!ka", name = "ob", descriptor = "I")
    private int field2066 = 0;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    public static int field2056 = 0;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lea;")
    public static class38 field2053 = class9.method46((byte) 113, "Hidden)2use");

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "Lea;")
    private static class38 field2058 = class9.method46((byte) 112, "Select a world");

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "Lea;")
    public static class38 field2061 = field2058;

    @OriginalMember(owner = "client!ka", name = "nb", descriptor = "Lea;")
    public static class38 field2065 = class9.method46((byte) 114, "<br>");

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ka", name = "lb", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!ka", name = "mb", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!ka", name = "pb", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "Ldd;")
    public static class32 field2057;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field2060;
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            int var4 = class170.field3490[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class86.field2008; ++var6) {
                int var7 = class196.field3854[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field2051 != 0) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) (var9 / 4096)) * 4096.0D);
                    var11 = (int) ((double) (this.field2059 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field2059;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field2066 != 0) {
                    if (~this.field2066 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class29.field581[(var12 & 4083) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 >= -125) {
            method758(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V")
    public static final void method758(boolean arg0) {
        class165.field3418 = null;
        if (arg0) {
            class25.field513 = null;
            class150.field3101 = null;
            class148.field3080 = null;
            class30.field605 = null;
            class10.field227 = null;
            ++field2062;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)Z")
    public static final boolean method759(byte arg0) {
        ++field2067;
        if (arg0 != 22) {
            return false;
        } else {
            try {
                if (~class45.field1104 == -3) {
                    if (class106.field2397 == null) {
                        class106.field2397 = class142.method1029(class196.field3860, class8.field189, class52.field1340);
                        if (class106.field2397 == null) {
                            return false;
                        }
                    }
                    if (class50.field1249 == null) {
                        class50.field1249 = new class172(class152.field3150, class123.field2626);
                    }
                    if (class52.field1336.method546(class50.field1249, class106.field2397, class125.field2690, true, 22050)) {
                        class52.field1336.method545(114);
                        class52.field1336.method544(class105.field2350, (byte) 115);
                        class52.field1336.method529(class106.field2397, (byte) 101, class92.field2083);
                        class196.field3860 = null;
                        class106.field2397 = null;
                        class45.field1104 = 0;
                        class50.field1249 = null;
                        return true;
                    }
                }
            } catch (Exception var2) {
                var2.printStackTrace();
                class52.field1336.method523(127);
                class45.field1104 = 0;
                class50.field1249 = null;
                class106.field2397 = null;
                class196.field3860 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZII)V")
    public static final void method760(boolean arg0, int arg1, int arg2) {
        ++class176.field3558;
        ++field2054;
        class111.field2483.method169(-1494101117, 64);
        class111.field2483.method493(arg1, false);
        class111.field2483.method497(arg0, arg2);
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class90() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)V")
    public static void method761(int arg0) {
        field2053 = null;
        if (arg0 <= 99) {
            field2056 = 47;
        }
        field2057 = null;
        field2058 = null;
        field2061 = null;
        field2065 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method761(-124);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 3) {
                    this.field2059 = arg0.method509(124);
                }
            } else {
                this.field2066 = arg0.method509(118);
            }
        } else {
            this.field2051 = arg0.method509(116);
        }
        ++field2055;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        class165.method1177(113);
        if (arg0 != -2) {
            method760(false, 24, -61);
        }
        ++field2063;
    }
}
