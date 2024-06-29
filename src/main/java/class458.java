import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class458 extends class3 implements class723 {

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field6675 = new String[] { method3497(method3496("{\u001c\u0007aL")), method3497(method3496("{\u001c\u0007cL")), method3497(method3496("{\u001c\u0007gL")), method3497(method3496("{\u001c\u0007fL")), method3497(method3496("{\u001c\u0007kL")), method3497(method3496("r\u001bEN")), method3497(method3496("g@\u0007\f\u0019")), method3497(method3496("{\u001c\u0007dL")), method3497(method3496("{\u001c\u0007eL")), method3497(method3496("{\u001c\u0007`L")), method3497(method3496("{\u001c\u0007jL")), method3497(method3496("\u007f\u0006")) };

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "Lvha;")
    public static class713 field6663 = new class713(4, 16);

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "B")
    private byte field6664;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)V", line = 3)
    public static void method3493(int arg0) {
        try {
            field6663 = null;
            if (arg0 != 16) {
                method3495(-59);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6675[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 14)
    public final Buffer method170(boolean arg0, boolean arg1) {
        try {
            if (arg0) {
                this.field6664 = -112;
            }
            ++field6671;
            return super.method17((byte) 51, arg1, super.field24.field10101);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6675[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "(I)I", line = 28)
    public final int method3494(int arg0) {
        try {
            ++field6670;
            int var2 = 104 / ((60 - arg0) / 53);
            return this.field6664;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6675[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z", line = 38)
    public final boolean method169(int arg0, int arg1, Source arg2, int arg3) {
        try {
            ++field6668;
            int var5 = -97 / ((-17 - arg3) / 38);
            this.field6664 = (byte) arg0;
            super.method19(arg1, true, arg2);
            return true;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6675[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6675[6] : field6675[5]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)I", line = 52)
    public final int method25(int arg0) {
        try {
            ++field6666;
            if (arg0 != -12502) {
                this.method166(118, 48, 73);
            }
            return super.method25(-12502);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6675[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Z", line = 63)
    public final boolean method166(int arg0, int arg1, int arg2) {
        try {
            this.field6664 = (byte) arg1;
            ++field6674;
            super.method24(arg2, -10749);
            int var4 = 66 / ((75 - arg0) / 45);
            return true;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6675[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "(I)Lil;", line = 81)
    public static final class7 method3495(int arg0) {
        try {
            ++field6665;
            try {
                return new class62();
            } catch (Throwable var3) {
                if (arg0 != 16) {
                    field6669 = 52;
                }
                try {
                    return (class7) Class.forName(field6675[11]).newInstance();
                } catch (Throwable var2) {
                    return new class337();
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6675[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lrda;Z)V", line = 104)
    public class458(class690 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)Z", line = 115)
    public final boolean method167(int arg0) {
        try {
            if (arg0 != -20743) {
                return true;
            } else {
                ++field6673;
                return super.method18(super.field24.field10101, (byte) 103);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6675[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V", line = 130)
    public final void method20(boolean arg0) {
        try {
            super.method20(arg0);
            ++field6667;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6675[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3496(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 100);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3497(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
