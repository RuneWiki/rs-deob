import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class236 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lff;")
    private class9 field3259 = new class9(16);

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "Lvh;")
    private class240 field3266;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field3262 = 0;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 5)
    public final void method1374(byte arg0) {
        if (arg0 != 109) {
            this.field3259 = null;
        }
        field3263++;
        class9 var2 = this.field3259;
        synchronized (this.field3259) {
            this.field3259.method65(false);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)V", line = 18)
    public final void method1375(int arg0, byte arg1) {
        field3264++;
        class9 var3 = this.field3259;
        synchronized (this.field3259) {
            this.field3259.method61((byte) -67, arg0);
        }
        if (arg1 != 15) {
            field3262 = -85;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)Lrn;", line = 36)
    public static final class174 method1376(boolean arg0) {
        field3265++;
        try {
            if (!arg0) {
                field3262 = 116;
            }
            return (class174) Class.forName("dc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Lbo;", line = 57)
    public final class512 method1377(int arg0, int arg1) {
        field3261++;
        class9 var3 = this.field3259;
        class512 var4;
        synchronized (this.field3259) {
            var4 = (class512) this.field3259.method56((long) arg1, 80);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3266.method1411(true, arg1, arg0);
        class512 var6 = new class512();
        if (var5 != null) {
            var6.method3005(-128, new class365(var5));
        }
        class9 var7 = this.field3259;
        synchronized (this.field3259) {
            this.field3259.method73((long) arg1, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 88)
    public final void method1378(int arg0) {
        if (arg0 != -26985) {
            this.method1377(-123, -55);
        }
        field3260++;
        class9 var2 = this.field3259;
        synchronized (this.field3259) {
            this.field3259.method67(arg0 ^ 0x691F);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Llf;ILvh;)V", line = 106)
    public class236(class157 arg0, int arg1, class240 arg2) {
        this.field3266 = arg2;
        this.field3266.method1397((byte) -116, 30);
    }
}
