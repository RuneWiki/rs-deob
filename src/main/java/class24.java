import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 {

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "Lhm;")
    private class208 field271 = new class208(64);

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "Lpfa;")
    private class275 field273;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public static int field277 = -1;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
    public static int field276 = 0;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "Ldr;")
    public static class675 field274 = new class675(50, 0);

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "[I")
    public static int[] field282 = new int[13];

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "Ldr;")
    public static class675 field283 = new class675(11, 0);

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "Z")
    public static boolean field281;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
    public static void method154(int arg0) {
        field282 = null;
        field283 = null;
        if (arg0 > -49) {
            method154(-79);
        }
        field274 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IB)V")
    public final void method155(int arg0, byte arg1) {
        class208 var3 = this.field271;
        synchronized (this.field271) {
            this.field271.method1222(14564, arg0);
            int var4 = 19 / ((-arg1 - 74) / 51);
        }
        field280++;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
    public final void method156(byte arg0) {
        field275++;
        class208 var2 = this.field271;
        synchronized (this.field271) {
            this.field271.method1218(97);
        }
        if (arg0 <= 64) {
            field277 = -55;
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V")
    public final void method157(int arg0) {
        field279++;
        class208 var2 = this.field271;
        synchronized (this.field271) {
            this.field271.method1224(false);
            if (arg0 != 9012) {
                field276 = 108;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)Lmba;")
    public final class388 method158(int arg0, int arg1) {
        field278++;
        class208 var3 = this.field271;
        class388 var4;
        synchronized (this.field271) {
            var4 = (class388) this.field271.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field273;
        byte[] var6;
        synchronized (this.field273) {
            var6 = this.field273.method1659(9, arg0, arg1);
        }
        class388 var7 = new class388();
        if (var6 != null) {
            var7.method2216(new class572(var6), -70);
        }
        var7.method2218((byte) 97);
        class208 var8 = this.field271;
        synchronized (this.field271) {
            this.field271.method1230((byte) -124, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lbs;ILpfa;)V")
    public class24(class643 arg0, int arg1, class275 arg2) {
        this.field273 = arg2;
        if (this.field273 != null) {
            this.field273.method1655(35, (byte) -82);
        }
    }
}
