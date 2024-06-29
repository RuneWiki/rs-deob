import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class52 extends class202 {

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    private int field700 = 4096;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "Llm;")
    public static class31 field703 = new class31(7, 3);

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "Lss;")
    public static class213 field705 = new class213("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "Lo;")
    public static class139 field708;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "Lmn;")
    public static class162 field704;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "Lmn;")
    public static class162 field706;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field699;
        int[] var3 = super.field3064.method2452((byte) 17, arg0);
        if (super.field3064.field5837) {
            int[] var4 = this.method1376(1046794076, 0, arg0 + -1 & class335.field5237);
            int[] var5 = this.method1376(1046794076, 0, arg0);
            int[] var6 = this.method1376(1046794076, 0, arg0 + 1 & class335.field5237);
            for (int var7 = 0; ~var7 > ~class276.field4375; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field700;
                int var9 = (var5[var7 + 1 & class538.field7882] + -var5[class538.field7882 & var7 + -1]) * this.field700;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 - -var13 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        if (!arg1) {
            method366((byte) -100);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILna;Ljava/lang/String;I)Law;")
    public static final class390 method365(int arg0, class211 arg1, String arg2, int arg3) {
        ++field701;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class231.field3819, 0);
        if (class231.field3819[0] != -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        } else {
            OpenGL.glBindProgramARB(arg0, arg3);
            return new class390(arg1, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
    public static void method366(byte arg0) {
        field706 = null;
        if (arg0 == 60) {
            field708 = null;
            field703 = null;
            field705 = null;
            field704 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
    public class52() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        ++field702;
        int var4 = -111 / ((arg1 - -46) / 50);
        if (~arg2 == -1) {
            this.field700 = arg0.method1455(-3387);
        }
    }
}
