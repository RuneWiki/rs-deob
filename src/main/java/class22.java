import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 {

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "Lf;")
    public static class10 field244 = class23.method139("Legende", (byte) -64);

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "Lf;")
    public static class10 field246 = class23.method139("Hunter Store", (byte) -107);

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "Lf;")
    public static class10 field247 = class23.method139("Dungeon", (byte) -119);

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Lf;")
    public static class10 field245;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Lea;")
    public static class9 field242;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B)J", line = 34)
    public static final synchronized long method134(byte arg0) {
        if (arg0 != -87) {
            field242 = null;
        }
        long var1 = System.currentTimeMillis();
        if (class35.field502 > var1) {
            class15.field139 += class35.field502 - var1;
        }
        class35.field502 = var1;
        return class15.field139 + var1;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IIBLjava/awt/Component;)Lp;", line = 82)
    public static final class30 method135(int arg0, int arg1, byte arg2, Component arg3) {
        try {
            Class var4 = Class.forName("v");
            class30 var5 = (class30) var4.getDeclaredConstructor().newInstance();
            if (arg2 != 5) {
                method134((byte) 101);
            }
            var5.method191(arg3, arg1, arg0, 5706);
            return var5;
        } catch (Throwable var8) {
            class37 var7 = new class37();
            var7.method191(arg3, arg1, arg0, 5706);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)V", line = 101)
    public static void method136(int arg0) {
        field245 = null;
        field242 = null;
        field244 = null;
        field246 = null;
        field247 = null;
        if (arg0 != 0) {
            method134((byte) 48);
        }
    }
}
