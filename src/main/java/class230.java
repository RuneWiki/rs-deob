import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class230 {

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "Lff;")
    private class9 field3199 = new class9(64);

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "Lvh;")
    private class240 field3206;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "Lvh;")
    public class240 field3201;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V", line = 6)
    public final void method1344(int arg0, int arg1) {
        field3200++;
        class9 var3 = this.field3199;
        synchronized (this.field3199) {
            this.field3199.method61((byte) -67, arg1);
            if (arg0 < 70) {
                this.field3201 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method1345(int arg0, int arg1, int arg2) {
        field3204++;
        if (arg1 == 0) {
            return (arg0 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)Z", line = 32)
    public static final boolean method1346(int arg0, int arg1) {
        field3203++;
        if (arg0 == 3 || arg0 == 45 || arg0 == 48 || arg0 == 13 || arg0 == 59) {
            return true;
        } else if (arg0 == 50 || arg0 == 1011) {
            return true;
        } else {
            if (arg1 > -69) {
                method1346(36, -70);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 57)
    public final void method1347(int arg0) {
        class9 var2 = this.field3199;
        synchronized (this.field3199) {
            this.field3199.method67(-117);
        }
        field3202++;
        if (arg0 != 4376) {
            this.field3199 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(II)Lpq;", line = 72)
    public final class128 method1348(int arg0, int arg1) {
        field3198++;
        class9 var3 = this.field3199;
        class128 var4;
        synchronized (this.field3199) {
            var4 = (class128) this.field3199.method56((long) arg1, 55);
            if (arg0 <= 24) {
                this.field3206 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3206.method1411(true, arg1, 3);
        class128 var6 = new class128();
        var6.field1755 = this;
        if (var5 != null) {
            var6.method837(new class365(var5), (byte) 57);
        }
        class9 var7 = this.field3199;
        synchronized (this.field3199) {
            this.field3199.method73((long) arg1, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Llf;ILvh;Lvh;)V", line = 103)
    public class230(class157 arg0, int arg1, class240 arg2, class240 arg3) {
        this.field3206 = arg2;
        this.field3201 = arg3;
        this.field3206.method1397((byte) -127, 3);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 119)
    public final void method1349(int arg0) {
        class9 var2 = this.field3199;
        synchronized (this.field3199) {
            this.field3199.method65(false);
        }
        if (arg0 != 16696) {
            this.field3206 = null;
        }
        field3205++;
    }
}
