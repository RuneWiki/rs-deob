import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class130 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljv;")
    private class55 field2062 = new class55(64);

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lbu;")
    private class17 field2072;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "S")
    public static short field2059 = 32767;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "[F")
    public static float[] field2073 = new float[4];

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Lef;")
    public static class335 field2064 = new class335(11, 0, 1, 2);

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[I")
    public static int[] field2074 = new int[1];

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "[[Z")
    public static boolean[][] field2076;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2075;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field2077;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
    public static int[] field2071;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method979(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class494("", 73);
        field2076 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BD)V", line = 8)
    public static final void method970(byte arg0, double arg1) {
        int var3 = -91 % ((arg0 + 5) / 52);
        if (class288.field4111 != arg1) {
            for (int var4 = 0; var4 < 256; var4++) {
                int var5 = (int) (Math.pow((double) var4 / 255.0D, arg1) * 255.0D);
                class288.field4103[var4] = var5 > 255 ? 255 : var5;
            }
            class288.field4111 = arg1;
        }
        field2066++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 34)
    public static final void method971(int arg0) {
        if (arg0 != -31163) {
            field2073 = null;
        }
        try {
            Method var1 = (field2077 == null ? (field2077 = method979("java.lang.Runtime")) : field2077).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class57.field997 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field2067++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)Lul;", line = 64)
    public final class402 method972(byte arg0, int arg1) {
        field2068++;
        class55 var3 = this.field2062;
        class402 var4;
        synchronized (this.field2062) {
            var4 = (class402) this.field2062.method494(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 < 45) {
            field2076 = null;
        }
        byte[] var5 = this.field2072.method114(arg1, 35, -51);
        class402 var6 = new class402();
        if (var5 != null) {
            var6.method2466(new class145(var5), -118);
        }
        var6.method2467(51);
        class55 var7 = this.field2062;
        synchronized (this.field2062) {
            this.field2062.method485((long) arg1, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 97)
    public static void method973(boolean arg0) {
        if (!arg0) {
            field2064 = null;
        }
        field2076 = null;
        field2073 = null;
        field2064 = null;
        field2071 = null;
        field2074 = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 112)
    public static final void method974(int arg0) {
        if (class402.field6038 != null) {
            class402.field6038.method1203(97);
            class402.field6038 = null;
            class66.field1148 = null;
        }
        field2070++;
        if (arg0 != 64) {
            field2071 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 135)
    public final void method975(int arg0) {
        class55 var2 = this.field2062;
        synchronized (this.field2062) {
            if (arg0 != 978) {
                return;
            }
            this.field2062.method484(112);
        }
        field2069++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 148)
    public final void method976(byte arg0) {
        if (arg0 != 68) {
            return;
        }
        class55 var2 = this.field2062;
        synchronized (this.field2062) {
            this.field2062.method488(-3);
        }
        field2063++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLmq;)V", line = 163)
    public static final void method977(byte arg0, class350 arg1) {
        if (arg1.field5215 == 5 && arg1.field5273 != -1) {
            class305.method2002(arg1, -629, class4.field109);
        }
        field2065++;
        if (arg0 <= 61) {
            field2074 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Loq;ILbu;)V", line = 182)
    public class130(class239 arg0, int arg1, class17 arg2) {
        this.field2072 = arg2;
        if (this.field2072 != null) {
            this.field2072.method119(29630, 35);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 208)
    public final void method978(int arg0, int arg1) {
        class55 var3 = this.field2062;
        synchronized (this.field2062) {
            this.field2062.method493(false, arg0);
        }
        field2061++;
        if (arg1 != 1) {
            method974(117);
        }
    }
}
