import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class468 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Ltb;")
    private class450 field5944 = new class450(64);

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Lpl;")
    private class612 field5941;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "Lpk;")
    public static class104 field5946 = new class104("WTQA", 2);

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "Lwp;")
    public static class453 field5951 = new class453(50, 6);

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "Z")
    public static boolean field5952 = false;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    public static int field5954 = -1;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Lefa;")
    public static class156 field5950;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V", line = 4)
    public final void method2472(int arg0) {
        if (arg0 < 94) {
            method2479(36, null);
        }
        field5945++;
        class450 var2 = this.field5944;
        synchronized (this.field5944) {
            this.field5944.method2412((byte) 91);
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)I", line = 19)
    public static final int method2473(int arg0) {
        field5943++;
        return arg0 > -121 ? -102 : 16;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V", line = 33)
    public final void method2474(int arg0) {
        class450 var2 = this.field5944;
        synchronized (this.field5944) {
            this.field5944.method2406(18385);
        }
        if (arg0 >= -32) {
            method2479(66, null);
        }
        field5949++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V", line = 47)
    public static void method2475(byte arg0) {
        field5946 = null;
        field5951 = null;
        field5950 = null;
        if (arg0 >= -6) {
            method2473(119);
        }
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)Loga;", line = 60)
    public static final class182 method2476(int arg0) {
        field5940++;
        if (arg0 <= 64) {
            return null;
        }
        try {
            return (class182) Class.forName("st").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class336();
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)Lvu;", line = 76)
    public final class207 method2477(byte arg0, int arg1) {
        field5942++;
        class450 var3 = this.field5944;
        class207 var4;
        synchronized (this.field5944) {
            var4 = (class207) this.field5944.method2418((long) arg1, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field5941;
        byte[] var6;
        synchronized (this.field5941) {
            var6 = this.field5941.method3365(arg1, 51, 11);
        }
        class207 var7 = new class207();
        if (arg0 != 6) {
            field5946 = null;
        }
        if (var6 != null) {
            var7.method1247((byte) -101, new class630(var6));
        }
        class450 var8 = this.field5944;
        synchronized (this.field5944) {
            this.field5944.method2409((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 162)
    public class468(class112 arg0, int arg1, class612 arg2) {
        this.field5941 = arg2;
        if (this.field5941 != null) {
            this.field5941.method3349(11, true);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V", line = 113)
    public final void method2478(int arg0, int arg1) {
        field5947++;
        class450 var3 = this.field5944;
        synchronized (this.field5944) {
            this.field5944.method2411(true, arg1);
        }
        if (arg0 < 107) {
            this.method2477((byte) -74, -49);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)I", line = 126)
    public static final int method2479(int arg0, String arg1) {
        if (arg0 != 15895) {
            return 79;
        }
        field5948++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        return var3;
    }
}
