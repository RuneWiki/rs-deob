import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class690 {

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public int field9650 = 8;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public int field9661 = 16777215;

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9662 = new String[] { method4931(method4930("~\u0001Y\u0010")), method4931(method4930("kZ\u001bR\u0007")), method4931(method4930("w\u0002\u001b=R")), method4931(method4930("w\u0002\u001b?R")), method4931(method4930("w\u0002\u001b>R")), method4931(method4930("w\u0002\u001b8R")) };

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Z")
    public static boolean field9648 = false;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field9655 = 1407;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field9647 = new CRC32();

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public int field9646;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public int field9649;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public int field9651;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public int field9652;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public int field9653;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public int field9656;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public int field9658;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public int field9659;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Z")
    public boolean field9645;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLjc;)V")
    public final void method4926(byte arg0, class711 arg1) {
        try {
            if (arg0 < -54) {
                while (true) {
                    int var3 = arg1.method5128(0);
                    if (var3 == 0) {
                        field9654++;
                        return;
                    }
                    this.method4927(arg1, (byte) 95, var3);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9662[2] + arg0 + ',' + (arg1 == null ? field9662[0] : field9662[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljc;BI)V")
    private final void method4927(class711 arg0, byte arg1, int arg2) {
        try {
            if (arg1 <= 69) {
                this.field9661 = -98;
            }
            if (arg2 == 1) {
                this.field9650 = arg0.method5116((byte) -128);
            } else if (arg2 == 2) {
                this.field9645 = true;
            } else if (arg2 == 3) {
                this.field9649 = arg0.method5087((byte) -26);
                this.field9658 = arg0.method5087((byte) -26);
                this.field9653 = arg0.method5087((byte) -26);
            } else if (arg2 == 4) {
                this.field9651 = arg0.method5128(0);
            } else if (arg2 == 5) {
                this.field9652 = arg0.method5116((byte) -117);
            } else if (arg2 == 6) {
                this.field9661 = arg0.method5085(true);
            } else if (arg2 == 7) {
                this.field9659 = arg0.method5087((byte) -26);
                this.field9646 = arg0.method5087((byte) -26);
                this.field9656 = arg0.method5087((byte) -26);
            }
            field9657++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9662[4] + (arg0 == null ? field9662[0] : field9662[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public static final void method4928(byte arg0) {
        try {
            class9.field117 = new class782[class169.field2159.method535((byte) -110)][];
            field9660++;
            if (arg0 == -92) {
                class646.field9185 = new class782[class169.field2159.method535((byte) -110)][];
                class443.field6542 = new boolean[class169.field2159.method535((byte) -110)];
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9662[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method4929(int arg0) {
        try {
            if (arg0 != -23558) {
                field9647 = null;
            }
            field9647 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9662[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4930(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4931(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
