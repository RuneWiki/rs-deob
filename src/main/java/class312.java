import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class312 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field4839 = 0;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field4844 = 0;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIZIIZ)V", line = 4)
    public static final void method2117(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field4843++;
        if (arg6) {
            class94.method700();
        }
        if (class195.field2917 != null && (arg4 != 3 || class298.field4598 != arg1 || class259.field4057 != arg0)) {
            class335.method2331((byte) -101, class32.field471, class195.field2917);
            class195.field2917 = null;
        }
        if (arg4 == 3 && class195.field2917 == null) {
            class195.field2917 = class44.method380(0, arg1, 0, class32.field471, arg0, (byte) -118);
            if (class195.field2917 != null) {
                class259.field4057 = arg0;
                class298.field4598 = arg1;
                class331.method2300((byte) -106, class32.field471);
            }
        }
        if (arg4 == 3 && class195.field2917 == null) {
            method2117(-1, -1, arg2, true, class322.field5029, 100, true);
            return;
        }
        Container var7;
        if (class195.field2917 != null) {
            var7 = class195.field2917;
        } else if (class92.field1464 == null) {
            var7 = class32.field471.field2721;
        } else {
            var7 = class92.field1464;
        }
        class284.field4427 = var7.getSize().width;
        class284.field4387 = var7.getSize().height;
        if (class92.field1464 == var7) {
            Insets var8 = class92.field1464.getInsets();
            class284.field4387 -= var8.top + var8.bottom;
            class284.field4427 -= var8.right + var8.left;
        }
        if (arg4 < 2) {
            class188.field2816 = 765;
            class53.field895 = 0;
            class322.field5024 = 503;
            class81.field1283 = (class284.field4427 - 765) / 2;
        } else {
            class53.field895 = 0;
            class322.field5024 = class284.field4387;
            class188.field2816 = class284.field4427;
            class81.field1283 = 0;
        }
        if (arg3) {
            class132.method946(65280, class238.field3782);
            class199.method1414(class238.field3782, false);
            if (class344.field5340 != null) {
                class344.field5340.method69(class238.field3782, -1);
            }
            class317.field4958.method307((byte) -8);
            class46.method405(class238.field3782, -1);
            class296.method2012(-56, class238.field3782);
            if (class344.field5340 != null) {
                class344.field5340.method70((byte) -89, class238.field3782);
            }
        } else {
            if (class94.field1516) {
                class94.method676(class188.field2816, class322.field5024);
            }
            class238.field3782.setSize(class188.field2816, class322.field5024);
            if (class92.field1464 == var7) {
                Insets var9 = class92.field1464.getInsets();
                class238.field3782.setLocation(var9.left + class81.field1283, class53.field895 + var9.top);
            } else {
                class238.field3782.setLocation(class81.field1283, class53.field895);
            }
        }
        if (arg4 == 0 && arg2 > 0) {
            class94.method684(class238.field3782);
        }
        if (arg6 && arg4 > 0) {
            class238.field3782.setIgnoreRepaint(true);
            if (!class37.field559) {
                class77.method568();
                class175.field2644 = null;
                class175.field2644 = class98.method727(class322.field5024, (byte) -92, class188.field2816, class238.field3782);
                class109.method818();
                if (class131.field2052 == 5) {
                    class43.method368(class344.field5343, 2, true);
                } else {
                    class173.method1244(class156.field2334, 17, false);
                }
                try {
                    Graphics var10 = class238.field3782.getGraphics();
                    class175.field2644.method867(32722, 0, 0, var10);
                } catch (Exception var14) {
                }
                class166.method1183(128);
                if (arg2 == 0) {
                    class175.field2644 = class98.method727(503, (byte) -119, 765, class238.field3782);
                } else {
                    class175.field2644 = null;
                }
                class197 var12 = class32.field471.method1277(class317.field4958.getClass(), true);
                while (var12.field2956 == 0) {
                    class5.method26(0, 100L);
                }
                if (var12.field2956 == 1) {
                    class37.field559 = true;
                }
            }
            if (class37.field559) {
                class94.method669(class238.field3782, class181.field2734 * 2);
            }
        }
        if (!class94.field1516 && arg4 > 0) {
            method2117(-1, -1, arg2, true, 0, 100, true);
            return;
        }
        if (arg4 > 0 && arg2 == 0) {
            class304.field4754.setPriority(5);
            class175.field2644 = null;
            class66.method506();
            ((class315) class15.field207).method2138((byte) -64, 200);
            if (class208.field3191) {
                class15.method108(0.7F);
            }
            if (class98.field1568 == null) {
                class98.field1568 = new class51[13][13];
            }
            class183.method1304(4, 104, 104);
            class6.method42(104, 104);
            class105.method762((byte) 19);
        } else if (arg4 == 0 && arg2 > 0) {
            class304.field4754.setPriority(1);
            class175.field2644 = class98.method727(503, (byte) -74, 765, class238.field3782);
            class66.method502();
            class64.method489();
            ((class315) class15.field207).method2138((byte) -103, 20);
            if (class208.field3191) {
                if (class289.field4507 == 1) {
                    class15.method108(0.9F);
                }
                if (class289.field4507 == 2) {
                    class15.method108(0.8F);
                }
                if (class289.field4507 == 3) {
                    class15.method108(0.7F);
                }
                if (class289.field4507 == 4) {
                    class15.method108(0.6F);
                }
            }
            class127.method922();
            class105.method762((byte) 19);
        }
        class33.field501 = !class19.method150(-108);
        if (arg5 != 100) {
            return;
        }
        if (arg6) {
            class67.method521(121);
        }
        if (arg4 >= 2) {
            class116.field1774 = true;
        } else {
            class116.field1774 = false;
        }
        if (class331.field5160 != -1) {
            class274.method1885(true, arg5 ^ 0x1ED4);
        }
        if (class295.field4568 != null && (class131.field2052 == 30 || class131.field2052 == 25)) {
            class171.method1237((byte) 56);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class34.field510[var13] = true;
        }
        client.field722 = true;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V", line = 252)
    public static final void method2118(int arg0, boolean arg1) {
        field4841++;
        if (arg0 != 26828) {
            field4840 = -14;
        }
        if (class344.field5338 != arg1) {
            class344.field5338 = arg1;
            class152.method1053((byte) 119);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 272)
    public static final void method2119(boolean arg0) {
        class335.field5238.method2176((byte) 105);
        class181.field2732.method2176((byte) -103);
        field4842++;
        if (arg0) {
            class186.field2787.method2176((byte) 101);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lan;IZII)V", line = 295)
    public static final void method2120(class85 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4845++;
        if (!arg2) {
            field4840 = -50;
        }
        for (class239 var5 = (class239) class304.field4739.method636(-1); var5 != null; var5 = (class239) class304.field4739.method638(102)) {
            if (var5.field3809 == arg3 && arg4 * 128 == var5.field3812 && arg1 * 128 == var5.field3804 && var5.field3794.field1321 == arg0.field1321) {
                if (var5.field3806 != null) {
                    class98.field1560.method1864(var5.field3806);
                    var5.field3806 = null;
                }
                if (var5.field3808 != null) {
                    class98.field1560.method1864(var5.field3808);
                    var5.field3808 = null;
                }
                var5.method403(1);
                return;
            }
        }
    }
}
