import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class148 extends class115 {

    @OriginalMember(owner = "client!re", name = "I", descriptor = "[B")
    public byte[] field2583;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "[[I")
    public static int[][] field2589 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!re", name = "P", descriptor = "D")
    public static double field2590 = -1.0D;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "Lub;")
    public static class227 field2588 = class257.method1749("<)4col>", 17263);

    @OriginalMember(owner = "client!re", name = "S", descriptor = "[I")
    public static int[] field2593 = new int[100];

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "[I")
    public static int[] field2582;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V")
    public static final void method935(boolean arg0) {
        field2585++;
        class142.field2441.method1723(-4173);
        if (arg0) {
            method942(127, -90, -88);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BIII)I")
    public static final int method936(byte arg0, int arg1, int arg2, int arg3) {
        field2591++;
        int var4 = arg1 / arg3;
        int var5 = arg2 / arg3;
        int var6 = arg3 - 1 & arg2;
        int var7 = arg3 - 1 & arg1;
        int var8 = class61.method373(var4, 1, var5);
        int var9 = 20 / ((-arg0 - 20) / 48);
        int var10 = class61.method373(var4, 1, var5 + 1);
        int var11 = class61.method373(var4 + 1, 1, var5);
        int var12 = class61.method373(var4 + 1, 1, var5 + 1);
        int var13 = class171.method1090(arg3, var8, var10, var6, true);
        int var14 = class171.method1090(arg3, var11, var12, var6, true);
        return class171.method1090(arg3, var13, var14, var7, true);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "([B)V")
    public class148(byte[] arg0) {
        this.field2583 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/Object;BLth;)V")
    public static final void method937(Object arg0, byte arg1, class239 arg2) {
        field2586++;
        if (arg2.field4162 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field4162.peekEvent() != null; var3++) {
            class171.method1088(120, 1L);
        }
        if (arg0 != null) {
            arg2.field4162.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
        int var4 = 92 / ((-arg1 - 2) / 63);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static final void method938(int arg0) {
        if (arg0 != 0) {
            field2587 = 51;
        }
        field2592++;
        for (class49 var1 = (class49) class190.field3214.method1277(123); var1 != null; var1 = (class49) class190.field3214.method1271(250)) {
            if (var1.field865 == -1) {
                var1.field870 = 0;
                class197.method1264(var1, (byte) -6);
            } else {
                var1.method369(-119);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)[Lna;")
    public static final class209[] method939(int arg0) {
        field2584++;
        class209[] var1 = new class209[class168.field2810];
        for (int var2 = 0; var2 < class168.field2810; var2++) {
            var1[var2] = new class209(class161.field2727, class241.field4197, class58.field1068[var2], class176.field2934[var2], class177.field2982[var2], class214.field3613[var2], class26.field427[var2], class63.field1153);
        }
        if (arg0 != -6375) {
            field2581 = -77;
        }
        class57.method350((byte) -119);
        return var1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIILfh;IJ)Z")
    public static final boolean method940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class180 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class250.method1674(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public static void method941(byte arg0) {
        field2582 = null;
        if (arg0 != 97) {
            field2587 = -33;
        }
        field2588 = null;
        field2589 = null;
        field2593 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
    public static final void method942(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class156.field2677; var3++) {
            for (int var4 = 0; var4 < class15.field285; var4++) {
                for (int var5 = 0; var5 < class112.field2075; var5++) {
                    class108 var6 = class261.field4539[var3][var4][var5];
                    if (var6 != null) {
                        class50 var7 = var6.field2024;
                        if (var7 != null && var7.field886.method550()) {
                            class49.method288(var7.field886, var3, var4, var5, 1, 1);
                            if (var7.field880 != null && var7.field880.method550()) {
                                class49.method288(var7.field880, var3, var4, var5, 1, 1);
                                var7.field886.method558(var7.field880, 0, 0, 0, false);
                                var7.field880 = var7.field880.method567(arg0, arg1, arg2);
                            }
                            var7.field886 = var7.field886.method567(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2012; var8++) {
                            class230 var10 = var6.field2021[var8];
                            if (var10 != null && var10.field4021.method550()) {
                                class49.method288(var10.field4021, var3, var4, var5, var10.field4020 + 1 - var10.field4032, var10.field4015 - var10.field4025 + 1);
                                var10.field4021 = var10.field4021.method567(arg0, arg1, arg2);
                            }
                        }
                        class133 var9 = var6.field2039;
                        if (var9 != null && var9.field2304.method550()) {
                            class28.method143(var9.field2304, var3, var4, var5);
                            var9.field2304 = var9.field2304.method567(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
