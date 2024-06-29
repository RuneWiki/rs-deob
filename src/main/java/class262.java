import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class262 {

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "Lfa;")
    private class156 field3854 = new class156(64);

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "Lfs;")
    private class387 field3856;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "[Lpt;")
    public static class367[] field3857 = new class367[14];

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "Lqt;")
    public static class449 field3853;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)[B")
    public static final byte[] method1678(int arg0, int arg1) {
        field3859++;
        class172 var2 = (class172) class371.field5508.method2871((long) arg1, (byte) 106);
        int var3 = 88 / ((arg0 - 15) / 39);
        if (var2 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class245.method1609((byte) 94, var5, var8);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var2 = new class172(var4);
            class371.field5508.method2868((long) arg1, var2, -8869);
        }
        return var2.field2449;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public final void method1679(int arg0) {
        if (arg0 != 1068) {
            return;
        }
        class156 var2 = this.field3854;
        synchronized (this.field3854) {
            this.field3854.method1105(false);
        }
        field3861++;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)V")
    public final void method1680(byte arg0, int arg1) {
        field3860++;
        class156 var3 = this.field3854;
        synchronized (this.field3854) {
            this.field3854.method1116(arg1, -50);
        }
        int var4 = -80 % ((arg0 + 63) / 34);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)V")
    public final void method1681(int arg0, int arg1) {
        field3855++;
        class156 var3 = this.field3854;
        synchronized (this.field3854) {
            this.field3854.method1105(false);
            this.field3854 = new class156(arg0);
            int var4 = 14 % ((-arg1 - 26) / 49);
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(II)Lki;")
    public final class498 method1682(int arg0, int arg1) {
        field3858++;
        class156 var3 = this.field3854;
        class498 var4;
        synchronized (this.field3854) {
            var4 = (class498) this.field3854.method1115((long) arg0, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3856.method2363(class494.method2957(arg0, (byte) -56), class347.method2098(arg0, -1886501846), arg1 ^ 0xFFFFFF7E);
        class498 var6 = new class498();
        if (var5 != null) {
            var6.method2989(new class65(var5), (byte) -25);
        }
        class156 var7 = this.field3854;
        synchronized (this.field3854) {
            this.field3854.method1107(1, (long) arg0, var6);
        }
        if (arg1 != -256) {
            method1685((byte) 102);
        }
        return var6;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class262(class446 arg0, int arg1, class387 arg2) {
        this.field3856 = arg2;
        if (this.field3856 != null) {
            int var4 = this.field3856.method2359((byte) 39) - 1;
            this.field3856.method2367(var4, 28724);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIILjava/lang/Class;)Lpe;")
    public static final class431 method1683(int arg0, int arg1, int arg2, Class arg3) {
        class148 var4 = class422.field6240[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class480 var5 = var4.field2086; var5 != null; var5 = var5.field7058) {
            class431 var6 = var5.field7054;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6332 == arg1 && var6.field6339 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public final void method1684(byte arg0) {
        field3862++;
        class156 var2 = this.field3854;
        synchronized (this.field3854) {
            this.field3854.method1119(arg0 + 108);
        }
        if (arg0 != 7) {
            method1683(104, 33, 99, null);
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
    public static void method1685(byte arg0) {
        field3857 = null;
        field3853 = null;
        if (arg0 >= -84) {
            method1678(-59, 53);
        }
    }
}
