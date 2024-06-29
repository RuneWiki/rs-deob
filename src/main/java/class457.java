import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class457 extends class11 {

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "Lefa;")
    public class171 field6205;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "Liv;")
    public class87 field6207;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "Z")
    public static boolean field6204 = true;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "Lcu;")
    public static class206 field6206 = new class206(66, -1);

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public int field6208;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
    public int field6211;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
    public int field6213;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
    public int field6214;

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
    public int field6216;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "Lkd;")
    public static class261 field6215;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BII)I", line = 3)
    public static final int method2606(byte arg0, int arg1, int arg2) {
        field6212++;
        if (class346.field4755 == -1) {
            return 1;
        }
        if (class571.field7587 != arg2) {
            class264.method1615((byte) -127, class72.field1077.method546(class516.field6892, (byte) -35), arg2);
            if (class571.field7587 != arg2) {
                return -1;
            }
        }
        try {
            Dimension var3 = class443.field6072.getSize();
            class172.method1166((byte) -21, class72.field1077.method546(class516.field6892, (byte) -35), true, class10.field197, class188.field2788, class665.field9437);
            class545 var4 = class590.method3240(class16.field254, class346.field4755, 115, 0);
            long var5 = class681.method3802(-23600);
            class10.field197.method435();
            class166.field2583.method576(0, class16.field256, 0);
            class10.field197.method405(class166.field2583);
            class10.field197.method373(var3.width / 2, var3.height / 2, 512, 512);
            class10.field197.method442(1.0F);
            class10.field197.method371(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class358 var7 = class10.field197.method443(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class10.field197.method87(0);
                class10.field197.method38();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class129.field2152.method576((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class587.field7787), 0, (var10 + 1) * class587.field7787);
                        var7.method1947(class129.field2152, null, 0);
                        var8++;
                        if ((long) arg1 <= class681.method3802(-23600) - var5) {
                            break label45;
                        }
                    }
                }
            }
            if (arg0 != -103) {
                field6215 = null;
            }
            class10.field197.method100();
            long var12 = (long) (var8 * 1000) / (class681.method3802(arg0 ^ 0x5C49) - var5);
            class10.field197.method87(0);
            class10.field197.method38();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 86)
    public final void method2607(int arg0) {
        this.field6216 = this.field6205.field2635;
        this.field6208 = this.field6205.field2643;
        field6209++;
        this.field6211 = this.field6205.field2648;
        if (this.field6205.field2641 != null) {
            this.field6205.field2641.method565(this.field6207.field1312, this.field6207.field1316, this.field6207.field1315, class213.field3047);
        }
        if (arg0 == -25112) {
            this.field6213 = class213.field3047[0];
            this.field6214 = class213.field3047[2];
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)V", line = 109)
    public static void method2608(byte arg0) {
        field6206 = null;
        field6215 = null;
        if (arg0 >= 0) {
            field6204 = false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIB)Lgba;", line = 121)
    public static final class625 method2609(int arg0, int arg1, byte arg2) {
        int var3 = 82 / ((arg2 + 41) / 36);
        field6210++;
        class625 var4 = class153.method1078(65535, arg0);
        if (arg1 == -1) {
            return var4;
        } else if (var4 == null || var4.field8420 == null || var4.field8420.length <= arg1) {
            return null;
        } else {
            return var4.field8420[arg1];
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)Lfba;", line = 147)
    public static final class24 method2610(int arg0, int arg1, int arg2) {
        if (class703.field9899[arg0][arg1][arg2] == null) {
            boolean var3 = class703.field9899[0][arg1][arg2] != null && class703.field9899[0][arg1][arg2].field408 != null;
            if (var3 && arg0 >= class13.field218 - 1) {
                return null;
            }
            class125.method967(arg0, arg1, arg2);
        }
        return class703.field9899[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZLjava/lang/String;Z)V", line = 171)
    public static final void method2611(boolean arg0, String arg1, boolean arg2) {
        if (!arg0) {
            field6215 = null;
        }
        class37.method289(0, -1, -1, arg1, arg2);
        field6203++;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lefa;Lhv;)V", line = 182)
    public class457(class171 arg0, class485 arg1) {
        this.field6205 = arg0;
        this.field6207 = this.field6205.method1163(true);
        this.method2607(-25112);
    }
}
