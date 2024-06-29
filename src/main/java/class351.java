import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class351 {

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Lfa;")
    private class156 field4862 = new class156(64);

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Lfa;")
    public class156 field4864 = new class156(30);

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lfs;")
    private class387 field4855;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lfs;")
    public class387 field4854;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lsl;")
    public static class318 field4863 = new class318(15, -1);

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4866 = new CRC32();

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field4868 = -1;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public int field4867;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "J")
    public static long field4865;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;", line = 3)
    public static final Object method2110(byte arg0, boolean arg1, byte[] arg2) {
        field4857++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 != 109) {
            field4865 = 94L;
        }
        if (arg2.length > 136 && !class136.field1953) {
            try {
                class109 var3 = (class109) Class.forName("ce").getDeclaredConstructor().newInstance();
                var3.method898(arg0 - 107, arg2);
                return var3;
            } catch (Throwable var4) {
                class136.field1953 = true;
            }
        }
        return arg1 ? class247.method1624(arg2, 1727) : arg2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V", line = 41)
    public final void method2111(int arg0, boolean arg1) {
        field4860++;
        this.field4867 = arg0;
        class156 var3 = this.field4864;
        synchronized (this.field4864) {
            this.field4864.method1105(arg1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V", line = 53)
    public final void method2112(int arg0, int arg1) {
        field4856++;
        class156 var3 = this.field4862;
        synchronized (this.field4862) {
            this.field4862.method1116(arg0, -50);
            if (arg1 != 64) {
                field4866 = null;
            }
        }
        class156 var4 = this.field4864;
        synchronized (this.field4864) {
            this.field4864.method1116(arg0, -50);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 72)
    public final void method2113(int arg0) {
        class156 var2 = this.field4862;
        synchronized (this.field4862) {
            this.field4862.method1119(100);
        }
        field4853++;
        class156 var3 = this.field4864;
        synchronized (this.field4864) {
            this.field4864.method1119(101);
        }
        if (arg0 != 64) {
            method2116((byte) 73, false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 89)
    public static void method2114(byte arg0) {
        if (arg0 == 109) {
            field4866 = null;
            field4863 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)Lnm;", line = 105)
    public final class330 method2115(int arg0, int arg1) {
        if (arg0 != -137) {
            method2116((byte) 123, true);
        }
        field4859++;
        class156 var3 = this.field4862;
        class330 var4;
        synchronized (this.field4862) {
            var4 = (class330) this.field4862.method1115((long) arg1, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4855.method2363(class65.method617(arg1, (byte) 80), class127.method990(79, arg1), 127);
        class330 var6 = new class330();
        var6.field4614 = arg1;
        var6.field4596 = this;
        if (var5 != null) {
            var6.method2024((byte) 3, new class65(var5));
        }
        class156 var7 = this.field4862;
        synchronized (this.field4862) {
            this.field4862.method1107(arg0 ^ 0xFFFFFF76, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ)V", line = 136)
    public static final void method2116(byte arg0, boolean arg1) {
        if (arg0 <= -7) {
            class391.method2400(-1, arg1, class410.field6100, class64.field761, class94.field1278);
            field4861++;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljk;ILfs;Lfs;)V", line = 180)
    public class351(class446 arg0, int arg1, class387 arg2, class387 arg3) {
        this.field4855 = arg2;
        this.field4854 = arg3;
        int var5 = this.field4855.method2359((byte) 39) - 1;
        this.field4855.method2367(var5, 28724);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 152)
    public final void method2117(boolean arg0) {
        field4858++;
        class156 var2 = this.field4862;
        synchronized (this.field4862) {
            if (!arg0) {
                field4865 = -36L;
            }
            this.field4862.method1105(false);
        }
        class156 var3 = this.field4864;
        synchronized (this.field4864) {
            this.field4864.method1105(false);
        }
    }
}
