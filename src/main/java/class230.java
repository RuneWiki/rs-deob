import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class230 implements Runnable {

    @OriginalMember(owner = "client!al", name = "j", descriptor = "[Lfe;")
    public volatile class253[] field4121 = new class253[2];

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Z")
    public volatile boolean field4118 = false;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Z")
    public volatile boolean field4115 = false;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "[I")
    public static int[] field4116 = new int[14];

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lnh;")
    public static class54 field4114 = new class54(64);

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Lcf;")
    public static class93 field4123 = class147.method1066("k", -48);

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Z")
    public static boolean field4124 = true;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Llh;")
    public class286 field4119;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "[S")
    public static short[] field4122;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method1576(byte arg0) {
        field4116 = null;
        if (arg0 == -114) {
            field4122 = null;
            field4114 = null;
            field4123 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V")
    public static final void method1577(int arg0, byte arg1, int arg2) {
        if (arg1 != -111) {
            return;
        }
        field4117++;
        class141 var3 = class264.method1774(arg2, -6);
        int var4 = var3.field2456;
        int var5 = var3.field2462;
        int var6 = class136.field2384[var4 - var5];
        int var7 = var3.field2463;
        if (arg0 < 0 || var6 < arg0) {
            arg0 = 0;
        }
        int var8 = var6 << var5;
        class130.method953(1, var7, var8 & arg0 << var5 | ~var8 & class47.field754[var7]);
    }

    @OriginalMember(owner = "client!al", name = "run", descriptor = "()V")
    public final void run() {
        field4113++;
        this.field4115 = true;
        try {
            while (!this.field4118) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class253 var2 = this.field4121[var1];
                    if (var2 != null) {
                        var2.method1716(16384);
                    }
                }
                class53.method290(10L, true);
                class191.method1376((Object) null, (byte) 29, this.field4119);
            }
        } catch (Exception var9) {
            class127.method931((byte) -124, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field4115 = false;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BII)I")
    public static final int method1578(byte arg0, int arg1, int arg2) {
        field4120++;
        class249 var3 = (class249) class282.field5069.method135((long) arg2, true);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4494.length; var5++) {
                if (var3.field4487[var5] == arg1) {
                    var4 += var3.field4494[var5];
                }
            }
            if (arg0 == -23) {
                return var4;
            } else {
                return 83;
            }
        }
    }
}
