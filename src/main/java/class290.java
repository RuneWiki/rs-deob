import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class290 extends OutputStream {

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field4894 = 0;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field4888 = 3353893;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lbd;")
    public static class162 field4886 = class17.method142(0, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[Lbd;")
    public static class162[] field4891 = new class162[200];

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field4897 = 0;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILdj;II)V", line = 7)
    public static final void method2010(int arg0, class39 arg1, int arg2, int arg3) {
        field4895++;
        if (arg1.field5057 == arg2 && arg2 != -1) {
            class142 var4 = class139.method1084(-111, arg2);
            int var5 = var4.field2517;
            if (var5 == 1) {
                arg1.field5028 = 0;
                arg1.field5061 = 0;
                arg1.field5023 = 0;
                arg1.field5040 = arg3;
                class229.method1638(class122.field2215 == arg1, var4, arg1.field5023, arg1.field5047, -648569400, arg1.field5013);
            }
            if (var5 == 2) {
                arg1.field5028 = 0;
            }
        } else if (arg2 == -1 || arg1.field5057 == -1 || class139.method1084(arg0 ^ 0x69C9, arg2).field2515 >= class139.method1084(-59, arg1.field5057).field2515) {
            arg1.field5040 = arg3;
            arg1.field5022 = arg1.field5006;
            arg1.field5028 = 0;
            arg1.field5057 = arg2;
            arg1.field5061 = 0;
            arg1.field5023 = 0;
            if (arg1.field5057 != -1) {
                class229.method1638(class122.field2215 == arg1, class139.method1084(-91, arg1.field5057), arg1.field5023, arg1.field5047, -648569400, arg1.field5013);
            }
        }
        if (arg0 != -27020) {
            field4894 = 45;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I", line = 67)
    public static final int method2011(int arg0, int arg1) {
        field4896++;
        if (!(arg1 < 65 || arg1 > 90) || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            if (arg0 != 24834) {
                method2014((byte) 106, (class162) null);
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 89)
    public static void method2012(int arg0) {
        field4891 = null;
        field4886 = null;
        if (arg0 > -41) {
            method2014((byte) 122, (class162) null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "write", descriptor = "(I)V", line = 121)
    public final void write(int arg0) throws IOException {
        field4892++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 139)
    public static final void method2013(int arg0) {
        field4887++;
        while (class63.field975.method346(class244.field4045, 8) >= 11) {
            int var1 = class63.field975.method344(2, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class270.field4520[var1] == null) {
                class270.field4520[var1] = new class39();
                if (class56.field877[var1] != null) {
                    class270.field4520[var1].method294(-126, class56.field877[var1]);
                }
                var2 = true;
            }
            class123.field2233[class171.field2966++] = var1;
            class39 var3 = class270.field4520[var1];
            var3.field5051 = class90.field1598;
            int var4 = class270.field4521[class63.field975.method344(2, 3)];
            if (var2) {
                var3.field5025 = var3.field5018 = var4;
            }
            int var5 = class63.field975.method344(2, 5);
            int var6 = class63.field975.method344(2, 1);
            int var7 = class63.field975.method344(2, 1);
            if (var7 == 1) {
                class181.field3118[class267.field4446++] = var1;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var8 = class63.field975.method344(2, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method288(class122.field2215.field5050[0] + var5, class122.field2215.field5034[0] + var8, -28150, var6 == 1);
        }
        class63.field975.method339(false);
        int var9 = -98 / ((arg0 + 56) / 54);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLbd;)V", line = 220)
    public static final void method2014(byte arg0, class162 arg1) {
        field4889++;
        if (class260.field4330 == null) {
            return;
        }
        if (arg0 != -43) {
            method2010(5, (class39) null, -47, 79);
        }
        long var2 = arg1.method1256(0);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (class260.field4330.length > var4 && class260.field4330[var4].field2701 != var2) {
            var4++;
        }
        if (var4 < class260.field4330.length && class260.field4330[var4] != null) {
            class187.field3229.method338(123, (byte) 8);
            class187.field3229.method745(class260.field4330[var4].field2701, (byte) -124);
            class314.field5292++;
        }
    }
}
