import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class334 implements Runnable {

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Z")
    public boolean field5192 = true;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Ljava/lang/Object;")
    public Object field5190 = new Object();

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "[I")
    public int[] field5198 = new int[500];

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public int field5199 = 0;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "[I")
    public int[] field5197 = new int[500];

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field5182 = 0;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Z")
    public static boolean field5181 = false;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Lue;")
    public static class17 field5188 = new class17();

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "[I")
    public static int[] field5196 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "[I")
    public static int[] field5195;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[Lco;")
    public static class103[] field5189;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[[[B")
    public static byte[][][] field5185;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Leb;I)V", line = 6)
    public static final void method2301(class125 arg0, int arg1) {
        field5184++;
        int var2 = -1;
        int var3 = 0;
        long var4 = 0L;
        if (arg0.field1875 == 0) {
            var4 = class155.method1079(arg0.field1859, arg0.field1865, arg0.field1872);
        }
        if (arg0.field1875 == 1) {
            var4 = class132.method894(arg0.field1859, arg0.field1865, arg0.field1872);
        }
        if (arg1 > -127) {
            field5189 = (class103[]) null;
        }
        if (arg0.field1875 == 2) {
            var4 = class98.method694(arg0.field1859, arg0.field1865, arg0.field1872);
        }
        if (arg0.field1875 == 3) {
            var4 = class303.method2120(arg0.field1859, arg0.field1865, arg0.field1872);
        }
        int var6 = 0;
        if (var4 != 0L) {
            var6 = ((int) var4 & 0x31F3AD) >> 20;
            var3 = ((int) var4 & 0x7EAF1) >> 14;
            var2 = (int) (var4 >>> 32) & Integer.MAX_VALUE;
        }
        arg0.field1864 = var2;
        arg0.field1869 = var6;
        arg0.field1873 = var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 52)
    public static void method2302(boolean arg0) {
        field5185 = (byte[][][]) null;
        field5189 = null;
        if (!arg0) {
            field5189 = (class103[]) null;
        }
        field5195 = null;
        field5196 = null;
        field5188 = null;
    }

    @OriginalMember(owner = "client!oi", name = "run", descriptor = "()V", line = 66)
    public final void run() {
        while (this.field5192) {
            Object var1 = this.field5190;
            synchronized (this.field5190) {
                if (this.field5199 < 500) {
                    this.field5198[this.field5199] = class164.field2672;
                    this.field5197[this.field5199] = class4.field35;
                    this.field5199++;
                }
            }
            class20.method128(0, 50L);
        }
        field5194++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 91)
    public static final Object method2303(byte[] arg0, boolean arg1, int arg2) {
        field5193++;
        if (arg0 == null) {
            return null;
        } else if (arg2 == -25077) {
            if (arg0.length > 136 && !class321.field5035) {
                try {
                    class235 var3 = (class235) Class.forName("dc").getDeclaredConstructor().newInstance();
                    var3.method816(arg2 + 24949, arg0);
                    return var3;
                } catch (Throwable var5) {
                    class321.field5035 = true;
                }
            }
            return arg1 ? class329.method2277((byte) 72, arg0) : arg0;
        } else {
            return (Object) null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 126)
    public static final void method2304(int arg0) {
        field5186++;
        class295.field4631.method1745(-105);
        if (arg0 != 25189) {
            field5195 = (int[]) null;
        }
        class218.field3505.method2281(121);
        class35.field467.method2281(arg0 - 25103);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLkb;)V", line = 147)
    public static final void method2305(byte arg0, class39 arg1) {
        class343.field5342 = arg1;
        field5183++;
        if (arg0 < 4) {
            method2301((class125) null, -69);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;", line = 158)
    public static final String[] method2306(char arg0, String arg1, int arg2) {
        field5180++;
        int var3 = class258.method1828(arg0, arg1, (byte) -52);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg2 != -3) {
            field5188 = (class17) null;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var5; arg0 != arg1.charAt(var8); var8++) {
            }
            var4[var6++] = arg1.substring(var5, var8);
            var5 = var8 + 1;
        }
        var4[var3] = arg1.substring(var5);
        return var4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 197)
    public static final void method2307(byte arg0) {
        class212.method1548();
        field5187++;
        if (arg0 != -115) {
            method2301((class125) null, -90);
        }
        class111.field1657 = new class220[9];
        class111.field1657[1] = new class122();
        class111.field1657[2] = new class70();
        class111.field1657[3] = new class85();
        class111.field1657[4] = new class137();
        class111.field1657[5] = new class238();
        class111.field1657[6] = new class65();
        class111.field1657[7] = new class45();
    }
}
