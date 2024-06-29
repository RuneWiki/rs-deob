import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class198 extends class184 {

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    private int field2580 = 4096;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    private int field2583 = 409;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "[I")
    private int[] field2584 = new int[3];

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    private int field2577 = 4096;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    private int field2579 = 4096;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field2582 = 0;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)[[I")
    public final int[][] method13(int arg0, int arg1) {
        ++field2578;
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (arg1 != 1) {
            method1249(-108, (Component) null);
        }
        if (super.field2416.field7271) {
            int[][] var4 = this.method1163(1, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class245.field3167 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2584[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field2583) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2584[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field2583) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2584[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field2583) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2577 * var12 >> 12;
                            var9[var11] = this.field2579 * var14 >> 12;
                            var10[var11] = this.field2580 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = 1 / ((-13 - arg0) / 51);
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            int var6 = arg2.method2738(-102);
                            this.field2584[0] = class378.method2145(267386880, var6 << 4);
                            this.field2584[1] = class378.method2145(4080, var6 >> 4);
                            this.field2584[2] = class378.method2145(255, var6) >> 12;
                        }
                    } else {
                        this.field2577 = arg2.method2758((byte) 127);
                    }
                } else {
                    this.field2579 = arg2.method2758((byte) 109);
                }
            } else {
                this.field2580 = arg2.method2758((byte) 125);
            }
        } else {
            this.field2583 = arg2.method2758((byte) 104);
        }
        ++field2581;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class198() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/Component;)Lts;")
    public static final class374 method1249(int arg0, Component arg1) {
        if (arg0 != 4096) {
            return null;
        } else {
            ++field2586;
            return new class116(arg1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1250(String[] arg0, int arg1) {
        ++field2585;
        if (arg1 != -30271) {
            method1249(49, (Component) null);
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    static {
        new class335("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2587 = 2;
    }
}
