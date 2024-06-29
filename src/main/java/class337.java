import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class337 extends class346 {

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "[I")
    public static int[] field4977 = new int[25];

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4982 = "Examine";

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4983 = "Choose Option";

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    public static int field4981 = -1;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "[Lnh;")
    public static class374[] field4985 = new class374[50];

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(Z)V")
    public static void method2190(boolean arg0) {
        field4977 = null;
        field4985 = null;
        field4983 = null;
        if (!arg0) {
            method2193((String) null, (byte) -46);
        }
        field4982 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B[[[Ldh;)V")
    public static final void method2191(byte arg0, class77[][][] arg1) {
        if (arg0 != -56) {
            field4982 = null;
        }
        ++field4976;
        for (int var2 = 0; var2 < arg1.length; ++var2) {
            class77[][] var3 = arg1[var2];
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                for (int var5 = 0; ~var3[var4].length < ~var5; ++var5) {
                    class77 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field1079 instanceof class56) {
                            ((class56) var6.field1079).method124(77);
                        }
                        if (var6.field1063 instanceof class56) {
                            ((class56) var6.field1063).method124(49);
                        }
                        if (var6.field1076 instanceof class56) {
                            ((class56) var6.field1076).method124(112);
                        }
                        if (var6.field1067 instanceof class56) {
                            ((class56) var6.field1067).method124(122);
                        }
                        if (var6.field1087 instanceof class56) {
                            ((class56) var6.field1087).method124(29);
                        }
                        for (class356 var7 = var6.field1064; var7 != null; var7 = var7.field5275) {
                            class407 var8 = var7.field5274;
                            if (var8 instanceof class56) {
                                ((class56) var8).method124(120);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lps;I)V")
    public static final void method2192(class162 arg0, int arg1) {
        ++field4984;
        if (arg1 != 37) {
            method2192((class162) null, 111);
        }
        if (arg0 instanceof class163) {
            class163 var2 = (class163) arg0;
            if (var2.field2206 != null) {
                class330.method2165(var2, -1379);
            }
        } else if (arg0 instanceof class317) {
            class184.method1194(true, (class317) arg0);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field4979;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            class206.method1356(var3, 0, class134.field1753, class436.field6337[arg0]);
        }
        if (arg1 != 3) {
            field4977 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
    public class337() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2193(String arg0, byte arg1) {
        ++field4980;
        if (!arg0.equals("")) {
            class140.field1797.method1833(-20379, 95);
            if (arg1 > -119) {
                field4985 = null;
            }
            ++class118.field1540;
            class140.field1797.method2204(class9.method61((byte) -117, arg0), 8);
            class140.field1797.method2214(arg0, -91);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method2194(String arg0, int arg1) {
        ++field4978;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var4 > var5; ++var5) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (~var6 <= -66 && var6 <= 'Z') {
                var2 += (long) (1 - -var6 + -65);
            } else if (~var6 <= -98 && ~var6 >= -123) {
                var2 += (long) (var6 + 1 + -97);
            } else if (var6 >= '0' && ~var6 >= -58) {
                var2 += (long) (var6 + -48 + 27);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && ~var2 != -1L) {
            var2 /= 37L;
        }
        if (arg1 != 1) {
            method2190(true);
        }
        return var2;
    }
}
