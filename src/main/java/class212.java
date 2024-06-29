import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class212 extends class40 {

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    private int field3001 = 4096;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "Z")
    private boolean field3002 = true;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "[I")
    public static int[] field3004 = new int[3];

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "J")
    public static long field3008;

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "Ltj;")
    public static class108 field3003;

    static {
        new class349("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field3008 = 0L;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILlf;)V", line = 3)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field3007;
        if (arg1 <= 79) {
            method1489((byte) 12, 63, 105);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field3002 = arg2.method837(true) == 1;
            }
        } else {
            this.field3001 = arg2.method798(false);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V", line = 40)
    public class212() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(BII)Z", line = 50)
    public static final boolean method1489(byte arg0, int arg1, int arg2) {
        if (arg0 <= 114) {
            return true;
        } else {
            ++field3006;
            class282 var3 = class398.method2496(-114, arg2);
            if (arg1 == 11) {
                arg1 = 10;
            }
            if (arg1 >= 5 && ~arg1 >= -9) {
                arg1 = 4;
            }
            return var3.method1946(arg1, 65535);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[[I", line = 81)
    public final int[][] method112(int arg0, int arg1) {
        ++field3005;
        int[][] var3 = super.field555.method2070(0, arg1);
        if (arg0 != 1) {
            field3003 = null;
        }
        if (super.field555.field4489) {
            int[] var4 = this.method266((byte) -116, class169.field2395 & arg1 + -1, 0);
            int[] var5 = this.method266((byte) -116, arg1, 0);
            int[] var6 = this.method266((byte) -116, class169.field2395 & arg1 + 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class410.field5886 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3001;
                int var12 = (var5[class84.field1067 & var10 + 1] + -var5[var10 + -1 & class84.field1067]) * this.field3001;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var20 = var11 / var17;
                    var19 = 16777216 / var17;
                }
                if (this.field3002) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "(B)V", line = 167)
    public static void method1490(byte arg0) {
        field3003 = null;
        int var1 = 103 % ((arg0 - -10) / 56);
        field3004 = null;
    }
}
