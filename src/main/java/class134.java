import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class134 implements Runnable {

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    public boolean field2827 = true;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Ljava/lang/Object;")
    public Object field2828 = new Object();

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public int field2834 = 0;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "[I")
    public int[] field2833 = new int[500];

    @OriginalMember(owner = "client!p", name = "q", descriptor = "[I")
    public int[] field2835 = new int[500];

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lea;")
    public static class38 field2822 = class9.method46((byte) 126, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lea;")
    public static class38 field2824 = class9.method46((byte) 108, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Z")
    public static boolean field2826 = false;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lea;")
    public static class38 field2832 = class9.method46((byte) 107, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Lea;")
    private static class38 field2825 = class9.method46((byte) 109, "Take");

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lea;")
    public static class38 field2821 = field2825;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lgg;")
    public static class61 field2831;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "[I")
    public static int[] field2819;

    @OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2827) {
            Object var1 = this.field2828;
            synchronized (this.field2828) {
                if (this.field2834 < 500) {
                    this.field2833[this.field2834] = class176.field3568;
                    this.field2835[this.field2834] = class10.field222;
                    this.field2834++;
                }
            }
            class132.method969(50L, (byte) 58);
        }
        field2830++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lhc;BLod;I)V")
    public static final void method979(class66 arg0, byte arg1, class129 arg2, int arg3) {
        field2829++;
        class169 var4 = new class169();
        var4.field3467 = arg0.method509(118);
        var4.field3469 = arg0.method464(-76);
        var4.field3475 = new byte[var4.field3467][][];
        var4.field3468 = new class61[var4.field3467];
        var4.field3466 = new int[var4.field3467];
        var4.field3476 = new int[var4.field3467];
        var4.field3474 = new int[var4.field3467];
        var4.field3471 = new class61[var4.field3467];
        if (arg1 != -37) {
            return;
        }
        for (int var5 = 0; var5 < var4.field3467; var5++) {
            try {
                int var6 = arg0.method509(119);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method475((byte) 46).method283((byte) -103));
                    String var8 = new String(arg0.method475((byte) -81).method283((byte) -103));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method464(-74);
                    }
                    var4.field3476[var5] = var6;
                    var4.field3466[var5] = var9;
                    var4.field3471[var5] = arg2.method958(class56.method413(95, var7), -89, var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method475((byte) -110).method283((byte) -103));
                    String var11 = new String(arg0.method475((byte) 98).method283((byte) -103));
                    int var12 = arg0.method509(123);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method475((byte) 70).method283((byte) -103));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method464(-90);
                            var15[var16] = new byte[var17];
                            arg0.method499(0, var17, var15[var16], (byte) -53);
                        }
                    }
                    var4.field3476[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class56.method413(class102.method836(arg1, 88), var13[var19]);
                    }
                    var4.field3468[var5] = arg2.method952((byte) 64, var11, class56.method413(arg1 + 59, var10), var18);
                    var4.field3475[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3474[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3474[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3474[var5] = -3;
            } catch (Exception var23) {
                var4.field3474[var5] = -4;
            } catch (Throwable var24) {
                var4.field3474[var5] = -5;
            }
        }
        class52.field1334.method1014((byte) -103, var4);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method980(byte arg0) {
        field2819 = null;
        field2824 = null;
        field2832 = null;
        if (arg0 > -29) {
            method979(null, (byte) -79, null, 42);
        }
        field2822 = null;
        field2825 = null;
        field2831 = null;
        field2821 = null;
    }
}
