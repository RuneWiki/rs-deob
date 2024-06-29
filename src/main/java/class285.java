import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class285 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "[I")
    public static int[] field4614 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[[[I")
    public static int[][][] field4613;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method1951(int arg0) {
        if (arg0 == 38) {
            field4614 = null;
            field4613 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
    public static final void method1952(Throwable arg0, byte arg1, String arg2) {
        field4615++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class291.method1981(104, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class67.method447((byte) -22, var3);
            String var4 = class19.method110(":", "%3a", -74, var3);
            String var5 = class19.method110("@", "%40", 125, var4);
            String var6 = class19.method110("&", "%26", -55, var5);
            String var7 = class19.method110("#", "%23", -39, var6);
            if (class18.field249.field3832 != null) {
                class160 var8 = class18.field249.method1677(-121, new URL(class18.field249.field3832.getCodeBase(), "clienterror.ws?c=" + class45.field541 + "&u=" + class46.field564 + "&v1=" + class239.field3841 + "&v2=" + class239.field3831 + "&e=" + var7));
                while (var8.field2399 == 0) {
                    class7.method43(-79, 1L);
                }
                if (var8.field2399 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2401;
                    var9.read();
                    var9.close();
                }
                int var10 = -122 % ((arg1 + 13) / 60);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lvl;I)V")
    public static final void method1953(class73 arg0, int arg1) {
        field4612++;
        class250.field4050 = arg0;
        if (arg1 <= 4) {
            field4613 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static final void method1954(byte arg0) {
        if (arg0 == 107) {
            class134.field1931.method1511((byte) 98);
            field4616++;
        }
    }
}
