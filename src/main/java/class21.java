import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class21 extends InputStream {

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "Z")
    public static boolean field316 = false;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "Ljava/lang/String;")
    public static String field314 = "Loading sprites - ";

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "Lmb;")
    public static class258 field318;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "Ldj;")
    public static class304 field321;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static final void method140(byte arg0) {
        field315++;
        for (int var1 = -1; var1 < field317; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class75.field1290[var1];
            }
            class127 var7 = class367.field5225[var6];
            if (var7 != null && var7.field5628 > 0) {
                var7.field5628--;
                if (var7.field5628 == 0) {
                    var7.field5678 = null;
                }
            }
        }
        int var2 = -64 % ((-arg0 - 76) / 34);
        for (int var3 = 0; var3 < class156.field2376; var3++) {
            int var4 = class416.field6027[var3];
            class98 var5 = class447.field6512[var4];
            if (var5 != null && var5.field5628 > 0) {
                var5.field5628--;
                if (var5.field5628 == 0) {
                    var5.field5678 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)V")
    public static final void method141(byte arg0) {
        field312++;
        for (class324 var1 = (class324) class127.field2075.method157((byte) -125); var1 != null; var1 = (class324) class127.field2075.method145(-114)) {
            if (var1.field4686) {
                var1.method2153(0);
            }
        }
        for (class324 var2 = (class324) class30.field441.method157((byte) -125); var2 != null; var2 = (class324) class30.field441.method145(arg0 - 38)) {
            if (var2.field4686) {
                var2.method2153(0);
            }
        }
        if (arg0 != -73) {
            field317 = -81;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static final void method142(int arg0) {
        class447.field6511.method106((byte) -110);
        if (arg0 >= -102) {
            method143(false, (class90) null);
        }
        field313++;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZLja;)V")
    public static final void method143(boolean arg0, class90 arg1) {
        if (class369.field5242) {
            class44.method356((byte) -63, arg1);
        } else {
            class73.method581(arg1, (byte) 85);
        }
        field308++;
        if (!arg0) {
            field321 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "read", descriptor = "()I")
    public final int read() {
        class134.method1106(30000L, 10);
        field309++;
        return -1;
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V")
    public static void method144(byte arg0) {
        field321 = null;
        if (arg0 != 31) {
            method140((byte) 31);
        }
        field314 = null;
        field318 = null;
    }
}
