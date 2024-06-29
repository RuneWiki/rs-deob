import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class222 {

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "Lff;")
    private class9 field3088 = new class9(64);

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "Lvh;")
    private class240 field3087;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public static int field3094 = -1;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "Ljm;")
    public static class485 field3095 = new class485(34, 8);

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "S")
    public static short field3097 = 32767;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "Lvh;")
    public static class240 field3089;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    public final void method1302(int arg0) {
        field3093++;
        class9 var2 = this.field3088;
        synchronized (this.field3088) {
            if (arg0 != -1748977240) {
                this.method1304(30, -56);
            }
            this.field3088.method65(false);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILa;)V")
    public static final void method1303(int arg0, class436 arg1) {
        field3098++;
        for (int var2 = 0; var2 < class282.field3806; var2++) {
            int var3 = class364.field5055[var2];
            class192 var4 = class309.field4234[var3];
            int var5 = arg1.method2099(255);
            if ((var5 & 0x8) != 0) {
                var5 += arg1.method2099(255) << 8;
            }
            if ((var5 & 0x8000) != 0) {
                var5 += arg1.method2099(arg0 ^ 0x80FF) << 16;
            }
            class45.method284(var5, 0, arg1, var3, var4);
        }
        if (arg0 != 32768) {
            method1303(64, null);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)V")
    public final void method1304(int arg0, int arg1) {
        field3092++;
        class9 var3 = this.field3088;
        synchronized (this.field3088) {
            if (arg1 != 8462) {
                this.field3096 = -19;
            }
            this.field3088.method61((byte) -67, arg0);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static void method1305(byte arg0) {
        field3089 = null;
        if (arg0 == 83) {
            field3095 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)Lgt;")
    public final class315 method1306(int arg0, int arg1) {
        field3091++;
        class9 var3 = this.field3088;
        class315 var4;
        synchronized (this.field3088) {
            if (arg0 < 4) {
                this.method1304(-90, -112);
            }
            var4 = (class315) this.field3088.method56((long) arg1, 106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3087.method1411(true, arg1, 16);
        class315 var6 = new class315();
        if (var5 != null) {
            var6.method1780(-120, new class365(var5));
        }
        class9 var7 = this.field3088;
        synchronized (this.field3088) {
            this.field3088.method73((long) arg1, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Llf;ILvh;)V")
    public class222(class157 arg0, int arg1, class240 arg2) {
        this.field3087 = arg2;
        if (this.field3087 == null) {
            this.field3096 = 0;
        } else {
            this.field3096 = this.field3087.method1397((byte) -115, 16);
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
    public final void method1307(int arg0) {
        if (arg0 != 29170) {
            method1305((byte) 125);
        }
        field3090++;
        class9 var2 = this.field3088;
        synchronized (this.field3088) {
            this.field3088.method67(arg0 - 29106);
        }
    }
}
