import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class124 {

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "[Lrc;")
    public static class501[] field2248 = new class501[14];

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2247;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Z")
    public static final boolean method1063(int arg0) {
        field2245++;
        if (arg0 != 31) {
            method1065(-29);
        }
        if (class444.field6400) {
            try {
                if ((Boolean) class31.method507(13009, "showingVideoAd", class416.field6017)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
    public static final int method1064(byte arg0) {
        field2241++;
        if (arg0 != -29) {
            method1063(-49);
        }
        class287 var1 = class395.field5768;
        synchronized (class395.field5768) {
            return class395.field5768.method1902(-127);
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
    public static final void method1065(int arg0) {
        field2243++;
        class330.method2114((byte) -112);
        class418.method2539(false);
        if (arg0 != 0) {
            method1066(120);
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
    public static void method1066(int arg0) {
        field2248 = null;
        if (arg0 != -12019) {
            method1066(18);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILom;)Lcaa;")
    public static final class277 method1067(int arg0, int arg1, class344 arg2) {
        field2249++;
        if (arg1 <= 21) {
            return null;
        } else {
            byte[] var3 = arg2.method2242(0, arg0);
            return var3 == null ? null : new class277(var3);
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
    public class124() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lqh;[BB)V")
    public final void method1068(class61 arg0, byte[] arg1, byte arg2) {
        field2244++;
        if (arg2 != 11) {
            method1064((byte) -93);
        }
        if (arg0.field1397[arg0.field1393] != 31 || arg0.field1397[arg0.field1393 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2247 == null) {
            this.field2247 = new Inflater(true);
        }
        try {
            this.field2247.setInput(arg0.field1397, arg0.field1393 + 10, -arg0.field1393 + -10 + -8 + arg0.field1397.length);
            this.field2247.inflate(arg1);
        } catch (Exception var4) {
            this.field2247.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2247.reset();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1069(int arg0, byte[] arg1) {
        field2242++;
        class61 var3 = new class61(arg1);
        var3.field1393 = arg1.length - 4;
        int var4 = var3.method727(32043);
        byte[] var5 = new byte[var4];
        var3.field1393 = arg0;
        this.method1068(var3, var5, (byte) 11);
        return var5;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(III)V")
    private class124(int arg0, int arg1, int arg2) {
    }
}
