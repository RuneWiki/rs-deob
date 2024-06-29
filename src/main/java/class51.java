import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class51 {

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Laj;")
    private class287 field1193 = new class287(64);

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lom;")
    private class344 field1192;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field1189 = -1;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Lom;")
    public static class344 field1187;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Lom;")
    public static class344 field1188;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "[I")
    public static int[] field1194;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V")
    public final void method622(int arg0, byte arg1) {
        field1198++;
        if (arg1 <= 102) {
            return;
        }
        class287 var3 = this.field1193;
        synchronized (this.field1193) {
            this.field1193.method1913(true);
            this.field1193 = new class287(arg0);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public final void method623(int arg0) {
        class287 var2 = this.field1193;
        synchronized (this.field1193) {
            this.field1193.method1913(true);
        }
        field1197++;
        if (arg0 < 67) {
            field1194 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public final void method624(byte arg0) {
        class287 var2 = this.field1193;
        synchronized (this.field1193) {
            this.field1193.method1912(-2552);
        }
        field1191++;
        int var3 = -112 / ((1 - arg0) / 33);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lkm;")
    public final class326 method625(int arg0, int arg1) {
        field1196++;
        class287 var3 = this.field1193;
        class326 var4;
        synchronized (this.field1193) {
            var4 = (class326) this.field1193.method1900((long) arg1, 85);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field1192;
        byte[] var6;
        synchronized (this.field1192) {
            var6 = this.field1192.method2216(class372.method2350(arg1, arg0 ^ 0xFFFFFF88), class607.method3497(arg0 ^ 0x3FC, arg1), true);
            if (arg0 != 3) {
                this.method622(-52, (byte) -49);
            }
        }
        class326 var7 = new class326();
        if (var6 != null) {
            var7.method2104((byte) 118, new class61(var6));
        }
        class287 var8 = this.field1193;
        synchronized (this.field1193) {
            this.field1193.method1904(var7, (long) arg1, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static void method626(int arg0) {
        if (arg0 != -2) {
            field1188 = null;
        }
        field1194 = null;
        field1187 = null;
        field1188 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)V")
    public final void method627(int arg0, int arg1) {
        class287 var3 = this.field1193;
        synchronized (this.field1193) {
            this.field1193.method1908(arg1, (byte) -11);
        }
        field1195++;
        int var4 = 116 % ((-arg0 - 59) / 49);
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class51(class398 arg0, int arg1, class344 arg2) {
        this.field1192 = arg2;
        if (this.field1192 != null) {
            int var4 = this.field1192.method2245(0) - 1;
            this.field1192.method2236(var4, 0);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)I")
    public static final int method628(int arg0, byte arg1, int arg2) {
        field1190++;
        if (arg1 <= 68) {
            return 64;
        } else if (arg2 == 1 || arg2 == 3) {
            return class659.field9504[arg0 & 0x3];
        } else {
            return class132.field2369[arg0 & 0x3];
        }
    }
}
