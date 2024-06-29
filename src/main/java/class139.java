import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class139 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lhi;")
    public static class82 field2381 = class95.method664((byte) -120, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lhn;")
    public static class317 field2380 = new class317(64);

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[I")
    public static int[] field2386 = new int[200];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lmb;")
    public static class109 field2383;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Lum;")
    public static class222 field2384;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 6)
    public static void method942(int arg0) {
        field2383 = null;
        field2384 = null;
        field2381 = null;
        if (arg0 == 136) {
            field2386 = null;
            field2380 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILum;)[Ljf;", line = 38)
    public static final class86[] method945(int arg0, int arg1, int arg2, class222 arg3) {
        if (arg0 != 64) {
            method947(-101, false, (byte[]) null);
        }
        field2382++;
        return client.method866(arg1, arg2, (byte) 49, arg3) ? class81.method512((byte) 122) : null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;", line = 63)
    public static final Object method947(int arg0, boolean arg1, byte[] arg2) {
        field2379++;
        if (arg0 != 6147) {
            return (Object) null;
        } else if (arg2 == null) {
            return null;
        } else {
            if (arg2.length > 136 && !class123.field2144) {
                try {
                    class257 var3 = (class257) Class.forName("dc").getDeclaredConstructor().newInstance();
                    var3.method2(arg2, 2141342146);
                    return var3;
                } catch (Throwable var5) {
                    class123.field2144 = true;
                }
            }
            return arg1 ? class51.method363(arg2, 30) : arg2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)I")
    public abstract int method943(byte arg0);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method944(byte arg0, Component arg1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method946(Component arg0, boolean arg1);
}
