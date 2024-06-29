import jaggl.OpenGL;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class368 extends class487 {

    @OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
    private int field5451 = -1;

    @OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
    private int field5452 = -1;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
    public int field5447;

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "I")
    public int field5448;

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "Lju;")
    public static class111 field5453 = new class111("WTI", 5);

    @OriginalMember(owner = "client!jba", name = "H", descriptor = "Z")
    public static boolean field5461 = false;

    @OriginalMember(owner = "client!jba", name = "C", descriptor = "[I")
    public static int[] field5456 = new int[500];

    @OriginalMember(owner = "client!jba", name = "D", descriptor = "[[I")
    public static int[][] field5457 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!jba", name = "F", descriptor = "I")
    public static int field5459 = 0;

    @OriginalMember(owner = "client!jba", name = "w", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!jba", name = "A", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!jba", name = "B", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!jba", name = "E", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!jba", name = "G", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!jba", name = "I", descriptor = "[[Lgfa;")
    public static class697[][] field5462;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "(I)V")
    public static final void method2323(int arg0) {
        ++field5460;
        if (~class300.field4466 > -103) {
            class300.field4466 += 6;
        }
        if (arg0 != 2) {
            method2324(false);
        }
        if (class363.field5395 != -1 && class525.method3074((byte) -101) > class136.field2409) {
            for (int var1 = class363.field5395; ~var1 > ~class4.field465.length; ++var1) {
                if (class4.field465[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class4.field465[var1].substring(6));
                    } catch (Exception var15) {
                    }
                    class686.method3857("Pausing for " + var2 + " seconds...", 73);
                    class363.field5395 = var1 - -1;
                    class136.field2409 = class525.method3074((byte) -101) + (long) (var2 * 1000);
                    return;
                }
                class677.field9614 = class4.field465[var1];
                class306.method2003((byte) -43, false);
            }
            class363.field5395 = -1;
        }
        if (~class675.field9599 != -1) {
            class167.field2785 -= class675.field9599 * 5;
            if (class210.field3196 <= class167.field2785) {
                class167.field2785 = class210.field3196 - 1;
            }
            if (~class167.field2785 > -1) {
                class167.field2785 = 0;
            }
            class675.field9599 = 0;
        }
        for (int var3 = 0; ~class126.field2309 < ~var3; ++var3) {
            class53 var4 = class675.field9606[var3];
            int var5 = var4.method635((byte) -127);
            char var6 = var4.method634((byte) -90);
            int var7 = var4.method632((byte) 97);
            if (var5 == 84) {
                class306.method2003((byte) -102, false);
            }
            if (var5 == 80) {
                class306.method2003((byte) -82, true);
            } else if (var5 == 66 && (var7 & 4) != 0) {
                if (class415.field6011 != null) {
                    String var8 = "";
                    for (int var9 = class696.field9798.length + -1; ~var9 <= -1; --var9) {
                        if (class696.field9798[var9] != null && class696.field9798[var9].length() > 0) {
                            var8 = var8 + class696.field9798[var9] + '\n';
                        }
                    }
                    class415.field6011.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (~var5 == -68 && ~(4 & var7) != -1) {
                if (class415.field6011 != null) {
                    Transferable var10 = class415.field6011.getContents((Object) null);
                    if (var10 != null) {
                        try {
                            String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                            if (var11 != null) {
                                String[] var12 = class394.method2433('\n', var11, (byte) 82);
                                if (~var12.length < -2) {
                                    for (int var13 = 0; ~var13 > ~var12.length; ++var13) {
                                        if (var12[var13].startsWith("pause")) {
                                            int var14 = 5;
                                            try {
                                                var14 = Integer.parseInt(var12[var13].substring(6));
                                            } catch (Exception var16) {
                                            }
                                            class686.method3857("Pausing for " + var14 + " seconds...", arg0 + 66);
                                            class363.field5395 = var13 + 1;
                                            class4.field465 = var12;
                                            class136.field2409 = class525.method3074((byte) -101) - -((long) (var14 * 1000));
                                            return;
                                        }
                                        class677.field9614 = var12[var13];
                                        class306.method2003((byte) -67, false);
                                    }
                                } else {
                                    class677.field9614 = class677.field9614 + var11;
                                }
                            }
                        } catch (Exception var17) {
                        }
                    }
                }
            } else if (var5 == 85 && ~class10.field553 < -1) {
                class677.field9614 = class677.field9614.substring(0, class10.field553 + -1) + class677.field9614.substring(class10.field553);
                --class10.field553;
            } else if (var5 == 101 && class10.field553 < class677.field9614.length()) {
                class677.field9614 = class677.field9614.substring(0, class10.field553) + class677.field9614.substring(class10.field553 + 1);
            } else if (var5 == 96 && ~class10.field553 < -1) {
                --class10.field553;
            } else if (~var5 == -98 && class10.field553 < class677.field9614.length()) {
                ++class10.field553;
            } else if (~var5 == -103) {
                class10.field553 = 0;
            } else if (var5 == 103) {
                class10.field553 = class677.field9614.length();
            } else if (~var5 == -105 && ~class696.field9798.length < ~class316.field4654) {
                ++class316.field4654;
                class192.method1393((byte) -86);
                class10.field553 = class677.field9614.length();
            } else if (~var5 == -106 && class316.field4654 > 0) {
                --class316.field4654;
                class192.method1393((byte) -19);
                class10.field553 = class677.field9614.length();
            } else if (class90.method879(var6, (byte) 30) || ~var6 == -59 || ~var6 == -45 || ~var6 == -33 || var6 == '_' || var6 == '-' || var6 == '+' || ~var6 == -92 || var6 == ']') {
                class677.field9614 = class677.field9614.substring(0, class10.field553) + class675.field9606[var3].method634((byte) 74) + class677.field9614.substring(class10.field553);
                ++class10.field553;
            }
        }
        class126.field2309 = 0;
        class504.field7156 = 0;
        class293.method1954(0);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)Z")
    public static final boolean method2324(boolean arg0) {
        ++field5455;
        boolean var1 = true;
        if (class496.field7072 == null) {
            if (!class632.field9092.method2230((byte) -105, class629.field9076)) {
                var1 = false;
            } else {
                class496.field7072 = class279.method1848(class632.field9092, class629.field9076);
            }
        }
        if (class512.field7233 == null) {
            if (!class632.field9092.method2230((byte) -91, class288.field4338)) {
                var1 = false;
            } else {
                class512.field7233 = class279.method1848(class632.field9092, class288.field4338);
            }
        }
        if (class338.field5043 == null) {
            if (class632.field9092.method2230((byte) -116, class454.field6479)) {
                class338.field5043 = class279.method1848(class632.field9092, class454.field6479);
            } else {
                var1 = false;
            }
        }
        if (class406.field5860 == null) {
            if (class95.field1708.method2230((byte) -118, class706.field9940)) {
                class406.field5860 = class492.method2951(class706.field9940, class95.field1708, (byte) -107);
            } else {
                var1 = false;
            }
        }
        if (arg0) {
            field5457 = null;
        }
        if (class519.field7364 == null) {
            if (!class632.field9092.method2230((byte) -117, class706.field9940)) {
                var1 = false;
            } else {
                class519.field7364 = class279.method1840(class632.field9092, class706.field9940);
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "(I)V")
    public static final void method2325(int arg0) {
        class237.field3520 = 0;
        if (arg0 != -1017) {
            field5456 = null;
        }
        ++field5458;
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class577.field8397[var1] = null;
            class301.field4499[var1] = 1;
            class568.field8276[var1] = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
    public final void method1612(int arg0) {
        if (arg0 <= 114) {
            method2325(24);
        }
        OpenGL.glFramebufferTexture3DEXT(this.field5452, this.field5451, super.field6979, 0, 0, 0);
        ++field5450;
        this.field5451 = -1;
        this.field5452 = -1;
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lus;IIII[BI)V")
    public class368(class1 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field5447 = arg4;
        this.field5449 = arg2;
        this.field5448 = arg3;
        super.field6977.method5(3845, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field6979, 0, super.field6971, this.field5449, this.field5448, this.field5447, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2939(true, (byte) -69);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field6977.method5(arg0 ^ 3845, this);
        ++field5454;
        OpenGL.glCopyTexSubImage3D(super.field6979, arg0, arg5, arg3, arg7, arg2, arg6, arg4, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(B)V")
    public static void method2327(byte arg0) {
        field5456 = null;
        field5457 = null;
        field5462 = null;
        field5453 = null;
        int var1 = 41 / ((-18 - arg0) / 43);
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lus;IIII)V")
    public class368(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field5447 = arg4;
        this.field5449 = arg2;
        this.field5448 = arg3;
        super.field6977.method5(3845, this);
        OpenGL.glTexImage3Dub(super.field6979, 0, super.field6971, this.field5449, this.field5448, this.field5447, 0, class502.method2994(-111, super.field6971), 5121, (byte[]) null, 0);
        this.method2939(true, (byte) -69);
    }
}
