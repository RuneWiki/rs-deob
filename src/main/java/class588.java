import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class588 extends class686 {

    @OriginalMember(owner = "client!saa", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7987;

    @OriginalMember(owner = "client!saa", name = "v", descriptor = "Lra;")
    public static class361 field7989 = new class361(26, 0);

    @OriginalMember(owner = "client!saa", name = "s", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!saa", name = "u", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)V")
    public final void method3211(int arg0) {
        if (arg0 <= 122) {
            method3212((byte) 32, null, null, 111);
        }
        this.field7987.method1949();
        field7986++;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(I)V")
    public class588(int arg0) {
        this.field7987 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BLfd;Lufa;I)V")
    public static final void method3212(byte arg0, class418 arg1, class140 arg2, int arg3) {
        if (arg0 >= -75) {
            field7989 = null;
        }
        field7988++;
        class537 var4 = new class537();
        var4.field6991 = arg1.method2396(24);
        var4.field6984 = arg1.method2355(120);
        var4.field6995 = new int[var4.field6991];
        var4.field6988 = new int[var4.field6991];
        var4.field6985 = new int[var4.field6991];
        var4.field6998 = new class548[var4.field6991];
        var4.field6986 = new byte[var4.field6991][][];
        var4.field6994 = new class548[var4.field6991];
        for (int var5 = 0; var5 < var4.field6991; var5++) {
            try {
                int var6 = arg1.method2396(35);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method2394(4);
                    String var8 = arg1.method2394(4);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method2355(117);
                    }
                    var4.field6988[var5] = var6;
                    var4.field6985[var5] = var9;
                    var4.field6998[var5] = arg2.method1058(11946, class576.method3151(var7, (byte) 73), var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method2394(4);
                    String var11 = arg1.method2394(4);
                    int var12 = arg1.method2396(-26);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method2394(4);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method2355(84);
                            var15[var16] = new byte[var17];
                            arg1.method2398(var15[var16], 0, -19, var17);
                        }
                    }
                    var4.field6988[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class576.method3151(var13[var19], (byte) 79);
                    }
                    var4.field6994[var5] = arg2.method1053((byte) 116, var11, class576.method3151(var10, (byte) 122), var18);
                    var4.field6986[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field6995[var5] = -1;
            } catch (SecurityException var21) {
                var4.field6995[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field6995[var5] = -3;
            } catch (Exception var23) {
                var4.field6995[var5] = -4;
            } catch (Throwable var24) {
                var4.field6995[var5] = -5;
            }
        }
        class692.field9454.method2087(var4, 14);
    }

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "(I)V")
    public static void method3213(int arg0) {
        field7989 = null;
        if (arg0 != -13020) {
            field7989 = null;
        }
    }
}
