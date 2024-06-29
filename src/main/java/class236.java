import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class236 extends class21 {

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    private int field3705 = 0;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    private int field3709 = 4096;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "Z")
    public static boolean field3714 = false;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "Lcd;")
    public static class268 field3711 = new class268(0, -1);

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "[Lvj;")
    public static class103[] field3715 = new class103[0];

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public static int field3716 = 0;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 6)
    public class236() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIII)V", line = 13)
    public static final void method1565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3712++;
        if (arg6 >= 0 && arg1 >= 0 && arg6 < 103 && arg1 < 103) {
            if (arg3 == 0) {
                class41 var8 = class153.method995(arg2, arg6, arg1);
                if (var8 != null) {
                    int var9 = (int) (var8.field795 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 2) {
                        var8.field796 = new class331(var9, 2, arg7 + 4, arg2, arg6, arg1, arg0, false, var8.field796);
                        var8.field788 = new class331(var9, 2, arg7 + 1 & 0x3, arg2, arg6, arg1, arg0, false, var8.field788);
                    } else {
                        var8.field796 = new class331(var9, arg5, arg7, arg2, arg6, arg1, arg0, false, var8.field796);
                    }
                }
            }
            if (arg3 == 1) {
                class11 var10 = class162.method1036(arg2, arg6, arg1);
                if (var10 != null) {
                    int var11 = (int) (var10.field228 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 4 || arg5 == 5) {
                        var10.field224 = new class331(var11, 4, arg7, arg2, arg6, arg1, arg0, false, var10.field224);
                    } else if (arg5 == 6) {
                        var10.field224 = new class331(var11, 4, arg7 + 4, arg2, arg6, arg1, arg0, false, var10.field224);
                    } else if (arg5 == 7) {
                        var10.field224 = new class331(var11, 4, (arg7 + 2 & 0x3) + 4, arg2, arg6, arg1, arg0, false, var10.field224);
                    } else if (arg5 == 8) {
                        var10.field224 = new class331(var11, 4, arg7 + 4, arg2, arg6, arg1, arg0, false, var10.field224);
                        var10.field231 = new class331(var11, 4, (arg7 + 2 & 0x3) + 4, arg2, arg6, arg1, arg0, false, var10.field231);
                    }
                }
            }
            if (arg3 == 2) {
                if (arg5 == 11) {
                    arg5 = 10;
                }
                class271 var12 = class177.method1112(arg2, arg6, arg1);
                if (var12 != null) {
                    var12.field4182 = new class331(Integer.MAX_VALUE & (int) (var12.field4191 >>> 32), arg5, arg7, arg2, arg6, arg1, arg0, false, var12.field4182);
                }
            }
            if (arg3 == 3) {
                class289 var13 = class293.method1964(arg2, arg6, arg1);
                if (var13 != null) {
                    var13.field4443 = new class331((int) (var13.field4446 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg2, arg6, arg1, arg0, false, var13.field4443);
                }
            }
        }
        if (arg4 <= 118) {
            method1565(-26, 92, 45, -107, -39, -118, -94, 115);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)V", line = 110)
    public static final void method1566(String arg0, byte arg1, int arg2, String arg3) {
        class119.field2080 = arg2;
        class120.field2082 = arg0;
        class135.field2272 = arg3;
        field3707++;
        if (class120.field2082.equals("") || class135.field2272.equals("")) {
            class157.field2565 = 3;
        } else if (class109.field1940 == -1) {
            class157.field2565 = -3;
            class171.field2765 = 0;
            class45.field935 = 0;
            class175.field2813 = 1;
            class202 var4 = new class202(128);
            var4.method1311(10, 10964);
            var4.method1359(16705, (int) (Math.random() * 9.9999999E7D));
            var4.method1353((byte) -105, class116.method767(-125, class120.field2082));
            var4.method1359(16705, (int) (Math.random() * 9.9999999E7D));
            var4.method1309(63, class135.field2272);
            var4.method1359(16705, (int) (Math.random() * 9.9999999E7D));
            var4.method1347(class79.field1557, 0, class341.field5301);
            int var5 = 115 / ((-arg1 - 29) / 55);
            class14.field263.field3249 = 0;
            class14.field263.method1311(24, 10964);
            class14.field263.method1311(var4.field3249 + 2, 10964);
            class14.field263.method1313(537, -376480);
            class14.field263.method1332(var4.field3273, var4.field3249, (byte) 0, 0);
        } else {
            class148.method970((byte) 114);
        }
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(B)V", line = 155)
    public static final void method1567(byte arg0) {
        field3706++;
        class266.field4113++;
        if (arg0 < 52) {
            method1567((byte) 40);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I", line = 169)
    public final int[] method177(int arg0, int arg1) {
        int var3 = -24 % ((arg0 - 33) / 36);
        field3710++;
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int[] var5 = this.method171(0, 70, arg1);
            for (int var6 = 0; var6 < class294.field4489; var6++) {
                int var7 = var5[var6];
                var4[var6] = this.field3705 <= var7 && this.field3709 >= var7 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILag;)V", line = 211)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg1 == 0) {
            this.field3705 = arg2.method1315(14289);
        } else if (arg1 == 1) {
            this.field3709 = arg2.method1315(14289);
        }
        field3713++;
        if (arg0 != -318) {
            method1569(98);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)V", line = 244)
    public static final void method1568(int arg0, int arg1, int arg2) {
        class40.field771[arg2] = arg1;
        class256 var3 = (class256) class123.field2125.method303((long) arg2, (byte) 118);
        if (arg0 != 10372) {
            field3711 = (class268) null;
        }
        if (var3 == null) {
            class256 var4 = new class256(class338.method2339((byte) -120) + 500L);
            class123.field2125.method310((long) arg2, var4, 25357);
        } else {
            var3.field3999 = class338.method2339((byte) -120) + 500L;
        }
        field3708++;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V", line = 275)
    public static void method1569(int arg0) {
        if (arg0 > 123) {
            field3711 = null;
            field3715 = null;
        }
    }
}
