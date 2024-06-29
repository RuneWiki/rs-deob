import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class139 {

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public int field1810;

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1815 = new String[] { method1216(method1215("^-FboX%N8m\u0019")), method1216(method1215("^-Fb'^\u0018S>:_,\u000f")), method1216(method1215("^-Fb\u0012\u0019")) };

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
    public static int field1812 = -1;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field1813 = 1;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIILlg;Llg;)V", line = 4)
    public static final void method1213(int arg0, int arg1, int arg2, class656 arg3, class656 arg4) {
        class621 var5 = class598.method4412(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field8847 = arg3;
        var5.field8852 = arg4;
        int var6 = class677.field9474 == class107.field1413 ? 1 : 0;
        if (!arg3.method582(false)) {
            arg3.field2977 = class391.field5707[var6];
            class391.field5707[var6] = arg3;
        } else if (arg3.method579(false)) {
            arg3.field2977 = class210.field3050[var6];
            class210.field3050[var6] = arg3;
        } else {
            arg3.field2977 = class563.field8239[var6];
            class563.field8239[var6] = arg3;
            class710.field9925 = true;
        }
        if (arg4 == null) {
            return;
        }
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

    @OriginalMember(owner = "client!ofa", name = "toString", descriptor = "()Ljava/lang/String;", line = 61)
    public final String toString() {
        try {
            field1811++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1815[1] + ')');
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V", line = 74)
    public static final void method1214(byte arg0) {
        try {
            field1814++;
            int var1 = 0;
            if (class451.field6612.field9127.method5475(3) == 1) {
                int var2 = var1 | 0x1;
                int var3 = var2 | 0x10;
                int var4 = var3 | 0x20;
                int var5 = var4 | 0x2;
                var1 = var5 | 0x4;
            }
            if (class451.field6612.field9092.method2151(3) == 0) {
                var1 |= 0x40;
            }
            class459.method3536((byte) -127, var1);
            class101.field1359.method2833((byte) -6, var1);
            class153.field1955.method3236(250, var1);
            class321.field4379.method597(var1, (byte) 55);
            class11.field153.method3481(-128, var1);
            class101.method983(21996, var1);
            class379.method2997(var1, 0);
            class279.method2273((byte) 70, var1);
            class371.method2936(var1, (byte) 120);
            class398.method3120((byte) 20);
            if (arg0 >= -80) {
                field1813 = -64;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1815[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(I)V", line = 117)
    public class139(int arg0) {
        try {
            this.field1810 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1815[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1215(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1216(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 75;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
