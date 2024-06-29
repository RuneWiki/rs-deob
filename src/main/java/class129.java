import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class129 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "[I")
    public static int[] field1948 = new int[50];

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1950 = 0;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Lhc;")
    public static class368 field1947 = new class368("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1952 = "";

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lon;")
    public static class35 field1951;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 8)
    public static void method971(byte arg0) {
        field1948 = null;
        field1947 = null;
        if (arg0 != 102) {
            field1947 = null;
        }
        field1952 = null;
        field1951 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIZII)V", line = 21)
    public static final void method972(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            class380.method2359((byte) -52);
        }
        field1949++;
        if (class261.field3604 != null && (arg1 != 3 || class258.field3585 != arg2 || class361.field4985 != arg5)) {
            class64.method513(class261.field3604, -2, class122.field1839);
            class261.field3604 = null;
        }
        if (arg1 == 3 && class261.field3604 == null) {
            class261.field3604 = class146.method1049(class122.field1839, arg2, 0, 0, arg5, 0);
            if (class261.field3604 != null) {
                class361.field4985 = arg5;
                class258.field3585 = arg2;
                class120.method934(-106, class122.field1839);
            }
        }
        if (arg1 == 3 && class261.field3604 == null) {
            method972(arg0, class211.field2956, -1, true, -107, -1);
            return;
        }
        Container var6;
        if (class261.field3604 != null) {
            var6 = class261.field3604;
            class72.field1041 = arg2;
            class350.field4718 = arg5;
        } else if (class323.field4392 == null) {
            var6 = class122.field1839.field1086;
            class72.field1041 = var6.getSize().width;
            class350.field4718 = var6.getSize().height;
        } else {
            Insets var7 = class323.field4392.getInsets();
            int var10001 = var7.right + var7.left;
            class72.field1041 = class323.field4392.getSize().width - var10001;
            int var13 = var7.top + var7.bottom;
            class350.field4718 = class323.field4392.getSize().height - var13;
            var6 = class323.field4392;
        }
        int var8 = -83 / ((41 - arg4) / 54);
        if (arg1 == 1) {
            class373.field5174 = 765;
            class193.field2798 = (class72.field1041 - 765) / 2;
            class396.field5493 = 503;
            class13.field116 = 0;
        } else if (class409.field5703 < 96 && class22.field284 == 0) {
            int var9 = class72.field1041 > 1024 ? 1024 : class72.field1041;
            class373.field5174 = var9;
            class193.field2798 = (class72.field1041 - var9) / 2;
            int var10 = class350.field4718 <= 768 ? class350.field4718 : 768;
            class13.field116 = 0;
            class396.field5493 = var10;
        } else {
            class396.field5493 = class350.field4718;
            class373.field5174 = class72.field1041;
            class193.field2798 = 0;
            class13.field116 = 0;
        }
        if (class314.field4259 != 0) {
            boolean var10000;
            if (class373.field5174 < 1024 && class396.field5493 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg3) {
            class90.method715(89, class22.field284);
        } else {
            class104.field1447.setSize(class373.field5174, class396.field5493);
            if (class354.field4765 != null) {
                class354.field4765.method266();
            }
            if (class323.field4392 == var6) {
                Insets var11 = class323.field4392.getInsets();
                class104.field1447.setLocation(class193.field2798 + var11.left, class13.field116 + var11.top);
            } else {
                class104.field1447.setLocation(class193.field2798, class13.field116);
            }
        }
        if (arg1 < 2) {
            class115.field1753 = false;
        } else {
            class115.field1753 = true;
        }
        if (class350.field4712 != -1) {
            class183.method1277((byte) 79, true);
        }
        if (class398.field5513 != null && (class98.field1383 == 30 || class98.field1383 == 25)) {
            class345.method2093(-103);
        }
        for (int var12 = 0; var12 < 100; var12++) {
            class363.field4998[var12] = true;
        }
        class147.field2136 = true;
    }
}
