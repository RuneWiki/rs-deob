import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class179 {

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2332 = new String[] { method1497(method1496("f&+Fs")), method1497(method1496("f&+@s")), method1497(method1496("|=io")), method1497(method1496("if+-&")), method1497(method1496("f&+As")), method1497(method1496("[&sb7{,%D\u0001[\u0018%k>s,`qz")), method1497(method1496("f&+Bs")), method1497(method1496("[&sb7{,%D\u0001[\u0018%`4\u007f8wf(a-a#?s<d\"")) };

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field2331 = 0;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2325;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([BI)[B")
    public final byte[] method1491(byte[] arg0, int arg1) {
        try {
            field2329++;
            class711 var3 = new class711(arg0);
            var3.field9945 = arg0.length - 4;
            int var4 = var3.method5148(false);
            var3.field9945 = arg1;
            byte[] var5 = new byte[var4];
            this.method1494(var3, var5, 10);
            return var5;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field2332[4] + (arg0 == null ? field2332[2] : field2332[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIILjea;)V")
    public static final void method1492(int arg0, int arg1, int arg2, int arg3, class6 arg4) {
        class621 var5 = class598.method4412(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field2969 = (arg1 << field2328) + class157.field2000;
        arg4.field2975 = arg3;
        arg4.field2984 = (arg2 << field2328) + class157.field2000;
        var5.field8848 = arg4;
        int var6 = class677.field9474 == class107.field1413 ? 1 : 0;
        if (arg4.method582(false)) {
            if (arg4.method579(false)) {
                arg4.field2977 = class210.field3050[var6];
                class210.field3050[var6] = arg4;
                return;
            }
            arg4.field2977 = class563.field8239[var6];
            class563.field8239[var6] = arg4;
            class710.field9925 = true;
            return;
        }
        arg4.field2977 = class391.field5707[var6];
        class391.field5707[var6] = arg4;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static final void method1493(int arg0) {
        try {
            field2326++;
            if (!class707.field9885) {
                class707.field9885 = true;
                class238.field3441 += (12.0F - class238.field3441) / 2.0F;
                if (arg0 != 288) {
                    field2328 = 95;
                }
                class669.field9440 = true;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2332[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljc;[BI)V")
    public final void method1494(class711 arg0, byte[] arg1, int arg2) {
        try {
            field2327++;
            if (arg0.field9996[arg0.field9945] != 31 || arg0.field9996[arg0.field9945 + 1] != -117) {
                throw new RuntimeException(field2332[5]);
            }
            if (this.field2325 == null) {
                this.field2325 = new Inflater(true);
            }
            try {
                this.field2325.setInput(arg0.field9996, arg0.field9945 + arg2, -arg0.field9945 + -18 + arg0.field9996.length);
                this.field2325.inflate(arg1);
            } catch (Exception var5) {
                this.field2325.reset();
                throw new RuntimeException(field2332[7]);
            }
            this.field2325.reset();
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field2332[6] + (arg0 == null ? field2332[2] : field2332[3]) + ',' + (arg1 == null ? field2332[2] : field2332[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
    public class179() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public static final void method1495(byte arg0) {
        try {
            field2330++;
            int var1 = -87 % ((17 - arg0) / 56);
            class783.field11299 = new class228(class537.field7834.method4068((byte) -73, class405.field5883), "", class670.field9445, 1006, -1, 0L, 0, 0, true, false, 0L, true);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2332[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(III)V")
    private class179(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1496(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1497(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
