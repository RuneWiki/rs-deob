import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class127 {

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    private int field2071 = -1;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    private int field2073 = 0;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "Lau;")
    private class692 field2074 = new class692();

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "Z")
    public boolean field2082 = false;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    private int field2080;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
    private int field2079;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "[Lfn;")
    private class617[] field2078;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "[[[I")
    private int[][][] field2072;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "Lqj;")
    public static class511 field2070 = new class511(0, 8);

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "Leda;")
    public static class116 field2077 = new class116(34, 6);

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "Leda;")
    public static class116 field2083;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "Llq;")
    public static class292 field2084;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cw", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field2085;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1009(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)[[I", line = 3)
    public final int[][] method1002(int arg0, int arg1) {
        if (arg0 <= 41) {
            this.method1007(-72);
        }
        field2069++;
        if (this.field2080 == this.field2079) {
            this.field2082 = this.field2078[arg1] == null;
            this.field2078[arg1] = class126.field2064;
            return this.field2072[arg1];
        } else if (this.field2079 == 1) {
            this.field2082 = this.field2071 != arg1;
            this.field2071 = arg1;
            return this.field2072[0];
        } else {
            class617 var3 = this.field2078[arg1];
            if (var3 == null) {
                this.field2082 = true;
                if (this.field2073 < this.field2079) {
                    var3 = new class617(arg1, this.field2073);
                    this.field2073++;
                } else {
                    class617 var4 = (class617) this.field2074.method3895(true);
                    var3 = new class617(arg1, var4.field8821);
                    this.field2078[var4.field8820] = null;
                    var4.method2549((byte) -73);
                }
                this.field2078[arg1] = var3;
            } else {
                this.field2082 = false;
            }
            this.field2074.method3902(var3, 0);
            return this.field2072[var3.field8821];
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Ldu;", line = 77)
    public static final class383 method1003(Component arg0, boolean arg1, boolean arg2) {
        field2075++;
        if (!arg1) {
            field2077 = null;
        }
        try {
            Constructor var3 = Class.forName("jl").getDeclaredConstructor(field2085 == null ? (field2085 = method1009("java.awt.Component")) : field2085, Boolean.TYPE);
            return (class383) var3.newInstance(arg0, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            return new class38(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 94)
    public final void method1004(int arg0) {
        field2081++;
        for (int var2 = 0; var2 < this.field2079; var2++) {
            this.field2072[var2][0] = null;
            this.field2072[var2][1] = null;
            this.field2072[var2][2] = null;
            this.field2072[var2] = null;
        }
        this.field2072 = null;
        this.field2078 = null;
        this.field2074.method3896(3);
        this.field2074 = null;
        if (arg0 <= 118) {
            this.field2074 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V", line = 121)
    public static void method1005(int arg0) {
        field2070 = null;
        field2083 = null;
        field2084 = null;
        field2077 = null;
        if (arg0 != 0) {
            field2077 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)V", line = 135)
    public static final void method1006(int arg0, int arg1, int arg2) {
        class293 var3 = class541.field7946[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class443.method2584(var3.field4091);
        class443.method2584(var3.field4095);
        if (var3.field4091 != null) {
            var3.field4091 = null;
        }
        if (var3.field4095 != null) {
            var3.field4095 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)[[[I", line = 150)
    public final int[][][] method1007(int arg0) {
        if (arg0 != 3870) {
            return null;
        }
        field2076++;
        if (this.field2080 != this.field2079) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2079; var2++) {
            this.field2078[var2] = class126.field2064;
        }
        return this.field2072;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(II)Lgi;", line = 175)
    public static final class571 method1008(int arg0, int arg1) {
        if (arg1 != 29127) {
            return null;
        }
        field2068++;
        class571 var2 = (class571) class659.field9285.method941((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class10.field129.method2081(arg1 ^ 0x71F6, arg0, 0);
        class571 var4 = new class571();
        if (var3 != null) {
            var4.method3327(117, new class465(var3));
        }
        var4.method3326((byte) -35);
        class659.field9285.method949((long) arg0, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(III)V", line = 227)
    public class127(int arg0, int arg1, int arg2) {
        this.field2080 = arg1;
        this.field2079 = arg0;
        this.field2078 = new class617[this.field2080];
        this.field2072 = new int[this.field2079][3][arg2];
    }
}
