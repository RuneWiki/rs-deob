import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class461 {

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
    public int field6718 = 1190717;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "I")
    public int field6725 = 8;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public int field6727 = 512;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public int field6720 = -1;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public int field6728 = -1;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
    public int field6722 = 64;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
    public int field6731 = 127;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public int field6726 = 0;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "Z")
    public boolean field6732 = true;

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "Z")
    public boolean field6730 = true;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "Z")
    public boolean field6733 = false;

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6734 = new String[] { method3549(method3548("j\bm\u0000")), method3549(method3548("j\u001a`BE,")), method3549(method3548("\u007fS/By")), method3549(method3548("j\u001a`BG,")), method3549(method3548("j\u001a`BF,")) };

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public int field6719;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "Lnba;")
    public class78 field6721;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljc;I)V", line = 18)
    public final void method3545(class711 arg0, int arg1) {
        try {
            field6723++;
            while (true) {
                int var3 = arg0.method5128(0);
                if (var3 == 0) {
                    int var4 = -103 % ((45 - arg1) / 41);
                    return;
                }
                this.method3546(9, arg0, var3);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6734[1] + (arg0 == null ? field6734[0] : field6734[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjc;I)V", line = 40)
    private final void method3546(int arg0, class711 arg1, int arg2) {
        try {
            if (arg2 == 1) {
                this.field6726 = class250.method2033(arg1.method5085(true), 28317);
            } else if (arg2 == 2) {
                this.field6728 = arg1.method5128(0);
            } else if (arg2 == 3) {
                this.field6728 = arg1.method5116((byte) -112);
                if (this.field6728 == 65535) {
                    this.field6728 = -1;
                }
            } else if (arg2 == 5) {
                this.field6732 = false;
            } else if (arg2 == 7) {
                this.field6720 = class250.method2033(arg1.method5085(true), 28317);
            } else if (arg2 == 8) {
                this.field6721.field1105 = this.field6719;
            } else if (arg2 == 9) {
                this.field6727 = arg1.method5116((byte) -112) << 2;
            } else if (arg2 == 10) {
                this.field6730 = false;
            } else if (arg2 == 11) {
                this.field6725 = arg1.method5128(0);
            } else if (arg2 == 12) {
                this.field6733 = true;
            } else if (arg2 == 13) {
                this.field6718 = arg1.method5085(true);
            } else if (arg2 == 14) {
                this.field6722 = arg1.method5128(arg0 - 9) << 2;
            } else if (arg2 == 16) {
                this.field6731 = arg1.method5128(arg0 - 9);
            }
            field6729++;
            if (arg0 != 9) {
                this.method3546(-127, null, 111);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6734[3] + arg0 + ',' + (arg1 == null ? field6734[0] : field6734[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)V", line = 115)
    public final void method3547(boolean arg0) {
        try {
            this.field6725 = this.field6725 << 8 | this.field6719;
            if (arg0) {
                field6724++;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6734[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3548(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3549(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
