import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class107 {

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "Luf;")
    private class380 field1268 = new class380(128);

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "Lga;")
    private class332 field1273;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public final void method583(byte arg0) {
        field1269++;
        if (arg0 == 64) {
            class380 var2 = this.field1268;
            synchronized (this.field1268) {
                this.field1268.method2172(arg0 - 15176);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V")
    public final void method584(byte arg0) {
        field1272++;
        class380 var2 = this.field1268;
        synchronized (this.field1268) {
            this.field1268.method2168((byte) -121);
            if (arg0 != 105) {
                this.method584((byte) -96);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZI)V")
    public static final void method585(boolean arg0, int arg1) {
        class380 var2 = class133.field1843;
        synchronized (class133.field1843) {
            class133.field1843.method2179(arg0, arg1);
        }
        field1271++;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIBLgba;II)Ljava/awt/Frame;")
    public static final Frame method586(int arg0, int arg1, byte arg2, class388 arg3, int arg4, int arg5) {
        field1265++;
        if (!arg3.method2227((byte) -105)) {
            return null;
        }
        if (arg1 == 0) {
            class232[] var6 = class121.method714((byte) -83, arg3);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3101 == arg4 && var6[var8].field3099 == arg0 && (arg5 == 0 || var6[var8].field3098 == arg5) && (!var7 || arg1 < var6[var8].field3097)) {
                    arg1 = var6[var8].field3097;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg2 > -78) {
            return null;
        }
        class661 var9 = arg3.method2239(-915136816, arg0, arg1, arg5, arg4);
        while (var9.field9420 == 0) {
            class588.method3253(0, 10L);
        }
        Frame var10 = (Frame) var9.field9421;
        if (var10 == null) {
            return null;
        } else if (var9.field9420 == 2) {
            class216.method1372(arg3, false, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Lje;")
    public final class263 method587(int arg0, int arg1) {
        field1267++;
        class380 var3 = this.field1268;
        class263 var4;
        synchronized (this.field1268) {
            var4 = (class263) this.field1268.method2176(-124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field1273;
        byte[] var6;
        synchronized (this.field1273) {
            var6 = this.field1273.method1938(arg0, arg1, arg1 ^ 0xFFFFFFEE);
        }
        class263 var7 = new class263();
        if (var6 != null) {
            var7.method1587(new class157(var6), arg1 - 12808);
        }
        class380 var8 = this.field1268;
        synchronized (this.field1268) {
            this.field1268.method2174(var7, (long) arg0, (byte) 123);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)V")
    public final void method588(byte arg0, int arg1) {
        field1266++;
        class380 var3 = this.field1268;
        synchronized (this.field1268) {
            if (arg0 != 57) {
                this.field1273 = null;
            }
            this.field1268.method2179(false, arg1);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class281.field3703 <= (arg5 - arg4) && class255.field3350 >= arg4 + arg5 && class6.field66 <= (arg6 - arg4) && class151.field2071 >= (arg6 + arg4)) {
            class693.method3911(arg1, arg6, arg0, arg4, arg5, 512, arg2);
        } else {
            class224.method1400(0, arg2, arg6, arg0, arg1, arg5, arg4);
        }
        if (arg3 == 0) {
            field1270++;
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lnq;ILga;)V")
    public class107(class650 arg0, int arg1, class332 arg2) {
        this.field1273 = arg2;
        this.field1273.method1939(0, 1);
    }
}
