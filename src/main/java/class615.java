import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class615 {

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(II)Z")
    public static final boolean method3555(int arg0, int arg1) {
        field8666++;
        if (arg0 == 59 || arg0 == 19 || arg0 == 13 || arg0 == 25 || arg0 == 20) {
            return true;
        } else if (arg0 == 22 || arg0 == 1004) {
            return true;
        } else {
            if (arg1 != 5066) {
                method3555(5, 66);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V")
    public static final void method3556(byte arg0) {
        if (arg0 != 2) {
            method3555(-93, 55);
        }
        if (class754.field10532 != null) {
            try {
                class754.field10532.close();
            } catch (IOException var1) {
            }
        }
        field8669++;
        class754.field10532 = null;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ZIII)Lvd;")
    public static final class39 method3557(boolean arg0, int arg1, int arg2, int arg3) {
        field8668++;
        class492 var4 = null;
        if (arg2 != 1000000) {
            return null;
        }
        if (class329.field4694 != null) {
            var4 = new class492(arg3, class329.field4694, class165.field2608[arg3], 1000000);
        }
        class573.field8096[arg3] = class176.field2726.method2642(var4, arg3, (byte) 72, class260.field3707);
        class573.field8096[arg3].method4213(arg2 ^ 0xF5188);
        return new class39(class573.field8096[arg3], arg0, arg1);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3558(int arg0, String arg1) {
        field8667++;
        String var2 = null;
        if (arg0 >= -111) {
            return null;
        }
        int var3 = arg1.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var4 = arg1.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg1.length();
                arg1 = arg1.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }
}
