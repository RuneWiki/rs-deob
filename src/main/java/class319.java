import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class319 extends class43 {

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field4384 = 0;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public int field4380;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Z")
    public boolean field4379;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)Z", line = 3)
    public final boolean method137(int arg0) {
        field4375++;
        if (arg0 != 0) {
            field4384 = -40;
        }
        return false;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lvk;B)I", line = 14)
    public static final int method2029(class207 arg0, byte arg1) {
        field4378++;
        String var2 = class115.method757(arg0, -18357);
        int[] var3 = null;
        if (arg1 != -76) {
            method2029((class207) null, (byte) -48);
        }
        if (class162.method1071(arg0.field2797, 68)) {
            var3 = class347.method2222((int) arg0.field2807, 18682).field5728;
        } else if (class14.method77((byte) 107, arg0.field2797)) {
            class437 var4 = class445.field6422[(int) arg0.field2807];
            if (var4 != null) {
                var3 = var4.field6290.field2974;
            }
        } else if (class326.method2052(false, arg0.field2797)) {
            if (arg0.field2797 == 1008) {
                var3 = class310.method1961((int) arg0.field2807, (byte) 35).field5181;
            } else {
                var3 = class310.method1961((int) (arg0.field2807 >>> 32 & 0x7FFFFFFFL), (byte) 35).field5181;
            }
        }
        if (var3 != null) {
            var2 = var2 + class153.method1035(false, var3);
        }
        return class204.field2769.method439(class28.field444, var2, 8364);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V", line = 58)
    public final void method135(byte arg0) {
        field4383++;
        if (arg0 != -123) {
            method2029((class207) null, (byte) 78);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZIILaa;ILqh;)V", line = 81)
    public final void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6) {
        if (arg0 != 0) {
            this.field4382 = 37;
        }
        field4381++;
        throw new IllegalStateException();
    }
}
