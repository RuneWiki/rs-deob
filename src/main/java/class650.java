import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class650 extends class631 {

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lfo;")
    public static class417 field9206 = new class417();

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public int field9204;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field9205;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public int field9213;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Z")
    public boolean field9208;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)Z", line = 4)
    public final boolean method135(int arg0) {
        field9211++;
        if (arg0 != 0) {
            this.method135(121);
        }
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 16)
    public static void method3608(int arg0) {
        if (arg0 == 21918) {
            field9206 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V", line = 26)
    public static final void method3609(int arg0) {
        if (arg0 != 30787) {
            field9206 = null;
        }
        field9209++;
        class19 var1 = class364.method2236(1248116640, 0, 15);
        var1.method104(10);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[B", line = 39)
    public static final byte[] method3610(int arg0, int arg1) {
        field9215++;
        class12 var2 = (class12) class1.field3.method3026(-124, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class571.method3224((byte) 113, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class12(var3);
            class1.field3.method3027((long) arg0, var2, (byte) 111);
        }
        if (arg1 < 35) {
            field9206 = null;
        }
        return var2.field115;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)I", line = 87)
    public static final int method3611(int arg0, int arg1) {
        if (arg0 < 15) {
            field9206 = null;
        }
        field9212++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V", line = 101)
    public final void method127(int arg0) {
        if (arg0 >= 118) {
            field9207++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V", line = 118)
    public static final void method3612(int arg0) {
        field9210++;
        int var1 = 0;
        if (arg0 < 65) {
            field9206 = null;
        }
        if (class72.field935 != null) {
            var1 = class72.field935.method1852(class161.field2038, true);
        }
        if (var1 == 2) {
            int var4 = class227.field2965 <= 800 ? class227.field2965 : 800;
            class303.field4059 = var4;
            int var5 = class649.field9200 <= 600 ? class649.field9200 : 600;
            class407.field5739 = (class227.field2965 - var4) / 2;
            class243.field3276 = 0;
            class211.field2763 = var5;
        } else if (var1 == 1) {
            int var2 = class227.field2965 > 1024 ? 1024 : class227.field2965;
            int var3 = class649.field9200 <= 768 ? class649.field9200 : 768;
            class407.field5739 = (class227.field2965 - var2) / 2;
            class303.field4059 = var2;
            class243.field3276 = 0;
            class211.field2763 = var3;
        } else {
            class303.field4059 = class227.field2965;
            class407.field5739 = 0;
            class243.field3276 = 0;
            class211.field2763 = class649.field9200;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V", line = 175)
    public final void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 == -8763) {
            field9214++;
            throw new IllegalStateException();
        }
    }
}
