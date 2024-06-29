import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class382 extends class425 {

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "Ljava/lang/String;")
    public String field5418;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public int field5420;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    public int field5424;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "J")
    public long field5421;

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "I")
    public int field5429;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
    public int field5422;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "Ljava/lang/String;")
    public String field5425;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field5419 = 0;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "B")
    public static byte field5423;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "[I")
    public static int[] field5430;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)I", line = 6)
    public static final int method2431(int arg0, int arg1, int arg2, int arg3) {
        field5417++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg2 > -62) {
                field5423 = -115;
            }
            return var4 == 2 ? 1023 - arg0 : -arg3 + 1023;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BIILjava/lang/String;I)V", line = 29)
    public static final void method2432(byte arg0, int arg1, int arg2, String arg3, int arg4) {
        field5428++;
        class223 var5 = class299.method2016(arg1, arg4, (byte) -128);
        if (var5 == null) {
            return;
        }
        if (var5.field3222 != null) {
            class79 var6 = new class79();
            var6.field1021 = arg3;
            var6.field1016 = arg2;
            var6.field1028 = var5.field3222;
            var6.field1018 = var5;
            class424.method2655(var6);
        }
        boolean var7 = true;
        if (var5.field3281 > 0) {
            var7 = class200.method1415(var5, 106);
        }
        if (!var7 || !client.method1168(var5).method485(-102, arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            class407.field5761.method2048(2040, 181);
            class97.field1236++;
            class245.method1712(arg4, var5.field3304, arg1, 30);
        }
        if (arg2 == 2) {
            class425.field6071++;
            class407.field5761.method2048(2040, 69);
            class245.method1712(arg4, var5.field3304, arg1, 30);
        }
        if (arg2 == 3) {
            class407.field5761.method2048(2040, 78);
            class392.field5518++;
            class245.method1712(arg4, var5.field3304, arg1, 30);
        }
        if (arg2 == 4) {
            class3.field30++;
            class407.field5761.method2048(2040, 185);
            class245.method1712(arg4, var5.field3304, arg1, 30);
        }
        if (arg0 <= 19) {
            return;
        }
        if (arg2 == 5) {
            class407.field5761.method2048(2040, 214);
            class59.field801++;
            class245.method1712(arg4, var5.field3304, arg1, 30);
        }
        if (arg2 == 6) {
            class310.field4500++;
            class407.field5761.method2048(2040, 102);
            class245.method1712(arg4, var5.field3304, arg1, 30);
        }
        if (arg2 == 7) {
            class194.field2798++;
            class407.field5761.method2048(2040, 114);
            class245.method1712(arg4, var5.field3304, arg1, 30);
        }
        if (arg2 == 8) {
            class407.field5761.method2048(2040, 110);
            class93.field1193++;
            class245.method1712(arg4, var5.field3304, arg1, 30);
        }
        if (arg2 == 9) {
            class407.field5761.method2048(2040, 170);
            class438.field6241++;
            class245.method1712(arg4, var5.field3304, arg1, 30);
        }
        if (arg2 == 10) {
            class407.field5761.method2048(2040, 203);
            class9.field121++;
            class245.method1712(arg4, var5.field3304, arg1, 30);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILjava/lang/String;)V", line = 150)
    public static final void method2433(int arg0, String arg1) {
        field5427++;
        if (class428.field6093 == null) {
            return;
        }
        class407.field5761.method2048(2040, 151);
        class408.field5783++;
        class407.field5761.method831(class276.method1873(true, arg1), (byte) -122);
        class407.field5761.method807((byte) 124, arg1);
        if (arg0 != -5263) {
            field5423 = -64;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZLcn;IIILvq;I)Lvj;", line = 171)
    public static final class256 method2434(int arg0, boolean arg1, class301 arg2, int arg3, int arg4, int arg5, class269 arg6, int arg7) {
        class374.field5338.field1259 = arg3;
        class374.field5338.field1260 = arg6.field3936;
        class374.field5338.field1272 = arg4;
        field5426++;
        class374.field5338.field1265 = arg2 != null;
        class374.field5338.field1266 = arg0;
        class374.field5338.field1267 = arg7;
        class374.field5338.field1262 = arg5;
        if (arg1) {
            method2432((byte) 67, -99, 36, (String) null, 19);
        }
        return (class256) class356.field5154.method757(0, class374.field5338);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 192)
    public static void method2435(int arg0) {
        if (arg0 == 6) {
            field5430 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V", line = 208)
    public class382(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field5418 = arg1;
        this.field5420 = arg3;
        this.field5424 = arg6;
        this.field5421 = arg4;
        this.field5429 = arg5;
        this.field5422 = arg2;
        this.field5425 = arg0;
    }
}
