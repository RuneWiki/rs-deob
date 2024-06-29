import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public abstract class class496 extends class568 {

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "Lvf;")
    public class159 field7444;

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7452 = new String[] { method3757(method3756("U?'OR\u000b")), method3757(method3756("M+*\r")), method3757(method3756("XphOg")), method3757(method3756("U?'O&J0/\u0015$\u000b")), method3757(method3756("U?'O_\u000b")), method3757(method3756("U?'O\\\u000b")), method3757(method3756("U?'OP\u000b")), method3757(method3756("U?'OY\u000b")), method3757(method3756("U?'OV\u000b")) };

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
    public static int field7449 = -1;

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "Z")
    public boolean field7447;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)I", line = 5)
    public int method3744(boolean arg0) {
        try {
            field7448++;
            return arg0 ? -124 : 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7452[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IBI)I", line = 20)
    public static final int method3746(int arg0, byte arg1, int arg2) {
        try {
            field7443++;
            if (class623.field8988 == -1) {
                return 1;
            }
            if (class623.field8996.field6379.method4132(true) != arg2) {
                class152.method1382(-5, true, arg2, class709.field10215.method5154(class795.field11624, (byte) 65));
                if (class623.field8996.field6379.method4132(true) != arg2) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class442.field6902.getSize();
                class567.method4167(true, (byte) 122, class662.field9437, class64.field877, class709.field10215.method5154(class795.field11624, (byte) 65), class213.field3367);
                class141 var4 = class108.method1007(class480.field7311, class623.field8988, 0, 101);
                if (arg1 <= 46) {
                    field7449 = -12;
                }
                long var5 = class712.method5167(-2334);
                class662.field9437.method227();
                class400.field6321.method2465(0, class316.field5139, 0);
                class662.field9437.method254(class400.field6321);
                class662.field9437.method156(var3.width / 2, var3.height / 2, 512, 512);
                class662.field9437.method166(1.0F);
                class662.field9437.method243(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class499 var7 = class662.field9437.method192(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label54: for (int var9 = 0; var9 < 500; var9++) {
                    class662.field9437.method182(0);
                    class662.field9437.method196();
                    for (int var10 = 15; var10 >= 0; var10--) {
                        for (int var11 = 0; var11 <= var10; var11++) {
                            class461.field7105.method2465((int) (((float) var11 - (float) var10 / 2.0F) * (float) class152.field2131), 0, (var10 + 1) * class152.field2131);
                            var8++;
                            var7.method426(class461.field7105, null, 0);
                            if ((long) arg0 <= class712.method5167(-2334) - var5) {
                                break label54;
                            }
                        }
                    }
                }
                class662.field9437.method233();
                long var12 = (long) (var8 * 1000) / (class712.method5167(-2334) - var5);
                class662.field9437.method182(0);
                class662.field9437.method196();
                return (int) var12;
            } catch (Throwable var16) {
                var16.printStackTrace();
                return -1;
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field7452[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Z", line = 110)
    public final boolean method3748(int arg0) {
        try {
            if (arg0 == -2362) {
                field7451++;
                return false;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7452[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BI)I", line = 123)
    public static final int method3749(byte arg0, int arg1) {
        try {
            int var2 = 50 / ((10 - arg0) / 57);
            field7450++;
            return arg1 >>> 7;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7452[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lvf;)V", line = 133)
    public class496(class159 arg0) {
        try {
            this.field7444 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7452[3] + (arg0 == null ? field7452[1] : field7452[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)I", line = 144)
    public final int method3751(byte arg0) {
        try {
            field7445++;
            return arg0 <= 58 ? 33 : 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7452[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "(I)Z", line = 155)
    public final boolean method3752(int arg0) {
        try {
            field7446++;
            if (arg0 != 2) {
                this.method3745(false);
            }
            return this.field7447;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7452[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Z)V")
    public abstract void method3745(boolean arg0);

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)Z")
    public abstract boolean method3747(int arg0);

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BII)V")
    public abstract void method3750(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILkia;Lkia;I)V")
    public abstract void method3753(int arg0, class649 arg1, class649 arg2, int arg3);

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)Z")
    public abstract boolean method3754(int arg0);

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V")
    public abstract void method3755(int arg0, int arg1);

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3756(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3757(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 94;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 26;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
