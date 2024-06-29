import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class67 extends class184 {

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Ldd;")
    public class132 field1193 = new class132();

    @OriginalMember(owner = "client!af", name = "M", descriptor = "Lbi;")
    public class91 field1205 = new class91();

    @OriginalMember(owner = "client!af", name = "w", descriptor = "Lgh;")
    private class24 field1190;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "[[I")
    public static int[][] field1186 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field1198 = 2;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field1200 = 0;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "Lqk;")
    public static class207 field1199 = class24.method212(255, "Monde de jeu cr-B-B");

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Lqk;")
    public static class207 field1203 = class24.method212(255, "vert:");

    @OriginalMember(owner = "client!af", name = "I", descriptor = "Lv;")
    public static class149 field1201 = new class149(new byte[5000]);

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "[Luh;")
    public static class100[] field1191;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILnf;)V")
    private final void method484(int arg0, int arg1, class157 arg2) {
        if ((this.field1190.field506[arg2.field2772] & 0x4) != 0 && arg2.field2777 < 0) {
            int var4 = this.field1190.field449[arg2.field2772] / class275.field4822;
            int var5 = (1048575 - (arg2.field2766 - var4)) / var4;
            arg2.field2766 = arg0 * var4 + arg2.field2766 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field1190.field461[arg2.field2772] == 0) {
                    arg2.field2768 = class77.method561(arg2.field2761, arg2.field2768.method555(), arg2.field2768.method563(), arg2.field2768.method556());
                } else {
                    arg2.field2768 = class77.method561(arg2.field2761, arg2.field2768.method555(), 0, arg2.field2768.method556());
                    this.field1190.method197(arg2, arg2.field2760.field2297[arg2.field2781] < 0, arg1 - 1582423174);
                }
                if (arg2.field2760.field2297[arg2.field2781] < 0) {
                    arg2.field2768.method559(-1);
                }
                arg0 = arg2.field2766 / var4;
            }
        }
        field1204++;
        arg2.field2768.method203(arg0);
        if (arg1 != -756) {
            field1186 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public final void method203(int arg0) {
        field1197++;
        this.field1205.method203(arg0);
        for (class157 var2 = (class157) this.field1193.method922((byte) 116); var2 != null; var2 = (class157) this.field1193.method928(89)) {
            if (!this.field1190.method201(var2, true)) {
                int var3 = arg0;
                do {
                    if (var2.field2759 >= var3) {
                        this.method484(var3, -756, var2);
                        var2.field2759 -= var3;
                        break;
                    }
                    this.method484(var2.field2759, -756, var2);
                    var3 -= var2.field2759;
                } while (!this.field1190.method170((int[]) null, true, var3, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[IIILnf;I)V")
    private final void method485(int arg0, int[] arg1, int arg2, int arg3, class157 arg4, int arg5) {
        if (arg5 > -25) {
            return;
        }
        if ((this.field1190.field506[arg4.field2772] & 0x4) != 0 && arg4.field2777 < 0) {
            int var7 = this.field1190.field449[arg4.field2772] / class275.field4822;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field2766) / var7;
                if (var8 > arg3) {
                    arg4.field2766 += arg3 * var7;
                    break;
                }
                arg3 -= var8;
                arg4.field2768.method191(arg1, arg2, var8);
                arg4.field2766 += var7 * var8 - 1048576;
                arg2 += var8;
                int var9 = class275.field4822 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class77 var11 = arg4.field2768;
                if (this.field1190.field461[arg4.field2772] == 0) {
                    arg4.field2768 = class77.method561(arg4.field2761, var11.method555(), var11.method563(), var11.method556());
                } else {
                    arg4.field2768 = class77.method561(arg4.field2761, var11.method555(), 0, var11.method556());
                    this.field1190.method197(arg4, arg4.field2760.field2297[arg4.field2781] < 0, -1582423930);
                    arg4.field2768.method588(var9, var11.method563());
                }
                if (arg4.field2760.field2297[arg4.field2781] < 0) {
                    arg4.field2768.method559(-1);
                }
                var11.method575(var9);
                var11.method191(arg1, arg2, arg0 - arg2);
                if (var11.method569()) {
                    this.field1205.method659(var11);
                }
            }
        }
        field1194++;
        arg4.field2768.method191(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lpk;Lpk;ILpk;)V")
    public static final void method486(class99 arg0, class99 arg1, int arg2, class99 arg3) {
        class59.field1088 = arg1;
        field1196++;
        if (arg2 == -11561) {
            class279.field4911 = arg3;
            class160.field2839 = arg0;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public static void method487(int arg0) {
        field1191 = null;
        field1201 = null;
        if (arg0 == -29647) {
            field1199 = null;
            field1186 = null;
            field1203 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "([III)V")
    public final void method191(int[] arg0, int arg1, int arg2) {
        field1195++;
        this.field1205.method191(arg0, arg1, arg2);
        for (class157 var4 = (class157) this.field1193.method922((byte) 60); var4 != null; var4 = (class157) this.field1193.method928(86)) {
            if (!this.field1190.method201(var4, true)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2759 >= var6) {
                        this.method485(var5 + var6, arg0, var5, var6, var4, -80);
                        var4.field2759 -= var6;
                        break;
                    }
                    this.method485(var5 + var6, arg0, var5, var4.field2759, var4, -92);
                    var5 += var4.field2759;
                    var6 -= var4.field2759;
                } while (!this.field1190.method170(arg0, true, var6, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()Lda;")
    public final class184 method196() {
        field1192++;
        class157 var1;
        do {
            var1 = (class157) this.field1193.method928(108);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2768 == null);
        return var1.field2768;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()I")
    public final int method187() {
        field1202++;
        return 0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lqk;IIII)V")
    public static final void method488(class207 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1187++;
        class220 var5 = class108.method782((byte) -73, arg4, arg1);
        if (var5 == null || arg2 != 22763) {
            return;
        }
        if (var5.field4057 != null) {
            class206 var6 = new class206();
            var6.field3614 = var5;
            var6.field3612 = arg0;
            var6.field3609 = arg3;
            var6.field3616 = var5.field4057;
            class69.method501(arg2 - 22660, var6);
        }
        boolean var7 = true;
        if (var5.field3960 > 0) {
            var7 = class3.method13(var5, arg2 ^ 0x5811);
        }
        if (!var7 || !client.method1112(var5).method827(arg3 - 1, 63)) {
            return;
        }
        if (arg3 == 1) {
            class261.field4645.method767(131, (byte) 123);
            class261.field4645.method1068(arg1, 124);
            class220.field3990++;
            class261.field4645.method1083(false, arg4);
        }
        if (arg3 == 2) {
            field1189++;
            class261.field4645.method767(124, (byte) 117);
            class261.field4645.method1068(arg1, 125);
            class261.field4645.method1083(false, arg4);
        }
        if (arg3 == 3) {
            class261.field4645.method767(3, (byte) 21);
            class237.field4371++;
            class261.field4645.method1068(arg1, 116);
            class261.field4645.method1083(false, arg4);
        }
        if (arg3 == 4) {
            class212.field3773++;
            class261.field4645.method767(132, (byte) 93);
            class261.field4645.method1068(arg1, 110);
            class261.field4645.method1083(false, arg4);
        }
        if (arg3 == 5) {
            class261.field4645.method767(55, (byte) 27);
            class232.field4250++;
            class261.field4645.method1068(arg1, 118);
            class261.field4645.method1083(false, arg4);
        }
        if (arg3 == 6) {
            class261.field4645.method767(103, (byte) 88);
            class261.field4645.method1068(arg1, 123);
            class261.field4645.method1083(false, arg4);
            class252.field4533++;
        }
        if (arg3 == 7) {
            class164.field2890++;
            class261.field4645.method767(105, (byte) 35);
            class261.field4645.method1068(arg1, 125);
            class261.field4645.method1083(false, arg4);
        }
        if (arg3 == 8) {
            class82.field1505++;
            class261.field4645.method767(136, (byte) 41);
            class261.field4645.method1068(arg1, 127);
            class261.field4645.method1083(false, arg4);
        }
        if (arg3 == 9) {
            class55.field1030++;
            class261.field4645.method767(34, (byte) 56);
            class261.field4645.method1068(arg1, 121);
            class261.field4645.method1083(false, arg4);
        }
        if (arg3 == 10) {
            class171.field3029++;
            class261.field4645.method767(52, (byte) 78);
            class261.field4645.method1068(arg1, arg2 ^ 0x5885);
            class261.field4645.method1083(false, arg4);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()Lda;")
    public final class184 method210() {
        class157 var1 = (class157) this.field1193.method922((byte) 59);
        field1188++;
        if (var1 == null) {
            return null;
        } else if (var1.field2768 == null) {
            return this.method196();
        } else {
            return var1.field2768;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lgh;)V")
    public class67(class24 arg0) {
        this.field1190 = arg0;
    }
}
