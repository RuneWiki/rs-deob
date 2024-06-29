import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class216 extends class82 {

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "Lua;")
    public static class211 field3926 = null;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "Ldj;")
    private static class44 field3932 = class89.method650(255, "Service unavailable)3");

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "I")
    public static int field3935 = 50;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "[I")
    public static int[] field3927 = new int[field3935];

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "Ldj;")
    public static class44 field3925 = field3932;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "[I")
    public static int[] field3929 = new int[field3935];

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "Ldj;")
    public static class44 field3936 = class89.method650(255, "loc)3dat");

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "I")
    public static int field3938 = 0;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "[Ldj;")
    public static class44[] field3937 = new class44[field3935];

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "[I")
    public static int[] field3924 = new int[field3935];

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "[I")
    public static int[] field3939 = new int[field3935];

    @OriginalMember(owner = "client!uf", name = "fb", descriptor = "I")
    public static int field3940 = 0;

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "[I")
    public static int[] field3941 = new int[field3935];

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "[I")
    public static int[] field3933 = new int[field3935];

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "[I")
    public static int[] field3934 = new int[field3935];

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!uf", name = "hb", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "[[[I")
    public static int[][][] field3928;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(II)Lhf;")
    public static final class83 method1412(int arg0, int arg1) {
        ++field3942;
        class83 var2 = (class83) class112.field2015.method1178((long) arg0, 14176);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class40.field751.method1466(28, arg0, (byte) -128);
            class83 var4 = new class83();
            if (var3 != null) {
                var4.method622(new class66(var3), (byte) 123);
            }
            class112.field2015.method1183((byte) 103, var4, (long) arg0);
            return arg1 <= 75 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field3931;
        if (arg0 != 25238) {
            field3928 = null;
        }
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int[][] var4 = this.method619(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class129.field2287; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)V")
    public static void method1413(int arg0) {
        field3927 = null;
        field3924 = null;
        field3928 = null;
        field3937 = null;
        field3929 = null;
        field3939 = null;
        field3925 = null;
        if (arg0 != 29448) {
            field3933 = null;
        }
        field3934 = null;
        field3941 = null;
        field3932 = null;
        field3933 = null;
        field3936 = null;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class216() {
        super(1, true);
    }
}
