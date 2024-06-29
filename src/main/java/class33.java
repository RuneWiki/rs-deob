import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class33 extends class96 {

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "I")
    public static int field558 = 0;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "Ljava/util/Calendar;")
    public static Calendar field547 = Calendar.getInstance();

    @OriginalMember(owner = "client!hn", name = "W", descriptor = "Lna;")
    public static class26 field559 = null;

    @OriginalMember(owner = "client!hn", name = "Y", descriptor = "I")
    public static int field561 = 0;

    @OriginalMember(owner = "client!hn", name = "X", descriptor = "I")
    public static int field560 = 0;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!hn", name = "Z", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "Lna;")
    public class26 field553;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)Lmm;", line = 7)
    public static final class256 method265(int arg0) {
        field551++;
        int var1 = class98.field1596[0] * class141.field2149[0];
        byte[] var2 = class205.field3203[0];
        if (arg0 != 115) {
            field562 = 112;
        }
        class256 var6;
        if (class268.field4431[0]) {
            byte[] var3 = class59.field961[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class240.method1652(class4.method23(var3[var5] << 24, -16777216), class190.field2975[class4.method23(255, var2[var5])]);
            }
            var6 = new class253(class88.field1445, class37.field607, class58.field936[0], class82.field1281[0], class141.field2149[0], class98.field1596[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class190.field2975[class4.method23(var2[var8], 255)];
            }
            var6 = new class256(class88.field1445, class37.field607, class58.field936[0], class82.field1281[0], class141.field2149[0], class98.field1596[0], var7);
        }
        class160.method1088((byte) 127);
        return var6;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILwa;I)V", line = 52)
    private final void method266(int arg0, class82 arg1, int arg2) {
        if (arg0 == 1) {
            this.field548 = arg1.method642((byte) -71);
        } else if (arg0 == 2) {
            this.field545 = arg1.method587(-502942936);
        } else if (arg0 == 5) {
            this.field553 = arg1.method615(true);
        }
        if (arg2 != 0) {
            method269(5, 31, 114, true, -67, 14, -33, -115, -101, -61, -25, -121);
        }
        field554++;
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(B)V", line = 81)
    public static final void method267(byte arg0) {
        if (arg0 != 80) {
            method269(88, 85, -8, true, 72, 12, 29, 96, 6, 57, -13, 15);
        }
        class55.field876 = new class259(32);
        field549++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lve;ILve;)V", line = 92)
    public static final void method268(class266 arg0, int arg1, class266 arg2) {
        class283.field4723 = class233.method1567(0, class145.field2204, (byte) 124, arg2, arg0);
        if (class255.field4184) {
            class107.field1688 = class267.method1904(class145.field2204, 0, arg0, arg2, -1);
        } else {
            class107.field1688 = (class248) class283.field4723;
        }
        class136.field2083 = class233.method1567(arg1, class36.field590, (byte) 125, arg2, arg0);
        class89.field1474 = class233.method1567(0, class46.field724, (byte) 124, arg2, arg0);
        field552++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIZIIIIIIII)Z", line = 110)
    public static final boolean method269(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field555++;
        if (class13.field221.method1078((byte) 114) == arg5) {
            return class9.method58(arg7, arg8, arg4, arg0, arg10, arg3, arg2, arg1, arg6, arg9, 127, arg11);
        } else if (class13.field221.method1078((byte) 114) <= 2) {
            return class151.method1029(arg6, arg4, arg11, -1001, arg10, arg9, arg2, arg1, arg3, arg8, arg0, arg7);
        } else {
            return class209.method1404(arg10, (byte) 34, arg7, arg9, arg1, class13.field221.method1078((byte) 114), arg6, arg8, arg4, arg11, arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILwa;)V", line = 133)
    public final void method270(int arg0, class82 arg1) {
        if (arg0 != 207) {
            return;
        }
        field557++;
        while (true) {
            int var3 = arg1.method642((byte) -96);
            if (var3 == 0) {
                return;
            }
            this.method266(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V", line = 165)
    public static void method271(int arg0) {
        field547 = null;
        if (arg0 != 0) {
            method267((byte) -90);
        }
        field559 = null;
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)Z", line = 178)
    public final boolean method272(int arg0) {
        if (arg0 != 0) {
            field559 = (class26) null;
        }
        field556++;
        return this.field548 == 115;
    }
}
