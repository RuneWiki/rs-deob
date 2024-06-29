import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class652 {

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Z")
    public boolean field8956;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Lsaa;")
    public static class326 field8949 = new class326("game3", 2);

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lada;")
    public class161 field8950;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Lada;")
    public class161 field8951;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Z")
    public boolean field8952;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "[Log;")
    public static class647[] field8958;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method3589(byte arg0) {
        field8957++;
        if (arg0 > -23) {
            return false;
        } else {
            return this.field8952 && !this.field8956;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 19)
    public static final void method3590(int arg0) {
        field8953++;
        class360[] var1 = class239.field3195;
        synchronized (class239.field3195) {
            for (int var2 = arg0; var2 < class239.field3195.length; var2++) {
                class239.field3195[var2] = new class360();
                class95.field1115[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 41)
    public static void method3591(int arg0) {
        field8958 = null;
        if (arg0 == -5949) {
            field8949 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([[[Lwq;I)V", line = 55)
    public static final void method3592(class165[][][] arg0, int arg1) {
        field8955++;
        for (int var2 = arg1; var2 < arg0.length; var2++) {
            class165[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class165 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2266 instanceof class706) {
                            ((class706) var6.field2266).method866((byte) -62);
                        }
                        if (var6.field2267 instanceof class706) {
                            ((class706) var6.field2267).method866((byte) -62);
                        }
                        if (var6.field2278 instanceof class706) {
                            ((class706) var6.field2278).method866((byte) -62);
                        }
                        if (var6.field2269 instanceof class706) {
                            ((class706) var6.field2269).method866((byte) -62);
                        }
                        if (var6.field2265 instanceof class706) {
                            ((class706) var6.field2265).method866((byte) -62);
                        }
                        for (class356 var7 = var6.field2270; var7 != null; var7 = var7.field5066) {
                            class524 var8 = var7.field5067;
                            if (var8 instanceof class706) {
                                ((class706) var8).method866((byte) -62);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Z)V", line = 125)
    public class652(boolean arg0) {
        this.field8956 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V", line = 137)
    public final void method3593(int arg0) {
        if (arg0 > -121) {
            method3592(null, -87);
        }
        if (this.field8950 != null) {
            this.field8950.method1059(5342);
        }
        field8954++;
        this.field8952 = false;
    }
}
