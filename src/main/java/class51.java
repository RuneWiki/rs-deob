import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class51 {

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Llg;")
    public static class284 field691 = new class284(5, 4);

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Lfg;")
    public static class83 field692 = new class83("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 4)
    public static final void method314(int arg0) {
        class166.method1029();
        field690++;
        for (int var1 = arg0; var1 < 4; var1++) {
            class6.field64[var1].method2467((byte) 69);
        }
        class499.method2942(~arg0);
        class193.method1169(-11544);
        System.gc();
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZI)V", line = 22)
    public static final void method315(boolean arg0, boolean arg1, int arg2) {
        if (arg0) {
            class67.field924++;
            class514.method3023(true);
        }
        if (arg2 != 0) {
            return;
        }
        field688++;
        if (arg1) {
            class214.field3045++;
            class527.method3089(429048714);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lqa;IILia;III[[[B[I[I[I[I[IIBIIZ)V", line = 48)
    public static final void method316(class162 arg0, int arg1, int arg2, class415 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class344.field4741 = arg0;
        class49.field669 = arg1;
        class246.field3427 = arg3;
        class132.field1886 = class344.field4741.method528() > 0;
        class192.field2742 = arg4 >> class34.field484;
        class141.field2010 = arg6 >> class34.field484;
        class263.field3600 = arg4;
        class304.field4172 = arg6;
        class379.field5327 = arg5;
        class436.field6347 = class192.field2742 - class231.field3212;
        if (class436.field6347 < 0) {
            class93.field1248 = -class436.field6347;
            class436.field6347 = 0;
        } else {
            class93.field1248 = 0;
        }
        class300.field4130 = class141.field2010 - class231.field3212;
        if (class300.field4130 < 0) {
            class325.field4463 = -class300.field4130;
            class300.field4130 = 0;
        } else {
            class325.field4463 = 0;
        }
        class364.field5059 = class231.field3212 + class192.field2742;
        if (class364.field5059 > class469.field6860) {
            class364.field5059 = class469.field6860;
        }
        class450.field6492 = class231.field3212 + class141.field2010;
        if (class450.field6492 > class472.field6900) {
            class450.field6492 = class472.field6900;
        }
        for (int var18 = 0; var18 < class231.field3212 + class231.field3212 + 2; var18++) {
            for (int var23 = 0; var23 < class231.field3212 + class231.field3212 + 2; var23++) {
                int var24 = class192.field2742 + var18 - class231.field3212;
                int var25 = class141.field2010 + var23 - class231.field3212;
                if (var24 >= 0 && var25 >= 0 && var24 < class469.field6860 && var25 < class472.field6900) {
                    int var26 = var24 << class34.field484;
                    int var27 = var25 << class34.field484;
                    int var28 = class19.field195[class19.field195.length - 1].method221(var24, var25) - (0x3E8 << class34.field484 - 7);
                    int var29 = class364.field5058 == null ? class19.field195[0].method221(var24, var25) + class234.field3248 : class364.field5058[0].method221(var24, var25) + class234.field3248;
                    class103.field1410[var18][var23] = class344.field4741.method507(var26, var28, var27, var26, var29, var27);
                } else {
                    class103.field1410[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class231.field3212 + class231.field3212 + 1; var19++) {
            for (int var22 = 0; var22 < class231.field3212 + class231.field3212 + 1; var22++) {
                class39.field529[var19][var22] = class103.field1410[var19][var22] || class103.field1410[var19 + 1][var22] || class103.field1410[var19][var22 + 1] || class103.field1410[var19 + 1][var22 + 1];
            }
        }
        class435.field6342 = arg8;
        class174.field2495 = arg9;
        class127.field1735 = arg10;
        class377.field5312 = arg11;
        class458.field6688 = arg12;
        class398.method2304();
        class515.method3028(255);
        for (class498 var20 = (class498) class521.field7677.method2306(106); var20 != null; var20 = (class498) class521.field7677.method2302(-80)) {
            var20.method2645(124);
            class526.method3081(var20, -117);
        }
        if (class132.field1886) {
            for (int var21 = 0; var21 < class34.field482; var21++) {
                class461.field6699[var21].method1898(arg17, arg1, false);
            }
        }
        if (arg2 > 1) {
            class344.field4741.method486(0);
            if (class210.field2984 == null || class210.field2984 instanceof class353) {
                class210.field2984 = new class455();
            }
        } else if (class210.field2984 == null || class210.field2984 instanceof class455) {
            class210.field2984 = new class353();
        }
        class210.field2984.method1953(arg2, 255);
        class210.field2984.method1951((byte) -122);
        if (class336.field4640 != null) {
            class500.method2951(true);
            class210.field2984.method1958(22, false);
            class382.method2196(arg2, null, 0, (byte) 0, arg15, arg16);
            class210.field2984.method1951((byte) -127);
            class210.field2984.method1958(23, false);
            class500.method2951(false);
        }
        class382.method2196(arg2, arg7, arg13, arg14, arg15, arg16);
        class210.field2984.method1951((byte) -120);
        class210.field2984.method1955(255);
        class210.field2984.method1951((byte) -123);
        if (arg2 > 1) {
            class344.field4741.method534(0);
        }
        class344.field4741.method490(0, null);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILlh;)V", line = 205)
    public static final void method317(int arg0, class365 arg1) {
        field689++;
        int var2 = arg1.method2065(false);
        class309.field4236 = new class65[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class309.field4236[var3] = new class65();
            class309.field4236[var3].field886 = arg1.method2065(false);
            class309.field4236[var3].field891 = arg1.method2078((byte) 86);
        }
        class407.field5643 = arg1.method2065(false);
        if (arg0 >= -81) {
            method318(-47);
        }
        class14.field171 = arg1.method2065(false);
        class91.field1227 = arg1.method2065(false);
        class377.field5317 = new class320[class14.field171 + 1 - class407.field5643];
        for (int var4 = 0; var4 < class91.field1227; var4++) {
            int var5 = arg1.method2065(false);
            class320 var6 = class377.field5317[var5] = new class320();
            var6.field3237 = arg1.method2099(255);
            var6.field3244 = arg1.method2056((byte) -8);
            var6.field4428 = var5 + class407.field5643;
            var6.field4431 = arg1.method2078((byte) 113);
            var6.field4427 = arg1.method2078((byte) 30);
        }
        class344.field4738 = arg1.method2056((byte) 90);
        class510.field7494 = true;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 252)
    public static void method318(int arg0) {
        if (arg0 <= 60) {
            field691 = null;
        }
        field692 = null;
        field691 = null;
    }
}
