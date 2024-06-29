import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class57 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lok;")
    public static class146 field1007 = class302.method2136(25162, 160);

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field1010 = 0;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lok;")
    public static class146 field1009 = class235.method1724(-12908, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field1012 = 0;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method451(boolean arg0, int arg1) {
        class39.field693 = (short[][][]) null;
        field1010 = 0;
        class137.field2288 = (byte[][][]) null;
        class33.field632 = (byte[][][]) null;
        class18.field363 = (byte[][][]) null;
        if (arg0 && class75.field1219 != null) {
            class147.field2500 = class75.field1219.field3236;
        } else {
            class147.field2500 = null;
        }
        field1004++;
        class298.field5067 = (byte[][][]) null;
        class206.field3446 = (int[][][]) null;
        class277.field4762 = (byte[][][]) null;
        class75.field1219 = null;
        class318.field5401 = (int[][][]) null;
        class185.field3081 = null;
        if (arg1 > -75) {
            return;
        }
        class190.field3150 = null;
        class215.field3547.method1257(2);
        class20.field382 = null;
        class138.field2299 = -1;
        class226.field3774 = null;
        class14.field269 = null;
        class192.field3173 = null;
        class278.field4768 = null;
        class306.field5228 = -1;
        class26.field461 = null;
        class101.field1632 = null;
        class142.field2368 = null;
        class135.field2255 = null;
        class309.field5253 = null;
        class89.field1423 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 57)
    public static void method452(byte arg0) {
        if (arg0 == 10) {
            field1009 = null;
            field1007 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/awt/Component;III)Lub;", line = 78)
    public static final class20 method453(Component arg0, int arg1, int arg2, int arg3) {
        field1005++;
        try {
            Class var4 = Class.forName("ob");
            class20 var5 = (class20) var4.getDeclaredConstructor().newInstance();
            if (arg3 == 0) {
                var5.method145(arg2, arg0, arg1, true);
                return var5;
            } else {
                return (class20) null;
            }
        } catch (Throwable var8) {
            class252 var7 = new class252();
            var7.method145(arg2, arg0, arg1, true);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(III)V", line = 103)
    public class57(int arg0, int arg1, int arg2) {
        this.field1001 = arg0;
        this.field1003 = arg2;
        this.field1002 = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IJIB)Z", line = 116)
    public static final boolean method454(int arg0, long arg1, int arg2, byte arg3) {
        int var5 = (int) arg1 >> 20 & 0x3;
        field1006++;
        int var6 = -86 % ((arg3 - 6) / 49);
        int var7 = ((int) arg1 & 0x7F3DE) >> 14;
        int var8 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class5 var9 = class112.method756((byte) 106, var8);
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var10 = var9.field66;
                var11 = var9.field62;
            } else {
                var10 = var9.field62;
                var11 = var9.field66;
            }
            int var12 = var9.field71;
            if (var5 != 0) {
                var12 = (var12 >> 4 - var5) + (var12 << var5 & 0xF);
            }
            class305.method2148(true, var10, 2, class102.field1639.field5432[0], arg0, 0, arg2, 0, var11, class102.field1639.field5419[0], true, var12);
        } else {
            class305.method2148(true, 0, 2, class102.field1639.field5432[0], arg0, var5, arg2, var7 + 1, 0, class102.field1639.field5419[0], true, 0);
        }
        class63.field1093 = 2;
        class260.field4328 = class215.field3542;
        class161.field2737 = class120.field1974;
        class74.field1207 = 0;
        return true;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
    public abstract void method259(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)V")
    public abstract void method260(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V")
    public abstract void method258(byte arg0, int arg1, int arg2);
}
