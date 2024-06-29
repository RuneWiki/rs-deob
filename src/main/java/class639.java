import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class639 extends InputStream {

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9289 = new String[] { method4692(method4691(".&\u000b9je")), method4692(method4691(".&\u000b9[(.\u000e?")), method4692(method4691(".&\u000b9ke")), method4692(method4691(".&\u000b9me")) };

    @OriginalMember(owner = "client!cia", name = "f", descriptor = "[I")
    public static int[] field9287 = new int[2];

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "Lwia;")
    public static class790 field9285 = new class790(79, 8);

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "I")
    public static int field9288 = 2;

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!cia", name = "read", descriptor = "()I", line = 5)
    public final int read() {
        try {
            field9284++;
            class151.method1269(false, 30000L);
            return -1;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9289[1] + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V", line = 14)
    public static final void method4687(byte arg0) {
        try {
            class613.field8960 = null;
            field9283++;
            if (arg0 >= -117) {
                field9288 = -33;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9289[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V", line = 25)
    public static final void method4688(int arg0) throws class382 {
        try {
            if (class166.field2283 == 1) {
                class301.field4720.method513(class370.field5643, class738.field10736);
            } else {
                class301.field4720.method513(0, 0);
            }
            field9286++;
            if (arg0 != 30083) {
                field9288 = 88;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9289[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(B)V", line = 44)
    public static void method4689(byte arg0) {
        try {
            field9285 = null;
            if (arg0 > 23) {
                field9287 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9289[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)V", line = 58)
    public static final void method4690(int arg0) {
        if (arg0 == 0) {
            if (class630.field9216 == 2) {
                class108.field1259[0].method4794(class180.field2498[0]);
                class108.field1259[1].method4794(class180.field2498[1]);
            } else if (class630.field9216 == 3) {
                class108.field1259[0].method4794(class180.field2498[0]);
                class108.field1259[1].method4794(class180.field2498[1]);
                class108.field1259[2].method4794(class180.field2498[2]);
            } else {
                class108.field1259[0].method4794(class180.field2498[0]);
                class108.field1259[1].method4794(class180.field2498[1]);
                class108.field1259[2].method4794(class180.field2498[2]);
                class108.field1259[3].method4794(class180.field2498[3]);
            }
        } else if (arg0 == 1) {
            if (class630.field9216 == 2) {
                class108.field1259[0].method4794(class180.field2498[2]);
            } else if (class630.field9216 == 3) {
                class108.field1259[0].method4794(class180.field2498[3]);
                class108.field1259[1].method4794(class180.field2498[4]);
            } else {
                class108.field1259[0].method4794(class180.field2498[4]);
                class108.field1259[1].method4794(class180.field2498[5]);
                class108.field1259[2].method4794(class180.field2498[6]);
            }
        } else if (arg0 == 2) {
            if (class630.field9216 == 2) {
                class108.field1259[0].method4794(class180.field2498[3]);
                return;
            }
            if (class630.field9216 == 3) {
                class108.field1259[0].method4794(class180.field2498[5]);
                return;
            }
            class108.field1259[0].method4794(class180.field2498[7]);
        }
    }

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4691(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4692(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
