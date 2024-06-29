import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class167 {

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Ltb;")
    private class450 field2191 = new class450(64);

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lpl;")
    private class612 field2194;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lsfa;")
    public static class291 field2193 = new class291();

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field2200 = -1;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Z")
    public static boolean field2199;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;I)V", line = 4)
    public static final void method954(String arg0, File arg1, int arg2) {
        field2197++;
        class39.field526.put(arg0, arg1);
        int var3 = -114 / ((arg2 + 57) / 62);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Z", line = 17)
    public static final boolean method955(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field2200 = 51;
        }
        field2196++;
        return (class551.method3051(33, arg0, arg2) | class159.method912(arg2, arg0, false) | class445.method2378(arg1 - 41, arg0, arg2)) & class288.method1619(-44, arg0, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BII)Z", line = 32)
    public static final boolean method956(byte arg0, int arg1, int arg2) {
        field2190++;
        if (arg0 < 25) {
            field2199 = false;
        }
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 44)
    public final void method957(int arg0) {
        if (arg0 != 16) {
            return;
        }
        class450 var2 = this.field2191;
        synchronized (this.field2191) {
            this.field2191.method2406(18385);
        }
        field2189++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V", line = 59)
    public final void method958(byte arg0, int arg1) {
        class450 var3 = this.field2191;
        synchronized (this.field2191) {
            if (arg0 >= -21) {
                return;
            }
            this.field2191.method2411(true, arg1);
        }
        field2188++;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 126)
    public class167(class112 arg0, int arg1, class612 arg2) {
        this.field2194 = arg2;
        if (this.field2194 != null) {
            this.field2194.method3349(35, true);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V", line = 77)
    public final void method959(int arg0) {
        field2187++;
        if (arg0 == 35) {
            class450 var2 = this.field2191;
            synchronized (this.field2191) {
                this.field2191.method2412((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)Lru;", line = 94)
    public final class500 method960(byte arg0, int arg1) {
        field2198++;
        class450 var3 = this.field2191;
        class500 var4;
        synchronized (this.field2191) {
            var4 = (class500) this.field2191.method2418((long) arg1, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field2194;
        byte[] var6;
        synchronized (this.field2194) {
            var6 = this.field2194.method3365(arg1, 31, 35);
        }
        class500 var7 = new class500();
        if (arg0 != 0) {
            method954(null, null, -84);
        }
        if (var6 != null) {
            var7.method2695(true, new class630(var6));
        }
        var7.method2696(1);
        class450 var8 = this.field2191;
        synchronized (this.field2191) {
            this.field2191.method2409((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 147)
    public static void method961(byte arg0) {
        if (arg0 > -55) {
            method956((byte) 69, 30, -98);
        }
        field2193 = null;
    }
}
