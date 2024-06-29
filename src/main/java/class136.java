import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class136 extends class224 {

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "[I")
    public static int[] field2154 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "Lte;")
    public static class244 field2155 = new class244(32);

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "I")
    public static int field2157 = -1;

    @OriginalMember(owner = "client!vh", name = "eb", descriptor = "I")
    public static int field2159 = 0;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "B")
    public byte field2147;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "Lpd;")
    public class96 field2144;

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field2156;

    @OriginalMember(owner = "client!vh", name = "db", descriptor = "[[[I")
    public static int[][][] field2158;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)I")
    public final int method916(byte arg0) {
        ++field2151;
        if (arg0 > -126) {
            method920((byte) -65);
        }
        return this.field2144 == null ? 0 : this.field2144.field1228 * 100 / (this.field2144.field1218.length + -this.field2147);
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)[B")
    public final byte[] method917(int arg0) {
        if (arg0 != 100) {
            return null;
        } else {
            ++field2148;
            if (!super.field3610 && ~(this.field2144.field1218.length + -this.field2147) >= ~this.field2144.field1228) {
                return this.field2144.field1218;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILpd;)Lgh;")
    public static final class215 method918(int arg0, class96 arg1) {
        if (arg0 != 2368) {
            return null;
        } else {
            arg1.method584(255);
            ++field2149;
            int var2 = arg1.method584(255);
            class215 var3 = class118.method763(var2, 72);
            var3.field3458 = arg1.method584(arg0 ^ 2495);
            int var4 = arg1.method584(255);
            for (int var5 = 0; var4 > var5; ++var5) {
                int var6 = arg1.method584(arg0 ^ 2495);
                var3.method45(1521146348, var6, arg1);
            }
            var3.method331((byte) -49);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public static final void method919(int arg0, int arg1, int arg2) {
        ++field2150;
        class135.field2141[arg2] = arg0;
        class238 var3 = (class238) class144.field2276.method708((long) arg2, 123);
        if (var3 == null) {
            class238 var4 = new class238(500L + class249.method1723((byte) 64));
            class144.field2276.method707((long) arg2, var4, (byte) 120);
        } else {
            var3.field3930 = 500L + class249.method1723((byte) 103);
        }
        if (arg1 >= -41) {
            field2158 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)V")
    public static void method920(byte arg0) {
        if (arg0 >= 77) {
            field2158 = null;
            field2156 = null;
            field2154 = null;
            field2155 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
    public static final void method921(int arg0) {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~(class34.field437 + -1) < ~var2; ++var2) {
                if (~class155.field2423[var2] > -1001 && class155.field2423[var2 + 1] > 1000) {
                    String var3 = class78.field977[var2];
                    class78.field977[var2] = class78.field977[var2 + 1];
                    var1 = false;
                    class78.field977[var2 - -1] = var3;
                    String var4 = class191.field3084[var2];
                    class191.field3084[var2] = class191.field3084[var2 + 1];
                    class191.field3084[var2 - -1] = var4;
                    int var5 = class251.field4104[var2];
                    class251.field4104[var2] = class251.field4104[var2 + 1];
                    class251.field4104[var2 + 1] = var5;
                    int var6 = class61.field805[var2];
                    class61.field805[var2] = class61.field805[var2 - -1];
                    class61.field805[var2 + 1] = var6;
                    int var7 = class187.field2989[var2];
                    class187.field2989[var2] = class187.field2989[var2 - -1];
                    class187.field2989[var2 + 1] = var7;
                    short var8 = class155.field2423[var2];
                    class155.field2423[var2] = class155.field2423[var2 + 1];
                    class155.field2423[var2 + 1] = var8;
                    long var9 = class276.field4403[var2];
                    class276.field4403[var2] = class276.field4403[var2 + 1];
                    class276.field4403[var2 + 1] = var9;
                }
            }
        }
        if (arg0 != -1001) {
            method921(-114);
        }
        ++field2146;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method922(boolean arg0, Component arg1) {
        arg1.addMouseListener(class187.field2974);
        ++field2153;
        arg1.addMouseMotionListener(class187.field2974);
        if (!arg0) {
            arg1.addFocusListener(class187.field2974);
        }
    }
}
