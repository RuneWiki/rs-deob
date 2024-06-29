import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class113 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public int field2070 = 0;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public int field2079 = 0;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public int field2076 = 2048;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public int field2085 = 2048;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field2073 = 255;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Lud;")
    public static class279 field2075 = class130.method1024("n", 255);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Z")
    public static boolean field2077 = true;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lud;")
    public static class279 field2074 = class130.method1024("Fermer", 255);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lud;")
    public static class279 field2071 = class130.method1024("null", 255);

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "[[B")
    public static byte[][] field2080;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBLvh;)V", line = 13)
    public final void method917(int arg0, byte arg1, class53 arg2) {
        while (true) {
            int var4 = arg2.method483(arg1 - 97);
            if (var4 == 0) {
                field2078++;
                if (arg1 != -9) {
                    this.field2070 = -6;
                }
                return;
            }
            this.method918(arg0, arg2, (byte) 76, var4);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILvh;BI)V", line = 52)
    private final void method918(int arg0, class53 arg1, byte arg2, int arg3) {
        if (arg3 == 1) {
            this.field2070 = arg1.method483(-114);
        } else if (arg3 == 2) {
            this.field2085 = arg1.method468(28214);
        } else if (arg3 == 3) {
            this.field2076 = arg1.method468(28214);
        } else if (arg3 == 4) {
            this.field2079 = arg1.method495((byte) -99);
        }
        int var5 = 115 % ((arg2 + 60) / 62);
        field2072++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 99)
    public static void method919(byte arg0) {
        field2080 = (byte[][]) null;
        field2071 = null;
        if (arg0 >= 57) {
            field2075 = null;
            field2074 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIII)V", line = 127)
    public static final void method920(byte arg0, int arg1, int arg2, int arg3) {
        field2081++;
        if (arg0 == -66) {
            class104 var4 = class293.method2085(11, arg2, false);
            var4.method879(0);
            var4.field1965 = arg1;
            var4.field1966 = arg3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Z", line = 150)
    public static final boolean method921(boolean arg0) {
        field2084++;
        if (arg0) {
            return class181.field3310 == 0 ? class17.field538.method124(10102) : true;
        } else {
            return true;
        }
    }
}
