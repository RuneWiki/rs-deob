import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class368 {

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Z")
    public boolean field5318 = false;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Ldh;")
    public static class216 field5309 = new class216(0, 17);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public int field5315;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Llk;")
    public static class423 field5312;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lrj;")
    public static class430 field5320;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lag;")
    public class491 field5313;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "[Laa;")
    public static class343[] field5317;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static final void method2251(byte arg0) {
        class452.field6603 = 0;
        field5307++;
        for (int var1 = 0; var1 < 2048; var1++) {
            class138.field2148[var1] = null;
            class319.field4736[var1] = 1;
            class263.field3977[var1] = null;
        }
        if (arg0 != -37) {
            method2251((byte) 126);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Z")
    public final boolean method2252(int arg0) {
        if (arg0 != -3984) {
            this.method2253(false, -36, null);
        }
        field5310++;
        return this.field5313.field7077.method2035(this.field5314, (byte) -94);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZILwn;)V")
    private final void method2253(boolean arg0, int arg1, class519 arg2) {
        if (arg1 == 1) {
            this.field5314 = arg2.method3018(566990904);
        } else if (arg1 == 2) {
            this.field5315 = arg2.method3040((byte) -3);
        } else if (arg1 == 3) {
            this.field5318 = true;
        } else if (arg1 == 4) {
            this.field5314 = -1;
        }
        if (!arg0) {
            field5308++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILwn;)V")
    public final void method2254(int arg0, class519 arg1) {
        field5319++;
        while (true) {
            int var3 = arg1.method3072((byte) -125);
            if (var3 == 0) {
                if (arg0 >= -56) {
                    field5320 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method2253(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method2255(byte arg0) {
        field5320 = null;
        field5317 = null;
        int var1 = -75 / ((46 - arg0) / 58);
        field5312 = null;
        field5309 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLwn;)V")
    public static final void method2256(byte arg0, class519 arg1) {
        field5316++;
        if (arg0 != -74) {
            method2256((byte) 40, null);
        }
        byte[] var2 = new byte[24];
        if (class485.field7027 != null) {
            try {
                class485.field7027.method2806(17788, 0L);
                class485.field7027.method2809(var2, (byte) 83);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method3058(var2, (byte) 72, 0, 24);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILqa;IZ)Laa;")
    public final class343 method2257(int arg0, class167 arg1, int arg2, boolean arg3) {
        field5311++;
        long var5 = (long) (arg1.field2503 << 19 | (arg3 ? 262144 : 0) | arg0 << 16 | this.field5314);
        class343 var7 = (class343) this.field5313.field7086.method2982(0, var5);
        if (arg2 != 13827) {
            return null;
        } else if (var7 != null) {
            return var7;
        } else if (this.field5313.field7077.method2035(this.field5314, (byte) -94)) {
            class104 var8 = class104.method767(this.field5313.field7077, this.field5314, 0);
            if (var8 != null) {
                var8.field1591 = var8.field1592 = var8.field1593 = var8.field1595 = 0;
                if (arg3) {
                    var8.method756();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method759();
                }
            }
            class343 var10 = arg1.method308(var8, true);
            if (var10 != null) {
                this.field5313.field7086.method2981(var10, arg2 ^ 0x361E, var5);
            }
            return var10;
        } else {
            return null;
        }
    }
}
