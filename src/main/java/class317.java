import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class317 extends class213 {

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4681 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Ljava/lang/String;")
    public String field4672;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "[C")
    public char[] field4674;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "[C")
    public char[] field4678;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "[I")
    public int[] field4669;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "[I")
    public int[] field4673;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "[I")
    public static int[] field4680;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLfd;)V", line = 7)
    public final void method2188(byte arg0, class299 arg1) {
        while (true) {
            int var3 = arg1.method2096((byte) -122);
            if (var3 == 0) {
                if (arg0 != -19) {
                    return;
                }
                field4675++;
                return;
            }
            this.method2195(-1, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIZII)V", line = 26)
    public static final void method2189(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class48.field642 = arg6;
        class55.field712 = arg1;
        class223.field3219 = arg2;
        if (arg5 != 0) {
            method2189(6, 117, 100, 73, true, 14, -115);
        }
        field4676++;
        class15.field164 = arg3;
        class157.field2184 = arg0;
        if (arg4 && class223.field3219 >= 100) {
            class112.field1453 = class55.field712 * 128 + 64;
            class248.field3606 = class48.field642 * 128 + 64;
            class343.field5332 = class271.method1847(class248.field3606, true, class112.field1453, class56.field724) - class15.field164;
        }
        client.field1631 = 2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(CI)I", line = 50)
    public final int method2190(char arg0, int arg1) {
        if (arg1 != -1) {
            this.method2194(-128);
        }
        field4677++;
        if (this.field4669 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4669.length; var3++) {
            if (this.field4678[var3] == arg0) {
                return this.field4669[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V", line = 94)
    public static void method2191(int arg0) {
        if (arg0 == 32768) {
            field4681 = null;
            field4680 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Ld;", line = 106)
    public static final class91 method2192(int arg0, int arg1) {
        field4682++;
        class91 var2 = (class91) class270.field3870.method2265((long) arg1, (byte) -96);
        if (var2 != null) {
            return var2;
        } else if (arg0 == -16596) {
            byte[] var3 = class83.field1065.method1089(32, (byte) 116, arg1);
            class91 var4 = new class91();
            if (var3 != null) {
                var4.method654(new class299(var3), (byte) 70);
            }
            var4.method659(63);
            class270.field3870.method2257(-127, var4, (long) arg1);
            return var4;
        } else {
            return (class91) null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(CI)I", line = 130)
    public final int method2193(char arg0, int arg1) {
        field4670++;
        if (this.field4673 == null) {
            return -1;
        }
        int var3 = 45 % ((arg1 - 62) / 42);
        for (int var4 = 0; var4 < this.field4673.length; var4++) {
            if (this.field4674[var4] == arg0) {
                return this.field4673[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V", line = 159)
    public final void method2194(int arg0) {
        if (this.field4669 != null) {
            for (int var2 = 0; var2 < this.field4669.length; var2++) {
                this.field4669[var2] = class80.method568(this.field4669[var2], 32768);
            }
        }
        field4679++;
        if (arg0 == 32768 && this.field4673 != null) {
            for (int var3 = 0; var3 < this.field4673.length; var3++) {
                this.field4673[var3] = class80.method568(this.field4673[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILfd;I)V", line = 192)
    private final void method2195(int arg0, class299 arg1, int arg2) {
        if (arg0 != -1) {
            this.method2188((byte) -73, (class299) null);
        }
        field4668++;
        if (arg2 == 1) {
            this.field4672 = arg1.method2060(-12482);
        } else if (arg2 == 2) {
            int var7 = arg1.method2096((byte) -122);
            this.field4673 = new int[var7];
            this.field4674 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4673[var8] = arg1.method2083((byte) -128);
                byte var9 = arg1.method2104(98);
                this.field4674[var8] = var9 == 0 ? 0 : class114.method841(false, var9);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method2096((byte) -122);
            this.field4678 = new char[var4];
            this.field4669 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4669[var5] = arg1.method2083((byte) -45);
                byte var6 = arg1.method2104(arg0 ^ 0xFFFFFF85);
                this.field4678[var5] = var6 == 0 ? 0 : class114.method841(false, var6);
            }
        } else if (arg2 != 4) {
        }
    }
}
