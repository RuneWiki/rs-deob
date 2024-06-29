import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class63 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Lms;")
    public static class81 field804 = new class81();

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[I")
    public static int[] field808 = new int[2];

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "[[[I")
    public static int[][][] field811 = new int[2][][];

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "F")
    public static float field809;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Lvh;")
    public static class191 field810;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Z")
    public static boolean field807;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 7)
    public static void method358(boolean arg0) {
        if (!arg0) {
            method360((byte) -15);
        }
        field804 = null;
        field808 = null;
        field811 = null;
        field810 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIILjava/lang/Object;)[B", line = 23)
    public static final byte[] method359(int arg0, int arg1, int arg2, Object arg3) {
        field806++;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class328.method1953((byte) 35, var4, arg0, arg2);
        } else {
            if (arg1 != 50) {
                method358(true);
            }
            if (!arg3 instanceof class238) {
                throw new IllegalArgumentException();
            }
            class238 var5 = (class238) arg3;
            return var5.method1512(arg2, (byte) -58, arg0);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 55)
    public static final void method360(byte arg0) {
        field805++;
        if (arg0 != 76) {
            field804 = null;
        }
        int var1 = (int) ((double) class200.field2594 * 34.46D);
        int var2 = var1 << 0;
        if (class512.field7538.method850()) {
            var2 += 128;
        }
        class512.field7538.method894(50, var2);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)Z", line = 85)
    public static final boolean method361(boolean arg0) {
        for (int var1 = class405.field5434; var1 < class412.field5495; var1++) {
            class510[][] var2 = class470.field6877[var1];
            for (int var3 = -class18.field318; var3 <= 0; var3++) {
                int var4 = class225.field2922 + var3;
                int var5 = class225.field2922 - var3;
                if (var4 >= class297.field3862 || var5 < class411.field5491) {
                    for (int var6 = -class18.field318; var6 <= 0; var6++) {
                        int var7 = class477.field6969 + var6;
                        int var8 = class477.field6969 - var6;
                        if (var4 >= class297.field3862) {
                            if (var7 >= class83.field1027) {
                                class510 var9 = var2[var4][var7];
                                if (var9 != null && var9.field7504) {
                                    class255.field3227 = arg0;
                                    class522.field7748.method196(true, var9);
                                    class522.field7748.method202((byte) -114);
                                }
                            }
                            if (var8 < class271.field3438) {
                                class510 var10 = var2[var4][var8];
                                if (var10 != null && var10.field7504) {
                                    class255.field3227 = arg0;
                                    class522.field7748.method196(true, var10);
                                    class522.field7748.method202((byte) -112);
                                }
                            }
                        }
                        if (var5 < class411.field5491) {
                            if (var7 >= class83.field1027) {
                                class510 var11 = var2[var5][var7];
                                if (var11 != null && var11.field7504) {
                                    class255.field3227 = arg0;
                                    class522.field7748.method196(true, var11);
                                    class522.field7748.method202((byte) -118);
                                }
                            }
                            if (var8 < class271.field3438) {
                                class510 var12 = var2[var5][var8];
                                if (var12 != null && var12.field7504) {
                                    class255.field3227 = arg0;
                                    class522.field7748.method196(true, var12);
                                    class522.field7748.method202((byte) 55);
                                }
                            }
                        }
                        if (class489.field7124 == 0) {
                            if (class98.field1368) {
                                class522.field7748.method205(24, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
