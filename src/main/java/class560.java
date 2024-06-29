import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class560 extends class324 {

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Z")
    public static boolean field7972 = false;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "[[Z")
    public static boolean[][] field7984 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lkca;")
    public static class73 field7966 = new class73(81, 3);

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public int field7968;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public int field7969;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public int field7970;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public int field7971;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public int field7973;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public int field7974;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public int field7975;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public int field7976;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public int field7977;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public int field7980;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public int field7981;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public int field7983;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public int field7985;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public int field7986;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public int field7987;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ph", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field7988;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[I")
    public static int[] field7967;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method3240(int arg0) {
        field7984 = null;
        if (arg0 < 104) {
            method3240(-112);
        }
        field7967 = null;
        field7966 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;II)Lmq;")
    public static final class440 method3241(String arg0, int arg1, int arg2) {
        if (arg2 >= -108) {
            field7967 = null;
        }
        field7979++;
        class440 var3;
        try {
            var3 = (class440) Class.forName("aba").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class536();
        }
        var3.field6572 = arg1;
        var3.field6567 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILoa;)Lba;")
    public final class327 method3242(int arg0, int arg1, class605 arg2) {
        if (arg0 >= -35) {
            method3241(null, 25, -14);
        }
        field7978++;
        int var4 = class547.field7838[this.field7976];
        class327 var5 = null;
        if (var4 == 0) {
            class599 var12 = class491.method2948(this.field7985, this.field7973, this.field7977);
            if (var12 instanceof class249) {
                class249 var13 = (class249) var12;
                if (var13.field3538 != null) {
                    var5 = ((class57) var13.field3538).method94(arg1, false, arg2);
                }
            }
        } else if (var4 == 1) {
            class356 var10 = class458.method2824(this.field7985, this.field7973, this.field7977);
            if (var10 instanceof class561) {
                class561 var11 = (class561) var10;
                if (var11.field7997 != null) {
                    var5 = ((class57) var11.field7997).method94(arg1, false, arg2);
                }
            }
        } else if (var4 == 2) {
            class144 var6 = class226.method1473(this.field7985, this.field7973, this.field7977, field7988 == null ? (field7988 = method3243("qn")) : field7988);
            if (var6 instanceof class343) {
                class343 var7 = (class343) var6;
                if (var7.field4887 != null) {
                    var5 = ((class57) var7.field4887).method94(arg1, false, arg2);
                }
            }
        } else if (var4 == 3) {
            class111 var8 = class157.method911(this.field7985, this.field7973, this.field7977);
            if (var8 instanceof class204) {
                class204 var9 = (class204) var8;
                if (var9.field2740 != null) {
                    var5 = ((class57) var9.field2740).method94(arg1, false, arg2);
                }
            }
        }
        return var5 == null ? null : var5.method1382((byte) 0, arg1, true);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3243(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
